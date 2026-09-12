package or;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f17629e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f17630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mq.t f17631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f17633d;

    public y(SerialDescriptor descriptor, mq.t readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f17630a = descriptor;
        this.f17631b = readIfAbsent;
        int iG = descriptor.g();
        if (iG <= 64) {
            this.f17632c = iG != 64 ? (-1) << iG : 0L;
            this.f17633d = f17629e;
            return;
        }
        this.f17632c = 0L;
        int i7 = (iG - 1) >>> 6;
        long[] jArr = new long[i7];
        if ((iG & 63) != 0) {
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            jArr[i7 - 1] = (-1) << iG;
        }
        this.f17633d = jArr;
    }
}
