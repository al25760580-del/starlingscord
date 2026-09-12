package com.discord.chat.presentation.message.system;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatEventHandler f4172e;

    public /* synthetic */ a(ChatEventHandler chatEventHandler, int i7) {
        this.f4171d = i7;
        this.f4172e = chatEventHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4171d) {
            case 0:
                return AutomodSystemMessageWrapperView.setMessage$lambda$0(this.f4172e);
            default:
                return SystemMessageWrapperView.setMessage$lambda$0(this.f4172e);
        }
    }
}
