package com.appsflyer;

import com.discord.jank_stats.JankSessionRecorder;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f3834e;

    public /* synthetic */ a(Function1 function1, int i7) {
        this.f3833d = i7;
        this.f3834e = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3833d) {
            case 0:
                AFLogger.getMediationNetwork(this.f3834e);
                break;
            default:
                JankSessionRecorder.pendingRecords$lambda$8(this.f3834e);
                break;
        }
    }
}
