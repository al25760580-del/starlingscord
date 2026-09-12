package hc;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener$EventTime f10450e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f10451i;

    public /* synthetic */ n(AnalyticsListener$EventTime analyticsListener$EventTime, DecoderCounters decoderCounters, int i7) {
        this.f10449d = i7;
        this.f10450e = analyticsListener$EventTime;
        this.f10451i = decoderCounters;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f10449d) {
            case 0:
                ((b) obj).onVideoEnabled(this.f10450e, this.f10451i);
                break;
            case 1:
                ((b) obj).onAudioDisabled(this.f10450e, this.f10451i);
                break;
            case 2:
                ((b) obj).onVideoDisabled(this.f10450e, this.f10451i);
                break;
            default:
                ((b) obj).onAudioEnabled(this.f10450e, this.f10451i);
                break;
        }
    }
}
