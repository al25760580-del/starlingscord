package nh;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.discord.R;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f16836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f16837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f16838i;
    public final com.discord.chat.presentation.list.delegate.b j;
    public final com.discord.chat.input.views.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f16839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f16840m;

    public c(n nVar) {
        super(nVar);
        this.j = new com.discord.chat.presentation.list.delegate.b(11, this);
        this.k = new com.discord.chat.input.views.b(2, this);
        this.f16834e = io.sentry.config.a.S(nVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f16835f = io.sentry.config.a.S(nVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f16836g = io.sentry.config.a.T(nVar.getContext(), R.attr.motionEasingLinearInterpolator, lg.a.f15071a);
        this.f16837h = io.sentry.config.a.T(nVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, lg.a.f15074d);
    }

    @Override // nh.o
    public final void a() {
        if (this.f16870b.M != null) {
            return;
        }
        s(t());
    }

    @Override // nh.o
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // nh.o
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // nh.o
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // nh.o
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // nh.o
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // nh.o
    public final void l(EditText editText) {
        this.f16838i = editText;
        this.f16869a.setEndIconVisible(t());
    }

    @Override // nh.o
    public final void o(boolean z5) {
        if (this.f16870b.M == null) {
            return;
        }
        s(z5);
    }

    @Override // nh.o
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f16837h);
        valueAnimatorOfFloat.setDuration(this.f16835f);
        final int i7 = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: nh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f16831b;

            {
                this.f16831b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i7) {
                    case 0:
                        c cVar = this.f16831b;
                        cVar.getClass();
                        cVar.f16872d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        c cVar2 = this.f16831b;
                        cVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f16872d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f16836g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f16834e;
        valueAnimatorOfFloat2.setDuration(i10);
        final int i11 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: nh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f16831b;

            {
                this.f16831b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        c cVar = this.f16831b;
                        cVar.getClass();
                        cVar.f16872d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        c cVar2 = this.f16831b;
                        cVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f16872d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f16839l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f16839l.addListener(new b(this, i11));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i10);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: nh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f16831b;

            {
                this.f16831b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        c cVar = this.f16831b;
                        cVar.getClass();
                        cVar.f16872d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        c cVar2 = this.f16831b;
                        cVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f16872d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f16840m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new b(this, i7));
    }

    @Override // nh.o
    public final void r() {
        EditText editText = this.f16838i;
        if (editText != null) {
            editText.post(new io.sentry.android.core.p(25, this));
        }
    }

    public final void s(boolean z5) {
        boolean z6 = this.f16870b.d() == z5;
        if (z5 && !this.f16839l.isRunning()) {
            this.f16840m.cancel();
            this.f16839l.start();
            if (z6) {
                this.f16839l.end();
                return;
            }
            return;
        }
        if (z5) {
            return;
        }
        this.f16839l.cancel();
        this.f16840m.start();
        if (z6) {
            this.f16840m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f16838i;
        if (editText != null) {
            return (editText.hasFocus() || this.f16872d.hasFocus()) && this.f16838i.getText().length() > 0;
        }
        return false;
    }
}
