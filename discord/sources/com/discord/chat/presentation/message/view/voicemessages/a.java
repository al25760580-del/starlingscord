package com.discord.chat.presentation.message.view.voicemessages;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements AudioManager.OnAudioFocusChangeListener {
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        AudioPlayerManager.focusListener$lambda$0(i7);
    }
}
