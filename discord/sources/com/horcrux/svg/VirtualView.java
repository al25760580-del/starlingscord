package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import com.horcrux.svg.events.SvgOnLayoutEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public abstract class VirtualView extends ReactViewGroup {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private double canvasDiagonal;
    private float canvasHeight;
    private float canvasWidth;
    ArrayList<h0> elements;
    private double fontSize;
    private z glyphContext;
    RectF mBox;
    Matrix mCTM;
    boolean mCTMInvertible;
    private Path mCachedClipPath;
    private RectF mClientRect;
    RectF mClipBounds;
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    String mDisplay;
    RectF mFillBounds;
    Path mFillPath;
    Matrix mInvCTM;
    Matrix mInvMatrix;
    final Matrix mInvTransform;
    boolean mInvertible;
    RectF mMarkerBounds;
    String mMarkerEnd;
    String mMarkerMid;
    Path mMarkerPath;
    Region mMarkerRegion;
    String mMarkerStart;
    String mMask;
    Matrix mMatrix;
    String mName;
    float mOpacity;
    Path mPath;
    PointerEvents mPointerEvents;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    RectF mStrokeBounds;
    Path mStrokePath;
    Region mStrokeRegion;
    private a0 mTextRoot;
    private SvgView svgView;

    public VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mOpacity = 1.0f;
        this.mCTM = new Matrix();
        this.mMatrix = new Matrix();
        this.mInvCTM = new Matrix();
        this.mInvMatrix = new Matrix();
        this.mInvTransform = new Matrix();
        this.mInvertible = true;
        this.mCTMInvertible = true;
        this.fontSize = -1.0d;
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mContext = reactContext;
        this.mScale = DisplayMetricsHolder.getScreenDisplayMetrics().density;
    }

    private void clearParentCache() {
        VirtualView virtualView = this;
        while (true) {
            ViewParent parent = virtualView.getParent();
            if (!(parent instanceof VirtualView)) {
                return;
            }
            virtualView = (VirtualView) parent;
            if (virtualView.mPath == null) {
                return;
            } else {
                virtualView.clearCache();
            }
        }
    }

    private double fromRelativeFast(r0 r0Var) {
        double fontSizeFromContext;
        switch (h2.f6727a[r0Var.f6787b.ordinal()]) {
            case 1:
                fontSizeFromContext = getFontSizeFromContext();
                break;
            case 2:
                fontSizeFromContext = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                fontSizeFromContext = 35.43307d;
                break;
            case 4:
                fontSizeFromContext = 3.543307d;
                break;
            case 5:
                fontSizeFromContext = 90.0d;
                break;
            case 6:
                fontSizeFromContext = 1.25d;
                break;
            case 7:
                fontSizeFromContext = 15.0d;
                break;
            default:
                fontSizeFromContext = 1.0d;
                break;
        }
        return r0Var.f6786a * fontSizeFromContext * ((double) this.mScale);
    }

    private double getCanvasDiagonal() {
        double d6 = this.canvasDiagonal;
        if (d6 != -1.0d) {
            return d6;
        }
        double dSqrt = Math.sqrt(Math.pow(getCanvasHeight(), 2.0d) + Math.pow(getCanvasWidth(), 2.0d)) * M_SQRT1_2l;
        this.canvasDiagonal = dSqrt;
        return dSqrt;
    }

    private float getCanvasHeight() {
        float f2 = this.canvasHeight;
        if (f2 != -1.0f) {
            return f2;
        }
        a0 textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasHeight = getSvgView().getCanvasBounds().height();
        } else {
            this.canvasHeight = textRoot.f6664e.O;
        }
        return this.canvasHeight;
    }

    private float getCanvasWidth() {
        float f2 = this.canvasWidth;
        if (f2 != -1.0f) {
            return f2;
        }
        a0 textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasWidth = getSvgView().getCanvasBounds().width();
        } else {
            this.canvasWidth = textRoot.f6664e.N;
        }
        return this.canvasWidth;
    }

    private double getFontSizeFromContext() {
        double d6 = this.fontSize;
        if (d6 != -1.0d) {
            return d6;
        }
        a0 textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.f6664e;
        }
        double d7 = this.glyphContext.f6843q;
        this.fontSize = d7;
        return d7;
    }

    public void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mMarkerRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    public void clearChildCache() {
        clearCache();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    public void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    public abstract void draw(Canvas canvas, Paint paint, float f2);

    public RectF getClientRect() {
        return this.mClientRect;
    }

    public Path getClipPath() {
        return this.mCachedClipPath;
    }

    public a0 getParentTextRoot() {
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((VirtualView) parent).getTextRoot();
        }
        return null;
    }

    public abstract Path getPath(Canvas canvas, Paint paint);

    public SvgView getSvgView() {
        SvgView svgView = this.svgView;
        if (svgView != null) {
            return svgView;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            this.svgView = (SvgView) parent;
        } else if (parent instanceof VirtualView) {
            this.svgView = ((VirtualView) parent).getSvgView();
        } else {
            o8.a.g(ReactConstants.TAG, "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
        }
        return this.svgView;
    }

    public a0 getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (virtualView != null) {
                if (virtualView instanceof a0) {
                    a0 a0Var = (a0) virtualView;
                    if (a0Var.f6664e != null) {
                        this.mTextRoot = a0Var;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                virtualView = !(parent instanceof VirtualView) ? null : (VirtualView) parent;
            }
        }
        return this.mTextRoot;
    }

    public abstract int hitTest(float[] fArr);

    @Override // android.view.View
    public void invalidate() {
        if ((this instanceof RenderableView) && this.mPath == null) {
            return;
        }
        clearCache();
        clearParentCache();
        super.invalidate();
    }

    public boolean isResponsible() {
        return this.mResponsible;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.mClientRect != null) {
            SvgView svgView = getSvgView();
            int[] iArr = new int[2];
            getSvgView().getLocationOnScreen(iArr);
            Rect rect = new Rect();
            boolean z5 = false;
            rect.left = iArr[0] + ((int) Math.floor(this.mClientRect.left));
            rect.top = iArr[1] + ((int) Math.floor(this.mClientRect.top));
            rect.right = rect.left + ((int) Math.ceil(this.mClientRect.width()));
            rect.bottom = rect.top + ((int) Math.ceil(this.mClientRect.height()));
            Rect rect2 = new Rect();
            if (svgView.getGlobalVisibleRect(rect2) && rect.intersect(rect2)) {
                z5 = true;
            }
            String canonicalName = getClass().getCanonicalName();
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setClassName(canonicalName);
            accessibilityNodeInfo.setVisibleToUser(z5);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        RectF rectF = this.mClientRect;
        if (rectF == null) {
            return;
        }
        if (!(this instanceof a0)) {
            int iFloor = (int) Math.floor(rectF.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil = (int) Math.ceil(this.mClientRect.right);
            int iCeil2 = (int) Math.ceil(this.mClientRect.bottom);
            setLeft(iFloor);
            setTop(iFloor2);
            setRight(iCeil);
            setBottom(iCeil2);
        }
        setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onMeasure(int i7, int i10) {
        RectF rectF = this.mClientRect;
        int iCeil = rectF != null ? (int) Math.ceil(rectF.width()) : View.getDefaultSize(getSuggestedMinimumWidth(), i7);
        RectF rectF2 = this.mClientRect;
        setMeasuredDimension(iCeil, rectF2 != null ? (int) Math.ceil(rectF2.height()) : View.getDefaultSize(getSuggestedMinimumHeight(), i10));
    }

    public double relativeOn(r0 r0Var, float f2) {
        double d6;
        SVGLength$UnitType sVGLength$UnitType = r0Var.f6787b;
        double d7 = r0Var.f6786a;
        if (sVGLength$UnitType == SVGLength$UnitType.NUMBER) {
            d6 = this.mScale;
        } else {
            if (sVGLength$UnitType != SVGLength$UnitType.PERCENTAGE) {
                return fromRelativeFast(r0Var);
            }
            d7 /= 100.0d;
            d6 = f2;
        }
        return d7 * d6;
    }

    public double relativeOnFraction(r0 r0Var, float f2) {
        SVGLength$UnitType sVGLength$UnitType = r0Var.f6787b;
        double d6 = r0Var.f6786a;
        if (sVGLength$UnitType != SVGLength$UnitType.NUMBER) {
            if (sVGLength$UnitType != SVGLength$UnitType.PERCENTAGE) {
                return fromRelativeFast(r0Var);
            }
            d6 /= 100.0d;
        }
        return d6 * ((double) f2);
    }

    public double relativeOnHeight(r0 r0Var) {
        SvgView svgView = getSvgView();
        return (r0Var.f6787b != SVGLength$UnitType.PERCENTAGE || svgView == null || svgView.getViewBox().height() == 0.0f) ? relativeOn(r0Var, getCanvasHeight()) : relativeOn(r0Var, svgView.getViewBox().height());
    }

    public double relativeOnOther(r0 r0Var) {
        return relativeOn(r0Var, (float) getCanvasDiagonal());
    }

    public double relativeOnWidth(r0 r0Var) {
        SvgView svgView = getSvgView();
        return (r0Var.f6787b != SVGLength$UnitType.PERCENTAGE || svgView == null || svgView.getViewBox().width() == 0.0f) ? relativeOn(r0Var, getCanvasWidth()) : relativeOn(r0Var, svgView.getViewBox().width());
    }

    public void render(Canvas canvas, Paint paint, float f2) {
        draw(canvas, paint, f2);
    }

    public void restoreCanvas(Canvas canvas, int i7) {
        canvas.restoreToCount(i7);
    }

    public int saveAndSetupCanvas(Canvas canvas, Matrix matrix) {
        int iSave = canvas.save();
        this.mCTM.set(this.mMatrix);
        canvas.concat(this.mCTM);
        this.mCTM.preConcat(matrix);
        this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
        return iSave;
    }

    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    public void setClientRect(RectF rectF) {
        SvgView svgView;
        RectF rectF2 = this.mClientRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.mClientRect = rectF;
            if (rectF == null) {
                return;
            }
            int iCeil = (int) Math.ceil(rectF.width());
            int iCeil2 = (int) Math.ceil(this.mClientRect.height());
            int iFloor = (int) Math.floor(this.mClientRect.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil3 = (int) Math.ceil(this.mClientRect.right);
            int iCeil4 = (int) Math.ceil(this.mClientRect.bottom);
            setMeasuredDimension(iCeil, iCeil2);
            if (!(this instanceof a0) && (svgView = getSvgView()) != null) {
                setLeft(Math.max(iFloor, 0));
                setTop(Math.max(iFloor2, 0));
                setRight(Math.min(iCeil3, svgView.getWidth()));
                setBottom(Math.min(iCeil4, svgView.getHeight()));
            }
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.mContext, getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new SvgOnLayoutEvent(UIManagerHelper.getSurfaceId(this), getId(), iFloor, iFloor2, iCeil, iCeil2));
            }
        }
    }

    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    public void setClipRule(int i7) {
        this.mClipRule = i7;
        invalidate();
    }

    public void setDisplay(String str) {
        this.mDisplay = str;
        invalidate();
    }

    public void setMarkerEnd(String str) {
        this.mMarkerEnd = str;
        invalidate();
    }

    public void setMarkerMid(String str) {
        this.mMarkerMid = str;
        invalidate();
    }

    public void setMarkerStart(String str) {
        this.mMarkerStart = str;
        invalidate();
    }

    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    public void setMatrix(Dynamic dynamic) {
        setMatrix((dynamic.isNull() || !dynamic.getType().equals(ReadableType.Array)) ? null : dynamic.asArray());
    }

    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    public void setOpacity(float f2) {
        this.mOpacity = f2;
        invalidate();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup
    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    public void setResponsible(boolean z5) {
        this.mResponsible = z5;
        invalidate();
    }

    public Path getClipPath(Canvas canvas, Paint paint) {
        Path pathE;
        if (this.mClipPath != null) {
            c cVar = (c) getSvgView().getDefinedClipPath(this.mClipPath);
            if (cVar != null) {
                if (this.mClipRule == 0) {
                    pathE = cVar.getPath(canvas, paint);
                } else {
                    Region.Op op2 = Region.Op.UNION;
                    pathE = cVar.e(canvas, paint);
                }
                pathE.transform(cVar.mMatrix);
                int i7 = this.mClipRule;
                if (i7 == 0) {
                    pathE.setFillType(Path.FillType.EVEN_ODD);
                } else if (i7 != 1) {
                    o8.a.v(ReactConstants.TAG, "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                }
                this.mCachedClipPath = pathE;
            } else {
                o8.a.v(ReactConstants.TAG, "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }

    public void setMatrix(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int iC = a.a.C(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                    this.mInvMatrix = new Matrix();
                }
                this.mMatrix.setValues(fArr);
                this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
            } else if (iC != -1) {
                o8.a.v(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix.reset();
            this.mInvMatrix.reset();
            this.mInvertible = true;
        }
        super.invalidate();
        clearParentCache();
    }
}
