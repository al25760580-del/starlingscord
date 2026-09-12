package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.presentation.events.ChatEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatEventHandler f4151e;

    public /* synthetic */ m(ChatEventHandler chatEventHandler, int i7) {
        this.f4150d = i7;
        this.f4151e = chatEventHandler;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4150d) {
            case 0:
                MessageTagView.configureTagView_Ul7AT2Q$lambda$1(this.f4151e, view);
                break;
            case 1:
                this.f4151e.onTapSuppressNotificationsIcon();
                break;
            case 2:
                this.f4151e.onTapTimeoutIcon();
                break;
            default:
                this.f4151e.onTapTimeoutIcon();
                break;
        }
    }
}
