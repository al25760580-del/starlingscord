package vg;

import a1.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.t;
import bh.p;
import com.discord.R;
import e4.m;
import fh.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n3.d;
import n3.e;
import n3.f;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends t {
    public static final int[] V = {R.attr.state_indeterminate};
    public static final int[] W = {R.attr.state_error};
    public static final int[][] a0 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f21667b0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public boolean E;
    public boolean F;
    public boolean G;
    public CharSequence H;
    public Drawable I;
    public Drawable J;
    public boolean K;
    public ColorStateList L;
    public ColorStateList M;
    public PorterDuff.Mode N;
    public int O;
    public int[] P;
    public boolean Q;
    public CharSequence R;
    public CompoundButton.OnCheckedChangeListener S;
    public final f T;
    public final c U;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashSet f21668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f21669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f21670y;

    public b(Context context, AttributeSet attributeSet) {
        super(oh.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f21668w = new LinkedHashSet();
        this.f21669x = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = n.f42a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        drawable.setCallback(fVar.f16306x);
        new d(drawable.getConstantState());
        fVar.f16307d = drawable;
        this.T = fVar;
        this.U = new c(2, this);
        Context context3 = getContext();
        this.I = getButtonDrawable();
        this.L = getSuperButtonTintList();
        setSupportButtonTintList(null);
        m mVarG = p.g(context3, attributeSet, kg.a.f14449v, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) mVarG.f7994i;
        this.J = mVarG.x(2);
        if (this.I != null && com.facebook.imagepipeline.nativecode.b.v(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f21667b0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.I = mf.f.u(context3, R.drawable.mtrl_checkbox_button);
                this.K = true;
                if (this.J == null) {
                    this.J = mf.f.u(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.M = com.facebook.imagepipeline.nativecode.c.u(context3, mVarG, 3);
        this.N = p.h(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.E = typedArray.getBoolean(10, false);
        this.F = typedArray.getBoolean(6, true);
        this.G = typedArray.getBoolean(9, false);
        this.H = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        mVarG.H();
        a();
    }

    @NonNull
    private String getButtonStateDescription() {
        int i7 = this.O;
        if (i7 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i7 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f21670y == null) {
            int iW = io.sentry.config.a.w(R.attr.colorControlActivated, this);
            int iW2 = io.sentry.config.a.w(R.attr.colorError, this);
            int iW3 = io.sentry.config.a.w(R.attr.colorSurface, this);
            int iW4 = io.sentry.config.a.w(R.attr.colorOnSurface, this);
            this.f21670y = new ColorStateList(a0, new int[]{io.sentry.config.a.N(iW3, iW2, 1.0f), io.sentry.config.a.N(iW3, iW, 1.0f), io.sentry.config.a.N(iW3, iW4, 0.54f), io.sentry.config.a.N(iW3, iW4, 0.38f), io.sentry.config.a.N(iW3, iW4, 0.38f)});
        }
        return this.f21670y;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        androidx.appcompat.widget.c cVar;
        Drawable drawableMutate = this.I;
        ColorStateList colorStateList3 = this.L;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.I = drawableMutate;
        Drawable drawableMutate2 = this.J;
        ColorStateList colorStateList4 = this.M;
        PorterDuff.Mode mode = this.N;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.J = drawableMutate2;
        if (this.K) {
            f fVar = this.T;
            if (fVar != null) {
                n3.c cVar2 = fVar.f16302e;
                c cVar3 = this.U;
                if (cVar3 != null) {
                    Drawable drawable = fVar.f16307d;
                    if (drawable != null) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                        if (cVar3.f9167a == null) {
                            cVar3.f9167a = new n3.b(cVar3);
                        }
                        e.c(animatedVectorDrawable, cVar3.f9167a);
                    }
                    ArrayList arrayList = fVar.f16305w;
                    if (arrayList != null) {
                        arrayList.remove(cVar3);
                        if (fVar.f16305w.size() == 0 && (cVar = fVar.f16304v) != null) {
                            cVar2.f16298b.removeListener(cVar);
                            fVar.f16304v = null;
                        }
                    }
                }
                if (cVar3 != null) {
                    Drawable drawable2 = fVar.f16307d;
                    if (drawable2 != null) {
                        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                        if (cVar3.f9167a == null) {
                            cVar3.f9167a = new n3.b(cVar3);
                        }
                        e.b(animatedVectorDrawable2, cVar3.f9167a);
                    } else {
                        if (fVar.f16305w == null) {
                            fVar.f16305w = new ArrayList();
                        }
                        if (!fVar.f16305w.contains(cVar3)) {
                            fVar.f16305w.add(cVar3);
                            if (fVar.f16304v == null) {
                                fVar.f16304v = new androidx.appcompat.widget.c(4, fVar);
                            }
                            cVar2.f16298b.addListener(fVar.f16304v);
                        }
                    }
                }
            }
            Drawable drawable3 = this.I;
            if ((drawable3 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.I).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable4 = this.I;
        if (drawable4 != null && (colorStateList2 = this.L) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.J;
        if (drawable5 != null && (colorStateList = this.M) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.I;
        Drawable drawable7 = this.J;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.I;
    }

    public Drawable getButtonIconDrawable() {
        return this.J;
    }

    public ColorStateList getButtonIconTintList() {
        return this.M;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.N;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.L;
    }

    public int getCheckedState() {
        return this.O;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.H;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.O == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E && this.L == null && this.M == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V);
        }
        if (this.G) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, W);
        }
        for (int i10 = 0; i10 < iArrOnCreateDrawableState.length; i10++) {
            int i11 = iArrOnCreateDrawableState[i10];
            if (i11 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i11 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i10] = 16842912;
            }
            this.P = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.P = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.F || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.G) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.H));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCheckedState(aVar.f21666d);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f21666d = getCheckedState();
        return aVar;
    }

    @Override // androidx.appcompat.widget.t, android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(mf.f.u(getContext(), i7));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.J = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i7) {
        setButtonIconDrawable(mf.f.u(getContext(), i7));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.M == colorStateList) {
            return;
        }
        this.M = colorStateList;
        a();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.N == mode) {
            return;
        }
        this.N = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.L == colorStateList) {
            return;
        }
        this.L = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z5) {
        this.F = z5;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        setCheckedState(z5 ? 1 : 0);
    }

    public void setCheckedState(int i7) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.O != i7) {
            this.O = i7;
            super.setChecked(i7 == 1);
            refreshDrawableState();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && this.R == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.Q) {
                return;
            }
            this.Q = true;
            LinkedHashSet linkedHashSet = this.f21669x;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw g.a(it);
                }
            }
            if (this.O != 2 && (onCheckedChangeListener = this.S) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i10 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.Q = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.H = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i7) {
        setErrorAccessibilityLabel(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setErrorShown(boolean z5) {
        if (this.G == z5) {
            return;
        }
        this.G = z5;
        refreshDrawableState();
        Iterator it = this.f21668w.iterator();
        if (it.hasNext()) {
            throw g.a(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.S = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.R = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z5) {
        this.E = z5;
        if (z5) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.t, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.I = drawable;
        this.K = false;
        a();
    }
}
