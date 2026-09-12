package gc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends o1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f9674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f9675x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final gb.a f9676y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9677i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9678v;

    static {
        int i7 = je.e0.f13788a;
        f9674w = Integer.toString(1, 36);
        f9675x = Integer.toString(2, 36);
        f9676y = new gb.a(9);
    }

    public h0() {
        this.f9677i = false;
        this.f9678v = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f9678v == h0Var.f9678v && this.f9677i == h0Var.f9677i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9677i), Boolean.valueOf(this.f9678v)});
    }

    public h0(boolean z5) {
        this.f9677i = true;
        this.f9678v = z5;
    }
}
