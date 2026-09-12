package bc;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.appcompat.widget.b4;
import com.appsflyer.AdRevenueScheme;
import e4.m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import sh.b1;
import sh.c0;
import sh.d1;
import sh.e0;
import sh.g1;
import sh.k1;
import sh.m1;
import sh.n0;
import sh.p;
import sh.p0;
import sh.q1;
import sh.u1;
import sh.v0;
import sh.w0;
import ub.t;
import ub.u;
import ub.w;
import vb.n;
import vo.l;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements th.g {
    public Object E;
    public Object F;
    public Object G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3122e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f3123i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f3124v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f3125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f3126x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f3127y;

    public /* synthetic */ k() {
        this.f3121d = 2;
    }

    @Override // th.g
    public Object a() {
        switch (this.f3121d) {
            case 3:
                Context context = ((u1) ((pf.b) this.f3122e).f18027e).f20202a;
                Object objA = ((th.f) this.f3123i).a();
                Object objA2 = ((th.f) this.f3124v).a();
                th.f fVar = new th.f(new pf.b(8, (po.d) this.f3125w));
                Object objA3 = ((th.f) this.f3126x).a();
                Object objA4 = ((th.f) this.f3127y).a();
                return new p(context, (v0) objA, (n0) objA2, fVar, (p0) objA3, (c0) objA4, new th.f(new pf.b(8, (th.f) this.E)), new th.f(new pf.b(8, (th.f) this.F)), (g1) ((th.f) this.G).a());
            default:
                Object objA5 = ((th.f) this.f3122e).a();
                return new n0((v0) objA5, new th.f(new pf.b(8, (po.d) this.f3123i)), (e0) ((th.f) this.f3124v).a(), (q1) ((th.f) this.f3125w).a(), (b1) ((th.f) this.f3126x).a(), (d1) ((th.f) this.f3127y).a(), (k1) ((th.f) this.E).a(), (m1) ((th.f) this.F).a(), (w0) ((th.f) this.G).a());
        }
    }

    public k b(l descriptor, List typeParameterProtos, rp.f nameResolver, pf.b typeTable, rp.g versionRequirementTable, rp.a version) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(version, "metadataVersion");
        hq.j jVar = (hq.j) this.f3122e;
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(version, "version");
        int i7 = version.f19507b;
        return new k(jVar, nameResolver, descriptor, typeTable, ((i7 != 1 || version.f19508c < 4) && i7 <= 1) ? (rp.g) this.f3126x : versionRequirementTable, version, (jq.l) this.E, (hq.c0) this.F, typeParameterProtos);
    }

    public void d(vb.i iVar, int i7) {
        byte[] bArr;
        long j;
        wb.a aVar;
        String str;
        int i10;
        com.rnfs.b bVarB;
        String str2;
        Integer numValueOf;
        String str3;
        b4 b4Var;
        final k kVar = this;
        final vb.i iVar2 = iVar;
        byte[] bArr2 = iVar2.f21530b;
        dc.c cVar = (dc.c) kVar.f3127y;
        wb.e eVarA = ((wb.d) kVar.f3123i).a(iVar2.f21529a);
        long jMax = 0;
        while (true) {
            final int i11 = 0;
            cc.h hVar = (cc.h) cVar;
            if (!((Boolean) hVar.n(new dc.b(kVar) { // from class: bc.g

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ k f3108e;

                {
                    this.f3108e = kVar;
                }

                @Override // dc.b
                public final Object execute() {
                    Boolean bool;
                    switch (i11) {
                        case 0:
                            vb.i iVar3 = iVar2;
                            cc.h hVar2 = (cc.h) ((cc.d) this.f3108e.f3124v);
                            SQLiteDatabase sQLiteDatabaseC = hVar2.c();
                            sQLiteDatabaseC.beginTransaction();
                            try {
                                Long lF = cc.h.f(sQLiteDatabaseC, iVar3);
                                if (lF == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lF.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseC.setTransactionSuccessful();
                                sQLiteDatabaseC.endTransaction();
                                return bool;
                            } catch (Throwable th3) {
                                sQLiteDatabaseC.endTransaction();
                                throw th3;
                            }
                        default:
                            cc.h hVar3 = (cc.h) ((cc.d) this.f3108e.f3124v);
                            hVar3.getClass();
                            return (Iterable) hVar3.g(new i(2, hVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                hVar.n(new j(jMax, kVar, iVar2));
                return;
            }
            final int i12 = 1;
            Iterable iterable = (Iterable) hVar.n(new dc.b(kVar) { // from class: bc.g

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ k f3108e;

                {
                    this.f3108e = kVar;
                }

                @Override // dc.b
                public final Object execute() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            vb.i iVar3 = iVar2;
                            cc.h hVar2 = (cc.h) ((cc.d) this.f3108e.f3124v);
                            SQLiteDatabase sQLiteDatabaseC = hVar2.c();
                            sQLiteDatabaseC.beginTransaction();
                            try {
                                Long lF = cc.h.f(sQLiteDatabaseC, iVar3);
                                if (lF == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lF.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseC.setTransactionSuccessful();
                                sQLiteDatabaseC.endTransaction();
                                return bool;
                            } catch (Throwable th3) {
                                sQLiteDatabaseC.endTransaction();
                                throw th3;
                            }
                        default:
                            cc.h hVar3 = (cc.h) ((cc.d) this.f3108e.f3124v);
                            hVar3.getClass();
                            return (Iterable) hVar3.g(new i(2, hVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (eVarA == null) {
                io.sentry.config.a.k(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar = new wb.a(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList<vb.h> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((cc.b) it.next()).f3572c);
                }
                String str4 = "proto";
                if (bArr2 != null) {
                    cc.c cVar2 = (cc.c) kVar.G;
                    Objects.requireNonNull(cVar2);
                    yb.a aVar2 = (yb.a) hVar.n(new app.rive.runtime.kotlin.core.a(i12, cVar2));
                    af.c cVar3 = new af.c();
                    cVar3.f397w = new HashMap();
                    cVar3.f394e = Long.valueOf(((ec.a) kVar.E).b());
                    cVar3.f396v = Long.valueOf(((ec.a) kVar.F).b());
                    cVar3.f395i = "GDT_CLIENT_METRICS";
                    sb.c cVar4 = new sb.c("proto");
                    aVar2.getClass();
                    n8.f fVar = n.f21542a;
                    fVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        fVar.O(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    cVar3.f393d = new vb.l(cVar4, byteArrayOutputStream.toByteArray());
                    arrayList.add(((tb.b) eVarA).a(cVar3.m()));
                }
                tb.b bVar = (tb.b) eVarA;
                HashMap map = new HashMap();
                for (vb.h hVar2 : arrayList) {
                    String str5 = hVar2.f21523a;
                    if (map.containsKey(str5)) {
                        ((List) map.get(str5)).add(hVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar2);
                        map.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    vb.h hVar3 = (vb.h) ((List) entry.getValue()).get(0);
                    w wVar = w.f21021d;
                    long jB = bVar.f20682f.b();
                    long jB2 = bVar.f20681e.b();
                    ub.j jVar = new ub.j(new ub.h(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a(AdRevenueScheme.COUNTRY), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (vb.h hVar4 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        vb.l lVar = hVar4.f21525c;
                        long j5 = jMax;
                        sb.c cVar5 = lVar.f21539a;
                        byte[] bArr4 = lVar.f21540b;
                        if (cVar5.equals(new sb.c(str4))) {
                            b4Var = new b4();
                            b4Var.f912v = bArr4;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (cVar5.equals(new sb.c("json"))) {
                                String str6 = new String(bArr4, Charset.forName("UTF-8"));
                                b4 b4Var2 = new b4();
                                b4Var2.f913w = str6;
                                b4Var = b4Var2;
                            } else {
                                String strF = io.sentry.config.a.F("CctTransportBackend");
                                if (Log.isLoggable(strF, 5)) {
                                    Log.w(strF, "Received event of unsupported encoding " + cVar5 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j5;
                            str4 = str3;
                        }
                        b4Var.f909d = Long.valueOf(hVar4.f21526d);
                        b4Var.f911i = Long.valueOf(hVar4.f21527e);
                        String str7 = (String) hVar4.f21528f.get("tz-offset");
                        b4Var.f914x = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        b4Var.f915y = new ub.n((u) u.f21019d.get(hVar4.b("net-type")), (t) t.f21017d.get(hVar4.b("mobile-subtype")));
                        Integer num = hVar4.f21524b;
                        if (num != null) {
                            b4Var.f910e = num;
                        }
                        String strJ = ((Long) b4Var.f909d) == null ? " eventTimeMs" : "";
                        if (((Long) b4Var.f911i) == null) {
                            strJ = strJ.concat(" eventUptimeMs");
                        }
                        if (((Long) b4Var.f914x) == null) {
                            strJ = kk.b.j(strJ, " timezoneOffsetSeconds");
                        }
                        if (!strJ.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strJ));
                        }
                        arrayList4.add(new ub.k(((Long) b4Var.f909d).longValue(), (Integer) b4Var.f910e, ((Long) b4Var.f911i).longValue(), (byte[]) b4Var.f912v, (String) b4Var.f913w, ((Long) b4Var.f914x).longValue(), (ub.n) b4Var.f915y));
                        bArr2 = bArr3;
                        jMax = j5;
                        str4 = str3;
                    }
                    arrayList3.add(new ub.l(jB, jB2, jVar, numValueOf, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j = jMax;
                ub.i iVar3 = new ub.i(arrayList3);
                URL urlB = bVar.f20680d;
                if (bArr != null) {
                    try {
                        tb.a aVarA = tb.a.a(bArr);
                        str = aVarA.f20676b;
                        if (str == null) {
                            str = null;
                        }
                        String str8 = aVarA.f20675a;
                        if (str8 != null) {
                            urlB = tb.b.b(str8);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new wb.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    n8.f fVar2 = new n8.f(urlB, iVar3, str);
                    mi.a aVar3 = new mi.a(6, bVar);
                    int i13 = 5;
                    do {
                        bVarB = aVar3.b(fVar2);
                        URL url = (URL) bVarB.f7079c;
                        if (url != null) {
                            io.sentry.config.a.k(url, "CctTransportBackend", "Following redirect to: %s");
                            fVar2 = new n8.f(url, (ub.i) fVar2.f16511i, (String) fVar2.f16510e);
                        } else {
                            fVar2 = null;
                        }
                        if (fVar2 == null) {
                            break;
                        } else {
                            i13--;
                        }
                    } while (i13 >= 1);
                    int i14 = bVarB.f7077a;
                    if (i14 == 200) {
                        aVar = new wb.a(1, bVarB.f7078b);
                    } else if (i14 >= 500 || i14 == 404) {
                        aVar = new wb.a(2, -1L);
                    } else if (i14 == 400) {
                        try {
                            aVar = new wb.a(4, -1L);
                        } catch (IOException e10) {
                            e = e10;
                            io.sentry.config.a.p("CctTransportBackend", "Could not make request to the backend", e);
                            i10 = 2;
                            aVar = new wb.a(2, -1L);
                        }
                    } else {
                        aVar = new wb.a(3, -1L);
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            }
            i10 = 2;
            int i15 = aVar.f22077a;
            if (i15 == i10) {
                hVar.n(new h(this, iterable, iVar, j));
                ((m) this.f3125w).J(iVar, i7 + 1, true);
                return;
            }
            kVar = this;
            iVar2 = iVar;
            long j7 = j;
            hVar.n(new i(0, kVar, iterable));
            if (i15 == 1) {
                jMax = Math.max(j7, aVar.f22078b);
                if (bArr != null) {
                    hVar.n(new app.rive.runtime.kotlin.core.a(3, kVar));
                }
            } else {
                if (i15 == 4) {
                    HashMap map2 = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String str9 = ((cc.b) it2.next()).f3572c.f21523a;
                        if (map2.containsKey(str9)) {
                            map2.put(str9, Integer.valueOf(((Integer) map2.get(str9)).intValue() + 1));
                        } else {
                            map2.put(str9, 1);
                        }
                    }
                    hVar.n(new i(1, kVar, map2));
                }
                jMax = j7;
            }
            bArr2 = bArr;
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i7) {
        this.f3121d = i7;
        this.f3122e = obj;
        this.f3123i = obj2;
        this.f3124v = obj3;
        this.f3125w = obj4;
        this.f3126x = obj5;
        this.f3127y = obj6;
        this.E = obj7;
        this.F = obj8;
        this.G = obj9;
    }

    public k(hq.j components, rp.f nameResolver, l containingDeclaration, pf.b typeTable, rp.g versionRequirementTable, rp.a metadataVersion, jq.l lVar, hq.c0 c0Var, List typeParameters) {
        String strD;
        this.f3121d = 1;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        this.f3122e = components;
        this.f3123i = nameResolver;
        this.f3124v = containingDeclaration;
        this.f3125w = typeTable;
        this.f3126x = versionRequirementTable;
        this.f3127y = metadataVersion;
        this.E = lVar;
        this.F = new hq.c0(this, c0Var, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (lVar == null || (strD = lVar.d()) == null) ? "[container not found]" : strD);
        this.G = new hq.t(this);
    }
}
