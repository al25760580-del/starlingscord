package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.view.EmbedView;
import com.discord.media_player.MediaSource;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4308e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4309i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4310v;

    public /* synthetic */ e(Object obj, Object obj2, int i7, int i10) {
        this.f4307d = i10;
        this.f4308e = obj;
        this.f4309i = obj2;
        this.f4310v = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4307d) {
            case 0:
                ((ChatEventHandler) this.f4308e).mo495onTapInviteEmbedAFFcxXc((String) this.f4309i, this.f4310v, null, null);
                break;
            case 1:
                ((ChatEventHandler) this.f4308e).mo496onTapInviteEmbedAcceptntcYbpo((String) this.f4309i, this.f4310v);
                break;
            case 2:
                ((ChatEventHandler) this.f4308e).mo495onTapInviteEmbedAFFcxXc((String) this.f4309i, this.f4310v, null, null);
                break;
            case 3:
                ((ChatEventHandler) this.f4308e).mo496onTapInviteEmbedAcceptntcYbpo((String) this.f4309i, this.f4310v);
                break;
            default:
                EmbedView.setEmbed_fDtLluY$lambda$11$lambda$10((Function2) this.f4308e, (MediaSource) this.f4309i, this.f4310v, view);
                break;
        }
    }
}
