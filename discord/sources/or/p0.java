package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f17587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17588b;

    @Override // or.h1
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f17587a, this.f17588b);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // or.h1
    public final void b(int i7) {
        long[] jArr = this.f17587a;
        if (jArr.length < i7) {
            int length = jArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i7);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f17587a = jArrCopyOf;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17588b;
    }
}
