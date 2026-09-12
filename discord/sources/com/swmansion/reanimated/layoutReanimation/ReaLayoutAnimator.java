package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationController;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class ReaLayoutAnimator extends LayoutAnimationController {
    private final ReactApplicationContext mContext;
    private final WeakReference<NativeViewHierarchyManager> mWeakNativeViewHierarchyManager;
    private AnimationsManager mAnimationsManager = null;
    private volatile boolean mInitialized = false;
    private final ArrayList<View> viewsToSnapshot = new ArrayList<>();

    public ReaLayoutAnimator(ReactApplicationContext reactApplicationContext, NativeViewHierarchyManager nativeViewHierarchyManager) {
        this.mContext = reactApplicationContext;
        this.mWeakNativeViewHierarchyManager = new WeakReference<>(nativeViewHierarchyManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteView$0(Event event) {
        if (event.getName().equals("topWillDisappear")) {
            getAnimationsManager().notifyAboutScreenWillDisappear();
        }
    }

    @Override // com.facebook.react.uimanager.layoutanimation.LayoutAnimationController
    public void applyLayoutUpdate(View view, int i7, int i10, int i11, int i12) {
        if (!isLayoutAnimationEnabled()) {
            super.applyLayoutUpdate(view, i7, i10, i11, i12);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        maybeInit();
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            Snapshot snapshot = new Snapshot(view, this.mWeakNativeViewHierarchyManager.get());
            view.layout(i7, i10, i11 + i7, i12 + i10);
            this.mAnimationsManager.onViewUpdate(view, snapshot, new Snapshot(view, this.mWeakNativeViewHierarchyManager.get()));
            return;
        }
        if (!this.mAnimationsManager.hasAnimationForTag(view.getId(), 1)) {
            super.applyLayoutUpdate(view, i7, i10, i11, i12);
            this.mAnimationsManager.maybeRegisterSharedView(view);
        } else {
            view.layout(i7, i10, i11 + i7, i12 + i10);
            if (view.getId() != -1) {
                this.viewsToSnapshot.add(view);
            }
        }
    }

    @Override // com.facebook.react.uimanager.layoutanimation.LayoutAnimationController
    public void deleteView(View view, final LayoutAnimationListener layoutAnimationListener) {
        if (!isLayoutAnimationEnabled()) {
            super.deleteView(view, layoutAnimationListener);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        NativeViewHierarchyManager nativeViewHierarchyManager = this.mWeakNativeViewHierarchyManager.get();
        try {
            if (nativeViewHierarchyManager.resolveViewManager(view.getId()).getName().equals(ScreenViewManager.REACT_CLASS) && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                try {
                    if (nativeViewHierarchyManager.resolveViewManager(((View) view.getParent().getParent()).getId()).getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                        this.mAnimationsManager.cancelAnimationsInSubviews(view);
                        super.deleteView(view, layoutAnimationListener);
                        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) view.getContext(), view.getId());
                        if (eventDispatcherForReactTag != null) {
                            eventDispatcherForReactTag.addListener(new EventDispatcherListener() { // from class: com.swmansion.reanimated.layoutReanimation.a
                                @Override // com.facebook.react.uimanager.events.EventDispatcherListener
                                public final void onEventDispatch(Event event) {
                                    this.f7123a.lambda$deleteView$0(event);
                                }
                            });
                            return;
                        }
                        return;
                    }
                } catch (IllegalViewOperationException e10) {
                    e10.printStackTrace();
                    this.mAnimationsManager.cancelAnimationsInSubviews(view);
                    super.deleteView(view, layoutAnimationListener);
                    return;
                }
            }
            maybeInit();
            AnimationsManager animationsManager = this.mAnimationsManager;
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            Objects.requireNonNull(layoutAnimationListener);
            animationsManager.onViewRemoval(view, viewGroup, new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.b
                @Override // java.lang.Runnable
                public final void run() {
                    layoutAnimationListener.onAnimationEnd();
                }
            });
        } catch (IllegalViewOperationException e11) {
            e11.printStackTrace();
            this.mAnimationsManager.cancelAnimationsInSubviews(view);
            super.deleteView(view, layoutAnimationListener);
        }
    }

    public AnimationsManager getAnimationsManager() {
        return this.mAnimationsManager;
    }

    public boolean isLayoutAnimationEnabled() {
        if (!this.mContext.hasActiveReactInstance()) {
            return false;
        }
        maybeInit();
        return this.mAnimationsManager.isLayoutAnimationEnabled();
    }

    public void maybeInit() {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        AnimationsManager animationsManager = ((ReanimatedModule) this.mContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
        this.mAnimationsManager = animationsManager;
        animationsManager.setReanimatedNativeHierarchyManager((ReanimatedNativeHierarchyManager) this.mWeakNativeViewHierarchyManager.get());
    }

    @Override // com.facebook.react.uimanager.layoutanimation.LayoutAnimationController
    public void reset() {
        super.reset();
        for (View view : this.viewsToSnapshot) {
            this.mAnimationsManager.onViewCreate(view, (ViewGroup) view.getParent(), new Snapshot(view, this.mWeakNativeViewHierarchyManager.get()));
        }
        this.viewsToSnapshot.clear();
    }

    @Override // com.facebook.react.uimanager.layoutanimation.LayoutAnimationController
    public boolean shouldAnimateLayout(View view) {
        if (isLayoutAnimationEnabled()) {
            return (view == null || view.getParent() == null) ? false : true;
        }
        return super.shouldAnimateLayout(view);
    }
}
