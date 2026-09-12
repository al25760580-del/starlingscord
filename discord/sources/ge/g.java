package ge;

import android.view.View;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.PlayerControlView;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements com.google.android.exoplayer2.e, q, View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f9981d;

    public g(PlayerControlView playerControlView) {
        this.f9981d = playerControlView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlayerControlView playerControlView = this.f9981d;
        Player player = playerControlView.f5790g0;
        if (player == null) {
            return;
        }
        if (playerControlView.f5805v == view) {
            player.N();
            return;
        }
        if (playerControlView.f5791i == view) {
            player.q();
            return;
        }
        if (playerControlView.f5811y == view) {
            if (player.w() != 4) {
                player.O();
                return;
            }
            return;
        }
        if (playerControlView.E == view) {
            player.Q();
            return;
        }
        if (playerControlView.f5807w == view) {
            e0.C(player);
            return;
        }
        if (playerControlView.f5809x == view) {
            int i7 = e0.f13788a;
            if (player.E(1)) {
                player.pause();
                return;
            }
            return;
        }
        if (playerControlView.F != view) {
            if (playerControlView.G == view) {
                player.h(!player.L());
                return;
            }
            return;
        }
        int I = player.I();
        int i10 = playerControlView.f5797n0;
        for (int i11 = 1; i11 <= 2; i11++) {
            int i12 = (I + i11) % 3;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2 || (i10 & 2) == 0) {
                    }
                } else if ((i10 & 1) == 0) {
                }
            }
            I = i12;
        }
        player.F(I);
    }

    @Override // com.google.android.exoplayer2.e
    public final void onEvents(Player player, Player.Events events) {
        je.g gVar = events.f5578a;
        boolean zA = events.a(4, 5);
        PlayerControlView playerControlView = this.f9981d;
        if (zA) {
            int i7 = PlayerControlView.A0;
            playerControlView.h();
        }
        if (events.a(4, 5, 7)) {
            int i10 = PlayerControlView.A0;
            playerControlView.i();
        }
        if (gVar.f13801a.get(8)) {
            int i11 = PlayerControlView.A0;
            playerControlView.j();
        }
        if (gVar.f13801a.get(9)) {
            int i12 = PlayerControlView.A0;
            playerControlView.k();
        }
        if (events.a(8, 9, 11, 0, 13)) {
            int i13 = PlayerControlView.A0;
            playerControlView.g();
        }
        if (events.a(11, 0)) {
            int i14 = PlayerControlView.A0;
            playerControlView.l();
        }
    }
}
