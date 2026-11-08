package com.ilovelasagna.gwentcraft.network.payload;

import com.ilovelasagna.gwentcraft.GwentCraft;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public record GwentCollectionDataPayload(
        Map<String, Integer> cards
) implements CustomPacketPayload {

    public static final Type<GwentCollectionDataPayload> TYPE =
            new Type<>(
                    ResourceLocation.fromNamespaceAndPath(
                            GwentCraft.MOD_ID,
                            "collection_data"
                    )
            );

    public GwentCollectionDataPayload {
        cards = Map.copyOf(cards);
    }

    public static final StreamCodec<
            RegistryFriendlyByteBuf,
            GwentCollectionDataPayload
            > STREAM_CODEC = StreamCodec.of(
            GwentCollectionDataPayload::encode,
            GwentCollectionDataPayload::decode
    );

    private static void encode(
            RegistryFriendlyByteBuf buffer,
            GwentCollectionDataPayload payload
    ) {
        buffer.writeVarInt(payload.cards.size());

        for (Map.Entry<String, Integer> entry
                : payload.cards.entrySet()) {

            buffer.writeUtf(entry.getKey());
            buffer.writeVarInt(entry.getValue());
        }
    }

    private static GwentCollectionDataPayload decode(
            RegistryFriendlyByteBuf buffer
    ) {
        int size = buffer.readVarInt();

        if (size < 0 || size > 10000) {
            throw new IllegalArgumentException(
                    "Invalid Gwent collection size: " + size
            );
        }

        Map<String, Integer> cards = new HashMap<>();

        for (int i = 0; i < size; i++) {
            String cardId = buffer.readUtf(256);
            int count = buffer.readVarInt();

            if (count > 0) {
                cards.put(cardId, count);
            }
        }

        return new GwentCollectionDataPayload(cards);
    }

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}