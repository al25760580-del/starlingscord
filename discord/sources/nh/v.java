package nh;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.discord.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends LinearLayout {
    public ImageView.ScaleType E;
    public View.OnLongClickListener F;
    public boolean G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f16912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f16913e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f16914i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CheckableImageButton f16915v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f16916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f16917x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16918y;

    public v(TextInputLayout textInputLayout, e4.m mVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f16912d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f16915v = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f16913e = appCompatTextView;
        if (com.facebook.imagepipeline.nativecode.c.A(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.F;
        checkableImageButton.setOnClickListener(null);
        sa.a.F(checkableImageButton, onLongClickListener);
        this.F = null;
        checkableImageButton.setOnLongClickListener(null);
        sa.a.F(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) mVar.f7994i;
        if (typedArray.hasValue(70)) {
            this.f16916w = com.facebook.imagepipeline.nativecode.c.u(getContext(), mVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f16917x = bh.p.h(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(mVar.x(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f16918y) {
            this.f16918y = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeF = sa.a.f(typedArray.getInt(69, -1));
            this.E = scaleTypeF;
            checkableImageButton.setScaleType(scaleTypeF);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            appCompatTextView.setTextColor(mVar.w(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.f16914i = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f16915v;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f16913e.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f16915v;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f16916w;
            PorterDuff.Mode mode = this.f16917x;
            TextInputLayout textInputLayout = this.f16912d;
            sa.a.c(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            sa.a.C(textInputLayout, checkableImageButton, this.f16916w);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.F;
        checkableImageButton.setOnClickListener(null);
        sa.a.F(checkableImageButton, onLongClickListener);
        this.F = null;
        checkableImageButton.setOnLongClickListener(null);
        sa.a.F(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z5) {
        CheckableImageButton checkableImageButton = this.f16915v;
        if ((checkableImageButton.getVisibility() == 0) != z5) {
            checkableImageButton.setVisibility(z5 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f16912d.f6467w;
        if (editText == null) {
            return;
        }
        this.f16913e.setPaddingRelative(this.f16915v.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i7 = (this.f16914i == null || this.G) ? 8 : 0;
        setVisibility((this.f16915v.getVisibility() == 0 || i7 == 0) ? 0 : 8);
        this.f16913e.setVisibility(i7);
        this.f16912d.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        d();
    }
}
