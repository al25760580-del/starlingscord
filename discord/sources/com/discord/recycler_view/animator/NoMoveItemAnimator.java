package com.discord.recycler_view.animator;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.discord.recycler_view.scroll.DebouncedFlow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0010\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013JC\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0016\u0010!\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/discord/recycler_view/animator/NoMoveItemAnimator;", "Landroidx/recyclerview/widget/r;", "Lkotlin/Function0;", "", "onAnimationsStarted", "onAnimationsFinished", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "", "fromX", "fromY", "toX", "toY", "", "animateMove", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "animateRemove", "oldHolder", "newHolder", "fromLeft", "fromTop", "toLeft", "toTop", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "viewHolder", "onAnimationFinished", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "Lkotlin/jvm/functions/Function0;", "onAnimationFinishedEventPending", "Z", "Lcom/discord/recycler_view/scroll/DebouncedFlow;", "onAnimationsFinishedEvents", "Lcom/discord/recycler_view/scroll/DebouncedFlow;", "value", "activeAnimations", "I", "setActiveAnimations", "(I)V", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNoMoveItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoMoveItemAnimator.kt\ncom/discord/recycler_view/animator/NoMoveItemAnimator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public class NoMoveItemAnimator extends r {
    private int activeAnimations;
    private boolean onAnimationFinishedEventPending;
    private final Function0<Unit> onAnimationsFinished;

    @NotNull
    private final DebouncedFlow<Unit> onAnimationsFinishedEvents;
    private final Function0<Unit> onAnimationsStarted;

    /* JADX WARN: Multi-variable type inference failed */
    public NoMoveItemAnimator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAnimationsFinishedEvents$lambda$0(NoMoveItemAnimator noMoveItemAnimator, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function0<Unit> function0 = noMoveItemAnimator.onAnimationsFinished;
        if (function0 != null) {
            function0.invoke();
        }
        noMoveItemAnimator.onAnimationFinishedEventPending = false;
        return Unit.f14616a;
    }

    private final void setActiveAnimations(int i7) {
        if (i7 == 1 && this.activeAnimations == 0 && !this.onAnimationFinishedEventPending) {
            this.onAnimationFinishedEventPending = true;
            Function0<Unit> function0 = this.onAnimationsStarted;
            if (function0 != null) {
                function0.invoke();
            }
        }
        if (i7 == 0 && this.activeAnimations == 1) {
            this.onAnimationsFinishedEvents.tryEmit(Unit.f14616a);
        }
        this.activeAnimations = i7;
    }

    @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.l1
    public boolean animateAdd(RecyclerView.ViewHolder holder) {
        setActiveAnimations(this.activeAnimations + 1);
        super.animateAdd(holder);
        return true;
    }

    @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.l1
    public boolean animateChange(RecyclerView.ViewHolder oldHolder, RecyclerView.ViewHolder newHolder, int fromLeft, int fromTop, int toLeft, int toTop) {
        setActiveAnimations(this.activeAnimations + 1);
        return super.animateChange(oldHolder, newHolder, fromLeft, fromTop, toLeft, toTop);
    }

    @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.l1
    public boolean animateMove(RecyclerView.ViewHolder holder, int fromX, int fromY, int toX, int toY) {
        dispatchMoveFinished(holder);
        Unit unit = Unit.f14616a;
        return false;
    }

    @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.l1
    public boolean animateRemove(RecyclerView.ViewHolder holder) {
        setActiveAnimations(this.activeAnimations + 1);
        super.animateRemove(holder);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void onAnimationFinished(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        setActiveAnimations(this.activeAnimations - 1);
    }

    public /* synthetic */ NoMoveItemAnimator(Function0 function0, Function0 function1, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : function0, (i7 & 2) != 0 ? null : function1);
    }

    public NoMoveItemAnimator(Function0<Unit> function0, Function0<Unit> function1) {
        this.onAnimationsStarted = function0;
        this.onAnimationsFinished = function1;
        this.onAnimationsFinishedEvents = new DebouncedFlow<>(250L, new a(17, this), false);
    }
}
