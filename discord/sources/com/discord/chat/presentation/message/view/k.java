package com.discord.chat.presentation.message.view;

import android.view.View;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f4215e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f4216i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f4217v;

    public /* synthetic */ k(int i7, String str, String str2, Function2 function2) {
        this.f4214d = i7;
        this.f4215e = function2;
        this.f4216i = str;
        this.f4217v = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4214d) {
            case 0:
                this.f4215e.invoke(this.f4216i, this.f4217v);
                break;
            case 1:
                this.f4215e.invoke(this.f4216i, this.f4217v);
                break;
            default:
                this.f4215e.invoke(this.f4216i, this.f4217v);
                break;
        }
    }
}
