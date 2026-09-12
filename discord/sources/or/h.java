package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f17554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17555b;

    @Override // or.h1
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f17554a, this.f17555b);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // or.h1
    public final void b(int i7) {
        byte[] bArr = this.f17554a;
        if (bArr.length < i7) {
            int length = bArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i7);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f17554a = bArrCopyOf;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17555b;
    }
}
