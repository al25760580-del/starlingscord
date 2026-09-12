package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2772b;

    public /* synthetic */ d(i iVar, int i7) {
        this.f2771a = i7;
        this.f2772b = iVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout$OnRefreshListener swipeRefreshLayout$OnRefreshListener;
        switch (this.f2771a) {
            case 0:
                ReactSwipeRefreshLayout reactSwipeRefreshLayout = (ReactSwipeRefreshLayout) this.f2772b;
                if (!reactSwipeRefreshLayout.mRefreshing) {
                    reactSwipeRefreshLayout.reset();
                } else {
                    reactSwipeRefreshLayout.mProgress.setAlpha(255);
                    reactSwipeRefreshLayout.mProgress.start();
                    if (reactSwipeRefreshLayout.mNotify && (swipeRefreshLayout$OnRefreshListener = reactSwipeRefreshLayout.mListener) != null) {
                        swipeRefreshLayout$OnRefreshListener.e();
                    }
                    reactSwipeRefreshLayout.mCurrentTargetOffsetTop = reactSwipeRefreshLayout.mCircleView.getTop();
                }
                break;
            default:
                i iVar = this.f2772b;
                if (!iVar.mScale) {
                    iVar.startScaleDownAnimation(null);
                }
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i7 = this.f2771a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i7 = this.f2771a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
