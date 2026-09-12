package com.discord.misc.utilities.coroutines;

import android.content.ContextWrapper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.j0;
import com.discord.misc.utilities.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import wn.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a@\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroid/view/View;", "", "verifyAttached", "Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;", "attachedScope", "(Landroid/view/View;Z)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;", "Landroidx/lifecycle/LifecycleOwner;", "requireLifecycleOwner", "(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "block", "repeatOnLifecycleOwner", "(Landroid/view/View;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAttachedScope", "(Landroid/view/View;)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CoroutineViewUtilsKt {
    @NotNull
    public static final AttachedViewCoroutineScope attachedScope(@NotNull View view, boolean z5) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z5 && !view.isAttachedToWindow()) {
            throw new IllegalStateException(("View not attached to window: " + view).toString());
        }
        Object tag = view.getTag(R.id.view_coroutine_scope);
        AttachedViewCoroutineScope attachedViewCoroutineScope = tag instanceof AttachedViewCoroutineScope ? (AttachedViewCoroutineScope) tag : null;
        if (attachedViewCoroutineScope != null) {
            return attachedViewCoroutineScope;
        }
        AttachedViewCoroutineScope attachedViewCoroutineScope2 = new AttachedViewCoroutineScope(view);
        view.setTag(R.id.view_coroutine_scope, attachedViewCoroutineScope2);
        return attachedViewCoroutineScope2;
    }

    @NotNull
    public static final AttachedViewCoroutineScope getAttachedScope(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return attachedScope(view, false);
    }

    public static final Object repeatOnLifecycleOwner(@NotNull View view, @NotNull Lifecycle.State state, @NotNull Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        Object objA = j0.a(requireLifecycleOwner(view).getLifecycle(), state, function2, continuation);
        a aVar = a.f22354d;
        if (objA != aVar) {
            objA = Unit.f14616a;
        }
        return objA == aVar ? objA : Unit.f14616a;
    }

    @NotNull
    public static final LifecycleOwner requireLifecycleOwner(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (Object context = view.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof LifecycleOwner) {
                return (LifecycleOwner) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        throw new IllegalArgumentException("Failed to find LifecycleOwner for " + view);
    }
}
