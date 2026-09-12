package com.rnlineargradient;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import fm.a;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = LinearGradientManager.REACT_CLASS)
public class LinearGradientManager extends LinearGradientManagerSpec<a> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POINT = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POINT = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "RNLinearGradient";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public a createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new a(themedReactContext);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(defaultFloat = 45.0f, name = PROP_ANGLE)
    public void setAngle(a aVar, float f2) {
        aVar.setAngle(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(a aVar, ReadableMap readableMap) {
        aVar.setAngleCenter(readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_BORDER_RADII)
    public void setBorderRadii(a aVar, ReadableArray readableArray) {
        aVar.setBorderRadii(readableArray);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_COLORS)
    public void setColors(a aVar, ReadableArray readableArray) {
        aVar.setColors(readableArray);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_END_POINT)
    public void setEndPoint(a aVar, ReadableMap readableMap) {
        aVar.setEndPoint(readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_LOCATIONS)
    public void setLocations(a aVar, ReadableArray readableArray) {
        if (readableArray != null) {
            aVar.setLocations(readableArray);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_START_POINT)
    public void setStartPoint(a aVar, ReadableMap readableMap) {
        aVar.setStartPoint(readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(defaultBoolean = false, name = PROP_USE_ANGLE)
    public void setUseAngle(a aVar, boolean z5) {
        aVar.setUseAngle(z5);
    }
}
