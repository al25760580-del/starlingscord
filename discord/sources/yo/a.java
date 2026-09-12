package yo;

import java.util.List;
import kotlin.jvm.functions.Function0;
import lq.b1;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f23414e;

    public /* synthetic */ a(b bVar, int i7) {
        this.f23413d = i7;
        this.f23414e = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i7 = this.f23413d;
        b bVar = this.f23414e;
        switch (i7) {
            case 0:
                eq.o oVarN0 = bVar.n0();
                bp.i iVar = new bp.i(21, this);
                nq.i iVar2 = b1.f15178a;
                if (nq.l.f(bVar)) {
                    return nq.l.c(nq.k.UNABLE_TO_SUBSTITUTE_TYPE, bVar.toString());
                }
                lq.q0 q0VarN = bVar.n();
                if (q0VarN == null) {
                    b1.a(12);
                    throw null;
                }
                if (oVarN0 == null) {
                    b1.a(13);
                    throw null;
                }
                List listD = b1.d(q0VarN.getParameters());
                lq.l0.f15225e.getClass();
                return lq.c.w(lq.l0.f15226i, q0VarN, listD, false, oVarN0, iVar);
            case 1:
                return new eq.i(bVar.n0());
            default:
                return new t(bVar);
        }
    }
}
