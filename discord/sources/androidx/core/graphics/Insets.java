package androidx.core.graphics;

import androidx.core.view.e1;
import com.discord.chat.presentation.list.a;

/* JADX INFO: loaded from: classes.dex */
public final class Insets {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Insets f1555e = new Insets(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1559d;

    public Insets(int i7, int i10, int i11, int i12) {
        this.f1556a = i7;
        this.f1557b = i10;
        this.f1558c = i11;
        this.f1559d = i12;
    }

    public static Insets a(Insets insets, Insets insets2) {
        return b(Math.max(insets.f1556a, insets2.f1556a), Math.max(insets.f1557b, insets2.f1557b), Math.max(insets.f1558c, insets2.f1558c), Math.max(insets.f1559d, insets2.f1559d));
    }

    public static Insets b(int i7, int i10, int i11, int i12) {
        return (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f1555e : new Insets(i7, i10, i11, i12);
    }

    public static Insets c(android.graphics.Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final android.graphics.Insets d() {
        return e1.i(this.f1556a, this.f1557b, this.f1558c, this.f1559d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.f1559d == insets.f1559d && this.f1556a == insets.f1556a && this.f1558c == insets.f1558c && this.f1557b == insets.f1557b;
    }

    public final int hashCode() {
        return (((((this.f1556a * 31) + this.f1557b) * 31) + this.f1558c) * 31) + this.f1559d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f1556a);
        sb2.append(", top=");
        sb2.append(this.f1557b);
        sb2.append(", right=");
        sb2.append(this.f1558c);
        sb2.append(", bottom=");
        return a.j(sb2, this.f1559d, '}');
    }
}
