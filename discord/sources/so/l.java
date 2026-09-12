package so;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vo.h0;
import yo.v;
import yo.z;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f20357e;

    public /* synthetic */ l(z zVar, int i7) {
        this.f20356d = i7;
        this.f20357e = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20356d) {
            case 0:
                return ((v) this.f20357e.O(p.f20401i)).E;
            case 1:
                return new uo.i(this.f20357e);
            default:
                z zVar = this.f20357e;
                n8.f fVar = zVar.E;
                if (fVar == null) {
                    StringBuilder sb2 = new StringBuilder("Dependencies of module ");
                    String str = zVar.getName().f21269d;
                    Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                    sb2.append(str);
                    sb2.append(" were not set before querying module content");
                    throw new AssertionError(sb2.toString());
                }
                List list = (List) fVar.f16510e;
                zVar.A0();
                list.contains(zVar);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(e0.l(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h0 h0Var = ((z) it2.next()).F;
                    Intrinsics.checkNotNull(h0Var);
                    arrayList.add(h0Var);
                }
                return new yo.k(arrayList, "CompositeProvider@ModuleDescriptor for " + zVar.getName());
        }
    }
}
