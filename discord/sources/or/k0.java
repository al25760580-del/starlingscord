package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f17566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17567b;

    @Override // or.h1
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f17566a, this.f17567b);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // or.h1
    public final void b(int i7) {
        int[] iArr = this.f17566a;
        if (iArr.length < i7) {
            int length = iArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f17566a = iArrCopyOf;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17567b;
    }
}
