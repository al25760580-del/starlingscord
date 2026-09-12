package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEvent;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class JSPointerDispatcher {
    private static final float ONMOVE_EPSILON = 0.1f;
    private static final String TAG = "PointerEvents";
    private static final int UNSELECTED_VIEW_TAG = -1;
    private static final int UNSET_CHILD_VIEW_ID = -1;
    private static final int UNSET_POINTER_ID = -1;
    private Map<Integer, float[]> mLastEventCoordinatesByPointerId;
    private Map<Integer, List<TouchTargetHelper.ViewTarget>> mLastHitPathByPointerId;
    private final ViewGroup mRootViewGroup;
    private static final int[] sRootScreenCoords = {0, 0};
    private static final Rect sChildCoords = new Rect(0, 0, 1, 1);
    private final Set<Integer> mHoveringPointerIds = new HashSet();
    private int mChildHandlingNativeGesture = -1;
    private int mPrimaryPointerId = -1;
    private int mCoalescingKey = 0;
    private int mLastButtonState = 0;
    private Map<Integer, List<TouchTargetHelper.ViewTarget>> mCurrentlyDownPointerIdsToHitPath = new HashMap();

    public JSPointerDispatcher(ViewGroup viewGroup) {
        this.mRootViewGroup = viewGroup;
    }

    private MotionEvent convertMotionToRootFrame(View view, MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr = new int[2];
        this.mRootViewGroup.getLocationOnScreen(iArr);
        motionEventObtain.setLocation(motionEvent.getRawX() - iArr[0], motionEvent.getRawY() - iArr[1]);
        return motionEventObtain;
    }

    private PointerEvent.PointerEventState createEventState(int i7, MotionEvent motionEvent) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (int i10 = 0; i10 < motionEvent.getPointerCount(); i10++) {
            float[] fArr = new float[2];
            float[] fArr2 = {motionEvent.getX(i10), motionEvent.getY(i10)};
            List<TouchTargetHelper.ViewTarget> listFindTargetPathAndCoordinatesForTouch = TouchTargetHelper.findTargetPathAndCoordinatesForTouch(fArr2[0], fArr2[1], this.mRootViewGroup, fArr);
            int pointerId = motionEvent.getPointerId(i10);
            map.put(Integer.valueOf(pointerId), fArr);
            map2.put(Integer.valueOf(pointerId), listFindTargetPathAndCoordinatesForTouch);
            map3.put(Integer.valueOf(pointerId), fArr2);
            map4.put(Integer.valueOf(pointerId), eventCoordsToScreenCoords(fArr2));
        }
        return new PointerEvent.PointerEventState(this.mPrimaryPointerId, i7, this.mLastButtonState, UIManagerHelper.getSurfaceId(this.mRootViewGroup), map, map2, map3, map4, this.mHoveringPointerIds);
    }

    private static void debugPrintHitPath(List<TouchTargetHelper.ViewTarget> list) {
        StringBuilder sb2 = new StringBuilder("hitPath: ");
        Iterator<TouchTargetHelper.ViewTarget> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(String.format("%d, ", Integer.valueOf(it.next().getViewId())));
        }
        o8.a.b(TAG, sb2.toString());
    }

    private void dispatchCancelEventForTarget(View view, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        io.sentry.config.a.e(this.mChildHandlingNativeGesture == -1, "Expected to not have already sent a cancel for this gesture");
        List<TouchTargetHelper.ViewTarget> list = pointerEventState.getHitPathByPointerId().get(Integer.valueOf(pointerEventState.getActivePointerId()));
        if (list.isEmpty() || view == null) {
            return;
        }
        if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.CANCEL, PointerEventHelper.EVENT.CANCEL_CAPTURE)) {
            int viewId = list.get(0).getViewId();
            Rect childOffsetRelativeToRoot = getChildOffsetRelativeToRoot(view);
            PointerEvent.PointerEventState pointerEventStateNormalizeToRoot = normalizeToRoot(pointerEventState, childOffsetRelativeToRoot.left, childOffsetRelativeToRoot.top);
            io.sentry.config.a.f(eventDispatcher);
            eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_CANCEL, viewId, pointerEventStateNormalizeToRoot, motionEvent));
        }
        incrementCoalescingKey();
        this.mPrimaryPointerId = -1;
    }

    private static void dispatchEventForViewTargets(String str, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, List<TouchTargetHelper.ViewTarget> list, EventDispatcher eventDispatcher) {
        Iterator<TouchTargetHelper.ViewTarget> it = list.iterator();
        while (it.hasNext()) {
            eventDispatcher.dispatchEvent(PointerEvent.obtain(str, it.next().getViewId(), pointerEventState, motionEvent));
        }
    }

    private float[] eventCoordsToScreenCoords(float[] fArr) {
        ViewGroup viewGroup = this.mRootViewGroup;
        int[] iArr = sRootScreenCoords;
        viewGroup.getLocationOnScreen(iArr);
        return new float[]{fArr[0] + iArr[0], fArr[1] + iArr[1]};
    }

    private static List<TouchTargetHelper.ViewTarget> filterByShouldDispatch(List<TouchTargetHelper.ViewTarget> list, PointerEventHelper.EVENT event, PointerEventHelper.EVENT event2, boolean z5) {
        ArrayList arrayList = new ArrayList(list);
        if (!z5) {
            boolean z6 = false;
            for (int size = list.size() - 1; size >= 0; size--) {
                View view = list.get(size).getView();
                if (!z6 && !PointerEventHelper.isListening(view, event2) && !PointerEventHelper.isListening(view, event)) {
                    arrayList.remove(size);
                } else if (!z6 && PointerEventHelper.isListening(view, event2)) {
                    z6 = true;
                }
            }
        }
        return arrayList;
    }

    private static List<TouchTargetHelper.ViewTarget> findHitPathIntersection(List<TouchTargetHelper.ViewTarget> list, List<TouchTargetHelper.ViewTarget> list2) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list2.isEmpty()) {
            return new ArrayList();
        }
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList();
        for (TouchTargetHelper.ViewTarget viewTarget : list2) {
            if (hashSet.contains(viewTarget)) {
                arrayList.add(viewTarget);
            }
        }
        return arrayList;
    }

    private Rect getChildOffsetRelativeToRoot(View view) {
        Rect rect = sChildCoords;
        rect.set(0, 0, 1, 1);
        if (view.getRootView() != this.mRootViewGroup.getRootView()) {
            return rect;
        }
        this.mRootViewGroup.offsetDescendantRectToMyCoords(view, rect);
        return rect;
    }

    private short getCoalescingKey() {
        return (short) (65535 & this.mCoalescingKey);
    }

    private void handleHitStateDivergence(int i7, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        int activePointerId = pointerEventState.getActivePointerId();
        List<TouchTargetHelper.ViewTarget> arrayList = i7 != -1 ? pointerEventState.getHitPathByPointerId().get(Integer.valueOf(activePointerId)) : new ArrayList<>();
        Map<Integer, List<TouchTargetHelper.ViewTarget>> map = this.mLastHitPathByPointerId;
        List<TouchTargetHelper.ViewTarget> arrayList2 = (map == null || !map.containsKey(Integer.valueOf(activePointerId))) ? new ArrayList<>() : this.mLastHitPathByPointerId.get(Integer.valueOf(activePointerId));
        int i10 = 0;
        boolean z5 = false;
        boolean z6 = false;
        while (i10 < Math.min(arrayList.size(), arrayList2.size()) && arrayList.get((arrayList.size() - 1) - i10).equals(arrayList2.get((arrayList2.size() - 1) - i10))) {
            View view = arrayList.get((arrayList.size() - 1) - i10).getView();
            if (!z5 && PointerEventHelper.isListening(view, PointerEventHelper.EVENT.ENTER_CAPTURE)) {
                z5 = true;
            }
            if (!z6 && PointerEventHelper.isListening(view, PointerEventHelper.EVENT.LEAVE_CAPTURE)) {
                z6 = true;
            }
            i10++;
        }
        if (i10 < Math.max(arrayList.size(), arrayList2.size())) {
            incrementCoalescingKey();
            if (arrayList2.size() > 0) {
                int viewId = arrayList2.get(0).getViewId();
                if (isAnyoneListeningForBubblingEvent(arrayList2, PointerEventHelper.EVENT.OUT, PointerEventHelper.EVENT.OUT_CAPTURE)) {
                    eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OUT, viewId, pointerEventState, motionEvent));
                }
                List<TouchTargetHelper.ViewTarget> listFilterByShouldDispatch = filterByShouldDispatch(arrayList2.subList(0, arrayList2.size() - i10), PointerEventHelper.EVENT.LEAVE, PointerEventHelper.EVENT.LEAVE_CAPTURE, z6);
                if (listFilterByShouldDispatch.size() > 0) {
                    dispatchEventForViewTargets(PointerEventHelper.POINTER_LEAVE, pointerEventState, motionEvent, listFilterByShouldDispatch, eventDispatcher);
                }
            }
            if (isAnyoneListeningForBubblingEvent(arrayList, PointerEventHelper.EVENT.OVER, PointerEventHelper.EVENT.OVER_CAPTURE)) {
                eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OVER, i7, pointerEventState, motionEvent));
            }
            List<TouchTargetHelper.ViewTarget> listFilterByShouldDispatch2 = filterByShouldDispatch(arrayList.subList(0, arrayList.size() - i10), PointerEventHelper.EVENT.ENTER, PointerEventHelper.EVENT.ENTER_CAPTURE, z5);
            if (listFilterByShouldDispatch2.size() > 0) {
                Collections.reverse(listFilterByShouldDispatch2);
                dispatchEventForViewTargets(PointerEventHelper.POINTER_ENTER, pointerEventState, motionEvent, listFilterByShouldDispatch2, eventDispatcher);
            }
        }
        HashMap map2 = new HashMap(pointerEventState.getHitPathByPointerId());
        if (i7 == -1) {
            map2.remove(Integer.valueOf(activePointerId));
        }
        this.mLastHitPathByPointerId = map2;
    }

    private void incrementCoalescingKey() {
        this.mCoalescingKey = (this.mCoalescingKey + 1) % Integer.MAX_VALUE;
    }

    private static boolean isAnyoneListeningForBubblingEvent(List<TouchTargetHelper.ViewTarget> list, PointerEventHelper.EVENT event, PointerEventHelper.EVENT event2) {
        for (TouchTargetHelper.ViewTarget viewTarget : list) {
            if (PointerEventHelper.isListening(viewTarget.getView(), event) || PointerEventHelper.isListening(viewTarget.getView(), event2)) {
                return true;
            }
        }
        return false;
    }

    private PointerEvent.PointerEventState normalizeToRoot(PointerEvent.PointerEventState pointerEventState, float f2, float f7) {
        HashMap map = new HashMap(pointerEventState.getOffsetByPointerId());
        HashMap map2 = new HashMap(pointerEventState.getEventCoordinatesByPointerId());
        HashMap map3 = new HashMap(pointerEventState.getScreenCoordinatesByPointerId());
        float[] fArr = {f2, f7};
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((Map.Entry) it.next()).setValue(fArr);
        }
        float[] fArr2 = {0.0f, 0.0f};
        Iterator it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            ((Map.Entry) it2.next()).setValue(fArr2);
        }
        float[] fArrEventCoordsToScreenCoords = eventCoordsToScreenCoords(fArr);
        Iterator it3 = map3.entrySet().iterator();
        while (it3.hasNext()) {
            ((Map.Entry) it3.next()).setValue(fArrEventCoordsToScreenCoords);
        }
        return new PointerEvent.PointerEventState(pointerEventState.getPrimaryPointerId(), pointerEventState.getActivePointerId(), pointerEventState.getLastButtonState(), pointerEventState.getSurfaceId(), map, new HashMap(pointerEventState.getHitPathByPointerId()), map2, map3, new HashSet(pointerEventState.getHoveringPointerIds()));
    }

    private void onDown(int i7, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        List<TouchTargetHelper.ViewTarget> list = pointerEventState.getHitPathByPointerId().get(Integer.valueOf(pointerEventState.getActivePointerId()));
        incrementCoalescingKey();
        if (!this.mHoveringPointerIds.contains(Integer.valueOf(pointerEventState.getActivePointerId()))) {
            if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.OVER, PointerEventHelper.EVENT.OVER_CAPTURE)) {
                eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OVER, i7, pointerEventState, motionEvent));
            }
            List<TouchTargetHelper.ViewTarget> listFilterByShouldDispatch = filterByShouldDispatch(list, PointerEventHelper.EVENT.ENTER, PointerEventHelper.EVENT.ENTER_CAPTURE, false);
            Collections.reverse(listFilterByShouldDispatch);
            dispatchEventForViewTargets(PointerEventHelper.POINTER_ENTER, pointerEventState, motionEvent, listFilterByShouldDispatch, eventDispatcher);
        }
        if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.CLICK, PointerEventHelper.EVENT.CLICK_CAPTURE)) {
            this.mCurrentlyDownPointerIdsToHitPath.put(Integer.valueOf(pointerEventState.getActivePointerId()), new ArrayList(list));
        }
        if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.DOWN, PointerEventHelper.EVENT.DOWN_CAPTURE)) {
            eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_DOWN, i7, pointerEventState, motionEvent, ReactNativeFeatureFlags.cxxNativeAnimatedEnabled() ? pointerEventState.getHitPathViewIdsForActivePointer() : null));
        }
    }

    private void onMove(int i7, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (isAnyoneListeningForBubblingEvent(pointerEventState.getHitPathByPointerId().get(Integer.valueOf(pointerEventState.getActivePointerId())), PointerEventHelper.EVENT.MOVE, PointerEventHelper.EVENT.MOVE_CAPTURE)) {
            eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_MOVE, i7, pointerEventState, motionEvent, getCoalescingKey()));
        }
    }

    private void onUp(int i7, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        int activePointerId = pointerEventState.getActivePointerId();
        List<TouchTargetHelper.ViewTarget> list = pointerEventState.getHitPathByPointerId().get(Integer.valueOf(activePointerId));
        if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.UP, PointerEventHelper.EVENT.UP_CAPTURE)) {
            eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_UP, i7, pointerEventState, motionEvent, ReactNativeFeatureFlags.cxxNativeAnimatedEnabled() ? pointerEventState.getHitPathViewIdsForActivePointer() : null));
        }
        if (!this.mHoveringPointerIds.contains(Integer.valueOf(activePointerId))) {
            if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.OUT, PointerEventHelper.EVENT.OUT_CAPTURE)) {
                eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OUT, i7, pointerEventState, motionEvent));
            }
            dispatchEventForViewTargets(PointerEventHelper.POINTER_LEAVE, pointerEventState, motionEvent, filterByShouldDispatch(list, PointerEventHelper.EVENT.LEAVE, PointerEventHelper.EVENT.LEAVE_CAPTURE, false), eventDispatcher);
        }
        List<TouchTargetHelper.ViewTarget> listRemove = this.mCurrentlyDownPointerIdsToHitPath.remove(Integer.valueOf(activePointerId));
        if (listRemove != null && isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.CLICK, PointerEventHelper.EVENT.CLICK_CAPTURE)) {
            List<TouchTargetHelper.ViewTarget> listFindHitPathIntersection = findHitPathIntersection(listRemove, list);
            if (!listFindHitPathIntersection.isEmpty()) {
                eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.CLICK, listFindHitPathIntersection.get(0).getViewId(), pointerEventState, motionEvent));
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            this.mPrimaryPointerId = -1;
        }
        this.mHoveringPointerIds.remove(Integer.valueOf(activePointerId));
    }

    private static boolean qualifiedMove(float[] fArr, float[] fArr2) {
        return Math.abs(fArr2[0] - fArr[0]) > ONMOVE_EPSILON || Math.abs(fArr2[1] - fArr[1]) > ONMOVE_EPSILON;
    }

    public void handleMotionEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z5) {
        int viewId;
        View view;
        if (this.mChildHandlingNativeGesture != -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 10 || motionEvent.getButtonState() == 0) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (actionMasked == 0) {
                this.mPrimaryPointerId = motionEvent.getPointerId(0);
            } else if (actionMasked == 7) {
                this.mHoveringPointerIds.add(Integer.valueOf(pointerId));
            }
            PointerEvent.PointerEventState pointerEventStateCreateEventState = createEventState(pointerId, motionEvent);
            boolean z6 = z5 && actionMasked == 10;
            if (z6) {
                Map<Integer, List<TouchTargetHelper.ViewTarget>> map = this.mLastHitPathByPointerId;
                List<TouchTargetHelper.ViewTarget> list = map != null ? map.get(Integer.valueOf(pointerEventStateCreateEventState.getActivePointerId())) : null;
                if (list == null || list.isEmpty()) {
                    return;
                }
                TouchTargetHelper.ViewTarget viewTarget = (TouchTargetHelper.ViewTarget) kk.b.f(1, list);
                viewId = viewTarget.getViewId();
                view = viewTarget.getView();
                pointerEventStateCreateEventState.getHitPathByPointerId().put(Integer.valueOf(pointerId), new ArrayList());
            } else {
                List<TouchTargetHelper.ViewTarget> list2 = pointerEventStateCreateEventState.getHitPathByPointerId().get(Integer.valueOf(pointerId));
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                TouchTargetHelper.ViewTarget viewTarget2 = list2.get(0);
                viewId = viewTarget2.getViewId();
                view = viewTarget2.getView();
            }
            handleHitStateDivergence(viewId, pointerEventStateCreateEventState, motionEvent, eventDispatcher);
            switch (actionMasked) {
                case 0:
                case 5:
                    onDown(viewId, pointerEventStateCreateEventState, motionEvent, eventDispatcher);
                    break;
                case 1:
                case 6:
                    incrementCoalescingKey();
                    onUp(viewId, pointerEventStateCreateEventState, motionEvent, eventDispatcher);
                    break;
                case 2:
                    onMove(viewId, pointerEventStateCreateEventState, motionEvent, eventDispatcher);
                    break;
                case 3:
                    dispatchCancelEventForTarget(view, pointerEventStateCreateEventState, motionEvent, eventDispatcher);
                    handleHitStateDivergence(-1, pointerEventStateCreateEventState, motionEvent, eventDispatcher);
                    break;
                case 4:
                case 8:
                default:
                    o8.a.v(ReactConstants.TAG, "Motion Event was ignored. Action=" + actionMasked + " Target=" + viewId);
                    return;
                case 7:
                    float[] fArr = pointerEventStateCreateEventState.getEventCoordinatesByPointerId().get(Integer.valueOf(pointerId));
                    Map<Integer, float[]> map2 = this.mLastEventCoordinatesByPointerId;
                    if (!qualifiedMove(fArr, (map2 == null || !map2.containsKey(Integer.valueOf(pointerId))) ? new float[]{0.0f, 0.0f} : this.mLastEventCoordinatesByPointerId.get(Integer.valueOf(pointerId)))) {
                        return;
                    } else {
                        onMove(viewId, pointerEventStateCreateEventState, motionEvent, eventDispatcher);
                    }
                    break;
                case 9:
                    return;
                case 10:
                    if (z6) {
                        onMove(viewId, pointerEventStateCreateEventState, motionEvent, eventDispatcher);
                    }
                    break;
            }
            this.mLastEventCoordinatesByPointerId = new HashMap(pointerEventStateCreateEventState.getEventCoordinatesByPointerId());
            this.mLastButtonState = motionEvent.getButtonState();
            this.mHoveringPointerIds.retainAll(this.mLastEventCoordinatesByPointerId.keySet());
        }
    }

    public void onChildEndedNativeGesture() {
        this.mChildHandlingNativeGesture = -1;
    }

    public void onChildStartedNativeGesture(View view, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.mChildHandlingNativeGesture != -1 || view == null) {
            return;
        }
        MotionEvent motionEventConvertMotionToRootFrame = convertMotionToRootFrame(view, motionEvent);
        motionEventConvertMotionToRootFrame.setAction(3);
        handleMotionEvent(motionEventConvertMotionToRootFrame, eventDispatcher, false);
        this.mChildHandlingNativeGesture = view.getId();
    }
}
