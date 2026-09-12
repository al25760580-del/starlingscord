package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.s;
import androidx.dynamicanimation.animation.SpringAnimation;
import bh.p;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.imagepipeline.nativecode.c;
import fh.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kh.a0;
import kh.i;
import kh.m;
import kh.w;
import kh.y;
import kh.z;
import mf.f;
import s0.g;
import sg.a;
import sg.d;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends s implements Checkable, w {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int[] f6300f0 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int[] f6301g0 = {R.attr.state_checked};
    public static final l h0 = new l(1);
    public ColorStateList E;
    public Drawable F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public float P;
    public int Q;
    public int R;
    public LinearLayout.LayoutParams S;
    public boolean T;
    public int U;
    public boolean V;
    public int W;
    public a0 a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f6302b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f6303c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f6304d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SpringAnimation f6305e0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f6306v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashSet f6307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a f6308x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f6309y;

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        super(oh.a.b(context, attributeSet, com.discord.R.attr.materialButtonStyle, com.discord.R.style.Widget_MaterialComponents_Button, new int[]{com.discord.R.attr.materialSizeOverlay}), attributeSet, com.discord.R.attr.materialButtonStyle);
        this.f6307w = new LinkedHashSet();
        this.L = false;
        this.M = false;
        this.O = -1;
        this.P = -1.0f;
        this.Q = -1;
        this.R = -1;
        this.W = -1;
        Context context2 = getContext();
        TypedArray typedArrayF = p.f(context2, attributeSet, kg.a.f14443p, com.discord.R.attr.materialButtonStyle, com.discord.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.K = typedArrayF.getDimensionPixelSize(13, 0);
        int i7 = typedArrayF.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f6309y = p.h(i7, mode);
        this.E = c.t(getContext(), typedArrayF, 15);
        this.F = c.w(getContext(), typedArrayF, 11);
        this.N = typedArrayF.getInteger(12, 1);
        this.H = typedArrayF.getDimensionPixelSize(14, 0);
        y yVarB = y.b(context2, typedArrayF, 19);
        m mVarC = yVarB != null ? yVarB.c() : m.c(context2, attributeSet, com.discord.R.attr.materialButtonStyle, com.discord.R.style.Widget_MaterialComponents_Button).a();
        boolean z5 = typedArrayF.getBoolean(17, false);
        d dVar = new d(this, mVarC);
        this.f6306v = dVar;
        dVar.f19957f = typedArrayF.getDimensionPixelOffset(2, 0);
        dVar.f19958g = typedArrayF.getDimensionPixelOffset(3, 0);
        dVar.f19959h = typedArrayF.getDimensionPixelOffset(4, 0);
        dVar.f19960i = typedArrayF.getDimensionPixelOffset(5, 0);
        if (typedArrayF.hasValue(9)) {
            int dimensionPixelSize = typedArrayF.getDimensionPixelSize(9, -1);
            dVar.j = dimensionPixelSize;
            kh.l lVarG = dVar.f19953b.g();
            lVarG.b(dimensionPixelSize);
            dVar.f19953b = lVarG.a();
            dVar.f19954c = null;
            dVar.d();
            dVar.f19968s = true;
        }
        dVar.k = typedArrayF.getDimensionPixelSize(22, 0);
        dVar.f19961l = p.h(typedArrayF.getInt(8, -1), mode);
        dVar.f19962m = c.t(getContext(), typedArrayF, 7);
        dVar.f19963n = c.t(getContext(), typedArrayF, 21);
        dVar.f19964o = c.t(getContext(), typedArrayF, 18);
        dVar.f19969t = typedArrayF.getBoolean(6, false);
        dVar.f19972w = typedArrayF.getDimensionPixelSize(10, 0);
        dVar.f19970u = typedArrayF.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayF.hasValue(0)) {
            dVar.f19967r = true;
            setSupportBackgroundTintList(dVar.f19962m);
            setSupportBackgroundTintMode(dVar.f19961l);
        } else {
            dVar.c();
        }
        setPaddingRelative(paddingStart + dVar.f19957f, paddingTop + dVar.f19959h, paddingEnd + dVar.f19958g, paddingBottom + dVar.f19960i);
        setCheckedInternal(typedArrayF.getBoolean(1, false));
        if (yVarB != null) {
            dVar.f19955d = d();
            if (dVar.f19954c != null) {
                dVar.d();
            }
            dVar.f19954c = yVarB;
            dVar.d();
        }
        setOpticalCenterEnabled(z5);
        typedArrayF.recycle();
        setCompoundDrawablePadding(this.K);
        h(this.F != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.U = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f6303c0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        i iVarA;
        if (this.T && this.V && (iVarA = this.f6306v.a(false)) != null) {
            return (int) (iVarA.i() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < lineCount; i7++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i7));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z5) {
        d dVar = this.f6306v;
        if (dVar == null || !dVar.f19969t || this.L == z5) {
            return;
        }
        this.L = z5;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z6 = this.L;
            if (!materialButtonToggleGroup.I) {
                materialButtonToggleGroup.f(getId(), z6);
            }
        }
        if (this.M) {
            return;
        }
        this.M = true;
        Iterator it = this.f6307w.iterator();
        if (it.hasNext()) {
            throw g.a(it);
        }
        this.M = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f2) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.f6303c0 != f2) {
            this.f6303c0 = f2;
            j();
            invalidate();
            if (getParent() instanceof sg.c) {
                sg.c cVar = (sg.c) getParent();
                int i7 = (int) this.f6303c0;
                int iIndexOfChild = cVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i10 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i10 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (cVar.c(i10)) {
                            materialButton2 = (MaterialButton) cVar.getChildAt(i10);
                            break;
                        }
                        i10--;
                    }
                }
                int childCount = cVar.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (cVar.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) cVar.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i7);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i7);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i7 / 2);
                materialButton.setDisplayedWidthDecrease((i7 + 1) / 2);
            }
        }
    }

    public final j2.i d() {
        Context context = getContext();
        TypedValue typedValueT = b.t(context, com.discord.R.attr.motionSpringFastSpatial);
        int[] iArr = kg.a.f14453z;
        TypedArray typedArrayObtainStyledAttributes = typedValueT == null ? context.obtainStyledAttributes(null, iArr, 0, com.discord.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueT.resourceId, iArr);
        j2.i iVar = new j2.i();
        try {
            float f2 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f7 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f7 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            iVar.b(f2);
            iVar.a(f7);
            typedArrayObtainStyledAttributes.recycle();
            return iVar;
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final boolean e() {
        d dVar = this.f6306v;
        return (dVar == null || dVar.f19967r) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final void f(boolean z5) {
        int i7;
        if (this.a0 == null) {
            return;
        }
        if (this.f6305e0 == null) {
            SpringAnimation springAnimation = new SpringAnimation(this, h0);
            this.f6305e0 = springAnimation;
            springAnimation.f2009m = d();
        }
        if (this.V) {
            int i10 = this.f6302b0;
            a0 a0Var = this.a0;
            int[] drawableState = getDrawableState();
            int[][] iArr = a0Var.f14457c;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i7 = -1;
                if (i12 >= a0Var.f14455a) {
                    i12 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i12], drawableState)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = a0Var.f14457c;
                for (int i13 = 0; i13 < a0Var.f14455a; i13++) {
                    if (StateSet.stateSetMatches(iArr3[i13], iArr2)) {
                        i7 = i13;
                        break;
                    }
                }
                i12 = i7;
            }
            z zVar = (z) (i12 < 0 ? a0Var.f14456b : a0Var.f14458d[i12]).f21117d;
            int width = getWidth();
            float f2 = zVar.f14549b;
            int i14 = zVar.f14548a;
            if (i14 != 1) {
                if (i14 == 2) {
                }
                this.f6305e0.a(Math.min(i10, i11));
                if (z5) {
                    this.f6305e0.f();
                }
            }
            f2 *= width;
            i11 = (int) f2;
            this.f6305e0.a(Math.min(i10, i11));
            if (z5) {
                this.f6305e0.f();
            }
        }
    }

    public final void g() {
        int i7 = this.N;
        if (i7 == 1 || i7 == 2) {
            setCompoundDrawablesRelative(this.F, null, null, null);
            return;
        }
        if (i7 == 3 || i7 == 4) {
            setCompoundDrawablesRelative(null, null, this.F, null);
        } else if (i7 == 16 || i7 == 32) {
            setCompoundDrawablesRelative(null, this.F, null, null);
        }
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.G)) {
            return this.G;
        }
        d dVar = this.f6306v;
        return ((dVar == null || !dVar.f19969t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.W;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f6306v.j;
        }
        return 0;
    }

    public j2.i getCornerSpringForce() {
        return this.f6306v.f19955d;
    }

    public Drawable getIcon() {
        return this.F;
    }

    public int getIconGravity() {
        return this.N;
    }

    public int getIconPadding() {
        return this.K;
    }

    public int getIconSize() {
        return this.H;
    }

    public ColorStateList getIconTint() {
        return this.E;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f6309y;
    }

    public int getInsetBottom() {
        return this.f6306v.f19960i;
    }

    public int getInsetTop() {
        return this.f6306v.f19959h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f6306v.f19964o;
        }
        return null;
    }

    @NonNull
    public m getShapeAppearanceModel() {
        if (e()) {
            return this.f6306v.f19953b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public y getStateListShapeAppearanceModel() {
        if (e()) {
            return this.f6306v.f19954c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f6306v.f19963n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f6306v.k;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.s
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f6306v.f19962m : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f6306v.f19961l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z5) {
        Drawable drawable = this.F;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.F = drawableMutate;
            drawableMutate.setTintList(this.E);
            PorterDuff.Mode mode = this.f6309y;
            if (mode != null) {
                this.F.setTintMode(mode);
            }
            int intrinsicWidth = this.H;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.F.getIntrinsicWidth();
            }
            int intrinsicHeight = this.H;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.F.getIntrinsicHeight();
            }
            Drawable drawable2 = this.F;
            int i7 = this.I;
            int i10 = this.J;
            drawable2.setBounds(i7, i10, intrinsicWidth + i7, intrinsicHeight + i10);
            this.F.setVisible(true, z5);
        }
        if (z5) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i11 = this.N;
        if (((i11 == 1 || i11 == 2) && drawable3 != this.F) || (((i11 == 3 || i11 == 4) && drawable5 != this.F) || ((i11 == 16 || i11 == 32) && drawable4 != this.F))) {
            g();
        }
    }

    public final void i(int i7, int i10) {
        if (this.F == null || getLayout() == null) {
            return;
        }
        int i11 = this.N;
        if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            if (i11 == 16 || i11 == 32) {
                this.I = 0;
                if (i11 == 16) {
                    this.J = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.H;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.F.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.K) - getPaddingBottom()) / 2);
                if (this.J != iMax) {
                    this.J = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.J = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.N;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.I = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.H;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.F.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i7 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.K) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.N == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.I != textLayoutWidth) {
            this.I = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.L;
    }

    public final void j() {
        int i7 = (int) (this.f6303c0 - this.f6304d0);
        int i10 = (i7 / 2) + this.U;
        getLayoutParams().width = (int) (this.P + i7);
        setPaddingRelative(this.Q + i10, getPaddingTop(), (this.R + i7) - i10, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            c.J(this, this.f6306v.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        d dVar = this.f6306v;
        if (dVar != null && dVar.f19969t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6300f0);
        }
        if (this.L) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6301g0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.s, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.L);
    }

    @Override // androidx.appcompat.widget.s, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        d dVar = this.f6306v;
        accessibilityNodeInfo.setCheckable(dVar != null && dVar.f19969t);
        accessibilityNodeInfo.setChecked(this.L);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.s, android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z5, i7, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i14 = getResources().getConfiguration().orientation;
        if (this.O != i14) {
            this.O = i14;
            this.P = -1.0f;
        }
        if (this.P == -1.0f) {
            this.P = getMeasuredWidth();
            if (this.S == null && (getParent() instanceof sg.c) && ((sg.c) getParent()).getButtonSizeChange() != null) {
                this.S = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.S);
                layoutParams.width = (int) this.P;
                setLayoutParams(layoutParams);
            }
        }
        boolean z6 = false;
        if (this.W == -1) {
            if (this.F == null) {
                i13 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.H;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.F.getIntrinsicWidth();
                }
                i13 = iconPadding + intrinsicWidth;
            }
            this.W = (getMeasuredWidth() - getTextLayoutWidth()) - i13;
        }
        if (this.Q == -1) {
            this.Q = getPaddingStart();
        }
        if (this.R == -1) {
            this.R = getPaddingEnd();
        }
        if ((getParent() instanceof sg.c) && ((sg.c) getParent()).getOrientation() == 0) {
            z6 = true;
        }
        this.V = z6;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sg.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sg.b bVar = (sg.b) parcelable;
        super.onRestoreInstanceState(bVar.f7578d);
        setChecked(bVar.f19944i);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        sg.b bVar = new sg.b(super.onSaveInstanceState());
        bVar.f19944i = this.L;
        return bVar;
    }

    @Override // androidx.appcompat.widget.s, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f6306v.f19970u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.F != null) {
            if (this.F.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.G = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (!e()) {
            super.setBackgroundColor(i7);
            return;
        }
        d dVar = this.f6306v;
        if (dVar.a(false) != null) {
            dVar.a(false).setTint(i7);
        }
    }

    @Override // androidx.appcompat.widget.s, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        d dVar = this.f6306v;
        dVar.f19967r = true;
        MaterialButton materialButton = dVar.f19952a;
        materialButton.setSupportBackgroundTintList(dVar.f19962m);
        materialButton.setSupportBackgroundTintMode(dVar.f19961l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.s, android.view.View
    public void setBackgroundResource(int i7) {
        setBackgroundDrawable(i7 != 0 ? f.u(getContext(), i7) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z5) {
        if (e()) {
            this.f6306v.f19969t = z5;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        setCheckedInternal(z5);
    }

    public void setCornerRadius(int i7) {
        if (e()) {
            d dVar = this.f6306v;
            if (dVar.f19968s && dVar.j == i7) {
                return;
            }
            dVar.j = i7;
            dVar.f19968s = true;
            kh.l lVarG = dVar.f19953b.g();
            lVarG.b(i7);
            dVar.f19953b = lVarG.a();
            dVar.f19954c = null;
            dVar.d();
        }
    }

    public void setCornerRadiusResource(int i7) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i7));
        }
    }

    public void setCornerSpringForce(@NonNull j2.i iVar) {
        d dVar = this.f6306v;
        dVar.f19955d = iVar;
        if (dVar.f19954c != null) {
            dVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i7) {
        this.f6304d0 = Math.min(i7, this.W);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (e()) {
            this.f6306v.a(false).p(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.F != drawable) {
            this.F = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i7) {
        if (this.N != i7) {
            this.N = i7;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i7) {
        if (this.K != i7) {
            this.K = i7;
            setCompoundDrawablePadding(i7);
        }
    }

    public void setIconResource(int i7) {
        setIcon(i7 != 0 ? f.u(getContext(), i7) : null);
    }

    public void setIconSize(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.H != i7) {
            this.H = i7;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f6309y != mode) {
            this.f6309y = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i7) {
        setIconTint(y0.b.c(getContext(), i7));
    }

    public void setInsetBottom(int i7) {
        d dVar = this.f6306v;
        dVar.b(dVar.f19959h, i7);
    }

    public void setInsetTop(int i7) {
        d dVar = this.f6306v;
        dVar.b(i7, dVar.f19960i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f6308x = aVar;
    }

    public void setOpticalCenterEnabled(boolean z5) {
        if (this.T != z5) {
            this.T = z5;
            d dVar = this.f6306v;
            if (z5) {
                mi.a aVar = new mi.a(4, this);
                dVar.f19956e = aVar;
                i iVarA = dVar.a(false);
                if (iVarA != null) {
                    iVarA.f14481b0 = aVar;
                }
            } else {
                dVar.f19956e = null;
                i iVarA2 = dVar.a(false);
                if (iVarA2 != null) {
                    iVarA2.f14481b0 = null;
                }
            }
            post(new io.sentry.android.core.p(29, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        a aVar = this.f6308x;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((pf.b) aVar).f18027e).invalidate();
        }
        super.setPressed(z5);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            d dVar = this.f6306v;
            MaterialButton materialButton = dVar.f19952a;
            if (dVar.f19964o != colorStateList) {
                dVar.f19964o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(ih.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i7) {
        if (e()) {
            setRippleColor(y0.b.c(getContext(), i7));
        }
    }

    @Override // kh.w
    public void setShapeAppearanceModel(@NonNull m mVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        d dVar = this.f6306v;
        dVar.f19953b = mVar;
        dVar.f19954c = null;
        dVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z5) {
        if (e()) {
            d dVar = this.f6306v;
            dVar.f19966q = z5;
            dVar.e();
        }
    }

    public void setSizeChange(@NonNull a0 a0Var) {
        if (this.a0 != a0Var) {
            this.a0 = a0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(@NonNull y yVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        d dVar = this.f6306v;
        if (dVar.f19955d == null && yVar.d()) {
            dVar.f19955d = d();
            if (dVar.f19954c != null) {
                dVar.d();
            }
        }
        dVar.f19954c = yVar;
        dVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            d dVar = this.f6306v;
            if (dVar.f19963n != colorStateList) {
                dVar.f19963n = colorStateList;
                dVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i7) {
        if (e()) {
            setStrokeColor(y0.b.c(getContext(), i7));
        }
    }

    public void setStrokeWidth(int i7) {
        if (e()) {
            d dVar = this.f6306v;
            if (dVar.k != i7) {
                dVar.k = i7;
                dVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i7) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override // androidx.appcompat.widget.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        d dVar = this.f6306v;
        if (dVar.f19962m != colorStateList) {
            dVar.f19962m = colorStateList;
            if (dVar.a(false) != null) {
                dVar.a(false).setTintList(dVar.f19962m);
            }
        }
    }

    @Override // androidx.appcompat.widget.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        d dVar = this.f6306v;
        if (dVar.f19961l != mode) {
            dVar.f19961l = mode;
            if (dVar.a(false) == null || dVar.f19961l == null) {
                return;
            }
            dVar.a(false).setTintMode(dVar.f19961l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i7) {
        super.setTextAlignment(i7);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z5) {
        this.f6306v.f19970u = z5;
    }

    @Override // android.widget.TextView
    public void setWidth(int i7) {
        this.P = -1.0f;
        super.setWidth(i7);
    }

    public void setWidthChangeMax(int i7) {
        if (this.f6302b0 != i7) {
            this.f6302b0 = i7;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.L);
    }
}
