package bl;

import android.util.Log;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.margelo.nitro.NitroModules;
import com.mdjstack.plaintext.PlainTextViewManager;
import com.reactnativedocumentpicker.NativeDocumentPickerSpec;
import com.reactnativedocumentpicker.RNDocumentPickerModule;
import com.reactnativekeyboardcontroller.KeyboardBackgroundViewManager;
import com.reactnativekeyboardcontroller.KeyboardControllerModule;
import com.reactnativekeyboardcontroller.KeyboardControllerViewManager;
import com.reactnativekeyboardcontroller.KeyboardGestureAreaViewManager;
import com.reactnativekeyboardcontroller.KeyboardToolbarGroupViewManager;
import com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec;
import com.reactnativekeyboardcontroller.OverKeyboardViewManager;
import com.reactnativekeyboardcontroller.StatusBarManagerCompatModule;
import com.swmansion.rnscreens.ModalScreenViewManager;
import com.swmansion.rnscreens.ScreenContainerViewManager;
import com.swmansion.rnscreens.ScreenContentWrapperManager;
import com.swmansion.rnscreens.ScreenFooterManager;
import com.swmansion.rnscreens.ScreenStackHeaderConfigViewManager;
import com.swmansion.rnscreens.ScreenStackHeaderSubviewManager;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import com.swmansion.rnscreens.ScreensModule;
import com.swmansion.rnscreens.SearchBarManager;
import com.swmansion.rnscreens.gamma.stack.host.StackHostViewManager;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreenViewManager;
import com.swmansion.rnscreens.gamma.tabs.TabsHostViewManager;
import com.swmansion.rnscreens.gamma.tabs.TabsScreenViewManager;
import com.swmansion.rnscreens.safearea.SafeAreaViewManager;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import com.th3rdwave.safeareacontext.SafeAreaContextModule;
import com.th3rdwave.safeareacontext.SafeAreaProviderManager;
import java.com.reactnativekeyboardcontroller.ClippingScrollViewDecoratorViewManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends BaseReactPackage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3311a;

    public /* synthetic */ c(int i7) {
        this.f3311a = i7;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactContext) {
        switch (this.f3311a) {
            case 0:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return c0.c(new PlainTextViewManager());
            case 1:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                ScreenDummyLayoutHelper screenDummyLayoutHelper = new ScreenDummyLayoutHelper();
                screenDummyLayoutHelper.f7245y = dn.a.f7687c;
                screenDummyLayoutHelper.E = new WeakReference(reactContext);
                try {
                    System.loadLibrary("react_codegen_rnscreens");
                    break;
                } catch (UnsatisfiedLinkError unused) {
                    Log.w("ScreenDummyLayoutHelper", "[RNScreens] Failed to load react_codegen_rnscreens library.");
                }
                ScreenDummyLayoutHelper.H = new WeakReference(screenDummyLayoutHelper);
                if (!reactContext.hasCurrentActivity() || !screenDummyLayoutHelper.b(reactContext)) {
                    reactContext.addLifecycleEventListener(screenDummyLayoutHelper);
                }
                LifecycleEventListener lifecycleEventListener = com.swmansion.rnscreens.i.f7197d;
                Intrinsics.checkNotNullParameter(reactContext, "context");
                if (com.swmansion.rnscreens.i.f7201w) {
                    Log.w("[RNScreens]", "InsetObserverProxy registers on new context while it has not been invalidated on the old one. Please report this as issue at https://github.com/software-mansion/react-native-screens/issues");
                }
                com.swmansion.rnscreens.i.f7201w = true;
                reactContext.addLifecycleEventListener(lifecycleEventListener);
                return d0.g(new ScreenContainerViewManager(), new ScreenViewManager(), new ModalScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager(), new ScreenFooterManager(), new ScreenContentWrapperManager(), new TabsHostViewManager(), new TabsScreenViewManager(), new SafeAreaViewManager(), new StackHostViewManager(), new StackScreenViewManager());
            case 2:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return d0.g(new SafeAreaProviderManager(), new com.th3rdwave.safeareacontext.SafeAreaViewManager());
            case 3:
            default:
                return super.createViewManagers(reactContext);
            case 4:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return d0.g(new KeyboardControllerViewManager(), new KeyboardGestureAreaViewManager(), new OverKeyboardViewManager(), new KeyboardBackgroundViewManager(), new ClippingScrollViewDecoratorViewManager(), new KeyboardToolbarGroupViewManager());
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public final NativeModule getModule(String name, ReactApplicationContext reactContext) {
        switch (this.f3311a) {
            case 0:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(name, "s");
                Intrinsics.checkNotNullParameter(reactContext, "reactApplicationContext");
                if (Intrinsics.areEqual(name, "RNSModule")) {
                    return new ScreensModule(reactContext);
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                if (Intrinsics.areEqual(name, "RNCSafeAreaContext")) {
                    return new SafeAreaContextModule(reactContext);
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                if (Intrinsics.areEqual(name, NativeDocumentPickerSpec.NAME)) {
                    return new RNDocumentPickerModule(reactContext);
                }
                return null;
            case 4:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                if (Intrinsics.areEqual(name, NativeKeyboardControllerSpec.NAME)) {
                    return new KeyboardControllerModule(reactContext);
                }
                if (Intrinsics.areEqual(name, "StatusBarManager")) {
                    return new StatusBarManagerCompatModule(reactContext);
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                if (Intrinsics.areEqual(name, "NitroModules")) {
                    return new NitroModules(reactContext);
                }
                return null;
        }
    }

    @Override // com.facebook.react.BaseReactPackage
    public final ReactModuleInfoProvider getReactModuleInfoProvider() {
        switch (this.f3311a) {
            case 0:
                return new b(0);
            case 1:
                return new b(3);
            case 2:
                HashMap map = new HashMap();
                Class cls = new Class[]{SafeAreaContextModule.class}[0];
                ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                if (reactModule != null) {
                    String strName = reactModule.name();
                    String strName2 = reactModule.name();
                    String name = cls.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    map.put(strName, new ReactModuleInfo(strName2, name, true, reactModule.needsEagerInit(), reactModule.isCxxModule(), true));
                }
                return new com.facebook.react.runtime.a(map, 2);
            case 3:
                return new b(8);
            case 4:
                return new b(9);
            default:
                return new b(10);
        }
    }
}
