package io.sentry.react;

import androidx.annotation.NonNull;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import io.sentry.react.replay.RNSentryReplayMaskManager;
import io.sentry.react.replay.RNSentryReplayMaskManagerImpl;
import io.sentry.react.replay.RNSentryReplayUnmaskManager;
import io.sentry.react.replay.RNSentryReplayUnmaskManagerImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class RNSentryPackage extends TurboReactPackage {
    private static final boolean isTurboModule = true;

    private NativeModule getFabricComponentNativeModule(String str) {
        if (RNSentryReplayMaskManagerImpl.REACT_CLASS.equals(str)) {
            return new RNSentryReplayMaskManager();
        }
        if (RNSentryReplayUnmaskManagerImpl.REACT_CLASS.equals(str)) {
            return new RNSentryReplayUnmaskManager();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap map = new HashMap();
        map.put("RNSentry", new ReactModuleInfo("RNSentry", "RNSentry", false, false, true, false, true));
        map.put(RNSentryReplayMaskManagerImpl.REACT_CLASS, new ReactModuleInfo(RNSentryReplayMaskManagerImpl.REACT_CLASS, RNSentryReplayMaskManagerImpl.REACT_CLASS, false, false, false, false, true));
        map.put(RNSentryReplayUnmaskManagerImpl.REACT_CLASS, new ReactModuleInfo(RNSentryReplayUnmaskManagerImpl.REACT_CLASS, RNSentryReplayUnmaskManagerImpl.REACT_CLASS, false, false, false, false, true));
        return map;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @NonNull
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {new RNSentryOnDrawReporterManager(reactApplicationContext), new RNSentryReplayMaskManager(), new RNSentryReplayUnmaskManager()};
        ArrayList arrayList = new ArrayList(3);
        for (int i7 = 0; i7 < 3; i7++) {
            Object obj = objArr[i7];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return "RNSentry".equals(str) ? new RNSentryModule(reactApplicationContext) : getFabricComponentNativeModule(str);
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new bl.b(7);
    }
}
