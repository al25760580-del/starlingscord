package com.swmansion.reanimated;

import com.facebook.react.ReactApplication;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;

/* JADX INFO: loaded from: classes3.dex */
public class DevMenuUtils {
    public static void addDevMenuOption(ReactApplicationContext reactApplicationContext, DevOptionHandler devOptionHandler) {
        if (reactApplicationContext.getApplicationContext() instanceof ReactApplication) {
            DevSupportManager devSupportManager = reactApplicationContext.isBridgeless() ? ((ReactApplication) reactApplicationContext.getApplicationContext()).getReactHost().getDevSupportManager() : ((ReactApplication) reactApplicationContext.getApplicationContext()).getReactNativeHost().getReactInstanceManager().getDevSupportManager();
            if (devSupportManager == null) {
                throw new RuntimeException("[Reanimated] DevSupportManager is not available");
            }
            devSupportManager.addCustomDevOption("Toggle slow animations (Reanimated)", devOptionHandler);
        }
    }
}
