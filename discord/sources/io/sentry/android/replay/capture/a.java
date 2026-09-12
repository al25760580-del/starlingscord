package io.sentry.android.replay.capture;

import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.protocol.v;
import java.util.Date;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f12474e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Date f12475i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v f12476v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ScreenshotRecorderConfig f12477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f12478x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ BaseCaptureStrategy f12479y;

    public /* synthetic */ a(BaseCaptureStrategy baseCaptureStrategy, long j, Date date, v vVar, ScreenshotRecorderConfig screenshotRecorderConfig, Function1 function1, int i7) {
        this.f12473d = i7;
        this.f12479y = baseCaptureStrategy;
        this.f12474e = j;
        this.f12475i = date;
        this.f12476v = vVar;
        this.f12477w = screenshotRecorderConfig;
        this.f12478x = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12473d) {
            case 0:
                BufferCaptureStrategy.createCurrentSegment$lambda$5((BufferCaptureStrategy) this.f12479y, this.f12474e, this.f12475i, this.f12476v, this.f12477w, this.f12478x);
                break;
            default:
                SessionCaptureStrategy.createCurrentSegment$lambda$4((SessionCaptureStrategy) this.f12479y, this.f12474e, this.f12475i, this.f12476v, this.f12477w, this.f12478x);
                break;
        }
    }
}
