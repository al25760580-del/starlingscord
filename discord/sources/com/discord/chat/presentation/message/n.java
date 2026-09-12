package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.system.CallSystemMessageView;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Message f4153e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ChatEventHandler f4154i;

    public /* synthetic */ n(int i7, Message message, ChatEventHandler chatEventHandler) {
        this.f4152d = i7;
        this.f4153e = message;
        this.f4154i = chatEventHandler;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4152d) {
            case 0:
                MessageView.configureAuthor$lambda$48$lambda$46(this.f4153e, this.f4154i, view);
                break;
            case 1:
                MessageView.configureAuthorClickListeners$lambda$16(this.f4153e, this.f4154i, view);
                break;
            case 2:
                CallSystemMessageView.setMessage$lambda$4(this.f4154i, this.f4153e, view);
                break;
            case 3:
                FlaggedMessageEmbedView.configureAuthor$lambda$22$lambda$20(this.f4153e, this.f4154i, view);
                break;
            default:
                FlaggedMessageEmbedView.configureAuthor$lambda$24$lambda$23(this.f4153e, this.f4154i, view);
                break;
        }
    }

    public /* synthetic */ n(ChatEventHandler chatEventHandler, Message message) {
        this.f4152d = 2;
        this.f4154i = chatEventHandler;
        this.f4153e = message;
    }
}
