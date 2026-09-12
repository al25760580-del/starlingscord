package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f2607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2608b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2609c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2610d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2611e = null;

    public g(p0 p0Var) {
        this.f2607a = p0Var;
    }

    @Override // androidx.recyclerview.widget.p0
    public final void a(int i7, int i10) {
        e();
        this.f2607a.a(i7, i10);
    }

    @Override // androidx.recyclerview.widget.p0
    public final void b(int i7, int i10) {
        int i11;
        if (this.f2608b == 1 && i7 >= (i11 = this.f2609c)) {
            int i12 = this.f2610d;
            if (i7 <= i11 + i12) {
                this.f2610d = i12 + i10;
                this.f2609c = Math.min(i7, i11);
                return;
            }
        }
        e();
        this.f2609c = i7;
        this.f2610d = i10;
        this.f2608b = 1;
    }

    @Override // androidx.recyclerview.widget.p0
    public final void c(int i7, int i10) {
        int i11;
        if (this.f2608b == 2 && (i11 = this.f2609c) >= i7 && i11 <= i7 + i10) {
            this.f2610d += i10;
            this.f2609c = i7;
        } else {
            e();
            this.f2609c = i7;
            this.f2610d = i10;
            this.f2608b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.p0
    public final void d(int i7, int i10, Object obj) {
        int i11;
        int i12;
        int i13;
        if (this.f2608b == 3 && i7 <= (i12 = this.f2610d + (i11 = this.f2609c)) && (i13 = i7 + i10) >= i11 && this.f2611e == obj) {
            this.f2609c = Math.min(i7, i11);
            this.f2610d = Math.max(i12, i13) - this.f2609c;
            return;
        }
        e();
        this.f2609c = i7;
        this.f2610d = i10;
        this.f2611e = obj;
        this.f2608b = 3;
    }

    public final void e() {
        int i7 = this.f2608b;
        if (i7 == 0) {
            return;
        }
        p0 p0Var = this.f2607a;
        if (i7 == 1) {
            p0Var.b(this.f2609c, this.f2610d);
        } else if (i7 == 2) {
            p0Var.c(this.f2609c, this.f2610d);
        } else if (i7 == 3) {
            p0Var.d(this.f2609c, this.f2610d, this.f2611e);
        }
        this.f2611e = null;
        this.f2608b = 0;
    }
}
