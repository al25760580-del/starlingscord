package com.swmansion.reanimated.layoutReanimation;

import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.ViewManagerRegistry;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReanimatedNativeHierarchyManagerBase extends NativeViewHierarchyManager {
    public ReanimatedNativeHierarchyManagerBase(ViewManagerRegistry viewManagerRegistry) {
        super(viewManagerRegistry);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000f */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void updateLayout(int r2, int r3, int r4, int r5, int r6, int r7, com.facebook.yoga.YogaDirection r8) throws java.lang.Throwable {
        /*
            r1 = this;
            monitor-enter(r1)
            super.updateLayout(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La
            r1.updateLayoutCommon(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La
            r2 = r1
            monitor-exit(r1)
            return
        La:
            r0 = move-exception
            r2 = r1
        Lc:
            r3 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r3
        Lf:
            r0 = move-exception
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManagerBase.updateLayout(int, int, int, int, int, int, com.facebook.yoga.YogaDirection):void");
    }

    public abstract void updateLayoutCommon(int i7, int i10, int i11, int i12, int i13, int i14);
}
