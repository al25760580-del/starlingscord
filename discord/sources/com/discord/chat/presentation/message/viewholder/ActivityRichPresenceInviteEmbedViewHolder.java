package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.activity_invites.RGBAColorModel;
import com.discord.chat.bridge.activities.ActivityRichPresenceInviteEmbed;
import com.discord.chat.bridge.activities.EmbedDisplayType;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.ActivityRichPresenceInviteEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.t;
import com.discord.chat.presentation.message.view.ActivityRichPresenceInviteEmbedView;
import com.discord.primitives.MessageId;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ActivityRichPresenceInviteEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "activityRichPresenceInviteEmbedView", "Lcom/discord/chat/presentation/message/view/ActivityRichPresenceInviteEmbedView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "<init>", "(Lcom/discord/chat/presentation/message/view/ActivityRichPresenceInviteEmbedView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "getEventHandler", "()Lcom/discord/chat/presentation/events/ChatEventHandler;", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/ActivityRichPresenceInviteEmbedMessageAccessory;", "onTapJoinRichPresence", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityRichPresenceInviteEmbedViewHolder extends MessagePartViewHolder {

    @NotNull
    private final ActivityRichPresenceInviteEmbedView activityRichPresenceInviteEmbedView;

    @NotNull
    private final ChatEventHandler eventHandler;

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$10, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass10 extends FunctionReferenceImpl implements Function1<CommandMentionContentNode, Unit> {
        public AnonymousClass10(Object obj) {
            super(1, obj, ChatEventHandler.class, "onLongPressCommand", "onLongPressCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CommandMentionContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(CommandMentionContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onLongPressCommand(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$12, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass12 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public AnonymousClass12(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapTimestamp", "onTapTimestamp(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.f14616a;
        }

        public final void invoke(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapTimestamp(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$13, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass13 extends FunctionReferenceImpl implements Function1<InlineCodeContentNode, Unit> {
        public AnonymousClass13(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapInlineCode", "onTapInlineCode(Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InlineCodeContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(InlineCodeContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapInlineCode(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$14, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass14 extends FunctionReferenceImpl implements Function1<EmojiContentNode, Unit> {
        public AnonymousClass14(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((EmojiContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(EmojiContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapEmoji(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$15, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass15 extends FunctionReferenceImpl implements Function1<MessageId, Unit> {
        public AnonymousClass15(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m765invoke1xi1bu0(((MessageId) obj).m1165unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-1xi1bu0, reason: not valid java name */
        public final void m765invoke1xi1bu0(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo510onTapSeeMore1xi1bu0(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$16, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass16 extends FunctionReferenceImpl implements Function1<SoundmojiContentNode, Unit> {
        public AnonymousClass16(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapSoundmoji", "onTapSoundmoji(Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SoundmojiContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(SoundmojiContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapSoundmoji(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<MessageId, LinkContentNode, Unit> {
        public AnonymousClass2(Object obj) {
            super(2, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m766invokentcYbpo(((MessageId) obj).m1165unboximpl(), (LinkContentNode) obj2);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-ntcYbpo, reason: not valid java name */
        public final void m766invokentcYbpo(String p3, LinkContentNode p5) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            Intrinsics.checkNotNullParameter(p5, "p1");
            ((ChatEventHandler) this.receiver).mo468onLinkClickedntcYbpo(p3, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<LinkContentNode, Unit> {
        public AnonymousClass3(Object obj) {
            super(1, obj, ChatEventHandler.class, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LinkContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(LinkContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onLinkLongClicked(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$4, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass4(Object obj) {
            super(3, obj, ChatEventHandler.class, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((String) obj, (String) obj2, (String) obj3);
            return Unit.f14616a;
        }

        public final void invoke(String p3, String str, String str2) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapChannel(p3, str, str2);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function4 {
        public AnonymousClass5(Object obj) {
            super(4, obj, ChatEventHandler.class, "onLongPressChannel", "onLongPressChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((String) obj, (String) obj2, (String) obj3, (String) obj4);
            return Unit.f14616a;
        }

        public final void invoke(String p3, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onLongPressChannel(p3, str, str2, str3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$6, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public AnonymousClass6(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapAttachmentLink", "onTapAttachmentLink(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.f14616a;
        }

        public final void invoke(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapAttachmentLink(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$7, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
        public AnonymousClass7(Object obj) {
            super(2, obj, ChatEventHandler.class, "onLongPressAttachmentLink", "onLongPressAttachmentLink(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (String) obj2);
            return Unit.f14616a;
        }

        public final void invoke(String p3, String p5) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            Intrinsics.checkNotNullParameter(p5, "p1");
            ((ChatEventHandler) this.receiver).onLongPressAttachmentLink(p3, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$8, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass8 extends FunctionReferenceImpl implements Function6 {
        public AnonymousClass8(Object obj) {
            super(6, obj, ChatEventHandler.class, "onTapMention", "onTapMention(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            invoke((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
            return Unit.f14616a;
        }

        public final void invoke(String str, String p3, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            ((ChatEventHandler) this.receiver).onTapMention(str, p3, str2, str3, str4, str5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder$bind$9, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass9 extends FunctionReferenceImpl implements Function1<CommandMentionContentNode, Unit> {
        public AnonymousClass9(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CommandMentionContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(CommandMentionContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapCommand(p3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityRichPresenceInviteEmbedViewHolder(@NotNull ActivityRichPresenceInviteEmbedView activityRichPresenceInviteEmbedView, @NotNull ChatEventHandler eventHandler) {
        super(activityRichPresenceInviteEmbedView, null);
        Intrinsics.checkNotNullParameter(activityRichPresenceInviteEmbedView, "activityRichPresenceInviteEmbedView");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.activityRichPresenceInviteEmbedView = activityRichPresenceInviteEmbedView;
        this.eventHandler = eventHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(Function1 function1, ActivityRichPresenceInviteEmbedMessageAccessory activityRichPresenceInviteEmbedMessageAccessory, View view) {
        function1.invoke(MessageId.m1156boximpl(activityRichPresenceInviteEmbedMessageAccessory.getMessageId()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void bind(@NotNull ActivityRichPresenceInviteEmbedMessageAccessory accessory, @NotNull Function1<? super MessageId, Unit> onTapJoinRichPresence) {
        boolean zBooleanValue;
        boolean z5;
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapJoinRichPresence, "onTapJoinRichPresence");
        ActivityRichPresenceInviteEmbed activityRichPresenceInviteEmbed = accessory.getActivityRichPresenceInviteEmbed();
        ActivityRichPresenceInviteEmbedView activityRichPresenceInviteEmbedView = this.activityRichPresenceInviteEmbedView;
        MessageMargins margins = accessory.getMargins();
        EmbedDisplayType displayType = activityRichPresenceInviteEmbed.getDisplayType();
        Boolean ctaButtonEnabled = activityRichPresenceInviteEmbed.getCtaButtonEnabled();
        if (ctaButtonEnabled != null) {
            zBooleanValue = ctaButtonEnabled.booleanValue();
            z5 = false;
        } else {
            zBooleanValue = false;
            z5 = false;
        }
        String ctaButtonText = activityRichPresenceInviteEmbed.getCtaButtonText();
        Boolean ctaButtonIsLoading = activityRichPresenceInviteEmbed.getCtaButtonIsLoading();
        boolean zBooleanValue2 = ctaButtonIsLoading != null ? ctaButtonIsLoading.booleanValue() : z5;
        String footerLabel = activityRichPresenceInviteEmbed.getFooterLabel();
        boolean z6 = z5;
        boolean z7 = zBooleanValue2;
        List<RGBAColorModel> gradientColors = activityRichPresenceInviteEmbed.getGradientColors();
        String headerText = activityRichPresenceInviteEmbed.getHeaderText();
        int iIntValue = z6;
        String iconSrc = activityRichPresenceInviteEmbed.getIconSrc();
        Boolean boolIsSpotifyParty = activityRichPresenceInviteEmbed.isSpotifyParty();
        int iBooleanValue = boolIsSpotifyParty != null ? boolIsSpotifyParty.booleanValue() : iIntValue;
        Integer maxPartySize = activityRichPresenceInviteEmbed.getMaxPartySize();
        if (maxPartySize != null) {
            iIntValue = maxPartySize.intValue();
        }
        activityRichPresenceInviteEmbedView.m729setActivityRichPresenceInviteEmbedUv5W4H4(margins, displayType, zBooleanValue, ctaButtonText, z7, footerLabel, gradientColors, headerText, iconSrc, iBooleanValue, iIntValue, new t(9, onTapJoinRichPresence, accessory), activityRichPresenceInviteEmbed.getPartyMemberAvatarURIs(), activityRichPresenceInviteEmbed.getPartySizeText(), activityRichPresenceInviteEmbed.getPlatformIconKeys(), activityRichPresenceInviteEmbed.getCoverImageUrl(), activityRichPresenceInviteEmbed.getDetailsText(), activityRichPresenceInviteEmbed.getSubtitle(), activityRichPresenceInviteEmbed.getTitle(), activityRichPresenceInviteEmbed.getHiddenEmbedMessageContent(), accessory.getMessageId(), new AnonymousClass2(this.eventHandler), new AnonymousClass3(this.eventHandler), new AnonymousClass4(this.eventHandler), new AnonymousClass5(this.eventHandler), new AnonymousClass6(this.eventHandler), new AnonymousClass7(this.eventHandler), new AnonymousClass8(this.eventHandler), new AnonymousClass9(this.eventHandler), new AnonymousClass10(this.eventHandler), new com.discord.chat.presentation.list.f(22), new AnonymousClass12(this.eventHandler), new AnonymousClass13(this.eventHandler), new AnonymousClass14(this.eventHandler), new AnonymousClass15(this.eventHandler), new AnonymousClass16(this.eventHandler));
    }

    @NotNull
    public final ChatEventHandler getEventHandler() {
        return this.eventHandler;
    }
}
