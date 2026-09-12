package com.facebook.react.uimanager;

import android.graphics.Point;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.m0;
import androidx.core.view.u0;
import com.facebook.react.views.view.WindowUtilKt;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/uimanager/RootViewUtil;", "", "<init>", "()V", "getRootView", "Lcom/facebook/react/uimanager/RootView;", "reactView", "Landroid/view/View;", "getViewportOffset", "Landroid/graphics/Point;", "v", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RootViewUtil {

    @NotNull
    public static final RootViewUtil INSTANCE = new RootViewUtil();

    private RootViewUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final RootView getRootView(@NotNull View reactView) {
        Intrinsics.checkNotNullParameter(reactView, "reactView");
        View view = reactView;
        while (!(view instanceof RootView)) {
            Object parent = view.getParent();
            if (parent == null) {
                return null;
            }
            io.sentry.config.a.d(parent instanceof View);
            view = (View) parent;
        }
        return (RootView) view;
    }

    @NotNull
    public static final Point getViewportOffset(@NotNull View v6) {
        Intrinsics.checkNotNullParameter(v6, "v");
        int[] iArr = new int[2];
        v6.getLocationInWindow(iArr);
        if (!WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            WeakHashMap weakHashMap = u0.f1729a;
            WindowInsetsCompat windowInsetsCompatA = m0.a(v6);
            if (windowInsetsCompatA != null) {
                Insets insetsF = windowInsetsCompatA.f1605a.f(129);
                Intrinsics.checkNotNullExpressionValue(insetsF, "getInsets(...)");
                iArr[0] = iArr[0] - insetsF.f1556a;
                iArr[1] = iArr[1] - insetsF.f1557b;
            }
        }
        return new Point(iArr[0], iArr[1]);
    }
}
