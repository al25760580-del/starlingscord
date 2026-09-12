package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1079h;

    public final void a(int i7, int i10) {
        this.f1074c = i7;
        this.f1075d = i10;
        this.f1079h = true;
        if (this.f1078g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f1072a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f1073b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f1072a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1073b = i10;
        }
    }
}
