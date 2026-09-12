package com.henninghall.date_picker;

import android.widget.LinearLayout;
import com.facebook.imagepipeline.nativecode.c;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import fk.n;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DatePickerManager extends SimpleViewManager<n> {
    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.of(ViewProps.SCROLL, 1);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeRNDatePickerSpec.NAME;
    }

    @ReactPropGroup(names = {"date", "mode", "locale", "maximumDate", "minimumDate", "textColor", "timezoneOffsetInMinutes", "minuteInterval", "is24hourSource", StackTraceHelper.ID_KEY, "dividerColor"})
    public void setProps(n nVar, int i7, Dynamic dynamic) {
        c.P("setProps", nVar, i7, dynamic, getClass());
    }

    @ReactPropGroup(customType = "Style", names = {"height"})
    public void setStyle(n nVar, int i7, Dynamic dynamic) {
        c.P("setStyle", nVar, i7, dynamic, getClass());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public n createViewInstance(ThemedReactContext themedReactContext) {
        return new n(new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(n nVar) {
        super.onAfterUpdateTransaction(nVar);
        try {
            nVar.b();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
