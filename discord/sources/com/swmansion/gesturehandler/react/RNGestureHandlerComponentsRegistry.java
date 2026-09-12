package com.swmansion.gesturehandler.react;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.soloader.SoLoader;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
public class RNGestureHandlerComponentsRegistry {

    @a
    private final HybridData mHybridData;

    static {
        SoLoader.m("fabricjni");
        SoLoader.m("gesturehandler");
    }

    @a
    private RNGestureHandlerComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    @a
    private native HybridData initHybrid(ComponentFactory componentFactory);

    @a
    public static RNGestureHandlerComponentsRegistry register(ComponentFactory componentFactory) {
        return new RNGestureHandlerComponentsRegistry(componentFactory);
    }
}
