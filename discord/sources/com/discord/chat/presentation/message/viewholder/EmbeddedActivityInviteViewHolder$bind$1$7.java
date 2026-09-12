package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class EmbeddedActivityInviteViewHolder$bind$1$7 extends FunctionReferenceImpl implements Function6 {
    public EmbeddedActivityInviteViewHolder$bind$1$7(Object obj) {
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
