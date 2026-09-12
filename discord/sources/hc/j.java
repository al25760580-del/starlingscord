package hc;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.source.MediaLoadData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener$EventTime f10436e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f10437i;

    public /* synthetic */ j(AnalyticsListener$EventTime analyticsListener$EventTime, MediaLoadData mediaLoadData, int i7) {
        this.f10435d = i7;
        this.f10436e = analyticsListener$EventTime;
        this.f10437i = mediaLoadData;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f10435d) {
            case 0:
                ((b) obj).onDownstreamFormatChanged(this.f10436e, this.f10437i);
                break;
            default:
                ((b) obj).onUpstreamDiscarded(this.f10436e, this.f10437i);
                break;
        }
    }
}
