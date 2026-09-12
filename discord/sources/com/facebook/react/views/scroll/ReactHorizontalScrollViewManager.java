package com.facebook.react.views.scroll;

import android.view.View;
import androidx.core.view.l0;
import androidx.core.view.u0;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = ReactHorizontalScrollViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001[B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016J\"\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0018\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0019H\u0007J\u0018\u0010 \u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0019H\u0007J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0007J\u001a\u0010$\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010&\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010(H\u0007J\u0018\u0010)\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0019H\u0007J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0019H\u0007J\u0018\u0010-\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0019H\u0007J\u0018\u0010/\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0019H\u0007J\u001a\u00101\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u00103\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0019H\u0007J\u001a\u00105\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0017J\u001a\u00106\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\"\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010(H\u0017J\"\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010<\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u0002H\u0016J\u0018\u0010=\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00022\u0006\u0010>\u001a\u00020?H\u0016J\u0018\u0010@\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00022\u0006\u0010>\u001a\u00020AH\u0016J\u0018\u0010B\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010C\u001a\u00020:H\u0007J\"\u0010D\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010E\u001a\u00020:2\u0006\u0010F\u001a\u00020\u001dH\u0007J\u001c\u0010G\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010H\u001a\u0004\u0018\u00010\rH\u0007J\"\u0010I\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010E\u001a\u00020:2\u0006\u0010J\u001a\u00020\u001dH\u0007J'\u0010K\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010E\u001a\u00020:2\b\u0010C\u001a\u0004\u0018\u00010:H\u0007¢\u0006\u0002\u0010LJ\u001a\u0010M\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010N\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010O\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010P\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020QH\u0007J\u001a\u0010R\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010SH\u0007J\u001a\u0010T\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010SH\u0007J\u001a\u0010U\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010V\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010W\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010X\u001a\u00020:H\u0007J\u001a\u0010Y\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010Z\u001a\u00020\u0019H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollCommandHandler;", "fpsListener", "Lcom/facebook/react/views/scroll/FpsListener;", "<init>", "(Lcom/facebook/react/views/scroll/FpsListener;)V", "prepareToRecycleView", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "view", "getName", "", "createViewInstance", "context", "updateState", "", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "setScrollEnabled", "", "value", "", "setShowsHorizontalScrollIndicator", "setDecelerationRate", "decelerationRate", "", "setDisableIntervalMomentum", "disableIntervalMomentum", "setScrollsChildToFocus", "scrollsChildToFocus", "setSnapToInterval", "snapToInterval", "setSnapToAlignment", "alignment", "setSnapToOffsets", "snapToOffsets", "Lcom/facebook/react/bridge/ReadableArray;", "setSnapToStart", "snapToStart", "setSnapToEnd", "snapToEnd", "setRemoveClippedSubviews", ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS, "setSendMomentumEvents", "sendMomentumEvents", "setScrollPerfTag", "scrollPerfTag", "setPagingEnabled", "pagingEnabled", "setOverScrollMode", "setNestedScrollEnabled", "receiveCommand", "scrollView", "commandId", "", "args", "flashScrollIndicators", "scrollTo", "data", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToCommandData;", "scrollToEnd", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToEndCommandData;", "setBottomFillColor", ViewProps.COLOR, "setBorderRadius", "index", "borderRadius", "setBorderStyle", "borderStyle", "setBorderWidth", "width", "setBorderColor", "(Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;ILjava/lang/Integer;)V", "setOverflow", ViewProps.OVERFLOW, "setPersistentScrollbar", "setFadingEdgeLength", "Lcom/facebook/react/bridge/Dynamic;", "setContentOffset", "Lcom/facebook/react/bridge/ReadableMap;", "setMaintainVisibleContentPosition", "setPointerEvents", "pointerEventsStr", "setScrollEventThrottle", "scrollEventThrottle", "setHorizontal", "horizontal", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactHorizontalScrollViewManager extends ViewGroupManager<ReactHorizontalScrollView> implements ReactScrollViewCommandHelper.ScrollCommandHandler<ReactHorizontalScrollView> {

    @NotNull
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private final FpsListener fpsListener;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReactHorizontalScrollViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public final void setBorderColor(@NotNull ReactHorizontalScrollView view, int index, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, color);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(ReactHorizontalScrollView view, int index, float borderRadius) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderRadius(view, (BorderRadiusProp) BorderRadiusProp.getEntries().get(index), Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
        }
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle(ReactHorizontalScrollView view, String borderStyle) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderStyle(view, borderStyle == null ? null : BorderStyle.INSTANCE.fromString(borderStyle));
        }
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public final void setBorderWidth(ReactHorizontalScrollView view, int index, float width) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderWidth(view, (LogicalEdge) LogicalEdge.getEntries().get(index), Float.valueOf(width));
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public final void setBottomFillColor(@NotNull ReactHorizontalScrollView view, int color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEndFillColor(color);
    }

    @ReactProp(name = "contentOffset")
    public final void setContentOffset(@NotNull ReactHorizontalScrollView view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            view.scrollTo((int) PixelUtil.toPixelFromDIP(value.hasKey("x") ? value.getDouble("x") : 0.0d), (int) PixelUtil.toPixelFromDIP(value.hasKey("y") ? value.getDouble("y") : 0.0d));
        } else {
            view.scrollTo(0, 0);
        }
    }

    @ReactProp(name = "decelerationRate")
    public final void setDecelerationRate(@NotNull ReactHorizontalScrollView view, float decelerationRate) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDecelerationRate(decelerationRate);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public final void setDisableIntervalMomentum(@NotNull ReactHorizontalScrollView view, boolean disableIntervalMomentum) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDisableIntervalMomentum(disableIntervalMomentum);
    }

    @ReactProp(name = "fadingEdgeLength")
    public final void setFadingEdgeLength(@NotNull ReactHorizontalScrollView view, @NotNull Dynamic value) {
        ReadableMap readableMapAsMap;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        int i7 = WhenMappings.$EnumSwitchMapping$0[value.getType().ordinal()];
        if (i7 == 1) {
            view.setFadingEdgeLengthStart(value.asInt());
            view.setFadingEdgeLengthEnd(value.asInt());
        } else if (i7 == 2 && (readableMapAsMap = value.asMap()) != null) {
            int i10 = (!readableMapAsMap.hasKey(ViewProps.START) || readableMapAsMap.getInt(ViewProps.START) <= 0) ? 0 : readableMapAsMap.getInt(ViewProps.START);
            int i11 = (!readableMapAsMap.hasKey(ViewProps.END) || readableMapAsMap.getInt(ViewProps.END) <= 0) ? 0 : readableMapAsMap.getInt(ViewProps.END);
            view.setFadingEdgeLengthStart(i10);
            view.setFadingEdgeLengthEnd(i11);
        }
        if (view.getFadingEdgeLengthStart() > 0 || view.getFadingEdgeLengthEnd() > 0) {
            view.setHorizontalFadingEdgeEnabled(true);
            view.setFadingEdgeLength(Math.round(PixelUtil.INSTANCE.dpToPx(Math.max(view.getFadingEdgeLengthStart(), view.getFadingEdgeLengthEnd()))));
        } else {
            view.setHorizontalFadingEdgeEnabled(false);
            view.setFadingEdgeLength(0);
        }
    }

    @ReactProp(name = "horizontal")
    public final void setHorizontal(ReactHorizontalScrollView view, boolean horizontal) {
    }

    @ReactProp(name = "maintainVisibleContentPosition")
    public final void setMaintainVisibleContentPosition(@NotNull ReactHorizontalScrollView view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            view.setMaintainVisibleContentPosition(MaintainVisibleScrollPositionHelper.Config.INSTANCE.fromReadableMap(value));
        } else {
            view.setMaintainVisibleContentPosition(null);
        }
    }

    @ReactProp(name = "nestedScrollEnabled")
    public final void setNestedScrollEnabled(ReactHorizontalScrollView view, boolean value) {
        if (view != null) {
            WeakHashMap weakHashMap = u0.f1729a;
            l0.l(view, value);
        }
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(@NotNull ReactHorizontalScrollView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOverScrollMode(ReactScrollViewHelper.parseOverScrollMode(value));
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public final void setOverflow(@NotNull ReactHorizontalScrollView view, String overflow) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOverflow(overflow);
    }

    @ReactProp(name = "pagingEnabled")
    public final void setPagingEnabled(@NotNull ReactHorizontalScrollView view, boolean pagingEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPagingEnabled(pagingEnabled);
    }

    @ReactProp(name = "persistentScrollbar")
    public final void setPersistentScrollbar(@NotNull ReactHorizontalScrollView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollbarFadingEnabled(!value);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public final void setPointerEvents(@NotNull ReactHorizontalScrollView view, String pointerEventsStr) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPointerEvents(PointerEvents.INSTANCE.parsePointerEvents(pointerEventsStr));
    }

    @ReactProp(name = ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)
    public final void setRemoveClippedSubviews(@NotNull ReactHorizontalScrollView view, boolean removeClippedSubviews) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRemoveClippedSubviews(removeClippedSubviews);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(@NotNull ReactHorizontalScrollView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollEnabled(value);
    }

    @ReactProp(name = "scrollEventThrottle")
    public final void setScrollEventThrottle(@NotNull ReactHorizontalScrollView view, int scrollEventThrottle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollEventThrottle(scrollEventThrottle);
    }

    @ReactProp(name = "scrollPerfTag")
    public final void setScrollPerfTag(@NotNull ReactHorizontalScrollView view, String scrollPerfTag) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollPerfTag(scrollPerfTag);
    }

    @ReactProp(defaultBoolean = true, name = "scrollsChildToFocus")
    public final void setScrollsChildToFocus(@NotNull ReactHorizontalScrollView view, boolean scrollsChildToFocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollsChildToFocus(scrollsChildToFocus);
    }

    @ReactProp(name = "sendMomentumEvents")
    public final void setSendMomentumEvents(@NotNull ReactHorizontalScrollView view, boolean sendMomentumEvents) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSendMomentumEvents(sendMomentumEvents);
    }

    @ReactProp(defaultBoolean = true, name = "showsHorizontalScrollIndicator")
    public final void setShowsHorizontalScrollIndicator(@NotNull ReactHorizontalScrollView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHorizontalScrollBarEnabled(value);
    }

    @ReactProp(name = "snapToAlignment")
    public final void setSnapToAlignment(@NotNull ReactHorizontalScrollView view, String alignment) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSnapToAlignment(ReactScrollViewHelper.parseSnapToAlignment(alignment));
    }

    @ReactProp(name = "snapToEnd")
    public final void setSnapToEnd(@NotNull ReactHorizontalScrollView view, boolean snapToEnd) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSnapToEnd(snapToEnd);
    }

    @ReactProp(name = "snapToInterval")
    public final void setSnapToInterval(@NotNull ReactHorizontalScrollView view, float snapToInterval) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSnapInterval((int) (PixelUtil.getDisplayMetricDensity() * snapToInterval));
    }

    @ReactProp(name = "snapToOffsets")
    public final void setSnapToOffsets(@NotNull ReactHorizontalScrollView view, ReadableArray snapToOffsets) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (snapToOffsets == null || snapToOffsets.size() == 0) {
            view.setSnapOffsets(null);
            return;
        }
        float displayMetricDensity = PixelUtil.getDisplayMetricDensity();
        ArrayList arrayList = new ArrayList();
        int size = snapToOffsets.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(Integer.valueOf((int) (snapToOffsets.getDouble(i7) * ((double) displayMetricDensity))));
        }
        view.setSnapOffsets(arrayList);
    }

    @ReactProp(name = "snapToStart")
    public final void setSnapToStart(@NotNull ReactHorizontalScrollView view, boolean snapToStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSnapToStart(snapToStart);
    }

    public /* synthetic */ ReactHorizontalScrollViewManager(FpsListener fpsListener, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : fpsListener);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactHorizontalScrollView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ReactHorizontalScrollView(context, this.fpsListener);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void flashScrollIndicators(@NotNull ReactHorizontalScrollView scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        scrollView.flashScrollIndicators();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public ReactHorizontalScrollView prepareToRecycleView(@NotNull ThemedReactContext reactContext, @NotNull ReactHorizontalScrollView view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        ReactHorizontalScrollView reactHorizontalScrollView = (ReactHorizontalScrollView) super.prepareToRecycleView(reactContext, view);
        if (reactHorizontalScrollView != null) {
            reactHorizontalScrollView.recycleView();
        }
        return reactHorizontalScrollView;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollTo(@NotNull ReactHorizontalScrollView scrollView, @NotNull ReactScrollViewCommandHelper.ScrollToCommandData data) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Intrinsics.checkNotNullParameter(data, "data");
        scrollView.abortAnimation();
        if (data.mAnimated) {
            scrollView.reactSmoothScrollTo(data.mDestX, data.mDestY);
        } else {
            scrollView.scrollTo(data.mDestX, data.mDestY);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollToEnd(@NotNull ReactHorizontalScrollView scrollView, @NotNull ReactScrollViewCommandHelper.ScrollToEndCommandData data) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Intrinsics.checkNotNullParameter(data, "data");
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on HorizontalScrollView without child");
        }
        int paddingRight = scrollView.getPaddingRight() + childAt.getWidth();
        scrollView.abortAnimation();
        if (data.mAnimated) {
            scrollView.reactSmoothScrollTo(paddingRight, scrollView.getScrollY());
        } else {
            scrollView.scrollTo(paddingRight, scrollView.getScrollY());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(@NotNull ReactHorizontalScrollView view, @NotNull ReactStylesDiffMap props, @NotNull StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        view.setStateWrapper(stateWrapper);
        if (!ReactNativeFeatureFlags.enableViewCulling() && !ReactNativeFeatureFlags.useTraitHiddenOnAndroid()) {
            return null;
        }
        ReactScrollViewHelper.loadFabricScrollState$ReactAndroid_release(view, stateWrapper);
        return null;
    }

    public ReactHorizontalScrollViewManager(FpsListener fpsListener) {
        super(null, 1, null);
        this.fpsListener = fpsListener;
        if (ReactNativeFeatureFlags.enableViewRecyclingForScrollView()) {
            setupViewRecycling();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @d
    public void receiveCommand(@NotNull ReactHorizontalScrollView scrollView, int commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        ReactScrollViewCommandHelper.INSTANCE.receiveCommand(this, scrollView, commandId, args);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull ReactHorizontalScrollView scrollView, @NotNull String commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        ReactScrollViewCommandHelper.INSTANCE.receiveCommand(this, scrollView, commandId, args);
    }
}
