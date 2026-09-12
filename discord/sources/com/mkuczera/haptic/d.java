package com.mkuczera.haptic;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.henninghall.date_picker.DatePickerManager;
import com.henninghall.date_picker.DatePickerModule;
import com.henninghall.date_picker.NativeRNDatePickerSpec;
import com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec;
import com.reactnative.ivpusic.imagepicker.PickerModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends TurboReactPackage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ReactApplicationContext f7010b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7011a;

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        switch (this.f7011a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new DatePickerModule(reactApplicationContext));
                return arrayList;
            case 2:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new PickerModule(reactApplicationContext));
                return arrayList2;
            default:
                return super.createNativeModules(reactApplicationContext);
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.f7011a) {
            case 1:
                f7010b = reactApplicationContext;
                return Arrays.asList(new DatePickerManager());
            default:
                return super.createViewManagers(reactApplicationContext);
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        switch (this.f7011a) {
            case 0:
                if (str.equals(NativeHapticFeedbackSpec.NAME)) {
                    return new RNReactNativeHapticFeedbackModule(reactApplicationContext);
                }
                return null;
            case 1:
                if (!str.equals(NativeRNDatePickerSpec.NAME)) {
                    return null;
                }
                f7010b = reactApplicationContext;
                return new DatePickerModule(reactApplicationContext);
            default:
                if (str.equals(NativeImageCropPickerSpec.NAME)) {
                    return new PickerModule(reactApplicationContext);
                }
                return null;
        }
    }

    @Override // com.facebook.react.BaseReactPackage
    public final ReactModuleInfoProvider getReactModuleInfoProvider() {
        switch (this.f7011a) {
            case 0:
                return new c(0);
            case 1:
                return new c(1);
            default:
                return new bl.b(6);
        }
    }
}
