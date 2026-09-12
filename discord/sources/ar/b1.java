package ar;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletableJob;

/* JADX INFO: loaded from: classes3.dex */
public class b1 extends i1 implements CompletableJob {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2895i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1() {
        i1 i1VarI;
        super(true);
        boolean z5 = true;
        P(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i1.f2929e;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        o oVar = nVar instanceof o ? (o) nVar : null;
        if (oVar == null || (i1VarI = oVar.i()) == null) {
            z5 = false;
            break;
        }
        while (!i1VarI.J()) {
            n nVar2 = (n) atomicReferenceFieldUpdater.get(i1VarI);
            o oVar2 = nVar2 instanceof o ? (o) nVar2 : null;
            if (oVar2 == null || (i1VarI = oVar2.i()) == null) {
                z5 = false;
                break;
            }
        }
        this.f2895i = z5;
    }

    @Override // ar.i1
    public final boolean J() {
        return this.f2895i;
    }

    @Override // ar.i1
    public final boolean K() {
        return true;
    }
}
