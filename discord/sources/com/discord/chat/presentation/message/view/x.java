package com.discord.chat.presentation.message.view;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f4289e;

    public /* synthetic */ x(Function1 function1, int i7) {
        this.f4288d = i7;
        this.f4289e = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4288d) {
            case 0:
                this.f4289e.invoke(null);
                break;
            default:
                this.f4289e.invoke(null);
                break;
        }
    }
}
