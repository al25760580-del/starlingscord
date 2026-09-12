package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.swmansion.reanimated.NodesManager;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
public class AnimationFrameCallback implements NodesManager.OnAnimationFrame {

    @xa.a
    private final HybridData mHybridData;

    @xa.a
    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.swmansion.reanimated.NodesManager.OnAnimationFrame
    public native void onAnimationFrame(double d6);
}
