package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.activity.OnBackPressedCallback;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.UIManagerConstantsCache;
import com.facebook.react.util.AndroidVersion;
import i.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReactActivity extends h implements DefaultHardwareBackBtnHandler, PermissionAwareActivity {
    private final OnBackPressedCallback mBackPressedCallback = new OnBackPressedCallback(true) { // from class: com.facebook.react.ReactActivity.1
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            setEnabled(false);
            ReactActivity.this.onBackPressed();
            setEnabled(true);
        }
    };
    private final ReactActivityDelegate mDelegate = createReactActivityDelegate();

    public ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegate(this, getMainComponentName());
    }

    public String getMainComponentName() {
        return null;
    }

    public ReactActivityDelegate getReactActivityDelegate() {
        return this.mDelegate;
    }

    public ReactDelegate getReactDelegate() {
        return this.mDelegate.getReactDelegate();
    }

    public ReactHost getReactHost() {
        return this.mDelegate.getReactHost();
    }

    public final ReactInstanceManager getReactInstanceManager() {
        return this.mDelegate.getReactInstanceManager();
    }

    public final ReactNativeHost getReactNativeHost() {
        return this.mDelegate.getReactNativeHost();
    }

    @Override // com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
    public void invokeDefaultOnBackPressed() {
        this.mBackPressedCallback.setEnabled(false);
        super.onBackPressed();
        this.mBackPressedCallback.setEnabled(true);
    }

    public final void loadApp(String str) {
        this.mDelegate.loadApp(str);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        this.mDelegate.onActivityResult(i7, i10, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mDelegate.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // i.h, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mDelegate.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, x0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIManagerConstantsCache.getInstance().init(this);
        this.mDelegate.onCreate(bundle);
        if (AndroidVersion.isAtLeastTargetSdk36(this)) {
            getOnBackPressedDispatcher().a(this, this.mBackPressedCallback);
        }
    }

    @Override // i.h, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mDelegate.onDestroy();
    }

    @Override // i.h, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        return this.mDelegate.onKeyDown(i7, keyEvent) || super.onKeyDown(i7, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i7, KeyEvent keyEvent) {
        return this.mDelegate.onKeyLongPress(i7, keyEvent) || super.onKeyLongPress(i7, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        return this.mDelegate.onKeyUp(i7, keyEvent) || super.onKeyUp(i7, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.mDelegate.onNewIntent(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mDelegate.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        this.mDelegate.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mDelegate.onResume();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.mDelegate.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        this.mDelegate.onWindowFocusChanged(z5);
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public void requestPermissions(String[] strArr, int i7, PermissionListener permissionListener) {
        this.mDelegate.requestPermissions(strArr, i7, permissionListener);
    }
}
