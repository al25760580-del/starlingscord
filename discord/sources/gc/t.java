package gc;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f9852e;

    public /* synthetic */ t(boolean z5, int i7) {
        this.f9851d = i7;
        this.f9852e = z5;
    }

    @Override // je.j
    public final void invoke(Object obj) {
        switch (this.f9851d) {
            case 0:
                ((com.google.android.exoplayer2.e) obj).onShuffleModeEnabledChanged(this.f9852e);
                break;
            default:
                ((com.google.android.exoplayer2.e) obj).onSkipSilenceEnabledChanged(this.f9852e);
                break;
        }
    }
}
