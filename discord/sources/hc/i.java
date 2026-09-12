package hc;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener$EventTime f10434e;

    public /* synthetic */ i(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
        this.f10433d = i7;
        this.f10434e = analyticsListener$EventTime;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f10433d) {
            case 0:
                ((b) obj).onSeekStarted(this.f10434e);
                break;
            case 1:
                ((b) obj).onDrmSessionReleased(this.f10434e);
                break;
            case 2:
                ((b) obj).onPlayerReleased(this.f10434e);
                break;
            case 3:
                ((b) obj).onDrmKeysLoaded(this.f10434e);
                break;
            default:
                ((b) obj).onDrmKeysRestored(this.f10434e);
                break;
        }
    }
}
