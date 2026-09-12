package com.discord.chat.reactevents;

import a3.e;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.ChannelId;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0007\u0010\u0010J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\rHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006+"}, d2 = {"Lcom/discord/chat/reactevents/LongPressCommandData;", "Lcom/discord/reactevents/ReactEvent;", "channelId", "", "commandId", "commandName", "commandKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "node", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getChannelId", "()Ljava/lang/String;", "getCommandId", "getCommandName", "getCommandKey", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LongPressCommandData implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String channelId;

    @NotNull
    private final String commandId;

    @NotNull
    private final String commandKey;

    @NotNull
    private final String commandName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/reactevents/LongPressCommandData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/LongPressCommandData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return LongPressCommandData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LongPressCommandData(int i7, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i7 & 15)) {
            e1.l(i7, 15, LongPressCommandData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.channelId = str;
        this.commandId = str2;
        this.commandName = str3;
        this.commandKey = str4;
    }

    public static /* synthetic */ LongPressCommandData copy$default(LongPressCommandData longPressCommandData, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = longPressCommandData.channelId;
        }
        if ((i7 & 2) != 0) {
            str2 = longPressCommandData.commandId;
        }
        if ((i7 & 4) != 0) {
            str3 = longPressCommandData.commandName;
        }
        if ((i7 & 8) != 0) {
            str4 = longPressCommandData.commandKey;
        }
        return longPressCommandData.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$chat_release(LongPressCommandData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.channelId);
        output.q(serialDesc, 1, self.commandId);
        output.q(serialDesc, 2, self.commandName);
        output.q(serialDesc, 3, self.commandKey);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCommandId() {
        return this.commandId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCommandName() {
        return this.commandName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCommandKey() {
        return this.commandKey;
    }

    @NotNull
    public final LongPressCommandData copy(@NotNull String channelId, @NotNull String commandId, @NotNull String commandName, @NotNull String commandKey) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        Intrinsics.checkNotNullParameter(commandName, "commandName");
        Intrinsics.checkNotNullParameter(commandKey, "commandKey");
        return new LongPressCommandData(channelId, commandId, commandName, commandKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LongPressCommandData)) {
            return false;
        }
        LongPressCommandData longPressCommandData = (LongPressCommandData) other;
        return Intrinsics.areEqual(this.channelId, longPressCommandData.channelId) && Intrinsics.areEqual(this.commandId, longPressCommandData.commandId) && Intrinsics.areEqual(this.commandName, longPressCommandData.commandName) && Intrinsics.areEqual(this.commandKey, longPressCommandData.commandKey);
    }

    @NotNull
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    public final String getCommandId() {
        return this.commandId;
    }

    @NotNull
    public final String getCommandKey() {
        return this.commandKey;
    }

    @NotNull
    public final String getCommandName() {
        return this.commandName;
    }

    public int hashCode() {
        return this.commandKey.hashCode() + e.d(e.d(this.channelId.hashCode() * 31, 31, this.commandId), 31, this.commandName);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        String str = this.channelId;
        String str2 = this.commandId;
        return a.l(e.u("LongPressCommandData(channelId=", str, ", commandId=", str2, ", commandName="), this.commandName, ", commandKey=", this.commandKey, ")");
    }

    public LongPressCommandData(@NotNull String channelId, @NotNull String commandId, @NotNull String commandName, @NotNull String commandKey) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        Intrinsics.checkNotNullParameter(commandName, "commandName");
        Intrinsics.checkNotNullParameter(commandKey, "commandKey");
        this.channelId = channelId;
        this.commandId = commandId;
        this.commandName = commandName;
        this.commandKey = commandKey;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LongPressCommandData(@NotNull CommandMentionContentNode node) {
        this(ChannelId.m1137toStringimpl(node.m325getChannelIdo4g7jtM()), node.getCommandId(), node.getCommandName(), node.getCommandKey());
        Intrinsics.checkNotNullParameter(node, "node");
    }
}
