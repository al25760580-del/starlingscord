package com.discord.span.utilities;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import b8.b;
import com.discord.fonts.DiscordFont;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/span/utilities/GGSansItalicSpan;", "Landroid/text/style/StyleSpan;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "updateMeasureState", "paint", "apply", "Landroid/graphics/Paint;", "fallback", "Lkotlin/Function0;", "span_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GGSansItalicSpan extends StyleSpan {

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGSansItalicSpan(@NotNull Context context) {
        super(2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final void apply(Paint paint, Function0<Unit> fallback) {
        DiscordFont discordFontFindByStyle$default;
        DiscordFont.Companion companion = DiscordFont.INSTANCE;
        DiscordFont discordFontFromTypeface = companion.fromTypeface(paint.getTypeface());
        Typeface typeface = null;
        if (discordFontFromTypeface != null && (discordFontFindByStyle$default = DiscordFont.Companion.findByStyle$default(companion, discordFontFromTypeface.getWeight(), true, false, 4, null)) != null) {
            typeface = discordFontFindByStyle$default.typeface(this.context);
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
        } else {
            fallback.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDrawState$lambda$0(GGSansItalicSpan gGSansItalicSpan, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateMeasureState$lambda$1(GGSansItalicSpan gGSansItalicSpan, TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        return Unit.f14616a;
    }

    @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        apply(ds2, new b(this, ds2, 1));
    }

    @Override // android.text.style.StyleSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        apply(paint, new b(this, paint, 0));
    }
}
