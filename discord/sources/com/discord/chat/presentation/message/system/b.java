package com.discord.chat.presentation.message.system;

import android.util.TypedValue;
import android.view.View;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.CtaButtonView;
import com.discord.chat.presentation.message.view.ObscureOverlayView;
import com.discord.chat.presentation.message.view.botuikit.components.ButtonComponentView;
import com.discord.reactions.ShortcutsFlexbox;
import jm.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4173d;

    public /* synthetic */ b(int i7) {
        this.f4173d = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4173d) {
            case 0:
                SystemMessageView.setMessage$lambda$9(view);
                break;
            case 1:
                AttachmentUploadOverlayView.setUploadCancel$lambda$21(view);
                break;
            case 2:
                CtaButtonView.configureButton_CMNjcK4$lambda$1(view);
                break;
            case 3:
                ObscureOverlayView._init_$lambda$0(view);
                break;
            case 4:
                ButtonComponentView.configure$lambda$4(view);
                break;
            case 5:
                TypedValue typedValue = c.f13921m0;
                break;
            default:
                ShortcutsFlexbox.setReactions$lambda$0(view);
                break;
        }
    }
}
