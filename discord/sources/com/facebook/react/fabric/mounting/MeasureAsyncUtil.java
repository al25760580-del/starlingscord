package com.facebook.react.fabric.mounting;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/fabric/mounting/MeasureAsyncUtil;", "", "<init>", "()V", "mBoundingBox", "Landroid/graphics/RectF;", "measure", "", "rootView", "Landroid/view/View;", "viewToMeasure", "outputBuffer", "", "computeBoundingBox", "view", "mapRectFromViewToWindowCoords", "rect", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MeasureAsyncUtil {

    @NotNull
    public static final MeasureAsyncUtil INSTANCE = new MeasureAsyncUtil();

    @NotNull
    private static final RectF mBoundingBox = new RectF();

    private MeasureAsyncUtil() {
    }

    private final void computeBoundingBox(View view, int[] outputBuffer) {
        RectF rectF = mBoundingBox;
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, rectF);
        outputBuffer[0] = Math.round(rectF.left);
        outputBuffer[1] = Math.round(rectF.top);
        outputBuffer[2] = Math.round(rectF.right - rectF.left);
        outputBuffer[3] = Math.round(rectF.bottom - rectF.top);
    }

    private final void mapRectFromViewToWindowCoords(View view, RectF rect) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rect);
        }
        rect.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rect.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rect);
            }
            rect.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public final void measure(@NotNull View rootView, @NotNull View viewToMeasure, @NotNull int[] outputBuffer) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(viewToMeasure, "viewToMeasure");
        Intrinsics.checkNotNullParameter(outputBuffer, "outputBuffer");
        computeBoundingBox(rootView, outputBuffer);
        int i7 = outputBuffer[0];
        int i10 = outputBuffer[1];
        computeBoundingBox(viewToMeasure, outputBuffer);
        outputBuffer[0] = outputBuffer[0] - i7;
        outputBuffer[1] = outputBuffer[1] - i10;
    }
}
