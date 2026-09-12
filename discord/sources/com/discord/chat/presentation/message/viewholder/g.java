package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.sticker.Sticker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f4315e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Sticker f4316i;

    public /* synthetic */ g(Function1 function1, Sticker sticker, int i7) {
        this.f4314d = i7;
        this.f4315e = function1;
        this.f4316i = sticker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4314d) {
            case 0:
                this.f4315e.invoke(this.f4316i);
                break;
            case 1:
                this.f4315e.invoke(this.f4316i);
                break;
            case 2:
                this.f4315e.invoke(this.f4316i);
                break;
            default:
                this.f4315e.invoke(this.f4316i);
                break;
        }
    }
}
