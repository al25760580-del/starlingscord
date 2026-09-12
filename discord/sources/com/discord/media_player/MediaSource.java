package com.discord.media_player;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b3\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\b9J\u0012\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b;\u0010\u0018J\u0010\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010,J\u009a\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0013\u0010B\u001a\u00020\f2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0007HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010&\u001a\u0004\b%\u0010\u0018R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b'\u0010\u001cR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0011\u0010/\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u00100\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"¨\u0006F"}, d2 = {"Lcom/discord/media_player/MediaSource;", "", "sourceUrl", "", "previewUrl", "placeholder", "placeholderVersion", "", "featureTag", "type", "Lcom/discord/media_player/MediaType;", "shouldAutoPlay", "", "channelId", "Lcom/discord/primitives/ChannelId;", "messageId", "Lcom/discord/primitives/MessageId;", "index", "portal", "", "srcIsAnimated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSourceUrl", "()Ljava/lang/String;", "getPreviewUrl", "getPlaceholder", "getPlaceholderVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFeatureTag", "getType", "()Lcom/discord/media_player/MediaType;", "getShouldAutoPlay", "()Z", "getChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getMessageId-N_6c4I0", "Ljava/lang/String;", "getIndex", "getPortal", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSrcIsAnimated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isGifv", "isVideo", "isValid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component8-qMVnFVQ", "component9", "component9-N_6c4I0", "component10", "component11", "component12", "copy", "copy-M_16ML8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Boolean;)Lcom/discord/media_player/MediaSource;", "equals", "other", "hashCode", "toString", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MediaSource {
    private final ChannelId channelId;

    @NotNull
    private final String featureTag;
    private final Integer index;
    private final boolean isGifv;
    private final boolean isValid;
    private final boolean isVideo;
    private final String messageId;
    private final String placeholder;
    private final Integer placeholderVersion;
    private final Double portal;
    private final String previewUrl;
    private final boolean shouldAutoPlay;
    private final String sourceUrl;
    private final Boolean srcIsAnimated;

    @NotNull
    private final MediaType type;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.GIFV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaType.AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ MediaSource(String str, String str2, String str3, Integer num, String str4, MediaType mediaType, boolean z5, ChannelId channelId, String str5, Integer num2, Double d6, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, str4, mediaType, z5, channelId, str5, num2, d6, bool);
    }

    /* JADX INFO: renamed from: copy-M_16ML8$default, reason: not valid java name */
    public static /* synthetic */ MediaSource m1014copyM_16ML8$default(MediaSource mediaSource, String str, String str2, String str3, Integer num, String str4, MediaType mediaType, boolean z5, ChannelId channelId, String str5, Integer num2, Double d6, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = mediaSource.sourceUrl;
        }
        if ((i7 & 2) != 0) {
            str2 = mediaSource.previewUrl;
        }
        if ((i7 & 4) != 0) {
            str3 = mediaSource.placeholder;
        }
        if ((i7 & 8) != 0) {
            num = mediaSource.placeholderVersion;
        }
        if ((i7 & 16) != 0) {
            str4 = mediaSource.featureTag;
        }
        if ((i7 & 32) != 0) {
            mediaType = mediaSource.type;
        }
        if ((i7 & 64) != 0) {
            z5 = mediaSource.shouldAutoPlay;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            channelId = mediaSource.channelId;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str5 = mediaSource.messageId;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            num2 = mediaSource.index;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            d6 = mediaSource.portal;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
            bool = mediaSource.srcIsAnimated;
        }
        Double d7 = d6;
        Boolean bool2 = bool;
        String str6 = str5;
        Integer num3 = num2;
        boolean z6 = z5;
        ChannelId channelId2 = channelId;
        String str7 = str4;
        MediaType mediaType2 = mediaType;
        return mediaSource.m1017copyM_16ML8(str, str2, str3, num, str7, mediaType2, z6, channelId2, str6, num3, d7, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Double getPortal() {
        return this.portal;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getSrcIsAnimated() {
        return this.srcIsAnimated;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPlaceholderVersion() {
        return this.placeholderVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFeatureTag() {
        return this.featureTag;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MediaType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShouldAutoPlay() {
        return this.shouldAutoPlay;
    }

    /* JADX INFO: renamed from: component8-qMVnFVQ, reason: not valid java name and from getter */
    public final ChannelId getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component9-N_6c4I0, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-M_16ML8, reason: not valid java name */
    public final MediaSource m1017copyM_16ML8(String sourceUrl, String previewUrl, String placeholder, Integer placeholderVersion, @NotNull String featureTag, @NotNull MediaType type, boolean shouldAutoPlay, ChannelId channelId, String messageId, Integer index, Double portal, Boolean srcIsAnimated) {
        Intrinsics.checkNotNullParameter(featureTag, "featureTag");
        Intrinsics.checkNotNullParameter(type, "type");
        return new MediaSource(sourceUrl, previewUrl, placeholder, placeholderVersion, featureTag, type, shouldAutoPlay, channelId, messageId, index, portal, srcIsAnimated, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    public boolean equals(Object other) {
        boolean zM1160equalsimpl0;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaSource)) {
            return false;
        }
        MediaSource mediaSource = (MediaSource) other;
        if (!Intrinsics.areEqual(this.sourceUrl, mediaSource.sourceUrl) || !Intrinsics.areEqual(this.previewUrl, mediaSource.previewUrl) || !Intrinsics.areEqual(this.placeholder, mediaSource.placeholder) || !Intrinsics.areEqual(this.placeholderVersion, mediaSource.placeholderVersion) || !Intrinsics.areEqual(this.featureTag, mediaSource.featureTag) || this.type != mediaSource.type || this.shouldAutoPlay != mediaSource.shouldAutoPlay || !Intrinsics.areEqual(this.channelId, mediaSource.channelId)) {
            return false;
        }
        String str = this.messageId;
        String str2 = mediaSource.messageId;
        if (str == null) {
            if (str2 == null) {
                zM1160equalsimpl0 = true;
            } else {
                zM1160equalsimpl0 = false;
            }
        } else if (str2 == null) {
            zM1160equalsimpl0 = false;
        } else {
            zM1160equalsimpl0 = MessageId.m1160equalsimpl0(str, str2);
        }
        return zM1160equalsimpl0 && Intrinsics.areEqual(this.index, mediaSource.index) && Intrinsics.areEqual((Object) this.portal, (Object) mediaSource.portal) && Intrinsics.areEqual(this.srcIsAnimated, mediaSource.srcIsAnimated);
    }

    /* JADX INFO: renamed from: getChannelId-qMVnFVQ, reason: not valid java name */
    public final ChannelId m1018getChannelIdqMVnFVQ() {
        return this.channelId;
    }

    @NotNull
    public final String getFeatureTag() {
        return this.featureTag;
    }

    public final Integer getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: getMessageId-N_6c4I0, reason: not valid java name */
    public final String m1019getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final Integer getPlaceholderVersion() {
        return this.placeholderVersion;
    }

    public final Double getPortal() {
        return this.portal;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final boolean getShouldAutoPlay() {
        return this.shouldAutoPlay;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final Boolean getSrcIsAnimated() {
        return this.srcIsAnimated;
    }

    @NotNull
    public final MediaType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.sourceUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.previewUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeholder;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.placeholderVersion;
        int iG = com.discord.chat.presentation.list.a.g((this.type.hashCode() + e.d((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.featureTag)) * 31, 31, this.shouldAutoPlay);
        ChannelId channelId = this.channelId;
        int iM1135hashCodeimpl = (iG + (channelId == null ? 0 : ChannelId.m1135hashCodeimpl(channelId.m1139unboximpl()))) * 31;
        String str4 = this.messageId;
        int iM1161hashCodeimpl = (iM1135hashCodeimpl + (str4 == null ? 0 : MessageId.m1161hashCodeimpl(str4))) * 31;
        Integer num2 = this.index;
        int iHashCode4 = (iM1161hashCodeimpl + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d6 = this.portal;
        int iHashCode5 = (iHashCode4 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Boolean bool = this.srcIsAnimated;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isGifv, reason: from getter */
    public final boolean getIsGifv() {
        return this.isGifv;
    }

    /* JADX INFO: renamed from: isValid, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    /* JADX INFO: renamed from: isVideo, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    @NotNull
    public String toString() {
        String str = this.sourceUrl;
        String str2 = this.previewUrl;
        String str3 = this.placeholder;
        Integer num = this.placeholderVersion;
        String str4 = this.featureTag;
        MediaType mediaType = this.type;
        boolean z5 = this.shouldAutoPlay;
        ChannelId channelId = this.channelId;
        String str5 = this.messageId;
        String strM1163toStringimpl = str5 == null ? "null" : MessageId.m1163toStringimpl(str5);
        Integer num2 = this.index;
        Double d6 = this.portal;
        Boolean bool = this.srcIsAnimated;
        StringBuilder sbU = e.u("MediaSource(sourceUrl=", str, ", previewUrl=", str2, ", placeholder=");
        com.discord.chat.presentation.list.a.r(num, str3, ", placeholderVersion=", ", featureTag=", sbU);
        sbU.append(str4);
        sbU.append(", type=");
        sbU.append(mediaType);
        sbU.append(", shouldAutoPlay=");
        sbU.append(z5);
        sbU.append(", channelId=");
        sbU.append(channelId);
        sbU.append(", messageId=");
        com.discord.chat.presentation.list.a.r(num2, strM1163toStringimpl, ", index=", ", portal=", sbU);
        sbU.append(d6);
        sbU.append(", srcIsAnimated=");
        sbU.append(bool);
        sbU.append(")");
        return sbU.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    private MediaSource(String str, String str2, String str3, Integer num, String featureTag, MediaType type, boolean z5, ChannelId channelId, String str4, Integer num2, Double d6, Boolean bool) {
        Intrinsics.checkNotNullParameter(featureTag, "featureTag");
        Intrinsics.checkNotNullParameter(type, "type");
        this.sourceUrl = str;
        this.previewUrl = str2;
        this.placeholder = str3;
        this.placeholderVersion = num;
        this.featureTag = featureTag;
        this.type = type;
        this.shouldAutoPlay = z5;
        this.channelId = channelId;
        this.messageId = str4;
        this.index = num2;
        this.portal = d6;
        this.srcIsAnimated = bool;
        boolean z6 = false;
        this.isGifv = type == MediaType.GIFV;
        this.isVideo = type == MediaType.VIDEO;
        int i7 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3 && i7 != 4) {
                throw new n();
            }
            if (str != null && !StringsKt.K(str)) {
                z6 = true;
            }
        } else if (str2 != null && !StringsKt.K(str2)) {
            z6 = true;
        }
        this.isValid = z6;
    }

    public /* synthetic */ MediaSource(String str, String str2, String str3, Integer num, String str4, MediaType mediaType, boolean z5, ChannelId channelId, String str5, Integer num2, Double d6, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : num, str4, mediaType, (i7 & 64) != 0 ? false : z5, channelId, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str5, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : num2, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : d6, (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : bool, null);
    }
}
