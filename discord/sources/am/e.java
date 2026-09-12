package am;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.l0;
import androidx.core.view.u0;
import bh.r;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends ReactViewGroup {
    public vl.e E;
    public final vl.f F;
    public final xl.b G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThemedReactContext f644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f645e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f646i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f647v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ReactViewGroup f649x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f650y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f644d = reactContext;
        boolean z5 = this.f646i;
        vl.f fVar = new vl.f();
        fVar.f21741a = z5;
        this.F = fVar;
        this.G = new xl.b(this, reactContext, fVar, new d(0, this, e.class, "getKeyboardCallback", "getKeyboardCallback()Lcom/reactnativekeyboardcontroller/listeners/KeyboardAnimationCallback;", 0, 0));
        Intrinsics.checkNotNullParameter(this, "view");
        e4.f.f7973a = new WeakReference(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vl.e getKeyboardCallback() {
        return this.E;
    }

    public final void d() {
        ThemedReactContext themedReactContext = this.f644d;
        if (themedReactContext.getCurrentActivity() != null) {
            this.f649x = new ReactViewGroup(getContext());
            ViewGroup viewGroupB = sl.c.b(themedReactContext);
            if (viewGroupB != null) {
                viewGroupB.addView(this.f649x);
            }
            vl.e eVar = new vl.e(this, this, themedReactContext, this.F);
            this.E = eVar;
            ReactViewGroup reactViewGroup = this.f649x;
            if (reactViewGroup != null) {
                u0.r(reactViewGroup, eVar);
                l0.m(reactViewGroup, this.E);
                Intrinsics.checkNotNullParameter(reactViewGroup, "<this>");
                if (reactViewGroup.isAttachedToWindow()) {
                    reactViewGroup.requestApplyInsets();
                } else {
                    reactViewGroup.addOnAttachStateChangeListener(new r(1));
                }
            }
        } else {
            int i7 = f.f651a;
            Intrinsics.checkNotNullParameter("Can not setup keyboard animation listener, since `currentActivity` is null", "message");
        }
        xl.b bVar = this.G;
        EventDispatcher eventDispatcher = bVar.f22975f;
        if (eventDispatcher != null) {
            eventDispatcher.addListener(bVar);
        }
    }

    public final void e() {
        vl.e eVar = this.E;
        if (eVar != null) {
            eVar.J = null;
            eVar.f21735e.getViewTreeObserver().removeOnGlobalFocusChangeListener(eVar.M);
        }
        new Handler(Looper.getMainLooper()).post(new c(0, this.f649x));
        xl.b bVar = this.G;
        EventDispatcher eventDispatcher = bVar.f22975f;
        if (eventDispatcher != null) {
            eventDispatcher.removeListener(bVar);
        }
    }

    public final void f() {
        Window window;
        View decorView;
        ThemedReactContext themedReactContext = this.f644d;
        Intrinsics.checkNotNullParameter(themedReactContext, "<this>");
        Activity currentActivity = themedReactContext.getCurrentActivity();
        View rootView = (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
        if (rootView != null) {
            b bVar = new b(0, this);
            WeakHashMap weakHashMap = u0.f1729a;
            l0.m(rootView, bVar);
        }
    }

    public final boolean getActive() {
        return this.f648w;
    }

    public final vl.e getCallback$react_native_keyboard_controller_release() {
        return this.E;
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.f644d;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f650y) {
            d();
        } else {
            this.f650y = true;
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        f();
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (isAttachedToWindow()) {
            requestApplyInsets();
        } else {
            addOnAttachStateChangeListener(new r(1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public final void setActive(boolean z5) {
        if (this.f648w == z5) {
            return;
        }
        this.f648w = z5;
        if (z5) {
            f();
            d();
        } else {
            f();
            e();
        }
    }

    public final void setCallback$react_native_keyboard_controller_release(vl.e eVar) {
        this.E = eVar;
    }

    public final void setNavigationBarTranslucent(boolean z5) {
        this.f646i = z5;
        this.F.f21741a = z5;
    }

    public final void setPreserveEdgeToEdge(boolean z5) {
        this.f647v = z5;
    }

    public final void setStatusBarTranslucent(boolean z5) {
        this.f645e = z5;
    }
}
