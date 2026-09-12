package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.rolecolors.RoleColors$$serializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.d;
import or.e1;
import or.g;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002:;B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0083\u0001\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J%\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010-\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\tHÖ\u0001J\t\u00101\u001a\u00020\u0012HÖ\u0001J%\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\b9R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'¨\u0006<"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "content", "", "target", "Lcom/discord/chat/bridge/contentnode/LinkContextData;", "<init>", "(Ljava/util/List;Lcom/discord/chat/bridge/contentnode/LinkContextData;)V", "seen0", "", "linkColor", "roleColors", "Lcom/discord/chat/bridge/rolecolors/RoleColors;", "bindUserMenuRoleColor", "shouldShowRoleDot", "", "medium", "url", "", "isUrl", "textContent", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/discord/chat/bridge/contentnode/LinkContextData;Ljava/lang/Integer;Lcom/discord/chat/bridge/rolecolors/RoleColors;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContent", "()Ljava/util/List;", "getTarget", "()Lcom/discord/chat/bridge/contentnode/LinkContextData;", "getLinkColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRoleColors", "()Lcom/discord/chat/bridge/rolecolors/RoleColors;", "getBindUserMenuRoleColor", "getShouldShowRoleDot", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMedium", "getUrl", "()Ljava/lang/String;", "()Z", "getTextContent", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinkContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkContentNode.kt\ncom/discord/chat/bridge/contentnode/LinkContentNode\n+ 2 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n*L\n1#1,298:1\n8#2:299\n*S KotlinDebug\n*F\n+ 1 LinkContentNode.kt\ncom/discord/chat/bridge/contentnode/LinkContentNode\n*L\n84#1:299\n*E\n"})
public final /* data */ class LinkContentNode extends ContentNode {
    private final Integer bindUserMenuRoleColor;

    @NotNull
    private final List<ContentNode> content;
    private final boolean isUrl;
    private final Integer linkColor;
    private final Boolean medium;
    private final RoleColors roleColors;
    private final Boolean shouldShowRoleDot;
    private final LinkContextData target;
    private final String textContent;
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {l.a(m.f19486e, new a(10)), null, null, null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContentNode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return LinkContentNode$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ LinkContentNode(int i7, List list, LinkContextData linkContextData, Integer num, RoleColors roleColors, Integer num2, Boolean bool, Boolean bool2, String str, boolean z5, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        String content;
        String url;
        Boolean medium;
        Object[] objArr = 0;
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, LinkContentNode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(objArr == true ? 1 : 0);
        this.content = list;
        this.target = linkContextData;
        if ((i7 & 4) == 0) {
            if (linkContextData instanceof LinkContextData.BindUserMenu) {
                num = ((LinkContextData.BindUserMenu) linkContextData).getLinkColor();
            } else if (linkContextData instanceof LinkContextData.BindOpenUrl) {
                num = ((LinkContextData.BindOpenUrl) linkContextData).getLinkColor();
            } else if (linkContextData instanceof LinkContextData.BindOpenGdmCustomizeActionSheet) {
                num = ((LinkContextData.BindOpenGdmCustomizeActionSheet) linkContextData).getLinkColor();
            } else {
                num = linkContextData instanceof LinkContextData.BindDoNothing ? ((LinkContextData.BindDoNothing) linkContextData).getLinkColor() : null;
            }
        }
        this.linkColor = num;
        if ((i7 & 8) == 0) {
            this.roleColors = linkContextData instanceof LinkContextData.BindUserMenu ? ((LinkContextData.BindUserMenu) linkContextData).getRoleColors() : null;
        } else {
            this.roleColors = roleColors;
        }
        if ((i7 & 16) == 0) {
            this.bindUserMenuRoleColor = linkContextData instanceof LinkContextData.BindUserMenu ? ((LinkContextData.BindUserMenu) linkContextData).getRoleColor() : null;
        } else {
            this.bindUserMenuRoleColor = num2;
        }
        if ((i7 & 32) == 0) {
            this.shouldShowRoleDot = linkContextData instanceof LinkContextData.BindUserMenu ? ((LinkContextData.BindUserMenu) linkContextData).getShouldShowRoleDot() : null;
        } else {
            this.shouldShowRoleDot = bool;
        }
        if ((i7 & 64) == 0) {
            if (linkContextData instanceof LinkContextData.BindUserMenu) {
                medium = ((LinkContextData.BindUserMenu) linkContextData).getMedium();
            } else if (linkContextData instanceof LinkContextData.BindOpenThreadChannel) {
                medium = ((LinkContextData.BindOpenThreadChannel) linkContextData).getMedium();
            } else if (linkContextData instanceof LinkContextData.BindOpenUrl) {
                medium = ((LinkContextData.BindOpenUrl) linkContextData).getMedium();
            } else if (linkContextData instanceof LinkContextData.BindOpenPins) {
                medium = ((LinkContextData.BindOpenPins) linkContextData).getMedium();
            } else if (linkContextData instanceof LinkContextData.BindGuildMenu) {
                medium = ((LinkContextData.BindGuildMenu) linkContextData).getMedium();
            } else if (linkContextData instanceof LinkContextData.BindOpenGdmCustomizeActionSheet) {
                medium = ((LinkContextData.BindOpenGdmCustomizeActionSheet) linkContextData).getMedium();
            } else if (linkContextData instanceof LinkContextData.BindJumpToMessage) {
                medium = ((LinkContextData.BindJumpToMessage) linkContextData).getMedium();
            } else {
                medium = linkContextData instanceof LinkContextData.BindDoNothing ? ((LinkContextData.BindDoNothing) linkContextData).getMedium() : null;
            }
            this.medium = medium;
        } else {
            this.medium = bool2;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            if (linkContextData instanceof LinkContextData.LinkUrl) {
                url = ((LinkContextData.LinkUrl) linkContextData).getUrl();
            } else {
                url = linkContextData instanceof LinkContextData.BindOpenUrl ? ((LinkContextData.BindOpenUrl) linkContextData).getUrl() : null;
            }
            this.url = url;
        } else {
            this.url = str;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.isUrl = this.url != null;
        } else {
            this.isUrl = z5;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            this.textContent = str2;
            return;
        }
        ContentNode contentNode = (ContentNode) CollectionsKt.firstOrNull(list);
        if (contentNode != null) {
            TextContentNode textContentNode = (TextContentNode) (contentNode instanceof TextContentNode ? contentNode : null);
            content = (textContentNode == null || (content = textContentNode.getContent()) == null) ? this.url : content;
        }
        this.textContent = content;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ContentNodeSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkContentNode copy$default(LinkContentNode linkContentNode, List list, LinkContextData linkContextData, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = linkContentNode.content;
        }
        if ((i7 & 2) != 0) {
            linkContextData = linkContentNode.target;
        }
        return linkContentNode.copy(list, linkContextData);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0183  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:81:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x016a  */
    public static final /* synthetic */ void write$Self$chat_release(LinkContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        String content;
        String url;
        Boolean medium;
        Integer linkColor;
        output.g(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.content);
        output.r(serialDesc, 1, LinkContextDataSerializer.INSTANCE, self.target);
        if (output.u(serialDesc, 2)) {
            output.r(serialDesc, 2, m0.f17573a, self.linkColor);
        } else {
            Integer num = self.linkColor;
            LinkContextData linkContextData = self.target;
            if (linkContextData instanceof LinkContextData.BindUserMenu) {
                linkColor = ((LinkContextData.BindUserMenu) linkContextData).getLinkColor();
            } else if (linkContextData instanceof LinkContextData.BindOpenUrl) {
                linkColor = ((LinkContextData.BindOpenUrl) linkContextData).getLinkColor();
            } else if (linkContextData instanceof LinkContextData.BindOpenGdmCustomizeActionSheet) {
                linkColor = ((LinkContextData.BindOpenGdmCustomizeActionSheet) linkContextData).getLinkColor();
            } else {
                linkColor = linkContextData instanceof LinkContextData.BindDoNothing ? ((LinkContextData.BindDoNothing) linkContextData).getLinkColor() : null;
            }
            if (!Intrinsics.areEqual(num, linkColor)) {
                output.r(serialDesc, 2, m0.f17573a, self.linkColor);
            }
        }
        if (output.u(serialDesc, 3)) {
            output.r(serialDesc, 3, RoleColors$$serializer.INSTANCE, self.roleColors);
        } else {
            RoleColors roleColors = self.roleColors;
            LinkContextData linkContextData2 = self.target;
            if (!Intrinsics.areEqual(roleColors, linkContextData2 instanceof LinkContextData.BindUserMenu ? ((LinkContextData.BindUserMenu) linkContextData2).getRoleColors() : null)) {
                output.r(serialDesc, 3, RoleColors$$serializer.INSTANCE, self.roleColors);
            }
        }
        if (output.u(serialDesc, 4)) {
            output.r(serialDesc, 4, m0.f17573a, self.bindUserMenuRoleColor);
        } else {
            Integer num2 = self.bindUserMenuRoleColor;
            LinkContextData linkContextData3 = self.target;
            if (!Intrinsics.areEqual(num2, linkContextData3 instanceof LinkContextData.BindUserMenu ? ((LinkContextData.BindUserMenu) linkContextData3).getRoleColor() : null)) {
                output.r(serialDesc, 4, m0.f17573a, self.bindUserMenuRoleColor);
            }
        }
        if (output.u(serialDesc, 5)) {
            output.r(serialDesc, 5, g.f17537a, self.shouldShowRoleDot);
        } else {
            Boolean bool = self.shouldShowRoleDot;
            LinkContextData linkContextData4 = self.target;
            if (!Intrinsics.areEqual(bool, linkContextData4 instanceof LinkContextData.BindUserMenu ? ((LinkContextData.BindUserMenu) linkContextData4).getShouldShowRoleDot() : null)) {
                output.r(serialDesc, 5, g.f17537a, self.shouldShowRoleDot);
            }
        }
        if (output.u(serialDesc, 6)) {
            output.r(serialDesc, 6, g.f17537a, self.medium);
        } else {
            Boolean bool2 = self.medium;
            LinkContextData linkContextData5 = self.target;
            if (linkContextData5 instanceof LinkContextData.BindUserMenu) {
                medium = ((LinkContextData.BindUserMenu) linkContextData5).getMedium();
            } else if (linkContextData5 instanceof LinkContextData.BindOpenThreadChannel) {
                medium = ((LinkContextData.BindOpenThreadChannel) linkContextData5).getMedium();
            } else if (linkContextData5 instanceof LinkContextData.BindOpenUrl) {
                medium = ((LinkContextData.BindOpenUrl) linkContextData5).getMedium();
            } else if (linkContextData5 instanceof LinkContextData.BindOpenPins) {
                medium = ((LinkContextData.BindOpenPins) linkContextData5).getMedium();
            } else if (linkContextData5 instanceof LinkContextData.BindGuildMenu) {
                medium = ((LinkContextData.BindGuildMenu) linkContextData5).getMedium();
            } else if (linkContextData5 instanceof LinkContextData.BindOpenGdmCustomizeActionSheet) {
                medium = ((LinkContextData.BindOpenGdmCustomizeActionSheet) linkContextData5).getMedium();
            } else if (linkContextData5 instanceof LinkContextData.BindJumpToMessage) {
                medium = ((LinkContextData.BindJumpToMessage) linkContextData5).getMedium();
            } else {
                medium = linkContextData5 instanceof LinkContextData.BindDoNothing ? ((LinkContextData.BindDoNothing) linkContextData5).getMedium() : null;
            }
            if (!Intrinsics.areEqual(bool2, medium)) {
                output.r(serialDesc, 6, g.f17537a, self.medium);
            }
        }
        if (output.u(serialDesc, 7)) {
            output.r(serialDesc, 7, s1.f17602a, self.url);
        } else {
            String str = self.url;
            LinkContextData linkContextData6 = self.target;
            if (linkContextData6 instanceof LinkContextData.LinkUrl) {
                url = ((LinkContextData.LinkUrl) linkContextData6).getUrl();
            } else {
                url = linkContextData6 instanceof LinkContextData.BindOpenUrl ? ((LinkContextData.BindOpenUrl) linkContextData6).getUrl() : null;
            }
            if (!Intrinsics.areEqual(str, url)) {
                output.r(serialDesc, 7, s1.f17602a, self.url);
            }
        }
        if (output.u(serialDesc, 8)) {
            output.p(serialDesc, 8, self.isUrl);
        } else {
            if (self.isUrl != (self.url != null)) {
                output.p(serialDesc, 8, self.isUrl);
            }
        }
        if (!output.u(serialDesc, 9)) {
            String str2 = self.textContent;
            ContentNode contentNode = (ContentNode) CollectionsKt.firstOrNull(self.content);
            if (contentNode == null) {
                content = self.url;
            } else {
                TextContentNode textContentNode = (TextContentNode) (contentNode instanceof TextContentNode ? contentNode : null);
                if (textContentNode == null || (content = textContentNode.getContent()) == null) {
                    content = self.url;
                }
            }
            if (Intrinsics.areEqual(str2, content)) {
                return;
            }
        }
        output.r(serialDesc, 9, s1.f17602a, self.textContent);
    }

    @NotNull
    public final List<ContentNode> component1() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LinkContextData getTarget() {
        return this.target;
    }

    @NotNull
    public final LinkContentNode copy(@NotNull List<? extends ContentNode> content, LinkContextData target) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new LinkContentNode(content, target);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkContentNode)) {
            return false;
        }
        LinkContentNode linkContentNode = (LinkContentNode) other;
        return Intrinsics.areEqual(this.content, linkContentNode.content) && Intrinsics.areEqual(this.target, linkContentNode.target);
    }

    public final Integer getBindUserMenuRoleColor() {
        return this.bindUserMenuRoleColor;
    }

    @NotNull
    public final List<ContentNode> getContent() {
        return this.content;
    }

    public final Integer getLinkColor() {
        return this.linkColor;
    }

    public final Boolean getMedium() {
        return this.medium;
    }

    public final RoleColors getRoleColors() {
        return this.roleColors;
    }

    public final Boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final LinkContextData getTarget() {
        return this.target;
    }

    public final String getTextContent() {
        return this.textContent;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        LinkContextData linkContextData = this.target;
        return iHashCode + (linkContextData == null ? 0 : linkContextData.hashCode());
    }

    /* JADX INFO: renamed from: isUrl, reason: from getter */
    public final boolean getIsUrl() {
        return this.isUrl;
    }

    @NotNull
    public String toString() {
        return "LinkContentNode(content=" + this.content + ", target=" + this.target + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkContentNode(@NotNull List<? extends ContentNode> content, LinkContextData linkContextData) {
        Integer linkColor;
        Boolean medium;
        String url;
        String content2;
        super(0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.target = linkContextData;
        if (linkContextData instanceof LinkContextData.BindUserMenu) {
            linkColor = ((LinkContextData.BindUserMenu) linkContextData).getLinkColor();
        } else if (linkContextData instanceof LinkContextData.BindOpenUrl) {
            linkColor = ((LinkContextData.BindOpenUrl) linkContextData).getLinkColor();
        } else if (linkContextData instanceof LinkContextData.BindOpenGdmCustomizeActionSheet) {
            linkColor = ((LinkContextData.BindOpenGdmCustomizeActionSheet) linkContextData).getLinkColor();
        } else {
            linkColor = linkContextData instanceof LinkContextData.BindDoNothing ? ((LinkContextData.BindDoNothing) linkContextData).getLinkColor() : null;
        }
        this.linkColor = linkColor;
        this.roleColors = linkContextData instanceof LinkContextData.BindUserMenu ? ((LinkContextData.BindUserMenu) linkContextData).getRoleColors() : null;
        this.bindUserMenuRoleColor = linkContextData instanceof LinkContextData.BindUserMenu ? ((LinkContextData.BindUserMenu) linkContextData).getRoleColor() : null;
        this.shouldShowRoleDot = linkContextData instanceof LinkContextData.BindUserMenu ? ((LinkContextData.BindUserMenu) linkContextData).getShouldShowRoleDot() : null;
        if (linkContextData instanceof LinkContextData.BindUserMenu) {
            medium = ((LinkContextData.BindUserMenu) linkContextData).getMedium();
        } else if (linkContextData instanceof LinkContextData.BindOpenThreadChannel) {
            medium = ((LinkContextData.BindOpenThreadChannel) linkContextData).getMedium();
        } else if (linkContextData instanceof LinkContextData.BindOpenUrl) {
            medium = ((LinkContextData.BindOpenUrl) linkContextData).getMedium();
        } else if (linkContextData instanceof LinkContextData.BindOpenPins) {
            medium = ((LinkContextData.BindOpenPins) linkContextData).getMedium();
        } else if (linkContextData instanceof LinkContextData.BindGuildMenu) {
            medium = ((LinkContextData.BindGuildMenu) linkContextData).getMedium();
        } else if (linkContextData instanceof LinkContextData.BindOpenGdmCustomizeActionSheet) {
            medium = ((LinkContextData.BindOpenGdmCustomizeActionSheet) linkContextData).getMedium();
        } else if (linkContextData instanceof LinkContextData.BindJumpToMessage) {
            medium = ((LinkContextData.BindJumpToMessage) linkContextData).getMedium();
        } else {
            medium = linkContextData instanceof LinkContextData.BindDoNothing ? ((LinkContextData.BindDoNothing) linkContextData).getMedium() : null;
        }
        this.medium = medium;
        if (linkContextData instanceof LinkContextData.LinkUrl) {
            url = ((LinkContextData.LinkUrl) linkContextData).getUrl();
        } else {
            url = linkContextData instanceof LinkContextData.BindOpenUrl ? ((LinkContextData.BindOpenUrl) linkContextData).getUrl() : null;
        }
        this.url = url;
        this.isUrl = url != null;
        ContentNode contentNode = (ContentNode) CollectionsKt.firstOrNull(content);
        if (contentNode != null) {
            TextContentNode textContentNode = (TextContentNode) (contentNode instanceof TextContentNode ? contentNode : null);
            if (textContentNode != null && (content2 = textContentNode.getContent()) != null) {
                url = content2;
            }
        }
        this.textContent = url;
    }
}
