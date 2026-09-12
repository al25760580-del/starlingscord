package com.discord.chat.listmanager;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/listmanager/ListOperationsBuilder;", "", "<init>", "()V", "listOperations", "", "Lcom/discord/chat/listmanager/ListOperation;", "add", "", "newOperation", "build", "", "addInsert", "insertOperation", "Lcom/discord/chat/listmanager/ListOperation$Insert;", "addRemove", "removeOperation", "Lcom/discord/chat/listmanager/ListOperation$Remove;", "addChange", "changeOperation", "Lcom/discord/chat/listmanager/ListOperation$Change;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ListOperationsBuilder {

    @NotNull
    private final List<ListOperation> listOperations = new ArrayList();

    private final void addChange(ListOperation.Change changeOperation) {
        ListOperation listOperation = (ListOperation) CollectionsKt.Q(this.listOperations);
        if (listOperation instanceof ListOperation.Change) {
            ListOperation.Change change = (ListOperation.Change) listOperation;
            int index = change.getIndex();
            if (index == changeOperation.getIndex() - 1) {
                List<ListOperation> list = this.listOperations;
                list.set(d0.f(list), new ListOperation.ChangeRange(new IntRange(change.getIndex(), changeOperation.getIndex(), 1)));
                return;
            } else if (index != changeOperation.getIndex() + 1) {
                this.listOperations.add(changeOperation);
                return;
            } else {
                List<ListOperation> list2 = this.listOperations;
                list2.set(d0.f(list2), new ListOperation.ChangeRange(new IntRange(changeOperation.getIndex(), change.getIndex(), 1)));
                return;
            }
        }
        if (!(listOperation instanceof ListOperation.ChangeRange)) {
            this.listOperations.add(changeOperation);
            return;
        }
        ListOperation.ChangeRange changeRange = (ListOperation.ChangeRange) listOperation;
        if (changeRange.getLast() == changeOperation.getIndex() - 1) {
            List<ListOperation> list3 = this.listOperations;
            list3.set(d0.f(list3), new ListOperation.ChangeRange(new IntRange(changeRange.getFirst(), changeOperation.getIndex(), 1)));
        } else if (changeRange.getFirst() != changeOperation.getIndex() + 1) {
            this.listOperations.add(changeOperation);
        } else {
            List<ListOperation> list4 = this.listOperations;
            list4.set(d0.f(list4), new ListOperation.ChangeRange(new IntRange(changeOperation.getIndex(), changeRange.getLast(), 1)));
        }
    }

    private final void addInsert(ListOperation.Insert insertOperation) {
        ListOperation listOperation = (ListOperation) CollectionsKt.Q(this.listOperations);
        if (listOperation instanceof ListOperation.Insert) {
            ListOperation.Insert insert = (ListOperation.Insert) listOperation;
            int index = insert.getIndex();
            if (index == insertOperation.getIndex() - 1) {
                List<ListOperation> list = this.listOperations;
                list.set(d0.f(list), new ListOperation.InsertRange(new IntRange(insert.getIndex(), insertOperation.getIndex(), 1)));
                return;
            } else if (index != insertOperation.getIndex() + 1) {
                this.listOperations.add(insertOperation);
                return;
            } else {
                List<ListOperation> list2 = this.listOperations;
                list2.set(d0.f(list2), new ListOperation.InsertRange(new IntRange(insertOperation.getIndex(), insert.getIndex(), 1)));
                return;
            }
        }
        if (!(listOperation instanceof ListOperation.InsertRange)) {
            this.listOperations.add(insertOperation);
            return;
        }
        ListOperation.InsertRange insertRange = (ListOperation.InsertRange) listOperation;
        if (insertRange.getLast() == insertOperation.getIndex() - 1) {
            List<ListOperation> list3 = this.listOperations;
            list3.set(d0.f(list3), new ListOperation.InsertRange(new IntRange(insertRange.getFirst(), insertOperation.getIndex(), 1)));
        } else if (insertRange.getFirst() != insertOperation.getIndex() + 1) {
            this.listOperations.add(insertOperation);
        } else {
            List<ListOperation> list4 = this.listOperations;
            list4.set(d0.f(list4), new ListOperation.InsertRange(new IntRange(insertOperation.getIndex(), insertRange.getLast(), 1)));
        }
    }

    private final void addRemove(ListOperation.Remove removeOperation) {
        ListOperation listOperation = (ListOperation) CollectionsKt.Q(this.listOperations);
        if (listOperation instanceof ListOperation.Remove) {
            ListOperation.Remove remove = (ListOperation.Remove) listOperation;
            int index = remove.getIndex();
            if (index == removeOperation.getIndex() - 1) {
                List<ListOperation> list = this.listOperations;
                list.set(d0.f(list), new ListOperation.RemoveRange(new IntRange(remove.getIndex(), removeOperation.getIndex(), 1)));
                return;
            } else if (index != removeOperation.getIndex() + 1) {
                this.listOperations.add(removeOperation);
                return;
            } else {
                List<ListOperation> list2 = this.listOperations;
                list2.set(d0.f(list2), new ListOperation.RemoveRange(new IntRange(removeOperation.getIndex(), remove.getIndex(), 1)));
                return;
            }
        }
        if (!(listOperation instanceof ListOperation.RemoveRange)) {
            this.listOperations.add(removeOperation);
            return;
        }
        ListOperation.RemoveRange removeRange = (ListOperation.RemoveRange) listOperation;
        if (removeRange.getLast() == removeOperation.getIndex() - 1) {
            List<ListOperation> list3 = this.listOperations;
            list3.set(d0.f(list3), new ListOperation.RemoveRange(new IntRange(removeRange.getFirst(), removeOperation.getIndex(), 1)));
        } else if (removeRange.getFirst() != removeOperation.getIndex() + 1) {
            this.listOperations.add(removeOperation);
        } else {
            List<ListOperation> list4 = this.listOperations;
            list4.set(d0.f(list4), new ListOperation.RemoveRange(new IntRange(removeOperation.getIndex(), removeRange.getLast(), 1)));
        }
    }

    public final void add(@NotNull ListOperation newOperation) {
        Intrinsics.checkNotNullParameter(newOperation, "newOperation");
        if (this.listOperations.isEmpty()) {
            this.listOperations.add(newOperation);
            return;
        }
        if (newOperation instanceof ListOperation.Insert) {
            addInsert((ListOperation.Insert) newOperation);
            return;
        }
        if (newOperation instanceof ListOperation.Remove) {
            addRemove((ListOperation.Remove) newOperation);
        } else if (newOperation instanceof ListOperation.Change) {
            addChange((ListOperation.Change) newOperation);
        } else {
            throw new IllegalArgumentException("invalid new operation for add: " + newOperation);
        }
    }

    @NotNull
    public final List<ListOperation> build() {
        return this.listOperations;
    }
}
