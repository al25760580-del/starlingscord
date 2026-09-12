package bh;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3293b;

    public /* synthetic */ m(int i7, Object obj) {
        this.f3292a = i7;
        this.f3293b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3292a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f3293b;
                textView.setScaleX(fFloatValue);
                textView.setScaleY(fFloatValue);
                break;
            case 1:
                ((TextInputLayout) this.f3293b).T0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kh.i iVar = ((BottomSheetBehavior) this.f3293b).f6284i;
                if (iVar != null) {
                    iVar.r(fFloatValue2);
                }
                break;
        }
    }
}
