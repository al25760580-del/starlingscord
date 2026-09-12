package c5;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f3488e;

    public /* synthetic */ f(Handler handler, int i7) {
        this.f3487d = i7;
        this.f3488e = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3487d) {
            case 0:
                this.f3488e.post(runnable);
                return;
            case 1:
                runnable.getClass();
                Handler handler = this.f3488e;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                this.f3488e.post(runnable);
                return;
        }
    }
}
