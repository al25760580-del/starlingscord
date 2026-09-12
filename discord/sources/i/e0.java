package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.r3;
import androidx.appcompat.widget.x3;
import androidx.core.view.u0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends ActionBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3 f11200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f11201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue.i f11202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f11206g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a3.h f11207h = new a3.h(20, this);

    public e0(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        u4.b bVar = new u4.b(13, this);
        toolbar.getClass();
        x3 x3Var = new x3(toolbar, false);
        this.f11200a = x3Var;
        callback.getClass();
        this.f11201b = callback;
        x3Var.k = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        if (!x3Var.f1170g) {
            x3Var.f1171h = charSequence;
            if ((x3Var.f1165b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (x3Var.f1170g) {
                    u0.q(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f11202c = new ue.i(this);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean a() {
        androidx.appcompat.widget.n nVar;
        ActionMenuView actionMenuView = this.f11200a.f1164a.f865d;
        return (actionMenuView == null || (nVar = actionMenuView.Q) == null || !nVar.l()) ? false : true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean b() {
        n.l lVar;
        r3 r3Var = this.f11200a.f1164a.f876m0;
        if (r3Var == null || (lVar = r3Var.f1097e) == null) {
            return false;
        }
        if (r3Var == null) {
            lVar = null;
        }
        if (lVar == null) {
            return true;
        }
        lVar.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void c(boolean z5) {
        if (z5 == this.f11205f) {
            return;
        }
        this.f11205f = z5;
        ArrayList arrayList = this.f11206g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int d() {
        return this.f11200a.f1165b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context e() {
        return this.f11200a.f1164a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean f() {
        x3 x3Var = this.f11200a;
        Toolbar toolbar = x3Var.f1164a;
        a3.h hVar = this.f11207h;
        toolbar.removeCallbacks(hVar);
        Toolbar toolbar2 = x3Var.f1164a;
        WeakHashMap weakHashMap = u0.f1729a;
        toolbar2.postOnAnimation(hVar);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void h() {
        this.f11200a.f1164a.removeCallbacks(this.f11207h);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean i(int i7, KeyEvent keyEvent) {
        Menu menuT = t();
        if (menuT == null) {
            return false;
        }
        menuT.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuT.performShortcut(i7, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean k() {
        return this.f11200a.f1164a.u();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void m(boolean z5) {
        int i7 = z5 ? 4 : 0;
        x3 x3Var = this.f11200a;
        x3Var.a((i7 & 4) | (x3Var.f1165b & (-5)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void n() {
        x3 x3Var = this.f11200a;
        x3Var.a(x3Var.f1165b & (-9));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void o(Drawable drawable) {
        x3 x3Var = this.f11200a;
        x3Var.f1169f = drawable;
        Toolbar toolbar = x3Var.f1164a;
        if ((x3Var.f1165b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = x3Var.f1176o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void q(CharSequence charSequence) {
        x3 x3Var = this.f11200a;
        x3Var.f1170g = true;
        Toolbar toolbar = x3Var.f1164a;
        x3Var.f1171h = charSequence;
        if ((x3Var.f1165b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (x3Var.f1170g) {
                u0.q(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void r(CharSequence charSequence) {
        x3 x3Var = this.f11200a;
        if (x3Var.f1170g) {
            return;
        }
        Toolbar toolbar = x3Var.f1164a;
        x3Var.f1171h = charSequence;
        if ((x3Var.f1165b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (x3Var.f1170g) {
                u0.q(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu t() {
        boolean z5 = this.f11204e;
        x3 x3Var = this.f11200a;
        if (!z5) {
            a5.i0 i0Var = new a5.i0(1, this);
            u4.c cVar = new u4.c(this);
            Toolbar toolbar = x3Var.f1164a;
            toolbar.f877n0 = i0Var;
            toolbar.f878o0 = cVar;
            ActionMenuView actionMenuView = toolbar.f865d;
            if (actionMenuView != null) {
                actionMenuView.R = i0Var;
                actionMenuView.S = cVar;
            }
            this.f11204e = true;
        }
        return x3Var.f1164a.getMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void g() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void l(boolean z5) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void p(boolean z5) {
    }
}
