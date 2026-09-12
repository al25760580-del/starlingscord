package com.discord.chat.bridge.contentnode;

import a3.e;
import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.rolecolors.RoleColors$$serializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.RoleId;
import com.discord.primitives.RoleId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002HIBs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015By\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u0019J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b,J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b.J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\b4J\u0010\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\b6J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J|\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0001¢\u0006\u0002\b9J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\nHÖ\u0001J\t\u0010?\u001a\u00020\u0007HÖ\u0001J%\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0001¢\u0006\u0002\bGR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006J"}, d2 = {"Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", "channelId", "Lcom/discord/primitives/ChannelId;", "userId", "Lcom/discord/primitives/UserId;", "roleName", "", "parsedUserId", "roleColor", "", "roleColors", "Lcom/discord/chat/bridge/rolecolors/RoleColors;", "guildId", "Lcom/discord/primitives/GuildId;", "roleId", "Lcom/discord/primitives/RoleId;", "content", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "<init>", "(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/rolecolors/RoleColors;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/rolecolors/RoleColors;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getUserId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getRoleName", "()Ljava/lang/String;", "getParsedUserId", "getRoleColor", "()I", "getRoleColors", "()Lcom/discord/chat/bridge/rolecolors/RoleColors;", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getRoleId-fYaclRY", "()Lcom/discord/primitives/RoleId;", "getContent", "()Ljava/util/List;", "component1", "component1-qMVnFVQ", "component2", "component2-wUX8bhU", "component3", "component4", "component5", "component6", "component7", "component7-qOKuAAo", "component8", "component8-fYaclRY", "component9", "copy", "copy-5RCyINY", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserOrRoleMentionContentNode extends MentionContentNode {
    private final ChannelId channelId;

    @NotNull
    private final List<ContentNode> content;
    private final GuildId guildId;
    private final String parsedUserId;
    private final int roleColor;
    private final RoleColors roleColors;
    private final RoleId roleId;
    private final String roleName;
    private final UserId userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, null, null, null, null, null, l.a(m.f19486e, new a(20))};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UserOrRoleMentionContentNode$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UserOrRoleMentionContentNode(int i7, ChannelId channelId, UserId userId, String str, String str2, int i10, RoleColors roleColors, GuildId guildId, RoleId roleId, List list, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, channelId, userId, str, str2, i10, roleColors, guildId, roleId, list, serializationConstructorMarker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ContentNodeSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-5RCyINY$default, reason: not valid java name */
    public static /* synthetic */ UserOrRoleMentionContentNode m410copy5RCyINY$default(UserOrRoleMentionContentNode userOrRoleMentionContentNode, ChannelId channelId, UserId userId, String str, String str2, int i7, RoleColors roleColors, GuildId guildId, RoleId roleId, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            channelId = userOrRoleMentionContentNode.channelId;
        }
        if ((i10 & 2) != 0) {
            userId = userOrRoleMentionContentNode.userId;
        }
        if ((i10 & 4) != 0) {
            str = userOrRoleMentionContentNode.roleName;
        }
        if ((i10 & 8) != 0) {
            str2 = userOrRoleMentionContentNode.parsedUserId;
        }
        if ((i10 & 16) != 0) {
            i7 = userOrRoleMentionContentNode.roleColor;
        }
        if ((i10 & 32) != 0) {
            roleColors = userOrRoleMentionContentNode.roleColors;
        }
        if ((i10 & 64) != 0) {
            guildId = userOrRoleMentionContentNode.guildId;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            roleId = userOrRoleMentionContentNode.roleId;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            list = userOrRoleMentionContentNode.content;
        }
        RoleId roleId2 = roleId;
        List list2 = list;
        RoleColors roleColors2 = roleColors;
        GuildId guildId2 = guildId;
        int i11 = i7;
        String str3 = str;
        return userOrRoleMentionContentNode.m415copy5RCyINY(channelId, userId, str3, str2, i11, roleColors2, guildId2, roleId2, list2);
    }

    public static final /* synthetic */ void write$Self$chat_release(UserOrRoleMentionContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        MentionContentNode.write$Self(self, output, serialDesc);
        Lazy[] lazyArr = $childSerializers;
        if (output.u(serialDesc, 0) || self.channelId != null) {
            output.r(serialDesc, 0, ChannelId$$serializer.INSTANCE, self.channelId);
        }
        if (output.u(serialDesc, 1) || self.userId != null) {
            output.r(serialDesc, 1, UserId$$serializer.INSTANCE, self.userId);
        }
        if (output.u(serialDesc, 2) || self.roleName != null) {
            output.r(serialDesc, 2, s1.f17602a, self.roleName);
        }
        if (output.u(serialDesc, 3) || self.parsedUserId != null) {
            output.r(serialDesc, 3, s1.f17602a, self.parsedUserId);
        }
        if (output.u(serialDesc, 4) || self.roleColor != 0) {
            output.l(4, self.roleColor, serialDesc);
        }
        if (output.u(serialDesc, 5) || self.roleColors != null) {
            output.r(serialDesc, 5, RoleColors$$serializer.INSTANCE, self.roleColors);
        }
        if (output.u(serialDesc, 6) || self.guildId != null) {
            output.r(serialDesc, 6, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (output.u(serialDesc, 7) || self.roleId != null) {
            output.r(serialDesc, 7, RoleId$$serializer.INSTANCE, self.roleId);
        }
        output.g(serialDesc, 8, (KSerializer) lazyArr[8].getValue(), self.getContent());
    }

    /* JADX INFO: renamed from: component1-qMVnFVQ, reason: not valid java name and from getter */
    public final ChannelId getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component2-wUX8bhU, reason: not valid java name and from getter */
    public final UserId getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRoleName() {
        return this.roleName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getParsedUserId() {
        return this.parsedUserId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRoleColor() {
        return this.roleColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RoleColors getRoleColors() {
        return this.roleColors;
    }

    /* JADX INFO: renamed from: component7-qOKuAAo, reason: not valid java name and from getter */
    public final GuildId getGuildId() {
        return this.guildId;
    }

    /* JADX INFO: renamed from: component8-fYaclRY, reason: not valid java name and from getter */
    public final RoleId getRoleId() {
        return this.roleId;
    }

    @NotNull
    public final List<ContentNode> component9() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-5RCyINY, reason: not valid java name */
    public final UserOrRoleMentionContentNode m415copy5RCyINY(ChannelId channelId, UserId userId, String roleName, String parsedUserId, int roleColor, RoleColors roleColors, GuildId guildId, RoleId roleId, @NotNull List<? extends ContentNode> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new UserOrRoleMentionContentNode(channelId, userId, roleName, parsedUserId, roleColor, roleColors, guildId, roleId, content, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserOrRoleMentionContentNode)) {
            return false;
        }
        UserOrRoleMentionContentNode userOrRoleMentionContentNode = (UserOrRoleMentionContentNode) other;
        return Intrinsics.areEqual(this.channelId, userOrRoleMentionContentNode.channelId) && Intrinsics.areEqual(this.userId, userOrRoleMentionContentNode.userId) && Intrinsics.areEqual(this.roleName, userOrRoleMentionContentNode.roleName) && Intrinsics.areEqual(this.parsedUserId, userOrRoleMentionContentNode.parsedUserId) && this.roleColor == userOrRoleMentionContentNode.roleColor && Intrinsics.areEqual(this.roleColors, userOrRoleMentionContentNode.roleColors) && Intrinsics.areEqual(this.guildId, userOrRoleMentionContentNode.guildId) && Intrinsics.areEqual(this.roleId, userOrRoleMentionContentNode.roleId) && Intrinsics.areEqual(this.content, userOrRoleMentionContentNode.content);
    }

    /* JADX INFO: renamed from: getChannelId-qMVnFVQ, reason: not valid java name */
    public final ChannelId m416getChannelIdqMVnFVQ() {
        return this.channelId;
    }

    @Override // com.discord.chat.bridge.contentnode.MentionContentNode
    @NotNull
    public List<ContentNode> getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: getGuildId-qOKuAAo, reason: not valid java name */
    public final GuildId m417getGuildIdqOKuAAo() {
        return this.guildId;
    }

    public final String getParsedUserId() {
        return this.parsedUserId;
    }

    public final int getRoleColor() {
        return this.roleColor;
    }

    public final RoleColors getRoleColors() {
        return this.roleColors;
    }

    /* JADX INFO: renamed from: getRoleId-fYaclRY, reason: not valid java name */
    public final RoleId m418getRoleIdfYaclRY() {
        return this.roleId;
    }

    public final String getRoleName() {
        return this.roleName;
    }

    /* JADX INFO: renamed from: getUserId-wUX8bhU, reason: not valid java name */
    public final UserId m419getUserIdwUX8bhU() {
        return this.userId;
    }

    public int hashCode() {
        ChannelId channelId = this.channelId;
        int iM1135hashCodeimpl = (channelId == null ? 0 : ChannelId.m1135hashCodeimpl(channelId.m1139unboximpl())) * 31;
        UserId userId = this.userId;
        int iM1213hashCodeimpl = (iM1135hashCodeimpl + (userId == null ? 0 : UserId.m1213hashCodeimpl(userId.m1217unboximpl()))) * 31;
        String str = this.roleName;
        int iHashCode = (iM1213hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.parsedUserId;
        int iU = com.discord.chat.presentation.list.a.u(this.roleColor, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        RoleColors roleColors = this.roleColors;
        int iHashCode2 = (iU + (roleColors == null ? 0 : roleColors.hashCode())) * 31;
        GuildId guildId = this.guildId;
        int iM1148hashCodeimpl = (iHashCode2 + (guildId == null ? 0 : GuildId.m1148hashCodeimpl(guildId.m1152unboximpl()))) * 31;
        RoleId roleId = this.roleId;
        return this.content.hashCode() + ((iM1148hashCodeimpl + (roleId != null ? RoleId.m1187hashCodeimpl(roleId.m1191unboximpl()) : 0)) * 31);
    }

    @NotNull
    public String toString() {
        ChannelId channelId = this.channelId;
        UserId userId = this.userId;
        String str = this.roleName;
        String str2 = this.parsedUserId;
        int i7 = this.roleColor;
        RoleColors roleColors = this.roleColors;
        GuildId guildId = this.guildId;
        RoleId roleId = this.roleId;
        List<ContentNode> list = this.content;
        StringBuilder sb2 = new StringBuilder("UserOrRoleMentionContentNode(channelId=");
        sb2.append(channelId);
        sb2.append(", userId=");
        sb2.append(userId);
        sb2.append(", roleName=");
        e.A(sb2, str, ", parsedUserId=", str2, ", roleColor=");
        sb2.append(i7);
        sb2.append(", roleColors=");
        sb2.append(roleColors);
        sb2.append(", guildId=");
        sb2.append(guildId);
        sb2.append(", roleId=");
        sb2.append(roleId);
        sb2.append(", content=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ UserOrRoleMentionContentNode(ChannelId channelId, UserId userId, String str, String str2, int i7, RoleColors roleColors, GuildId guildId, RoleId roleId, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(channelId, userId, str, str2, i7, roleColors, guildId, roleId, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private /* synthetic */ UserOrRoleMentionContentNode(int i7, ChannelId channelId, UserId userId, String str, String str2, int i10, RoleColors roleColors, GuildId guildId, RoleId roleId, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i7, serializationConstructorMarker);
        if (256 != (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER)) {
            e1.l(i7, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, UserOrRoleMentionContentNode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i7 & 1) == 0) {
            this.channelId = null;
        } else {
            this.channelId = channelId;
        }
        if ((i7 & 2) == 0) {
            this.userId = null;
        } else {
            this.userId = userId;
        }
        if ((i7 & 4) == 0) {
            this.roleName = null;
        } else {
            this.roleName = str;
        }
        if ((i7 & 8) == 0) {
            this.parsedUserId = null;
        } else {
            this.parsedUserId = str2;
        }
        if ((i7 & 16) == 0) {
            this.roleColor = 0;
        } else {
            this.roleColor = i10;
        }
        if ((i7 & 32) == 0) {
            this.roleColors = null;
        } else {
            this.roleColors = roleColors;
        }
        if ((i7 & 64) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.roleId = null;
        } else {
            this.roleId = roleId;
        }
        this.content = list;
    }

    public /* synthetic */ UserOrRoleMentionContentNode(ChannelId channelId, UserId userId, String str, String str2, int i7, RoleColors roleColors, GuildId guildId, RoleId roleId, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : channelId, (i10 & 2) != 0 ? null : userId, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? 0 : i7, (i10 & 32) != 0 ? null : roleColors, (i10 & 64) != 0 ? null : guildId, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : roleId, list, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private UserOrRoleMentionContentNode(ChannelId channelId, UserId userId, String str, String str2, int i7, RoleColors roleColors, GuildId guildId, RoleId roleId, List<? extends ContentNode> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.channelId = channelId;
        this.userId = userId;
        this.roleName = str;
        this.parsedUserId = str2;
        this.roleColor = i7;
        this.roleColors = roleColors;
        this.guildId = guildId;
        this.roleId = roleId;
        this.content = content;
    }
}
