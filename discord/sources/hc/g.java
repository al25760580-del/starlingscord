package hc;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener$EventTime f10426e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f10427i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f10428v;

    public /* synthetic */ g(AnalyticsListener$EventTime analyticsListener$EventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i7) {
        this.f10425d = i7;
        this.f10426e = analyticsListener$EventTime;
        this.f10427i = loadEventInfo;
        this.f10428v = mediaLoadData;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f10425d) {
            case 0:
                ((b) obj).onLoadCompleted(this.f10426e, this.f10427i, this.f10428v);
                break;
            case 1:
                ((b) obj).onLoadStarted(this.f10426e, this.f10427i, this.f10428v);
                break;
            default:
                ((b) obj).onLoadCanceled(this.f10426e, this.f10427i, this.f10428v);
                break;
        }
    }
}
