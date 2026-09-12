package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f17514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17515b;

    @Override // or.h1
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f17514a, this.f17515b);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // or.h1
    public final void b(int i7) {
        float[] fArr = this.f17514a;
        if (fArr.length < i7) {
            int length = fArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i7);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.f17514a = fArrCopyOf;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17515b;
    }
}
