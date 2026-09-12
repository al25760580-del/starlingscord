package vo;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.firebase.messaging.r f21790e;

    public /* synthetic */ b0(com.google.firebase.messaging.r rVar, int i7) {
        this.f21789d = i7;
        this.f21790e = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21789d) {
            case 0:
                up.c fqName = (up.c) obj;
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return new uo.m((z) this.f21790e.f6611e, fqName, 1);
            default:
                c0 c0Var = (c0) obj;
                Intrinsics.checkNotNullParameter(c0Var, "<destruct>");
                up.b bVar = c0Var.f21797a;
                List list = c0Var.f21798b;
                if (bVar.f21260c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + bVar);
                }
                up.b bVarE = bVar.e();
                com.google.firebase.messaging.r rVar = this.f21790e;
                h hVarD = bVarE != null ? rVar.d(bVarE, CollectionsKt.F(1, list)) : (h) ((kq.e) rVar.f6612i).invoke(bVar.f21258a);
                boolean zG = bVar.g();
                kq.l lVar = (kq.l) rVar.f6610d;
                up.e eVarF = bVar.f();
                Integer num = (Integer) CollectionsKt.firstOrNull(list);
                return new d0(lVar, hVarD, eVarF, zG, num != null ? num.intValue() : 0);
        }
    }
}
