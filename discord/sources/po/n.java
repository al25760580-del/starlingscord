package po;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends com.facebook.imagepipeline.nativecode.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jq.t f18111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pp.i0 f18112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sp.e f18113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rp.f f18114i;
    public final pf.b j;
    public final String k;

    /* JADX WARN: Code duplicated, block: B:26:0x0106  */
    public n(jq.t descriptor, pp.i0 proto, sp.e signature, rp.f nameResolver, pf.b typeTable) {
        String string;
        String strO;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        this.f18111f = descriptor;
        this.f18112g = proto;
        this.f18113h = signature;
        this.f18114i = nameResolver;
        this.j = typeTable;
        if ((signature.f20449e & 4) == 4) {
            strO = nameResolver.getString(signature.f20452w.f20438i) + nameResolver.getString(signature.f20452w.f20439v);
        } else {
            tp.d dVarB = tp.g.b(proto, nameResolver, typeTable, true);
            if (dVarB == null) {
                throw new ar.a0("No field signature for property: " + descriptor);
            }
            String str = dVarB.k;
            String str2 = dVarB.f20874l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ep.z.a(str));
            vo.l lVarG = descriptor.g();
            Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
            if (Intrinsics.areEqual(descriptor.getVisibility(), vo.p.f21827d) && (lVarG instanceof jq.j)) {
                pp.k kVar = ((jq.j) lVarG).f14030w;
                vp.m classModuleName = sp.k.f20491i;
                Intrinsics.checkNotNullExpressionValue(classModuleName, "classModuleName");
                Integer num = (Integer) m3.m.B(kVar, classModuleName);
                String name = (num == null || (name = nameResolver.getString(num.intValue())) == null) ? "main" : name;
                StringBuilder sb3 = new StringBuilder("$");
                Regex regex = up.f.f21271a;
                Intrinsics.checkNotNullParameter(name, "name");
                sb3.append(up.f.f21271a.replace(name, "_"));
                string = sb3.toString();
            } else if (Intrinsics.areEqual(descriptor.getVisibility(), vo.p.f21824a) && (lVarG instanceof vo.e0)) {
                Intrinsics.checkNotNull(descriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                jq.l lVar = descriptor.f14063c0;
                if (lVar instanceof np.g) {
                    np.g gVar = (np.g) lVar;
                    if (gVar.f17003e != null) {
                        StringBuilder sb4 = new StringBuilder("$");
                        String strD = gVar.f17002d.d();
                        Intrinsics.checkNotNullExpressionValue(strD, "getInternalName(...)");
                        up.e eVarE = up.e.e(StringsKt.W('/', strD, strD));
                        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
                        sb4.append(eVarE.b());
                        string = sb4.toString();
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
            } else {
                string = "";
            }
            strO = a3.e.o(sb2, string, "()", str2);
        }
        this.k = strO;
    }

    @Override // com.facebook.imagepipeline.nativecode.b
    public final String e() {
        return this.k;
    }
}
