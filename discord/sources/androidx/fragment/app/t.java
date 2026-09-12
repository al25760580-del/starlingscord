package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2252e;

    public /* synthetic */ t(int i7, Object obj) {
        this.f2251d = i7;
        this.f2252e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2251d) {
            case 0:
                DialogFragment dialogFragment = (DialogFragment) this.f2252e;
                dialogFragment.mOnDismissListener.onDismiss(dialogFragment.mDialog);
                break;
            case 1:
                b2 b2Var = (b2) this.f2252e;
                if (!b2Var.f2103b.isEmpty()) {
                    b2Var.f();
                }
                break;
            default:
                ((FragmentManager) this.f2252e).z(true);
                break;
        }
    }
}
