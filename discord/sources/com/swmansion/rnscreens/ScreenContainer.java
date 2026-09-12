package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenContainer extends ViewGroup {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f7147d = 0;
    protected FragmentManager fragmentManager;
    private boolean isAttached;
    private boolean isLayoutEnqueued;

    @NotNull
    private final Choreographer.FrameCallback layoutCallback;
    private boolean needsUpdate;
    private ScreenFragmentWrapper parentScreenWrapper;

    @NotNull
    protected final ArrayList<ScreenFragmentWrapper> screenWrappers;

    public ScreenContainer(Context context) {
        super(context);
        this.screenWrappers = new ArrayList<>();
        this.layoutCallback = new d(this, 1);
    }

    private final void setFragmentManager(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
        performUpdatesNow();
    }

    public final void a() {
        this.needsUpdate = true;
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((ThemedReactContext) context).getReactApplicationContext().runOnUiQueueThread(new com.google.firebase.messaging.s(3, this));
    }

    public ScreenFragmentWrapper adapt(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new y(screen);
    }

    public final void addScreen(@NotNull Screen screen, int i7) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        ScreenFragmentWrapper screenFragmentWrapperAdapt = adapt(screen);
        screen.setFragmentWrapper(screenFragmentWrapperAdapt);
        this.screenWrappers.add(i7, screenFragmentWrapperAdapt);
        screen.setContainer(this);
        a();
    }

    public final void attachBelowTop() {
        if (this.screenWrappers.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        FragmentTransaction fragmentTransactionCreateTransaction = createTransaction();
        Screen topScreen = getTopScreen();
        Intrinsics.checkNotNull(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        Fragment fragment = topScreen.getFragment();
        Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        fragmentTransactionCreateTransaction.f(fragment);
        fragmentTransactionCreateTransaction.e(getId(), ((ScreenFragmentWrapper) kk.b.e(2, this.screenWrappers)).g(), null, 1);
        Fragment fragment2 = topScreen.getFragment();
        Intrinsics.checkNotNull(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        fragmentTransactionCreateTransaction.e(getId(), fragment2, null, 1);
        fragmentTransactionCreateTransaction.d();
    }

    @NotNull
    public final FragmentTransaction createTransaction() {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.f2078p = true;
        Intrinsics.checkNotNullExpressionValue(aVar, "setReorderingAllowed(...)");
        return aVar;
    }

    public final void detachBelowTop() {
        if (this.screenWrappers.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        FragmentTransaction fragmentTransactionCreateTransaction = createTransaction();
        fragmentTransactionCreateTransaction.f(((ScreenFragmentWrapper) kk.b.e(2, this.screenWrappers)).g());
        fragmentTransactionCreateTransaction.d();
    }

    @NotNull
    public final Screen getScreenAt(int i7) {
        return this.screenWrappers.get(i7).a();
    }

    public final int getScreenCount() {
        return this.screenWrappers.size();
    }

    @NotNull
    public final ScreenFragmentWrapper getScreenFragmentWrapperAt(int i7) {
        ScreenFragmentWrapper screenFragmentWrapper = this.screenWrappers.get(i7);
        Intrinsics.checkNotNullExpressionValue(screenFragmentWrapper, "get(...)");
        return screenFragmentWrapper;
    }

    public Screen getTopScreen() {
        Object next;
        Iterator<T> it = this.screenWrappers.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ScreenFragmentWrapper) next).a().getActivityState() != Screen.ActivityState.f7130i);
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) next;
        if (screenFragmentWrapper != null) {
            return screenFragmentWrapper.a();
        }
        return null;
    }

    public boolean hasScreen(ScreenFragmentWrapper screenFragmentWrapper) {
        return CollectionsKt.E(this.screenWrappers, screenFragmentWrapper);
    }

    public final boolean isNested() {
        return this.parentScreenWrapper != null;
    }

    public void notifyContainerUpdate() {
        ScreenFragmentWrapper fragmentWrapper;
        Screen topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.n();
    }

    public final void notifyScreenDetached(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (getContext() instanceof ReactContext) {
            int surfaceId = UIManagerHelper.getSurfaceId(getContext());
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, screen.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new k4.k(surfaceId, screen.getId(), 6));
            }
        }
    }

    public final void notifyTopDetached() {
        Screen topScreen = getTopScreen();
        Intrinsics.checkNotNull(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        if (getContext() instanceof ReactContext) {
            int surfaceId = UIManagerHelper.getSurfaceId(getContext());
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, topScreen.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new k4.k(surfaceId, topScreen.getId(), 6));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        boolean z5;
        boolean z6;
        FragmentManager supportFragmentManager;
        Unit unit;
        super.onAttachedToWindow();
        this.isAttached = true;
        ViewParent parent = this;
        while (true) {
            z5 = parent instanceof ReactRootView;
            if (z5 || (parent instanceof pm.a) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
        }
        if (parent instanceof Screen) {
            ScreenFragmentWrapper fragmentWrapper = ((Screen) parent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.parentScreenWrapper = fragmentWrapper;
                fragmentWrapper.m(this);
                FragmentManager childFragmentManager = fragmentWrapper.g().getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                setFragmentManager(childFragmentManager);
                unit = Unit.f14616a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached");
            }
            return;
        }
        if (parent instanceof pm.a) {
            Fragment associatedFragment = ((pm.a) parent).getAssociatedFragment();
            if (associatedFragment != null) {
                FragmentManager childFragmentManager2 = associatedFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                setFragmentManager(childFragmentManager2);
                return;
            } else {
                throw new IllegalStateException(("[RNScreens] Parent " + parent + " returned nullish fragment").toString());
            }
        }
        if (!z5) {
            throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
        }
        ReactRootView reactRootView = (ReactRootView) parent;
        Context context = reactRootView.getContext();
        while (true) {
            z6 = context instanceof FragmentActivity;
            if (z6 || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (!z6) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity.getSupportFragmentManager().f2043c.f().isEmpty()) {
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNull(supportFragmentManager);
        } else {
            try {
                supportFragmentManager = FragmentManager.C(reactRootView).getChildFragmentManager();
                Intrinsics.checkNotNull(supportFragmentManager);
            } catch (IllegalStateException unused) {
                supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNull(supportFragmentManager);
            }
        }
        setFragmentManager(supportFragmentManager);
    }

    public final void onChildUpdate() {
        performUpdatesNow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager != null && !fragmentManager.J) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
            boolean z5 = false;
            for (Fragment fragment : fragmentManager.f2043c.f()) {
                if ((fragment instanceof y) && ((y) fragment).a().getContainer() == this) {
                    aVar.f(fragment);
                    z5 = true;
                }
            }
            if (z5) {
                aVar.d();
            }
            fragmentManager.z(true);
            fragmentManager.G();
        }
        ScreenFragmentWrapper screenFragmentWrapper = this.parentScreenWrapper;
        if (screenFragmentWrapper != null) {
            screenFragmentWrapper.c(this);
        }
        this.parentScreenWrapper = null;
        super.onDetachedFromWindow();
        this.isAttached = false;
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            removeViewAt(childCount);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).measure(i7, i10);
        }
    }

    public void onUpdate() {
        FragmentTransaction fragmentTransactionCreateTransaction = createTransaction();
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
        }
        HashSet hashSet = new HashSet(fragmentManager.f2043c.f());
        Iterator<ScreenFragmentWrapper> it = this.screenWrappers.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ScreenFragmentWrapper next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ScreenFragmentWrapper screenFragmentWrapper = next;
            if (screenFragmentWrapper.a().getActivityState() == Screen.ActivityState.f7128d && screenFragmentWrapper.g().isAdded()) {
                fragmentTransactionCreateTransaction.f(screenFragmentWrapper.g());
            }
            hashSet.remove(screenFragmentWrapper.g());
        }
        boolean z5 = false;
        if (!hashSet.isEmpty()) {
            for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                if ((fragment instanceof y) && ((y) fragment).a().getContainer() == null) {
                    fragmentTransactionCreateTransaction.f(fragment);
                }
            }
        }
        boolean z6 = getTopScreen() == null;
        ArrayList arrayList = new ArrayList();
        Iterator<ScreenFragmentWrapper> it2 = this.screenWrappers.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            ScreenFragmentWrapper next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
            ScreenFragmentWrapper screenFragmentWrapper2 = next2;
            screenFragmentWrapper2.a().setTransitioning(z6);
            if (screenFragmentWrapper2.a().getActivityState() != Screen.ActivityState.f7128d) {
                if (screenFragmentWrapper2.g().isAdded()) {
                    if (z5) {
                        fragmentTransactionCreateTransaction.f(screenFragmentWrapper2.g());
                        arrayList.add(screenFragmentWrapper2);
                    }
                } else if (z5) {
                    arrayList.add(screenFragmentWrapper2);
                } else {
                    fragmentTransactionCreateTransaction.e(getId(), screenFragmentWrapper2.g(), null, 1);
                    z5 = true;
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next3 = it3.next();
            Intrinsics.checkNotNullExpressionValue(next3, "next(...)");
            fragmentTransactionCreateTransaction.e(getId(), ((ScreenFragmentWrapper) next3).g(), null, 1);
        }
        fragmentTransactionCreateTransaction.d();
    }

    public final void performUpdates() {
        FragmentManager fragmentManager;
        if (!this.needsUpdate || !this.isAttached || (fragmentManager = this.fragmentManager) == null || fragmentManager.J) {
            return;
        }
        this.needsUpdate = false;
        onUpdate();
        notifyContainerUpdate();
    }

    public final void performUpdatesNow() {
        this.needsUpdate = true;
        performUpdates();
    }

    public void removeAllScreens() {
        Iterator<ScreenFragmentWrapper> it = this.screenWrappers.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ScreenFragmentWrapper next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.a().setContainer(null);
        }
        this.screenWrappers.clear();
        a();
    }

    public void removeScreenAt(int i7) {
        this.screenWrappers.get(i7).a().setContainer(null);
        this.screenWrappers.remove(i7);
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.isLayoutEnqueued || this.layoutCallback == null) {
            return;
        }
        this.isLayoutEnqueued = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.layoutCallback);
    }
}
