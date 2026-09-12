package e5;

import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.video.VideoSize;
import fe.p;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.google.android.exoplayer2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f8041d;

    public c(d dVar) {
        this.f8041d = dVar;
    }

    @Override // com.google.android.exoplayer2.e
    public final void onCues(CueGroup cueGroup) {
        this.f8041d.f8044i.setCues(cueGroup.f5726d);
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPositionDiscontinuity(int i7) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onRenderedFirstFrame() {
        this.f8041d.f8043e.setVisibility(4);
    }

    @Override // com.google.android.exoplayer2.e
    public final void onTracksChanged(Tracks tracks) {
        d dVar = this.f8041d;
        SimpleExoPlayer simpleExoPlayer = dVar.f8047x;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.c0();
        com.google.android.exoplayer2.c cVar = simpleExoPlayer.f5586b;
        cVar.x0();
        p[] pVarArr = cVar.f5650g0.f9722i.f9147c;
        int length = pVarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            SimpleExoPlayer simpleExoPlayer2 = dVar.f8047x;
            simpleExoPlayer2.c0();
            com.google.android.exoplayer2.c cVar2 = simpleExoPlayer2.f5586b;
            cVar2.x0();
            if (cVar2.f5649g[i7].f9602e == 2 && pVarArr[i7] != null) {
                return;
            }
        }
        dVar.f8043e.setVisibility(0);
    }

    @Override // com.google.android.exoplayer2.e
    public final void onVideoSizeChanged(VideoSize videoSize) {
        d dVar = this.f8041d;
        a aVar = dVar.f8045v;
        int i7 = videoSize.f5849d;
        int i10 = videoSize.f5850e;
        if (i7 == 0 && i10 == 0) {
            return;
        }
        boolean z5 = aVar.getAspectRatio() == 0.0f;
        aVar.setAspectRatio(i10 == 0 ? 1.0f : (videoSize.f5849d * videoSize.f5852v) / i10);
        if (z5) {
            dVar.post(dVar.G);
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void onCues(List list) {
        this.f8041d.f8044i.setCues(list);
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i7) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onLoadingChanged(boolean z5) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlayerError(PlaybackException playbackException) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onRepeatModeChanged(int i7) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onShuffleModeEnabledChanged(boolean z5) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlayerStateChanged(boolean z5, int i7) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onTimelineChanged(Timeline timeline, int i7) {
    }
}
