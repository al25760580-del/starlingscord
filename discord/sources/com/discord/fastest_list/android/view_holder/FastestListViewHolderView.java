package com.discord.fastest_list.android.view_holder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.discord.emoji.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/discord/fastest_list/android/view_holder/FastestListViewHolderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "", "startViewTransition", "(Landroid/view/View;)V", "endViewTransition", "Lkotlin/Function1;", "", "onViewTransitioning", "Lkotlin/jvm/functions/Function1;", "getOnViewTransitioning", "()Lkotlin/jvm/functions/Function1;", "setOnViewTransitioning", "(Lkotlin/jvm/functions/Function1;)V", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class FastestListViewHolderView extends FrameLayout {

    @NotNull
    private Function1<? super Boolean, Unit> onViewTransitioning;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastestListViewHolderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onViewTransitioning = new a(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewTransitioning$lambda$0(boolean z5) {
        return Unit.f14616a;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        super.endViewTransition(view);
        this.onViewTransitioning.invoke(Boolean.FALSE);
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnViewTransitioning() {
        return this.onViewTransitioning;
    }

    public final void setOnViewTransitioning(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onViewTransitioning = function1;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        super.startViewTransition(view);
        this.onViewTransitioning.invoke(Boolean.TRUE);
    }
}
