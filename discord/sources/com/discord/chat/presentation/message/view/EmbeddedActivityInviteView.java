package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.EmbeddedActivityInviteViewBinding;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.discord.overlapping_circles.OverlappingItem;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
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
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J©\u0003\u00107\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f0\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f0\u001e2\"\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\f0 2*\u0010#\u001a&\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\f0\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u001e2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u001b2:\u0010'\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\f0&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f0\u001e2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f0\u001e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0+2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u001e2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\f0\u001e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\f0\u001e2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u001e2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\f0\u001e¢\u0006\u0004\b5\u00106J\u001b\u0010:\u001a\u00020\f2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u001108¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u00020\u0011¢\u0006\u0004\b=\u0010\u0014J'\u0010@\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010>\u001a\u0004\u0018\u00010\u00112\u0006\u0010?\u001a\u00020\u0006¢\u0006\u0004\b@\u0010AJ)\u0010F\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010\u00112\b\u0010C\u001a\u0004\u0018\u00010\u00062\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0015\u0010J\u001a\u00020\f2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lcom/discord/chat/presentation/message/view/EmbeddedActivityInviteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "titleText", "", "setTitleText", "(Ljava/lang/CharSequence;)V", "headerText", "setHeaderText", "", "channelIconUrl", "setSubtitleIcon", "(Ljava/lang/String;)V", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "margins", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "subtitleText", "Lcom/discord/primitives/MessageId;", "messageId", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onTapLink", "Lkotlin/Function1;", "onLongTapLink", "Lkotlin/Function3;", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapAttachmentLink", "onLongPressAttachmentLink", "Lkotlin/Function6;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lkotlin/Function0;", "onTapSpoiler", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapInlineCode", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "onTapSeeMore", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapSoundmoji", "setSubtitleText-2dg2Uz0", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "setSubtitleText", "", "avatarUris", "setAvatarUris", "(Ljava/util/List;)V", "noParticipantsText", "setNoParticipantsText", "splashUrl", "constrainedWidth", "setSplash", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Ljava/lang/String;I)V", "text", ViewProps.BACKGROUND_COLOR, "", ViewProps.ENABLED, "setLaunchButton", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "Landroid/view/View$OnClickListener;", "onLaunchButtonClickListener", "setOnLaunchButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/discord/chat/databinding/EmbeddedActivityInviteViewBinding;", "binding", "Lcom/discord/chat/databinding/EmbeddedActivityInviteViewBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmbeddedActivityInviteView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddedActivityInviteView.kt\ncom/discord/chat/presentation/message/view/EmbeddedActivityInviteView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,215:1\n257#2,2:216\n257#2,2:218\n257#2,2:220\n257#2,2:222\n257#2,2:224\n257#2,2:230\n257#2,2:232\n257#2,2:234\n1563#3:226\n1634#3,3:227\n*S KotlinDebug\n*F\n+ 1 EmbeddedActivityInviteView.kt\ncom/discord/chat/presentation/message/view/EmbeddedActivityInviteView\n*L\n87#1:216,2\n93#1:218,2\n98#1:220,2\n125#1:222,2\n160#1:224,2\n165#1:230,2\n177#1:232,2\n199#1:234,2\n162#1:226\n162#1:227,3\n*E\n"})
public final class EmbeddedActivityInviteView extends ConstraintLayout {

    @NotNull
    private final EmbeddedActivityInviteViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedActivityInviteView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSubtitleText_2dg2Uz0$lambda$8$lambda$7(Function2 function2, String str, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        function2.invoke(MessageId.m1156boximpl(str), node);
        return Unit.f14616a;
    }

    public final void setAvatarUris(@NotNull List<String> avatarUris) {
        Intrinsics.checkNotNullParameter(avatarUris, "avatarUris");
        boolean zIsEmpty = avatarUris.isEmpty();
        OverlappingCirclesView participants = this.binding.participants;
        Intrinsics.checkNotNullExpressionValue(participants, "participants");
        participants.setVisibility(!zIsEmpty ? 0 : 8);
        OverlappingCirclesView overlappingCirclesView = this.binding.participants;
        ArrayList arrayList = new ArrayList(e0.l(avatarUris, 10));
        Iterator<T> it = avatarUris.iterator();
        while (it.hasNext()) {
            arrayList.add(new OverlappingItem((String) it.next()));
        }
        overlappingCirclesView.setItems(arrayList);
        TextView noParticipantsText = this.binding.noParticipantsText;
        Intrinsics.checkNotNullExpressionValue(noParticipantsText, "noParticipantsText");
        noParticipantsText.setVisibility(zIsEmpty ? 0 : 8);
    }

    public final void setHeaderText(CharSequence headerText) {
        boolean z5 = headerText == null || headerText.length() == 0;
        TextView itemHeader = this.binding.itemHeader;
        Intrinsics.checkNotNullExpressionValue(itemHeader, "itemHeader");
        itemHeader.setVisibility(z5 ? 8 : 0);
        this.binding.itemHeader.setText(headerText);
    }

    public final void setLaunchButton(String text, Integer backgroundColor, boolean enabled) {
        DCDButton dCDButton = this.binding.launchButton;
        Intrinsics.checkNotNull(dCDButton);
        dCDButton.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        dCDButton.setText(text);
        dCDButton.setBackgroundColor(backgroundColor);
        dCDButton.setEnabled(enabled);
        dCDButton.setAlpha(enabled ? 1.0f : 0.5f);
    }

    public final void setNoParticipantsText(@NotNull String noParticipantsText) {
        Intrinsics.checkNotNullParameter(noParticipantsText, "noParticipantsText");
        this.binding.noParticipantsText.setText(noParticipantsText);
    }

    public final void setOnLaunchButtonClickListener(@NotNull View.OnClickListener onLaunchButtonClickListener) {
        Intrinsics.checkNotNullParameter(onLaunchButtonClickListener, "onLaunchButtonClickListener");
        this.binding.launchButton.setOnClickButtonListener(onLaunchButtonClickListener);
    }

    public final void setSplash(@NotNull MessageMargins margins, String splashUrl, int constrainedWidth) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        SimpleDraweeView itemHero = this.binding.itemHero;
        Intrinsics.checkNotNullExpressionValue(itemHero, "itemHero");
        itemHero.setVisibility(splashUrl != null ? 0 : 8);
        this.binding.itemHero.setImageURI(splashUrl);
        int width = MessageMargins.INSTANCE.getWidth(margins, constrainedWidth, false);
        int i7 = (width * 9) / 16;
        MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
        SimpleDraweeView itemHero2 = this.binding.itemHero;
        Intrinsics.checkNotNullExpressionValue(itemHero2, "itemHero");
        mediaContainingViewResizer.resizeLayoutParams(itemHero2, width, i7, width, i7, MediaContainingViewResizer.ResizeMode.Fill);
    }

    public final void setSubtitleIcon(String channelIconUrl) {
        SimpleDraweeView subtitleIcon = this.binding.subtitleIcon;
        Intrinsics.checkNotNullExpressionValue(subtitleIcon, "subtitleIcon");
        subtitleIcon.setVisibility(channelIconUrl != null ? 0 : 8);
        if (channelIconUrl != null) {
            SimpleDraweeView subtitleIcon2 = this.binding.subtitleIcon;
            Intrinsics.checkNotNullExpressionValue(subtitleIcon2, "subtitleIcon");
            ReactAssetUtilsKt.setReactImageUrl(subtitleIcon2, channelIconUrl);
        }
    }

    /* JADX INFO: renamed from: setSubtitleText-2dg2Uz0, reason: not valid java name */
    public final void m738setSubtitleText2dg2Uz0(@NotNull MessageMargins margins, StructurableText subtitleText, @NotNull String messageId, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onTapLink, @NotNull Function1<? super LinkContentNode, Unit> onLongTapLink, @NotNull Function3 onTapChannel, @NotNull Function4 onLongPressChannel, @NotNull Function1<? super String, Unit> onTapAttachmentLink, @NotNull Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super String, Unit> onTapTimestamp, @NotNull Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function1<? super MessageId, Unit> onTapSeeMore, @NotNull Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji) {
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
        MessageContentView itemSubtitle = this.binding.itemSubtitle;
        Intrinsics.checkNotNullExpressionValue(itemSubtitle, "itemSubtitle");
        itemSubtitle.setVisibility(subtitleText != null ? 0 : 8);
        if (subtitleText != null) {
            MessageContentView.m747setMessageContenthYrISQc$default(this.binding.itemSubtitle, margins, subtitleText, messageId, false, false, false, false, new a(onTapLink, messageId, 3), onLongTapLink, onTapChannel, onLongPressChannel, onTapAttachmentLink, onLongPressAttachmentLink, onTapMention, onTapCommand, onLongPressCommand, null, onTapSpoiler, onTapTimestamp, onTapInlineCode, onTapEmoji, onTapSeeMore, onTapSoundmoji, null, 0, 0, false, null, null, null, null, null, null, false, -125763584, 3, null);
        }
    }

    public final void setTitleText(CharSequence titleText) {
        boolean z5 = titleText == null || titleText.length() == 0;
        TextView itemTitle = this.binding.itemTitle;
        Intrinsics.checkNotNullExpressionValue(itemTitle, "itemTitle");
        itemTitle.setVisibility(z5 ? 8 : 0);
        this.binding.itemTitle.setText(titleText);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedActivityInviteView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EmbeddedActivityInviteView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedActivityInviteView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        EmbeddedActivityInviteViewBinding embeddedActivityInviteViewBindingInflate = EmbeddedActivityInviteViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(embeddedActivityInviteViewBindingInflate, "inflate(...)");
        this.binding = embeddedActivityInviteViewBindingInflate;
        TextView textView = embeddedActivityInviteViewBindingInflate.itemTitle;
        textView.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryExtraBold);
        TextView textView2 = embeddedActivityInviteViewBindingInflate.itemHeader;
        textView2.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        Intrinsics.checkNotNull(textView2);
        SetTextSizeSpKt.setTextSizeSp(textView2, 24.0f);
        DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimarySemibold);
        MessageContentView messageContentView = embeddedActivityInviteViewBindingInflate.itemSubtitle;
        Intrinsics.checkNotNull(messageContentView);
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(messageContentView, discordFont);
        messageContentView.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        SetTextSizeSpKt.setTextSizeSp(messageContentView, 12.0f);
        SimpleDraweeView simpleDraweeView = embeddedActivityInviteViewBindingInflate.subtitleIcon;
        Intrinsics.checkNotNull(simpleDraweeView);
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()));
        TextView textView3 = embeddedActivityInviteViewBindingInflate.noParticipantsText;
        Intrinsics.checkNotNull(textView3);
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        textView3.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        SetTextSizeSpKt.setTextSizeSp(textView3, 12.0f);
        embeddedActivityInviteViewBindingInflate.launchButton.setTextColor(-1);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ColorUtilsKt.getColorCompat(context, GetEmbedBackgroundColorKt.getEmbedBackgroundColor()), SizeUtilsKt.getDpToPx(8), null, 0, 12, null);
    }
}
