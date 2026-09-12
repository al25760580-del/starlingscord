package bn;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import com.swmansion.rnscreens.ScreenStack;
import com.swmansion.rnscreens.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f3328a;

    public d(e eVar) {
        this.f3328a = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        e0 fragment$react_native_screens_release = this.f3328a.getFragment$react_native_screens_release();
        fragment$react_native_screens_release.w(true);
        View view = fragment$react_native_screens_release.getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ScreenStack) {
            ((ScreenStack) parent).onViewAppearTransitionEnd();
        }
        fragment$react_native_screens_release.a().endRemovalTransition();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f3328a.getFragment$react_native_screens_release().w(false);
    }
}
