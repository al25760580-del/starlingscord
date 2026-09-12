package hc;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener$EventTime f10463e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Exception f10464i;

    public /* synthetic */ r(AnalyticsListener$EventTime analyticsListener$EventTime, Exception exc, int i7) {
        this.f10462d = i7;
        this.f10463e = analyticsListener$EventTime;
        this.f10464i = exc;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f10462d) {
            case 0:
                ((b) obj).onAudioSinkError(this.f10463e, this.f10464i);
                break;
            case 1:
                ((b) obj).onDrmSessionManagerError(this.f10463e, this.f10464i);
                break;
            case 2:
                ((b) obj).onVideoCodecError(this.f10463e, this.f10464i);
                break;
            default:
                ((b) obj).onAudioCodecError(this.f10463e, this.f10464i);
                break;
        }
    }
}
