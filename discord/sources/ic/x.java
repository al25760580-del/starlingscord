package ic;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import com.discord.jank_stats.JankRecordStore;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class x {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fj.c f11667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f11668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f11669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w f11672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11675i;
    public float j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f11678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f11682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f11683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f11684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f11685u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f11686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f11689y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f11690z;

    public x(fj.c cVar) {
        this.f11667a = cVar;
        if (je.e0.f13788a >= 18) {
            try {
                this.f11678n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f11668b = new long[10];
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0131  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0200 A[Catch: Exception -> 0x0216, TRY_LEAVE, TryCatch #0 {Exception -> 0x0216, blocks: (B:84:0x01db, B:86:0x0200), top: B:128:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:90:0x021b  */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x0200, please report this as an issue */
    public final long a(boolean z5) {
        long j;
        long jO;
        long j5;
        boolean timestamp;
        long j7;
        long j10;
        long jO2;
        long j11;
        Method method;
        long jMax;
        j0 j0Var = (j0) this.f11667a.f9267e;
        AudioTrack audioTrack = this.f11669c;
        audioTrack.getClass();
        long j12 = 1000;
        if (audioTrack.getPlayState() == 3) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.f11677m >= JankRecordStore.FLUSH_INTERVAL_MS) {
                long jO3 = je.e0.O(this.f11673g, b());
                if (jO3 != 0) {
                    int i7 = this.f11687w;
                    long jY = je.e0.y(jO3, this.j) - jNanoTime;
                    long[] jArr = this.f11668b;
                    jArr[i7] = jY;
                    this.f11687w = (this.f11687w + 1) % 10;
                    int i10 = this.f11688x;
                    if (i10 < 10) {
                        this.f11688x = i10 + 1;
                    }
                    this.f11677m = jNanoTime;
                    this.f11676l = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = this.f11688x;
                        if (i11 >= i12) {
                            break;
                        }
                        this.f11676l = (jArr[i11] / ((long) i12)) + this.f11676l;
                        i11++;
                        j12 = j12;
                    }
                } else {
                    j = 1000;
                }
            }
            j = j12;
            if (!this.f11674h) {
                w wVar = this.f11672f;
                wVar.getClass();
                v vVar = wVar.f11661a;
                if (vVar != null) {
                    AudioTimestamp audioTimestamp = vVar.f11657b;
                    j5 = 500000;
                    if (jNanoTime - wVar.f11665e >= wVar.f11664d) {
                        wVar.f11665e = jNanoTime;
                        timestamp = vVar.f11656a.getTimestamp(audioTimestamp);
                        if (timestamp) {
                            long j13 = audioTimestamp.framePosition;
                            if (vVar.f11659d > j13) {
                                vVar.f11658c++;
                            }
                            vVar.f11659d = j13;
                            vVar.f11660e = j13 + (vVar.f11658c << 32);
                        }
                        int i13 = wVar.f11662b;
                        if (i13 != 0) {
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    if (i13 != 3) {
                                        if (i13 != 4) {
                                            throw new IllegalStateException();
                                        }
                                    } else if (timestamp) {
                                        wVar.a();
                                    }
                                } else if (!timestamp) {
                                    wVar.a();
                                }
                            } else if (!timestamp) {
                                wVar.a();
                            } else if (vVar.f11660e > wVar.f11666f) {
                                wVar.b(2);
                            }
                        } else if (timestamp) {
                            if (audioTimestamp.nanoTime / j >= wVar.f11663c) {
                                wVar.f11666f = vVar.f11660e;
                                wVar.b(1);
                            }
                        } else if (jNanoTime - wVar.f11663c > 500000) {
                            wVar.b(3);
                        }
                    }
                    if (timestamp) {
                        if (vVar != null) {
                            j7 = vVar.f11657b.nanoTime / j;
                        } else {
                            j7 = -9223372036854775807L;
                        }
                        if (vVar != null) {
                            j10 = vVar.f11660e;
                        } else {
                            j10 = -1;
                        }
                        jO2 = je.e0.O(this.f11673g, b());
                        j11 = 5000000;
                        if (Math.abs(j7 - jNanoTime) > 5000000) {
                            StringBuilder sbM = kk.b.m(j10, "Spurious audio timestamp (system clock mismatch): ", ", ");
                            sbM.append(j7);
                            sbM.append(", ");
                            sbM.append(jNanoTime);
                            sbM.append(", ");
                            sbM.append(jO2);
                            sbM.append(", ");
                            sbM.append(j0Var.h());
                            sbM.append(", ");
                            sbM.append(j0Var.i());
                            je.b.N("DefaultAudioSink", sbM.toString());
                            wVar.b(4);
                        } else if (Math.abs(je.e0.O(this.f11673g, j10) - jO2) > 5000000) {
                            StringBuilder sbM2 = kk.b.m(j10, "Spurious audio timestamp (frame position mismatch): ", ", ");
                            sbM2.append(j7);
                            sbM2.append(", ");
                            sbM2.append(jNanoTime);
                            sbM2.append(", ");
                            sbM2.append(jO2);
                            sbM2.append(", ");
                            sbM2.append(j0Var.h());
                            sbM2.append(", ");
                            sbM2.append(j0Var.i());
                            je.b.N("DefaultAudioSink", sbM2.toString());
                            wVar.b(4);
                        } else if (wVar.f11662b == 4) {
                            wVar.a();
                        }
                    } else {
                        j11 = 5000000;
                    }
                    if (this.f11681q && (method = this.f11678n) != null && jNanoTime - this.f11682r >= j5) {
                        try {
                            AudioTrack audioTrack2 = this.f11669c;
                            audioTrack2.getClass();
                            Integer num = (Integer) method.invoke(audioTrack2, null);
                            int i14 = je.e0.f13788a;
                            long jIntValue = (((long) num.intValue()) * j) - this.f11675i;
                            this.f11679o = jIntValue;
                            jMax = Math.max(jIntValue, 0L);
                            this.f11679o = jMax;
                            if (jMax > j11) {
                                je.b.N("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                this.f11679o = 0L;
                            }
                        } catch (Exception unused) {
                            this.f11678n = null;
                        }
                        this.f11682r = jNanoTime;
                    }
                } else {
                    j5 = 500000;
                }
                timestamp = false;
                if (timestamp) {
                    j11 = 5000000;
                } else {
                    if (vVar != null) {
                        j7 = vVar.f11657b.nanoTime / j;
                    } else {
                        j7 = -9223372036854775807L;
                    }
                    if (vVar != null) {
                        j10 = vVar.f11660e;
                    } else {
                        j10 = -1;
                    }
                    jO2 = je.e0.O(this.f11673g, b());
                    j11 = 5000000;
                    if (Math.abs(j7 - jNanoTime) > 5000000) {
                        StringBuilder sbM3 = kk.b.m(j10, "Spurious audio timestamp (system clock mismatch): ", ", ");
                        sbM3.append(j7);
                        sbM3.append(", ");
                        sbM3.append(jNanoTime);
                        sbM3.append(", ");
                        sbM3.append(jO2);
                        sbM3.append(", ");
                        sbM3.append(j0Var.h());
                        sbM3.append(", ");
                        sbM3.append(j0Var.i());
                        je.b.N("DefaultAudioSink", sbM3.toString());
                        wVar.b(4);
                    } else if (Math.abs(je.e0.O(this.f11673g, j10) - jO2) > 5000000) {
                        StringBuilder sbM4 = kk.b.m(j10, "Spurious audio timestamp (frame position mismatch): ", ", ");
                        sbM4.append(j7);
                        sbM4.append(", ");
                        sbM4.append(jNanoTime);
                        sbM4.append(", ");
                        sbM4.append(jO2);
                        sbM4.append(", ");
                        sbM4.append(j0Var.h());
                        sbM4.append(", ");
                        sbM4.append(j0Var.i());
                        je.b.N("DefaultAudioSink", sbM4.toString());
                        wVar.b(4);
                    } else if (wVar.f11662b == 4) {
                        wVar.a();
                    }
                }
                if (this.f11681q) {
                    AudioTrack audioTrack3 = this.f11669c;
                    audioTrack3.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack3, null);
                    int i15 = je.e0.f13788a;
                    long jIntValue2 = (((long) num2.intValue()) * j) - this.f11675i;
                    this.f11679o = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.f11679o = jMax;
                    if (jMax > j11) {
                        je.b.N("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                        this.f11679o = 0L;
                    }
                    this.f11682r = jNanoTime;
                }
            }
        } else {
            j = 1000;
        }
        long jNanoTime2 = System.nanoTime() / j;
        w wVar2 = this.f11672f;
        wVar2.getClass();
        v vVar2 = wVar2.f11661a;
        boolean z6 = wVar2.f11662b == 2;
        if (z6) {
            jO = je.e0.u(jNanoTime2 - (vVar2 != null ? vVar2.f11657b.nanoTime / j : -9223372036854775807L), this.j) + je.e0.O(this.f11673g, vVar2 != null ? vVar2.f11660e : -1L);
        } else {
            jO = this.f11688x == 0 ? je.e0.O(this.f11673g, b()) : je.e0.u(this.f11676l + jNanoTime2, this.j);
            if (!z5) {
                jO = Math.max(0L, jO - this.f11679o);
            }
        }
        if (this.E != z6) {
            this.G = this.D;
            this.F = this.C;
        }
        long j14 = jNanoTime2 - this.G;
        if (j14 < 1000000) {
            long jU = je.e0.u(j14, this.j) + this.F;
            long j15 = (j14 * j) / 1000000;
            jO = (((j - j15) * jU) + (jO * j15)) / j;
        }
        if (!this.k) {
            long j16 = this.C;
            if (jO > j16) {
                this.k = true;
                long jCurrentTimeMillis = System.currentTimeMillis() - je.e0.U(je.e0.y(je.e0.U(jO - j16), this.j));
                ga.l lVar = j0Var.f11547r;
                if (lVar != null) {
                    e4.l lVar2 = ((m0) lVar.f9547e).f11567d1;
                    Handler handler = (Handler) lVar2.f7989e;
                    if (handler != null) {
                        handler.post(new com.discord.media.engine.video.egl_renderer.b(lVar2, jCurrentTimeMillis, 2));
                    }
                }
            }
        }
        this.D = jNanoTime2;
        this.C = jO;
        this.E = z6;
        return jO;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    public final long b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f11689y;
        if (j != -9223372036854775807L) {
            return Math.min(this.B, this.A + (((je.e0.u((jElapsedRealtime * 1000) - j, this.j) * ((long) this.f11673g)) + 999999) / 1000000));
        }
        if (jElapsedRealtime - this.f11683s >= 5) {
            AudioTrack audioTrack = this.f11669c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f11674h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f11686v = this.f11684t;
                    }
                    playbackHeadPosition += this.f11686v;
                }
                if (je.e0.f13788a > 29) {
                    if (this.f11684t > playbackHeadPosition) {
                        this.f11685u++;
                    }
                    this.f11684t = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f11684t <= 0 || playState != 3) {
                    this.f11690z = -9223372036854775807L;
                    if (this.f11684t > playbackHeadPosition) {
                        this.f11685u++;
                    }
                    this.f11684t = playbackHeadPosition;
                } else if (this.f11690z == -9223372036854775807L) {
                    this.f11690z = jElapsedRealtime;
                }
            }
            this.f11683s = jElapsedRealtime;
        }
        return this.f11684t + (this.f11685u << 32);
    }

    public final boolean c(long j) {
        long jA = a(false);
        int i7 = this.f11673g;
        int i10 = je.e0.f13788a;
        if (j > ((jA * ((long) i7)) + 999999) / 1000000) {
            return true;
        }
        if (this.f11674h) {
            AudioTrack audioTrack = this.f11669c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && b() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        this.f11676l = 0L;
        this.f11688x = 0;
        this.f11687w = 0;
        this.f11677m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }
}
