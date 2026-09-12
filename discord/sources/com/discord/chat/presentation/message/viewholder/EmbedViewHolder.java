package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.view.EmbedView;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005Jn\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00070\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/EmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "embedView", "Lcom/discord/chat/presentation/message/view/EmbedView;", "<init>", "(Lcom/discord/chat/presentation/message/view/EmbedView;)V", "bind", "", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "accessory", "Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;", "maxHeightPx", "", "radiusPx", "onTapSpoiler", "Lkotlin/Function0;", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "onMediaClicked", "Lkotlin/Function2;", "", "onMediaLongClicked", "Landroid/view/View$OnLongClickListener;", "portal", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmbedViewHolder extends MessagePartViewHolder {

    @NotNull
    private final EmbedView embedView;

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.EmbedViewHolder$bind$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass1(Object obj) {
            super(3, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m769invokeu7_MRrM(((MessageId) obj).m1165unboximpl(), (String) obj2, (String) obj3);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-u7_MRrM, reason: not valid java name */
        public final void m769invokeu7_MRrM(String p3, String p5, String str) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            Intrinsics.checkNotNullParameter(p5, "p1");
            ((ChatEventHandler) this.receiver).mo469onLinkClickedu7_MRrM(p3, p5, str);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.EmbedViewHolder$bind$10, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass10 extends FunctionReferenceImpl implements Function1<GameMentionContentNode, Unit> {
        public AnonymousClass10(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapGameMention", "onTapGameMention(Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GameMentionContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(GameMentionContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapGameMention(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.EmbedViewHolder$bind$11, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass11 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public AnonymousClass11(Object obj) {
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

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.EmbedViewHolder$bind$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass2(Object obj) {
            super(3, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m770invokeu7_MRrM(((MessageId) obj).m1165unboximpl(), (String) obj2, (String) obj3);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-u7_MRrM, reason: not valid java name */
        public final void m770invokeu7_MRrM(String p3, String p5, String str) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            Intrinsics.checkNotNullParameter(p5, "p1");
            ((ChatEventHandler) this.receiver).mo469onLinkClickedu7_MRrM(p3, p5, str);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.EmbedViewHolder$bind$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function2<MessageId, LinkContentNode, Unit> {
        public AnonymousClass3(Object obj) {
            super(2, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m771invokentcYbpo(((MessageId) obj).m1165unboximpl(), (LinkContentNode) obj2);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-ntcYbpo, reason: not valid java name */
        public final void m771invokentcYbpo(String p3, LinkContentNode p5) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            Intrinsics.checkNotNullParameter(p5, "p1");
            ((ChatEventHandler) this.receiver).mo468onLinkClickedntcYbpo(p3, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.EmbedViewHolder$bind$4, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<LinkContentNode, Unit> {
        public AnonymousClass4(Object obj) {
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

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.EmbedViewHolder$bind$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        public AnonymousClass5(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapCopyText", "onTapCopyText(Ljava/lang/CharSequence;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CharSequence) obj);
            return Unit.f14616a;
        }

        public final void invoke(CharSequence p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapCopyText(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.EmbedViewHolder$bind$6, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function1<EmojiContentNode, Unit> {
        public AnonymousClass6(Object obj) {
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

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.EmbedViewHolder$bind$7, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass7(Object obj) {
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

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.EmbedViewHolder$bind$8, reason: invalid class name */
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

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.EmbedViewHolder$bind$9, reason: invalid class name */
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
    public EmbedViewHolder(@NotNull EmbedView embedView) {
        super(embedView, null);
        Intrinsics.checkNotNullParameter(embedView, "embedView");
        this.embedView = embedView;
    }

    public final void bind(@NotNull ChatEventHandler eventHandler, @NotNull EmbedMessageAccessory accessory, int maxHeightPx, int radiusPx, @NotNull Function0<Unit> onTapSpoiler, SpoilerConfig spoilerConfig, @NotNull Function2<? super Double, ? super Integer, Unit> onMediaClicked, View.OnLongClickListener onMediaLongClicked, double portal) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onMediaClicked, "onMediaClicked");
        String obscure = accessory.getEmbed().getObscure();
        boolean z5 = obscure == null || StringsKt.K(obscure);
        boolean z6 = !z5;
        EmbedView embedView = this.embedView;
        MessageMargins margins = accessory.getMargins();
        Embed embed = accessory.getEmbed();
        long jM601getChannelIdo4g7jtM = accessory.m601getChannelIdo4g7jtM();
        String messageId = accessory.getMessageId();
        int constrainedWidth = accessory.getConstrainedWidth();
        boolean z7 = accessory.getShouldAutoPlayGifs() && z5;
        boolean shouldAnimateEmoji = accessory.getShouldAnimateEmoji();
        boolean shouldShowLinkDecorations = accessory.getShouldShowLinkDecorations();
        boolean shouldShowRoleDot = accessory.getShouldShowRoleDot();
        boolean shouldShowRoleOnName = accessory.getShouldShowRoleOnName();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(eventHandler);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(eventHandler);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(eventHandler);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(eventHandler);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(eventHandler);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(eventHandler);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(eventHandler);
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(eventHandler);
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(eventHandler);
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(eventHandler);
        AnonymousClass11 anonymousClass11 = new AnonymousClass11(eventHandler);
        Boolean obscureIsOpaque = accessory.getEmbed().getObscureIsOpaque();
        boolean zBooleanValue = obscureIsOpaque != null ? obscureIsOpaque.booleanValue() : false;
        Boolean obscureHideControls = accessory.getEmbed().getObscureHideControls();
        embedView.m737setEmbedfDtLluY(margins, embed, jM601getChannelIdo4g7jtM, messageId, constrainedWidth, maxHeightPx, radiusPx, z7, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, anonymousClass1, anonymousClass2, onMediaClicked, onMediaLongClicked, anonymousClass3, anonymousClass4, anonymousClass5, onTapSpoiler, anonymousClass6, anonymousClass7, anonymousClass8, anonymousClass9, anonymousClass10, anonymousClass11, spoilerConfig, portal, z6, obscureHideControls != null ? obscureHideControls.booleanValue() : false, zBooleanValue, accessory.isForwardedContent());
    }
}
