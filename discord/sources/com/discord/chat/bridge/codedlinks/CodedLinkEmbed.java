package com.discord.chat.bridge.codedlinks;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kr.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f(with = CodedLinkSerializer.class)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 C2\u00020\u0001:\u0001CB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0012\u0010\u0017\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0012\u0010\u001f\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0014\u0010!\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000fR\u0014\u0010#\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0007R\u0014\u0010%\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0007R\u0014\u0010'\u001a\u0004\u0018\u00010\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001cR\u0014\u0010)\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0007R\u0014\u0010+\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u000fR\u0014\u0010-\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u000fR\u0014\u0010/\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u000fR\u0014\u00101\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0007R\u0014\u00103\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0007R\u0014\u00105\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0007R\u0014\u00107\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u000fR\u0014\u00109\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u000fR\u0014\u0010;\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0007R\u0014\u0010=\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u000fR\u0014\u0010?\u001a\u0004\u0018\u00010@X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0001\u0007DEFGHIJ¨\u0006K"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "", "<init>", "()V", "acceptLabelBackgroundColor", "", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "acceptLabelBorderColor", "getAcceptLabelBorderColor", "acceptLabelColor", "getAcceptLabelColor", "acceptLabelText", "", "getAcceptLabelText", "()Ljava/lang/String;", ViewProps.BACKGROUND_COLOR, "getBackgroundColor", "()I", "bodyText", "getBodyText", "bodyTextColor", "getBodyTextColor", ViewProps.BORDER_COLOR, "getBorderColor", "canBeAccepted", "", "getCanBeAccepted", "()Ljava/lang/Boolean;", "embedCanBeTapped", "getEmbedCanBeTapped", "headerColor", "getHeaderColor", "headerText", "getHeaderText", "resolvingGradientEnd", "getResolvingGradientEnd", "resolvingGradientStart", "getResolvingGradientStart", "splashHasRadialGradient", "getSplashHasRadialGradient", "splashOpacity", "getSplashOpacity", "splashUrl", "getSplashUrl", "inviteSplash", "getInviteSplash", "subtitle", "getSubtitle", "subtitleColor", "getSubtitleColor", "thumbnailBackgroundColor", "getThumbnailBackgroundColor", "thumbnailCornerRadius", "getThumbnailCornerRadius", "thumbnailText", "getThumbnailText", "thumbnailUrl", "getThumbnailUrl", "titleColor", "getTitleColor", "titleText", "getTitleText", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "Companion", "Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/GuildProfileInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/VoiceChannelListInviteEmbedImpl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CodedLinkEmbed {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CodedLinkSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CodedLinkEmbed(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Integer getAcceptLabelBackgroundColor();

    public abstract Integer getAcceptLabelBorderColor();

    public abstract Integer getAcceptLabelColor();

    public abstract String getAcceptLabelText();

    public abstract int getBackgroundColor();

    public abstract String getBodyText();

    public abstract Integer getBodyTextColor();

    public abstract int getBorderColor();

    public abstract Boolean getCanBeAccepted();

    public abstract Boolean getEmbedCanBeTapped();

    public abstract int getHeaderColor();

    public abstract String getHeaderText();

    public abstract String getInviteSplash();

    public abstract Integer getResolvingGradientEnd();

    public abstract Integer getResolvingGradientStart();

    public abstract Boolean getSplashHasRadialGradient();

    public abstract Integer getSplashOpacity();

    public abstract String getSplashUrl();

    public abstract String getSubtitle();

    public abstract Integer getSubtitleColor();

    public abstract Integer getThumbnailBackgroundColor();

    public abstract Integer getThumbnailCornerRadius();

    public abstract String getThumbnailText();

    public abstract String getThumbnailUrl();

    public abstract Integer getTitleColor();

    public abstract String getTitleText();

    public abstract InviteType getType();

    private CodedLinkEmbed() {
    }
}
