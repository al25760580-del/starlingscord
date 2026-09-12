package v1;

import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f21352e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o1.d f21353i;

    public /* synthetic */ d(h hVar, o1.d dVar, int i7) {
        this.f21351d = i7;
        this.f21352e = hVar;
        this.f21353i = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f21351d) {
            case 0:
                h hVar = this.f21352e;
                Executor executor = hVar.f21364g;
                if (executor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor = null;
                }
                executor.execute(new c(hVar, this.f21353i, 2));
                break;
            default:
                h hVar2 = this.f21352e;
                Executor executor2 = hVar2.f21364g;
                if (executor2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor2 = null;
                }
                executor2.execute(new c(hVar2, this.f21353i, 0));
                break;
        }
        return Unit.f14616a;
    }
}
