package hc;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.analytics.AnalyticsListener$Events;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.video.VideoSize;
import gc.g0;
import gc.h1;
import gc.p0;
import gc.u1;
import gc.v1;
import gc.w1;
import he.d0;
import he.v0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import je.e0;
import mc.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements b, y {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f10495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f10496c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f10502i;
    public PlaybackMetrics.Builder j;
    public int k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PlaybackException f10505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a1.d f10506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a1.d f10507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a1.d f10508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Format f10509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Format f10510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Format f10511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10513v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10515x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10516y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10517z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v1 f10498e = new v1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u1 f10499f = new u1();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f10501h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f10500g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10497d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10503l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10504m = 0;

    public x(Context context, PlaybackSession playbackSession) {
        this.f10494a = context.getApplicationContext();
        this.f10496c = playbackSession;
        w wVar = new w();
        this.f10495b = wVar;
        wVar.f10490d = this;
    }

    @Override // hc.y
    public final void b(AnalyticsListener$EventTime analyticsListener$EventTime, String str, boolean z5) {
        md.s sVar = analyticsListener$EventTime.f5595d;
        if ((sVar == null || !sVar.a()) && str.equals(this.f10502i)) {
            f();
        }
        this.f10500g.remove(str);
        this.f10501h.remove(str);
    }

    @Override // hc.y
    public final void c(AnalyticsListener$EventTime analyticsListener$EventTime, String str) {
        md.s sVar = analyticsListener$EventTime.f5595d;
        if (sVar == null || !sVar.a()) {
            f();
            this.f10502i = str;
            this.j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.19.1");
            g(analyticsListener$EventTime.f5593b, sVar);
        }
    }

    public final boolean e(a1.d dVar) {
        String str;
        if (dVar == null) {
            return false;
        }
        String str2 = (String) dVar.f19v;
        w wVar = this.f10495b;
        synchronized (wVar) {
            str = wVar.f10492f;
        }
        return str2.equals(str);
    }

    public final void f() {
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f10517z);
            this.j.setVideoFramesDropped(this.f10515x);
            this.j.setVideoFramesPlayed(this.f10516y);
            Long l6 = (Long) this.f10500g.get(this.f10502i);
            this.j.setNetworkTransferDurationMillis(l6 == null ? 0L : l6.longValue());
            Long l7 = (Long) this.f10501h.get(this.f10502i);
            this.j.setNetworkBytesRead(l7 == null ? 0L : l7.longValue());
            this.j.setStreamSource((l7 == null || l7.longValue() <= 0) ? 0 : 1);
            this.f10496c.reportPlaybackMetrics(this.j.build());
        }
        this.j = null;
        this.f10502i = null;
        this.f10517z = 0;
        this.f10515x = 0;
        this.f10516y = 0;
        this.f10509r = null;
        this.f10510s = null;
        this.f10511t = null;
        this.A = false;
    }

    public final void g(Timeline timeline, md.s sVar) {
        PlaybackMetrics.Builder builder = this.j;
        if (sVar == null) {
            return;
        }
        int iB = timeline.b(sVar.f15689a);
        if (iB == -1) {
            return;
        }
        u1 u1Var = this.f10499f;
        int iD = 0;
        timeline.f(iB, u1Var, false);
        int i7 = u1Var.f9888i;
        v1 v1Var = this.f10498e;
        timeline.n(i7, v1Var);
        p0 p0Var = v1Var.f9911i.f5534e;
        if (p0Var != null) {
            Uri uri = p0Var.f9811d;
            String str = p0Var.f9812e;
            if (str != null) {
                int i10 = e0.f13788a;
                switch (str) {
                    case "application/x-mpegURL":
                        iD = 2;
                        break;
                    case "application/vnd.ms-sstr+xml":
                        iD = 1;
                        break;
                    case "application/dash+xml":
                        break;
                    case "application/x-rtsp":
                        iD = 3;
                        break;
                    default:
                        iD = 4;
                        break;
                }
            } else {
                iD = e0.D(uri);
            }
            if (iD == 0) {
                iD = 3;
            } else if (iD != 1) {
                iD = iD != 2 ? 1 : 4;
            } else {
                iD = 5;
            }
        }
        builder.setStreamType(iD);
        if (v1Var.K != -9223372036854775807L && !v1Var.I && !v1Var.F && !v1Var.a()) {
            builder.setMediaDurationMillis(e0.U(v1Var.K));
        }
        builder.setPlaybackType(v1Var.a() ? 2 : 1);
        this.A = true;
    }

    public final void h(int i7, long j, Format format, int i10) {
        int i11;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i7).setTimeSinceCreatedMillis(j - this.f10497d);
        if (format != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    i11 = i10 != 3 ? 1 : 4;
                }
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str = format.H;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = format.I;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = format.F;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = format.E;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = format.N;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = format.O;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = format.V;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = format.W;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = format.f5528i;
            if (str4 != null) {
                int i17 = e0.f13788a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f2 = format.P;
            if (f2 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f2);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f10496c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // hc.b
    public final void onBandwidthEstimate(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, long j, long j5) {
        md.s sVar = analyticsListener$EventTime.f5595d;
        if (sVar != null) {
            String strE = this.f10495b.e(analyticsListener$EventTime.f5593b, sVar);
            HashMap map = this.f10501h;
            Long l6 = (Long) map.get(strE);
            HashMap map2 = this.f10500g;
            Long l7 = (Long) map2.get(strE);
            map.put(strE, Long.valueOf((l6 == null ? 0L : l6.longValue()) + j));
            map2.put(strE, Long.valueOf((l7 != null ? l7.longValue() : 0L) + ((long) i7)));
        }
    }

    @Override // hc.b
    public final void onDownstreamFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, MediaLoadData mediaLoadData) {
        md.s sVar = analyticsListener$EventTime.f5595d;
        if (sVar == null) {
            return;
        }
        Format format = mediaLoadData.f5700c;
        format.getClass();
        int i7 = mediaLoadData.f5701d;
        Timeline timeline = analyticsListener$EventTime.f5593b;
        sVar.getClass();
        a1.d dVar = new a1.d(format, i7, this.f10495b.e(timeline, sVar), 7);
        int i10 = mediaLoadData.f5699b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f10507p = dVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f10508q = dVar;
                return;
            }
        }
        this.f10506o = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:212:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:230:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:231:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:239:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:240:0x03fd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // hc.b
    public final void onEvents(Player player, AnalyticsListener$Events analyticsListener$Events) {
        w wVar;
        int i7;
        boolean z5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        c5.e eVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        a1.d dVar;
        int i21;
        int i22;
        int i23;
        int i24;
        Format format;
        int i25;
        int i26;
        mc.i iVar;
        int i27;
        je.g gVar = analyticsListener$Events.f5601a;
        if (gVar.f13801a.size() == 0) {
            return;
        }
        int i28 = 0;
        while (true) {
            int size = gVar.f13801a.size();
            wVar = this.f10495b;
            if (i28 >= size) {
                break;
            }
            int iA = gVar.a(i28);
            AnalyticsListener$EventTime analyticsListener$EventTimeB = analyticsListener$Events.b(iA);
            if (iA == 0) {
                wVar.i(analyticsListener$EventTimeB);
            } else if (iA == 11) {
                wVar.h(analyticsListener$EventTimeB, this.k);
            } else {
                wVar.g(analyticsListener$EventTimeB);
            }
            i28++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (analyticsListener$Events.a(0)) {
            AnalyticsListener$EventTime analyticsListener$EventTimeB2 = analyticsListener$Events.b(0);
            if (this.j != null) {
                g(analyticsListener$EventTimeB2.f5593b, analyticsListener$EventTimeB2.f5595d);
            }
        }
        int i29 = 1;
        if (analyticsListener$Events.a(2) && this.j != null) {
            ei.c0 c0VarListIterator = player.x().f5590d.listIterator(0);
            loop1: while (true) {
                if (!c0VarListIterator.hasNext()) {
                    iVar = null;
                    break;
                }
                w1 w1Var = (w1) c0VarListIterator.next();
                for (int i30 = 0; i30 < w1Var.f9928d; i30++) {
                    if (w1Var.f9932w[i30] && (iVar = w1Var.f9929e.f15730v[i30].L) != null) {
                        break loop1;
                    }
                }
            }
            if (iVar != null) {
                PlaybackMetrics.Builder builder = this.j;
                int i31 = e0.f13788a;
                int i32 = 0;
                while (true) {
                    if (i32 >= iVar.f15561v) {
                        i27 = 1;
                        break;
                    }
                    UUID uuid = iVar.f15558d[i32].f15554e;
                    if (uuid.equals(gc.h.f9672d)) {
                        i27 = 3;
                        break;
                    } else if (uuid.equals(gc.h.f9673e)) {
                        i27 = 2;
                        break;
                    } else {
                        if (uuid.equals(gc.h.f9671c)) {
                            i27 = 6;
                            break;
                        }
                        i32++;
                    }
                }
                builder.setDrmType(i27);
            }
        }
        if (analyticsListener$Events.a(1011)) {
            this.f10517z++;
        }
        PlaybackException playbackException = this.f10505n;
        Context context = this.f10494a;
        long j = this.f10497d;
        if (playbackException == null) {
            i20 = 2;
            i14 = 13;
            i10 = 8;
            i11 = 7;
            i12 = 6;
            i13 = 9;
        } else {
            int i33 = playbackException.f5571d;
            boolean z6 = this.f10513v == 4;
            if (i33 == 1001) {
                eVar = new c5.e(20, 0, 3);
            } else {
                if (playbackException instanceof com.google.android.exoplayer2.b) {
                    com.google.android.exoplayer2.b bVar = (com.google.android.exoplayer2.b) playbackException;
                    z5 = bVar.f5634i == 1;
                    i7 = bVar.f5638y;
                } else {
                    i7 = 0;
                    z5 = false;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i34 = 24;
                    i10 = 8;
                    i11 = 7;
                    i12 = 6;
                    i13 = 9;
                    if (z5 && (i7 == 0 || i7 == 1)) {
                        eVar = new c5.e(35, 0, 3);
                    } else if (z5 && i7 == 3) {
                        eVar = new c5.e(15, 0, 3);
                    } else if (z5 && i7 == 2) {
                        eVar = new c5.e(23, 0, 3);
                    } else if (cause instanceof bd.q) {
                        i14 = 13;
                        eVar = new c5.e(13, e0.t(((bd.q) cause).f3183v), 3);
                    } else {
                        i14 = 13;
                        if (cause instanceof bd.m) {
                            eVar = new c5.e(14, e0.t(((bd.m) cause).f3171d), 3);
                        } else if (cause instanceof OutOfMemoryError) {
                            eVar = new c5.e(14, 0, 3);
                        } else if (cause instanceof ic.s) {
                            eVar = new c5.e(17, ((ic.s) cause).f11645d, 3);
                        } else if (cause instanceof ic.t) {
                            eVar = new c5.e(18, ((ic.t) cause).f11648d, 3);
                        } else if (e0.f13788a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                            eVar = new c5.e(22, 0, 3);
                        } else {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (e0.s(errorCode)) {
                                case 6002:
                                    break;
                                case 6003:
                                    i34 = 28;
                                    break;
                                case 6004:
                                    i34 = 25;
                                    break;
                                case 6005:
                                    i34 = 26;
                                    break;
                                default:
                                    i34 = 27;
                                    break;
                            }
                            eVar = new c5.e(i34, errorCode, 3);
                        }
                    }
                    i14 = 13;
                } else if (cause instanceof d0) {
                    eVar = new c5.e(5, ((d0) cause).f10597v, 3);
                } else {
                    if ((cause instanceof he.c0) || (cause instanceof h1)) {
                        i15 = 9;
                        i16 = 7;
                        i17 = 8;
                        i18 = 6;
                        eVar = new c5.e(z6 ? 10 : 11, 0, 3);
                    } else {
                        boolean z7 = cause instanceof he.b0;
                        if (z7 || (cause instanceof v0)) {
                            i15 = 9;
                            if (je.u.c(context).d() == 1) {
                                eVar = new c5.e(3, 0, 3);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    eVar = new c5.e(6, 0, 3);
                                    i13 = 9;
                                    i12 = 6;
                                    i14 = 13;
                                    i10 = 8;
                                    i11 = 7;
                                } else {
                                    i18 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i16 = 7;
                                        eVar = new c5.e(7, 0, 3);
                                    } else {
                                        i16 = 7;
                                        if (z7 && ((he.b0) cause).f10588i == 1) {
                                            eVar = new c5.e(4, 0, 3);
                                        } else {
                                            i17 = 8;
                                            eVar = new c5.e(8, 0, 3);
                                        }
                                    }
                                    i13 = 9;
                                    i11 = i16;
                                    i12 = 6;
                                    i14 = 13;
                                    i10 = 8;
                                }
                            }
                        } else if (i33 == 1002) {
                            eVar = new c5.e(21, 0, 3);
                        } else if (cause instanceof mc.j) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i35 = e0.f13788a;
                            if (i35 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                int iT = e0.t(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (e0.s(iT)) {
                                    case 6002:
                                        i19 = 24;
                                        break;
                                    case 6003:
                                        i19 = 28;
                                        break;
                                    case 6004:
                                        i19 = 25;
                                        break;
                                    case 6005:
                                        i19 = 26;
                                        break;
                                    default:
                                        i19 = 27;
                                        break;
                                }
                                eVar = new c5.e(i19, iT, 3);
                            } else if (i35 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                eVar = new c5.e(27, 0, 3);
                            } else if (i35 >= 18 && (cause3 instanceof NotProvisionedException)) {
                                eVar = new c5.e(24, 0, 3);
                            } else if (i35 >= 18 && (cause3 instanceof DeniedByServerException)) {
                                eVar = new c5.e(29, 0, 3);
                            } else if (cause3 instanceof i0) {
                                eVar = new c5.e(23, 0, 3);
                            } else {
                                eVar = cause3 instanceof mc.d ? new c5.e(28, 0, 3) : new c5.e(30, 0, 3);
                            }
                        } else if ((cause instanceof he.y) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            eVar = (e0.f13788a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new c5.e(32, 0, 3) : new c5.e(31, 0, 3);
                        } else {
                            i15 = 9;
                            eVar = new c5.e(9, 0, 3);
                        }
                        i13 = i15;
                        i14 = 13;
                        i10 = 8;
                        i11 = 7;
                        i12 = 6;
                    }
                    i13 = i15;
                    i11 = i16;
                    i10 = i17;
                    i12 = i18;
                    i14 = 13;
                }
                this.f10496c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(eVar.f3485b).setSubErrorCode(eVar.f3486c).setException(playbackException).build());
                i29 = 1;
                this.A = true;
                this.f10505n = null;
                i20 = 2;
            }
            i14 = 13;
            i10 = 8;
            i11 = 7;
            i12 = 6;
            i13 = 9;
            this.f10496c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(eVar.f3485b).setSubErrorCode(eVar.f3486c).setException(playbackException).build());
            i29 = 1;
            this.A = true;
            this.f10505n = null;
            i20 = 2;
        }
        if (analyticsListener$Events.a(i20)) {
            Tracks tracksX = player.x();
            boolean zA = tracksX.a(i20);
            boolean zA2 = tracksX.a(i29);
            boolean zA3 = tracksX.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    format = null;
                } else {
                    format = null;
                    if (!e0.a(this.f10509r, null)) {
                        int i36 = this.f10509r == null ? 1 : 0;
                        this.f10509r = null;
                        i21 = 5;
                        h(1, jElapsedRealtime, null, i36);
                    }
                    if (!zA2 && !e0.a(this.f10510s, format)) {
                        if (this.f10510s == null) {
                            i26 = 1;
                        } else {
                            i26 = 0;
                        }
                        this.f10510s = format;
                        h(0, jElapsedRealtime, format, i26);
                    }
                    if (!zA3 && !e0.a(this.f10511t, format)) {
                        if (this.f10511t == null) {
                            i25 = 1;
                        } else {
                            i25 = 0;
                        }
                        this.f10511t = format;
                        h(2, jElapsedRealtime, format, i25);
                    }
                    dVar = format;
                }
                i21 = 5;
                if (!zA2) {
                    if (this.f10510s == null) {
                        i26 = 1;
                    } else {
                        i26 = 0;
                    }
                    this.f10510s = format;
                    h(0, jElapsedRealtime, format, i26);
                }
                if (!zA3) {
                    if (this.f10511t == null) {
                        i25 = 1;
                    } else {
                        i25 = 0;
                    }
                    this.f10511t = format;
                    h(2, jElapsedRealtime, format, i25);
                }
                dVar = format;
            } else {
                dVar = 0;
                i21 = 5;
            }
        } else {
            dVar = 0;
            i21 = 5;
        }
        if (e(this.f10506o)) {
            a1.d dVar2 = this.f10506o;
            Format format2 = (Format) dVar2.f18i;
            if (format2.O != -1) {
                int i37 = dVar2.f17e;
                if (!e0.a(this.f10509r, format2)) {
                    int i38 = (this.f10509r == null && i37 == 0) ? 1 : i37;
                    this.f10509r = format2;
                    h(1, jElapsedRealtime, format2, i38);
                }
                this.f10506o = dVar;
            }
        }
        if (e(this.f10507p)) {
            a1.d dVar3 = this.f10507p;
            Format format3 = (Format) dVar3.f18i;
            int i39 = dVar3.f17e;
            if (!e0.a(this.f10510s, format3)) {
                int i40 = (this.f10510s == null && i39 == 0) ? 1 : i39;
                this.f10510s = format3;
                h(0, jElapsedRealtime, format3, i40);
            }
            this.f10507p = dVar;
        }
        if (e(this.f10508q)) {
            a1.d dVar4 = this.f10508q;
            Format format4 = (Format) dVar4.f18i;
            int i41 = dVar4.f17e;
            if (!e0.a(this.f10511t, format4)) {
                int i42 = (this.f10511t == null && i41 == 0) ? 1 : i41;
                this.f10511t = format4;
                h(2, jElapsedRealtime, format4, i42);
            }
            this.f10508q = dVar;
        }
        switch (je.u.c(context).d()) {
            case 0:
                i22 = 0;
                break;
            case 1:
                i22 = i13;
                break;
            case 2:
                i22 = 2;
                break;
            case 3:
                i22 = 4;
                break;
            case 4:
                i22 = i21;
                break;
            case 5:
                i22 = i12;
                break;
            case 6:
            case 8:
            default:
                i22 = 1;
                break;
            case 7:
                i22 = 3;
                break;
            case 9:
                i22 = i10;
                break;
            case 10:
                i22 = i11;
                break;
        }
        if (i22 != this.f10504m) {
            this.f10504m = i22;
            this.f10496c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i22).setTimeSinceCreatedMillis(jElapsedRealtime - j).build());
        }
        if (player.w() != 2) {
            this.f10512u = false;
        }
        if (player.A() == null) {
            this.f10514w = false;
            i23 = 10;
        } else {
            i23 = 10;
            if (analyticsListener$Events.a(10)) {
                this.f10514w = true;
            }
        }
        int iW = player.w();
        if (this.f10512u) {
            i24 = i21;
        } else if (this.f10514w) {
            i24 = i14;
        } else if (iW == 4) {
            i24 = 11;
        } else if (iW == 2) {
            int i43 = this.f10503l;
            if (i43 == 0 || i43 == 2) {
                i24 = 2;
            } else if (player.g()) {
                i24 = player.H() != 0 ? i23 : i12;
            } else {
                i24 = i11;
            }
        } else if (iW != 3) {
            i24 = (iW != 1 || this.f10503l == 0) ? this.f10503l : 12;
        } else if (player.g()) {
            i24 = player.H() != 0 ? i13 : 3;
        } else {
            i24 = 4;
        }
        if (this.f10503l != i24) {
            this.f10503l = i24;
            this.A = true;
            this.f10496c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f10503l).setTimeSinceCreatedMillis(jElapsedRealtime - j).build());
        }
        if (analyticsListener$Events.a(1028)) {
            wVar.c(analyticsListener$Events.b(1028));
        }
    }

    @Override // hc.b
    public final void onLoadError(AnalyticsListener$EventTime analyticsListener$EventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z5) {
        this.f10513v = mediaLoadData.f5698a;
    }

    @Override // hc.b
    public final void onPlayerError(AnalyticsListener$EventTime analyticsListener$EventTime, PlaybackException playbackException) {
        this.f10505n = playbackException;
    }

    @Override // hc.b
    public final void onPositionDiscontinuity(AnalyticsListener$EventTime analyticsListener$EventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i7) {
        if (i7 == 1) {
            this.f10512u = true;
        }
        this.k = i7;
    }

    @Override // hc.b
    public final void onVideoDisabled(AnalyticsListener$EventTime analyticsListener$EventTime, DecoderCounters decoderCounters) {
        this.f10515x += decoderCounters.f5676g;
        this.f10516y += decoderCounters.f5674e;
    }

    @Override // hc.b
    public final void onVideoSizeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, VideoSize videoSize) {
        a1.d dVar = this.f10506o;
        if (dVar != null) {
            Format format = (Format) dVar.f18i;
            if (format.O == -1) {
                g0 g0VarA = format.a();
                g0VarA.f9648p = videoSize.f5849d;
                g0VarA.f9649q = videoSize.f5850e;
                this.f10506o = new a1.d(new Format(g0VarA), dVar.f17e, (String) dVar.f19v, 7);
            }
        }
    }

    @Override // hc.y
    public final void a(String str) {
    }

    @Override // hc.y
    public final void d(AnalyticsListener$EventTime analyticsListener$EventTime, String str) {
    }
}
