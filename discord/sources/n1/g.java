package n1;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f16221e;

    public /* synthetic */ g(CancellationSignal cancellationSignal, int i7) {
        this.f16220d = i7;
        this.f16221e = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16220d) {
            case 0:
                this.f16221e.cancel();
                break;
            default:
                this.f16221e.cancel();
                break;
        }
        return Unit.f14616a;
    }
}
