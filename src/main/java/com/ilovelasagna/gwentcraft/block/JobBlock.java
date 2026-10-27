package com.ilovelasagna.gwentcraft.block;

import com.ilovelasagna.gwentcraft.block.entity.JobBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;

import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;

import org.jetbrains.annotations.Nullable;

public class JobBlock extends Block implements EntityBlock {

    public static final DirectionProperty FACING =
            BlockStateProperties.HORIZONTAL_FACING;

    public JobBlock(BlockBehaviour.Properties properties) {
        super(properties);
        registerDefaultState(
                stateDefinition.any().setValue(FACING, Direction.NORTH)
        );
    }

    @Override
    protected void createBlockStateDefinition(
            StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return defaultBlockState().setValue(
                FACING,
                context.getHorizontalDirection().getOpposite()
        );
    }

    @Override
    @Nullable
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new JobBlockEntity(pos, state);
    }

    @Override
    public ItemInteractionResult useItemOn(
            ItemStack stack,
            BlockState state,
            Level level,
            BlockPos pos,
            Player player,
            InteractionHand hand,
            BlockHitResult hit) {

        boolean waterBucket = stack.is(Items.WATER_BUCKET);
        boolean emptyBucket = stack.is(Items.BUCKET);
        boolean glassBottle = stack.is(Items.GLASS_BOTTLE);

        PotionContents contents = stack.get(DataComponents.POTION_CONTENTS);

        boolean waterBottle = stack.is(Items.POTION)
                && contents != null
                && contents.potion()
                .map(potion -> potion.value() == Potions.WATER.value())
                .orElse(false);

        if (!waterBucket && !emptyBucket
                && !glassBottle && !waterBottle) {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        if (!(level.getBlockEntity(pos) instanceof JobBlockEntity entity)) {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        if (level.isClientSide) {
            return ItemInteractionResult.SUCCESS;
        }

        IFluidHandler tank = entity.getFluidHandler();

        // Add 1000 mB from a water bucket.
        if (waterBucket) {
            return fillTank(
                    tank, stack, player, hand, 1000, Items.BUCKET
            );
        }

        // Add 250 mB from a water potion.
        if (waterBottle) {
            return fillTank(
                    tank, stack, player, hand, 250, Items.GLASS_BOTTLE
            );
        }

        // Remove 1000 mB into an empty bucket.
        if (emptyBucket) {
            return drainTank(
                    tank, stack, player, hand, 1000, Items.WATER_BUCKET
            );
        }

        // Remove 250 mB into a water potion.
        return drainTank(
                tank, stack, player, hand, 250, Items.POTION
        );
    }

    private ItemInteractionResult fillTank(
            IFluidHandler tank,
            ItemStack input,
            Player player,
            InteractionHand hand,
            int amount,
            net.minecraft.world.item.Item outputItem) {

        FluidStack water = new FluidStack(Fluids.WATER, amount);

        if (tank.fill(water, IFluidHandler.FluidAction.SIMULATE) != amount) {
            return ItemInteractionResult.FAIL;
        }

        if (tank.fill(water, IFluidHandler.FluidAction.EXECUTE) != amount) {
            return ItemInteractionResult.FAIL;
        }

        player.setItemInHand(
                hand,
                ItemUtils.createFilledResult(
                        input, player, new ItemStack(outputItem)
                )
        );

        return ItemInteractionResult.SUCCESS;
    }

    private ItemInteractionResult drainTank(
            IFluidHandler tank,
            ItemStack input,
            Player player,
            InteractionHand hand,
            int amount,
            net.minecraft.world.item.Item outputItem) {

        // Check whether enough fluid is available.
        FluidStack simulated = tank.drain(
                amount,
                IFluidHandler.FluidAction.SIMULATE
        );

        if (simulated.getAmount() < amount) {
            return ItemInteractionResult.FAIL;
        }

        // Actually remove the fluid.
        FluidStack drained = tank.drain(
                amount,
                IFluidHandler.FluidAction.EXECUTE
        );

        if (drained.getAmount() != amount) {
            return ItemInteractionResult.FAIL;
        }

        // Prepare the returned container.
        ItemStack output = new ItemStack(outputItem);

        if (outputItem == Items.POTION) {
            output.set(
                    DataComponents.POTION_CONTENTS,
                    new PotionContents(Potions.WATER)
            );
        }

        // Give the container to the player.
        player.setItemInHand(
                hand,
                ItemUtils.createFilledResult(input, player, output)
        );

        return ItemInteractionResult.SUCCESS;
    }
}