package tp;

import androidx.datastore.preferences.protobuf.d1;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pp.a0;
import pp.a1;
import pp.i0;
import pp.n;
import pp.s0;
import sp.j;
import sp.k;
import vp.m;
import vp.q;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vp.g f20880a;

    static {
        vp.g gVar = new vp.g();
        gVar.a(k.f20483a);
        gVar.a(k.f20484b);
        gVar.a(k.f20485c);
        gVar.a(k.f20486d);
        gVar.a(k.f20487e);
        gVar.a(k.f20488f);
        gVar.a(k.f20489g);
        gVar.a(k.f20490h);
        gVar.a(k.f20491i);
        gVar.a(k.j);
        gVar.a(k.k);
        gVar.a(k.f20492l);
        gVar.a(k.f20493m);
        gVar.a(k.f20494n);
        Intrinsics.checkNotNullExpressionValue(gVar, "apply(...)");
        f20880a = gVar;
    }

    public static e a(n proto, rp.f nameResolver, pf.b typeTable) {
        String strO;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        m constructorSignature = k.f20483a;
        Intrinsics.checkNotNullExpressionValue(constructorSignature, "constructorSignature");
        sp.c cVar = (sp.c) m3.m.B(proto, constructorSignature);
        String string = (cVar == null || (cVar.f20437e & 1) != 1) ? "<init>" : nameResolver.getString(cVar.f20438i);
        if (cVar == null || (cVar.f20437e & 2) != 2) {
            List<a1> list = proto.f18378w;
            Intrinsics.checkNotNullExpressionValue(list, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(e0.l(list, 10));
            for (a1 a1Var : list) {
                Intrinsics.checkNotNull(a1Var);
                String strE = e(ls.d.J(a1Var, typeTable), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strO = CollectionsKt.O(arrayList, "", "(", ")V", null, 56);
        } else {
            strO = nameResolver.getString(cVar.f20439v);
        }
        return new e(string, strO);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN] (LINE:83)
          (r4v2 java.lang.String) from 0x0055: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static tp.d b(pp.i0 r4, rp.f r5, pf.b r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            vp.m r0 = sp.k.f20486d
            java.lang.String r1 = "propertySignature"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object r0 = m3.m.B(r4, r0)
            sp.e r0 = (sp.e) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.f20449e
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            sp.b r0 = r0.f20450i
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.f20430e
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.f20431i
            goto L3b
        L39:
            int r7 = r4.f18320x
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.f20430e
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.f20432v
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            pp.s0 r4 = ls.d.C(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            tp.d r6 = new tp.d
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tp.g.b(pp.i0, rp.f, pf.b, boolean):tp.d");
    }

    public static e c(a0 proto, rp.f nameResolver, pf.b typeTable) {
        String strK;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        m methodSignature = k.f20484b;
        Intrinsics.checkNotNullExpressionValue(methodSignature, "methodSignature");
        sp.c cVar = (sp.c) m3.m.B(proto, methodSignature);
        int i7 = (cVar == null || (cVar.f20437e & 1) != 1) ? proto.f18203x : cVar.f20438i;
        if (cVar == null || (cVar.f20437e & 2) != 2) {
            List listH = d0.h(ls.d.y(proto, typeTable));
            List<a1> list = proto.L;
            Intrinsics.checkNotNullExpressionValue(list, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(e0.l(list, 10));
            for (a1 a1Var : list) {
                Intrinsics.checkNotNull(a1Var);
                arrayList.add(ls.d.J(a1Var, typeTable));
            }
            ArrayList arrayListV = CollectionsKt.V(listH, arrayList);
            ArrayList arrayList2 = new ArrayList(e0.l(arrayListV, 10));
            Iterator it = arrayListV.iterator();
            while (it.hasNext()) {
                String strE = e((s0) it.next(), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(ls.d.B(proto, typeTable), nameResolver);
            if (strE2 == null) {
                return null;
            }
            strK = com.discord.chat.presentation.list.a.k(new StringBuilder(), CollectionsKt.O(arrayList2, "", "(", ")", null, 56), strE2);
        } else {
            strK = nameResolver.getString(cVar.f20439v);
        }
        return new e(nameResolver.getString(i7), strK);
    }

    public static final boolean d(i0 proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        rp.b bVar = c.f20873a;
        Object objK = proto.k(k.f20487e);
        Intrinsics.checkNotNullExpressionValue(objK, "getExtension(...)");
        Boolean boolG = bVar.g(((Number) objK).intValue());
        Intrinsics.checkNotNullExpressionValue(boolG, "get(...)");
        return boolG.booleanValue();
    }

    public static String e(s0 s0Var, rp.f fVar) {
        if ((s0Var.f18433i & 16) == 16) {
            return b.b(fVar.k(s0Var.F));
        }
        return null;
    }

    public static final Pair f(String[] data, String[] strings) throws q {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bytes = a.a(data);
        Intrinsics.checkNotNullExpressionValue(bytes, "decodeBytes(...)");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        f fVarG = g(byteArrayInputStream, strings);
        pp.a aVar = pp.k.f18333i0;
        aVar.getClass();
        vp.e eVar = new vp.e(byteArrayInputStream);
        vp.a aVar2 = (vp.a) aVar.a(eVar, f20880a);
        try {
            eVar.a(0);
            if (aVar2.b()) {
                return new Pair(fVarG, (pp.k) aVar2);
            }
            q qVar = new q(new d1().getMessage());
            qVar.f21916d = aVar2;
            throw qVar;
        } catch (q e10) {
            e10.f21916d = aVar2;
            throw e10;
        }
    }

    public static f g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        j jVar = (j) j.E.b(byteArrayInputStream, f20880a);
        Intrinsics.checkNotNullExpressionValue(jVar, "parseDelimitedFrom(...)");
        return new f(jVar, strArr);
    }

    public static final Pair h(String[] data, String[] strings) throws q {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bytes = a.a(data);
        Intrinsics.checkNotNullExpressionValue(bytes, "decodeBytes(...)");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        f fVarG = g(byteArrayInputStream, strings);
        pp.a aVar = pp.e0.I;
        aVar.getClass();
        vp.e eVar = new vp.e(byteArrayInputStream);
        vp.a aVar2 = (vp.a) aVar.a(eVar, f20880a);
        try {
            eVar.a(0);
            if (aVar2.b()) {
                return new Pair(fVarG, (pp.e0) aVar2);
            }
            q qVar = new q(new d1().getMessage());
            qVar.f21916d = aVar2;
            throw qVar;
        } catch (q e10) {
            e10.f21916d = aVar2;
            throw e10;
        }
    }
}
