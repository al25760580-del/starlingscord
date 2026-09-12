package com.swmansion.worklets;

import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
public class WorkletsMessageQueueThread extends WorkletsMessageQueueThreadBase {
    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final boolean isIdle() {
        return this.f7270a.isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public final boolean runOnQueue(Runnable runnable) {
        return this.f7270a.runOnQueue(runnable);
    }
}
