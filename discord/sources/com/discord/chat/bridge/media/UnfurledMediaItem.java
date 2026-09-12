package com.discord.chat.bridge.media;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kk.b;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002?@Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012B}\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J~\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\bHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J%\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006A"}, d2 = {"Lcom/discord/chat/bridge/media/UnfurledMediaItem;", "", "url", "", "proxyUrl", "loadingState", "Lcom/discord/chat/bridge/media/UnfurledMediaLoadingState;", "height", "", "width", "contentType", "placeholder", "placeholderVersion", "contentScanMetadata", "Lcom/discord/chat/bridge/media/ContentScanMetadata;", "srcIsAnimated", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/media/UnfurledMediaLoadingState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/media/ContentScanMetadata;Z)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/media/UnfurledMediaLoadingState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/media/ContentScanMetadata;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUrl", "()Ljava/lang/String;", "getProxyUrl", "getLoadingState", "()Lcom/discord/chat/bridge/media/UnfurledMediaLoadingState;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth", "getContentType", "getPlaceholder", "getPlaceholderVersion", "getContentScanMetadata", "()Lcom/discord/chat/bridge/media/ContentScanMetadata;", "getSrcIsAnimated", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/media/UnfurledMediaLoadingState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/media/ContentScanMetadata;Z)Lcom/discord/chat/bridge/media/UnfurledMediaItem;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UnfurledMediaItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final ContentScanMetadata contentScanMetadata;
    private final String contentType;
    private final Integer height;

    @NotNull
    private final UnfurledMediaLoadingState loadingState;
    private final String placeholder;
    private final Integer placeholderVersion;

    @NotNull
    private final String proxyUrl;
    private final boolean srcIsAnimated;

    @NotNull
    private final String url;
    private final Integer width;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/media/UnfurledMediaItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/media/UnfurledMediaItem;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UnfurledMediaItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UnfurledMediaItem(int i7, String str, String str2, UnfurledMediaLoadingState unfurledMediaLoadingState, Integer num, Integer num2, String str3, String str4, Integer num3, ContentScanMetadata contentScanMetadata, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (519 != (i7 & 519)) {
            e1.l(i7, 519, UnfurledMediaItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.url = str;
        this.proxyUrl = str2;
        this.loadingState = unfurledMediaLoadingState;
        if ((i7 & 8) == 0) {
            this.height = null;
        } else {
            this.height = num;
        }
        if ((i7 & 16) == 0) {
            this.width = null;
        } else {
            this.width = num2;
        }
        if ((i7 & 32) == 0) {
            this.contentType = null;
        } else {
            this.contentType = str3;
        }
        if ((i7 & 64) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str4;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.placeholderVersion = null;
        } else {
            this.placeholderVersion = num3;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.contentScanMetadata = null;
        } else {
            this.contentScanMetadata = contentScanMetadata;
        }
        this.srcIsAnimated = z5;
    }

    public static /* synthetic */ UnfurledMediaItem copy$default(UnfurledMediaItem unfurledMediaItem, String str, String str2, UnfurledMediaLoadingState unfurledMediaLoadingState, Integer num, Integer num2, String str3, String str4, Integer num3, ContentScanMetadata contentScanMetadata, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = unfurledMediaItem.url;
        }
        if ((i7 & 2) != 0) {
            str2 = unfurledMediaItem.proxyUrl;
        }
        if ((i7 & 4) != 0) {
            unfurledMediaLoadingState = unfurledMediaItem.loadingState;
        }
        if ((i7 & 8) != 0) {
            num = unfurledMediaItem.height;
        }
        if ((i7 & 16) != 0) {
            num2 = unfurledMediaItem.width;
        }
        if ((i7 & 32) != 0) {
            str3 = unfurledMediaItem.contentType;
        }
        if ((i7 & 64) != 0) {
            str4 = unfurledMediaItem.placeholder;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            num3 = unfurledMediaItem.placeholderVersion;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            contentScanMetadata = unfurledMediaItem.contentScanMetadata;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            z5 = unfurledMediaItem.srcIsAnimated;
        }
        ContentScanMetadata contentScanMetadata2 = contentScanMetadata;
        boolean z6 = z5;
        String str5 = str4;
        Integer num4 = num3;
        Integer num5 = num2;
        String str6 = str3;
        return unfurledMediaItem.copy(str, str2, unfurledMediaLoadingState, num, num5, str6, str5, num4, contentScanMetadata2, z6);
    }

    public static final /* synthetic */ void write$Self$chat_release(UnfurledMediaItem self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.url);
        output.q(serialDesc, 1, self.proxyUrl);
        output.g(serialDesc, 2, UnfurledMediaLoadingState.Serializer.INSTANCE, self.loadingState);
        if (output.u(serialDesc, 3) || self.height != null) {
            output.r(serialDesc, 3, m0.f17573a, self.height);
        }
        if (output.u(serialDesc, 4) || self.width != null) {
            output.r(serialDesc, 4, m0.f17573a, self.width);
        }
        if (output.u(serialDesc, 5) || self.contentType != null) {
            output.r(serialDesc, 5, s1.f17602a, self.contentType);
        }
        if (output.u(serialDesc, 6) || self.placeholder != null) {
            output.r(serialDesc, 6, s1.f17602a, self.placeholder);
        }
        if (output.u(serialDesc, 7) || self.placeholderVersion != null) {
            output.r(serialDesc, 7, m0.f17573a, self.placeholderVersion);
        }
        if (output.u(serialDesc, 8) || self.contentScanMetadata != null) {
            output.r(serialDesc, 8, ContentScanMetadata$$serializer.INSTANCE, self.contentScanMetadata);
        }
        output.p(serialDesc, 9, self.srcIsAnimated);
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

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProxyUrl() {
        return this.proxyUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UnfurledMediaLoadingState getLoadingState() {
        return this.loadingState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getPlaceholderVersion() {
        return this.placeholderVersion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ContentScanMetadata getContentScanMetadata() {
        return this.contentScanMetadata;
    }

    @NotNull
    public final UnfurledMediaItem copy(@NotNull String url, @NotNull String proxyUrl, @NotNull UnfurledMediaLoadingState loadingState, Integer height, Integer width, String contentType, String placeholder, Integer placeholderVersion, ContentScanMetadata contentScanMetadata, boolean srcIsAnimated) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxyUrl, "proxyUrl");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        return new UnfurledMediaItem(url, proxyUrl, loadingState, height, width, contentType, placeholder, placeholderVersion, contentScanMetadata, srcIsAnimated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnfurledMediaItem)) {
            return false;
        }
        UnfurledMediaItem unfurledMediaItem = (UnfurledMediaItem) other;
        return Intrinsics.areEqual(this.url, unfurledMediaItem.url) && Intrinsics.areEqual(this.proxyUrl, unfurledMediaItem.proxyUrl) && this.loadingState == unfurledMediaItem.loadingState && Intrinsics.areEqual(this.height, unfurledMediaItem.height) && Intrinsics.areEqual(this.width, unfurledMediaItem.width) && Intrinsics.areEqual(this.contentType, unfurledMediaItem.contentType) && Intrinsics.areEqual(this.placeholder, unfurledMediaItem.placeholder) && Intrinsics.areEqual(this.placeholderVersion, unfurledMediaItem.placeholderVersion) && Intrinsics.areEqual(this.contentScanMetadata, unfurledMediaItem.contentScanMetadata) && this.srcIsAnimated == unfurledMediaItem.srcIsAnimated;
    }

    public final ContentScanMetadata getContentScanMetadata() {
        return this.contentScanMetadata;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final Integer getHeight() {
        return this.height;
    }

    @NotNull
    public final UnfurledMediaLoadingState getLoadingState() {
        return this.loadingState;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final Integer getPlaceholderVersion() {
        return this.placeholderVersion;
    }

    @NotNull
    public final String getProxyUrl() {
        return this.proxyUrl;
    }

    public final boolean getSrcIsAnimated() {
        return this.srcIsAnimated;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = (this.loadingState.hashCode() + e.d(this.url.hashCode() * 31, 31, this.proxyUrl)) * 31;
        Integer num = this.height;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.contentType;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.placeholderVersion;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ContentScanMetadata contentScanMetadata = this.contentScanMetadata;
        return Boolean.hashCode(this.srcIsAnimated) + ((iHashCode6 + (contentScanMetadata != null ? contentScanMetadata.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.proxyUrl;
        UnfurledMediaLoadingState unfurledMediaLoadingState = this.loadingState;
        Integer num = this.height;
        Integer num2 = this.width;
        String str3 = this.contentType;
        String str4 = this.placeholder;
        Integer num3 = this.placeholderVersion;
        ContentScanMetadata contentScanMetadata = this.contentScanMetadata;
        boolean z5 = this.srcIsAnimated;
        StringBuilder sbU = e.u("UnfurledMediaItem(url=", str, ", proxyUrl=", str2, ", loadingState=");
        sbU.append(unfurledMediaLoadingState);
        sbU.append(", height=");
        sbU.append(num);
        sbU.append(", width=");
        b.r(num2, ", contentType=", str3, ", placeholder=", sbU);
        a.r(num3, str4, ", placeholderVersion=", ", contentScanMetadata=", sbU);
        sbU.append(contentScanMetadata);
        sbU.append(", srcIsAnimated=");
        sbU.append(z5);
        sbU.append(")");
        return sbU.toString();
    }

    public UnfurledMediaItem(@NotNull String url, @NotNull String proxyUrl, @NotNull UnfurledMediaLoadingState loadingState, Integer num, Integer num2, String str, String str2, Integer num3, ContentScanMetadata contentScanMetadata, boolean z5) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxyUrl, "proxyUrl");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.url = url;
        this.proxyUrl = proxyUrl;
        this.loadingState = loadingState;
        this.height = num;
        this.width = num2;
        this.contentType = str;
        this.placeholder = str2;
        this.placeholderVersion = num3;
        this.contentScanMetadata = contentScanMetadata;
        this.srcIsAnimated = z5;
    }

    public /* synthetic */ UnfurledMediaItem(String str, String str2, UnfurledMediaLoadingState unfurledMediaLoadingState, Integer num, Integer num2, String str3, String str4, Integer num3, ContentScanMetadata contentScanMetadata, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, unfurledMediaLoadingState, (i7 & 8) != 0 ? null : num, (i7 & 16) != 0 ? null : num2, (i7 & 32) != 0 ? null : str3, (i7 & 64) != 0 ? null : str4, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : num3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : contentScanMetadata, z5);
    }
}
