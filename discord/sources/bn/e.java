package bn;

import android.content.Context;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.e0;
import com.swmansion.rnscreens.o;
import kotlin.jvm.internal.Intrinsics;
import mm.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends CoordinatorLayout implements ReactPointerEventsView {
    public final e0 U;
    public final o V;
    public final d W;

    public e(Context context, e0 fragment) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        o pointerEventsImpl = new o(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(pointerEventsImpl, "pointerEventsImpl");
        super(context, null);
        this.U = fragment;
        this.V = pointerEventsImpl;
        this.W = new d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        if (getVisibility() != 4) {
            super.clearFocus();
        }
    }

    @NotNull
    public final e0 getFragment$react_native_screens_release() {
        return this.U;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        return (PointerEvents) this.V.f7219e;
    }

    @NotNull
    public final Screen getScreen() {
        return this.U.a();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        e0 e0Var = this.U;
        if (j.b(e0Var.a())) {
            e0Var.a().onBottomSheetBehaviorDidLayout$react_native_screens_release(z5);
        }
    }

    @Override // android.view.View
    public final void startAnimation(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        e0 e0Var = this.U;
        an.b bVar = new an.b(e0Var);
        bVar.setDuration(animation.getDuration());
        boolean z5 = animation instanceof AnimationSet;
        d dVar = this.W;
        if (z5 && !e0Var.isRemoving()) {
            AnimationSet animationSet = (AnimationSet) animation;
            animationSet.addAnimation(bVar);
            animationSet.setAnimationListener(dVar);
            super.startAnimation(animationSet);
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(animation);
        animationSet2.addAnimation(bVar);
        animationSet2.setAnimationListener(dVar);
        super.startAnimation(animationSet2);
    }
}
