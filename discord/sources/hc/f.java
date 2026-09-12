package hc;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener$EventTime f10421e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10422i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f10423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f10424w;

    public /* synthetic */ f(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, long j, long j5, int i10) {
        this.f10420d = i10;
        this.f10421e = analyticsListener$EventTime;
        this.f10422i = i7;
        this.f10423v = j;
        this.f10424w = j5;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f10420d) {
            case 0:
                ((b) obj).onAudioUnderrun(this.f10421e, this.f10422i, this.f10423v, this.f10424w);
                break;
            default:
                ((b) obj).onBandwidthEstimate(this.f10421e, this.f10422i, this.f10423v, this.f10424w);
                break;
        }
    }
}
