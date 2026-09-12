package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o3 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Toolbar f1060e;

    public /* synthetic */ o3(Toolbar toolbar, int i7) {
        this.f1059d = i7;
        this.f1060e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1059d) {
            case 0:
                r3 r3Var = this.f1060e.f876m0;
                n.l lVar = r3Var == null ? null : r3Var.f1097e;
                if (lVar != null) {
                    lVar.collapseActionView();
                }
                break;
            default:
                this.f1060e.m();
                break;
        }
    }
}
