package kotlin.collections;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14628i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14629v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f14630w;

    public b1(c1 c1Var) {
        this.f14630w = c1Var;
        this.f14628i = c1Var.f14636w;
        this.f14629v = c1Var.f14635v;
    }

    @Override // kotlin.collections.c
    public final void a() {
        int i7 = this.f14628i;
        if (i7 == 0) {
            this.f14631d = 2;
            return;
        }
        c1 c1Var = this.f14630w;
        Object[] objArr = c1Var.f14633e;
        int i10 = this.f14629v;
        this.f14632e = objArr[i10];
        this.f14631d = 1;
        this.f14629v = (i10 + 1) % c1Var.f14634i;
        this.f14628i = i7 - 1;
    }
}
