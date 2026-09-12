package com.discord.chat.presentation.message.view.media;

import android.view.View;
import android.view.ViewTreeObserver;
import com.discord.R;
import com.google.firebase.messaging.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "", "", "viewScrolling", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "queueScrollStop", "()V", "reset", "onScrollChanged", "Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "", "isScrollingDuration", "J", "Ljava/lang/Runnable;", "isScrollingStoppedRunnable", "Ljava/lang/Runnable;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewScrollStateListener implements ViewTreeObserver.OnScrollChangedListener {
    private final long isScrollingDuration;

    @NotNull
    private Runnable isScrollingStoppedRunnable;

    @NotNull
    private final View view;

    @NotNull
    private final Function1<Boolean, Unit> viewScrolling;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewScrollStateListener(@NotNull View view, @NotNull Function1<? super Boolean, Unit> viewScrolling) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewScrolling, "viewScrolling");
        this.view = view;
        this.viewScrolling = viewScrolling;
        this.isScrollingDuration = view.getResources().getInteger(R.integer.material_motion_duration_long_2);
        this.isScrollingStoppedRunnable = new s(19, this);
        queueScrollStop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isScrollingStoppedRunnable$lambda$0(ViewScrollStateListener viewScrollStateListener) {
        viewScrollStateListener.viewScrolling.invoke(Boolean.FALSE);
    }

    private final void queueScrollStop() {
        this.view.removeCallbacks(this.isScrollingStoppedRunnable);
        this.view.postDelayed(this.isScrollingStoppedRunnable, this.isScrollingDuration);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        this.viewScrolling.invoke(Boolean.TRUE);
        queueScrollStop();
    }

    public final void reset() {
        this.view.removeCallbacks(this.isScrollingStoppedRunnable);
    }
}
