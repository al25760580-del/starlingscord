package ic;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Handler f11508d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11508d.post(runnable);
    }
}
