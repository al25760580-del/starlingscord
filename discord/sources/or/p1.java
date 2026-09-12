package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f17589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17590b;

    @Override // or.h1
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f17589a, this.f17590b);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // or.h1
    public final void b(int i7) {
        short[] sArr = this.f17589a;
        if (sArr.length < i7) {
            int length = sArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i7);
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f17589a = sArrCopyOf;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17590b;
    }
}
