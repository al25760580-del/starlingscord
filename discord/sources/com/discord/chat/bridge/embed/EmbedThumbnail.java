package com.discord.chat.bridge.embed;

import a3.e;
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
import or.g;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002ABBq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010#J\t\u00101\u001a\u00020\nHÆ\u0003J~\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0007HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J%\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0001¢\u0006\u0002\b@R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u0012\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u0006C"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "Lcom/discord/chat/bridge/embed/EmbedUrlProvider;", "url", "", "proxyURL", "videoUrl", "height", "", "width", "gifv", "", "showPlayButton", "placeholder", "placeholderVersion", "srcIsAnimated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Z)V", "seen0", "embedUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUrl", "()Ljava/lang/String;", "getProxyURL", "getVideoUrl", "getHeight", "()I", "getWidth", "getGifv", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowPlayButton", "getPlaceholder", "getPlaceholderVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSrcIsAnimated", "()Z", "getEmbedUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmbedThumbnail implements EmbedUrlProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String embedUrl;
    private final Boolean gifv;
    private final int height;
    private final String placeholder;
    private final Integer placeholderVersion;
    private final String proxyURL;
    private final Boolean showPlayButton;
    private final boolean srcIsAnimated;

    @NotNull
    private final String url;
    private final String videoUrl;
    private final int width;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedThumbnail$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return EmbedThumbnail$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EmbedThumbnail(int i7, String str, String str2, String str3, int i10, int i11, Boolean bool, Boolean bool2, String str4, Integer num, boolean z5, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (25 != (i7 & 25)) {
            e1.l(i7, 25, EmbedThumbnail$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.url = str;
        if ((i7 & 2) == 0) {
            this.proxyURL = null;
        } else {
            this.proxyURL = str2;
        }
        if ((i7 & 4) == 0) {
            this.videoUrl = null;
        } else {
            this.videoUrl = str3;
        }
        this.height = i10;
        this.width = i11;
        if ((i7 & 32) == 0) {
            this.gifv = null;
        } else {
            this.gifv = bool;
        }
        if ((i7 & 64) == 0) {
            this.showPlayButton = null;
        } else {
            this.showPlayButton = bool2;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str4;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.placeholderVersion = null;
        } else {
            this.placeholderVersion = num;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.srcIsAnimated = false;
        } else {
            this.srcIsAnimated = z5;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            this.embedUrl = str5;
        } else {
            String str6 = this.proxyURL;
            this.embedUrl = str6 != null ? str6 : str;
        }
    }

    public static /* synthetic */ EmbedThumbnail copy$default(EmbedThumbnail embedThumbnail, String str, String str2, String str3, int i7, int i10, Boolean bool, Boolean bool2, String str4, Integer num, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = embedThumbnail.url;
        }
        if ((i11 & 2) != 0) {
            str2 = embedThumbnail.proxyURL;
        }
        if ((i11 & 4) != 0) {
            str3 = embedThumbnail.videoUrl;
        }
        if ((i11 & 8) != 0) {
            i7 = embedThumbnail.height;
        }
        if ((i11 & 16) != 0) {
            i10 = embedThumbnail.width;
        }
        if ((i11 & 32) != 0) {
            bool = embedThumbnail.gifv;
        }
        if ((i11 & 64) != 0) {
            bool2 = embedThumbnail.showPlayButton;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str4 = embedThumbnail.placeholder;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            num = embedThumbnail.placeholderVersion;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            z5 = embedThumbnail.srcIsAnimated;
        }
        Integer num2 = num;
        boolean z6 = z5;
        Boolean bool3 = bool2;
        String str5 = str4;
        int i12 = i10;
        Boolean bool4 = bool;
        return embedThumbnail.copy(str, str2, str3, i7, i12, bool4, bool3, str5, num2, z6);
    }

    public static final /* synthetic */ void write$Self$chat_release(EmbedThumbnail self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.url);
        if (output.u(serialDesc, 1) || self.proxyURL != null) {
            output.r(serialDesc, 1, s1.f17602a, self.proxyURL);
        }
        if (output.u(serialDesc, 2) || self.videoUrl != null) {
            output.r(serialDesc, 2, s1.f17602a, self.videoUrl);
        }
        output.l(3, self.height, serialDesc);
        output.l(4, self.width, serialDesc);
        if (output.u(serialDesc, 5) || self.gifv != null) {
            output.r(serialDesc, 5, g.f17537a, self.gifv);
        }
        if (output.u(serialDesc, 6) || self.showPlayButton != null) {
            output.r(serialDesc, 6, g.f17537a, self.showPlayButton);
        }
        if (output.u(serialDesc, 7) || self.placeholder != null) {
            output.r(serialDesc, 7, s1.f17602a, self.placeholder);
        }
        if (output.u(serialDesc, 8) || self.placeholderVersion != null) {
            output.r(serialDesc, 8, m0.f17573a, self.placeholderVersion);
        }
        if (output.u(serialDesc, 9) || self.srcIsAnimated) {
            output.p(serialDesc, 9, self.srcIsAnimated);
        }
        if (!output.u(serialDesc, 10)) {
            String embedUrl = self.getEmbedUrl();
            String str = self.proxyURL;
            if (str == null) {
                str = self.url;
            }
            if (Intrinsics.areEqual(embedUrl, str)) {
                return;
            }
        }
        output.q(serialDesc, 10, self.getEmbedUrl());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getSrcIsAnimated() {
        return this.srcIsAnimated;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProxyURL() {
        return this.proxyURL;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getGifv() {
        return this.gifv;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getShowPlayButton() {
        return this.showPlayButton;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getPlaceholderVersion() {
        return this.placeholderVersion;
    }

    @NotNull
    public final EmbedThumbnail copy(@NotNull String url, String proxyURL, String videoUrl, int height, int width, Boolean gifv, Boolean showPlayButton, String placeholder, Integer placeholderVersion, boolean srcIsAnimated) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new EmbedThumbnail(url, proxyURL, videoUrl, height, width, gifv, showPlayButton, placeholder, placeholderVersion, srcIsAnimated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbedThumbnail)) {
            return false;
        }
        EmbedThumbnail embedThumbnail = (EmbedThumbnail) other;
        return Intrinsics.areEqual(this.url, embedThumbnail.url) && Intrinsics.areEqual(this.proxyURL, embedThumbnail.proxyURL) && Intrinsics.areEqual(this.videoUrl, embedThumbnail.videoUrl) && this.height == embedThumbnail.height && this.width == embedThumbnail.width && Intrinsics.areEqual(this.gifv, embedThumbnail.gifv) && Intrinsics.areEqual(this.showPlayButton, embedThumbnail.showPlayButton) && Intrinsics.areEqual(this.placeholder, embedThumbnail.placeholder) && Intrinsics.areEqual(this.placeholderVersion, embedThumbnail.placeholderVersion) && this.srcIsAnimated == embedThumbnail.srcIsAnimated;
    }

    @Override // com.discord.chat.bridge.embed.EmbedUrlProvider
    @NotNull
    public String getEmbedUrl() {
        return this.embedUrl;
    }

    public final Boolean getGifv() {
        return this.gifv;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final Integer getPlaceholderVersion() {
        return this.placeholderVersion;
    }

    public final String getProxyURL() {
        return this.proxyURL;
    }

    public final Boolean getShowPlayButton() {
        return this.showPlayButton;
    }

    public final boolean getSrcIsAnimated() {
        return this.srcIsAnimated;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.proxyURL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.videoUrl;
        int iU = com.discord.chat.presentation.list.a.u(this.width, com.discord.chat.presentation.list.a.u(this.height, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Boolean bool = this.gifv;
        int iHashCode3 = (iU + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showPlayButton;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.placeholder;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.placeholderVersion;
        return Boolean.hashCode(this.srcIsAnimated) + ((iHashCode5 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.proxyURL;
        String str3 = this.videoUrl;
        int i7 = this.height;
        int i10 = this.width;
        Boolean bool = this.gifv;
        Boolean bool2 = this.showPlayButton;
        String str4 = this.placeholder;
        Integer num = this.placeholderVersion;
        boolean z5 = this.srcIsAnimated;
        StringBuilder sbU = e.u("EmbedThumbnail(url=", str, ", proxyURL=", str2, ", videoUrl=");
        sbU.append(str3);
        sbU.append(", height=");
        sbU.append(i7);
        sbU.append(", width=");
        sbU.append(i10);
        sbU.append(", gifv=");
        sbU.append(bool);
        sbU.append(", showPlayButton=");
        sbU.append(bool2);
        sbU.append(", placeholder=");
        sbU.append(str4);
        sbU.append(", placeholderVersion=");
        sbU.append(num);
        sbU.append(", srcIsAnimated=");
        sbU.append(z5);
        sbU.append(")");
        return sbU.toString();
    }

    public EmbedThumbnail(@NotNull String url, String str, String str2, int i7, int i10, Boolean bool, Boolean bool2, String str3, Integer num, boolean z5) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.proxyURL = str;
        this.videoUrl = str2;
        this.height = i7;
        this.width = i10;
        this.gifv = bool;
        this.showPlayButton = bool2;
        this.placeholder = str3;
        this.placeholderVersion = num;
        this.srcIsAnimated = z5;
        this.embedUrl = str != null ? str : url;
    }

    public /* synthetic */ EmbedThumbnail(String str, String str2, String str3, int i7, int i10, Boolean bool, Boolean bool2, String str4, Integer num, boolean z5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, i7, i10, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : bool2, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str4, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : num, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? false : z5);
    }
}
