package com.facebook.react.views.scroll;

import a3.e;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.recyclerview.widget.h0;
import com.discord.chat.presentation.list.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ScrollEndedListeners;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\tklmnopqrsB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u001f\u001a\u00020 \"\u000e\b\u0000\u0010!*\u0004\u0018\u00010\"*\u00020#2\u0006\u0010$\u001a\u0002H!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\bH\u0007¢\u0006\u0002\u0010)J%\u0010*\u001a\u00020 \"\u000e\b\u0000\u0010!*\u0004\u0018\u00010\"*\u00020#2\u0006\u0010$\u001a\u0002H!H\u0007¢\u0006\u0002\u0010+J5\u0010,\u001a\u00020 \"\u000e\b\u0000\u0010!*\u0004\u0018\u00010\"*\u00020#2\u0006\u0010$\u001a\u0002H!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0002\u0010-J5\u0010.\u001a\u00020 \"\u000e\b\u0000\u0010!*\u0004\u0018\u00010\"*\u00020#2\u0006\u0010$\u001a\u0002H!2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010/J%\u00100\u001a\u00020 \"\u000e\b\u0000\u0010!*\u0004\u0018\u00010\"*\u00020#2\u0006\u0010$\u001a\u0002H!H\u0007¢\u0006\u0002\u0010+J-\u0010\u001f\u001a\u00020 \"\u000e\b\u0000\u0010!*\u0004\u0018\u00010\"*\u00020#2\u0006\u0010$\u001a\u0002H!2\u0006\u00101\u001a\u000202H\u0002¢\u0006\u0002\u00103JG\u0010\u001f\u001a\u00020 \"\u000e\b\u0000\u0010!*\u0004\u0018\u00010\"*\u00020#2\u0006\u0010$\u001a\u0002H!2\u0006\u00101\u001a\u0002022\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\bH\u0002¢\u0006\u0002\u00104J\u0015\u00105\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0002\b6J\u0010\u00107\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0007J\u0010\u00108\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0007J\u0012\u00109\u001a\u00020\u00132\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010;\u001a\u00020\u00132\b\u0010<\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010=\u001a\u00020\u00132\b\u0010>\u001a\u0004\u0018\u00010?H\u0007J\u0010\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u00020\u001aH\u0007J\u0010\u0010B\u001a\u00020 2\u0006\u0010A\u001a\u00020\u001aH\u0007J\u0010\u0010C\u001a\u00020 2\u0006\u0010A\u001a\u00020\u001cH\u0007J\u0010\u0010D\u001a\u00020 2\u0006\u0010A\u001a\u00020\u001cH\u0007JA\u0010E\u001a\u00020 \"\u001a\b\u0000\u0010!*\u0004\u0018\u00010F*\u0004\u0018\u00010G*\u0004\u0018\u00010H*\u00020#2\u0006\u0010$\u001a\u0002H!2\u0006\u0010I\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010/JC\u0010K\u001a\u00020\u0013\"\u0014\b\u0000\u0010!*\u0004\u0018\u00010F*\u0004\u0018\u00010G*\u00020#2\u0006\u0010$\u001a\u0002H!2\u0006\u0010L\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010OJ1\u0010P\u001a\u00020 \"\u001a\b\u0000\u0010!*\u0004\u0018\u00010F*\u0004\u0018\u00010G*\u0004\u0018\u00010H*\u00020#2\u0006\u0010$\u001a\u0002H!H\u0007¢\u0006\u0002\u0010+J9\u0010P\u001a\u00020 \"\u0014\b\u0000\u0010!*\u0004\u0018\u00010G*\u0004\u0018\u00010H*\u00020#2\u0006\u0010$\u001a\u0002H!2\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010R\u001a\u00020\u0013¢\u0006\u0002\u0010/J+\u0010S\u001a\u00020 \"\u0014\b\u0000\u0010!*\u0004\u0018\u00010G*\u0004\u0018\u00010H*\u00020#2\u0006\u0010$\u001a\u0002H!H\u0007¢\u0006\u0002\u0010+J5\u0010T\u001a\u00020 \"\u0014\b\u0000\u0010!*\u0004\u0018\u00010G*\u0004\u0018\u00010H*\u00020#2\u0006\u0010$\u001a\u0002H!2\u0006\u0010U\u001a\u00020VH\u0001¢\u0006\u0004\bW\u0010XJQ\u0010Y\u001a\u00020 \" \b\u0000\u0010!*\u0004\u0018\u00010F*\u0004\u0018\u00010\"*\u0004\u0018\u00010G*\u0004\u0018\u00010H*\u00020#2\u0006\u0010$\u001a\u0002H!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\bH\u0007¢\u0006\u0002\u0010)J/\u0010Z\u001a\u00020 \"\u001a\b\u0000\u0010!*\u0004\u0018\u00010F*\u0004\u0018\u00010G*\u0004\u0018\u00010H*\u00020#2\u0006\u0010$\u001a\u0002H!¢\u0006\u0002\u0010+J+\u0010[\u001a\u00020 \"\u0014\b\u0000\u0010!*\u0004\u0018\u00010F*\u0004\u0018\u00010\"*\u00020#2\u0006\u0010$\u001a\u0002H!H\u0007¢\u0006\u0002\u0010+JK\u0010\\\u001a\u00020]\"\u0014\b\u0000\u0010!*\u0004\u0018\u00010F*\u0004\u0018\u00010G*\u00020#2\u0006\u0010$\u001a\u0002H!2\u0006\u0010^\u001a\u00020\u00132\u0006\u0010_\u001a\u00020\u00132\u0006\u0010`\u001a\u00020\u00132\u0006\u0010a\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010bJ\"\u0010c\u001a\u0004\u0018\u00010d2\u0006\u0010e\u001a\u00020#2\u0006\u0010f\u001a\u00020d2\u0006\u0010g\u001a\u00020\u0013H\u0007J \u0010h\u001a\u00020\u00132\u0006\u0010g\u001a\u00020\u00132\u0006\u0010i\u001a\u00020\b2\u0006\u0010j\u001a\u00020\u0013H\u0007R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006t"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "DEBUG_MODE", "", "CONTENT_OFFSET_LEFT", "CONTENT_OFFSET_TOP", "SCROLL_AWAY_PADDING_TOP", "SCROLL_AWAY_PADDING_BOTTOM", "MOMENTUM_DELAY", "", "OVER_SCROLL_ALWAYS", "AUTO", "OVER_SCROLL_NEVER", "SNAP_ALIGNMENT_DISABLED", "", "SNAP_ALIGNMENT_START", "SNAP_ALIGNMENT_CENTER", "SNAP_ALIGNMENT_END", "scrollListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;", "layoutChangeListeners", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;", "SMOOTH_SCROLL_DURATION", "smoothScrollDurationInitialized", "emitScrollEvent", "", "T", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollEventThrottle;", "Landroid/view/ViewGroup;", "scrollView", "xVelocity", "", "yVelocity", "isDrawing", "(Landroid/view/ViewGroup;FFZ)V", "emitScrollBeginDragEvent", "(Landroid/view/ViewGroup;)V", "emitScrollEndDragEvent", "(Landroid/view/ViewGroup;FF)V", "emitScrollMomentumBeginEvent", "(Landroid/view/ViewGroup;II)V", "emitScrollMomentumEndEvent", "scrollEventType", "Lcom/facebook/react/views/scroll/ScrollEventType;", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;)V", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;FFZ)V", "notifyUserDrivenScrollEnded", "notifyUserDrivenScrollEnded_internal", "emitLayoutEvent", "emitLayoutChangeEvent", "parseOverScrollMode", "jsOverScrollMode", "parseSnapToAlignment", "alignment", "getDefaultScrollAnimationDuration", "context", "Landroid/content/Context;", "addScrollListener", "listener", "removeScrollListener", "addLayoutChangeListener", "removeLayoutChangeListener", "smoothScrollTo", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasFlingAnimator;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollState;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasStateWrapper;", "x", "y", "getNextFlingStartValue", "currentValue", "postAnimationValue", "velocity", "(Landroid/view/ViewGroup;III)I", "updateFabricScrollState", "scrollX", "scrollY", "forceUpdateState", "loadFabricScrollState", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "loadFabricScrollState$ReactAndroid_release", "(Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/StateWrapper;)V", "updateStateOnScrollChanged", "registerFlingAnimator", "dispatchMomentumEndOnAnimationEnd", "predictFinalScrollPosition", "Landroid/graphics/Point;", "velocityX", "velocityY", "maximumOffsetX", "maximumOffsetY", "(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;", "findNextFocusableView", "Landroid/view/View;", "host", "focused", "direction", "resolveAbsoluteDirection", "horizontal", ViewProps.LAYOUT_DIRECTION, "ScrollListener", "LayoutChangeListener", "HasStateWrapper", "OverScrollerDurationGetter", "ReactScrollViewScrollState", "HasScrollState", "HasFlingAnimator", "HasScrollEventThrottle", "HasSmoothScroll", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactScrollViewHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactScrollViewHelper.kt\ncom/facebook/react/views/scroll/ReactScrollViewHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n1#2:711\n*E\n"})
public final class ReactScrollViewHelper {

    @NotNull
    public static final String AUTO = "auto";

    @NotNull
    private static final String CONTENT_OFFSET_LEFT = "contentOffsetLeft";

    @NotNull
    private static final String CONTENT_OFFSET_TOP = "contentOffsetTop";
    private static final boolean DEBUG_MODE = false;
    public static final long MOMENTUM_DELAY = 20;

    @NotNull
    public static final String OVER_SCROLL_ALWAYS = "always";

    @NotNull
    public static final String OVER_SCROLL_NEVER = "never";

    @NotNull
    private static final String SCROLL_AWAY_PADDING_BOTTOM = "scrollAwayPaddingBottom";

    @NotNull
    private static final String SCROLL_AWAY_PADDING_TOP = "scrollAwayPaddingTop";
    public static final int SNAP_ALIGNMENT_CENTER = 2;
    public static final int SNAP_ALIGNMENT_DISABLED = 0;
    public static final int SNAP_ALIGNMENT_END = 3;
    public static final int SNAP_ALIGNMENT_START = 1;
    private static boolean smoothScrollDurationInitialized;

    @NotNull
    public static final ReactScrollViewHelper INSTANCE = new ReactScrollViewHelper();
    private static final String TAG = "ReactScrollView";

    @NotNull
    private static final CopyOnWriteArrayList<WeakReference<ScrollListener>> scrollListeners = new CopyOnWriteArrayList<>();

    @NotNull
    private static final CopyOnWriteArrayList<WeakReference<LayoutChangeListener>> layoutChangeListeners = new CopyOnWriteArrayList<>();
    private static int SMOOTH_SCROLL_DURATION = h0.DEFAULT_SWIPE_ANIMATION_DURATION;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasFlingAnimator;", "", "startFlingAnimator", "", ViewProps.START, "", ViewProps.END, "getFlingAnimator", "Landroid/animation/ValueAnimator;", "getFlingExtrapolatedDistance", "velocity", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasFlingAnimator {
        @NotNull
        ValueAnimator getFlingAnimator();

        int getFlingExtrapolatedDistance(int velocity);

        void startFlingAnimator(int start, int end);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollEventThrottle;", "", "scrollEventThrottle", "", "getScrollEventThrottle", "()I", "setScrollEventThrottle", "(I)V", "lastScrollDispatchTime", "", "getLastScrollDispatchTime", "()J", "setLastScrollDispatchTime", "(J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasScrollEventThrottle {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j);

        void setScrollEventThrottle(int i7);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollState;", "", "reactScrollViewScrollState", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", "getReactScrollViewScrollState", "()Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", "setReactScrollViewScrollState", "(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasScrollState {
        @NotNull
        ReactScrollViewScrollState getReactScrollViewScrollState();

        void setReactScrollViewScrollState(@NotNull ReactScrollViewScrollState reactScrollViewScrollState);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;", "", "reactSmoothScrollTo", "", "x", "", "y", "scrollToPreservingMomentum", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasSmoothScroll {
        void reactSmoothScrollTo(int x5, int y5);

        void scrollToPreservingMomentum(int x5, int y5);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasStateWrapper;", "", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasStateWrapper {
        StateWrapper getStateWrapper();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;", "", "onLayoutChange", "", "scrollView", "Landroid/view/ViewGroup;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LayoutChangeListener {
        void onLayoutChange(@NotNull ViewGroup scrollView);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$OverScrollerDurationGetter;", "Landroid/widget/OverScroller;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "currentScrollAnimationDuration", "", "scrollAnimationDuration", "getScrollAnimationDuration", "()I", "startScroll", "", "startX", "startY", "dx", "dy", "duration", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OverScrollerDurationGetter extends OverScroller {
        private int currentScrollAnimationDuration;

        public OverScrollerDurationGetter(Context context) {
            super(context);
            this.currentScrollAnimationDuration = h0.DEFAULT_SWIPE_ANIMATION_DURATION;
        }

        public final int getScrollAnimationDuration() {
            startScroll(0, 0, 0, 0);
            return this.currentScrollAnimationDuration;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int startX, int startY, int dx, int dy, int duration) {
            this.currentScrollAnimationDuration = duration;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005J\u0016\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003JY\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\u0013\u00101\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0005HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0019\"\u0004\b\u001c\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0019\"\u0004\b!\u0010\u001b¨\u00066"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", "", "finalAnimatedPositionScroll", "Landroid/graphics/Point;", ReactScrollViewHelper.SCROLL_AWAY_PADDING_TOP, "", ReactScrollViewHelper.SCROLL_AWAY_PADDING_BOTTOM, "lastStateUpdateScroll", "isCanceled", "", "isFinished", "decelerationRate", "", "isUpdatedByScroll", "<init>", "(Landroid/graphics/Point;IILandroid/graphics/Point;ZZFZ)V", "getFinalAnimatedPositionScroll", "()Landroid/graphics/Point;", "getScrollAwayPaddingTop", "()I", "setScrollAwayPaddingTop", "(I)V", "getScrollAwayPaddingBottom", "setScrollAwayPaddingBottom", "getLastStateUpdateScroll", "()Z", "setCanceled", "(Z)V", "setFinished", "getDecelerationRate", "()F", "setDecelerationRate", "(F)V", "setUpdatedByScroll", "setFinalAnimatedPositionScroll", "finalAnimatedPositionScrollX", "finalAnimatedPositionScrollY", "setLastStateUpdateScroll", "lastStateUpdateScrollX", "lastStateUpdateScrollY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReactScrollViewScrollState {
        private float decelerationRate;

        @NotNull
        private final Point finalAnimatedPositionScroll;
        private boolean isCanceled;
        private boolean isFinished;
        private boolean isUpdatedByScroll;

        @NotNull
        private final Point lastStateUpdateScroll;
        private int scrollAwayPaddingBottom;
        private int scrollAwayPaddingTop;

        public ReactScrollViewScrollState() {
            this(null, 0, 0, null, false, false, 0.0f, false, 255, null);
        }

        public static /* synthetic */ ReactScrollViewScrollState copy$default(ReactScrollViewScrollState reactScrollViewScrollState, Point point, int i7, int i10, Point point2, boolean z5, boolean z6, float f2, boolean z7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                point = reactScrollViewScrollState.finalAnimatedPositionScroll;
            }
            if ((i11 & 2) != 0) {
                i7 = reactScrollViewScrollState.scrollAwayPaddingTop;
            }
            if ((i11 & 4) != 0) {
                i10 = reactScrollViewScrollState.scrollAwayPaddingBottom;
            }
            if ((i11 & 8) != 0) {
                point2 = reactScrollViewScrollState.lastStateUpdateScroll;
            }
            if ((i11 & 16) != 0) {
                z5 = reactScrollViewScrollState.isCanceled;
            }
            if ((i11 & 32) != 0) {
                z6 = reactScrollViewScrollState.isFinished;
            }
            if ((i11 & 64) != 0) {
                f2 = reactScrollViewScrollState.decelerationRate;
            }
            if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                z7 = reactScrollViewScrollState.isUpdatedByScroll;
            }
            float f7 = f2;
            boolean z10 = z7;
            boolean z11 = z5;
            boolean z12 = z6;
            return reactScrollViewScrollState.copy(point, i7, i10, point2, z11, z12, f7, z10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Point getFinalAnimatedPositionScroll() {
            return this.finalAnimatedPositionScroll;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getScrollAwayPaddingTop() {
            return this.scrollAwayPaddingTop;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getScrollAwayPaddingBottom() {
            return this.scrollAwayPaddingBottom;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Point getLastStateUpdateScroll() {
            return this.lastStateUpdateScroll;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final float getDecelerationRate() {
            return this.decelerationRate;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getIsUpdatedByScroll() {
            return this.isUpdatedByScroll;
        }

        @NotNull
        public final ReactScrollViewScrollState copy(@NotNull Point finalAnimatedPositionScroll, int scrollAwayPaddingTop, int scrollAwayPaddingBottom, @NotNull Point lastStateUpdateScroll, boolean isCanceled, boolean isFinished, float decelerationRate, boolean isUpdatedByScroll) {
            Intrinsics.checkNotNullParameter(finalAnimatedPositionScroll, "finalAnimatedPositionScroll");
            Intrinsics.checkNotNullParameter(lastStateUpdateScroll, "lastStateUpdateScroll");
            return new ReactScrollViewScrollState(finalAnimatedPositionScroll, scrollAwayPaddingTop, scrollAwayPaddingBottom, lastStateUpdateScroll, isCanceled, isFinished, decelerationRate, isUpdatedByScroll);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactScrollViewScrollState)) {
                return false;
            }
            ReactScrollViewScrollState reactScrollViewScrollState = (ReactScrollViewScrollState) other;
            return Intrinsics.areEqual(this.finalAnimatedPositionScroll, reactScrollViewScrollState.finalAnimatedPositionScroll) && this.scrollAwayPaddingTop == reactScrollViewScrollState.scrollAwayPaddingTop && this.scrollAwayPaddingBottom == reactScrollViewScrollState.scrollAwayPaddingBottom && Intrinsics.areEqual(this.lastStateUpdateScroll, reactScrollViewScrollState.lastStateUpdateScroll) && this.isCanceled == reactScrollViewScrollState.isCanceled && this.isFinished == reactScrollViewScrollState.isFinished && Float.compare(this.decelerationRate, reactScrollViewScrollState.decelerationRate) == 0 && this.isUpdatedByScroll == reactScrollViewScrollState.isUpdatedByScroll;
        }

        public final float getDecelerationRate() {
            return this.decelerationRate;
        }

        @NotNull
        public final Point getFinalAnimatedPositionScroll() {
            return this.finalAnimatedPositionScroll;
        }

        @NotNull
        public final Point getLastStateUpdateScroll() {
            return this.lastStateUpdateScroll;
        }

        public final int getScrollAwayPaddingBottom() {
            return this.scrollAwayPaddingBottom;
        }

        public final int getScrollAwayPaddingTop() {
            return this.scrollAwayPaddingTop;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isUpdatedByScroll) + e.a(a.g(a.g((this.lastStateUpdateScroll.hashCode() + a.u(this.scrollAwayPaddingBottom, a.u(this.scrollAwayPaddingTop, this.finalAnimatedPositionScroll.hashCode() * 31, 31), 31)) * 31, 31, this.isCanceled), 31, this.isFinished), 31, this.decelerationRate);
        }

        public final boolean isCanceled() {
            return this.isCanceled;
        }

        public final boolean isFinished() {
            return this.isFinished;
        }

        public final boolean isUpdatedByScroll() {
            return this.isUpdatedByScroll;
        }

        public final void setCanceled(boolean z5) {
            this.isCanceled = z5;
        }

        public final void setDecelerationRate(float f2) {
            this.decelerationRate = f2;
        }

        @NotNull
        public final ReactScrollViewScrollState setFinalAnimatedPositionScroll(int finalAnimatedPositionScrollX, int finalAnimatedPositionScrollY) {
            this.finalAnimatedPositionScroll.set(finalAnimatedPositionScrollX, finalAnimatedPositionScrollY);
            return this;
        }

        public final void setFinished(boolean z5) {
            this.isFinished = z5;
        }

        @NotNull
        public final ReactScrollViewScrollState setLastStateUpdateScroll(int lastStateUpdateScrollX, int lastStateUpdateScrollY) {
            this.lastStateUpdateScroll.set(lastStateUpdateScrollX, lastStateUpdateScrollY);
            return this;
        }

        public final void setScrollAwayPaddingBottom(int i7) {
            this.scrollAwayPaddingBottom = i7;
        }

        public final void setScrollAwayPaddingTop(int i7) {
            this.scrollAwayPaddingTop = i7;
        }

        public final void setUpdatedByScroll(boolean z5) {
            this.isUpdatedByScroll = z5;
        }

        @NotNull
        public String toString() {
            Point point = this.finalAnimatedPositionScroll;
            int i7 = this.scrollAwayPaddingTop;
            int i10 = this.scrollAwayPaddingBottom;
            Point point2 = this.lastStateUpdateScroll;
            boolean z5 = this.isCanceled;
            boolean z6 = this.isFinished;
            float f2 = this.decelerationRate;
            boolean z7 = this.isUpdatedByScroll;
            StringBuilder sb2 = new StringBuilder("ReactScrollViewScrollState(finalAnimatedPositionScroll=");
            sb2.append(point);
            sb2.append(", scrollAwayPaddingTop=");
            sb2.append(i7);
            sb2.append(", scrollAwayPaddingBottom=");
            sb2.append(i10);
            sb2.append(", lastStateUpdateScroll=");
            sb2.append(point2);
            sb2.append(", isCanceled=");
            e.B(sb2, z5, ", isFinished=", z6, ", decelerationRate=");
            sb2.append(f2);
            sb2.append(", isUpdatedByScroll=");
            sb2.append(z7);
            sb2.append(")");
            return sb2.toString();
        }

        public ReactScrollViewScrollState(@NotNull Point finalAnimatedPositionScroll, int i7, int i10, @NotNull Point lastStateUpdateScroll, boolean z5, boolean z6, float f2, boolean z7) {
            Intrinsics.checkNotNullParameter(finalAnimatedPositionScroll, "finalAnimatedPositionScroll");
            Intrinsics.checkNotNullParameter(lastStateUpdateScroll, "lastStateUpdateScroll");
            this.finalAnimatedPositionScroll = finalAnimatedPositionScroll;
            this.scrollAwayPaddingTop = i7;
            this.scrollAwayPaddingBottom = i10;
            this.lastStateUpdateScroll = lastStateUpdateScroll;
            this.isCanceled = z5;
            this.isFinished = z6;
            this.decelerationRate = f2;
            this.isUpdatedByScroll = z7;
        }

        public /* synthetic */ ReactScrollViewScrollState(Point point, int i7, int i10, Point point2, boolean z5, boolean z6, float f2, boolean z7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new Point() : point, (i11 & 2) != 0 ? 0 : i7, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new Point(-1, -1) : point2, (i11 & 16) != 0 ? false : z5, (i11 & 32) != 0 ? true : z6, (i11 & 64) != 0 ? 0.985f : f2, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z7);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;", "", "onScroll", "", "scrollView", "Landroid/view/ViewGroup;", "scrollEventType", "Lcom/facebook/react/views/scroll/ScrollEventType;", "xVelocity", "", "yVelocity", "onLayout", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ScrollListener {
        void onLayout(ViewGroup scrollView);

        void onScroll(ViewGroup scrollView, ScrollEventType scrollEventType, float xVelocity, float yVelocity);
    }

    private ReactScrollViewHelper() {
    }

    public static final void addLayoutChangeListener(@NotNull LayoutChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        layoutChangeListeners.add(new WeakReference<>(listener));
    }

    public static final void addScrollListener(@NotNull ScrollListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        scrollListeners.add(new WeakReference<>(listener));
    }

    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollEventThrottle> void dispatchMomentumEndOnAnimationEnd(final T scrollView) {
        scrollView.getFlingAnimator().addListener(new Animator.AnimatorListener() { // from class: com.facebook.react.views.scroll.ReactScrollViewHelper.dispatchMomentumEndOnAnimationEnd.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewHelper.emitScrollMomentumEndEvent(scrollView);
                animator.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewHelper.emitScrollMomentumEndEvent(scrollView);
                animator.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }
        });
    }

    public static final void emitLayoutChangeEvent(@NotNull ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Iterator<WeakReference<LayoutChangeListener>> it = layoutChangeListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            LayoutChangeListener layoutChangeListener = it.next().get();
            if (layoutChangeListener != null) {
                layoutChangeListener.onLayoutChange(scrollView);
            }
        }
    }

    public static final void emitLayoutEvent(@NotNull ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Iterator<WeakReference<ScrollListener>> it = scrollListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ScrollListener scrollListener = it.next().get();
            if (scrollListener != null) {
                scrollListener.onLayout(scrollView);
            }
        }
    }

    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollBeginDragEvent(T scrollView) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.BEGIN_DRAG);
    }

    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEndDragEvent(T scrollView, float xVelocity, float yVelocity) {
        emitScrollEvent$default(INSTANCE, scrollView, ScrollEventType.END_DRAG, xVelocity, yVelocity, false, 16, null);
    }

    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, float xVelocity, float yVelocity, boolean isDrawing) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.SCROLL, xVelocity, yVelocity, isDrawing);
    }

    public static /* synthetic */ void emitScrollEvent$default(ViewGroup viewGroup, float f2, float f7, boolean z5, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        emitScrollEvent(viewGroup, f2, f7, z5);
    }

    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollMomentumBeginEvent(T scrollView, int xVelocity, int yVelocity) {
        emitScrollEvent$default(INSTANCE, scrollView, ScrollEventType.MOMENTUM_BEGIN, xVelocity, yVelocity, false, 16, null);
    }

    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollMomentumEndEvent(T scrollView) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.MOMENTUM_END);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View findNextFocusableView(@NotNull ViewGroup host, @NotNull View focused, int direction) {
        FabricUIManager fabricUIManager;
        Integer numFindNextFocusableElement;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(focused, "focused");
        if (!(host instanceof ReactClippingViewGroup)) {
            return null;
        }
        Context context = host.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        UIManager uIManager = UIManagerHelper.getUIManager((ReactContext) context, 2);
        if (uIManager != null && (numFindNextFocusableElement = (fabricUIManager = (FabricUIManager) uIManager).findNextFocusableElement(host.getId(), focused.getId(), direction)) != null) {
            int iIntValue = numFindNextFocusableElement.intValue();
            int[] relativeAncestorList = fabricUIManager.getRelativeAncestorList(host.getChildAt(0).getId(), iIntValue);
            if (relativeAncestorList != null) {
                Intrinsics.checkNotNullParameter(relativeAncestorList, "<this>");
                LinkedHashSet destination = new LinkedHashSet(v0.a(relativeAncestorList.length));
                Intrinsics.checkNotNullParameter(relativeAncestorList, "<this>");
                Intrinsics.checkNotNullParameter(destination, "destination");
                for (int i7 : relativeAncestorList) {
                    destination.add(Integer.valueOf(i7));
                }
                destination.add(numFindNextFocusableElement);
                ((ReactClippingViewGroup) host).updateClippingRect(destination);
                return host.findViewById(iIntValue);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & HasScrollState & HasStateWrapper> void forceUpdateState(T scrollView) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        int scrollAwayPaddingTop = reactScrollViewScrollState.getScrollAwayPaddingTop();
        int scrollAwayPaddingBottom = reactScrollViewScrollState.getScrollAwayPaddingBottom();
        Point lastStateUpdateScroll = reactScrollViewScrollState.getLastStateUpdateScroll();
        int i7 = lastStateUpdateScroll.x;
        int i10 = lastStateUpdateScroll.y;
        if (DEBUG_MODE) {
            o8.a.m(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(i7), Integer.valueOf(i10));
        }
        StateWrapper stateWrapper = scrollView.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(CONTENT_OFFSET_LEFT, PixelUtil.toDIPFromPixel(i7));
            writableNativeMap.putDouble(CONTENT_OFFSET_TOP, PixelUtil.toDIPFromPixel(i10));
            writableNativeMap.putDouble(SCROLL_AWAY_PADDING_TOP, PixelUtil.toDIPFromPixel(scrollAwayPaddingTop));
            writableNativeMap.putDouble(SCROLL_AWAY_PADDING_BOTTOM, PixelUtil.toDIPFromPixel(scrollAwayPaddingBottom));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    public static final int getDefaultScrollAnimationDuration(Context context) {
        if (!smoothScrollDurationInitialized) {
            smoothScrollDurationInitialized = true;
            try {
                SMOOTH_SCROLL_DURATION = new OverScrollerDurationGetter(context).getScrollAnimationDuration();
            } catch (Throwable unused) {
            }
        }
        return SMOOTH_SCROLL_DURATION;
    }

    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState> int getNextFlingStartValue(T scrollView, int currentValue, int postAnimationValue, int velocity) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.isFinished() || (reactScrollViewScrollState.isCanceled() && ((postAnimationValue - currentValue) * (velocity != 0 ? velocity / Math.abs(velocity) : 0) > 0))) ? postAnimationValue : currentValue;
    }

    public static final <T extends ViewGroup & HasScrollState & HasStateWrapper> void loadFabricScrollState$ReactAndroid_release(T scrollView, @NotNull StateWrapper stateWrapper) {
        ReadableNativeMap stateData;
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        T t5 = scrollView;
        if (t5.getReactScrollViewScrollState().isUpdatedByScroll() || (stateData = stateWrapper.getStateData()) == null) {
            return;
        }
        int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(stateData.getDouble(CONTENT_OFFSET_LEFT));
        int pixelFromDIP2 = (int) PixelUtil.toPixelFromDIP(stateData.getDouble(CONTENT_OFFSET_TOP));
        ReactScrollViewScrollState reactScrollViewScrollStateCopy$default = ReactScrollViewScrollState.copy$default(t5.getReactScrollViewScrollState(), null, (int) PixelUtil.toPixelFromDIP(stateData.getDouble(SCROLL_AWAY_PADDING_TOP)), (int) PixelUtil.toPixelFromDIP(stateData.getDouble(SCROLL_AWAY_PADDING_BOTTOM)), null, false, false, 0.0f, false, 249, null);
        reactScrollViewScrollStateCopy$default.setLastStateUpdateScroll(pixelFromDIP, pixelFromDIP2);
        t5.setReactScrollViewScrollState(reactScrollViewScrollStateCopy$default);
    }

    public static final void notifyUserDrivenScrollEnded_internal(@NotNull ViewGroup scrollView) {
        ScrollEndedListeners scrollEndedListeners;
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Context context = scrollView.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null || (scrollEndedListeners = reactContext.getScrollEndedListeners()) == null) {
            return;
        }
        scrollEndedListeners.notifyScrollEnded(scrollView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3.equals("auto") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int parseOverScrollMode(java.lang.String r3) {
        /*
            r0 = 1
            if (r3 == 0) goto L41
            int r1 = r3.hashCode()
            r2 = -1414557169(0xffffffffabaf920f, float:-1.2475037E-12)
            if (r1 == r2) goto L2b
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L22
            r2 = 104712844(0x63dca8c, float:3.5695757E-35)
            if (r1 == r2) goto L17
            goto L33
        L17:
            java.lang.String r1 = "never"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L20
            goto L33
        L20:
            r3 = 2
            return r3
        L22:
            java.lang.String r1 = "auto"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L33
            goto L41
        L2b:
            java.lang.String r1 = "always"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3f
        L33:
            java.lang.String r1 = "wrong overScrollMode: "
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = "ReactNative"
            o8.a.v(r1, r3)
            return r0
        L3f:
            r3 = 0
            return r3
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.ReactScrollViewHelper.parseOverScrollMode(java.lang.String):int");
    }

    public static final int parseSnapToAlignment(String alignment) {
        if (alignment == null) {
            return 0;
        }
        if (ViewProps.START.equalsIgnoreCase(alignment)) {
            return 1;
        }
        if ("center".equalsIgnoreCase(alignment)) {
            return 2;
        }
        if (Intrinsics.areEqual(ViewProps.END, alignment)) {
            return 3;
        }
        o8.a.v(ReactConstants.TAG, "wrong snap alignment value: ".concat(alignment));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState> Point predictFinalScrollPosition(T scrollView, int velocityX, int velocityY, int maximumOffsetX, int maximumOffsetY) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(scrollView.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.getDecelerationRate());
        int width = (scrollView.getWidth() - scrollView.getPaddingStart()) - scrollView.getPaddingEnd();
        int height = (scrollView.getHeight() - scrollView.getPaddingBottom()) - scrollView.getPaddingTop();
        Point finalAnimatedPositionScroll = reactScrollViewScrollState.getFinalAnimatedPositionScroll();
        overScroller.fling(getNextFlingStartValue(scrollView, scrollView.getScrollX(), finalAnimatedPositionScroll.x, velocityX), getNextFlingStartValue(scrollView, scrollView.getScrollY(), finalAnimatedPositionScroll.y, velocityY), velocityX, velocityY, 0, maximumOffsetX, 0, maximumOffsetY, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    public static final void removeLayoutChangeListener(@NotNull LayoutChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<LayoutChangeListener>> it = layoutChangeListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference<LayoutChangeListener> next = it.next();
            LayoutChangeListener layoutChangeListener = next.get();
            if (layoutChangeListener == null || Intrinsics.areEqual(layoutChangeListener, listener)) {
                arrayList.add(next);
            }
        }
        layoutChangeListeners.removeAll(arrayList);
    }

    public static final void removeScrollListener(@NotNull ScrollListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<ScrollListener>> it = scrollListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference<ScrollListener> next = it.next();
            ScrollListener scrollListener = next.get();
            if (scrollListener == null || Intrinsics.areEqual(scrollListener, listener)) {
                arrayList.add(next);
            }
        }
        scrollListeners.removeAll(arrayList);
    }

    public static final int resolveAbsoluteDirection(int direction, boolean horizontal, int layoutDirection) {
        boolean z5 = layoutDirection == 1;
        if (direction != 1 && direction != 2) {
            return direction;
        }
        if (horizontal) {
            return (direction == 2) != z5 ? 66 : 17;
        }
        return direction == 2 ? 130 : 33;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void smoothScrollTo(T scrollView, int x5, int y5) {
        if (DEBUG_MODE) {
            o8.a.m(TAG, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(x5), Integer.valueOf(y5));
        }
        T t5 = scrollView;
        ValueAnimator flingAnimator = t5.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            INSTANCE.registerFlingAnimator(scrollView);
        }
        scrollView.getReactScrollViewScrollState().setFinalAnimatedPositionScroll(x5, y5);
        int scrollX = scrollView.getScrollX();
        int scrollY = scrollView.getScrollY();
        if (scrollX != x5) {
            t5.startFlingAnimator(scrollX, x5);
        }
        if (scrollY != y5) {
            t5.startFlingAnimator(scrollY, y5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void updateFabricScrollState(T scrollView) {
        INSTANCE.updateFabricScrollState(scrollView, scrollView.getScrollX(), scrollView.getScrollY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollEventThrottle & HasScrollState & HasStateWrapper> void updateStateOnScrollChanged(T scrollView, float xVelocity, float yVelocity, boolean isDrawing) {
        INSTANCE.updateFabricScrollState(scrollView, scrollView.getScrollX(), scrollView.getScrollY());
        emitScrollEvent(scrollView, xVelocity, yVelocity, isDrawing);
    }

    public static /* synthetic */ void updateStateOnScrollChanged$default(ViewGroup viewGroup, float f2, float f7, boolean z5, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        updateStateOnScrollChanged(viewGroup, f2, f7, z5);
    }

    public final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void registerFlingAnimator(final T scrollView) {
        scrollView.getFlingAnimator().addListener(new Animator.AnimatorListener() { // from class: com.facebook.react.views.scroll.ReactScrollViewHelper.registerFlingAnimator.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((HasScrollState) scrollView).getReactScrollViewScrollState().setCanceled(true);
                ReactScrollViewHelper.notifyUserDrivenScrollEnded_internal(scrollView);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((HasScrollState) scrollView).getReactScrollViewScrollState().setFinished(true);
                ReactScrollViewHelper.notifyUserDrivenScrollEnded_internal(scrollView);
                ReactScrollViewHelper.updateFabricScrollState(scrollView);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewScrollState reactScrollViewScrollState = ((HasScrollState) scrollView).getReactScrollViewScrollState();
                reactScrollViewScrollState.setCanceled(false);
                reactScrollViewScrollState.setFinished(false);
            }
        });
    }

    private final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, ScrollEventType scrollEventType) {
        emitScrollEvent$default(this, scrollView, scrollEventType, 0.0f, 0.0f, false, 16, null);
    }

    public static /* synthetic */ void emitScrollEvent$default(ReactScrollViewHelper reactScrollViewHelper, ViewGroup viewGroup, ScrollEventType scrollEventType, float f2, float f7, boolean z5, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            z5 = false;
        }
        reactScrollViewHelper.emitScrollEvent(viewGroup, scrollEventType, f2, f7, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ViewGroup & HasScrollState & HasStateWrapper> void updateFabricScrollState(T scrollView, int scrollX, int scrollY) {
        if (DEBUG_MODE) {
            o8.a.m(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(scrollX), Integer.valueOf(scrollY));
        }
        if (scrollView.getStateWrapper() == null) {
            return;
        }
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        reactScrollViewScrollState.setUpdatedByScroll(true);
        if (reactScrollViewScrollState.getLastStateUpdateScroll().equals(scrollX, scrollY)) {
            return;
        }
        reactScrollViewScrollState.setLastStateUpdateScroll(scrollX, scrollY);
        forceUpdateState(scrollView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, ScrollEventType scrollEventType, float xVelocity, float yVelocity, boolean isDrawing) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (scrollEventType == ScrollEventType.SCROLL) {
            T t5 = scrollView;
            if (t5.getScrollEventThrottle() >= Math.max(17L, jCurrentTimeMillis - t5.getLastScrollDispatchTime())) {
                return;
            }
        }
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        Iterator it = CollectionsKt.i0(scrollListeners).iterator();
        while (it.hasNext()) {
            ScrollListener scrollListener = (ScrollListener) ((WeakReference) it.next()).get();
            if (scrollListener != null) {
                scrollListener.onScroll(scrollView, scrollEventType, xVelocity, yVelocity);
            }
        }
        Context context = scrollView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher(reactContext);
        if (eventDispatcher != null) {
            ScrollEvent scrollEventObtain = ScrollEvent.INSTANCE.obtain(surfaceId, scrollView.getId(), scrollEventType, scrollView.getScrollX(), scrollView.getScrollY(), xVelocity, yVelocity, childAt.getWidth(), childAt.getHeight(), scrollView.getWidth(), scrollView.getHeight());
            scrollEventObtain.setDrawing(isDrawing);
            eventDispatcher.dispatchEvent(scrollEventObtain);
            if (scrollEventType == ScrollEventType.SCROLL) {
                scrollView.setLastScrollDispatchTime(jCurrentTimeMillis);
            }
        }
    }
}
