package com.discord.image.fresco;

import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"setOptionalText", "", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "builder", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "fresco_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SimpleDraweeSpanTextViewUtilsKt {
    public static final void setOptionalText(@NotNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, DraweeSpanStringBuilder draweeSpanStringBuilder) {
        int i7;
        Intrinsics.checkNotNullParameter(simpleDraweeSpanTextView, "<this>");
        if (draweeSpanStringBuilder != null) {
            simpleDraweeSpanTextView.setDraweeSpanStringBuilder(draweeSpanStringBuilder);
            i7 = 0;
        } else {
            i7 = 8;
        }
        simpleDraweeSpanTextView.setVisibility(i7);
    }
}
