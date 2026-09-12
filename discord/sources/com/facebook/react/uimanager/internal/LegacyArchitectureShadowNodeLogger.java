package com.facebook.react.uimanager.internal;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.common.annotations.LegacyArchitectureShadowNodeWithCxxImpl;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.util.RNLog;
import com.facebook.yoga.YogaMeasureFunction;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/facebook/react/uimanager/internal/LegacyArchitectureShadowNodeLogger;", "", "<init>", "()V", "assertUnsupportedViewManager", "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "shadowNodeClass", "Ljava/lang/Class;", "viewManagerName", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LegacyArchitectureShadowNodeLogger {

    @NotNull
    public static final LegacyArchitectureShadowNodeLogger INSTANCE = new LegacyArchitectureShadowNodeLogger();

    private LegacyArchitectureShadowNodeLogger() {
    }

    public static final void assertUnsupportedViewManager(@NotNull ReactApplicationContext reactContext, @NotNull Class<?> shadowNodeClass, @NotNull String viewManagerName) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(shadowNodeClass, "shadowNodeClass");
        Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
        Class<?>[] interfaces = shadowNodeClass.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        boolean zP = y.p(YogaMeasureFunction.class, interfaces);
        boolean zIsAnnotationPresent = shadowNodeClass.isAnnotationPresent(LegacyArchitectureShadowNodeWithCxxImpl.class);
        if (!zP || zIsAnnotationPresent) {
            return;
        }
        String strB = r.b("\n          [Legacy Architecture] The ViewManager `" + viewManagerName + "` is unlikely to work with the New Architecture.\n          That's because the shadow node `" + shadowNodeClass.getSimpleName() + "` implements the `YogaMeasureFunction.measure()` method.\n          This is not supported in the New Architecture as shadow nodes with custom measurements should be implemented in C++.\n          ");
        if (ReactBuildConfig.DEBUG) {
            RNLog.w(reactContext, strB);
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SOFT_ASSERTIONS, new ReactNoCrashSoftException(strB));
        }
    }
}
