package e5;

import com.google.android.exoplayer2.SimpleExoPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f8053e;

    public /* synthetic */ h(i iVar, int i7) {
        this.f8052d = i7;
        this.f8053e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8052d) {
            case 0:
                i iVar = this.f8053e;
                SimpleExoPlayer simpleExoPlayer = iVar.F;
                if (simpleExoPlayer != null && simpleExoPlayer.g()) {
                    iVar.s(false);
                }
                iVar.setKeepScreenOn(false);
                break;
            case 1:
                i iVar2 = this.f8053e;
                SimpleExoPlayer simpleExoPlayer2 = iVar2.F;
                if (simpleExoPlayer2 != null) {
                    simpleExoPlayer2.f0(iVar2.R * 0.8f);
                }
                break;
            default:
                i iVar3 = this.f8053e;
                SimpleExoPlayer simpleExoPlayer3 = iVar3.F;
                if (simpleExoPlayer3 != null) {
                    simpleExoPlayer3.f0(iVar3.R * 1.0f);
                }
                break;
        }
    }
}
