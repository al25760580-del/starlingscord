package com.reactnativecommunity.slider;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNCSliderManagerDelegate;
import com.facebook.react.viewmanagers.RNCSliderManagerInterface;
import com.facebook.react.views.textinput.ReactTextChangedEvent;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ml.a;
import ml.c;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "RNCSlider")
public class ReactSliderManager extends SimpleViewManager<a> implements RNCSliderManagerInterface<a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new c();
    private final ViewManagerDelegate<a> mDelegate = new RNCSliderManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ThemedReactContext themedReactContext) {
        a aVar = new a(themedReactContext);
        aVar.setSplitTrack(false);
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.of(ReactTextChangedEvent.EVENT_NAME, MapBuilder.of("registrationName", ReactTextChangedEvent.EVENT_NAME));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("onRNCSliderSlidingStart", MapBuilder.of("registrationName", "onRNCSliderSlidingStart"), "onRNCSliderSlidingComplete", MapBuilder.of("registrationName", "onRNCSliderSlidingComplete"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSlider";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, YogaMeasureMode yogaMeasureMode, float f7, YogaMeasureMode yogaMeasureMode2, float[] fArr) {
        a aVar = new a(context);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return zs.a.I(PixelUtil.toDIPFromPixel(aVar.getMeasuredWidth()), PixelUtil.toDIPFromPixel(aVar.getMeasuredHeight()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext themedReactContext, a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(name = "accessibilityIncrements")
    public void setAccessibilityIncrements(a aVar, ReadableArray readableArray) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        aVar.setAccessibilityIncrements(arrayList2);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(name = "accessibilityUnits")
    public void setAccessibilityUnits(a aVar, String str) {
        aVar.setAccessibilityUnits(str);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(a aVar, boolean z5) {
        aVar.setEnabled(!z5);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(defaultBoolean = false, name = "inverted")
    public void setInverted(a aVar, boolean z5) {
        if (z5) {
            aVar.setScaleX(-1.0f);
        } else {
            aVar.setScaleX(1.0f);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(name = "lowerLimit")
    public void setLowerLimit(a aVar, float f2) {
        aVar.setLowerLimit(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    public void setMaximumTrackImage(a aVar, ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(a aVar, Integer num) {
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.background);
        if (num == null) {
            drawableFindDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            drawableFindDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableFindDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(defaultFloat = 0.0f, name = "maximumValue")
    public void setMaximumValue(a aVar, double d6) {
        aVar.setMaxValue(d6);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    public void setMinimumTrackImage(a aVar, ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(a aVar, Integer num) {
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.progress);
        if (num == null) {
            drawableFindDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            drawableFindDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableFindDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(defaultFloat = 0.0f, name = "minimumValue")
    public void setMinimumValue(a aVar, double d6) {
        aVar.setMinValue(d6);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(defaultFloat = 0.0f, name = "step")
    public void setStep(a aVar, double d6) {
        aVar.setStep(d6);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    public void setTapToSeek(a aVar, boolean z5) {
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    public void setTestID(a aVar, String str) {
        super.setTestId(aVar, str);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(name = "thumbImage")
    public void setThumbImage(a aVar, ReadableMap readableMap) {
        aVar.setThumbImage(readableMap != null ? readableMap.getString("uri") : null);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(defaultFloat = 0.0f, name = "thumbSize")
    public void setThumbSize(a aVar, float f2) {
        aVar.setThumbSize(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(a aVar, Integer num) {
        aVar.setThumbTintColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    public void setTrackImage(a aVar, ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(name = "upperLimit")
    public void setUpperLimit(a aVar, float f2) {
        aVar.setUpperLimit(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    @ReactProp(defaultFloat = 0.0f, name = "value")
    public void setValue(a aVar, float f2) {
        double d6 = f2;
        if (aVar.f15878w) {
            return;
        }
        aVar.setValue(d6);
        if (!aVar.isAccessibilityFocused() || Build.VERSION.SDK_INT <= 29) {
            return;
        }
        aVar.setupAccessibility((int) d6);
    }

    @Override // com.facebook.react.viewmanagers.RNCSliderManagerInterface
    public void setVertical(a aVar, boolean z5) {
    }
}
