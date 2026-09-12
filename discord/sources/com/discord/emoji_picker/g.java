package com.discord.emoji_picker;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EmojiPickerViewAdapter f4380e;

    public /* synthetic */ g(EmojiPickerViewAdapter emojiPickerViewAdapter, int i7) {
        this.f4379d = i7;
        this.f4380e = emojiPickerViewAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i7 = this.f4379d;
        int iIntValue = ((Integer) obj).intValue();
        switch (i7) {
            case 0:
                return EmojiPickerViewAdapter.setSpacerTopHeight$lambda$2(this.f4380e, iIntValue);
            default:
                return EmojiPickerViewAdapter.setSpacerBottomHeight$lambda$3(this.f4380e, iIntValue);
        }
    }
}
