package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.GuildEventInviteViewBinding;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017JÉ\u0003\u0010?\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e0#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e0&2\"\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000e0(2*\u0010+\u001a&\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000e0*2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0&2\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0#2:\u0010/\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000e0.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000e0&2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000e0&2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0&2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000e0&2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000e0&2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0&2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000e0&¢\u0006\u0004\b=\u0010>J!\u0010A\u001a\u00020\u000e2\b\u0010@\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bA\u0010\u0015J!\u0010B\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bB\u0010\u0015JI\u0010G\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010C\u001a\u0004\u0018\u00010\u00062\b\u0010D\u001a\u0004\u0018\u00010\u00062\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HJ!\u0010I\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lcom/discord/chat/presentation/message/view/GuildEventInviteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "iconUrl", "text", ViewProps.COLOR, "", "setHeader", "(Ljava/lang/String;Ljava/lang/String;I)V", "setCreatorAvatar", "(Ljava/lang/String;)V", "count", "setBadge", "(Ljava/lang/String;Ljava/lang/String;)V", "setTitle", "(Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "margins", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "description", "Lcom/discord/primitives/MessageId;", "messageId", "", "shouldAnimateEmoji", "shouldShowLinkDecorations", "shouldShowRoleDot", "shouldShowRoleOnName", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onTapLink", "Lkotlin/Function1;", "onLongTapLink", "Lkotlin/Function3;", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapAttachmentLink", "onLongPressAttachmentLink", "Lkotlin/Function6;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lkotlin/Function0;", "onTapSpoiler", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapInlineCode", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "onTapSeeMore", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapSoundmoji", "setDescription-63A0Z80", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;ZZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "setDescription", StackTraceHelper.NAME_KEY, "setGuild", "setChannel", ViewProps.BORDER_COLOR, ViewProps.BACKGROUND_COLOR, "Landroid/view/View$OnClickListener;", "listener", "setAcceptButton", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/view/View$OnClickListener;)V", "setSecondaryButton", "(Ljava/lang/String;Landroid/view/View$OnClickListener;)V", "Lcom/discord/chat/databinding/GuildEventInviteViewBinding;", "binding", "Lcom/discord/chat/databinding/GuildEventInviteViewBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuildEventInviteView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuildEventInviteView.kt\ncom/discord/chat/presentation/message/view/GuildEventInviteView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n176#2,2:224\n257#2,2:227\n257#2,2:229\n1#3:226\n*S KotlinDebug\n*F\n+ 1 GuildEventInviteView.kt\ncom/discord/chat/presentation/message/view/GuildEventInviteView\n*L\n92#1:224,2\n174#1:227,2\n181#1:229,2\n*E\n"})
public final class GuildEventInviteView extends ConstraintLayout {

    @NotNull
    private final GuildEventInviteViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildEventInviteView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDescription_63A0Z80$lambda$12$lambda$11(Function2 function2, String str, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        function2.invoke(MessageId.m1156boximpl(str), node);
        return Unit.f14616a;
    }

    public final void setAcceptButton(String iconUrl, String text, Integer color, Integer borderColor, Integer backgroundColor, View.OnClickListener listener) {
        DCDButton dCDButton = this.binding.acceptButton;
        if (iconUrl != null) {
            dCDButton.setIcon(iconUrl, SizeUtilsKt.getDpToPx(24));
        }
        dCDButton.setText(text);
        dCDButton.setTextColor(color);
        dCDButton.setBackgroundColor(backgroundColor);
        dCDButton.setBorderColor(borderColor);
        dCDButton.setOnClickButtonListener(listener);
    }

    public final void setBadge(String iconUrl, String count) {
        GuildEventInviteViewBinding guildEventInviteViewBinding = this.binding;
        SimpleDraweeView badgeIcon = guildEventInviteViewBinding.badgeIcon;
        Intrinsics.checkNotNullExpressionValue(badgeIcon, "badgeIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(badgeIcon, iconUrl);
        guildEventInviteViewBinding.badgeText.setText(count);
    }

    public final void setChannel(String iconUrl, String text) {
        GuildEventInviteViewBinding guildEventInviteViewBinding = this.binding;
        SimpleDraweeView channelIcon = guildEventInviteViewBinding.channelIcon;
        Intrinsics.checkNotNullExpressionValue(channelIcon, "channelIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(channelIcon, iconUrl);
        TextView channelName = guildEventInviteViewBinding.channelName;
        Intrinsics.checkNotNullExpressionValue(channelName, "channelName");
        ViewUtilsKt.setOptionalText(channelName, text);
        guildEventInviteViewBinding.channelIcon.setColorFilter(new PorterDuffColorFilter(ThemeManagerKt.getTheme().getTextSubtle(), PorterDuff.Mode.SRC_ATOP));
    }

    public final void setCreatorAvatar(String iconUrl) {
        SimpleDraweeView creatorAvatar = this.binding.creatorAvatar;
        Intrinsics.checkNotNullExpressionValue(creatorAvatar, "creatorAvatar");
        ReactAssetUtilsKt.setOptionalReactImageUrl(creatorAvatar, iconUrl);
    }

    /* JADX INFO: renamed from: setDescription-63A0Z80, reason: not valid java name */
    public final void m744setDescription63A0Z80(@NotNull MessageMargins margins, StructurableText description, @NotNull String messageId, boolean shouldAnimateEmoji, boolean shouldShowLinkDecorations, boolean shouldShowRoleDot, boolean shouldShowRoleOnName, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onTapLink, @NotNull Function1<? super LinkContentNode, Unit> onLongTapLink, @NotNull Function3 onTapChannel, @NotNull Function4 onLongPressChannel, @NotNull Function1<? super String, Unit> onTapAttachmentLink, @NotNull Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super String, Unit> onTapTimestamp, @NotNull Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function1<? super MessageId, Unit> onTapSeeMore, @NotNull Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(onTapLink, "onTapLink");
        Intrinsics.checkNotNullParameter(onLongTapLink, "onLongTapLink");
        Intrinsics.checkNotNullParameter(onTapChannel, "onTapChannel");
        Intrinsics.checkNotNullParameter(onLongPressChannel, "onLongPressChannel");
        Intrinsics.checkNotNullParameter(onTapAttachmentLink, "onTapAttachmentLink");
        Intrinsics.checkNotNullParameter(onLongPressAttachmentLink, "onLongPressAttachmentLink");
        Intrinsics.checkNotNullParameter(onTapMention, "onTapMention");
        Intrinsics.checkNotNullParameter(onTapCommand, "onTapCommand");
        Intrinsics.checkNotNullParameter(onLongPressCommand, "onLongPressCommand");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapTimestamp, "onTapTimestamp");
        Intrinsics.checkNotNullParameter(onTapInlineCode, "onTapInlineCode");
        Intrinsics.checkNotNullParameter(onTapEmoji, "onTapEmoji");
        Intrinsics.checkNotNullParameter(onTapSeeMore, "onTapSeeMore");
        Intrinsics.checkNotNullParameter(onTapSoundmoji, "onTapSoundmoji");
        if (description != null) {
            MessageContentView.m747setMessageContenthYrISQc$default(this.binding.descriptionText, margins, description, messageId, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, new a(onTapLink, messageId, 6), onLongTapLink, onTapChannel, onLongPressChannel, onTapAttachmentLink, onLongPressAttachmentLink, onTapMention, onTapCommand, onLongPressCommand, null, onTapSpoiler, onTapTimestamp, onTapInlineCode, onTapEmoji, onTapSeeMore, onTapSoundmoji, null, getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing), 0, false, null, null, null, null, null, null, false, -125763584, 3, null);
        }
        MessageContentView descriptionText = this.binding.descriptionText;
        Intrinsics.checkNotNullExpressionValue(descriptionText, "descriptionText");
        descriptionText.setVisibility(description != null ? 0 : 8);
    }

    public final void setGuild(String name, String iconUrl) {
        GuildEventInviteViewBinding guildEventInviteViewBinding = this.binding;
        TextView guildName = guildEventInviteViewBinding.guildName;
        Intrinsics.checkNotNullExpressionValue(guildName, "guildName");
        ViewUtilsKt.setOptionalText(guildName, name);
        SimpleDraweeView guildIcon = guildEventInviteViewBinding.guildIcon;
        Intrinsics.checkNotNullExpressionValue(guildIcon, "guildIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(guildIcon, iconUrl);
        SimpleDraweeView guildIcon2 = guildEventInviteViewBinding.guildIcon;
        Intrinsics.checkNotNullExpressionValue(guildIcon2, "guildIcon");
        guildIcon2.setVisibility(iconUrl != null ? 0 : 8);
    }

    public final void setHeader(String iconUrl, @NotNull String text, int color) {
        Intrinsics.checkNotNullParameter(text, "text");
        GuildEventInviteViewBinding guildEventInviteViewBinding = this.binding;
        SimpleDraweeView headerIcon = guildEventInviteViewBinding.headerIcon;
        Intrinsics.checkNotNullExpressionValue(headerIcon, "headerIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(headerIcon, iconUrl);
        guildEventInviteViewBinding.headerText.setText(text);
        guildEventInviteViewBinding.headerIcon.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP));
    }

    public final void setSecondaryButton(String iconUrl, View.OnClickListener listener) {
        SimpleDraweeView simpleDraweeView = this.binding.secondaryButton;
        Intrinsics.checkNotNull(simpleDraweeView);
        ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView, iconUrl);
        Context context = simpleDraweeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        simpleDraweeView.setColorFilter(new PorterDuffColorFilter(ColorUtilsKt.getColorCompat(context, com.discord.theme.R.color.white_500), PorterDuff.Mode.SRC_ATOP));
        simpleDraweeView.setOnClickListener(listener);
    }

    public final Unit setTitle(String text, Integer color) {
        TextView titleText = this.binding.titleText;
        Intrinsics.checkNotNullExpressionValue(titleText, "titleText");
        ViewUtilsKt.setOptionalText(titleText, text);
        if (color == null) {
            return null;
        }
        this.binding.titleText.setTextColor(color.intValue());
        return Unit.f14616a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildEventInviteView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GuildEventInviteView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildEventInviteView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        GuildEventInviteViewBinding guildEventInviteViewBindingInflate = GuildEventInviteViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(guildEventInviteViewBindingInflate, "inflate(...)");
        this.binding = guildEventInviteViewBindingInflate;
        TextView textView = guildEventInviteViewBindingInflate.headerText;
        textView.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        Intrinsics.checkNotNull(textView);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        ConstraintLayout badgeContainer = guildEventInviteViewBindingInflate.badgeContainer;
        Intrinsics.checkNotNullExpressionValue(badgeContainer, "badgeContainer");
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(badgeContainer, ThemeManagerKt.getTheme().getBackgroundBaseLowest(), SizeUtilsKt.getDpToPx(1000), null, 0, 12, null);
        guildEventInviteViewBindingInflate.badgeText.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        TextView textView2 = guildEventInviteViewBindingInflate.titleText;
        Intrinsics.checkNotNull(textView2);
        DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimaryExtraBold);
        textView2.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        SetTextSizeSpKt.setTextSizeSp(textView2, 18.0f);
        MessageContentView messageContentView = guildEventInviteViewBindingInflate.descriptionText;
        Intrinsics.checkNotNull(messageContentView);
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(messageContentView, discordFont2);
        messageContentView.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        SetTextSizeSpKt.setTextSizeSp(messageContentView, 14.0f);
        TextView textView3 = guildEventInviteViewBindingInflate.guildName;
        Intrinsics.checkNotNull(textView3);
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        textView3.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        SetTextSizeSpKt.setTextSizeSp(textView3, 14.0f);
        TextView textView4 = guildEventInviteViewBindingInflate.channelName;
        Intrinsics.checkNotNull(textView4);
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont2);
        textView4.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        SetTextSizeSpKt.setTextSizeSp(textView4, 12.0f);
        DCDButton dCDButton = guildEventInviteViewBindingInflate.acceptButton;
        dCDButton.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary()));
        dCDButton.setMaxLines(1);
        dCDButton.ellipsize(TextUtils.TruncateAt.END);
        SimpleDraweeView secondaryButton = guildEventInviteViewBindingInflate.secondaryButton;
        Intrinsics.checkNotNullExpressionValue(secondaryButton, "secondaryButton");
        ViewBackgroundUtilsKt.setBackgroundRectangle(secondaryButton, ThemeManagerKt.getTheme().getMobileLegacyButtonSecondaryBackgroundDefault(), SizeUtilsKt.getDpToPx(4), Integer.valueOf(ThemeManagerKt.getTheme().getMobileLegacyButtonSecondaryBackgroundDefault()), SizeUtilsKt.getDpToPx(1));
        SimpleDraweeView guildIcon = guildEventInviteViewBindingInflate.guildIcon;
        Intrinsics.checkNotNullExpressionValue(guildIcon, "guildIcon");
        ViewClippingUtilsKt.clipToRoundedRectangle(guildIcon, SizeUtilsKt.getDpToPx(8));
        ViewBackgroundUtilsKt.setBackgroundRectangle(this, ThemeManagerKt.getTheme().getBackgroundSurfaceHigh(), SizeUtilsKt.getDpToPx(4), Integer.valueOf(ThemeManagerKt.getTheme().getBorderSubtle()), SizeUtilsKt.getDpToPx(1));
        int dpToPx = SizeUtilsKt.getDpToPx(12);
        setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
    }
}
