package n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.l2;
import androidx.appcompat.widget.t1;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends r implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final l2 E;
    public PopupWindow.OnDismissListener H;
    public View I;
    public View J;
    public u K;
    public ViewTreeObserver L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean Q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f16111e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f16112i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g f16113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f16114w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f16115x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f16116y;
    public final i0 F = new i0(4, this);
    public final dl.i G = new dl.i(3, this);
    public int P = 0;

    public a0(Context context, j jVar, View view, int i7, boolean z5) {
        this.f16111e = context;
        this.f16112i = jVar;
        this.f16114w = z5;
        this.f16113v = new g(jVar, LayoutInflater.from(context), z5, R.layout.abc_popup_menu_item_layout);
        this.f16116y = i7;
        Resources resources = context.getResources();
        this.f16115x = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.I = view;
        this.E = new l2(context, null, i7, 0);
        jVar.b(this, context);
    }

    @Override // n.v
    public final void a(boolean z5) {
        this.N = false;
        g gVar = this.f16113v;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // n.v
    public final void b(j jVar, boolean z5) {
        if (jVar != this.f16112i) {
            return;
        }
        dismiss();
        u uVar = this.K;
        if (uVar != null) {
            uVar.b(jVar, z5);
        }
    }

    @Override // n.v
    public final boolean d(b0 b0Var) {
        boolean z5;
        if (b0Var.hasVisibleItems()) {
            t tVar = new t(this.f16111e, b0Var, this.J, this.f16114w, this.f16116y, 0);
            u uVar = this.K;
            tVar.f16209h = uVar;
            r rVar = tVar.f16210i;
            if (rVar != null) {
                rVar.j(uVar);
            }
            int size = b0Var.f16147f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z5 = false;
                    break;
                }
                MenuItem item = b0Var.getItem(i7);
                if (item.isVisible() && item.getIcon() != null) {
                    z5 = true;
                    break;
                }
                i7++;
            }
            tVar.f16208g = z5;
            r rVar2 = tVar.f16210i;
            if (rVar2 != null) {
                rVar2.o(z5);
            }
            tVar.j = this.H;
            this.H = null;
            this.f16112i.c(false);
            l2 l2Var = this.E;
            int width = l2Var.f993x;
            int iL = l2Var.l();
            if ((Gravity.getAbsoluteGravity(this.P, this.I.getLayoutDirection()) & 7) == 5) {
                width += this.I.getWidth();
            }
            if (!tVar.b()) {
                if (tVar.f16206e != null) {
                    tVar.d(width, iL, true, true);
                }
            }
            u uVar2 = this.K;
            if (uVar2 != null) {
                uVar2.f(b0Var);
            }
            return true;
        }
        return false;
    }

    @Override // n.z
    public final void dismiss() {
        if (isShowing()) {
            this.E.dismiss();
        }
    }

    @Override // n.v
    public final boolean e() {
        return false;
    }

    @Override // n.z
    public final t1 g() {
        return this.E.f990i;
    }

    @Override // n.v
    public final Parcelable i() {
        return null;
    }

    @Override // n.z
    public final boolean isShowing() {
        return !this.M && this.E.W.isShowing();
    }

    @Override // n.v
    public final void j(u uVar) {
        this.K = uVar;
    }

    @Override // n.r
    public final void n(View view) {
        this.I = view;
    }

    @Override // n.r
    public final void o(boolean z5) {
        this.f16113v.f16137i = z5;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.M = true;
        this.f16112i.c(true);
        ViewTreeObserver viewTreeObserver = this.L;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.L = this.J.getViewTreeObserver();
            }
            this.L.removeGlobalOnLayoutListener(this.F);
            this.L = null;
        }
        this.J.removeOnAttachStateChangeListener(this.G);
        PopupWindow.OnDismissListener onDismissListener = this.H;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // n.r
    public final void p(int i7) {
        this.P = i7;
    }

    @Override // n.r
    public final void q(int i7) {
        this.E.f993x = i7;
    }

    @Override // n.r
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.H = onDismissListener;
    }

    @Override // n.r
    public final void s(boolean z5) {
        this.Q = z5;
    }

    @Override // n.z
    public final void show() {
        View view;
        if (isShowing()) {
            return;
        }
        if (this.M || (view = this.I) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.J = view;
        l2 l2Var = this.E;
        androidx.appcompat.widget.a0 a0Var = l2Var.W;
        androidx.appcompat.widget.a0 a0Var2 = l2Var.W;
        a0Var.setOnDismissListener(this);
        l2Var.M = this;
        l2Var.V = true;
        a0Var2.setFocusable(true);
        View view2 = this.J;
        boolean z5 = this.L == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.L = viewTreeObserver;
        if (z5) {
            viewTreeObserver.addOnGlobalLayoutListener(this.F);
        }
        view2.addOnAttachStateChangeListener(this.G);
        l2Var.L = view2;
        l2Var.I = this.P;
        boolean z6 = this.N;
        Context context = this.f16111e;
        g gVar = this.f16113v;
        if (!z6) {
            this.O = r.m(gVar, context, this.f16115x);
            this.N = true;
        }
        l2Var.p(this.O);
        a0Var2.setInputMethodMode(2);
        Rect rect = this.f16200d;
        l2Var.U = rect != null ? new Rect(rect) : null;
        l2Var.show();
        t1 t1Var = l2Var.f990i;
        t1Var.setOnKeyListener(this);
        if (this.Q) {
            j jVar = this.f16112i;
            if (jVar.f16152m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) t1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f16152m);
                }
                frameLayout.setEnabled(false);
                t1Var.addHeaderView(frameLayout, null, false);
            }
        }
        l2Var.n(gVar);
        l2Var.show();
    }

    @Override // n.r
    public final void t(int i7) {
        this.E.i(i7);
    }

    @Override // n.v
    public final void f(Parcelable parcelable) {
    }

    @Override // n.r
    public final void l(j jVar) {
    }
}
