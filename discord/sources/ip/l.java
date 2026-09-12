package ip;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f1;
import kotlin.collections.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f13361e;

    public /* synthetic */ l(p pVar, int i7) {
        this.f13360d = i7;
        this.f13361e = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13360d) {
            case 0:
                Class<?>[] declaredClasses = this.f13361e.f13375o.f3364a.getDeclaredClasses();
                Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
                return CollectionsKt.l0(xq.r.q(xq.r.o(xq.r.i(kotlin.collections.y.o(declaredClasses), bp.b.f3336v), bp.b.f3337w)));
            case 1:
                List listB = this.f13361e.f13375o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((bp.u) obj).f3370a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iA = v0.a(kotlin.collections.e0.l(arrayList, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((bp.u) obj2).c(), obj2);
                }
                return linkedHashMap;
            default:
                p pVar = this.f13361e;
                return f1.d(pVar.b(), pVar.f());
        }
    }
}
