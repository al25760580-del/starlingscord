package i1;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11381a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f11381a) {
            case 0:
                return new i(runnable);
            case 1:
                return new Thread(runnable, "UpdateListenerExecutor");
            default:
                return new Thread(runnable, "AssetPackBackgroundExecutor");
        }
    }
}
