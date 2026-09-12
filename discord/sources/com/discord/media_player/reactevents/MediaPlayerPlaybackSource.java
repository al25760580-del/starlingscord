package com.discord.media_player.reactevents;

import a3.e;
import com.discord.media_player.MediaSource;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002/0B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017JL\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u00061"}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSource;", "", StackTraceHelper.ID_KEY, "", "assetUrl", "channelId", "messageId", "Lcom/discord/primitives/MessageId;", "attachmentIndex", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getAssetUrl", "getChannelId", "getMessageId-N_6c4I0", "Ljava/lang/String;", "getAttachmentIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component4-N_6c4I0", "component5", "copy", "copy-ElQ7df0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSource;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$media_player_release", "Companion", "$serializer", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MediaPlayerPlaybackSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String assetUrl;
    private final Integer attachmentIndex;
    private final String channelId;
    private final String id;
    private final String messageId;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\n\u0010\b\u001a\u00020\t*\u00020\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¨\u0006\f"}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSource$Companion;", "", "<init>", "()V", "fromMediaSource", "Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSource;", "mediaSource", "Lcom/discord/media_player/MediaSource;", "createId", "", "serializer", "Lkotlinx/serialization/KSerializer;", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String createId(@NotNull MediaSource mediaSource) {
            Intrinsics.checkNotNullParameter(mediaSource, "<this>");
            String strM1019getMessageIdN_6c4I0 = mediaSource.m1019getMessageIdN_6c4I0();
            String strM1163toStringimpl = strM1019getMessageIdN_6c4I0 == null ? "null" : MessageId.m1163toStringimpl(strM1019getMessageIdN_6c4I0);
            Integer index = mediaSource.getIndex();
            String sourceUrl = mediaSource.getSourceUrl();
            return strM1163toStringimpl + "." + index + ":" + (sourceUrl != null ? sourceUrl.hashCode() : 0);
        }

        @NotNull
        public final MediaPlayerPlaybackSource fromMediaSource(@NotNull MediaSource mediaSource) {
            Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
            return new MediaPlayerPlaybackSource(MediaPlayerPlaybackSource.INSTANCE.createId(mediaSource), mediaSource.getSourceUrl(), String.valueOf(mediaSource.m1018getChannelIdqMVnFVQ()), mediaSource.m1019getMessageIdN_6c4I0(), mediaSource.getIndex(), null);
        }

        @NotNull
        public final KSerializer serializer() {
            return MediaPlayerPlaybackSource$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MediaPlayerPlaybackSource(int i7, String str, String str2, String str3, String str4, Integer num, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, str2, str3, str4, num, serializationConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-ElQ7df0$default, reason: not valid java name */
    public static /* synthetic */ MediaPlayerPlaybackSource m1020copyElQ7df0$default(MediaPlayerPlaybackSource mediaPlayerPlaybackSource, String str, String str2, String str3, String str4, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = mediaPlayerPlaybackSource.id;
        }
        if ((i7 & 2) != 0) {
            str2 = mediaPlayerPlaybackSource.assetUrl;
        }
        if ((i7 & 4) != 0) {
            str3 = mediaPlayerPlaybackSource.channelId;
        }
        if ((i7 & 8) != 0) {
            str4 = mediaPlayerPlaybackSource.messageId;
        }
        if ((i7 & 16) != 0) {
            num = mediaPlayerPlaybackSource.attachmentIndex;
        }
        Integer num2 = num;
        String str5 = str3;
        return mediaPlayerPlaybackSource.m1022copyElQ7df0(str, str2, str5, str4, num2);
    }

    public static final /* synthetic */ void write$Self$media_player_release(MediaPlayerPlaybackSource self, CompositeEncoder output, SerialDescriptor serialDesc) {
        s1 s1Var = s1.f17602a;
        output.r(serialDesc, 0, s1Var, self.id);
        output.r(serialDesc, 1, s1Var, self.assetUrl);
        output.r(serialDesc, 2, s1Var, self.channelId);
        MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
        String str = self.messageId;
        output.r(serialDesc, 3, messageId$$serializer, str != null ? MessageId.m1156boximpl(str) : null);
        output.r(serialDesc, 4, m0.f17573a, self.attachmentIndex);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component4-N_6c4I0, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getAttachmentIndex() {
        return this.attachmentIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ElQ7df0, reason: not valid java name */
    public final MediaPlayerPlaybackSource m1022copyElQ7df0(String id2, String assetUrl, String channelId, String messageId, Integer attachmentIndex) {
        return new MediaPlayerPlaybackSource(id2, assetUrl, channelId, messageId, attachmentIndex, null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    public boolean equals(Object other) {
        boolean zM1160equalsimpl0;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaPlayerPlaybackSource)) {
            return false;
        }
        MediaPlayerPlaybackSource mediaPlayerPlaybackSource = (MediaPlayerPlaybackSource) other;
        if (!Intrinsics.areEqual(this.id, mediaPlayerPlaybackSource.id) || !Intrinsics.areEqual(this.assetUrl, mediaPlayerPlaybackSource.assetUrl) || !Intrinsics.areEqual(this.channelId, mediaPlayerPlaybackSource.channelId)) {
            return false;
        }
        String str = this.messageId;
        String str2 = mediaPlayerPlaybackSource.messageId;
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
        return zM1160equalsimpl0 && Intrinsics.areEqual(this.attachmentIndex, mediaPlayerPlaybackSource.attachmentIndex);
    }

    public final String getAssetUrl() {
        return this.assetUrl;
    }

    public final Integer getAttachmentIndex() {
        return this.attachmentIndex;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getMessageId-N_6c4I0, reason: not valid java name */
    public final String m1023getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.assetUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channelId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.messageId;
        int iM1161hashCodeimpl = (iHashCode3 + (str4 == null ? 0 : MessageId.m1161hashCodeimpl(str4))) * 31;
        Integer num = this.attachmentIndex;
        return iM1161hashCodeimpl + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.assetUrl;
        String str3 = this.channelId;
        String str4 = this.messageId;
        String strM1163toStringimpl = str4 == null ? "null" : MessageId.m1163toStringimpl(str4);
        Integer num = this.attachmentIndex;
        StringBuilder sbU = e.u("MediaPlayerPlaybackSource(id=", str, ", assetUrl=", str2, ", channelId=");
        e.A(sbU, str3, ", messageId=", strM1163toStringimpl, ", attachmentIndex=");
        sbU.append(num);
        sbU.append(")");
        return sbU.toString();
    }

    public /* synthetic */ MediaPlayerPlaybackSource(String str, String str2, String str3, String str4, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, num);
    }

    private /* synthetic */ MediaPlayerPlaybackSource(int i7, String str, String str2, String str3, String str4, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i7 & 31)) {
            e1.l(i7, 31, MediaPlayerPlaybackSource$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.assetUrl = str2;
        this.channelId = str3;
        this.messageId = str4;
        this.attachmentIndex = num;
    }

    private MediaPlayerPlaybackSource(String str, String str2, String str3, String str4, Integer num) {
        this.id = str;
        this.assetUrl = str2;
        this.channelId = str3;
        this.messageId = str4;
        this.attachmentIndex = num;
    }
}
