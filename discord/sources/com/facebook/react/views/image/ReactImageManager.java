package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.PorterDuff;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.LogicalEdge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import o8.a;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = ReactImageManager.REACT_CLASS)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB=\b\u0007\u0012\u001a\b\u0002\u0010\u0003\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB-\b\u0017\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\rB7\b\u0017\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0018H\u0007J\u001a\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0007J\u001a\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0007J\u001a\u0010$\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u001a\u0010'\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u001f\u0010(\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0002\u0010+J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0002\u0010+J\u0018\u0010.\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010/\u001a\u00020!H\u0007J \u00100\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020!H\u0007J\u001a\u00103\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0013H\u0007J\u001a\u00105\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0013H\u0007J\u0018\u00107\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00108\u001a\u00020!H\u0007J\u001f\u00109\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0002\u0010+J\u0018\u0010;\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u0018H\u0007J\u0018\u0010=\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010>\u001a\u00020*H\u0007J\u0018\u0010?\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u0018H\u0007J\u001a\u0010A\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010&H\u0007J\u0014\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0DH\u0016J\u0010\u0010E\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0014R \u0010\u0003\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/facebook/react/views/image/ReactImageManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/image/ReactImageView;", "draweeControllerBuilder", "Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;", "globalImageLoadListener", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "callerContextFactory", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "<init>", "(Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Lcom/facebook/react/views/image/GlobalImageLoadListener;Lcom/facebook/react/views/image/ReactCallerContextFactory;)V", "callerContext", "", "(Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Ljava/lang/Object;)V", "(Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Lcom/facebook/react/views/image/GlobalImageLoadListener;Ljava/lang/Object;)V", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setUseSmallCache", "", "view", "useSmallCache", "", "setAccessible", "accessible", "setSrc", "sources", "Lcom/facebook/react/bridge/ReadableArray;", "setSource", "setBlurRadius", "blurRadius", "", "setInternal_AnalyticsTag", "analyticTag", "setDefaultSource", "source", "Lcom/facebook/react/bridge/ReadableMap;", "setLoadingIndicatorSource", "setBorderColor", ViewProps.BORDER_COLOR, "", "(Lcom/facebook/react/views/image/ReactImageView;Ljava/lang/Integer;)V", "setOverlayColor", "overlayColor", "setBorderWidth", ViewProps.BORDER_WIDTH, "setBorderRadius", "index", "borderRadius", "setResizeMode", ViewProps.RESIZE_MODE, "setResizeMethod", ViewProps.RESIZE_METHOD, "setResizeMultiplier", "resizeMultiplier", "setTintColor", "tintColor", "setProgressiveRenderingEnabled", ViewProps.ENABLED, "setFadeDuration", "durationMs", "setLoadHandlersRegistered", "shouldNotifyLoadEvents", "setHeaders", "headers", "getExportedCustomDirectEventTypeConstants", "", "onAfterUpdateTransaction", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactImageManager extends SimpleViewManager<ReactImageView> {

    @NotNull
    private static final String ON_ERROR = "onError";

    @NotNull
    private static final String ON_LOAD = "onLoad";

    @NotNull
    private static final String ON_LOAD_END = "onLoadEnd";

    @NotNull
    private static final String ON_LOAD_START = "onLoadStart";

    @NotNull
    private static final String ON_PROGRESS = "onProgress";

    @NotNull
    public static final String REACT_CLASS = "RCTImageView";

    @NotNull
    private static final String REGISTRATION_NAME = "registrationName";
    private Object callerContext;
    private final ReactCallerContextFactory callerContextFactory;
    private final AbstractDraweeControllerBuilder draweeControllerBuilder;
    private final GlobalImageLoadListener globalImageLoadListener;

    public ReactImageManager() {
        this(null, null, null, 7, null);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        ImageLoadEvent.Companion companion = ImageLoadEvent.INSTANCE;
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(4), v0.b(new Pair(REGISTRATION_NAME, ON_LOAD_START)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(5), v0.b(new Pair(REGISTRATION_NAME, ON_PROGRESS)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(2), v0.b(new Pair(REGISTRATION_NAME, ON_LOAD)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(1), v0.b(new Pair(REGISTRATION_NAME, ON_ERROR)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(3), v0.b(new Pair(REGISTRATION_NAME, ON_LOAD_END)));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "accessible")
    public final void setAccessible(@NotNull ReactImageView view, boolean accessible) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFocusable(accessible);
    }

    @ReactProp(name = "blurRadius")
    public final void setBlurRadius(@NotNull ReactImageView view, float blurRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBlurRadius(blurRadius);
    }

    @ReactProp(customType = "Color", name = ViewProps.BORDER_COLOR)
    public final void setBorderColor(@NotNull ReactImageView view, Integer borderColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, borderColor);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(@NotNull ReactImageView view, int index, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.values()[index], Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    @ReactProp(name = ViewProps.BORDER_WIDTH)
    public final void setBorderWidth(@NotNull ReactImageView view, float borderWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.ALL, Float.valueOf(borderWidth));
    }

    @ReactProp(name = "defaultSource")
    public final void setDefaultSource(@NotNull ReactImageView view, ReadableMap source) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDefaultSource(source);
    }

    @ReactProp(name = "fadeDuration")
    public final void setFadeDuration(@NotNull ReactImageView view, int durationMs) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFadeDuration(durationMs);
    }

    @ReactProp(name = "headers")
    public final void setHeaders(@NotNull ReactImageView view, ReadableMap headers) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (headers != null) {
            view.setHeaders(headers);
        }
    }

    @ReactProp(name = "internal_analyticTag")
    public final void setInternal_AnalyticsTag(@NotNull ReactImageView view, String analyticTag) {
        Intrinsics.checkNotNullParameter(view, "view");
        ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
        if (reactCallerContextFactory != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            view.updateCallerContext(reactCallerContextFactory.getOrCreateCallerContext(((ThemedReactContext) context).getModuleName(), analyticTag));
        }
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public final void setLoadHandlersRegistered(@NotNull ReactImageView view, boolean shouldNotifyLoadEvents) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldNotifyLoadEvents(shouldNotifyLoadEvents);
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public final void setLoadingIndicatorSource(@NotNull ReactImageView view, ReadableMap source) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLoadingIndicatorSource(source);
    }

    @ReactProp(customType = "Color", name = "overlayColor")
    public final void setOverlayColor(@NotNull ReactImageView view, Integer overlayColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (overlayColor == null) {
            view.setOverlayColor(0);
        } else {
            view.setOverlayColor(overlayColor.intValue());
        }
    }

    @ReactProp(name = "progressiveRenderingEnabled")
    public final void setProgressiveRenderingEnabled(@NotNull ReactImageView view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgressiveRenderingEnabled(enabled);
    }

    @ReactProp(name = ViewProps.RESIZE_METHOD)
    public final void setResizeMethod(@NotNull ReactImageView view, String resizeMethod) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setResizeMethod(ImageResizeMethod.INSTANCE.parse(resizeMethod));
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public final void setResizeMode(@NotNull ReactImageView view, String resizeMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScaleType(ImageResizeMode.toScaleType(resizeMode));
        view.setTileMode(ImageResizeMode.toTileMode(resizeMode));
    }

    @ReactProp(name = "resizeMultiplier")
    public final void setResizeMultiplier(@NotNull ReactImageView view, float resizeMultiplier) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (resizeMultiplier < 0.01f) {
            a.v(ReactConstants.TAG, "Invalid resize multiplier: '" + resizeMultiplier + "'");
        }
        view.setResizeMultiplier(resizeMultiplier);
    }

    @ReactProp(name = "source")
    public final void setSource(@NotNull ReactImageView view, ReadableArray sources) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSource(sources);
    }

    @ReactProp(name = "src")
    public final void setSrc(@NotNull ReactImageView view, ReadableArray sources) {
        Intrinsics.checkNotNullParameter(view, "view");
        setSource(view, sources);
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public final void setTintColor(@NotNull ReactImageView view, Integer tintColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (tintColor == null) {
            view.clearColorFilter();
        } else {
            view.setColorFilter(tintColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(name = "useSmallCache")
    public final void setUseSmallCache(@NotNull ReactImageView view, boolean useSmallCache) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseSmallCache(useSmallCache);
    }

    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder) {
        this(abstractDraweeControllerBuilder, null, null, 6, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactImageView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object orCreateCallerContext = this.callerContext;
        if (orCreateCallerContext == null) {
            ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
            orCreateCallerContext = reactCallerContextFactory != null ? reactCallerContextFactory.getOrCreateCallerContext(context.getModuleName(), null) : null;
        }
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilder = this.draweeControllerBuilder;
        if (abstractDraweeControllerBuilder == null) {
            abstractDraweeControllerBuilder = c9.a.f3531a.get();
        }
        Intrinsics.checkNotNull(abstractDraweeControllerBuilder);
        return new ReactImageView(context, abstractDraweeControllerBuilder, this.globalImageLoadListener, orCreateCallerContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ReactImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.maybeUpdateView();
    }

    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener) {
        this(abstractDraweeControllerBuilder, globalImageLoadListener, null, 4, null);
    }

    public /* synthetic */ ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, ReactCallerContextFactory reactCallerContextFactory, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : abstractDraweeControllerBuilder, (i7 & 2) != 0 ? null : globalImageLoadListener, (i7 & 4) != 0 ? null : reactCallerContextFactory);
    }

    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, ReactCallerContextFactory reactCallerContextFactory) {
        this.draweeControllerBuilder = abstractDraweeControllerBuilder;
        this.globalImageLoadListener = globalImageLoadListener;
        this.callerContextFactory = reactCallerContextFactory;
    }

    @d
    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this(abstractDraweeControllerBuilder, (GlobalImageLoadListener) null, (ReactCallerContextFactory) null);
        this.callerContext = obj;
    }

    @d
    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        this(abstractDraweeControllerBuilder, globalImageLoadListener, (ReactCallerContextFactory) null);
        this.callerContext = obj;
    }
}
