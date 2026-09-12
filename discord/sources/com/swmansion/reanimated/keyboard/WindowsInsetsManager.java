package com.swmansion.reanimated.keyboard;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.e1;
import androidx.core.view.l0;
import androidx.core.view.t;
import androidx.core.view.u0;
import com.discord.R;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.e;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class WindowsInsetsManager {
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;
    private final WeakReference<ReactApplicationContext> mReactContext;
    private boolean mIsStatusBarTranslucent = false;
    private boolean mIsNavigationBarTranslucent = false;
    private final String MissingContextErrorMsg = "Unable to get reference to react activity";

    public WindowsInsetsManager(WeakReference<ReactApplicationContext> weakReference, Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction) {
        this.mReactContext = weakReference;
        this.mKeyboard = keyboard;
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
    }

    private Activity getCurrentActivity() {
        return this.mReactContext.get().getCurrentActivity();
    }

    private FrameLayout.LayoutParams getLayoutParams(int i7, int i10) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mIsStatusBarTranslucent) {
            i7 = 0;
        }
        if (this.mIsNavigationBarTranslucent) {
            i10 = 0;
        }
        layoutParams.setMargins(0, i7, 0, i10);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateInsets$1(int i7, int i10) {
        FrameLayout.LayoutParams layoutParams = getLayoutParams(i7, i10);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            currentActivity.getWindow().getDecorView().findViewById(R.id.action_bar_root).setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateWindowDecor$0(boolean z5) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            e1.k(currentActivity.getWindow(), z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindowInsetsCompat onApplyWindowInsetsListener(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompatK = u0.k(view, windowInsetsCompat);
        if (this.mKeyboard.getState() == KeyboardState.OPEN) {
            this.mKeyboard.updateHeight(windowInsetsCompat, this.mIsNavigationBarTranslucent);
            this.mNotifyAboutKeyboardChange.call();
        }
        setWindowInsets(windowInsetsCompatK);
        return windowInsetsCompatK;
    }

    private void setWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        updateInsets(windowInsetsCompat.f1605a.f(519).f1557b, windowInsetsCompat.f1605a.f(519).f1559d);
    }

    private void updateInsets(int i7, int i10) {
        new Handler(Looper.getMainLooper()).post(new c(this, i7, i10, 0));
    }

    private void updateWindowDecor(boolean z5) {
        new Handler(Looper.getMainLooper()).post(new e(this, z5, 3));
    }

    public void startObservingChanges(KeyboardAnimationCallback keyboardAnimationCallback, boolean z5, boolean z6) {
        this.mIsStatusBarTranslucent = z5;
        this.mIsNavigationBarTranslucent = z6;
        updateWindowDecor(false);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        t tVar = new t() { // from class: com.swmansion.reanimated.keyboard.b
            @Override // androidx.core.view.t
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f7118d.onApplyWindowInsetsListener(view, windowInsetsCompat);
            }
        };
        WeakHashMap weakHashMap = u0.f1729a;
        l0.m(decorView, tVar);
        u0.r(decorView, keyboardAnimationCallback);
    }

    public void stopObservingChanges() {
        updateWindowDecor((this.mIsStatusBarTranslucent || this.mIsNavigationBarTranslucent) ? false : true);
        updateInsets(0, 0);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        u0.r(decorView, null);
        l0.m(decorView, null);
    }
}
