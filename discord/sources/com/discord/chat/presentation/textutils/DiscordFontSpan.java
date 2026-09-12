package com.discord.chat.presentation.textutils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.discord.fonts.DiscordFont;
import com.facebook.react.common.assets.ReactFontManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/textutils/DiscordFontSpan;", "Landroid/text/style/MetricAffectingSpan;", "context", "Landroid/content/Context;", "discordFont", "Lcom/discord/fonts/DiscordFont;", "<init>", "(Landroid/content/Context;Lcom/discord/fonts/DiscordFont;)V", "typeface", "Landroid/graphics/Typeface;", "updateDrawState", "", "paint", "Landroid/text/TextPaint;", "updateMeasureState", "applyCustomTypeFace", "Landroid/graphics/Paint;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiscordFontSpan extends MetricAffectingSpan {

    @NotNull
    private final Context context;

    @NotNull
    private final DiscordFont discordFont;

    @NotNull
    private final Typeface typeface;

    public DiscordFontSpan(@NotNull Context context, @NotNull DiscordFont discordFont) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(discordFont, "discordFont");
        this.context = context;
        this.discordFont = discordFont;
        this.typeface = discordFont.typeface(context);
    }

    private final void applyCustomTypeFace(Paint paint) {
        Typeface typeface = paint.getTypeface();
        int style = (typeface != null ? typeface.getStyle() : 0) & (~this.typeface.getStyle());
        DiscordFont.Companion companion = DiscordFont.INSTANCE;
        DiscordFont discordFontFromTypeface = companion.fromTypeface(paint.getTypeface());
        boolean z5 = true;
        boolean z6 = paint.isFakeBoldText() || (style & 1) != 0;
        if (this.discordFont.getMonospace()) {
            paint.setTypeface((z6 ? DiscordFont.CodeBold : DiscordFont.CodeNormal).typeface(this.context));
            return;
        }
        if (paint.getTextSkewX() == 0.0f && !this.discordFont.getItalic() && (style & 2) == 0) {
            if (!(discordFontFromTypeface != null ? discordFontFromTypeface.getItalic() : false)) {
                z5 = false;
            }
        }
        int weight = this.discordFont.getWeight();
        if (z6) {
            weight = Math.max(ReactFontManager.TypefaceStyle.BOLD, weight);
        }
        DiscordFont discordFontFindByStyle = companion.findByStyle(weight, z5, discordFontFromTypeface != null ? discordFontFromTypeface.getMonospace() : false);
        paint.setTypeface(discordFontFindByStyle != null ? discordFontFindByStyle.typeface(this.context) : null);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        applyCustomTypeFace(paint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        applyCustomTypeFace(paint);
    }
}
