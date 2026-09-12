package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.b1;
import androidx.lifecycle.n;
import androidx.lifecycle.r0;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import com.discord.R;
import com.google.firebase.messaging.s;
import d3.e;
import e.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class ComponentDialog extends Dialog implements LifecycleOwner, t, e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LifecycleRegistry f702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SavedStateRegistryController f703e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OnBackPressedDispatcher f704i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentDialog(Context context, int i7) {
        super(context, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f703e = new SavedStateRegistryController(new e3.a(this, new r0(27, this)));
        this.f704i = new OnBackPressedDispatcher(new s(7, this));
    }

    public static void a(ComponentDialog componentDialog) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        b1.d(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        com.facebook.imagepipeline.nativecode.b.A(decorView3, this);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry = this.f702d;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
        this.f702d = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    @Override // e.t
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f704i;
    }

    @Override // d3.e
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.f703e.f2738b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f704i.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher invoker = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(invoker, "onBackInvokedDispatcher");
            OnBackPressedDispatcher onBackPressedDispatcher = this.f704i;
            onBackPressedDispatcher.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            onBackPressedDispatcher.f713e = invoker;
            onBackPressedDispatcher.e(onBackPressedDispatcher.f715g);
        }
        this.f703e.a(bundle);
        LifecycleRegistry lifecycleRegistry = this.f702d;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.f702d = lifecycleRegistry;
        }
        lifecycleRegistry.f(n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f703e.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        LifecycleRegistry lifecycleRegistry = this.f702d;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.f702d = lifecycleRegistry;
        }
        lifecycleRegistry.f(n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        LifecycleRegistry lifecycleRegistry = this.f702d;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.f702d = lifecycleRegistry;
        }
        lifecycleRegistry.f(n.ON_DESTROY);
        this.f702d = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        b();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
