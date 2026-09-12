package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.sticker.Sticker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnLongClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f4318e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Sticker f4319i;

    public /* synthetic */ h(Function1 function1, Sticker sticker, int i7) {
        this.f4317d = i7;
        this.f4318e = function1;
        this.f4319i = sticker;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f4317d) {
            case 0:
                return StickerApngViewHolder.bind$lambda$1(this.f4318e, this.f4319i, view);
            case 1:
                return StickerGifViewHolder.bind$lambda$1(this.f4318e, this.f4319i, view);
            case 2:
                return StickerLottieViewHolder.bind$lambda$1(this.f4318e, this.f4319i, view);
            default:
                return StickerPngViewHolder.bind$lambda$1(this.f4318e, this.f4319i, view);
        }
    }
}
