package i;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.r3;
import androidx.appcompat.widget.w3;
import androidx.appcompat.widget.x3;
import androidx.core.view.a1;
import androidx.core.view.c1;
import androidx.core.view.l0;
import androidx.core.view.u0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends ActionBar implements androidx.appcompat.widget.e {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f11225y = new AccelerateInterpolator();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f11226z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f11227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f11228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f11229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f11230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j1 f11231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f11232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f11233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i0 f11235i;
    public i0 j;
    public q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f11237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m.f f11243s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11244t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11245u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h0 f11246v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h0 f11247w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fj.c f11248x;

    public j0(Activity activity, boolean z5) {
        new ArrayList();
        this.f11237m = new ArrayList();
        this.f11238n = 0;
        this.f11239o = true;
        this.f11242r = true;
        this.f11246v = new h0(this, 0);
        this.f11247w = new h0(this, 1);
        this.f11248x = new fj.c(16, this);
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (z5) {
            return;
        }
        this.f11233g = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean b() {
        r3 r3Var;
        j1 j1Var = this.f11231e;
        if (j1Var == null || (r3Var = ((x3) j1Var).f1164a.f876m0) == null || r3Var.f1097e == null) {
            return false;
        }
        r3 r3Var2 = ((x3) j1Var).f1164a.f876m0;
        n.l lVar = r3Var2 == null ? null : r3Var2.f1097e;
        if (lVar == null) {
            return true;
        }
        lVar.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void c(boolean z5) {
        if (z5 == this.f11236l) {
            return;
        }
        this.f11236l = z5;
        ArrayList arrayList = this.f11237m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int d() {
        return ((x3) this.f11231e).f1165b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context e() {
        if (this.f11228b == null) {
            TypedValue typedValue = new TypedValue();
            this.f11227a.getTheme().resolveAttribute(com.discord.R.attr.actionBarWidgetTheme, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f11228b = new ContextThemeWrapper(this.f11227a, i7);
            } else {
                this.f11228b = this.f11227a;
            }
        }
        return this.f11228b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void g() {
        v(this.f11227a.getResources().getBoolean(com.discord.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean i(int i7, KeyEvent keyEvent) {
        n.j jVar;
        i0 i0Var = this.f11235i;
        if (i0Var == null || (jVar = i0Var.f11219v) == null) {
            return false;
        }
        jVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return jVar.performShortcut(i7, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void l(boolean z5) {
        if (this.f11234h) {
            return;
        }
        m(z5);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void m(boolean z5) {
        int i7 = z5 ? 4 : 0;
        x3 x3Var = (x3) this.f11231e;
        int i10 = x3Var.f1165b;
        this.f11234h = true;
        x3Var.a((i7 & 4) | (i10 & (-5)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void n() {
        x3 x3Var = (x3) this.f11231e;
        x3Var.a(x3Var.f1165b & (-9));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void o(Drawable drawable) {
        x3 x3Var = (x3) this.f11231e;
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
    public final void p(boolean z5) {
        m.f fVar;
        this.f11244t = z5;
        if (z5 || (fVar = this.f11243s) == null) {
            return;
        }
        fVar.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void q(CharSequence charSequence) {
        x3 x3Var = (x3) this.f11231e;
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
        x3 x3Var = (x3) this.f11231e;
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

    @Override // androidx.appcompat.app.ActionBar
    public final ActionMode s(q qVar) {
        i0 i0Var = this.f11235i;
        if (i0Var != null) {
            i0Var.a();
        }
        this.f11229c.setHideOnContentScrollEnabled(false);
        this.f11232f.e();
        i0 i0Var2 = new i0(this, this.f11232f.getContext(), qVar);
        n.j jVar = i0Var2.f11219v;
        jVar.w();
        try {
            boolean zB = i0Var2.f11220w.f11255a.b(i0Var2, jVar);
            jVar.v();
            if (!zB) {
                return null;
            }
            this.f11235i = i0Var2;
            i0Var2.g();
            this.f11232f.c(i0Var2);
            t(true);
            return i0Var2;
        } catch (Throwable th2) {
            jVar.v();
            throw th2;
        }
    }

    public final void t(boolean z5) {
        c1 c1VarI;
        c1 c1VarI2;
        if (z5) {
            if (!this.f11241q) {
                this.f11241q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f11229c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                w(false);
            }
        } else if (this.f11241q) {
            this.f11241q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11229c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            w(false);
        }
        if (!this.f11230d.isLaidOut()) {
            if (z5) {
                ((x3) this.f11231e).f1164a.setVisibility(4);
                this.f11232f.setVisibility(0);
                return;
            } else {
                ((x3) this.f11231e).f1164a.setVisibility(0);
                this.f11232f.setVisibility(8);
                return;
            }
        }
        if (z5) {
            x3 x3Var = (x3) this.f11231e;
            c1VarI = u0.b(x3Var.f1164a);
            c1VarI.a(0.0f);
            c1VarI.c(100L);
            c1VarI.d(new w3(x3Var, 4));
            c1VarI2 = this.f11232f.i(0, 200L);
        } else {
            x3 x3Var2 = (x3) this.f11231e;
            c1 c1VarB = u0.b(x3Var2.f1164a);
            c1VarB.a(1.0f);
            c1VarB.c(200L);
            c1VarB.d(new w3(x3Var2, 0));
            c1VarI = this.f11232f.i(8, 100L);
            c1VarI2 = c1VarB;
        }
        m.f fVar = new m.f();
        ArrayList arrayList = fVar.f15334a;
        arrayList.add(c1VarI);
        View view = (View) c1VarI.f1642a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c1VarI2.f1642a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c1VarI2);
        fVar.b();
    }

    public final void u(View view) {
        j1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.discord.R.id.decor_content_parent);
        this.f11229c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.discord.R.id.action_bar);
        if (callbackFindViewById instanceof j1) {
            wrapper = (j1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f11231e = wrapper;
        this.f11232f = (ActionBarContextView) view.findViewById(com.discord.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.discord.R.id.action_bar_container);
        this.f11230d = actionBarContainer;
        j1 j1Var = this.f11231e;
        if (j1Var == null || this.f11232f == null || actionBarContainer == null) {
            throw new IllegalStateException(j0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((x3) j1Var).f1164a.getContext();
        this.f11227a = context;
        if ((((x3) this.f11231e).f1165b & 4) != 0) {
            this.f11234h = true;
        }
        int i7 = context.getApplicationInfo().targetSdkVersion;
        this.f11231e.getClass();
        v(context.getResources().getBoolean(com.discord.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f11227a.obtainStyledAttributes(null, h.a.f10253a, com.discord.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11229c;
            if (!actionBarOverlayLayout2.f820y) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f11245u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f11230d;
            WeakHashMap weakHashMap = u0.f1729a;
            l0.k(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void v(boolean z5) {
        if (z5) {
            this.f11230d.setTabContainer(null);
            ((x3) this.f11231e).getClass();
        } else {
            ((x3) this.f11231e).getClass();
            this.f11230d.setTabContainer(null);
        }
        this.f11231e.getClass();
        ((x3) this.f11231e).f1164a.setCollapsible(false);
        this.f11229c.setHasNonEmbeddedTabs(false);
    }

    public final void w(boolean z5) {
        boolean z6 = this.f11240p;
        boolean z7 = this.f11241q;
        fj.c cVar = this.f11248x;
        View view = this.f11233g;
        int i7 = 0;
        if (!z7 && z6) {
            if (this.f11242r) {
                this.f11242r = false;
                m.f fVar = this.f11243s;
                if (fVar != null) {
                    fVar.a();
                }
                int i10 = this.f11238n;
                h0 h0Var = this.f11246v;
                if (i10 != 0 || (!this.f11244t && !z5)) {
                    h0Var.onAnimationEnd();
                    return;
                }
                this.f11230d.setAlpha(1.0f);
                this.f11230d.setTransitioning(true);
                m.f fVar2 = new m.f();
                float f2 = -this.f11230d.getHeight();
                if (z5) {
                    int[] iArr = {0, 0};
                    this.f11230d.getLocationInWindow(iArr);
                    f2 -= iArr[1];
                }
                c1 c1VarB = u0.b(this.f11230d);
                c1VarB.e(f2);
                View view2 = (View) c1VarB.f1642a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new a1(i7, cVar, view2) : null);
                }
                boolean z10 = fVar2.f15338e;
                ArrayList arrayList = fVar2.f15334a;
                if (!z10) {
                    arrayList.add(c1VarB);
                }
                if (this.f11239o && view != null) {
                    c1 c1VarB2 = u0.b(view);
                    c1VarB2.e(f2);
                    if (!fVar2.f15338e) {
                        arrayList.add(c1VarB2);
                    }
                }
                boolean z11 = fVar2.f15338e;
                if (!z11) {
                    fVar2.f15336c = f11225y;
                }
                if (!z11) {
                    fVar2.f15335b = 250L;
                }
                if (!z11) {
                    fVar2.f15337d = h0Var;
                }
                this.f11243s = fVar2;
                fVar2.b();
                return;
            }
            return;
        }
        if (this.f11242r) {
            return;
        }
        this.f11242r = true;
        m.f fVar3 = this.f11243s;
        if (fVar3 != null) {
            fVar3.a();
        }
        this.f11230d.setVisibility(0);
        int i11 = this.f11238n;
        h0 h0Var2 = this.f11247w;
        if (i11 == 0 && (this.f11244t || z5)) {
            this.f11230d.setTranslationY(0.0f);
            float f7 = -this.f11230d.getHeight();
            if (z5) {
                int[] iArr2 = {0, 0};
                this.f11230d.getLocationInWindow(iArr2);
                f7 -= iArr2[1];
            }
            this.f11230d.setTranslationY(f7);
            m.f fVar4 = new m.f();
            c1 c1VarB3 = u0.b(this.f11230d);
            c1VarB3.e(0.0f);
            View view3 = (View) c1VarB3.f1642a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new a1(i7, cVar, view3) : null);
            }
            boolean z12 = fVar4.f15338e;
            ArrayList arrayList2 = fVar4.f15334a;
            if (!z12) {
                arrayList2.add(c1VarB3);
            }
            if (this.f11239o && view != null) {
                view.setTranslationY(f7);
                c1 c1VarB4 = u0.b(view);
                c1VarB4.e(0.0f);
                if (!fVar4.f15338e) {
                    arrayList2.add(c1VarB4);
                }
            }
            boolean z13 = fVar4.f15338e;
            if (!z13) {
                fVar4.f15336c = f11226z;
            }
            if (!z13) {
                fVar4.f15335b = 250L;
            }
            if (!z13) {
                fVar4.f15337d = h0Var2;
            }
            this.f11243s = fVar4;
            fVar4.b();
        } else {
            this.f11230d.setAlpha(1.0f);
            this.f11230d.setTranslationY(0.0f);
            if (this.f11239o && view != null) {
                view.setTranslationY(0.0f);
            }
            h0Var2.onAnimationEnd();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f11229c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = u0.f1729a;
            androidx.core.view.j0.c(actionBarOverlayLayout);
        }
    }

    public j0(Dialog dialog) {
        new ArrayList();
        this.f11237m = new ArrayList();
        this.f11238n = 0;
        this.f11239o = true;
        this.f11242r = true;
        this.f11246v = new h0(this, 0);
        this.f11247w = new h0(this, 1);
        this.f11248x = new fj.c(16, this);
        u(dialog.getWindow().getDecorView());
    }
}
