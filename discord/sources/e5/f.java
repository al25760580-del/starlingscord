package e5;

import android.view.View;
import com.google.android.exoplayer2.SimpleExoPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f8050e;

    public /* synthetic */ f(i iVar, int i7) {
        this.f8049d = i7;
        this.f8050e = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8049d) {
            case 0:
                i iVar = this.f8050e;
                if (iVar.F != null) {
                    iVar.j(iVar.f8077v);
                    if (!iVar.f8077v.d()) {
                        iVar.f8077v.e();
                    } else {
                        iVar.f8077v.b();
                    }
                    break;
                }
                break;
            case 1:
                i iVar2 = this.f8050e;
                SimpleExoPlayer simpleExoPlayer = iVar2.F;
                if (simpleExoPlayer != null && simpleExoPlayer.w() == 4) {
                    iVar2.F.b0(5, 0L);
                }
                iVar2.q(false);
                break;
            default:
                this.f8050e.q(true);
                break;
        }
    }
}
