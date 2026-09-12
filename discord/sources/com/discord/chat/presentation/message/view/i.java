package com.discord.chat.presentation.message.view;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnLongClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f4207e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f4208i;

    public /* synthetic */ i(int i7, String str, Function1 function1) {
        this.f4206d = i7;
        this.f4207e = function1;
        this.f4208i = str;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f4206d) {
            case 0:
                return EmbedFieldView.setValue$lambda$9$lambda$8$lambda$7(this.f4207e, this.f4208i, view);
            case 1:
                return EmbedFieldView.setName$lambda$5$lambda$4$lambda$3(this.f4207e, this.f4208i, view);
            case 2:
                return EmbedView.setDescription$lambda$28$lambda$27(this.f4207e, this.f4208i, view);
            case 3:
                return EmbedView.setFooter$lambda$38$lambda$37$lambda$36(this.f4207e, this.f4208i, view);
            default:
                return EmbedView.setTitle$lambda$20$lambda$19$lambda$18(this.f4207e, this.f4208i, view);
        }
    }
}
