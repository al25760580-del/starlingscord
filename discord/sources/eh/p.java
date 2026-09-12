package eh;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.e1;
import com.discord.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import n.v;
import n.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f8271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qg.b f8272e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f8273i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m.e f8274v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n f8275w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public p(ContextThemeWrapper contextThemeWrapper) {
        ?? r10;
        super(oh.a.b(contextThemeWrapper, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]), null, R.attr.bottomNavigationStyle);
        k kVar = new k();
        kVar.f8263e = false;
        this.f8273i = kVar;
        Context context = getContext();
        e4.m mVarG = bh.p.g(context, null, kg.a.E, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 17, 15);
        f fVar = new f(context, getClass(), getMaxItemCount());
        this.f8271d = fVar;
        qg.b bVar = new qg.b(context);
        this.f8272e = bVar;
        bVar.setMinimumHeight(getSuggestedMinimumHeight());
        bVar.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        kVar.f8262d = bVar;
        kVar.f8264i = 1;
        bVar.setPresenter(kVar);
        fVar.b(kVar, fVar.f16142a);
        kVar.c(getContext(), fVar);
        TypedArray typedArray = (TypedArray) mVarG.f7994i;
        if (typedArray.hasValue(11)) {
            bVar.setIconTintList(mVarG.w(11));
        } else {
            bVar.setIconTintList(bVar.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(17)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(17, 0));
        }
        if (typedArray.hasValue(15)) {
            setItemTextAppearanceActive(typedArray.getResourceId(15, 0));
        }
        if (typedArray.hasValue(4)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(3)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(3, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(16, true));
        if (typedArray.hasValue(18)) {
            setItemTextColor(mVarG.w(18));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListB = e1.b(background);
        if (background == null || colorStateListB != null) {
            kh.i iVar = new kh.i(kh.m.c(context, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (colorStateListB != null) {
                iVar.q(colorStateListB);
            }
            iVar.m(context);
            setBackground(iVar);
        }
        if (typedArray.hasValue(13)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(13, 0));
        }
        if (typedArray.hasValue(12)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(12, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(5)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(5, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(com.facebook.imagepipeline.nativecode.c.u(context, mVarG, 1));
        setLabelVisibilityMode(typedArray.getInteger(21, -1));
        setItemIconGravity(typedArray.getInteger(9, 0));
        setItemGravity(typedArray.getInteger(8, 49));
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            bVar.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(com.facebook.imagepipeline.nativecode.c.u(context, mVarG, 14));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(22, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(19, false));
        setLabelMaxLines(typedArray.getInteger(20, 1));
        int resourceId2 = typedArray.getResourceId(6, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, kg.a.D);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = typedArrayObtainStyledAttributes.getString(9);
            int dimensionPixelSize2 = -2;
            if (string != null) {
                if (String.valueOf(-1).equals(string)) {
                    dimensionPixelSize2 = -1;
                } else if (!String.valueOf(-2).equals(string)) {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(dimensionPixelSize2);
            setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset));
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize3);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize3);
            int i7 = getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset2 = getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            Rect rect = bVar.f8256v0;
            rect.left = i7;
            rect.top = dimensionPixelOffset4;
            rect.right = dimensionPixelOffset2;
            rect.bottom = dimensionPixelOffset5;
            h[] hVarArr = bVar.f8259y;
            if (hVarArr != null) {
                for (h hVar : hVarArr) {
                    if (hVar instanceof e) {
                        ((e) hVar).setActiveIndicatorExpandedPadding(rect);
                    }
                }
            }
            setItemActiveIndicatorColor(com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 2));
            r10 = 0;
            setItemActiveIndicatorShapeAppearance(kh.m.a(context, typedArrayObtainStyledAttributes.getResourceId(11, 0), 0).a());
            typedArrayObtainStyledAttributes.recycle();
        } else {
            r10 = 0;
        }
        if (typedArray.hasValue(23)) {
            int resourceId3 = typedArray.getResourceId(23, r10);
            k kVar2 = this.f8273i;
            kVar2.f8263e = true;
            getMenuInflater().inflate(resourceId3, this.f8271d);
            kVar2.f8263e = r10;
            kVar2.a(true);
        }
        mVarG.H();
        addView(this.f8272e);
        this.f8271d.f16146e = new u4.b(8, (qg.e) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f8274v == null) {
            this.f8274v = new m.e(getContext());
        }
        return this.f8274v;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z5) {
        this.f8272e.setMeasurePaddingFromLabelBaseline(z5);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f8272e.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f8272e.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f8272e.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f8272e.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f8272e.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f8272e.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f8272e.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f8272e.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f8272e.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f8272e.getItemActiveIndicatorMarginHorizontal();
    }

    public kh.m getItemActiveIndicatorShapeAppearance() {
        return this.f8272e.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f8272e.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f8272e.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f8272e.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f8272e.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f8272e.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f8272e.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f8272e.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f8272e.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f8272e.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f8272e.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f8272e.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f8272e.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f8272e.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f8272e.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f8271d;
    }

    @NonNull
    public x getMenuView() {
        return this.f8272e;
    }

    @NonNull
    public ViewGroup getMenuViewGroup() {
        return this.f8272e;
    }

    @NonNull
    public k getPresenter() {
        return this.f8273i;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f8272e.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f8272e.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof kh.i) {
            com.facebook.imagepipeline.nativecode.c.J(this, (kh.i) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.f7578d);
        Bundle bundle = oVar.f8270i;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f8271d.f16160u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : copyOnWriteArrayList) {
            v vVar = (v) weakReference.get();
            if (vVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id2 = vVar.getId();
                if (id2 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    vVar.f(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableI;
        o oVar = new o(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        oVar.f8270i = bundle;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f8271d.f16160u;
        if (copyOnWriteArrayList.isEmpty()) {
            return oVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            v vVar = (v) weakReference.get();
            if (vVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id2 = vVar.getId();
                if (id2 > 0 && (parcelableI = vVar.i()) != null) {
                    sparseArray.put(id2, parcelableI);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return oVar;
    }

    public void setActiveIndicatorLabelPadding(int i7) {
        this.f8272e.setActiveIndicatorLabelPadding(i7);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof kh.i) {
            ((kh.i) background).p(f2);
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i7) {
        this.f8272e.setHorizontalItemTextAppearanceActive(i7);
    }

    public void setHorizontalItemTextAppearanceInactive(int i7) {
        this.f8272e.setHorizontalItemTextAppearanceInactive(i7);
    }

    public void setIconLabelHorizontalSpacing(int i7) {
        this.f8272e.setIconLabelHorizontalSpacing(i7);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f8272e.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z5) {
        this.f8272e.setItemActiveIndicatorEnabled(z5);
    }

    public void setItemActiveIndicatorExpandedHeight(int i7) {
        this.f8272e.setItemActiveIndicatorExpandedHeight(i7);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i7) {
        this.f8272e.setItemActiveIndicatorExpandedMarginHorizontal(i7);
    }

    public void setItemActiveIndicatorExpandedWidth(int i7) {
        this.f8272e.setItemActiveIndicatorExpandedWidth(i7);
    }

    public void setItemActiveIndicatorHeight(int i7) {
        this.f8272e.setItemActiveIndicatorHeight(i7);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i7) {
        this.f8272e.setItemActiveIndicatorMarginHorizontal(i7);
    }

    public void setItemActiveIndicatorShapeAppearance(kh.m mVar) {
        this.f8272e.setItemActiveIndicatorShapeAppearance(mVar);
    }

    public void setItemActiveIndicatorWidth(int i7) {
        this.f8272e.setItemActiveIndicatorWidth(i7);
    }

    public void setItemBackground(Drawable drawable) {
        this.f8272e.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i7) {
        this.f8272e.setItemBackgroundRes(i7);
    }

    public void setItemGravity(int i7) {
        qg.b bVar = this.f8272e;
        if (bVar.getItemGravity() != i7) {
            bVar.setItemGravity(i7);
            this.f8273i.a(false);
        }
    }

    public void setItemIconGravity(int i7) {
        qg.b bVar = this.f8272e;
        if (bVar.getItemIconGravity() != i7) {
            bVar.setItemIconGravity(i7);
            this.f8273i.a(false);
        }
    }

    public void setItemIconSize(int i7) {
        this.f8272e.setItemIconSize(i7);
    }

    public void setItemIconSizeRes(int i7) {
        setItemIconSize(getResources().getDimensionPixelSize(i7));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f8272e.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i7) {
        this.f8272e.setItemPaddingBottom(i7);
    }

    public void setItemPaddingTop(int i7) {
        this.f8272e.setItemPaddingTop(i7);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f8272e.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i7) {
        this.f8272e.setItemTextAppearanceActive(i7);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.f8272e.setItemTextAppearanceActiveBoldEnabled(z5);
    }

    public void setItemTextAppearanceInactive(int i7) {
        this.f8272e.setItemTextAppearanceInactive(i7);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f8272e.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z5) {
        this.f8272e.setLabelFontScalingEnabled(z5);
    }

    public void setLabelMaxLines(int i7) {
        this.f8272e.setLabelMaxLines(i7);
    }

    public void setLabelVisibilityMode(int i7) {
        qg.b bVar = this.f8272e;
        if (bVar.getLabelVisibilityMode() != i7) {
            bVar.setLabelVisibilityMode(i7);
            this.f8273i.a(false);
        }
    }

    public void setOnItemSelectedListener(n nVar) {
        this.f8275w = nVar;
    }

    public void setSelectedItemId(int i7) {
        f fVar = this.f8271d;
        MenuItem menuItemFindItem = fVar.findItem(i7);
        if (menuItemFindItem != null) {
            boolean zQ = fVar.q(menuItemFindItem, this.f8273i, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zQ || menuItemFindItem.isChecked()) {
                    this.f8272e.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }

    public void setOnItemReselectedListener(m mVar) {
    }
}
