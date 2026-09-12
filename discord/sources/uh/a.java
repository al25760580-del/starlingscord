package uh;

import java.util.HashMap;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f21133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f21134b;

    static {
        HashMap map = new HashMap();
        f21133a = map;
        HashMap map2 = new HashMap();
        f21134b = map2;
        Integer numB = g.b(map, -1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).", -2, "The requested pack is not available.");
        Integer numB2 = g.b(map, -3, "The request is invalid.", -4, "The requested download is not found.");
        Integer numB3 = g.b(map, -5, "The Asset Delivery API is not available.", -6, "Network error. Unable to obtain the asset pack details.");
        Integer numB4 = g.b(map, -7, "Download not permitted under current device circumstances (e.g. in background).", -10, "Asset pack download failed due to insufficient storage.");
        Integer numB5 = g.b(map, -11, "The Play Store app is either not installed or not the official version.", -12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        Integer numB6 = g.b(map, -13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -14, "Tried to show the confirmation dialog but no asset packs are waiting for user confirmation.");
        Integer numB7 = g.b(map, numB6, "The installed app version was not installed by Play.", -100, "Unknown error downloading an asset pack.");
        map2.put(-1, "APP_UNAVAILABLE");
        map2.put(numB, "PACK_UNAVAILABLE");
        map2.put(-3, "INVALID_REQUEST");
        map2.put(numB2, "DOWNLOAD_NOT_FOUND");
        map2.put(-5, "API_NOT_AVAILABLE");
        map2.put(numB3, "NETWORK_ERROR");
        map2.put(-7, "ACCESS_DENIED");
        map2.put(numB4, "INSUFFICIENT_STORAGE");
        map2.put(-11, "PLAY_STORE_NOT_FOUND");
        map2.put(numB5, "NETWORK_UNRESTRICTED");
        map2.put(-13, "APP_NOT_OWNED");
        map2.put(numB6, "CONFIRMATION_NOT_REQUIRED");
        map2.put(-15, "UNRECOGNIZED_INSTALLATION");
        map2.put(numB7, "INTERNAL_ERROR");
    }
}
