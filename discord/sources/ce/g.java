package ce;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3635e;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f3640l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f3643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f3644p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f3646r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3636f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3637g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3638h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3639i = -1;
    public int j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3641m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3642n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3645q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f3647s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f3633c && gVar.f3633c) {
                this.f3632b = gVar.f3632b;
                this.f3633c = true;
            }
            if (this.f3638h == -1) {
                this.f3638h = gVar.f3638h;
            }
            if (this.f3639i == -1) {
                this.f3639i = gVar.f3639i;
            }
            if (this.f3631a == null && (str = gVar.f3631a) != null) {
                this.f3631a = str;
            }
            if (this.f3636f == -1) {
                this.f3636f = gVar.f3636f;
            }
            if (this.f3637g == -1) {
                this.f3637g = gVar.f3637g;
            }
            if (this.f3642n == -1) {
                this.f3642n = gVar.f3642n;
            }
            if (this.f3643o == null && (alignment2 = gVar.f3643o) != null) {
                this.f3643o = alignment2;
            }
            if (this.f3644p == null && (alignment = gVar.f3644p) != null) {
                this.f3644p = alignment;
            }
            if (this.f3645q == -1) {
                this.f3645q = gVar.f3645q;
            }
            if (this.j == -1) {
                this.j = gVar.j;
                this.k = gVar.k;
            }
            if (this.f3646r == null) {
                this.f3646r = gVar.f3646r;
            }
            if (this.f3647s == Float.MAX_VALUE) {
                this.f3647s = gVar.f3647s;
            }
            if (!this.f3635e && gVar.f3635e) {
                this.f3634d = gVar.f3634d;
                this.f3635e = true;
            }
            if (this.f3641m != -1 || (i7 = gVar.f3641m) == -1) {
                return;
            }
            this.f3641m = i7;
        }
    }
}
