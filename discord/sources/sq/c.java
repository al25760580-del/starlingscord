package sq;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f20497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20498e;

    @Override // sq.a
    public final int a() {
        return this.f20498e;
    }

    @Override // sq.a
    public final void b(int i7, lq.j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArr = this.f20497d;
        if (objArr.length <= i7) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i7);
            Object[] objArrCopyOf = Arrays.copyOf(this.f20497d, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f20497d = objArrCopyOf;
        }
        Object[] objArr2 = this.f20497d;
        if (objArr2[i7] == null) {
            this.f20498e++;
        }
        objArr2[i7] = value;
    }

    @Override // sq.a
    public final Object get(int i7) {
        return y.v(i7, this.f20497d);
    }

    @Override // sq.a, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }
}
