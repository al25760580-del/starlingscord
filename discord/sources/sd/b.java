package sd;

import a5.b0;
import ag.a1;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import ei.e0;
import gc.h1;
import he.d0;
import he.f0;
import he.h0;
import he.k0;
import he.n0;
import he.s0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f0 {
    public long E;
    public boolean F;
    public IOException G;
    public final /* synthetic */ c H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f19843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f19844e = new k0("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DataSource f19845i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f19846v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f19847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f19848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f19849y;

    public b(c cVar, Uri uri) {
        this.H = cVar;
        this.f19843d = uri;
        this.f19845i = cVar.f19850d.f19262a.createDataSource();
    }

    public static boolean a(b bVar, long j) {
        bVar.E = SystemClock.elapsedRealtime() + j;
        Uri uri = bVar.f19843d;
        c cVar = bVar.H;
        if (!uri.equals(cVar.H)) {
            return false;
        }
        List list = cVar.G.f19900e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar2 = (b) cVar.f19853v.get(((k) list.get(i7)).f19892a);
            bVar2.getClass();
            if (jElapsedRealtime > bVar2.E) {
                Uri uri2 = bVar2.f19843d;
                cVar.H = uri2;
                bVar2.c(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        c cVar = this.H;
        n0 n0Var = new n0(this.f19845i, uri, 4, cVar.f19851e.s(cVar.G, this.f19846v));
        o9.d dVar = cVar.f19852i;
        int i7 = n0Var.f10636i;
        this.f19844e.f(n0Var, this, dVar.k(i7));
        cVar.f19855x.s(new LoadEventInfo(n0Var.f10635e), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.E = 0L;
        if (this.F) {
            return;
        }
        k0 k0Var = this.f19844e;
        if (k0Var.d() || k0Var.c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f19849y;
        if (jElapsedRealtime >= j) {
            b(uri);
        } else {
            this.F = true;
            this.H.E.postDelayed(new io.sentry.react.d(17, this, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0274  */
    /* JADX WARN: Code duplicated, block: B:112:0x0281  */
    /* JADX WARN: Code duplicated, block: B:114:0x028d  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:127:0x02da  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0141  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dc A[LOOP:0: B:78:0x01d6->B:80:0x01dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0203  */
    /* JADX WARN: Code duplicated, block: B:88:0x0216  */
    /* JADX WARN: Code duplicated, block: B:90:0x021d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0221  */
    /* JADX WARN: Code duplicated, block: B:95:0x0235 A[LOOP:1: B:93:0x022f->B:95:0x0235, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0249 A[DONT_INVERT] */
    public final void d(i iVar) {
        boolean z5;
        e0 e0Var;
        long j;
        long j5;
        boolean z6;
        i iVar2;
        long j7;
        long j10;
        e0 e0Var2;
        long j11;
        int size;
        int i7;
        f fVar;
        long j12;
        i iVar3;
        int i10;
        int i11;
        e0 e0Var3;
        f fVar2;
        int i12;
        i iVar4;
        a1 a1Var;
        Uri uriBuild;
        long size2;
        i iVar5;
        a1 a1Var2;
        boolean z7;
        b0 b0Var;
        Iterator it;
        i iVar6;
        h hVar;
        long j13;
        i iVar7;
        h hVar2;
        Uri.Builder builderBuildUpon;
        i iVar8;
        h hVar3;
        String str;
        i iVar9;
        e0 e0Var4;
        int size3;
        Iterator it2;
        int size4;
        int size5;
        int size6;
        i iVar10 = this.f19846v;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f19847w = jElapsedRealtime;
        c cVar = this.H;
        CopyOnWriteArrayList copyOnWriteArrayList = cVar.f19854w;
        if (iVar10 != null) {
            long j14 = iVar.k;
            long j15 = iVar10.k;
            z5 = j14 > j15 || (j14 >= j15 && ((size4 = iVar.f19884r.size() - iVar10.f19884r.size()) == 0 ? (size5 = iVar.f19885s.size()) > (size6 = iVar10.f19885s.size()) || (size5 == size6 && iVar.f19881o && !iVar10.f19881o) : size4 > 0));
            e0Var = iVar.f19884r;
            j = iVar.k;
            j5 = 0;
            if (z5) {
                copyOnWriteArrayList = copyOnWriteArrayList;
                z6 = true;
                if (iVar.f19882p) {
                    j7 = iVar.f19876h;
                } else {
                    iVar2 = cVar.I;
                    if (iVar2 != null) {
                        j7 = iVar2.f19876h;
                    } else {
                        j7 = 0;
                    }
                    if (iVar10 == null) {
                        long j16 = iVar10.f19876h;
                        j10 = iVar10.k;
                        e0Var2 = iVar10.f19884r;
                        j11 = j7;
                        size = e0Var2.size();
                        i7 = (int) (j - j10);
                        if (i7 < e0Var2.size()) {
                            fVar = (f) e0Var2.get(i7);
                        } else {
                            fVar = null;
                        }
                        if (fVar != null) {
                            j12 = fVar.f19864w;
                        } else if (size == j - j10) {
                            j12 = iVar10.f19887u;
                        }
                        j7 = j16 + j12;
                    }
                    if (iVar.f19877i) {
                        i12 = iVar.j;
                    } else {
                        iVar3 = cVar.I;
                        if (iVar3 != null) {
                            i10 = iVar3.j;
                        } else {
                            i10 = 0;
                        }
                        if (iVar10 == null) {
                            i11 = (int) (j - iVar10.k);
                            e0Var3 = iVar10.f19884r;
                            if (i11 < e0Var3.size()) {
                                fVar2 = (f) e0Var3.get(i11);
                            } else {
                                fVar2 = null;
                            }
                            if (fVar2 != null) {
                                i10 = (iVar10.j + fVar2.f19863v) - ((f) e0Var.get(0)).f19863v;
                            }
                        }
                        i12 = i10;
                    }
                    a1Var = null;
                    j = j;
                    iVar4 = new i(iVar.f19872d, iVar.f19907a, iVar.f19908b, iVar.f19873e, iVar.f19875g, j11, true, i12, iVar.k, iVar.f19878l, iVar.f19879m, iVar.f19880n, iVar.f19909c, iVar.f19881o, iVar.f19882p, iVar.f19883q, e0Var, iVar.f19885s, iVar.f19888v, iVar.f19886t);
                }
                j11 = j7;
                if (iVar.f19877i) {
                    i12 = iVar.j;
                } else {
                    iVar3 = cVar.I;
                    if (iVar3 != null) {
                        i10 = iVar3.j;
                    } else {
                        i10 = 0;
                    }
                    if (iVar10 == null) {
                        i11 = (int) (j - iVar10.k);
                        e0Var3 = iVar10.f19884r;
                        if (i11 < e0Var3.size()) {
                            fVar2 = (f) e0Var3.get(i11);
                        } else {
                            fVar2 = null;
                        }
                        if (fVar2 != null) {
                            i10 = (iVar10.j + fVar2.f19863v) - ((f) e0Var.get(0)).f19863v;
                        }
                    }
                    i12 = i10;
                }
                a1Var = null;
                j = j;
                iVar4 = new i(iVar.f19872d, iVar.f19907a, iVar.f19908b, iVar.f19873e, iVar.f19875g, j11, true, i12, iVar.k, iVar.f19878l, iVar.f19879m, iVar.f19880n, iVar.f19909c, iVar.f19881o, iVar.f19882p, iVar.f19883q, e0Var, iVar.f19885s, iVar.f19888v, iVar.f19886t);
            } else {
                if (iVar.f19881o) {
                    z6 = true;
                    iVar4 = iVar10;
                } else if (iVar10.f19881o) {
                    iVar4 = iVar10;
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    j = j;
                    a1Var = null;
                    z6 = true;
                } else {
                    z6 = true;
                    iVar4 = new i(iVar10.f19872d, iVar10.f19907a, iVar10.f19908b, iVar10.f19873e, iVar10.f19875g, iVar10.f19876h, iVar10.f19877i, iVar10.j, iVar10.k, iVar10.f19878l, iVar10.f19879m, iVar10.f19880n, iVar10.f19909c, true, iVar10.f19882p, iVar10.f19883q, iVar10.f19884r, iVar10.f19885s, iVar10.f19888v, iVar10.f19886t);
                }
                a1Var = null;
            }
            this.f19846v = iVar4;
            uriBuild = this.f19843d;
            if (iVar4 != iVar10) {
                this.G = a1Var;
                this.f19848x = jElapsedRealtime;
                if (uriBuild.equals(cVar.H)) {
                    if (cVar.I == null) {
                        cVar.J = !iVar4.f19881o;
                        cVar.K = iVar4.f19876h;
                    }
                    cVar.I = iVar4;
                    cVar.F.w(iVar4);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((q) it2.next()).b();
                }
            } else if (!iVar4.f19881o) {
                size2 = j + ((long) iVar.f19884r.size());
                iVar5 = this.f19846v;
                if (size2 < iVar5.k) {
                    a1Var2 = new a1();
                    z7 = z6;
                } else {
                    if (jElapsedRealtime - this.f19848x > je.e0.U(iVar5.f19879m) * 3.5d) {
                        a1Var2 = new a1();
                    } else {
                        a1Var2 = a1Var;
                    }
                    z7 = false;
                }
                if (a1Var2 != null) {
                    this.G = a1Var2;
                    b0Var = new b0(z6 ? 1 : 0, 5, a1Var2);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((q) it.next()).c(uriBuild, b0Var, z7);
                    }
                }
            }
            iVar6 = this.f19846v;
            hVar = iVar6.f19888v;
            j13 = iVar6.f19879m;
            if (!hVar.f19871e) {
                if (iVar6 == iVar10) {
                    j13 /= 2;
                }
                j5 = j13;
            }
            this.f19849y = je.e0.U(j5) + jElapsedRealtime;
            if (this.f19846v.f19880n == -9223372036854775807L || uriBuild.equals(cVar.H)) {
                iVar7 = this.f19846v;
                if (iVar7.f19881o) {
                }
                hVar2 = iVar7.f19888v;
                if (hVar2.f19867a == -9223372036854775807L || hVar2.f19871e) {
                    builderBuildUpon = uriBuild.buildUpon();
                    iVar8 = this.f19846v;
                    if (iVar8.f19888v.f19871e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar8.k + ((long) iVar8.f19884r.size())));
                        iVar9 = this.f19846v;
                        if (iVar9.f19880n != -9223372036854775807L) {
                            e0Var4 = iVar9.f19885s;
                            size3 = e0Var4.size();
                            if (!e0Var4.isEmpty() && ((d) ei.p.i(e0Var4)).J) {
                                size3--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                        }
                    }
                    hVar3 = this.f19846v.f19888v;
                    if (hVar3.f19867a != -9223372036854775807L) {
                        if (hVar3.f19868b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                c(uriBuild);
            }
            return;
        }
        iVar.getClass();
        e0Var = iVar.f19884r;
        j = iVar.k;
        j5 = 0;
        if (z5) {
            if (iVar.f19881o) {
                z6 = true;
                iVar4 = iVar10;
            } else if (iVar10.f19881o) {
                iVar4 = iVar10;
                copyOnWriteArrayList = copyOnWriteArrayList;
                j = j;
                a1Var = null;
                z6 = true;
            } else {
                z6 = true;
                iVar4 = new i(iVar10.f19872d, iVar10.f19907a, iVar10.f19908b, iVar10.f19873e, iVar10.f19875g, iVar10.f19876h, iVar10.f19877i, iVar10.j, iVar10.k, iVar10.f19878l, iVar10.f19879m, iVar10.f19880n, iVar10.f19909c, true, iVar10.f19882p, iVar10.f19883q, iVar10.f19884r, iVar10.f19885s, iVar10.f19888v, iVar10.f19886t);
            }
            a1Var = null;
        } else {
            copyOnWriteArrayList = copyOnWriteArrayList;
            z6 = true;
            if (iVar.f19882p) {
                j7 = iVar.f19876h;
            } else {
                iVar2 = cVar.I;
                if (iVar2 != null) {
                    j7 = iVar2.f19876h;
                } else {
                    j7 = 0;
                }
                if (iVar10 == null) {
                    long j17 = iVar10.f19876h;
                    j10 = iVar10.k;
                    e0Var2 = iVar10.f19884r;
                    j11 = j7;
                    size = e0Var2.size();
                    i7 = (int) (j - j10);
                    if (i7 < e0Var2.size()) {
                        fVar = (f) e0Var2.get(i7);
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        j12 = fVar.f19864w;
                    } else if (size == j - j10) {
                        j12 = iVar10.f19887u;
                    }
                    j7 = j17 + j12;
                }
                if (iVar.f19877i) {
                    i12 = iVar.j;
                } else {
                    iVar3 = cVar.I;
                    if (iVar3 != null) {
                        i10 = iVar3.j;
                    } else {
                        i10 = 0;
                    }
                    if (iVar10 == null) {
                        i11 = (int) (j - iVar10.k);
                        e0Var3 = iVar10.f19884r;
                        if (i11 < e0Var3.size()) {
                            fVar2 = (f) e0Var3.get(i11);
                        } else {
                            fVar2 = null;
                        }
                        if (fVar2 != null) {
                            i10 = (iVar10.j + fVar2.f19863v) - ((f) e0Var.get(0)).f19863v;
                        }
                    }
                    i12 = i10;
                }
                a1Var = null;
                j = j;
                iVar4 = new i(iVar.f19872d, iVar.f19907a, iVar.f19908b, iVar.f19873e, iVar.f19875g, j11, true, i12, iVar.k, iVar.f19878l, iVar.f19879m, iVar.f19880n, iVar.f19909c, iVar.f19881o, iVar.f19882p, iVar.f19883q, e0Var, iVar.f19885s, iVar.f19888v, iVar.f19886t);
            }
            j11 = j7;
            if (iVar.f19877i) {
                i12 = iVar.j;
            } else {
                iVar3 = cVar.I;
                if (iVar3 != null) {
                    i10 = iVar3.j;
                } else {
                    i10 = 0;
                }
                if (iVar10 == null) {
                    i11 = (int) (j - iVar10.k);
                    e0Var3 = iVar10.f19884r;
                    if (i11 < e0Var3.size()) {
                        fVar2 = (f) e0Var3.get(i11);
                    } else {
                        fVar2 = null;
                    }
                    if (fVar2 != null) {
                        i10 = (iVar10.j + fVar2.f19863v) - ((f) e0Var.get(0)).f19863v;
                    }
                }
                i12 = i10;
            }
            a1Var = null;
            j = j;
            iVar4 = new i(iVar.f19872d, iVar.f19907a, iVar.f19908b, iVar.f19873e, iVar.f19875g, j11, true, i12, iVar.k, iVar.f19878l, iVar.f19879m, iVar.f19880n, iVar.f19909c, iVar.f19881o, iVar.f19882p, iVar.f19883q, e0Var, iVar.f19885s, iVar.f19888v, iVar.f19886t);
        }
        this.f19846v = iVar4;
        uriBuild = this.f19843d;
        if (iVar4 != iVar10) {
            this.G = a1Var;
            this.f19848x = jElapsedRealtime;
            if (uriBuild.equals(cVar.H)) {
                if (cVar.I == null) {
                    cVar.J = !iVar4.f19881o;
                    cVar.K = iVar4.f19876h;
                }
                cVar.I = iVar4;
                cVar.F.w(iVar4);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).b();
            }
        } else if (!iVar4.f19881o) {
            size2 = j + ((long) iVar.f19884r.size());
            iVar5 = this.f19846v;
            if (size2 < iVar5.k) {
                a1Var2 = new a1();
                z7 = z6;
            } else {
                if (jElapsedRealtime - this.f19848x > je.e0.U(iVar5.f19879m) * 3.5d) {
                    a1Var2 = new a1();
                } else {
                    a1Var2 = a1Var;
                }
                z7 = false;
            }
            if (a1Var2 != null) {
                this.G = a1Var2;
                b0Var = new b0(z6 ? 1 : 0, 5, a1Var2);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).c(uriBuild, b0Var, z7);
                }
            }
        }
        iVar6 = this.f19846v;
        hVar = iVar6.f19888v;
        j13 = iVar6.f19879m;
        if (!hVar.f19871e) {
            if (iVar6 == iVar10) {
                j13 /= 2;
            }
            j5 = j13;
        }
        this.f19849y = je.e0.U(j5) + jElapsedRealtime;
        if (this.f19846v.f19880n == -9223372036854775807L) {
        }
        iVar7 = this.f19846v;
        if (iVar7.f19881o) {
            hVar2 = iVar7.f19888v;
            if (hVar2.f19867a == -9223372036854775807L) {
                builderBuildUpon = uriBuild.buildUpon();
                iVar8 = this.f19846v;
                if (iVar8.f19888v.f19871e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar8.k + ((long) iVar8.f19884r.size())));
                    iVar9 = this.f19846v;
                    if (iVar9.f19880n != -9223372036854775807L) {
                        e0Var4 = iVar9.f19885s;
                        size3 = e0Var4.size();
                        if (!e0Var4.isEmpty()) {
                            size3--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                    }
                }
                hVar3 = this.f19846v.f19888v;
                if (hVar3.f19867a != -9223372036854775807L) {
                    if (hVar3.f19868b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            } else {
                builderBuildUpon = uriBuild.buildUpon();
                iVar8 = this.f19846v;
                if (iVar8.f19888v.f19871e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar8.k + ((long) iVar8.f19884r.size())));
                    iVar9 = this.f19846v;
                    if (iVar9.f19880n != -9223372036854775807L) {
                        e0Var4 = iVar9.f19885s;
                        size3 = e0Var4.size();
                        if (!e0Var4.isEmpty()) {
                            size3--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                    }
                }
                hVar3 = this.f19846v.f19888v;
                if (hVar3.f19867a != -9223372036854775807L) {
                    if (hVar3.f19868b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            }
            c(uriBuild);
        }
    }

    @Override // he.f0
    public final void e(h0 h0Var, long j, long j5) {
        n0 n0Var = (n0) h0Var;
        m mVar = (m) n0Var.f10639x;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        if (mVar instanceof i) {
            d((i) mVar);
            this.H.f19855x.m(loadEventInfo, 4);
        } else {
            h1 h1VarB = h1.b("Loaded playlist has unexpected type.", null);
            this.G = h1VarB;
            this.H.f19855x.q(loadEventInfo, 4, h1VarB, true);
        }
        this.H.f19852i.getClass();
    }

    @Override // he.f0
    public final ad.f n(h0 h0Var, long j, long j5, IOException iOException, int i7) {
        n0 n0Var = (n0) h0Var;
        long j7 = n0Var.f10634d;
        int i10 = n0Var.f10636i;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        boolean z5 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z6 = iOException instanceof n;
        ad.f fVar = k0.f10619w;
        Uri uri2 = this.f19843d;
        c cVar = this.H;
        if (z5 || z6) {
            int i11 = iOException instanceof d0 ? ((d0) iOException).f10597v : Integer.MAX_VALUE;
            if (z6 || i11 == 400 || i11 == 503) {
                this.f19849y = SystemClock.elapsedRealtime();
                c(uri2);
                a1.d dVar = cVar.f19855x;
                int i12 = je.e0.f13788a;
                dVar.q(loadEventInfo, i10, iOException, true);
                return fVar;
            }
        }
        b0 b0Var = new b0(i7, 5, iOException);
        Iterator it = cVar.f19854w.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= !((q) it.next()).c(uri2, b0Var, false);
        }
        o9.d dVar2 = cVar.f19852i;
        if (z7) {
            dVar2.getClass();
            long jN = o9.d.n(b0Var);
            fVar = jN != -9223372036854775807L ? new ad.f(0, jN, false) : k0.f10620x;
        }
        boolean zA = fVar.a();
        cVar.f19855x.q(loadEventInfo, i10, iOException, !zA);
        if (!zA) {
            dVar2.getClass();
        }
        return fVar;
    }

    @Override // he.f0
    public final void p(h0 h0Var, long j, long j5, boolean z5) {
        n0 n0Var = (n0) h0Var;
        long j7 = n0Var.f10634d;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        c cVar = this.H;
        cVar.f19852i.getClass();
        cVar.f19855x.k(loadEventInfo, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
