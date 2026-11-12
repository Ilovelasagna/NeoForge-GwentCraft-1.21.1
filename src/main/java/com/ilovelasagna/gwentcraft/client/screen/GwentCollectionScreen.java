package com.ilovelasagna.gwentcraft.client.screen;

import com.ilovelasagna.gwentcraft.client.GwentCollectionClientData;
import com.ilovelasagna.gwentcraft.items.GwentCardItem;
import com.ilovelasagna.gwentcraft.menu.GwentCollectionMenu;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.PageButton;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

public class GwentCollectionScreen
        extends AbstractContainerScreen<GwentCollectionMenu> {

    private static final ResourceLocation BOOK_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(
                    "gwentcraft",
                    "textures/gui/gwent_collection_background.png"
            );

    private int currentPage = 1;

    private PageButton previousButton;
    private PageButton nextButton;

    public GwentCollectionScreen(
            GwentCollectionMenu menu,
            Inventory inventory,
            Component title
    ) {
        super(menu, inventory, title);

        this.imageWidth = 178;
        this.imageHeight = 216;

        this.titleLabelY = -100;
        this.inventoryLabelY = -100;
    }

    @Override
    protected void init() {
        super.init();

        // Move the book slightly higher.
        topPos -= 10;

        // Previous page arrow.
        previousButton = new PageButton(
                leftPos + 14,
                topPos + 180,
                false,
                button -> turnPage(-1),
                true
        );

        addRenderableWidget(previousButton);

        // Next page arrow.
        nextButton = new PageButton(
                leftPos + 132,
                topPos + 184,
                true,
                button -> turnPage(1),
                true
        );

        addRenderableWidget(nextButton);

        // Done button outside the book.
        addRenderableWidget(
                Button.builder(
                        Component.literal("Done"),
                        button -> onClose()
                ).bounds(
                        leftPos + (imageWidth - 65) / 2,
                        topPos + imageHeight + 2,
                        65,
                        20
                ).build()
        );

        updatePageButtons();
    }

    private void turnPage(int direction) {
        currentPage = Math.max(
                1,
                Math.min(2, currentPage + direction)
        );

        updatePageButtons();
    }

    private void updatePageButtons() {
        previousButton.visible = currentPage > 1;
        nextButton.visible = currentPage < 2;
    }

    @Override
    protected void renderBg(
            GuiGraphics graphics,
            float partialTick,
            int mouseX,
            int mouseY
    ) {
        graphics.pose().pushPose();

        graphics.pose().translate(leftPos, topPos, 0);

        graphics.pose().scale(
                imageWidth / 355.0F,
                imageHeight / 460.0F,
                1.0F
        );

        graphics.blit(
                BOOK_TEXTURE,
                0,
                0,
                0,
                0,
                355,
                460,
                355,
                460
        );

        graphics.pose().popPose();
    }

    @Override
    protected void renderLabels(
            GuiGraphics graphics,
            int mouseX,
            int mouseY
    ) {
        // Page numbers.
        String pageText = "Page " + currentPage + " of 2";

        graphics.drawString(
                font,
                pageText,
                imageWidth - 22 - font.width(pageText),
                12,
                0xFF292929,
                false
        );

        // The second page is intentionally blank.
        if (currentPage == 1) {
            renderCollectionPage(graphics);
        }
    }

    private void renderCollectionPage(GuiGraphics graphics) {

        // Front-page header.
        String header = "A Miraculous Guide to Gwent";

        graphics.pose().pushPose();

        graphics.pose().translate(
                imageWidth / 2.0F,
                30,
                0
        );

        graphics.pose().scale(0.9F, 0.9F, 1.0F);

        graphics.drawString(
                font,
                header,
                -font.width(header) / 2,
                0,
                0xFF4A3020,
                false
        );

        graphics.pose().popPose();

        String introduction =
                "The tome you hold in your hands displays the Gwent cards currently missing from your collection.";

        // Draw the introductory passage.
        int textEndY = drawWrappedText(
                graphics,
                introduction,
                18,
                50,
                142,
                10,
                0xFF4A3020
        );

        // Faction collection list.
        int factionHeadingY = textEndY + 12;

        // Monsters.
        drawFactionEntry(
                graphics,
                "Monsters",
                getRemainingCards("monster_", "eredin_"),
                18,
                factionHeadingY + 5
        );

        // Northern Realms.
        drawFactionEntry(
                graphics,
                "Northern Realms",
                getRemainingCards(
                        "northern_",
                        "foltest_",
                        "esterad",
                        "john_natalis",
                        "philippa_eilhart",
                        "vernon_roche"
                ),
                18,
                factionHeadingY + 20
        );

        // Scoia'tael.
        drawFactionEntry(
                graphics,
                "Scoiatael",
                getRemainingCards(
                        "scoiatael_",
                        "francesca_"
                ),
                18,
                factionHeadingY + 35
        );

        // Nilfgaardian Empire.
        drawFactionEntry(
                graphics,
                "Nilfgaardian Empire",
                getRemainingCards(
                        "nilfgaard_",
                        "emhyr_"
                ),
                18,
                factionHeadingY + 50
        );

        // Skellige.
        drawFactionEntry(
                graphics,
                "Skellige",
                getRemainingCards("skellige_"),
                18,
                factionHeadingY + 65
        );
    }

    private int drawWrappedText(
            GuiGraphics graphics,
            String text,
            int x,
            int y,
            int maxWidth,
            int lineHeight,
            int color
    ) {
        List<String> lines = new ArrayList<>();

        StringBuilder currentLine = new StringBuilder();

        for (String word : text.split(" ")) {

            String proposedLine = currentLine.isEmpty()
                    ? word
                    : currentLine + " " + word;

            if (font.width(proposedLine) > maxWidth
                    && !currentLine.isEmpty()) {

                lines.add(currentLine.toString());

                currentLine = new StringBuilder(word);

            } else {
                currentLine = new StringBuilder(proposedLine);
            }
        }

        if (!currentLine.isEmpty()) {
            lines.add(currentLine.toString());
        }

        for (int i = 0; i < lines.size(); i++) {
            graphics.drawString(
                    font,
                    lines.get(i),
                    x,
                    y + (i * lineHeight),
                    color,
                    false
            );
        }

        return y + (lines.size() * lineHeight);
    }

    private void drawFactionEntry(
            GuiGraphics graphics,
            String faction,
            int remaining,
            int x,
            int y
    ) {
        graphics.drawString(
                font,
                faction,
                x,
                y,
                0xFF4A3020,
                false
        );

        String count = String.valueOf(remaining);

        graphics.drawString(
                font,
                count,
                imageWidth - 23 - font.width(count),
                y,
                0xFF70543A,
                false
        );
    }

    private int getRemainingCards(String... prefixes) {

        int totalCards = 0;
        int collectedCards = 0;

        for (Item item : BuiltInRegistries.ITEM) {

            if (!(item instanceof GwentCardItem)) {
                continue;
            }

            ResourceLocation id =
                    BuiltInRegistries.ITEM.getKey(item);

            if (!id.getNamespace().equals("gwentcraft")) {
                continue;
            }

            String path = id.getPath();

            boolean matches = false;

            for (String prefix : prefixes) {
                if (path.startsWith(prefix)) {
                    matches = true;
                    break;
                }
            }

            if (!matches) {
                continue;
            }

            totalCards++;

            if (GwentCollectionClientData.getCardCount(
                    id.toString()
            ) > 0) {
                collectedCards++;
            }
        }

        return totalCards - collectedCards;
    }

    @Override
    public void render(
            GuiGraphics graphics,
            int mouseX,
            int mouseY,
            float partialTick
    ) {
        renderBackground(graphics, mouseX, mouseY, partialTick);

        super.render(graphics, mouseX, mouseY, partialTick);

        renderTooltip(graphics, mouseX, mouseY);
    }
}