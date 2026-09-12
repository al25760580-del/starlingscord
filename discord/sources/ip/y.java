package ip;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import vo.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f13396e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bp.u f13397i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Ref.ObjectRef f13398v;

    public /* synthetic */ y(b0 b0Var, bp.u uVar, Ref.ObjectRef objectRef, int i7) {
        this.f13395d = i7;
        this.f13396e = b0Var;
        this.f13397i = uVar;
        this.f13398v = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13395d) {
            case 0:
                b0 b0Var = this.f13396e;
                kq.o oVar = ((hp.a) b0Var.f13320b.f7980e).f10957a;
                y yVar = new y(b0Var, this.f13397i, this.f13398v, 1);
                kq.l lVar = (kq.l) oVar;
                lVar.getClass();
                return new kq.h(lVar, yVar);
            default:
                fp.i iVar = ((hp.a) this.f13396e.f13320b.f7980e).f10964h;
                l0 descriptor = (l0) this.f13398v.element;
                iVar.getClass();
                bp.u field = this.f13397i;
                Intrinsics.checkNotNullParameter(field, "field");
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return null;
        }
    }
}
