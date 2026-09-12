package com.github.yamill.orientation;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pb.b;
import qb.a;
import qb.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010 J\u000f\u0010$\u001a\u00020\u000bH\u0007¢\u0006\u0004\b$\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010)R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010)¨\u0006*"}, d2 = {"Lcom/github/yamill/orientation/OrientationModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lpb/b;", "lockState", "", "autoRotateEnabled", "autoRotateIgnored", "", "updateOrientation", "(Lpb/b;ZZ)V", "", "orientation", "", "getOrientationString", "(I)Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "", "getConstants", "()Ljava/util/Map;", "Lcom/facebook/react/bridge/Callback;", "callback", "getOrientation", "(Lcom/facebook/react/bridge/Callback;)V", "ignoreAutoRotate", "(Z)V", "lockToPortrait", "()V", "lockToLandscape", "lockToLandscapeLeft", "lockToLandscapeRight", "unlockAllOrientations", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "Lpb/b;", "Z", "react-native-orientation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrientationModule extends ReactContextBaseJavaModule {
    private boolean autoRotateEnabled;
    private boolean autoRotateIgnored;
    private b lockState;

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrientationModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        reactContext.addLifecycleEventListener(new a(reactContext, new kotlin.collections.a(12, this)));
        reactContext.addLifecycleEventListener(new qb.b(reactContext, new pb.a(this, 0)));
        reactContext.addLifecycleEventListener(new e(reactContext, new pb.a(this, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(OrientationModule orientationModule, boolean z5) {
        updateOrientation$default(orientationModule, null, z5, false, 5, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity _init_$lambda$1(OrientationModule orientationModule) {
        return orientationModule.reactContext.getCurrentActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity _init_$lambda$2(OrientationModule orientationModule) {
        return orientationModule.reactContext.getCurrentActivity();
    }

    private final String getOrientationString(int orientation) {
        if (orientation == 0) {
            return "UNKNOWN";
        }
        if (orientation == 1) {
            return "PORTRAIT";
        }
        if (orientation != 2) {
            return null;
        }
        return "LANDSCAPE";
    }

    private final void updateOrientation(b lockState, boolean autoRotateEnabled, boolean autoRotateIgnored) {
        Activity currentActivity;
        Activity currentActivity2;
        if (this.lockState == lockState && this.autoRotateEnabled == autoRotateEnabled && this.autoRotateIgnored == autoRotateIgnored) {
            return;
        }
        this.lockState = lockState;
        this.autoRotateEnabled = autoRotateEnabled;
        this.autoRotateIgnored = autoRotateIgnored;
        if (lockState == null) {
            return;
        }
        if ((autoRotateEnabled || autoRotateIgnored) && (currentActivity = this.reactContext.getCurrentActivity()) != null) {
            currentActivity.setRequestedOrientation(lockState.f17858d);
        }
        if (autoRotateEnabled || autoRotateIgnored || lockState == b.UNSPECIFIED || (currentActivity2 = this.reactContext.getCurrentActivity()) == null) {
            return;
        }
        currentActivity2.setRequestedOrientation(-1);
    }

    public static /* synthetic */ void updateOrientation$default(OrientationModule orientationModule, b bVar, boolean z5, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bVar = orientationModule.lockState;
        }
        if ((i7 & 2) != 0) {
            z5 = orientationModule.autoRotateEnabled;
        }
        if ((i7 & 4) != 0) {
            z6 = orientationModule.autoRotateIgnored;
        }
        orientationModule.updateOrientation(bVar, z5, z6);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @NotNull
    public Map<String, Object> getConstants() {
        return a3.e.v("initialOrientation", getOrientationString(getReactApplicationContext().getResources().getConfiguration().orientation));
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Orientation";
    }

    @ReactMethod
    public final void getOrientation(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i7 = getReactApplicationContext().getResources().getConfiguration().orientation;
        String orientationString = getOrientationString(i7);
        if (orientationString == null) {
            callback.invoke(Integer.valueOf(i7), null);
        } else {
            callback.invoke(null, orientationString);
        }
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @ReactMethod
    public final void ignoreAutoRotate(boolean ignoreAutoRotate) {
        updateOrientation$default(this, null, false, ignoreAutoRotate, 3, null);
    }

    @ReactMethod
    public final void lockToLandscape() {
        updateOrientation$default(this, b.LOCKED_LANDSCAPE, false, false, 6, null);
    }

    @ReactMethod
    public final void lockToLandscapeLeft() {
        updateOrientation$default(this, b.LOCKED_LANDSCAPE_LEFT, false, false, 6, null);
    }

    @ReactMethod
    public final void lockToLandscapeRight() {
        updateOrientation$default(this, b.LOCKED_LANDSCAPE_RIGHT, false, false, 6, null);
    }

    @ReactMethod
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void lockToPortrait() {
        updateOrientation$default(this, b.LOCKED_PORTRAIT, false, false, 6, null);
    }

    @ReactMethod
    public final void unlockAllOrientations() {
        updateOrientation$default(this, b.UNLOCKED, false, false, 6, null);
    }
}
