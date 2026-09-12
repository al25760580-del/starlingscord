package com.discord.analytics.touch;

import a1.k;
import a3.e;
import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.logging.Log;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001GB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\nJ\u000e\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020\nJ\u0006\u0010-\u001a\u00020+J\u000e\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020!J\u000e\u00100\u001a\u00020+2\u0006\u0010/\u001a\u00020!J\u0006\u00101\u001a\u00020+J\u0006\u00102\u001a\u000203J\u0015\u00104\u001a\u00020+2\u0006\u00105\u001a\u000206H\u0000¢\u0006\u0002\b7J\u0010\u00108\u001a\u00020+2\u0006\u0010,\u001a\u00020\nH\u0002J\b\u00109\u001a\u00020+H\u0002J\u0010\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020+2\u0006\u0010,\u001a\u00020\nH\u0002J\u0018\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u0005H\u0002J\u0015\u0010A\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u0015H\u0000¢\u0006\u0002\bBJ \u0010C\u001a\u00020+2\u0006\u00105\u001a\u00020D2\u0006\u0010E\u001a\u00020<2\u0006\u0010F\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/discord/analytics/touch/TouchLogger;", "", "<init>", "()V", "TAG", "", "isEnabled", "", "activityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getActivityRef$analytics_release", "()Ljava/lang/ref/WeakReference;", "setActivityRef$analytics_release", "(Ljava/lang/ref/WeakReference;)V", "application", "Landroid/app/Application;", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "trackedWindows", "", "Landroid/view/Window;", "Landroid/view/Window$Callback;", "windowFocusListener", "Lcom/discord/analytics/touch/TouchLogger$WindowFocusListener;", "windowFocusChangeListener", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "monitoredDecorView", "Landroid/view/View;", "eventListeners", "", "Lcom/discord/analytics/touch/OnEventRecognizedListener;", "listenerLock", "initialX", "", "initialY", "startTime", "", "callbackHandler", "Landroid/os/Handler;", "enable", "", "activity", "disable", "registerListener", "listener", "unregisterListener", "clearListeners", "getListenerCount", "", "notifyListeners", "event", "Lcom/discord/analytics/touch/TouchEventDetails;", "notifyListeners$analytics_release", "startWindowMonitoring", "stopWindowMonitoring", "detectPortalsAndBottomSheets", "decorView", "Landroid/view/ViewGroup;", "scanForNewWindows", "trackWindow", "window", StackTraceHelper.NAME_KEY, "identifyWindow", "identifyWindow$analytics_release", "handleTouchEvent", "Landroid/view/MotionEvent;", "rootView", "windowName", "WindowFocusListener", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTouchLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchLogger.kt\ncom/discord/analytics/touch/TouchLogger\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,464:1\n216#2,2:465\n13472#3,2:467\n1869#4,2:469\n*S KotlinDebug\n*F\n+ 1 TouchLogger.kt\ncom/discord/analytics/touch/TouchLogger\n*L\n76#1:465,2\n258#1:467,2\n157#1:469,2\n*E\n"})
public final class TouchLogger {

    @NotNull
    private static final String TAG = "TouchLogger";
    private static WeakReference<Activity> activityRef;
    private static Application application;
    private static ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private static float initialX;
    private static float initialY;
    private static boolean isEnabled;
    private static WeakReference<View> monitoredDecorView;
    private static ScaleGestureDetector scaleGestureDetector;
    private static long startTime;
    private static ViewTreeObserver.OnWindowFocusChangeListener windowFocusChangeListener;
    private static WindowFocusListener windowFocusListener;

    @NotNull
    public static final TouchLogger INSTANCE = new TouchLogger();

    @NotNull
    private static final Map<Window, Window.Callback> trackedWindows = new LinkedHashMap();

    @NotNull
    private static final Set<OnEventRecognizedListener> eventListeners = new LinkedHashSet();

    @NotNull
    private static final Object listenerLock = new Object();

    @NotNull
    private static final Handler callbackHandler = new Handler(Looper.getMainLooper());

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/analytics/touch/TouchLogger$WindowFocusListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "touchLogger", "Lcom/discord/analytics/touch/TouchLogger;", "<init>", "(Lcom/discord/analytics/touch/TouchLogger;)V", "onActivityResumed", "", "activity", "Landroid/app/Activity;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityStarted", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "outState", "onActivityDestroyed", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WindowFocusListener implements Application.ActivityLifecycleCallbacks {

        @NotNull
        private final TouchLogger touchLogger;

        public WindowFocusListener(@NotNull TouchLogger touchLogger) {
            Intrinsics.checkNotNullParameter(touchLogger, "touchLogger");
            this.touchLogger = touchLogger;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.touchLogger.scanForNewWindows(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    private TouchLogger() {
    }

    private final void detectPortalsAndBottomSheets(ViewGroup decorView) {
        detectPortalsAndBottomSheets$scan$default(new Ref.BooleanRef(), new Ref.BooleanRef(), decorView, 0, 8, null);
    }

    private static final void detectPortalsAndBottomSheets$scan(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, View view, int i7) {
        if (i7 > 20) {
            return;
        }
        String name = view.getClass().getName();
        Intrinsics.checkNotNull(name);
        if (StringsKt.D(name, "Portal", false)) {
            booleanRef.element = true;
        } else if (StringsKt.D(name, "BottomSheet", false) || StringsKt.D(name, "bottomsheet", false)) {
            booleanRef2.element = true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                detectPortalsAndBottomSheets$scan(booleanRef, booleanRef2, childAt, i7 + 1);
            }
        }
    }

    public static /* synthetic */ void detectPortalsAndBottomSheets$scan$default(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, View view, int i7, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            i7 = 0;
        }
        detectPortalsAndBottomSheets$scan(booleanRef, booleanRef2, view, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public final void handleTouchEvent(MotionEvent event, ViewGroup rootView, String windowName) {
        char c8;
        long j;
        String str;
        Double d6;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            long jNanoTime = System.nanoTime();
            initialX = event.getRawX();
            initialY = event.getRawY();
            startTime = System.currentTimeMillis();
            float[] fArr = {event.getX(), event.getY()};
            TouchViewInspector touchViewInspector = TouchViewInspector.INSTANCE;
            View viewFindTouchTargetView = touchViewInspector.findTouchTargetView(fArr, rootView);
            double dNanoTime = (System.nanoTime() - jNanoTime) / 1000.0d;
            String viewHierarchy = touchViewInspector.formatViewHierarchy(viewFindTouchTargetView);
            MemoryStats memoryStats = TouchLoggerMemory.INSTANCE.getMemoryStats(TAG);
            if (getListenerCount() > 0) {
                notifyListeners$analytics_release(TouchEventListenerKt.createTouchEventDetails("down", System.currentTimeMillis(), (int) event.getRawX(), (int) event.getRawY(), (int) fArr[0], (int) fArr[1], memoryStats, viewHierarchy, null, (16384 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : windowName, (16384 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : Double.valueOf(dNanoTime), (16384 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : null, (16384 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (16384 & 8192) != 0 ? null : null, (16384 & 16384) != 0 ? null : null));
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked != 3) {
                return;
            }
            startTime = 0L;
            initialX = 0.0f;
            initialY = 0.0f;
            return;
        }
        long jNanoTime2 = System.nanoTime();
        if (startTime == 0) {
            return;
        }
        float rawX = event.getRawX() - initialX;
        float rawY = event.getRawY() - initialY;
        float fSqrt = (float) Math.sqrt((rawY * rawY) + (rawX * rawX));
        long jCurrentTimeMillis = System.currentTimeMillis() - startTime;
        float[] fArr2 = {event.getX(), event.getY()};
        TouchViewInspector touchViewInspector2 = TouchViewInspector.INSTANCE;
        View viewFindTouchTargetView2 = touchViewInspector2.findTouchTargetView(fArr2, rootView);
        double dNanoTime2 = (System.nanoTime() - jNanoTime2) / 1000.0d;
        String viewHierarchy2 = touchViewInspector2.formatViewHierarchy(viewFindTouchTargetView2);
        MemoryStats memoryStats2 = TouchLoggerMemory.INSTANCE.getMemoryStats(TAG);
        Double dValueOf = null;
        if (fSqrt >= 10.0f || jCurrentTimeMillis >= 300) {
            if (fSqrt < 10.0f && jCurrentTimeMillis >= 300) {
                str = "long_press";
            } else if (fSqrt > 100.0f) {
                c8 = 1;
                j = 0;
                double degrees = Math.toDegrees(Math.atan2(rawY, rawX));
                if (degrees >= -45.0d && degrees < 45.0d) {
                    str = "swipe_right";
                } else if (degrees < 45.0d || degrees >= 135.0d) {
                    str = (degrees >= 135.0d || degrees < -135.0d) ? "swipe_left" : "swipe_up";
                } else {
                    str = "swipe_down";
                }
            } else {
                c8 = 1;
                j = 0;
                str = null;
            }
            if (str == null && x.o(str, "swipe_", false) && jCurrentTimeMillis > j) {
                dValueOf = Double.valueOf((((double) fSqrt) / jCurrentTimeMillis) * 1000.0d);
            }
            d6 = dValueOf;
            if (getListenerCount() > 0) {
                notifyListeners$analytics_release(TouchEventListenerKt.createTouchEventDetails("up", System.currentTimeMillis(), (int) event.getRawX(), (int) event.getRawY(), (int) fArr2[0], (int) fArr2[c8], memoryStats2, viewHierarchy2, str, (16384 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : windowName, (16384 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : Double.valueOf(dNanoTime2), (16384 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : Integer.valueOf((int) fSqrt), (16384 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : Long.valueOf(jCurrentTimeMillis), (16384 & 8192) != 0 ? null : d6, (16384 & 16384) != 0 ? null : null));
            }
        }
        str = "tap";
        c8 = 1;
        j = 0;
        if (str == null) {
        }
        d6 = dValueOf;
        if (getListenerCount() > 0) {
            notifyListeners$analytics_release(TouchEventListenerKt.createTouchEventDetails("up", System.currentTimeMillis(), (int) event.getRawX(), (int) event.getRawY(), (int) fArr2[0], (int) fArr2[c8], memoryStats2, viewHierarchy2, str, (16384 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : windowName, (16384 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : Double.valueOf(dNanoTime2), (16384 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : Integer.valueOf((int) fSqrt), (16384 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : Long.valueOf(jCurrentTimeMillis), (16384 & 8192) != 0 ? null : d6, (16384 & 16384) != 0 ? null : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyListeners$lambda$7(List list, TouchEventDetails touchEventDetails) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OnEventRecognizedListener onEventRecognizedListener = (OnEventRecognizedListener) it.next();
            try {
                onEventRecognizedListener.onEventRecognized(touchEventDetails);
            } catch (Exception e10) {
                Log.INSTANCE.e(TAG, g.e("Listener ", onEventRecognizedListener.getClass().getSimpleName(), " threw exception"), e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scanForNewWindows(Activity activity) {
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object objInvoke = cls.getMethod("getInstance", null).invoke(null, null);
            Object objInvoke2 = cls.getMethod("getViewRootNames", null).invoke(objInvoke, null);
            Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type kotlin.Array<*>");
            Method method = cls.getMethod("getRootView", String.class);
            for (Object obj : (Object[]) objInvoke2) {
                try {
                    Object objInvoke3 = method.invoke(objInvoke, obj);
                    View view = objInvoke3 instanceof View ? (View) objInvoke3 : null;
                    if (view != null) {
                        ViewParent parent = view.getParent();
                        Field declaredField = parent != null ? parent.getClass().getDeclaredField("mWindow") : null;
                        if (declaredField != null) {
                            declaredField.setAccessible(true);
                        }
                        Object obj2 = declaredField != null ? declaredField.get(parent) : null;
                        Window window = obj2 instanceof Window ? (Window) obj2 : null;
                        if (window != null && !trackedWindows.containsKey(window)) {
                            TouchLogger touchLogger = INSTANCE;
                            touchLogger.trackWindow(window, touchLogger.identifyWindow$analytics_release(window));
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            Log.w$default(Log.INSTANCE, TAG, e.l("Could not scan for windows: ", e10.getMessage()), (Throwable) null, 4, (Object) null);
        }
    }

    private final void startWindowMonitoring(Activity activity) {
        Application application2 = activity.getApplication();
        WindowFocusListener windowFocusListener2 = new WindowFocusListener(this);
        windowFocusListener = windowFocusListener2;
        application2.registerActivityLifecycleCallbacks(windowFocusListener2);
        final View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        monitoredDecorView = new WeakReference<>(decorView);
        windowFocusChangeListener = new a();
        decorView.getViewTreeObserver().addOnWindowFocusChangeListener(windowFocusChangeListener);
        if (decorView instanceof ViewGroup) {
            globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.discord.analytics.touch.b
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    TouchLogger.startWindowMonitoring$lambda$9(decorView);
                }
            };
            ((ViewGroup) decorView).getViewTreeObserver().addOnGlobalLayoutListener(globalLayoutListener);
        }
        Log.i$default(Log.INSTANCE, TAG, "📡 Started monitoring", (Throwable) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWindowMonitoring$lambda$8(boolean z5) {
        if (z5) {
            WeakReference<Activity> weakReference = activityRef;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity != null) {
                INSTANCE.scanForNewWindows(activity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWindowMonitoring$lambda$9(View view) {
        INSTANCE.detectPortalsAndBottomSheets((ViewGroup) view);
    }

    private final void stopWindowMonitoring() {
        Application application2;
        WindowFocusListener windowFocusListener2 = windowFocusListener;
        if (windowFocusListener2 != null && (application2 = application) != null) {
            application2.unregisterActivityLifecycleCallbacks(windowFocusListener2);
        }
        windowFocusListener = null;
        WeakReference<View> weakReference = monitoredDecorView;
        View view = weakReference != null ? weakReference.get() : null;
        ViewTreeObserver viewTreeObserver = view != null ? view.getViewTreeObserver() : null;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = windowFocusChangeListener;
            if (onWindowFocusChangeListener != null) {
                viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
            }
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = globalLayoutListener;
            if (onGlobalLayoutListener != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        windowFocusChangeListener = null;
        globalLayoutListener = null;
        monitoredDecorView = null;
    }

    private final void trackWindow(Window window, String name) {
        Map<Window, Window.Callback> map = trackedWindows;
        if (map.containsKey(window)) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            Log.w$default(Log.INSTANCE, TAG, g.e("!  Window ", name, " has no callback, skipping"), (Throwable) null, 4, (Object) null);
            return;
        }
        map.put(window, callback);
        window.setCallback(new Window.Callback(callback, window, name) { // from class: com.discord.analytics.touch.TouchLogger.trackWindow.1
            private final /* synthetic */ Window.Callback $$delegate_0;
            final /* synthetic */ String $name;
            final /* synthetic */ Window.Callback $originalCallback;
            final /* synthetic */ Window $window;

            {
                this.$originalCallback = callback;
                this.$window = window;
                this.$name = name;
                this.$$delegate_0 = callback;
            }

            @Override // android.view.Window.Callback
            public boolean dispatchGenericMotionEvent(MotionEvent p3) {
                return this.$$delegate_0.dispatchGenericMotionEvent(p3);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchKeyEvent(KeyEvent p3) {
                return this.$$delegate_0.dispatchKeyEvent(p3);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchKeyShortcutEvent(KeyEvent p3) {
                return this.$$delegate_0.dispatchKeyShortcutEvent(p3);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p3) {
                return this.$$delegate_0.dispatchPopulateAccessibilityEvent(p3);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchTouchEvent(MotionEvent event) {
                if (event != null && TouchLogger.isEnabled) {
                    ScaleGestureDetector scaleGestureDetector2 = TouchLogger.scaleGestureDetector;
                    if (scaleGestureDetector2 != null) {
                        scaleGestureDetector2.onTouchEvent(event);
                    }
                    if (event.getPointerCount() == 1 && event.getActionMasked() != 6) {
                        View decorView = this.$window.getDecorView();
                        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                        if (decorView instanceof ViewGroup) {
                            TouchLogger.INSTANCE.handleTouchEvent(event, (ViewGroup) decorView, this.$name);
                        }
                    }
                }
                return this.$originalCallback.dispatchTouchEvent(event);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchTrackballEvent(MotionEvent p3) {
                return this.$$delegate_0.dispatchTrackballEvent(p3);
            }

            @Override // android.view.Window.Callback
            public void onActionModeFinished(ActionMode p3) {
                this.$$delegate_0.onActionModeFinished(p3);
            }

            @Override // android.view.Window.Callback
            public void onActionModeStarted(ActionMode p3) {
                this.$$delegate_0.onActionModeStarted(p3);
            }

            @Override // android.view.Window.Callback
            public void onAttachedToWindow() {
                this.$$delegate_0.onAttachedToWindow();
            }

            @Override // android.view.Window.Callback
            public void onContentChanged() {
                this.$$delegate_0.onContentChanged();
            }

            @Override // android.view.Window.Callback
            public boolean onCreatePanelMenu(int p3, @NonNull Menu p5) {
                Intrinsics.checkNotNullParameter(p5, "p1");
                return this.$$delegate_0.onCreatePanelMenu(p3, p5);
            }

            @Override // android.view.Window.Callback
            @Nullable
            public View onCreatePanelView(int p3) {
                return this.$$delegate_0.onCreatePanelView(p3);
            }

            @Override // android.view.Window.Callback
            public void onDetachedFromWindow() {
                this.$$delegate_0.onDetachedFromWindow();
            }

            @Override // android.view.Window.Callback
            public boolean onMenuItemSelected(int p3, @NonNull MenuItem p5) {
                Intrinsics.checkNotNullParameter(p5, "p1");
                return this.$$delegate_0.onMenuItemSelected(p3, p5);
            }

            @Override // android.view.Window.Callback
            public boolean onMenuOpened(int p3, @NonNull Menu p5) {
                Intrinsics.checkNotNullParameter(p5, "p1");
                return this.$$delegate_0.onMenuOpened(p3, p5);
            }

            @Override // android.view.Window.Callback
            public void onPanelClosed(int p3, @NonNull Menu p5) {
                Intrinsics.checkNotNullParameter(p5, "p1");
                this.$$delegate_0.onPanelClosed(p3, p5);
            }

            @Override // android.view.Window.Callback
            public boolean onPreparePanel(int p3, @Nullable View p5, @NonNull Menu p6) {
                Intrinsics.checkNotNullParameter(p6, "p2");
                return this.$$delegate_0.onPreparePanel(p3, p5, p6);
            }

            @Override // android.view.Window.Callback
            public boolean onSearchRequested() {
                return this.$$delegate_0.onSearchRequested();
            }

            @Override // android.view.Window.Callback
            public void onWindowAttributesChanged(WindowManager.LayoutParams p3) {
                this.$$delegate_0.onWindowAttributesChanged(p3);
            }

            @Override // android.view.Window.Callback
            public void onWindowFocusChanged(boolean p3) {
                this.$$delegate_0.onWindowFocusChanged(p3);
            }

            @Override // android.view.Window.Callback
            @Nullable
            public ActionMode onWindowStartingActionMode(ActionMode.Callback p3) {
                return this.$$delegate_0.onWindowStartingActionMode(p3);
            }

            @Override // android.view.Window.Callback
            public boolean onSearchRequested(SearchEvent p3) {
                return this.$$delegate_0.onSearchRequested(p3);
            }

            @Override // android.view.Window.Callback
            @Nullable
            public ActionMode onWindowStartingActionMode(ActionMode.Callback p3, int p5) {
                return this.$$delegate_0.onWindowStartingActionMode(p3, p5);
            }
        });
        Log.i$default(Log.INSTANCE, TAG, e.l("📱 Now tracking: ", name), (Throwable) null, 4, (Object) null);
    }

    public final void clearListeners() {
        synchronized (listenerLock) {
            Set<OnEventRecognizedListener> set = eventListeners;
            int size = set.size();
            set.clear();
            Log.i$default(Log.INSTANCE, TAG, "✅ Cleared " + size + " listeners", (Throwable) null, 4, (Object) null);
            Unit unit = Unit.f14616a;
        }
    }

    public final void disable(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        disable();
    }

    public final void enable(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isEnabled) {
            return;
        }
        activityRef = new WeakReference<>(activity);
        application = activity.getApplication();
        scaleGestureDetector = new ScaleGestureDetector(activity, new TouchScaleGestureListener());
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        String simpleName = activity.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        trackWindow(window, simpleName);
        startWindowMonitoring(activity);
        isEnabled = true;
        TouchLoggerMemory touchLoggerMemory = TouchLoggerMemory.INSTANCE;
        MemoryStats memoryStats = touchLoggerMemory.getMemoryStats(TAG);
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, "✅ Touch logging enabled", (Throwable) null, 4, (Object) null);
        Log.i$default(log, TAG, e.l("   ", touchLoggerMemory.formatMemoryStats(memoryStats)), (Throwable) null, 4, (Object) null);
    }

    public final WeakReference<Activity> getActivityRef$analytics_release() {
        return activityRef;
    }

    public final int getListenerCount() {
        int size;
        synchronized (listenerLock) {
            size = eventListeners.size();
        }
        return size;
    }

    @NotNull
    public final String identifyWindow$analytics_release(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        String simpleName = window.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        if (!StringsKt.D(simpleName, "PhoneWindow", false)) {
            String simpleName2 = window.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
            return simpleName2;
        }
        Context context = window.getContext();
        String simpleName3 = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName3, "getSimpleName(...)");
        if (StringsKt.D(simpleName3, "Dialog", false)) {
            return "Dialog";
        }
        String simpleName4 = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName4, "getSimpleName(...)");
        if (StringsKt.D(simpleName4, "BottomSheet", false)) {
            return "BottomSheet";
        }
        String simpleName5 = window.getContext().getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName5, "getSimpleName(...)");
        return simpleName5;
    }

    public final void notifyListeners$analytics_release(@NotNull TouchEventDetails event) {
        List listI0;
        Intrinsics.checkNotNullParameter(event, "event");
        synchronized (listenerLock) {
            listI0 = CollectionsKt.i0(eventListeners);
        }
        callbackHandler.post(new k(7, listI0, event));
    }

    public final void registerListener(@NotNull OnEventRecognizedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (listenerLock) {
            Set<OnEventRecognizedListener> set = eventListeners;
            set.add(listener);
            Log.i$default(Log.INSTANCE, TAG, "✅ Registered listener: " + listener.getClass().getSimpleName() + " (total: " + set.size() + ")", (Throwable) null, 4, (Object) null);
            Unit unit = Unit.f14616a;
        }
    }

    public final void setActivityRef$analytics_release(WeakReference<Activity> weakReference) {
        activityRef = weakReference;
    }

    public final void unregisterListener(@NotNull OnEventRecognizedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (listenerLock) {
            try {
                Set<OnEventRecognizedListener> set = eventListeners;
                if (set.remove(listener)) {
                    Log.i$default(Log.INSTANCE, TAG, "✅ Unregistered listener: " + listener.getClass().getSimpleName() + " (total: " + set.size() + ")", (Throwable) null, 4, (Object) null);
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void disable() {
        if (isEnabled) {
            stopWindowMonitoring();
            for (Map.Entry<Window, Window.Callback> entry : trackedWindows.entrySet()) {
                Window key = entry.getKey();
                try {
                    key.setCallback(entry.getValue());
                    Log.i$default(Log.INSTANCE, TAG, "   Restored window: " + INSTANCE.identifyWindow$analytics_release(key), (Throwable) null, 4, (Object) null);
                } catch (Exception e10) {
                    Log.INSTANCE.e(TAG, "   Failed to restore window", e10);
                }
            }
            trackedWindows.clear();
            TouchViewInspector.INSTANCE.clearCaches();
            scaleGestureDetector = null;
            activityRef = null;
            application = null;
            isEnabled = false;
            Log.i$default(Log.INSTANCE, TAG, "✅ Touch logging disabled", (Throwable) null, 4, (Object) null);
        }
    }
}
