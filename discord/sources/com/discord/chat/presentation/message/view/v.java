package com.discord.chat.presentation.message.view;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f4266e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f4267i;

    public /* synthetic */ v(int i7, String str, Function1 function1) {
        this.f4265d = i7;
        this.f4266e = function1;
        this.f4267i = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4265d) {
            case 0:
                return MessageContentView.truncate_l3ndG_o$lambda$4(this.f4266e, this.f4267i, (View) obj);
            default:
                return MessageContentView.appendEditedLabel$lambda$5(this.f4266e, this.f4267i, (View) obj);
        }
    }
}
