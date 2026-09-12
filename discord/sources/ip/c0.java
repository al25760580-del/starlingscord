package ip;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements vq.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f13329d = new c0();

    @Override // vq.b
    public final Iterable b(Object obj) {
        int i7 = e0.f13340p;
        Collection collectionH = ((vo.f) obj).n().h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
        xq.g gVarO = xq.r.o(CollectionsKt.C(collectionH), n.f13369x);
        Intrinsics.checkNotNullParameter(gVarO, "<this>");
        return new kotlin.collections.x(3, gVarO);
    }
}
