package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f17607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17608b;

    @Override // or.h1
    public final Object a() {
        byte[] storage = Arrays.copyOf(this.f17607a, this.f17608b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new rn.z(storage);
    }

    @Override // or.h1
    public final void b(int i7) {
        byte[] bArr = this.f17607a;
        if (bArr.length < i7) {
            int length = bArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            byte[] storage = Arrays.copyOf(bArr, i7);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f17607a = storage;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17608b;
    }
}
