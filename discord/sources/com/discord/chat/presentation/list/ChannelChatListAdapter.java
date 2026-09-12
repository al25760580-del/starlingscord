package com.discord.chat.presentation.list;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ar.b0;
import ar.u;
import com.discord.chat.listmanager.ChatListAction;
import com.discord.chat.listmanager.ListOperation;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.LoadingChatListItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.list.item.PortalViewChatListItem;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.logging.Log;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.tti_measurement_view.FirstDrawDoneListener;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 T2\u00020\u0001:\u0002UTBI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006\u0012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0002j\u0002`\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0015\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ[\u0010\u001c\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00192\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b\u001c\u0010&J/\u0010-\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00132\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0003H\u0002¢\u0006\u0004\b/\u0010\u000fJ\u0017\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u000200H\u0003¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00032\u0006\u00101\u001a\u000200H\u0003¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0003H\u0003¢\u0006\u0004\b5\u0010\u000fJ\u0017\u00107\u001a\u00020\u00032\u0006\u00101\u001a\u000206H\u0003¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00032\u0006\u00101\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010>R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010<\u001a\u0004\b?\u0010>\"\u0004\b@\u0010AR(\u0010D\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010B8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u0002000J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010IR\u0016\u0010S\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010N¨\u0006V"}, d2 = {"Lcom/discord/chat/presentation/list/ChannelChatListAdapter;", "Lcom/discord/chat/presentation/list/BaseChatListAdapter;", "Lkotlin/Function0;", "", "doLayout", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "eventHandlerProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "messageComponentProvider", "onFirstDraw", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onHostDetached", "()V", "Landroid/view/View;", "portalView", "Lkotlin/Pair;", "", "measuredDimensions", "setPortalView", "(Landroid/view/View;Lkotlin/Pair;)V", "getFirstMessageItemPosition", "()I", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", AlertFragment.ARG_ITEMS, "setItems", "(Ljava/util/List;)V", "Lcom/discord/chat/listmanager/ListOperation;", "listOperations", "Lkotlin/Function1;", "", "preCommit", "postCommit", "Lcom/discord/chat/listmanager/ChatListAction;", "chatListAction", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/discord/chat/listmanager/ChatListAction;)V", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", ViewProps.POSITION, "", "", "payloads", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "syncFirstMessageItemPosition", "Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;", "update", "enqueueUpdate", "(Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;)V", "processUpdate", "processNextUpdate", "Lcom/discord/chat/presentation/list/ChatListItemUpdate;", "processChatListItemUpdate", "(Lcom/discord/chat/presentation/list/ChatListItemUpdate;)V", "Lcom/discord/chat/presentation/list/PortalViewUpdate;", "processPortalViewUpdate", "(Lcom/discord/chat/presentation/list/PortalViewUpdate;)V", "Lkotlin/jvm/functions/Function0;", "getDoLayout", "()Lkotlin/jvm/functions/Function0;", "getOnFirstDraw", "setOnFirstDraw", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "value", "portalChatListItem", "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "getPortalChatListItem$chat_release", "()Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "firstMessageItemPosition", "I", "Ljava/util/Queue;", "updateQueue", "Ljava/util/Queue;", "isProcessingUpdate", "Z", "Lkotlinx/coroutines/Job;", "processNextUpdateJob", "Lkotlinx/coroutines/Job;", "updateCount", "reportedFirstDrawYet", "Companion", "PortalViewUpdateType", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChannelChatListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelChatListAdapter.kt\ncom/discord/chat/presentation/list/ChannelChatListAdapter\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n17#2,5:252\n17#2,5:265\n17#2,5:270\n17#2,5:275\n388#3,7:257\n1869#3,2:280\n1#4:264\n*S KotlinDebug\n*F\n+ 1 ChannelChatListAdapter.kt\ncom/discord/chat/presentation/list/ChannelChatListAdapter\n*L\n41#1:252,5\n98#1:265,5\n109#1:270,5\n130#1:275,5\n67#1:257,7\n166#1:280,2\n*E\n"})
public final class ChannelChatListAdapter extends BaseChatListAdapter {
    private static final String LOGGING_TAG = "ChannelChatListAdapter";

    @NotNull
    private final Function0<Unit> doLayout;
    private int firstMessageItemPosition;
    private boolean isProcessingUpdate;

    @NotNull
    private Function0<Unit> onFirstDraw;
    private PortalViewChatListItem portalChatListItem;
    private Job processNextUpdateJob;
    private boolean reportedFirstDrawYet;
    private int updateCount;

    @NotNull
    private final Queue<ChannelChatListAdapterUpdate> updateQueue;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/presentation/list/ChannelChatListAdapter$PortalViewUpdateType;", "", "<init>", "(Ljava/lang/String;I)V", "ADD", "CHANGE", "REMOVE", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum PortalViewUpdateType {
        ADD,
        CHANGE,
        REMOVE;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PortalViewUpdateType.values().length];
            try {
                iArr[PortalViewUpdateType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PortalViewUpdateType.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PortalViewUpdateType.CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ChannelChatListAdapter(Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function1, function2, (i7 & 8) != 0 ? new com.discord.chat.bridge.contentnode.a(27) : function3);
    }

    private final void enqueueUpdate(ChannelChatListAdapterUpdate update) {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        this.updateQueue.add(update);
        if (this.updateQueue.size() == 1 && !this.isProcessingUpdate) {
            processNextUpdate();
            return;
        }
        if (this.updateQueue.isEmpty() || this.isProcessingUpdate) {
            return;
        }
        Log log = Log.INSTANCE;
        String str = LOGGING_TAG;
        Intrinsics.checkNotNullExpressionValue(str, "access$getLOGGING_TAG$cp(...)");
        Log.w$default(log, str, "Skipped a chat list update. adapter may be frozen.", (Throwable) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$11(ChannelChatListAdapter channelChatListAdapter) {
        channelChatListAdapter.onFirstDraw.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void processChatListItemUpdate(ChatListItemUpdate update) {
        boolean z5;
        List<ChatListItem> items = update.getItems();
        Object items2 = this.items;
        boolean z6 = false;
        if (items2 != null) {
            Intrinsics.checkNotNullExpressionValue(items2, "items");
            if (((Collection) items2).isEmpty()) {
                z5 = false;
            } else {
                Object items3 = this.items;
                Intrinsics.checkNotNullExpressionValue(items3, "items");
                if (!(CollectionsKt.Q((List) items3) instanceof PortalViewChatListItem) || this.portalChatListItem == null) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            }
        } else {
            z5 = false;
        }
        if (z5 && !(CollectionsKt.S(items) instanceof LoadingChatListItem)) {
            z6 = true;
        }
        if (z6) {
            PortalViewChatListItem portalViewChatListItem = this.portalChatListItem;
            Intrinsics.checkNotNull(portalViewChatListItem);
            items = CollectionsKt.W(items, portalViewChatListItem);
        }
        setChatListItems$chat_release(items);
        super.setItems((Object) getChatListItems$chat_release());
        if (z5 && !z6) {
            ChatListAdapterUpdateLog.INSTANCE.addPortalRemovalFromChatListItemUpdate();
            notifyDataSetChanged();
            return;
        }
        if (update.getListOperations() == null) {
            ChatListAdapterUpdateLog.INSTANCE.addNoOpDataSetChanged();
            notifyDataSetChanged();
            return;
        }
        ChatListAdapterUpdateLog.INSTANCE.addChatListItemUpdate(update);
        for (ListOperation listOperation : update.getListOperations()) {
            if (listOperation instanceof ListOperation.Change) {
                notifyItemChanged(((ListOperation.Change) listOperation).getIndex());
            } else if (listOperation instanceof ListOperation.Insert) {
                notifyItemInserted(((ListOperation.Insert) listOperation).getIndex());
            } else if (listOperation instanceof ListOperation.Remove) {
                notifyItemRemoved(((ListOperation.Remove) listOperation).getIndex());
            } else if (listOperation instanceof ListOperation.ChangeRange) {
                ListOperation.ChangeRange changeRange = (ListOperation.ChangeRange) listOperation;
                notifyItemRangeChanged(changeRange.getFirst(), changeRange.getCount());
            } else if (listOperation instanceof ListOperation.InsertRange) {
                ListOperation.InsertRange insertRange = (ListOperation.InsertRange) listOperation;
                notifyItemRangeInserted(insertRange.getFirst(), insertRange.getCount());
            } else {
                if (!(listOperation instanceof ListOperation.RemoveRange)) {
                    throw new n();
                }
                ListOperation.RemoveRange removeRange = (ListOperation.RemoveRange) listOperation;
                notifyItemRangeRemoved(removeRange.getFirst(), removeRange.getCount());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processNextUpdate() {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        if (this.updateQueue.isEmpty()) {
            return;
        }
        Object objRemove = this.updateQueue.remove();
        Intrinsics.checkNotNullExpressionValue(objRemove, "remove(...)");
        processUpdate((ChannelChatListAdapterUpdate) objRemove);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processPortalViewUpdate(PortalViewUpdate update) {
        PortalViewUpdateType portalViewUpdateType;
        List<? extends ChatListItem> listW;
        boolean z5 = CollectionsKt.S(getChatListItems$chat_release()) instanceof PortalViewChatListItem;
        boolean z6 = update.getPortalChatListItem() != null;
        if (z6 && !z5) {
            portalViewUpdateType = PortalViewUpdateType.ADD;
        } else if (z6 && z5) {
            portalViewUpdateType = PortalViewUpdateType.CHANGE;
        } else if (z6 || !z5) {
            return;
        } else {
            portalViewUpdateType = PortalViewUpdateType.REMOVE;
        }
        ChatListAdapterUpdateLog.INSTANCE.addPortalUpdate(portalViewUpdateType);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i7 = iArr[portalViewUpdateType.ordinal()];
        if (i7 == 1) {
            List<ChatListItem> chatListItems$chat_release = getChatListItems$chat_release();
            PortalViewChatListItem portalChatListItem = update.getPortalChatListItem();
            Intrinsics.checkNotNull(portalChatListItem);
            listW = CollectionsKt.W(chatListItems$chat_release, portalChatListItem);
        } else if (i7 == 2) {
            listW = CollectionsKt.G(getChatListItems$chat_release());
        } else {
            if (i7 != 3) {
                throw new n();
            }
            ArrayList arrayListJ0 = CollectionsKt.j0(getChatListItems$chat_release());
            int iF = d0.f(getChatListItems$chat_release());
            PortalViewChatListItem portalChatListItem2 = update.getPortalChatListItem();
            Intrinsics.checkNotNull(portalChatListItem2);
            arrayListJ0.set(iF, portalChatListItem2);
            listW = arrayListJ0;
        }
        setChatListItems$chat_release(listW);
        super.setItems((Object) getChatListItems$chat_release());
        int i10 = iArr[portalViewUpdateType.ordinal()];
        if (i10 == 1) {
            notifyItemInserted(d0.f(getChatListItems$chat_release()));
        } else if (i10 == 2) {
            notifyItemRemoved(d0.f(getChatListItems$chat_release()) + 1);
        } else {
            if (i10 != 3) {
                throw new n();
            }
            notifyItemChanged(d0.f(getChatListItems$chat_release()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void processUpdate(ChannelChatListAdapterUpdate update) {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        this.isProcessingUpdate = true;
        update.getPreCommit().invoke(Boolean.valueOf(getItemCount() == 0));
        if (update instanceof PortalViewUpdate) {
            processPortalViewUpdate((PortalViewUpdate) update);
        } else {
            if (!(update instanceof ChatListItemUpdate)) {
                throw new n();
            }
            processChatListItemUpdate((ChatListItemUpdate) update);
        }
        getDoLayout().invoke();
        syncFirstMessageItemPosition();
        update.getPostCommit().invoke();
        this.processNextUpdateJob = b0.t(b0.c(), null, new ChannelChatListAdapter$processUpdate$1$1(this, null), 3);
    }

    public static /* synthetic */ void setItems$default(ChannelChatListAdapter channelChatListAdapter, List list, List list2, Function1 function1, Function0 function0, ChatListAction chatListAction, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            chatListAction = null;
        }
        channelChatListAdapter.setItems(list, list2, function1, function0, chatListAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setItems$lambda$4(boolean z5) {
        return Unit.f14616a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setPortalView$default(ChannelChatListAdapter channelChatListAdapter, View view, Pair pair, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            pair = null;
        }
        channelChatListAdapter.setPortalView(view, pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncFirstMessageItemPosition() {
        int iNextIndex;
        List<ChatListItem> chatListItems$chat_release = getChatListItems$chat_release();
        ListIterator<ChatListItem> listIterator = chatListItems$chat_release.listIterator(chatListItems$chat_release.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            } else if (listIterator.previous() instanceof MessageItem) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        this.firstMessageItemPosition = iNextIndex != -1 ? iNextIndex : -1;
    }

    @NotNull
    public final Function0<Unit> getDoLayout() {
        return this.doLayout;
    }

    public final int getFirstMessageItemPosition() {
        return this.firstMessageItemPosition;
    }

    @NotNull
    public final Function0<Unit> getOnFirstDraw() {
        return this.onFirstDraw;
    }

    /* JADX INFO: renamed from: getPortalChatListItem$chat_release, reason: from getter */
    public final PortalViewChatListItem getPortalChatListItem() {
        return this.portalChatListItem;
    }

    @Override // com.hannesdorfmann.adapterdelegates4.a, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.onBindViewHolder(holder, position, payloads);
        if (this.reportedFirstDrawYet || ((List) this.items).isEmpty()) {
            return;
        }
        ChatListItem chatListItem = (ChatListItem) ((List) this.items).get(position);
        if ((chatListItem instanceof PortalViewChatListItem) || (chatListItem instanceof LoadingChatListItem)) {
            return;
        }
        this.reportedFirstDrawYet = true;
        FirstDrawDoneListener.registerForNextDraw(holder.itemView, new am.c(6, this));
    }

    public final void onHostDetached() {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        Job job = this.processNextUpdateJob;
        if (job != null) {
            job.f(null);
        }
        this.processNextUpdateJob = null;
        this.isProcessingUpdate = false;
        this.updateQueue.clear();
    }

    public final void setOnFirstDraw(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onFirstDraw = function0;
    }

    public final void setPortalView(View portalView, Pair<Integer, Integer> measuredDimensions) {
        PortalViewChatListItem portalViewChatListItem;
        if (portalView != null) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            portalViewChatListItem = new PortalViewChatListItem(string, portalView, measuredDimensions);
        } else {
            portalViewChatListItem = null;
        }
        this.portalChatListItem = portalViewChatListItem;
        int i7 = this.updateCount + 1;
        this.updateCount = i7;
        enqueueUpdate(new PortalViewUpdate(portalViewChatListItem, i7));
    }

    @Override // com.hannesdorfmann.adapterdelegates4.a
    public void setItems(@NotNull List<? extends ChatListItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        setItems$default(this, items, null, new u(26), new com.discord.chat.bridge.contentnode.a(28), null, 16, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelChatListAdapter(@NotNull Function0<Unit> doLayout, @NotNull Function0<? extends ChatEventHandler> eventHandlerProvider, @NotNull Function0<ComponentProvider> messageComponentProvider, @NotNull Function0<Unit> onFirstDraw) {
        super(eventHandlerProvider, messageComponentProvider);
        Intrinsics.checkNotNullParameter(doLayout, "doLayout");
        Intrinsics.checkNotNullParameter(eventHandlerProvider, "eventHandlerProvider");
        Intrinsics.checkNotNullParameter(messageComponentProvider, "messageComponentProvider");
        Intrinsics.checkNotNullParameter(onFirstDraw, "onFirstDraw");
        this.doLayout = doLayout;
        this.onFirstDraw = onFirstDraw;
        this.firstMessageItemPosition = -1;
        this.updateQueue = new LinkedList();
    }

    public final void setItems(@NotNull List<? extends ChatListItem> items, List<? extends ListOperation> listOperations, @NotNull Function1<? super Boolean, Unit> preCommit, @NotNull Function0<Unit> postCommit, ChatListAction chatListAction) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(preCommit, "preCommit");
        Intrinsics.checkNotNullParameter(postCommit, "postCommit");
        int i7 = this.updateCount + 1;
        this.updateCount = i7;
        enqueueUpdate(new ChatListItemUpdate(items, listOperations, chatListAction, i7, preCommit, postCommit));
    }
}
