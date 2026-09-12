package com.google.android.material.chip;

import a5.i0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.t;
import androidx.core.view.u0;
import bh.j;
import bh.l;
import bh.p;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.modules.appstate.AppStateModule;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.ref.WeakReference;
import kh.m;
import kh.w;
import mf.f;
import oh.a;
import wg.c;
import wg.d;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public class Chip extends t implements d, w, Checkable {
    public static final Rect T = new Rect();
    public static final int[] U = {R.attr.state_selected};
    public static final int[] V = {R.attr.state_checkable};
    public View.OnClickListener E;
    public CompoundButton.OnCheckedChangeListener F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public CharSequence N;
    public final c O;
    public boolean P;
    public final Rect Q;
    public final RectF R;
    public final j S;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f6320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InsetDrawable f6321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RippleDrawable f6322y;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.a(context, attributeSet, com.discord.R.attr.chipStyle, com.discord.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.discord.R.attr.chipStyle);
        this.Q = new Rect();
        this.R = new RectF();
        this.S = new j(1, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        e eVar = new e(context2, attributeSet);
        Context context3 = eVar.L0;
        int[] iArr = kg.a.f14437h;
        TypedArray typedArrayF = p.f(context3, attributeSet, iArr, com.discord.R.attr.chipStyle, com.discord.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.f22249l1 = typedArrayF.hasValue(37);
        Context context4 = eVar.L0;
        ColorStateList colorStateListT = com.facebook.imagepipeline.nativecode.c.t(context4, typedArrayF, 24);
        if (eVar.f22236e0 != colorStateListT) {
            eVar.f22236e0 = colorStateListT;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList colorStateListT2 = com.facebook.imagepipeline.nativecode.c.t(context4, typedArrayF, 11);
        if (eVar.f22237f0 != colorStateListT2) {
            eVar.f22237f0 = colorStateListT2;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = typedArrayF.getDimension(19, 0.0f);
        if (eVar.f22239g0 != dimension) {
            eVar.f22239g0 = dimension;
            eVar.invalidateSelf();
            eVar.F();
        }
        if (typedArrayF.hasValue(12)) {
            eVar.L(typedArrayF.getDimension(12, 0.0f));
        }
        eVar.Q(com.facebook.imagepipeline.nativecode.c.t(context4, typedArrayF, 22));
        eVar.R(typedArrayF.getDimension(23, 0.0f));
        eVar.b0(com.facebook.imagepipeline.nativecode.c.t(context4, typedArrayF, 36));
        String text = typedArrayF.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(eVar.f22248l0, text);
        l lVar = eVar.R0;
        if (!zEquals) {
            eVar.f22248l0 = text;
            lVar.f3289e = true;
            eVar.invalidateSelf();
            eVar.F();
        }
        hh.d dVar = (!typedArrayF.hasValue(0) || (resourceId3 = typedArrayF.getResourceId(0, 0)) == 0) ? null : new hh.d(context4, resourceId3);
        dVar.f10762l = typedArrayF.getDimension(1, dVar.f10762l);
        lVar.b(dVar, context4);
        int i7 = typedArrayF.getInt(3, 0);
        if (i7 == 1) {
            eVar.f22243i1 = TextUtils.TruncateAt.START;
        } else if (i7 == 2) {
            eVar.f22243i1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i7 == 3) {
            eVar.f22243i1 = TextUtils.TruncateAt.END;
        }
        eVar.P(typedArrayF.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.P(typedArrayF.getBoolean(15, false));
        }
        eVar.M(com.facebook.imagepipeline.nativecode.c.w(context4, typedArrayF, 14));
        if (typedArrayF.hasValue(17)) {
            eVar.O(com.facebook.imagepipeline.nativecode.c.t(context4, typedArrayF, 17));
        }
        eVar.N(typedArrayF.getDimension(16, -1.0f));
        eVar.Y(typedArrayF.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.Y(typedArrayF.getBoolean(26, false));
        }
        eVar.S(com.facebook.imagepipeline.nativecode.c.w(context4, typedArrayF, 25));
        eVar.X(com.facebook.imagepipeline.nativecode.c.t(context4, typedArrayF, 30));
        eVar.U(typedArrayF.getDimension(28, 0.0f));
        eVar.H(typedArrayF.getBoolean(6, false));
        eVar.K(typedArrayF.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.K(typedArrayF.getBoolean(8, false));
        }
        eVar.I(com.facebook.imagepipeline.nativecode.c.w(context4, typedArrayF, 7));
        if (typedArrayF.hasValue(9)) {
            eVar.J(com.facebook.imagepipeline.nativecode.c.t(context4, typedArrayF, 9));
        }
        eVar.B0 = (!typedArrayF.hasValue(39) || (resourceId2 = typedArrayF.getResourceId(39, 0)) == 0) ? null : lg.c.a(context4, resourceId2);
        eVar.C0 = (!typedArrayF.hasValue(33) || (resourceId = typedArrayF.getResourceId(33, 0)) == 0) ? null : lg.c.a(context4, resourceId);
        float dimension2 = typedArrayF.getDimension(21, 0.0f);
        if (eVar.D0 != dimension2) {
            eVar.D0 = dimension2;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.a0(typedArrayF.getDimension(35, 0.0f));
        eVar.Z(typedArrayF.getDimension(34, 0.0f));
        float dimension3 = typedArrayF.getDimension(41, 0.0f);
        if (eVar.G0 != dimension3) {
            eVar.G0 = dimension3;
            eVar.invalidateSelf();
            eVar.F();
        }
        float dimension4 = typedArrayF.getDimension(40, 0.0f);
        if (eVar.H0 != dimension4) {
            eVar.H0 = dimension4;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.V(typedArrayF.getDimension(29, 0.0f));
        eVar.T(typedArrayF.getDimension(27, 0.0f));
        float dimension5 = typedArrayF.getDimension(13, 0.0f);
        if (eVar.K0 != dimension5) {
            eVar.K0 = dimension5;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.f22247k1 = typedArrayF.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayF.recycle();
        p.a(context2, attributeSet, com.discord.R.attr.chipStyle, com.discord.R.style.Widget_MaterialComponents_Chip_Action);
        p.b(context2, attributeSet, iArr, com.discord.R.attr.chipStyle, com.discord.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.discord.R.attr.chipStyle, com.discord.R.style.Widget_MaterialComponents_Chip_Action);
        this.K = typedArrayObtainStyledAttributes.getBoolean(32, false);
        TypedValue typedValueT = b.t(context2, com.discord.R.attr.minTouchTargetSize);
        this.M = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (int) ((typedValueT == null || typedValueT.type != 5) ? context2.getResources().getDimension(com.discord.R.dimen.mtrl_min_touch_target_size) : typedValueT.getDimension(context2.getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.p(getElevation());
        p.a(context2, attributeSet, com.discord.R.attr.chipStyle, com.discord.R.style.Widget_MaterialComponents_Chip_Action);
        p.b(context2, attributeSet, iArr, com.discord.R.attr.chipStyle, com.discord.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.discord.R.attr.chipStyle, com.discord.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.O = new c(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new wg.b(this));
        }
        setChecked(this.G);
        setText(eVar.f22248l0);
        setEllipsize(eVar.f22243i1);
        h();
        if (!this.f6320w.f22245j1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.K) {
            setMinHeight(this.M);
        }
        this.L = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wg.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f22227a.F;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z5);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.R;
        rectF.setEmpty();
        if (d() && this.E != null) {
            e eVar = this.f6320w;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.e0()) {
                float f2 = eVar.K0 + eVar.J0 + eVar.f22259v0 + eVar.I0 + eVar.H0;
                if (eVar.getLayoutDirection() == 0) {
                    float f7 = bounds.right;
                    rectF.right = f7;
                    rectF.left = f7 - f2;
                } else {
                    float f10 = bounds.left;
                    rectF.left = f10;
                    rectF.right = f10 + f2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i7 = (int) closeIconTouchBounds.left;
        int i10 = (int) closeIconTouchBounds.top;
        int i11 = (int) closeIconTouchBounds.right;
        int i12 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.Q;
        rect.set(i7, i10, i11, i12);
        return rect;
    }

    private hh.d getTextAppearance() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.R0.f3291g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z5) {
        if (this.I != z5) {
            this.I = z5;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z5) {
        if (this.H != z5) {
            this.H = z5;
            refreshDrawableState();
        }
    }

    public final void c(int i7) {
        this.M = i7;
        if (!this.K) {
            InsetDrawable insetDrawable = this.f6321x;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f6321x = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i7 - ((int) this.f6320w.f22239g0));
        int iMax2 = Math.max(0, i7 - this.f6320w.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f6321x;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f6321x = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i10 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i11 = iMax > 0 ? iMax / 2 : 0;
        if (this.f6321x != null) {
            Rect rect = new Rect();
            this.f6321x.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                f();
                return;
            }
        }
        if (getMinHeight() != i7) {
            setMinHeight(i7);
        }
        if (getMinWidth() != i7) {
            setMinWidth(i7);
        }
        this.f6321x = new InsetDrawable((Drawable) this.f6320w, i10, i11, i10, i11);
        f();
    }

    public final boolean d() {
        e eVar = this.f6320w;
        if (eVar == null) {
            return false;
        }
        Object obj = eVar.f22256s0;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof c1.b) {
            obj = null;
        }
        return obj != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.P) {
            return this.O.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.P) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.O;
        if (!cVar.dispatchKeyEvent(keyEvent) || cVar.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.t, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i7;
        super.drawableStateChanged();
        e eVar = this.f6320w;
        boolean zW = false;
        int i10 = 0;
        zW = false;
        if (eVar != null && e.E(eVar.f22256s0)) {
            e eVar2 = this.f6320w;
            ?? IsEnabled = isEnabled();
            if (this.J) {
                i7 = IsEnabled;
                i7 = IsEnabled + 1;
            }
            i7 = IsEnabled;
            int i11 = i7;
            if (this.I) {
                i11 = i7 + 1;
            }
            int i12 = i11;
            if (this.H) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            }
            if (this.J) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.I) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.H) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            zW = eVar2.W(iArr);
        }
        if (zW) {
            invalidate();
        }
    }

    public final void e() {
        e eVar;
        if (!d() || (eVar = this.f6320w) == null || !eVar.f22255r0 || this.E == null) {
            u0.p(this, null);
            this.P = false;
        } else {
            u0.p(this, this.O);
            this.P = true;
        }
    }

    public final void f() {
        this.f6322y = new RippleDrawable(ih.a.b(this.f6320w.f22246k0), getBackgroundDrawable(), null);
        this.f6320w.getClass();
        setBackground(this.f6322y);
        g();
    }

    public final void g() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.f6320w) == null) {
            return;
        }
        int iB = (int) (eVar.B() + eVar.K0 + eVar.H0);
        e eVar2 = this.f6320w;
        int iA = (int) (eVar2.A() + eVar2.D0 + eVar2.G0);
        if (this.f6321x != null) {
            Rect rect = new Rect();
            this.f6321x.getPadding(rect);
            iA += rect.left;
            iB += rect.right;
        }
        setPaddingRelative(iA, getPaddingTop(), iB, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.N)) {
            return this.N;
        }
        e eVar = this.f6320w;
        if (eVar == null || !eVar.f22261x0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f6321x;
        return insetDrawable == null ? this.f6320w : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22263z0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.A0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22237f0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return Math.max(0.0f, eVar.C());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f6320w;
    }

    public float getChipEndPadding() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.K0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f6320w;
        if (eVar == null || (drawable = eVar.f22251n0) == 0) {
            return null;
        }
        if (!(drawable instanceof c1.b)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22253p0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22252o0;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22239g0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.D0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22242i0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22244j0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f6320w;
        if (eVar == null || (drawable = eVar.f22256s0) == 0) {
            return null;
        }
        if (!(drawable instanceof c1.b)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22260w0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.J0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22259v0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.I0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22258u0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22243i1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.P) {
            c cVar = this.O;
            if (cVar.getKeyboardFocusedVirtualViewId() == 1 || cVar.getAccessibilityFocusedVirtualViewId() == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public lg.c getHideMotionSpec() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.C0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.F0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.E0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.f22246k0;
        }
        return null;
    }

    @NonNull
    public m getShapeAppearanceModel() {
        return this.f6320w.f14483e.f14463a;
    }

    public lg.c getShowMotionSpec() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.B0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.H0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f6320w;
        if (eVar != null) {
            return eVar.G0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        e eVar = this.f6320w;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        hh.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.S);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.facebook.imagepipeline.nativecode.c.J(this, this.f6320w);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, U);
        }
        e eVar = this.f6320w;
        if (eVar != null && eVar.f22261x0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z5, int i7, Rect rect) {
        super.onFocusChanged(z5, i7, rect);
        if (this.P) {
            this.O.onFocusChanged(z5, i7, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        e eVar = this.f6320w;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f22261x0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), RNCWebViewManager.COMMAND_CLEAR_HISTORY) : super.onResolvePointerIcon(motionEvent, i7);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        if (this.L != i7) {
            this.L = i7;
            g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.H) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z5 = true;
                }
                z5 = false;
            } else {
                if (this.H) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.E;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.P) {
                        this.O.sendEventForVirtualView(1, 1);
                    }
                    z5 = true;
                }
                setCloseIconPressed(false);
            }
            z5 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z5 = true;
        } else {
            z5 = false;
        }
        return z5 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.N = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6322y) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.t, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6322y) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.t, android.view.View
    public void setBackgroundResource(int i7) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z5) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.H(z5);
        }
    }

    public void setCheckableResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.H(eVar.L0.getResources().getBoolean(i7));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        e eVar = this.f6320w;
        if (eVar == null) {
            this.G = z5;
        } else if (eVar.f22261x0) {
            super.setChecked(z5);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.I(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z5) {
        setCheckedIconVisible(z5);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i7) {
        setCheckedIconVisible(i7);
    }

    public void setCheckedIconResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.I(f.u(eVar.L0, i7));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.J(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.J(y0.b.c(eVar.L0, i7));
        }
    }

    public void setCheckedIconVisible(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.K(eVar.L0.getResources().getBoolean(i7));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f6320w;
        if (eVar == null || eVar.f22237f0 == colorStateList) {
            return;
        }
        eVar.f22237f0 = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i7) {
        ColorStateList colorStateListC;
        e eVar = this.f6320w;
        if (eVar == null || eVar.f22237f0 == (colorStateListC = y0.b.c(eVar.L0, i7))) {
            return;
        }
        eVar.f22237f0 = colorStateListC;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.L(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.L(eVar.L0.getResources().getDimension(i7));
        }
    }

    public void setChipDrawable(@NonNull e eVar) {
        e eVar2 = this.f6320w;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.f22241h1 = new WeakReference(null);
            }
            this.f6320w = eVar;
            eVar.f22245j1 = false;
            eVar.f22241h1 = new WeakReference(this);
            c(this.M);
        }
    }

    public void setChipEndPadding(float f2) {
        e eVar = this.f6320w;
        if (eVar == null || eVar.K0 == f2) {
            return;
        }
        eVar.K0 = f2;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setChipEndPaddingResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            float dimension = eVar.L0.getResources().getDimension(i7);
            if (eVar.K0 != dimension) {
                eVar.K0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.M(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z5) {
        setChipIconVisible(z5);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i7) {
        setChipIconVisible(i7);
    }

    public void setChipIconResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.M(f.u(eVar.L0, i7));
        }
    }

    public void setChipIconSize(float f2) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.N(f2);
        }
    }

    public void setChipIconSizeResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.N(eVar.L0.getResources().getDimension(i7));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.O(colorStateList);
        }
    }

    public void setChipIconTintResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.O(y0.b.c(eVar.L0, i7));
        }
    }

    public void setChipIconVisible(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.P(eVar.L0.getResources().getBoolean(i7));
        }
    }

    public void setChipMinHeight(float f2) {
        e eVar = this.f6320w;
        if (eVar == null || eVar.f22239g0 == f2) {
            return;
        }
        eVar.f22239g0 = f2;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setChipMinHeightResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            float dimension = eVar.L0.getResources().getDimension(i7);
            if (eVar.f22239g0 != dimension) {
                eVar.f22239g0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        e eVar = this.f6320w;
        if (eVar == null || eVar.D0 == f2) {
            return;
        }
        eVar.D0 = f2;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setChipStartPaddingResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            float dimension = eVar.L0.getResources().getDimension(i7);
            if (eVar.D0 != dimension) {
                eVar.D0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.Q(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.Q(y0.b.c(eVar.L0, i7));
        }
    }

    public void setChipStrokeWidth(float f2) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.R(f2);
        }
    }

    public void setChipStrokeWidthResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.R(eVar.L0.getResources().getDimension(i7));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i7) {
        setText(getResources().getString(i7));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.S(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.f6320w;
        if (eVar == null || eVar.f22260w0 == charSequence) {
            return;
        }
        j1.b bVarC = j1.b.c();
        bVarC.getClass();
        i0 i0Var = j1.d.f13608a;
        eVar.f22260w0 = bVarC.d(charSequence);
        eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z5) {
        setCloseIconVisible(z5);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i7) {
        setCloseIconVisible(i7);
    }

    public void setCloseIconEndPadding(float f2) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.T(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.T(eVar.L0.getResources().getDimension(i7));
        }
    }

    public void setCloseIconResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.S(f.u(eVar.L0, i7));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.U(f2);
        }
    }

    public void setCloseIconSizeResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.U(eVar.L0.getResources().getDimension(i7));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.V(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.V(eVar.L0.getResources().getDimension(i7));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.X(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.X(y0.b.c(eVar.L0, i7));
        }
    }

    public void setCloseIconVisible(int i7) {
        setCloseIconVisible(getResources().getBoolean(i7));
    }

    @Override // androidx.appcompat.widget.t, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.t, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i7, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i7, i10, i11, i12);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.p(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f6320w == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.f22243i1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z5) {
        this.K = z5;
        c(this.M);
    }

    @Override // android.widget.TextView
    public void setGravity(int i7) {
        if (i7 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i7);
        }
    }

    public void setHideMotionSpec(lg.c cVar) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.C0 = cVar;
        }
    }

    public void setHideMotionSpecResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.C0 = lg.c.a(eVar.L0, i7);
        }
    }

    public void setIconEndPadding(float f2) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.Z(f2);
        }
    }

    public void setIconEndPaddingResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.Z(eVar.L0.getResources().getDimension(i7));
        }
    }

    public void setIconStartPadding(float f2) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.a0(f2);
        }
    }

    public void setIconStartPaddingResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.a0(eVar.L0.getResources().getDimension(i7));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
        if (this.f6320w == null) {
            return;
        }
        super.setLayoutDirection(i7);
    }

    @Override // android.widget.TextView
    public void setLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i7) {
        super.setMaxWidth(i7);
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.f22247k1 = i7;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i7);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.F = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.E = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.b0(colorStateList);
        }
        this.f6320w.getClass();
        f();
    }

    public void setRippleColorResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.b0(y0.b.c(eVar.L0, i7));
            this.f6320w.getClass();
            f();
        }
    }

    @Override // kh.w
    public void setShapeAppearanceModel(@NonNull m mVar) {
        this.f6320w.setShapeAppearanceModel(mVar);
    }

    public void setShowMotionSpec(lg.c cVar) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.B0 = cVar;
        }
    }

    public void setShowMotionSpecResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.B0 = lg.c.a(eVar.L0, i7);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z5) {
        if (!z5) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z5);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        e eVar = this.f6320w;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.f22245j1 ? null : charSequence, bufferType);
        e eVar2 = this.f6320w;
        if (eVar2 == null || TextUtils.equals(eVar2.f22248l0, charSequence)) {
            return;
        }
        eVar2.f22248l0 = charSequence;
        eVar2.R0.f3289e = true;
        eVar2.invalidateSelf();
        eVar2.F();
    }

    public void setTextAppearance(hh.d dVar) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.R0.b(dVar, eVar.L0);
        }
        h();
    }

    public void setTextAppearanceResource(int i7) {
        setTextAppearance(getContext(), i7);
    }

    public void setTextEndPadding(float f2) {
        e eVar = this.f6320w;
        if (eVar == null || eVar.H0 == f2) {
            return;
        }
        eVar.H0 = f2;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setTextEndPaddingResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            float dimension = eVar.L0.getResources().getDimension(i7);
            if (eVar.H0 != dimension) {
                eVar.H0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f2) {
        super.setTextSize(i7, f2);
        e eVar = this.f6320w;
        if (eVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i7, f2, getResources().getDisplayMetrics());
            l lVar = eVar.R0;
            hh.d dVar = lVar.f3291g;
            if (dVar != null) {
                dVar.f10762l = fApplyDimension;
                lVar.f3285a.setTextSize(fApplyDimension);
                eVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f2) {
        e eVar = this.f6320w;
        if (eVar == null || eVar.G0 == f2) {
            return;
        }
        eVar.G0 = f2;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setTextStartPaddingResource(int i7) {
        e eVar = this.f6320w;
        if (eVar != null) {
            float dimension = eVar.L0.getResources().getDimension(i7);
            if (eVar.G0 != dimension) {
                eVar.G0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setCloseIconVisible(boolean z5) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.Y(z5);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z5) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.K(z5);
        }
    }

    public void setChipIconVisible(boolean z5) {
        e eVar = this.f6320w;
        if (eVar != null) {
            eVar.P(z5);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        e eVar = this.f6320w;
        if (eVar != null) {
            Context context2 = eVar.L0;
            eVar.R0.b(new hh.d(context2, i7), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i7) {
        super.setTextAppearance(i7);
        e eVar = this.f6320w;
        if (eVar != null) {
            Context context = eVar.L0;
            eVar.R0.b(new hh.d(context, i7), context);
        }
        h();
    }

    public void setInternalOnCheckedChangeListener(bh.f fVar) {
    }
}
