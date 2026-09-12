package com.discord.chat.bridge.contentnode;

import a3.e;
import com.discord.chat.bridge.ChannelType;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\fHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006,"}, d2 = {"Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "channelType", "Lcom/discord/chat/bridge/ChannelType;", "iconType", "", "icon", "content", "", "<init>", "(Lcom/discord/chat/bridge/ChannelType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/ChannelType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getChannelType", "()Lcom/discord/chat/bridge/ChannelType;", "getIconType", "()Ljava/lang/String;", "getIcon", "getContent", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChannelNameContentNode extends ContentNode {
    private final ChannelType channelType;

    @NotNull
    private final List<ContentNode> content;
    private final String icon;

    @NotNull
    private final String iconType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, l.a(m.f19486e, new a(3))};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ChannelNameContentNode$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChannelNameContentNode(int i7, ChannelType channelType, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (10 != (i7 & 10)) {
            e1.l(i7, 10, ChannelNameContentNode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        if ((i7 & 1) == 0) {
            this.channelType = null;
        } else {
            this.channelType = channelType;
        }
        this.iconType = str;
        if ((i7 & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str2;
        }
        this.content = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ContentNodeSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelNameContentNode copy$default(ChannelNameContentNode channelNameContentNode, ChannelType channelType, String str, String str2, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            channelType = channelNameContentNode.channelType;
        }
        if ((i7 & 2) != 0) {
            str = channelNameContentNode.iconType;
        }
        if ((i7 & 4) != 0) {
            str2 = channelNameContentNode.icon;
        }
        if ((i7 & 8) != 0) {
            list = channelNameContentNode.content;
        }
        return channelNameContentNode.copy(channelType, str, str2, list);
    }

    public static final /* synthetic */ void write$Self$chat_release(ChannelNameContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        if (output.u(serialDesc, 0) || self.channelType != null) {
            output.r(serialDesc, 0, ChannelType.Serializer.INSTANCE, self.channelType);
        }
        output.q(serialDesc, 1, self.iconType);
        if (output.u(serialDesc, 2) || self.icon != null) {
            output.r(serialDesc, 2, s1.f17602a, self.icon);
        }
        output.g(serialDesc, 3, (KSerializer) lazyArr[3].getValue(), self.content);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChannelType getChannelType() {
        return this.channelType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIconType() {
        return this.iconType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<ContentNode> component4() {
        return this.content;
    }

    @NotNull
    public final ChannelNameContentNode copy(ChannelType channelType, @NotNull String iconType, String icon, @NotNull List<? extends ContentNode> content) {
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ChannelNameContentNode(channelType, iconType, icon, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelNameContentNode)) {
            return false;
        }
        ChannelNameContentNode channelNameContentNode = (ChannelNameContentNode) other;
        return this.channelType == channelNameContentNode.channelType && Intrinsics.areEqual(this.iconType, channelNameContentNode.iconType) && Intrinsics.areEqual(this.icon, channelNameContentNode.icon) && Intrinsics.areEqual(this.content, channelNameContentNode.content);
    }

    public final ChannelType getChannelType() {
        return this.channelType;
    }

    @NotNull
    public final List<ContentNode> getContent() {
        return this.content;
    }

    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getIconType() {
        return this.iconType;
    }

    public int hashCode() {
        ChannelType channelType = this.channelType;
        int iD = e.d((channelType == null ? 0 : channelType.hashCode()) * 31, 31, this.iconType);
        String str = this.icon;
        return this.content.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ChannelNameContentNode(channelType=" + this.channelType + ", iconType=" + this.iconType + ", icon=" + this.icon + ", content=" + this.content + ")";
    }

    public /* synthetic */ ChannelNameContentNode(ChannelType channelType, String str, String str2, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : channelType, str, (i7 & 4) != 0 ? null : str2, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelNameContentNode(ChannelType channelType, @NotNull String iconType, String str, @NotNull List<? extends ContentNode> content) {
        super(null);
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        Intrinsics.checkNotNullParameter(content, "content");
        this.channelType = channelType;
        this.iconType = iconType;
        this.icon = str;
        this.content = content;
    }
}
