package com.discord.chat.bridge.gift;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@f(with = GiftEmbedSerializer.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00102\u00020\u0001:\u0003\u000e\u000f\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed;", "", "headerText", "", "getHeaderText", "()Ljava/lang/String;", "headerColor", "", "getHeaderColor", "()I", ViewProps.BACKGROUND_COLOR, "getBackgroundColor", "thumbnailCornerRadius", "getThumbnailCornerRadius", "Resolving", "Resolved", "Companion", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GiftEmbed {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return GiftEmbedSerializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0010\u0011R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "thumbnailUrl", "", "getThumbnailUrl", "()Ljava/lang/String;", "titleText", "getTitleText", "titleColor", "", "getTitleColor", "()I", "subtitle", "getSubtitle", "subtitleColor", "getSubtitleColor", "Valid", "Invalid", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Resolved extends GiftEmbed {

        @f
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fBs\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0013J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u0006;"}, d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;", "headerText", "", "headerColor", "", ViewProps.BACKGROUND_COLOR, "thumbnailCornerRadius", "thumbnailUrl", "titleText", "titleColor", "subtitle", "subtitleColor", "thumbnailBackgroundColor", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getHeaderText", "()Ljava/lang/String;", "getHeaderColor", "()I", "getBackgroundColor", "getThumbnailCornerRadius", "getThumbnailUrl", "getTitleText", "getTitleColor", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Invalid implements Resolved {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final int backgroundColor;
            private final int headerColor;

            @NotNull
            private final String headerText;

            @NotNull
            private final String subtitle;
            private final int subtitleColor;
            private final int thumbnailBackgroundColor;
            private final int thumbnailCornerRadius;

            @NotNull
            private final String thumbnailUrl;
            private final int titleColor;

            @NotNull
            private final String titleText;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return GiftEmbed$Resolved$Invalid$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Invalid(int i7, String str, int i10, int i11, int i12, String str2, String str3, int i13, String str4, int i14, int i15, SerializationConstructorMarker serializationConstructorMarker) {
                if (1023 != (i7 & 1023)) {
                    e1.l(i7, 1023, GiftEmbed$Resolved$Invalid$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.headerText = str;
                this.headerColor = i10;
                this.backgroundColor = i11;
                this.thumbnailCornerRadius = i12;
                this.thumbnailUrl = str2;
                this.titleText = str3;
                this.titleColor = i13;
                this.subtitle = str4;
                this.subtitleColor = i14;
                this.thumbnailBackgroundColor = i15;
            }

            public static /* synthetic */ Invalid copy$default(Invalid invalid, String str, int i7, int i10, int i11, String str2, String str3, int i12, String str4, int i13, int i14, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    str = invalid.headerText;
                }
                if ((i15 & 2) != 0) {
                    i7 = invalid.headerColor;
                }
                if ((i15 & 4) != 0) {
                    i10 = invalid.backgroundColor;
                }
                if ((i15 & 8) != 0) {
                    i11 = invalid.thumbnailCornerRadius;
                }
                if ((i15 & 16) != 0) {
                    str2 = invalid.thumbnailUrl;
                }
                if ((i15 & 32) != 0) {
                    str3 = invalid.titleText;
                }
                if ((i15 & 64) != 0) {
                    i12 = invalid.titleColor;
                }
                if ((i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                    str4 = invalid.subtitle;
                }
                if ((i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                    i13 = invalid.subtitleColor;
                }
                if ((i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                    i14 = invalid.thumbnailBackgroundColor;
                }
                int i16 = i13;
                int i17 = i14;
                int i18 = i12;
                String str5 = str4;
                String str6 = str2;
                String str7 = str3;
                return invalid.copy(str, i7, i10, i11, str6, str7, i18, str5, i16, i17);
            }

            public static final /* synthetic */ void write$Self$chat_release(Invalid self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.q(serialDesc, 0, self.getHeaderText());
                output.l(1, self.getHeaderColor(), serialDesc);
                output.l(2, self.getBackgroundColor(), serialDesc);
                output.l(3, self.getThumbnailCornerRadius(), serialDesc);
                output.q(serialDesc, 4, self.getThumbnailUrl());
                output.q(serialDesc, 5, self.getTitleText());
                output.l(6, self.getTitleColor(), serialDesc);
                output.q(serialDesc, 7, self.getSubtitle());
                output.l(8, self.getSubtitleColor(), serialDesc);
                output.l(9, self.thumbnailBackgroundColor, serialDesc);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getHeaderText() {
                return this.headerText;
            }

            /* JADX INFO: renamed from: component10, reason: from getter */
            public final int getThumbnailBackgroundColor() {
                return this.thumbnailBackgroundColor;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getHeaderColor() {
                return this.headerColor;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final int getBackgroundColor() {
                return this.backgroundColor;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final int getThumbnailCornerRadius() {
                return this.thumbnailCornerRadius;
            }

            @NotNull
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getThumbnailUrl() {
                return this.thumbnailUrl;
            }

            @NotNull
            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getTitleText() {
                return this.titleText;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final int getTitleColor() {
                return this.titleColor;
            }

            @NotNull
            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final int getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            public final Invalid copy(@NotNull String headerText, int headerColor, int backgroundColor, int thumbnailCornerRadius, @NotNull String thumbnailUrl, @NotNull String titleText, int titleColor, @NotNull String subtitle, int subtitleColor, int thumbnailBackgroundColor) {
                Intrinsics.checkNotNullParameter(headerText, "headerText");
                Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
                Intrinsics.checkNotNullParameter(titleText, "titleText");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new Invalid(headerText, headerColor, backgroundColor, thumbnailCornerRadius, thumbnailUrl, titleText, titleColor, subtitle, subtitleColor, thumbnailBackgroundColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Invalid)) {
                    return false;
                }
                Invalid invalid = (Invalid) other;
                return Intrinsics.areEqual(this.headerText, invalid.headerText) && this.headerColor == invalid.headerColor && this.backgroundColor == invalid.backgroundColor && this.thumbnailCornerRadius == invalid.thumbnailCornerRadius && Intrinsics.areEqual(this.thumbnailUrl, invalid.thumbnailUrl) && Intrinsics.areEqual(this.titleText, invalid.titleText) && this.titleColor == invalid.titleColor && Intrinsics.areEqual(this.subtitle, invalid.subtitle) && this.subtitleColor == invalid.subtitleColor && this.thumbnailBackgroundColor == invalid.thumbnailBackgroundColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getBackgroundColor() {
                return this.backgroundColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getHeaderColor() {
                return this.headerColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            @NotNull
            public String getHeaderText() {
                return this.headerText;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            @NotNull
            public String getSubtitle() {
                return this.subtitle;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public int getSubtitleColor() {
                return this.subtitleColor;
            }

            public final int getThumbnailBackgroundColor() {
                return this.thumbnailBackgroundColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getThumbnailCornerRadius() {
                return this.thumbnailCornerRadius;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            @NotNull
            public String getThumbnailUrl() {
                return this.thumbnailUrl;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public int getTitleColor() {
                return this.titleColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            @NotNull
            public String getTitleText() {
                return this.titleText;
            }

            public int hashCode() {
                return Integer.hashCode(this.thumbnailBackgroundColor) + a.u(this.subtitleColor, e.d(a.u(this.titleColor, e.d(e.d(a.u(this.thumbnailCornerRadius, a.u(this.backgroundColor, a.u(this.headerColor, this.headerText.hashCode() * 31, 31), 31), 31), 31, this.thumbnailUrl), 31, this.titleText), 31), 31, this.subtitle), 31);
            }

            @NotNull
            public String toString() {
                String str = this.headerText;
                int i7 = this.headerColor;
                int i10 = this.backgroundColor;
                int i11 = this.thumbnailCornerRadius;
                String str2 = this.thumbnailUrl;
                String str3 = this.titleText;
                int i12 = this.titleColor;
                String str4 = this.subtitle;
                int i13 = this.subtitleColor;
                int i14 = this.thumbnailBackgroundColor;
                StringBuilder sbT = e.t("Invalid(headerText=", str, ", headerColor=", i7, ", backgroundColor=");
                e.z(sbT, i10, ", thumbnailCornerRadius=", i11, ", thumbnailUrl=");
                e.A(sbT, str2, ", titleText=", str3, ", titleColor=");
                sbT.append(i12);
                sbT.append(", subtitle=");
                sbT.append(str4);
                sbT.append(", subtitleColor=");
                sbT.append(i13);
                sbT.append(", thumbnailBackgroundColor=");
                sbT.append(i14);
                sbT.append(")");
                return sbT.toString();
            }

            public Invalid(@NotNull String headerText, int i7, int i10, int i11, @NotNull String thumbnailUrl, @NotNull String titleText, int i12, @NotNull String subtitle, int i13, int i14) {
                Intrinsics.checkNotNullParameter(headerText, "headerText");
                Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
                Intrinsics.checkNotNullParameter(titleText, "titleText");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.headerText = headerText;
                this.headerColor = i7;
                this.backgroundColor = i10;
                this.thumbnailCornerRadius = i11;
                this.thumbnailUrl = thumbnailUrl;
                this.titleText = titleText;
                this.titleColor = i12;
                this.subtitle = subtitle;
                this.subtitleColor = i13;
                this.thumbnailBackgroundColor = i14;
            }
        }

        @f
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002TUB¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019B»\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001dJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0014HÆ\u0003J\t\u0010D\u001a\u00020\u0016HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003JÉ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001J\u0013\u0010G\u001a\u00020\u00162\b\u0010H\u001a\u0004\u0018\u00010IHÖ\u0003J\t\u0010J\u001a\u00020\u0005HÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001J%\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0001¢\u0006\u0002\bSR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001f¨\u0006V"}, d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;", "headerText", "", "headerColor", "", ViewProps.BACKGROUND_COLOR, "thumbnailCornerRadius", "thumbnailUrl", "titleText", "titleColor", "subtitle", "subtitleColor", "bodyText", "bodyTextColor", "acceptLabelText", "acceptLabelColor", "acceptLabelBackgroundColor", "splashUrl", "splashOpacity", "", "canBeAccepted", "", "giftCode", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getHeaderText", "()Ljava/lang/String;", "getHeaderColor", "()I", "getBackgroundColor", "getThumbnailCornerRadius", "getThumbnailUrl", "getTitleText", "getTitleColor", "getSubtitle", "getSubtitleColor", "getBodyText", "getBodyTextColor", "getAcceptLabelText", "getAcceptLabelColor", "getAcceptLabelBackgroundColor", "getSplashUrl", "getSplashOpacity", "()F", "getCanBeAccepted", "()Z", "getGiftCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Valid implements Resolved {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final int acceptLabelBackgroundColor;
            private final int acceptLabelColor;
            private final String acceptLabelText;
            private final int backgroundColor;
            private final String bodyText;
            private final int bodyTextColor;
            private final boolean canBeAccepted;

            @NotNull
            private final String giftCode;
            private final int headerColor;

            @NotNull
            private final String headerText;
            private final float splashOpacity;
            private final String splashUrl;
            private final String subtitle;
            private final int subtitleColor;
            private final int thumbnailCornerRadius;
            private final String thumbnailUrl;
            private final int titleColor;
            private final String titleText;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return GiftEmbed$Resolved$Valid$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Valid(int i7, String str, int i10, int i11, int i12, String str2, String str3, int i13, String str4, int i14, String str5, int i15, String str6, int i16, int i17, String str7, float f2, boolean z5, String str8, SerializationConstructorMarker serializationConstructorMarker) {
                if (243023 != (i7 & 243023)) {
                    e1.l(i7, 243023, GiftEmbed$Resolved$Valid$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.headerText = str;
                this.headerColor = i10;
                this.backgroundColor = i11;
                this.thumbnailCornerRadius = i12;
                if ((i7 & 16) == 0) {
                    this.thumbnailUrl = null;
                } else {
                    this.thumbnailUrl = str2;
                }
                if ((i7 & 32) == 0) {
                    this.titleText = null;
                } else {
                    this.titleText = str3;
                }
                this.titleColor = i13;
                if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                    this.subtitle = null;
                } else {
                    this.subtitle = str4;
                }
                this.subtitleColor = i14;
                if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
                    this.bodyText = null;
                } else {
                    this.bodyText = str5;
                }
                this.bodyTextColor = i15;
                if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
                    this.acceptLabelText = null;
                } else {
                    this.acceptLabelText = str6;
                }
                this.acceptLabelColor = i16;
                this.acceptLabelBackgroundColor = i17;
                if ((i7 & 16384) == 0) {
                    this.splashUrl = null;
                } else {
                    this.splashUrl = str7;
                }
                this.splashOpacity = f2;
                this.canBeAccepted = z5;
                this.giftCode = str8;
            }

            public static /* synthetic */ Valid copy$default(Valid valid, String str, int i7, int i10, int i11, String str2, String str3, int i12, String str4, int i13, String str5, int i14, String str6, int i15, int i16, String str7, float f2, boolean z5, String str8, int i17, Object obj) {
                String str9;
                boolean z6;
                String str10 = (i17 & 1) != 0 ? valid.headerText : str;
                int i18 = (i17 & 2) != 0 ? valid.headerColor : i7;
                int i19 = (i17 & 4) != 0 ? valid.backgroundColor : i10;
                int i20 = (i17 & 8) != 0 ? valid.thumbnailCornerRadius : i11;
                String str11 = (i17 & 16) != 0 ? valid.thumbnailUrl : str2;
                String str12 = (i17 & 32) != 0 ? valid.titleText : str3;
                int i21 = (i17 & 64) != 0 ? valid.titleColor : i12;
                String str13 = (i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? valid.subtitle : str4;
                int i22 = (i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? valid.subtitleColor : i13;
                String str14 = (i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? valid.bodyText : str5;
                int i23 = (i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? valid.bodyTextColor : i14;
                String str15 = (i17 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? valid.acceptLabelText : str6;
                int i24 = (i17 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? valid.acceptLabelColor : i15;
                int i25 = (i17 & 8192) != 0 ? valid.acceptLabelBackgroundColor : i16;
                String str16 = str10;
                String str17 = (i17 & 16384) != 0 ? valid.splashUrl : str7;
                float f7 = (i17 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? valid.splashOpacity : f2;
                boolean z7 = (i17 & 65536) != 0 ? valid.canBeAccepted : z5;
                if ((i17 & 131072) != 0) {
                    z6 = z7;
                    str9 = valid.giftCode;
                } else {
                    str9 = str8;
                    z6 = z7;
                }
                return valid.copy(str16, i18, i19, i20, str11, str12, i21, str13, i22, str14, i23, str15, i24, i25, str17, f7, z6, str9);
            }

            public static final /* synthetic */ void write$Self$chat_release(Valid self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.q(serialDesc, 0, self.getHeaderText());
                output.l(1, self.getHeaderColor(), serialDesc);
                output.l(2, self.getBackgroundColor(), serialDesc);
                output.l(3, self.getThumbnailCornerRadius(), serialDesc);
                if (output.u(serialDesc, 4) || self.getThumbnailUrl() != null) {
                    output.r(serialDesc, 4, s1.f17602a, self.getThumbnailUrl());
                }
                if (output.u(serialDesc, 5) || self.getTitleText() != null) {
                    output.r(serialDesc, 5, s1.f17602a, self.getTitleText());
                }
                output.l(6, self.getTitleColor(), serialDesc);
                if (output.u(serialDesc, 7) || self.getSubtitle() != null) {
                    output.r(serialDesc, 7, s1.f17602a, self.getSubtitle());
                }
                output.l(8, self.getSubtitleColor(), serialDesc);
                if (output.u(serialDesc, 9) || self.bodyText != null) {
                    output.r(serialDesc, 9, s1.f17602a, self.bodyText);
                }
                output.l(10, self.bodyTextColor, serialDesc);
                if (output.u(serialDesc, 11) || self.acceptLabelText != null) {
                    output.r(serialDesc, 11, s1.f17602a, self.acceptLabelText);
                }
                output.l(12, self.acceptLabelColor, serialDesc);
                output.l(13, self.acceptLabelBackgroundColor, serialDesc);
                if (output.u(serialDesc, 14) || self.splashUrl != null) {
                    output.r(serialDesc, 14, s1.f17602a, self.splashUrl);
                }
                output.j(serialDesc, 15, self.splashOpacity);
                output.p(serialDesc, 16, self.canBeAccepted);
                output.q(serialDesc, 17, self.giftCode);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getHeaderText() {
                return this.headerText;
            }

            /* JADX INFO: renamed from: component10, reason: from getter */
            public final String getBodyText() {
                return this.bodyText;
            }

            /* JADX INFO: renamed from: component11, reason: from getter */
            public final int getBodyTextColor() {
                return this.bodyTextColor;
            }

            /* JADX INFO: renamed from: component12, reason: from getter */
            public final String getAcceptLabelText() {
                return this.acceptLabelText;
            }

            /* JADX INFO: renamed from: component13, reason: from getter */
            public final int getAcceptLabelColor() {
                return this.acceptLabelColor;
            }

            /* JADX INFO: renamed from: component14, reason: from getter */
            public final int getAcceptLabelBackgroundColor() {
                return this.acceptLabelBackgroundColor;
            }

            /* JADX INFO: renamed from: component15, reason: from getter */
            public final String getSplashUrl() {
                return this.splashUrl;
            }

            /* JADX INFO: renamed from: component16, reason: from getter */
            public final float getSplashOpacity() {
                return this.splashOpacity;
            }

            /* JADX INFO: renamed from: component17, reason: from getter */
            public final boolean getCanBeAccepted() {
                return this.canBeAccepted;
            }

            @NotNull
            /* JADX INFO: renamed from: component18, reason: from getter */
            public final String getGiftCode() {
                return this.giftCode;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getHeaderColor() {
                return this.headerColor;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final int getBackgroundColor() {
                return this.backgroundColor;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final int getThumbnailCornerRadius() {
                return this.thumbnailCornerRadius;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getThumbnailUrl() {
                return this.thumbnailUrl;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getTitleText() {
                return this.titleText;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final int getTitleColor() {
                return this.titleColor;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final int getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            public final Valid copy(@NotNull String headerText, int headerColor, int backgroundColor, int thumbnailCornerRadius, String thumbnailUrl, String titleText, int titleColor, String subtitle, int subtitleColor, String bodyText, int bodyTextColor, String acceptLabelText, int acceptLabelColor, int acceptLabelBackgroundColor, String splashUrl, float splashOpacity, boolean canBeAccepted, @NotNull String giftCode) {
                Intrinsics.checkNotNullParameter(headerText, "headerText");
                Intrinsics.checkNotNullParameter(giftCode, "giftCode");
                return new Valid(headerText, headerColor, backgroundColor, thumbnailCornerRadius, thumbnailUrl, titleText, titleColor, subtitle, subtitleColor, bodyText, bodyTextColor, acceptLabelText, acceptLabelColor, acceptLabelBackgroundColor, splashUrl, splashOpacity, canBeAccepted, giftCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Valid)) {
                    return false;
                }
                Valid valid = (Valid) other;
                return Intrinsics.areEqual(this.headerText, valid.headerText) && this.headerColor == valid.headerColor && this.backgroundColor == valid.backgroundColor && this.thumbnailCornerRadius == valid.thumbnailCornerRadius && Intrinsics.areEqual(this.thumbnailUrl, valid.thumbnailUrl) && Intrinsics.areEqual(this.titleText, valid.titleText) && this.titleColor == valid.titleColor && Intrinsics.areEqual(this.subtitle, valid.subtitle) && this.subtitleColor == valid.subtitleColor && Intrinsics.areEqual(this.bodyText, valid.bodyText) && this.bodyTextColor == valid.bodyTextColor && Intrinsics.areEqual(this.acceptLabelText, valid.acceptLabelText) && this.acceptLabelColor == valid.acceptLabelColor && this.acceptLabelBackgroundColor == valid.acceptLabelBackgroundColor && Intrinsics.areEqual(this.splashUrl, valid.splashUrl) && Float.compare(this.splashOpacity, valid.splashOpacity) == 0 && this.canBeAccepted == valid.canBeAccepted && Intrinsics.areEqual(this.giftCode, valid.giftCode);
            }

            public final int getAcceptLabelBackgroundColor() {
                return this.acceptLabelBackgroundColor;
            }

            public final int getAcceptLabelColor() {
                return this.acceptLabelColor;
            }

            public final String getAcceptLabelText() {
                return this.acceptLabelText;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getBodyText() {
                return this.bodyText;
            }

            public final int getBodyTextColor() {
                return this.bodyTextColor;
            }

            public final boolean getCanBeAccepted() {
                return this.canBeAccepted;
            }

            @NotNull
            public final String getGiftCode() {
                return this.giftCode;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getHeaderColor() {
                return this.headerColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            @NotNull
            public String getHeaderText() {
                return this.headerText;
            }

            public final float getSplashOpacity() {
                return this.splashOpacity;
            }

            public final String getSplashUrl() {
                return this.splashUrl;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public String getSubtitle() {
                return this.subtitle;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public int getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getThumbnailCornerRadius() {
                return this.thumbnailCornerRadius;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public String getThumbnailUrl() {
                return this.thumbnailUrl;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public int getTitleColor() {
                return this.titleColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public String getTitleText() {
                return this.titleText;
            }

            public int hashCode() {
                int iU = a.u(this.thumbnailCornerRadius, a.u(this.backgroundColor, a.u(this.headerColor, this.headerText.hashCode() * 31, 31), 31), 31);
                String str = this.thumbnailUrl;
                int iHashCode = (iU + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.titleText;
                int iU2 = a.u(this.titleColor, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
                String str3 = this.subtitle;
                int iU3 = a.u(this.subtitleColor, (iU2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
                String str4 = this.bodyText;
                int iU4 = a.u(this.bodyTextColor, (iU3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
                String str5 = this.acceptLabelText;
                int iU5 = a.u(this.acceptLabelBackgroundColor, a.u(this.acceptLabelColor, (iU4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31);
                String str6 = this.splashUrl;
                return this.giftCode.hashCode() + a.g(e.a((iU5 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.splashOpacity), 31, this.canBeAccepted);
            }

            @NotNull
            public String toString() {
                String str = this.headerText;
                int i7 = this.headerColor;
                int i10 = this.backgroundColor;
                int i11 = this.thumbnailCornerRadius;
                String str2 = this.thumbnailUrl;
                String str3 = this.titleText;
                int i12 = this.titleColor;
                String str4 = this.subtitle;
                int i13 = this.subtitleColor;
                String str5 = this.bodyText;
                int i14 = this.bodyTextColor;
                String str6 = this.acceptLabelText;
                int i15 = this.acceptLabelColor;
                int i16 = this.acceptLabelBackgroundColor;
                String str7 = this.splashUrl;
                float f2 = this.splashOpacity;
                boolean z5 = this.canBeAccepted;
                String str8 = this.giftCode;
                StringBuilder sbT = e.t("Valid(headerText=", str, ", headerColor=", i7, ", backgroundColor=");
                e.z(sbT, i10, ", thumbnailCornerRadius=", i11, ", thumbnailUrl=");
                e.A(sbT, str2, ", titleText=", str3, ", titleColor=");
                sbT.append(i12);
                sbT.append(", subtitle=");
                sbT.append(str4);
                sbT.append(", subtitleColor=");
                sbT.append(i13);
                sbT.append(", bodyText=");
                sbT.append(str5);
                sbT.append(", bodyTextColor=");
                sbT.append(i14);
                sbT.append(", acceptLabelText=");
                sbT.append(str6);
                sbT.append(", acceptLabelColor=");
                e.z(sbT, i15, ", acceptLabelBackgroundColor=", i16, ", splashUrl=");
                sbT.append(str7);
                sbT.append(", splashOpacity=");
                sbT.append(f2);
                sbT.append(", canBeAccepted=");
                sbT.append(z5);
                sbT.append(", giftCode=");
                sbT.append(str8);
                sbT.append(")");
                return sbT.toString();
            }

            public Valid(@NotNull String headerText, int i7, int i10, int i11, String str, String str2, int i12, String str3, int i13, String str4, int i14, String str5, int i15, int i16, String str6, float f2, boolean z5, @NotNull String giftCode) {
                Intrinsics.checkNotNullParameter(headerText, "headerText");
                Intrinsics.checkNotNullParameter(giftCode, "giftCode");
                this.headerText = headerText;
                this.headerColor = i7;
                this.backgroundColor = i10;
                this.thumbnailCornerRadius = i11;
                this.thumbnailUrl = str;
                this.titleText = str2;
                this.titleColor = i12;
                this.subtitle = str3;
                this.subtitleColor = i13;
                this.bodyText = str4;
                this.bodyTextColor = i14;
                this.acceptLabelText = str5;
                this.acceptLabelColor = i15;
                this.acceptLabelBackgroundColor = i16;
                this.splashUrl = str6;
                this.splashOpacity = f2;
                this.canBeAccepted = z5;
                this.giftCode = giftCode;
            }

            public /* synthetic */ Valid(String str, int i7, int i10, int i11, String str2, String str3, int i12, String str4, int i13, String str5, int i14, String str6, int i15, int i16, String str7, float f2, boolean z5, String str8, int i17, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i7, i10, i11, (i17 & 16) != 0 ? null : str2, (i17 & 32) != 0 ? null : str3, i12, (i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str4, i13, (i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str5, i14, (i17 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str6, i15, i16, (i17 & 16384) != 0 ? null : str7, f2, z5, str8);
            }
        }

        String getSubtitle();

        int getSubtitleColor();

        String getThumbnailUrl();

        int getTitleColor();

        String getTitleText();
    }

    @f
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006/"}, d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "headerText", "", "headerColor", "", ViewProps.BACKGROUND_COLOR, "thumbnailCornerRadius", "resolvingGradientStart", "resolvingGradientEnd", "<init>", "(Ljava/lang/String;IIIII)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getHeaderText", "()Ljava/lang/String;", "getHeaderColor", "()I", "getBackgroundColor", "getThumbnailCornerRadius", "getResolvingGradientStart", "getResolvingGradientEnd", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Resolving implements GiftEmbed {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int backgroundColor;
        private final int headerColor;

        @NotNull
        private final String headerText;
        private final int resolvingGradientEnd;
        private final int resolvingGradientStart;
        private final int thumbnailCornerRadius;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return GiftEmbed$Resolving$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Resolving(int i7, String str, int i10, int i11, int i12, int i13, int i14, SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i7 & 63)) {
                e1.l(i7, 63, GiftEmbed$Resolving$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.headerText = str;
            this.headerColor = i10;
            this.backgroundColor = i11;
            this.thumbnailCornerRadius = i12;
            this.resolvingGradientStart = i13;
            this.resolvingGradientEnd = i14;
        }

        public static /* synthetic */ Resolving copy$default(Resolving resolving, String str, int i7, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = resolving.headerText;
            }
            if ((i14 & 2) != 0) {
                i7 = resolving.headerColor;
            }
            if ((i14 & 4) != 0) {
                i10 = resolving.backgroundColor;
            }
            if ((i14 & 8) != 0) {
                i11 = resolving.thumbnailCornerRadius;
            }
            if ((i14 & 16) != 0) {
                i12 = resolving.resolvingGradientStart;
            }
            if ((i14 & 32) != 0) {
                i13 = resolving.resolvingGradientEnd;
            }
            int i15 = i12;
            int i16 = i13;
            return resolving.copy(str, i7, i10, i11, i15, i16);
        }

        public static final /* synthetic */ void write$Self$chat_release(Resolving self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.getHeaderText());
            output.l(1, self.getHeaderColor(), serialDesc);
            output.l(2, self.getBackgroundColor(), serialDesc);
            output.l(3, self.getThumbnailCornerRadius(), serialDesc);
            output.l(4, self.resolvingGradientStart, serialDesc);
            output.l(5, self.resolvingGradientEnd, serialDesc);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHeaderText() {
            return this.headerText;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeaderColor() {
            return this.headerColor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getThumbnailCornerRadius() {
            return this.thumbnailCornerRadius;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getResolvingGradientStart() {
            return this.resolvingGradientStart;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getResolvingGradientEnd() {
            return this.resolvingGradientEnd;
        }

        @NotNull
        public final Resolving copy(@NotNull String headerText, int headerColor, int backgroundColor, int thumbnailCornerRadius, int resolvingGradientStart, int resolvingGradientEnd) {
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            return new Resolving(headerText, headerColor, backgroundColor, thumbnailCornerRadius, resolvingGradientStart, resolvingGradientEnd);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resolving)) {
                return false;
            }
            Resolving resolving = (Resolving) other;
            return Intrinsics.areEqual(this.headerText, resolving.headerText) && this.headerColor == resolving.headerColor && this.backgroundColor == resolving.backgroundColor && this.thumbnailCornerRadius == resolving.thumbnailCornerRadius && this.resolvingGradientStart == resolving.resolvingGradientStart && this.resolvingGradientEnd == resolving.resolvingGradientEnd;
        }

        @Override // com.discord.chat.bridge.gift.GiftEmbed
        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.discord.chat.bridge.gift.GiftEmbed
        public int getHeaderColor() {
            return this.headerColor;
        }

        @Override // com.discord.chat.bridge.gift.GiftEmbed
        @NotNull
        public String getHeaderText() {
            return this.headerText;
        }

        public final int getResolvingGradientEnd() {
            return this.resolvingGradientEnd;
        }

        public final int getResolvingGradientStart() {
            return this.resolvingGradientStart;
        }

        @Override // com.discord.chat.bridge.gift.GiftEmbed
        public int getThumbnailCornerRadius() {
            return this.thumbnailCornerRadius;
        }

        public int hashCode() {
            return Integer.hashCode(this.resolvingGradientEnd) + a.u(this.resolvingGradientStart, a.u(this.thumbnailCornerRadius, a.u(this.backgroundColor, a.u(this.headerColor, this.headerText.hashCode() * 31, 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.headerText;
            int i7 = this.headerColor;
            int i10 = this.backgroundColor;
            int i11 = this.thumbnailCornerRadius;
            int i12 = this.resolvingGradientStart;
            int i13 = this.resolvingGradientEnd;
            StringBuilder sbT = e.t("Resolving(headerText=", str, ", headerColor=", i7, ", backgroundColor=");
            e.z(sbT, i10, ", thumbnailCornerRadius=", i11, ", resolvingGradientStart=");
            sbT.append(i12);
            sbT.append(", resolvingGradientEnd=");
            sbT.append(i13);
            sbT.append(")");
            return sbT.toString();
        }

        public Resolving(@NotNull String headerText, int i7, int i10, int i11, int i12, int i13) {
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            this.headerText = headerText;
            this.headerColor = i7;
            this.backgroundColor = i10;
            this.thumbnailCornerRadius = i11;
            this.resolvingGradientStart = i12;
            this.resolvingGradientEnd = i13;
        }
    }

    int getBackgroundColor();

    int getHeaderColor();

    @NotNull
    String getHeaderText();

    int getThumbnailCornerRadius();
}
