package zp;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24069b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String message) {
        super(Unit.f14616a);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f24069b = message;
    }

    @Override // zp.g
    public final lq.z a(vo.z module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return nq.l.c(nq.k.ERROR_CONSTANT_VALUE, this.f24069b);
    }

    @Override // zp.g
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // zp.g
    public final String toString() {
        return this.f24069b;
    }
}
