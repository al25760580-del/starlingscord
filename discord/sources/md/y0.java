package md;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements gc.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y0 f15735v = new y0(new x0[0]);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f15736w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ei.r0 f15738e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15739i;

    static {
        int i7 = je.e0.f13788a;
        f15736w = Integer.toString(0, 36);
    }

    public y0(x0... x0VarArr) {
        ei.r0 r0VarM = ei.e0.m(x0VarArr);
        this.f15738e = r0VarM;
        this.f15737d = x0VarArr.length;
        int i7 = 0;
        while (i7 < r0VarM.f8354v) {
            int i10 = i7 + 1;
            for (int i11 = i10; i11 < r0VarM.f8354v; i11++) {
                if (((x0) r0VarM.get(i7)).equals(r0VarM.get(i11))) {
                    je.b.s("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i10;
        }
    }

    public final x0 a(int i7) {
        return (x0) this.f15738e.get(i7);
    }

    public final int b(x0 x0Var) {
        int iIndexOf = this.f15738e.indexOf(x0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y0.class != obj.getClass()) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f15737d == y0Var.f15737d && this.f15738e.equals(y0Var.f15738e);
    }

    public final int hashCode() {
        if (this.f15739i == 0) {
            this.f15739i = this.f15738e.hashCode();
        }
        return this.f15739i;
    }
}
