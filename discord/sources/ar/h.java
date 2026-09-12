package ar;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2920e;

    public /* synthetic */ h(int i7, Object obj) {
        this.f2919d = i7;
        this.f2920e = obj;
    }

    @Override // ar.i
    public final void a(Throwable th2) {
        switch (this.f2919d) {
            case 0:
                ((ScheduledFuture) this.f2920e).cancel(false);
                break;
            case 1:
                ((Function1) this.f2920e).invoke(th2);
                break;
            default:
                ((m0) this.f2920e).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f2919d) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f2920e) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f2920e).getClass().getSimpleName() + '@' + b0.o(this) + ']';
            default:
                return "DisposeOnCancel[" + ((m0) this.f2920e) + ']';
        }
    }
}
