package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.discord.chat.presentation.list.a;
import com.facebook.react.uimanager.ViewProps;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018¨\u0006/"}, d2 = {"Lcom/discord/chat/bridge/row/LoadingRow;", "Lcom/discord/chat/bridge/row/Row;", "index", "", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "button", "Lcom/discord/chat/bridge/row/LoadMoreButton;", ViewProps.COLOR, "isLoading", "", "<init>", "(ILcom/discord/chat/bridge/ChangeType;Lcom/discord/chat/bridge/row/LoadMoreButton;IZ)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/ChangeType;Lcom/discord/chat/bridge/row/LoadMoreButton;IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex", "()I", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getButton", "()Lcom/discord/chat/bridge/row/LoadMoreButton;", "getColor", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoadingRow extends Row {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LoadMoreButton button;

    @NotNull
    private final ChangeType changeType;
    private final int color;
    private final int index;
    private final boolean isLoading;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/row/LoadingRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/LoadingRow;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return LoadingRow$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoadingRow(int i7, int i10, ChangeType changeType, LoadMoreButton loadMoreButton, int i11, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (31 != (i7 & 31)) {
            e1.l(i7, 31, LoadingRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.index = i10;
        this.changeType = changeType;
        this.button = loadMoreButton;
        this.color = i11;
        this.isLoading = z5;
    }

    public static /* synthetic */ LoadingRow copy$default(LoadingRow loadingRow, int i7, ChangeType changeType, LoadMoreButton loadMoreButton, int i10, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = loadingRow.index;
        }
        if ((i11 & 2) != 0) {
            changeType = loadingRow.changeType;
        }
        if ((i11 & 4) != 0) {
            loadMoreButton = loadingRow.button;
        }
        if ((i11 & 8) != 0) {
            i10 = loadingRow.color;
        }
        if ((i11 & 16) != 0) {
            z5 = loadingRow.isLoading;
        }
        boolean z6 = z5;
        LoadMoreButton loadMoreButton2 = loadMoreButton;
        return loadingRow.copy(i7, changeType, loadMoreButton2, i10, z6);
    }

    public static final /* synthetic */ void write$Self$chat_release(LoadingRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.getIndex(), serialDesc);
        output.g(serialDesc, 1, ChangeType.Serializer.INSTANCE, self.getChangeType());
        output.g(serialDesc, 2, LoadMoreButton$$serializer.INSTANCE, self.button);
        output.l(3, self.color, serialDesc);
        output.p(serialDesc, 4, self.isLoading);
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
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LoadMoreButton getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public final LoadingRow copy(int index, @NotNull ChangeType changeType, @NotNull LoadMoreButton button, int color, boolean isLoading) {
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        Intrinsics.checkNotNullParameter(button, "button");
        return new LoadingRow(index, changeType, button, color, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingRow)) {
            return false;
        }
        LoadingRow loadingRow = (LoadingRow) other;
        return this.index == loadingRow.index && this.changeType == loadingRow.changeType && Intrinsics.areEqual(this.button, loadingRow.button) && this.color == loadingRow.color && this.isLoading == loadingRow.isLoading;
    }

    @NotNull
    public final LoadMoreButton getButton() {
        return this.button;
    }

    @Override // com.discord.chat.bridge.row.Row
    @NotNull
    public ChangeType getChangeType() {
        return this.changeType;
    }

    public final int getColor() {
        return this.color;
    }

    @Override // com.discord.chat.bridge.row.Row
    public int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoading) + a.u(this.color, (this.button.hashCode() + ((this.changeType.hashCode() + (Integer.hashCode(this.index) * 31)) * 31)) * 31, 31);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        int i7 = this.index;
        ChangeType changeType = this.changeType;
        LoadMoreButton loadMoreButton = this.button;
        int i10 = this.color;
        boolean z5 = this.isLoading;
        StringBuilder sb2 = new StringBuilder("LoadingRow(index=");
        sb2.append(i7);
        sb2.append(", changeType=");
        sb2.append(changeType);
        sb2.append(", button=");
        sb2.append(loadMoreButton);
        sb2.append(", color=");
        sb2.append(i10);
        sb2.append(", isLoading=");
        return a.m(sb2, z5, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingRow(int i7, @NotNull ChangeType changeType, @NotNull LoadMoreButton button, int i10, boolean z5) {
        super(null);
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        Intrinsics.checkNotNullParameter(button, "button");
        this.index = i7;
        this.changeType = changeType;
        this.button = button;
        this.color = i10;
        this.isLoading = z5;
    }
}
