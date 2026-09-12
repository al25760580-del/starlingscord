package com.discord.emoji_picker;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f4366e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ EmojiPickerView f4367i;

    public /* synthetic */ c(Function2 function2, EmojiPickerView emojiPickerView, int i7) {
        this.f4365d = i7;
        this.f4366e = function2;
        this.f4367i = emojiPickerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4365d) {
            case 0:
                return EmojiPickerView.visibilityTracker_delegate$lambda$1$lambda$0(this.f4366e, this.f4367i, ((Boolean) obj).booleanValue());
            default:
                return EmojiPickerView.scroller_delegate$lambda$5$lambda$2(this.f4366e, this.f4367i, (EmojiPickerScroller.ScrollEvent) obj);
        }
    }
}
