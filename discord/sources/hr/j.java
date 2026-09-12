package hr;

import ar.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f11110i;

    public j(Runnable runnable, long j, boolean z5) {
        super(j, z5);
        this.f11110i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11110i.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f11110i;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(b0.o(runnable));
        sb2.append(", ");
        sb2.append(this.f11108d);
        sb2.append(", ");
        return s0.g.g(sb2, this.f11109e ? "Blocking" : "Non-blocking", ']');
    }
}
