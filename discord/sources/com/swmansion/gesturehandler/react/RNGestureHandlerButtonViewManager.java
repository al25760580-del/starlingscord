package com.swmansion.gesturehandler.react;

import com.facebook.react.R;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;
import jm.c;
import jm.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = RNGestureHandlerButtonViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0002wB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b#\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b$\u0010\u001eJ\u001f\u0010%\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b%\u0010\u001eJ!\u0010'\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b)\u0010(J!\u0010*\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b*\u0010(J!\u0010+\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b+\u0010(J!\u0010,\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b,\u0010(J!\u0010-\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b-\u0010(J!\u0010.\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b.\u0010(J!\u0010/\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b/\u0010(J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b0\u0010(J!\u00101\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b1\u0010(J!\u00103\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b3\u00104J!\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b6\u00104J\u001f\u00108\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\b:\u00109J\u001f\u0010;\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\b;\u00109J\u001f\u0010<\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\b<\u00109J\u001f\u0010=\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\b=\u00109J\u001f\u0010>\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\b>\u00109J\u001f\u0010?\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\b?\u00109J\u001f\u0010@\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\b@\u00109J\u001f\u0010A\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\bA\u00109J\u001f\u0010B\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\bB\u00109J\u001f\u0010C\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\bC\u00109J\u001f\u0010D\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\bD\u00109J\u001f\u0010E\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u000207H\u0017¢\u0006\u0004\bE\u00109J!\u0010G\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\bG\u0010(J\u001f\u0010I\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u0013H\u0017¢\u0006\u0004\bI\u0010\u0016J\u001f\u0010K\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u000eH\u0017¢\u0006\u0004\bK\u0010\u0012J\u001f\u0010M\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u000eH\u0017¢\u0006\u0004\bM\u0010\u0012J\u001f\u0010N\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0013H\u0017¢\u0006\u0004\bN\u0010\u0016J\u001f\u0010O\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0013H\u0017¢\u0006\u0004\bO\u0010\u0016J\u001f\u0010P\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0013H\u0017¢\u0006\u0004\bP\u0010\u0016J\u001f\u0010Q\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0013H\u0017¢\u0006\u0004\bQ\u0010\u0016J\u001f\u0010R\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u000eH\u0017¢\u0006\u0004\bR\u0010\u0012J\u001f\u0010T\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010S\u001a\u00020\u001bH\u0017¢\u0006\u0004\bT\u0010\u001eJ\u001f\u0010V\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\u001bH\u0017¢\u0006\u0004\bV\u0010\u001eJ\u001f\u0010X\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010W\u001a\u00020\u001bH\u0017¢\u0006\u0004\bX\u0010\u001eJ\u001f\u0010Z\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u001bH\u0017¢\u0006\u0004\bZ\u0010\u001eJ!\u0010\\\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010[\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\\\u0010(J\u001f\u0010^\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u001bH\u0017¢\u0006\u0004\b^\u0010\u001eJ\u001f\u0010`\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010_\u001a\u00020\u001bH\u0017¢\u0006\u0004\b`\u0010\u001eJ\u001f\u0010b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\u001bH\u0017¢\u0006\u0004\bb\u0010\u001eJ\u001f\u0010d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u001bH\u0017¢\u0006\u0004\bd\u0010\u001eJ\u001f\u0010f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010e\u001a\u00020\u001bH\u0017¢\u0006\u0004\bf\u0010\u001eJ\u001f\u0010g\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0013H\u0017¢\u0006\u0004\bg\u0010\u0016J\u001f\u0010h\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0013H\u0017¢\u0006\u0004\bh\u0010\u0016J!\u0010j\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010i\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bj\u00104J\u0017\u0010k\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010mH\u0014¢\u0006\u0004\bn\u0010oJ'\u0010r\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010q\u001a\u00020p2\u0006\u0010\u001f\u001a\u000207H\u0002¢\u0006\u0004\br\u0010sR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006x"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Ljm/c;", "Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Ljm/c;", "view", "", "useDrawableOnForeground", "", "setForeground", "(Ljm/c;Z)V", "", ViewProps.BACKGROUND_COLOR, "setBackgroundColor", "(Ljm/c;I)V", "useBorderlessDrawable", "setBorderless", ViewProps.ENABLED, "setEnabled", "", ViewProps.BORDER_WIDTH, "setBorderWidth", "(Ljm/c;F)V", "value", "setBorderLeftWidth", "setBorderRightWidth", "setBorderTopWidth", "setBorderBottomWidth", "setBorderStartWidth", "setBorderEndWidth", ViewProps.BORDER_COLOR, "setBorderColor", "(Ljm/c;Ljava/lang/Integer;)V", "setBorderLeftColor", "setBorderRightColor", "setBorderTopColor", "setBorderBottomColor", "setBorderStartColor", "setBorderEndColor", "setBorderBlockColor", "setBorderBlockEndColor", "setBorderBlockStartColor", "borderStyle", "setBorderStyle", "(Ljm/c;Ljava/lang/String;)V", ViewProps.OVERFLOW, "setOverflow", "Lcom/facebook/react/bridge/Dynamic;", "setBorderRadius", "(Ljm/c;Lcom/facebook/react/bridge/Dynamic;)V", "setBorderTopLeftRadius", "setBorderTopRightRadius", "setBorderBottomRightRadius", "setBorderBottomLeftRadius", "setBorderTopStartRadius", "setBorderTopEndRadius", "setBorderBottomStartRadius", "setBorderBottomEndRadius", "setBorderEndEndRadius", "setBorderEndStartRadius", "setBorderStartEndRadius", "setBorderStartStartRadius", "rippleColor", "setRippleColor", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", "setTapAnimationInDuration", "setTapAnimationOutDuration", "setLongPressDuration", "setLongPressAnimationOutDuration", "setNeedsOffscreenAlphaCompositing", "defaultOpacity", "setDefaultOpacity", "targetOpacity", "setActiveOpacity", "defaultScale", "setDefaultScale", "activeScale", "setActiveScale", "underlayColor", "setUnderlayColor", "defaultUnderlayOpacity", "setDefaultUnderlayOpacity", "activeUnderlayOpacity", "setActiveUnderlayOpacity", "hoverOpacity", "setHoverOpacity", "hoverScale", "setHoverScale", "hoverUnderlayOpacity", "setHoverUnderlayOpacity", "setHoverAnimationInDuration", "setHoverAnimationOutDuration", ViewProps.POINTER_EVENTS, "setPointerEvents", "onAfterUpdateTransaction", "(Ljm/c;)V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Lcom/facebook/react/uimanager/style/BorderRadiusProp;", "prop", "setBorderRadiusInternal", "(Ljm/c;Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/bridge/Dynamic;)V", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "jm/d", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<c> implements RNGestureHandlerButtonManagerInterface<c> {

    @NotNull
    public static final d Companion = new d();

    @NotNull
    public static final String REACT_CLASS = "RNGestureHandlerButton";

    @NotNull
    private final ViewManagerDelegate<c> mDelegate;

    public RNGestureHandlerButtonViewManager() {
        super(null, 1, null);
        this.mDelegate = new RNGestureHandlerButtonManagerDelegate(this);
    }

    private final void setBorderRadiusInternal(c view, BorderRadiusProp prop, Dynamic value) {
        BackgroundStyleApplicator.setBorderRadius(view, prop, LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, value, false, 2, null));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<c> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public c createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        c cVar = new c(context);
        cVar.f13940w = true;
        cVar.f13941x = 50;
        cVar.f13942y = 100;
        cVar.E = -1;
        cVar.F = -1;
        cVar.G = 1.0f;
        cVar.H = 1.0f;
        cVar.I = 1.0f;
        cVar.J = 1.0f;
        cVar.K = 50;
        cVar.L = 100;
        cVar.M = -1.0f;
        cVar.N = -1.0f;
        cVar.O = -1.0f;
        cVar.T = PointerEvents.AUTO;
        cVar.V = -1L;
        cVar.W = -1;
        cVar.setOnClickListener(c.f13924p0);
        cVar.setClickable(true);
        cVar.setFocusable(true);
        cVar.U = true;
        cVar.setClipChildren(false);
        return cVar;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.r();
        Object tag = view.getTag(R.id.accessibility_actions);
        ReadableArray readableArray = tag instanceof ReadableArray ? (ReadableArray) tag : null;
        boolean z5 = false;
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                ReadableMap map = readableArray.getMap(i7);
                if (Intrinsics.areEqual(map != null ? map.getString(StackTraceHelper.NAME_KEY) : null, "longpress")) {
                    z5 = true;
                    break;
                }
            }
        }
        view.setOnLongClickListener(z5 ? c.f13925q0 : null);
        view.setLongClickable(z5);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "activeOpacity")
    public void setActiveOpacity(@NotNull c view, float targetOpacity) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setActiveOpacity(targetOpacity);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "activeScale")
    public void setActiveScale(@NotNull c view, float activeScale) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setActiveScale(activeScale);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "activeUnderlayOpacity")
    public void setActiveUnderlayOpacity(@NotNull c view, float activeUnderlayOpacity) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setActiveUnderlayOpacity(activeUnderlayOpacity);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(@NotNull c view, int backgroundColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBackgroundColor(view, Integer.valueOf(backgroundColor));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_BLOCK_COLOR)
    public void setBorderBlockColor(@NotNull c view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.BLOCK, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_BLOCK_END_COLOR)
    public void setBorderBlockEndColor(@NotNull c view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.BLOCK_END, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_BLOCK_START_COLOR)
    public void setBorderBlockStartColor(@NotNull c view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.BLOCK_START, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_BOTTOM_COLOR)
    public void setBorderBottomColor(@NotNull c view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.BOTTOM, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_BOTTOM_END_RADIUS)
    public void setBorderBottomEndRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_BOTTOM_END_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderBottomLeftRadius")
    public void setBorderBottomLeftRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_BOTTOM_LEFT_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderBottomRightRadius")
    public void setBorderBottomRightRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_BOTTOM_RIGHT_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_BOTTOM_START_RADIUS)
    public void setBorderBottomStartRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_BOTTOM_START_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_BOTTOM_WIDTH)
    public void setBorderBottomWidth(@NotNull c view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.BOTTOM, Float.valueOf(value));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_COLOR)
    public void setBorderColor(@NotNull c view, Integer borderColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, borderColor);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_END_COLOR)
    public void setBorderEndColor(@NotNull c view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.END, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_END_END_RADIUS)
    public void setBorderEndEndRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_END_END_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_END_START_RADIUS)
    public void setBorderEndStartRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_END_START_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_END_WIDTH)
    public void setBorderEndWidth(@NotNull c view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.END, Float.valueOf(value));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_LEFT_COLOR)
    public void setBorderLeftColor(@NotNull c view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.LEFT, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_LEFT_WIDTH)
    public void setBorderLeftWidth(@NotNull c view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.LEFT, Float.valueOf(value));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderRadius")
    public void setBorderRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_RIGHT_COLOR)
    public void setBorderRightColor(@NotNull c view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.RIGHT, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_RIGHT_WIDTH)
    public void setBorderRightWidth(@NotNull c view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.RIGHT, Float.valueOf(value));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_START_COLOR)
    public void setBorderStartColor(@NotNull c view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.START, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_START_END_RADIUS)
    public void setBorderStartEndRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_START_END_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_START_START_RADIUS)
    public void setBorderStartStartRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_START_START_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_START_WIDTH)
    public void setBorderStartWidth(@NotNull c view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.START, Float.valueOf(value));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderStyle")
    public void setBorderStyle(@NotNull c view, String borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderStyle(view, borderStyle == null ? null : BorderStyle.INSTANCE.fromString(borderStyle));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_TOP_COLOR)
    public void setBorderTopColor(@NotNull c view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.TOP, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_TOP_END_RADIUS)
    public void setBorderTopEndRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_TOP_END_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderTopLeftRadius")
    public void setBorderTopLeftRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_TOP_LEFT_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderTopRightRadius")
    public void setBorderTopRightRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_TOP_RIGHT_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_TOP_START_RADIUS)
    public void setBorderTopStartRadius(@NotNull c view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        setBorderRadiusInternal(view, BorderRadiusProp.BORDER_TOP_START_RADIUS, value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_TOP_WIDTH)
    public void setBorderTopWidth(@NotNull c view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.TOP, Float.valueOf(value));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_WIDTH)
    public void setBorderWidth(@NotNull c view, float borderWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.ALL, Float.valueOf(borderWidth));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderless")
    public void setBorderless(@NotNull c view, boolean useBorderlessDrawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseBorderlessDrawable(useBorderlessDrawable);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "defaultOpacity")
    public void setDefaultOpacity(@NotNull c view, float defaultOpacity) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDefaultOpacity(defaultOpacity);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "defaultScale")
    public void setDefaultScale(@NotNull c view, float defaultScale) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDefaultScale(defaultScale);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "defaultUnderlayOpacity")
    public void setDefaultUnderlayOpacity(@NotNull c view, float defaultUnderlayOpacity) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDefaultUnderlayOpacity(defaultUnderlayOpacity);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.ENABLED)
    public void setEnabled(@NotNull c view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(enabled);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "exclusive")
    public void setExclusive(@NotNull c view, boolean exclusive) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setExclusive(exclusive);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "foreground")
    public void setForeground(@NotNull c view, boolean useDrawableOnForeground) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseDrawableOnForeground(useDrawableOnForeground);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "hoverAnimationInDuration")
    public void setHoverAnimationInDuration(@NotNull c view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value <= 0) {
            value = 0;
        }
        view.setHoverAnimationInDuration(value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "hoverAnimationOutDuration")
    public void setHoverAnimationOutDuration(@NotNull c view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value <= 0) {
            value = 0;
        }
        view.setHoverAnimationOutDuration(value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "hoverOpacity")
    public void setHoverOpacity(@NotNull c view, float hoverOpacity) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHoverOpacity(hoverOpacity);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "hoverScale")
    public void setHoverScale(@NotNull c view, float hoverScale) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHoverScale(hoverScale);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "hoverUnderlayOpacity")
    public void setHoverUnderlayOpacity(@NotNull c view, float hoverUnderlayOpacity) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHoverUnderlayOpacity(hoverUnderlayOpacity);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "longPressAnimationOutDuration")
    public void setLongPressAnimationOutDuration(@NotNull c view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLongPressAnimationOutDuration(value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "longPressDuration")
    public void setLongPressDuration(@NotNull c view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLongPressDuration(value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.NEEDS_OFFSCREEN_ALPHA_COMPOSITING)
    public void setNeedsOffscreenAlphaCompositing(@NotNull c view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNeedsOffscreenAlphaCompositing(value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(@NotNull c view, String overflow) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOverflow(overflow);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(@NotNull c view, String pointerEvents) {
        PointerEvents pointerEvents2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (pointerEvents != null) {
            switch (pointerEvents) {
                case "box-none":
                    pointerEvents2 = PointerEvents.BOX_NONE;
                    break;
                case "box-only":
                    pointerEvents2 = PointerEvents.BOX_ONLY;
                    break;
                case "auto":
                    pointerEvents2 = PointerEvents.AUTO;
                    break;
                case "none":
                    pointerEvents2 = PointerEvents.NONE;
                    break;
                default:
                    pointerEvents2 = PointerEvents.AUTO;
                    break;
            }
        } else {
            pointerEvents2 = PointerEvents.AUTO;
        }
        view.setPointerEvents(pointerEvents2);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "rippleColor")
    public void setRippleColor(@NotNull c view, Integer rippleColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleColor(rippleColor);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "rippleRadius")
    public void setRippleRadius(@NotNull c view, int rippleRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleRadius(Integer.valueOf(rippleRadius));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "tapAnimationInDuration")
    public void setTapAnimationInDuration(@NotNull c view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value <= 0) {
            value = 0;
        }
        view.setTapAnimationInDuration(value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "tapAnimationOutDuration")
    public void setTapAnimationOutDuration(@NotNull c view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value <= 0) {
            value = 0;
        }
        view.setTapAnimationOutDuration(value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(@NotNull c view, boolean touchSoundDisabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSoundEffectsEnabled(!touchSoundDisabled);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "underlayColor")
    public void setUnderlayColor(@NotNull c view, Integer underlayColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUnderlayColor(underlayColor);
    }
}
