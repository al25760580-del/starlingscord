package hc;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener$EventTime f10430e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f10431i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10432v;

    public /* synthetic */ h(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5, int i7, int i10) {
        this.f10429d = i10;
        this.f10430e = analyticsListener$EventTime;
        this.f10431i = z5;
        this.f10432v = i7;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f10429d) {
            case 0:
                ((b) obj).onPlayerStateChanged(this.f10430e, this.f10431i, this.f10432v);
                break;
            default:
                ((b) obj).onPlayWhenReadyChanged(this.f10430e, this.f10431i, this.f10432v);
                break;
        }
    }
}
