package com.discord.chat.presentation.message.view;

import android.view.View;
import com.discord.chat.presentation.message.view.customthemes.SharedCustomThemeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f4193e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f4194i;

    public /* synthetic */ e(int i7, String str, Function1 function1) {
        this.f4192d = i7;
        this.f4193e = function1;
        this.f4194i = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4192d) {
            case 0:
                this.f4193e.invoke(this.f4194i);
                break;
            case 1:
                this.f4193e.invoke(this.f4194i);
                break;
            case 2:
                this.f4193e.invoke(this.f4194i);
                break;
            default:
                SharedCustomThemeView.bind_pPZZVto$lambda$2(this.f4193e, this.f4194i, view);
                break;
        }
    }
}
