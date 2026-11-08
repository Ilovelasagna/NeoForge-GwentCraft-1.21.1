package com.ilovelasagna.gwentcraft.network;

import com.ilovelasagna.gwentcraft.client.GwentCollectionClientData;
import com.ilovelasagna.gwentcraft.network.payload.GwentCollectionDataPayload;

import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;

public class GwentCraftNetwork {

    public static void registerPayloads(
            RegisterPayloadHandlersEvent event
    ) {
        event.registrar("1").playToClient(
                GwentCollectionDataPayload.TYPE,
                GwentCollectionDataPayload.STREAM_CODEC,
                (payload, context) ->
                        GwentCollectionClientData.setCollection(
                                payload.cards()
                        )
        );
    }
}