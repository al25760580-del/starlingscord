package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.discord.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n implements n.v {
    public n.x E;
    public int F;
    public l G;
    public Drawable H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public h Q;
    public h R;
    public j S;
    public i T;
    public int V;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f1037e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n.j f1038i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LayoutInflater f1039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n.u f1040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1041x = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f1042y = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray P = new SparseBooleanArray();
    public final ue.i U = new ue.i(this);

    public n(Context context) {
        this.f1036d = context;
        this.f1039v = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n.v
    public final void a(boolean z5) {
        int i7;
        ViewGroup viewGroup = (ViewGroup) this.E;
        ArrayList arrayList = null;
        boolean z6 = false;
        if (viewGroup != null) {
            n.j jVar = this.f1038i;
            if (jVar != null) {
                jVar.i();
                ArrayList arrayListL = this.f1038i.l();
                int size = arrayListL.size();
                i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    n.l lVar = (n.l) arrayListL.get(i10);
                    if ((lVar.f16188x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i7);
                        n.l itemData = childAt instanceof n.w ? ((n.w) childAt).getItemData() : null;
                        View viewG = g(lVar, childAt, viewGroup);
                        if (lVar != itemData) {
                            viewG.setPressed(false);
                            viewG.jumpDrawablesToCurrentState();
                        }
                        if (viewG != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewG.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewG);
                            }
                            ((ViewGroup) this.E).addView(viewG, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i7) == this.G) {
                    i7++;
                } else {
                    viewGroup.removeViewAt(i7);
                }
            }
        }
        ((View) this.E).requestLayout();
        n.j jVar2 = this.f1038i;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.f16150i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                n.m mVar = ((n.l) arrayList2.get(i11)).A;
            }
        }
        n.j jVar3 = this.f1038i;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.j;
        }
        if (this.J && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z6 = !((n.l) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z6 = true;
            }
        }
        if (z6) {
            if (this.G == null) {
                this.G = new l(this, this.f1036d);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.G.getParent();
            if (viewGroup3 != this.E) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.G);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.E;
                l lVar2 = this.G;
                actionMenuView.getClass();
                p pVarJ = ActionMenuView.j();
                pVarJ.f1061a = true;
                actionMenuView.addView(lVar2, pVarJ);
            }
        } else {
            l lVar3 = this.G;
            if (lVar3 != null) {
                Object parent = lVar3.getParent();
                Object obj = this.E;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.G);
                }
            }
        }
        ((ActionMenuView) this.E).setOverflowReserved(this.J);
    }

    @Override // n.v
    public final void b(n.j jVar, boolean z5) {
        l();
        h hVar = this.R;
        if (hVar != null && hVar.b()) {
            hVar.f16210i.dismiss();
        }
        n.u uVar = this.f1040w;
        if (uVar != null) {
            uVar.b(jVar, z5);
        }
    }

    @Override // n.v
    public final void c(Context context, n.j jVar) {
        this.f1037e = context;
        LayoutInflater.from(context);
        this.f1038i = jVar;
        Resources resources = context.getResources();
        if (!this.K) {
            this.J = true;
        }
        int i7 = 2;
        this.L = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i7 = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i7 = 4;
        } else if (i10 >= 360) {
            i7 = 3;
        }
        this.N = i7;
        int measuredWidth = this.L;
        if (this.J) {
            if (this.G == null) {
                l lVar = new l(this, this.f1036d);
                this.G = lVar;
                if (this.I) {
                    lVar.setImageDrawable(this.H);
                    this.H = null;
                    this.I = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.G.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.G.getMeasuredWidth();
        } else {
            this.G = null;
        }
        this.M = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n.v
    public final boolean d(n.b0 b0Var) {
        boolean z5;
        if (b0Var.hasVisibleItems()) {
            n.b0 b0Var2 = b0Var;
            while (true) {
                n.j jVar = b0Var2.f16117z;
                if (jVar == this.f1038i) {
                    break;
                }
                b0Var2 = (n.b0) jVar;
            }
            n.l lVar = b0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.E;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if ((childAt instanceof n.w) && ((n.w) childAt).getItemData() == lVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.V = b0Var.A.f16167a;
                int size = b0Var.f16147f.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z5 = false;
                        break;
                    }
                    MenuItem item = b0Var.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z5 = true;
                        break;
                    }
                    i10++;
                }
                h hVar = new h(this, this.f1037e, b0Var, view);
                this.R = hVar;
                hVar.f16208g = z5;
                n.r rVar = hVar.f16210i;
                if (rVar != null) {
                    rVar.o(z5);
                }
                h hVar2 = this.R;
                if (!hVar2.b()) {
                    if (hVar2.f16206e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    hVar2.d(0, 0, false, false);
                }
                n.u uVar = this.f1040w;
                if (uVar != null) {
                    uVar.f(b0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // n.v
    public final boolean e() {
        int size;
        ArrayList arrayListL;
        int i7;
        boolean z5;
        n nVar = this;
        n.j jVar = nVar.f1038i;
        if (jVar != null) {
            arrayListL = jVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i10 = nVar.N;
        int i11 = nVar.M;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) nVar.E;
        int i12 = 0;
        boolean z6 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i7 = 2;
            z5 = true;
            if (i12 >= size) {
                break;
            }
            n.l lVar = (n.l) arrayListL.get(i12);
            int i15 = lVar.f16189y;
            if ((i15 & 2) == 2) {
                i13++;
            } else if ((i15 & 1) == 1) {
                i14++;
            } else {
                z6 = true;
            }
            if (nVar.O && lVar.C) {
                i10 = 0;
            }
            i12++;
        }
        if (nVar.J && (z6 || i14 + i13 > i10)) {
            i10--;
        }
        int i16 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = nVar.P;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            n.l lVar2 = (n.l) arrayListL.get(i17);
            int i19 = lVar2.f16189y;
            boolean z7 = (i19 & 2) == i7 ? z5 : false;
            int i20 = lVar2.f16168b;
            if (z7) {
                View viewG = nVar.g(lVar2, null, viewGroup);
                viewG.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewG.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                if (i20 != 0) {
                    sparseBooleanArray.put(i20, z5);
                }
                lVar2.f(z5);
            } else {
                if ((i19 & 1) == z5) {
                    boolean z10 = sparseBooleanArray.get(i20);
                    boolean z11 = ((i16 > 0 || z10) && i11 > 0) ? z5 : false;
                    if (z11) {
                        View viewG2 = nVar.g(lVar2, null, viewGroup);
                        viewG2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewG2.getMeasuredWidth();
                        i11 -= measuredWidth2;
                        if (i18 == 0) {
                            i18 = measuredWidth2;
                        }
                        z11 &= i11 + i18 > 0;
                    }
                    if (z11 && i20 != 0) {
                        sparseBooleanArray.put(i20, true);
                    } else if (z10) {
                        sparseBooleanArray.put(i20, false);
                        for (int i21 = 0; i21 < i17; i21++) {
                            n.l lVar3 = (n.l) arrayListL.get(i21);
                            if (lVar3.f16168b == i20) {
                                if ((lVar3.f16188x & 32) == 32) {
                                    i16++;
                                }
                                lVar3.f(false);
                            }
                        }
                    }
                    if (z11) {
                        i16--;
                    }
                    lVar2.f(z11);
                } else {
                    lVar2.f(false);
                }
                i17++;
                i7 = 2;
                nVar = this;
                z5 = true;
            }
            i17++;
            i7 = 2;
            nVar = this;
            z5 = true;
        }
        return z5;
    }

    @Override // n.v
    public final void f(Parcelable parcelable) {
        int i7;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof m) && (i7 = ((m) parcelable).f1029d) > 0 && (menuItemFindItem = this.f1038i.findItem(i7)) != null) {
            d((n.b0) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View g(n.l lVar, View view, ViewGroup viewGroup) {
        View actionView = lVar.getActionView();
        if (actionView == null || lVar.e()) {
            n.w wVar = view instanceof n.w ? (n.w) view : (n.w) this.f1039v.inflate(this.f1042y, viewGroup, false);
            wVar.a(lVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) wVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.E);
            if (this.T == null) {
                this.T = new i(this);
            }
            actionMenuItemView.setPopupCallback(this.T);
            actionView = (View) wVar;
        }
        actionView.setVisibility(lVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof p)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // n.v
    public final int getId() {
        return this.F;
    }

    @Override // n.v
    public final boolean h(n.l lVar) {
        return false;
    }

    @Override // n.v
    public final Parcelable i() {
        m mVar = new m();
        mVar.f1029d = this.V;
        return mVar;
    }

    @Override // n.v
    public final void j(n.u uVar) {
        throw null;
    }

    @Override // n.v
    public final boolean k(n.l lVar) {
        return false;
    }

    public final boolean l() {
        Object obj;
        j jVar = this.S;
        if (jVar != null && (obj = this.E) != null) {
            ((View) obj).removeCallbacks(jVar);
            this.S = null;
            return true;
        }
        h hVar = this.Q;
        if (hVar == null) {
            return false;
        }
        if (hVar.b()) {
            hVar.f16210i.dismiss();
        }
        return true;
    }

    public final boolean m() {
        h hVar = this.Q;
        return hVar != null && hVar.b();
    }

    public final boolean n() {
        n.j jVar;
        if (!this.J || m() || (jVar = this.f1038i) == null || this.E == null || this.S != null) {
            return false;
        }
        jVar.i();
        if (jVar.j.isEmpty()) {
            return false;
        }
        j jVar2 = new j(this, new h(this, this.f1037e, this.f1038i, this.G));
        this.S = jVar2;
        ((View) this.E).post(jVar2);
        return true;
    }
}
