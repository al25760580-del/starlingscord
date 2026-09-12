package u2;

import i8.c;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f20922a = new c(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f20923b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f20924c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f20925d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                g.k(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
