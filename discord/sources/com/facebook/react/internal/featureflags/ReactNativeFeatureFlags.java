package com.facebook.react.internal.featureflags;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v5.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bE\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J\b\u0010\u000f\u001a\u00020\tH\u0007J\b\u0010\u0010\u001a\u00020\tH\u0007J\b\u0010\u0011\u001a\u00020\tH\u0007J\b\u0010\u0012\u001a\u00020\tH\u0007J\b\u0010\u0013\u001a\u00020\tH\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\tH\u0007J\b\u0010\u0017\u001a\u00020\tH\u0007J\b\u0010\u0018\u001a\u00020\tH\u0007J\b\u0010\u0019\u001a\u00020\tH\u0007J\b\u0010\u001a\u001a\u00020\tH\u0007J\b\u0010\u001b\u001a\u00020\tH\u0007J\b\u0010\u001c\u001a\u00020\tH\u0007J\b\u0010\u001d\u001a\u00020\tH\u0007J\b\u0010\u001e\u001a\u00020\tH\u0007J\b\u0010\u001f\u001a\u00020\tH\u0007J\b\u0010 \u001a\u00020\tH\u0007J\b\u0010!\u001a\u00020\tH\u0007J\b\u0010\"\u001a\u00020\tH\u0007J\b\u0010#\u001a\u00020\tH\u0007J\b\u0010$\u001a\u00020\tH\u0007J\b\u0010%\u001a\u00020\tH\u0007J\b\u0010&\u001a\u00020\tH\u0007J\b\u0010'\u001a\u00020\tH\u0007J\b\u0010(\u001a\u00020\tH\u0007J\b\u0010)\u001a\u00020\tH\u0007J\b\u0010*\u001a\u00020\tH\u0007J\b\u0010+\u001a\u00020\tH\u0007J\b\u0010,\u001a\u00020\tH\u0007J\b\u0010-\u001a\u00020\tH\u0007J\b\u0010.\u001a\u00020\tH\u0007J\b\u0010/\u001a\u00020\tH\u0007J\b\u00100\u001a\u00020\tH\u0007J\b\u00101\u001a\u00020\tH\u0007J\b\u00102\u001a\u00020\tH\u0007J\b\u00103\u001a\u00020\tH\u0007J\b\u00104\u001a\u00020\tH\u0007J\b\u00105\u001a\u00020\tH\u0007J\b\u00106\u001a\u00020\tH\u0007J\b\u00107\u001a\u00020\tH\u0007J\b\u00108\u001a\u00020\tH\u0007J\b\u00109\u001a\u00020\tH\u0007J\b\u0010:\u001a\u00020\tH\u0007J\b\u0010;\u001a\u00020\tH\u0007J\b\u0010<\u001a\u00020\tH\u0007J\b\u0010=\u001a\u00020\tH\u0007J\b\u0010>\u001a\u00020\tH\u0007J\b\u0010?\u001a\u00020\tH\u0007J\b\u0010@\u001a\u00020\tH\u0007J\b\u0010A\u001a\u00020\tH\u0007J\b\u0010B\u001a\u00020\tH\u0007J\b\u0010C\u001a\u00020\tH\u0007J\b\u0010D\u001a\u00020\tH\u0007J\b\u0010E\u001a\u00020\tH\u0007J\b\u0010F\u001a\u00020\tH\u0007J\b\u0010G\u001a\u00020\tH\u0007J\b\u0010H\u001a\u00020\tH\u0007J\b\u0010I\u001a\u00020\tH\u0007J\b\u0010J\u001a\u00020\tH\u0007J\b\u0010K\u001a\u00020\tH\u0007J\b\u0010L\u001a\u00020\tH\u0007J\b\u0010M\u001a\u00020\tH\u0007J\b\u0010N\u001a\u00020OH\u0007J\b\u0010P\u001a\u00020\tH\u0007J\b\u0010Q\u001a\u00020\tH\u0007J\b\u0010R\u001a\u00020\tH\u0007J\b\u0010S\u001a\u00020\tH\u0007J\b\u0010T\u001a\u00020\tH\u0007J\b\u0010U\u001a\u00020\tH\u0007J\b\u0010V\u001a\u00020\tH\u0007J\b\u0010W\u001a\u00020\tH\u0007J\b\u0010X\u001a\u00020\tH\u0007J\b\u0010Y\u001a\u00020\tH\u0007J\b\u0010Z\u001a\u00020\tH\u0007J\b\u0010[\u001a\u00020\tH\u0007J\b\u0010\\\u001a\u00020\tH\u0007J\b\u0010]\u001a\u00020\tH\u0007J\b\u0010^\u001a\u00020\tH\u0007J\b\u0010_\u001a\u00020\tH\u0007J\b\u0010`\u001a\u00020\tH\u0007J\b\u0010a\u001a\u00020\tH\u0007J\b\u0010b\u001a\u00020\tH\u0007J\b\u0010c\u001a\u00020\tH\u0007J\b\u0010d\u001a\u00020\tH\u0007J\b\u0010e\u001a\u00020\tH\u0007J\b\u0010f\u001a\u00020\tH\u0007J\b\u0010g\u001a\u00020\tH\u0007J\b\u0010h\u001a\u00020\tH\u0007J\b\u0010i\u001a\u00020OH\u0007J\b\u0010j\u001a\u00020\tH\u0007J\b\u0010k\u001a\u00020OH\u0007J\u0010\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020oH\u0007J\b\u0010p\u001a\u00020mH\u0007J\u0012\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010n\u001a\u00020oH\u0007J\u001b\u0010s\u001a\u00020m2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0002\buR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006v"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;", "", "<init>", "()V", "accessorProvider", "Lkotlin/Function0;", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;", "accessor", "commonTestFlag", "", "cdpInteractionMetricsEnabled", "cxxNativeAnimatedEnabled", "defaultTextToOverflowHidden", "disableEarlyViewCommandExecution", "disableImageViewPreallocationAndroid", "disableMountItemReorderingAndroid", "disableSubviewClippingAndroid", "disableTextLayoutManagerCacheAndroid", "disableViewPreallocationAndroid", "enableAccessibilityOrder", "enableAccumulatedUpdatesInRawPropsAndroid", "enableAndroidTextMeasurementOptimizations", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableCustomFocusSearchOnClippedElementsAndroid", "enableDestroyShadowTreeRevisionAsync", "enableDifferentiatorMutationVectorPreallocation", "enableDoubleMeasurementFixAndroid", "enableEagerMainQueueModulesOnIOS", "enableEagerRootViewAttachment", "enableExclusivePropsUpdateAndroid", "enableFabricCommitBranching", "enableFabricLogs", "enableFabricRenderer", "enableFixForParentTagDuringReparenting", "enableFontScaleChangesUpdatingLayout", "enableIOSExperimentalAutoFocusImplementation", "enableIOSTextBaselineOffsetPerLine", "enableIOSViewClipToPaddingBox", "enableImagePrefetchingAndroid", "enableImmediateUpdateModeForContentOffsetChanges", "enableImperativeFocus", "enableInteropViewManagerClassLookUpOptimizationIOS", "enableIntersectionObserverByDefault", "enableKeyEvents", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableMainQueueCoordinatorOnIOS", "enableModuleArgumentNSNullConversionIOS", "enableMutationObserverByDefault", "enableNativeCSSParsing", "enableNativeViewPropTransformations", "enableNetworkEventReporting", "enablePreparedTextLayout", "enablePropsUpdateReconciliationAndroid", "enableSchedulerDelegateInvalidation", "enableSwiftUIBasedFilters", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForImage", "enableViewRecyclingForScrollView", "enableViewRecyclingForText", "enableViewRecyclingForView", "enableVirtualViewContainerStateExperimental", "enableVirtualViewDebugFeatures", "fixDifferentiatorParentTagForUnflattenCase", "fixFindShadowNodeByTagRaceCondition", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixYogaFlexBasisFitContentInMainAxis", "fuseboxAssertSingleHostState", "fuseboxEnabledRelease", "fuseboxFrameRecordingEnabled", "fuseboxNetworkInspectionEnabled", "fuseboxScreenshotCaptureEnabled", "hideOffscreenVirtualViewsOnIOS", "overrideBySynchronousMountPropsAtMountingAndroid", "perfIssuesEnabled", "perfMonitorV2Enabled", "preparedTextCacheSize", "", "preventShadowTreeCommitExhaustion", "redBoxV2Android", "redBoxV2IOS", "shouldPressibilityUseW3CPointerEventsForHover", "runtimeCrashUiThreadUtils", "shouldTriggerResponderTransferOnScrollAndroid", "skipActivityIdentityAssertionOnHostPause", "syncAndroidClipBoundsWithOverflow", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "updateRuntimeShadowNodeReferencesOnCommitThread", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useLISAlgorithmInDifferentiator", "useNativeViewConfigsInBridgelessMode", "useNestedScrollViewAndroid", "useOptimizedViewRegistryOnAndroid", "usePullModelOnAndroid", "useSharedAnimatedBackend", "useSilenceErrorSMMViewNotFound", "useTraitHiddenOnAndroid", "useTraitHiddenOnIOS", "useTurboModuleInterop", "useTurboModules", "useUnorderedMapInDifferentiator", "viewCullingOutsetRatio", "viewTransitionEnabled", "virtualViewPrerenderRatio", "override", "", "provider", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "dangerouslyReset", "dangerouslyForceOverride", "", "setAccessorProvider", "newAccessorProvider", "setAccessorProvider$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNativeFeatureFlags {

    @NotNull
    public static final ReactNativeFeatureFlags INSTANCE = new ReactNativeFeatureFlags();

    @NotNull
    private static ReactNativeFeatureFlagsAccessor accessor;

    @NotNull
    private static Function0<? extends ReactNativeFeatureFlagsAccessor> accessorProvider;

    static {
        a aVar = new a(3);
        accessorProvider = aVar;
        accessor = (ReactNativeFeatureFlagsAccessor) aVar.invoke();
    }

    private ReactNativeFeatureFlags() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactNativeFeatureFlagsCxxAccessor accessorProvider$lambda$0() {
        return new ReactNativeFeatureFlagsCxxAccessor();
    }

    public static final boolean cdpInteractionMetricsEnabled() {
        return accessor.cdpInteractionMetricsEnabled();
    }

    public static final boolean commonTestFlag() {
        return accessor.commonTestFlag();
    }

    public static final boolean cxxNativeAnimatedEnabled() {
        return accessor.cxxNativeAnimatedEnabled();
    }

    public static final String dangerouslyForceOverride(@NotNull ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        ReactNativeFeatureFlagsAccessor reactNativeFeatureFlagsAccessor = (ReactNativeFeatureFlagsAccessor) accessorProvider.invoke();
        String strDangerouslyForceOverride = reactNativeFeatureFlagsAccessor.dangerouslyForceOverride(provider);
        accessor = reactNativeFeatureFlagsAccessor;
        return strDangerouslyForceOverride;
    }

    public static final void dangerouslyReset() {
        accessor.dangerouslyReset();
        accessor = (ReactNativeFeatureFlagsAccessor) accessorProvider.invoke();
    }

    public static final boolean defaultTextToOverflowHidden() {
        return accessor.defaultTextToOverflowHidden();
    }

    public static final boolean disableEarlyViewCommandExecution() {
        return accessor.disableEarlyViewCommandExecution();
    }

    public static final boolean disableImageViewPreallocationAndroid() {
        return accessor.disableImageViewPreallocationAndroid();
    }

    public static final boolean disableMountItemReorderingAndroid() {
        return accessor.disableMountItemReorderingAndroid();
    }

    public static final boolean disableSubviewClippingAndroid() {
        return accessor.disableSubviewClippingAndroid();
    }

    public static final boolean disableTextLayoutManagerCacheAndroid() {
        return accessor.disableTextLayoutManagerCacheAndroid();
    }

    public static final boolean disableViewPreallocationAndroid() {
        return accessor.disableViewPreallocationAndroid();
    }

    public static final boolean enableAccessibilityOrder() {
        return accessor.enableAccessibilityOrder();
    }

    public static final boolean enableAccumulatedUpdatesInRawPropsAndroid() {
        return accessor.enableAccumulatedUpdatesInRawPropsAndroid();
    }

    public static final boolean enableAndroidTextMeasurementOptimizations() {
        return accessor.enableAndroidTextMeasurementOptimizations();
    }

    public static final boolean enableBridgelessArchitecture() {
        return accessor.enableBridgelessArchitecture();
    }

    public static final boolean enableCppPropsIteratorSetter() {
        return accessor.enableCppPropsIteratorSetter();
    }

    public static final boolean enableCustomFocusSearchOnClippedElementsAndroid() {
        return accessor.enableCustomFocusSearchOnClippedElementsAndroid();
    }

    public static final boolean enableDestroyShadowTreeRevisionAsync() {
        return accessor.enableDestroyShadowTreeRevisionAsync();
    }

    public static final boolean enableDifferentiatorMutationVectorPreallocation() {
        return accessor.enableDifferentiatorMutationVectorPreallocation();
    }

    public static final boolean enableDoubleMeasurementFixAndroid() {
        return accessor.enableDoubleMeasurementFixAndroid();
    }

    public static final boolean enableEagerMainQueueModulesOnIOS() {
        return accessor.enableEagerMainQueueModulesOnIOS();
    }

    public static final boolean enableEagerRootViewAttachment() {
        return accessor.enableEagerRootViewAttachment();
    }

    public static final boolean enableExclusivePropsUpdateAndroid() {
        return accessor.enableExclusivePropsUpdateAndroid();
    }

    public static final boolean enableFabricCommitBranching() {
        return accessor.enableFabricCommitBranching();
    }

    public static final boolean enableFabricLogs() {
        return accessor.enableFabricLogs();
    }

    public static final boolean enableFabricRenderer() {
        return accessor.enableFabricRenderer();
    }

    public static final boolean enableFixForParentTagDuringReparenting() {
        return accessor.enableFixForParentTagDuringReparenting();
    }

    public static final boolean enableFontScaleChangesUpdatingLayout() {
        return accessor.enableFontScaleChangesUpdatingLayout();
    }

    public static final boolean enableIOSExperimentalAutoFocusImplementation() {
        return accessor.enableIOSExperimentalAutoFocusImplementation();
    }

    public static final boolean enableIOSTextBaselineOffsetPerLine() {
        return accessor.enableIOSTextBaselineOffsetPerLine();
    }

    public static final boolean enableIOSViewClipToPaddingBox() {
        return accessor.enableIOSViewClipToPaddingBox();
    }

    public static final boolean enableImagePrefetchingAndroid() {
        return accessor.enableImagePrefetchingAndroid();
    }

    public static final boolean enableImmediateUpdateModeForContentOffsetChanges() {
        return accessor.enableImmediateUpdateModeForContentOffsetChanges();
    }

    public static final boolean enableImperativeFocus() {
        return accessor.enableImperativeFocus();
    }

    public static final boolean enableInteropViewManagerClassLookUpOptimizationIOS() {
        return accessor.enableInteropViewManagerClassLookUpOptimizationIOS();
    }

    public static final boolean enableIntersectionObserverByDefault() {
        return accessor.enableIntersectionObserverByDefault();
    }

    public static final boolean enableKeyEvents() {
        return accessor.enableKeyEvents();
    }

    public static final boolean enableLayoutAnimationsOnAndroid() {
        return accessor.enableLayoutAnimationsOnAndroid();
    }

    public static final boolean enableLayoutAnimationsOnIOS() {
        return accessor.enableLayoutAnimationsOnIOS();
    }

    public static final boolean enableMainQueueCoordinatorOnIOS() {
        return accessor.enableMainQueueCoordinatorOnIOS();
    }

    public static final boolean enableModuleArgumentNSNullConversionIOS() {
        return accessor.enableModuleArgumentNSNullConversionIOS();
    }

    public static final boolean enableMutationObserverByDefault() {
        return accessor.enableMutationObserverByDefault();
    }

    public static final boolean enableNativeCSSParsing() {
        return accessor.enableNativeCSSParsing();
    }

    public static final boolean enableNativeViewPropTransformations() {
        return accessor.enableNativeViewPropTransformations();
    }

    public static final boolean enableNetworkEventReporting() {
        return accessor.enableNetworkEventReporting();
    }

    public static final boolean enablePreparedTextLayout() {
        return accessor.enablePreparedTextLayout();
    }

    public static final boolean enablePropsUpdateReconciliationAndroid() {
        return accessor.enablePropsUpdateReconciliationAndroid();
    }

    public static final boolean enableSchedulerDelegateInvalidation() {
        return accessor.enableSchedulerDelegateInvalidation();
    }

    public static final boolean enableSwiftUIBasedFilters() {
        return accessor.enableSwiftUIBasedFilters();
    }

    public static final boolean enableViewCulling() {
        return accessor.enableViewCulling();
    }

    public static final boolean enableViewRecycling() {
        return accessor.enableViewRecycling();
    }

    public static final boolean enableViewRecyclingForImage() {
        return accessor.enableViewRecyclingForImage();
    }

    public static final boolean enableViewRecyclingForScrollView() {
        return accessor.enableViewRecyclingForScrollView();
    }

    public static final boolean enableViewRecyclingForText() {
        return accessor.enableViewRecyclingForText();
    }

    public static final boolean enableViewRecyclingForView() {
        return accessor.enableViewRecyclingForView();
    }

    public static final boolean enableVirtualViewContainerStateExperimental() {
        return accessor.enableVirtualViewContainerStateExperimental();
    }

    public static final boolean enableVirtualViewDebugFeatures() {
        return accessor.enableVirtualViewDebugFeatures();
    }

    public static final boolean fixDifferentiatorParentTagForUnflattenCase() {
        return accessor.fixDifferentiatorParentTagForUnflattenCase();
    }

    public static final boolean fixFindShadowNodeByTagRaceCondition() {
        return accessor.fixFindShadowNodeByTagRaceCondition();
    }

    public static final boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        return accessor.fixMappingOfEventPrioritiesBetweenFabricAndReact();
    }

    public static final boolean fixYogaFlexBasisFitContentInMainAxis() {
        return accessor.fixYogaFlexBasisFitContentInMainAxis();
    }

    public static final boolean fuseboxAssertSingleHostState() {
        return accessor.fuseboxAssertSingleHostState();
    }

    public static final boolean fuseboxEnabledRelease() {
        return accessor.fuseboxEnabledRelease();
    }

    public static final boolean fuseboxFrameRecordingEnabled() {
        return accessor.fuseboxFrameRecordingEnabled();
    }

    public static final boolean fuseboxNetworkInspectionEnabled() {
        return accessor.fuseboxNetworkInspectionEnabled();
    }

    public static final boolean fuseboxScreenshotCaptureEnabled() {
        return accessor.fuseboxScreenshotCaptureEnabled();
    }

    public static final boolean hideOffscreenVirtualViewsOnIOS() {
        return accessor.hideOffscreenVirtualViewsOnIOS();
    }

    public static final void override(@NotNull ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        accessor.override(provider);
    }

    public static final boolean overrideBySynchronousMountPropsAtMountingAndroid() {
        return accessor.overrideBySynchronousMountPropsAtMountingAndroid();
    }

    public static final boolean perfIssuesEnabled() {
        return accessor.perfIssuesEnabled();
    }

    public static final boolean perfMonitorV2Enabled() {
        return accessor.perfMonitorV2Enabled();
    }

    public static final double preparedTextCacheSize() {
        return accessor.preparedTextCacheSize();
    }

    public static final boolean preventShadowTreeCommitExhaustion() {
        return accessor.preventShadowTreeCommitExhaustion();
    }

    public static final boolean redBoxV2Android() {
        return accessor.redBoxV2Android();
    }

    public static final boolean redBoxV2IOS() {
        return accessor.redBoxV2IOS();
    }

    public static final boolean runtimeCrashUiThreadUtils() {
        return accessor.runtimeCrashUiThreadUtils();
    }

    public static final boolean shouldPressibilityUseW3CPointerEventsForHover() {
        return accessor.shouldPressibilityUseW3CPointerEventsForHover();
    }

    public static final boolean shouldTriggerResponderTransferOnScrollAndroid() {
        return accessor.shouldTriggerResponderTransferOnScrollAndroid();
    }

    public static final boolean skipActivityIdentityAssertionOnHostPause() {
        return accessor.skipActivityIdentityAssertionOnHostPause();
    }

    public static final boolean syncAndroidClipBoundsWithOverflow() {
        return accessor.syncAndroidClipBoundsWithOverflow();
    }

    public static final boolean traceTurboModulePromiseRejectionsOnAndroid() {
        return accessor.traceTurboModulePromiseRejectionsOnAndroid();
    }

    public static final boolean updateRuntimeShadowNodeReferencesOnCommit() {
        return accessor.updateRuntimeShadowNodeReferencesOnCommit();
    }

    public static final boolean updateRuntimeShadowNodeReferencesOnCommitThread() {
        return accessor.updateRuntimeShadowNodeReferencesOnCommitThread();
    }

    public static final boolean useAlwaysAvailableJSErrorHandling() {
        return accessor.useAlwaysAvailableJSErrorHandling();
    }

    public static final boolean useFabricInterop() {
        return accessor.useFabricInterop();
    }

    public static final boolean useLISAlgorithmInDifferentiator() {
        return accessor.useLISAlgorithmInDifferentiator();
    }

    public static final boolean useNativeViewConfigsInBridgelessMode() {
        return accessor.useNativeViewConfigsInBridgelessMode();
    }

    public static final boolean useNestedScrollViewAndroid() {
        return accessor.useNestedScrollViewAndroid();
    }

    public static final boolean useOptimizedViewRegistryOnAndroid() {
        return accessor.useOptimizedViewRegistryOnAndroid();
    }

    public static final boolean usePullModelOnAndroid() {
        return accessor.usePullModelOnAndroid();
    }

    public static final boolean useSharedAnimatedBackend() {
        return accessor.useSharedAnimatedBackend();
    }

    public static final boolean useSilenceErrorSMMViewNotFound() {
        return accessor.useSilenceErrorSMMViewNotFound();
    }

    public static final boolean useTraitHiddenOnAndroid() {
        return accessor.useTraitHiddenOnAndroid();
    }

    public static final boolean useTraitHiddenOnIOS() {
        return accessor.useTraitHiddenOnIOS();
    }

    public static final boolean useTurboModuleInterop() {
        return accessor.useTurboModuleInterop();
    }

    public static final boolean useTurboModules() {
        return accessor.useTurboModules();
    }

    public static final boolean useUnorderedMapInDifferentiator() {
        return accessor.useUnorderedMapInDifferentiator();
    }

    public static final double viewCullingOutsetRatio() {
        return accessor.viewCullingOutsetRatio();
    }

    public static final boolean viewTransitionEnabled() {
        return accessor.viewTransitionEnabled();
    }

    public static final double virtualViewPrerenderRatio() {
        return accessor.virtualViewPrerenderRatio();
    }

    public final void setAccessorProvider$ReactAndroid_release(@NotNull Function0<? extends ReactNativeFeatureFlagsAccessor> newAccessorProvider) {
        Intrinsics.checkNotNullParameter(newAccessorProvider, "newAccessorProvider");
        accessorProvider = newAccessorProvider;
        accessor = (ReactNativeFeatureFlagsAccessor) newAccessorProvider.invoke();
    }
}
