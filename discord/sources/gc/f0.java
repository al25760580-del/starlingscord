package gc;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f9628a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f9629b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f9628a.add(str)) {
            f9629b += ", " + str;
        }
    }
}
