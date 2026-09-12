package com.discord.play_delivery;

/* JADX INFO: loaded from: classes.dex */
public class PlayAssetDeliveryNativeWrapper {
    public static String getKrispAssetPackLocation() {
        PlayAssetDelivery playAssetDelivery = PlayAssetDelivery.INSTANCE;
        String cachedAssetPackLocation = playAssetDelivery.getCachedAssetPackLocation("krisp");
        if (cachedAssetPackLocation != null) {
            return cachedAssetPackLocation;
        }
        playAssetDelivery.fetchAssetPack("krisp", null);
        return "";
    }
}
