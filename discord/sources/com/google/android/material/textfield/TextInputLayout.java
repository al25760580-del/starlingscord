package com.google.android.material.textfield;

import a3.h;
import a5.i0;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.n1;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import bh.c;
import bh.d;
import bh.p;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kh.g;
import kh.i;
import kh.k;
import kh.l;
import kh.m;
import m3.f;
import mc.q;
import nh.e;
import nh.n;
import nh.r;
import nh.t;
import nh.v;
import nh.w;
import nh.x;
import nh.y;
import nh.z;
import oh.a;
import y0.b;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int[][] f6442a1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorDrawable A0;
    public int B0;
    public final LinkedHashSet C0;
    public ColorDrawable D0;
    public int E;
    public int E0;
    public int F;
    public Drawable F0;
    public int G;
    public ColorStateList G0;
    public final r H;
    public ColorStateList H0;
    public boolean I;
    public int I0;
    public int J;
    public int J0;
    public boolean K;
    public int K0;
    public y L;
    public ColorStateList L0;
    public AppCompatTextView M;
    public int M0;
    public int N;
    public int N0;
    public int O;
    public int O0;
    public CharSequence P;
    public int P0;
    public boolean Q;
    public int Q0;
    public AppCompatTextView R;
    public int R0;
    public ColorStateList S;
    public boolean S0;
    public int T;
    public final c T0;
    public f U;
    public boolean U0;
    public f V;
    public boolean V0;
    public ColorStateList W;
    public ValueAnimator W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public ColorStateList a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ColorStateList f6443b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ColorStateList f6444c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f6445d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f6446d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f6447e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public CharSequence f6448e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f6449f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public i f6450g0;
    public i h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f6451i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public StateListDrawable f6452i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f6453j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public i f6454k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public i f6455l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public m f6456m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f6457n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final int f6458o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f6459p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f6460q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f6461r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f6462s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f6463t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f6464u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6465v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f6466v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EditText f6467w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Rect f6468w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f6469x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Rect f6470x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6471y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final RectF f6472y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Typeface f6473z0;

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.discord.R.attr.textInputStyle, com.discord.R.style.Widget_Design_TextInputLayout), attributeSet, com.discord.R.attr.textInputStyle);
        this.f6471y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = new r(this);
        this.L = new q(13);
        this.f6468w0 = new Rect();
        this.f6470x0 = new Rect();
        this.f6472y0 = new RectF();
        this.C0 = new LinkedHashSet();
        c cVar = new c(this);
        this.T0 = cVar;
        this.Z0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f6445d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = lg.a.f15071a;
        cVar.R = linearInterpolator;
        cVar.j(false);
        cVar.Q = linearInterpolator;
        cVar.j(false);
        if (cVar.f3248g != 8388659) {
            cVar.f3248g = 8388659;
            cVar.j(false);
        }
        e4.m mVarG = p.g(context2, attributeSet, kg.a.M, com.discord.R.attr.textInputStyle, com.discord.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        v vVar = new v(this, mVarG);
        this.f6447e = vVar;
        TypedArray typedArray = (TypedArray) mVarG.f7994i;
        this.f6446d0 = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.V0 = typedArray.getBoolean(47, true);
        this.U0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f6456m0 = m.c(context2, attributeSet, com.discord.R.attr.textInputStyle, com.discord.R.style.Widget_Design_TextInputLayout).a();
        this.f6458o0 = context2.getResources().getDimensionPixelOffset(com.discord.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f6460q0 = typedArray.getDimensionPixelOffset(9, 0);
        this.f6465v = getResources().getDimensionPixelSize(com.discord.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f6462s0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.discord.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f6463t0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.discord.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f6461r0 = this.f6462s0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        l lVarG = this.f6456m0.g();
        if (dimension >= 0.0f) {
            lVarG.f14494e = new kh.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            lVarG.f14495f = new kh.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            lVarG.f14496g = new kh.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            lVarG.f14497h = new kh.a(dimension4);
        }
        this.f6456m0 = lVarG.a();
        ColorStateList colorStateListU = com.facebook.imagepipeline.nativecode.c.u(context2, mVarG, 7);
        if (colorStateListU != null) {
            int defaultColor = colorStateListU.getDefaultColor();
            this.M0 = defaultColor;
            this.f6466v0 = defaultColor;
            if (colorStateListU.isStateful()) {
                this.N0 = colorStateListU.getColorForState(new int[]{-16842910}, -1);
                this.O0 = colorStateListU.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.P0 = colorStateListU.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.O0 = this.M0;
                ColorStateList colorStateListC = b.c(context2, com.discord.R.color.mtrl_filled_background_color);
                this.N0 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                this.P0 = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f6466v0 = 0;
            this.M0 = 0;
            this.N0 = 0;
            this.O0 = 0;
            this.P0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListW = mVarG.w(1);
            this.H0 = colorStateListW;
            this.G0 = colorStateListW;
        }
        ColorStateList colorStateListU2 = com.facebook.imagepipeline.nativecode.c.u(context2, mVarG, 14);
        this.K0 = typedArray.getColor(14, 0);
        this.I0 = context2.getColor(com.discord.R.color.mtrl_textinput_default_box_stroke_color);
        this.Q0 = context2.getColor(com.discord.R.color.mtrl_textinput_disabled_color);
        this.J0 = context2.getColor(com.discord.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListU2 != null) {
            setBoxStrokeColorStateList(colorStateListU2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(com.facebook.imagepipeline.nativecode.c.u(context2, mVarG, 15));
        }
        if (typedArray.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(50, 0));
        }
        this.f6443b0 = mVarG.w(24);
        this.f6444c0 = mVarG.w(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i7 = typedArray.getInt(34, 1);
        boolean z5 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z6 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(58, 0);
        CharSequence text3 = typedArray.getText(57);
        boolean z7 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.O = typedArray.getResourceId(22, 0);
        this.N = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i7);
        setCounterOverflowTextAppearance(this.N);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.O);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(mVarG.w(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(mVarG.w(46));
        }
        if (typedArray.hasValue(51)) {
            setHintTextColor(mVarG.w(51));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(mVarG.w(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(mVarG.w(21));
        }
        if (typedArray.hasValue(59)) {
            setPlaceholderTextColor(mVarG.w(59));
        }
        n nVar = new n(this, mVarG);
        this.f6451i = nVar;
        boolean z10 = typedArray.getBoolean(0, true);
        setHintMaxLines(typedArray.getInt(49, 1));
        mVarG.H();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(vVar);
        frameLayout.addView(nVar);
        addView(frameLayout);
        setEnabled(z10);
        setHelperTextEnabled(z6);
        setErrorEnabled(z5);
        setCounterEnabled(z7);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f6467w;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f6450g0;
        }
        int iW = io.sentry.config.a.w(com.discord.R.attr.colorControlHighlight, this.f6467w);
        int i7 = this.f6459p0;
        int[][] iArr = f6442a1;
        if (i7 != 2) {
            if (i7 != 1) {
                return null;
            }
            i iVar = this.f6450g0;
            int i10 = this.f6466v0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{io.sentry.config.a.N(iW, i10, 0.1f), i10}), iVar, iVar);
        }
        Context context = getContext();
        i iVar2 = this.f6450g0;
        TypedValue typedValueX = com.facebook.imagepipeline.nativecode.b.x(context, "TextInputLayout", com.discord.R.attr.colorSurface);
        int i11 = typedValueX.resourceId;
        int color = i11 != 0 ? context.getColor(i11) : typedValueX.data;
        i iVar3 = new i(iVar2.f14483e.f14463a);
        int iN = io.sentry.config.a.N(iW, color, 0.1f);
        iVar3.q(new ColorStateList(iArr, new int[]{iN, 0}));
        iVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iN, color});
        i iVar4 = new i(iVar2.f14483e.f14463a);
        iVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, iVar3, iVar4), iVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f6452i0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f6452i0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f6452i0.addState(new int[0], h(false));
        }
        return this.f6452i0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.h0 == null) {
            this.h0 = h(true);
        }
        return this.h0;
    }

    public static void m(ViewGroup viewGroup, boolean z5) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            childAt.setEnabled(z5);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z5);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f6467w != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f6467w = editText;
        int i7 = this.f6471y;
        if (i7 != -1) {
            setMinEms(i7);
        } else {
            setMinWidth(this.F);
        }
        int i10 = this.E;
        if (i10 != -1) {
            setMaxEms(i10);
        } else {
            setMaxWidth(this.G);
        }
        this.f6453j0 = false;
        k();
        setTextInputAccessibilityDelegate(new x(this));
        Typeface typeface = this.f6467w.getTypeface();
        c cVar = this.T0;
        cVar.n(typeface);
        float textSize = this.f6467w.getTextSize();
        if (cVar.f3250h != textSize) {
            cVar.f3250h = textSize;
            cVar.j(false);
        }
        float letterSpacing = this.f6467w.getLetterSpacing();
        if (cVar.X != letterSpacing) {
            cVar.X = letterSpacing;
            cVar.j(false);
        }
        int gravity = this.f6467w.getGravity();
        int i11 = (gravity & (-113)) | 48;
        if (cVar.f3248g != i11) {
            cVar.f3248g = i11;
            cVar.j(false);
        }
        if (cVar.f3246f != gravity) {
            cVar.f3246f = gravity;
            cVar.j(false);
        }
        this.R0 = editText.getMinimumHeight();
        this.f6467w.addTextChangedListener(new w(this, editText));
        if (this.G0 == null) {
            this.G0 = this.f6467w.getHintTextColors();
        }
        if (this.f6446d0) {
            if (TextUtils.isEmpty(this.f6448e0)) {
                CharSequence hint = this.f6467w.getHint();
                this.f6469x = hint;
                setHint(hint);
                this.f6467w.setHint((CharSequence) null);
            }
            this.f6449f0 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.M != null) {
            p(this.f6467w.getText());
        }
        t();
        this.H.b();
        this.f6447e.bringToFront();
        n nVar = this.f6451i;
        nVar.bringToFront();
        Iterator it = this.C0.iterator();
        while (it.hasNext()) {
            ((nh.m) it.next()).a(this);
        }
        nVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f6448e0)) {
            return;
        }
        this.f6448e0 = charSequence;
        c cVar = this.T0;
        if (charSequence == null || !TextUtils.equals(cVar.B, charSequence)) {
            cVar.B = charSequence;
            cVar.C = null;
            cVar.j(false);
        }
        if (this.S0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z5) {
        if (this.Q == z5) {
            return;
        }
        if (z5) {
            AppCompatTextView appCompatTextView = this.R;
            if (appCompatTextView != null) {
                this.f6445d.addView(appCompatTextView);
                this.R.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.R;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.R = null;
        }
        this.Q = z5;
    }

    public final void a() {
        if (this.f6467w == null || this.f6459p0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f6467w;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.T0.f() + this.f6465v), this.f6467w.getPaddingEnd(), getResources().getDimensionPixelSize(com.discord.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f6467w;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.discord.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f6467w.getPaddingEnd(), getResources().getDimensionPixelSize(com.discord.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (com.facebook.imagepipeline.nativecode.c.A(getContext())) {
            EditText editText3 = this.f6467w;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.discord.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f6467w.getPaddingEnd(), getResources().getDimensionPixelSize(com.discord.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i7, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f6445d;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f2) {
        c cVar = this.T0;
        if (cVar.f3238b == f2) {
            return;
        }
        int i7 = 1;
        if (this.W0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.W0 = valueAnimator;
            valueAnimator.setInterpolator(io.sentry.config.a.T(getContext(), com.discord.R.attr.motionEasingEmphasizedInterpolator, lg.a.f15072b));
            this.W0.setDuration(io.sentry.config.a.S(getContext(), com.discord.R.attr.motionDurationMedium4, 167));
            this.W0.addUpdateListener(new bh.m(i7, this));
        }
        this.W0.setFloatValues(cVar.f3238b, f2);
        this.W0.start();
    }

    public final void c() {
        int i7;
        int i10;
        i iVar = this.f6450g0;
        if (iVar == null) {
            return;
        }
        m mVar = iVar.f14483e.f14463a;
        m mVar2 = this.f6456m0;
        if (mVar != mVar2) {
            iVar.setShapeAppearanceModel(mVar2);
        }
        if (this.f6459p0 == 2 && (i7 = this.f6461r0) > -1 && (i10 = this.f6464u0) != 0) {
            i iVar2 = this.f6450g0;
            iVar2.f14483e.k = i7;
            iVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
            g gVar = iVar2.f14483e;
            if (gVar.f14467e != colorStateListValueOf) {
                gVar.f14467e = colorStateListValueOf;
                iVar2.onStateChange(iVar2.getState());
            }
        }
        int iC = this.f6466v0;
        if (this.f6459p0 == 1) {
            iC = b1.c.c(this.f6466v0, io.sentry.config.a.x(getContext(), com.discord.R.attr.colorSurface, 0));
        }
        this.f6466v0 = iC;
        this.f6450g0.q(ColorStateList.valueOf(iC));
        i iVar3 = this.f6454k0;
        if (iVar3 != null && this.f6455l0 != null) {
            if (this.f6461r0 > -1 && this.f6464u0 != 0) {
                iVar3.q(this.f6467w.isFocused() ? ColorStateList.valueOf(this.I0) : ColorStateList.valueOf(this.f6464u0));
                this.f6455l0.q(ColorStateList.valueOf(this.f6464u0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f6467w == null) {
            throw new IllegalStateException();
        }
        boolean z5 = getLayoutDirection() == 1;
        int i7 = rect.bottom;
        Rect rect2 = this.f6470x0;
        rect2.bottom = i7;
        int i10 = this.f6459p0;
        if (i10 == 1) {
            rect2.left = i(rect.left, z5);
            rect2.top = rect.top + this.f6460q0;
            rect2.right = j(rect.right, z5);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = i(rect.left, z5);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z5);
            return rect2;
        }
        rect2.left = this.f6467w.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f6467w.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i7) {
        EditText editText = this.f6467w;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i7);
            return;
        }
        if (this.f6469x != null) {
            boolean z5 = this.f6449f0;
            this.f6449f0 = false;
            CharSequence hint = editText.getHint();
            this.f6467w.setHint(this.f6469x);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i7);
                return;
            } finally {
                this.f6467w.setHint(hint);
                this.f6449f0 = z5;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i7);
        onProvideAutofillVirtualStructure(viewStructure, i7);
        FrameLayout frameLayout = this.f6445d;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i7);
            if (childAt == this.f6467w) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.Y0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Y0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        i iVar;
        super.draw(canvas);
        boolean z5 = this.f6446d0;
        c cVar = this.T0;
        if (z5) {
            TextPaint textPaint = cVar.O;
            RectF rectF = cVar.f3244e;
            int iSave = canvas.save();
            if (cVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(cVar.G);
                float f2 = cVar.f3260q;
                float f7 = cVar.f3261r;
                float f10 = cVar.F;
                if (f10 != 1.0f) {
                    canvas.scale(f10, f10, f2, f7);
                }
                if ((cVar.f3245e0 > 1 || cVar.f3247f0 > 1) && !cVar.D && cVar.o()) {
                    float lineStart = cVar.f3260q - cVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f7);
                    float f11 = alpha;
                    textPaint.setAlpha((int) (cVar.f3241c0 * f11));
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, io.sentry.config.a.j(cVar.K, textPaint.getAlpha()));
                    }
                    cVar.Z.draw(canvas);
                    textPaint.setAlpha((int) (cVar.f3239b0 * f11));
                    if (i7 >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, io.sentry.config.a.j(cVar.K, textPaint.getAlpha()));
                    }
                    int lineBaseline = cVar.Z.getLineBaseline(0);
                    CharSequence charSequence = cVar.f3243d0;
                    float f12 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                    if (i7 >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                    }
                    String strTrim = cVar.f3243d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(cVar.Z.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                    canvas = canvas;
                } else {
                    canvas.translate(f2, f7);
                    cVar.Z.draw(canvas);
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f6455l0 == null || (iVar = this.f6454k0) == null) {
            return;
        }
        iVar.draw(canvas);
        if (this.f6467w.isFocused()) {
            Rect bounds = this.f6455l0.getBounds();
            Rect bounds2 = this.f6454k0.getBounds();
            float f13 = cVar.f3238b;
            int iCenterX = bounds2.centerX();
            bounds.left = lg.a.c(iCenterX, bounds2.left, f13);
            bounds.right = lg.a.c(iCenterX, bounds2.right, f13);
            this.f6455l0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z5;
        ColorStateList colorStateList;
        if (this.X0) {
            return;
        }
        this.X0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        c cVar = this.T0;
        if (cVar != null) {
            cVar.M = drawableState;
            ColorStateList colorStateList2 = cVar.k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = cVar.j) == null || !colorStateList.isStateful())) {
                z5 = false;
            } else {
                cVar.j(false);
                z5 = true;
            }
        } else {
            z5 = false;
        }
        if (this.f6467w != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (z5) {
            invalidate();
        }
        this.X0 = false;
    }

    public final int e() {
        if (this.f6446d0) {
            int i7 = this.f6459p0;
            c cVar = this.T0;
            if (i7 == 0) {
                return (int) cVar.f();
            }
            if (i7 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (cVar.f() / 2.0f);
                }
                float f2 = cVar.f();
                TextPaint textPaint = cVar.P;
                textPaint.setTextSize(cVar.f3251i);
                textPaint.setTypeface(cVar.f3262s);
                textPaint.setLetterSpacing(cVar.W);
                return Math.max(0, (int) (f2 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final f f() {
        f fVar = new f();
        fVar.f2785i = io.sentry.config.a.S(getContext(), com.discord.R.attr.motionDurationShort2, 87);
        fVar.f2786v = io.sentry.config.a.T(getContext(), com.discord.R.attr.motionEasingLinearInterpolator, lg.a.f15071a);
        return fVar;
    }

    public final boolean g() {
        return this.f6446d0 && !TextUtils.isEmpty(this.f6448e0) && (this.f6450g0 instanceof nh.g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f6467w;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public i getBoxBackground() {
        int i7 = this.f6459p0;
        if (i7 == 1 || i7 == 2) {
            return this.f6450g0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f6466v0;
    }

    public int getBoxBackgroundMode() {
        return this.f6459p0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f6460q0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f6472y0;
        return layoutDirection == 1 ? this.f6456m0.f14507h.a(rectF) : this.f6456m0.f14506g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f6472y0;
        return layoutDirection == 1 ? this.f6456m0.f14506g.a(rectF) : this.f6456m0.f14507h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f6472y0;
        return layoutDirection == 1 ? this.f6456m0.f14504e.a(rectF) : this.f6456m0.f14505f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f6472y0;
        return layoutDirection == 1 ? this.f6456m0.f14505f.a(rectF) : this.f6456m0.f14504e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.K0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.L0;
    }

    public int getBoxStrokeWidth() {
        return this.f6462s0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f6463t0;
    }

    public int getCounterMaxLength() {
        return this.J;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.I && this.K && (appCompatTextView = this.M) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.a0;
    }

    public ColorStateList getCounterTextColor() {
        return this.W;
    }

    public ColorStateList getCursorColor() {
        return this.f6443b0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f6444c0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.G0;
    }

    public EditText getEditText() {
        return this.f6467w;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f6451i.f16868y.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f6451i.f16868y.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f6451i.J;
    }

    public int getEndIconMode() {
        return this.f6451i.F;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f6451i.K;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f6451i.f16868y;
    }

    public CharSequence getError() {
        r rVar = this.H;
        if (rVar.f16893q) {
            return rVar.f16892p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.H.f16896t;
    }

    public CharSequence getErrorContentDescription() {
        return this.H.f16895s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.H.f16894r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f6451i.f16864i.getDrawable();
    }

    public CharSequence getHelperText() {
        r rVar = this.H;
        if (rVar.f16900x) {
            return rVar.f16899w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.H.f16901y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f6446d0) {
            return this.f6448e0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.T0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        c cVar = this.T0;
        return cVar.g(cVar.k);
    }

    public int getHintMaxLines() {
        return this.T0.f3245e0;
    }

    public ColorStateList getHintTextColor() {
        return this.H0;
    }

    @NonNull
    public y getLengthCounter() {
        return this.L;
    }

    public int getMaxEms() {
        return this.E;
    }

    public int getMaxWidth() {
        return this.G;
    }

    public int getMinEms() {
        return this.f6471y;
    }

    public int getMinWidth() {
        return this.F;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f6451i.f16868y.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f6451i.f16868y.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.Q) {
            return this.P;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.T;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.S;
    }

    public CharSequence getPrefixText() {
        return this.f6447e.f16914i;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f6447e.f16913e.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f6447e.f16913e;
    }

    @NonNull
    public m getShapeAppearanceModel() {
        return this.f6456m0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f6447e.f16915v.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f6447e.f16915v.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f6447e.f16918y;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f6447e.E;
    }

    public CharSequence getSuffixText() {
        return this.f6451i.M;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f6451i.N.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f6451i.N;
    }

    public Typeface getTypeface() {
        return this.f6473z0;
    }

    public final i h(boolean z5) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.discord.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z5 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f6467w;
        float popupElevation = editText instanceof t ? ((t) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.discord.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.discord.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        k kVar = new k();
        k kVar2 = new k();
        k kVar3 = new k();
        k kVar4 = new k();
        int i7 = 0;
        kh.f fVar = new kh.f(i7);
        kh.f fVar2 = new kh.f(i7);
        kh.f fVar3 = new kh.f(i7);
        kh.f fVar4 = new kh.f(i7);
        kh.a aVar = new kh.a(f2);
        kh.a aVar2 = new kh.a(f2);
        kh.a aVar3 = new kh.a(dimensionPixelOffset);
        kh.a aVar4 = new kh.a(dimensionPixelOffset);
        m mVar = new m();
        mVar.f14500a = kVar;
        mVar.f14501b = kVar2;
        mVar.f14502c = kVar3;
        mVar.f14503d = kVar4;
        mVar.f14504e = aVar;
        mVar.f14505f = aVar2;
        mVar.f14506g = aVar4;
        mVar.f14507h = aVar3;
        mVar.f14508i = fVar;
        mVar.j = fVar2;
        mVar.k = fVar3;
        mVar.f14509l = fVar4;
        EditText editText2 = this.f6467w;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof t ? ((t) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = i.f14479c0;
            TypedValue typedValueX = com.facebook.imagepipeline.nativecode.b.x(context, i.class.getSimpleName(), com.discord.R.attr.colorSurface);
            int i10 = typedValueX.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i10 != 0 ? context.getColor(i10) : typedValueX.data);
        }
        i iVar = new i();
        iVar.m(context);
        iVar.q(dropDownBackgroundTintList);
        iVar.p(popupElevation);
        iVar.setShapeAppearanceModel(mVar);
        g gVar = iVar.f14483e;
        if (gVar.f14470h == null) {
            gVar.f14470h = new Rect();
        }
        iVar.f14483e.f14470h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        iVar.invalidateSelf();
        return iVar;
    }

    public final int i(int i7, boolean z5) {
        int compoundPaddingLeft;
        if (z5 || getPrefixText() == null) {
            compoundPaddingLeft = (!z5 || getSuffixText() == null) ? this.f6467w.getCompoundPaddingLeft() : this.f6451i.c();
        } else {
            compoundPaddingLeft = this.f6447e.a();
        }
        return compoundPaddingLeft + i7;
    }

    public final int j(int i7, boolean z5) {
        int compoundPaddingRight;
        if (z5 || getSuffixText() == null) {
            compoundPaddingRight = (!z5 || getPrefixText() == null) ? this.f6467w.getCompoundPaddingRight() : this.f6447e.a();
        } else {
            compoundPaddingRight = this.f6451i.c();
        }
        return i7 - compoundPaddingRight;
    }

    public final void k() {
        int i7 = this.f6459p0;
        if (i7 == 0) {
            this.f6450g0 = null;
            this.f6454k0 = null;
            this.f6455l0 = null;
        } else if (i7 == 1) {
            this.f6450g0 = new i(this.f6456m0);
            this.f6454k0 = new i();
            this.f6455l0 = new i();
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException(kk.b.l(new StringBuilder(), this.f6459p0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f6446d0 || (this.f6450g0 instanceof nh.g)) {
                this.f6450g0 = new i(this.f6456m0);
            } else {
                m mVar = this.f6456m0;
                int i10 = nh.g.f16843f0;
                if (mVar == null) {
                    mVar = new m();
                }
                e eVar = new e(mVar, new RectF());
                nh.f fVar = new nh.f(eVar);
                fVar.f16844e0 = eVar;
                this.f6450g0 = fVar;
            }
            this.f6454k0 = null;
            this.f6455l0 = null;
        }
        u();
        z();
        if (this.f6459p0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f6460q0 = getResources().getDimensionPixelSize(com.discord.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (com.facebook.imagepipeline.nativecode.c.A(getContext())) {
                this.f6460q0 = getResources().getDimensionPixelSize(com.discord.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.f6459p0 != 0) {
            v();
        }
        EditText editText = this.f6467w;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.f6459p0;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    public final void l() {
        float f2;
        float f7;
        float f10;
        RectF rectF;
        float f11;
        float lineWidth;
        int i7;
        float f12;
        int i10;
        if (g()) {
            int width = this.f6467w.getWidth();
            int gravity = this.f6467w.getGravity();
            c cVar = this.T0;
            boolean zC = cVar.c(cVar.B);
            cVar.D = zC;
            Rect rect = cVar.f3242d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i10 = rect.left;
                        f10 = i10;
                    } else {
                        f2 = rect.right;
                        f7 = cVar.a0;
                    }
                } else if (zC) {
                    f2 = rect.right;
                    f7 = cVar.a0;
                } else {
                    i10 = rect.left;
                    f10 = i10;
                }
                float fMax = Math.max(f10, rect.left);
                rectF = this.f6472y0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f11 = (width / 2.0f) + (cVar.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (cVar.D) {
                        f12 = cVar.a0;
                        f11 = f12 + fMax;
                    } else {
                        i7 = rect.right;
                        f11 = i7;
                    }
                } else if (cVar.D) {
                    i7 = rect.right;
                    f11 = i7;
                } else {
                    f12 = cVar.a0;
                    f11 = f12 + fMax;
                }
                rectF.right = Math.min(f11, rect.right);
                rectF.bottom = cVar.f() + rect.top;
                if (cVar.Z != null && !cVar.o()) {
                    StaticLayout staticLayout = cVar.Z;
                    lineWidth = (cVar.f3251i / cVar.f3250h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (cVar.D) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f13 = rectF.left;
                float f14 = this.f6458o0;
                rectF.left = f13 - f14;
                rectF.right += f14;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f6461r0);
                rectF.top = 0.0f;
                nh.g gVar = (nh.g) this.f6450g0;
                gVar.getClass();
                gVar.y(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f7 = cVar.a0 / 2.0f;
            f10 = f2 - f7;
            float fMax2 = Math.max(f10, rect.left);
            rectF = this.f6472y0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f11 = (width / 2.0f) + (cVar.a0 / 2.0f);
            } else {
                f11 = (width / 2.0f) + (cVar.a0 / 2.0f);
            }
            rectF.right = Math.min(f11, rect.right);
            rectF.bottom = cVar.f() + rect.top;
            if (cVar.Z != null) {
                StaticLayout staticLayout2 = cVar.Z;
                lineWidth = (cVar.f3251i / cVar.f3250h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (cVar.D) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(AppCompatTextView appCompatTextView, int i7) {
        try {
            appCompatTextView.setTextAppearance(i7);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.discord.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(com.discord.R.color.design_error));
    }

    public final boolean o() {
        r rVar = this.H;
        return (rVar.f16891o != 1 || rVar.f16894r == null || TextUtils.isEmpty(rVar.f16892p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.T0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        n nVar = this.f6451i;
        nVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z5 = false;
        this.Z0 = false;
        if (this.f6467w != null && this.f6467w.getMeasuredHeight() < (iMax = Math.max(nVar.getMeasuredHeight(), this.f6447e.getMeasuredHeight()))) {
            this.f6467w.setMinimumHeight(iMax);
            z5 = true;
        }
        boolean zS = s();
        if (z5 || zS) {
            this.f6467w.post(new io.sentry.android.core.p(27, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        float fDescent;
        int i13;
        int compoundPaddingTop;
        super.onLayout(z5, i7, i10, i11, i12);
        EditText editText = this.f6467w;
        if (editText != null) {
            Rect rect = this.f6468w0;
            d.a(this, editText, rect);
            i iVar = this.f6454k0;
            if (iVar != null) {
                int i14 = rect.bottom;
                iVar.setBounds(rect.left, i14 - this.f6462s0, rect.right, i14);
            }
            i iVar2 = this.f6455l0;
            if (iVar2 != null) {
                int i15 = rect.bottom;
                iVar2.setBounds(rect.left, i15 - this.f6463t0, rect.right, i15);
            }
            if (this.f6446d0) {
                float textSize = this.f6467w.getTextSize();
                c cVar = this.T0;
                float f2 = cVar.f3250h;
                TextPaint textPaint = cVar.P;
                if (f2 != textSize) {
                    cVar.f3250h = textSize;
                    cVar.j(false);
                }
                int gravity = this.f6467w.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (cVar.f3248g != i16) {
                    cVar.f3248g = i16;
                    cVar.j(false);
                }
                if (cVar.f3246f != gravity) {
                    cVar.f3246f = gravity;
                    cVar.j(false);
                }
                Rect rectD = d(rect);
                int i17 = rectD.left;
                int i18 = rectD.top;
                int i19 = rectD.right;
                int i20 = rectD.bottom;
                Rect rect2 = cVar.f3242d;
                if (rect2.left != i17 || rect2.top != i18 || rect2.right != i19 || rect2.bottom != i20) {
                    rect2.set(i17, i18, i19, i20);
                    cVar.N = true;
                }
                if (this.f6467w == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(cVar.f3250h);
                    textPaint.setTypeface(cVar.f3265v);
                    textPaint.setLetterSpacing(cVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(cVar.f3250h);
                    textPaint.setTypeface(cVar.f3265v);
                    textPaint.setLetterSpacing(cVar.X);
                    fDescent = cVar.f3255l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f6467w.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f6470x0;
                rect3.left = compoundPaddingLeft;
                if (this.f6459p0 != 1 || this.f6467w.getMinLines() > 1) {
                    if (this.f6459p0 != 0 || getHintMaxLines() == 1) {
                        i13 = 0;
                    } else {
                        textPaint.setTextSize(cVar.f3250h);
                        textPaint.setTypeface(cVar.f3265v);
                        textPaint.setLetterSpacing(cVar.X);
                        i13 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f6467w.getCompoundPaddingTop() + rect.top) - i13;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f6467w.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f6459p0 != 1 || this.f6467w.getMinLines() > 1) ? rect.bottom - this.f6467w.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i21 = rect3.left;
                int i22 = rect3.top;
                int i23 = rect3.right;
                Rect rect4 = cVar.f3240c;
                if (rect4.left != i21 || rect4.top != i22 || rect4.right != i23 || rect4.bottom != compoundPaddingBottom || true != cVar.f3254k0) {
                    rect4.set(i21, i22, i23, compoundPaddingBottom);
                    cVar.N = true;
                    cVar.f3254k0 = true;
                }
                cVar.j(false);
                if (!g() || this.S0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float f2;
        EditText editText;
        super.onMeasure(i7, i10);
        boolean z5 = this.Z0;
        n nVar = this.f6451i;
        if (!z5) {
            nVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.Z0 = true;
        }
        if (this.R != null && (editText = this.f6467w) != null) {
            this.R.setGravity(editText.getGravity());
            this.R.setPadding(this.f6467w.getCompoundPaddingLeft(), this.f6467w.getCompoundPaddingTop(), this.f6467w.getCompoundPaddingRight(), this.f6467w.getCompoundPaddingBottom());
        }
        nVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f6467w.getMeasuredWidth() - this.f6467w.getCompoundPaddingLeft()) - this.f6467w.getCompoundPaddingRight();
        c cVar = this.T0;
        TextPaint textPaint = cVar.P;
        textPaint.setTextSize(cVar.f3251i);
        textPaint.setTypeface(cVar.f3262s);
        textPaint.setLetterSpacing(cVar.W);
        float f7 = measuredWidth;
        cVar.f3252i0 = cVar.e(cVar.f3247f0, textPaint, cVar.B, (cVar.f3251i / cVar.f3250h) * f7, cVar.D).getHeight();
        textPaint.setTextSize(cVar.f3250h);
        textPaint.setTypeface(cVar.f3265v);
        textPaint.setLetterSpacing(cVar.X);
        cVar.f3253j0 = cVar.e(cVar.f3245e0, textPaint, cVar.B, f7, cVar.D).getHeight();
        EditText editText2 = this.f6467w;
        Rect rect = this.f6468w0;
        d.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i11 = rectD.left;
        int i12 = rectD.top;
        int i13 = rectD.right;
        int i14 = rectD.bottom;
        Rect rect2 = cVar.f3242d;
        if (rect2.left != i11 || rect2.top != i12 || rect2.right != i13 || rect2.bottom != i14) {
            rect2.set(i11, i12, i13, i14);
            cVar.N = true;
        }
        v();
        a();
        if (this.f6467w == null) {
            return;
        }
        int i15 = cVar.f3253j0;
        if (i15 != -1) {
            f2 = i15;
        } else {
            TextPaint textPaint2 = cVar.P;
            textPaint2.setTextSize(cVar.f3250h);
            textPaint2.setTypeface(cVar.f3265v);
            textPaint2.setLetterSpacing(cVar.X);
            f2 = -textPaint2.ascent();
        }
        float f10 = 0.0f;
        if (this.P != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.R.getPaint());
            textPaint3.setTextSize(this.R.getTextSize());
            textPaint3.setTypeface(this.R.getTypeface());
            textPaint3.setLetterSpacing(this.R.getLetterSpacing());
            bh.i iVar = new bh.i(this.P, textPaint3, measuredWidth);
            iVar.k = getLayoutDirection() == 1;
            iVar.j = true;
            float lineSpacingExtra = this.R.getLineSpacingExtra();
            float lineSpacingMultiplier = this.R.getLineSpacingMultiplier();
            iVar.f3278g = lineSpacingExtra;
            iVar.f3279h = lineSpacingMultiplier;
            iVar.f3282m = new mi.a(1, this);
            f10 = (this.f6459p0 == 1 ? cVar.f() + this.f6460q0 + this.f6465v : 0.0f) + iVar.a().getHeight();
        }
        float fMax = Math.max(f2, f10);
        if (this.f6467w.getMeasuredHeight() < fMax) {
            this.f6467w.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        super.onRestoreInstanceState(zVar.f7578d);
        setError(zVar.f16923i);
        if (zVar.f16924v) {
            post(new h(28, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        boolean z5 = i7 == 1;
        if (z5 != this.f6457n0) {
            kh.d dVar = this.f6456m0.f14504e;
            RectF rectF = this.f6472y0;
            float fA = dVar.a(rectF);
            float fA2 = this.f6456m0.f14505f.a(rectF);
            float fA3 = this.f6456m0.f14507h.a(rectF);
            float fA4 = this.f6456m0.f14506g.a(rectF);
            m mVar = this.f6456m0;
            com.facebook.imagepipeline.nativecode.b bVar = mVar.f14500a;
            com.facebook.imagepipeline.nativecode.b bVar2 = mVar.f14501b;
            com.facebook.imagepipeline.nativecode.b bVar3 = mVar.f14503d;
            com.facebook.imagepipeline.nativecode.b bVar4 = mVar.f14502c;
            kh.f fVar = new kh.f(0);
            kh.f fVar2 = new kh.f(0);
            kh.f fVar3 = new kh.f(0);
            kh.f fVar4 = new kh.f(0);
            kh.a aVar = new kh.a(fA2);
            kh.a aVar2 = new kh.a(fA);
            kh.a aVar3 = new kh.a(fA4);
            kh.a aVar4 = new kh.a(fA3);
            m mVar2 = new m();
            mVar2.f14500a = bVar2;
            mVar2.f14501b = bVar;
            mVar2.f14502c = bVar3;
            mVar2.f14503d = bVar4;
            mVar2.f14504e = aVar;
            mVar2.f14505f = aVar2;
            mVar2.f14506g = aVar4;
            mVar2.f14507h = aVar3;
            mVar2.f14508i = fVar;
            mVar2.j = fVar2;
            mVar2.k = fVar3;
            mVar2.f14509l = fVar4;
            this.f6457n0 = z5;
            setShapeAppearanceModel(mVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        if (o()) {
            zVar.f16923i = getError();
        }
        n nVar = this.f6451i;
        zVar.f16924v = nVar.F != 0 && nVar.f16868y.f6404v;
        return zVar;
    }

    public final void p(Editable editable) {
        ((q) this.L).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z5 = this.K;
        int i7 = this.J;
        if (i7 == -1) {
            this.M.setText(String.valueOf(length));
            this.M.setContentDescription(null);
            this.K = false;
        } else {
            this.K = length > i7;
            Context context = getContext();
            this.M.setContentDescription(context.getString(this.K ? com.discord.R.string.character_counter_overflowed_content_description : com.discord.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.J)));
            if (z5 != this.K) {
                q();
            }
            j1.b bVarC = j1.b.c();
            AppCompatTextView appCompatTextView = this.M;
            String string = getContext().getString(com.discord.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.J));
            bVarC.getClass();
            i0 i0Var = j1.d.f13608a;
            appCompatTextView.setText(string != null ? bVarC.d(string).toString() : null);
        }
        if (this.f6467w == null || z5 == this.K) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.M;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.K ? this.N : this.O);
            if (!this.K && (colorStateList2 = this.W) != null) {
                this.M.setTextColor(colorStateList2);
            }
            if (!this.K || (colorStateList = this.a0) == null) {
                return;
            }
            this.M.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f6443b0;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueT = com.facebook.imagepipeline.nativecode.b.t(context, com.discord.R.attr.colorControlActivated);
            if (typedValueT != null) {
                int i7 = typedValueT.resourceId;
                if (i7 != 0) {
                    colorStateListValueOf = b.c(context, i7);
                } else {
                    int i10 = typedValueT.data;
                    if (i10 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i10);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f6467w;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f6467w.getTextCursorDrawable().mutate();
        if ((o() || (this.M != null && this.K)) && (colorStateList = this.f6444c0) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean s() {
        boolean z5;
        if (this.f6467w == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z6 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            v vVar = this.f6447e;
            if (vVar.getMeasuredWidth() > 0) {
                int measuredWidth = vVar.getMeasuredWidth() - this.f6467w.getPaddingLeft();
                if (this.A0 == null || this.B0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.A0 = colorDrawable;
                    this.B0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f6467w.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.A0;
                if (drawable != colorDrawable2) {
                    this.f6467w.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else if (this.A0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f6467w.getCompoundDrawablesRelative();
                this.f6467w.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.A0 = null;
                z5 = true;
            } else {
                z5 = false;
            }
        } else if (this.A0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f6467w.getCompoundDrawablesRelative();
            this.f6467w.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.A0 = null;
            z5 = true;
        } else {
            z5 = false;
        }
        n nVar = this.f6451i;
        if ((nVar.e() || ((nVar.F != 0 && nVar.d()) || nVar.M != null)) && nVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = nVar.N.getMeasuredWidth() - this.f6467w.getPaddingRight();
            if (nVar.e()) {
                checkableImageButton = nVar.f16864i;
            } else if (nVar.F != 0 && nVar.d()) {
                checkableImageButton = nVar.f16868y;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f6467w.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.D0;
            if (colorDrawable3 != null && this.E0 != measuredWidth2) {
                this.E0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f6467w.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.D0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.D0 = colorDrawable4;
                this.E0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.D0;
            if (drawable2 != colorDrawable5) {
                this.F0 = drawable2;
                this.f6467w.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.D0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.f6467w.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.D0) {
                this.f6467w.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.F0, compoundDrawablesRelative5[3]);
            } else {
                z6 = z5;
            }
            this.D0 = null;
            return z6;
        }
        return z5;
    }

    public void setBoxBackgroundColor(int i7) {
        if (this.f6466v0 != i7) {
            this.f6466v0 = i7;
            this.M0 = i7;
            this.O0 = i7;
            this.P0 = i7;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i7) {
        setBoxBackgroundColor(getContext().getColor(i7));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.M0 = defaultColor;
        this.f6466v0 = defaultColor;
        this.N0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.O0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.P0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i7) {
        if (i7 == this.f6459p0) {
            return;
        }
        this.f6459p0 = i7;
        if (this.f6467w != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i7) {
        this.f6460q0 = i7;
    }

    public void setBoxCornerFamily(int i7) {
        l lVarG = this.f6456m0.g();
        kh.d dVar = this.f6456m0.f14504e;
        lVarG.f14490a = com.facebook.imagepipeline.nativecode.c.o(i7);
        lVarG.f14494e = dVar;
        kh.d dVar2 = this.f6456m0.f14505f;
        lVarG.f14491b = com.facebook.imagepipeline.nativecode.c.o(i7);
        lVarG.f14495f = dVar2;
        kh.d dVar3 = this.f6456m0.f14507h;
        lVarG.f14493d = com.facebook.imagepipeline.nativecode.c.o(i7);
        lVarG.f14497h = dVar3;
        kh.d dVar4 = this.f6456m0.f14506g;
        lVarG.f14492c = com.facebook.imagepipeline.nativecode.c.o(i7);
        lVarG.f14496g = dVar4;
        this.f6456m0 = lVarG.a();
        c();
    }

    public void setBoxStrokeColor(int i7) {
        if (this.K0 != i7) {
            this.K0 = i7;
            z();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.I0 = colorStateList.getDefaultColor();
            this.Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.J0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.K0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.K0 != colorStateList.getDefaultColor()) {
            this.K0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i7) {
        this.f6462s0 = i7;
        z();
    }

    public void setBoxStrokeWidthFocused(int i7) {
        this.f6463t0 = i7;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i7) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i7));
    }

    public void setBoxStrokeWidthResource(int i7) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i7));
    }

    public void setCounterEnabled(boolean z5) {
        if (this.I != z5) {
            r rVar = this.H;
            if (z5) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.M = appCompatTextView;
                appCompatTextView.setId(com.discord.R.id.textinput_counter);
                Typeface typeface = this.f6473z0;
                if (typeface != null) {
                    this.M.setTypeface(typeface);
                }
                this.M.setMaxLines(1);
                rVar.a(this.M, 2);
                ((ViewGroup.MarginLayoutParams) this.M.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.discord.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.M != null) {
                    EditText editText = this.f6467w;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                rVar.g(this.M, 2);
                this.M = null;
            }
            this.I = z5;
        }
    }

    public void setCounterMaxLength(int i7) {
        if (this.J != i7) {
            if (i7 > 0) {
                this.J = i7;
            } else {
                this.J = -1;
            }
            if (!this.I || this.M == null) {
                return;
            }
            EditText editText = this.f6467w;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i7) {
        if (this.N != i7) {
            this.N = i7;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.a0 != colorStateList) {
            this.a0 = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i7) {
        if (this.O != i7) {
            this.O = i7;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f6443b0 != colorStateList) {
            this.f6443b0 = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f6444c0 != colorStateList) {
            this.f6444c0 = colorStateList;
            if (o() || (this.M != null && this.K)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.G0 = colorStateList;
        this.H0 = colorStateList;
        if (this.f6467w != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        m(this, z5);
        super.setEnabled(z5);
    }

    public void setEndIconActivated(boolean z5) {
        this.f6451i.f16868y.setActivated(z5);
    }

    public void setEndIconCheckable(boolean z5) {
        this.f6451i.f16868y.setCheckable(z5);
    }

    public void setEndIconContentDescription(int i7) {
        n nVar = this.f6451i;
        CharSequence text = i7 != 0 ? nVar.getResources().getText(i7) : null;
        CheckableImageButton checkableImageButton = nVar.f16868y;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i7) {
        n nVar = this.f6451i;
        Drawable drawableU = i7 != 0 ? mf.f.u(nVar.getContext(), i7) : null;
        TextInputLayout textInputLayout = nVar.f16862d;
        CheckableImageButton checkableImageButton = nVar.f16868y;
        checkableImageButton.setImageDrawable(drawableU);
        if (drawableU != null) {
            sa.a.c(textInputLayout, checkableImageButton, nVar.H, nVar.I);
            sa.a.C(textInputLayout, checkableImageButton, nVar.H);
        }
    }

    public void setEndIconMinSize(int i7) {
        n nVar = this.f6451i;
        if (i7 < 0) {
            nVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i7 != nVar.J) {
            nVar.J = i7;
            CheckableImageButton checkableImageButton = nVar.f16868y;
            checkableImageButton.setMinimumWidth(i7);
            checkableImageButton.setMinimumHeight(i7);
            CheckableImageButton checkableImageButton2 = nVar.f16864i;
            checkableImageButton2.setMinimumWidth(i7);
            checkableImageButton2.setMinimumHeight(i7);
        }
    }

    public void setEndIconMode(int i7) {
        this.f6451i.g(i7);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.f6451i;
        CheckableImageButton checkableImageButton = nVar.f16868y;
        View.OnLongClickListener onLongClickListener = nVar.L;
        checkableImageButton.setOnClickListener(onClickListener);
        sa.a.F(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.f6451i;
        nVar.L = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.f16868y;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        sa.a.F(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        n nVar = this.f6451i;
        nVar.K = scaleType;
        nVar.f16868y.setScaleType(scaleType);
        nVar.f16864i.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        n nVar = this.f6451i;
        if (nVar.H != colorStateList) {
            nVar.H = colorStateList;
            sa.a.c(nVar.f16862d, nVar.f16868y, colorStateList, nVar.I);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.f6451i;
        if (nVar.I != mode) {
            nVar.I = mode;
            sa.a.c(nVar.f16862d, nVar.f16868y, nVar.H, mode);
        }
    }

    public void setEndIconVisible(boolean z5) {
        this.f6451i.h(z5);
    }

    public void setError(CharSequence charSequence) {
        r rVar = this.H;
        if (!rVar.f16893q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            rVar.f();
            return;
        }
        rVar.c();
        rVar.f16892p = charSequence;
        rVar.f16894r.setText(charSequence);
        int i7 = rVar.f16890n;
        if (i7 != 1) {
            rVar.f16891o = 1;
        }
        rVar.i(i7, rVar.f16891o, rVar.h(rVar.f16894r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i7) {
        r rVar = this.H;
        rVar.f16896t = i7;
        AppCompatTextView appCompatTextView = rVar.f16894r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i7);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        r rVar = this.H;
        rVar.f16895s = charSequence;
        AppCompatTextView appCompatTextView = rVar.f16894r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z5) {
        r rVar = this.H;
        TextInputLayout textInputLayout = rVar.f16886h;
        if (rVar.f16893q == z5) {
            return;
        }
        rVar.c();
        if (z5) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(rVar.f16885g, null);
            rVar.f16894r = appCompatTextView;
            appCompatTextView.setId(com.discord.R.id.textinput_error);
            rVar.f16894r.setTextAlignment(5);
            Typeface typeface = rVar.B;
            if (typeface != null) {
                rVar.f16894r.setTypeface(typeface);
            }
            int i7 = rVar.f16897u;
            rVar.f16897u = i7;
            AppCompatTextView appCompatTextView2 = rVar.f16894r;
            if (appCompatTextView2 != null) {
                rVar.f16886h.n(appCompatTextView2, i7);
            }
            ColorStateList colorStateList = rVar.f16898v;
            rVar.f16898v = colorStateList;
            AppCompatTextView appCompatTextView3 = rVar.f16894r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = rVar.f16895s;
            rVar.f16895s = charSequence;
            AppCompatTextView appCompatTextView4 = rVar.f16894r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i10 = rVar.f16896t;
            rVar.f16896t = i10;
            AppCompatTextView appCompatTextView5 = rVar.f16894r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i10);
            }
            rVar.f16894r.setVisibility(4);
            rVar.a(rVar.f16894r, 0);
        } else {
            rVar.f();
            rVar.g(rVar.f16894r, 0);
            rVar.f16894r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        rVar.f16893q = z5;
    }

    public void setErrorIconDrawable(int i7) {
        n nVar = this.f6451i;
        nVar.i(i7 != 0 ? mf.f.u(nVar.getContext(), i7) : null);
        sa.a.C(nVar.f16862d, nVar.f16864i, nVar.f16865v);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.f6451i;
        CheckableImageButton checkableImageButton = nVar.f16864i;
        View.OnLongClickListener onLongClickListener = nVar.f16867x;
        checkableImageButton.setOnClickListener(onClickListener);
        sa.a.F(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.f6451i;
        nVar.f16867x = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.f16864i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        sa.a.F(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        n nVar = this.f6451i;
        if (nVar.f16865v != colorStateList) {
            nVar.f16865v = colorStateList;
            sa.a.c(nVar.f16862d, nVar.f16864i, colorStateList, nVar.f16866w);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.f6451i;
        if (nVar.f16866w != mode) {
            nVar.f16866w = mode;
            sa.a.c(nVar.f16862d, nVar.f16864i, nVar.f16865v, mode);
        }
    }

    public void setErrorTextAppearance(int i7) {
        r rVar = this.H;
        rVar.f16897u = i7;
        AppCompatTextView appCompatTextView = rVar.f16894r;
        if (appCompatTextView != null) {
            rVar.f16886h.n(appCompatTextView, i7);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        r rVar = this.H;
        rVar.f16898v = colorStateList;
        AppCompatTextView appCompatTextView = rVar.f16894r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z5) {
        if (this.U0 != z5) {
            this.U0 = z5;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        r rVar = this.H;
        if (zIsEmpty) {
            if (rVar.f16900x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!rVar.f16900x) {
            setHelperTextEnabled(true);
        }
        rVar.c();
        rVar.f16899w = charSequence;
        rVar.f16901y.setText(charSequence);
        int i7 = rVar.f16890n;
        if (i7 != 2) {
            rVar.f16891o = 2;
        }
        rVar.i(i7, rVar.f16891o, rVar.h(rVar.f16901y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        r rVar = this.H;
        rVar.A = colorStateList;
        AppCompatTextView appCompatTextView = rVar.f16901y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z5) {
        r rVar = this.H;
        TextInputLayout textInputLayout = rVar.f16886h;
        if (rVar.f16900x == z5) {
            return;
        }
        rVar.c();
        if (z5) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(rVar.f16885g, null);
            rVar.f16901y = appCompatTextView;
            appCompatTextView.setId(com.discord.R.id.textinput_helper_text);
            rVar.f16901y.setTextAlignment(5);
            Typeface typeface = rVar.B;
            if (typeface != null) {
                rVar.f16901y.setTypeface(typeface);
            }
            rVar.f16901y.setVisibility(4);
            rVar.f16901y.setAccessibilityLiveRegion(1);
            int i7 = rVar.f16902z;
            rVar.f16902z = i7;
            AppCompatTextView appCompatTextView2 = rVar.f16901y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i7);
            }
            ColorStateList colorStateList = rVar.A;
            rVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = rVar.f16901y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            rVar.a(rVar.f16901y, 1);
            rVar.f16901y.setAccessibilityDelegate(new nh.q(rVar));
        } else {
            rVar.c();
            int i10 = rVar.f16890n;
            if (i10 == 2) {
                rVar.f16891o = 0;
            }
            rVar.i(i10, rVar.f16891o, rVar.h(rVar.f16901y, ""));
            rVar.g(rVar.f16901y, 1);
            rVar.f16901y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        rVar.f16900x = z5;
    }

    public void setHelperTextTextAppearance(int i7) {
        r rVar = this.H;
        rVar.f16902z = i7;
        AppCompatTextView appCompatTextView = rVar.f16901y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i7);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f6446d0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z5) {
        this.V0 = z5;
    }

    public void setHintEnabled(boolean z5) {
        if (z5 != this.f6446d0) {
            this.f6446d0 = z5;
            if (z5) {
                CharSequence hint = this.f6467w.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f6448e0)) {
                        setHint(hint);
                    }
                    this.f6467w.setHint((CharSequence) null);
                }
                this.f6449f0 = true;
            } else {
                this.f6449f0 = false;
                if (!TextUtils.isEmpty(this.f6448e0) && TextUtils.isEmpty(this.f6467w.getHint())) {
                    this.f6467w.setHint(this.f6448e0);
                }
                setHintInternal(null);
            }
            if (this.f6467w != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i7) {
        c cVar = this.T0;
        if (i7 != cVar.f3247f0) {
            cVar.f3247f0 = i7;
            cVar.j(false);
        }
        if (i7 != cVar.f3245e0) {
            cVar.f3245e0 = i7;
            cVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i7) {
        c cVar = this.T0;
        TextInputLayout textInputLayout = cVar.f3237a;
        hh.d dVar = new hh.d(textInputLayout.getContext(), i7);
        ColorStateList colorStateList = dVar.k;
        if (colorStateList != null) {
            cVar.k = colorStateList;
        }
        float f2 = dVar.f10762l;
        if (f2 != 0.0f) {
            cVar.f3251i = f2;
        }
        ColorStateList colorStateList2 = dVar.f10753a;
        if (colorStateList2 != null) {
            cVar.V = colorStateList2;
        }
        cVar.T = dVar.f10758f;
        cVar.U = dVar.f10759g;
        cVar.S = dVar.f10760h;
        cVar.W = dVar.j;
        hh.a aVar = cVar.f3269z;
        if (aVar != null) {
            aVar.f10746d = true;
        }
        ga.l lVar = new ga.l(3, cVar);
        dVar.a();
        cVar.f3269z = new hh.a(lVar, dVar.f10766p);
        dVar.b(textInputLayout.getContext(), cVar.f3269z);
        cVar.j(false);
        this.H0 = cVar.k;
        if (this.f6467w != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            if (this.G0 == null) {
                c cVar = this.T0;
                if (cVar.k != colorStateList) {
                    cVar.k = colorStateList;
                    cVar.j(false);
                }
            }
            this.H0 = colorStateList;
            if (this.f6467w != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull y yVar) {
        this.L = yVar;
    }

    public void setMaxEms(int i7) {
        this.E = i7;
        EditText editText = this.f6467w;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxEms(i7);
    }

    public void setMaxWidth(int i7) {
        this.G = i7;
        EditText editText = this.f6467w;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxWidth(i7);
    }

    public void setMaxWidthResource(int i7) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    public void setMinEms(int i7) {
        this.f6471y = i7;
        EditText editText = this.f6467w;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinEms(i7);
    }

    public void setMinWidth(int i7) {
        this.F = i7;
        EditText editText = this.f6467w;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinWidth(i7);
    }

    public void setMinWidthResource(int i7) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i7) {
        n nVar = this.f6451i;
        nVar.f16868y.setContentDescription(i7 != 0 ? nVar.getResources().getText(i7) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i7) {
        n nVar = this.f6451i;
        nVar.f16868y.setImageDrawable(i7 != 0 ? mf.f.u(nVar.getContext(), i7) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z5) {
        n nVar = this.f6451i;
        if (z5 && nVar.F != 1) {
            nVar.g(1);
        } else if (z5) {
            nVar.getClass();
        } else {
            nVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        n nVar = this.f6451i;
        nVar.H = colorStateList;
        sa.a.c(nVar.f16862d, nVar.f16868y, colorStateList, nVar.I);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        n nVar = this.f6451i;
        nVar.I = mode;
        sa.a.c(nVar.f16862d, nVar.f16868y, nVar.H, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.R == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.R = appCompatTextView;
            appCompatTextView.setId(com.discord.R.id.textinput_placeholder);
            this.R.setImportantForAccessibility(1);
            this.R.setAccessibilityLiveRegion(1);
            f fVarF = f();
            this.U = fVarF;
            fVarF.f2784e = 67L;
            this.V = f();
            setPlaceholderTextAppearance(this.T);
            setPlaceholderTextColor(this.S);
            u0.p(this.R, new com.google.android.material.datepicker.h(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.Q) {
                setPlaceholderTextEnabled(true);
            }
            this.P = charSequence;
        }
        EditText editText = this.f6467w;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i7) {
        this.T = i7;
        AppCompatTextView appCompatTextView = this.R;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i7);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            AppCompatTextView appCompatTextView = this.R;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        v vVar = this.f6447e;
        vVar.getClass();
        vVar.f16914i = TextUtils.isEmpty(charSequence) ? null : charSequence;
        vVar.f16913e.setText(charSequence);
        vVar.e();
    }

    public void setPrefixTextAppearance(int i7) {
        this.f6447e.f16913e.setTextAppearance(i7);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f6447e.f16913e.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull m mVar) {
        i iVar = this.f6450g0;
        if (iVar == null || iVar.f14483e.f14463a == mVar) {
            return;
        }
        this.f6456m0 = mVar;
        c();
    }

    public void setStartIconCheckable(boolean z5) {
        this.f6447e.f16915v.setCheckable(z5);
    }

    public void setStartIconContentDescription(int i7) {
        setStartIconContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setStartIconDrawable(int i7) {
        setStartIconDrawable(i7 != 0 ? mf.f.u(getContext(), i7) : null);
    }

    public void setStartIconMinSize(int i7) {
        v vVar = this.f6447e;
        if (i7 < 0) {
            vVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i7 != vVar.f16918y) {
            vVar.f16918y = i7;
            CheckableImageButton checkableImageButton = vVar.f16915v;
            checkableImageButton.setMinimumWidth(i7);
            checkableImageButton.setMinimumHeight(i7);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        v vVar = this.f6447e;
        CheckableImageButton checkableImageButton = vVar.f16915v;
        View.OnLongClickListener onLongClickListener = vVar.F;
        checkableImageButton.setOnClickListener(onClickListener);
        sa.a.F(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        v vVar = this.f6447e;
        vVar.F = onLongClickListener;
        CheckableImageButton checkableImageButton = vVar.f16915v;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        sa.a.F(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        v vVar = this.f6447e;
        vVar.E = scaleType;
        vVar.f16915v.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        v vVar = this.f6447e;
        if (vVar.f16916w != colorStateList) {
            vVar.f16916w = colorStateList;
            sa.a.c(vVar.f16912d, vVar.f16915v, colorStateList, vVar.f16917x);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        v vVar = this.f6447e;
        if (vVar.f16917x != mode) {
            vVar.f16917x = mode;
            sa.a.c(vVar.f16912d, vVar.f16915v, vVar.f16916w, mode);
        }
    }

    public void setStartIconVisible(boolean z5) {
        this.f6447e.c(z5);
    }

    public void setSuffixText(CharSequence charSequence) {
        n nVar = this.f6451i;
        nVar.getClass();
        nVar.M = TextUtils.isEmpty(charSequence) ? null : charSequence;
        nVar.N.setText(charSequence);
        nVar.n();
    }

    public void setSuffixTextAppearance(int i7) {
        this.f6451i.N.setTextAppearance(i7);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f6451i.N.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(x xVar) {
        EditText editText = this.f6467w;
        if (editText != null) {
            u0.p(editText, xVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f6473z0) {
            this.f6473z0 = typeface;
            this.T0.n(typeface);
            r rVar = this.H;
            if (typeface != rVar.B) {
                rVar.B = typeface;
                AppCompatTextView appCompatTextView = rVar.f16894r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = rVar.f16901y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.M;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f6467w;
        if (editText == null || this.f6459p0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = n1.f1045a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.w.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.K && (appCompatTextView = this.M) != null) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.w.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f6467w.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f6467w;
        if (editText == null || this.f6450g0 == null) {
            return;
        }
        if ((this.f6453j0 || editText.getBackground() == null) && this.f6459p0 != 0) {
            this.f6467w.setBackground(getEditTextBoxBackground());
            this.f6453j0 = true;
        }
    }

    public final void v() {
        if (this.f6459p0 != 1) {
            FrameLayout frameLayout = this.f6445d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z5, boolean z6) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f6467w;
        boolean z7 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f6467w;
        boolean z10 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.G0;
        c cVar = this.T0;
        if (colorStateList2 != null) {
            cVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.G0;
            cVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.Q0) : this.Q0));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.H.f16894r;
            cVar.k(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.K && (appCompatTextView = this.M) != null) {
            cVar.k(appCompatTextView.getTextColors());
        } else if (z10 && (colorStateList = this.H0) != null && cVar.k != colorStateList) {
            cVar.k = colorStateList;
            cVar.j(false);
        }
        n nVar = this.f6451i;
        v vVar = this.f6447e;
        if (z7 || !this.U0 || (isEnabled() && z10)) {
            if (z6 || this.S0) {
                ValueAnimator valueAnimator = this.W0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.W0.cancel();
                }
                if (z5 && this.V0) {
                    b(1.0f);
                } else {
                    cVar.m(1.0f);
                }
                this.S0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f6467w;
                x(editText3 != null ? editText3.getText() : null);
                vVar.G = false;
                vVar.e();
                nVar.O = false;
                nVar.n();
                return;
            }
            return;
        }
        if (z6 || !this.S0) {
            ValueAnimator valueAnimator2 = this.W0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.W0.cancel();
            }
            if (z5 && this.V0) {
                b(0.0f);
            } else {
                cVar.m(0.0f);
            }
            if (g() && !((nh.g) this.f6450g0).f16844e0.f16842r.isEmpty() && g()) {
                ((nh.g) this.f6450g0).y(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.S0 = true;
            AppCompatTextView appCompatTextView3 = this.R;
            if (appCompatTextView3 != null && this.Q) {
                appCompatTextView3.setText((CharSequence) null);
                m3.x.a(this.f6445d, this.V);
                this.R.setVisibility(4);
            }
            vVar.G = true;
            vVar.e();
            nVar.O = true;
            nVar.n();
        }
    }

    public final void x(Editable editable) {
        ((q) this.L).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f6445d;
        if (length != 0 || this.S0) {
            AppCompatTextView appCompatTextView = this.R;
            if (appCompatTextView == null || !this.Q) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            m3.x.a(frameLayout, this.V);
            this.R.setVisibility(4);
            return;
        }
        if (this.R == null || !this.Q || TextUtils.isEmpty(this.P)) {
            return;
        }
        this.R.setText(this.P);
        m3.x.a(frameLayout, this.U);
        this.R.setVisibility(0);
        this.R.bringToFront();
    }

    public final void y(boolean z5, boolean z6) {
        int defaultColor = this.L0.getDefaultColor();
        int colorForState = this.L0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.L0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z5) {
            this.f6464u0 = colorForState2;
        } else if (z6) {
            this.f6464u0 = colorForState;
        } else {
            this.f6464u0 = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f6450g0 == null || this.f6459p0 == 0) {
            return;
        }
        boolean z5 = false;
        boolean z6 = isFocused() || ((editText2 = this.f6467w) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f6467w) != null && editText.isHovered())) {
            z5 = true;
        }
        if (!isEnabled()) {
            this.f6464u0 = this.Q0;
        } else if (o()) {
            if (this.L0 != null) {
                y(z6, z5);
            } else {
                this.f6464u0 = getErrorCurrentTextColors();
            }
        } else if (!this.K || (appCompatTextView = this.M) == null) {
            if (z6) {
                this.f6464u0 = this.K0;
            } else if (z5) {
                this.f6464u0 = this.J0;
            } else {
                this.f6464u0 = this.I0;
            }
        } else if (this.L0 != null) {
            y(z6, z5);
        } else {
            this.f6464u0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        n nVar = this.f6451i;
        TextInputLayout textInputLayout = nVar.f16862d;
        CheckableImageButton checkableImageButton = nVar.f16868y;
        TextInputLayout textInputLayout2 = nVar.f16862d;
        nVar.l();
        sa.a.C(textInputLayout2, nVar.f16864i, nVar.f16865v);
        sa.a.C(textInputLayout2, checkableImageButton, nVar.H);
        if (nVar.b() instanceof nh.k) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                sa.a.c(textInputLayout, checkableImageButton, nVar.H, nVar.I);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        v vVar = this.f6447e;
        sa.a.C(vVar.f16912d, vVar.f16915v, vVar.f16916w);
        if (this.f6459p0 == 2) {
            int i7 = this.f6461r0;
            if (z6 && isEnabled()) {
                this.f6461r0 = this.f6463t0;
            } else {
                this.f6461r0 = this.f6462s0;
            }
            if (this.f6461r0 != i7 && g() && !this.S0) {
                if (g()) {
                    ((nh.g) this.f6450g0).y(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.f6459p0 == 1) {
            if (!isEnabled()) {
                this.f6466v0 = this.N0;
            } else if (z5 && !z6) {
                this.f6466v0 = this.P0;
            } else if (z6) {
                this.f6466v0 = this.O0;
            } else {
                this.f6466v0 = this.M0;
            }
        }
        c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f6447e.f16915v;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f6447e.b(drawable);
    }

    public void setHint(int i7) {
        setHint(i7 != 0 ? getResources().getText(i7) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f6451i.f16868y.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f6451i.f16868y.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f6451i.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f6451i.f16868y;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        n nVar = this.f6451i;
        TextInputLayout textInputLayout = nVar.f16862d;
        CheckableImageButton checkableImageButton = nVar.f16868y;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            sa.a.c(textInputLayout, checkableImageButton, nVar.H, nVar.I);
            sa.a.C(textInputLayout, checkableImageButton, nVar.H);
        }
    }
}
