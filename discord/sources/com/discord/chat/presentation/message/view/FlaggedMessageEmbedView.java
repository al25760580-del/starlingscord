package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.FlaggedMessageEmbedViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.RoleIconView;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.textutils.LinkStyle;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetImageUriWithCachePolicyKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.react.FontManager;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J*\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\r\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0002\u0010\u001eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/FlaggedMessageEmbedViewBinding;", "allowChildGestures", "", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "setMessage", "", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "message", "Lcom/discord/chat/bridge/Message;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "configureMessageContent", "configureAuthor", "configureCommunicationDisabled", "isCommunicationDisabled", "spacingPxOverride", "", "()Ljava/lang/Integer;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlaggedMessageEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlaggedMessageEmbedView.kt\ncom/discord/chat/presentation/message/view/FlaggedMessageEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,218:1\n176#2,2:219\n257#2,2:221\n257#2,2:223\n257#2,2:225\n257#2,2:227\n257#2,2:229\n*S KotlinDebug\n*F\n+ 1 FlaggedMessageEmbedView.kt\ncom/discord/chat/presentation/message/view/FlaggedMessageEmbedView\n*L\n54#1:219,2\n101#1:221,2\n142#1:223,2\n179#1:225,2\n186#1:227,2\n203#1:229,2\n*E\n"})
public final class FlaggedMessageEmbedView extends ConstraintLayout implements VerticalSpacingItemDecoration.SpacingProviderView {
    private boolean allowChildGestures;

    @NotNull
    private final FlaggedMessageEmbedViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlaggedMessageEmbedView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void configureAuthor(Message message, ChatEventHandler eventHandler) {
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        Intrinsics.checkNotNull(simpleDraweeView);
        Context context = simpleDraweeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(simpleDraweeView, MessageKt.avatarUrl(message, context));
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, new com.discord.chat.presentation.message.n(3, message, eventHandler), 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(simpleDraweeView, false, new com.discord.chat.presentation.message.o(3, message, eventHandler), 1, null);
        TextView textView = this.binding.authorName;
        textView.setTextColor(MessageKt.usernameColor$default(message, 0, 1, null));
        textView.setText(message.getUsername());
        Intrinsics.checkNotNull(textView);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(textView, false, new com.discord.chat.presentation.message.n(4, message, eventHandler), 1, null);
        RoleIconView roleIconView = this.binding.roleIcon;
        Intrinsics.checkNotNull(roleIconView);
        roleIconView.setVisibility(message.getRoleIcon() != null ? 0 : 8);
        if (message.getRoleIcon() != null) {
            roleIconView.configureRoleIcon(message.getRoleIcon(), eventHandler);
        }
        ConnectionsRoleTagView connectionsRoleTagView = this.binding.connectionsRoleTag;
        Intrinsics.checkNotNull(connectionsRoleTagView);
        connectionsRoleTagView.setVisibility(message.getConnectionsRoleTag() == null ? 8 : 0);
        if (message.getConnectionsRoleTag() != null) {
            connectionsRoleTagView.m537configureConnectionsRoleTaguESh2Cg(message.m263getAuthorIdwUX8bhU(), message.m266getGuildIdqOKuAAo(), ChannelId.m1130boximpl(message.m264getChannelIdo4g7jtM()), message.getConnectionsRoleTag(), eventHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureAuthor$lambda$22$lambda$20(Message message, ChatEventHandler chatEventHandler, View view) {
        if (message.m263getAuthorIdwUX8bhU() != null) {
            chatEventHandler.mo479onTapAvatarx5gers8(message.m267getId3Eiw7ao(), message.m263getAuthorIdwUX8bhU().m1217unboximpl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean configureAuthor$lambda$22$lambda$21(Message message, ChatEventHandler chatEventHandler, View view) {
        if (message.m263getAuthorIdwUX8bhU() == null) {
            return true;
        }
        chatEventHandler.mo470onLongPressAvatarx5gers8(message.m267getId3Eiw7ao(), message.m263getAuthorIdwUX8bhU().m1217unboximpl());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureAuthor$lambda$24$lambda$23(Message message, ChatEventHandler chatEventHandler, View view) {
        if (message.m263getAuthorIdwUX8bhU() != null) {
            chatEventHandler.mo473onLongPressUsernamex5gers8(message.m267getId3Eiw7ao(), message.m263getAuthorIdwUX8bhU().m1217unboximpl());
        }
    }

    private final void configureCommunicationDisabled(boolean isCommunicationDisabled, ChatEventHandler eventHandler) {
        SimpleDraweeView guildCommunicationDisabledIcon = this.binding.guildCommunicationDisabledIcon;
        Intrinsics.checkNotNullExpressionValue(guildCommunicationDisabledIcon, "guildCommunicationDisabledIcon");
        guildCommunicationDisabledIcon.setVisibility(isCommunicationDisabled ? 0 : 8);
        if (isCommunicationDisabled) {
            SimpleDraweeView guildCommunicationDisabledIcon2 = this.binding.guildCommunicationDisabledIcon;
            Intrinsics.checkNotNullExpressionValue(guildCommunicationDisabledIcon2, "guildCommunicationDisabledIcon");
            ReactAssetUtilsKt.setReactAsset(guildCommunicationDisabledIcon2, ReactAsset.ClockWarningIcon);
            SimpleDraweeView guildCommunicationDisabledIcon3 = this.binding.guildCommunicationDisabledIcon;
            Intrinsics.checkNotNullExpressionValue(guildCommunicationDisabledIcon3, "guildCommunicationDisabledIcon");
            ColorUtilsKt.setTintColor(guildCommunicationDisabledIcon3, Integer.valueOf(ThemeManagerKt.getTheme().getIconFeedbackCritical()));
            SimpleDraweeView guildCommunicationDisabledIcon4 = this.binding.guildCommunicationDisabledIcon;
            Intrinsics.checkNotNullExpressionValue(guildCommunicationDisabledIcon4, "guildCommunicationDisabledIcon");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(guildCommunicationDisabledIcon4, false, new com.discord.chat.presentation.message.m(eventHandler, 3), 1, null);
        }
        this.binding.authorAvatar.setAlpha(isCommunicationDisabled ? 0.5f : 1.0f);
        this.binding.roleIcon.setAlpha(isCommunicationDisabled ? 0.5f : 1.0f);
        this.binding.connectionsRoleTag.setAlpha(isCommunicationDisabled ? 0.5f : 1.0f);
    }

    private final void configureMessageContent(MessageMargins margins, Message message) {
        boolean z5;
        MessageContentView messageContentView = this.binding.contentView;
        Integer constrainedWidth = message.getConstrainedWidth();
        int iIntValue = constrainedWidth != null ? constrainedWidth.intValue() : messageContentView.getResources().getDisplayMetrics().widthPixels;
        Intrinsics.checkNotNull(messageContentView);
        StructurableText content = message.getContent();
        messageContentView.setVisibility(content != null && content.getHasContent() ? 0 : 8);
        StructurableText content2 = message.getContent();
        if (content2 == null || !content2.getHasContent()) {
            z5 = true;
        } else {
            int i7 = 1;
            z5 = true;
            MessageContentView.m747setMessageContenthYrISQc$default(messageContentView, margins, message.getContent(), message.m267getId3Eiw7ao(), MessageKt.shouldAnimateEmoji(message), MessageKt.shouldShowLinkDecorations(message), message.getShouldShowRoleDot(), message.getShouldShowRoleOnName(), new com.discord.chat.presentation.list.delegate.a(12), new com.discord.chat.presentation.list.delegate.a(18), new b(i7), new c(i7), new com.discord.chat.presentation.list.delegate.a(9), new ar.s(6), new d(1), new com.discord.chat.presentation.list.delegate.a(10), new com.discord.chat.presentation.list.delegate.a(11), null, new com.discord.chat.presentation.list.f(15), new com.discord.chat.presentation.list.delegate.a(13), new com.discord.chat.presentation.list.delegate.a(14), new com.discord.chat.presentation.list.delegate.a(15), new Function1<MessageId, Unit>() { // from class: com.discord.chat.presentation.message.view.FlaggedMessageEmbedView$configureMessageContent$1$14
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m740invoke1xi1bu0(((MessageId) obj).m1165unboximpl());
                    return Unit.f14616a;
                }

                /* JADX INFO: renamed from: invoke-1xi1bu0, reason: not valid java name */
                public final void m740invoke1xi1bu0(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }
            }, new com.discord.chat.presentation.list.delegate.a(16), new com.discord.chat.presentation.list.delegate.a(17), messageContentView.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing), iIntValue, false, null, null, null, null, null, null, false, -134152192, 3, null);
        }
        FlaggedMessageEmbedFooterView flaggedMessageEmbedFooterView = this.binding.contentFooterView;
        Intrinsics.checkNotNull(flaggedMessageEmbedFooterView);
        flaggedMessageEmbedFooterView.setVisibility(message.getAutoModerationContext() != null ? z5 : false ? 0 : 8);
        if (message.getAutoModerationContext() != null) {
            flaggedMessageEmbedFooterView.setAutomodContext(message.getAutoModerationContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$10(CommandMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$11(CommandMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$13(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$14(InlineCodeContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$15(EmojiContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$16(SoundmojiContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkStyle configureMessageContent$lambda$18$lambda$17(LinkContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new LinkStyle(DiscordFont.PrimaryNormal, ThemeManagerKt.getTheme().getTextDefault(), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$3(LinkContentNode linkContentNode) {
        Intrinsics.checkNotNullParameter(linkContentNode, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$4(LinkContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$5(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$6(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$7(String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$8(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureMessageContent$lambda$18$lambda$9(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.f14616a;
    }

    public static /* synthetic */ void setMessage$default(FlaggedMessageEmbedView flaggedMessageEmbedView, MessageMargins messageMargins, Message message, ChatEventHandler chatEventHandler, boolean z5, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            chatEventHandler = ChatEventHandler.Empty.INSTANCE;
        }
        if ((i7 & 8) != 0) {
            z5 = true;
        }
        flaggedMessageEmbedView.setMessage(messageMargins, message, chatEventHandler, z5);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        return !this.allowChildGestures;
    }

    public final void setMessage(@NotNull MessageMargins margins, @NotNull Message message, @NotNull ChatEventHandler eventHandler, boolean allowChildGestures) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.allowChildGestures = allowChildGestures;
        configureAuthor(message, eventHandler);
        configureCommunicationDisabled(Intrinsics.areEqual(message.getCommunicationDisabled(), Boolean.TRUE), eventHandler);
        configureMessageContent(margins, message);
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    @NotNull
    /* JADX INFO: renamed from: spacingPxOverride */
    public Integer getBottomSpacingPx() {
        return Integer.valueOf(SizeUtilsKt.getDpToPx(4));
    }

    public /* synthetic */ FlaggedMessageEmbedView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageEmbedView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        FlaggedMessageEmbedViewBinding flaggedMessageEmbedViewBindingInflate = FlaggedMessageEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(flaggedMessageEmbedViewBindingInflate, "inflate(...)");
        this.binding = flaggedMessageEmbedViewBindingInflate;
        this.allowChildGestures = true;
        RippleUtilsKt.addRipple$default(this, false, SizeUtilsKt.getDpToPx(8), 1, null);
        View root = flaggedMessageEmbedViewBindingInflate.getRoot();
        root.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        Intrinsics.checkNotNull(root);
        ViewClippingUtilsKt.clipToRoundedRectangle(root, SizeUtilsKt.getDpToPx(8));
        int dpToPx = SizeUtilsKt.getDpToPx(12);
        root.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        TextView textView = flaggedMessageEmbedViewBindingInflate.authorName;
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        SetTextSizeSpKt.setTextSizeSp(textView, 16.0f, 20.0f);
        textView.setLineSpacing(0.0f, 1.05f);
        SimpleDraweeView authorAvatar = flaggedMessageEmbedViewBindingInflate.authorAvatar;
        Intrinsics.checkNotNullExpressionValue(authorAvatar, "authorAvatar");
        ViewClippingUtilsKt.clipToCircle(authorAvatar);
        MessageContentView messageContentView = flaggedMessageEmbedViewBindingInflate.contentView;
        messageContentView.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(messageContentView);
        DiscordFontUtilsKt.setDiscordFont(messageContentView, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(messageContentView, FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(context) ? 14.0f : 16.0f);
    }
}
