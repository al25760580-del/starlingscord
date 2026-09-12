package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class a0 extends RenderableView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ReadableMap f6663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f6664e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f6665i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Canvas f6666v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f6667w;

    public a0(ReactContext reactContext) {
        super(reactContext);
        this.f6667w = new Paint(1);
    }

    public void c(Canvas canvas, Paint paint, float f2) {
        h();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.f6665i;
            if (bitmap == null) {
                this.f6665i = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f6666v = new Canvas(this.f6665i);
            } else {
                bitmap.recycle();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f6665i = bitmapCreateBitmap;
                this.f6666v.setBitmap(bitmapCreateBitmap);
            }
            this.f6666v.save();
            this.f6666v.setMatrix(canvas.getMatrix());
        } else {
            this.f6666v = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (!(childAt instanceof g0)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!ViewProps.NONE.equals(virtualView.mDisplay)) {
                        boolean z5 = virtualView instanceof RenderableView;
                        if (z5) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.f6666v, this.mCTM);
                        virtualView.render(this.f6666v, paint, f2);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(this.f6666v, iSaveAndSetupCanvas);
                        if (z5) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                        ArrayList<h0> arrayList = virtualView.elements;
                        if (arrayList != null) {
                            this.elements.addAll(arrayList);
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    if (svgView2.getChildCount() > 0) {
                        View childAt2 = svgView2.getChildAt(0);
                        if (childAt2 instanceof a0) {
                            ((a0) childAt2).mergeProperties(this);
                        }
                    }
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.f6666v.restore();
            int iSave = canvas.save();
            canvas.setMatrix(null);
            int i10 = (int) (this.mOpacity * 255.0f);
            Paint paint2 = this.f6667w;
            paint2.setAlpha(i10);
            Bitmap bitmap2 = this.f6665i;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint2);
            }
            canvas.restoreToCount(iSave);
        }
        setClientRect(rectF);
        g();
    }

    public final void d(Canvas canvas, Paint paint, float f2) {
        super.draw(canvas, paint, f2);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f2) {
        i(canvas);
        clip(canvas, paint);
        c(canvas, paint, f2);
        renderMarkers(canvas, paint, f2);
    }

    public Path e(Canvas canvas, Paint paint) {
        Region.Op op2 = Region.Op.UNION;
        Path path = new Path();
        Path.Op opValueOf = Path.Op.valueOf(op2.name());
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (!(childAt instanceof g0) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path pathE = virtualView instanceof a0 ? ((a0) virtualView).e(canvas, paint) : virtualView.getPath(canvas, paint);
                pathE.transform(matrix);
                path.op(pathE, opValueOf);
            }
        }
        return path;
    }

    public final z f() {
        a0 textRoot = getTextRoot();
        textRoot.getClass();
        return textRoot.f6664e;
    }

    public void g() {
        z zVarF = f();
        ArrayList arrayList = zVarF.f6834f;
        ArrayList arrayList2 = zVarF.f6833e;
        ArrayList arrayList3 = zVarF.f6832d;
        ArrayList arrayList4 = zVarF.f6831c;
        ArrayList arrayList5 = zVarF.f6830b;
        ArrayList arrayList6 = zVarF.f6829a;
        arrayList6.remove(zVarF.L);
        ArrayList arrayList7 = zVarF.f6838l;
        arrayList7.remove(zVarF.L);
        ArrayList arrayList8 = zVarF.f6839m;
        arrayList8.remove(zVarF.L);
        ArrayList arrayList9 = zVarF.f6840n;
        arrayList9.remove(zVarF.L);
        ArrayList arrayList10 = zVarF.f6841o;
        arrayList10.remove(zVarF.L);
        ArrayList arrayList11 = zVarF.f6842p;
        arrayList11.remove(zVarF.L);
        int i7 = zVarF.L - 1;
        zVarF.L = i7;
        int i10 = zVarF.B;
        int i11 = zVarF.C;
        int i12 = zVarF.D;
        int i13 = zVarF.E;
        int i14 = zVarF.F;
        zVarF.f6844r = (x) arrayList6.get(i7);
        zVarF.B = ((Integer) arrayList7.get(zVarF.L)).intValue();
        zVarF.C = ((Integer) arrayList8.get(zVarF.L)).intValue();
        zVarF.D = ((Integer) arrayList9.get(zVarF.L)).intValue();
        zVarF.E = ((Integer) arrayList10.get(zVarF.L)).intValue();
        zVarF.F = ((Integer) arrayList11.get(zVarF.L)).intValue();
        if (i10 != zVarF.B) {
            arrayList5.remove(i10);
            zVarF.f6849w = (r0[]) arrayList5.get(zVarF.B);
            zVarF.G = ((Integer) zVarF.f6835g.get(zVarF.B)).intValue();
        }
        if (i11 != zVarF.C) {
            arrayList4.remove(i11);
            zVarF.f6850x = (r0[]) arrayList4.get(zVarF.C);
            zVarF.H = ((Integer) zVarF.f6836h.get(zVarF.C)).intValue();
        }
        if (i12 != zVarF.D) {
            arrayList3.remove(i12);
            zVarF.f6851y = (r0[]) arrayList3.get(zVarF.D);
            zVarF.I = ((Integer) zVarF.f6837i.get(zVarF.D)).intValue();
        }
        if (i13 != zVarF.E) {
            arrayList2.remove(i13);
            zVarF.f6852z = (r0[]) arrayList2.get(zVarF.E);
            zVarF.J = ((Integer) zVarF.j.get(zVarF.E)).intValue();
        }
        if (i14 != zVarF.F) {
            arrayList.remove(i14);
            zVarF.A = (double[]) arrayList.get(zVarF.F);
            zVarF.K = ((Integer) zVarF.k.get(zVarF.F)).intValue();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        this.mPath = new Path();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (!(childAt instanceof g0) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                this.mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return this.mPath;
    }

    public void h() {
        z zVarF = f();
        zVarF.f(this, this.f6663d);
        zVarF.e();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        int iReactTagForTouch;
        VirtualView virtualView;
        int iHitTest;
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        Path clipPath = getClipPath();
        if (clipPath != null) {
            if (this.mClipRegionPath != clipPath) {
                this.mClipRegionPath = clipPath;
                RectF rectF = new RectF();
                this.mClipBounds = rectF;
                clipPath.computeBounds(rectF, true);
                this.mClipRegion = getRegion(clipPath, this.mClipBounds);
            }
            if (!this.mClipRegion.contains(iRound, iRound2)) {
                return -1;
            }
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                if (!(childAt instanceof g0) && (iHitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                    return (virtualView.isResponsible() || iHitTest != childAt.getId()) ? iHitTest : getId();
                }
            } else if ((childAt instanceof SvgView) && (iReactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                return iReactTagForTouch;
            }
        }
        return -1;
    }

    public final void i(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        this.f6664e = new z(this.mScale, rectF.width(), rectF.height());
    }

    @Override // com.horcrux.svg.RenderableView
    public void resetProperties() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
