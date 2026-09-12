package gn;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends LayoutShadowNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f10162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f10163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f10164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10165d;

    public o() {
        int[] iArr = ViewProps.PADDING_MARGIN_SPACING_TYPES;
        this.f10163b = new float[iArr.length];
        this.f10164c = new float[iArr.length];
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f10163b[i7] = Float.NaN;
            this.f10164c[i7] = Float.NaN;
        }
    }

    public static float a(j jVar, float f2, float f7) {
        if (jVar == j.f10148d) {
            return f7;
        }
        return jVar == j.f10150i ? Math.max(f2, f7) : f2 + f7;
    }

    public final void b() {
        l lVar = this.f10162a;
        if (lVar == null) {
            return;
        }
        n nVar = lVar.f10157b;
        n nVar2 = n.f10159d;
        float[] fArr = nVar == nVar2 ? this.f10163b : this.f10164c;
        float f2 = fArr[8];
        if (Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        float f7 = f2;
        float f10 = f7;
        float f11 = f10;
        float f12 = fArr[7];
        if (!Float.isNaN(f12)) {
            f2 = f12;
            f10 = f2;
        }
        float f13 = fArr[6];
        if (!Float.isNaN(f13)) {
            f7 = f13;
            f11 = f7;
        }
        float f14 = fArr[1];
        if (!Float.isNaN(f14)) {
            f2 = f14;
        }
        float f15 = fArr[2];
        if (!Float.isNaN(f15)) {
            f7 = f15;
        }
        float f16 = fArr[3];
        if (!Float.isNaN(f16)) {
            f10 = f16;
        }
        float f17 = fArr[0];
        if (!Float.isNaN(f17)) {
            f11 = f17;
        }
        float pixelFromDIP = PixelUtil.toPixelFromDIP(f2);
        float pixelFromDIP2 = PixelUtil.toPixelFromDIP(f7);
        float pixelFromDIP3 = PixelUtil.toPixelFromDIP(f10);
        float pixelFromDIP4 = PixelUtil.toPixelFromDIP(f11);
        k kVar = lVar.f10158c;
        j jVar = kVar.f10155d;
        j jVar2 = kVar.f10154c;
        j jVar3 = kVar.f10153b;
        j jVar4 = kVar.f10152a;
        a aVar = lVar.f10156a;
        if (nVar == nVar2) {
            super.setPadding(1, a(jVar4, aVar.f10128a, pixelFromDIP));
            super.setPadding(2, a(jVar3, aVar.f10129b, pixelFromDIP2));
            super.setPadding(3, a(jVar2, aVar.f10130c, pixelFromDIP3));
            super.setPadding(0, a(jVar, aVar.f10131d, pixelFromDIP4));
            return;
        }
        super.setMargin(1, a(jVar4, aVar.f10128a, pixelFromDIP));
        super.setMargin(2, a(jVar3, aVar.f10129b, pixelFromDIP2));
        super.setMargin(3, a(jVar2, aVar.f10130c, pixelFromDIP3));
        super.setMargin(0, a(jVar, aVar.f10131d, pixelFromDIP4));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.f10165d) {
            this.f10165d = false;
            b();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void setLocalData(Object data) {
        n nVar;
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof l) {
            l lVar = this.f10162a;
            if (lVar != null && (nVar = lVar.f10157b) != ((l) data).f10157b) {
                if (nVar == n.f10159d) {
                    float[] fArr = this.f10163b;
                    super.setPadding(1, fArr[1]);
                    super.setPadding(2, fArr[2]);
                    super.setPadding(3, fArr[3]);
                    super.setPadding(0, fArr[0]);
                } else {
                    float[] fArr2 = this.f10164c;
                    super.setMargin(1, fArr2[1]);
                    super.setMargin(2, fArr2[2]);
                    super.setMargin(3, fArr2[3]);
                    super.setMargin(0, fArr2[0]);
                }
                markUpdated();
            }
            this.f10162a = (l) data;
            this.f10165d = false;
            b();
        }
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int i7, @NotNull Dynamic margin) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        this.f10164c[ViewProps.PADDING_MARGIN_SPACING_TYPES[i7]] = margin.getType() == ReadableType.Number ? (float) margin.asDouble() : Float.NaN;
        super.setMargins(i7, margin);
        this.f10165d = true;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT})
    public void setPaddings(int i7, @NotNull Dynamic padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f10163b[ViewProps.PADDING_MARGIN_SPACING_TYPES[i7]] = padding.getType() == ReadableType.Number ? (float) padding.asDouble() : Float.NaN;
        super.setPaddings(i7, padding);
        this.f10165d = true;
    }
}
