package bl;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec;
import com.reactnativedocumentpicker.NativeDocumentPickerSpec;
import com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import io.sentry.react.RNSentryPackage;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements ReactModuleInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3310a;

    public /* synthetic */ b(int i7) {
        this.f3310a = i7;
    }

    @Override // com.facebook.react.module.model.ReactModuleInfoProvider
    public final Map getReactModuleInfos() {
        switch (this.f3310a) {
            case 0:
                return w0.d();
            case 1:
                return w0.d();
            case 2:
                return new HashMap();
            case 3:
                HashMap map = new HashMap();
                map.put("RNSModule", new ReactModuleInfo("RNSModule", "RNSModule", false, false, true, false, true));
                return map;
            case 4:
                return new HashMap();
            case 5:
                Annotation annotation = RNGestureHandlerModule.class.getAnnotation(ReactModule.class);
                Intrinsics.checkNotNull(annotation);
                ReactModule reactModule = (ReactModule) annotation;
                String strName = reactModule.name();
                String name = RNGestureHandlerModule.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return w0.h(new Pair("RNGestureHandlerModule", new ReactModuleInfo(strName, name, reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), true)));
            case 6:
                HashMap map2 = new HashMap();
                map2.put(NativeImageCropPickerSpec.NAME, new ReactModuleInfo(NativeImageCropPickerSpec.NAME, NativeImageCropPickerSpec.NAME, false, false, false, true));
                return map2;
            case 7:
                return RNSentryPackage.lambda$getReactModuleInfoProvider$0();
            case 8:
                return v0.b(new Pair(NativeDocumentPickerSpec.NAME, new ReactModuleInfo(NativeDocumentPickerSpec.NAME, NativeDocumentPickerSpec.NAME, false, false, false, true)));
            case 9:
                HashMap map3 = new HashMap();
                map3.put(NativeKeyboardControllerSpec.NAME, new ReactModuleInfo(NativeKeyboardControllerSpec.NAME, NativeKeyboardControllerSpec.NAME, false, false, false, true));
                map3.put("StatusBarManager", new ReactModuleInfo("StatusBarManager", "StatusBarManager", true, false, false, true));
                return map3;
            default:
                HashMap map4 = new HashMap();
                map4.put("NitroModules", new ReactModuleInfo("NitroModules", "NitroModules", false, false, false, true));
                return map4;
        }
    }
}
