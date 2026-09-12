package com.discord.misc.utilities.coroutines;

import android.view.View;
import ar.b0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0012\u0010\f\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "cancelAllWork", "", "message", "", "cause", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "misc_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AttachedViewCoroutineScope implements CoroutineScope {
    private final /* synthetic */ CoroutineScope $$delegate_0;

    public AttachedViewCoroutineScope(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$$delegate_0 = MainImmediateScopeKt.MainImmediateScope();
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AttachedViewCoroutineScope.cancelAllWork$default(AttachedViewCoroutineScope.this, view2 + " detached from window", null, 2, null);
            }
        });
    }

    public static /* synthetic */ void cancelAllWork$default(AttachedViewCoroutineScope attachedViewCoroutineScope, String str, Throwable th2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th2 = null;
        }
        attachedViewCoroutineScope.cancelAllWork(str, th2);
    }

    public final void cancelAllWork(@NotNull String message, Throwable cause) {
        Intrinsics.checkNotNullParameter(message, "message");
        CoroutineContext coroutineContext = getCoroutineContext();
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        b0.h(coroutineContext, cancellationException);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
