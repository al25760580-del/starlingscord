package hc;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener$EventTime f10453e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10454i;

    public /* synthetic */ o(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, int i10) {
        this.f10452d = i10;
        this.f10453e = analyticsListener$EventTime;
        this.f10454i = i7;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f10452d) {
            case 0:
                ((b) obj).onPlaybackStateChanged(this.f10453e, this.f10454i);
                break;
            case 1:
                ((b) obj).onRepeatModeChanged(this.f10453e, this.f10454i);
                break;
            case 2:
                ((b) obj).onPlaybackSuppressionReasonChanged(this.f10453e, this.f10454i);
                break;
            case 3:
                ((b) obj).onTimelineChanged(this.f10453e, this.f10454i);
                break;
            default:
                b bVar = (b) obj;
                AnalyticsListener$EventTime analyticsListener$EventTime = this.f10453e;
                bVar.onDrmSessionAcquired(analyticsListener$EventTime);
                bVar.onDrmSessionAcquired(analyticsListener$EventTime, this.f10454i);
                break;
        }
    }
}
