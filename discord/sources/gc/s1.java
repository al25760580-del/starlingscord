package gc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends o1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f9846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f9847x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final gb.a f9848y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9849i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9850v;

    static {
        int i7 = je.e0.f13788a;
        f9846w = Integer.toString(1, 36);
        f9847x = Integer.toString(2, 36);
        f9848y = new gb.a(22);
    }

    public s1() {
        this.f9849i = false;
        this.f9850v = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.f9850v == s1Var.f9850v && this.f9849i == s1Var.f9849i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9849i), Boolean.valueOf(this.f9850v)});
    }

    public s1(boolean z5) {
        this.f9849i = true;
        this.f9850v = z5;
    }
}
