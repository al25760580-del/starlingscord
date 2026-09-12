package hc;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10458d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener$EventTime f10459e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f10460i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10461v;

    public /* synthetic */ q(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, long j) {
        this.f10459e = analyticsListener$EventTime;
        this.f10461v = i7;
        this.f10460i = j;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f10458d) {
            case 0:
                ((b) obj).onDroppedVideoFrames(this.f10459e, this.f10461v, this.f10460i);
                break;
            default:
                ((b) obj).onVideoFrameProcessingOffset(this.f10459e, this.f10460i, this.f10461v);
                break;
        }
    }

    public /* synthetic */ q(AnalyticsListener$EventTime analyticsListener$EventTime, long j, int i7) {
        this.f10459e = analyticsListener$EventTime;
        this.f10460i = j;
        this.f10461v = i7;
    }
}
