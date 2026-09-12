package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f17517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17518b;

    @Override // or.h1
    public final Object a() {
        short[] storage = Arrays.copyOf(this.f17517a, this.f17518b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new rn.j0(storage);
    }

    @Override // or.h1
    public final void b(int i7) {
        short[] sArr = this.f17517a;
        if (sArr.length < i7) {
            int length = sArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            short[] storage = Arrays.copyOf(sArr, i7);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f17517a = storage;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17518b;
    }
}
