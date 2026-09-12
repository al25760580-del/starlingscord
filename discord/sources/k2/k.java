package k2;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class k extends a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.a f14243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f14244b;

    public k(a.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f14243a = aVar;
        this.f14244b = threadPoolExecutor;
    }

    @Override // a.a
    public final void s(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f14244b;
        try {
            this.f14243a.s(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a.a
    public final void t(com.google.firebase.messaging.r rVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f14244b;
        try {
            this.f14243a.t(rVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
