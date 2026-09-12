package org.webrtc;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RenderSynchronizer f17700d;

    public /* synthetic */ p(RenderSynchronizer renderSynchronizer) {
        this.f17700d = renderSynchronizer;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f17700d.onDisplayRefreshCycleBegin(j);
    }
}
