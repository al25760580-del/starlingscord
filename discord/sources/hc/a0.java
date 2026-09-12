package hc;

import android.util.Pair;
import com.discord.media_player.MediaPlayer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.analytics.AnalyticsListener$Events;
import com.google.android.exoplayer2.analytics.PlaybackStats;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.video.VideoSize;
import gc.g0;
import gc.u1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements b, y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f10391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final app.rive.runtime.kotlin.core.a f10394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u1 f10395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PlaybackStats f10396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10399i;
    public int j;
    public Exception k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Format f10402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Format f10403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public VideoSize f10404p;

    public a0(app.rive.runtime.kotlin.core.a aVar) {
        this.f10394d = aVar;
        w wVar = new w();
        this.f10391a = wVar;
        this.f10392b = new HashMap();
        this.f10393c = new HashMap();
        this.f10396f = PlaybackStats.O;
        this.f10395e = new u1();
        this.f10404p = VideoSize.f5848w;
        wVar.f10490d = this;
    }

    @Override // hc.y
    public final void a(String str) {
        z zVar = (z) this.f10392b.get(str);
        zVar.getClass();
        zVar.K = true;
        zVar.I = false;
    }

    @Override // hc.y
    public final void b(AnalyticsListener$EventTime analyticsListener$EventTime, String str, boolean z5) {
        z zVar = (z) this.f10392b.remove(str);
        zVar.getClass();
        AnalyticsListener$EventTime analyticsListener$EventTime2 = (AnalyticsListener$EventTime) this.f10393c.remove(str);
        analyticsListener$EventTime2.getClass();
        str.equals(this.f10397g);
        int i7 = 11;
        if (zVar.G != 11 && !z5) {
            i7 = 15;
        }
        long j = analyticsListener$EventTime.f5592a;
        zVar.c(j);
        zVar.b(j);
        zVar.f(analyticsListener$EventTime, i7);
        List list = zVar.f10519b;
        List list2 = zVar.f10522e;
        List list3 = zVar.f10521d;
        long[] jArr = zVar.f10518a;
        List list4 = zVar.f10520c;
        int i10 = (zVar.f10527l || !zVar.j) ? 1 : 0;
        long j5 = i10 != 0 ? -9223372036854775807L : jArr[2];
        int i11 = jArr[1] > 0 ? 1 : 0;
        long j7 = zVar.f10526i;
        boolean z6 = zVar.J;
        int i12 = !zVar.j ? 1 : 0;
        boolean z7 = zVar.k;
        int i13 = i10 ^ 1;
        int i14 = zVar.f10528m;
        int i15 = zVar.f10529n;
        int i16 = zVar.f10530o;
        int i17 = zVar.f10531p;
        long j10 = zVar.f10532q;
        boolean z10 = zVar.f10525h;
        long j11 = zVar.f10536u;
        long j12 = zVar.f10537v;
        long j13 = zVar.f10538w;
        long j14 = zVar.f10539x;
        long j15 = zVar.f10540y;
        long j16 = zVar.f10541z;
        int i18 = zVar.f10533r;
        int i19 = i18 == -1 ? 0 : 1;
        long j17 = zVar.f10534s;
        int i20 = j17 == -1 ? 0 : 1;
        long j18 = zVar.f10535t;
        int i21 = j18 == -1 ? 0 : 1;
        long j19 = zVar.A;
        long j20 = zVar.B;
        long j21 = zVar.C;
        long j22 = zVar.D;
        int i22 = zVar.E;
        PlaybackStats playbackStats = new PlaybackStats(1, jArr, list, list4, j7, z6 ? 1 : 0, i12, z7 ? 1 : 0, i11, j5, i13, i14, i15, i16, i17, j10, z10 ? 1 : 0, list3, list2, j11, j12, j13, j14, j15, j16, i19, i20, i18, j17, i21, j18, j19, j20, j21, j22, i22 > 0 ? 1 : 0, i22, zVar.F, zVar.f10523f, zVar.f10524g);
        this.f10396f = PlaybackStats.a(this.f10396f, playbackStats);
        MediaPlayer._init_$lambda$4((MediaPlayer) this.f10394d.f2877e, analyticsListener$EventTime2, playbackStats);
    }

    @Override // hc.y
    public final void c(AnalyticsListener$EventTime analyticsListener$EventTime, String str) {
        z zVar = (z) this.f10392b.get(str);
        zVar.getClass();
        zVar.J = true;
    }

    @Override // hc.y
    public final void d(AnalyticsListener$EventTime analyticsListener$EventTime, String str) {
        this.f10392b.put(str, new z(analyticsListener$EventTime));
        this.f10393c.put(str, analyticsListener$EventTime);
    }

    public final boolean e(AnalyticsListener$Events analyticsListener$Events, String str, int i7) {
        return analyticsListener$Events.a(i7) && this.f10391a.a(analyticsListener$Events.b(i7), str);
    }

    @Override // hc.b
    public final void onBandwidthEstimate(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, long j, long j5) {
        this.f10400l = i7;
        this.f10401m = j;
    }

    @Override // hc.b
    public final void onDownstreamFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, MediaLoadData mediaLoadData) {
        int i7 = mediaLoadData.f5699b;
        Format format = mediaLoadData.f5700c;
        if (i7 == 2 || i7 == 0) {
            this.f10402n = format;
        } else if (i7 == 1) {
            this.f10403o = format;
        }
    }

    @Override // hc.b
    public final void onDrmSessionManagerError(AnalyticsListener$EventTime analyticsListener$EventTime, Exception exc) {
        this.k = exc;
    }

    @Override // hc.b
    public final void onDroppedVideoFrames(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, long j) {
        this.j = i7;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21, types: [int] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r6v2, types: [hc.z, java.lang.Object] */
    @Override // hc.b
    public final void onEvents(Player player, AnalyticsListener$Events analyticsListener$Events) {
        w wVar;
        w wVar2;
        boolean z5;
        ?? r13;
        HashMap map;
        int i7;
        je.g gVar = analyticsListener$Events.f5601a;
        if (gVar.f13801a.size() == 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int size = gVar.f13801a.size();
            wVar = this.f10391a;
            if (i10 >= size) {
                break;
            }
            int iA = gVar.a(i10);
            AnalyticsListener$EventTime analyticsListener$EventTimeB = analyticsListener$Events.b(iA);
            if (iA == 0) {
                wVar.i(analyticsListener$EventTimeB);
            } else if (iA == 11) {
                wVar.h(analyticsListener$EventTimeB, this.f10399i);
            } else {
                wVar.g(analyticsListener$EventTimeB);
            }
            i10++;
        }
        HashMap map2 = this.f10392b;
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int i11 = 0;
            AnalyticsListener$EventTime analyticsListener$EventTime = null;
            boolean zA = false;
            while (i11 < gVar.f13801a.size()) {
                AnalyticsListener$EventTime analyticsListener$EventTimeB2 = analyticsListener$Events.b(gVar.a(i11));
                boolean zA2 = wVar.a(analyticsListener$EventTimeB2, str);
                if (analyticsListener$EventTime == null || (zA2 && !zA)) {
                    map = map2;
                    i7 = i11;
                } else {
                    if (zA2 == zA) {
                        i7 = i11;
                        map = map2;
                        if (analyticsListener$EventTimeB2.f5592a > analyticsListener$EventTime.f5592a) {
                        }
                    } else {
                        map = map2;
                        i7 = i11;
                    }
                    i11 = i7 + 1;
                    map2 = map;
                }
                analyticsListener$EventTime = analyticsListener$EventTimeB2;
                zA = zA2;
                i11 = i7 + 1;
                map2 = map;
            }
            HashMap map3 = map2;
            analyticsListener$EventTime.getClass();
            Timeline timeline = analyticsListener$EventTime.f5593b;
            md.s sVar = analyticsListener$EventTime.f5595d;
            if (zA || sVar == null) {
                wVar2 = wVar;
            } else {
                int i12 = sVar.f15690b;
                Object obj = sVar.f15689a;
                if (sVar.a()) {
                    u1 u1Var = this.f10395e;
                    long jD = timeline.g(obj, u1Var).d(i12);
                    if (jD == Long.MIN_VALUE) {
                        jD = u1Var.f9889v;
                    }
                    analyticsListener$EventTime = new AnalyticsListener$EventTime(analyticsListener$EventTime.f5592a, timeline, analyticsListener$EventTime.f5594c, new md.s(obj, sVar.f15692d, i12), e0.U(jD + u1Var.f9890w), timeline, analyticsListener$EventTime.f5598g, analyticsListener$EventTime.f5599h, analyticsListener$EventTime.f5600i, analyticsListener$EventTime.j);
                    wVar2 = wVar;
                    zA = wVar2.a(analyticsListener$EventTime, str);
                } else {
                    wVar2 = wVar;
                }
            }
            Pair pairCreate = Pair.create(analyticsListener$EventTime, Boolean.valueOf(zA));
            ?? r6 = (z) map3.get(str);
            boolean zE = e(analyticsListener$Events, str, 11);
            boolean zE2 = e(analyticsListener$Events, str, 1018);
            boolean zE3 = e(analyticsListener$Events, str, 1011);
            boolean zE4 = e(analyticsListener$Events, str, 1000);
            boolean zE5 = e(analyticsListener$Events, str, 10);
            boolean z6 = e(analyticsListener$Events, str, 1003) || e(analyticsListener$Events, str, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            boolean zE6 = e(analyticsListener$Events, str, 1006);
            boolean zE7 = e(analyticsListener$Events, str, 1004);
            boolean zE8 = e(analyticsListener$Events, str, 25);
            AnalyticsListener$EventTime analyticsListener$EventTime2 = (AnalyticsListener$EventTime) pairCreate.first;
            ((Boolean) pairCreate.second).booleanValue();
            long j = str.equals(this.f10397g) ? this.f10398h : -9223372036854775807L;
            int i13 = zE2 ? this.j : 0;
            com.google.android.exoplayer2.b bVarA = zE5 ? player.A() : null;
            Exception exc = z6 ? this.k : null;
            long j5 = j;
            long j7 = zE6 ? this.f10400l : 0L;
            long j10 = zE6 ? this.f10401m : 0L;
            Format format = zE7 != 0 ? this.f10402n : null;
            Format format2 = zE7 ? this.f10403o : null;
            VideoSize videoSize = zE8 ? this.f10404p : null;
            r6.getClass();
            if (j5 != -9223372036854775807L) {
                long j11 = analyticsListener$EventTime2.f5592a;
                r6.I = true;
            }
            if (player.w() != 2) {
                r6.I = false;
            }
            int iW = player.w();
            Iterator it2 = it;
            if (iW == 1 || iW == 4 || zE) {
                z5 = false;
                r6.K = false;
            } else {
                z5 = false;
            }
            if (bVarA != null) {
                r6.L = true;
                r6.E++;
            } else if (player.A() == null) {
                r6.L = z5;
            }
            if (r6.J && !r6.K) {
                Tracks tracksX = player.x();
                if (!tracksX.a(2)) {
                    r6.e(analyticsListener$EventTime2, null);
                }
                if (!tracksX.a(1)) {
                    r6.d(analyticsListener$EventTime2, null);
                }
            }
            if (format != null) {
                r6.e(analyticsListener$EventTime2, format);
            }
            if (format2 != null) {
                r6.d(analyticsListener$EventTime2, format2);
            }
            Format format3 = r6.O;
            if (format3 != null && format3.O == -1 && videoSize != null) {
                g0 g0VarA = format3.a();
                g0VarA.f9648p = videoSize.f5849d;
                g0VarA.f9649q = videoSize.f5850e;
                r6.e(analyticsListener$EventTime2, new Format(g0VarA));
            }
            if (zE4) {
                r6.M = true;
            }
            if (zE3) {
                r6.D++;
            }
            r6.C += (long) i13;
            r6.A += j7;
            r6.B += j10;
            if (exc != null) {
                r6.F++;
            }
            int iW2 = player.w();
            if (r6.I && r6.J) {
                r13 = 5;
            } else if (r6.L) {
                r13 = 13;
            } else if (!r6.J) {
                r13 = r6.M;
            } else if (r6.K) {
                r13 = 14;
            } else if (iW2 == 4) {
                r13 = 11;
            } else if (iW2 == 2) {
                int i14 = r6.G;
                if (i14 == 0 || i14 == 1 || i14 == 2 || i14 == 14) {
                    r13 = 2;
                } else if (player.g()) {
                    r13 = player.H() != 0 ? 10 : 6;
                } else {
                    r13 = 7;
                }
            } else {
                r13 = 3;
                if (iW2 != 3) {
                    r13 = (iW2 != 1 || r6.G == 0) ? r6.G : 12;
                } else if (!player.g()) {
                    r13 = 4;
                } else if (player.H() != 0) {
                    r13 = 9;
                }
            }
            float f2 = player.b().f5574d;
            if (r6.G != r13 || r6.S != f2) {
                long j12 = analyticsListener$EventTime2.f5592a;
                r6.c(j12);
                r6.b(j12);
            }
            r6.S = f2;
            if (r6.G != r13) {
                r6.f(analyticsListener$EventTime2, r13);
            }
            wVar = wVar2;
            map2 = map3;
            it = it2;
            gVar = gVar;
        }
        w wVar3 = wVar;
        this.f10402n = null;
        this.f10403o = null;
        this.f10397g = null;
        if (analyticsListener$Events.a(1028)) {
            wVar3.c(analyticsListener$Events.b(1028));
        }
    }

    @Override // hc.b
    public final void onLoadError(AnalyticsListener$EventTime analyticsListener$EventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z5) {
        this.k = iOException;
    }

    @Override // hc.b
    public final void onPositionDiscontinuity(AnalyticsListener$EventTime analyticsListener$EventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i7) {
        String str;
        if (this.f10397g == null) {
            w wVar = this.f10391a;
            synchronized (wVar) {
                str = wVar.f10492f;
            }
            this.f10397g = str;
            this.f10398h = positionInfo.f5584x;
        }
        this.f10399i = i7;
    }

    @Override // hc.b
    public final void onVideoSizeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, VideoSize videoSize) {
        this.f10404p = videoSize;
    }
}
