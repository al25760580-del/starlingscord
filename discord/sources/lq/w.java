package lq;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f15259e = new w(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15260d;

    public /* synthetic */ w(int i7) {
        this.f15260d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection collectionH;
        switch (this.f15260d) {
            case 0:
                z it = (z) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            case 1:
                q0 it2 = (q0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                i iVar = it2 instanceof i ? (i) it2 : null;
                if (iVar != null) {
                    collectionH = CollectionsKt.V(((h) iVar.f15213b.invoke()).f15209a, iVar.d(false));
                } else {
                    collectionH = it2.h();
                    Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
                }
                return collectionH;
            default:
                up.c cVar = (up.c) obj;
                if (cVar != null) {
                    return Boolean.valueOf(!cVar.equals(so.o.f20391y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }

    public w(i iVar) {
        this.f15260d = 1;
    }
}
