package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.common.ReactConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 extends RenderableView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f6718e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r0 f6719i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0 f6720v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r0 f6721w;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f2) {
        Canvas canvas2;
        Paint paint2;
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f6717d);
        if (definedTemplate == null) {
            o8.a.v(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f6717d + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f6718e), (float) relativeOnHeight(this.f6719i));
        boolean z5 = definedTemplate instanceof RenderableView;
        if (z5) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int iSaveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof z1) {
            canvas2 = canvas;
            paint2 = paint;
            ((z1) definedTemplate).j(canvas2, paint2, f2, (float) relativeOnWidth(this.f6720v), (float) relativeOnHeight(this.f6721w));
        } else {
            canvas2 = canvas;
            paint2 = paint;
            definedTemplate.draw(canvas2, paint2, f2 * this.mOpacity);
        }
        RectF rectF = new RectF();
        getPath(canvas2, paint2).computeBounds(rectF, true);
        canvas2.getMatrix().mapRect(rectF);
        setClientRect(rectF);
        definedTemplate.restoreCanvas(canvas2, iSaveAndSetupCanvas);
        if (z5) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f6717d);
        if (definedTemplate == null) {
            o8.a.v(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f6717d + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f6718e), (float) relativeOnHeight(this.f6719i));
        path.transform(matrix, path2);
        return path2;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f6717d);
        if (definedTemplate != null) {
            int iHitTest = definedTemplate.hitTest(fArr2);
            if (iHitTest != -1) {
                return (definedTemplate.isResponsible() || iHitTest != definedTemplate.getId()) ? iHitTest : getId();
            }
            return -1;
        }
        o8.a.v(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f6717d + " is not defined.");
        return -1;
    }
}
