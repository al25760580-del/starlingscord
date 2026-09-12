package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.message.system.SystemMessageView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f4166e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Message f4167i;

    public /* synthetic */ r(Function2 function2, Message message, int i7) {
        this.f4165d = i7;
        this.f4166e = function2;
        this.f4167i = message;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4165d) {
            case 0:
                MessageView.setMessage$lambda$11$lambda$10(this.f4166e, this.f4167i, view);
                break;
            case 1:
                MessageView.setMessage$lambda$15$lambda$14(this.f4166e, this.f4167i, view);
                break;
            default:
                SystemMessageView.setMessage$lambda$2$lambda$1(this.f4166e, this.f4167i, view);
                break;
        }
    }
}
