package androidx.constraintlayout.widget;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f1378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f1379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f1380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f1381f;

    public g() {
        j jVar = new j();
        jVar.f1428a = 0;
        jVar.f1429b = 0;
        jVar.f1430c = 1.0f;
        jVar.f1431d = Float.NaN;
        this.f1377b = jVar;
        i iVar = new i();
        iVar.f1419a = -1;
        iVar.f1420b = 0;
        iVar.f1421c = -1;
        iVar.f1422d = Float.NaN;
        iVar.f1423e = Float.NaN;
        iVar.f1424f = Float.NaN;
        iVar.f1425g = -1;
        iVar.f1426h = null;
        iVar.f1427i = -1;
        this.f1378c = iVar;
        h hVar = new h();
        hVar.f1383a = false;
        hVar.f1388d = -1;
        hVar.f1390e = -1;
        hVar.f1392f = -1.0f;
        hVar.f1394g = -1;
        hVar.f1396h = -1;
        hVar.f1397i = -1;
        hVar.j = -1;
        hVar.k = -1;
        hVar.f1401l = -1;
        hVar.f1403m = -1;
        hVar.f1405n = -1;
        hVar.f1407o = -1;
        hVar.f1408p = -1;
        hVar.f1409q = -1;
        hVar.f1410r = -1;
        hVar.f1411s = -1;
        hVar.f1412t = -1;
        hVar.f1413u = -1;
        hVar.f1414v = 0.5f;
        hVar.f1415w = 0.5f;
        hVar.f1416x = null;
        hVar.f1417y = -1;
        hVar.f1418z = 0;
        hVar.A = 0.0f;
        hVar.B = -1;
        hVar.C = -1;
        hVar.D = -1;
        hVar.E = 0;
        hVar.F = 0;
        hVar.G = 0;
        hVar.H = 0;
        hVar.I = 0;
        hVar.J = 0;
        hVar.K = 0;
        hVar.L = Integer.MIN_VALUE;
        hVar.M = Integer.MIN_VALUE;
        hVar.N = Integer.MIN_VALUE;
        hVar.O = Integer.MIN_VALUE;
        hVar.P = Integer.MIN_VALUE;
        hVar.Q = Integer.MIN_VALUE;
        hVar.R = Integer.MIN_VALUE;
        hVar.S = -1.0f;
        hVar.T = -1.0f;
        hVar.U = 0;
        hVar.V = 0;
        hVar.W = 0;
        hVar.X = 0;
        hVar.Y = -1;
        hVar.Z = -1;
        hVar.a0 = -1;
        hVar.f1385b0 = -1;
        hVar.f1387c0 = 1.0f;
        hVar.f1389d0 = 1.0f;
        hVar.f1391e0 = -1;
        hVar.f1393f0 = 0;
        hVar.f1395g0 = -1;
        hVar.f1400k0 = false;
        hVar.f1402l0 = false;
        hVar.f1404m0 = true;
        hVar.f1406n0 = 0;
        this.f1379d = hVar;
        k kVar = new k();
        kVar.f1433a = 0.0f;
        kVar.f1434b = 0.0f;
        kVar.f1435c = 0.0f;
        kVar.f1436d = 1.0f;
        kVar.f1437e = 1.0f;
        kVar.f1438f = Float.NaN;
        kVar.f1439g = Float.NaN;
        kVar.f1440h = -1;
        kVar.f1441i = 0.0f;
        kVar.j = 0.0f;
        kVar.k = 0.0f;
        kVar.f1442l = false;
        kVar.f1443m = 0.0f;
        this.f1380e = kVar;
        this.f1381f = new HashMap();
    }

    public final void a(ConstraintLayout.LayoutParams layoutParams) {
        h hVar = this.f1379d;
        layoutParams.f1290d = hVar.f1394g;
        layoutParams.f1292e = hVar.f1396h;
        layoutParams.f1294f = hVar.f1397i;
        layoutParams.f1296g = hVar.j;
        layoutParams.f1298h = hVar.k;
        layoutParams.f1299i = hVar.f1401l;
        layoutParams.j = hVar.f1403m;
        layoutParams.k = hVar.f1405n;
        layoutParams.f1303l = hVar.f1407o;
        layoutParams.f1305m = hVar.f1408p;
        layoutParams.f1307n = hVar.f1409q;
        layoutParams.f1313r = hVar.f1410r;
        layoutParams.f1314s = hVar.f1411s;
        layoutParams.f1315t = hVar.f1412t;
        layoutParams.f1316u = hVar.f1413u;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = hVar.E;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = hVar.F;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = hVar.G;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = hVar.H;
        layoutParams.f1321z = hVar.Q;
        layoutParams.A = hVar.P;
        layoutParams.f1318w = hVar.M;
        layoutParams.f1320y = hVar.O;
        layoutParams.D = hVar.f1414v;
        layoutParams.E = hVar.f1415w;
        layoutParams.f1309o = hVar.f1417y;
        layoutParams.f1311p = hVar.f1418z;
        layoutParams.f1312q = hVar.A;
        layoutParams.F = hVar.f1416x;
        layoutParams.S = hVar.B;
        layoutParams.T = hVar.C;
        layoutParams.H = hVar.S;
        layoutParams.G = hVar.T;
        layoutParams.J = hVar.V;
        layoutParams.I = hVar.U;
        layoutParams.V = hVar.f1400k0;
        layoutParams.W = hVar.f1402l0;
        layoutParams.K = hVar.W;
        layoutParams.L = hVar.X;
        layoutParams.O = hVar.Y;
        layoutParams.P = hVar.Z;
        layoutParams.M = hVar.a0;
        layoutParams.N = hVar.f1385b0;
        layoutParams.Q = hVar.f1387c0;
        layoutParams.R = hVar.f1389d0;
        layoutParams.U = hVar.D;
        layoutParams.f1288c = hVar.f1392f;
        layoutParams.f1285a = hVar.f1388d;
        layoutParams.f1286b = hVar.f1390e;
        ((ViewGroup.MarginLayoutParams) layoutParams).width = hVar.f1384b;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = hVar.f1386c;
        String str = hVar.f1399j0;
        if (str != null) {
            layoutParams.X = str;
        }
        layoutParams.Y = hVar.f1406n0;
        layoutParams.setMarginStart(hVar.J);
        layoutParams.setMarginEnd(hVar.I);
        layoutParams.a();
    }

    public final Object clone() {
        g gVar = new g();
        h hVar = gVar.f1379d;
        hVar.getClass();
        h hVar2 = this.f1379d;
        hVar.f1383a = hVar2.f1383a;
        hVar.f1384b = hVar2.f1384b;
        hVar.f1386c = hVar2.f1386c;
        hVar.f1388d = hVar2.f1388d;
        hVar.f1390e = hVar2.f1390e;
        hVar.f1392f = hVar2.f1392f;
        hVar.f1394g = hVar2.f1394g;
        hVar.f1396h = hVar2.f1396h;
        hVar.f1397i = hVar2.f1397i;
        hVar.j = hVar2.j;
        hVar.k = hVar2.k;
        hVar.f1401l = hVar2.f1401l;
        hVar.f1403m = hVar2.f1403m;
        hVar.f1405n = hVar2.f1405n;
        hVar.f1407o = hVar2.f1407o;
        hVar.f1408p = hVar2.f1408p;
        hVar.f1409q = hVar2.f1409q;
        hVar.f1410r = hVar2.f1410r;
        hVar.f1411s = hVar2.f1411s;
        hVar.f1412t = hVar2.f1412t;
        hVar.f1413u = hVar2.f1413u;
        hVar.f1414v = hVar2.f1414v;
        hVar.f1415w = hVar2.f1415w;
        hVar.f1416x = hVar2.f1416x;
        hVar.f1417y = hVar2.f1417y;
        hVar.f1418z = hVar2.f1418z;
        hVar.A = hVar2.A;
        hVar.B = hVar2.B;
        hVar.C = hVar2.C;
        hVar.D = hVar2.D;
        hVar.E = hVar2.E;
        hVar.F = hVar2.F;
        hVar.G = hVar2.G;
        hVar.H = hVar2.H;
        hVar.I = hVar2.I;
        hVar.J = hVar2.J;
        hVar.K = hVar2.K;
        hVar.L = hVar2.L;
        hVar.M = hVar2.M;
        hVar.N = hVar2.N;
        hVar.O = hVar2.O;
        hVar.P = hVar2.P;
        hVar.Q = hVar2.Q;
        hVar.R = hVar2.R;
        hVar.S = hVar2.S;
        hVar.T = hVar2.T;
        hVar.U = hVar2.U;
        hVar.V = hVar2.V;
        hVar.W = hVar2.W;
        hVar.X = hVar2.X;
        hVar.Y = hVar2.Y;
        hVar.Z = hVar2.Z;
        hVar.a0 = hVar2.a0;
        hVar.f1385b0 = hVar2.f1385b0;
        hVar.f1387c0 = hVar2.f1387c0;
        hVar.f1389d0 = hVar2.f1389d0;
        hVar.f1391e0 = hVar2.f1391e0;
        hVar.f1393f0 = hVar2.f1393f0;
        hVar.f1395g0 = hVar2.f1395g0;
        hVar.f1399j0 = hVar2.f1399j0;
        int[] iArr = hVar2.h0;
        if (iArr != null) {
            hVar.h0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            hVar.h0 = null;
        }
        hVar.f1398i0 = hVar2.f1398i0;
        hVar.f1400k0 = hVar2.f1400k0;
        hVar.f1402l0 = hVar2.f1402l0;
        hVar.f1404m0 = hVar2.f1404m0;
        hVar.f1406n0 = hVar2.f1406n0;
        i iVar = gVar.f1378c;
        iVar.getClass();
        i iVar2 = this.f1378c;
        iVar2.getClass();
        iVar.f1419a = iVar2.f1419a;
        iVar.f1421c = iVar2.f1421c;
        iVar.f1423e = iVar2.f1423e;
        iVar.f1422d = iVar2.f1422d;
        j jVar = this.f1377b;
        int i7 = jVar.f1428a;
        j jVar2 = gVar.f1377b;
        jVar2.f1428a = i7;
        jVar2.f1430c = jVar.f1430c;
        jVar2.f1431d = jVar.f1431d;
        jVar2.f1429b = jVar.f1429b;
        k kVar = gVar.f1380e;
        kVar.getClass();
        k kVar2 = this.f1380e;
        kVar2.getClass();
        kVar.f1433a = kVar2.f1433a;
        kVar.f1434b = kVar2.f1434b;
        kVar.f1435c = kVar2.f1435c;
        kVar.f1436d = kVar2.f1436d;
        kVar.f1437e = kVar2.f1437e;
        kVar.f1438f = kVar2.f1438f;
        kVar.f1439g = kVar2.f1439g;
        kVar.f1440h = kVar2.f1440h;
        kVar.f1441i = kVar2.f1441i;
        kVar.j = kVar2.j;
        kVar.k = kVar2.k;
        kVar.f1442l = kVar2.f1442l;
        kVar.f1443m = kVar2.f1443m;
        gVar.f1376a = this.f1376a;
        return gVar;
    }
}
