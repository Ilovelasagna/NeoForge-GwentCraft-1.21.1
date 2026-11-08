package com.ilovelasagna.gwentcraft.client;

import java.util.Map;

public class GwentCollectionClientData {

    private static Map<String, Integer> cards = Map.of();

    public static void setCollection(
            Map<String, Integer> collection
    ) {
        cards = Map.copyOf(collection);
    }

    public static Map<String, Integer> getCollection() {
        return cards;
    }

    public static int getCardCount(String cardId) {
        return cards.getOrDefault(cardId, 0);
    }
}