package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.viewholder.MessageComponentsViewHolder;
import com.discord.primitives.UserId;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatEventHandler f4180e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f4181i;

    public /* synthetic */ v(ChatEventHandler chatEventHandler, String str, int i7) {
        this.f4179d = i7;
        this.f4180e = chatEventHandler;
        this.f4181i = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4179d) {
            case 0:
                return MessageViewReplyPreview.configureExecutedCommand_dB0_bEw$lambda$14(this.f4180e, this.f4181i, (LinkContentNode) obj);
            case 1:
                return MessageComponentsViewHolder.bind$lambda$1(this.f4180e, this.f4181i, (LinkContentNode) obj);
            case 2:
                return MessageComponentsViewHolder.bind$lambda$2(this.f4180e, this.f4181i, (String) obj);
            case 3:
                return MessageComponentsViewHolder.bind$lambda$3(this.f4180e, this.f4181i, (String) obj);
            case 4:
                return MessageComponentsViewHolder.bind$lambda$4(this.f4180e, this.f4181i, (String) obj);
            default:
                return MessageComponentsViewHolder.bind$lambda$6(this.f4180e, this.f4181i, (UserId) obj);
        }
    }
}
