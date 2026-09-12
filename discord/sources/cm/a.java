package cm;

import android.graphics.Point;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends LayoutShadowNode {
    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void addChildAt(ReactShadowNodeImpl child, int i7) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.addChildAt(child, i7);
        ThemedReactContext themedContext = getThemedContext();
        Intrinsics.checkNotNullExpressionValue(themedContext, "getThemedContext(...)");
        Point pointA = sl.a.a(themedContext);
        child.setStyleWidth(pointA.x);
        child.setStyleHeight(pointA.y);
    }
}
