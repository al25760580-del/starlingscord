package com.discord.media.engine.video.egl_renderer;

import cc.e;
import com.discord.tti_manager.TTIModule;
import com.facebook.react.bridge.Promise;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import e4.l;
import gc.w;
import hc.u;
import je.e0;
import jm.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4465e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4466i;

    public /* synthetic */ b(long j, Promise promise) {
        this.f4464d = 1;
        this.f4465e = j;
        this.f4466i = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f4464d;
        long j = this.f4465e;
        Object obj = this.f4466i;
        switch (i7) {
            case 0:
                EglRenderer.init$lambda$10$lambda$9((EglRenderer) obj, j);
                break;
            case 1:
                TTIModule.yieldConfig$lambda$0(j, (Promise) obj);
                break;
            case 2:
                w wVar = (w) ((l) obj).f7990i;
                int i10 = e0.f13788a;
                u uVar = (u) wVar.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeH = uVar.h();
                uVar.i(analyticsListener$EventTimeH, 1010, new e(analyticsListener$EventTimeH, j));
                break;
            default:
                c.j((c) obj, j);
                break;
        }
    }

    public /* synthetic */ b(Object obj, long j, int i7) {
        this.f4464d = i7;
        this.f4466i = obj;
        this.f4465e = j;
    }
}
