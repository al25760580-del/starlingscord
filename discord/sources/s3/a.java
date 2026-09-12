package s3;

import a3.e;
import android.graphics.Rect;
import kk.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19715d;

    static {
        new a(0, 0, 0, 0);
    }

    public a(int i7, int i10, int i11, int i12) {
        this.f19712a = i7;
        this.f19713b = i10;
        this.f19714c = i11;
        this.f19715d = i12;
        if (i7 > i11) {
            throw new IllegalArgumentException(e.g(i7, i11, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i10 > i12) {
            throw new IllegalArgumentException(e.g(i10, i12, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        a aVar = (a) obj;
        return this.f19712a == aVar.f19712a && this.f19713b == aVar.f19713b && this.f19714c == aVar.f19714c && this.f19715d == aVar.f19715d;
    }

    public final int hashCode() {
        return (((((this.f19712a * 31) + this.f19713b) * 31) + this.f19714c) * 31) + this.f19715d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f19712a);
        sb2.append(',');
        sb2.append(this.f19713b);
        sb2.append(',');
        sb2.append(this.f19714c);
        sb2.append(',');
        return b.l(sb2, this.f19715d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        Intrinsics.checkNotNullParameter(rect, "rect");
    }
}
