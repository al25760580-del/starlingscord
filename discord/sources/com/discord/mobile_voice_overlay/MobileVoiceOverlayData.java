package com.discord.mobile_voice_overlay;

import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
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
import or.e1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002KLBm\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003¢\u0006\u0004\b\u0016\u0010\u0017B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001bJ\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\b2J\u0010\u00103\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b4\u0010#J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\t\u00109\u001a\u00020\u0012HÆ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003HÆ\u0003J\u008c\u0001\u0010<\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020\u000f2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0006HÖ\u0001J\t\u0010B\u001a\u00020\fHÖ\u0001J%\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0001¢\u0006\u0002\bJR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\t\u001a\u00020\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001d¨\u0006M"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "", "users", "", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "extraUsers", "", "guildId", "Lcom/discord/primitives/GuildId;", "channelId", "Lcom/discord/primitives/ChannelId;", NotificationRenderer.CHANNEL_NAME, "", "guildName", "deafened", "", "muted", "connectionQuality", "Lcom/discord/mobile_voice_overlay/ConnectionQuality;", "canGenerateInvite", "channelSelectorResults", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "<init>", "(Ljava/util/List;ILcom/discord/primitives/GuildId;JLjava/lang/String;Ljava/lang/String;ZZLcom/discord/mobile_voice_overlay/ConnectionQuality;ZLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;ZZLcom/discord/mobile_voice_overlay/ConnectionQuality;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getUsers", "()Ljava/util/List;", "getExtraUsers", "()I", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getChannelId-o4g7jtM", "()J", "J", "getChannelName", "()Ljava/lang/String;", "getGuildName", "getDeafened", "()Z", "getMuted", "getConnectionQuality", "()Lcom/discord/mobile_voice_overlay/ConnectionQuality;", "getCanGenerateInvite", "getChannelSelectorResults", "component1", "component2", "component3", "component3-qOKuAAo", "component4", "component4-o4g7jtM", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "copy-HeAh3Ug", "(Ljava/util/List;ILcom/discord/primitives/GuildId;JLjava/lang/String;Ljava/lang/String;ZZLcom/discord/mobile_voice_overlay/ConnectionQuality;ZLjava/util/List;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mobile_voice_overlay_release", "$serializer", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MobileVoiceOverlayData {

    @NotNull
    private static final Lazy[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean canGenerateInvite;
    private final long channelId;

    @NotNull
    private final String channelName;

    @NotNull
    private final List<MobileVoiceOverlaySelectorResult> channelSelectorResults;

    @NotNull
    private final ConnectionQuality connectionQuality;
    private final boolean deafened;
    private final int extraUsers;
    private final GuildId guildId;

    @NotNull
    private final String guildName;
    private final boolean muted;

    @NotNull
    private final List<MobileVoiceOverlayDataUser> users;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MobileVoiceOverlayData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        m mVar = m.f19486e;
        $childSerializers = new Lazy[]{l.a(mVar, new com.discord.crash_reporting.d(16)), null, null, null, null, null, null, null, l.a(mVar, new com.discord.crash_reporting.d(17)), null, l.a(mVar, new com.discord.crash_reporting.d(18))};
    }

    public /* synthetic */ MobileVoiceOverlayData(int i7, List list, int i10, GuildId guildId, ChannelId channelId, String str, String str2, boolean z5, boolean z6, ConnectionQuality connectionQuality, boolean z7, List list2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, list, i10, guildId, channelId, str, str2, z5, z6, connectionQuality, z7, list2, serializationConstructorMarker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new or.d(MobileVoiceOverlayDataUser$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ConnectionQuality.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new or.d(MobileVoiceOverlaySelectorResult$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-HeAh3Ug$default, reason: not valid java name */
    public static /* synthetic */ MobileVoiceOverlayData m1026copyHeAh3Ug$default(MobileVoiceOverlayData mobileVoiceOverlayData, List list, int i7, GuildId guildId, long j, String str, String str2, boolean z5, boolean z6, ConnectionQuality connectionQuality, boolean z7, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = mobileVoiceOverlayData.users;
        }
        if ((i10 & 2) != 0) {
            i7 = mobileVoiceOverlayData.extraUsers;
        }
        if ((i10 & 4) != 0) {
            guildId = mobileVoiceOverlayData.guildId;
        }
        if ((i10 & 8) != 0) {
            j = mobileVoiceOverlayData.channelId;
        }
        if ((i10 & 16) != 0) {
            str = mobileVoiceOverlayData.channelName;
        }
        if ((i10 & 32) != 0) {
            str2 = mobileVoiceOverlayData.guildName;
        }
        if ((i10 & 64) != 0) {
            z5 = mobileVoiceOverlayData.deafened;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            z6 = mobileVoiceOverlayData.muted;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            connectionQuality = mobileVoiceOverlayData.connectionQuality;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            z7 = mobileVoiceOverlayData.canGenerateInvite;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            list2 = mobileVoiceOverlayData.channelSelectorResults;
        }
        boolean z10 = z7;
        List list3 = list2;
        ConnectionQuality connectionQuality2 = connectionQuality;
        boolean z11 = z5;
        String str3 = str;
        long j5 = j;
        GuildId guildId2 = guildId;
        return mobileVoiceOverlayData.m1029copyHeAh3Ug(list, i7, guildId2, j5, str3, str2, z11, z6, connectionQuality2, z10, list3);
    }

    public static final /* synthetic */ void write$Self$mobile_voice_overlay_release(MobileVoiceOverlayData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) lazyArr[0].getValue(), self.users);
        output.l(1, self.extraUsers, serialDesc);
        output.r(serialDesc, 2, GuildId$$serializer.INSTANCE, self.guildId);
        output.g(serialDesc, 3, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
        output.q(serialDesc, 4, self.channelName);
        output.q(serialDesc, 5, self.guildName);
        output.p(serialDesc, 6, self.deafened);
        output.p(serialDesc, 7, self.muted);
        output.g(serialDesc, 8, (KSerializer) lazyArr[8].getValue(), self.connectionQuality);
        output.p(serialDesc, 9, self.canGenerateInvite);
        output.g(serialDesc, 10, (KSerializer) lazyArr[10].getValue(), self.channelSelectorResults);
    }

    @NotNull
    public final List<MobileVoiceOverlayDataUser> component1() {
        return this.users;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getCanGenerateInvite() {
        return this.canGenerateInvite;
    }

    @NotNull
    public final List<MobileVoiceOverlaySelectorResult> component11() {
        return this.channelSelectorResults;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getExtraUsers() {
        return this.extraUsers;
    }

    /* JADX INFO: renamed from: component3-qOKuAAo, reason: not valid java name and from getter */
    public final GuildId getGuildId() {
        return this.guildId;
    }

    /* JADX INFO: renamed from: component4-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGuildName() {
        return this.guildName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDeafened() {
        return this.deafened;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getMuted() {
        return this.muted;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ConnectionQuality getConnectionQuality() {
        return this.connectionQuality;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-HeAh3Ug, reason: not valid java name */
    public final MobileVoiceOverlayData m1029copyHeAh3Ug(@NotNull List<MobileVoiceOverlayDataUser> users, int extraUsers, GuildId guildId, long channelId, @NotNull String channelName, @NotNull String guildName, boolean deafened, boolean muted, @NotNull ConnectionQuality connectionQuality, boolean canGenerateInvite, @NotNull List<MobileVoiceOverlaySelectorResult> channelSelectorResults) {
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(guildName, "guildName");
        Intrinsics.checkNotNullParameter(connectionQuality, "connectionQuality");
        Intrinsics.checkNotNullParameter(channelSelectorResults, "channelSelectorResults");
        return new MobileVoiceOverlayData(users, extraUsers, guildId, channelId, channelName, guildName, deafened, muted, connectionQuality, canGenerateInvite, channelSelectorResults, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileVoiceOverlayData)) {
            return false;
        }
        MobileVoiceOverlayData mobileVoiceOverlayData = (MobileVoiceOverlayData) other;
        return Intrinsics.areEqual(this.users, mobileVoiceOverlayData.users) && this.extraUsers == mobileVoiceOverlayData.extraUsers && Intrinsics.areEqual(this.guildId, mobileVoiceOverlayData.guildId) && ChannelId.m1134equalsimpl0(this.channelId, mobileVoiceOverlayData.channelId) && Intrinsics.areEqual(this.channelName, mobileVoiceOverlayData.channelName) && Intrinsics.areEqual(this.guildName, mobileVoiceOverlayData.guildName) && this.deafened == mobileVoiceOverlayData.deafened && this.muted == mobileVoiceOverlayData.muted && this.connectionQuality == mobileVoiceOverlayData.connectionQuality && this.canGenerateInvite == mobileVoiceOverlayData.canGenerateInvite && Intrinsics.areEqual(this.channelSelectorResults, mobileVoiceOverlayData.channelSelectorResults);
    }

    public final boolean getCanGenerateInvite() {
        return this.canGenerateInvite;
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m1030getChannelIdo4g7jtM() {
        return this.channelId;
    }

    @NotNull
    public final String getChannelName() {
        return this.channelName;
    }

    @NotNull
    public final List<MobileVoiceOverlaySelectorResult> getChannelSelectorResults() {
        return this.channelSelectorResults;
    }

    @NotNull
    public final ConnectionQuality getConnectionQuality() {
        return this.connectionQuality;
    }

    public final boolean getDeafened() {
        return this.deafened;
    }

    public final int getExtraUsers() {
        return this.extraUsers;
    }

    /* JADX INFO: renamed from: getGuildId-qOKuAAo, reason: not valid java name */
    public final GuildId m1031getGuildIdqOKuAAo() {
        return this.guildId;
    }

    @NotNull
    public final String getGuildName() {
        return this.guildName;
    }

    public final boolean getMuted() {
        return this.muted;
    }

    @NotNull
    public final List<MobileVoiceOverlayDataUser> getUsers() {
        return this.users;
    }

    public int hashCode() {
        int iU = com.discord.chat.presentation.list.a.u(this.extraUsers, this.users.hashCode() * 31, 31);
        GuildId guildId = this.guildId;
        return this.channelSelectorResults.hashCode() + com.discord.chat.presentation.list.a.g((this.connectionQuality.hashCode() + com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(a3.e.d(a3.e.d(kk.b.d(this.channelId, (iU + (guildId == null ? 0 : GuildId.m1148hashCodeimpl(guildId.m1152unboximpl()))) * 31, 31), 31, this.channelName), 31, this.guildName), 31, this.deafened), 31, this.muted)) * 31, 31, this.canGenerateInvite);
    }

    @NotNull
    public String toString() {
        List<MobileVoiceOverlayDataUser> list = this.users;
        int i7 = this.extraUsers;
        GuildId guildId = this.guildId;
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        String str = this.channelName;
        String str2 = this.guildName;
        boolean z5 = this.deafened;
        boolean z6 = this.muted;
        ConnectionQuality connectionQuality = this.connectionQuality;
        boolean z7 = this.canGenerateInvite;
        List<MobileVoiceOverlaySelectorResult> list2 = this.channelSelectorResults;
        StringBuilder sb2 = new StringBuilder("MobileVoiceOverlayData(users=");
        sb2.append(list);
        sb2.append(", extraUsers=");
        sb2.append(i7);
        sb2.append(", guildId=");
        sb2.append(guildId);
        sb2.append(", channelId=");
        sb2.append(strM1137toStringimpl);
        sb2.append(", channelName=");
        a3.e.A(sb2, str, ", guildName=", str2, ", deafened=");
        a3.e.B(sb2, z5, ", muted=", z6, ", connectionQuality=");
        sb2.append(connectionQuality);
        sb2.append(", canGenerateInvite=");
        sb2.append(z7);
        sb2.append(", channelSelectorResults=");
        sb2.append(list2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ MobileVoiceOverlayData(List list, int i7, GuildId guildId, long j, String str, String str2, boolean z5, boolean z6, ConnectionQuality connectionQuality, boolean z7, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i7, guildId, j, str, str2, z5, z6, connectionQuality, z7, list2);
    }

    private /* synthetic */ MobileVoiceOverlayData(int i7, List list, int i10, GuildId guildId, ChannelId channelId, String str, String str2, boolean z5, boolean z6, ConnectionQuality connectionQuality, boolean z7, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i7 & 2047)) {
            e1.l(i7, 2047, MobileVoiceOverlayData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.users = list;
        this.extraUsers = i10;
        this.guildId = guildId;
        this.channelId = channelId.m1139unboximpl();
        this.channelName = str;
        this.guildName = str2;
        this.deafened = z5;
        this.muted = z6;
        this.connectionQuality = connectionQuality;
        this.canGenerateInvite = z7;
        this.channelSelectorResults = list2;
    }

    private MobileVoiceOverlayData(List<MobileVoiceOverlayDataUser> users, int i7, GuildId guildId, long j, String channelName, String guildName, boolean z5, boolean z6, ConnectionQuality connectionQuality, boolean z7, List<MobileVoiceOverlaySelectorResult> channelSelectorResults) {
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(guildName, "guildName");
        Intrinsics.checkNotNullParameter(connectionQuality, "connectionQuality");
        Intrinsics.checkNotNullParameter(channelSelectorResults, "channelSelectorResults");
        this.users = users;
        this.extraUsers = i7;
        this.guildId = guildId;
        this.channelId = j;
        this.channelName = channelName;
        this.guildName = guildName;
        this.deafened = z5;
        this.muted = z6;
        this.connectionQuality = connectionQuality;
        this.canGenerateInvite = z7;
        this.channelSelectorResults = channelSelectorResults;
    }
}
