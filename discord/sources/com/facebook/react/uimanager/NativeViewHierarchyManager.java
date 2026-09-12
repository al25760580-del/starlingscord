package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.yoga.YogaDirection;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
public class NativeViewHierarchyManager {
    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("NativeViewHierarchyManager", LegacyArchitectureLogLevel.ERROR);
    }

    @Deprecated
    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry) {
    }

    @Deprecated
    public synchronized void addRootView(int i7, View view) {
    }

    @Deprecated
    public final synchronized void addRootViewGroup(int i7, View view) {
    }

    @Deprecated
    public synchronized void clearJSResponder() {
    }

    @Deprecated
    public synchronized void createView(ThemedReactContext themedReactContext, int i7, String str, ReactStylesDiffMap reactStylesDiffMap) {
    }

    @Deprecated
    public synchronized void dispatchCommand(int i7, int i10, ReadableArray readableArray) {
    }

    @Deprecated
    public synchronized void dropView(View view) {
    }

    @Deprecated
    public synchronized int findTargetTagForTouch(int i7, float f2, float f7) {
        return 0;
    }

    @Deprecated
    public synchronized long getInstanceHandle(int i7) {
        return 0L;
    }

    @Deprecated
    public synchronized int getRootViewNum() {
        return 0;
    }

    @Deprecated
    public synchronized void manageChildren(int i7, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
    }

    @Deprecated
    public synchronized void measure(int i7, int[] iArr) {
    }

    @Deprecated
    public synchronized void measureInWindow(int i7, int[] iArr) {
    }

    @Deprecated
    public synchronized void removeRootView(int i7) {
    }

    @Deprecated
    public final synchronized View resolveView(int i7) {
        return null;
    }

    @Deprecated
    public final synchronized ViewManager resolveViewManager(int i7) {
        return null;
    }

    @Deprecated
    public synchronized void sendAccessibilityEvent(int i7, int i10) {
    }

    @Deprecated
    public synchronized void setChildren(int i7, ReadableArray readableArray) {
    }

    @Deprecated
    public synchronized void setJSResponder(int i7, int i10, boolean z5) {
    }

    @Deprecated
    public void setLayoutAnimationEnabled(boolean z5) {
    }

    @Deprecated
    public synchronized void updateInstanceHandle(int i7, long j) {
    }

    @Deprecated
    public void updateLayout(int i7, int i10, int i11, int i12, int i13) {
    }

    @Deprecated
    public synchronized void updateProperties(int i7, ReactStylesDiffMap reactStylesDiffMap) {
    }

    @Deprecated
    public synchronized void updateViewExtraData(int i7, Object obj) {
    }

    @Deprecated
    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager) {
    }

    @Deprecated
    public synchronized void dispatchCommand(int i7, String str, ReadableArray readableArray) {
    }

    @Deprecated
    public synchronized void updateLayout(int i7, int i10, int i11, int i12, int i13, int i14, YogaDirection yogaDirection) {
    }
}
