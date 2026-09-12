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
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eBo\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jf\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0014\u0010\u0010\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u0006;"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedMedia;", "Lcom/discord/chat/bridge/embed/EmbedUrlProvider;", "url", "", "proxyURL", "width", "", "height", "placeholder", "placeholderVersion", "srcIsAnimated", "", "contentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;)V", "seen0", "embedUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUrl", "()Ljava/lang/String;", "getProxyURL", "getWidth", "()I", "getHeight", "getPlaceholder", "getPlaceholderVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSrcIsAnimated", "()Z", "getContentType", "getEmbedUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;)Lcom/discord/chat/bridge/embed/EmbedMedia;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmbedMedia implements EmbedUrlProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String contentType;

    @NotNull
    private final String embedUrl;
    private final int height;
    private final String placeholder;
    private final Integer placeholderVersion;
    private final String proxyURL;
    private final boolean srcIsAnimated;

    @NotNull
    private final String url;
    private final int width;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedMedia$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/EmbedMedia;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return EmbedMedia$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EmbedMedia(int i7, String str, String str2, int i10, int i11, String str3, Integer num, boolean z5, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (77 != (i7 & 77)) {
            e1.l(i7, 77, EmbedMedia$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.url = str;
        if ((i7 & 2) == 0) {
            this.proxyURL = null;
        } else {
            this.proxyURL = str2;
        }
        this.width = i10;
        this.height = i11;
        if ((i7 & 16) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str3;
        }
        if ((i7 & 32) == 0) {
            this.placeholderVersion = null;
        } else {
            this.placeholderVersion = num;
        }
        this.srcIsAnimated = z5;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.contentType = null;
        } else {
            this.contentType = str4;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            this.embedUrl = str5;
        } else {
            String str6 = this.proxyURL;
            this.embedUrl = str6 != null ? str6 : str;
        }
    }

    public static /* synthetic */ EmbedMedia copy$default(EmbedMedia embedMedia, String str, String str2, int i7, int i10, String str3, Integer num, boolean z5, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = embedMedia.url;
        }
        if ((i11 & 2) != 0) {
            str2 = embedMedia.proxyURL;
        }
        if ((i11 & 4) != 0) {
            i7 = embedMedia.width;
        }
        if ((i11 & 8) != 0) {
            i10 = embedMedia.height;
        }
        if ((i11 & 16) != 0) {
            str3 = embedMedia.placeholder;
        }
        if ((i11 & 32) != 0) {
            num = embedMedia.placeholderVersion;
        }
        if ((i11 & 64) != 0) {
            z5 = embedMedia.srcIsAnimated;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str4 = embedMedia.contentType;
        }
        boolean z6 = z5;
        String str5 = str4;
        String str6 = str3;
        Integer num2 = num;
        return embedMedia.copy(str, str2, i7, i10, str6, num2, z6, str5);
    }

    public static final /* synthetic */ void write$Self$chat_release(EmbedMedia self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.url);
        if (output.u(serialDesc, 1) || self.proxyURL != null) {
            output.r(serialDesc, 1, s1.f17602a, self.proxyURL);
        }
        output.l(2, self.width, serialDesc);
        output.l(3, self.height, serialDesc);
        if (output.u(serialDesc, 4) || self.placeholder != null) {
            output.r(serialDesc, 4, s1.f17602a, self.placeholder);
        }
        if (output.u(serialDesc, 5) || self.placeholderVersion != null) {
            output.r(serialDesc, 5, m0.f17573a, self.placeholderVersion);
        }
        output.p(serialDesc, 6, self.srcIsAnimated);
        if (output.u(serialDesc, 7) || self.contentType != null) {
            output.r(serialDesc, 7, s1.f17602a, self.contentType);
        }
        if (!output.u(serialDesc, 8)) {
            String embedUrl = self.getEmbedUrl();
            String str = self.proxyURL;
            if (str == null) {
                str = self.url;
            }
            if (Intrinsics.areEqual(embedUrl, str)) {
                return;
            }
        }
        output.q(serialDesc, 8, self.getEmbedUrl());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProxyURL() {
        return this.proxyURL;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPlaceholderVersion() {
        return this.placeholderVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSrcIsAnimated() {
        return this.srcIsAnimated;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final EmbedMedia copy(@NotNull String url, String proxyURL, int width, int height, String placeholder, Integer placeholderVersion, boolean srcIsAnimated, String contentType) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new EmbedMedia(url, proxyURL, width, height, placeholder, placeholderVersion, srcIsAnimated, contentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbedMedia)) {
            return false;
        }
        EmbedMedia embedMedia = (EmbedMedia) other;
        return Intrinsics.areEqual(this.url, embedMedia.url) && Intrinsics.areEqual(this.proxyURL, embedMedia.proxyURL) && this.width == embedMedia.width && this.height == embedMedia.height && Intrinsics.areEqual(this.placeholder, embedMedia.placeholder) && Intrinsics.areEqual(this.placeholderVersion, embedMedia.placeholderVersion) && this.srcIsAnimated == embedMedia.srcIsAnimated && Intrinsics.areEqual(this.contentType, embedMedia.contentType);
    }

    public final String getContentType() {
        return this.contentType;
    }

    @Override // com.discord.chat.bridge.embed.EmbedUrlProvider
    @NotNull
    public String getEmbedUrl() {
        return this.embedUrl;
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

    public final boolean getSrcIsAnimated() {
        return this.srcIsAnimated;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.proxyURL;
        int iU = com.discord.chat.presentation.list.a.u(this.height, com.discord.chat.presentation.list.a.u(this.width, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.placeholder;
        int iHashCode2 = (iU + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.placeholderVersion;
        int iG = com.discord.chat.presentation.list.a.g((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.srcIsAnimated);
        String str3 = this.contentType;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.proxyURL;
        int i7 = this.width;
        int i10 = this.height;
        String str3 = this.placeholder;
        Integer num = this.placeholderVersion;
        boolean z5 = this.srcIsAnimated;
        String str4 = this.contentType;
        StringBuilder sbU = e.u("EmbedMedia(url=", str, ", proxyURL=", str2, ", width=");
        e.z(sbU, i7, ", height=", i10, ", placeholder=");
        com.discord.chat.presentation.list.a.r(num, str3, ", placeholderVersion=", ", srcIsAnimated=", sbU);
        sbU.append(z5);
        sbU.append(", contentType=");
        sbU.append(str4);
        sbU.append(")");
        return sbU.toString();
    }

    public EmbedMedia(@NotNull String url, String str, int i7, int i10, String str2, Integer num, boolean z5, String str3) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.proxyURL = str;
        this.width = i7;
        this.height = i10;
        this.placeholder = str2;
        this.placeholderVersion = num;
        this.srcIsAnimated = z5;
        this.contentType = str3;
        this.embedUrl = str != null ? str : url;
    }

    public /* synthetic */ EmbedMedia(String str, String str2, int i7, int i10, String str3, Integer num, boolean z5, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, i7, i10, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : num, z5, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str4);
    }
}
