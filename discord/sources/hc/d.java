package hc;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements je.j, ig.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10414e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f10415i;

    public /* synthetic */ d(Object obj, boolean z5, int i7) {
        this.f10413d = i7;
        this.f10414e = obj;
        this.f10415i = z5;
    }

    @Override // je.j
    public void invoke(Object obj) {
        switch (this.f10413d) {
            case 0:
                ((b) obj).onShuffleModeChanged((AnalyticsListener$EventTime) this.f10414e, this.f10415i);
                break;
            case 1:
                ((b) obj).onSkipSilenceEnabledChanged((AnalyticsListener$EventTime) this.f10414e, this.f10415i);
                break;
            case 2:
                AnalyticsListener$EventTime analyticsListener$EventTime = (AnalyticsListener$EventTime) this.f10414e;
                b bVar = (b) obj;
                boolean z5 = this.f10415i;
                bVar.onLoadingChanged(analyticsListener$EventTime, z5);
                bVar.onIsLoadingChanged(analyticsListener$EventTime, z5);
                break;
            default:
                ((b) obj).onIsPlayingChanged((AnalyticsListener$EventTime) this.f10414e, this.f10415i);
                break;
        }
    }

    @Override // ig.d
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = yk.a.r((Context) this.f10414e).edit();
        editorEdit.putBoolean("proxy_retention", this.f10415i);
        editorEdit.apply();
    }
}
