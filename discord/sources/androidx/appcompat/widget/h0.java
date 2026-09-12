package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends w1 {
    public final /* synthetic */ o0 G;
    public final /* synthetic */ r0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(r0 r0Var, r0 r0Var2, o0 o0Var) {
        super(r0Var2);
        this.H = r0Var;
        this.G = o0Var;
    }

    @Override // androidx.appcompat.widget.w1
    public final n.z b() {
        return this.G;
    }

    @Override // androidx.appcompat.widget.w1
    public final boolean c() {
        r0 r0Var = this.H;
        if (r0Var.getInternalPopup().isShowing()) {
            return true;
        }
        r0Var.f1091x.k(r0Var.getTextDirection(), r0Var.getTextAlignment());
        return true;
    }
}
