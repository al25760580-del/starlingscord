package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.k;
import androidx.core.view.m;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.i;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.z0;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import com.discord.R;
import d3.e;
import e.c;
import e.t;
import f.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import mo.c0;
import org.jetbrains.annotations.NotNull;
import rn.d;
import rn.l;
import x0.d1;
import x0.e1;
import x0.h;
import x0.j;
import y0.f;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends h implements c1, i, e, t, g, f, y0.g, x0.c1, d1, k {

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @NotNull
    private static final Companion Companion = new Companion();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f701d = 0;
    private ViewModelStore _viewModelStore;

    @NotNull
    private final ActivityResultRegistry activityResultRegistry;
    private int contentLayoutId;

    @NotNull
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    @NotNull
    private final Lazy fullyDrawnReporter$delegate;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    @NotNull
    private final Lazy onBackPressedDispatcher$delegate;

    @NotNull
    private final CopyOnWriteArrayList<Consumer> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;

    @NotNull
    private final SavedStateRegistryController savedStateRegistryController;

    @NotNull
    private final ContextAwareHelper contextAwareHelper = new ContextAwareHelper();

    @NotNull
    private final MenuHostHelper menuHostHelper = new MenuHostHelper(new e.a(this, 0));

    public static final class Companion {
    }

    public interface ReportFullyDrawnExecutor extends Executor {
        void Q(View view);

        void g();
    }

    public ComponentActivity() {
        Intrinsics.checkNotNullParameter(this, "owner");
        e3.a aVar = new e3.a(this, new r0(27, this));
        this.savedStateRegistryController = new SavedStateRegistryController(aVar);
        this.reportFullyDrawnExecutor = new a(this);
        this.fullyDrawnReporter$delegate = l.b(new b(this));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new e.g(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new e.b(0, this));
        getLifecycle().a(new e.b(1, this));
        getLifecycle().a(new d3.b(this));
        aVar.a();
        q0.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new c(0, this));
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: e.d
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void a(ComponentActivity componentActivity) {
                ComponentActivity.a(this.f7828a, componentActivity);
            }
        });
        this.defaultViewModelProviderFactory$delegate = l.b(new e.h(this, 0));
        this.onBackPressedDispatcher$delegate = l.b(new e.h(this, 2));
    }

    public static void a(ComponentActivity componentActivity, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleA = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            ActivityResultRegistry activityResultRegistry = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = activityResultRegistry.f724b;
            LinkedHashMap linkedHashMap2 = activityResultRegistry.f723a;
            Bundle bundle = activityResultRegistry.f729g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                activityResultRegistry.f726d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                String str = stringArrayList.get(i7);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        TypeIntrinsics.asMutableMap(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i7);
                Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i7);
                Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                activityResultRegistry.f724b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    public static final void access$ensureViewModelStore(ComponentActivity componentActivity) {
        if (componentActivity._viewModelStore == null) {
            e.f fVar = (e.f) componentActivity.getLastNonConfigurationInstance();
            if (fVar != null) {
                componentActivity._viewModelStore = fVar.f7830b;
            }
            if (componentActivity._viewModelStore == null) {
                componentActivity._viewModelStore = new ViewModelStore();
            }
        }
    }

    public static void b(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, n event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == n.ON_DESTROY) {
            componentActivity.contextAwareHelper.f722b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.g();
        }
    }

    public static Bundle c(ComponentActivity componentActivity) {
        Bundle outState = new Bundle();
        ActivityResultRegistry activityResultRegistry = componentActivity.activityResultRegistry;
        activityResultRegistry.getClass();
        Intrinsics.checkNotNullParameter(outState, "outState");
        LinkedHashMap linkedHashMap = activityResultRegistry.f724b;
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.f726d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(activityResultRegistry.f729g));
        return outState;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        reportFullyDrawnExecutor.Q(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.k
    public void addMenuProvider(@NotNull MenuProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        MenuHostHelper menuHostHelper = this.menuHostHelper;
        menuHostHelper.f1594b.add(provider);
        menuHostHelper.f1593a.run();
    }

    @Override // y0.f
    public final void addOnConfigurationChangedListener(@NotNull Consumer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        ComponentActivity componentActivity = contextAwareHelper.f722b;
        if (componentActivity != null) {
            listener.a(componentActivity);
        }
        contextAwareHelper.f721a.add(listener);
    }

    @Override // x0.c1
    public final void addOnMultiWindowModeChangedListener(@NotNull Consumer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(@NotNull Consumer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // x0.d1
    public final void addOnPictureInPictureModeChangedListener(@NotNull Consumer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // y0.g
    public final void addOnTrimMemoryListener(@NotNull Consumer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // f.g
    @NotNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.i
    @NotNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        t2.c cVar = new t2.c(0);
        if (getApplication() != null) {
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            cVar.b(z0.f2414d, application);
        }
        cVar.b(q0.f2383a, this);
        cVar.b(q0.f2384b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            cVar.b(q0.f2385c, extras);
        }
        return cVar;
    }

    @NotNull
    public ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider$Factory) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @NotNull
    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter) this.fullyDrawnReporter$delegate.getValue();
    }

    @d
    public Object getLastCustomNonConfigurationInstance() {
        e.f fVar = (e.f) getLastNonConfigurationInstance();
        if (fVar != null) {
            return fVar.f7829a;
        }
        return null;
    }

    @Override // x0.h, androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // e.t
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // d3.e
    @NotNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.f2738b;
    }

    @Override // androidx.lifecycle.c1
    @NotNull
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            e.f fVar = (e.f) getLastNonConfigurationInstance();
            if (fVar != null) {
                this._viewModelStore = fVar.f7830b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
        ViewModelStore viewModelStore = this._viewModelStore;
        Intrinsics.checkNotNull(viewModelStore);
        return viewModelStore;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        b1.d(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        com.facebook.imagepipeline.nativecode.b.A(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView5, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i10, Intent intent) {
        if (this.activityResultRegistry.a(i7, i10, intent)) {
            return;
        }
        super.onActivityResult(i7, i10, intent);
    }

    @Override // android.app.Activity
    @d
    public void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<Consumer> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // x0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        contextAwareHelper.f722b = this;
        Iterator it = contextAwareHelper.f721a.iterator();
        while (it.hasNext()) {
            ((OnContextAvailableListener) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i7 = m0.f2373e;
        k0.b(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        MenuHostHelper menuHostHelper = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = menuHostHelper.f1594b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i7, item)) {
            return true;
        }
        if (i7 == 0) {
            Iterator it = this.menuHostHelper.f1594b.iterator();
            while (it.hasNext()) {
                if (((MenuProvider) it.next()).a(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @d
    public void onMultiWindowModeChanged(boolean z5) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new j(z5));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<Consumer> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator it = this.menuHostHelper.f1594b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).b(menu);
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    @d
    public void onPictureInPictureModeChanged(boolean z5) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new e1(z5));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        Iterator it = this.menuHostHelper.f1594b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i7, permissions, grantResults);
    }

    @d
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e.f fVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (fVar = (e.f) getLastNonConfigurationInstance()) != null) {
            viewModelStore = fVar.f7830b;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e.f fVar2 = new e.f();
        fVar2.f7829a = objOnRetainCustomNonConfigurationInstance;
        fVar2.f7830b = viewModelStore;
        return fVar2;
    }

    @Override // x0.h, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.checkNotNull(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            Lifecycle.State state = Lifecycle.State.f2295d;
            ((LifecycleRegistry) lifecycle).h();
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.b(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator<Consumer> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i7));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f722b;
    }

    @NotNull
    public final <I, O> ActivityResultLauncher registerForActivityResult(@NotNull ActivityResultContract contract, @NotNull ActivityResultRegistry registry, @NotNull ActivityResultCallback callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.k
    public void removeMenuProvider(@NotNull MenuProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.a(provider);
    }

    @Override // y0.f
    public final void removeOnConfigurationChangedListener(@NotNull Consumer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        contextAwareHelper.f721a.remove(listener);
    }

    @Override // x0.c1
    public final void removeOnMultiWindowModeChangedListener(@NotNull Consumer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(@NotNull Consumer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // x0.d1
    public final void removeOnPictureInPictureModeChangedListener(@NotNull Consumer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // y0.g
    public final void removeOnTrimMemoryListener(@NotNull Consumer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (c0.C()) {
                Trace.beginSection(c0.Q("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i7) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        reportFullyDrawnExecutor.Q(decorView);
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    @d
    public void startActivityForResult(@NotNull Intent intent, int i7) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    @d
    public void startIntentSenderForResult(@NotNull IntentSender intent, int i7, Intent intent2, int i10, int i11, int i12) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i10, i11, i12);
    }

    @Override // android.app.Activity
    @d
    public void startActivityForResult(@NotNull Intent intent, int i7, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    @d
    public void startIntentSenderForResult(@NotNull IntentSender intent, int i7, Intent intent2, int i10, int i11, int i12, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i10, i11, i12, bundle);
    }

    @NotNull
    public final <I, O> ActivityResultLauncher registerForActivityResult(@NotNull ActivityResultContract contract, @NotNull ActivityResultCallback callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z5, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z5, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            for (Consumer consumer : this.onMultiWindowModeChangedListeners) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                consumer.accept(new j(z5));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z5, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z5, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            for (Consumer consumer : this.onPictureInPictureModeChangedListeners) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                consumer.accept(new e1(z5));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        reportFullyDrawnExecutor.Q(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(@NotNull MenuProvider provider, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        MenuHostHelper menuHostHelper = this.menuHostHelper;
        menuHostHelper.f1594b.add(provider);
        menuHostHelper.f1593a.run();
        Lifecycle lifecycle = owner.getLifecycle();
        HashMap map = menuHostHelper.f1595c;
        androidx.core.view.n nVar = (androidx.core.view.n) map.remove(provider);
        if (nVar != null) {
            nVar.f1705a.c(nVar.f1706b);
            nVar.f1706b = null;
        }
        map.put(provider, new androidx.core.view.n(lifecycle, new m(0, menuHostHelper, provider)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        reportFullyDrawnExecutor.Q(decorView);
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NotNull final MenuProvider provider, @NotNull LifecycleOwner owner, @NotNull final Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        final MenuHostHelper menuHostHelper = this.menuHostHelper;
        menuHostHelper.getClass();
        Lifecycle lifecycle = owner.getLifecycle();
        HashMap map = menuHostHelper.f1595c;
        androidx.core.view.n nVar = (androidx.core.view.n) map.remove(provider);
        if (nVar != null) {
            nVar.f1705a.c(nVar.f1706b);
            nVar.f1706b = null;
        }
        map.put(provider, new androidx.core.view.n(lifecycle, new androidx.lifecycle.t() { // from class: androidx.core.view.l
            @Override // androidx.lifecycle.t
            public final void c(LifecycleOwner lifecycleOwner, androidx.lifecycle.n nVar2) {
                androidx.lifecycle.n nVar3;
                MenuHostHelper menuHostHelper2 = menuHostHelper;
                menuHostHelper2.getClass();
                Runnable runnable = menuHostHelper2.f1593a;
                CopyOnWriteArrayList copyOnWriteArrayList = menuHostHelper2.f1594b;
                androidx.lifecycle.n.Companion.getClass();
                Lifecycle.State state2 = state;
                Intrinsics.checkNotNullParameter(state2, "state");
                int iOrdinal = state2.ordinal();
                if (iOrdinal == 2) {
                    nVar3 = androidx.lifecycle.n.ON_CREATE;
                } else if (iOrdinal != 3) {
                    nVar3 = iOrdinal != 4 ? null : androidx.lifecycle.n.ON_RESUME;
                } else {
                    nVar3 = androidx.lifecycle.n.ON_START;
                }
                MenuProvider menuProvider = provider;
                if (nVar2 == nVar3) {
                    copyOnWriteArrayList.add(menuProvider);
                    runnable.run();
                } else if (nVar2 == androidx.lifecycle.n.ON_DESTROY) {
                    menuHostHelper2.a(menuProvider);
                } else if (nVar2 == androidx.lifecycle.l.a(state2)) {
                    copyOnWriteArrayList.remove(menuProvider);
                    runnable.run();
                }
            }
        }));
    }
}
