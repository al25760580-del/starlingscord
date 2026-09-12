package b4;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f3059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f3060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, c cVar) {
        super(0);
        this.f3059d = eVar;
        this.f3060e = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        c4.f fVar = this.f3059d.f3067a;
        c listener = this.f3060e;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (fVar.f3455c) {
            if (fVar.f3456d.remove(listener) && fVar.f3456d.isEmpty()) {
                fVar.d();
            }
        }
        return Unit.f14616a;
    }
}
