package com.discord.chat.presentation.message.view.media;

import android.view.View;
import android.view.ViewTreeObserver;
import com.discord.R;
import com.google.firebase.messaging.s;
import i6.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "", "", "viewAttached", "viewScrolling", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "", "isAttachedDelay", "J", "Ljava/lang/Runnable;", "isAttachedRunnable", "Ljava/lang/Runnable;", "Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;", "scrollStateListener$delegate", "Lkotlin/Lazy;", "getScrollStateListener", "()Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;", "scrollStateListener", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewAttachedListener implements View.OnAttachStateChangeListener {
    private final long isAttachedDelay;

    @NotNull
    private Runnable isAttachedRunnable;

    /* JADX INFO: renamed from: scrollStateListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scrollStateListener;

    @NotNull
    private final View view;

    @NotNull
    private final Function1<Boolean, Unit> viewAttached;

    @NotNull
    private final Function1<Boolean, Unit> viewScrolling;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewAttachedListener(@NotNull View view, @NotNull Function1<? super Boolean, Unit> viewAttached, @NotNull Function1<? super Boolean, Unit> viewScrolling) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewAttached, "viewAttached");
        Intrinsics.checkNotNullParameter(viewScrolling, "viewScrolling");
        this.view = view;
        this.viewAttached = viewAttached;
        this.viewScrolling = viewScrolling;
        this.isAttachedDelay = view.getResources().getInteger(R.integer.material_motion_duration_short_1);
        this.isAttachedRunnable = new s(18, this);
        this.scrollStateListener = l.b(new a(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(boolean z5) {
        return Unit.f14616a;
    }

    private final ViewScrollStateListener getScrollStateListener() {
        return (ViewScrollStateListener) this.scrollStateListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isAttachedRunnable$lambda$1(ViewAttachedListener viewAttachedListener) {
        viewAttachedListener.viewAttached.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewScrollStateListener scrollStateListener_delegate$lambda$2(ViewAttachedListener viewAttachedListener) {
        return new ViewScrollStateListener(viewAttachedListener.view, viewAttachedListener.viewScrolling);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.postDelayed(this.isAttachedRunnable, this.isAttachedDelay);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnScrollChangedListener(getScrollStateListener());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeCallbacks(this.isAttachedRunnable);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewScrollStateListener scrollStateListener = getScrollStateListener();
            scrollStateListener.reset();
            viewTreeObserver.removeOnScrollChangedListener(scrollStateListener);
        }
        this.viewAttached.invoke(Boolean.FALSE);
    }

    public /* synthetic */ ViewAttachedListener(View view, Function1 function1, Function1 function2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, function1, (i7 & 4) != 0 ? new f6.a(11) : function2);
    }
}
