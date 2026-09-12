package hc;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.video.VideoSize;
import com.reactnativecommunity.webview.RNCWebViewManager;
import ei.r0;
import ei.w0;
import gc.u1;
import gc.v1;
import java.io.IOException;
import java.util.List;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements a {
    public je.a0 E;
    public boolean F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final je.y f10471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u1 f10472e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v1 f10473i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final af.c f10474v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SparseArray f10475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public je.m f10476x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Player f10477y;

    public u(je.y yVar) {
        yVar.getClass();
        this.f10471d = yVar;
        int i7 = e0.f13788a;
        Looper looperMyLooper = Looper.myLooper();
        this.f10476x = new je.m(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, yVar, new gb.a(26));
        u1 u1Var = new u1();
        this.f10472e = u1Var;
        this.f10473i = new v1();
        af.c cVar = new af.c();
        cVar.f393d = u1Var;
        ei.c0 c0Var = ei.e0.f8303e;
        cVar.f394e = r0.f8352w;
        cVar.f395i = w0.f8376y;
        this.f10474v = cVar;
        this.f10475w = new SparseArray();
    }

    @Override // he.f
    public final void a(int i7, long j, long j5) {
        af.c cVar = this.f10474v;
        AnalyticsListener$EventTime analyticsListener$EventTimeF = f(((ei.e0) cVar.f394e).isEmpty() ? null : (md.s) ei.p.i((ei.e0) cVar.f394e));
        i(analyticsListener$EventTimeF, 1006, new f(analyticsListener$EventTimeF, i7, j, j5, 1));
    }

    @Override // mc.o
    public final void b(int i7, md.s sVar) {
        AnalyticsListener$EventTime analyticsListener$EventTimeG = g(i7, sVar);
        i(analyticsListener$EventTimeG, 1023, new i(analyticsListener$EventTimeG, 3));
    }

    public final AnalyticsListener$EventTime c() {
        return f((md.s) this.f10474v.f396v);
    }

    @Override // md.w
    public final void d(int i7, md.s sVar, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z5) {
        final AnalyticsListener$EventTime analyticsListener$EventTimeG = g(i7, sVar);
        i(analyticsListener$EventTimeG, 1003, new je.j() { // from class: hc.l
            @Override // je.j
            public final void invoke(Object obj) {
                ((b) obj).onLoadError(analyticsListener$EventTimeG, loadEventInfo, mediaLoadData, iOException, z5);
            }
        });
    }

    public final AnalyticsListener$EventTime e(Timeline timeline, int i7, md.s sVar) {
        md.s sVar2 = timeline.p() ? null : sVar;
        this.f10471d.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z5 = timeline.equals(this.f10477y.J()) && i7 == this.f10477y.D();
        long jU = 0;
        if (sVar2 == null || !sVar2.a()) {
            if (z5) {
                jU = this.f10477y.t();
            } else if (!timeline.p()) {
                jU = e0.U(timeline.m(i7, this.f10473i, 0L).J);
            }
        } else if (z5 && this.f10477y.C() == sVar2.f15690b && this.f10477y.o() == sVar2.f15691c) {
            jU = this.f10477y.S();
        }
        return new AnalyticsListener$EventTime(jElapsedRealtime, timeline, i7, sVar2, jU, this.f10477y.J(), this.f10477y.D(), (md.s) this.f10474v.f396v, this.f10477y.S(), this.f10477y.d());
    }

    public final AnalyticsListener$EventTime f(md.s sVar) {
        this.f10477y.getClass();
        Timeline timeline = sVar == null ? null : (Timeline) ((w0) this.f10474v.f395i).get(sVar);
        if (sVar != null && timeline != null) {
            return e(timeline, timeline.g(sVar.f15689a, this.f10472e).f9888i, sVar);
        }
        int iD = this.f10477y.D();
        Timeline timelineJ = this.f10477y.J();
        if (iD >= timelineJ.o()) {
            timelineJ = Timeline.f5588d;
        }
        return e(timelineJ, iD, null);
    }

    public final AnalyticsListener$EventTime g(int i7, md.s sVar) {
        this.f10477y.getClass();
        if (sVar != null) {
            return ((Timeline) ((w0) this.f10474v.f395i).get(sVar)) != null ? f(sVar) : e(Timeline.f5588d, i7, sVar);
        }
        Timeline timelineJ = this.f10477y.J();
        if (i7 >= timelineJ.o()) {
            timelineJ = Timeline.f5588d;
        }
        return e(timelineJ, i7, null);
    }

    public final AnalyticsListener$EventTime h() {
        return f((md.s) this.f10474v.f398x);
    }

    public final void i(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, je.j jVar) {
        this.f10475w.put(i7, analyticsListener$EventTime);
        this.f10476x.e(i7, jVar);
    }

    @Override // md.w
    public final void j(int i7, md.s sVar, MediaLoadData mediaLoadData) {
        AnalyticsListener$EventTime analyticsListener$EventTimeG = g(i7, sVar);
        i(analyticsListener$EventTimeG, 1004, new j(analyticsListener$EventTimeG, mediaLoadData, 0));
    }

    public final void k(com.google.android.exoplayer2.a aVar, Looper looper) {
        je.b.k(this.f10477y == null || ((ei.e0) this.f10474v.f394e).isEmpty());
        aVar.getClass();
        this.f10477y = aVar;
        this.E = this.f10471d.a(looper, null);
        je.m mVar = this.f10476x;
        this.f10476x = new je.m(mVar.f13810d, looper, mVar.f13807a, new bc.i(18, this, aVar), mVar.f13815i);
    }

    @Override // md.w
    public final void m(int i7, md.s sVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener$EventTime analyticsListener$EventTimeG = g(i7, sVar);
        i(analyticsListener$EventTimeG, RNCWebViewManager.COMMAND_CLEAR_HISTORY, new g(analyticsListener$EventTimeG, loadEventInfo, mediaLoadData, 2));
    }

    @Override // md.w
    public final void n(int i7, md.s sVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener$EventTime analyticsListener$EventTimeG = g(i7, sVar);
        i(analyticsListener$EventTimeG, RNCWebViewManager.COMMAND_CLEAR_CACHE, new g(analyticsListener$EventTimeG, loadEventInfo, mediaLoadData, 0));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onAvailableCommandsChanged(Player.Commands commands) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 13, new bc.i(20, analyticsListener$EventTimeC, commands));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onCues(List list) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 27, new bc.i(21, analyticsListener$EventTimeC, list));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onIsLoadingChanged(boolean z5) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 3, new d(analyticsListener$EventTimeC, z5, 2));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onIsPlayingChanged(boolean z5) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 7, new d(analyticsListener$EventTimeC, z5, 3));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onMediaItemTransition(MediaItem mediaItem, int i7) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 1, new bc.f(analyticsListener$EventTimeC, mediaItem, i7, 3));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 14, new bc.i(16, analyticsListener$EventTimeC, mediaMetadata));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 28, new bc.i(23, analyticsListener$EventTimeC, metadata));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlayWhenReadyChanged(boolean z5, int i7) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 5, new h(analyticsListener$EventTimeC, z5, i7, 1));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 12, new bc.i(17, analyticsListener$EventTimeC, playbackParameters));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlaybackStateChanged(int i7) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 4, new o(analyticsListener$EventTimeC, i7, 0));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlaybackSuppressionReasonChanged(int i7) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 6, new o(analyticsListener$EventTimeC, i7, 2));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlayerError(PlaybackException playbackException) {
        md.r rVar;
        AnalyticsListener$EventTime analyticsListener$EventTimeC = (!(playbackException instanceof com.google.android.exoplayer2.b) || (rVar = ((com.google.android.exoplayer2.b) playbackException).E) == null) ? c() : f(new md.s(rVar));
        i(analyticsListener$EventTimeC, 10, new m(analyticsListener$EventTimeC, playbackException, 0));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlayerErrorChanged(PlaybackException playbackException) {
        md.r rVar;
        AnalyticsListener$EventTime analyticsListener$EventTimeC = (!(playbackException instanceof com.google.android.exoplayer2.b) || (rVar = ((com.google.android.exoplayer2.b) playbackException).E) == null) ? c() : f(new md.s(rVar));
        i(analyticsListener$EventTimeC, 10, new m(analyticsListener$EventTimeC, playbackException, 1));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlayerStateChanged(boolean z5, int i7) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, -1, new h(analyticsListener$EventTimeC, z5, i7, 0));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPositionDiscontinuity(int i7) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onRepeatModeChanged(int i7) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 8, new o(analyticsListener$EventTimeC, i7, 1));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onShuffleModeEnabledChanged(boolean z5) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 9, new d(analyticsListener$EventTimeC, z5, 0));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onSkipSilenceEnabledChanged(boolean z5) {
        AnalyticsListener$EventTime analyticsListener$EventTimeH = h();
        i(analyticsListener$EventTimeH, 23, new d(analyticsListener$EventTimeH, z5, 1));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onSurfaceSizeChanged(final int i7, final int i10) {
        final AnalyticsListener$EventTime analyticsListener$EventTimeH = h();
        i(analyticsListener$EventTimeH, 24, new je.j() { // from class: hc.k
            @Override // je.j
            public final void invoke(Object obj) {
                ((b) obj).onSurfaceSizeChanged(analyticsListener$EventTimeH, i7, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.e
    public final void onTimelineChanged(Timeline timeline, int i7) {
        Player player = this.f10477y;
        player.getClass();
        af.c cVar = this.f10474v;
        cVar.f396v = af.c.x(player, (ei.e0) cVar.f394e, (md.s) cVar.f397w, (u1) cVar.f393d);
        cVar.P(player.J());
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 0, new o(analyticsListener$EventTimeC, i7, 3));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onTracksChanged(Tracks tracks) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 2, new bc.i(22, analyticsListener$EventTimeC, tracks));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onVideoSizeChanged(VideoSize videoSize) {
        AnalyticsListener$EventTime analyticsListener$EventTimeH = h();
        i(analyticsListener$EventTimeH, 25, new bc.i(24, analyticsListener$EventTimeH, videoSize));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onVolumeChanged(final float f2) {
        final AnalyticsListener$EventTime analyticsListener$EventTimeH = h();
        i(analyticsListener$EventTimeH, 22, new je.j() { // from class: hc.t
            @Override // je.j
            public final void invoke(Object obj) {
                ((b) obj).onVolumeChanged(analyticsListener$EventTimeH, f2);
            }
        });
    }

    @Override // mc.o
    public final void p(int i7, md.s sVar, Exception exc) {
        AnalyticsListener$EventTime analyticsListener$EventTimeG = g(i7, sVar);
        i(analyticsListener$EventTimeG, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, new r(analyticsListener$EventTimeG, exc, 1));
    }

    @Override // mc.o
    public final void r(int i7, md.s sVar, int i10) {
        AnalyticsListener$EventTime analyticsListener$EventTimeG = g(i7, sVar);
        i(analyticsListener$EventTimeG, 1022, new o(analyticsListener$EventTimeG, i10, 4));
    }

    @Override // mc.o
    public final void t(int i7, md.s sVar) {
        AnalyticsListener$EventTime analyticsListener$EventTimeG = g(i7, sVar);
        i(analyticsListener$EventTimeG, 1025, new i(analyticsListener$EventTimeG, 4));
    }

    @Override // mc.o
    public final void u(int i7, md.s sVar) {
        AnalyticsListener$EventTime analyticsListener$EventTimeG = g(i7, sVar);
        i(analyticsListener$EventTimeG, 1027, new i(analyticsListener$EventTimeG, 1));
    }

    @Override // md.w
    public final void w(int i7, md.s sVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener$EventTime analyticsListener$EventTimeG = g(i7, sVar);
        i(analyticsListener$EventTimeG, 1000, new g(analyticsListener$EventTimeG, loadEventInfo, mediaLoadData, 1));
    }

    @Override // md.w
    public final void x(int i7, md.s sVar, MediaLoadData mediaLoadData) {
        AnalyticsListener$EventTime analyticsListener$EventTimeG = g(i7, sVar);
        i(analyticsListener$EventTimeG, 1005, new j(analyticsListener$EventTimeG, mediaLoadData, 1));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPositionDiscontinuity(final Player.PositionInfo positionInfo, final Player.PositionInfo positionInfo2, final int i7) {
        if (i7 == 1) {
            this.F = false;
        }
        Player player = this.f10477y;
        player.getClass();
        af.c cVar = this.f10474v;
        cVar.f396v = af.c.x(player, (ei.e0) cVar.f394e, (md.s) cVar.f397w, (u1) cVar.f393d);
        final AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 11, new je.j() { // from class: hc.s
            @Override // je.j
            public final void invoke(Object obj) {
                b bVar = (b) obj;
                AnalyticsListener$EventTime analyticsListener$EventTime = analyticsListener$EventTimeC;
                int i10 = i7;
                bVar.onPositionDiscontinuity(analyticsListener$EventTime, i10);
                bVar.onPositionDiscontinuity(analyticsListener$EventTime, positionInfo, positionInfo2, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.e
    public final void onCues(CueGroup cueGroup) {
        AnalyticsListener$EventTime analyticsListener$EventTimeC = c();
        i(analyticsListener$EventTimeC, 27, new bc.i(19, analyticsListener$EventTimeC, cueGroup));
    }

    @Override // com.google.android.exoplayer2.e
    public final void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onLoadingChanged(boolean z5) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onEvents(Player player, Player.Events events) {
    }
}
