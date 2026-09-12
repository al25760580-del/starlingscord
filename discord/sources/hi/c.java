package hi;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f10771d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f10772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f10773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f10774c;

    public c(Runnable runnable, Executor executor) {
        this.f10772a = runnable;
        this.f10773b = executor;
    }

    public c() {
        this.f10772a = null;
        this.f10773b = null;
    }
}
