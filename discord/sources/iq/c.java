package iq;

import bq.e;
import com.google.firebase.messaging.r;
import ep.x;
import eq.o;
import hq.a0;
import hq.j;
import java.util.LinkedHashMap;
import java.util.List;
import jq.s;
import kotlin.collections.v0;
import kotlin.jvm.internal.Intrinsics;
import kq.l;
import mo.c0;
import pp.g0;
import pp.k;
import pp.m0;
import pp.n0;
import vo.e0;
import vo.z;
import yo.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b0 implements e0 {
    public final qp.a E;
    public final e4.c F;
    public final r G;
    public g0 H;
    public s I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(up.c fqName, l storageManager, z module, g0 proto, qp.a metadataVersion) {
        super(module, fqName);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.E = metadataVersion;
        n0 n0Var = proto.f18295v;
        Intrinsics.checkNotNullExpressionValue(n0Var, "getStrings(...)");
        m0 m0Var = proto.f18296w;
        Intrinsics.checkNotNullExpressionValue(m0Var, "getQualifiedNames(...)");
        e4.c nameResolver = new e4.c(n0Var, m0Var);
        this.F = nameResolver;
        a0 classSource = new a0(this);
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(classSource, "classSource");
        r rVar = new r();
        rVar.f6610d = nameResolver;
        rVar.f6611e = metadataVersion;
        rVar.f6612i = classSource;
        List list = proto.f18298y;
        Intrinsics.checkNotNullExpressionValue(list, "getClass_List(...)");
        int iA = v0.a(kotlin.collections.e0.l(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : list) {
            linkedHashMap.put(c0.s((e4.c) rVar.f6610d, ((k) obj).f18343w), obj);
        }
        rVar.f6613v = linkedHashMap;
        this.G = rVar;
        this.H = proto;
    }

    public final void C0(j components) {
        Intrinsics.checkNotNullParameter(components, "components");
        g0 g0Var = this.H;
        if (g0Var == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.H = null;
        pp.e0 e0Var = g0Var.f18297x;
        Intrinsics.checkNotNullExpressionValue(e0Var, "getPackage(...)");
        this.I = new s(this, e0Var, this.F, this.E, null, components, "scope of " + this, new x(6, this));
    }

    @Override // vo.e0
    public final o J() {
        s sVar = this.I;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_memberScope");
        return null;
    }

    @Override // yo.b0, yo.l, fq.a
    public final String toString() {
        return "builtins package fragment for " + this.f23420x + " from " + e.j(this);
    }
}
