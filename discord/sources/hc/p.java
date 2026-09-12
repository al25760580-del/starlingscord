package hc;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener$EventTime f10456e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f10457i;

    public /* synthetic */ p(AnalyticsListener$EventTime analyticsListener$EventTime, String str, int i7) {
        this.f10455d = i7;
        this.f10456e = analyticsListener$EventTime;
        this.f10457i = str;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f10455d) {
            case 0:
                ((b) obj).onAudioDecoderReleased(this.f10456e, this.f10457i);
                break;
            default:
                ((b) obj).onVideoDecoderReleased(this.f10456e, this.f10457i);
                break;
        }
    }
}
