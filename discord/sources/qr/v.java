package qr;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends xn.g implements Function3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19039e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ rn.b f19040i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a5.b0 f19041v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a5.b0 b0Var, Continuation continuation) {
        super(3, continuation);
        this.f19041v = b0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v vVar = new v(this.f19041v, (Continuation) obj3);
        vVar.f19040i = (rn.b) obj;
        return vVar.invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        a5.b0 b0Var = this.f19041v;
        pc.f fVar = (pc.f) b0Var.f174i;
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f19039e;
        if (i7 == 0) {
            ib.a.L(obj);
            rn.b bVar = this.f19040i;
            byte bY = fVar.y();
            if (bY == 1) {
                return b0Var.A(true);
            }
            if (bY == 0) {
                return b0Var.A(false);
            }
            if (bY != 6) {
                if (bY == 8) {
                    return b0Var.y();
                }
                pc.f.q(fVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f19039e = 1;
            obj = a5.b0.g(b0Var, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        return (JsonElement) obj;
    }
}
