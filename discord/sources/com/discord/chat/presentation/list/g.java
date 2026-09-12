package com.discord.chat.presentation.list;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeHelper f4105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4106c;

    public /* synthetic */ g(SwipeHelper swipeHelper, RecyclerView recyclerView, int i7) {
        this.f4104a = i7;
        this.f4105b = swipeHelper;
        this.f4106c = recyclerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4104a) {
            case 0:
                SwipeHelper.easterEggStartAnimation$lambda$6$lambda$5(this.f4105b, this.f4106c, valueAnimator);
                break;
            case 1:
                SwipeHelper.easterEggStartAnimation$lambda$9$lambda$7(this.f4105b, this.f4106c, valueAnimator);
                break;
            case 2:
                SwipeHelper.triggerEditExitTransition$lambda$2$lambda$0(this.f4105b, this.f4106c, valueAnimator);
                break;
            default:
                SwipeHelper.triggerEditEntranceTransition$lambda$4$lambda$3(this.f4105b, this.f4106c, valueAnimator);
                break;
        }
    }
}
