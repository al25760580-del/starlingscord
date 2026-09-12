package com.discord;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"setTextSizeSp", "", "Landroid/widget/TextView;", "textSizeSp", "", "sizeSp", "maxScaledSizeSp", "fonts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SetTextSizeSpKt {
    public static final void setTextSizeSp(@NotNull TextView textView, float f2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setTextSize(2, f2);
    }

    public static /* synthetic */ void setTextSizeSp$default(TextView textView, float f2, float f7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            f7 = Float.MAX_VALUE;
        }
        setTextSizeSp(textView, f2, f7);
    }

    public static final void setTextSizeSp(@NotNull TextView textView, float f2, float f7) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        float f10 = textView.getContext().getResources().getConfiguration().fontScale;
        float f11 = f2 / f10;
        setTextSizeSp(textView, Math.min(f10, f7 / f11) * f11);
    }
}
