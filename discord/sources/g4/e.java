package g4;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f9481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ListenableFuture f9482e;

    public e(j jVar, ListenableFuture listenableFuture) {
        this.f9481d = jVar;
        this.f9482e = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9481d.f9490d != this) {
            return;
        }
        if (h.f9488x.h(this.f9481d, this, h.g(this.f9482e))) {
            h.d(this.f9481d);
        }
    }
}
