package jq;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f14024e;

    public /* synthetic */ f(h hVar, int i7) {
        this.f14023d = i7;
        this.f14024e = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i7 = this.f14023d;
        h hVar = this.f14024e;
        switch (i7) {
            case 0:
                eq.f fVar = eq.f.f8623m;
                eq.o.f8649a.getClass();
                eq.l lVar = eq.l.f8642e;
                dp.c cVar = dp.c.f7693d;
                return hVar.i(fVar, lVar);
            default:
                mq.f fVar2 = hVar.f14027g;
                j classDescriptor = hVar.j;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
                Collection collectionH = ((lq.i) classDescriptor.n()).h();
                Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
                return collectionH;
        }
    }
}
