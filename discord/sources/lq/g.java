package lq;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f15206e;

    public /* synthetic */ g(i iVar, int i7) {
        this.f15205d = i7;
        this.f15206e = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15205d) {
            case 0:
                h supertypes = (h) obj;
                Intrinsics.checkNotNullParameter(supertypes, "supertypes");
                i currentTypeConstructor = this.f15206e;
                vo.o0 o0VarE = currentTypeConstructor.e();
                Collection superTypes = supertypes.f15209a;
                w neighbors = new w(currentTypeConstructor);
                g reportLoop = new g(currentTypeConstructor, 1);
                o0VarE.getClass();
                Intrinsics.checkNotNullParameter(currentTypeConstructor, "currentTypeConstructor");
                Intrinsics.checkNotNullParameter(superTypes, "superTypes");
                Intrinsics.checkNotNullParameter(neighbors, "neighbors");
                Intrinsics.checkNotNullParameter(reportLoop, "reportLoop");
                if (superTypes.isEmpty()) {
                    z zVarC = currentTypeConstructor.c();
                    List listC = zVarC != null ? kotlin.collections.c0.c(zVarC) : null;
                    if (listC == null) {
                        listC = kotlin.collections.n0.f14659d;
                    }
                    superTypes = listC;
                }
                List listI0 = superTypes instanceof List ? (List) superTypes : null;
                if (listI0 == null) {
                    listI0 = CollectionsKt.i0(superTypes);
                }
                List listL = currentTypeConstructor.l(listI0);
                Intrinsics.checkNotNullParameter(listL, "<set-?>");
                supertypes.f15210b = listL;
                break;
            default:
                z it = (z) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f15206e.m(it);
                break;
        }
        return Unit.f14616a;
    }
}
