package sq;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q extends yk.a {
    public static final List j;

    static {
        up.e eVar = r.f20536i;
        l lVar = l.f20519e;
        h hVar = new h(eVar, new e[]{lVar, new w(1)});
        h hVar2 = new h(r.j, new e[]{lVar, new w(2)}, g.f20505w);
        up.e eVar2 = r.f20528a;
        k kVar = k.f20516c;
        w wVar = new w(2);
        k kVar2 = k.f20515b;
        h hVar3 = new h(eVar2, new e[]{lVar, kVar, wVar, kVar2});
        h hVar4 = new h(r.f20529b, new e[]{lVar, kVar, new w(3), kVar2});
        h hVar5 = new h(r.f20530c, new e[]{lVar, kVar, new w(), kVar2});
        h hVar6 = new h(r.f20534g, new e[]{lVar});
        up.e eVar3 = r.f20533f;
        x xVar = x.f20554e;
        s sVar = s.f20546c;
        h hVar7 = new h(eVar3, new e[]{lVar, xVar, kVar, sVar});
        up.e eVar4 = r.f20535h;
        x xVar2 = x.f20553d;
        h hVar8 = new h(eVar4, new e[]{lVar, xVar2});
        h hVar9 = new h(r.k, new e[]{lVar, xVar2});
        h hVar10 = new h(r.f20537l, new e[]{lVar, xVar2, sVar});
        h hVar11 = new h(r.f20541p, new e[]{lVar, xVar, kVar});
        h hVar12 = new h(r.f20542q, new e[]{lVar, xVar, kVar});
        h hVar13 = new h(r.f20531d, new e[]{l.f20518d}, g.f20506x);
        h hVar14 = new h(r.f20532e, new e[]{lVar, t.f20547c, xVar, kVar});
        h hVar15 = new h(r.f20544s, new e[]{lVar, xVar, kVar});
        h hVar16 = new h(r.f20543r, new e[]{lVar, xVar2});
        h hVar17 = new h(d0.g(r.f20539n, r.f20540o), new e[]{lVar}, g.f20507y);
        h hVar18 = new h(r.f20545t, new e[]{lVar, u.f20548c, xVar, kVar});
        Regex regex = r.f20538m;
        e[] checks = {lVar, xVar2};
        g additionalChecks = g.f20503i;
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
        j = d0.g(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16, hVar17, hVar18, new h(null, regex, null, additionalChecks, (e[]) Arrays.copyOf(checks, 2)));
    }
}
