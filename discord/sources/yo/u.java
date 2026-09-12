package yo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f23483e;

    public /* synthetic */ u(v vVar, int i7) {
        this.f23482d = i7;
        this.f23483e = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23482d) {
            case 0:
                v vVar = this.f23483e;
                z zVar = vVar.f23484v;
                zVar.A0();
                return sa.a.A((k) zVar.I.getValue(), vVar.f23485w);
            case 1:
                v vVar2 = this.f23483e;
                z zVar2 = vVar2.f23484v;
                zVar2.A0();
                return Boolean.valueOf(sa.a.s((k) zVar2.I.getValue(), vVar2.f23485w));
            default:
                v vVar3 = this.f23483e;
                kq.i iVar = vVar3.f23487y;
                KProperty[] kPropertyArr = v.F;
                boolean zBooleanValue = ((Boolean) io.sentry.config.a.H(iVar, kPropertyArr[1])).booleanValue();
                up.c cVar = vVar3.f23485w;
                z zVar3 = vVar3.f23484v;
                if (zBooleanValue) {
                    return eq.n.f8648b;
                }
                List list = (List) io.sentry.config.a.H(vVar3.f23486x, kPropertyArr[0]);
                ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((vo.e0) it.next()).J());
                }
                return mf.f.f("package view scope for " + cVar + " in " + zVar3.getName(), CollectionsKt.W(arrayList, new l0(zVar3, cVar)));
        }
    }
}
