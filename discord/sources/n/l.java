package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l implements d1.a {
    public m A;
    public MenuItem.OnActionExpandListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f16171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f16172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f16173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f16174h;
    public char j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f16176l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f16178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b0 f16179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f16180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f16181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f16182r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16189y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f16190z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16175i = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    public int k = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16177m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f16183s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f16184t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16185u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16186v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16187w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16188x = 16;
    public boolean C = false;

    public l(j jVar, int i7, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f16178n = jVar;
        this.f16167a = i10;
        this.f16168b = i7;
        this.f16169c = i11;
        this.f16170d = i12;
        this.f16171e = charSequence;
        this.f16189y = i13;
    }

    public static void c(StringBuilder sb2, int i7, int i10, String str) {
        if ((i7 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // d1.a
    public final m a() {
        return this.A;
    }

    @Override // d1.a
    public final d1.a b(m mVar) {
        this.f16190z = null;
        this.A = mVar;
        this.f16178n.p(true);
        m mVar2 = this.A;
        if (mVar2 != null) {
            mVar2.f16191a = new fj.c(28, this);
            mVar2.f16192b.setVisibilityListener(mVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f16189y & 8) == 0) {
            return false;
        }
        if (this.f16190z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f16178n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f16187w && (this.f16185u || this.f16186v)) {
            drawable = drawable.mutate();
            if (this.f16185u) {
                drawable.setTintList(this.f16183s);
            }
            if (this.f16186v) {
                drawable.setTintMode(this.f16184t);
            }
            this.f16187w = false;
        }
        return drawable;
    }

    public final boolean e() {
        m mVar;
        if ((this.f16189y & 8) != 0) {
            if (this.f16190z == null && (mVar = this.A) != null) {
                this.f16190z = mVar.f16192b.onCreateActionView(this);
            }
            if (this.f16190z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f16178n.f(this);
        }
        return false;
    }

    public final void f(boolean z5) {
        if (z5) {
            this.f16188x |= 32;
        } else {
            this.f16188x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f16190z;
        if (view != null) {
            return view;
        }
        m mVar = this.A;
        if (mVar == null) {
            return null;
        }
        View viewOnCreateActionView = mVar.f16192b.onCreateActionView(this);
        this.f16190z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // d1.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // d1.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f16181q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f16168b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f16176l;
        if (drawable != null) {
            return d(drawable);
        }
        int i7 = this.f16177m;
        if (i7 == 0) {
            return null;
        }
        Drawable drawableU = mf.f.u(this.f16178n.f16142a, i7);
        this.f16177m = 0;
        this.f16176l = drawableU;
        return d(drawableU);
    }

    @Override // d1.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f16183s;
    }

    @Override // d1.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f16184t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f16173g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f16167a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // d1.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f16175i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f16174h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f16169c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f16179o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f16171e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f16172f;
        return charSequence != null ? charSequence : this.f16171e;
    }

    @Override // d1.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f16182r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f16179o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f16188x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f16188x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f16188x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        m mVar = this.A;
        if (mVar == null || !mVar.f16192b.overridesItemVisibility()) {
            return (this.f16188x & 8) == 0;
        }
        return (this.f16188x & 8) == 0 && this.A.f16192b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i7;
        this.f16190z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i7 = this.f16167a) > 0) {
            view.setId(i7);
        }
        j jVar = this.f16178n;
        jVar.k = true;
        jVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8) {
        if (this.j == c8) {
            return this;
        }
        this.j = Character.toLowerCase(c8);
        this.f16178n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        int i7 = this.f16188x;
        int i10 = (z5 ? 1 : 0) | (i7 & (-2));
        this.f16188x = i10;
        if (i7 != i10) {
            this.f16178n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        int i7 = this.f16188x;
        int i10 = i7 & 4;
        j jVar = this.f16178n;
        if (i10 == 0) {
            int i11 = (i7 & (-3)) | (z5 ? 2 : 0);
            this.f16188x = i11;
            if (i7 != i11) {
                jVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = jVar.f16147f;
        int size = arrayList.size();
        jVar.w();
        for (int i12 = 0; i12 < size; i12++) {
            l lVar = (l) arrayList.get(i12);
            if (lVar.f16168b == this.f16168b && (lVar.f16188x & 4) != 0 && lVar.isCheckable()) {
                boolean z6 = lVar == this;
                int i13 = lVar.f16188x;
                int i14 = (z6 ? 2 : 0) | (i13 & (-3));
                lVar.f16188x = i14;
                if (i13 != i14) {
                    lVar.f16178n.p(false);
                }
            }
        }
        jVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        if (z5) {
            this.f16188x |= 16;
        } else {
            this.f16188x &= -17;
        }
        this.f16178n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f16177m = 0;
        this.f16176l = drawable;
        this.f16187w = true;
        this.f16178n.p(false);
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f16183s = colorStateList;
        this.f16185u = true;
        this.f16187w = true;
        this.f16178n.p(false);
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f16184t = mode;
        this.f16186v = true;
        this.f16187w = true;
        this.f16178n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f16173g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8) {
        if (this.f16174h == c8) {
            return this;
        }
        this.f16174h = c8;
        this.f16178n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f16180p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c10) {
        this.f16174h = c8;
        this.j = Character.toLowerCase(c10);
        this.f16178n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
        int i10 = i7 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f16189y = i7;
        j jVar = this.f16178n;
        jVar.k = true;
        jVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f16171e = charSequence;
        this.f16178n.p(false);
        b0 b0Var = this.f16179o;
        if (b0Var != null) {
            b0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16172f = charSequence;
        this.f16178n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        int i7 = this.f16188x;
        int i10 = (z5 ? 0 : 8) | (i7 & (-9));
        this.f16188x = i10;
        if (i7 != i10) {
            j jVar = this.f16178n;
            jVar.f16149h = true;
            jVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f16171e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // d1.a, android.view.MenuItem
    public final d1.a setContentDescription(CharSequence charSequence) {
        this.f16181q = charSequence;
        this.f16178n.p(false);
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final d1.a setTooltipText(CharSequence charSequence) {
        this.f16182r = charSequence;
        this.f16178n.p(false);
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8, int i7) {
        if (this.j == c8 && this.k == i7) {
            return this;
        }
        this.j = Character.toLowerCase(c8);
        this.k = KeyEvent.normalizeMetaState(i7);
        this.f16178n.p(false);
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8, int i7) {
        if (this.f16174h == c8 && this.f16175i == i7) {
            return this;
        }
        this.f16174h = c8;
        this.f16175i = KeyEvent.normalizeMetaState(i7);
        this.f16178n.p(false);
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c10, int i7, int i10) {
        this.f16174h = c8;
        this.f16175i = KeyEvent.normalizeMetaState(i7);
        this.j = Character.toLowerCase(c10);
        this.k = KeyEvent.normalizeMetaState(i10);
        this.f16178n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f16176l = null;
        this.f16177m = i7;
        this.f16187w = true;
        this.f16178n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        setTitle(this.f16178n.f16142a.getString(i7));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        int i10;
        j jVar = this.f16178n;
        Context context = jVar.f16142a;
        View viewInflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f16190z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i10 = this.f16167a) > 0) {
            viewInflate.setId(i10);
        }
        jVar.k = true;
        jVar.p(true);
        return this;
    }
}
