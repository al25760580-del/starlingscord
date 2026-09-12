package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f17643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17644b;

    @Override // or.h1
    public final Object a() {
        long[] storage = Arrays.copyOf(this.f17643a, this.f17644b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new rn.f0(storage);
    }

    @Override // or.h1
    public final void b(int i7) {
        long[] jArr = this.f17643a;
        if (jArr.length < i7) {
            int length = jArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            long[] storage = Arrays.copyOf(jArr, i7);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f17643a = storage;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17644b;
    }
}
