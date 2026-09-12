package i;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.c1;
import androidx.core.view.u0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f11255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f11256b;

    public q(androidx.appcompat.app.a aVar, ActionMode.Callback callback) {
        this.f11256b = aVar;
        this.f11255a = callback;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [i.i, java.lang.Object] */
    @Override // androidx.appcompat.view.ActionMode.Callback
    public final void a(ActionMode actionMode) {
        this.f11255a.a(actionMode);
        androidx.appcompat.app.a aVar = this.f11256b;
        if (aVar.T != null) {
            aVar.I.getDecorView().removeCallbacks(aVar.U);
        }
        if (aVar.S != null) {
            c1 c1Var = aVar.V;
            if (c1Var != null) {
                c1Var.b();
            }
            c1 c1VarB = u0.b(aVar.S);
            c1VarB.a(0.0f);
            aVar.V = c1VarB;
            c1VarB.d(new n(1, this));
        }
        aVar.K.onSupportActionModeFinished(aVar.R);
        aVar.R = null;
        ViewGroup viewGroup = aVar.X;
        WeakHashMap weakHashMap = u0.f1729a;
        androidx.core.view.j0.c(viewGroup);
        aVar.a0();
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean b(ActionMode actionMode, Menu menu) {
        return this.f11255a.b(actionMode, menu);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean c(ActionMode actionMode, Menu menu) {
        ViewGroup viewGroup = this.f11256b.X;
        WeakHashMap weakHashMap = u0.f1729a;
        androidx.core.view.j0.c(viewGroup);
        return this.f11255a.c(actionMode, menu);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        return this.f11255a.d(actionMode, menuItem);
    }
}
