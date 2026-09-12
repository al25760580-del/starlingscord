package com.facebook.react.uimanager.style;

import android.content.Context;
import android.graphics.RectF;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/uimanager/style/BorderInsets;", "", "<init>", "()V", "edgeInsets", "", "", "[Ljava/lang/Float;", "setBorderWidth", "", "edge", "Lcom/facebook/react/uimanager/style/LogicalEdge;", "width", "(Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V", "resolve", "Landroid/graphics/RectF;", ViewProps.LAYOUT_DIRECTION, "", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BorderInsets {

    @NotNull
    private final Float[] edgeInsets = new Float[LogicalEdge.values().length];

    @NotNull
    public final RectF resolve(int layoutDirection, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (layoutDirection == 0) {
            Float f2 = this.edgeInsets[LogicalEdge.START.ordinal()];
            float fFloatValue = (f2 == null && (f2 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f2 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f2 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f2.floatValue();
            Float f7 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
            float fFloatValue2 = (f7 == null && (f7 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f7 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f7 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f7 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f7.floatValue();
            Float f10 = this.edgeInsets[LogicalEdge.END.ordinal()];
            float fFloatValue3 = (f10 == null && (f10 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f10 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f10 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f10.floatValue();
            Float f11 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
            return new RectF(fFloatValue, fFloatValue2, fFloatValue3, (f11 == null && (f11 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f11 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f11 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f11 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f11.floatValue());
        }
        if (layoutDirection != 1) {
            throw new IllegalArgumentException("Expected resolved layout direction");
        }
        if (I18nUtil.INSTANCE.getInstance().doLeftAndRightSwapInRTL(context)) {
            Float f12 = this.edgeInsets[LogicalEdge.END.ordinal()];
            float fFloatValue4 = (f12 == null && (f12 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f12 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f12 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f12.floatValue();
            Float f13 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
            float fFloatValue5 = (f13 == null && (f13 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f13.floatValue();
            Float f14 = this.edgeInsets[LogicalEdge.START.ordinal()];
            float fFloatValue6 = (f14 == null && (f14 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f14 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f14 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f14.floatValue();
            Float f15 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
            return new RectF(fFloatValue4, fFloatValue5, fFloatValue6, (f15 == null && (f15 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f15 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f15 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f15 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f15.floatValue());
        }
        Float f16 = this.edgeInsets[LogicalEdge.END.ordinal()];
        float fFloatValue7 = (f16 == null && (f16 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f16 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f16 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f16.floatValue();
        Float f17 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
        float fFloatValue8 = (f17 == null && (f17 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f17 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f17 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f17 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f17.floatValue();
        Float f18 = this.edgeInsets[LogicalEdge.START.ordinal()];
        float fFloatValue9 = (f18 == null && (f18 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f18 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f18 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f18.floatValue();
        Float f19 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
        return new RectF(fFloatValue7, fFloatValue8, fFloatValue9, (f19 == null && (f19 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f19 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f19 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f19 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f19.floatValue());
    }

    public final void setBorderWidth(@NotNull LogicalEdge edge, Float width) {
        Intrinsics.checkNotNullParameter(edge, "edge");
        this.edgeInsets[edge.ordinal()] = width;
    }
}
