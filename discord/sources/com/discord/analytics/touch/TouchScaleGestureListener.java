package com.discord.analytics.touch;

import android.app.Activity;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0012"}, d2 = {"Lcom/discord/analytics/touch/TouchScaleGestureListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "<init>", "()V", "getScreenCoordsFromWindow", "Lkotlin/Pair;", "", "activity", "Landroid/app/Activity;", "windowX", "", "windowY", "onScaleBegin", "", "detector", "Landroid/view/ScaleGestureDetector;", "onScaleEnd", "", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTouchScaleGestureListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchScaleGestureListener.kt\ncom/discord/analytics/touch/TouchScaleGestureListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
public final class TouchScaleGestureListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    private final Pair<Integer, Integer> getScreenCoordsFromWindow(Activity activity, float windowX, float windowY) {
        int[] iArr = new int[2];
        activity.getWindow().getDecorView().getLocationOnScreen(iArr);
        return new Pair<>(Integer.valueOf((int) (iArr[0] + windowX)), Integer.valueOf((int) (iArr[1] + windowY)));
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(@NotNull ScaleGestureDetector detector) {
        WeakReference<Activity> activityRef$analytics_release;
        Activity activity;
        Intrinsics.checkNotNullParameter(detector, "detector");
        TouchLogger touchLogger = TouchLogger.INSTANCE;
        if (touchLogger.getListenerCount() != 0 && (activityRef$analytics_release = touchLogger.getActivityRef$analytics_release()) != null && (activity = activityRef$analytics_release.get()) != null) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            String strIdentifyWindow$analytics_release = touchLogger.identifyWindow$analytics_release(window);
            MemoryStats memoryStats = TouchLoggerMemory.INSTANCE.getMemoryStats("TouchLogger");
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            Pair<Integer, Integer> screenCoordsFromWindow = getScreenCoordsFromWindow(activity, focusX, focusY);
            int iIntValue = ((Number) screenCoordsFromWindow.f14612d).intValue();
            int iIntValue2 = ((Number) screenCoordsFromWindow.f14613e).intValue();
            float[] fArr = {focusX, focusY};
            View decorView = activity.getWindow().getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            touchLogger.notifyListeners$analytics_release(TouchEventListenerKt.createTouchEventDetails("pinch_start", System.currentTimeMillis(), iIntValue, iIntValue2, (int) fArr[0], (int) fArr[1], memoryStats, TouchViewInspector.INSTANCE.formatViewHierarchy(viewGroup != null ? TouchViewInspector.INSTANCE.findTouchTargetView(fArr, viewGroup) : null), "pinch", (16384 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : strIdentifyWindow$analytics_release, (16384 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (16384 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : null, (16384 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (16384 & 8192) != 0 ? null : null, (16384 & 16384) != 0 ? null : Double.valueOf(detector.getScaleFactor())));
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(@NotNull ScaleGestureDetector detector) {
        WeakReference<Activity> activityRef$analytics_release;
        Activity activity;
        Intrinsics.checkNotNullParameter(detector, "detector");
        TouchLogger touchLogger = TouchLogger.INSTANCE;
        if (touchLogger.getListenerCount() == 0 || (activityRef$analytics_release = touchLogger.getActivityRef$analytics_release()) == null || (activity = activityRef$analytics_release.get()) == null) {
            return;
        }
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        String strIdentifyWindow$analytics_release = touchLogger.identifyWindow$analytics_release(window);
        MemoryStats memoryStats = TouchLoggerMemory.INSTANCE.getMemoryStats("TouchLogger");
        float focusX = detector.getFocusX();
        float focusY = detector.getFocusY();
        Pair<Integer, Integer> screenCoordsFromWindow = getScreenCoordsFromWindow(activity, focusX, focusY);
        int iIntValue = ((Number) screenCoordsFromWindow.f14612d).intValue();
        int iIntValue2 = ((Number) screenCoordsFromWindow.f14613e).intValue();
        float[] fArr = {focusX, focusY};
        View decorView = activity.getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        touchLogger.notifyListeners$analytics_release(TouchEventListenerKt.createTouchEventDetails("pinch_end", System.currentTimeMillis(), iIntValue, iIntValue2, (int) fArr[0], (int) fArr[1], memoryStats, TouchViewInspector.INSTANCE.formatViewHierarchy(viewGroup != null ? TouchViewInspector.INSTANCE.findTouchTargetView(fArr, viewGroup) : null), "pinch", (16384 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : strIdentifyWindow$analytics_release, (16384 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : null, (16384 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : null, (16384 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (16384 & 8192) != 0 ? null : null, (16384 & 16384) != 0 ? null : Double.valueOf(detector.getScaleFactor())));
    }
}
