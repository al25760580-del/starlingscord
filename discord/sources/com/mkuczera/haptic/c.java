package com.mkuczera.haptic;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.henninghall.date_picker.NativeRNDatePickerSpec;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ReactModuleInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7009a;

    public /* synthetic */ c(int i7) {
        this.f7009a = i7;
    }

    @Override // com.facebook.react.module.model.ReactModuleInfoProvider
    public final Map getReactModuleInfos() {
        switch (this.f7009a) {
            case 0:
                HashMap map = new HashMap();
                map.put(NativeHapticFeedbackSpec.NAME, new ReactModuleInfo(NativeHapticFeedbackSpec.NAME, NativeHapticFeedbackSpec.NAME, false, false, true, false, true));
                return map;
            case 1:
                HashMap map2 = new HashMap();
                map2.put(NativeRNDatePickerSpec.NAME, new ReactModuleInfo(NativeRNDatePickerSpec.NAME, NativeRNDatePickerSpec.NAME, false, false, true, false, true));
                return map2;
            default:
                HashMap map3 = new HashMap();
                Class cls = new Class[]{ClipboardModule.class}[0];
                ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                map3.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
                return map3;
        }
    }
}
