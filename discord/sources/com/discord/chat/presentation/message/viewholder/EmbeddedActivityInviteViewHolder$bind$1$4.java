package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class EmbeddedActivityInviteViewHolder$bind$1$4 extends FunctionReferenceImpl implements Function4 {
    public EmbeddedActivityInviteViewHolder$bind$1$4(Object obj) {
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
