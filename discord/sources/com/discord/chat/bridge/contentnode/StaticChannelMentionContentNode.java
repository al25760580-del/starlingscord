package com.discord.chat.bridge.contentnode;

import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.facebook.react.devsupport.StackTraceHelper;
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
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u001cJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J@\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0002\b J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u000eHÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", StackTraceHelper.ID_KEY, "Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType;", "guildId", "Lcom/discord/primitives/GuildId;", "itemId", "", "content", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "<init>", "(Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/contentnode/StaticChannelMentionType;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId", "()Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType;", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getItemId", "()Ljava/lang/String;", "getContent", "()Ljava/util/List;", "component1", "component2", "component2-qOKuAAo", "component3", "component4", "copy", "copy-qphDXf8", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class StaticChannelMentionContentNode extends MentionContentNode {

    @NotNull
    private final List<ContentNode> content;
    private final GuildId guildId;

    @NotNull
    private final StaticChannelMentionType id;
    private final String itemId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, l.a(m.f19486e, new a(15))};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return StaticChannelMentionContentNode$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StaticChannelMentionContentNode(int i7, StaticChannelMentionType staticChannelMentionType, GuildId guildId, String str, List list, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, staticChannelMentionType, guildId, str, list, serializationConstructorMarker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ContentNodeSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-qphDXf8$default, reason: not valid java name */
    public static /* synthetic */ StaticChannelMentionContentNode m406copyqphDXf8$default(StaticChannelMentionContentNode staticChannelMentionContentNode, StaticChannelMentionType staticChannelMentionType, GuildId guildId, String str, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            staticChannelMentionType = staticChannelMentionContentNode.id;
        }
        if ((i7 & 2) != 0) {
            guildId = staticChannelMentionContentNode.guildId;
        }
        if ((i7 & 4) != 0) {
            str = staticChannelMentionContentNode.itemId;
        }
        if ((i7 & 8) != 0) {
            list = staticChannelMentionContentNode.content;
        }
        return staticChannelMentionContentNode.m408copyqphDXf8(staticChannelMentionType, guildId, str, list);
    }

    public static final /* synthetic */ void write$Self$chat_release(StaticChannelMentionContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        MentionContentNode.write$Self(self, output, serialDesc);
        Lazy[] lazyArr = $childSerializers;
        output.g(serialDesc, 0, StaticChannelMentionType.Serializer.INSTANCE, self.id);
        if (output.u(serialDesc, 1) || self.guildId != null) {
            output.r(serialDesc, 1, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (output.u(serialDesc, 2) || self.itemId != null) {
            output.r(serialDesc, 2, s1.f17602a, self.itemId);
        }
        output.g(serialDesc, 3, (KSerializer) lazyArr[3].getValue(), self.getContent());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StaticChannelMentionType getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2-qOKuAAo, reason: not valid java name and from getter */
    public final GuildId getGuildId() {
        return this.guildId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    public final List<ContentNode> component4() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-qphDXf8, reason: not valid java name */
    public final StaticChannelMentionContentNode m408copyqphDXf8(@NotNull StaticChannelMentionType id2, GuildId guildId, String itemId, @NotNull List<? extends ContentNode> content) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        return new StaticChannelMentionContentNode(id2, guildId, itemId, content, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticChannelMentionContentNode)) {
            return false;
        }
        StaticChannelMentionContentNode staticChannelMentionContentNode = (StaticChannelMentionContentNode) other;
        return this.id == staticChannelMentionContentNode.id && Intrinsics.areEqual(this.guildId, staticChannelMentionContentNode.guildId) && Intrinsics.areEqual(this.itemId, staticChannelMentionContentNode.itemId) && Intrinsics.areEqual(this.content, staticChannelMentionContentNode.content);
    }

    @Override // com.discord.chat.bridge.contentnode.MentionContentNode
    @NotNull
    public List<ContentNode> getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: getGuildId-qOKuAAo, reason: not valid java name */
    public final GuildId m409getGuildIdqOKuAAo() {
        return this.guildId;
    }

    @NotNull
    public final StaticChannelMentionType getId() {
        return this.id;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        GuildId guildId = this.guildId;
        int iM1148hashCodeimpl = (iHashCode + (guildId == null ? 0 : GuildId.m1148hashCodeimpl(guildId.m1152unboximpl()))) * 31;
        String str = this.itemId;
        return this.content.hashCode() + ((iM1148hashCodeimpl + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "StaticChannelMentionContentNode(id=" + this.id + ", guildId=" + this.guildId + ", itemId=" + this.itemId + ", content=" + this.content + ")";
    }

    public /* synthetic */ StaticChannelMentionContentNode(StaticChannelMentionType staticChannelMentionType, GuildId guildId, String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(staticChannelMentionType, guildId, str, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private /* synthetic */ StaticChannelMentionContentNode(int i7, StaticChannelMentionType staticChannelMentionType, GuildId guildId, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i7, serializationConstructorMarker);
        if (9 != (i7 & 9)) {
            e1.l(i7, 9, StaticChannelMentionContentNode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = staticChannelMentionType;
        if ((i7 & 2) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((i7 & 4) == 0) {
            this.itemId = null;
        } else {
            this.itemId = str;
        }
        this.content = list;
    }

    public /* synthetic */ StaticChannelMentionContentNode(StaticChannelMentionType staticChannelMentionType, GuildId guildId, String str, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(staticChannelMentionType, (i7 & 2) != 0 ? null : guildId, (i7 & 4) != 0 ? null : str, list, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private StaticChannelMentionContentNode(StaticChannelMentionType id2, GuildId guildId, String str, List<? extends ContentNode> content) {
        super(null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = id2;
        this.guildId = guildId;
        this.itemId = str;
        this.content = content;
    }
}
