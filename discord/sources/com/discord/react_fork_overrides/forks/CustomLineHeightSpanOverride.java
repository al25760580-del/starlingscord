package com.discord.react_fork_overrides.forks;

import android.graphics.Paint;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import ho.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;", "", "<init>", "()V", "override", "", "overrideLineHeight", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "mHeight", "", "react_fork_overrides_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomLineHeightSpanOverride {

    @NotNull
    public static final CustomLineHeightSpanOverride INSTANCE = new CustomLineHeightSpanOverride();

    private CustomLineHeightSpanOverride() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void override$lambda$0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        CustomLineHeightSpanOverride customLineHeightSpanOverride = INSTANCE;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Paint.FontMetricsInt");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        customLineHeightSpanOverride.overrideLineHeight((Paint.FontMetricsInt) obj, ((Integer) obj2).intValue());
    }

    private final void overrideLineHeight(Paint.FontMetricsInt fm2, int mHeight) {
        int i7 = fm2.bottom;
        int i10 = fm2.top;
        if (mHeight >= i7 - i10) {
            double d6 = (mHeight - ((-i10) + i7)) / 2.0f;
            fm2.top = i10 - ((int) Math.ceil(d6));
            int iFloor = fm2.bottom + ((int) Math.floor(d6));
            fm2.bottom = iFloor;
            fm2.ascent = fm2.top;
            fm2.descent = iFloor;
            return;
        }
        int i11 = fm2.descent;
        int i12 = i11 - fm2.ascent;
        if (i12 <= 0) {
            return;
        }
        int iB = c.b(i11 * ((mHeight * 0.75f) / i12));
        fm2.descent = iB;
        fm2.ascent = iB - mHeight;
    }

    public final void override() {
        CustomLineHeightSpan.INSTANCE.setChooseHeightOverride(new a());
    }
}
