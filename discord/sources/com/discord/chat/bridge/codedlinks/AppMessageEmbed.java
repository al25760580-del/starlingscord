package com.discord.chat.bridge.codedlinks;

import com.facebook.react.modules.dialog.AlertFragment;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR&\u0010\u0014\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0012\u0010 \u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u001a\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/AppMessageEmbed;", "", "displayType", "Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedDisplayType;", "getDisplayType", "()Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedDisplayType;", "appId", "", "getAppId", "()Ljava/lang/String;", "messageId", "getMessageId", AlertFragment.ARG_TITLE, "getTitle", "header", "getHeader", "info", "getInfo", "tagline", "getTagline", "gradientColors", "", "", "", "getGradientColors", "()Ljava/util/List;", "staticBannerSrc", "getStaticBannerSrc", "iconSrc", "getIconSrc", "embedUrl", "getEmbedUrl", "bannerRatio", "getBannerRatio", "actions", "Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedAction;", "getActions", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AppMessageEmbed {
    List<AppMessageEmbedAction> getActions();

    @NotNull
    String getAppId();

    @NotNull
    String getBannerRatio();

    @NotNull
    AppMessageEmbedDisplayType getDisplayType();

    String getEmbedUrl();

    List<Map<String, Integer>> getGradientColors();

    String getHeader();

    String getIconSrc();

    String getInfo();

    @NotNull
    String getMessageId();

    String getStaticBannerSrc();

    String getTagline();

    String getTitle();
}
