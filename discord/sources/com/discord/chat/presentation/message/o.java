package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.system.SystemMessageView;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements View.OnLongClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Message f4156e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ChatEventHandler f4157i;

    public /* synthetic */ o(int i7, Message message, ChatEventHandler chatEventHandler) {
        this.f4155d = i7;
        this.f4156e = message;
        this.f4157i = chatEventHandler;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f4155d) {
            case 0:
                return MessageView.configureAuthor$lambda$48$lambda$47(this.f4156e, this.f4157i, view);
            case 1:
                return MessageView.configureAuthorClickListeners$lambda$17(this.f4156e, this.f4157i, view);
            case 2:
                return SystemMessageView.setMessage$lambda$0(this.f4156e, this.f4157i, view);
            default:
                return FlaggedMessageEmbedView.configureAuthor$lambda$22$lambda$21(this.f4156e, this.f4157i, view);
        }
    }
}
