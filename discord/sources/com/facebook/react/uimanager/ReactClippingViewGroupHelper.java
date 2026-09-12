package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/ReactClippingViewGroupHelper;", "", "<init>", "()V", "PROP_REMOVE_CLIPPED_SUBVIEWS", "", "helperRect", "Landroid/graphics/Rect;", "calculateClippingRect", "", "view", "Landroid/view/View;", "outputRect", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactClippingViewGroupHelper {

    @NotNull
    public static final String PROP_REMOVE_CLIPPED_SUBVIEWS = "removeClippedSubviews";

    @NotNull
    public static final ReactClippingViewGroupHelper INSTANCE = new ReactClippingViewGroupHelper();

    @NotNull
    private static final Rect helperRect = new Rect();

    private ReactClippingViewGroupHelper() {
    }

    public static final void calculateClippingRect(@NotNull View view, @NotNull Rect outputRect) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outputRect, "outputRect");
        ViewParent parent = view.getParent();
        if (parent == null) {
            outputRect.setEmpty();
            return;
        }
        if (parent instanceof ReactClippingViewGroup) {
            ReactClippingViewGroup reactClippingViewGroup = (ReactClippingViewGroup) parent;
            if (reactClippingViewGroup.getRemoveClippedSubviews()) {
                Rect rect = helperRect;
                reactClippingViewGroup.getClippingRect(rect);
                if (!rect.intersect(view.getLeft(), view.getTop() + ((int) view.getTranslationY()), view.getRight(), view.getBottom() + ((int) view.getTranslationY()))) {
                    outputRect.setEmpty();
                    return;
                }
                rect.offset(-view.getLeft(), -view.getTop());
                rect.offset(-((int) view.getTranslationX()), -((int) view.getTranslationY()));
                rect.offset(view.getScrollX(), view.getScrollY());
                outputRect.set(rect);
                return;
            }
        }
        view.getDrawingRect(outputRect);
    }
}
