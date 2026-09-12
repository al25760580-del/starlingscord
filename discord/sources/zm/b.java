package zm;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends LayoutShadowNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f24054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24055b;

    public b() {
        int[] iArr = ViewProps.PADDING_MARGIN_SPACING_TYPES;
        this.f24054a = new float[iArr.length];
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f24054a[i7] = Float.NaN;
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.f24055b) {
            this.f24055b = false;
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void setLocalData(Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int i7, @NotNull Dynamic margin) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        this.f24054a[ViewProps.PADDING_MARGIN_SPACING_TYPES[i7]] = margin.getType() == ReadableType.Number ? (float) margin.asDouble() : Float.NaN;
        super.setMargins(i7, margin);
        this.f24055b = true;
    }
}
