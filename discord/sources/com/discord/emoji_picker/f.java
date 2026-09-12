package com.discord.emoji_picker;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EmojiPickerViewAdapter f4378e;

    public /* synthetic */ f(EmojiPickerViewAdapter emojiPickerViewAdapter, int i7) {
        this.f4377d = i7;
        this.f4378e = emojiPickerViewAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4377d) {
            case 0:
                return EmojiPickerViewAdapter.setEmojis$lambda$1(this.f4378e);
            default:
                return EmojiPickerViewAdapter.setCoreData$lambda$0(this.f4378e);
        }
    }
}
