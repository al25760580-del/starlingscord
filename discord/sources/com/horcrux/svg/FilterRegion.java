package com.horcrux.svg;

import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes3.dex */
public class FilterRegion {
    r0 mH;
    r0 mW;
    r0 mX;
    r0 mY;

    private double getRelativeOrDefault(VirtualView virtualView, r0 r0Var, float f2, double d6) {
        return (r0Var == null || r0Var.f6787b == SVGLength$UnitType.UNKNOWN) ? d6 : virtualView.relativeOn(r0Var, f2);
    }

    public Rect getCropRect(VirtualView virtualView, u uVar, RectF rectF) {
        double dRelativeOnFraction;
        double relativeOrDefault;
        double dRelativeOnFraction2;
        double dRelativeOnFraction3;
        if (rectF == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (uVar == u.OBJECT_BOUNDING_BOX) {
            dRelativeOnFraction = virtualView.relativeOnFraction(this.mX, rectF.width()) + ((double) rectF.left);
            dRelativeOnFraction3 = virtualView.relativeOnFraction(this.mY, rectF.height()) + ((double) rectF.top);
            dRelativeOnFraction2 = virtualView.relativeOnFraction(this.mW, rectF.width());
            relativeOrDefault = virtualView.relativeOnFraction(this.mH, rectF.height());
        } else {
            float canvasWidth = virtualView.getSvgView().getCanvasWidth();
            float canvasHeight = virtualView.getSvgView().getCanvasHeight();
            double relativeOrDefault2 = getRelativeOrDefault(virtualView, this.mX, canvasWidth, rectF.left);
            double relativeOrDefault3 = getRelativeOrDefault(virtualView, this.mY, canvasHeight, rectF.top);
            double relativeOrDefault4 = getRelativeOrDefault(virtualView, this.mW, canvasWidth, rectF.width());
            dRelativeOnFraction = relativeOrDefault2;
            relativeOrDefault = getRelativeOrDefault(virtualView, this.mH, canvasHeight, rectF.height());
            dRelativeOnFraction2 = relativeOrDefault4;
            dRelativeOnFraction3 = relativeOrDefault3;
        }
        return new Rect((int) dRelativeOnFraction, (int) dRelativeOnFraction3, (int) (dRelativeOnFraction + dRelativeOnFraction2), (int) (dRelativeOnFraction3 + relativeOrDefault));
    }

    public void setHeight(Dynamic dynamic) {
        this.mH = r0.b(dynamic);
    }

    public void setWidth(Dynamic dynamic) {
        this.mW = r0.b(dynamic);
    }

    public void setX(Dynamic dynamic) {
        this.mX = r0.b(dynamic);
    }

    public void setY(Dynamic dynamic) {
        this.mY = r0.b(dynamic);
    }
}
