package com.discord.recycler_view.utils;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\fR\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015JS\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u000e\u001a\u00060\fR\u00020\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u00022\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060\fR\u00020\r\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010 \u001a\u00020\t2\n\u0010\u000e\u001a\u00060\fR\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\u0016\u0010\u001f\u001a\u0012\u0012\b\u0012\u00060\fR\u00020\r\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b \u0010!JS\u0010&\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\n\u0010\u000e\u001a\u00060\fR\u00020\r2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u00022\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\b\u0012\u00060\fR\u00020\r\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0004\b&\u0010'J?\u0010+\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\fR\u00020\r2\u0006\u0010)\u001a\u00020(2\u001c\u0010*\u001a\u0018\u0012\b\u0012\u00060\fR\u00020\r\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\fR\u00020\r¢\u0006\u0004\b-\u0010.R(\u0010\u0005\u001a\u0016\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00100¨\u00061"}, d2 = {"Lcom/discord/recycler_view/utils/TransitionResilientRecyclingDelegate;", "", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onModifyCapturedException", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "e", "", "captureException", "(Ljava/lang/Exception;)V", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "", "breadcrumbContext", "collectAndDeferRecyclingFromScrap", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Ljava/lang/String;)V", "", "disableRecycling", "(Z)V", "Landroid/view/View;", "child", "fallbackRemoveView", "Lkotlin/Function2;", "superRemoveAndRecycleView", "safeRemoveAndRecycleView", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$Recycler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function0;", "fallbackRemoveAllViews", "superRemoveAndRecycleAllViews", "safeRemoveAndRecycleAllViews", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "index", "fallbackRemoveViewAt", "superRemoveAndRecycleViewAt", "safeRemoveAndRecycleViewAt", "(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "superOnLayoutChildren", "handleOnLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lkotlin/jvm/functions/Function2;)V", "deferRecyclingFromScrap", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V", "Lkotlin/jvm/functions/Function1;", "Z", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransitionResilientRecyclingDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionResilientRecyclingDelegate.kt\ncom/discord/recycler_view/utils/TransitionResilientRecyclingDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,174:1\n1869#2:175\n1870#2:191\n119#3,15:176\n*S KotlinDebug\n*F\n+ 1 TransitionResilientRecyclingDelegate.kt\ncom/discord/recycler_view/utils/TransitionResilientRecyclingDelegate\n*L\n107#1:175\n107#1:191\n108#1:176,15\n*E\n"})
public final class TransitionResilientRecyclingDelegate {
    private boolean disableRecycling;

    @NotNull
    private final Function1<Exception, Exception> onModifyCapturedException;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionResilientRecyclingDelegate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Exception _init_$lambda$0(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void captureException(Exception e10) {
        CrashReporting.captureException$default(CrashReporting.INSTANCE, (Throwable) this.onModifyCapturedException.invoke(e10), false, 2, null);
    }

    private final void collectAndDeferRecyclingFromScrap(RecyclerView.Recycler recycler, String breadcrumbContext) {
        final RecyclerView.Recycler recycler2;
        final String str;
        List list = recycler.f2506d;
        Intrinsics.checkNotNullExpressionValue(list, "getScrapList(...)");
        ArrayList<View> arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            View itemView = ((RecyclerView.ViewHolder) list.get(size)).itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            arrayList.add(itemView);
        }
        recycler.b();
        for (final View view : arrayList) {
            if (view.isAttachedToWindow()) {
                recycler2 = recycler;
                str = breadcrumbContext;
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.discord.recycler_view.utils.TransitionResilientRecyclingDelegate$collectAndDeferRecyclingFromScrap$lambda$2$$inlined$doOnDetach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view2) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        ThreadUtilsKt.getUiHandler().post(new TransitionResilientRecyclingDelegate$collectAndDeferRecyclingFromScrap$1$1$1(view, recycler2, str, this));
                    }
                });
            } else {
                ThreadUtilsKt.getUiHandler().post(new TransitionResilientRecyclingDelegate$collectAndDeferRecyclingFromScrap$1$1$1(view, recycler, breadcrumbContext, this));
                recycler2 = recycler;
                str = breadcrumbContext;
            }
            recycler = recycler2;
            breadcrumbContext = str;
        }
    }

    public static /* synthetic */ void collectAndDeferRecyclingFromScrap$default(TransitionResilientRecyclingDelegate transitionResilientRecyclingDelegate, RecyclerView.Recycler recycler, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = "";
        }
        transitionResilientRecyclingDelegate.collectAndDeferRecyclingFromScrap(recycler, str);
    }

    public final void deferRecyclingFromScrap(@NotNull RecyclerView.Recycler recycler) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        if (this.disableRecycling) {
            collectAndDeferRecyclingFromScrap(recycler, " in detachAndScrapAttachedViews");
        }
    }

    public final void disableRecycling(boolean disableRecycling) {
        this.disableRecycling = disableRecycling;
    }

    public final void handleOnLayoutChildren(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state, @NotNull Function2<? super RecyclerView.Recycler, ? super RecyclerView.State, Unit> superOnLayoutChildren) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(superOnLayoutChildren, "superOnLayoutChildren");
        if (!this.disableRecycling) {
            superOnLayoutChildren.invoke(recycler, state);
            return;
        }
        collectAndDeferRecyclingFromScrap(recycler, " in onLayoutChildren (before layout)");
        superOnLayoutChildren.invoke(recycler, state);
        collectAndDeferRecyclingFromScrap(recycler, " in onLayoutChildren (after layout)");
    }

    public final void safeRemoveAndRecycleAllViews(@NotNull RecyclerView.Recycler recycler, @NotNull Function0<Unit> fallbackRemoveAllViews, @NotNull Function1<? super RecyclerView.Recycler, Unit> superRemoveAndRecycleAllViews) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(fallbackRemoveAllViews, "fallbackRemoveAllViews");
        Intrinsics.checkNotNullParameter(superRemoveAndRecycleAllViews, "superRemoveAndRecycleAllViews");
        try {
            if (this.disableRecycling) {
                fallbackRemoveAllViews.invoke();
            } else {
                superRemoveAndRecycleAllViews.invoke(recycler);
            }
        } catch (Exception e10) {
            captureException(e10);
        }
    }

    public final void safeRemoveAndRecycleView(@NotNull View child, @NotNull RecyclerView.Recycler recycler, @NotNull Function1<? super View, Unit> fallbackRemoveView, @NotNull Function2<? super View, ? super RecyclerView.Recycler, Unit> superRemoveAndRecycleView) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(fallbackRemoveView, "fallbackRemoveView");
        Intrinsics.checkNotNullParameter(superRemoveAndRecycleView, "superRemoveAndRecycleView");
        try {
            if (this.disableRecycling) {
                fallbackRemoveView.invoke(child);
            } else {
                superRemoveAndRecycleView.invoke(child, recycler);
            }
        } catch (Exception e10) {
            captureException(e10);
        }
    }

    public final void safeRemoveAndRecycleViewAt(int index, @NotNull RecyclerView.Recycler recycler, @NotNull Function1<? super Integer, Unit> fallbackRemoveViewAt, @NotNull Function2<? super Integer, ? super RecyclerView.Recycler, Unit> superRemoveAndRecycleViewAt) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(fallbackRemoveViewAt, "fallbackRemoveViewAt");
        Intrinsics.checkNotNullParameter(superRemoveAndRecycleViewAt, "superRemoveAndRecycleViewAt");
        try {
            if (this.disableRecycling) {
                fallbackRemoveViewAt.invoke(Integer.valueOf(index));
            } else {
                superRemoveAndRecycleViewAt.invoke(Integer.valueOf(index), recycler);
            }
        } catch (Exception e10) {
            captureException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionResilientRecyclingDelegate(@NotNull Function1<? super Exception, ? extends Exception> onModifyCapturedException) {
        Intrinsics.checkNotNullParameter(onModifyCapturedException, "onModifyCapturedException");
        this.onModifyCapturedException = onModifyCapturedException;
    }

    public /* synthetic */ TransitionResilientRecyclingDelegate(Function1 function1, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? new com.discord.emoji.a(27) : function1);
    }
}
