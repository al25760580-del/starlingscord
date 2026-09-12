package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends Spinner {
    public static final int[] F = {R.attr.spinnerMode};
    public final Rect E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatBackgroundHelper f1086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f1087e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h0 f1088i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SpinnerAdapter f1089v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f1090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q0 f1091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1092y;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public r0(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.discord.R.attr.spinnerStyle);
        this.E = new Rect();
        k3.a(this, getContext());
        int[] iArr = h.a.f10272v;
        e4.m mVarE = e4.m.E(context, attributeSet, iArr, com.discord.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) mVarE.f7994i;
        this.f1086d = new AppCompatBackgroundHelper(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f1087e = new ContextThemeWrapper(context, resourceId);
        } else {
            this.f1087e = context;
        }
        int i7 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F, com.discord.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i7 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i7 != 0) {
                        k0 k0Var = new k0(this);
                        this.f1091x = k0Var;
                        k0Var.f1009i = typedArray.getString(2);
                    } else if (i7 == 1) {
                        o0 o0Var = new o0(this, this.f1087e, attributeSet);
                        e4.m mVarE2 = e4.m.E(this.f1087e, attributeSet, iArr, com.discord.R.attr.spinnerStyle);
                        this.f1092y = ((TypedArray) mVarE2.f7994i).getLayoutDimension(3, -2);
                        o0Var.h(mVarE2.x(1));
                        o0Var.Z = typedArray.getString(2);
                        mVarE2.H();
                        this.f1091x = o0Var;
                        this.f1088i = new h0(this, this, o0Var);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.discord.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    mVarE.H();
                    this.f1090w = true;
                    spinnerAdapter = this.f1089v;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f1089v = null;
                    }
                    this.f1086d.d(attributeSet, com.discord.R.attr.spinnerStyle);
                }
            } catch (Throwable th2) {
                th = th2;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th3) {
            th = th3;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i7 != 0) {
            k0 k0Var2 = new k0(this);
            this.f1091x = k0Var2;
            k0Var2.f1009i = typedArray.getString(2);
        } else if (i7 == 1) {
            o0 o0Var2 = new o0(this, this.f1087e, attributeSet);
            e4.m mVarE3 = e4.m.E(this.f1087e, attributeSet, iArr, com.discord.R.attr.spinnerStyle);
            this.f1092y = ((TypedArray) mVarE3.f7994i).getLayoutDimension(3, -2);
            o0Var2.h(mVarE3.x(1));
            o0Var2.Z = typedArray.getString(2);
            mVarE3.H();
            this.f1091x = o0Var2;
            this.f1088i = new h0(this, this, o0Var2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.discord.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        mVarE.H();
        this.f1090w = true;
        spinnerAdapter = this.f1089v;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f1089v = null;
        }
        this.f1086d.d(attributeSet, com.discord.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.E;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1086d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        q0 q0Var = this.f1091x;
        return q0Var != null ? q0Var.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        q0 q0Var = this.f1091x;
        return q0Var != null ? q0Var.l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1091x != null ? this.f1092y : super.getDropDownWidth();
    }

    public final q0 getInternalPopup() {
        return this.f1091x;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        q0 q0Var = this.f1091x;
        return q0Var != null ? q0Var.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1087e;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        q0 q0Var = this.f1091x;
        return q0Var != null ? q0Var.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1086d;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1086d;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q0 q0Var = this.f1091x;
        if (q0Var == null || !q0Var.isShowing()) {
            return;
        }
        q0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f1091x == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.getSuperState());
        if (!p0Var.f1067d || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new i0(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        p0 p0Var = new p0(super.onSaveInstanceState());
        q0 q0Var = this.f1091x;
        p0Var.f1067d = q0Var != null && q0Var.isShowing();
        return p0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f1088i;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        q0 q0Var = this.f1091x;
        if (q0Var == null) {
            return super.performClick();
        }
        if (q0Var.isShowing()) {
            return true;
        }
        q0Var.k(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1086d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1086d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i7) {
        q0 q0Var = this.f1091x;
        if (q0Var == null) {
            super.setDropDownHorizontalOffset(i7);
        } else {
            q0Var.j(i7);
            q0Var.b(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i7) {
        q0 q0Var = this.f1091x;
        if (q0Var != null) {
            q0Var.i(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i7) {
        if (this.f1091x != null) {
            this.f1092y = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        q0 q0Var = this.f1091x;
        if (q0Var != null) {
            q0Var.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i7) {
        setPopupBackgroundDrawable(mf.f.u(getPopupContext(), i7));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        q0 q0Var = this.f1091x;
        if (q0Var != null) {
            q0Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1086d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1086d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1090w) {
            this.f1089v = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        q0 q0Var = this.f1091x;
        if (q0Var != null) {
            Context context = this.f1087e;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            l0 l0Var = new l0();
            l0Var.f1020d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                l0Var.f1021e = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                j0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            q0Var.n(l0Var);
        }
    }
}
