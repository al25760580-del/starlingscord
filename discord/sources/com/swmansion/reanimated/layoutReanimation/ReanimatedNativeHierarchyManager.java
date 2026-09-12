package com.swmansion.reanimated.layoutReanimation;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.ViewAtIndex;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class ReanimatedNativeHierarchyManager extends ReanimatedNativeHierarchyManagerBase {
    private final HashMap<Integer, Runnable> cleanerCallback;
    private boolean initOk;
    private final HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private final ReaLayoutAnimator mReaLayoutAnimator;
    private final TabNavigatorObserver mTabNavigatorObserver;
    private final HashMap<Integer, ArrayList<View>> toBeRemoved;

    public ReanimatedNativeHierarchyManager(ViewManagerRegistry viewManagerRegistry, ReactApplicationContext reactApplicationContext) {
        super(viewManagerRegistry);
        this.toBeRemoved = new HashMap<>();
        this.cleanerCallback = new HashMap<>();
        this.mPendingDeletionsForTag = new HashMap<>();
        this.initOk = true;
        ReaLayoutAnimator reaLayoutAnimator = new ReaLayoutAnimator(reactApplicationContext, this);
        this.mReaLayoutAnimator = reaLayoutAnimator;
        this.mTabNavigatorObserver = new TabNavigatorObserver(reaLayoutAnimator);
        Class<? super Object> superclass = getClass().getSuperclass().getSuperclass();
        if (superclass == null) {
            Log.e("reanimated", "unable to resolve NativeViewHierarchyManager class from ReanimatedNativeHierarchyManager");
            return;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mLayoutAnimator");
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            declaredField.set(this, this.mReaLayoutAnimator);
        } catch (IllegalAccessException | NoSuchFieldException e11) {
            this.initOk = false;
            e11.printStackTrace();
        }
        try {
            Field declaredField3 = superclass.getDeclaredField("mPendingDeletionsForTag");
            declaredField3.setAccessible(true);
            try {
                Field declaredField4 = Field.class.getDeclaredField("accessFlags");
                declaredField4.setAccessible(true);
                declaredField4.setInt(declaredField3, declaredField3.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e12) {
                e12.printStackTrace();
            }
            declaredField3.set(this, this.mPendingDeletionsForTag);
        } catch (IllegalAccessException | NoSuchFieldException e13) {
            this.initOk = false;
            e13.printStackTrace();
        }
        if (this.initOk) {
            setLayoutAnimationEnabled(true);
        }
    }

    private boolean checkIfTopScreenHasHeader(ViewGroup viewGroup) {
        try {
            View childAt = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            Field declaredField = childAt.getClass().getDeclaredField("mIsHidden");
            declaredField.setAccessible(true);
            return !declaredField.getBoolean(childAt);
        } catch (IllegalAccessException | NoSuchFieldException | NullPointerException unused) {
            return false;
        }
    }

    private boolean isLayoutAnimationDisabled() {
        return (this.initOk && this.mReaLayoutAnimator.isLayoutAnimationEnabled()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$manageChildren$0(ArrayList arrayList, View view, ViewGroupManager viewGroupManager, ViewGroup viewGroup) {
        arrayList.remove(view);
        viewGroupManager.removeView(viewGroup, view);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public synchronized void dropView(View view) {
        if (isLayoutAnimationDisabled()) {
            super.dropView(view);
            return;
        }
        if (this.toBeRemoved.containsKey(Integer.valueOf(view.getId()))) {
            this.toBeRemoved.remove(Integer.valueOf(view.getId()));
        }
        if (this.cleanerCallback.containsKey(Integer.valueOf(view.getId()))) {
            Runnable runnable = this.cleanerCallback.get(Integer.valueOf(view.getId()));
            this.cleanerCallback.remove(Integer.valueOf(view.getId()));
            runnable.run();
        }
        super.dropView(view);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public synchronized void manageChildren(int i7, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        Set<Integer> set;
        if (isLayoutAnimationDisabled()) {
            super.manageChildren(i7, iArr, viewAtIndexArr, iArr2);
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) resolveView(i7);
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i7);
            AnimationsManager animationsManager = this.mReaLayoutAnimator.getAnimationsManager();
            if (viewGroupManager.getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                if (iArr2 == null) {
                    animationsManager.makeSnapshotOfTopScreenViews(viewGroup);
                } else {
                    animationsManager.notifyAboutViewsRemoval(iArr2);
                }
                if (iArr != null && this.mReaLayoutAnimator != null) {
                    for (int i10 : iArr) {
                        this.mReaLayoutAnimator.getAnimationsManager().cancelAnimationsInSubviews(viewGroupManager.getChildAt(viewGroup, i10));
                    }
                }
                super.manageChildren(i7, iArr, viewAtIndexArr, iArr2);
                return;
            }
            if (this.toBeRemoved.containsKey(Integer.valueOf(i7))) {
                ArrayList<View> arrayList = this.toBeRemoved.get(Integer.valueOf(i7));
                HashSet hashSet = new HashSet();
                Iterator<View> it = arrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(Integer.valueOf(it.next().getId()));
                }
                while (viewGroupManager.getChildCount(viewGroup) != 0 && hashSet.contains(Integer.valueOf(viewGroupManager.getChildAt(viewGroup, viewGroupManager.getChildCount(viewGroup) - 1).getId()))) {
                    viewGroupManager.removeViewAt(viewGroup, viewGroupManager.getChildCount(viewGroup) - 1);
                }
            }
            if (iArr2 != null) {
                if (!this.toBeRemoved.containsKey(Integer.valueOf(i7))) {
                    this.toBeRemoved.put(Integer.valueOf(i7), new ArrayList<>());
                }
                ArrayList<View> arrayList2 = this.toBeRemoved.get(Integer.valueOf(i7));
                for (int i11 : iArr2) {
                    try {
                        View viewResolveView = resolveView(i11);
                        arrayList2.add(viewResolveView);
                        this.cleanerCallback.put(Integer.valueOf(viewResolveView.getId()), new cb.a(5, arrayList2, viewResolveView, viewGroupManager, viewGroup));
                    } catch (IllegalViewOperationException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            HashMap<Integer, Set<Integer>> map = this.mPendingDeletionsForTag;
            if (map != null && (set = map.get(Integer.valueOf(i7))) != null) {
                set.clear();
            }
            animationsManager.notifyAboutViewsRemoval(iArr2);
            super.manageChildren(i7, iArr, viewAtIndexArr, null);
            if (this.toBeRemoved.containsKey(Integer.valueOf(i7))) {
                Iterator<View> it2 = this.toBeRemoved.get(Integer.valueOf(i7)).iterator();
                while (it2.hasNext()) {
                    viewGroupManager.addView(viewGroup, it2.next(), viewGroupManager.getChildCount(viewGroup));
                }
            }
            super.manageChildren(i7, null, null, iArr2);
        } catch (IllegalViewOperationException e11) {
            e11.printStackTrace();
            super.manageChildren(i7, iArr, viewAtIndexArr, iArr2);
        }
    }

    public void publicDropView(View view) {
        dropView(view);
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManagerBase
    public synchronized void updateLayoutCommon(int i7, int i10, int i11, int i12, int i13, int i14) {
        ReaLayoutAnimator reaLayoutAnimator;
        try {
            if (isLayoutAnimationDisabled()) {
                return;
            }
            try {
                String name = resolveViewManager(i10).getName();
                View viewResolveView = resolveView(i7);
                if (viewResolveView != null && name.equals(ScreenViewManager.REACT_CLASS) && this.mReaLayoutAnimator != null) {
                    if (!checkIfTopScreenHasHeader((ViewGroup) viewResolveView) || !viewResolveView.isLayoutRequested()) {
                        this.mReaLayoutAnimator.getAnimationsManager().screenDidLayout(viewResolveView);
                    }
                    View viewResolveView2 = resolveView(i10);
                    View view = (View) viewResolveView2.getParent();
                    if (view != null && ScreensHelper.isScreenContainer((View) view.getParent())) {
                        this.mTabNavigatorObserver.handleScreenContainerUpdate(viewResolveView2);
                    }
                }
                View viewResolveView3 = resolveView(i10);
                if (viewResolveView3 != null && (reaLayoutAnimator = this.mReaLayoutAnimator) != null) {
                    reaLayoutAnimator.getAnimationsManager().viewDidLayout(viewResolveView3);
                }
            } catch (IllegalViewOperationException e10) {
                e10.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
