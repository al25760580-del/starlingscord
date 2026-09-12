package uo;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vo.z;
import yo.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f21210e = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21211d = 0;

    public /* synthetic */ f() {
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z5 = false;
        switch (this.f21211d) {
            case 0:
                z module = (z) obj;
                e eVar = g.f21212c;
                Intrinsics.checkNotNullParameter(module, "module");
                List list = (List) io.sentry.config.a.H(((v) module.O(g.f21214e)).f23486x, v.F[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof iq.c) {
                        arrayList.add(obj2);
                    }
                }
                return (iq.c) CollectionsKt.K(arrayList);
            default:
                vo.d dVar = (vo.d) obj;
                if (dVar.c() == vo.c.f21792d) {
                    vo.l lVarG = dVar.g();
                    Intrinsics.checkNotNull(lVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    vo.f mutable = (vo.f) lVarG;
                    Intrinsics.checkNotNullParameter(mutable, "mutable");
                    String str = d.f21197a;
                    if (d.j.containsKey(xp.e.g(mutable))) {
                        z5 = true;
                    }
                }
                return Boolean.valueOf(z5);
        }
    }

    public f(o oVar) {
    }
}
