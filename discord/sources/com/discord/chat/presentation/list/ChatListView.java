package com.discord.chat.presentation.list;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ar.b0;
import co.s;
import com.discord.chat.listmanager.ChatListAction;
import com.discord.chat.listmanager.ChatListUpdate;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.PortalViewChatListItem;
import com.discord.chat.presentation.list.item.SeparatorChatListItem;
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.crash_reporting.CrashReporting;
import com.discord.device.views.DiscordRecyclerView;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.recycler_view.scroller.Scroller;
import com.discord.recycler_view.utils.TransitionResilientLinearLayoutManager;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.ViewProps;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import rn.n;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002DEB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u000e\u0010'\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0003J\b\u0010+\u001a\u00020\u0010H\u0014J\b\u0010,\u001a\u00020\u0010H\u0014J\b\u0010/\u001a\u00020\u0010H\u0002J\u0010\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u000bH\u0007J\u0010\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u000bH\u0007J\u0010\u00104\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u00105\u001a\u00020\u0010H\u0007J(\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000bH\u0007J&\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020%2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u00010?H\u0007J\b\u0010@\u001a\u00020\u0010H\u0002J\b\u0010A\u001a\u00020\u0010H\u0002J\b\u0010B\u001a\u00020\u0010H\u0003J\b\u0010C\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/discord/chat/presentation/list/ChatListView;", "Lcom/discord/device/views/DiscordRecyclerView;", "context", "Landroid/content/Context;", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "<init>", "(Landroid/content/Context;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;)V", "dataSource", "Lcom/discord/chat/presentation/list/ChatListView$DataSource;", "floatingTreatmentEnabled", "", "chatListAdapter", "Lcom/discord/chat/presentation/list/ChannelChatListAdapter;", "value", "Lkotlin/Function0;", "", "onFirstDrawDoneCallback", "getOnFirstDrawDoneCallback", "()Lkotlin/jvm/functions/Function0;", "setOnFirstDrawDoneCallback", "(Lkotlin/jvm/functions/Function0;)V", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "scroller", "Lcom/discord/recycler_view/scroller/Scroller;", "linearLayoutManager", "Lcom/discord/recycler_view/utils/TransitionResilientLinearLayoutManager;", "verticalSpacingItemDecoration", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration;", "currentChangesetUpdateId", "", "scrollStateObserver", "Lcom/discord/chat/presentation/list/ChatScrollStateObserver;", "isFirstLayout", "startViewTransition", "view", "Landroid/view/View;", "endViewTransition", "setDataSource", "onChatListUpdate", "update", "Lcom/discord/chat/listmanager/ChatListUpdate;", "onAttachedToWindow", "onDetachedFromWindow", "updateSubscriptionJob", "Lkotlinx/coroutines/Job;", BaseJavaModule.METHOD_TYPE_SYNC, "setInverted", "inverted", "setFloatingChatInputEnabled", ViewProps.ENABLED, "setEventHandler", "cleanup", "scrollToPosition", ViewProps.POSITION, "targetAlignment", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "animate", "highlight", "setPortalView", "portalView", "measuredDimensions", "Lkotlin/Pair;", "addScrollStateListener", "removeScrollStateListener", "forceRecreateAllViewHolders", "measureAndLayout", "DataSource", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nChatListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListView.kt\ncom/discord/chat/presentation/list/ChatListView\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,429:1\n17#2,5:430\n37#3,2:435\n55#3:437\n*S KotlinDebug\n*F\n+ 1 ChatListView.kt\ncom/discord/chat/presentation/list/ChatListView\n*L\n128#1:430,5\n246#1:435,2\n246#1:437\n*E\n"})
public final class ChatListView extends DiscordRecyclerView {

    @NotNull
    private ChannelChatListAdapter chatListAdapter;

    @NotNull
    private final ComponentProvider componentProvider;
    private int currentChangesetUpdateId;
    private DataSource dataSource;
    private ChatEventHandler eventHandler;
    private boolean floatingTreatmentEnabled;
    private boolean isFirstLayout;

    @NotNull
    private final TransitionResilientLinearLayoutManager linearLayoutManager;

    @NotNull
    private Function0<Unit> onFirstDrawDoneCallback;

    @NotNull
    private final ChatScrollStateObserver scrollStateObserver;

    @NotNull
    private final Scroller scroller;
    private Job updateSubscriptionJob;

    @NotNull
    private final VerticalSpacingItemDecoration verticalSpacingItemDecoration;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MESSAGE_TOP_SCROLL_OFFSET_PX = SizeUtilsKt.getDpToPx(30) + SizeUtilsKt.getDpToPx(40);
    private static final int BASE_END_ITEM_SPACING_PX = SizeUtilsKt.getDpToPx(30);
    private static final int FLOATING_END_ITEM_SPACING_PX = SizeUtilsKt.getDpToPx(58);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/list/ChatListView$Companion;", "", "<init>", "()V", "MESSAGE_TOP_SCROLL_OFFSET_PX", "", "getMESSAGE_TOP_SCROLL_OFFSET_PX", "()I", "BASE_END_ITEM_SPACING_PX", "FLOATING_END_ITEM_SPACING_PX", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getMESSAGE_TOP_SCROLL_OFFSET_PX() {
            return ChatListView.MESSAGE_TOP_SCROLL_OFFSET_PX;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/presentation/list/ChatListView$DataSource;", "", "updatesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/discord/chat/listmanager/ChatListUpdate;", "getUpdatesFlow", "()Lkotlinx/coroutines/flow/Flow;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface DataSource {
        @NotNull
        Flow getUpdatesFlow();
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.list.ChatListView$sync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.presentation.list.ChatListView$sync$1", f = "ChatListView.kt", l = {270}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatListView.this.new AnonymousClass1(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                DataSource dataSource = ChatListView.this.dataSource;
                if (dataSource == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dataSource");
                    dataSource = null;
                }
                Flow updatesFlow = dataSource.getUpdatesFlow();
                final ChatListView chatListView = ChatListView.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.list.ChatListView.sync.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(ChatListUpdate chatListUpdate, Continuation continuation) {
                        if (booleanRef.element) {
                            chatListView.onChatListUpdate(ChatListUpdate.copy$default(chatListUpdate, null, null, null, 0, null, 27, null));
                            booleanRef.element = false;
                        } else {
                            chatListView.onChatListUpdate(chatListUpdate);
                        }
                        return Unit.f14616a;
                    }
                };
                this.label = 1;
                if (updatesFlow.collect(flowCollector, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView(@NotNull Context context, @NotNull ComponentProvider componentProvider) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        this.componentProvider = componentProvider;
        int i7 = 4;
        this.chatListAdapter = new ChannelChatListAdapter(new d(this, 0), new d(this, 3), new d(this, i7), null, 8, null);
        this.onFirstDrawDoneCallback = new com.discord.chat.bridge.contentnode.a(29);
        this.scroller = new Scroller(this);
        TransitionResilientLinearLayoutManager transitionResilientLinearLayoutManager = new TransitionResilientLinearLayoutManager(context, 0, false, null, 14, null);
        this.linearLayoutManager = transitionResilientLinearLayoutManager;
        VerticalSpacingItemDecoration verticalSpacingItemDecoration = new VerticalSpacingItemDecoration(SizeUtilsKt.getDpToPx(16), SizeUtilsKt.getDpToPx(16), BASE_END_ITEM_SPACING_PX, false, 8, null);
        this.verticalSpacingItemDecoration = verticalSpacingItemDecoration;
        this.scrollStateObserver = new ChatScrollStateObserver(new s(i7, this));
        this.isFirstLayout = true;
        setRecycledViewPool(SharedRecycledViewPools.INSTANCE.getChatListViewPool());
        ChatListUtilsKt.configureMessageRecyclerView(this, context, verticalSpacingItemDecoration);
        setLayoutManager(transitionResilientLinearLayoutManager);
        setAdapter(this.chatListAdapter);
        addScrollStateListener();
        this.chatListAdapter.fillAdapter(this);
        setItemAnimator(null);
        new ChatListItemTouchHelper(new SwipeHelper(context, new d(this, 5), new d(this, 6))).attachToRecyclerView(this);
        setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$5(ChatListView chatListView) {
        chatListView.setClipToPadding(false);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$6(ChatListView chatListView) {
        if (!chatListView.floatingTreatmentEnabled) {
            chatListView.setClipToPadding(true);
        }
        return Unit.f14616a;
    }

    private final void addScrollStateListener() {
        addOnScrollListener(this.scrollStateObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit chatListAdapter$lambda$0(ChatListView chatListView) throws IllegalAccessException, NoSuchFieldException {
        chatListView.measureAndLayout();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatEventHandler chatListAdapter$lambda$1(ChatListView chatListView) {
        ChatEventHandler chatEventHandler = chatListView.eventHandler;
        if (chatEventHandler != null) {
            return chatEventHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forceRecreateAllViewHolders() {
        PortalViewChatListItem portalChatListItem = this.chatListAdapter.getPortalChatListItem();
        this.chatListAdapter.onHostDetached();
        setAdapter(null);
        setItemViewCacheSize(0);
        SharedRecycledViewPools sharedRecycledViewPools = SharedRecycledViewPools.INSTANCE;
        sharedRecycledViewPools.getChatListViewPool().forceClear();
        sharedRecycledViewPools.getAccessoriesViewPool().forceClear();
        this.chatListAdapter = new ChannelChatListAdapter(new d(this, 7), new d(this, 8), new d(this, 9), this.onFirstDrawDoneCallback);
        setItemViewCacheSize(5);
        setAdapter(this.chatListAdapter);
        if (portalChatListItem != null) {
            this.chatListAdapter.setPortalView(portalChatListItem.getView(), portalChatListItem.getMeasuredDimensions());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit forceRecreateAllViewHolders$lambda$12(ChatListView chatListView) throws IllegalAccessException, NoSuchFieldException {
        chatListView.measureAndLayout();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatEventHandler forceRecreateAllViewHolders$lambda$13(ChatListView chatListView) {
        ChatEventHandler chatEventHandler = chatListView.eventHandler;
        if (chatEventHandler != null) {
            return chatEventHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
        return null;
    }

    private final void measureAndLayout() throws IllegalAccessException, NoSuchFieldException {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type android.view.View");
            ViewMeasureExtensionsKt.measureAndLayout(this);
        } catch (IllegalArgumentException e10) {
            Field declaredField = RecyclerView.class.getDeclaredField("mState");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "About to crash because of ChatList, dumping update log:\n" + ChatListAdapterUpdateLog.INSTANCE + "\n Recycler State: " + obj, null, null, null, false, 30, null);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChatListUpdate(final ChatListUpdate update) {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        if (Intrinsics.areEqual(update.getForceReload(), Boolean.TRUE)) {
            forceRecreateAllViewHolders();
        }
        if (update.getAction() instanceof ChatListAction.Clear) {
            this.isFirstLayout = true;
        }
        this.currentChangesetUpdateId = update.getChangesetUpdateId();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ChannelChatListAdapter.setItems$default(this.chatListAdapter, update.getItems(), update.getListOperations(), new Function1<Boolean, Unit>() { // from class: com.discord.chat.presentation.list.ChatListView$onChatListUpdate$1$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.f14616a;
            }

            public final void invoke(boolean z5) {
                Ref.BooleanRef booleanRef2 = booleanRef;
                ScrollState scrollState = this.scrollStateObserver.getScrollState();
                boolean z6 = false;
                if (scrollState != null && scrollState.isAtBottom()) {
                    z6 = true;
                }
                booleanRef2.element = z6;
                if (update.getAction() instanceof ChatListAction.Clear) {
                    this.scrollStateObserver.stopWatching();
                    if (z5) {
                        return;
                    }
                    this.removeAllViews();
                }
            }
        }, new Function0<Unit>() { // from class: com.discord.chat.presentation.list.ChatListView$onChatListUpdate$1$2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m529invoke();
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m529invoke() {
                if (!(update.getAction() instanceof ChatListAction.Clear)) {
                    this.scrollStateObserver.startWatching(this, ChatScrollStateObserver.EmitMode.NO);
                    this.scrollStateObserver.getChatListVisibilityCalculator().updateFirstAndLastMessageVisibilityData(this);
                    int firstMessagePosition = this.scrollStateObserver.getChatListVisibilityCalculator().getFirstMessagePosition();
                    Double firstMessagePercentVisible = this.scrollStateObserver.getChatListVisibilityCalculator().getFirstMessagePercentVisible();
                    int lastMessagePosition = this.scrollStateObserver.getChatListVisibilityCalculator().getLastMessagePosition();
                    Double lastMessagePercentVisible = this.scrollStateObserver.getChatListVisibilityCalculator().getLastMessagePercentVisible();
                    if (this.isFirstLayout && firstMessagePosition >= 0 && lastMessagePosition >= 0) {
                        this.isFirstLayout = false;
                        ChatEventHandler chatEventHandler = null;
                        if (this.linearLayoutManager.getReverseLayout()) {
                            ChatEventHandler chatEventHandler2 = this.eventHandler;
                            if (chatEventHandler2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                            } else {
                                chatEventHandler = chatEventHandler2;
                            }
                            chatEventHandler.onFirstLayout(lastMessagePosition, lastMessagePercentVisible, firstMessagePosition, firstMessagePercentVisible);
                        } else {
                            ChatEventHandler chatEventHandler3 = this.eventHandler;
                            if (chatEventHandler3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                            } else {
                                chatEventHandler = chatEventHandler3;
                            }
                            chatEventHandler.onFirstLayout(firstMessagePosition, firstMessagePercentVisible, lastMessagePosition, lastMessagePercentVisible);
                        }
                    }
                }
                ChatListAction action = update.getAction();
                if (action instanceof ChatListAction.ScrollTo) {
                    ChatListItem chatListItem = (ChatListItem) CollectionsKt.M(((ChatListAction.ScrollTo) update.getAction()).getPosition(), update.getItems());
                    Scroller.TargetAlignment top = ((chatListItem instanceof SeparatorChatListItem) || !(chatListItem instanceof SummarySeparatorChatListItem) || ((SummarySeparatorChatListItem) chatListItem).isBeforeContent()) ? new Scroller.TargetAlignment.Top(ChatListView.INSTANCE.getMESSAGE_TOP_SCROLL_OFFSET_PX()) : Scroller.TargetAlignment.Center.INSTANCE;
                    this.scrollToPosition(((ChatListAction.ScrollTo) update.getAction()).getPosition(), top, ((ChatListAction.ScrollTo) update.getAction()).getAnimate(), ((ChatListAction.ScrollTo) update.getAction()).getHighlight());
                } else if (action instanceof ChatListAction.StickToBottomIfAtBottom) {
                    if (booleanRef.element) {
                        this.scrollToPosition(0, Scroller.TargetAlignment.Anywhere.INSTANCE, false, false);
                    }
                } else {
                    if (action instanceof ChatListAction.Clear) {
                        return;
                    }
                    if (!(action instanceof ChatListAction.Noop)) {
                        throw new n();
                    }
                    this.scrollStateObserver.startWatching(this, ChatScrollStateObserver.EmitMode.YES);
                }
            }
        }, null, 16, null);
    }

    private final void removeScrollStateListener() {
        removeOnScrollListener(this.scrollStateObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollStateObserver$lambda$4(ChatListView chatListView, ScrollState scrollState) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        ChatEventHandler chatEventHandler = chatListView.eventHandler;
        if (chatEventHandler != null) {
            if (chatEventHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler = null;
            }
            chatEventHandler.onScrollStateChanged(scrollState, chatListView.currentChangesetUpdateId);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollToPosition$lambda$10(ChatListView chatListView, boolean z5, int i7) {
        View viewFindViewByPosition;
        chatListView.scrollStateObserver.startWatching(chatListView, ChatScrollStateObserver.EmitMode.YES);
        if (z5) {
            ChatListHighlightItemAtPositionKt.chatListHighlightItemAtPosition$default(chatListView, i7, 0L, 2, null);
            RecyclerView.LayoutManager layoutManager = chatListView.getLayoutManager();
            if (layoutManager != null && (viewFindViewByPosition = layoutManager.findViewByPosition(i7)) != null) {
                viewFindViewByPosition.sendAccessibilityEvent(8);
            }
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollToPosition$lambda$11(ChatListView chatListView) throws IllegalAccessException, NoSuchFieldException {
        chatListView.measureAndLayout();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollToPosition$lambda$9(ChatListView chatListView) {
        chatListView.scrollStateObserver.stopWatching();
        return Unit.f14616a;
    }

    private final void sync() {
        Job job = this.updateSubscriptionJob;
        if (job != null) {
            job.f(null);
        }
        this.updateSubscriptionJob = b0.t(CoroutineViewUtilsKt.attachedScope(this, true), null, new AnonymousClass1(null), 3);
    }

    public final void cleanup() {
        removeScrollStateListener();
        stopScroll();
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        super.endViewTransition(view);
        suppressLayout(false);
        this.linearLayoutManager.disableRecycling(false);
    }

    @NotNull
    public final Function0<Unit> getOnFirstDrawDoneCallback() {
        return this.onFirstDrawDoneCallback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sync();
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.chat.presentation.list.ChatListView$onAttachedToWindow$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                ChatEventHandler chatEventHandler = this.this$0.eventHandler;
                if (chatEventHandler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler = null;
                }
                chatEventHandler.onCompleteFirstLayout();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.chatListAdapter.onHostDetached();
    }

    public final void scrollToPosition(final int position, @NotNull Scroller.TargetAlignment targetAlignment, boolean animate, final boolean highlight) {
        Intrinsics.checkNotNullParameter(targetAlignment, "targetAlignment");
        this.scroller.scrollToPosition(position, targetAlignment, animate, new d(this, 1), new Function0() { // from class: com.discord.chat.presentation.list.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatListView.scrollToPosition$lambda$10(this.f4100d, highlight, position);
            }
        }, new d(this, 2));
    }

    public final void setDataSource(@NotNull DataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
    }

    public final void setEventHandler(@NotNull ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.eventHandler = eventHandler;
    }

    public final void setFloatingChatInputEnabled(boolean enabled) {
        this.floatingTreatmentEnabled = enabled;
        int i7 = enabled ? FLOATING_END_ITEM_SPACING_PX : BASE_END_ITEM_SPACING_PX;
        if (this.verticalSpacingItemDecoration.getEndItemSpacingPx() == i7) {
            return;
        }
        this.verticalSpacingItemDecoration.setEndItemSpacingPx(i7);
        invalidateItemDecorations();
    }

    public final void setInverted(boolean inverted) {
        this.verticalSpacingItemDecoration.setRecyclerLayoutReversed(inverted);
        this.linearLayoutManager.setReverseLayout(inverted);
    }

    public final void setOnFirstDrawDoneCallback(@NotNull Function0<Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.onFirstDrawDoneCallback = value;
        this.chatListAdapter.setOnFirstDraw(value);
    }

    public final void setPortalView(@NotNull View portalView, Pair<Integer, Integer> measuredDimensions) {
        Intrinsics.checkNotNullParameter(portalView, "portalView");
        this.chatListAdapter.setPortalView(portalView, measuredDimensions);
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        this.linearLayoutManager.disableRecycling(true);
        suppressLayout(true);
        super.startViewTransition(view);
    }
}
