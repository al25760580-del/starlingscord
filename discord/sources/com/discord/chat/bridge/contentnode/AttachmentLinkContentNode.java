package com.discord.chat.bridge.contentnode;

import a3.e;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lcom/discord/chat/bridge/contentnode/AttachmentLinkContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", "attachmentUrl", "", "attachmentName", "content", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAttachmentUrl", "()Ljava/lang/String;", "getAttachmentName", "getContent", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AttachmentLinkContentNode extends MentionContentNode {

    @NotNull
    private final String attachmentName;

    @NotNull
    private final String attachmentUrl;
    private final List<ContentNode> content;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, l.a(m.f19486e, new a7.a(28))};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/AttachmentLinkContentNode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/AttachmentLinkContentNode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AttachmentLinkContentNode$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttachmentLinkContentNode(int i7, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i7, serializationConstructorMarker);
        if (7 != (i7 & 7)) {
            e1.l(i7, 7, AttachmentLinkContentNode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.attachmentUrl = str;
        this.attachmentName = str2;
        this.content = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ContentNodeSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttachmentLinkContentNode copy$default(AttachmentLinkContentNode attachmentLinkContentNode, String str, String str2, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = attachmentLinkContentNode.attachmentUrl;
        }
        if ((i7 & 2) != 0) {
            str2 = attachmentLinkContentNode.attachmentName;
        }
        if ((i7 & 4) != 0) {
            list = attachmentLinkContentNode.content;
        }
        return attachmentLinkContentNode.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$chat_release(AttachmentLinkContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        MentionContentNode.write$Self(self, output, serialDesc);
        Lazy[] lazyArr = $childSerializers;
        output.q(serialDesc, 0, self.attachmentUrl);
        output.q(serialDesc, 1, self.attachmentName);
        output.r(serialDesc, 2, (KSerializer) lazyArr[2].getValue(), self.getContent());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAttachmentName() {
        return this.attachmentName;
    }

    public final List<ContentNode> component3() {
        return this.content;
    }

    @NotNull
    public final AttachmentLinkContentNode copy(@NotNull String attachmentUrl, @NotNull String attachmentName, List<? extends ContentNode> content) {
        Intrinsics.checkNotNullParameter(attachmentUrl, "attachmentUrl");
        Intrinsics.checkNotNullParameter(attachmentName, "attachmentName");
        return new AttachmentLinkContentNode(attachmentUrl, attachmentName, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentLinkContentNode)) {
            return false;
        }
        AttachmentLinkContentNode attachmentLinkContentNode = (AttachmentLinkContentNode) other;
        return Intrinsics.areEqual(this.attachmentUrl, attachmentLinkContentNode.attachmentUrl) && Intrinsics.areEqual(this.attachmentName, attachmentLinkContentNode.attachmentName) && Intrinsics.areEqual(this.content, attachmentLinkContentNode.content);
    }

    @NotNull
    public final String getAttachmentName() {
        return this.attachmentName;
    }

    @NotNull
    public final String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    @Override // com.discord.chat.bridge.contentnode.MentionContentNode
    public List<ContentNode> getContent() {
        return this.content;
    }

    public int hashCode() {
        int iD = e.d(this.attachmentUrl.hashCode() * 31, 31, this.attachmentName);
        List<ContentNode> list = this.content;
        return iD + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.attachmentUrl;
        String str2 = this.attachmentName;
        List<ContentNode> list = this.content;
        StringBuilder sbU = e.u("AttachmentLinkContentNode(attachmentUrl=", str, ", attachmentName=", str2, ", content=");
        sbU.append(list);
        sbU.append(")");
        return sbU.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentLinkContentNode(@NotNull String attachmentUrl, @NotNull String attachmentName, List<? extends ContentNode> list) {
        super(null);
        Intrinsics.checkNotNullParameter(attachmentUrl, "attachmentUrl");
        Intrinsics.checkNotNullParameter(attachmentName, "attachmentName");
        this.attachmentUrl = attachmentUrl;
        this.attachmentName = attachmentName;
        this.content = list;
    }
}
