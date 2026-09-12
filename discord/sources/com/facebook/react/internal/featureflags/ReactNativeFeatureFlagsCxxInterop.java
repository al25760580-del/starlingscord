package com.facebook.react.internal.featureflags;

import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bE\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087 J\t\u0010\u0006\u001a\u00020\u0005H\u0087 J\t\u0010\u0007\u001a\u00020\u0005H\u0087 J\t\u0010\b\u001a\u00020\u0005H\u0087 J\t\u0010\t\u001a\u00020\u0005H\u0087 J\t\u0010\n\u001a\u00020\u0005H\u0087 J\t\u0010\u000b\u001a\u00020\u0005H\u0087 J\t\u0010\f\u001a\u00020\u0005H\u0087 J\t\u0010\r\u001a\u00020\u0005H\u0087 J\t\u0010\u000e\u001a\u00020\u0005H\u0087 J\t\u0010\u000f\u001a\u00020\u0005H\u0087 J\t\u0010\u0010\u001a\u00020\u0005H\u0087 J\t\u0010\u0011\u001a\u00020\u0005H\u0087 J\t\u0010\u0012\u001a\u00020\u0005H\u0087 J\t\u0010\u0013\u001a\u00020\u0005H\u0087 J\t\u0010\u0014\u001a\u00020\u0005H\u0087 J\t\u0010\u0015\u001a\u00020\u0005H\u0087 J\t\u0010\u0016\u001a\u00020\u0005H\u0087 J\t\u0010\u0017\u001a\u00020\u0005H\u0087 J\t\u0010\u0018\u001a\u00020\u0005H\u0087 J\t\u0010\u0019\u001a\u00020\u0005H\u0087 J\t\u0010\u001a\u001a\u00020\u0005H\u0087 J\t\u0010\u001b\u001a\u00020\u0005H\u0087 J\t\u0010\u001c\u001a\u00020\u0005H\u0087 J\t\u0010\u001d\u001a\u00020\u0005H\u0087 J\t\u0010\u001e\u001a\u00020\u0005H\u0087 J\t\u0010\u001f\u001a\u00020\u0005H\u0087 J\t\u0010 \u001a\u00020\u0005H\u0087 J\t\u0010!\u001a\u00020\u0005H\u0087 J\t\u0010\"\u001a\u00020\u0005H\u0087 J\t\u0010#\u001a\u00020\u0005H\u0087 J\t\u0010$\u001a\u00020\u0005H\u0087 J\t\u0010%\u001a\u00020\u0005H\u0087 J\t\u0010&\u001a\u00020\u0005H\u0087 J\t\u0010'\u001a\u00020\u0005H\u0087 J\t\u0010(\u001a\u00020\u0005H\u0087 J\t\u0010)\u001a\u00020\u0005H\u0087 J\t\u0010*\u001a\u00020\u0005H\u0087 J\t\u0010+\u001a\u00020\u0005H\u0087 J\t\u0010,\u001a\u00020\u0005H\u0087 J\t\u0010-\u001a\u00020\u0005H\u0087 J\t\u0010.\u001a\u00020\u0005H\u0087 J\t\u0010/\u001a\u00020\u0005H\u0087 J\t\u00100\u001a\u00020\u0005H\u0087 J\t\u00101\u001a\u00020\u0005H\u0087 J\t\u00102\u001a\u00020\u0005H\u0087 J\t\u00103\u001a\u00020\u0005H\u0087 J\t\u00104\u001a\u00020\u0005H\u0087 J\t\u00105\u001a\u00020\u0005H\u0087 J\t\u00106\u001a\u00020\u0005H\u0087 J\t\u00107\u001a\u00020\u0005H\u0087 J\t\u00108\u001a\u00020\u0005H\u0087 J\t\u00109\u001a\u00020\u0005H\u0087 J\t\u0010:\u001a\u00020\u0005H\u0087 J\t\u0010;\u001a\u00020\u0005H\u0087 J\t\u0010<\u001a\u00020\u0005H\u0087 J\t\u0010=\u001a\u00020\u0005H\u0087 J\t\u0010>\u001a\u00020\u0005H\u0087 J\t\u0010?\u001a\u00020\u0005H\u0087 J\t\u0010@\u001a\u00020\u0005H\u0087 J\t\u0010A\u001a\u00020\u0005H\u0087 J\t\u0010B\u001a\u00020\u0005H\u0087 J\t\u0010C\u001a\u00020\u0005H\u0087 J\t\u0010D\u001a\u00020\u0005H\u0087 J\t\u0010E\u001a\u00020\u0005H\u0087 J\t\u0010F\u001a\u00020\u0005H\u0087 J\t\u0010G\u001a\u00020\u0005H\u0087 J\t\u0010H\u001a\u00020\u0005H\u0087 J\t\u0010I\u001a\u00020\u0005H\u0087 J\t\u0010J\u001a\u00020KH\u0087 J\t\u0010L\u001a\u00020\u0005H\u0087 J\t\u0010M\u001a\u00020\u0005H\u0087 J\t\u0010N\u001a\u00020\u0005H\u0087 J\t\u0010O\u001a\u00020\u0005H\u0087 J\t\u0010P\u001a\u00020\u0005H\u0087 J\t\u0010Q\u001a\u00020\u0005H\u0087 J\t\u0010R\u001a\u00020\u0005H\u0087 J\t\u0010S\u001a\u00020\u0005H\u0087 J\t\u0010T\u001a\u00020\u0005H\u0087 J\t\u0010U\u001a\u00020\u0005H\u0087 J\t\u0010V\u001a\u00020\u0005H\u0087 J\t\u0010W\u001a\u00020\u0005H\u0087 J\t\u0010X\u001a\u00020\u0005H\u0087 J\t\u0010Y\u001a\u00020\u0005H\u0087 J\t\u0010Z\u001a\u00020\u0005H\u0087 J\t\u0010[\u001a\u00020\u0005H\u0087 J\t\u0010\\\u001a\u00020\u0005H\u0087 J\t\u0010]\u001a\u00020\u0005H\u0087 J\t\u0010^\u001a\u00020\u0005H\u0087 J\t\u0010_\u001a\u00020\u0005H\u0087 J\t\u0010`\u001a\u00020\u0005H\u0087 J\t\u0010a\u001a\u00020\u0005H\u0087 J\t\u0010b\u001a\u00020\u0005H\u0087 J\t\u0010c\u001a\u00020\u0005H\u0087 J\t\u0010d\u001a\u00020\u0005H\u0087 J\t\u0010e\u001a\u00020KH\u0087 J\t\u0010f\u001a\u00020\u0005H\u0087 J\t\u0010g\u001a\u00020KH\u0087 J\u0011\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0001H\u0087 J\t\u0010k\u001a\u00020iH\u0087 J\u0013\u0010l\u001a\u0004\u0018\u00010m2\u0006\u0010j\u001a\u00020\u0001H\u0087 ¨\u0006n"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;", "", "<init>", "()V", "commonTestFlag", "", "cdpInteractionMetricsEnabled", "cxxNativeAnimatedEnabled", "defaultTextToOverflowHidden", "disableEarlyViewCommandExecution", "disableImageViewPreallocationAndroid", "disableMountItemReorderingAndroid", "disableSubviewClippingAndroid", "disableTextLayoutManagerCacheAndroid", "disableViewPreallocationAndroid", "enableAccessibilityOrder", "enableAccumulatedUpdatesInRawPropsAndroid", "enableAndroidTextMeasurementOptimizations", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableCustomFocusSearchOnClippedElementsAndroid", "enableDestroyShadowTreeRevisionAsync", "enableDifferentiatorMutationVectorPreallocation", "enableDoubleMeasurementFixAndroid", "enableEagerMainQueueModulesOnIOS", "enableEagerRootViewAttachment", "enableExclusivePropsUpdateAndroid", "enableFabricCommitBranching", "enableFabricLogs", "enableFabricRenderer", "enableFixForParentTagDuringReparenting", "enableFontScaleChangesUpdatingLayout", "enableIOSExperimentalAutoFocusImplementation", "enableIOSTextBaselineOffsetPerLine", "enableIOSViewClipToPaddingBox", "enableImagePrefetchingAndroid", "enableImmediateUpdateModeForContentOffsetChanges", "enableImperativeFocus", "enableInteropViewManagerClassLookUpOptimizationIOS", "enableIntersectionObserverByDefault", "enableKeyEvents", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableMainQueueCoordinatorOnIOS", "enableModuleArgumentNSNullConversionIOS", "enableMutationObserverByDefault", "enableNativeCSSParsing", "enableNativeViewPropTransformations", "enableNetworkEventReporting", "enablePreparedTextLayout", "enablePropsUpdateReconciliationAndroid", "enableSchedulerDelegateInvalidation", "enableSwiftUIBasedFilters", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForImage", "enableViewRecyclingForScrollView", "enableViewRecyclingForText", "enableViewRecyclingForView", "enableVirtualViewContainerStateExperimental", "enableVirtualViewDebugFeatures", "fixDifferentiatorParentTagForUnflattenCase", "fixFindShadowNodeByTagRaceCondition", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixYogaFlexBasisFitContentInMainAxis", "fuseboxAssertSingleHostState", "fuseboxEnabledRelease", "fuseboxFrameRecordingEnabled", "fuseboxNetworkInspectionEnabled", "fuseboxScreenshotCaptureEnabled", "hideOffscreenVirtualViewsOnIOS", "overrideBySynchronousMountPropsAtMountingAndroid", "perfIssuesEnabled", "perfMonitorV2Enabled", "preparedTextCacheSize", "", "preventShadowTreeCommitExhaustion", "redBoxV2Android", "redBoxV2IOS", "shouldPressibilityUseW3CPointerEventsForHover", "runtimeCrashUiThreadUtils", "shouldTriggerResponderTransferOnScrollAndroid", "skipActivityIdentityAssertionOnHostPause", "syncAndroidClipBoundsWithOverflow", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "updateRuntimeShadowNodeReferencesOnCommitThread", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useLISAlgorithmInDifferentiator", "useNativeViewConfigsInBridgelessMode", "useNestedScrollViewAndroid", "useOptimizedViewRegistryOnAndroid", "usePullModelOnAndroid", "useSharedAnimatedBackend", "useSilenceErrorSMMViewNotFound", "useTraitHiddenOnAndroid", "useTraitHiddenOnIOS", "useTurboModuleInterop", "useTurboModules", "useUnorderedMapInDifferentiator", "viewCullingOutsetRatio", "viewTransitionEnabled", "virtualViewPrerenderRatio", "override", "", "provider", "dangerouslyReset", "dangerouslyForceOverride", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNativeFeatureFlagsCxxInterop {

    @NotNull
    public static final ReactNativeFeatureFlagsCxxInterop INSTANCE = new ReactNativeFeatureFlagsCxxInterop();

    static {
        SoLoader.m("react_featureflagsjni");
    }

    private ReactNativeFeatureFlagsCxxInterop() {
    }

    @a
    public static final native boolean cdpInteractionMetricsEnabled();

    @a
    public static final native boolean commonTestFlag();

    @a
    public static final native boolean cxxNativeAnimatedEnabled();

    @a
    public static final native String dangerouslyForceOverride(@NotNull Object provider);

    @a
    public static final native void dangerouslyReset();

    @a
    public static final native boolean defaultTextToOverflowHidden();

    @a
    public static final native boolean disableEarlyViewCommandExecution();

    @a
    public static final native boolean disableImageViewPreallocationAndroid();

    @a
    public static final native boolean disableMountItemReorderingAndroid();

    @a
    public static final native boolean disableSubviewClippingAndroid();

    @a
    public static final native boolean disableTextLayoutManagerCacheAndroid();

    @a
    public static final native boolean disableViewPreallocationAndroid();

    @a
    public static final native boolean enableAccessibilityOrder();

    @a
    public static final native boolean enableAccumulatedUpdatesInRawPropsAndroid();

    @a
    public static final native boolean enableAndroidTextMeasurementOptimizations();

    @a
    public static final native boolean enableBridgelessArchitecture();

    @a
    public static final native boolean enableCppPropsIteratorSetter();

    @a
    public static final native boolean enableCustomFocusSearchOnClippedElementsAndroid();

    @a
    public static final native boolean enableDestroyShadowTreeRevisionAsync();

    @a
    public static final native boolean enableDifferentiatorMutationVectorPreallocation();

    @a
    public static final native boolean enableDoubleMeasurementFixAndroid();

    @a
    public static final native boolean enableEagerMainQueueModulesOnIOS();

    @a
    public static final native boolean enableEagerRootViewAttachment();

    @a
    public static final native boolean enableExclusivePropsUpdateAndroid();

    @a
    public static final native boolean enableFabricCommitBranching();

    @a
    public static final native boolean enableFabricLogs();

    @a
    public static final native boolean enableFabricRenderer();

    @a
    public static final native boolean enableFixForParentTagDuringReparenting();

    @a
    public static final native boolean enableFontScaleChangesUpdatingLayout();

    @a
    public static final native boolean enableIOSExperimentalAutoFocusImplementation();

    @a
    public static final native boolean enableIOSTextBaselineOffsetPerLine();

    @a
    public static final native boolean enableIOSViewClipToPaddingBox();

    @a
    public static final native boolean enableImagePrefetchingAndroid();

    @a
    public static final native boolean enableImmediateUpdateModeForContentOffsetChanges();

    @a
    public static final native boolean enableImperativeFocus();

    @a
    public static final native boolean enableInteropViewManagerClassLookUpOptimizationIOS();

    @a
    public static final native boolean enableIntersectionObserverByDefault();

    @a
    public static final native boolean enableKeyEvents();

    @a
    public static final native boolean enableLayoutAnimationsOnAndroid();

    @a
    public static final native boolean enableLayoutAnimationsOnIOS();

    @a
    public static final native boolean enableMainQueueCoordinatorOnIOS();

    @a
    public static final native boolean enableModuleArgumentNSNullConversionIOS();

    @a
    public static final native boolean enableMutationObserverByDefault();

    @a
    public static final native boolean enableNativeCSSParsing();

    @a
    public static final native boolean enableNativeViewPropTransformations();

    @a
    public static final native boolean enableNetworkEventReporting();

    @a
    public static final native boolean enablePreparedTextLayout();

    @a
    public static final native boolean enablePropsUpdateReconciliationAndroid();

    @a
    public static final native boolean enableSchedulerDelegateInvalidation();

    @a
    public static final native boolean enableSwiftUIBasedFilters();

    @a
    public static final native boolean enableViewCulling();

    @a
    public static final native boolean enableViewRecycling();

    @a
    public static final native boolean enableViewRecyclingForImage();

    @a
    public static final native boolean enableViewRecyclingForScrollView();

    @a
    public static final native boolean enableViewRecyclingForText();

    @a
    public static final native boolean enableViewRecyclingForView();

    @a
    public static final native boolean enableVirtualViewContainerStateExperimental();

    @a
    public static final native boolean enableVirtualViewDebugFeatures();

    @a
    public static final native boolean fixDifferentiatorParentTagForUnflattenCase();

    @a
    public static final native boolean fixFindShadowNodeByTagRaceCondition();

    @a
    public static final native boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @a
    public static final native boolean fixYogaFlexBasisFitContentInMainAxis();

    @a
    public static final native boolean fuseboxAssertSingleHostState();

    @a
    public static final native boolean fuseboxEnabledRelease();

    @a
    public static final native boolean fuseboxFrameRecordingEnabled();

    @a
    public static final native boolean fuseboxNetworkInspectionEnabled();

    @a
    public static final native boolean fuseboxScreenshotCaptureEnabled();

    @a
    public static final native boolean hideOffscreenVirtualViewsOnIOS();

    @a
    public static final native void override(@NotNull Object provider);

    @a
    public static final native boolean overrideBySynchronousMountPropsAtMountingAndroid();

    @a
    public static final native boolean perfIssuesEnabled();

    @a
    public static final native boolean perfMonitorV2Enabled();

    @a
    public static final native double preparedTextCacheSize();

    @a
    public static final native boolean preventShadowTreeCommitExhaustion();

    @a
    public static final native boolean redBoxV2Android();

    @a
    public static final native boolean redBoxV2IOS();

    @a
    public static final native boolean runtimeCrashUiThreadUtils();

    @a
    public static final native boolean shouldPressibilityUseW3CPointerEventsForHover();

    @a
    public static final native boolean shouldTriggerResponderTransferOnScrollAndroid();

    @a
    public static final native boolean skipActivityIdentityAssertionOnHostPause();

    @a
    public static final native boolean syncAndroidClipBoundsWithOverflow();

    @a
    public static final native boolean traceTurboModulePromiseRejectionsOnAndroid();

    @a
    public static final native boolean updateRuntimeShadowNodeReferencesOnCommit();

    @a
    public static final native boolean updateRuntimeShadowNodeReferencesOnCommitThread();

    @a
    public static final native boolean useAlwaysAvailableJSErrorHandling();

    @a
    public static final native boolean useFabricInterop();

    @a
    public static final native boolean useLISAlgorithmInDifferentiator();

    @a
    public static final native boolean useNativeViewConfigsInBridgelessMode();

    @a
    public static final native boolean useNestedScrollViewAndroid();

    @a
    public static final native boolean useOptimizedViewRegistryOnAndroid();

    @a
    public static final native boolean usePullModelOnAndroid();

    @a
    public static final native boolean useSharedAnimatedBackend();

    @a
    public static final native boolean useSilenceErrorSMMViewNotFound();

    @a
    public static final native boolean useTraitHiddenOnAndroid();

    @a
    public static final native boolean useTraitHiddenOnIOS();

    @a
    public static final native boolean useTurboModuleInterop();

    @a
    public static final native boolean useTurboModules();

    @a
    public static final native boolean useUnorderedMapInDifferentiator();

    @a
    public static final native double viewCullingOutsetRatio();

    @a
    public static final native boolean viewTransitionEnabled();

    @a
    public static final native double virtualViewPrerenderRatio();
}
