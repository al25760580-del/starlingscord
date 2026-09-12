package com.discord.emoji_picker;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f4360e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ EmojiPickerScroller f4361i;

    public /* synthetic */ a(Function2 function2, EmojiPickerScroller emojiPickerScroller, int i7) {
        this.f4359d = i7;
        this.f4360e = function2;
        this.f4361i = emojiPickerScroller;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4359d) {
            case 0:
                return EmojiPickerScroller.scrollListenerDebounced$lambda$2$lambda$1(this.f4360e, this.f4361i, ((Integer) obj).intValue());
            case 1:
                return EmojiPickerScroller.scrollListenerDebounced$lambda$3(this.f4360e, this.f4361i, ((Boolean) obj).booleanValue());
            default:
                return EmojiPickerScroller.scrollViewLayoutChanged$lambda$5$lambda$4(this.f4360e, this.f4361i, ((Integer) obj).intValue());
        }
    }
}
