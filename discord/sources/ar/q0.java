package ar;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends r0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f2956i;

    public q0(Runnable runnable, long j) {
        super(j);
        this.f2956i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2956i.run();
    }

    @Override // ar.r0
    public final String toString() {
        return super.toString() + this.f2956i;
    }
}
