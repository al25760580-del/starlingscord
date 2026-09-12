package hc;

import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener$EventTime f10447e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PlaybackException f10448i;

    public /* synthetic */ m(AnalyticsListener$EventTime analyticsListener$EventTime, PlaybackException playbackException, int i7) {
        this.f10446d = i7;
        this.f10447e = analyticsListener$EventTime;
        this.f10448i = playbackException;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f10446d) {
            case 0:
                ((b) obj).onPlayerError(this.f10447e, this.f10448i);
                break;
            default:
                ((b) obj).onPlayerErrorChanged(this.f10447e, this.f10448i);
                break;
        }
    }
}
