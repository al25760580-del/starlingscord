package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Animation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ReactSwipeRefreshLayout f2777e;

    public /* synthetic */ f(ReactSwipeRefreshLayout reactSwipeRefreshLayout, int i7) {
        this.f2776d = i7;
        this.f2777e = reactSwipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f2, Transformation transformation) {
        switch (this.f2776d) {
            case 0:
                ReactSwipeRefreshLayout reactSwipeRefreshLayout = this.f2777e;
                int iAbs = !reactSwipeRefreshLayout.mUsingCustomStart ? reactSwipeRefreshLayout.mSpinnerOffsetEnd - Math.abs(reactSwipeRefreshLayout.mOriginalOffsetTop) : reactSwipeRefreshLayout.mSpinnerOffsetEnd;
                int i7 = reactSwipeRefreshLayout.mFrom;
                reactSwipeRefreshLayout.setTargetOffsetTopAndBottom((i7 + ((int) ((iAbs - i7) * f2))) - reactSwipeRefreshLayout.mCircleView.getTop());
                CircularProgressDrawable circularProgressDrawable = reactSwipeRefreshLayout.mProgress;
                float f7 = 1.0f - f2;
                c cVar = circularProgressDrawable.f2742d;
                if (f7 != cVar.f2765p) {
                    cVar.f2765p = f7;
                }
                circularProgressDrawable.invalidateSelf();
                break;
            default:
                this.f2777e.moveToStart(f2);
                break;
        }
    }
}
