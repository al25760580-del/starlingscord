package com.discord.mobile_voice_overlay;

import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003JB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u00062"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "", "guildId", "Lcom/discord/primitives/GuildId;", "channelId", "Lcom/discord/primitives/ChannelId;", NotificationRenderer.CHANNEL_NAME, "", "guildName", "categoryName", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/GuildId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getGuildId-fYKD8eg", "()J", "J", "getChannelId-o4g7jtM", "getChannelName", "()Ljava/lang/String;", "getGuildName", "getCategoryName", "component1", "component1-fYKD8eg", "component2", "component2-o4g7jtM", "component3", "component4", "component5", "copy", "copy-c25twaQ", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mobile_voice_overlay_release", "$serializer", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MobileVoiceOverlaySelectorResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String categoryName;
    private final long channelId;

    @NotNull
    private final String channelName;
    private final long guildId;

    @NotNull
    private final String guildName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MobileVoiceOverlaySelectorResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MobileVoiceOverlaySelectorResult(int i7, GuildId guildId, ChannelId channelId, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, guildId, channelId, str, str2, str3, serializationConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-c25twaQ$default, reason: not valid java name */
    public static /* synthetic */ MobileVoiceOverlaySelectorResult m1036copyc25twaQ$default(MobileVoiceOverlaySelectorResult mobileVoiceOverlaySelectorResult, long j, long j5, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j = mobileVoiceOverlaySelectorResult.guildId;
        }
        long j7 = j;
        if ((i7 & 2) != 0) {
            j5 = mobileVoiceOverlaySelectorResult.channelId;
        }
        long j10 = j5;
        if ((i7 & 4) != 0) {
            str = mobileVoiceOverlaySelectorResult.channelName;
        }
        String str4 = str;
        if ((i7 & 8) != 0) {
            str2 = mobileVoiceOverlaySelectorResult.guildName;
        }
        String str5 = str2;
        if ((i7 & 16) != 0) {
            str3 = mobileVoiceOverlaySelectorResult.categoryName;
        }
        return mobileVoiceOverlaySelectorResult.m1039copyc25twaQ(j7, j10, str4, str5, str3);
    }

    public static final /* synthetic */ void write$Self$mobile_voice_overlay_release(MobileVoiceOverlaySelectorResult self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, GuildId$$serializer.INSTANCE, GuildId.m1143boximpl(self.guildId));
        output.g(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
        output.q(serialDesc, 2, self.channelName);
        output.q(serialDesc, 3, self.guildName);
        output.q(serialDesc, 4, self.categoryName);
    }

    /* JADX INFO: renamed from: component1-fYKD8eg, reason: not valid java name and from getter */
    public final long getGuildId() {
        return this.guildId;
    }

    /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGuildName() {
        return this.guildName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-c25twaQ, reason: not valid java name */
    public final MobileVoiceOverlaySelectorResult m1039copyc25twaQ(long guildId, long channelId, @NotNull String channelName, @NotNull String guildName, @NotNull String categoryName) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(guildName, "guildName");
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        return new MobileVoiceOverlaySelectorResult(guildId, channelId, channelName, guildName, categoryName, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileVoiceOverlaySelectorResult)) {
            return false;
        }
        MobileVoiceOverlaySelectorResult mobileVoiceOverlaySelectorResult = (MobileVoiceOverlaySelectorResult) other;
        return GuildId.m1147equalsimpl0(this.guildId, mobileVoiceOverlaySelectorResult.guildId) && ChannelId.m1134equalsimpl0(this.channelId, mobileVoiceOverlaySelectorResult.channelId) && Intrinsics.areEqual(this.channelName, mobileVoiceOverlaySelectorResult.channelName) && Intrinsics.areEqual(this.guildName, mobileVoiceOverlaySelectorResult.guildName) && Intrinsics.areEqual(this.categoryName, mobileVoiceOverlaySelectorResult.categoryName);
    }

    @NotNull
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m1040getChannelIdo4g7jtM() {
        return this.channelId;
    }

    @NotNull
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX INFO: renamed from: getGuildId-fYKD8eg, reason: not valid java name */
    public final long m1041getGuildIdfYKD8eg() {
        return this.guildId;
    }

    @NotNull
    public final String getGuildName() {
        return this.guildName;
    }

    public int hashCode() {
        return this.categoryName.hashCode() + a3.e.d(a3.e.d(kk.b.d(this.channelId, GuildId.m1148hashCodeimpl(this.guildId) * 31, 31), 31, this.channelName), 31, this.guildName);
    }

    @NotNull
    public String toString() {
        String strM1150toStringimpl = GuildId.m1150toStringimpl(this.guildId);
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        String str = this.channelName;
        String str2 = this.guildName;
        String str3 = this.categoryName;
        StringBuilder sbU = a3.e.u("MobileVoiceOverlaySelectorResult(guildId=", strM1150toStringimpl, ", channelId=", strM1137toStringimpl, ", channelName=");
        a3.e.A(sbU, str, ", guildName=", str2, ", categoryName=");
        return com.discord.chat.presentation.list.a.k(sbU, str3, ")");
    }

    public /* synthetic */ MobileVoiceOverlaySelectorResult(long j, long j5, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j5, str, str2, str3);
    }

    private /* synthetic */ MobileVoiceOverlaySelectorResult(int i7, GuildId guildId, ChannelId channelId, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i7 & 31)) {
            e1.l(i7, 31, MobileVoiceOverlaySelectorResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.guildId = guildId.m1152unboximpl();
        this.channelId = channelId.m1139unboximpl();
        this.channelName = str;
        this.guildName = str2;
        this.categoryName = str3;
    }

    private MobileVoiceOverlaySelectorResult(long j, long j5, String channelName, String guildName, String categoryName) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(guildName, "guildName");
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        this.guildId = j;
        this.channelId = j5;
        this.channelName = channelName;
        this.guildName = guildName;
        this.categoryName = categoryName;
    }
}
