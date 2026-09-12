package pe;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
