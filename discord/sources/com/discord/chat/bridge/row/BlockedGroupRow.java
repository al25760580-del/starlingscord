package com.discord.chat.bridge.row;

import a3.e;
import com.discord.chat.bridge.ChangeType;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import o5.a;
import or.d;
import or.e1;
import or.g;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002DEBe\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014B{\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0018J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010)J|\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\t\u0010;\u001a\u00020\nHÖ\u0001J%\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0001¢\u0006\u0002\bCR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)¨\u0006F"}, d2 = {"Lcom/discord/chat/bridge/row/BlockedGroupRow;", "Lcom/discord/chat/bridge/row/Row;", "index", "", "changeType", "Lcom/discord/chat/bridge/ChangeType;", ViewProps.COLOR, ViewProps.BORDER_COLOR, ViewProps.BACKGROUND_COLOR, "text", "", "revealed", "", "button", "Lcom/discord/chat/bridge/row/BlockedGroupButton;", "content", "", "Lcom/discord/chat/bridge/row/BlockedGroupContent;", "canUncollapse", "<init>", "(ILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;Ljava/lang/Boolean;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex", "()I", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getColor", "getBorderColor", "getBackgroundColor", "getText", "()Ljava/lang/String;", "getRevealed", "()Z", "getButton", "()Lcom/discord/chat/bridge/row/BlockedGroupButton;", "getContent", "()Ljava/util/List;", "getCanUncollapse", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/row/BlockedGroupRow;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BlockedGroupRow extends Row {
    private final int backgroundColor;
    private final int borderColor;

    @NotNull
    private final BlockedGroupButton button;
    private final Boolean canUncollapse;

    @NotNull
    private final ChangeType changeType;
    private final int color;
    private final List<BlockedGroupContent> content;
    private final int index;
    private final boolean revealed;

    @NotNull
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, null, null, null, null, null, l.a(m.f19486e, new a(21)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/row/BlockedGroupRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/BlockedGroupRow;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return BlockedGroupRow$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BlockedGroupRow(int i7, int i10, ChangeType changeType, int i11, int i12, int i13, String str, boolean z5, BlockedGroupButton blockedGroupButton, List list, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (255 != (i7 & 255)) {
            e1.l(i7, 255, BlockedGroupRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.index = i10;
        this.changeType = changeType;
        this.color = i11;
        this.borderColor = i12;
        this.backgroundColor = i13;
        this.text = str;
        this.revealed = z5;
        this.button = blockedGroupButton;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.content = null;
        } else {
            this.content = list;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.canUncollapse = Boolean.TRUE;
        } else {
            this.canUncollapse = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BlockedGroupContent$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlockedGroupRow copy$default(BlockedGroupRow blockedGroupRow, int i7, ChangeType changeType, int i10, int i11, int i12, String str, boolean z5, BlockedGroupButton blockedGroupButton, List list, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i7 = blockedGroupRow.index;
        }
        if ((i13 & 2) != 0) {
            changeType = blockedGroupRow.changeType;
        }
        if ((i13 & 4) != 0) {
            i10 = blockedGroupRow.color;
        }
        if ((i13 & 8) != 0) {
            i11 = blockedGroupRow.borderColor;
        }
        if ((i13 & 16) != 0) {
            i12 = blockedGroupRow.backgroundColor;
        }
        if ((i13 & 32) != 0) {
            str = blockedGroupRow.text;
        }
        if ((i13 & 64) != 0) {
            z5 = blockedGroupRow.revealed;
        }
        if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            blockedGroupButton = blockedGroupRow.button;
        }
        if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            list = blockedGroupRow.content;
        }
        if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            bool = blockedGroupRow.canUncollapse;
        }
        List list2 = list;
        Boolean bool2 = bool;
        boolean z6 = z5;
        BlockedGroupButton blockedGroupButton2 = blockedGroupButton;
        int i14 = i12;
        String str2 = str;
        return blockedGroupRow.copy(i7, changeType, i10, i11, i14, str2, z6, blockedGroupButton2, list2, bool2);
    }

    public static final /* synthetic */ void write$Self$chat_release(BlockedGroupRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.l(0, self.getIndex(), serialDesc);
        output.g(serialDesc, 1, ChangeType.Serializer.INSTANCE, self.getChangeType());
        output.l(2, self.color, serialDesc);
        output.l(3, self.borderColor, serialDesc);
        output.l(4, self.backgroundColor, serialDesc);
        output.q(serialDesc, 5, self.text);
        output.p(serialDesc, 6, self.revealed);
        output.g(serialDesc, 7, BlockedGroupButton$$serializer.INSTANCE, self.button);
        if (output.u(serialDesc, 8) || self.content != null) {
            output.r(serialDesc, 8, (KSerializer) lazyArr[8].getValue(), self.content);
        }
        if (!output.u(serialDesc, 9) && Intrinsics.areEqual(self.canUncollapse, Boolean.TRUE)) {
            return;
        }
        output.r(serialDesc, 9, g.f17537a, self.canUncollapse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getCanUncollapse() {
        return this.canUncollapse;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChangeType getChangeType() {
        return this.changeType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getRevealed() {
        return this.revealed;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BlockedGroupButton getButton() {
        return this.button;
    }

    public final List<BlockedGroupContent> component9() {
        return this.content;
    }

    @NotNull
    public final BlockedGroupRow copy(int index, @NotNull ChangeType changeType, int color, int borderColor, int backgroundColor, @NotNull String text, boolean revealed, @NotNull BlockedGroupButton button, List<BlockedGroupContent> content, Boolean canUncollapse) {
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(button, "button");
        return new BlockedGroupRow(index, changeType, color, borderColor, backgroundColor, text, revealed, button, content, canUncollapse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockedGroupRow)) {
            return false;
        }
        BlockedGroupRow blockedGroupRow = (BlockedGroupRow) other;
        return this.index == blockedGroupRow.index && this.changeType == blockedGroupRow.changeType && this.color == blockedGroupRow.color && this.borderColor == blockedGroupRow.borderColor && this.backgroundColor == blockedGroupRow.backgroundColor && Intrinsics.areEqual(this.text, blockedGroupRow.text) && this.revealed == blockedGroupRow.revealed && Intrinsics.areEqual(this.button, blockedGroupRow.button) && Intrinsics.areEqual(this.content, blockedGroupRow.content) && Intrinsics.areEqual(this.canUncollapse, blockedGroupRow.canUncollapse);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final BlockedGroupButton getButton() {
        return this.button;
    }

    public final Boolean getCanUncollapse() {
        return this.canUncollapse;
    }

    @Override // com.discord.chat.bridge.row.Row
    @NotNull
    public ChangeType getChangeType() {
        return this.changeType;
    }

    public final int getColor() {
        return this.color;
    }

    public final List<BlockedGroupContent> getContent() {
        return this.content;
    }

    @Override // com.discord.chat.bridge.row.Row
    public int getIndex() {
        return this.index;
    }

    public final boolean getRevealed() {
        return this.revealed;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = (this.button.hashCode() + com.discord.chat.presentation.list.a.g(e.d(com.discord.chat.presentation.list.a.u(this.backgroundColor, com.discord.chat.presentation.list.a.u(this.borderColor, com.discord.chat.presentation.list.a.u(this.color, (this.changeType.hashCode() + (Integer.hashCode(this.index) * 31)) * 31, 31), 31), 31), 31, this.text), 31, this.revealed)) * 31;
        List<BlockedGroupContent> list = this.content;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.canUncollapse;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i7 = this.index;
        ChangeType changeType = this.changeType;
        int i10 = this.color;
        int i11 = this.borderColor;
        int i12 = this.backgroundColor;
        String str = this.text;
        boolean z5 = this.revealed;
        BlockedGroupButton blockedGroupButton = this.button;
        List<BlockedGroupContent> list = this.content;
        Boolean bool = this.canUncollapse;
        StringBuilder sb2 = new StringBuilder("BlockedGroupRow(index=");
        sb2.append(i7);
        sb2.append(", changeType=");
        sb2.append(changeType);
        sb2.append(", color=");
        e.z(sb2, i10, ", borderColor=", i11, ", backgroundColor=");
        sb2.append(i12);
        sb2.append(", text=");
        sb2.append(str);
        sb2.append(", revealed=");
        sb2.append(z5);
        sb2.append(", button=");
        sb2.append(blockedGroupButton);
        sb2.append(", content=");
        sb2.append(list);
        sb2.append(", canUncollapse=");
        sb2.append(bool);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ BlockedGroupRow(int i7, ChangeType changeType, int i10, int i11, int i12, String str, boolean z5, BlockedGroupButton blockedGroupButton, List list, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, changeType, i10, i11, i12, str, z5, blockedGroupButton, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : list, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? Boolean.TRUE : bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedGroupRow(int i7, @NotNull ChangeType changeType, int i10, int i11, int i12, @NotNull String text, boolean z5, @NotNull BlockedGroupButton button, List<BlockedGroupContent> list, Boolean bool) {
        super(null);
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(button, "button");
        this.index = i7;
        this.changeType = changeType;
        this.color = i10;
        this.borderColor = i11;
        this.backgroundColor = i12;
        this.text = text;
        this.revealed = z5;
        this.button = button;
        this.content = list;
        this.canUncollapse = bool;
    }
}
