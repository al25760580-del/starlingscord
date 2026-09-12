package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class GuildEventInviteViewHolder$bind$1$1$13 extends FunctionReferenceImpl implements Function1<MessageId, Unit> {
    public GuildEventInviteViewHolder$bind$1$1$13(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m776invoke1xi1bu0(((MessageId) obj).m1165unboximpl());
        return Unit.f14616a;
    }

    /* JADX INFO: renamed from: invoke-1xi1bu0, reason: not valid java name */
    public final void m776invoke1xi1bu0(String p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        ((ChatEventHandler) this.receiver).mo510onTapSeeMore1xi1bu0(p3);
    }
}
