package b0;

import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f3013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3014b = 0;

    static {
        c9.a.a(0.0f, 0.0f);
        c9.a.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        f3013a = c9.a.a(Float.NaN, Float.NaN);
    }

    public static final float a(long j) {
        if (j == f3013a) {
            throw new IllegalStateException("Offset is unspecified");
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        if (j == f3013a) {
            throw new IllegalStateException("Offset is unspecified");
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long c(long j, long j5) {
        return c9.a.a(a(j5) + a(j), b(j5) + b(j));
    }
}
