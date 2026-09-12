package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class MessageComponentsViewHolder$bind$componentContext$12 extends FunctionReferenceImpl implements Function1<InlineCodeContentNode, Unit> {
    public MessageComponentsViewHolder$bind$componentContext$12(Object obj) {
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
