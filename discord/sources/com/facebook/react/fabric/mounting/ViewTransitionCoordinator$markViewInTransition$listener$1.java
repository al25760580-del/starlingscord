package com.facebook.react.fabric.mounting;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/facebook/react/fabric/mounting/ViewTransitionCoordinator$markViewInTransition$listener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewTransitionCoordinator$markViewInTransition$listener$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ Runnable $onDetach;
    final /* synthetic */ int $tag;
    final /* synthetic */ View $view;
    final /* synthetic */ ViewTransitionCoordinator this$0;

    public ViewTransitionCoordinator$markViewInTransition$listener$1(View view, ViewTransitionCoordinator viewTransitionCoordinator, int i7, Runnable runnable) {
        this.$view = view;
        this.this$0 = viewTransitionCoordinator;
        this.$tag = i7;
        this.$onDetach = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewDetachedFromWindow$lambda$0(ViewTransitionCoordinator viewTransitionCoordinator, int i7, Runnable runnable) {
        viewTransitionCoordinator.viewsInTransition.remove(Integer.valueOf(i7));
        runnable.run();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v6) {
        Intrinsics.checkNotNullParameter(v6, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v6) {
        Intrinsics.checkNotNullParameter(v6, "v");
        this.$view.removeOnAttachStateChangeListener(this);
        UiThreadUtil.runOnUiThread(new ab.a(this.this$0, this.$tag, this.$onDetach, 4));
    }
}
