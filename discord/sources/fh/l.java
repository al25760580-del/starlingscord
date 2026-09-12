package fh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.discord.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends sa.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9231g;

    public /* synthetic */ l(int i7) {
        this.f9231g = i7;
    }

    @Override // sa.a
    public final void I(Object obj, float f2) {
        switch (this.f9231g) {
            case 0:
                m mVar = (m) obj;
                mVar.N.f9242b = f2 / 10000.0f;
                mVar.invalidateSelf();
                int i7 = (int) f2;
                if (mVar.f9235e.a(true)) {
                    Context context = mVar.f9234d;
                    if (mVar.R == null) {
                        LinearInterpolator linearInterpolator = lg.a.f15071a;
                        mVar.T = io.sentry.config.a.T(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        mVar.U = io.sentry.config.a.T(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        mVar.R = valueAnimator;
                        valueAnimator.setDuration(500L);
                        mVar.R.setFloatValues(0.0f, 1.0f);
                        mVar.R.setInterpolator(null);
                        mVar.R.addUpdateListener(new com.discord.chat.presentation.list.c(3, mVar));
                    }
                    float f7 = i7;
                    float f10 = (f7 < 1000.0f || f7 > 9000.0f) ? 0.0f : 1.0f;
                    if (f10 != mVar.O) {
                        if (mVar.R.isRunning()) {
                            mVar.R.cancel();
                        }
                        mVar.O = f10;
                        if (f10 != 1.0f) {
                            mVar.S = mVar.U;
                            mVar.R.reverse();
                        } else {
                            mVar.S = mVar.T;
                            mVar.R.start();
                        }
                    } else if (!mVar.R.isRunning()) {
                        mVar.N.f9244d = f10;
                        mVar.invalidateSelf();
                    }
                    break;
                }
                break;
            default:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f2);
                break;
        }
    }

    @Override // sa.a
    public final float q(Object obj) {
        switch (this.f9231g) {
            case 0:
                return ((m) obj).N.f9242b * 10000.0f;
            default:
                return ((MaterialButton) obj).getDisplayedWidthIncrease();
        }
    }
}
