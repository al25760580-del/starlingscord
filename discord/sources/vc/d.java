package vc;

import a5.b0;
import a5.o;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import ei.c0;
import ei.p;
import gc.g0;
import gc.h1;
import ic.o0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import je.e0;
import je.v;
import je.w;
import kotlin.jvm.internal.ByteCompanionObject;
import mc.i;
import pc.h;
import pc.k;
import pc.l;
import pc.m;
import pc.n;
import pc.u;
import pc.x;
import pc.y;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements k {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final byte[] f21584c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f21585d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f21586e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f21587f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final UUID f21588g0;
    public static final Map h0;
    public long A;
    public long B;
    public b0 C;
    public b0 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21589a;
    public boolean a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f21590b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public m f21591b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f21592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f21594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f21595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f21596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f21597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f21598i;
    public final w j;
    public final w k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f21599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w f21600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w f21601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f21602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f21603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f21604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f21605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f21606s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f21607t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f21608u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21609v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f21611x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f21612y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f21613z;

    static {
        int i7 = e0.f13788a;
        f21585d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(di.d.f7631c);
        f21586e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f21587f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f21588g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        g.j(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        g.j(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        h0 = Collections.unmodifiableMap(map);
    }

    public d(int i7) {
        b bVar = new b();
        this.f21604q = -1L;
        this.f21605r = -9223372036854775807L;
        this.f21606s = -9223372036854775807L;
        this.f21607t = -9223372036854775807L;
        this.f21613z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f21589a = bVar;
        bVar.f21556d = new pf.b(10, this);
        this.f21593d = (i7 & 1) == 0;
        this.f21590b = new e();
        this.f21592c = new SparseArray();
        this.f21596g = new w(4);
        this.f21597h = new w(ByteBuffer.allocate(4).putInt(-1).array());
        this.f21598i = new w(4);
        this.f21594e = new w(je.b.f13761d);
        this.f21595f = new w(4);
        this.j = new w();
        this.k = new w();
        this.f21599l = new w(8);
        this.f21600m = new w();
        this.f21601n = new w();
        this.L = new int[1];
    }

    public static byte[] h(long j, long j5, String str) {
        je.b.g(j != -9223372036854775807L);
        int i7 = (int) (j / 3600000000L);
        long j7 = j - (((long) i7) * 3600000000L);
        int i10 = (int) (j7 / 60000000);
        long j10 = j7 - (((long) i10) * 60000000);
        int i11 = (int) (j10 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j10 - (((long) i11) * 1000000)) / j5)));
        int i12 = e0.f13788a;
        return str2.getBytes(di.d.f7631c);
    }

    public final void a(int i7) {
        if (this.C == null || this.D == null) {
            throw h1.a("Element " + i7 + " must be in a Cues", null);
        }
    }

    public final void b(int i7) {
        if (this.f21608u != null) {
            return;
        }
        throw h1.a("Element " + i7 + " must be in a TrackEntry", null);
    }

    public final void c(c cVar, long j, int i7, int i10, int i11) {
        byte[] bArrH;
        int i12;
        int i13;
        y yVar = cVar.T;
        if (yVar != null) {
            yVar.b(cVar.X, j, i7, i10, i11, cVar.j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f21561b) || "S_TEXT/ASS".equals(cVar.f21561b) || "S_TEXT/WEBVTT".equals(cVar.f21561b)) {
                if (this.K > 1) {
                    je.b.N("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j5 = this.I;
                    if (j5 == -9223372036854775807L) {
                        je.b.N("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = cVar.f21561b;
                        w wVar = this.k;
                        byte[] bArr = wVar.f13860a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                bArrH = h(j5, 10000L, "%01d:%02d:%02d:%02d");
                                i12 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrH = h(j5, 1000L, "%02d:%02d:%02d.%03d");
                                i12 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrH = h(j5, 1000L, "%02d:%02d:%02d,%03d");
                                i12 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrH, 0, bArr, i12, bArrH.length);
                        for (int i14 = wVar.f13861b; i14 < wVar.f13862c; i14++) {
                            if (wVar.f13860a[i14] == 0) {
                                wVar.E(i14);
                                cVar.X.d(wVar.f13862c, wVar);
                                i13 = i10 + wVar.f13862c;
                            }
                        }
                        cVar.X.d(wVar.f13862c, wVar);
                        i13 = i10 + wVar.f13862c;
                    }
                }
                i13 = i10;
            } else {
                i13 = i10;
            }
            if ((i7 & 268435456) != 0) {
                int i15 = this.K;
                w wVar2 = this.f21601n;
                if (i15 > 1) {
                    wVar2.C(0);
                } else {
                    int i16 = wVar2.f13862c;
                    cVar.X.d(i16, wVar2);
                    i13 += i16;
                }
            }
            cVar.X.c(j, i7, i13, i11, cVar.j);
        }
        this.F = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:231:0x0394  */
    /* JADX WARN: Code duplicated, block: B:390:0x0622 A[PHI: r1 r35
      0x0622: PHI (r1v111 int) = (r1v78 int), (r1v109 int), (r1v113 int) binds: [B:499:0x088d, B:396:0x0637, B:387:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0622: PHI (r35v23 pc.m) = (r35v2 pc.m), (r35v22 pc.m), (r35v25 pc.m) binds: [B:499:0x088d, B:396:0x0637, B:387:0x0607] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:511:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:516:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:517:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:520:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:521:0x0901  */
    /* JADX WARN: Code duplicated, block: B:523:0x0907  */
    /* JADX WARN: Code duplicated, block: B:525:0x090b  */
    /* JADX WARN: Code duplicated, block: B:527:0x0910  */
    /* JADX WARN: Code duplicated, block: B:530:0x0918  */
    /* JADX WARN: Code duplicated, block: B:532:0x091d  */
    /* JADX WARN: Code duplicated, block: B:535:0x0922  */
    /* JADX WARN: Code duplicated, block: B:538:0x0930  */
    /* JADX WARN: Code duplicated, block: B:541:0x0936  */
    /* JADX WARN: Code duplicated, block: B:543:0x093c  */
    /* JADX WARN: Code duplicated, block: B:563:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:565:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:568:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:571:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:574:0x0a1d  */
    /* JADX WARN: Code duplicated, block: B:593:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:595:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:597:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:613:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r5v34, types: [pc.h] */
    @Override // pc.k
    public final int d(l lVar, n nVar) throws h1, EOFException, InterruptedIOException {
        l lVar2;
        boolean z5;
        int i7;
        boolean z6;
        String str;
        ?? r5;
        int i10;
        int iA;
        boolean z7;
        d dVar;
        byte b10;
        List listSingletonList;
        int iW;
        ?? r6;
        ArrayList arrayList;
        int i11;
        int i12;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        List listR;
        List list;
        String str3;
        int i13;
        g0 g0Var;
        boolean zJ;
        int i14;
        int i15;
        int i16;
        float f2;
        ke.b bVar;
        String str4;
        int iIntValue;
        int i17;
        byte[] bArr;
        int i18;
        int i19;
        int i20;
        String str5;
        o oVarG;
        u oVar;
        int i21;
        long[] jArrCopyOf;
        d dVar2 = this;
        dVar2.F = false;
        boolean z10 = true;
        boolean z11 = true;
        while (z11 && !dVar2.F) {
            b bVar2 = dVar2.f21589a;
            e eVar = bVar2.f21555c;
            ArrayDeque arrayDeque = bVar2.f21554b;
            je.b.l(bVar2.f21556d);
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || ((h) lVar).f17895v < aVar.f21552b) {
                    ?? r13 = 0;
                    if (bVar2.f21557e == 0) {
                        lVar2 = lVar;
                        int i22 = 4;
                        long jB = eVar.b(lVar2, true, false, 4);
                        if (jB == -2) {
                            byte[] bArr2 = bVar2.f21553a;
                            ((h) lVar2).f17897x = 0;
                            while (true) {
                                r5 = (h) lVar2;
                                r5.g(bArr2, r13, i22, r13);
                                byte b11 = bArr2[r13];
                                int i23 = 0;
                                while (true) {
                                    if (i23 >= 8) {
                                        i10 = -1;
                                    } else if ((e.f21614d[i23] & ((long) b11)) != 0) {
                                        i10 = i23 + 1;
                                    } else {
                                        i23++;
                                    }
                                }
                                if (i10 != -1 && i10 <= 4) {
                                    iA = (int) e.a(bArr2, i10, false);
                                    Object obj = bVar2.f21556d.f18027e;
                                    if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                    }
                                }
                                r5.u(1);
                                i22 = 4;
                                r13 = 0;
                            }
                            r5.u(i10);
                            jB = iA;
                        }
                        z5 = true;
                        if (jB == -1) {
                            z11 = false;
                            z6 = false;
                        } else {
                            bVar2.f21558f = (int) jB;
                            bVar2.f21557e = 1;
                        }
                    } else {
                        lVar2 = lVar;
                        z5 = true;
                    }
                    if (bVar2.f21557e == z5) {
                        bVar2.f21559g = eVar.b(lVar2, false, z5, 8);
                        bVar2.f21557e = 2;
                    }
                    pf.b bVar3 = bVar2.f21556d;
                    int i24 = bVar2.f21558f;
                    Object obj2 = bVar3.f18027e;
                    switch (i24) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case JfifUtil.MARKER_RST7 /* 215 */:
                        case 231:
                        case 238:
                        case 241:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i7 = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i7 = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case JfifUtil.MARKER_APP1 /* 225 */:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i7 = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i7 = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i7 = 5;
                            break;
                        default:
                            i7 = 0;
                            break;
                    }
                    if (i7 == 0) {
                        ((h) lVar2).u((int) bVar2.f21559g);
                        bVar2.f21557e = 0;
                        z10 = true;
                    } else if (i7 == 1) {
                        long j = ((h) lVar2).f17895v;
                        arrayDeque.push(new a(i24, bVar2.f21559g + j));
                        pf.b bVar4 = bVar2.f21556d;
                        int i25 = bVar2.f21558f;
                        long j5 = bVar2.f21559g;
                        d dVar3 = (d) bVar4.f18027e;
                        je.b.l(dVar3.f21591b0);
                        if (i25 != 160) {
                            if (i25 == 174) {
                                c cVar = new c();
                                cVar.f21570m = -1;
                                cVar.f21571n = -1;
                                cVar.f21572o = -1;
                                cVar.f21573p = -1;
                                cVar.f21574q = 0;
                                cVar.f21575r = -1;
                                cVar.f21576s = 0.0f;
                                cVar.f21577t = 0.0f;
                                cVar.f21578u = 0.0f;
                                cVar.f21579v = null;
                                cVar.f21580w = -1;
                                cVar.f21581x = false;
                                cVar.f21582y = -1;
                                cVar.f21583z = -1;
                                cVar.A = -1;
                                cVar.B = 1000;
                                cVar.C = h0.DEFAULT_DRAG_ANIMATION_DURATION;
                                cVar.D = -1.0f;
                                cVar.E = -1.0f;
                                cVar.F = -1.0f;
                                cVar.G = -1.0f;
                                cVar.H = -1.0f;
                                cVar.I = -1.0f;
                                cVar.J = -1.0f;
                                cVar.K = -1.0f;
                                cVar.L = -1.0f;
                                cVar.M = -1.0f;
                                cVar.O = 1;
                                cVar.P = -1;
                                cVar.Q = 8000;
                                cVar.R = 0L;
                                cVar.S = 0L;
                                cVar.V = true;
                                cVar.W = "eng";
                                dVar3.f21608u = cVar;
                            } else if (i25 == 187) {
                                z6 = false;
                                dVar3.E = false;
                            } else if (i25 == 19899) {
                                dVar3.f21610w = -1;
                                dVar3.f21611x = -1L;
                            } else if (i25 == 20533) {
                                dVar3.b(i25);
                                dVar3.f21608u.f21567h = true;
                            } else if (i25 == 21968) {
                                dVar3.b(i25);
                                dVar3.f21608u.f21581x = true;
                            } else if (i25 == 408125543) {
                                long j7 = dVar3.f21604q;
                                if (j7 != -1 && j7 != j) {
                                    throw h1.a("Multiple Segment elements not supported", null);
                                }
                                dVar3.f21604q = j;
                                dVar3.f21603p = j5;
                            } else if (i25 == 475249515) {
                                dVar3.C = new b0((char) 0, 8);
                                dVar3.D = new b0((char) 0, 8);
                            } else if (i25 == 524531317 && !dVar3.f21609v) {
                                if (!dVar3.f21593d || dVar3.f21613z == -1) {
                                    dVar3.f21591b0.c(new pc.o(dVar3.f21607t));
                                    dVar3.f21609v = true;
                                } else {
                                    dVar3.f21612y = true;
                                }
                            }
                            z6 = false;
                        } else {
                            z6 = false;
                            dVar3.Q = false;
                            dVar3.R = 0L;
                        }
                        bVar2.f21557e = z6 ? 1 : 0;
                    } else if (i7 == 2) {
                        long j10 = bVar2.f21559g;
                        if (j10 > 8) {
                            throw h1.a("Invalid integer size: " + bVar2.f21559g, null);
                        }
                        bVar3.m(i24, bVar2.a(lVar2, (int) j10));
                        z6 = false;
                        bVar2.f21557e = 0;
                    } else if (i7 == 3) {
                        long j11 = bVar2.f21559g;
                        if (j11 > 2147483647L) {
                            throw h1.a("String element size: " + bVar2.f21559g, null);
                        }
                        int i26 = (int) j11;
                        if (i26 == 0) {
                            str = "";
                        } else {
                            byte[] bArr3 = new byte[i26];
                            ((h) lVar2).a(bArr3, 0, i26, false);
                            while (i26 > 0 && bArr3[i26 - 1] == 0) {
                                i26--;
                            }
                            str = new String(bArr3, 0, i26);
                        }
                        d dVar4 = (d) bVar3.f18027e;
                        if (i24 == 134) {
                            dVar4.b(i24);
                            dVar4.f21608u.f21561b = str;
                        } else if (i24 != 17026) {
                            if (i24 == 21358) {
                                dVar4.b(i24);
                                dVar4.f21608u.f21560a = str;
                            } else if (i24 == 2274716) {
                                dVar4.b(i24);
                                dVar4.f21608u.W = str;
                            }
                        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                            throw h1.a("DocType " + str + " not supported", null);
                        }
                        z6 = false;
                        bVar2.f21557e = 0;
                    } else if (i7 == 4) {
                        bVar3.c(i24, (int) bVar2.f21559g, lVar2);
                        z6 = false;
                        bVar2.f21557e = 0;
                    } else {
                        if (i7 != 5) {
                            throw h1.a("Invalid element type " + i7, null);
                        }
                        long j12 = bVar2.f21559g;
                        if (j12 != 4 && j12 != 8) {
                            throw h1.a("Invalid float size: " + bVar2.f21559g, null);
                        }
                        int i27 = (int) j12;
                        long jA = bVar2.a(lVar2, i27);
                        double dIntBitsToFloat = i27 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA);
                        d dVar5 = (d) bVar3.f18027e;
                        if (i24 == 181) {
                            dVar5.b(i24);
                            dVar5.f21608u.Q = (int) dIntBitsToFloat;
                        } else if (i24 != 17545) {
                            switch (i24) {
                                case 21969:
                                    dVar5.b(i24);
                                    dVar5.f21608u.D = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    dVar5.b(i24);
                                    dVar5.f21608u.E = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    dVar5.b(i24);
                                    dVar5.f21608u.F = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    dVar5.b(i24);
                                    dVar5.f21608u.G = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    dVar5.b(i24);
                                    dVar5.f21608u.H = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    dVar5.b(i24);
                                    dVar5.f21608u.I = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    dVar5.b(i24);
                                    dVar5.f21608u.J = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    dVar5.b(i24);
                                    dVar5.f21608u.K = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    dVar5.b(i24);
                                    dVar5.f21608u.L = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    dVar5.b(i24);
                                    dVar5.f21608u.M = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i24) {
                                        case 30323:
                                            dVar5.b(i24);
                                            dVar5.f21608u.f21576s = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            dVar5.b(i24);
                                            dVar5.f21608u.f21577t = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            dVar5.b(i24);
                                            dVar5.f21608u.f21578u = (float) dIntBitsToFloat;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            dVar5.f21606s = (long) dIntBitsToFloat;
                        }
                        z6 = false;
                        bVar2.f21557e = 0;
                    }
                } else {
                    pf.b bVar5 = bVar2.f21556d;
                    int i28 = ((a) arrayDeque.pop()).f21551a;
                    d dVar6 = (d) bVar5.f18027e;
                    SparseArray sparseArray = dVar6.f21592c;
                    je.b.l(dVar6.f21591b0);
                    if (i28 == 160) {
                        if (dVar6.G == 2) {
                            c cVar2 = (c) sparseArray.get(dVar6.M);
                            cVar2.X.getClass();
                            if (dVar6.R > 0 && "A_OPUS".equals(cVar2.f21561b)) {
                                w wVar = dVar6.f21601n;
                                byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(dVar6.R).array();
                                wVar.getClass();
                                wVar.D(bArrArray, bArrArray.length);
                            }
                            int i29 = 0;
                            for (int i30 = 0; i30 < dVar6.K; i30++) {
                                i29 += dVar6.L[i30];
                            }
                            int i31 = 0;
                            while (i31 < dVar6.K) {
                                long j13 = dVar6.H + ((long) ((cVar2.f21564e * i31) / 1000));
                                int i32 = dVar6.O;
                                if (i31 == 0 && !dVar6.Q) {
                                    i32 |= 1;
                                }
                                int i33 = dVar6.L[i31];
                                int i34 = i29 - i33;
                                dVar6.c(cVar2, j13, i32, i33, i34);
                                i31++;
                                i29 = i34;
                            }
                            z6 = false;
                            dVar6.G = 0;
                        }
                        lVar2 = lVar;
                    } else if (i28 == 174) {
                        c cVar3 = dVar6.f21608u;
                        je.b.l(cVar3);
                        String str6 = cVar3.f21561b;
                        if (str6 == null) {
                            throw h1.a("CodecId is missing in TrackEntry element", null);
                        }
                        switch (str6) {
                            case "V_MPEG4/ISO/AP":
                            case "V_MPEG4/ISO/SP":
                            case "A_MS/ACM":
                            case "A_TRUEHD":
                            case "A_VORBIS":
                            case "A_MPEG/L2":
                            case "A_MPEG/L3":
                            case "V_MS/VFW/FOURCC":
                            case "S_DVBSUB":
                            case "V_MPEG4/ISO/ASP":
                            case "V_MPEG4/ISO/AVC":
                            case "S_VOBSUB":
                            case "A_DTS/LOSSLESS":
                            case "A_AAC":
                            case "A_AC3":
                            case "A_DTS":
                            case "V_AV1":
                            case "V_VP8":
                            case "V_VP9":
                            case "S_HDMV/PGS":
                            case "V_THEORA":
                            case "A_DTS/EXPRESS":
                            case "A_PCM/FLOAT/IEEE":
                            case "A_PCM/INT/BIG":
                            case "A_PCM/INT/LIT":
                            case "S_TEXT/ASS":
                            case "V_MPEGH/ISO/HEVC":
                            case "S_TEXT/WEBVTT":
                            case "S_TEXT/UTF8":
                            case "V_MPEG2":
                            case "A_EAC3":
                            case "A_FLAC":
                            case "A_OPUS":
                                m mVar = dVar6.f21591b0;
                                int i35 = cVar3.f21562c;
                                switch (str6) {
                                    case "V_MPEG4/ISO/AP":
                                        b10 = 0;
                                        break;
                                    case "V_MPEG4/ISO/SP":
                                        b10 = 1;
                                        break;
                                    case "A_MS/ACM":
                                        b10 = 2;
                                        break;
                                    case "A_TRUEHD":
                                        b10 = 3;
                                        break;
                                    case "A_VORBIS":
                                        b10 = 4;
                                        break;
                                    case "A_MPEG/L2":
                                        b10 = 5;
                                        break;
                                    case "A_MPEG/L3":
                                        b10 = 6;
                                        break;
                                    case "V_MS/VFW/FOURCC":
                                        b10 = 7;
                                        break;
                                    case "S_DVBSUB":
                                        b10 = 8;
                                        break;
                                    case "V_MPEG4/ISO/ASP":
                                        b10 = 9;
                                        break;
                                    case "V_MPEG4/ISO/AVC":
                                        b10 = 10;
                                        break;
                                    case "S_VOBSUB":
                                        b10 = 11;
                                        break;
                                    case "A_DTS/LOSSLESS":
                                        b10 = 12;
                                        break;
                                    case "A_AAC":
                                        b10 = 13;
                                        break;
                                    case "A_AC3":
                                        b10 = 14;
                                        break;
                                    case "A_DTS":
                                        b10 = 15;
                                        break;
                                    case "V_AV1":
                                        b10 = 16;
                                        break;
                                    case "V_VP8":
                                        b10 = 17;
                                        break;
                                    case "V_VP9":
                                        b10 = 18;
                                        break;
                                    case "S_HDMV/PGS":
                                        b10 = 19;
                                        break;
                                    case "V_THEORA":
                                        b10 = 20;
                                        break;
                                    case "A_DTS/EXPRESS":
                                        b10 = 21;
                                        break;
                                    case "A_PCM/FLOAT/IEEE":
                                        b10 = 22;
                                        break;
                                    case "A_PCM/INT/BIG":
                                        b10 = 23;
                                        break;
                                    case "A_PCM/INT/LIT":
                                        b10 = 24;
                                        break;
                                    case "S_TEXT/ASS":
                                        b10 = 25;
                                        break;
                                    case "V_MPEGH/ISO/HEVC":
                                        b10 = 26;
                                        break;
                                    case "S_TEXT/WEBVTT":
                                        b10 = 27;
                                        break;
                                    case "S_TEXT/UTF8":
                                        b10 = 28;
                                        break;
                                    case "V_MPEG2":
                                        b10 = 29;
                                        break;
                                    case "A_EAC3":
                                        b10 = 30;
                                        break;
                                    case "A_FLAC":
                                        b10 = 31;
                                        break;
                                    case "A_OPUS":
                                        b10 = 32;
                                        break;
                                    default:
                                        b10 = -1;
                                        break;
                                }
                                String str7 = "video/x-unknown";
                                switch (b10) {
                                    case 0:
                                    case 1:
                                    case 9:
                                        byte[] bArr4 = cVar3.k;
                                        listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                        str7 = "video/mp4v-es";
                                        listR = listSingletonList;
                                        i12 = -1;
                                        iW = -1;
                                        str2 = null;
                                        if (cVar3.N != null && (oVarG = o.g(new w(cVar3.N))) != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z12 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i36 = (z12 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15 || (i18 = cVar3.f21573p) == i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = (cVar3.f21571n * i16) / (cVar3.f21570m * i18);
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f || cVar3.E == -1.0f || cVar3.F == -1.0f || cVar3.G == -1.0f || cVar3.H == -1.0f || cVar3.I == -1.0f || cVar3.J == -1.0f || cVar3.K == -1.0f || cVar3.L == -1.0f || cVar3.M == -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = new byte[25];
                                                    ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                    byteBufferOrder.put((byte) 0);
                                                    byteBufferOrder.putShort((short) ((cVar3.D * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((cVar3.E * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((cVar3.F * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((cVar3.G * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((cVar3.H * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((cVar3.I * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((cVar3.J * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((cVar3.K * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) (cVar3.L + 0.5f));
                                                    byteBufferOrder.putShort((short) (cVar3.M + 0.5f));
                                                    byteBufferOrder.putShort((short) cVar3.B);
                                                    byteBufferOrder.putShort((short) cVar3.C);
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null && map.containsKey(str4)) {
                                                iIntValue = ((Integer) map.get(cVar3.f21560a)).intValue();
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0 || Float.compare(cVar3.f21576s, 0.0f) != 0 || Float.compare(cVar3.f21577t, 0.0f) != 0) {
                                                i17 = iIntValue;
                                            } else if (Float.compare(cVar3.f21578u, 0.0f) == 0) {
                                                i17 = 0;
                                            } else if (Float.compare(cVar3.f21577t, 90.0f) == 0) {
                                                i17 = 90;
                                            } else if (Float.compare(cVar3.f21577t, -180.0f) == 0 || Float.compare(cVar3.f21577t, 180.0f) == 0) {
                                                i17 = 180;
                                            } else if (Float.compare(cVar3.f21577t, -90.0f) == 0) {
                                                i17 = 270;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7) && !"text/x-ssa".equals(str7) && !"text/vtt".equals(str7) && !"application/vobsub".equals(str7) && !"application/pgs".equals(str7) && !"application/dvbsubs".equals(str7)) {
                                                throw h1.a("Unexpected MIME type.", null);
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null && !map.containsKey(str5)) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i36;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format = new Format(g0Var);
                                        x xVarX = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX;
                                        xVarX.e(format);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 2:
                                        mVar = mVar;
                                        w wVar2 = new w(cVar3.a(cVar3.f21561b));
                                        try {
                                            int iN = wVar2.n();
                                            if (iN != 1) {
                                                if (iN == 65534) {
                                                    wVar2.F(24);
                                                    long jO = wVar2.o();
                                                    UUID uuid = f21588g0;
                                                    if (jO != uuid.getMostSignificantBits() || wVar2.o() != uuid.getLeastSignificantBits()) {
                                                    }
                                                    str7 = "audio/x-unknown";
                                                    i12 = -1;
                                                    iW = -1;
                                                    listR = null;
                                                    str2 = null;
                                                    if (cVar3.N != null) {
                                                        str2 = oVarG.f236a;
                                                        str7 = "video/dolby-vision";
                                                    }
                                                    boolean z13 = cVar3.V;
                                                    if (cVar3.U) {
                                                        i13 = 2;
                                                    } else {
                                                        i13 = 0;
                                                    }
                                                    int i37 = (z13 ? 1 : 0) | i13;
                                                    g0Var = new g0();
                                                    zJ = je.o.j(str7);
                                                    Map map2 = h0;
                                                    if (zJ) {
                                                        g0Var.f9656x = cVar3.O;
                                                        g0Var.f9657y = cVar3.Q;
                                                        g0Var.f9658z = iW;
                                                        i14 = 1;
                                                    } else if (je.o.l(str7)) {
                                                        if (cVar3.f21574q == 0) {
                                                            i19 = cVar3.f21572o;
                                                            i15 = -1;
                                                            if (i19 == -1) {
                                                                i19 = cVar3.f21570m;
                                                            }
                                                            cVar3.f21572o = i19;
                                                            i20 = cVar3.f21573p;
                                                            if (i20 == -1) {
                                                                i20 = cVar3.f21571n;
                                                            }
                                                            cVar3.f21573p = i20;
                                                        } else {
                                                            i15 = -1;
                                                        }
                                                        i16 = cVar3.f21572o;
                                                        if (i16 != i15) {
                                                            f2 = -1.0f;
                                                        } else {
                                                            f2 = -1.0f;
                                                        }
                                                        if (cVar3.f21581x) {
                                                            if (cVar3.D != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                                        } else {
                                                            bVar = null;
                                                        }
                                                        str4 = cVar3.f21560a;
                                                        if (str4 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (cVar3.f21575r == 0) {
                                                            i17 = iIntValue;
                                                        } else {
                                                            i17 = iIntValue;
                                                        }
                                                        g0Var.f9648p = cVar3.f21570m;
                                                        g0Var.f9649q = cVar3.f21571n;
                                                        g0Var.f9652t = f2;
                                                        g0Var.f9651s = i17;
                                                        g0Var.f9653u = cVar3.f21579v;
                                                        g0Var.f9654v = cVar3.f21580w;
                                                        g0Var.f9655w = bVar;
                                                        i14 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str7)) {
                                                        }
                                                        i14 = 3;
                                                    }
                                                    str5 = cVar3.f21560a;
                                                    if (str5 != null) {
                                                        g0Var.f9636b = cVar3.f21560a;
                                                    }
                                                    g0Var.f9635a = Integer.toString(i35);
                                                    g0Var.k = str7;
                                                    g0Var.f9644l = i12;
                                                    g0Var.f9637c = cVar3.W;
                                                    g0Var.f9638d = i37;
                                                    g0Var.f9645m = listR;
                                                    g0Var.f9642h = str2;
                                                    g0Var.f9646n = cVar3.f21569l;
                                                    Format format2 = new Format(g0Var);
                                                    x xVarX2 = mVar.x(cVar3.f21562c, i14);
                                                    cVar3.X = xVarX2;
                                                    xVarX2.e(format2);
                                                    sparseArray.put(cVar3.f21562c, cVar3);
                                                    dVar6 = dVar6;
                                                }
                                                je.b.N("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                str7 = "audio/x-unknown";
                                                i12 = -1;
                                                iW = -1;
                                                listR = null;
                                                str2 = null;
                                                if (cVar3.N != null) {
                                                    str2 = oVarG.f236a;
                                                    str7 = "video/dolby-vision";
                                                }
                                                boolean z14 = cVar3.V;
                                                if (cVar3.U) {
                                                    i13 = 2;
                                                } else {
                                                    i13 = 0;
                                                }
                                                int i38 = (z14 ? 1 : 0) | i13;
                                                g0Var = new g0();
                                                zJ = je.o.j(str7);
                                                Map map3 = h0;
                                                if (zJ) {
                                                    g0Var.f9656x = cVar3.O;
                                                    g0Var.f9657y = cVar3.Q;
                                                    g0Var.f9658z = iW;
                                                    i14 = 1;
                                                } else if (je.o.l(str7)) {
                                                    if (cVar3.f21574q == 0) {
                                                        i19 = cVar3.f21572o;
                                                        i15 = -1;
                                                        if (i19 == -1) {
                                                            i19 = cVar3.f21570m;
                                                        }
                                                        cVar3.f21572o = i19;
                                                        i20 = cVar3.f21573p;
                                                        if (i20 == -1) {
                                                            i20 = cVar3.f21571n;
                                                        }
                                                        cVar3.f21573p = i20;
                                                    } else {
                                                        i15 = -1;
                                                    }
                                                    i16 = cVar3.f21572o;
                                                    if (i16 != i15) {
                                                        f2 = -1.0f;
                                                    } else {
                                                        f2 = -1.0f;
                                                    }
                                                    if (cVar3.f21581x) {
                                                        if (cVar3.D != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                                    } else {
                                                        bVar = null;
                                                    }
                                                    str4 = cVar3.f21560a;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (cVar3.f21575r == 0) {
                                                        i17 = iIntValue;
                                                    } else {
                                                        i17 = iIntValue;
                                                    }
                                                    g0Var.f9648p = cVar3.f21570m;
                                                    g0Var.f9649q = cVar3.f21571n;
                                                    g0Var.f9652t = f2;
                                                    g0Var.f9651s = i17;
                                                    g0Var.f9653u = cVar3.f21579v;
                                                    g0Var.f9654v = cVar3.f21580w;
                                                    g0Var.f9655w = bVar;
                                                    i14 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str7)) {
                                                    }
                                                    i14 = 3;
                                                }
                                                str5 = cVar3.f21560a;
                                                if (str5 != null) {
                                                    g0Var.f9636b = cVar3.f21560a;
                                                }
                                                g0Var.f9635a = Integer.toString(i35);
                                                g0Var.k = str7;
                                                g0Var.f9644l = i12;
                                                g0Var.f9637c = cVar3.W;
                                                g0Var.f9638d = i38;
                                                g0Var.f9645m = listR;
                                                g0Var.f9642h = str2;
                                                g0Var.f9646n = cVar3.f21569l;
                                                Format format3 = new Format(g0Var);
                                                x xVarX3 = mVar.x(cVar3.f21562c, i14);
                                                cVar3.X = xVarX3;
                                                xVarX3.e(format3);
                                                sparseArray.put(cVar3.f21562c, cVar3);
                                                dVar6 = dVar6;
                                                break;
                                            }
                                            iW = e0.w(cVar3.P);
                                            if (iW == 0) {
                                                je.b.N("MatroskaExtractor", "Unsupported PCM bit depth: " + cVar3.P + ". Setting mimeType to audio/x-unknown");
                                                str7 = "audio/x-unknown";
                                                i12 = -1;
                                                iW = -1;
                                            } else {
                                                str7 = "audio/raw";
                                                i12 = -1;
                                            }
                                            listR = null;
                                            str2 = null;
                                            if (cVar3.N != null) {
                                                str2 = oVarG.f236a;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z15 = cVar3.V;
                                            if (cVar3.U) {
                                                i13 = 2;
                                            } else {
                                                i13 = 0;
                                            }
                                            int i39 = (z15 ? 1 : 0) | i13;
                                            g0Var = new g0();
                                            zJ = je.o.j(str7);
                                            Map map4 = h0;
                                            if (zJ) {
                                                g0Var.f9656x = cVar3.O;
                                                g0Var.f9657y = cVar3.Q;
                                                g0Var.f9658z = iW;
                                                i14 = 1;
                                            } else if (je.o.l(str7)) {
                                                if (cVar3.f21574q == 0) {
                                                    i19 = cVar3.f21572o;
                                                    i15 = -1;
                                                    if (i19 == -1) {
                                                        i19 = cVar3.f21570m;
                                                    }
                                                    cVar3.f21572o = i19;
                                                    i20 = cVar3.f21573p;
                                                    if (i20 == -1) {
                                                        i20 = cVar3.f21571n;
                                                    }
                                                    cVar3.f21573p = i20;
                                                } else {
                                                    i15 = -1;
                                                }
                                                i16 = cVar3.f21572o;
                                                if (i16 != i15) {
                                                    f2 = -1.0f;
                                                } else {
                                                    f2 = -1.0f;
                                                }
                                                if (cVar3.f21581x) {
                                                    if (cVar3.D != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                                } else {
                                                    bVar = null;
                                                }
                                                str4 = cVar3.f21560a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar3.f21575r == 0) {
                                                    i17 = iIntValue;
                                                } else {
                                                    i17 = iIntValue;
                                                }
                                                g0Var.f9648p = cVar3.f21570m;
                                                g0Var.f9649q = cVar3.f21571n;
                                                g0Var.f9652t = f2;
                                                g0Var.f9651s = i17;
                                                g0Var.f9653u = cVar3.f21579v;
                                                g0Var.f9654v = cVar3.f21580w;
                                                g0Var.f9655w = bVar;
                                                i14 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i14 = 3;
                                            }
                                            str5 = cVar3.f21560a;
                                            if (str5 != null) {
                                                g0Var.f9636b = cVar3.f21560a;
                                            }
                                            g0Var.f9635a = Integer.toString(i35);
                                            g0Var.k = str7;
                                            g0Var.f9644l = i12;
                                            g0Var.f9637c = cVar3.W;
                                            g0Var.f9638d = i39;
                                            g0Var.f9645m = listR;
                                            g0Var.f9642h = str2;
                                            g0Var.f9646n = cVar3.f21569l;
                                            Format format4 = new Format(g0Var);
                                            x xVarX4 = mVar.x(cVar3.f21562c, i14);
                                            cVar3.X = xVarX4;
                                            xVarX4.e(format4);
                                            sparseArray.put(cVar3.f21562c, cVar3);
                                            dVar6 = dVar6;
                                        } catch (ArrayIndexOutOfBoundsException unused) {
                                            throw h1.a("Error parsing MS/ACM codec private", null);
                                        }
                                        break;
                                    case 3:
                                        mVar = mVar;
                                        cVar3.T = new y();
                                        str7 = "audio/true-hd";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z16 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i310 = (z16 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map5 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i310;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format5 = new Format(g0Var);
                                        x xVarX5 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX5;
                                        xVarX5.e(format5);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 4:
                                        byte[] bArrA = cVar3.a(str6);
                                        try {
                                            r6 = 2;
                                            try {
                                                if (bArrA[0] != 2) {
                                                    throw h1.a("Error parsing vorbis codec private", null);
                                                }
                                                int i40 = 0;
                                                int i41 = 1;
                                                while (true) {
                                                    int i42 = bArrA[i41] & 255;
                                                    if (i42 != 255) {
                                                        int i43 = i41 + 1;
                                                        int i44 = i40 + i42;
                                                        int i45 = 0;
                                                        while (true) {
                                                            int i46 = bArrA[i43] & 255;
                                                            if (i46 != 255) {
                                                                int i47 = i43 + 1;
                                                                int i48 = i45 + i46;
                                                                if (bArrA[i47] != 1) {
                                                                    throw h1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr5 = new byte[i44];
                                                                System.arraycopy(bArrA, i47, bArr5, 0, i44);
                                                                int i49 = i47 + i44;
                                                                if (bArrA[i49] != 3) {
                                                                    throw h1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                int i50 = i49 + i48;
                                                                if (bArrA[i50] != 5) {
                                                                    throw h1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr6 = new byte[bArrA.length - i50];
                                                                System.arraycopy(bArrA, i50, bArr6, 0, bArrA.length - i50);
                                                                arrayList = new ArrayList(2);
                                                                arrayList.add(bArr5);
                                                                arrayList.add(bArr6);
                                                                str7 = "audio/vorbis";
                                                                i11 = 8192;
                                                                listR = arrayList;
                                                                i12 = i11;
                                                                iW = -1;
                                                                str2 = null;
                                                                if (cVar3.N != null) {
                                                                    str2 = oVarG.f236a;
                                                                    str7 = "video/dolby-vision";
                                                                }
                                                                boolean z17 = cVar3.V;
                                                                if (cVar3.U) {
                                                                    i13 = 2;
                                                                } else {
                                                                    i13 = 0;
                                                                }
                                                                int i311 = (z17 ? 1 : 0) | i13;
                                                                g0Var = new g0();
                                                                zJ = je.o.j(str7);
                                                                Map map6 = h0;
                                                                if (zJ) {
                                                                    g0Var.f9656x = cVar3.O;
                                                                    g0Var.f9657y = cVar3.Q;
                                                                    g0Var.f9658z = iW;
                                                                    i14 = 1;
                                                                } else if (je.o.l(str7)) {
                                                                    if (cVar3.f21574q == 0) {
                                                                        i19 = cVar3.f21572o;
                                                                        i15 = -1;
                                                                        if (i19 == -1) {
                                                                            i19 = cVar3.f21570m;
                                                                        }
                                                                        cVar3.f21572o = i19;
                                                                        i20 = cVar3.f21573p;
                                                                        if (i20 == -1) {
                                                                            i20 = cVar3.f21571n;
                                                                        }
                                                                        cVar3.f21573p = i20;
                                                                    } else {
                                                                        i15 = -1;
                                                                    }
                                                                    i16 = cVar3.f21572o;
                                                                    if (i16 != i15) {
                                                                        f2 = -1.0f;
                                                                    } else {
                                                                        f2 = -1.0f;
                                                                    }
                                                                    if (cVar3.f21581x) {
                                                                        if (cVar3.D != -1.0f) {
                                                                            bArr = null;
                                                                        } else {
                                                                            bArr = null;
                                                                        }
                                                                        bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                                                    } else {
                                                                        bVar = null;
                                                                    }
                                                                    str4 = cVar3.f21560a;
                                                                    if (str4 == null) {
                                                                        iIntValue = -1;
                                                                    } else {
                                                                        iIntValue = -1;
                                                                    }
                                                                    if (cVar3.f21575r == 0) {
                                                                        i17 = iIntValue;
                                                                    } else {
                                                                        i17 = iIntValue;
                                                                    }
                                                                    g0Var.f9648p = cVar3.f21570m;
                                                                    g0Var.f9649q = cVar3.f21571n;
                                                                    g0Var.f9652t = f2;
                                                                    g0Var.f9651s = i17;
                                                                    g0Var.f9653u = cVar3.f21579v;
                                                                    g0Var.f9654v = cVar3.f21580w;
                                                                    g0Var.f9655w = bVar;
                                                                    i14 = 2;
                                                                } else {
                                                                    if ("application/x-subrip".equals(str7)) {
                                                                    }
                                                                    i14 = 3;
                                                                }
                                                                str5 = cVar3.f21560a;
                                                                if (str5 != null) {
                                                                    g0Var.f9636b = cVar3.f21560a;
                                                                }
                                                                g0Var.f9635a = Integer.toString(i35);
                                                                g0Var.k = str7;
                                                                g0Var.f9644l = i12;
                                                                g0Var.f9637c = cVar3.W;
                                                                g0Var.f9638d = i311;
                                                                g0Var.f9645m = listR;
                                                                g0Var.f9642h = str2;
                                                                g0Var.f9646n = cVar3.f21569l;
                                                                Format format6 = new Format(g0Var);
                                                                x xVarX6 = mVar.x(cVar3.f21562c, i14);
                                                                cVar3.X = xVarX6;
                                                                xVarX6.e(format6);
                                                                sparseArray.put(cVar3.f21562c, cVar3);
                                                                dVar6 = dVar6;
                                                            } else {
                                                                i45 += 255;
                                                                i43++;
                                                            }
                                                        }
                                                    } else {
                                                        i40 += 255;
                                                        i41++;
                                                    }
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                throw h1.a("Error parsing vorbis codec private", r6);
                                            }
                                        } catch (ArrayIndexOutOfBoundsException unused3) {
                                            r6 = 0;
                                        }
                                        break;
                                    case 5:
                                        str7 = "audio/mpeg-L2";
                                        i12 = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z18 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i312 = (z18 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map7 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i312;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format7 = new Format(g0Var);
                                        x xVarX7 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX7;
                                        xVarX7.e(format7);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 6:
                                        str7 = "audio/mpeg";
                                        i12 = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z19 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i313 = (z19 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map8 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i313;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format8 = new Format(g0Var);
                                        x xVarX8 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX8;
                                        xVarX8.e(format8);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 7:
                                        mVar = mVar;
                                        w wVar3 = new w(cVar3.a(cVar3.f21561b));
                                        try {
                                            wVar3.G(16);
                                            long jL = wVar3.l();
                                            if (jL != 1482049860) {
                                                if (jL != 859189832) {
                                                    if (jL == 826496599) {
                                                        int i51 = wVar3.f13861b + 20;
                                                        byte[] bArr7 = wVar3.f13860a;
                                                        while (true) {
                                                            if (i51 >= bArr7.length - 4) {
                                                                runtimeException = null;
                                                                throw h1.a("Failed to find FourCC VC1 initialization data", null);
                                                            }
                                                            if (bArr7[i51] == 0 && bArr7[i51 + 1] == 0 && bArr7[i51 + 2] == 1) {
                                                                if (bArr7[i51 + 3] == 15) {
                                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr7, i51, bArr7.length)));
                                                                }
                                                            }
                                                            i51++;
                                                            throw h1.a("Error parsing FourCC private data", runtimeException);
                                                        }
                                                    }
                                                    je.b.N("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str2 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                    str7 = (String) pair.first;
                                                    listR = (List) pair.second;
                                                    i12 = -1;
                                                    iW = -1;
                                                    if (cVar3.N != null) {
                                                        str2 = oVarG.f236a;
                                                        str7 = "video/dolby-vision";
                                                    }
                                                    boolean z110 = cVar3.V;
                                                    if (cVar3.U) {
                                                        i13 = 2;
                                                    } else {
                                                        i13 = 0;
                                                    }
                                                    int i314 = (z110 ? 1 : 0) | i13;
                                                    g0Var = new g0();
                                                    zJ = je.o.j(str7);
                                                    Map map9 = h0;
                                                    if (zJ) {
                                                        g0Var.f9656x = cVar3.O;
                                                        g0Var.f9657y = cVar3.Q;
                                                        g0Var.f9658z = iW;
                                                        i14 = 1;
                                                    } else if (je.o.l(str7)) {
                                                        if (cVar3.f21574q == 0) {
                                                            i19 = cVar3.f21572o;
                                                            i15 = -1;
                                                            if (i19 == -1) {
                                                                i19 = cVar3.f21570m;
                                                            }
                                                            cVar3.f21572o = i19;
                                                            i20 = cVar3.f21573p;
                                                            if (i20 == -1) {
                                                                i20 = cVar3.f21571n;
                                                            }
                                                            cVar3.f21573p = i20;
                                                        } else {
                                                            i15 = -1;
                                                        }
                                                        i16 = cVar3.f21572o;
                                                        if (i16 != i15) {
                                                            f2 = -1.0f;
                                                        } else {
                                                            f2 = -1.0f;
                                                        }
                                                        if (cVar3.f21581x) {
                                                            if (cVar3.D != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                                        } else {
                                                            bVar = null;
                                                        }
                                                        str4 = cVar3.f21560a;
                                                        if (str4 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (cVar3.f21575r == 0) {
                                                            i17 = iIntValue;
                                                        } else {
                                                            i17 = iIntValue;
                                                        }
                                                        g0Var.f9648p = cVar3.f21570m;
                                                        g0Var.f9649q = cVar3.f21571n;
                                                        g0Var.f9652t = f2;
                                                        g0Var.f9651s = i17;
                                                        g0Var.f9653u = cVar3.f21579v;
                                                        g0Var.f9654v = cVar3.f21580w;
                                                        g0Var.f9655w = bVar;
                                                        i14 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str7)) {
                                                        }
                                                        i14 = 3;
                                                    }
                                                    str5 = cVar3.f21560a;
                                                    if (str5 != null) {
                                                        g0Var.f9636b = cVar3.f21560a;
                                                    }
                                                    g0Var.f9635a = Integer.toString(i35);
                                                    g0Var.k = str7;
                                                    g0Var.f9644l = i12;
                                                    g0Var.f9637c = cVar3.W;
                                                    g0Var.f9638d = i314;
                                                    g0Var.f9645m = listR;
                                                    g0Var.f9642h = str2;
                                                    g0Var.f9646n = cVar3.f21569l;
                                                    Format format9 = new Format(g0Var);
                                                    x xVarX9 = mVar.x(cVar3.f21562c, i14);
                                                    cVar3.X = xVarX9;
                                                    xVarX9.e(format9);
                                                    sparseArray.put(cVar3.f21562c, cVar3);
                                                    dVar6 = dVar6;
                                                } else {
                                                    pair = new Pair("video/3gpp", null);
                                                }
                                                break;
                                            } else {
                                                runtimeException = null;
                                                try {
                                                    pair = new Pair("video/divx", null);
                                                } catch (ArrayIndexOutOfBoundsException unused4) {
                                                }
                                            }
                                            str2 = null;
                                            str7 = (String) pair.first;
                                            listR = (List) pair.second;
                                            i12 = -1;
                                            iW = -1;
                                            if (cVar3.N != null) {
                                                str2 = oVarG.f236a;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z111 = cVar3.V;
                                            if (cVar3.U) {
                                                i13 = 2;
                                            } else {
                                                i13 = 0;
                                            }
                                            int i315 = (z111 ? 1 : 0) | i13;
                                            g0Var = new g0();
                                            zJ = je.o.j(str7);
                                            Map map10 = h0;
                                            if (zJ) {
                                                g0Var.f9656x = cVar3.O;
                                                g0Var.f9657y = cVar3.Q;
                                                g0Var.f9658z = iW;
                                                i14 = 1;
                                            } else if (je.o.l(str7)) {
                                                if (cVar3.f21574q == 0) {
                                                    i19 = cVar3.f21572o;
                                                    i15 = -1;
                                                    if (i19 == -1) {
                                                        i19 = cVar3.f21570m;
                                                    }
                                                    cVar3.f21572o = i19;
                                                    i20 = cVar3.f21573p;
                                                    if (i20 == -1) {
                                                        i20 = cVar3.f21571n;
                                                    }
                                                    cVar3.f21573p = i20;
                                                } else {
                                                    i15 = -1;
                                                }
                                                i16 = cVar3.f21572o;
                                                if (i16 != i15) {
                                                    f2 = -1.0f;
                                                } else {
                                                    f2 = -1.0f;
                                                }
                                                if (cVar3.f21581x) {
                                                    if (cVar3.D != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                                } else {
                                                    bVar = null;
                                                }
                                                str4 = cVar3.f21560a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar3.f21575r == 0) {
                                                    i17 = iIntValue;
                                                } else {
                                                    i17 = iIntValue;
                                                }
                                                g0Var.f9648p = cVar3.f21570m;
                                                g0Var.f9649q = cVar3.f21571n;
                                                g0Var.f9652t = f2;
                                                g0Var.f9651s = i17;
                                                g0Var.f9653u = cVar3.f21579v;
                                                g0Var.f9654v = cVar3.f21580w;
                                                g0Var.f9655w = bVar;
                                                i14 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i14 = 3;
                                            }
                                            str5 = cVar3.f21560a;
                                            if (str5 != null) {
                                                g0Var.f9636b = cVar3.f21560a;
                                            }
                                            g0Var.f9635a = Integer.toString(i35);
                                            g0Var.k = str7;
                                            g0Var.f9644l = i12;
                                            g0Var.f9637c = cVar3.W;
                                            g0Var.f9638d = i315;
                                            g0Var.f9645m = listR;
                                            g0Var.f9642h = str2;
                                            g0Var.f9646n = cVar3.f21569l;
                                            Format format10 = new Format(g0Var);
                                            x xVarX10 = mVar.x(cVar3.f21562c, i14);
                                            cVar3.X = xVarX10;
                                            xVarX10.e(format10);
                                            sparseArray.put(cVar3.f21562c, cVar3);
                                            dVar6 = dVar6;
                                        } catch (ArrayIndexOutOfBoundsException unused5) {
                                            runtimeException = null;
                                        }
                                        break;
                                    case 8:
                                        mVar = mVar;
                                        byte[] bArr8 = new byte[4];
                                        System.arraycopy(cVar3.a(str6), 0, bArr8, 0, 4);
                                        listR = ei.e0.r(bArr8);
                                        str7 = "application/dvbsubs";
                                        i12 = -1;
                                        iW = -1;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z112 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i316 = (z112 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map11 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i316;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format11 = new Format(g0Var);
                                        x xVarX11 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX11;
                                        xVarX11.e(format11);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 10:
                                        ke.a aVarA = ke.a.a(new w(cVar3.a(cVar3.f21561b)));
                                        list = aVarA.f14316a;
                                        cVar3.Y = aVarA.f14317b;
                                        str3 = aVarA.f14324i;
                                        str7 = "video/avc";
                                        str2 = str3;
                                        listR = list;
                                        i12 = -1;
                                        iW = -1;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z113 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i317 = (z113 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map12 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i317;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format12 = new Format(g0Var);
                                        x xVarX12 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX12;
                                        xVarX12.e(format12);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 11:
                                        mVar = mVar;
                                        listR = ei.e0.r(cVar3.a(str6));
                                        str7 = "application/vobsub";
                                        i12 = -1;
                                        iW = -1;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z114 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i318 = (z114 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map13 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i318;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format13 = new Format(g0Var);
                                        x xVarX13 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX13;
                                        xVarX13.e(format13);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 12:
                                        mVar = mVar;
                                        str7 = "audio/vnd.dts.hd";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z115 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i319 = (z115 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map14 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i319;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format14 = new Format(g0Var);
                                        x xVarX14 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX14;
                                        xVarX14.e(format14);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 13:
                                        mVar = mVar;
                                        List listSingletonList2 = Collections.singletonList(cVar3.a(str6));
                                        byte[] bArr9 = cVar3.k;
                                        o0 o0VarI = ic.a.i(new v(bArr9, bArr9.length), false);
                                        cVar3.Q = o0VarI.f11592a;
                                        cVar3.O = o0VarI.f11593b;
                                        String str8 = (String) o0VarI.f11594c;
                                        str7 = "audio/mp4a-latm";
                                        listR = listSingletonList2;
                                        str2 = str8;
                                        i12 = -1;
                                        iW = -1;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z116 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3110 = (z116 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map15 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i3110;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format15 = new Format(g0Var);
                                        x xVarX15 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX15;
                                        xVarX15.e(format15);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 14:
                                        mVar = mVar;
                                        str7 = "audio/ac3";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z117 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3111 = (z117 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map16 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i3111;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format16 = new Format(g0Var);
                                        x xVarX16 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX16;
                                        xVarX16.e(format16);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 15:
                                    case 21:
                                        mVar = mVar;
                                        str7 = "audio/vnd.dts";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z118 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3112 = (z118 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map17 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i3112;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format17 = new Format(g0Var);
                                        x xVarX17 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX17;
                                        xVarX17.e(format17);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 16:
                                        mVar = mVar;
                                        str7 = "video/av01";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z119 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3113 = (z119 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map18 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i3113;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format18 = new Format(g0Var);
                                        x xVarX18 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX18;
                                        xVarX18.e(format18);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 17:
                                        mVar = mVar;
                                        str7 = "video/x-vnd.on2.vp8";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z1110 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3114 = (z1110 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map19 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i3114;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format19 = new Format(g0Var);
                                        x xVarX19 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX19;
                                        xVarX19.e(format19);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 18:
                                        mVar = mVar;
                                        str7 = "video/x-vnd.on2.vp9";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z1111 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3115 = (z1111 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map110 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i3115;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format110 = new Format(g0Var);
                                        x xVarX110 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX110;
                                        xVarX110.e(format110);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 19:
                                        mVar = mVar;
                                        str7 = "application/pgs";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z1112 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3116 = (z1112 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map111 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i3116;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format111 = new Format(g0Var);
                                        x xVarX111 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX111;
                                        xVarX111.e(format111);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 20:
                                        mVar = mVar;
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z1113 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3117 = (z1113 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map112 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i3117;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format112 = new Format(g0Var);
                                        x xVarX112 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX112;
                                        xVarX112.e(format112);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 22:
                                        mVar = mVar;
                                        if (cVar3.P == 32) {
                                            str7 = "audio/raw";
                                            i12 = -1;
                                            iW = 4;
                                        } else {
                                            je.b.N("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + cVar3.P + ". Setting mimeType to audio/x-unknown");
                                            str7 = "audio/x-unknown";
                                            i12 = -1;
                                            iW = -1;
                                        }
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z1114 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3118 = (z1114 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map113 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i3118;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format113 = new Format(g0Var);
                                        x xVarX113 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX113;
                                        xVarX113.e(format113);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 23:
                                        mVar = mVar;
                                        int i52 = cVar3.P;
                                        if (i52 == 8) {
                                            str7 = "audio/raw";
                                            i12 = -1;
                                            iW = 3;
                                        } else if (i52 == 16) {
                                            iW = 268435456;
                                            str7 = "audio/raw";
                                            i12 = -1;
                                        } else {
                                            je.b.N("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + cVar3.P + ". Setting mimeType to audio/x-unknown");
                                            str7 = "audio/x-unknown";
                                            i12 = -1;
                                            iW = -1;
                                        }
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z1115 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3119 = (z1115 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map114 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i3119;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format114 = new Format(g0Var);
                                        x xVarX114 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX114;
                                        xVarX114.e(format114);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 24:
                                        mVar = mVar;
                                        iW = e0.w(cVar3.P);
                                        if (iW == 0) {
                                            je.b.N("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + cVar3.P + ". Setting mimeType to audio/x-unknown");
                                            str7 = "audio/x-unknown";
                                            i12 = -1;
                                            iW = -1;
                                        } else {
                                            str7 = "audio/raw";
                                            i12 = -1;
                                        }
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z1116 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31110 = (z1116 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map115 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i31110;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format115 = new Format(g0Var);
                                        x xVarX115 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX115;
                                        xVarX115.e(format115);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 25:
                                        mVar = mVar;
                                        byte[] bArrA2 = cVar3.a(str6);
                                        c0 c0Var = ei.e0.f8303e;
                                        Object[] objArr = {f21585d0, bArrA2};
                                        p.b(2, objArr);
                                        listR = ei.e0.j(2, objArr);
                                        str7 = "text/x-ssa";
                                        i12 = -1;
                                        iW = -1;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z1117 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31111 = (z1117 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map116 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i31111;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format116 = new Format(g0Var);
                                        x xVarX116 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX116;
                                        xVarX116.e(format116);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 26:
                                        ke.e eVarA = ke.e.a(new w(cVar3.a(cVar3.f21561b)));
                                        list = eVarA.f14345a;
                                        cVar3.Y = eVarA.f14346b;
                                        str3 = eVarA.f14351g;
                                        str7 = "video/hevc";
                                        str2 = str3;
                                        listR = list;
                                        i12 = -1;
                                        iW = -1;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z1118 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31112 = (z1118 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map117 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i31112;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format117 = new Format(g0Var);
                                        x xVarX117 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX117;
                                        xVarX117.e(format117);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 27:
                                        mVar = mVar;
                                        str7 = "text/vtt";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z1119 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31113 = (z1119 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map118 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i31113;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format118 = new Format(g0Var);
                                        x xVarX118 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX118;
                                        xVarX118.e(format118);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 28:
                                        mVar = mVar;
                                        str7 = "application/x-subrip";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z11110 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31114 = (z11110 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map119 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i31114;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format119 = new Format(g0Var);
                                        x xVarX119 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX119;
                                        xVarX119.e(format119);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 29:
                                        mVar = mVar;
                                        str7 = "video/mpeg2";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z11111 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31115 = (z11111 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map1110 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i31115;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format1110 = new Format(g0Var);
                                        x xVarX1110 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX1110;
                                        xVarX1110.e(format1110);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 30:
                                        mVar = mVar;
                                        str7 = "audio/eac3";
                                        i12 = -1;
                                        iW = -1;
                                        listR = null;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z11112 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31116 = (z11112 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map1111 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i31116;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format1111 = new Format(g0Var);
                                        x xVarX1111 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX1111;
                                        xVarX1111.e(format1111);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 31:
                                        listSingletonList = Collections.singletonList(cVar3.a(str6));
                                        str7 = "audio/flac";
                                        listR = listSingletonList;
                                        i12 = -1;
                                        iW = -1;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z11113 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31117 = (z11113 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map1112 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i31117;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format1112 = new Format(g0Var);
                                        x xVarX1112 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX1112;
                                        xVarX1112.e(format1112);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    case 32:
                                        arrayList = new ArrayList(3);
                                        arrayList.add(cVar3.a(cVar3.f21561b));
                                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                        arrayList.add(byteBufferAllocate.order(byteOrder).putLong(cVar3.R).array());
                                        arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(cVar3.S).array());
                                        str7 = "audio/opus";
                                        i11 = 5760;
                                        listR = arrayList;
                                        i12 = i11;
                                        iW = -1;
                                        str2 = null;
                                        if (cVar3.N != null) {
                                            str2 = oVarG.f236a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z11114 = cVar3.V;
                                        if (cVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31118 = (z11114 ? 1 : 0) | i13;
                                        g0Var = new g0();
                                        zJ = je.o.j(str7);
                                        Map map1113 = h0;
                                        if (zJ) {
                                            g0Var.f9656x = cVar3.O;
                                            g0Var.f9657y = cVar3.Q;
                                            g0Var.f9658z = iW;
                                            i14 = 1;
                                        } else if (je.o.l(str7)) {
                                            if (cVar3.f21574q == 0) {
                                                i19 = cVar3.f21572o;
                                                i15 = -1;
                                                if (i19 == -1) {
                                                    i19 = cVar3.f21570m;
                                                }
                                                cVar3.f21572o = i19;
                                                i20 = cVar3.f21573p;
                                                if (i20 == -1) {
                                                    i20 = cVar3.f21571n;
                                                }
                                                cVar3.f21573p = i20;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = cVar3.f21572o;
                                            if (i16 != i15) {
                                                f2 = -1.0f;
                                            } else {
                                                f2 = -1.0f;
                                            }
                                            if (cVar3.f21581x) {
                                                if (cVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new ke.b(cVar3.f21582y, cVar3.A, cVar3.f21583z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str4 = cVar3.f21560a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (cVar3.f21575r == 0) {
                                                i17 = iIntValue;
                                            } else {
                                                i17 = iIntValue;
                                            }
                                            g0Var.f9648p = cVar3.f21570m;
                                            g0Var.f9649q = cVar3.f21571n;
                                            g0Var.f9652t = f2;
                                            g0Var.f9651s = i17;
                                            g0Var.f9653u = cVar3.f21579v;
                                            g0Var.f9654v = cVar3.f21580w;
                                            g0Var.f9655w = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i14 = 3;
                                        }
                                        str5 = cVar3.f21560a;
                                        if (str5 != null) {
                                            g0Var.f9636b = cVar3.f21560a;
                                        }
                                        g0Var.f9635a = Integer.toString(i35);
                                        g0Var.k = str7;
                                        g0Var.f9644l = i12;
                                        g0Var.f9637c = cVar3.W;
                                        g0Var.f9638d = i31118;
                                        g0Var.f9645m = listR;
                                        g0Var.f9642h = str2;
                                        g0Var.f9646n = cVar3.f21569l;
                                        Format format1113 = new Format(g0Var);
                                        x xVarX1113 = mVar.x(cVar3.f21562c, i14);
                                        cVar3.X = xVarX1113;
                                        xVarX1113.e(format1113);
                                        sparseArray.put(cVar3.f21562c, cVar3);
                                        dVar6 = dVar6;
                                        break;
                                    default:
                                        throw h1.a("Unrecognized codec identifier.", null);
                                }
                            default:
                                dVar6.f21608u = null;
                                break;
                        }
                    } else {
                        if (i28 == 19899) {
                            int i53 = dVar6.f21610w;
                            if (i53 != -1) {
                                long j14 = dVar6.f21611x;
                                if (j14 != -1) {
                                    if (i53 == 475249515) {
                                        dVar6.f21613z = j14;
                                    }
                                }
                            }
                            throw h1.a("Mandatory element SeekID or SeekPosition not found", null);
                        }
                        if (i28 == 25152) {
                            dVar6.b(i28);
                            c cVar4 = dVar6.f21608u;
                            if (cVar4.f21567h) {
                                pc.w wVar4 = cVar4.j;
                                if (wVar4 == null) {
                                    throw h1.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                }
                                cVar4.f21569l = new i(new mc.h(gc.h.f9669a, null, "video/webm", wVar4.f17933b));
                            }
                        } else if (i28 == 28032) {
                            dVar6.b(i28);
                            c cVar5 = dVar6.f21608u;
                            if (cVar5.f21567h && cVar5.f21568i != null) {
                                throw h1.a("Combining encryption and compression is not supported", null);
                            }
                        } else if (i28 == 357149030) {
                            if (dVar6.f21605r == -9223372036854775807L) {
                                dVar6.f21605r = 1000000L;
                            }
                            long j15 = dVar6.f21606s;
                            if (j15 != -9223372036854775807L) {
                                dVar6.f21607t = dVar6.k(j15);
                            }
                        } else if (i28 == 374648427) {
                            if (sparseArray.size() == 0) {
                                throw h1.a("No valid tracks were found", null);
                            }
                            dVar6.f21591b0.q();
                        } else if (i28 == 475249515) {
                            if (!dVar6.f21609v) {
                                m mVar2 = dVar6.f21591b0;
                                b0 b0Var = dVar6.C;
                                b0 b0Var2 = dVar6.D;
                                if (dVar6.f21604q == -1 || dVar6.f21607t == -9223372036854775807L || b0Var == null || (i21 = b0Var.f173e) == 0 || b0Var2 == null || b0Var2.f173e != i21) {
                                    oVar = new pc.o(dVar6.f21607t);
                                } else {
                                    int[] iArrCopyOf = new int[i21];
                                    long[] jArr = new long[i21];
                                    long[] jArrCopyOf2 = new long[i21];
                                    long[] jArrCopyOf3 = new long[i21];
                                    int i54 = 0;
                                    while (i54 < i21) {
                                        jArrCopyOf3[i54] = b0Var.r(i54);
                                        long[] jArr2 = jArr;
                                        jArr2[i54] = b0Var2.r(i54) + dVar6.f21604q;
                                        i54++;
                                        jArr = jArr2;
                                    }
                                    long[] jArr3 = jArr;
                                    int i55 = 0;
                                    while (true) {
                                        int i56 = i21 - 1;
                                        if (i55 < i56) {
                                            int i57 = i55 + 1;
                                            iArrCopyOf[i55] = (int) (jArr3[i57] - jArr3[i55]);
                                            jArrCopyOf2[i55] = jArrCopyOf3[i57] - jArrCopyOf3[i55];
                                            i55 = i57;
                                        } else {
                                            iArrCopyOf[i56] = (int) ((dVar6.f21604q + dVar6.f21603p) - jArr3[i56]);
                                            long j16 = dVar6.f21607t - jArrCopyOf3[i56];
                                            jArrCopyOf2[i56] = j16;
                                            if (j16 <= 0) {
                                                je.b.N("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j16);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i56);
                                                jArrCopyOf = Arrays.copyOf(jArr3, i56);
                                                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i56);
                                                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i56);
                                            } else {
                                                jArrCopyOf = jArr3;
                                            }
                                            oVar = new pc.g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                                        }
                                    }
                                }
                                mVar2.c(oVar);
                                dVar6.f21609v = z10;
                            }
                            dVar6.C = null;
                            dVar6.D = null;
                        }
                    }
                    z6 = false;
                    lVar2 = lVar;
                }
                z11 = true;
            }
            if (z11) {
                long j17 = ((h) lVar2).f17895v;
                dVar = this;
                if (dVar.f21612y) {
                    dVar.A = j17;
                    nVar.f17905a = dVar.f21613z;
                    dVar.f21612y = z6;
                    return 1;
                }
                z7 = true;
                if (dVar.f21609v) {
                    long j18 = dVar.A;
                    if (j18 != -1) {
                        nVar.f17905a = j18;
                        dVar.A = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                z7 = true;
                dVar = this;
            }
            dVar2 = dVar;
            z10 = z7;
        }
        d dVar7 = dVar2;
        if (z11) {
            return 0;
        }
        int i58 = 0;
        while (true) {
            SparseArray sparseArray2 = dVar7.f21592c;
            if (i58 >= sparseArray2.size()) {
                return -1;
            }
            c cVar6 = (c) sparseArray2.valueAt(i58);
            cVar6.X.getClass();
            y yVar = cVar6.T;
            if (yVar != null) {
                yVar.a(cVar6.X, cVar6.j);
            }
            i58++;
        }
    }

    @Override // pc.k
    public final void e(m mVar) {
        this.f21591b0 = mVar;
    }

    @Override // pc.k
    public final boolean f(l lVar) throws EOFException, InterruptedIOException {
        b0 b0Var = new b0((char) 0, 20);
        w wVar = (w) b0Var.f174i;
        h hVar = (h) lVar;
        long j = hVar.f17894i;
        long j5 = 1024;
        if (j != -1 && j <= 1024) {
            j5 = j;
        }
        int i7 = (int) j5;
        hVar.g(wVar.f13860a, 0, 4, false);
        b0Var.f173e = 4;
        for (long jV = wVar.v(); jV != 440786851; jV = ((jV << 8) & (-256)) | ((long) (wVar.f13860a[0] & 255))) {
            int i10 = b0Var.f173e + 1;
            b0Var.f173e = i10;
            if (i10 == i7) {
                return false;
            }
            hVar.g(wVar.f13860a, 0, 1, false);
        }
        long jZ = b0Var.z(hVar);
        long j7 = b0Var.f173e;
        if (jZ != Long.MIN_VALUE && (j == -1 || j7 + jZ < j)) {
            while (true) {
                long j10 = b0Var.f173e;
                long j11 = j7 + jZ;
                if (j10 < j11) {
                    if (b0Var.z(hVar) == Long.MIN_VALUE) {
                        break;
                    }
                    long jZ2 = b0Var.z(hVar);
                    if (jZ2 < 0 || jZ2 > 2147483647L) {
                        break;
                    }
                    if (jZ2 != 0) {
                        int i11 = (int) jZ2;
                        hVar.b(i11, false);
                        b0Var.f173e += i11;
                    }
                } else if (j10 == j11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        this.B = -9223372036854775807L;
        this.G = 0;
        b bVar = this.f21589a;
        bVar.f21557e = 0;
        bVar.f21554b.clear();
        e eVar = bVar.f21555c;
        eVar.f21616b = 0;
        eVar.f21617c = 0;
        e eVar2 = this.f21590b;
        eVar2.f21616b = 0;
        eVar2.f21617c = 0;
        j();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f21592c;
            if (i7 >= sparseArray.size()) {
                return;
            }
            y yVar = ((c) sparseArray.valueAt(i7)).T;
            if (yVar != null) {
                yVar.f17937b = false;
                yVar.f17938c = 0;
            }
            i7++;
        }
    }

    public final void i(l lVar, int i7) {
        w wVar = this.f21596g;
        if (wVar.f13862c >= i7) {
            return;
        }
        byte[] bArr = wVar.f13860a;
        if (bArr.length < i7) {
            wVar.b(Math.max(bArr.length * 2, i7));
        }
        byte[] bArr2 = wVar.f13860a;
        int i10 = wVar.f13862c;
        lVar.readFully(bArr2, i10, i7 - i10);
        wVar.E(i7);
    }

    public final void j() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.C(0);
    }

    public final long k(long j) throws h1 {
        long j5 = this.f21605r;
        if (j5 != -9223372036854775807L) {
            return e0.P(j, j5, 1000L);
        }
        throw h1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(l lVar, c cVar, int i7, boolean z5) {
        int iA;
        int iA2;
        boolean z6;
        int i10;
        if ("S_TEXT/UTF8".equals(cVar.f21561b)) {
            m(lVar, f21584c0, i7);
            int i11 = this.T;
            j();
            return i11;
        }
        if ("S_TEXT/ASS".equals(cVar.f21561b)) {
            m(lVar, f21586e0, i7);
            int i12 = this.T;
            j();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f21561b)) {
            m(lVar, f21587f0, i7);
            int i13 = this.T;
            j();
            return i13;
        }
        x xVar = cVar.X;
        boolean z7 = this.V;
        w wVar = this.j;
        if (!z7) {
            boolean z10 = cVar.f21567h;
            w wVar2 = this.f21596g;
            if (z10) {
                this.O &= -1073741825;
                boolean z11 = this.W;
                int i14 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (!z11) {
                    lVar.readFully(wVar2.f13860a, 0, 1);
                    this.S++;
                    byte b10 = wVar2.f13860a[0];
                    if ((b10 & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw h1.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = b10;
                    this.W = true;
                }
                byte b11 = this.Z;
                if ((b11 & 1) == 1) {
                    boolean z12 = (b11 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.a0) {
                        w wVar3 = this.f21599l;
                        lVar.readFully(wVar3.f13860a, 0, 8);
                        this.S += 8;
                        this.a0 = true;
                        byte[] bArr = wVar2.f13860a;
                        if (!z12) {
                            i14 = 0;
                        }
                        bArr[0] = (byte) (i14 | 8);
                        wVar2.F(0);
                        xVar.d(1, wVar2);
                        this.T++;
                        wVar3.F(0);
                        xVar.d(8, wVar3);
                        this.T += 8;
                    }
                    if (z12) {
                        if (!this.X) {
                            lVar.readFully(wVar2.f13860a, 0, 1);
                            this.S++;
                            wVar2.F(0);
                            this.Y = wVar2.u();
                            this.X = true;
                        }
                        int i15 = this.Y * 4;
                        wVar2.C(i15);
                        lVar.readFully(wVar2.f13860a, 0, i15);
                        this.S += i15;
                        short s2 = (short) ((this.Y / 2) + 1);
                        int i16 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.f21602o;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f21602o = ByteBuffer.allocate(i16);
                        }
                        this.f21602o.position(0);
                        this.f21602o.putShort(s2);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i10 = this.Y;
                            if (i17 >= i10) {
                                break;
                            }
                            int iX = wVar2.x();
                            if (i17 % 2 == 0) {
                                this.f21602o.putShort((short) (iX - i18));
                            } else {
                                this.f21602o.putInt(iX - i18);
                            }
                            i17++;
                            i18 = iX;
                        }
                        int i19 = (i7 - this.S) - i18;
                        if (i10 % 2 == 1) {
                            this.f21602o.putInt(i19);
                        } else {
                            this.f21602o.putShort((short) i19);
                            this.f21602o.putInt(0);
                        }
                        byte[] bArrArray = this.f21602o.array();
                        w wVar4 = this.f21600m;
                        wVar4.D(bArrArray, i16);
                        xVar.d(i16, wVar4);
                        this.T += i16;
                    }
                }
            } else {
                byte[] bArr2 = cVar.f21568i;
                if (bArr2 != null) {
                    wVar.D(bArr2, bArr2.length);
                }
            }
            if ("A_OPUS".equals(cVar.f21561b)) {
                z6 = z5;
            } else {
                z6 = cVar.f21565f > 0;
            }
            if (z6) {
                this.O |= 268435456;
                this.f21601n.C(0);
                int i20 = (wVar.f13862c + i7) - this.S;
                wVar2.C(4);
                byte[] bArr3 = wVar2.f13860a;
                bArr3[0] = (byte) ((i20 >> 24) & 255);
                bArr3[1] = (byte) ((i20 >> 16) & 255);
                bArr3[2] = (byte) ((i20 >> 8) & 255);
                bArr3[3] = (byte) (i20 & 255);
                xVar.d(4, wVar2);
                this.T += 4;
            }
            this.V = true;
        }
        int i21 = i7 + wVar.f13862c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f21561b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f21561b)) {
            if (cVar.T != null) {
                je.b.k(wVar.f13862c == 0);
                cVar.T.c(lVar);
            }
            while (true) {
                int i22 = this.S;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int iA3 = wVar.a();
                if (iA3 > 0) {
                    iA2 = Math.min(i23, iA3);
                    xVar.d(iA2, wVar);
                } else {
                    iA2 = xVar.a(lVar, i23, false);
                }
                this.S += iA2;
                this.T += iA2;
            }
        } else {
            w wVar5 = this.f21595f;
            byte[] bArr4 = wVar5.f13860a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i24 = cVar.Y;
            int i25 = 4 - i24;
            while (this.S < i21) {
                int i26 = this.U;
                if (i26 == 0) {
                    int iMin = Math.min(i24, wVar.a());
                    lVar.readFully(bArr4, i25 + iMin, i24 - iMin);
                    if (iMin > 0) {
                        wVar.e(bArr4, i25, iMin);
                    }
                    this.S += i24;
                    wVar5.F(0);
                    this.U = wVar5.x();
                    w wVar6 = this.f21594e;
                    wVar6.F(0);
                    xVar.d(4, wVar6);
                    this.T += 4;
                } else {
                    int iA4 = wVar.a();
                    if (iA4 > 0) {
                        iA = Math.min(i26, iA4);
                        xVar.d(iA, wVar);
                    } else {
                        iA = xVar.a(lVar, i26, false);
                    }
                    this.S += iA;
                    this.T += iA;
                    this.U -= iA;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f21561b)) {
            w wVar7 = this.f21597h;
            wVar7.F(0);
            xVar.d(4, wVar7);
            this.T += 4;
        }
        int i27 = this.T;
        j();
        return i27;
    }

    public final void m(l lVar, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        w wVar = this.k;
        byte[] bArr2 = wVar.f13860a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i7);
            wVar.getClass();
            wVar.D(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(wVar.f13860a, bArr.length, i7);
        wVar.F(0);
        wVar.E(length);
    }

    @Override // pc.k
    public final void release() {
    }
}
