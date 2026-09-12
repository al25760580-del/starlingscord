package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.discord.chat.R;
import com.discord.chat.presentation.list.item.ChatListItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0006J*\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u0007R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006\""}, d2 = {"Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;", "", "context", "Landroid/content/Context;", "cellHighlightColor", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "", "gutterColor", "shouldRenderHighlight", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getCellHighlightColor", "()Lkotlin/jvm/functions/Function1;", "getGutterColor", "getShouldRenderHighlight", "gutterWidth", "backgroundPaint", "Landroid/graphics/Paint;", "gutterPaint", "backgroundPaintColor", "Ljava/lang/Integer;", "gutterPaintColor", "setPaintStyles", "", "chatListItem", "drawHighlight", "canvas", "Landroid/graphics/Canvas;", "child", "Landroid/view/View;", "topSpacing", "bottomSpacing", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class HighlightedMessageDrawer {

    @NotNull
    private final Paint backgroundPaint;
    private Integer backgroundPaintColor;

    @NotNull
    private final Function1<ChatListItem, Integer> cellHighlightColor;

    @NotNull
    private final Function1<ChatListItem, Integer> gutterColor;

    @NotNull
    private final Paint gutterPaint;
    private Integer gutterPaintColor;
    private final int gutterWidth;

    @NotNull
    private final Function1<ChatListItem, Boolean> shouldRenderHighlight;

    /* JADX WARN: Multi-variable type inference failed */
    public HighlightedMessageDrawer(@NotNull Context context, @NotNull Function1<? super ChatListItem, Integer> cellHighlightColor, @NotNull Function1<? super ChatListItem, Integer> gutterColor, @NotNull Function1<? super ChatListItem, Boolean> shouldRenderHighlight) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cellHighlightColor, "cellHighlightColor");
        Intrinsics.checkNotNullParameter(gutterColor, "gutterColor");
        Intrinsics.checkNotNullParameter(shouldRenderHighlight, "shouldRenderHighlight");
        this.cellHighlightColor = cellHighlightColor;
        this.gutterColor = gutterColor;
        this.shouldRenderHighlight = shouldRenderHighlight;
        this.gutterWidth = context.getResources().getDimensionPixelSize(R.dimen.message_gutter_width);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        this.gutterPaint = paint2;
    }

    public static /* synthetic */ void drawHighlight$default(HighlightedMessageDrawer highlightedMessageDrawer, Canvas canvas, View view, int i7, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawHighlight");
        }
        if ((i11 & 4) != 0) {
            i7 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        highlightedMessageDrawer.drawHighlight(canvas, view, i7, i10);
    }

    public final void drawHighlight(@NotNull Canvas canvas, @NotNull View child, int topSpacing, int bottomSpacing) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        float translatedLeft = HighlightedMessageDrawerKt.getTranslatedLeft(child);
        float translatedRight = HighlightedMessageDrawerKt.getTranslatedRight(child);
        float translatedTop = HighlightedMessageDrawerKt.getTranslatedTop(child) - topSpacing;
        float translatedBottom = HighlightedMessageDrawerKt.getTranslatedBottom(child) + bottomSpacing;
        Integer num = this.backgroundPaintColor;
        if (num != null) {
            this.backgroundPaint.setColor(num.intValue());
            canvas2 = canvas;
            canvas2.drawRect(translatedLeft, translatedTop, translatedRight, translatedBottom, this.backgroundPaint);
        } else {
            canvas2 = canvas;
        }
        Integer num2 = this.gutterPaintColor;
        if (num2 != null) {
            this.gutterPaint.setColor(num2.intValue());
            canvas2.drawRect(translatedLeft, translatedTop, translatedLeft + this.gutterWidth, translatedBottom, this.gutterPaint);
        }
    }

    @NotNull
    public final Function1<ChatListItem, Integer> getCellHighlightColor() {
        return this.cellHighlightColor;
    }

    @NotNull
    public final Function1<ChatListItem, Integer> getGutterColor() {
        return this.gutterColor;
    }

    @NotNull
    public final Function1<ChatListItem, Boolean> getShouldRenderHighlight() {
        return this.shouldRenderHighlight;
    }

    public final void setPaintStyles(@NotNull ChatListItem chatListItem) {
        Intrinsics.checkNotNullParameter(chatListItem, "chatListItem");
        this.backgroundPaintColor = (Integer) this.cellHighlightColor.invoke(chatListItem);
        this.gutterPaintColor = (Integer) this.gutterColor.invoke(chatListItem);
    }
}
