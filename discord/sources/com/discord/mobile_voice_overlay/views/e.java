package com.discord.mobile_voice_overlay.views;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4520e;

    public /* synthetic */ e(int i7, Object obj) {
        this.f4519d = i7;
        this.f4520e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4519d) {
            case 0:
                ResultViewHolder._init_$lambda$1((ResultViewHolder) this.f4520e, view);
                break;
            case 1:
                ((OverlayDialog) this.f4520e).closeDialog();
                break;
            default:
                ((OverlayVoiceSelectorBubbleDialog) this.f4520e).closeDialog();
                break;
        }
    }
}
