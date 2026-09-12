package com.discord.recycler_view.scroll;

import androidx.recyclerview.widget.RecyclerView;
import kk.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001*Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0014J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR.\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR(\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/discord/recycler_view/scroll/DebouncedScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "", "timeoutMillis", "Lkotlin/Function3;", "Landroidx/recyclerview/widget/RecyclerView;", "", "", "onScrolled", "Lkotlin/Function2;", "onScrollStateChanged", "Lkotlin/Function1;", "", "onDragStateChanged", "<init>", "(JLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "newState", "checkDragState", "(I)V", "recyclerView", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "getTimeoutMillis", "()J", "setTimeoutMillis", "(J)V", "cancel", "()V", "J", "Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lcom/discord/recycler_view/scroll/DebouncedScrollListener$ScrollEvent;", "lastScrollEvent", "Lcom/discord/recycler_view/scroll/DebouncedScrollListener$ScrollEvent;", "isDragging", "Z", "Lcom/discord/recycler_view/scroll/DebouncedFlow;", "scrollEvents", "Lcom/discord/recycler_view/scroll/DebouncedFlow;", "ScrollEvent", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DebouncedScrollListener extends RecyclerView.OnScrollListener {
    private boolean isDragging;
    private ScrollEvent lastScrollEvent;
    private final Function1<Boolean, Unit> onDragStateChanged;
    private final Function2<RecyclerView, Integer, Unit> onScrollStateChanged;
    private final Function3 onScrolled;

    @NotNull
    private DebouncedFlow<ScrollEvent> scrollEvents;
    private long timeoutMillis;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/discord/recycler_view/scroll/DebouncedScrollListener$ScrollEvent;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "getDx", "()I", "setDx", "(I)V", "getDy", "setDy", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ScrollEvent {
        private int dx;
        private int dy;

        @NotNull
        private RecyclerView recyclerView;

        public ScrollEvent(@NotNull RecyclerView recyclerView, int i7, int i10) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            this.recyclerView = recyclerView;
            this.dx = i7;
            this.dy = i10;
        }

        public static /* synthetic */ ScrollEvent copy$default(ScrollEvent scrollEvent, RecyclerView recyclerView, int i7, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                recyclerView = scrollEvent.recyclerView;
            }
            if ((i11 & 2) != 0) {
                i7 = scrollEvent.dx;
            }
            if ((i11 & 4) != 0) {
                i10 = scrollEvent.dy;
            }
            return scrollEvent.copy(recyclerView, i7, i10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RecyclerView getRecyclerView() {
            return this.recyclerView;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDx() {
            return this.dx;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getDy() {
            return this.dy;
        }

        @NotNull
        public final ScrollEvent copy(@NotNull RecyclerView recyclerView, int dx, int dy) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            return new ScrollEvent(recyclerView, dx, dy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrollEvent)) {
                return false;
            }
            ScrollEvent scrollEvent = (ScrollEvent) other;
            return Intrinsics.areEqual(this.recyclerView, scrollEvent.recyclerView) && this.dx == scrollEvent.dx && this.dy == scrollEvent.dy;
        }

        public final int getDx() {
            return this.dx;
        }

        public final int getDy() {
            return this.dy;
        }

        @NotNull
        public final RecyclerView getRecyclerView() {
            return this.recyclerView;
        }

        public int hashCode() {
            return Integer.hashCode(this.dy) + com.discord.chat.presentation.list.a.u(this.dx, this.recyclerView.hashCode() * 31, 31);
        }

        public final void setDx(int i7) {
            this.dx = i7;
        }

        public final void setDy(int i7) {
            this.dy = i7;
        }

        public final void setRecyclerView(@NotNull RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
            this.recyclerView = recyclerView;
        }

        @NotNull
        public String toString() {
            RecyclerView recyclerView = this.recyclerView;
            int i7 = this.dx;
            int i10 = this.dy;
            StringBuilder sb2 = new StringBuilder("ScrollEvent(recyclerView=");
            sb2.append(recyclerView);
            sb2.append(", dx=");
            sb2.append(i7);
            sb2.append(", dy=");
            return b.l(sb2, i10, ")");
        }
    }

    public /* synthetic */ DebouncedScrollListener(long j, Function3 function3, Function2 function2, Function1 function1, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, function3, (i7 & 4) != 0 ? null : function2, (i7 & 8) != 0 ? null : function1);
    }

    private final void checkDragState(int newState) {
        if (newState == 1) {
            if (this.isDragging) {
                return;
            }
            this.isDragging = true;
            Function1<Boolean, Unit> function1 = this.onDragStateChanged;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        if (newState == 2 && this.isDragging) {
            this.isDragging = false;
            Function1<Boolean, Unit> function2 = this.onDragStateChanged;
            if (function2 != null) {
                function2.invoke(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollEvents$lambda$0(DebouncedScrollListener debouncedScrollListener, ScrollEvent scrollEvent) {
        Intrinsics.checkNotNullParameter(scrollEvent, "<destruct>");
        RecyclerView recyclerView = scrollEvent.getRecyclerView();
        int dx = scrollEvent.getDx();
        int dy = scrollEvent.getDy();
        Function3 function3 = debouncedScrollListener.onScrolled;
        if (function3 != null) {
            function3.invoke(recyclerView, Integer.valueOf(dx), Integer.valueOf(dy));
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTimeoutMillis$lambda$1(DebouncedScrollListener debouncedScrollListener, ScrollEvent scrollEvent) {
        Intrinsics.checkNotNullParameter(scrollEvent, "<destruct>");
        RecyclerView recyclerView = scrollEvent.getRecyclerView();
        int dx = scrollEvent.getDx();
        int dy = scrollEvent.getDy();
        Function3 function3 = debouncedScrollListener.onScrolled;
        if (function3 != null) {
            function3.invoke(recyclerView, Integer.valueOf(dx), Integer.valueOf(dy));
        }
        return Unit.f14616a;
    }

    public final void cancel() {
        this.scrollEvents.cancel();
    }

    public final long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, newState);
        Function2<RecyclerView, Integer, Unit> function2 = this.onScrollStateChanged;
        if (function2 != null) {
            function2.invoke(recyclerView, Integer.valueOf(newState));
        }
        checkDragState(newState);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        ScrollEvent scrollEvent = this.lastScrollEvent;
        ScrollEvent scrollEvent2 = null;
        if (scrollEvent == null) {
            this.lastScrollEvent = new ScrollEvent(recyclerView, dx, dy);
        } else {
            if (scrollEvent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastScrollEvent");
                scrollEvent = null;
            }
            scrollEvent.setRecyclerView(recyclerView);
            ScrollEvent scrollEvent3 = this.lastScrollEvent;
            if (scrollEvent3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastScrollEvent");
                scrollEvent3 = null;
            }
            scrollEvent3.setDx(dx);
            ScrollEvent scrollEvent4 = this.lastScrollEvent;
            if (scrollEvent4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastScrollEvent");
                scrollEvent4 = null;
            }
            scrollEvent4.setDy(dy);
        }
        DebouncedFlow<ScrollEvent> debouncedFlow = this.scrollEvents;
        ScrollEvent scrollEvent5 = this.lastScrollEvent;
        if (scrollEvent5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lastScrollEvent");
        } else {
            scrollEvent2 = scrollEvent5;
        }
        debouncedFlow.tryEmit(scrollEvent2);
    }

    public final void setTimeoutMillis(long timeoutMillis) {
        this.timeoutMillis = timeoutMillis;
        this.scrollEvents.cancel();
        this.scrollEvents = new DebouncedFlow<>(timeoutMillis, new a(this, 1), false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DebouncedScrollListener(long j, Function3 function3, Function2<? super RecyclerView, ? super Integer, Unit> function2, Function1<? super Boolean, Unit> function1) {
        this.timeoutMillis = j;
        this.onScrolled = function3;
        this.onScrollStateChanged = function2;
        this.onDragStateChanged = function1;
        this.scrollEvents = new DebouncedFlow<>(j, new a(this, 0), false, 4, null);
    }
}
