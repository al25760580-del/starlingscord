package nh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.discord.R;
import com.facebook.imageutils.JfifUtil;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f16882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f16883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f16884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f16885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f16886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f16887i;
    public int j;
    public FrameLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f16888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f16889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f16892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AppCompatTextView f16894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f16895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16896t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16897u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f16898v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f16899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16900x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AppCompatTextView f16901y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f16902z;

    public r(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f16885g = context;
        this.f16886h = textInputLayout;
        this.f16889m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f16879a = io.sentry.config.a.S(context, R.attr.motionDurationShort4, JfifUtil.MARKER_EOI);
        this.f16880b = io.sentry.config.a.S(context, R.attr.motionDurationMedium4, 167);
        this.f16881c = io.sentry.config.a.S(context, R.attr.motionDurationShort4, 167);
        this.f16882d = io.sentry.config.a.T(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, lg.a.f15074d);
        LinearInterpolator linearInterpolator = lg.a.f15071a;
        this.f16883e = io.sentry.config.a.T(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f16884f = io.sentry.config.a.T(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i7) {
        if (this.f16887i == null && this.k == null) {
            Context context = this.f16885g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f16887i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f16887i;
            TextInputLayout textInputLayout = this.f16886h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.f16887i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i7 == 0 || i7 == 1) {
            this.k.setVisibility(0);
            this.k.addView(appCompatTextView);
        } else {
            this.f16887i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f16887i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f16887i != null) {
            TextInputLayout textInputLayout = this.f16886h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f16885g;
                boolean zA = com.facebook.imagepipeline.nativecode.c.A(context);
                LinearLayout linearLayout = this.f16887i;
                int paddingStart = editText.getPaddingStart();
                if (zA) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zA) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zA) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f16888l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z5, AppCompatTextView appCompatTextView, int i7, int i10, int i11) {
        if (appCompatTextView == null || !z5) {
            return;
        }
        if (i7 == i11 || i7 == i10) {
            boolean z6 = i11 == i7;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z6 ? 1.0f : 0.0f);
            int i12 = this.f16881c;
            objectAnimatorOfFloat.setDuration(z6 ? this.f16880b : i12);
            objectAnimatorOfFloat.setInterpolator(z6 ? this.f16883e : this.f16884f);
            if (i7 == i11 && i10 != 0) {
                objectAnimatorOfFloat.setStartDelay(i12);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i11 != i7 || i10 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f16889m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f16879a);
            objectAnimatorOfFloat2.setInterpolator(this.f16882d);
            objectAnimatorOfFloat2.setStartDelay(i12);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i7) {
        if (i7 == 1) {
            return this.f16894r;
        }
        if (i7 != 2) {
            return null;
        }
        return this.f16901y;
    }

    public final void f() {
        this.f16892p = null;
        c();
        if (this.f16890n == 1) {
            if (!this.f16900x || TextUtils.isEmpty(this.f16899w)) {
                this.f16891o = 0;
            } else {
                this.f16891o = 2;
            }
        }
        i(this.f16890n, this.f16891o, h(this.f16894r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView, int i7) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f16887i;
        if (linearLayout == null) {
            return;
        }
        if ((i7 == 0 || i7 == 1) && (frameLayout = this.k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i10 = this.j - 1;
        this.j = i10;
        LinearLayout linearLayout2 = this.f16887i;
        if (i10 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f16886h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f16891o == this.f16890n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i7, int i10, boolean z5) {
        TextView textViewE;
        TextView textViewE2;
        r rVar = this;
        if (i7 == i10) {
            return;
        }
        if (z5) {
            AnimatorSet animatorSet = new AnimatorSet();
            rVar.f16888l = animatorSet;
            ArrayList arrayList = new ArrayList();
            rVar.d(arrayList, rVar.f16900x, rVar.f16901y, 2, i7, i10);
            rVar.d(arrayList, rVar.f16893q, rVar.f16894r, 1, i7, i10);
            int size = arrayList.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Animator animator = (Animator) arrayList.get(i11);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            p pVar = new p(this, i10, e(i7), i7, rVar.e(i10));
            rVar = this;
            animatorSet.addListener(pVar);
            animatorSet.start();
        } else if (i7 != i10) {
            if (i10 != 0 && (textViewE2 = rVar.e(i10)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i7 != 0 && (textViewE = e(i7)) != null) {
                textViewE.setVisibility(4);
                if (i7 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            rVar.f16890n = i10;
        }
        TextInputLayout textInputLayout = rVar.f16886h;
        textInputLayout.t();
        textInputLayout.w(z5, false);
        textInputLayout.z();
    }
}
