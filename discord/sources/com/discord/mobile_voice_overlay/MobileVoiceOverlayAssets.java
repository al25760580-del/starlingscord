package com.discord.mobile_voice_overlay;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002:;B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fB\u0089\u0001\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0011HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J%\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\b9R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u0006<"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "", "useSpeaker", "", "mute", "disconnectFromVoice", "getInvite", "switchChannels", "openDiscord", "inviteLinkCopied", "channelSelect", "closeWindow", "searchChannels", "noResults", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUseSpeaker", "()Ljava/lang/String;", "getMute", "getDisconnectFromVoice", "getGetInvite", "getSwitchChannels", "getOpenDiscord", "getInviteLinkCopied", "getChannelSelect", "getCloseWindow", "getSearchChannels", "getNoResults", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mobile_voice_overlay_release", "$serializer", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MobileVoiceOverlayAssets {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String channelSelect;

    @NotNull
    private final String closeWindow;

    @NotNull
    private final String disconnectFromVoice;

    @NotNull
    private final String getInvite;

    @NotNull
    private final String inviteLinkCopied;

    @NotNull
    private final String mute;

    @NotNull
    private final String noResults;

    @NotNull
    private final String openDiscord;

    @NotNull
    private final String searchChannels;

    @NotNull
    private final String switchChannels;

    @NotNull
    private final String useSpeaker;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MobileVoiceOverlayAssets$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MobileVoiceOverlayAssets(int i7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i7 & 2047)) {
            e1.l(i7, 2047, MobileVoiceOverlayAssets$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.useSpeaker = str;
        this.mute = str2;
        this.disconnectFromVoice = str3;
        this.getInvite = str4;
        this.switchChannels = str5;
        this.openDiscord = str6;
        this.inviteLinkCopied = str7;
        this.channelSelect = str8;
        this.closeWindow = str9;
        this.searchChannels = str10;
        this.noResults = str11;
    }

    public static /* synthetic */ MobileVoiceOverlayAssets copy$default(MobileVoiceOverlayAssets mobileVoiceOverlayAssets, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = mobileVoiceOverlayAssets.useSpeaker;
        }
        if ((i7 & 2) != 0) {
            str2 = mobileVoiceOverlayAssets.mute;
        }
        if ((i7 & 4) != 0) {
            str3 = mobileVoiceOverlayAssets.disconnectFromVoice;
        }
        if ((i7 & 8) != 0) {
            str4 = mobileVoiceOverlayAssets.getInvite;
        }
        if ((i7 & 16) != 0) {
            str5 = mobileVoiceOverlayAssets.switchChannels;
        }
        if ((i7 & 32) != 0) {
            str6 = mobileVoiceOverlayAssets.openDiscord;
        }
        if ((i7 & 64) != 0) {
            str7 = mobileVoiceOverlayAssets.inviteLinkCopied;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str8 = mobileVoiceOverlayAssets.channelSelect;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str9 = mobileVoiceOverlayAssets.closeWindow;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            str10 = mobileVoiceOverlayAssets.searchChannels;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            str11 = mobileVoiceOverlayAssets.noResults;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return mobileVoiceOverlayAssets.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    public static final /* synthetic */ void write$Self$mobile_voice_overlay_release(MobileVoiceOverlayAssets self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.useSpeaker);
        output.q(serialDesc, 1, self.mute);
        output.q(serialDesc, 2, self.disconnectFromVoice);
        output.q(serialDesc, 3, self.getInvite);
        output.q(serialDesc, 4, self.switchChannels);
        output.q(serialDesc, 5, self.openDiscord);
        output.q(serialDesc, 6, self.inviteLinkCopied);
        output.q(serialDesc, 7, self.channelSelect);
        output.q(serialDesc, 8, self.closeWindow);
        output.q(serialDesc, 9, self.searchChannels);
        output.q(serialDesc, 10, self.noResults);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUseSpeaker() {
        return this.useSpeaker;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSearchChannels() {
        return this.searchChannels;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNoResults() {
        return this.noResults;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMute() {
        return this.mute;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisconnectFromVoice() {
        return this.disconnectFromVoice;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGetInvite() {
        return this.getInvite;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSwitchChannels() {
        return this.switchChannels;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOpenDiscord() {
        return this.openDiscord;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInviteLinkCopied() {
        return this.inviteLinkCopied;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getChannelSelect() {
        return this.channelSelect;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCloseWindow() {
        return this.closeWindow;
    }

    @NotNull
    public final MobileVoiceOverlayAssets copy(@NotNull String useSpeaker, @NotNull String mute, @NotNull String disconnectFromVoice, @NotNull String getInvite, @NotNull String switchChannels, @NotNull String openDiscord, @NotNull String inviteLinkCopied, @NotNull String channelSelect, @NotNull String closeWindow, @NotNull String searchChannels, @NotNull String noResults) {
        Intrinsics.checkNotNullParameter(useSpeaker, "useSpeaker");
        Intrinsics.checkNotNullParameter(mute, "mute");
        Intrinsics.checkNotNullParameter(disconnectFromVoice, "disconnectFromVoice");
        Intrinsics.checkNotNullParameter(getInvite, "getInvite");
        Intrinsics.checkNotNullParameter(switchChannels, "switchChannels");
        Intrinsics.checkNotNullParameter(openDiscord, "openDiscord");
        Intrinsics.checkNotNullParameter(inviteLinkCopied, "inviteLinkCopied");
        Intrinsics.checkNotNullParameter(channelSelect, "channelSelect");
        Intrinsics.checkNotNullParameter(closeWindow, "closeWindow");
        Intrinsics.checkNotNullParameter(searchChannels, "searchChannels");
        Intrinsics.checkNotNullParameter(noResults, "noResults");
        return new MobileVoiceOverlayAssets(useSpeaker, mute, disconnectFromVoice, getInvite, switchChannels, openDiscord, inviteLinkCopied, channelSelect, closeWindow, searchChannels, noResults);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileVoiceOverlayAssets)) {
            return false;
        }
        MobileVoiceOverlayAssets mobileVoiceOverlayAssets = (MobileVoiceOverlayAssets) other;
        return Intrinsics.areEqual(this.useSpeaker, mobileVoiceOverlayAssets.useSpeaker) && Intrinsics.areEqual(this.mute, mobileVoiceOverlayAssets.mute) && Intrinsics.areEqual(this.disconnectFromVoice, mobileVoiceOverlayAssets.disconnectFromVoice) && Intrinsics.areEqual(this.getInvite, mobileVoiceOverlayAssets.getInvite) && Intrinsics.areEqual(this.switchChannels, mobileVoiceOverlayAssets.switchChannels) && Intrinsics.areEqual(this.openDiscord, mobileVoiceOverlayAssets.openDiscord) && Intrinsics.areEqual(this.inviteLinkCopied, mobileVoiceOverlayAssets.inviteLinkCopied) && Intrinsics.areEqual(this.channelSelect, mobileVoiceOverlayAssets.channelSelect) && Intrinsics.areEqual(this.closeWindow, mobileVoiceOverlayAssets.closeWindow) && Intrinsics.areEqual(this.searchChannels, mobileVoiceOverlayAssets.searchChannels) && Intrinsics.areEqual(this.noResults, mobileVoiceOverlayAssets.noResults);
    }

    @NotNull
    public final String getChannelSelect() {
        return this.channelSelect;
    }

    @NotNull
    public final String getCloseWindow() {
        return this.closeWindow;
    }

    @NotNull
    public final String getDisconnectFromVoice() {
        return this.disconnectFromVoice;
    }

    @NotNull
    public final String getGetInvite() {
        return this.getInvite;
    }

    @NotNull
    public final String getInviteLinkCopied() {
        return this.inviteLinkCopied;
    }

    @NotNull
    public final String getMute() {
        return this.mute;
    }

    @NotNull
    public final String getNoResults() {
        return this.noResults;
    }

    @NotNull
    public final String getOpenDiscord() {
        return this.openDiscord;
    }

    @NotNull
    public final String getSearchChannels() {
        return this.searchChannels;
    }

    @NotNull
    public final String getSwitchChannels() {
        return this.switchChannels;
    }

    @NotNull
    public final String getUseSpeaker() {
        return this.useSpeaker;
    }

    public int hashCode() {
        return this.noResults.hashCode() + a3.e.d(a3.e.d(a3.e.d(a3.e.d(a3.e.d(a3.e.d(a3.e.d(a3.e.d(a3.e.d(this.useSpeaker.hashCode() * 31, 31, this.mute), 31, this.disconnectFromVoice), 31, this.getInvite), 31, this.switchChannels), 31, this.openDiscord), 31, this.inviteLinkCopied), 31, this.channelSelect), 31, this.closeWindow), 31, this.searchChannels);
    }

    @NotNull
    public String toString() {
        String str = this.useSpeaker;
        String str2 = this.mute;
        String str3 = this.disconnectFromVoice;
        String str4 = this.getInvite;
        String str5 = this.switchChannels;
        String str6 = this.openDiscord;
        String str7 = this.inviteLinkCopied;
        String str8 = this.channelSelect;
        String str9 = this.closeWindow;
        String str10 = this.searchChannels;
        String str11 = this.noResults;
        StringBuilder sbU = a3.e.u("MobileVoiceOverlayAssets(useSpeaker=", str, ", mute=", str2, ", disconnectFromVoice=");
        a3.e.A(sbU, str3, ", getInvite=", str4, ", switchChannels=");
        a3.e.A(sbU, str5, ", openDiscord=", str6, ", inviteLinkCopied=");
        a3.e.A(sbU, str7, ", channelSelect=", str8, ", closeWindow=");
        a3.e.A(sbU, str9, ", searchChannels=", str10, ", noResults=");
        return com.discord.chat.presentation.list.a.k(sbU, str11, ")");
    }

    public MobileVoiceOverlayAssets(@NotNull String useSpeaker, @NotNull String mute, @NotNull String disconnectFromVoice, @NotNull String getInvite, @NotNull String switchChannels, @NotNull String openDiscord, @NotNull String inviteLinkCopied, @NotNull String channelSelect, @NotNull String closeWindow, @NotNull String searchChannels, @NotNull String noResults) {
        Intrinsics.checkNotNullParameter(useSpeaker, "useSpeaker");
        Intrinsics.checkNotNullParameter(mute, "mute");
        Intrinsics.checkNotNullParameter(disconnectFromVoice, "disconnectFromVoice");
        Intrinsics.checkNotNullParameter(getInvite, "getInvite");
        Intrinsics.checkNotNullParameter(switchChannels, "switchChannels");
        Intrinsics.checkNotNullParameter(openDiscord, "openDiscord");
        Intrinsics.checkNotNullParameter(inviteLinkCopied, "inviteLinkCopied");
        Intrinsics.checkNotNullParameter(channelSelect, "channelSelect");
        Intrinsics.checkNotNullParameter(closeWindow, "closeWindow");
        Intrinsics.checkNotNullParameter(searchChannels, "searchChannels");
        Intrinsics.checkNotNullParameter(noResults, "noResults");
        this.useSpeaker = useSpeaker;
        this.mute = mute;
        this.disconnectFromVoice = disconnectFromVoice;
        this.getInvite = getInvite;
        this.switchChannels = switchChannels;
        this.openDiscord = openDiscord;
        this.inviteLinkCopied = inviteLinkCopied;
        this.channelSelect = channelSelect;
        this.closeWindow = closeWindow;
        this.searchChannels = searchChannels;
        this.noResults = noResults;
    }
}
