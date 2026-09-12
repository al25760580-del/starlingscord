package ip;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f13352e;

    public /* synthetic */ g(j jVar, int i7) {
        this.f13351d = i7;
        this.f13352e = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13351d) {
            case 0:
                j jVar = this.f13352e;
                up.b classId = bq.e.f(jVar);
                if (classId == null) {
                    return null;
                }
                ((hp.a) jVar.f13356y.f7980e).f10977w.getClass();
                Intrinsics.checkNotNullParameter(classId, "classId");
                return null;
            case 1:
                j jVar2 = this.f13352e;
                bp.o oVar = jVar2.E;
                ArrayList<bp.c0> typeParameters = oVar.getTypeParameters();
                ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(typeParameters, 10));
                for (bp.c0 c0Var : typeParameters) {
                    r0 r0VarA = ((hp.f) jVar2.G.f7981i).a(c0Var);
                    if (r0VarA == null) {
                        throw new AssertionError("Parameter " + c0Var + " surely belongs to class " + oVar + ", so it must be resolved");
                    }
                    arrayList.add(r0VarA);
                }
                return arrayList;
            default:
                return w3.q.l(this.f13352e);
        }
    }
}
