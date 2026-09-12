package gc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends o1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f9696v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final gb.a f9697w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f9698i;

    static {
        int i7 = je.e0.f13788a;
        f9696v = Integer.toString(1, 36);
        f9697w = new gb.a(19);
    }

    public i1() {
        this.f9698i = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i1) {
            return this.f9698i == ((i1) obj).f9698i;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9698i)});
    }

    public i1(float f2) {
        je.b.f("percent must be in the range of [0, 100]", f2 >= 0.0f && f2 <= 100.0f);
        this.f9698i = f2;
    }
}
