package hr;

import fr.w;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f11112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f11115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f11116f;

    static {
        String property;
        int i7 = w.f9400a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f11111a = property;
        f11112b = fr.h.i(100000L, 1L, LongCompanionObject.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i10 = w.f9400a;
        if (i10 < 2) {
            i10 = 2;
        }
        f11113c = fr.h.j(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f11114d = fr.h.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f11115e = TimeUnit.SECONDS.toNanos(fr.h.i(60L, 1L, LongCompanionObject.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f11116f = g.f11106a;
    }
}
