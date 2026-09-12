package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.presentation.message.t;
import com.discord.chat.presentation.message.view.PostPreviewEmbedView;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2$\u0010\n\u001a \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/PostPreviewEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "postPreviewEmbedView", "Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;", "<init>", "(Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;)V", "bind", "", "postPreviewEmbed", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "onTapPostPreviewEmbed", "Lkotlin/Function4;", "Lcom/discord/primitives/GuildId;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/MessageId;", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PostPreviewEmbedViewHolder extends MessagePartViewHolder {

    @NotNull
    private final PostPreviewEmbedView postPreviewEmbedView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedViewHolder(@NotNull PostPreviewEmbedView postPreviewEmbedView) {
        super(postPreviewEmbedView, null);
        Intrinsics.checkNotNullParameter(postPreviewEmbedView, "postPreviewEmbedView");
        this.postPreviewEmbedView = postPreviewEmbedView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(Function4 function4, PostPreviewEmbed postPreviewEmbed, View view) {
        function4.invoke(GuildId.m1143boximpl(postPreviewEmbed.m432getGuildIdfYKD8eg()), ChannelId.m1130boximpl(postPreviewEmbed.m434getParentChannelIdo4g7jtM()), ChannelId.m1130boximpl(postPreviewEmbed.m435getThreadIdo4g7jtM()), MessageId.m1156boximpl(postPreviewEmbed.m433getMessageId3Eiw7ao()));
    }

    public final void bind(@NotNull PostPreviewEmbed postPreviewEmbed, @NotNull Function4 onTapPostPreviewEmbed, SpoilerConfig spoilerConfig) {
        Intrinsics.checkNotNullParameter(postPreviewEmbed, "postPreviewEmbed");
        Intrinsics.checkNotNullParameter(onTapPostPreviewEmbed, "onTapPostPreviewEmbed");
        PostPreviewEmbedView postPreviewEmbedView = this.postPreviewEmbedView;
        String title = postPreviewEmbed.getTitle();
        String subtitle = postPreviewEmbed.getSubtitle();
        String ctaText = postPreviewEmbed.getCtaText();
        int ctaButtonColor = postPreviewEmbed.getCtaButtonColor();
        String coverImage = postPreviewEmbed.getCoverImage();
        String blurredCoverImage = postPreviewEmbed.getBlurredCoverImage();
        String strM433getMessageId3Eiw7ao = postPreviewEmbed.m433getMessageId3Eiw7ao();
        StructurableText footer = postPreviewEmbed.getFooter();
        String coverImageOverlayText = postPreviewEmbed.getCoverImageOverlayText();
        String backgroundImage = postPreviewEmbed.getBackgroundImage();
        t tVar = new t(11, onTapPostPreviewEmbed, postPreviewEmbed);
        boolean shouldSpoiler = postPreviewEmbed.getShouldSpoiler();
        Boolean obscureAwaitingScan = postPreviewEmbed.getObscureAwaitingScan();
        boolean zBooleanValue = obscureAwaitingScan != null ? obscureAwaitingScan.booleanValue() : false;
        Boolean obscureHideControls = postPreviewEmbed.getObscureHideControls();
        boolean zBooleanValue2 = obscureHideControls != null ? obscureHideControls.booleanValue() : false;
        Boolean obscureIsOpaque = postPreviewEmbed.getObscureIsOpaque();
        postPreviewEmbedView.m752setPostPreviewEmbed4itWklQ(title, subtitle, ctaText, ctaButtonColor, footer, strM433getMessageId3Eiw7ao, coverImage, blurredCoverImage, coverImageOverlayText, backgroundImage, tVar, shouldSpoiler, zBooleanValue, zBooleanValue2, obscureIsOpaque != null ? obscureIsOpaque.booleanValue() : false, spoilerConfig);
    }
}
