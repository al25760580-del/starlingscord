package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Window;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.views.view.WindowUtilKt;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public class ReactActivityDelegate {
    private final Activity mActivity;
    private final String mMainComponentName;
    private PermissionListener mPermissionListener;
    private Callback mPermissionsCallback;
    private ReactDelegate mReactDelegate;

    @Deprecated
    public ReactActivityDelegate(Activity activity, String str) {
        this.mActivity = activity;
        this.mMainComponentName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0() {
        Window window;
        String mainComponentName = getMainComponentName();
        Bundle bundleComposeLaunchOptions = composeLaunchOptions();
        Activity activity = this.mActivity;
        if (activity != null && (window = activity.getWindow()) != null) {
            WindowUtilKt.updateEdgeToEdgeFeatureFlag(this.mActivity);
            if (Build.VERSION.SDK_INT >= 26 && isWideColorGamutEnabled()) {
                window.setColorMode(1);
            }
        }
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            this.mReactDelegate = new ReactDelegate(getPlainActivity(), getReactHost(), mainComponentName, bundleComposeLaunchOptions);
        } else {
            this.mReactDelegate = new ReactDelegate(getPlainActivity(), getReactNativeHost(), mainComponentName, bundleComposeLaunchOptions, isFabricEnabled()) { // from class: com.facebook.react.ReactActivityDelegate.1
                @Override // com.facebook.react.ReactDelegate
                public ReactRootView createRootView() {
                    ReactRootView reactRootViewCreateRootView = ReactActivityDelegate.this.createRootView();
                    return reactRootViewCreateRootView == null ? super.createRootView() : reactRootViewCreateRootView;
                }
            };
        }
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestPermissionsResult$1(int i7, String[] strArr, int[] iArr, Object[] objArr) {
        PermissionListener permissionListener = this.mPermissionListener;
        if (permissionListener == null || !permissionListener.onRequestPermissionsResult(i7, strArr, iArr)) {
            return;
        }
        this.mPermissionListener = null;
    }

    public Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    public ReactRootView createRootView() {
        return null;
    }

    public Context getContext() {
        Activity activity = this.mActivity;
        io.sentry.config.a.f(activity);
        return activity;
    }

    public ReactContext getCurrentReactContext() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.getCurrentReactContext();
    }

    public Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.mMainComponentName;
    }

    public Activity getPlainActivity() {
        return (Activity) getContext();
    }

    public ReactActivity getReactActivity() {
        return (ReactActivity) getContext();
    }

    public ReactDelegate getReactDelegate() {
        return this.mReactDelegate;
    }

    public ReactHost getReactHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactHost();
    }

    @Deprecated
    public ReactInstanceManager getReactInstanceManager() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.getReactInstanceManager();
    }

    @Deprecated
    public ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactNativeHost();
    }

    public boolean isFabricEnabled() {
        return ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer();
    }

    public boolean isWideColorGamutEnabled() {
        return false;
    }

    public void loadApp(String str) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        Objects.requireNonNull(str);
        reactDelegate.loadApp(str);
        getPlainActivity().setContentView(this.mReactDelegate.getReactRootView());
    }

    public void onActivityResult(int i7, int i10, Intent intent) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onActivityResult(i7, i10, intent, true);
    }

    public boolean onBackPressed() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        am.c block = new am.c(14, this);
        Intrinsics.checkNotNullParameter("ReactActivityDelegate.onCreate::init", "sectionName");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter("ReactActivityDelegate.onCreate::init", "sectionName");
        c0.d("ReactActivityDelegate.onCreate::init");
        try {
            block.run();
        } finally {
            Trace.endSection();
        }
    }

    public void onDestroy() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onHostDestroy();
    }

    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.onKeyDown(i7, keyEvent);
    }

    public boolean onKeyLongPress(int i7, KeyEvent keyEvent) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.onKeyLongPress(i7);
    }

    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.shouldShowDevMenuOrReload(i7, keyEvent);
    }

    public boolean onNewIntent(Intent intent) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        Objects.requireNonNull(intent);
        return reactDelegate.onNewIntent(intent);
    }

    public void onPause() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onHostPause();
    }

    public void onRequestPermissionsResult(final int i7, final String[] strArr, final int[] iArr) {
        LifecycleState lifecycleState;
        Callback callback = new Callback() { // from class: com.facebook.react.b
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                this.f5148d.lambda$onRequestPermissionsResult$1(i7, strArr, iArr, objArr);
            }
        };
        if (isFabricEnabled()) {
            ReactHost reactHost = getReactHost();
            lifecycleState = reactHost != null ? reactHost.getLifecycleState() : LifecycleState.BEFORE_CREATE;
        } else {
            ReactNativeHost reactNativeHost = getReactNativeHost();
            lifecycleState = !reactNativeHost.hasInstance() ? LifecycleState.BEFORE_CREATE : reactNativeHost.getReactInstanceManager().getLifecycleState();
        }
        if (lifecycleState == LifecycleState.RESUMED) {
            callback.invoke(new Object[0]);
        } else {
            this.mPermissionsCallback = callback;
        }
    }

    public void onResume() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onHostResume();
        Callback callback = this.mPermissionsCallback;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.mPermissionsCallback = null;
        }
    }

    public void onUserLeaveHint() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean z5) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onWindowFocusChanged(z5);
    }

    public void requestPermissions(String[] strArr, int i7, PermissionListener permissionListener) {
        this.mPermissionListener = permissionListener;
        getPlainActivity().requestPermissions(strArr, i7);
    }

    public void setReactRootView(ReactRootView reactRootView) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.setReactRootView(reactRootView);
    }

    public void setReactSurface(ReactSurface reactSurface) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.setReactSurface(reactSurface);
    }

    public ReactActivityDelegate(ReactActivity reactActivity, String str) {
        this.mActivity = reactActivity;
        this.mMainComponentName = str;
    }
}
