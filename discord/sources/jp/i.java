package jp;

import eq.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lq.d0;
import lq.d1;
import lq.l0;
import lq.s;
import lq.t0;
import lq.z;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d0 lowerBound, d0 upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        mq.d.f16016a.b(lowerBound, upperBound);
    }

    public static final ArrayList D0(wp.h hVar, z zVar) {
        List<t0> listL0 = zVar.l0();
        ArrayList arrayList = new ArrayList(e0.l(listL0, 10));
        for (t0 typeProjection : listL0) {
            Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
            StringBuilder sb2 = new StringBuilder();
            CollectionsKt.N(c0.c(typeProjection), sb2, ", ", null, null, new wp.g(hVar, 0), 60);
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    public static final String E0(String str, String str2) {
        if (!StringsKt.E(str, '<')) {
            return str;
        }
        return StringsKt.X(str, '<') + '<' + str2 + '>' + StringsKt.W('>', str, str);
    }

    @Override // lq.s
    public final d0 A0() {
        return this.f15248e;
    }

    @Override // lq.s
    public final String B0(wp.h renderer, wp.h options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        d0 d0Var = this.f15248e;
        String strX = renderer.X(d0Var);
        d0 d0Var2 = this.f15249i;
        String strX2 = renderer.X(d0Var2);
        if (options.f22428d.n()) {
            return "raw (" + strX + ".." + strX2 + ')';
        }
        if (d0Var2.l0().isEmpty()) {
            return renderer.E(strX, strX2, c9.a.o(this));
        }
        ArrayList arrayListD0 = D0(renderer, d0Var);
        ArrayList arrayListD1 = D0(renderer, d0Var2);
        String strO = CollectionsKt.O(arrayListD0, ", ", null, null, h.f14011d, 30);
        ArrayList arrayListN0 = CollectionsKt.n0(arrayListD0, arrayListD1);
        if (!arrayListN0.isEmpty()) {
            Iterator it = arrayListN0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strX2 = E0(strX2, strO);
                    break;
                }
                Pair pair = (Pair) it.next();
                String str = (String) pair.f14612d;
                String str2 = (String) pair.f14613e;
                if (!Intrinsics.areEqual(str, StringsKt.N(str2, "out ")) && !Intrinsics.areEqual(str2, "*")) {
                    break;
                }
            }
        } else {
            strX2 = E0(strX2, strO);
            break;
        }
        String strE0 = E0(strX, strO);
        return Intrinsics.areEqual(strE0, strX2) ? strE0 : renderer.E(strE0, strX2, c9.a.o(this));
    }

    @Override // lq.d1
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final s y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlinTypeRefiner.getClass();
        d0 type = this.f15248e;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        d0 type2 = this.f15249i;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNull(type2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new i(type, type2);
    }

    @Override // lq.s, lq.z
    public final o J() {
        vo.i iVarG = r0().g();
        vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
        if (fVar != null) {
            o oVarX = fVar.x(new g());
            Intrinsics.checkNotNullExpressionValue(oVarX, "getMemberScope(...)");
            return oVarX;
        }
        throw new IllegalStateException(("Incorrect classifier: " + r0().g()).toString());
    }

    @Override // lq.d1
    public final d1 x0(boolean z5) {
        return new i(this.f15248e.x0(z5), this.f15249i.x0(z5));
    }

    @Override // lq.d1
    public final d1 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new i(this.f15248e.z0(newAttributes), this.f15249i.z0(newAttributes));
    }
}
