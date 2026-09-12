package com.facebook.react.uimanager;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.touch.ReactHitSlopView;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u000212B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J2\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0007J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0003J8\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\"H\u0002J \u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J \u0010'\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J0\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u0007H\u0002J,\u0010,\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\"H\u0002J \u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/facebook/react/uimanager/TouchTargetHelper;", "", "<init>", "()V", "eventCoords", "", "tempPoint", "Landroid/graphics/PointF;", "matrixTransformCoords", "inverseMatrix", "Landroid/graphics/Matrix;", "findTargetTagForTouch", "", "eventX", "", "eventY", "viewGroup", "Landroid/view/ViewGroup;", "nativeViewId", "", "findTargetTagAndCoordinatesForTouch", "viewCoords", "nativeViewTag", "findTargetPathAndCoordinatesForTouch", "", "Lcom/facebook/react/uimanager/TouchTargetHelper$ViewTarget;", "findClosestReactAncestor", "Landroid/view/View;", "view", "findTouchTargetView", "allowReturnTouchTargetTypes", "Ljava/util/EnumSet;", "Lcom/facebook/react/uimanager/TouchTargetHelper$TouchTargetReturnType;", "pathAccumulator", "", "isTouchPointInView", "", "x", "y", "isTouchPointInViewWithOverflowInset", "getChildPoint", "parent", "child", "outLocalPoint", "findTouchTargetViewWithPointerEvents", "getTouchTargetForView", "targetView", "viewX", "viewY", "TouchTargetReturnType", "ViewTarget", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTouchTargetHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchTargetHelper.kt\ncom/facebook/react/uimanager/TouchTargetHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
public final class TouchTargetHelper {

    @NotNull
    public static final TouchTargetHelper INSTANCE = new TouchTargetHelper();

    @NotNull
    private static final float[] eventCoords = new float[2];

    @NotNull
    private static final PointF tempPoint = new PointF();

    @NotNull
    private static final float[] matrixTransformCoords = new float[2];

    @NotNull
    private static final Matrix inverseMatrix = new Matrix();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/uimanager/TouchTargetHelper$TouchTargetReturnType;", "", "<init>", "(Ljava/lang/String;I)V", "SELF", "CHILD", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum TouchTargetReturnType {
        SELF,
        CHILD;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/TouchTargetHelper$ViewTarget;", "", "viewId", "", "view", "Landroid/view/View;", "<init>", "(ILandroid/view/View;)V", "getViewId", "getView", "equals", "", "other", "hashCode", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewTarget {
        private final View view;
        private final int viewId;

        public ViewTarget(int i7, View view) {
            this.viewId = i7;
            this.view = view;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewTarget) && ((ViewTarget) other).getViewId() == this.viewId;
        }

        public final View getView() {
            return this.view;
        }

        public final int getViewId() {
            return this.viewId;
        }

        public int hashCode() {
            return Integer.hashCode(this.viewId);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEvents.values().length];
            try {
                iArr[PointerEvents.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEvents.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEvents.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerEvents.BOX_NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TouchTargetHelper() {
    }

    @SuppressLint({"ResourceType"})
    private final View findClosestReactAncestor(View view) {
        while (view != null && view.getId() <= 0) {
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view;
    }

    @SuppressLint({"ResourceType"})
    @NotNull
    public static final List<ViewTarget> findTargetPathAndCoordinatesForTouch(float eventX, float eventY, @NotNull ViewGroup viewGroup, @NotNull float[] viewCoords) {
        int touchTargetForView;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(viewCoords, "viewCoords");
        UiThreadUtil.assertOnUiThread();
        viewCoords[0] = eventX;
        viewCoords[1] = eventY;
        ArrayList arrayList = new ArrayList();
        View viewFindTouchTargetViewWithPointerEvents = INSTANCE.findTouchTargetViewWithPointerEvents(viewCoords, viewGroup, arrayList);
        if (viewFindTouchTargetViewWithPointerEvents != null) {
            int i7 = 0;
            while (viewFindTouchTargetViewWithPointerEvents != null && viewFindTouchTargetViewWithPointerEvents.getId() <= 0) {
                Object parent = viewFindTouchTargetViewWithPointerEvents.getParent();
                viewFindTouchTargetViewWithPointerEvents = parent instanceof View ? (View) parent : null;
                i7++;
            }
            if (i7 > 0 && i7 <= arrayList.size()) {
                arrayList.subList(i7, arrayList.size());
            }
            if (viewFindTouchTargetViewWithPointerEvents != null && (touchTargetForView = INSTANCE.getTouchTargetForView(viewFindTouchTargetViewWithPointerEvents, viewCoords[0], viewCoords[1])) != viewFindTouchTargetViewWithPointerEvents.getId()) {
                arrayList.add(0, new ViewTarget(touchTargetForView, null));
            }
        }
        return arrayList;
    }

    public static final int findTargetTagAndCoordinatesForTouch(float eventX, float eventY, @NotNull ViewGroup viewGroup, @NotNull float[] viewCoords, int[] nativeViewTag) {
        View viewFindClosestReactAncestor;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(viewCoords, "viewCoords");
        UiThreadUtil.assertOnUiThread();
        int id2 = viewGroup.getId();
        viewCoords[0] = eventX;
        viewCoords[1] = eventY;
        TouchTargetHelper touchTargetHelper = INSTANCE;
        View viewFindTouchTargetViewWithPointerEvents$default = findTouchTargetViewWithPointerEvents$default(touchTargetHelper, viewCoords, viewGroup, null, 4, null);
        if (viewFindTouchTargetViewWithPointerEvents$default == null || (viewFindClosestReactAncestor = touchTargetHelper.findClosestReactAncestor(viewFindTouchTargetViewWithPointerEvents$default)) == null) {
            return id2;
        }
        if (nativeViewTag != null) {
            nativeViewTag[0] = viewFindClosestReactAncestor.getId();
        }
        return touchTargetHelper.getTouchTargetForView(viewFindClosestReactAncestor, viewCoords[0], viewCoords[1]);
    }

    public static final int findTargetTagForTouch(float eventX, float eventY, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return findTargetTagAndCoordinatesForTouch(eventX, eventY, viewGroup, eventCoords, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View findTouchTargetView(float[] eventCoords2, View view, EnumSet<TouchTargetReturnType> allowReturnTouchTargetTypes, List<ViewTarget> pathAccumulator) {
        if (allowReturnTouchTargetTypes.contains(TouchTargetReturnType.CHILD) && (view instanceof ViewGroup)) {
            if (!isTouchPointInView(eventCoords2[0], eventCoords2[1], view)) {
                if (view instanceof ReactOverflowViewWithInset) {
                    if (!isTouchPointInViewWithOverflowInset(eventCoords2[0], eventCoords2[1], view)) {
                        return null;
                    }
                    String overflow = ((ReactOverflowView) view).getOverflow();
                    if (Intrinsics.areEqual(ViewProps.HIDDEN, overflow) || Intrinsics.areEqual(ViewProps.SCROLL, overflow)) {
                        return null;
                    }
                }
                if (((ViewGroup) view).getClipChildren()) {
                    return null;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                PointF pointF = tempPoint;
                float f2 = eventCoords2[0];
                float f7 = eventCoords2[1];
                Intrinsics.checkNotNull(childAt);
                if (getChildPoint(f2, f7, viewGroup, childAt, pointF)) {
                    float f10 = eventCoords2[0];
                    float f11 = eventCoords2[1];
                    eventCoords2[0] = pointF.x;
                    eventCoords2[1] = pointF.y;
                    View viewFindTouchTargetViewWithPointerEvents = findTouchTargetViewWithPointerEvents(eventCoords2, childAt, pathAccumulator);
                    if (viewFindTouchTargetViewWithPointerEvents != null) {
                        return viewFindTouchTargetViewWithPointerEvents;
                    }
                    eventCoords2[0] = f10;
                    eventCoords2[1] = f11;
                }
            }
        }
        if (allowReturnTouchTargetTypes.contains(TouchTargetReturnType.SELF) && isTouchPointInView(eventCoords2[0], eventCoords2[1], view)) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View findTouchTargetViewWithPointerEvents(float[] eventCoords2, View view, List<ViewTarget> pathAccumulator) {
        PointerEvents pointerEvents = view instanceof ReactPointerEventsView ? ((ReactPointerEventsView) view).getPointerEvents() : PointerEvents.AUTO;
        if (!view.isEnabled()) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[pointerEvents.ordinal()];
            if (i7 == 1) {
                pointerEvents = PointerEvents.BOX_NONE;
            } else if (i7 == 2) {
                pointerEvents = PointerEvents.NONE;
            }
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[pointerEvents.ordinal()];
        if (i10 == 2) {
            EnumSet<TouchTargetReturnType> enumSetOf = EnumSet.of(TouchTargetReturnType.SELF);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
            View viewFindTouchTargetView = findTouchTargetView(eventCoords2, view, enumSetOf, pathAccumulator);
            if (viewFindTouchTargetView != null && pathAccumulator != null) {
                pathAccumulator.add(new ViewTarget(view.getId(), view));
            }
            return viewFindTouchTargetView;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                if (pointerEvents != PointerEvents.AUTO) {
                    o8.a.v(ReactConstants.TAG, "Unknown pointer event type: " + pointerEvents);
                }
                if (!(view instanceof ReactCompoundViewGroup) || !isTouchPointInView(eventCoords2[0], eventCoords2[1], view) || !((ReactCompoundViewGroup) view).interceptsTouchEvent(eventCoords2[0], eventCoords2[1])) {
                    EnumSet<TouchTargetReturnType> enumSetOf2 = EnumSet.of(TouchTargetReturnType.SELF, TouchTargetReturnType.CHILD);
                    Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                    View viewFindTouchTargetView2 = findTouchTargetView(eventCoords2, view, enumSetOf2, pathAccumulator);
                    if (viewFindTouchTargetView2 != null && pathAccumulator != null) {
                        pathAccumulator.add(new ViewTarget(view.getId(), view));
                    }
                    return viewFindTouchTargetView2;
                }
                if (pathAccumulator != null) {
                    pathAccumulator.add(new ViewTarget(view.getId(), view));
                    return view;
                }
            } else {
                EnumSet<TouchTargetReturnType> enumSetOf3 = EnumSet.of(TouchTargetReturnType.CHILD);
                Intrinsics.checkNotNullExpressionValue(enumSetOf3, "of(...)");
                View viewFindTouchTargetView3 = findTouchTargetView(eventCoords2, view, enumSetOf3, pathAccumulator);
                if (viewFindTouchTargetView3 != null) {
                    if (pathAccumulator != null) {
                        pathAccumulator.add(new ViewTarget(view.getId(), view));
                    }
                    return viewFindTouchTargetView3;
                }
                if ((view instanceof ReactCompoundView) && isTouchPointInView(eventCoords2[0], eventCoords2[1], view) && ((ReactCompoundView) view).reactTagForTouch(eventCoords2[0], eventCoords2[1]) != view.getId()) {
                    if (pathAccumulator != null) {
                        pathAccumulator.add(new ViewTarget(view.getId(), view));
                    }
                }
            }
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ View findTouchTargetViewWithPointerEvents$default(TouchTargetHelper touchTargetHelper, float[] fArr, View view, List list, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            list = null;
        }
        return touchTargetHelper.findTouchTargetViewWithPointerEvents(fArr, view, list);
    }

    private final boolean getChildPoint(float x5, float y5, ViewGroup parent, View child, PointF outLocalPoint) {
        float scrollX = (x5 + parent.getScrollX()) - child.getLeft();
        float scrollY = (y5 + parent.getScrollY()) - child.getTop();
        Matrix matrix = child.getMatrix();
        if (!matrix.isIdentity()) {
            Matrix matrix2 = inverseMatrix;
            if (!matrix.invert(matrix2)) {
                return false;
            }
            float[] fArr = matrixTransformCoords;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        outLocalPoint.set(scrollX, scrollY);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getTouchTargetForView(View targetView, float viewX, float viewY) {
        return targetView instanceof ReactCompoundView ? ((ReactCompoundView) targetView).reactTagForTouch(viewX, viewY) : targetView.getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isTouchPointInView(float x5, float y5, View view) {
        ReactHitSlopView reactHitSlopView = view instanceof ReactHitSlopView ? (ReactHitSlopView) view : null;
        Rect hitSlopRect = reactHitSlopView != null ? reactHitSlopView.getHitSlopRect() : null;
        if (hitSlopRect != null) {
            return x5 >= ((float) (-hitSlopRect.left)) && x5 < ((float) (view.getWidth() + hitSlopRect.right)) && y5 >= ((float) (-hitSlopRect.top)) && y5 < ((float) (view.getHeight() + hitSlopRect.bottom));
        }
        return x5 >= 0.0f && x5 < ((float) view.getWidth()) && y5 >= 0.0f && y5 < ((float) view.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isTouchPointInViewWithOverflowInset(float x5, float y5, View view) {
        if (!(view instanceof ReactOverflowViewWithInset)) {
            return false;
        }
        Rect overflowInset = ((ReactOverflowViewWithInset) view).getOverflowInset();
        return x5 >= ((float) overflowInset.left) && x5 < ((float) (view.getWidth() - overflowInset.right)) && y5 >= ((float) overflowInset.top) && y5 < ((float) (view.getHeight() - overflowInset.bottom));
    }

    public static final int findTargetTagForTouch(float eventX, float eventY, @NotNull ViewGroup viewGroup, int[] nativeViewId) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return findTargetTagAndCoordinatesForTouch(eventX, eventY, viewGroup, eventCoords, nativeViewId);
    }
}
