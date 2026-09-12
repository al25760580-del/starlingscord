package n;

import android.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class m implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fj.c f16191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f16192b;

    public m(q qVar, ActionProvider actionProvider) {
        this.f16192b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z5) {
        fj.c cVar = this.f16191a;
        if (cVar != null) {
            j jVar = ((l) cVar.f9267e).f16178n;
            jVar.f16149h = true;
            jVar.p(true);
        }
    }
}
