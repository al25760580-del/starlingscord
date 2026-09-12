package i;

import android.view.ViewGroup;
import androidx.core.view.c1;
import androidx.core.view.u0;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f11253d;

    public o(androidx.appcompat.app.a aVar) {
        this.f11253d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        androidx.appcompat.app.a aVar = this.f11253d;
        aVar.T.showAtLocation(aVar.S, 55, 0, 0);
        c1 c1Var = aVar.V;
        if (c1Var != null) {
            c1Var.b();
        }
        if (!aVar.W || (viewGroup = aVar.X) == null || !viewGroup.isLaidOut()) {
            aVar.S.setAlpha(1.0f);
            aVar.S.setVisibility(0);
            return;
        }
        aVar.S.setAlpha(0.0f);
        c1 c1VarB = u0.b(aVar.S);
        c1VarB.a(1.0f);
        aVar.V = c1VarB;
        c1VarB.d(new n(0, this));
    }
}
