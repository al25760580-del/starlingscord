package com.swmansion.reanimated.layoutReanimation;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.IViewManagerWithChildren;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.swmansion.reanimated.Utils;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import com.swmansion.worklets.AndroidUIScheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public class AnimationsManager implements ViewHierarchyObserver {
    private ReactContext mContext;
    private NativeMethodsHolder mNativeMethodsHolder;
    private ReanimatedNativeHierarchyManager mReanimatedNativeHierarchyManager;
    private UIManager mUIManager;
    private WeakReference<AndroidUIScheduler> mWeakAndroidUIScheduler = new WeakReference<>(null);
    private final HashSet<Integer> mEnteringViews = new HashSet<>();
    private final HashMap<Integer, Rect> mEnteringViewTargetValues = new HashMap<>();
    private HashMap<Integer, View> mExitingViews = new HashMap<>();
    private HashMap<Integer, Integer> mExitingSubviewCountMap = new HashMap<>();
    private HashSet<Integer> mAncestorsToRemove = new HashSet<>();
    private HashMap<Integer, Runnable> mCallbacks = new HashMap<>();
    private boolean isInvalidated = false;
    private final SharedTransitionManager mSharedTransitionManager = new SharedTransitionManager(this);

    public AnimationsManager(ReactContext reactContext, UIManager uIManager) {
        this.mContext = reactContext;
        this.mUIManager = uIManager;
    }

    private static void addProp(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
            return;
        }
        if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
        } else if (obj instanceof ReadableArray) {
            writableMap.putArray(str, (ReadableArray) obj);
        } else {
            if (!(obj instanceof ReadableMap)) {
                throw new IllegalStateException("[Reanimated] Unknown type of animated value for Layout Animations.");
            }
            writableMap.putMap(str, (ReadableMap) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void checkDuplicateSharedTag(View view) {
        int id2 = view.getId();
        ViewParent parent = view.getParent();
        while (parent != 0 && !parent.getClass().getSimpleName().equals(Screen.TAG)) {
            parent = parent.getParent();
        }
        if (parent != 0) {
            this.mNativeMethodsHolder.checkDuplicateSharedTag(id2, ((View) parent).getId());
        }
    }

    private static Point convertScreenLocationToViewCoordinates(Point point, View view) {
        int[] iArr = {0, 0};
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return new Point(point.x - iArr[0], point.y - iArr[1]);
    }

    private void maybeDropAncestors(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            while (view2 != null && !(view2 instanceof RootView)) {
                View view3 = (View) view2.getParent();
                int id2 = view2.getId();
                Integer num = this.mExitingSubviewCountMap.get(Integer.valueOf(id2));
                int iIntValue = num != null ? num.intValue() - 1 : 0;
                Integer numValueOf = Integer.valueOf(iIntValue);
                if (iIntValue <= 0) {
                    if (this.mAncestorsToRemove.contains(Integer.valueOf(id2))) {
                        this.mAncestorsToRemove.remove(Integer.valueOf(id2));
                        if (!this.mExitingViews.containsKey(Integer.valueOf(id2))) {
                            removeView(view2, (ViewGroup) view3);
                        }
                    }
                    this.mExitingSubviewCountMap.remove(Integer.valueOf(id2));
                } else {
                    this.mExitingSubviewCountMap.put(Integer.valueOf(id2), numValueOf);
                }
                view2 = view3;
            }
        }
    }

    private void registerExitingAncestors(View view) {
        for (View view2 = (View) view.getParent(); view2 != null && !(view2 instanceof RootView); view2 = (View) view2.getParent()) {
            int id2 = view2.getId();
            Integer num = this.mExitingSubviewCountMap.get(Integer.valueOf(id2));
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            this.mExitingSubviewCountMap.put(Integer.valueOf(id2), Integer.valueOf(iIntValue));
        }
    }

    private boolean removeOrAnimateExitRecursive(View view, boolean z5, boolean z6) {
        boolean z7;
        int id2 = view.getId();
        ViewManager viewManagerResolveViewManager = resolveViewManager(id2);
        if (viewManagerResolveViewManager != null) {
            String name = viewManagerResolveViewManager.getName();
            if (name.equals(ReactModalHostManager.REACT_CLASS) || name.equals(ScreenViewManager.REACT_CLASS) || name.equals(ScreenStackViewManager.REACT_CLASS)) {
                cancelAnimationsRecursive(view);
                return false;
            }
        }
        boolean zShouldAnimateExiting = shouldAnimateExiting(id2, z6);
        boolean z10 = zShouldAnimateExiting && (hasAnimationForTag(id2, 2) || this.mExitingViews.containsKey(Integer.valueOf(id2)));
        boolean z11 = z5 && !z10;
        if (hasAnimationForTag(id2, 4)) {
            this.mSharedTransitionManager.notifyAboutRemovedView(view);
            this.mSharedTransitionManager.makeSnapshot(view);
        }
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            z7 = false;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (removeOrAnimateExitRecursive(childAt, z11, zShouldAnimateExiting)) {
                    z7 = true;
                } else if (z11 && childAt.getId() != -1) {
                    arrayList.add(childAt);
                }
            }
        } else {
            z7 = false;
        }
        boolean z12 = z10 || z7;
        if (z10) {
            HashMap<String, Object> mapPrepareDataForAnimationWorklet = prepareDataForAnimationWorklet(new Snapshot(view, this.mReanimatedNativeHierarchyManager).toCurrentMap(), false);
            if (!this.mExitingViews.containsKey(Integer.valueOf(id2))) {
                this.mExitingViews.put(Integer.valueOf(id2), view);
                registerExitingAncestors(view);
                this.mNativeMethodsHolder.startAnimation(id2, 2, mapPrepareDataForAnimationWorklet);
            }
        }
        this.mNativeMethodsHolder.clearAnimationConfig(id2);
        if (!z12) {
            return false;
        }
        if (z7) {
            if (id2 == -1) {
                cancelAnimationsRecursive(view);
                return false;
            }
            this.mAncestorsToRemove.add(Integer.valueOf(id2));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeView((View) it.next(), (ViewGroup) view);
        }
        return true;
    }

    private void removeView(View view, ViewGroup viewGroup) {
        int id2 = view.getId();
        if (this.mCallbacks.containsKey(Integer.valueOf(id2))) {
            Runnable runnable = this.mCallbacks.get(Integer.valueOf(id2));
            this.mCallbacks.remove(Integer.valueOf(id2));
            if (runnable != null) {
                runnable.run();
            }
        } else {
            this.mReanimatedNativeHierarchyManager.publicDropView(view);
        }
        if (viewGroup == null || viewGroup.indexOfChild(view) == -1) {
            return;
        }
        viewGroup.removeView(view);
    }

    private ViewManager resolveViewManager(int i7) {
        try {
            return this.mReanimatedNativeHierarchyManager.resolveViewManager(i7);
        } catch (Exception unused) {
            return null;
        }
    }

    public void cancelAnimationsInSubviews(View view) {
        cancelAnimationsRecursive(view);
        clearAnimationConfigRecursive(view);
    }

    public void cancelAnimationsRecursive(View view) {
        if (this.mExitingViews.containsKey(Integer.valueOf(view.getId()))) {
            endLayoutAnimation(view.getId(), true);
        } else if ((view instanceof ViewGroup) && this.mExitingSubviewCountMap.containsKey(Integer.valueOf(view.getId()))) {
            cancelAnimationsInSubviews((ViewGroup) view);
        }
    }

    public void clearAnimationConfigRecursive(View view) {
        this.mNativeMethodsHolder.clearAnimationConfig(view.getId());
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                clearAnimationConfigRecursive(viewGroup.getChildAt(i7));
            }
        }
    }

    public void endLayoutAnimation(int i7, boolean z5) {
        View viewResolveView = resolveView(i7);
        if (viewResolveView == null) {
            return;
        }
        Rect rect = this.mEnteringViewTargetValues.get(Integer.valueOf(i7));
        if (!z5 && this.mEnteringViews.contains(Integer.valueOf(i7)) && rect != null) {
            viewResolveView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        this.mEnteringViews.remove(Integer.valueOf(i7));
        this.mEnteringViewTargetValues.remove(Integer.valueOf(i7));
        if (z5) {
            if ((viewResolveView instanceof ViewGroup) && this.mAncestorsToRemove.contains(Integer.valueOf(i7))) {
                cancelAnimationsInSubviews((ViewGroup) viewResolveView);
            }
            this.mExitingViews.remove(Integer.valueOf(i7));
            maybeDropAncestors(viewResolveView);
            removeView(viewResolveView, (ViewGroup) viewResolveView.getParent());
        }
        this.mSharedTransitionManager.finishSharedAnimation(i7);
    }

    public ReactContext getContext() {
        return this.mContext;
    }

    public ReanimatedNativeHierarchyManager getReanimatedNativeHierarchyManager() {
        return this.mReanimatedNativeHierarchyManager;
    }

    public boolean hasAnimationForTag(int i7, int i10) {
        NativeMethodsHolder nativeMethodsHolder = this.mNativeMethodsHolder;
        return nativeMethodsHolder != null && nativeMethodsHolder.hasAnimation(i7, i10);
    }

    public void invalidate() {
        this.isInvalidated = true;
        this.mNativeMethodsHolder = null;
        this.mContext = null;
        this.mUIManager = null;
        this.mExitingViews = null;
        this.mExitingSubviewCountMap = null;
        this.mAncestorsToRemove = null;
        this.mCallbacks = null;
    }

    public boolean isLayoutAnimationEnabled() {
        NativeMethodsHolder nativeMethodsHolder = this.mNativeMethodsHolder;
        return nativeMethodsHolder != null && nativeMethodsHolder.isLayoutAnimationEnabled();
    }

    public void makeSnapshotOfTopScreenViews(ViewGroup viewGroup) {
        this.mSharedTransitionManager.doSnapshotForTopScreenViews(viewGroup);
    }

    public void maybeRegisterSharedView(View view) {
        if (hasAnimationForTag(view.getId(), 4)) {
            this.mSharedTransitionManager.notifyAboutNewView(view);
        }
    }

    public void navigationTabChanged(View view, View view2) {
        this.mSharedTransitionManager.navigationTabChanged(view, view2);
    }

    public void notifyAboutScreenWillDisappear() {
        this.mSharedTransitionManager.onScreenWillDisappear();
    }

    public void notifyAboutViewsRemoval(int[] iArr) {
        this.mSharedTransitionManager.onViewsRemoval(iArr);
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewCreate(View view, ViewGroup viewGroup, Snapshot snapshot) {
        AndroidUIScheduler androidUIScheduler;
        if (this.isInvalidated) {
            return;
        }
        maybeRegisterSharedView(view);
        if (hasAnimationForTag(view.getId(), 1) && (androidUIScheduler = this.mWeakAndroidUIScheduler.get()) != null) {
            androidUIScheduler.triggerUI();
            int id2 = view.getId();
            HashMap<String, Object> targetMap = snapshot.toTargetMap();
            if (targetMap != null) {
                this.mNativeMethodsHolder.startAnimation(id2, 1, prepareDataForAnimationWorklet(targetMap, true));
                this.mEnteringViews.add(Integer.valueOf(id2));
            }
        }
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewRemoval(View view, ViewGroup viewGroup, Runnable runnable) {
        if (this.isInvalidated) {
            return;
        }
        this.mCallbacks.put(Integer.valueOf(view.getId()), runnable);
        if (removeOrAnimateExitRecursive(view, true, true)) {
            return;
        }
        removeView(view, viewGroup);
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewUpdate(View view, Snapshot snapshot, Snapshot snapshot2) {
        if (this.isInvalidated) {
            return;
        }
        int id2 = view.getId();
        if (!hasAnimationForTag(id2, 3)) {
            if (this.mEnteringViews.contains(Integer.valueOf(id2))) {
                HashMap<Integer, Rect> map = this.mEnteringViewTargetValues;
                Integer numValueOf = Integer.valueOf(id2);
                int i7 = snapshot2.originX;
                int i10 = snapshot2.originY;
                map.put(numValueOf, new Rect(i7, i10, snapshot2.width + i7, snapshot2.height + i10));
                int i11 = snapshot.originX;
                int i12 = snapshot.originY;
                view.layout(i11, i12, snapshot.width + i11, snapshot.height + i12);
                return;
            }
            return;
        }
        HashMap<String, Object> currentMap = snapshot.toCurrentMap();
        HashMap<String, Object> targetMap = snapshot2.toTargetMap();
        boolean z5 = true;
        for (int i13 = 0; i13 < Snapshot.targetKeysToTransform.size(); i13++) {
            if (((Number) currentMap.get(Snapshot.currentKeysToTransform.get(i13))).doubleValue() != ((Number) targetMap.get(Snapshot.targetKeysToTransform.get(i13))).doubleValue()) {
                z5 = false;
            }
        }
        if (z5) {
            return;
        }
        HashMap<String, Object> mapPrepareDataForAnimationWorklet = prepareDataForAnimationWorklet(currentMap, false);
        HashMap<String, Object> map2 = new HashMap<>(prepareDataForAnimationWorklet(targetMap, true));
        for (String str : mapPrepareDataForAnimationWorklet.keySet()) {
            map2.put(str, mapPrepareDataForAnimationWorklet.get(str));
        }
        this.mNativeMethodsHolder.startAnimation(id2, 3, map2);
    }

    public HashMap<String, Object> prepareDataForAnimationWorklet(HashMap<String, Object> map, boolean z5) {
        return prepareDataForAnimationWorklet(map, z5, false);
    }

    public void printSubTree(View view, int i7) {
        if (i7 == 0) {
            Log.v("rea", "----------------------");
        }
        if (view == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            sb2.append("+");
        }
        sb2.append(" TAG:");
        sb2.append(view.getId());
        sb2.append(" CLASS:");
        sb2.append(view.getClass().getSimpleName());
        Log.v("rea", sb2.toString());
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                return;
            }
            printSubTree(viewGroup.getChildAt(i10), i7 + 1);
            i10++;
        }
    }

    public void progressLayoutAnimation(int i7, Map<String, Object> map, boolean z5) {
        ViewGroup viewGroup;
        View viewResolveView = resolveView(i7);
        if (viewResolveView == null || (viewGroup = (ViewGroup) viewResolveView.getParent()) == null) {
            return;
        }
        ViewManager viewManagerResolveViewManager = resolveViewManager(i7);
        ViewManager viewManagerResolveViewManager2 = resolveViewManager(viewGroup.getId());
        if (viewManagerResolveViewManager == null) {
            return;
        }
        setNewProps(map, viewResolveView, viewManagerResolveViewManager, viewManagerResolveViewManager2, Integer.valueOf(viewGroup.getId()), z5);
    }

    public View resolveView(int i7) {
        if (this.mExitingViews.containsKey(Integer.valueOf(i7))) {
            return this.mExitingViews.get(Integer.valueOf(i7));
        }
        View transitioningView = this.mSharedTransitionManager.getTransitioningView(i7);
        if (transitioningView != null) {
            return transitioningView;
        }
        try {
            return this.mUIManager.resolveView(i7);
        } catch (IllegalViewOperationException unused) {
            return null;
        }
    }

    public void screenDidLayout(View view) {
        this.mSharedTransitionManager.screenDidLayout(view);
    }

    public void setAndroidUIScheduler(AndroidUIScheduler androidUIScheduler) {
        this.mWeakAndroidUIScheduler = new WeakReference<>(androidUIScheduler);
    }

    public void setNativeMethods(NativeMethodsHolder nativeMethodsHolder) {
        this.mNativeMethodsHolder = nativeMethodsHolder;
        this.mSharedTransitionManager.setNativeMethods(nativeMethodsHolder);
    }

    public void setNewProps(Map<String, Object> map, View view, ViewManager viewManager, ViewManager viewManager2, Integer num, boolean z5) {
        float fFloatValue = map.get(Snapshot.ORIGIN_X) != null ? ((Double) map.get(Snapshot.ORIGIN_X)).floatValue() : PixelUtil.toDIPFromPixel(view.getLeft());
        float fFloatValue2 = map.get(Snapshot.ORIGIN_Y) != null ? ((Double) map.get(Snapshot.ORIGIN_Y)).floatValue() : PixelUtil.toDIPFromPixel(view.getTop());
        float fFloatValue3 = map.get("width") != null ? ((Double) map.get("width")).floatValue() : PixelUtil.toDIPFromPixel(view.getWidth());
        float fFloatValue4 = map.get("height") != null ? ((Double) map.get("height")).floatValue() : PixelUtil.toDIPFromPixel(view.getHeight());
        if (map.containsKey(Snapshot.TRANSFORM_MATRIX)) {
            float[] fArr = new float[9];
            Object obj = map.get(Snapshot.TRANSFORM_MATRIX);
            if (obj instanceof ReadableNativeArray) {
                ReadableNativeArray readableNativeArray = (ReadableNativeArray) obj;
                for (int i7 = 0; i7 < 9; i7++) {
                    fArr[i7] = Double.valueOf(readableNativeArray.getDouble(i7)).floatValue();
                }
            } else {
                ArrayList arrayList = (ArrayList) map.get(Snapshot.TRANSFORM_MATRIX);
                for (int i10 = 0; i10 < 9; i10++) {
                    fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
                }
            }
            view.setScaleX(fArr[0]);
            view.setScaleY(fArr[4]);
            map.remove(Snapshot.TRANSFORM_MATRIX);
        }
        updateLayout(view, viewManager2, num.intValue(), fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, z5);
        map.remove(Snapshot.ORIGIN_X);
        map.remove(Snapshot.ORIGIN_Y);
        map.remove(Snapshot.GLOBAL_ORIGIN_X);
        map.remove(Snapshot.GLOBAL_ORIGIN_Y);
        map.remove("width");
        map.remove("height");
        if (map.size() == 0) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (String str : map.keySet()) {
            addProp(javaOnlyMap, str, map.get(str));
        }
        viewManager.updateProperties(view, new ReactStylesDiffMap(javaOnlyMap));
    }

    public void setReanimatedNativeHierarchyManager(ReanimatedNativeHierarchyManager reanimatedNativeHierarchyManager) {
        this.mReanimatedNativeHierarchyManager = reanimatedNativeHierarchyManager;
    }

    public boolean shouldAnimateExiting(int i7, boolean z5) {
        return this.mNativeMethodsHolder.shouldAnimateExiting(i7, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateLayout(View view, ViewManager viewManager, int i7, float f2, float f7, float f10, float f11, boolean z5) {
        int iRound = Math.round(PixelUtil.toPixelFromDIP(f2));
        int iRound2 = Math.round(PixelUtil.toPixelFromDIP(f7));
        int iRound3 = Math.round(PixelUtil.toPixelFromDIP(f10));
        int iRound4 = Math.round(PixelUtil.toPixelFromDIP(f11));
        view.measure(View.MeasureSpec.makeMeasureSpec(iRound3, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof RootView) {
            parent.requestLayout();
        }
        if (i7 % 10 != 1 || viewManager == 0) {
            if (z5) {
                Point pointConvertScreenLocationToViewCoordinates = convertScreenLocationToViewCoordinates(new Point(iRound, iRound2), (View) view.getParent());
                iRound = pointConvertScreenLocationToViewCoordinates.x;
                iRound2 = pointConvertScreenLocationToViewCoordinates.y;
            }
            view.layout(iRound, iRound2, iRound3 + iRound, iRound4 + iRound2);
            return;
        }
        if (!(viewManager instanceof IViewManagerWithChildren)) {
            throw new IllegalViewOperationException(g.d(i7, "[Reanimated] Trying to use view with tag ", " as a parent, but its Manager doesn't implement IViewManagerWithChildren."));
        }
        if (((IViewManagerWithChildren) viewManager).needsCustomLayoutForChildren()) {
            return;
        }
        view.layout(iRound, iRound2, iRound3 + iRound, iRound4 + iRound2);
    }

    public void viewDidLayout(View view) {
        this.mSharedTransitionManager.viewDidLayout(view);
    }

    public void visitNativeTreeAndMakeSnapshot(View view) {
        this.mSharedTransitionManager.visitNativeTreeAndMakeSnapshot(view);
    }

    public HashMap<String, Object> prepareDataForAnimationWorklet(HashMap<String, Object> map, boolean z5, boolean z6) {
        HashMap<String, Object> map2 = new HashMap<>();
        for (String str : z5 ? Snapshot.targetKeysToTransform : Snapshot.currentKeysToTransform) {
            map2.put(str, Float.valueOf(PixelUtil.toDIPFromPixel(Utils.convertToFloat(map.get(str)))));
        }
        if (z6) {
            String str2 = z5 ? Snapshot.TARGET_TRANSFORM_MATRIX : Snapshot.CURRENT_TRANSFORM_MATRIX;
            map2.put(str2, map.get(str2));
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity == null) {
            map2.put("windowWidth", Float.valueOf(PixelUtil.toDIPFromPixel(0.0f)));
            map2.put("windowHeight", Float.valueOf(PixelUtil.toDIPFromPixel(0.0f)));
            return map2;
        }
        currentActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i7 = displayMetrics.heightPixels;
        map2.put("windowWidth", Float.valueOf(PixelUtil.toDIPFromPixel(displayMetrics.widthPixels)));
        map2.put("windowHeight", Float.valueOf(PixelUtil.toDIPFromPixel(i7)));
        return map2;
    }

    private void cancelAnimationsInSubviews(ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt != null) {
                if (this.mExitingViews.containsKey(Integer.valueOf(childAt.getId()))) {
                    endLayoutAnimation(childAt.getId(), true);
                } else if ((childAt instanceof ViewGroup) && this.mExitingSubviewCountMap.containsKey(Integer.valueOf(childAt.getId()))) {
                    cancelAnimationsInSubviews((ViewGroup) childAt);
                }
            }
        }
    }
}
