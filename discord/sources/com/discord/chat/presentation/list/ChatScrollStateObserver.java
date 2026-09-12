package com.discord.chat.presentation.list;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u001f B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0011\u001a\u00020\u0005J\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J \u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004J(\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/discord/chat/presentation/list/ChatScrollStateObserver;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "scrollStateUpdated", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/list/ScrollState;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "isWatching", "", "scrollStateInt", "", "scrollState", "chatListVisibilityCalculator", "Lcom/discord/chat/presentation/list/ChatListVisibilityCalculator;", "getChatListVisibilityCalculator$chat_release", "()Lcom/discord/chat/presentation/list/ChatListVisibilityCalculator;", "stopWatching", "startWatching", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "emitMode", "Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;", "onScrolled", "dx", "dy", "onScrollStateChanged", "newState", "getScrollState", "computeScrollState", "scrollAmountY", "EmitMode", "Thresholds", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChatScrollStateObserver extends RecyclerView.OnScrollListener {

    @NotNull
    private final ChatListVisibilityCalculator chatListVisibilityCalculator;
    private boolean isWatching;
    private ScrollState scrollState;
    private int scrollStateInt;

    @NotNull
    private final Function1<ScrollState, Unit> scrollStateUpdated;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;", "", "<init>", "(Ljava/lang/String;I)V", "YES", "NO", "IF_CHANGED", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum EmitMode {
        YES,
        NO,
        IF_CHANGED;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/presentation/list/ChatScrollStateObserver$Thresholds;", "", "<init>", "()V", "NEAR_TOP", "", "NEAR_BOTTOM", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Thresholds {

        @NotNull
        public static final Thresholds INSTANCE = new Thresholds();
        public static final int NEAR_BOTTOM = 5;
        public static final int NEAR_TOP = 15;

        private Thresholds() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatScrollStateObserver(@NotNull Function1<? super ScrollState, Unit> scrollStateUpdated) {
        Intrinsics.checkNotNullParameter(scrollStateUpdated, "scrollStateUpdated");
        this.scrollStateUpdated = scrollStateUpdated;
        this.chatListVisibilityCalculator = new ChatListVisibilityCalculator();
    }

    private final void computeScrollState(RecyclerView recyclerView, int scrollStateInt, int scrollAmountY, EmitMode emitMode) {
        ScrollDirection scrollDirection;
        if (this.isWatching) {
            this.scrollStateInt = scrollStateInt;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            boolean reverseLayout = linearLayoutManager.getReverseLayout();
            this.chatListVisibilityCalculator.updateFirstAndLastMessageVisibilityData(recyclerView);
            int firstMessagePosition = this.chatListVisibilityCalculator.getFirstMessagePosition();
            Double firstMessagePercentVisible = this.chatListVisibilityCalculator.getFirstMessagePercentVisible();
            int lastMessagePosition = this.chatListVisibilityCalculator.getLastMessagePosition();
            Double lastMessagePercentVisible = this.chatListVisibilityCalculator.getLastMessagePercentVisible();
            boolean z5 = firstMessagePosition == 0;
            boolean z6 = firstMessagePosition <= (reverseLayout ? 5 : 15);
            int itemCount = linearLayoutManager.getItemCount() - 1;
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            boolean z7 = iFindLastCompletelyVisibleItemPosition == itemCount && iFindLastCompletelyVisibleItemPosition >= 0;
            int i7 = itemCount - (reverseLayout ? 15 : 5);
            if (i7 < 0) {
                i7 = 0;
            }
            boolean z10 = i7 <= iFindLastCompletelyVisibleItemPosition && iFindLastCompletelyVisibleItemPosition <= itemCount;
            int i10 = this.scrollStateInt;
            boolean z11 = i10 == 1;
            boolean z12 = i10 == 2;
            if (scrollAmountY < 0) {
                scrollDirection = ScrollDirection.UP;
            } else {
                scrollDirection = scrollAmountY > 0 ? ScrollDirection.DOWN : null;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChannelChatListAdapter");
            int firstMessageItemPosition = ((ChannelChatListAdapter) adapter).getFirstMessageItemPosition();
            boolean z13 = firstMessageItemPosition <= linearLayoutManager.findLastVisibleItemPosition() && linearLayoutManager.findFirstVisibleItemPosition() <= firstMessageItemPosition;
            ScrollState scrollState = reverseLayout ? new ScrollState(z11, z12, z6, z5, z10, z7, scrollDirection, z13, lastMessagePosition, lastMessagePercentVisible, firstMessagePosition, firstMessagePercentVisible) : new ScrollState(z11, z12, z10, z7, z6, z5, scrollDirection, z13, firstMessagePosition, firstMessagePercentVisible, lastMessagePosition, lastMessagePercentVisible);
            boolean zAreEqual = Intrinsics.areEqual(this.scrollState, scrollState);
            this.scrollState = scrollState;
            if (emitMode == EmitMode.YES || (emitMode == EmitMode.IF_CHANGED && !zAreEqual)) {
                this.scrollStateUpdated.invoke(scrollState);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getChatListVisibilityCalculator$chat_release, reason: from getter */
    public final ChatListVisibilityCalculator getChatListVisibilityCalculator() {
        return this.chatListVisibilityCalculator;
    }

    public final ScrollState getScrollState() {
        return this.scrollState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        computeScrollState(recyclerView, newState, 0, EmitMode.IF_CHANGED);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        computeScrollState(recyclerView, this.scrollStateInt, dy, EmitMode.IF_CHANGED);
    }

    public final void startWatching(@NotNull RecyclerView recyclerView, @NotNull EmitMode emitMode) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(emitMode, "emitMode");
        this.isWatching = true;
        computeScrollState(recyclerView, this.scrollStateInt, 0, emitMode);
    }

    public final void stopWatching() {
        this.isWatching = false;
    }
}
