package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
public class UIImplementation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5334a = 0;

    public interface LayoutUpdateListener {
        void onLayoutUpdated(ReactShadowNode reactShadowNode);
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("UIImplementation", LegacyArchitectureLogLevel.ERROR);
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i7) {
    }

    public void addUIBlock(UIBlock uIBlock) {
    }

    public void calculateRootLayout(ReactShadowNode reactShadowNode) {
    }

    public void clearJSResponder() {
    }

    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback) {
    }

    @Deprecated
    public ReactShadowNode createRootShadowNode() {
        return null;
    }

    @Deprecated
    public ReactShadowNode createShadowNode(String str) {
        return null;
    }

    public void createView(int i7, String str, int i10, ReadableMap readableMap) {
    }

    @Deprecated
    public void dispatchViewManagerCommand(int i7, int i10, ReadableArray readableArray) {
    }

    public void dispatchViewUpdates(int i7) {
    }

    public void findSubviewIn(int i7, float f2, float f7, Callback callback) {
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        return new HashMap();
    }

    public int getRootViewNum() {
        return 0;
    }

    public UIViewOperationQueue getUIViewOperationQueue() {
        return null;
    }

    public void handleCreateView(ReactShadowNode reactShadowNode, int i7, ReactStylesDiffMap reactStylesDiffMap) {
    }

    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
    }

    public void manageChildren(int i7, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
    }

    public void measure(int i7, Callback callback) {
    }

    public void measureInWindow(int i7, Callback callback) {
    }

    public void measureLayout(int i7, int i10, Callback callback, Callback callback2) {
    }

    public void measureLayoutRelativeToParent(int i7, Callback callback, Callback callback2) {
    }

    public void onCatalystInstanceDestroyed() {
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public void prependUIBlock(UIBlock uIBlock) {
    }

    public void profileNextBatch() {
    }

    public <T extends View> void registerRootView(T t5, int i7, ThemedReactContext themedReactContext) {
    }

    public void removeLayoutUpdateListener() {
    }

    public void removeRootShadowNode(int i7) {
    }

    public void removeRootView(int i7) {
    }

    public final void removeShadowNode(ReactShadowNode reactShadowNode) {
    }

    public void replaceExistingNonRootView(int i7, int i10) {
    }

    public int resolveRootTagFromReactTag(int i7) {
        return 0;
    }

    @Deprecated
    public final ReactShadowNode resolveShadowNode(int i7) {
        return null;
    }

    @Deprecated
    public final ViewManager resolveViewManager(String str) {
        return null;
    }

    public void sendAccessibilityEvent(int i7, int i10) {
    }

    public void setChildren(int i7, ReadableArray readableArray) {
    }

    public void setJSResponder(int i7, boolean z5) {
    }

    public void setLayoutAnimationEnabledExperimental(boolean z5) {
    }

    public void setLayoutUpdateListener(LayoutUpdateListener layoutUpdateListener) {
    }

    public void setViewLocalData(int i7, Object obj) {
    }

    public void synchronouslyUpdateViewOnUIThread(int i7, ReactStylesDiffMap reactStylesDiffMap) {
    }

    public void updateInsetsPadding(int i7, int i10, int i11, int i12, int i13) {
    }

    public void updateNodeSize(int i7, int i10, int i11) {
    }

    public void updateRootView(int i7, int i10, int i11) {
    }

    public void updateView(int i7, String str, ReadableMap readableMap) {
    }

    public void updateViewHierarchy() {
    }

    @Deprecated
    public void viewIsDescendantOf(int i7, int i10, Callback callback) {
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, UIViewOperationQueue uIViewOperationQueue, EventDispatcher eventDispatcher) {
    }

    public void dispatchViewManagerCommand(int i7, String str, ReadableArray readableArray) {
    }

    public void updateRootView(ReactShadowNode reactShadowNode, int i7, int i10) {
    }
}
