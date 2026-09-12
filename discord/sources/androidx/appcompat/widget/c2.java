package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2 f923e;

    public /* synthetic */ c2(g2 g2Var, int i7) {
        this.f922d = i7;
        this.f923e = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f922d) {
            case 0:
                t1 t1Var = this.f923e.f990i;
                if (t1Var != null) {
                    t1Var.setListSelectionHidden(true);
                    t1Var.requestLayout();
                }
                break;
            default:
                g2 g2Var = this.f923e;
                t1 t1Var2 = g2Var.f990i;
                if (t1Var2 != null && t1Var2.isAttachedToWindow() && g2Var.f990i.getCount() > g2Var.f990i.getChildCount() && g2Var.f990i.getChildCount() <= g2Var.J) {
                    g2Var.W.setInputMethodMode(2);
                    g2Var.show();
                    break;
                }
                break;
        }
    }
}
