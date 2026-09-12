package ai;

import java.util.HashMap;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f611b;

    static {
        HashMap map = new HashMap();
        f610a = map;
        HashMap map2 = new HashMap();
        f611b = map2;
        Integer numB = g.b(map, -1, "The Play Store app is either not installed or not the official version.", -2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(numB, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
