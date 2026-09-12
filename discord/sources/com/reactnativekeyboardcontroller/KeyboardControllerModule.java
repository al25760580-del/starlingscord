package com.reactnativekeyboardcontroller;

import a1.l;
import android.view.View;
import bc.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yl.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u0011R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;", "Lcom/reactnativekeyboardcontroller/NativeKeyboardControllerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "mReactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "", "mode", "", "setInputMode", "(D)V", "setDefaultMode", "()V", "preload", "", "keepFocus", "animated", "dismiss", "(ZZ)V", "direction", "setFocusTo", "(Ljava/lang/String;)V", "viewTag", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "viewPositionInWindow", "(DLcom/facebook/react/bridge/Promise;)V", "eventName", "addListener", "count", "removeListeners", "Lyl/c;", "module", "Lyl/c;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyboardControllerModule extends NativeKeyboardControllerSpec {

    @NotNull
    private final c module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardControllerModule(@NotNull ReactApplicationContext mReactContext) {
        super(mReactContext);
        Intrinsics.checkNotNullParameter(mReactContext, "mReactContext");
        this.module = new c(mReactContext);
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void addListener(String eventName) {
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void dismiss(boolean keepFocus, boolean animated) {
        this.module.f23392a.getCurrentActivity();
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NativeKeyboardControllerSpec.NAME;
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        this.module.getClass();
        return w0.h(new Pair("keyboardBorderRadius", 0));
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void preload() {
        this.module.getClass();
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void removeListeners(double count) {
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void setDefaultMode() {
        c cVar = this.module;
        UiThreadUtil.runOnUiThread(new l(cVar.f23394c, 8, cVar));
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void setFocusTo(@NotNull String direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.module.getClass();
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (Intrinsics.areEqual(direction, "current")) {
            UiThreadUtil.runOnUiThread(new a(17));
        }
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void setInputMode(double mode) {
        c cVar = this.module;
        cVar.getClass();
        UiThreadUtil.runOnUiThread(new l((int) mode, 8, cVar));
    }

    @Override // com.reactnativekeyboardcontroller.NativeKeyboardControllerSpec
    public void viewPositionInWindow(final double viewTag, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        final c cVar = this.module;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(promise, "promise");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: yl.a
            @Override // java.lang.Runnable
            public final void run() {
                c cVar2 = cVar;
                double d6 = viewTag;
                View viewResolveView = null;
                try {
                    UIManager uIManager = cVar2.f23393b;
                    if (uIManager != null) {
                        viewResolveView = uIManager.resolveView((int) d6);
                    }
                } catch (IllegalViewOperationException unused) {
                    int i7 = d.f23395a;
                    String message = "Could not resolve view for tag " + ((int) d6);
                    Intrinsics.checkNotNullParameter(message, "message");
                }
                Promise promise2 = promise;
                if (viewResolveView == null) {
                    promise2.reject("E_VIEW_NOT_FOUND", "Could not find view for tag");
                    return;
                }
                Intrinsics.checkNotNullParameter(viewResolveView, "<this>");
                int[] iArr = new int[2];
                viewResolveView.getLocationOnScreen(iArr);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble("x", sl.c.c(iArr[0]));
                writableMapCreateMap.putDouble("y", sl.c.c(iArr[1]));
                writableMapCreateMap.putDouble("width", sl.c.c(viewResolveView.getWidth()));
                writableMapCreateMap.putDouble("height", sl.c.c(viewResolveView.getHeight()));
                promise2.resolve(writableMapCreateMap);
            }
        });
    }
}
