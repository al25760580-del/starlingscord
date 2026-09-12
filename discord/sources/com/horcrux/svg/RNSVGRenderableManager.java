package com.horcrux.svg;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.rnlineargradient.LinearGradientManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "RNSVGRenderableModule")
class RNSVGRenderableManager extends NativeSvgRenderableModuleSpec {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int EOF = -1;
    public static final String NAME = "RNSVGRenderableModule";

    public RNSVGRenderableManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getBBox(Double d6, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d6.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        boolean z5 = readableMap.getBoolean("fill");
        boolean z6 = readableMap.getBoolean("stroke");
        boolean z7 = readableMap.getBoolean("markers");
        boolean z10 = readableMap.getBoolean("clipped");
        try {
            renderableViewByTag.getPath(null, null);
            float f2 = renderableViewByTag.mScale;
            renderableViewByTag.initBounds();
            RectF rectF = new RectF();
            RectF rectF2 = renderableViewByTag.mFillBounds;
            RectF rectF3 = renderableViewByTag.mStrokeBounds;
            RectF rectF4 = renderableViewByTag.mMarkerBounds;
            RectF rectF5 = renderableViewByTag.mClipBounds;
            if (z5 && rectF2 != null) {
                rectF.union(rectF2);
            }
            if (z6 && rectF3 != null) {
                rectF.union(rectF3);
            }
            if (z7 && rectF4 != null) {
                rectF.union(rectF4);
            }
            if (z10 && rectF5 != null) {
                rectF.intersect(rectF5);
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", rectF.left / f2);
            writableMapCreateMap.putDouble("y", rectF.top / f2);
            writableMapCreateMap.putDouble("width", rectF.width() / f2);
            writableMapCreateMap.putDouble("height", rectF.height() / f2);
            return writableMapCreateMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCTM(Double d6) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d6.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float f2 = renderableViewByTag.mScale;
        Matrix matrix = new Matrix(renderableViewByTag.mCTM);
        SvgView svgView = renderableViewByTag.getSvgView();
        if (svgView == null) {
            throw new RuntimeException("Did not find parent SvgView for view with tag: " + d6);
        }
        matrix.preConcat(svgView.mInvViewBoxMatrix);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("a", fArr[0]);
        writableMapCreateMap.putDouble("b", fArr[3]);
        writableMapCreateMap.putDouble("c", fArr[1]);
        writableMapCreateMap.putDouble("d", fArr[4]);
        writableMapCreateMap.putDouble("e", fArr[2] / f2);
        writableMapCreateMap.putDouble("f", fArr[5] / f2);
        return writableMapCreateMap;
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGRenderableModule";
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPointAtLength(Double d6, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d6.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        try {
            PathMeasure pathMeasure = new PathMeasure(renderableViewByTag.getPath(null, null), false);
            float f2 = (float) readableMap.getDouble("length");
            float f7 = renderableViewByTag.mScale;
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            pathMeasure.getPosTan(Math.max(0.0f, Math.min(f2 * f7, pathMeasure.getLength())), fArr, fArr2);
            double dAtan2 = Math.atan2(fArr2[1], fArr2[0]);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", fArr[0] / f7);
            writableMapCreateMap.putDouble("y", fArr[1] / f7);
            writableMapCreateMap.putDouble(LinearGradientManager.PROP_ANGLE, dAtan2);
            return writableMapCreateMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod
    public void getRawResource(String str, Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Resources resources = reactApplicationContext.getResources();
            InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", reactApplicationContext.getPackageName()));
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, StandardCharsets.UTF_8);
                char[] cArr = new char[4096];
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int i7 = inputStreamReader.read(cArr, 0, 4096);
                    if (i7 == -1) {
                        promise.resolve(sb2.toString());
                        try {
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    sb2.append(cArr, 0, i7);
                }
            } finally {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused2) {
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            promise.reject(e10);
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getScreenCTM(Double d6) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d6.intValue());
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float[] fArr = new float[9];
        renderableViewByTag.mCTM.getValues(fArr);
        float f2 = renderableViewByTag.mScale;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("a", fArr[0]);
        writableMapCreateMap.putDouble("b", fArr[3]);
        writableMapCreateMap.putDouble("c", fArr[1]);
        writableMapCreateMap.putDouble("d", fArr[4]);
        writableMapCreateMap.putDouble("e", fArr[2] / f2);
        writableMapCreateMap.putDouble("f", fArr[5] / f2);
        return writableMapCreateMap;
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalLength(Double d6) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d6.intValue());
        if (renderableViewByTag == null) {
            return 0.0d;
        }
        try {
            return new PathMeasure(renderableViewByTag.getPath(null, null), false).getLength() / renderableViewByTag.mScale;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return -1.0d;
        }
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInFill(Double d6, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d6.intValue());
        if (renderableViewByTag == null) {
            return false;
        }
        float f2 = renderableViewByTag.mScale;
        return renderableViewByTag.hitTest(new float[]{((float) readableMap.getDouble("x")) * f2, ((float) readableMap.getDouble("y")) * f2}) != -1;
    }

    @Override // com.horcrux.svg.NativeSvgRenderableModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInStroke(Double d6, ReadableMap readableMap) {
        RenderableView renderableViewByTag = VirtualViewManager.getRenderableViewByTag(d6.intValue());
        if (renderableViewByTag == null) {
            return false;
        }
        try {
            renderableViewByTag.getPath(null, null);
            renderableViewByTag.initBounds();
            double d7 = renderableViewByTag.mScale;
            int i7 = (int) (readableMap.getDouble("x") * d7);
            int i10 = (int) (readableMap.getDouble("y") * d7);
            Region region = renderableViewByTag.mStrokeRegion;
            return region != null && region.contains(i7, i10);
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return false;
        }
    }
}
