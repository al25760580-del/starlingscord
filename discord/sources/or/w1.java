package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f17624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17625b;

    @Override // or.h1
    public final Object a() {
        int[] storage = Arrays.copyOf(this.f17624a, this.f17625b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new rn.c0(storage);
    }

    @Override // or.h1
    public final void b(int i7) {
        int[] iArr = this.f17624a;
        if (iArr.length < i7) {
            int length = iArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            int[] storage = Arrays.copyOf(iArr, i7);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f17624a = storage;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17625b;
    }
}
