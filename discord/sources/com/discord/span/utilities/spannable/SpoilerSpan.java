package com.discord.span.utilities.spannable;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\nR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/span/utilities/spannable/SpoilerSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "isRevealed", "", "onReveal", "Lkotlin/Function0;", "", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "()Z", "reveal", "updateDrawState", "tp", "Landroid/text/TextPaint;", "span_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SpoilerSpan extends CharacterStyle implements UpdateAppearance {
    private final boolean isRevealed;
    private final Function0<Unit> onReveal;

    public /* synthetic */ SpoilerSpan(boolean z5, Function0 function0, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, (i7 & 2) != 0 ? null : function0);
    }

    /* JADX INFO: renamed from: isRevealed, reason: from getter */
    public final boolean getIsRevealed() {
        return this.isRevealed;
    }

    public final void reveal() {
        Function0<Unit> function0 = this.onReveal;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint tp2) {
        Intrinsics.checkNotNullParameter(tp2, "tp");
        if (this.isRevealed) {
            return;
        }
        tp2.setColor(Color.argb(0, 0, 0, 0));
    }

    public SpoilerSpan(boolean z5, Function0<Unit> function0) {
        this.isRevealed = z5;
        this.onReveal = function0;
    }
}
