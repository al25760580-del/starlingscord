package com.discord.kvstorage.discordapp;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class DiscordMobileApi {
    public static native HashMap<String, ArrayList<String>> getGuildEmojis(String str);

    public static native String getGuildVersions(String str, String str2);

    public static void initialize(String str) {
        System.loadLibrary("kv_storage");
        nativeInitialize(str);
    }

    private static native void nativeInitialize(String str);

    public static native void openAsync(String str);

    public static native void putMessage(String str, String str2, String str3, String str4, String str5);
}
