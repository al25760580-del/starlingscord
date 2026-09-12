package ge;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.exoplayer2.video.VideoSize;
import gc.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements com.google.android.exoplayer2.e, View.OnLayoutChangeListener, View.OnClickListener, i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u1 f9982d = new u1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9983e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PlayerView f9984i;

    public j(PlayerView playerView) {
        this.f9984i = playerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = PlayerView.W;
        this.f9984i.f();
    }

    @Override // com.google.android.exoplayer2.e
    public final void onCues(CueGroup cueGroup) {
        SubtitleView subtitleView = this.f9984i.f5820y;
        if (subtitleView != null) {
            subtitleView.setCues(cueGroup.f5726d);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        PlayerView.a((TextureView) view, this.f9984i.V);
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlayWhenReadyChanged(boolean z5, int i7) {
        int i10 = PlayerView.W;
        PlayerView playerView = this.f9984i;
        playerView.h();
        if (!playerView.b() || !playerView.T) {
            playerView.c(false);
            return;
        }
        PlayerControlView playerControlView = playerView.G;
        if (playerControlView != null) {
            playerControlView.b();
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlaybackStateChanged(int i7) {
        int i10 = PlayerView.W;
        PlayerView playerView = this.f9984i;
        playerView.h();
        playerView.j();
        if (!playerView.b() || !playerView.T) {
            playerView.c(false);
            return;
        }
        PlayerControlView playerControlView = playerView.G;
        if (playerControlView != null) {
            playerControlView.b();
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i7) {
        PlayerControlView playerControlView;
        int i10 = PlayerView.W;
        PlayerView playerView = this.f9984i;
        if (playerView.b() && playerView.T && (playerControlView = playerView.G) != null) {
            playerControlView.b();
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void onRenderedFirstFrame() {
        View view = this.f9984i.f5816i;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void onTracksChanged(Tracks tracks) {
        PlayerView playerView = this.f9984i;
        Player player = playerView.J;
        player.getClass();
        Timeline timelineJ = player.J();
        if (timelineJ.p()) {
            this.f9983e = null;
        } else {
            boolean zIsEmpty = player.x().f5590d.isEmpty();
            u1 u1Var = this.f9982d;
            if (zIsEmpty) {
                Object obj = this.f9983e;
                if (obj != null) {
                    int iB = timelineJ.b(obj);
                    if (iB != -1) {
                        if (player.D() == timelineJ.f(iB, u1Var, false).f9888i) {
                            return;
                        }
                    }
                    this.f9983e = null;
                }
            } else {
                this.f9983e = timelineJ.f(player.j(), u1Var, true).f9887e;
            }
        }
        playerView.k(false);
    }

    @Override // com.google.android.exoplayer2.e
    public final void onVideoSizeChanged(VideoSize videoSize) {
        int i7 = PlayerView.W;
        this.f9984i.g();
    }
}
