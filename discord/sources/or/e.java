package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f17523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17524b;

    @Override // or.h1
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f17523a, this.f17524b);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // or.h1
    public final void b(int i7) {
        boolean[] zArr = this.f17523a;
        if (zArr.length < i7) {
            int length = zArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i7);
            Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
            this.f17523a = zArrCopyOf;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17524b;
    }
}
