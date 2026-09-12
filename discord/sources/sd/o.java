package sd;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import gc.g0;
import gc.h1;
import he.m0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.e0;
import rd.v;
import rd.w;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f19938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f19939e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f19916i = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f19930v = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f19932w = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f19934x = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f19936y = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern E = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern G = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern H = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern I = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern J = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern K = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern L = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern M = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern N = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern O = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern P = a("CAN-SKIP-DATERANGES");
    public static final Pattern Q = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern R = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern S = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern T = a("CAN-BLOCK-RELOAD");
    public static final Pattern U = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern V = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern W = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern X = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern Y = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern a0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Pattern f19910b0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Pattern f19911c0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Pattern f19912d0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Pattern f19913e0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Pattern f19914f0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Pattern f19915g0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern h0 = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Pattern f19917i0 = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Pattern f19918j0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Pattern f19919k0 = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Pattern f19920l0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Pattern f19921m0 = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Pattern f19922n0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Pattern f19923o0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Pattern f19924p0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Pattern f19925q0 = a("AUTOSELECT");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Pattern f19926r0 = a("DEFAULT");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Pattern f19927s0 = a("FORCED");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Pattern f19928t0 = a("INDEPENDENT");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Pattern f19929u0 = a("GAP");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Pattern f19931v0 = a("PRECISE");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Pattern f19933w0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Pattern f19935x0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Pattern f19937y0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public o(l lVar, i iVar) {
        this.f19938d = lVar;
        this.f19939e = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static mc.i b(String str, mc.h[] hVarArr) {
        mc.h[] hVarArr2 = new mc.h[hVarArr.length];
        for (int i7 = 0; i7 < hVarArr.length; i7++) {
            mc.h hVar = hVarArr[i7];
            hVarArr2[i7] = new mc.h(hVar.f15554e, hVar.f15555i, hVar.f15556v, null);
        }
        return new mc.i(str, true, hVarArr2);
    }

    public static mc.h c(String str, String str2, HashMap map) throws h1 {
        String strI = i(str, f19915g0, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = h0;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new mc.h(gc.h.f9672d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = gc.h.f9672d;
            int i7 = e0.f13788a;
            return new mc.h(uuid, null, "hls", str.getBytes(di.d.f7631c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = gc.h.f9673e;
        return new mc.h(uuid2, null, "video/mp4", xc.j.a(uuid2, null, bArrDecode));
    }

    /* JADX WARN: Code duplicated, block: B:276:0x0791  */
    /* JADX WARN: Code duplicated, block: B:278:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:281:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:282:0x07cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static i d(l lVar, i iVar, n8.f fVar, String str) throws h1, n {
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i7;
        mc.i iVar2;
        long j;
        mc.i iVar3;
        f fVar2;
        mc.i iVar4;
        String str3;
        mc.i iVarB;
        f fVar3;
        long j5;
        long j7;
        int i10;
        l lVar2 = lVar;
        iVar = iVar;
        boolean z5 = lVar2.f19909c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        h hVar = new h(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z6 = z5;
        String strI = "";
        long j10 = -9223372036854775807L;
        long j11 = 0;
        long jI = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long jLongValue = 0;
        long j15 = 0;
        long j16 = -1;
        boolean zF = false;
        d dVar = null;
        int i11 = 0;
        mc.i iVar5 = null;
        f fVar4 = null;
        mc.i iVar6 = null;
        int i12 = 0;
        String strK = null;
        String strI2 = null;
        boolean z7 = false;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        String str4 = null;
        boolean z11 = false;
        boolean z12 = false;
        long j17 = -9223372036854775807L;
        long j18 = -9223372036854775807L;
        long j19 = 0;
        int i15 = 1;
        while (fVar.V()) {
            String strB0 = fVar.b0();
            if (strB0.startsWith("#EXT")) {
                arrayList7.add(strB0);
            }
            if (strB0.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strK2 = k(strB0, N, map);
                if ("VOD".equals(strK2)) {
                    i11 = 1;
                } else if ("EVENT".equals(strK2)) {
                    i11 = 2;
                }
            } else if (strB0.equals("#EXT-X-I-FRAMES-ONLY")) {
                z11 = true;
            } else {
                if (strB0.startsWith("#EXT-X-START")) {
                    double d6 = Double.parseDouble(k(strB0, Z, Collections.EMPTY_MAP));
                    arrayList = arrayList7;
                    hVar = hVar;
                    zF = f(strB0, f19931v0);
                    j10 = (long) (d6 * 1000000.0d);
                } else {
                    arrayList = arrayList7;
                    hVar = hVar;
                    if (strB0.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double dG = g(strB0, O);
                        long j20 = dG == -9.223372036854776E18d ? -9223372036854775807L : (long) (dG * 1000000.0d);
                        boolean zF2 = f(strB0, P);
                        double dG2 = g(strB0, R);
                        long j21 = dG2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dG2 * 1000000.0d);
                        double dG3 = g(strB0, S);
                        hVar = new h(j20, zF2, j21, dG3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dG3 * 1000000.0d), f(strB0, T));
                    } else if (strB0.startsWith("#EXT-X-PART-INF")) {
                        j18 = (long) (Double.parseDouble(k(strB0, L, Collections.EMPTY_MAP)) * 1000000.0d);
                    } else {
                        boolean zStartsWith = strB0.startsWith("#EXT-X-MAP");
                        Pattern pattern = f19910b0;
                        zF = zF;
                        Pattern pattern2 = h0;
                        if (zStartsWith) {
                            String strK3 = k(strB0, pattern2, map);
                            String strI3 = i(strB0, pattern, null, map);
                            if (strI3 != null) {
                                int i16 = e0.f13788a;
                                String[] strArrSplit = strI3.split("@", -1);
                                j16 = Long.parseLong(strArrSplit[i13]);
                                if (strArrSplit.length > 1) {
                                    j13 = Long.parseLong(strArrSplit[1]);
                                }
                            }
                            long j22 = j16 == -1 ? 0L : j13;
                            if (strK != null && strI2 == null) {
                                throw h1.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            String str5 = strK;
                            f fVar5 = new f(j22, j16, strK3, str5, strI2);
                            strK = str5;
                            String str6 = strI2;
                            if (j16 != -1) {
                                j22 += j16;
                            }
                            j13 = j22;
                            arrayList7 = arrayList;
                            fVar4 = fVar5;
                            j16 = -1;
                            hVar = hVar;
                            zF = zF;
                            strI2 = str6;
                        } else {
                            arrayList7 = arrayList;
                            strI2 = strI2;
                            ArrayList arrayList8 = arrayList5;
                            ArrayList arrayList9 = arrayList6;
                            if (strB0.startsWith("#EXT-X-TARGETDURATION")) {
                                j17 = ((long) Integer.parseInt(k(strB0, J, Collections.EMPTY_MAP))) * 1000000;
                            } else if (strB0.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j12 = Long.parseLong(k(strB0, U, Collections.EMPTY_MAP));
                                j19 = j12;
                            } else if (strB0.startsWith("#EXT-X-VERSION")) {
                                i15 = Integer.parseInt(k(strB0, M, Collections.EMPTY_MAP));
                            } else {
                                if (strB0.startsWith("#EXT-X-DEFINE")) {
                                    String strI4 = i(strB0, f19935x0, null, map);
                                    if (strI4 != null) {
                                        String str7 = (String) lVar2.f19905l.get(strI4);
                                        if (str7 != null) {
                                            map.put(strI4, str7);
                                        }
                                    } else {
                                        map.put(k(strB0, f19921m0, map), k(strB0, f19933w0, map));
                                    }
                                    str2 = str4;
                                } else if (strB0.startsWith("#EXTINF")) {
                                    jLongValue = new BigDecimal(k(strB0, V, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                    strI = i(strB0, W, "", map);
                                } else if (strB0.startsWith("#EXT-X-SKIP")) {
                                    int i17 = Integer.parseInt(k(strB0, Q, Collections.EMPTY_MAP));
                                    je.b.k((iVar == null || !arrayList4.isEmpty()) ? i13 : 1);
                                    int i18 = e0.f13788a;
                                    long j23 = iVar.k;
                                    ei.e0 e0Var = iVar.f19884r;
                                    int i19 = (int) (j19 - j23);
                                    int i20 = i17 + i19;
                                    if (i19 < 0 || i20 > e0Var.size()) {
                                        throw new n();
                                    }
                                    long j24 = j14;
                                    strI2 = strI2;
                                    while (i19 < i20) {
                                        f fVar6 = (f) e0Var.get(i19);
                                        if (j19 != iVar.k) {
                                            int i21 = (iVar.j - i14) + fVar6.f19863v;
                                            ei.e0 e0Var2 = fVar6.J;
                                            ArrayList arrayList10 = new ArrayList();
                                            int i22 = i13;
                                            long j25 = j24;
                                            while (i22 < e0Var2.size()) {
                                                d dVar2 = (d) e0Var2.get(i22);
                                                arrayList10.add(new d(dVar2.f19860d, dVar2.f19861e, dVar2.f19862i, i21, j25, dVar2.f19865x, dVar2.f19866y, dVar2.E, dVar2.F, dVar2.G, dVar2.H, dVar2.I, dVar2.J));
                                                j25 += dVar2.f19862i;
                                                i22++;
                                                i20 = i20;
                                            }
                                            i10 = i20;
                                            fVar6 = new f(fVar6.f19860d, fVar6.f19861e, fVar6.I, fVar6.f19862i, i21, j24, fVar6.f19865x, fVar6.f19866y, fVar6.E, fVar6.F, fVar6.G, fVar6.H, arrayList10);
                                        } else {
                                            i10 = i20;
                                        }
                                        arrayList4.add(fVar6);
                                        long j26 = fVar6.f19862i;
                                        String str8 = fVar6.E;
                                        j24 += j26;
                                        long j27 = fVar6.G;
                                        if (j27 != -1) {
                                            j13 = fVar6.F + j27;
                                        }
                                        int i23 = fVar6.f19863v;
                                        f fVar7 = fVar6.f19861e;
                                        mc.i iVar7 = fVar6.f19865x;
                                        String str9 = fVar6.f19866y;
                                        if (str8 == null || !str8.equals(Long.toHexString(j12))) {
                                            strI2 = str8;
                                        }
                                        j12++;
                                        i19++;
                                        i12 = i23;
                                        fVar4 = fVar7;
                                        strK = str9;
                                        iVar5 = iVar7;
                                        i20 = i10;
                                        j11 = j24;
                                        iVar = iVar;
                                    }
                                    lVar2 = lVar;
                                    iVar = iVar;
                                    hVar = hVar;
                                    zF = zF;
                                    arrayList7 = arrayList7;
                                    arrayList6 = arrayList9;
                                    arrayList5 = arrayList8;
                                    j14 = j24;
                                } else if (strB0.startsWith("#EXT-X-KEY")) {
                                    String strK4 = k(strB0, f19913e0, map);
                                    String strI5 = i(strB0, f19914f0, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, map);
                                    if ("NONE".equals(strK4)) {
                                        treeMap.clear();
                                        iVar5 = null;
                                        strK = null;
                                        strI2 = null;
                                    } else {
                                        strI2 = i(strB0, f19917i0, null, map);
                                        if (!InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY.equals(strI5)) {
                                            String str10 = str4;
                                            str4 = str10 == null ? ("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs" : str10;
                                            mc.h hVarC = c(strB0, strI5, map);
                                            if (hVarC != null) {
                                                treeMap.put(strI5, hVarC);
                                                iVar5 = null;
                                            }
                                            strK = null;
                                        } else if ("AES-128".equals(strK4)) {
                                            strK = k(strB0, pattern2, map);
                                            strI2 = strI2;
                                        }
                                        strK = null;
                                    }
                                    lVar2 = lVar;
                                    iVar = iVar;
                                    arrayList7 = arrayList7;
                                    arrayList6 = arrayList9;
                                    arrayList5 = arrayList8;
                                } else {
                                    str2 = str4;
                                    if (strB0.startsWith("#EXT-X-BYTERANGE")) {
                                        String strK5 = k(strB0, a0, map);
                                        int i24 = e0.f13788a;
                                        String[] strArrSplit2 = strK5.split("@", -1);
                                        j16 = Long.parseLong(strArrSplit2[i13]);
                                        if (strArrSplit2.length > 1) {
                                            j13 = Long.parseLong(strArrSplit2[1]);
                                        }
                                    } else if (strB0.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i14 = Integer.parseInt(strB0.substring(strB0.indexOf(58) + 1));
                                        lVar2 = lVar;
                                        iVar = iVar;
                                        str4 = str2;
                                        hVar = hVar;
                                        zF = zF;
                                        strI2 = strI2;
                                        arrayList7 = arrayList7;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z10 = true;
                                    } else if (strB0.equals("#EXT-X-DISCONTINUITY")) {
                                        i12++;
                                    } else if (strB0.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (jI == 0) {
                                            jI = e0.I(e0.L(strB0.substring(strB0.indexOf(58) + 1))) - j14;
                                        }
                                    } else if (strB0.equals("#EXT-X-GAP")) {
                                        lVar2 = lVar;
                                        iVar = iVar;
                                        str4 = str2;
                                        hVar = hVar;
                                        zF = zF;
                                        strI2 = strI2;
                                        arrayList7 = arrayList7;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z12 = true;
                                    } else if (strB0.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        lVar2 = lVar;
                                        iVar = iVar;
                                        str4 = str2;
                                        hVar = hVar;
                                        zF = zF;
                                        strI2 = strI2;
                                        arrayList7 = arrayList7;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z6 = true;
                                    } else if (strB0.equals("#EXT-X-ENDLIST")) {
                                        lVar2 = lVar;
                                        iVar = iVar;
                                        str4 = str2;
                                        hVar = hVar;
                                        zF = zF;
                                        strI2 = strI2;
                                        arrayList7 = arrayList7;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z7 = true;
                                    } else {
                                        if (strB0.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            long jH = h(strB0, X);
                                            Matcher matcher = Y.matcher(strB0);
                                            if (matcher.find()) {
                                                String strGroup = matcher.group(1);
                                                strGroup.getClass();
                                                i7 = Integer.parseInt(strGroup);
                                            } else {
                                                i7 = -1;
                                            }
                                            e eVar = new e(Uri.parse(je.b.J(str, k(strB0, pattern2, map))), jH, i7);
                                            arrayList2 = arrayList9;
                                            arrayList2.add(eVar);
                                        } else {
                                            arrayList2 = arrayList9;
                                            if (!strB0.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                mc.i iVarB2 = iVar6;
                                                f fVar8 = fVar4;
                                                if (strB0.startsWith("#EXT-X-PART")) {
                                                    String hexString = strK == null ? null : strI2 != null ? strI2 : Long.toHexString(j12);
                                                    String strK6 = k(strB0, pattern2, map);
                                                    long j28 = (long) (Double.parseDouble(k(strB0, K, Collections.EMPTY_MAP)) * 1000000.0d);
                                                    boolean zF3 = f(strB0, f19928t0) | (z6 && arrayList8.isEmpty());
                                                    boolean zF4 = f(strB0, f19929u0);
                                                    String strI6 = i(strB0, pattern, null, map);
                                                    if (strI6 != null) {
                                                        int i25 = e0.f13788a;
                                                        String[] strArrSplit3 = strI6.split("@", -1);
                                                        long j29 = Long.parseLong(strArrSplit3[0]);
                                                        if (strArrSplit3.length > 1) {
                                                            j15 = Long.parseLong(strArrSplit3[1]);
                                                        }
                                                        j = j29;
                                                    } else {
                                                        j = -1;
                                                    }
                                                    long j30 = j == -1 ? 0L : j15;
                                                    if (iVar5 != null || treeMap.isEmpty()) {
                                                        iVar3 = iVar5;
                                                    } else {
                                                        mc.h[] hVarArr = (mc.h[]) treeMap.values().toArray(new mc.h[0]);
                                                        mc.i iVar8 = new mc.i(str2, true, hVarArr);
                                                        if (iVarB2 == null) {
                                                            iVarB2 = b(str2, hVarArr);
                                                        }
                                                        iVar3 = iVar8;
                                                    }
                                                    long j31 = j11;
                                                    arrayList8.add(new d(strK6, fVar8, j28, i12, j31, iVar3, strK, hexString, j30, j, zF4, zF3, false));
                                                    j11 = j31 + j28;
                                                    if (j != -1) {
                                                        j30 += j;
                                                    }
                                                    j15 = j30;
                                                    iVar6 = iVarB2;
                                                    fVar4 = fVar8;
                                                    arrayList5 = arrayList8;
                                                    str4 = str2;
                                                    iVar5 = iVar3;
                                                    i13 = 0;
                                                    arrayList6 = arrayList2;
                                                    lVar2 = lVar;
                                                } else {
                                                    fVar4 = fVar8;
                                                    j11 = j11;
                                                    arrayList3 = arrayList8;
                                                    if (strB0.startsWith("#")) {
                                                        iVar6 = iVarB2;
                                                        strK = strK;
                                                        j16 = j16;
                                                        z12 = z12;
                                                        strI = strI;
                                                        fVar4 = fVar4;
                                                        arrayList5 = arrayList3;
                                                        str4 = str2;
                                                        strI = strI;
                                                        j11 = j11;
                                                        strK = strK;
                                                        j16 = j16;
                                                        z12 = z12;
                                                        i13 = 0;
                                                        arrayList6 = arrayList2;
                                                        lVar2 = lVar;
                                                    } else {
                                                        String hexString2 = strK == null ? null : strI2 != null ? strI2 : Long.toHexString(j12);
                                                        long j32 = j12 + 1;
                                                        String strL = l(strB0, map);
                                                        f fVar9 = (f) map2.get(strL);
                                                        if (j16 == -1) {
                                                            fVar2 = fVar9;
                                                            j13 = 0;
                                                        } else {
                                                            if (z11 && fVar4 == null && fVar9 == null) {
                                                                fVar9 = new f(0L, j13, strL, null, null);
                                                                map2.put(strL, fVar9);
                                                            }
                                                            fVar2 = fVar9;
                                                        }
                                                        if (iVar5 != null || treeMap.isEmpty()) {
                                                            iVar4 = iVarB2;
                                                            str3 = strL;
                                                        } else {
                                                            iVar4 = iVarB2;
                                                            str3 = strL;
                                                            mc.h[] hVarArr2 = (mc.h[]) treeMap.values().toArray(new mc.h[0]);
                                                            mc.i iVar9 = new mc.i(str2, true, hVarArr2);
                                                            if (iVar4 == null) {
                                                                iVarB = b(str2, hVarArr2);
                                                                iVar5 = iVar9;
                                                            } else {
                                                                iVar5 = iVar9;
                                                            }
                                                            if (fVar4 != null) {
                                                                fVar3 = fVar4;
                                                            } else {
                                                                fVar3 = fVar2;
                                                            }
                                                            int i26 = i12;
                                                            String str11 = strK;
                                                            j5 = j16;
                                                            j7 = j13;
                                                            long j33 = j14;
                                                            long j34 = jLongValue;
                                                            mc.i iVar10 = iVar5;
                                                            i12 = i26;
                                                            arrayList4.add(new f(str3, fVar3, strI, j34, i26, j33, iVar10, str11, hexString2, j7, j5, z12, arrayList3));
                                                            j11 = j33 + j34;
                                                            ArrayList arrayList11 = new ArrayList();
                                                            if (j16 != -1) {
                                                                j13 = j7 + j5;
                                                            } else {
                                                                j13 = j7;
                                                            }
                                                            arrayList6 = arrayList2;
                                                            iVar6 = iVarB;
                                                            fVar4 = fVar4;
                                                            j12 = j32;
                                                            str4 = str2;
                                                            strI = "";
                                                            j14 = j11;
                                                            iVar5 = iVar10;
                                                            strK = str11;
                                                            jLongValue = 0;
                                                            j16 = -1;
                                                            hVar = hVar;
                                                            strI2 = strI2;
                                                            arrayList7 = arrayList7;
                                                            i13 = 0;
                                                            z12 = false;
                                                            lVar2 = lVar;
                                                            iVar = iVar;
                                                            arrayList5 = arrayList11;
                                                            zF = zF;
                                                        }
                                                        iVarB = iVar4;
                                                        if (fVar4 != null) {
                                                            fVar3 = fVar4;
                                                        } else {
                                                            fVar3 = fVar2;
                                                        }
                                                        int i27 = i12;
                                                        String str12 = strK;
                                                        j5 = j16;
                                                        j7 = j13;
                                                        long j35 = j14;
                                                        long j36 = jLongValue;
                                                        mc.i iVar11 = iVar5;
                                                        i12 = i27;
                                                        arrayList4.add(new f(str3, fVar3, strI, j36, i27, j35, iVar11, str12, hexString2, j7, j5, z12, arrayList3));
                                                        j11 = j35 + j36;
                                                        ArrayList arrayList12 = new ArrayList();
                                                        if (j16 != -1) {
                                                            j13 = j7 + j5;
                                                        } else {
                                                            j13 = j7;
                                                        }
                                                        arrayList6 = arrayList2;
                                                        iVar6 = iVarB;
                                                        fVar4 = fVar4;
                                                        j12 = j32;
                                                        str4 = str2;
                                                        strI = "";
                                                        j14 = j11;
                                                        iVar5 = iVar11;
                                                        strK = str12;
                                                        jLongValue = 0;
                                                        j16 = -1;
                                                        hVar = hVar;
                                                        strI2 = strI2;
                                                        arrayList7 = arrayList7;
                                                        i13 = 0;
                                                        z12 = false;
                                                        lVar2 = lVar;
                                                        iVar = iVar;
                                                        arrayList5 = arrayList12;
                                                        zF = zF;
                                                    }
                                                }
                                            } else if (dVar == null && "PART".equals(k(strB0, f19919k0, map))) {
                                                mc.i iVarB3 = iVar6;
                                                f fVar10 = fVar4;
                                                String strK7 = k(strB0, pattern2, map);
                                                long jH2 = h(strB0, f19911c0);
                                                long jH3 = h(strB0, f19912d0);
                                                String hexString3 = strK == null ? null : strI2 != null ? strI2 : Long.toHexString(j12);
                                                if (iVar5 != null || treeMap.isEmpty()) {
                                                    iVar2 = iVar5;
                                                } else {
                                                    mc.h[] hVarArr3 = (mc.h[]) treeMap.values().toArray(new mc.h[i13]);
                                                    mc.i iVar12 = new mc.i(str2, true, hVarArr3);
                                                    if (iVarB3 == null) {
                                                        iVarB3 = b(str2, hVarArr3);
                                                    }
                                                    iVar2 = iVar12;
                                                }
                                                if (jH2 == -1 || jH3 != -1) {
                                                    long j37 = j11;
                                                    j11 = j37;
                                                    dVar = new d(strK7, fVar10, 0L, i12, j37, iVar2, strK, hexString3, jH2 != -1 ? jH2 : 0L, jH3, false, false, true);
                                                }
                                                arrayList6 = arrayList2;
                                                str4 = str2;
                                                fVar4 = fVar10;
                                                iVar5 = iVar2;
                                                hVar = hVar;
                                                zF = zF;
                                                strI2 = strI2;
                                                arrayList7 = arrayList7;
                                                arrayList5 = arrayList8;
                                                i13 = 0;
                                                lVar2 = lVar;
                                                iVar6 = iVarB3;
                                                iVar = iVar;
                                            }
                                        }
                                        fVar4 = fVar4;
                                        j11 = j11;
                                        strK = strK;
                                        j16 = j16;
                                        arrayList3 = arrayList8;
                                        fVar4 = fVar4;
                                        arrayList5 = arrayList3;
                                        str4 = str2;
                                        strI = strI;
                                        j11 = j11;
                                        strK = strK;
                                        j16 = j16;
                                        z12 = z12;
                                        i13 = 0;
                                        arrayList6 = arrayList2;
                                        lVar2 = lVar;
                                    }
                                    lVar2 = lVar;
                                    iVar = iVar;
                                    str4 = str2;
                                }
                                arrayList2 = arrayList9;
                                arrayList3 = arrayList8;
                                fVar4 = fVar4;
                                arrayList5 = arrayList3;
                                str4 = str2;
                                strI = strI;
                                j11 = j11;
                                strK = strK;
                                j16 = j16;
                                z12 = z12;
                                i13 = 0;
                                arrayList6 = arrayList2;
                                lVar2 = lVar;
                            }
                            strI2 = strI2;
                            arrayList7 = arrayList7;
                            arrayList6 = arrayList9;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                arrayList7 = arrayList;
                hVar = hVar;
            }
        }
        boolean z13 = zF;
        ArrayList arrayList13 = arrayList6;
        ArrayList arrayList14 = arrayList7;
        h hVar2 = hVar;
        ArrayList arrayList15 = arrayList5;
        HashMap map3 = new HashMap();
        for (int i28 = 0; i28 < arrayList13.size(); i28++) {
            e eVar2 = (e) arrayList13.get(i28);
            long size = eVar2.f19858b;
            if (size == -1) {
                size = (j19 + ((long) arrayList4.size())) - (arrayList15.isEmpty() ? 1L : 0L);
            }
            int size2 = eVar2.f19859c;
            if (size2 == -1 && j18 != -9223372036854775807L) {
                size2 = (arrayList15.isEmpty() ? ((f) ei.p.i(arrayList4)).J : arrayList15).size() - 1;
            }
            Uri uri = eVar2.f19857a;
            map3.put(uri, new e(uri, size, size2));
        }
        if (dVar != null) {
            arrayList15.add(dVar);
        }
        return new i(i11, str, arrayList14, j10, z13, jI, z10, i14, j19, i15, j17, j18, z6, z7, jI != 0, iVar6, arrayList4, arrayList15, hVar2, map3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:114:0x0376  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v5 */
    public static l e(n8.f fVar, String str) throws IOException {
        ?? r14;
        ArrayList arrayList;
        int i7;
        ArrayList arrayList2;
        k kVar;
        String strD;
        int i10;
        String str2;
        k kVar2;
        String strD2;
        k kVar3;
        int i11;
        int i12;
        int i13;
        Uri uriK;
        int i14;
        String str3 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            boolean zV = fVar.V();
            Pattern pattern = h0;
            ArrayList arrayList11 = arrayList7;
            Pattern pattern2 = f19921m0;
            boolean z7 = z5;
            if (!zV) {
                ArrayList arrayList12 = arrayList8;
                ArrayList arrayList13 = arrayList4;
                ArrayList arrayList14 = arrayList5;
                ArrayList arrayList15 = arrayList6;
                ArrayList arrayList16 = arrayList10;
                ArrayList arrayList17 = arrayList9;
                boolean z10 = z6;
                ArrayList arrayList18 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    k kVar4 = (k) arrayList3.get(i15);
                    Uri uri = kVar4.f19892a;
                    Format format = kVar4.f19893b;
                    if (hashSet.add(uri)) {
                        je.b.k(format.G == null);
                        ArrayList arrayList19 = (ArrayList) map.get(kVar4.f19892a);
                        arrayList19.getClass();
                        Metadata metadata = new Metadata(new w(null, null, arrayList19));
                        g0 g0VarA = format.a();
                        g0VarA.f9643i = metadata;
                        arrayList18.add(new k(kVar4.f19892a, new Format(g0VarA), kVar4.f19894c, kVar4.f19895d, kVar4.f19896e, kVar4.f19897f));
                    }
                }
                int i16 = 0;
                Format format2 = null;
                List arrayList20 = null;
                while (i16 < arrayList12.size()) {
                    ArrayList arrayList21 = arrayList12;
                    String str4 = (String) arrayList21.get(i16);
                    String strK = k(str4, f19922n0, map2);
                    String strK2 = k(str4, pattern2, map2);
                    g0 g0Var = new g0();
                    g0Var.f9635a = kk.b.k(strK, ":", strK2);
                    g0Var.f9636b = strK2;
                    g0Var.j = "application/x-mpegURL";
                    boolean zF = f(str4, f19926r0);
                    int i17 = i16;
                    if (f(str4, f19927s0)) {
                        r14 = zF;
                        r14 = (zF ? 1 : 0) | 2;
                    }
                    r14 = zF;
                    int i18 = r14;
                    if (f(str4, f19925q0)) {
                        i18 = (r14 == true ? 1 : 0) | 4;
                    }
                    g0Var.f9638d = i18;
                    String strI = i(str4, f19923o0, null, map2);
                    if (TextUtils.isEmpty(strI)) {
                        arrayList = arrayList18;
                        i7 = 0;
                    } else {
                        int i19 = e0.f13788a;
                        arrayList = arrayList18;
                        String[] strArrSplit = strI.split(",", -1);
                        i7 = e0.k(strArrSplit, "public.accessibility.describes-video") ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING : 0;
                        if (e0.k(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i7 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        }
                        if (e0.k(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        }
                        if (e0.k(strArrSplit, "public.easy-to-read")) {
                            i7 |= 8192;
                        }
                    }
                    g0Var.f9639e = i7;
                    g0Var.f9637c = i(str4, f19920l0, null, map2);
                    String strI2 = i(str4, pattern, null, map2);
                    Uri uriK2 = strI2 == null ? null : je.b.K(str3, strI2);
                    arrayList12 = arrayList21;
                    Metadata metadata2 = new Metadata(new w(strK, strK2, Collections.EMPTY_LIST));
                    switch (k(str4, f19918j0, map2)) {
                        case "SUBTITLES":
                            arrayList2 = arrayList14;
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList3.size()) {
                                    kVar = (k) arrayList3.get(i20);
                                    if (!strK.equals(kVar.f19896e)) {
                                        i20++;
                                    }
                                } else {
                                    kVar = null;
                                }
                            }
                            if (kVar != null) {
                                String strQ = e0.q(3, kVar.f19893b.F);
                                g0Var.f9642h = strQ;
                                strD = je.o.d(strQ);
                            } else {
                                strD = null;
                            }
                            if (strD == null) {
                                strD = "text/vtt";
                            }
                            g0Var.k = strD;
                            g0Var.f9643i = metadata2;
                            if (uriK2 != null) {
                                arrayList15 = arrayList15;
                                arrayList15.add(new j(uriK2, new Format(g0Var), strK2));
                                break;
                            } else {
                                arrayList15 = arrayList15;
                                je.b.N("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList2 = arrayList14;
                            String strK3 = k(str4, f19924p0, map2);
                            if (strK3.startsWith("CC")) {
                                i10 = Integer.parseInt(strK3.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i10 = Integer.parseInt(strK3.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (arrayList20 == null) {
                                arrayList20 = new ArrayList();
                            }
                            g0Var.k = str2;
                            g0Var.C = i10;
                            arrayList20.add(new Format(g0Var));
                            break;
                        case "AUDIO":
                            ArrayList arrayList22 = arrayList13;
                            int i21 = 0;
                            while (true) {
                                if (i21 < arrayList3.size()) {
                                    kVar2 = (k) arrayList3.get(i21);
                                    int i22 = i21;
                                    if (!strK.equals(kVar2.f19895d)) {
                                        i21 = i22 + 1;
                                    }
                                } else {
                                    kVar2 = null;
                                }
                            }
                            if (kVar2 != null) {
                                String strQ2 = e0.q(1, kVar2.f19893b.F);
                                g0Var.f9642h = strQ2;
                                strD2 = je.o.d(strQ2);
                            } else {
                                strD2 = null;
                            }
                            arrayList13 = arrayList22;
                            String strI3 = i(str4, F, null, map2);
                            if (strI3 != null) {
                                int i23 = e0.f13788a;
                                g0Var.f9656x = Integer.parseInt(strI3.split("/", 2)[0]);
                                if ("audio/eac3".equals(strD2) && strI3.endsWith("/JOC")) {
                                    g0Var.f9642h = "ec+3";
                                    strD2 = "audio/eac3-joc";
                                }
                            }
                            g0Var.k = strD2;
                            if (uriK2 != null) {
                                g0Var.f9643i = metadata2;
                                arrayList2 = arrayList14;
                                arrayList2.add(new j(uriK2, new Format(g0Var), strK2));
                            } else {
                                arrayList2 = arrayList14;
                                if (kVar2 != null) {
                                    format2 = new Format(g0Var);
                                }
                            }
                            break;
                        case "VIDEO":
                            int i24 = 0;
                            while (true) {
                                if (i24 < arrayList3.size()) {
                                    kVar3 = (k) arrayList3.get(i24);
                                    if (!strK.equals(kVar3.f19894c)) {
                                        i24++;
                                    }
                                } else {
                                    kVar3 = null;
                                }
                            }
                            if (kVar3 != null) {
                                Format format3 = kVar3.f19893b;
                                String strQ3 = e0.q(2, format3.F);
                                g0Var.f9642h = strQ3;
                                g0Var.k = je.o.d(strQ3);
                                g0Var.f9648p = format3.N;
                                g0Var.f9649q = format3.O;
                                g0Var.f9650r = format3.P;
                            }
                            if (uriK2 != null) {
                                g0Var.f9643i = metadata2;
                                arrayList13.add(new j(uriK2, new Format(g0Var), strK2));
                                break;
                            }
                        default:
                            arrayList2 = arrayList14;
                            break;
                    }
                    i16 = i17 + 1;
                    arrayList18 = arrayList;
                    str3 = str;
                    arrayList14 = arrayList2;
                    arrayList15 = arrayList15;
                }
                ArrayList arrayList23 = arrayList18;
                ArrayList arrayList24 = arrayList15;
                ArrayList arrayList25 = arrayList14;
                if (z7) {
                    arrayList20 = Collections.EMPTY_LIST;
                }
                return new l(str, arrayList16, arrayList23, arrayList13, arrayList25, arrayList24, arrayList11, format2, arrayList20, z10, map2, arrayList17);
            }
            String strB0 = fVar.b0();
            if (strB0.startsWith("#EXT")) {
                arrayList10.add(strB0);
            }
            boolean zStartsWith = strB0.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList26 = arrayList10;
            if (strB0.startsWith("#EXT-X-DEFINE")) {
                map2.put(k(strB0, pattern2, map2), k(strB0, f19933w0, map2));
            } else {
                if (strB0.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList5 = arrayList5;
                    arrayList9 = arrayList9;
                    z5 = z7;
                    z6 = true;
                } else if (strB0.startsWith("#EXT-X-MEDIA")) {
                    arrayList8.add(strB0);
                } else if (strB0.startsWith("#EXT-X-SESSION-KEY")) {
                    mc.h hVarC = c(strB0, i(strB0, f19914f0, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, map2), map2);
                    if (hVarC != null) {
                        String strK4 = k(strB0, f19913e0, map2);
                        arrayList9.add(new mc.i(("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs", true, hVarC));
                    }
                } else if (strB0.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z7 | strB0.contains("CLOSED-CAPTIONS=NONE");
                    int i25 = zStartsWith ? 16384 : 0;
                    int i26 = Integer.parseInt(k(strB0, E, Collections.EMPTY_MAP));
                    Matcher matcher = f19916i.matcher(strB0);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        i11 = Integer.parseInt(strGroup);
                    } else {
                        i11 = -1;
                    }
                    boolean z11 = z6;
                    String strI4 = i(strB0, G, null, map2);
                    String strI5 = i(strB0, H, null, map2);
                    if (strI5 != null) {
                        int i27 = e0.f13788a;
                        String[] strArrSplit2 = strI5.split("x", -1);
                        int i28 = Integer.parseInt(strArrSplit2[0]);
                        i13 = Integer.parseInt(strArrSplit2[1]);
                        if (i28 <= 0 || i13 <= 0) {
                            i13 = -1;
                            i14 = -1;
                        } else {
                            i14 = i28;
                        }
                        i12 = i14;
                    } else {
                        i12 = -1;
                        i13 = -1;
                    }
                    String strI6 = i(strB0, I, null, map2);
                    float f2 = strI6 != null ? Float.parseFloat(strI6) : -1.0f;
                    String strI7 = i(strB0, f19930v, null, map2);
                    String strI8 = i(strB0, f19932w, null, map2);
                    String strI9 = i(strB0, f19934x, null, map2);
                    String strI10 = i(strB0, f19936y, null, map2);
                    if (zStartsWith) {
                        uriK = je.b.K(str3, k(strB0, pattern, map2));
                    } else {
                        if (!fVar.V()) {
                            throw h1.b("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriK = je.b.K(str3, l(fVar.b0(), map2));
                    }
                    Uri uri2 = uriK;
                    g0 g0Var2 = new g0();
                    g0Var2.f9635a = Integer.toString(arrayList3.size());
                    g0Var2.j = "application/x-mpegURL";
                    g0Var2.f9642h = strI4;
                    g0Var2.f9640f = i11;
                    g0Var2.f9641g = i26;
                    g0Var2.f9648p = i12;
                    g0Var2.f9649q = i13;
                    g0Var2.f9650r = f2;
                    g0Var2.f9639e = i25;
                    arrayList3.add(new k(uri2, new Format(g0Var2), strI7, strI8, strI9, strI10));
                    ArrayList arrayList27 = (ArrayList) map.get(uri2);
                    if (arrayList27 == null) {
                        arrayList27 = new ArrayList();
                        map.put(uri2, arrayList27);
                    }
                    arrayList27.add(new v(i11, i26, strI7, strI8, strI9, strI10));
                    z5 = zContains;
                    z6 = z11;
                }
                arrayList7 = arrayList11;
                arrayList10 = arrayList26;
                arrayList9 = arrayList9;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList4 = arrayList4;
                arrayList8 = arrayList8;
            }
            arrayList5 = arrayList5;
            arrayList9 = arrayList9;
            z5 = z7;
            arrayList7 = arrayList11;
            arrayList10 = arrayList26;
            arrayList9 = arrayList9;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList4 = arrayList4;
            arrayList8 = arrayList8;
        }
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) throws h1 {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        throw h1.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f19937y0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0096, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:90:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0047 A[SYNTHETIC] */
    @Override // he.m0
    public final Object j(Uri uri, he.n nVar) throws h1 {
        int i7;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(nVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i10 = bufferedReader.read();
            boolean zG = false;
            if (i10 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i10 = bufferedReader.read();
                    while (i10 != -1) {
                        i10 = bufferedReader.read();
                    }
                    i7 = 0;
                    while (true) {
                        if (i7 < 7) {
                            while (i10 != -1) {
                                i10 = bufferedReader.read();
                            }
                            zG = e0.G(i10);
                            break;
                        }
                        if (i10 != "#EXTM3U".charAt(i7)) {
                            break;
                            break;
                        }
                        i10 = bufferedReader.read();
                        i7++;
                    }
                }
            } else {
                while (i10 != -1 && Character.isWhitespace(i10)) {
                    i10 = bufferedReader.read();
                }
                i7 = 0;
                while (true) {
                    if (i7 < 7) {
                        while (i10 != -1 && Character.isWhitespace(i10) && !e0.G(i10)) {
                            i10 = bufferedReader.read();
                        }
                        zG = e0.G(i10);
                        break;
                    }
                    if (i10 != "#EXTM3U".charAt(i7)) {
                        break;
                    }
                    i10 = bufferedReader.read();
                    i7++;
                }
            }
            if (!zG) {
                throw h1.b("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    e0.g(bufferedReader);
                    throw h1.b("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        l lVarE = e(new n8.f(arrayDeque, bufferedReader), uri.toString());
                        e0.g(bufferedReader);
                        return lVarE;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    i iVarD = d(this.f19938d, this.f19939e, new n8.f(arrayDeque, bufferedReader), uri.toString());
                    e0.g(bufferedReader);
                    return iVarD;
                }
            }
        } catch (Throwable th2) {
            e0.g(bufferedReader);
            throw th2;
        }
    }
}
