package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lcom/discord/chat/bridge/row/DeleteRow;", "Lcom/discord/chat/bridge/row/Row;", "index", "", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "<init>", "(ILcom/discord/chat/bridge/ChangeType;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/ChangeType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex", "()I", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DeleteRow extends Row {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ChangeType changeType;
    private final int index;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/row/DeleteRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/DeleteRow;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return DeleteRow$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeleteRow(int i7, int i10, ChangeType changeType, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (1 != (i7 & 1)) {
            e1.l(i7, 1, DeleteRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.index = i10;
        if ((i7 & 2) == 0) {
            this.changeType = ChangeType.DELETE;
        } else {
            this.changeType = changeType;
        }
    }

    public static /* synthetic */ DeleteRow copy$default(DeleteRow deleteRow, int i7, ChangeType changeType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = deleteRow.index;
        }
        if ((i10 & 2) != 0) {
            changeType = deleteRow.changeType;
        }
        return deleteRow.copy(i7, changeType);
    }

    public static final /* synthetic */ void write$Self$chat_release(DeleteRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.getIndex(), serialDesc);
        if (!output.u(serialDesc, 1) && self.getChangeType() == ChangeType.DELETE) {
            return;
        }
        output.g(serialDesc, 1, ChangeType.Serializer.INSTANCE, self.getChangeType());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChangeType getChangeType() {
        return this.changeType;
    }

    @NotNull
    public final DeleteRow copy(int index, @NotNull ChangeType changeType) {
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        return new DeleteRow(index, changeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteRow)) {
            return false;
        }
        DeleteRow deleteRow = (DeleteRow) other;
        return this.index == deleteRow.index && this.changeType == deleteRow.changeType;
    }

    @Override // com.discord.chat.bridge.row.Row
    @NotNull
    public ChangeType getChangeType() {
        return this.changeType;
    }

    @Override // com.discord.chat.bridge.row.Row
    public int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return this.changeType.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    @NotNull
    public String toString() {
        return "DeleteRow(index=" + this.index + ", changeType=" + this.changeType + ")";
    }

    public /* synthetic */ DeleteRow(int i7, ChangeType changeType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, (i10 & 2) != 0 ? ChangeType.DELETE : changeType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteRow(int i7, @NotNull ChangeType changeType) {
        super(null);
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        this.index = i7;
        this.changeType = changeType;
    }
}
