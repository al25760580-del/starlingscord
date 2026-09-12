package i1;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11380d;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f11380d = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f11380d);
        super.run();
    }
}
