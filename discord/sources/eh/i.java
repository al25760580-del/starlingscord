package eh;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.HashSet;
import n.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends ViewGroup implements x {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int[] f8231w0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int[] f8232x0 = {-16842910};
    public int E;
    public int F;
    public ColorStateList G;
    public int H;
    public ColorStateList I;
    public final ColorStateList J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public Drawable P;
    public ColorStateList Q;
    public int R;
    public final SparseArray S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f8233b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f8234c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.a f8235d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f8236d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.appcompat.widget.b f8237e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f8238e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f8239f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f8240g0;
    public int h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Pools$SynchronizedPool f8241i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public kh.m f8242i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f8243j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ColorStateList f8244k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public k f8245l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public g f8246m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f8247n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f8248o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f8249p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f8250q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f8251r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public MenuItem f8252s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f8253t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f8254u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SparseArray f8255v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Rect f8256v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8258x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h[] f8259y;

    public i(Context context) {
        super(context);
        this.f8255v = new SparseArray();
        this.E = -1;
        this.F = -1;
        this.S = new SparseArray();
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.h0 = 49;
        this.f8243j0 = false;
        this.f8249p0 = 1;
        this.f8250q0 = 0;
        this.f8252s0 = null;
        this.f8253t0 = 7;
        this.f8254u0 = false;
        this.f8256v0 = new Rect();
        this.J = c();
        if (isInEditMode()) {
            this.f8235d = null;
        } else {
            m3.a aVar = new m3.a();
            this.f8235d = aVar;
            aVar.U(0);
            aVar.o();
            aVar.I(io.sentry.config.a.S(getContext(), com.discord.R.attr.motionDurationMedium4, getResources().getInteger(com.discord.R.integer.material_motion_duration_long_1)));
            aVar.K(io.sentry.config.a.T(getContext(), com.discord.R.attr.motionEasingStandard, lg.a.f15072b));
            aVar.Q(new bh.n());
        }
        this.f8237e = new androidx.appcompat.widget.b(4, (qg.b) this);
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f8253t0, this.f8246m0.f8230e);
    }

    private e getNewItem() {
        Pools$SynchronizedPool pools$SynchronizedPool = this.f8241i;
        e eVar = pools$SynchronizedPool != null ? (e) pools$SynchronizedPool.acquire() : null;
        return eVar == null ? new qg.a(getContext()) : eVar;
    }

    private void setBadgeIfNeeded(@NonNull e eVar) {
        ng.a aVar;
        int id2 = eVar.getId();
        if (id2 == -1 || (aVar = (ng.a) this.S.get(id2)) == null) {
            return;
        }
        eVar.setBadge(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        e eVarE;
        View viewE;
        b bVar;
        removeAllViews();
        h[] hVarArr = this.f8259y;
        if (hVarArr != null && this.f8241i != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    e eVar = (e) hVar;
                    this.f8241i.release(eVar);
                    eVar.j(eVar.Q);
                    eVar.f8203i0 = null;
                    eVar.f8209o0 = 0.0f;
                    eVar.f8196d = false;
                }
            }
        }
        this.f8245l0.f8263e = true;
        this.f8246m0.b();
        this.f8245l0.f8263e = false;
        int i7 = this.f8246m0.f8228c;
        if (i7 == 0) {
            this.E = 0;
            this.F = 0;
            this.f8259y = null;
            this.f8241i = null;
            return;
        }
        if (this.f8241i == null || this.f8250q0 != i7) {
            this.f8250q0 = i7;
            this.f8241i = new Pools$SynchronizedPool(i7);
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f8246m0.f8227b.size(); i10++) {
            hashSet.add(Integer.valueOf(this.f8246m0.a(i10).getItemId()));
        }
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.S;
            if (i11 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i11++;
        }
        int size = this.f8246m0.f8227b.size();
        this.f8259y = new h[size];
        int i12 = this.f8257w;
        boolean z5 = i12 != -1 ? i12 == 0 : getCurrentVisibleContentItemCount() > 3;
        int size2 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            MenuItem menuItemA = this.f8246m0.a(i14);
            boolean z6 = menuItemA instanceof a;
            if (z6) {
                Context context = getContext();
                bVar = new b(context);
                LayoutInflater.from(context).inflate(com.discord.R.layout.m3_navigation_menu_divider, (ViewGroup) bVar, true);
                bVar.b();
                bVar.setOnlyShowWhenExpanded(true);
                bVar.setDividersEnabled(this.f8254u0);
            } else if (menuItemA.hasSubMenu()) {
                if (size2 > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                l lVar = new l(getContext());
                int i15 = this.N;
                if (i15 == 0) {
                    i15 = this.L;
                }
                lVar.setTextAppearance(i15);
                lVar.setTextColor(this.I);
                lVar.setOnlyShowWhenExpanded(true);
                lVar.a((n.l) menuItemA);
                size2 = menuItemA.getSubMenu().size();
                viewE = lVar;
            } else if (size2 > 0) {
                eVarE = e(i14, (n.l) menuItemA, z5, true);
                size2--;
            } else {
                n.l lVar2 = (n.l) menuItemA;
                boolean z7 = i13 >= this.f8253t0;
                i13++;
                viewE = e(i14, lVar2, z5, z7);
            }
            if (z6) {
                viewE = eVarE;
                viewE = bVar;
            } else {
                viewE = eVarE;
                if (menuItemA.isCheckable() && this.F == -1) {
                    viewE = bVar;
                    this.F = i14;
                } else {
                    viewE = bVar;
                }
            }
            this.f8259y[i14] = viewE;
            addView(viewE);
        }
        int iMin = Math.min(size - 1, this.F);
        this.F = iMin;
        setCheckedItem(this.f8259y[iMin].getItemData());
    }

    @Override // n.x
    public final void b(n.j jVar) {
        this.f8246m0 = new g(jVar);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListC = y0.b.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.discord.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i7 = typedValue.data;
        int defaultColor = colorStateListC.getDefaultColor();
        int[] iArr = f8231w0;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = f8232x0;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListC.getColorForState(iArr3, defaultColor), i7, defaultColor});
    }

    public final kh.i d() {
        if (this.f8242i0 == null || this.f8244k0 == null) {
            return null;
        }
        kh.i iVar = new kh.i(this.f8242i0);
        iVar.q(this.f8244k0);
        return iVar;
    }

    public final e e(int i7, n.l lVar, boolean z5, boolean z6) {
        this.f8245l0.f8263e = true;
        lVar.setCheckable(true);
        this.f8245l0.f8263e = false;
        e newItem = getNewItem();
        newItem.setShifting(z5);
        newItem.setLabelMaxLines(this.f8249p0);
        newItem.setIconTintList(this.G);
        newItem.setIconSize(this.H);
        newItem.setTextColor(this.J);
        newItem.setTextAppearanceInactive(this.K);
        newItem.setTextAppearanceActive(this.L);
        newItem.setHorizontalTextAppearanceInactive(this.M);
        newItem.setHorizontalTextAppearanceActive(this.N);
        newItem.setTextAppearanceActiveBoldEnabled(this.O);
        newItem.setTextColor(this.I);
        int i10 = this.T;
        if (i10 != -1) {
            newItem.setItemPaddingTop(i10);
        }
        int i11 = this.U;
        if (i11 != -1) {
            newItem.setItemPaddingBottom(i11);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.f8247n0);
        newItem.setLabelFontScalingEnabled(this.f8248o0);
        int i12 = this.V;
        if (i12 != -1) {
            newItem.setActiveIndicatorLabelPadding(i12);
        }
        int i13 = this.W;
        if (i13 != -1) {
            newItem.setIconLabelHorizontalSpacing(i13);
        }
        newItem.setActiveIndicatorWidth(this.f8233b0);
        newItem.setActiveIndicatorHeight(this.f8234c0);
        newItem.setActiveIndicatorExpandedWidth(this.f8236d0);
        newItem.setActiveIndicatorExpandedHeight(this.f8238e0);
        newItem.setActiveIndicatorMarginHorizontal(this.f8239f0);
        newItem.setItemGravity(this.h0);
        newItem.setActiveIndicatorExpandedPadding(this.f8256v0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.f8240g0);
        newItem.setActiveIndicatorDrawable(d());
        newItem.setActiveIndicatorResizeable(this.f8243j0);
        newItem.setActiveIndicatorEnabled(this.a0);
        Drawable drawable = this.P;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.R);
        }
        newItem.setItemRippleColor(this.Q);
        newItem.setLabelVisibilityMode(this.f8257w);
        newItem.setItemIconGravity(this.f8258x);
        newItem.setOnlyShowWhenExpanded(z6);
        newItem.setExpanded(this.f8251r0);
        newItem.a(lVar);
        newItem.setItemPosition(i7);
        int i14 = lVar.f16167a;
        newItem.setOnTouchListener((View.OnTouchListener) this.f8255v.get(i14));
        newItem.setOnClickListener(this.f8237e);
        int i15 = this.E;
        if (i15 != 0 && i14 == i15) {
            this.F = i7;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.V;
    }

    public SparseArray<ng.a> getBadgeDrawables() {
        return this.S;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.f8251r0 ? this.f8246m0.f8229d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.N;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.M;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.W;
    }

    public ColorStateList getIconTintList() {
        return this.G;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f8244k0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.a0;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f8238e0;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f8240g0;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f8236d0;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f8234c0;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f8239f0;
    }

    public kh.m getItemActiveIndicatorShapeAppearance() {
        return this.f8242i0;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f8233b0;
    }

    public Drawable getItemBackground() {
        h[] hVarArr = this.f8259y;
        if (hVarArr != null && hVarArr.length > 0) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    return ((e) hVar).getBackground();
                }
            }
        }
        return this.P;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.R;
    }

    public int getItemGravity() {
        return this.h0;
    }

    public int getItemIconGravity() {
        return this.f8258x;
    }

    public int getItemIconSize() {
        return this.H;
    }

    public int getItemPaddingBottom() {
        return this.U;
    }

    public int getItemPaddingTop() {
        return this.T;
    }

    public ColorStateList getItemRippleColor() {
        return this.Q;
    }

    public int getItemTextAppearanceActive() {
        return this.L;
    }

    public int getItemTextAppearanceInactive() {
        return this.K;
    }

    public ColorStateList getItemTextColor() {
        return this.I;
    }

    public int getLabelMaxLines() {
        return this.f8249p0;
    }

    public int getLabelVisibilityMode() {
        return this.f8257w;
    }

    public g getMenu() {
        return this.f8246m0;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f8248o0;
    }

    public int getSelectedItemId() {
        return this.E;
    }

    public int getSelectedItemPosition() {
        return this.F;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        accessibilityNodeInfoCompat.f1613a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int i7) {
        this.V = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorLabelPadding(i7);
                }
            }
        }
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        if (this.f8252s0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f8252s0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f8252s0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f8252s0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i7) {
        this.f8253t0 = i7;
    }

    public void setExpanded(boolean z5) {
        this.f8251r0 = z5;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                hVar.setExpanded(z5);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i7) {
        this.N = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setHorizontalTextAppearanceActive(i7);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i7) {
        this.M = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setHorizontalTextAppearanceInactive(i7);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i7) {
        this.W = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconLabelHorizontalSpacing(i7);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.G = colorStateList;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f8244k0 = colorStateList;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z5) {
        this.a0 = z5;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorEnabled(z5);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i7) {
        this.f8238e0 = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedHeight(i7);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i7) {
        this.f8240g0 = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedMarginHorizontal(i7);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i7) {
        this.f8236d0 = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedWidth(i7);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i7) {
        this.f8234c0 = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorHeight(i7);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i7) {
        this.f8239f0 = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorMarginHorizontal(i7);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z5) {
        this.f8243j0 = z5;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorResizeable(z5);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(kh.m mVar) {
        this.f8242i0 = mVar;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i7) {
        this.f8233b0 = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorWidth(i7);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.P = drawable;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i7) {
        this.R = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemBackground(i7);
                }
            }
        }
    }

    public void setItemGravity(int i7) {
        this.h0 = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemGravity(i7);
                }
            }
        }
    }

    public void setItemIconGravity(int i7) {
        this.f8258x = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemIconGravity(i7);
                }
            }
        }
    }

    public void setItemIconSize(int i7) {
        this.H = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconSize(i7);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i7) {
        this.U = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemPaddingBottom(this.U);
                }
            }
        }
    }

    public void setItemPaddingTop(int i7) {
        this.T = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemPaddingTop(i7);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.Q = colorStateList;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i7) {
        this.L = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceActive(i7);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.O = z5;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceActiveBoldEnabled(z5);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i7) {
        this.K = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceInactive(i7);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.I = colorStateList;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z5) {
        this.f8248o0 = z5;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setLabelFontScalingEnabled(z5);
                }
            }
        }
    }

    public void setLabelMaxLines(int i7) {
        this.f8249p0 = i7;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setLabelMaxLines(i7);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i7) {
        this.f8257w = i7;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z5) {
        this.f8247n0 = z5;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setMeasureBottomPaddingFromLabelBaseline(z5);
                }
            }
        }
    }

    public void setPresenter(@NonNull k kVar) {
        this.f8245l0 = kVar;
    }

    public void setSubmenuDividersEnabled(boolean z5) {
        if (this.f8254u0 == z5) {
            return;
        }
        this.f8254u0 = z5;
        h[] hVarArr = this.f8259y;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof b) {
                    ((b) hVar).setDividersEnabled(z5);
                }
            }
        }
    }
}
