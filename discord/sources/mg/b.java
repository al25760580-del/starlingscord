package mg;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f15763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout$BaseBehavior f15765c;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, f fVar) {
        this.f15765c = appBarLayout$BaseBehavior;
        this.f15763a = coordinatorLayout;
        this.f15764b = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15765c.B(this.f15763a, this.f15764b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
