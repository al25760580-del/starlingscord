package or;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f17577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17578b;

    @Override // or.h1
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f17577a, this.f17578b);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // or.h1
    public final void b(int i7) {
        char[] cArr = this.f17577a;
        if (cArr.length < i7) {
            int length = cArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i7);
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f17577a = cArrCopyOf;
        }
    }

    @Override // or.h1
    public final int d() {
        return this.f17578b;
    }
}
