package nh;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.discord.R;
import com.google.android.gms.internal.play_billing.v1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends LinearLayout {
    public final v1 E;
    public int F;
    public final LinkedHashSet G;
    public ColorStateList H;
    public PorterDuff.Mode I;
    public int J;
    public ImageView.ScaleType K;
    public View.OnLongClickListener L;
    public CharSequence M;
    public final AppCompatTextView N;
    public boolean O;
    public EditText P;
    public final AccessibilityManager Q;
    public AccessibilityManager.TouchExplorationStateChangeListener R;
    public final l S;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f16862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f16863e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CheckableImageButton f16864i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f16865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f16866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View.OnLongClickListener f16867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CheckableImageButton f16868y;

    public n(TextInputLayout textInputLayout, e4.m mVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.F = 0;
        this.G = new LinkedHashSet();
        this.S = new l(this);
        m mVar2 = new m(this);
        this.Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f16862d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f16863e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f16864i = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f16868y = checkableImageButtonA2;
        v1 v1Var = new v1();
        v1Var.f6156i = new SparseArray();
        v1Var.f6157v = this;
        TypedArray typedArray = (TypedArray) mVar.f7994i;
        v1Var.f6154d = typedArray.getResourceId(28, 0);
        v1Var.f6155e = typedArray.getResourceId(53, 0);
        this.E = v1Var;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.N = appCompatTextView;
        TypedArray typedArray2 = (TypedArray) mVar.f7994i;
        if (typedArray2.hasValue(38)) {
            this.f16865v = com.facebook.imagepipeline.nativecode.c.u(getContext(), mVar, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f16866w = bh.p.h(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(mVar.x(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(54)) {
            if (typedArray2.hasValue(32)) {
                this.H = com.facebook.imagepipeline.nativecode.c.u(getContext(), mVar, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.I = bh.p.h(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(54)) {
            if (typedArray2.hasValue(55)) {
                this.H = com.facebook.imagepipeline.nativecode.c.u(getContext(), mVar, 55);
            }
            if (typedArray2.hasValue(56)) {
                this.I = bh.p.h(typedArray2.getInt(56, -1), null);
            }
            g(typedArray2.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.J) {
            this.J = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeF = sa.a.f(typedArray2.getInt(31, -1));
            this.K = scaleTypeF;
            checkableImageButtonA2.setScaleType(scaleTypeF);
            checkableImageButtonA.setScaleType(scaleTypeF);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray2.getResourceId(73, 0));
        if (typedArray2.hasValue(74)) {
            appCompatTextView.setTextColor(mVar.w(74));
        }
        CharSequence text3 = typedArray2.getText(72);
        this.M = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.C0.add(mVar2);
        if (textInputLayout.f6467w != null) {
            mVar2.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new dl.i(4, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i7) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i7);
        if (com.facebook.imagepipeline.nativecode.c.A(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final o b() {
        o dVar;
        int i7 = this.F;
        v1 v1Var = this.E;
        SparseArray sparseArray = (SparseArray) v1Var.f6156i;
        o oVar = (o) sparseArray.get(i7);
        if (oVar != null) {
            return oVar;
        }
        n nVar = (n) v1Var.f6157v;
        if (i7 == -1) {
            dVar = new d(nVar, 0);
        } else if (i7 == 0) {
            dVar = new d(nVar, 1);
        } else if (i7 == 1) {
            dVar = new u(nVar, v1Var.f6155e);
        } else if (i7 == 2) {
            dVar = new c(nVar);
        } else {
            if (i7 != 3) {
                throw new IllegalArgumentException(kk.b.h(i7, "Invalid end icon mode: "));
            }
            dVar = new k(nVar);
        }
        sparseArray.append(i7, dVar);
        return dVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f16868y;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.N.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f16863e.getVisibility() == 0 && this.f16868y.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f16864i.getVisibility() == 0;
    }

    public final void f(boolean z5) {
        boolean z6;
        boolean zIsActivated;
        boolean z7;
        o oVarB = b();
        boolean zJ = oVarB.j();
        CheckableImageButton checkableImageButton = this.f16868y;
        boolean z10 = true;
        if (!zJ || (z7 = checkableImageButton.f6404v) == oVarB.k()) {
            z6 = false;
        } else {
            checkableImageButton.setChecked(!z7);
            z6 = true;
        }
        if (!(oVarB instanceof k) || (zIsActivated = checkableImageButton.isActivated()) == ((k) oVarB).f16853l) {
            z10 = z6;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z5 || z10) {
            sa.a.C(this.f16862d, checkableImageButton, this.H);
        }
    }

    public final void g(int i7) {
        if (this.F == i7) {
            return;
        }
        o oVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.R;
        AccessibilityManager accessibilityManager = this.Q;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.R = null;
        oVarB.r();
        this.F = i7;
        Iterator it = this.G.iterator();
        if (it.hasNext()) {
            throw s0.g.a(it);
        }
        h(i7 != 0);
        o oVarB2 = b();
        int iD = this.E.f6154d;
        if (iD == 0) {
            iD = oVarB2.d();
        }
        Drawable drawableU = iD != 0 ? mf.f.u(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f16868y;
        checkableImageButton.setImageDrawable(drawableU);
        TextInputLayout textInputLayout = this.f16862d;
        if (drawableU != null) {
            sa.a.c(textInputLayout, checkableImageButton, this.H, this.I);
            sa.a.C(textInputLayout, checkableImageButton, this.H);
        }
        int iC = oVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(oVarB2.j());
        if (!oVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i7);
        }
        oVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = oVarB2.h();
        this.R = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.R);
        }
        View.OnClickListener onClickListenerF = oVarB2.f();
        View.OnLongClickListener onLongClickListener = this.L;
        checkableImageButton.setOnClickListener(onClickListenerF);
        sa.a.F(checkableImageButton, onLongClickListener);
        EditText editText = this.P;
        if (editText != null) {
            oVarB2.l(editText);
            j(oVarB2);
        }
        sa.a.c(textInputLayout, checkableImageButton, this.H, this.I);
        f(true);
    }

    public final void h(boolean z5) {
        if (d() != z5) {
            this.f16868y.setVisibility(z5 ? 0 : 8);
            k();
            m();
            this.f16862d.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f16864i;
        checkableImageButton.setImageDrawable(drawable);
        l();
        sa.a.c(this.f16862d, checkableImageButton, this.f16865v, this.f16866w);
    }

    public final void j(o oVar) {
        if (this.P == null) {
            return;
        }
        if (oVar.e() != null) {
            this.P.setOnFocusChangeListener(oVar.e());
        }
        if (oVar.g() != null) {
            this.f16868y.setOnFocusChangeListener(oVar.g());
        }
    }

    public final void k() {
        this.f16863e.setVisibility((this.f16868y.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.M == null || this.O) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f16864i;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f16862d;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.H.f16893q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.F != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f16862d;
        if (textInputLayout.f6467w == null) {
            return;
        }
        this.N.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f6467w.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f6467w.getPaddingEnd(), textInputLayout.f6467w.getPaddingBottom());
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.N;
        int visibility = appCompatTextView.getVisibility();
        int i7 = (this.M == null || this.O) ? 8 : 0;
        if (visibility != i7) {
            b().o(i7 == 0);
        }
        k();
        appCompatTextView.setVisibility(i7);
        this.f16862d.s();
    }
}
