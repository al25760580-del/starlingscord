package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.horcrux.svg.events.SvgOnLayoutEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RenderableView extends VirtualView implements ReactHitSlopView {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    static RenderableView contextElement;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;
    private ArrayList<String> mAttributeList;
    private RenderableView mCaller;
    private int mCurrentColor;
    String mFilter;
    private ArrayList<String> mLastMergedList;
    private ArrayList<Object> mOriginProperties;
    private ArrayList<String> mPropList;
    public ReadableArray stroke;
    public r0[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public r0 strokeWidth;
    public int vectorEffect;

    public RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new r0(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = 0.0f;
        this.strokeLinecap = Paint.Cap.BUTT;
        this.strokeLinejoin = Paint.Join.MITER;
        this.mCurrentColor = 0;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }

    private void setupPaint(Paint paint, float f2, ReadableArray readableArray) {
        float f7;
        float f10;
        int[] iArr;
        float[] fArr;
        float[] fArr2;
        int[] iArr2;
        double d6;
        ReadableArray readableArray2;
        RenderableView renderableView;
        ReadableArray readableArray3;
        int i7 = readableArray.getInt(0);
        char c8 = 4;
        int i10 = 1;
        if (i7 == 0) {
            if (readableArray.size() != 2) {
                paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f2) * 255.0d : 255.0f * f2), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
                return;
            } else {
                int iIntValue = readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1);
                paint.setColor((iIntValue & 16777215) | (Math.round((iIntValue >>> 24) * f2) << 24));
                return;
            }
        }
        if (i7 != 1) {
            if (i7 == 2) {
                int currentColor = getCurrentColor();
                paint.setColor((Math.round((currentColor >>> 24) * f2) << 24) | (currentColor & 16777215));
                return;
            }
            if (i7 != 3) {
                if (i7 != 4 || (renderableView = contextElement) == null || (readableArray3 = renderableView.stroke) == null) {
                    return;
                }
                setupPaint(paint, f2, readableArray3);
                return;
            }
            RenderableView renderableView2 = contextElement;
            if (renderableView2 == null || (readableArray2 = renderableView2.fill) == null) {
                return;
            }
            setupPaint(paint, f2, readableArray2);
            return;
        }
        a definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
        if (definedBrush != null) {
            RectF rectF = this.mBox;
            float f11 = this.mScale;
            int i11 = definedBrush.f6655a;
            r0[] r0VarArr = definedBrush.f6656b;
            boolean z5 = definedBrush.f6658d;
            if (!z5) {
                rectF = new RectF(definedBrush.f6661g);
            }
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            if (z5) {
                f10 = rectF.left;
                f7 = rectF.top;
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            RectF rectF2 = new RectF(f10, f7, fWidth + f10, f7 + fHeight);
            float fWidth2 = rectF2.width();
            float fHeight2 = rectF2.height();
            float f12 = rectF2.left;
            float f13 = rectF2.top;
            float textSize = paint.getTextSize();
            if (i11 == 3) {
                double d7 = fWidth2;
                double dA = definedBrush.a(r0VarArr[0], d7, f11, textSize);
                double d8 = fHeight2;
                double dA2 = definedBrush.a(r0VarArr[1], d8, f11, textSize);
                double dA3 = definedBrush.a(r0VarArr[2], d7, f11, textSize);
                double dA4 = definedBrush.a(r0VarArr[3], d8, f11, textSize);
                if (dA3 <= 1.0d || dA4 <= 1.0d) {
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) dA3, (int) dA4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                j0 j0Var = definedBrush.f6662h;
                j0Var.getClass();
                float f14 = j0Var.I;
                float f15 = j0Var.mScale;
                float f16 = j0Var.J;
                RectF rectF3 = new RectF(f14 * f15, f16 * f15, (f14 + j0Var.K) * f15, (f16 + j0Var.L) * f15);
                if (rectF3.width() > 0.0f && rectF3.height() > 0.0f) {
                    RectF rectF4 = new RectF((float) dA, (float) dA2, (float) dA3, (float) dA4);
                    j0 j0Var2 = definedBrush.f6662h;
                    canvas.concat(a5.l0.C(rectF3, rectF4, j0Var2.M, j0Var2.N));
                }
                if (definedBrush.f6659e) {
                    canvas.scale(fWidth2 / f11, fHeight2 / f11);
                }
                definedBrush.f6662h.draw(canvas, new Paint(), f2);
                Matrix matrix = new Matrix();
                Matrix matrix2 = definedBrush.f6660f;
                if (matrix2 != null) {
                    matrix.preConcat(matrix2);
                }
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                return;
            }
            int size = definedBrush.f6657c.size();
            if (size == 0) {
                o8.a.v(ReactConstants.TAG, "Gradient contains no stops");
                return;
            }
            int i12 = size / 2;
            int[] iArr3 = new int[i12];
            float[] fArr3 = new float[i12];
            ReadableArray readableArray4 = definedBrush.f6657c;
            int i13 = 0;
            while (i13 < i12) {
                char c10 = c8;
                int i14 = i13 * 2;
                fArr3[i13] = (float) readableArray4.getDouble(i14);
                int i15 = readableArray4.getInt(i14 + 1);
                iArr3[i13] = (i15 & 16777215) | (Math.round((i15 >>> 24) * f2) << 24);
                i13++;
                c8 = c10;
                i10 = i10;
            }
            char c11 = c8;
            int i16 = i10;
            if (i12 == i16) {
                int[] iArr4 = new int[2];
                iArr4[0] = iArr3[0];
                iArr4[i16] = iArr3[0];
                float[] fArr4 = new float[2];
                fArr4[0] = fArr3[0];
                fArr4[i16] = fArr3[0];
                o8.a.v(ReactConstants.TAG, "Gradient contains only one stop");
                iArr = iArr4;
                fArr = fArr4;
            } else {
                iArr = iArr3;
                fArr = fArr3;
            }
            if (i11 == i16) {
                double d9 = fWidth2;
                double d10 = f12;
                double dA5 = definedBrush.a(r0VarArr[0], d9, f11, textSize) + d10;
                double d11 = fHeight2;
                double d12 = f13;
                LinearGradient linearGradient = new LinearGradient((float) dA5, (float) (definedBrush.a(r0VarArr[i16], d11, f11, textSize) + d12), (float) (definedBrush.a(r0VarArr[2], d9, f11, textSize) + d10), (float) (definedBrush.a(r0VarArr[3], d11, f11, textSize) + d12), iArr, fArr, Shader.TileMode.CLAMP);
                if (definedBrush.f6660f != null) {
                    Matrix matrix3 = new Matrix();
                    matrix3.preConcat(definedBrush.f6660f);
                    linearGradient.setLocalMatrix(matrix3);
                }
                paint.setShader(linearGradient);
                return;
            }
            int[] iArr5 = iArr;
            float[] fArr5 = fArr;
            if (i11 == 2) {
                double d13 = fWidth2;
                double dA6 = definedBrush.a(r0VarArr[2], d13, f11, textSize);
                double d14 = fHeight2;
                double dA7 = definedBrush.a(r0VarArr[3], d14, f11, textSize);
                if (dA6 <= 0.0d || dA7 <= 0.0d) {
                    fArr2 = new float[]{fArr5[0], fArr5[fArr5.length - 1]};
                    iArr2 = new int[]{iArr5[iArr5.length - 1], iArr5[iArr5.length - 1]};
                    dA6 = d13;
                    d6 = d14;
                } else {
                    fArr2 = fArr5;
                    iArr2 = iArr5;
                    d6 = dA7;
                }
                double d15 = d6 / dA6;
                RadialGradient radialGradient = new RadialGradient((float) (((double) f12) + definedBrush.a(r0VarArr[c11], d13, f11, textSize)), (float) ((((double) f13) / d15) + definedBrush.a(r0VarArr[5], d14 / d15, f11, textSize)), (float) dA6, iArr2, fArr2, Shader.TileMode.CLAMP);
                Matrix matrix4 = new Matrix();
                matrix4.preScale(1.0f, (float) d15);
                Matrix matrix5 = definedBrush.f6660f;
                if (matrix5 != null) {
                    matrix4.preConcat(matrix5);
                }
                radialGradient.setLocalMatrix(matrix4);
                paint.setShader(radialGradient);
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f2) {
        float f7 = f2 * this.mOpacity;
        boolean z5 = this.mPath == null;
        if (z5) {
            Path path = getPath(canvas, paint);
            this.mPath = path;
            path.setFillType(this.fillRule);
        }
        boolean z6 = this.vectorEffect == 1;
        Path path2 = this.mPath;
        if (z6) {
            path2 = new Path();
            this.mPath.transform(this.mCTM, path2);
            canvas.setMatrix(null);
        }
        if (z5 || path2 != this.mPath) {
            RectF rectF = new RectF();
            this.mBox = rectF;
            path2.computeBounds(rectF, true);
        }
        RectF rectF2 = new RectF(this.mBox);
        this.mCTM.mapRect(rectF2);
        setClientRect(rectF2);
        clip(canvas, paint);
        if (setupFillPaint(paint, this.fillOpacity * f7)) {
            if (z5) {
                Path path3 = new Path();
                this.mFillPath = path3;
                paint.getFillPath(path2, path3);
            }
            canvas.drawPath(path2, paint);
        }
        if (setupStrokePaint(paint, this.strokeOpacity * f7)) {
            if (z5) {
                Path path4 = new Path();
                this.mStrokePath = path4;
                paint.getFillPath(path2, path4);
            }
            canvas.drawPath(path2, paint);
        }
        renderMarkers(canvas, paint, f7);
    }

    public int getCurrentColor() {
        int i7 = this.mCurrentColor;
        if (i7 != 0) {
            return i7;
        }
        RenderableView renderableView = this.mCaller;
        if (renderableView != null) {
            return renderableView.getCurrentColor();
        }
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((RenderableView) parent).getCurrentColor();
        }
        if (parent instanceof SvgView) {
            return ((SvgView) parent).mCurrentColor;
        }
        return 0;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, com.facebook.react.touch.ReactHitSlopView
    public Rect getHitSlopRect() {
        if (this.mPointerEvents == PointerEvents.BOX_NONE) {
            return new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    public abstract Path getPath(Canvas canvas, Paint paint);

    public Region getRegion(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    @Override // com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        Region region2;
        if (this.mPath == null || !this.mInvertible || this.mPointerEvents == PointerEvents.NONE) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        initBounds();
        Region region3 = this.mRegion;
        if ((region3 != null && region3.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && (region.contains(iRound, iRound2) || ((region2 = this.mMarkerRegion) != null && region2.contains(iRound, iRound2))))) {
            if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                return getId();
            }
            return -1;
        }
        return -1;
    }

    public void initBounds() {
        if (this.mRegion == null && this.mFillPath != null) {
            RectF rectF = new RectF();
            this.mFillBounds = rectF;
            this.mFillPath.computeBounds(rectF, true);
            this.mRegion = getRegion(this.mFillPath, this.mFillBounds);
        }
        if (this.mRegion == null && this.mPath != null) {
            RectF rectF2 = new RectF();
            this.mFillBounds = rectF2;
            this.mPath.computeBounds(rectF2, true);
            this.mRegion = getRegion(this.mPath, this.mFillBounds);
        }
        if (this.mStrokeRegion == null && this.mStrokePath != null) {
            RectF rectF3 = new RectF();
            this.mStrokeBounds = rectF3;
            this.mStrokePath.computeBounds(rectF3, true);
            this.mStrokeRegion = getRegion(this.mStrokePath, this.mStrokeBounds);
        }
        if (this.mMarkerRegion == null && this.mMarkerPath != null) {
            RectF rectF4 = new RectF();
            this.mMarkerBounds = rectF4;
            this.mMarkerPath.computeBounds(rectF4, true);
            this.mMarkerRegion = getRegion(this.mMarkerPath, this.mMarkerBounds);
        }
        Path clipPath = getClipPath();
        if (clipPath == null || this.mClipRegionPath == clipPath) {
            return;
        }
        this.mClipRegionPath = clipPath;
        RectF rectF5 = new RectF();
        this.mClipBounds = rectF5;
        clipPath.computeBounds(rectF5, true);
        this.mClipRegion = getRegion(clipPath, this.mClipBounds);
    }

    public void mergeProperties(RenderableView renderableView) {
        this.mCaller = renderableView;
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        this.mAttributeList = this.mPropList == null ? new ArrayList<>() : new ArrayList<>(this.mPropList);
        int size = attributeList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                String str = attributeList.get(i7);
                Field field = getClass().getField(str);
                Object obj = field.get(renderableView);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(str)) {
                    this.mAttributeList.add(str);
                    field.set(this, obj);
                }
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
        this.mLastMergedList = attributeList;
    }

    public void onReceiveNativeEvent() {
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), SvgOnLayoutEvent.EVENT_NAME, Arguments.createMap());
    }

    @Override // com.horcrux.svg.VirtualView
    public void render(Canvas canvas, Paint paint, float f2) {
        RectF rectF;
        RectF rectF2 = null;
        g0 g0Var = this.mMask != null ? (g0) getSvgView().getDefinedMask(this.mMask) : null;
        v vVar = this.mFilter != null ? (v) getSvgView().getDefinedFilter(this.mFilter) : null;
        if (g0Var == null && vVar == null) {
            draw(canvas, paint, f2);
            return;
        }
        if (vVar != null) {
            Paint paint2 = new Paint(2);
            canvas.saveLayer(null, paint2);
            Bitmap currentBitmap = getSvgView().getCurrentBitmap();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            canvas2.setMatrix(canvas.getMatrix());
            draw(canvas2, paint, f2);
            initBounds();
            RectF clientRect = getClientRect();
            if ((this instanceof c0) && clientRect == null) {
                return;
            }
            HashMap map = vVar.f6800d;
            map.clear();
            map.put("SourceGraphic", bitmapCreateBitmap);
            map.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmapCreateBitmap));
            map.put("BackgroundImage", currentBitmap);
            map.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(currentBitmap));
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getConfig());
            Canvas canvas3 = new Canvas(bitmapCreateBitmap2);
            Rect cropRect = vVar.f6803v.getCropRect(vVar, vVar.f6801e, clientRect);
            int i7 = 0;
            int i10 = 0;
            while (i10 < vVar.getChildCount()) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof o) {
                    o oVar = (o) childAt;
                    bitmapCreateBitmap2.eraseColor(i7);
                    FilterRegion filterRegion = oVar.f6770e;
                    u uVar = vVar.f6802i;
                    Rect cropRect2 = filterRegion.getCropRect(oVar, uVar, uVar == u.USER_SPACE_ON_USE ? new RectF(cropRect) : clientRect);
                    canvas3.drawBitmap(oVar.c(map, bitmapCreateBitmap), cropRect2, cropRect2, (Paint) null);
                    Bitmap bitmapCopy = bitmapCreateBitmap2.copy(Bitmap.Config.ARGB_8888, true);
                    String str = oVar.f6769d;
                    if (str != null) {
                        map.put(str, bitmapCopy);
                    }
                    bitmapCreateBitmap = bitmapCopy;
                } else {
                    Log.e("RNSVG", "Invalid `Filter` child: Filter children can only be `Fe...` components");
                }
                i10++;
                vVar = vVar;
                i7 = 0;
            }
            bitmapCreateBitmap2.eraseColor(i7);
            rectF2 = null;
            canvas3.drawBitmap(bitmapCreateBitmap, cropRect, cropRect, (Paint) null);
            int iSave = canvas.save();
            canvas.setMatrix(null);
            canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint2);
            canvas.restoreToCount(iSave);
        } else {
            canvas.saveLayer(null, new Paint());
            draw(canvas, paint, f2);
        }
        if (g0Var != null) {
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.saveLayer(rectF2, paint3);
            if (g0Var.H == 1) {
                Paint paint4 = new Paint();
                paint4.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f})));
                canvas.saveLayer(null, paint4);
            } else {
                canvas.saveLayer(null, paint);
            }
            if (g0Var.G == 2) {
                float fRelativeOnWidth = (float) relativeOnWidth(g0Var.f6715x);
                float fRelativeOnHeight = (float) relativeOnHeight(g0Var.f6716y);
                rectF = new RectF(fRelativeOnWidth, fRelativeOnHeight, ((float) relativeOnWidth(g0Var.E)) + fRelativeOnWidth, ((float) relativeOnHeight(g0Var.F)) + fRelativeOnHeight);
            } else {
                RectF clientRect2 = getClientRect();
                if ((this instanceof c0) && clientRect2 == null) {
                    return;
                }
                this.mInvCTM.mapRect(clientRect2);
                float fRelativeOnFraction = (float) relativeOnFraction(g0Var.f6715x, clientRect2.width());
                float fRelativeOnFraction2 = (float) relativeOnFraction(g0Var.f6716y, clientRect2.height());
                float fRelativeOnFraction3 = (float) relativeOnFraction(g0Var.E, clientRect2.width());
                float fRelativeOnFraction4 = (float) relativeOnFraction(g0Var.F, clientRect2.height());
                float f7 = clientRect2.left + fRelativeOnFraction;
                float f10 = clientRect2.top + fRelativeOnFraction2;
                rectF = new RectF(f7, f10, fRelativeOnFraction3 + f7, fRelativeOnFraction4 + f10);
            }
            canvas.clipRect(rectF);
            g0Var.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.saveLayer(null, paint3);
            canvas.clipRect(rectF);
            g0Var.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f4 A[PHI: r7
      0x00f4: PHI (r7v24 com.horcrux.svg.k0) = (r7v20 com.horcrux.svg.k0), (r7v26 com.horcrux.svg.k0) binds: [B:39:0x011c, B:30:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc A[PHI: r10
      0x00fc: PHI (r10v15 com.horcrux.svg.k0) = (r10v14 com.horcrux.svg.k0), (r10v20 com.horcrux.svg.k0) binds: [B:42:0x0123, B:33:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    public void renderMarkers(Canvas canvas, Paint paint, float f2) {
        char c8;
        int i7;
        int i10;
        f0 f0Var;
        char c10;
        k0 k0Var;
        int i11;
        k0 k0VarC;
        k0 k0VarC2;
        k0 k0VarC3;
        k0 k0VarC4;
        k0 k0Var2;
        k0 k0VarC5;
        long j;
        f0 f0Var2 = (f0) getSvgView().getDefinedMarker(this.mMarkerStart);
        f0 f0Var3 = (f0) getSvgView().getDefinedMarker(this.mMarkerMid);
        f0 f0Var4 = (f0) getSvgView().getDefinedMarker(this.mMarkerEnd);
        ArrayList<h0> arrayList = this.elements;
        if (arrayList != null) {
            if (f0Var2 == null && f0Var3 == null && f0Var4 == null) {
                return;
            }
            contextElement = this;
            m0.f6750d = new ArrayList();
            char c11 = 0;
            m0.f6751e = 0;
            m0.f6752f = new k0(0.0d, 0.0d);
            m0.f6753g = new k0(0.0d, 0.0d);
            Iterator<h0> it = arrayList.iterator();
            while (true) {
                c8 = 4;
                if (!it.hasNext()) {
                    break;
                }
                h0 next = it.next();
                char c12 = c11;
                k0[] k0VarArr = next.f6726b;
                k0 k0Var3 = null;
                int i12 = next.f6725a;
                int iB = f0.e.b(i12);
                if (iB != 0) {
                    if (iB == 1) {
                        k0 k0Var4 = k0VarArr[1];
                        k0 k0Var5 = m0.f6752f;
                        k0 k0Var6 = k0VarArr[c12];
                        k0 k0VarC6 = m0.c(k0Var6, k0Var5);
                        k0 k0VarC7 = m0.c(k0Var4, k0Var6);
                        if (m0.b(k0VarC6)) {
                            k0VarC6 = k0VarC7;
                        } else if (m0.b(k0VarC7)) {
                            k0VarC7 = k0VarC6;
                        }
                        k0 k0Var7 = k0VarC6;
                        k0VarC4 = k0VarC7;
                        k0Var2 = k0Var4;
                        k0VarC5 = k0Var7;
                    } else if (iB == 2 || iB == 3) {
                        k0Var2 = k0VarArr[c12];
                        k0VarC5 = m0.c(k0Var2, m0.f6752f);
                        k0VarC4 = m0.c(k0Var2, m0.f6752f);
                    } else if (iB != 4) {
                        i11 = 2;
                        k0Var = null;
                        k0VarC = null;
                        k0Var2 = k0Var;
                        k0VarC4 = k0VarC;
                        k0VarC5 = k0Var3;
                    } else {
                        k0Var2 = m0.f6753g;
                        k0VarC5 = m0.c(k0Var2, m0.f6752f);
                        k0VarC4 = m0.c(k0Var2, m0.f6752f);
                    }
                    i11 = 2;
                } else {
                    k0Var = k0VarArr[2];
                    k0 k0VarC8 = m0.c(k0VarArr[c12], m0.f6752f);
                    i11 = 2;
                    k0VarC = m0.c(k0VarArr[2], k0VarArr[1]);
                    if (m0.b(k0VarC8)) {
                        k0 k0Var8 = k0VarArr[c12];
                        k0 k0Var9 = k0VarArr[1];
                        k0 k0Var10 = k0VarArr[2];
                        k0VarC2 = m0.c(k0Var9, k0Var8);
                        k0VarC3 = m0.c(k0Var10, k0Var9);
                        if (m0.b(k0VarC2)) {
                            k0VarC2 = k0VarC3;
                        } else if (m0.b(k0VarC3)) {
                            k0VarC3 = k0VarC2;
                        }
                    } else if (m0.b(k0VarC)) {
                        k0 k0Var11 = m0.f6752f;
                        k0 k0Var12 = k0VarArr[c12];
                        k0 k0Var13 = k0VarArr[1];
                        k0VarC2 = m0.c(k0Var12, k0Var11);
                        k0VarC3 = m0.c(k0Var13, k0Var12);
                        if (m0.b(k0VarC2)) {
                            k0VarC2 = k0VarC3;
                        } else if (m0.b(k0VarC3)) {
                            k0VarC3 = k0VarC2;
                        }
                    } else {
                        k0Var3 = k0VarC8;
                        k0Var2 = k0Var;
                        k0VarC4 = k0VarC;
                        k0VarC5 = k0Var3;
                    }
                    k0 k0Var14 = k0VarC2;
                    k0VarC4 = k0VarC3;
                    k0Var2 = k0Var;
                    k0VarC5 = k0Var14;
                }
                m0.f6755i = k0VarC5;
                int i13 = m0.f6751e;
                if (i13 > 0) {
                    int i14 = i13 == 1 ? 1 : i11;
                    m0.f6750d.add(new m0(i14, m0.f6752f, m0.a(i14)));
                }
                m0.f6754h = k0VarC4;
                m0.f6752f = k0Var2;
                if (i12 == 3) {
                    m0.f6753g = next.f6726b[c12];
                } else {
                    if (i12 == 5) {
                        j = 0;
                        m0.f6753g = new k0(0.0d, 0.0d);
                    }
                    m0.f6751e++;
                    c11 = c12;
                    f0Var2 = f0Var2;
                }
                j = 0;
                m0.f6751e++;
                c11 = c12;
                f0Var2 = f0Var2;
            }
            f0 f0Var5 = f0Var2;
            char c13 = c11;
            int i15 = 1;
            int i16 = 2;
            m0.f6750d.add(new m0(3, m0.f6752f, m0.a(3)));
            ArrayList arrayList2 = m0.f6750d;
            r0 r0Var = this.strokeWidth;
            float fRelativeOnOther = (float) (r0Var != null ? relativeOnOther(r0Var) : 1.0d);
            this.mMarkerPath = new Path();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                m0 m0Var = (m0) it2.next();
                int iB2 = f0.e.b(m0Var.f6756a);
                if (iB2 != 0) {
                    i10 = i15;
                    if (iB2 != i10) {
                        i7 = i16;
                        f0Var = iB2 != i7 ? null : f0Var4;
                    } else {
                        i7 = i16;
                        f0Var = f0Var3;
                    }
                } else {
                    i7 = i16;
                    i10 = i15;
                    f0Var = f0Var5;
                }
                if (f0Var == null) {
                    i15 = i10;
                    i16 = i7;
                } else {
                    Matrix matrix = f0Var.O;
                    int iSaveAndSetupCanvas = f0Var.saveAndSetupCanvas(canvas, f0Var.mCTM);
                    matrix.reset();
                    k0 k0Var15 = m0Var.f6757b;
                    matrix.setTranslate((float) k0Var15.f6743a, (float) k0Var15.f6744b);
                    double d6 = "auto".equals(f0Var.H) ? -1.0d : Double.parseDouble(f0Var.H);
                    if (d6 == -1.0d) {
                        d6 = m0Var.f6758c;
                    }
                    matrix.preRotate(((float) d6) + 180.0f);
                    if ("strokeWidth".equals(f0Var.G)) {
                        float f7 = fRelativeOnOther / f0Var.mScale;
                        matrix.preScale(f7, f7);
                    }
                    RectF rectF = new RectF(0.0f, 0.0f, (float) f0Var.relativeOnWidth(f0Var.E), (float) f0Var.relativeOnHeight(f0Var.F));
                    if (f0Var.M != null) {
                        float f10 = f0Var.I;
                        float f11 = f0Var.mScale;
                        c10 = c8;
                        float f12 = f0Var.J;
                        float[] fArr = new float[9];
                        a5.l0.C(new RectF(f10 * f11, f12 * f11, (f10 + f0Var.K) * f11, (f12 + f0Var.L) * f11), rectF, f0Var.M, f0Var.N).getValues(fArr);
                        matrix.preScale(fArr[c13], fArr[c10]);
                    } else {
                        c10 = c8;
                    }
                    matrix.preTranslate((float) (-f0Var.relativeOnWidth(f0Var.f6707x)), (float) (-f0Var.relativeOnHeight(f0Var.f6708y)));
                    canvas.concat(matrix);
                    f0Var.c(canvas, paint, f2);
                    f0Var.restoreCanvas(canvas, iSaveAndSetupCanvas);
                    this.mMarkerPath.addPath(f0Var.getPath(canvas, paint), matrix);
                    c8 = c10;
                    it2 = it2;
                    f0Var3 = f0Var3;
                    i16 = 2;
                    i15 = 1;
                }
            }
            contextElement = null;
        }
    }

    public void resetProperties() {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = this.mPropList;
            this.mCaller = null;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void setCurrentColor(Integer num) {
        this.mCurrentColor = num != null ? num.intValue() : 0;
        invalidate();
        clearChildCache();
    }

    public void setFill(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.fill = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        if (type.equals(ReadableType.Map)) {
            setFill(dynamic.asMap());
            return;
        }
        int i7 = 0;
        if (type.equals(ReadableType.Number)) {
            this.fill = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.fill = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double d6 = Double.parseDouble(matcher.group());
                int i10 = i7 + 1;
                if (i7 < 3) {
                    d6 /= 255.0d;
                }
                javaOnlyArray.pushDouble(d6);
                i7 = i10;
            }
            this.fill = javaOnlyArray;
        }
        invalidate();
    }

    public void setFillOpacity(float f2) {
        this.fillOpacity = f2;
        invalidate();
    }

    public void setFillRule(int i7) {
        if (i7 == 0) {
            this.fillRule = Path.FillType.EVEN_ODD;
        } else if (i7 != 1) {
            throw new JSApplicationIllegalArgumentException(s0.g.d(i7, "fillRule ", " unrecognized"));
        }
        invalidate();
    }

    public void setFilter(String str) {
        this.mFilter = str;
        invalidate();
    }

    @Override // android.view.View
    public void setId(int i7) {
        super.setId(i7);
        VirtualViewManager.setRenderableView(i7, this);
    }

    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i7 = 0; i7 < readableArray.size(); i7++) {
                this.mPropList.add(readableArray.getString(i7));
            }
        }
        invalidate();
    }

    public void setStroke(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.stroke = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            setStroke(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i7 = 0;
        if (type.equals(ReadableType.Number)) {
            this.stroke = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.stroke = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double d6 = Double.parseDouble(matcher.group());
                int i10 = i7 + 1;
                if (i7 < 3) {
                    d6 /= 255.0d;
                }
                javaOnlyArray.pushDouble(d6);
                i7 = i10;
            }
            this.stroke = javaOnlyArray;
        }
        invalidate();
    }

    public void setStrokeDasharray(Dynamic dynamic) {
        ArrayList arrayListA = r0.a(dynamic);
        if (arrayListA != null) {
            if (arrayListA.size() % 2 == 1) {
                arrayListA.addAll(arrayListA);
            }
            this.strokeDasharray = (r0[]) arrayListA.toArray(new r0[0]);
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    public void setStrokeDashoffset(float f2) {
        this.strokeDashoffset = f2 * this.mScale;
        invalidate();
    }

    public void setStrokeLinecap(int i7) {
        if (i7 == 0) {
            this.strokeLinecap = Paint.Cap.BUTT;
        } else if (i7 == 1) {
            this.strokeLinecap = Paint.Cap.ROUND;
        } else {
            if (i7 != 2) {
                throw new JSApplicationIllegalArgumentException(s0.g.d(i7, "strokeLinecap ", " unrecognized"));
            }
            this.strokeLinecap = Paint.Cap.SQUARE;
        }
        invalidate();
    }

    public void setStrokeLinejoin(int i7) {
        if (i7 == 0) {
            this.strokeLinejoin = Paint.Join.MITER;
        } else if (i7 == 1) {
            this.strokeLinejoin = Paint.Join.ROUND;
        } else {
            if (i7 != 2) {
                throw new JSApplicationIllegalArgumentException(s0.g.d(i7, "strokeLinejoin ", " unrecognized"));
            }
            this.strokeLinejoin = Paint.Join.BEVEL;
        }
        invalidate();
    }

    public void setStrokeMiterlimit(float f2) {
        this.strokeMiterlimit = f2;
        invalidate();
    }

    public void setStrokeOpacity(float f2) {
        this.strokeOpacity = f2;
        invalidate();
    }

    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = dynamic.isNull() ? new r0(1.0d) : r0.b(dynamic);
        invalidate();
    }

    public void setVectorEffect(int i7) {
        this.vectorEffect = i7;
        invalidate();
    }

    public boolean setupFillPaint(Paint paint, float f2) {
        ReadableArray readableArray = this.fill;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f2, this.fill);
        return true;
    }

    public boolean setupStrokePaint(Paint paint, float f2) {
        ReadableArray readableArray;
        paint.reset();
        double dRelativeOnOther = relativeOnOther(this.strokeWidth);
        if (dRelativeOnOther == 0.0d || (readableArray = this.stroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) dRelativeOnOther);
        setupPaint(paint, f2, this.stroke);
        r0[] r0VarArr = this.strokeDasharray;
        if (r0VarArr == null) {
            return true;
        }
        int length = r0VarArr.length;
        float[] fArr = new float[length];
        for (int i7 = 0; i7 < length; i7++) {
            fArr[i7] = (float) relativeOnOther(this.strokeDasharray[i7]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
        return true;
    }

    public void setFill(ReadableMap readableMap) {
        if (readableMap == null) {
            this.fill = null;
            invalidate();
            return;
        }
        int i7 = readableMap.getInt("type");
        if (i7 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.fill = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.fill = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i7 == 1) {
            this.fill = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.fill = JavaOnlyArray.of(Integer.valueOf(i7));
        }
        invalidate();
    }

    public void setStroke(ReadableMap readableMap) {
        if (readableMap == null) {
            this.stroke = null;
            invalidate();
            return;
        }
        int i7 = readableMap.getInt("type");
        if (i7 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.stroke = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.stroke = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i7 == 1) {
            this.stroke = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.stroke = JavaOnlyArray.of(Integer.valueOf(i7));
        }
        invalidate();
    }
}
