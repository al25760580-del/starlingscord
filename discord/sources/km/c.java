package km;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.ReanimatedModule;
import ga.l;
import im.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f14591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f14592b;

    public c(ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        this.f14591a = reactApplicationContext;
        this.f14592b = new l(11, false);
    }

    public final void a(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = this.f14591a;
        Intrinsics.checkNotNullParameter(reactApplicationContext, "<this>");
        JavaScriptModule jSModule = reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        Intrinsics.checkNotNullExpressionValue(jSModule, "getJSModule(...)");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule).emit(str, writableMap);
    }

    public final void b(Event event) {
        NodesManager nodesManager;
        Intrinsics.checkNotNullParameter(event, "event");
        ReactApplicationContext reactApplicationContext = this.f14591a;
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        l lVar = this.f14592b;
        if (((ReanimatedModule) lVar.f9547e) == null) {
            lVar.f9547e = (ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class);
        }
        ReanimatedModule reanimatedModule = (ReanimatedModule) lVar.f9547e;
        if (reanimatedModule == null || (nodesManager = reanimatedModule.getNodesManager()) == null) {
            return;
        }
        nodesManager.onEventDispatch(event);
    }
}
