package com.discord.recycler_view.scroller;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.crash_reporting.d;
import com.discord.recycler_view.utils.LayoutManagerUtilsKt;
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JN\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0015J\u0006\u0010\u0018\u001a\u00020\rJJ\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/recycler_view/scroller/Scroller;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;)V", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "currentSearch", "Ljava/lang/Runnable;", "scrollToPosition", "", ViewProps.POSITION, "", "targetAlignment", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "animate", "", "onStart", "Lkotlin/Function0;", "onComplete", "onScrollProgress", "cancel", "search", "iteration", "doScrollToPosition", "TargetAlignment", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Scroller {
    private Runnable currentSearch;

    @NotNull
    private final RecyclerView recyclerView;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "", "<init>", "()V", "Anywhere", "Center", "Top", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Anywhere;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Center;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Top;", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class TargetAlignment {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Anywhere;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Anywhere extends TargetAlignment {

            @NotNull
            public static final Anywhere INSTANCE = new Anywhere();

            private Anywhere() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Anywhere);
            }

            public int hashCode() {
                return 425096303;
            }

            @NotNull
            public String toString() {
                return "Anywhere";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Center;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Center extends TargetAlignment {

            @NotNull
            public static final Center INSTANCE = new Center();

            private Center() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Center);
            }

            public int hashCode() {
                return 232298313;
            }

            @NotNull
            public String toString() {
                return "Center";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Top;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "offsetPx", "", "<init>", "(I)V", "getOffsetPx", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Top extends TargetAlignment {
            private final int offsetPx;

            public Top(int i7) {
                super(null);
                this.offsetPx = i7;
            }

            public static /* synthetic */ Top copy$default(Top top, int i7, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    i7 = top.offsetPx;
                }
                return top.copy(i7);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getOffsetPx() {
                return this.offsetPx;
            }

            @NotNull
            public final Top copy(int offsetPx) {
                return new Top(offsetPx);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Top) && this.offsetPx == ((Top) other).offsetPx;
            }

            public final int getOffsetPx() {
                return this.offsetPx;
            }

            public int hashCode() {
                return Integer.hashCode(this.offsetPx);
            }

            @NotNull
            public String toString() {
                return g.d(this.offsetPx, "Top(offsetPx=", ")");
            }
        }

        public /* synthetic */ TargetAlignment(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TargetAlignment() {
        }
    }

    public Scroller(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.recyclerView = recyclerView;
        recyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.discord.recycler_view.scroller.Scroller.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v6) {
                Intrinsics.checkNotNullParameter(v6, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v6) {
                Intrinsics.checkNotNullParameter(v6, "v");
                Scroller.this.cancel();
            }
        });
    }

    private final void doScrollToPosition(int position, TargetAlignment targetAlignment) {
        if (targetAlignment instanceof TargetAlignment.Anywhere) {
            this.recyclerView.scrollToPosition(position);
        } else if (targetAlignment instanceof TargetAlignment.Center) {
            RecyclerViewExtensionsKt.scrollToCenter(this.recyclerView, position);
        } else {
            if (!(targetAlignment instanceof TargetAlignment.Top)) {
                throw new n();
            }
            RecyclerViewExtensionsKt.scrollToTop(this.recyclerView, position, ((TargetAlignment.Top) targetAlignment).getOffsetPx());
        }
    }

    private final LinearLayoutManager getLayoutManager() {
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return (LinearLayoutManager) layoutManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void scrollToPosition$default(Scroller scroller, int i7, TargetAlignment targetAlignment, boolean z5, Function0 function0, Function0 function1, Function0 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function0 = new d(27);
        }
        Function0 function3 = function0;
        if ((i10 & 16) != 0) {
            function1 = new d(28);
        }
        Function0 function4 = function1;
        if ((i10 & 32) != 0) {
            function2 = new d(29);
        }
        scroller.scrollToPosition(i7, targetAlignment, z5, function3, function4, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollToPosition$lambda$3(Function0 function0, Function0 function1) {
        function0.invoke();
        function1.invoke();
        return Unit.f14616a;
    }

    private final void search(final int position, final TargetAlignment targetAlignment, final Function0<Unit> onStart, final Function0<Unit> onComplete, final Function0<Unit> onScrollProgress, final int iteration) {
        Boolean boolIsPositionVisible = LayoutManagerUtilsKt.isPositionVisible(getLayoutManager(), position, iteration < 30);
        if (boolIsPositionVisible != null && !boolIsPositionVisible.booleanValue()) {
            doScrollToPosition(position, targetAlignment);
            onScrollProgress.invoke();
            Runnable runnable = new Runnable() { // from class: com.discord.recycler_view.scroller.a
                @Override // java.lang.Runnable
                public final void run() {
                    Scroller.search$lambda$4(this.f4559d, position, targetAlignment, onStart, onComplete, onScrollProgress, iteration);
                }
            };
            this.currentSearch = runnable;
            this.recyclerView.post(runnable);
            return;
        }
        if (!(targetAlignment instanceof TargetAlignment.Center) && !(targetAlignment instanceof TargetAlignment.Top)) {
            onComplete.invoke();
            return;
        }
        doScrollToPosition(position, targetAlignment);
        onScrollProgress.invoke();
        onComplete.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void search$lambda$4(Scroller scroller, int i7, TargetAlignment targetAlignment, Function0 function0, Function0 function1, Function0 function2, int i10) {
        scroller.search(i7, targetAlignment, function0, function1, function2, i10 + 1);
    }

    public final void cancel() {
        Runnable runnable = this.currentSearch;
        if (runnable != null) {
            this.recyclerView.removeCallbacks(runnable);
            this.currentSearch = null;
        }
    }

    public final void scrollToPosition(int position, @NotNull TargetAlignment targetAlignment, boolean animate, @NotNull Function0<Unit> onStart, @NotNull Function0<Unit> onComplete, @NotNull Function0<Unit> onScrollProgress) {
        Intrinsics.checkNotNullParameter(targetAlignment, "targetAlignment");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onScrollProgress, "onScrollProgress");
        cancel();
        onStart.invoke();
        if (animate) {
            RecyclerViewExtensionsKt.scrollToPositionAnimated(this.recyclerView, position, targetAlignment, new c6.a(16, onScrollProgress, onComplete));
        } else {
            search(position, targetAlignment, onStart, onComplete, onScrollProgress, 0);
        }
    }
}
