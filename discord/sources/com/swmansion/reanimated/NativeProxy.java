package com.swmansion.reanimated;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIManagerHelper;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder;
import com.swmansion.reanimated.nativeProxy.NativeProxyCommon;
import com.swmansion.worklets.WorkletsModule;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class NativeProxy extends NativeProxyCommon {
    private final FabricUIManager mFabricUIManager;

    @xa.a
    private final HybridData mHybridData;
    private final AtomicBoolean mInvalidated;

    public NativeProxy(ReactApplicationContext reactApplicationContext, WorkletsModule workletsModule) {
        super(reactApplicationContext);
        this.mInvalidated = new AtomicBoolean(false);
        ReactFeatureFlagsWrapper.enableMountHooks();
        FabricUIManager fabricUIManager = (FabricUIManager) UIManagerHelper.getUIManager(reactApplicationContext, 2);
        this.mFabricUIManager = fabricUIManager;
        LayoutAnimations layoutAnimations = new LayoutAnimations(reactApplicationContext);
        CallInvokerHolderImpl callInvokerHolderImplO = com.facebook.imagepipeline.nativecode.b.o(reactApplicationContext);
        JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        this.mHybridData = initHybrid(workletsModule, javaScriptContextHolder.getContext(), callInvokerHolderImplO, layoutAnimations, reactApplicationContext.isBridgeless(), fabricUIManager);
        prepareLayoutAnimations(layoutAnimations);
        installJSIBindings();
    }

    public static NativeMethodsHolder createNativeMethodsHolder(LayoutAnimations layoutAnimations) {
        return new NativeMethodsHolder() { // from class: com.swmansion.reanimated.NativeProxy.1
            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void cancelAnimation(int i7) {
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void checkDuplicateSharedTag(int i7, int i10) {
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void clearAnimationConfig(int i7) {
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public int findPrecedingViewTagForTransition(int i7) {
                return -1;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public int[] getSharedGroup(int i7) {
                return new int[0];
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean hasAnimation(int i7, int i10) {
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean isLayoutAnimationEnabled() {
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean shouldAnimateExiting(int i7, boolean z5) {
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void startAnimation(int i7, int i10, HashMap<String, Object> map) {
            }
        };
    }

    private native HybridData initHybrid(WorkletsModule workletsModule, long j, CallInvokerHolderImpl callInvokerHolderImpl, LayoutAnimations layoutAnimations, boolean z5, FabricUIManager fabricUIManager);

    private native void invalidateCpp();

    @Override // com.swmansion.reanimated.nativeProxy.NativeProxyCommon
    public HybridData getHybridData() {
        return this.mHybridData;
    }

    public void invalidate() {
        HybridData hybridData;
        if (this.mInvalidated.getAndSet(true) || (hybridData = this.mHybridData) == null || !hybridData.isValid()) {
            return;
        }
        invalidateCpp();
    }

    public native boolean isAnyHandlerWaitingForEvent(String str, int i7);

    public native void performOperations(boolean z5, boolean z6);

    @xa.a
    public boolean preserveMountedTags(int[] iArr) {
        for (int i7 = 0; i7 < iArr.length; i7++) {
            try {
                if (this.mFabricUIManager.resolveView(iArr[i7]) == null) {
                    iArr[i7] = -1;
                }
            } catch (IllegalViewOperationException unused) {
                iArr[i7] = -1;
            }
        }
        return true;
    }
}
