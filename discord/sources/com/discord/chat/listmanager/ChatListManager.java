package com.discord.chat.listmanager;

import ar.b0;
import ar.k0;
import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.row.BlockedGroupContent;
import com.discord.chat.bridge.row.BlockedGroupRow;
import com.discord.chat.bridge.row.DeleteRow;
import com.discord.chat.bridge.row.LoadingActionType;
import com.discord.chat.bridge.row.LoadingRow;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.bridge.row.MessageRowKt;
import com.discord.chat.bridge.row.Row;
import com.discord.chat.bridge.row.SeparatorRow;
import com.discord.chat.bridge.row.SeparatorRowKt;
import com.discord.chat.bridge.scroll.ChatScrollData;
import com.discord.chat.bridge.scroll.ChatScrollType;
import com.discord.chat.bridge.spoiler.SpoilerManager;
import com.discord.chat.presentation.list.a;
import com.discord.chat.presentation.list.item.BlockedGroupChatListItem;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.DeserializationErrorChatListItem;
import com.discord.chat.presentation.list.item.LoadingChatListItem;
import com.discord.chat.presentation.root.MessageContext;
import dr.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a1;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.j0;
import kotlin.collections.n0;
import kotlin.collections.z0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ.\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\rJ\u0016\u0010\u0018\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0002J\u0016\u0010\u001a\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0002J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000fJ\u001e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u000fJ\f\u0010 \u001a\u00020!*\u00020\u000bH\u0002J\u001a\u0010\"\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010#\u001a\u00020\u000bH\u0002J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\bH\u0002J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0(R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/discord/chat/listmanager/ChatListManager;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "updatesFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/discord/chat/listmanager/ChatListUpdate;", "rows", "", "Lcom/discord/chat/bridge/row/Row;", "isDisabled", "", "getRowCount", "", "updateRows", "", "updates", "", "scrollData", "Lcom/discord/chat/bridge/scroll/ChatScrollData;", "changesetUpdateId", "forceReload", "createNewRows", "Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;", "modifyExistingRows", "clearRows", "handleError", "errorJson", "", "causeMessage", "toChatListItem", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "insert", "row", "publishScope", "publishUpdate", "update", "observeUpdates", "Lkotlinx/coroutines/flow/Flow;", "RowsModificationResult", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatListManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListManager.kt\ncom/discord/chat/listmanager/ChatListManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,249:1\n1563#2:250\n1634#2,3:251\n1761#2,3:254\n774#2:257\n865#2,2:258\n1869#2,2:260\n774#2:262\n865#2,2:263\n1869#2,2:265\n1563#2:267\n1634#2,3:268\n*S KotlinDebug\n*F\n+ 1 ChatListManager.kt\ncom/discord/chat/listmanager/ChatListManager\n*L\n65#1:250\n65#1:251,3\n82#1:254,3\n103#1:257\n103#1:258,2\n104#1:260,2\n112#1:262\n112#1:263,2\n114#1:265,2\n212#1:267\n212#1:268,3\n*E\n"})
public final class ChatListManager {
    private boolean isDisabled;

    @NotNull
    private final CoroutineScope publishScope;
    private List<Row> rows;

    @NotNull
    private final MutableSharedFlow updatesFlow;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;", "", "rows", "", "Lcom/discord/chat/bridge/row/Row;", "didInsertAtBottom", "", "listOperations", "Lcom/discord/chat/listmanager/ListOperation;", "<init>", "(Ljava/util/List;ZLjava/util/List;)V", "getRows", "()Ljava/util/List;", "getDidInsertAtBottom", "()Z", "getListOperations", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RowsModificationResult {
        private final boolean didInsertAtBottom;
        private final List<ListOperation> listOperations;

        @NotNull
        private final List<Row> rows;

        /* JADX WARN: Multi-variable type inference failed */
        public RowsModificationResult(@NotNull List<? extends Row> rows, boolean z5, List<? extends ListOperation> list) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.rows = rows;
            this.didInsertAtBottom = z5;
            this.listOperations = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RowsModificationResult copy$default(RowsModificationResult rowsModificationResult, List list, boolean z5, List list2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                list = rowsModificationResult.rows;
            }
            if ((i7 & 2) != 0) {
                z5 = rowsModificationResult.didInsertAtBottom;
            }
            if ((i7 & 4) != 0) {
                list2 = rowsModificationResult.listOperations;
            }
            return rowsModificationResult.copy(list, z5, list2);
        }

        @NotNull
        public final List<Row> component1() {
            return this.rows;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getDidInsertAtBottom() {
            return this.didInsertAtBottom;
        }

        public final List<ListOperation> component3() {
            return this.listOperations;
        }

        @NotNull
        public final RowsModificationResult copy(@NotNull List<? extends Row> rows, boolean didInsertAtBottom, List<? extends ListOperation> listOperations) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new RowsModificationResult(rows, didInsertAtBottom, listOperations);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowsModificationResult)) {
                return false;
            }
            RowsModificationResult rowsModificationResult = (RowsModificationResult) other;
            return Intrinsics.areEqual(this.rows, rowsModificationResult.rows) && this.didInsertAtBottom == rowsModificationResult.didInsertAtBottom && Intrinsics.areEqual(this.listOperations, rowsModificationResult.listOperations);
        }

        public final boolean getDidInsertAtBottom() {
            return this.didInsertAtBottom;
        }

        public final List<ListOperation> getListOperations() {
            return this.listOperations;
        }

        @NotNull
        public final List<Row> getRows() {
            return this.rows;
        }

        public int hashCode() {
            int iG = a.g(this.rows.hashCode() * 31, 31, this.didInsertAtBottom);
            List<ListOperation> list = this.listOperations;
            return iG + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "RowsModificationResult(rows=" + this.rows + ", didInsertAtBottom=" + this.didInsertAtBottom + ", listOperations=" + this.listOperations + ")";
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.listmanager.ChatListManager$publishUpdate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.chat.listmanager.ChatListManager$publishUpdate$1", f = "ChatListManager.kt", l = {237}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ ChatListUpdate $update;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChatListUpdate chatListUpdate, Continuation continuation) {
            super(2, continuation);
            this.$update = chatListUpdate;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatListManager.this.new AnonymousClass1(this.$update, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MutableSharedFlow mutableSharedFlow = ChatListManager.this.updatesFlow;
                ChatListUpdate chatListUpdate = this.$update;
                this.label = 1;
                if (mutableSharedFlow.emit(chatListUpdate, this) == aVar) {
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

    public ChatListManager(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.updatesFlow = z.a(1, 3, cr.a.f7342d);
        this.publishScope = new fr.d(coroutineScope.getCoroutineContext().n(k0.f2938a));
    }

    private final RowsModificationResult createNewRows(List<? extends Row> updates) {
        if (updates == null || !updates.isEmpty()) {
            Iterator<T> it = updates.iterator();
            while (it.hasNext()) {
                if (((Row) it.next()).getChangeType() == ChangeType.DELETE) {
                    throw new IllegalArgumentException("Deletes are not expected or allowed during syncs.");
                }
            }
        }
        this.rows = CollectionsKt.j0(updates);
        return new RowsModificationResult(updates, true, null);
    }

    private final void insert(List<Row> list, Row row) {
        if (row instanceof DeleteRow) {
            throw new IllegalStateException("Unexpected delete during insert.");
        }
        list.add(row.getIndex(), row);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    private final RowsModificationResult modifyExistingRows(List<? extends Row> updates) {
        boolean z5;
        boolean z6;
        List<Row> list = this.rows;
        Intrinsics.checkNotNull(list);
        ListOperationsBuilder listOperationsBuilder = new ListOperationsBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj : updates) {
            if (((Row) obj).getChangeType() == ChangeType.INSERT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        loop1: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop1;
                }
                Row row = (Row) it.next();
                insert(list, row);
                listOperationsBuilder.add(new ListOperation.Insert(row.getIndex()));
                z5 = z5 || row.getIndex() == 0;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : updates) {
            Row row2 = (Row) obj2;
            if (row2.getChangeType() == ChangeType.DELETE || row2.getChangeType() == ChangeType.UPDATE) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = j0.x(arrayList2).iterator();
        while (true) {
            ListIterator listIterator = ((z0) it2).f14674d;
            if (!listIterator.hasPrevious()) {
                return new RowsModificationResult(list, z5, listOperationsBuilder.build());
            }
            Row row3 = (Row) listIterator.previous();
            if (row3 instanceof DeleteRow) {
                DeleteRow deleteRow = (DeleteRow) row3;
                list.remove(deleteRow.getIndex());
                listOperationsBuilder.add(new ListOperation.Remove(deleteRow.getIndex()));
            } else {
                if (row3 instanceof LoadingRow) {
                    LoadingRow loadingRow = (LoadingRow) row3;
                    if (loadingRow.getButton().getAction().getType() == LoadingActionType.LOAD_MORE_AFTER && loadingRow.getIndex() == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                Row row4 = (Row) CollectionsKt.K(list);
                boolean z7 = (row4 instanceof LoadingRow) && ((LoadingRow) row4).isLoading();
                if (z6 && z7) {
                    list.add(1, row3);
                    list.remove(0);
                    listOperationsBuilder.add(new ListOperation.Insert(1));
                    listOperationsBuilder.add(new ListOperation.Remove(0));
                } else {
                    list.set(row3.getIndex(), row3);
                    listOperationsBuilder.add(new ListOperation.Change(row3.getIndex()));
                }
            }
        }
    }

    private final void publishUpdate(ChatListUpdate update) {
        b0.t(this.publishScope, null, new AnonymousClass1(update, null), 3);
    }

    private final ChatListItem toChatListItem(Row row) {
        if (row instanceof MessageRow) {
            return MessageRowKt.toChatListMessageItem((MessageRow) row);
        }
        if (row instanceof LoadingRow) {
            LoadingRow loadingRow = (LoadingRow) row;
            return new LoadingChatListItem(loadingRow.getButton(), loadingRow.getColor(), loadingRow.isLoading());
        }
        if (row instanceof SeparatorRow) {
            return SeparatorRowKt.toSeparatorChatListItem((SeparatorRow) row);
        }
        if (!(row instanceof BlockedGroupRow)) {
            throw new IllegalStateException("Unknown row type.");
        }
        BlockedGroupRow blockedGroupRow = (BlockedGroupRow) row;
        String text = blockedGroupRow.getText();
        String context = blockedGroupRow.getButton().getAction().getContext();
        int color = blockedGroupRow.getColor();
        int backgroundColor = blockedGroupRow.getBackgroundColor();
        int borderColor = blockedGroupRow.getBorderColor();
        boolean revealed = blockedGroupRow.getRevealed();
        List<BlockedGroupContent> content = blockedGroupRow.getContent();
        if (content == null) {
            content = n0.f14659d;
        }
        ArrayList arrayList = new ArrayList(e0.l(content, 10));
        Iterator<T> it = content.iterator();
        while (it.hasNext()) {
            arrayList.add(MessageRowKt.toChatListMessageItem$default(((BlockedGroupContent) it.next()).getMessage(), new MessageContext(false, false, null, null, false, null, true, false, false, false, null, null, null, 8127, null), false, false, null, null, 30, null));
        }
        a1 a1VarX = j0.x(arrayList);
        Boolean canUncollapse = blockedGroupRow.getCanUncollapse();
        return new BlockedGroupChatListItem(text, context, color, backgroundColor, borderColor, revealed, a1VarX, canUncollapse != null ? canUncollapse.booleanValue() : true, blockedGroupRow.getButton().getAction().getType());
    }

    public final void clearRows(int changesetUpdateId) {
        List<Row> list = this.rows;
        if (list != null && !list.isEmpty()) {
            SpoilerManager.INSTANCE.reset();
            publishUpdate(new ChatListUpdate(n0.f14659d, ChatListAction.Clear.INSTANCE, null, changesetUpdateId, null, 16, null));
        }
        this.rows = null;
    }

    public final int getRowCount() {
        List<Row> list = this.rows;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void handleError(@NotNull String errorJson, @NotNull String causeMessage, int changesetUpdateId) {
        Intrinsics.checkNotNullParameter(errorJson, "errorJson");
        Intrinsics.checkNotNullParameter(causeMessage, "causeMessage");
        publishUpdate(new ChatListUpdate(d0.i(new DeserializationErrorChatListItem("error-id", errorJson, causeMessage)), ChatListAction.Noop.INSTANCE, null, changesetUpdateId, null, 16, null));
        this.isDisabled = true;
    }

    @NotNull
    public final Flow observeUpdates() {
        return this.updatesFlow;
    }

    public final void updateRows(@NotNull List<? extends Row> updates, ChatScrollData scrollData, int changesetUpdateId, boolean forceReload) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        if (this.isDisabled) {
            return;
        }
        RowsModificationResult rowsModificationResultModifyExistingRows = this.rows != null ? modifyExistingRows(updates) : createNewRows(updates);
        List<Row> listComponent1 = rowsModificationResultModifyExistingRows.component1();
        boolean didInsertAtBottom = rowsModificationResultModifyExistingRows.getDidInsertAtBottom();
        List<ListOperation> listComponent3 = rowsModificationResultModifyExistingRows.component3();
        ChatListAction scrollTo = (scrollData == null || scrollData.getType() != ChatScrollType.SCROLL) ? null : new ChatListAction.ScrollTo(scrollData.getIndex(), scrollData.getAnimate(), scrollData.getHighlight());
        ArrayList arrayList = new ArrayList(e0.l(listComponent1, 10));
        Iterator<T> it = listComponent1.iterator();
        while (it.hasNext()) {
            arrayList.add(toChatListItem((Row) it.next()));
        }
        if (scrollTo == null) {
            scrollTo = didInsertAtBottom ? ChatListAction.StickToBottomIfAtBottom.INSTANCE : ChatListAction.Noop.INSTANCE;
        }
        publishUpdate(new ChatListUpdate(arrayList, scrollTo, listComponent3, changesetUpdateId, Boolean.valueOf(forceReload)));
    }
}
