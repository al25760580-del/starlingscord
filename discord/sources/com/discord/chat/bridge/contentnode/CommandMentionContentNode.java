package com.discord.chat.bridge.contentnode;

import a3.e;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
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
import or.d;
import or.e1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JH\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u000eHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00064"}, d2 = {"Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", "channelId", "Lcom/discord/primitives/ChannelId;", "commandId", "", "commandName", "commandKey", "content", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM", "()J", "J", "getCommandId", "()Ljava/lang/String;", "getCommandName", "getCommandKey", "getContent", "()Ljava/util/List;", "component1", "component1-o4g7jtM", "component2", "component3", "component4", "component5", "copy", "copy-JrbBJuM", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CommandMentionContentNode extends MentionContentNode {
    private final long channelId;

    @NotNull
    private final String commandId;

    @NotNull
    private final String commandKey;

    @NotNull
    private final String commandName;

    @NotNull
    private final List<ContentNode> content;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, null, l.a(m.f19486e, new a(4))};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CommandMentionContentNode$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CommandMentionContentNode(int i7, ChannelId channelId, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, channelId, str, str2, str3, list, serializationConstructorMarker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ContentNodeSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-JrbBJuM$default, reason: not valid java name */
    public static /* synthetic */ CommandMentionContentNode m322copyJrbBJuM$default(CommandMentionContentNode commandMentionContentNode, long j, String str, String str2, String str3, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j = commandMentionContentNode.channelId;
        }
        long j5 = j;
        if ((i7 & 2) != 0) {
            str = commandMentionContentNode.commandId;
        }
        String str4 = str;
        if ((i7 & 4) != 0) {
            str2 = commandMentionContentNode.commandName;
        }
        String str5 = str2;
        if ((i7 & 8) != 0) {
            str3 = commandMentionContentNode.commandKey;
        }
        String str6 = str3;
        if ((i7 & 16) != 0) {
            list = commandMentionContentNode.content;
        }
        return commandMentionContentNode.m324copyJrbBJuM(j5, str4, str5, str6, list);
    }

    public static final /* synthetic */ void write$Self$chat_release(CommandMentionContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        MentionContentNode.write$Self(self, output, serialDesc);
        Lazy[] lazyArr = $childSerializers;
        output.g(serialDesc, 0, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
        output.q(serialDesc, 1, self.commandId);
        output.q(serialDesc, 2, self.commandName);
        output.q(serialDesc, 3, self.commandKey);
        output.g(serialDesc, 4, (KSerializer) lazyArr[4].getValue(), self.getContent());
    }

    /* JADX INFO: renamed from: component1-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
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
    public final List<ContentNode> component5() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-JrbBJuM, reason: not valid java name */
    public final CommandMentionContentNode m324copyJrbBJuM(long channelId, @NotNull String commandId, @NotNull String commandName, @NotNull String commandKey, @NotNull List<? extends ContentNode> content) {
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        Intrinsics.checkNotNullParameter(commandName, "commandName");
        Intrinsics.checkNotNullParameter(commandKey, "commandKey");
        Intrinsics.checkNotNullParameter(content, "content");
        return new CommandMentionContentNode(channelId, commandId, commandName, commandKey, content, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommandMentionContentNode)) {
            return false;
        }
        CommandMentionContentNode commandMentionContentNode = (CommandMentionContentNode) other;
        return ChannelId.m1134equalsimpl0(this.channelId, commandMentionContentNode.channelId) && Intrinsics.areEqual(this.commandId, commandMentionContentNode.commandId) && Intrinsics.areEqual(this.commandName, commandMentionContentNode.commandName) && Intrinsics.areEqual(this.commandKey, commandMentionContentNode.commandKey) && Intrinsics.areEqual(this.content, commandMentionContentNode.content);
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m325getChannelIdo4g7jtM() {
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

    @Override // com.discord.chat.bridge.contentnode.MentionContentNode
    @NotNull
    public List<ContentNode> getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode() + e.d(e.d(e.d(ChannelId.m1135hashCodeimpl(this.channelId) * 31, 31, this.commandId), 31, this.commandName), 31, this.commandKey);
    }

    @NotNull
    public String toString() {
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        String str = this.commandId;
        String str2 = this.commandName;
        String str3 = this.commandKey;
        List<ContentNode> list = this.content;
        StringBuilder sbU = e.u("CommandMentionContentNode(channelId=", strM1137toStringimpl, ", commandId=", str, ", commandName=");
        e.A(sbU, str2, ", commandKey=", str3, ", content=");
        sbU.append(list);
        sbU.append(")");
        return sbU.toString();
    }

    public /* synthetic */ CommandMentionContentNode(long j, String str, String str2, String str3, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CommandMentionContentNode(int i7, ChannelId channelId, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i7, serializationConstructorMarker);
        if (31 != (i7 & 31)) {
            e1.l(i7, 31, CommandMentionContentNode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.channelId = channelId.m1139unboximpl();
        this.commandId = str;
        this.commandName = str2;
        this.commandKey = str3;
        this.content = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private CommandMentionContentNode(long j, String commandId, String commandName, String commandKey, List<? extends ContentNode> content) {
        super(null);
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        Intrinsics.checkNotNullParameter(commandName, "commandName");
        Intrinsics.checkNotNullParameter(commandKey, "commandKey");
        Intrinsics.checkNotNullParameter(content, "content");
        this.channelId = j;
        this.commandId = commandId;
        this.commandName = commandName;
        this.commandKey = commandKey;
        this.content = content;
    }
}
