package com.reactnativekeyboardcontroller;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewProps;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import xm.b;
import zl.a;
import zl.c;
import zl.d;
import zl.e;
import zl.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;", "Lcom/reactnativekeyboardcontroller/NativeStatusBarManagerCompatSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "mReactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "", "getConstants", "()Ljava/util/Map;", "", ViewProps.HIDDEN, "", "setHidden", "(Z)V", "", ViewProps.COLOR, "animated", "setColor", "(DZ)V", "translucent", "setTranslucent", "style", "setStyle", "(Ljava/lang/String;)V", "Lzl/c;", "module", "Lzl/c;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatusBarManagerCompatModule extends NativeStatusBarManagerCompatSpec {

    @NotNull
    private final c module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusBarManagerCompatModule(@NotNull ReactApplicationContext mReactContext) {
        super(mReactContext);
        Intrinsics.checkNotNullParameter(mReactContext, "mReactContext");
        this.module = new c(mReactContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        e eVar = this.module.f24040b;
        eVar.getClass();
        try {
            Method method = (Method) eVar.f24048w;
            Object objInvoke = method != null ? method.invoke(eVar.f24044d, null) : null;
            if (TypeIntrinsics.isMutableMap(objInvoke)) {
                return (Map) objInvoke;
            }
            return null;
        } catch (Exception unused) {
            int i7 = f.f24049a;
            Intrinsics.checkNotNullParameter("Error invoking StatusBarModule.getConstants method", "message");
            return null;
        }
    }

    @Override // com.reactnativekeyboardcontroller.NativeStatusBarManagerCompatSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "StatusBarManager";
    }

    @Override // com.reactnativekeyboardcontroller.NativeStatusBarManagerCompatSpec
    public void setColor(double color, final boolean animated) {
        c cVar = this.module;
        final int i7 = (int) color;
        cVar.getClass();
        WeakReference weakReference = e4.f.f7973a;
        am.e eVar = weakReference != null ? (am.e) weakReference.get() : null;
        if (eVar != null ? eVar.getActive() : false) {
            final Activity currentActivity = cVar.f24039a.getCurrentActivity();
            if (currentActivity != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: zl.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Window window = currentActivity.getWindow();
                        boolean z5 = animated;
                        int i10 = i7;
                        if (!z5) {
                            window.setStatusBarColor(i10);
                            return;
                        }
                        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(i10));
                        valueAnimatorOfObject.addUpdateListener(new com.discord.chat.presentation.list.c(10, window));
                        valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
                        valueAnimatorOfObject.start();
                    }
                });
                return;
            } else {
                int i10 = d.f24043a;
                Intrinsics.checkNotNullParameter("StatusBarManagerCompatModule: Ignored status bar change, current activity is null.", "message");
                return;
            }
        }
        e eVar2 = cVar.f24040b;
        double d6 = i7;
        eVar2.getClass();
        try {
            Method method = (Method) eVar2.f24045e;
            if (method != null) {
                method.invoke(eVar2.f24044d, Double.valueOf(d6), Boolean.valueOf(animated));
            }
        } catch (Exception unused) {
            int i11 = f.f24049a;
            Intrinsics.checkNotNullParameter("Error invoking StatusBarModule.setColor method", "message");
        }
    }

    @Override // com.reactnativekeyboardcontroller.NativeStatusBarManagerCompatSpec
    public void setHidden(boolean hidden) {
        c cVar = this.module;
        cVar.getClass();
        UiThreadUtil.runOnUiThread(new a(hidden, cVar));
    }

    @Override // com.reactnativekeyboardcontroller.NativeStatusBarManagerCompatSpec
    public void setStyle(@NotNull String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        c cVar = this.module;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(style, "style");
        WeakReference weakReference = e4.f.f7973a;
        am.e eVar = weakReference != null ? (am.e) weakReference.get() : null;
        if (eVar != null ? eVar.getActive() : false) {
            UiThreadUtil.runOnUiThread(new b(3, cVar, style));
            return;
        }
        e eVar2 = cVar.f24040b;
        eVar2.getClass();
        Intrinsics.checkNotNullParameter(style, "style");
        try {
            Method method = (Method) eVar2.f24047v;
            if (method != null) {
                method.invoke(eVar2.f24044d, style);
            }
        } catch (Exception unused) {
            int i7 = f.f24049a;
            Intrinsics.checkNotNullParameter("Error invoking StatusBarModule.setStyle method", "message");
        }
    }

    @Override // com.reactnativekeyboardcontroller.NativeStatusBarManagerCompatSpec
    public void setTranslucent(boolean translucent) {
        c cVar = this.module;
        cVar.getClass();
        WeakReference weakReference = e4.f.f7973a;
        am.e eVar = weakReference != null ? (am.e) weakReference.get() : null;
        if (eVar != null ? eVar.getActive() : false) {
            UiThreadUtil.runOnUiThread(new a(cVar, translucent));
            return;
        }
        e eVar2 = cVar.f24040b;
        eVar2.getClass();
        try {
            Method method = (Method) eVar2.f24046i;
            if (method != null) {
                method.invoke(eVar2.f24044d, Boolean.valueOf(translucent));
            }
        } catch (Exception unused) {
            int i7 = f.f24049a;
            Intrinsics.checkNotNullParameter("Error invoking StatusBarModule.setTranslucent method", "message");
        }
    }
}
