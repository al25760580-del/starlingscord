package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class GuildEventInviteViewHolder$bind$1$1$1 extends FunctionReferenceImpl implements Function2<MessageId, LinkContentNode, Unit> {
    public GuildEventInviteViewHolder$bind$1$1$1(Object obj) {
        super(2, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m775invokentcYbpo(((MessageId) obj).m1165unboximpl(), (LinkContentNode) obj2);
        return Unit.f14616a;
    }

    /* JADX INFO: renamed from: invoke-ntcYbpo, reason: not valid java name */
    public final void m775invokentcYbpo(String p3, LinkContentNode p5) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p5, "p1");
        ((ChatEventHandler) this.receiver).mo468onLinkClickedntcYbpo(p3, p5);
    }
}
