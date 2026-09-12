package com.horcrux.svg;

import android.graphics.Rect;
import android.util.SparseArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
class SvgViewManager extends ReactViewManager implements RNSVGSvgViewAndroidManagerInterface<SvgView> {
    public static final String REACT_CLASS = "RNSVGSvgViewAndroid";
    private final ViewManagerDelegate<SvgView> mDelegate = new RNSVGSvgViewAndroidManagerDelegate(this);
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    public static SvgView getSvgViewByTag(int i7) {
        return mTagToSvgView.get(i7);
    }

    public static void runWhenViewIsAvailable(int i7, Runnable runnable) {
        mTagToRunnable.put(i7, runnable);
    }

    public static void setSvgView(int i7, SvgView svgView) {
        mTagToSvgView.put(i7, svgView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i7);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i7);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public ReactViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        return new SvgView(themedReactContext);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ReactViewGroup reactViewGroup) {
        super.onDropViewInstance(reactViewGroup);
        mTagToSvgView.remove(reactViewGroup.getId());
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setAccessible(SvgView svgView, boolean z5) {
        super.setAccessible((ReactViewGroup) svgView, z5);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBackfaceVisibility(SvgView svgView, String str) {
        super.setBackfaceVisibility((ReactViewGroup) svgView, str);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBlockColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 9, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBlockEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 10, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBlockStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 11, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBottomColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 4, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBottomEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 8, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBottomLeftRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 4, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBottomRightRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 3, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderBottomStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 7, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 0, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 6, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderEndEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 9, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderEndStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 10, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderLeftColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 1, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 0, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderRightColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 2, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 5, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderStartEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 11, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderStartStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 12, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderStyle(SvgView svgView, String str) {
        super.setBorderStyle((ReactViewGroup) svgView, str);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderTopColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 3, num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderTopEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 6, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderTopLeftRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 1, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderTopRightRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 2, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setBorderTopStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 5, dynamic);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(SvgView svgView, Integer num) {
        svgView.setCurrentColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setFocusable(SvgView svgView, boolean z5) {
        super.setFocusable((ReactViewGroup) svgView, z5);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setHasTVPreferredFocus(SvgView svgView, boolean z5) {
        super.setTVPreferredFocus(svgView, z5);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setHitSlop(SvgView svgView, Dynamic dynamic) {
        int i7 = w1.f6806a[dynamic.getType().ordinal()];
        if (i7 == 1) {
            ReadableMap readableMapAsMap = dynamic.asMap();
            svgView.setHitSlopRect(new Rect(readableMapAsMap.hasKey(ViewProps.LEFT) ? (int) PixelUtil.toPixelFromDIP(readableMapAsMap.getDouble(ViewProps.LEFT)) : 0, readableMapAsMap.hasKey(ViewProps.TOP) ? (int) PixelUtil.toPixelFromDIP(readableMapAsMap.getDouble(ViewProps.TOP)) : 0, readableMapAsMap.hasKey(ViewProps.RIGHT) ? (int) PixelUtil.toPixelFromDIP(readableMapAsMap.getDouble(ViewProps.RIGHT)) : 0, readableMapAsMap.hasKey(ViewProps.BOTTOM) ? (int) PixelUtil.toPixelFromDIP(readableMapAsMap.getDouble(ViewProps.BOTTOM)) : 0));
        } else {
            if (i7 == 2) {
                int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(dynamic.asDouble());
                svgView.setHitSlopRect(new Rect(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP));
                return;
            }
            if (i7 != 3) {
                o8.a.v(ReactConstants.TAG, "Invalid type for 'hitSlop' value " + dynamic.getType());
            }
            svgView.setHitSlopRect(null);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i7) {
        svgView.setMeetOrSlice(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "minX")
    public void setMinX(SvgView svgView, float f2) {
        svgView.setMinX(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "minY")
    public void setMinY(SvgView svgView, float f2) {
        svgView.setMinY(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNativeBackgroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeBackground(svgView, readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNativeForegroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeForeground(svgView, readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNeedsOffscreenAlphaCompositing(SvgView svgView, boolean z5) {
        super.setNeedsOffscreenAlphaCompositing((ReactViewGroup) svgView, z5);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNextFocusDown(SvgView svgView, int i7) {
        super.nextFocusDown(svgView, i7);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNextFocusForward(SvgView svgView, int i7) {
        super.nextFocusForward(svgView, i7);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNextFocusLeft(SvgView svgView, int i7) {
        super.nextFocusLeft(svgView, i7);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNextFocusRight(SvgView svgView, int i7) {
        super.nextFocusRight(svgView, i7);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setNextFocusUp(SvgView svgView, int i7) {
        super.nextFocusUp(svgView, i7);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(SvgView svgView, String str) {
        try {
            Class<? super Object> superclass = svgView.getClass().getSuperclass();
            if (superclass != null) {
                Method declaredMethod = superclass.getDeclaredMethod("setPointerEvents", PointerEvents.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(svgView, PointerEvents.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    public void setRemoveClippedSubviews(SvgView svgView, boolean z5) {
        super.setRemoveClippedSubviews(svgView, z5);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f2) {
        svgView.setVbHeight(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface
    @ReactProp(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f2) {
        svgView.setVbWidth(f2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(ReactViewGroup reactViewGroup, Object obj) {
        super.updateExtraData(reactViewGroup, obj);
        reactViewGroup.invalidate();
    }
}
