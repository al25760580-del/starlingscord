package n;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f16097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f16098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f16099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f16100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f16102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f16104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f16105i;
    public CharSequence j;
    public CharSequence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f16106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f16107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16110p;

    @Override // d1.a
    public final m a() {
        return null;
    }

    @Override // d1.a
    public final d1.a b(m mVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f16104h;
        if (drawable != null) {
            if (this.f16108n || this.f16109o) {
                this.f16104h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f16104h = drawableMutate;
                if (this.f16108n) {
                    drawableMutate.setTintList(this.f16106l);
                }
                if (this.f16109o) {
                    this.f16104h.setTintMode(this.f16107m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // d1.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f16103g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f16102f;
    }

    @Override // d1.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f16104h;
    }

    @Override // d1.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f16106l;
    }

    @Override // d1.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f16107m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f16099c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // d1.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f16101e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f16100d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f16097a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f16098b;
        return charSequence != null ? charSequence : this.f16097a;
    }

    @Override // d1.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f16110p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f16110p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f16110p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f16110p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8) {
        this.f16102f = Character.toLowerCase(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        this.f16110p = (z5 ? 1 : 0) | (this.f16110p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        this.f16110p = (z5 ? 2 : 0) | (this.f16110p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        this.f16110p = (z5 ? 16 : 0) | (this.f16110p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f16104h = drawable;
        c();
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f16106l = colorStateList;
        this.f16108n = true;
        c();
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f16107m = mode;
        this.f16109o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f16099c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8) {
        this.f16100d = c8;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c10) {
        this.f16100d = c8;
        this.f16102f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f16097a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16098b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        this.f16110p = (this.f16110p & 8) | (z5 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // d1.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8, int i7) {
        this.f16102f = Character.toLowerCase(c8);
        this.f16103g = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final d1.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8, int i7) {
        this.f16100d = c8;
        this.f16101e = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        this.f16097a = this.f16105i.getResources().getString(i7);
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final d1.a setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f16104h = this.f16105i.getDrawable(i7);
        c();
        return this;
    }

    @Override // d1.a, android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c10, int i7, int i10) {
        this.f16100d = c8;
        this.f16101e = KeyEvent.normalizeMetaState(i7);
        this.f16102f = Character.toLowerCase(c10);
        this.f16103g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        return this;
    }
}
