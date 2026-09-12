package com.discord.chat.presentation.message;

import android.text.style.ForegroundColorSpan;
import com.discord.chat.bridge.contentnode.SubtextContentNode;
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.emoji_picker.EmojiPickerScroller;
import com.discord.emoji_picker.EmojiPickerView;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4139e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4140i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4141v;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i7) {
        this.f4138d = i7;
        this.f4139e = obj;
        this.f4140i = obj2;
        this.f4141v = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4138d) {
            case 0:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$8((MessagePartViewHolder) this.f4139e, (EmbedMessageAccessory) this.f4140i, (MessageAccessoriesAdapter) this.f4141v, (Double) obj, (Integer) obj2);
            case 1:
                return EmojiPickerView.scroller_delegate$lambda$5$lambda$4((Function2) this.f4139e, (EmojiPickerView) this.f4140i, (Function2) this.f4141v, (EmojiPickerScroller.ScrollEvent) obj, ((Boolean) obj2).booleanValue());
            default:
                return TextUtilsKt.toSpannable$lambda$71$lambda$50((DraweeSpanStringBuilder) this.f4139e, (ForegroundColorSpan) this.f4140i, (SubtextContentNode) this.f4141v, (DraweeSpanStringBuilder) obj, (RenderContext) obj2);
        }
    }
}
