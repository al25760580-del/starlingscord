package ic;

import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11586e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f11587i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f11588v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f11589w;

    public /* synthetic */ o(Object obj, String str, long j, long j5, int i7) {
        this.f11585d = i7;
        this.f11589w = obj;
        this.f11586e = str;
        this.f11587i = j;
        this.f11588v = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f11585d;
        Object obj = this.f11589w;
        switch (i7) {
            case 0:
                gc.w wVar = (gc.w) ((e4.l) obj).f7990i;
                int i10 = je.e0.f13788a;
                hc.u uVar = (hc.u) wVar.f9916d.f5659q;
                final AnalyticsListener$EventTime analyticsListener$EventTimeH = uVar.h();
                final int i11 = 0;
                final String str = this.f11586e;
                final long j = this.f11588v;
                final long j5 = this.f11587i;
                uVar.i(analyticsListener$EventTimeH, 1008, new je.j() { // from class: hc.c
                    @Override // je.j
                    public final void invoke(Object obj2) {
                        switch (i11) {
                            case 0:
                                b bVar = (b) obj2;
                                AnalyticsListener$EventTime analyticsListener$EventTime = analyticsListener$EventTimeH;
                                String str2 = str;
                                long j7 = j;
                                bVar.onAudioDecoderInitialized(analyticsListener$EventTime, str2, j7);
                                bVar.onAudioDecoderInitialized(analyticsListener$EventTime, str2, j5, j7);
                                break;
                            default:
                                b bVar2 = (b) obj2;
                                AnalyticsListener$EventTime analyticsListener$EventTime2 = analyticsListener$EventTimeH;
                                String str3 = str;
                                long j10 = j;
                                bVar2.onVideoDecoderInitialized(analyticsListener$EventTime2, str3, j10);
                                bVar2.onVideoDecoderInitialized(analyticsListener$EventTime2, str3, j5, j10);
                                break;
                        }
                    }
                });
                break;
            default:
                gc.w wVar2 = (gc.w) ((e4.r) obj).f8035i;
                int i12 = je.e0.f13788a;
                hc.u uVar2 = (hc.u) wVar2.f9916d.f5659q;
                final AnalyticsListener$EventTime analyticsListener$EventTimeH2 = uVar2.h();
                final int i13 = 1;
                final String str2 = this.f11586e;
                final long j7 = this.f11588v;
                final long j10 = this.f11587i;
                uVar2.i(analyticsListener$EventTimeH2, 1016, new je.j() { // from class: hc.c
                    @Override // je.j
                    public final void invoke(Object obj2) {
                        switch (i13) {
                            case 0:
                                b bVar = (b) obj2;
                                AnalyticsListener$EventTime analyticsListener$EventTime = analyticsListener$EventTimeH2;
                                String str3 = str2;
                                long j11 = j7;
                                bVar.onAudioDecoderInitialized(analyticsListener$EventTime, str3, j11);
                                bVar.onAudioDecoderInitialized(analyticsListener$EventTime, str3, j10, j11);
                                break;
                            default:
                                b bVar2 = (b) obj2;
                                AnalyticsListener$EventTime analyticsListener$EventTime2 = analyticsListener$EventTimeH2;
                                String str4 = str2;
                                long j12 = j7;
                                bVar2.onVideoDecoderInitialized(analyticsListener$EventTime2, str4, j12);
                                bVar2.onVideoDecoderInitialized(analyticsListener$EventTime2, str4, j10, j12);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
