package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.keyboard.KeyboardModule;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4269e;

    public /* synthetic */ b(boolean z5, int i7) {
        this.f4268d = i7;
        this.f4269e = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4268d) {
            case 0:
                AudioPlayerModule.pauseCurrentPlayer$lambda$0(this.f4269e);
                break;
            default:
                KeyboardModule.onKeyboardChanged$lambda$0(this.f4269e);
                break;
        }
    }
}
