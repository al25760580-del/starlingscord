package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f17609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17610b;

    @Override // or.h1
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f17609a, this.f17610b);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // or.h1
    public final void b(int i7) {
        double[] dArr = this.f17609a;
        if (dArr.length < i7) {
            int length = dArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i7);
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.f17609a = dArrCopyOf;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17610b;
    }
}
