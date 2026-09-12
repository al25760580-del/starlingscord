package gf;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f10032e;

    public /* synthetic */ a(int i7, Runnable runnable) {
        this.f10031d = i7;
        this.f10032e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10031d) {
            case 0:
                Process.setThreadPriority(0);
                this.f10032e.run();
                break;
            case 1:
                this.f10032e.run();
                break;
            default:
                try {
                    this.f10032e.run();
                } catch (Exception e10) {
                    io.sentry.config.a.p("Executor", "Background execution failure.", e10);
                    return;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f10031d) {
            case 1:
                return this.f10032e.toString();
            default:
                return super.toString();
        }
    }
}
