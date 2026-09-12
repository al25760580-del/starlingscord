package qb;

import android.app.Activity;
import android.content.IntentFilter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.github.yamill.orientation.OrientationModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements LifecycleEventListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReactContext f18680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb.a f18681e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c4.d f18682i;

    public b(ReactApplicationContext reactContext, pb.a onGetCurrentActivity) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(onGetCurrentActivity, "onGetCurrentActivity");
        this.f18680d = reactContext;
        this.f18681e = onGetCurrentActivity;
        this.f18682i = new c4.d(5, this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        Activity activity_init_$lambda$1 = OrientationModule._init_$lambda$1(this.f18681e.f17851e);
        if (activity_init_$lambda$1 == null) {
            o8.a.g(ReactConstants.TAG, "no activity to un-register receiver");
            return;
        }
        try {
            activity_init_$lambda$1.unregisterReceiver(this.f18682i);
        } catch (IllegalArgumentException e10) {
            o8.a.h(ReactConstants.TAG, "receiver already unregistered", e10);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        Activity activity_init_$lambda$1 = OrientationModule._init_$lambda$1(this.f18681e.f17851e);
        if (activity_init_$lambda$1 != null) {
            y0.b.f(activity_init_$lambda$1, this.f18682i, new IntentFilter("onConfigurationChanged"), null, 2);
        } else {
            o8.a.g(ReactConstants.TAG, "no activity to register receiver");
        }
        ReactContext reactContext = this.f18680d;
        int i7 = reactContext.getResources().getConfiguration().orientation;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (reactContext.hasActiveReactInstance()) {
            String str = i7 == 1 ? "PORTRAIT" : "LANDSCAPE";
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("orientation", str);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }
}
