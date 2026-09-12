package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.bridge.forwarding.ForwardInfo;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.view.CtaButtonView;
import com.discord.chat.presentation.message.view.ForwardBreadcrumbView;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4145d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4146e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f4147i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4148v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4149w;

    public /* synthetic */ l(long j, String str, ForwardInfo forwardInfo, Function3 function3) {
        this.f4149w = function3;
        this.f4148v = forwardInfo;
        this.f4146e = j;
        this.f4147i = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4145d) {
            case 0:
                MessageTagView.configureTagView_Ul7AT2Q$lambda$0((ChatEventHandler) this.f4149w, this.f4147i, this.f4146e, (String) this.f4148v, view);
                break;
            case 1:
                CtaButtonView.configureButton_CMNjcK4$lambda$0((Function3) this.f4149w, this.f4146e, this.f4147i, (String) this.f4148v, view);
                break;
            default:
                ForwardBreadcrumbView.configure_JjTCmh4$lambda$0((Function3) this.f4149w, (ForwardInfo) this.f4148v, this.f4146e, this.f4147i, view);
                break;
        }
    }

    public /* synthetic */ l(ChatEventHandler chatEventHandler, String str, long j, String str2) {
        this.f4149w = chatEventHandler;
        this.f4147i = str;
        this.f4146e = j;
        this.f4148v = str2;
    }

    public /* synthetic */ l(Function3 function3, long j, String str, String str2) {
        this.f4149w = function3;
        this.f4146e = j;
        this.f4147i = str;
        this.f4148v = str2;
    }
}
