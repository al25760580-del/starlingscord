package org.reactnative.maskedview;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import bt.a;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

/* JADX INFO: loaded from: classes.dex */
public class RNCMaskedViewManager extends ViewGroupManager<a> {
    private static final String REACT_CLASS = "RNCMaskedView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "androidRenderingMode")
    public void setAndroidRenderingMode(a aVar, String str) {
        if (str != null) {
            aVar.setRenderingMode(str);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ThemedReactContext themedReactContext) {
        a aVar = new a(themedReactContext);
        aVar.f3395d = null;
        aVar.f3396e = false;
        aVar.f3399w = 2;
        aVar.f3397i = new Paint(1);
        aVar.f3398v = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        return aVar;
    }
}
