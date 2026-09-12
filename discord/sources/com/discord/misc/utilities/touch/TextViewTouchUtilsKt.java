package com.discord.misc.utilities.touch;

import android.text.Spannable;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"getSpansUnderMotionEvent", "", "T", "Landroid/widget/TextView;", "event", "Landroid/view/MotionEvent;", "(Landroid/widget/TextView;Landroid/view/MotionEvent;)[Ljava/lang/Object;", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TextViewTouchUtilsKt {
    public static final /* synthetic */ <T> T[] getSpansUnderMotionEvent(TextView textView, MotionEvent event) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        CharSequence text = textView.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            Intrinsics.reifiedOperationMarker(0, "T");
            return (T[]) new Object[0];
        }
        int scrollX = textView.getScrollX() + (((int) event.getX()) - textView.getTotalPaddingLeft());
        int lineForVertical = textView.getLayout().getLineForVertical(textView.getScrollY() + (((int) event.getY()) - textView.getTotalPaddingTop()));
        float lineRight = textView.getLayout().getLineRight(lineForVertical);
        float lineLeft = textView.getLayout().getLineLeft(lineForVertical);
        float f2 = scrollX;
        if (f2 > lineRight || (scrollX >= 0 && f2 < lineLeft)) {
            Intrinsics.reifiedOperationMarker(0, "T");
            return (T[]) new Object[0];
        }
        int offsetForHorizontal = textView.getLayout().getOffsetForHorizontal(lineForVertical, f2);
        Intrinsics.reifiedOperationMarker(4, "T");
        T[] tArr = (T[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, Object.class);
        Intrinsics.checkNotNullExpressionValue(tArr, "getSpans(...)");
        return tArr;
    }
}
