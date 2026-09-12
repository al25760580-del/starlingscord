package md;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f15597e;

    public /* synthetic */ c0(g0 g0Var, int i7) {
        this.f15596d = i7;
        this.f15597e = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15596d) {
            case 0:
                this.f15597e.j();
                break;
            case 1:
                g0 g0Var = this.f15597e;
                if (!g0Var.f15630i0) {
                    p pVar = g0Var.N;
                    pVar.getClass();
                    pVar.c(g0Var);
                }
                break;
            default:
                this.f15597e.f15622c0 = true;
                break;
        }
    }
}
