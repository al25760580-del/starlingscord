package mf;

import android.os.Process;
import kotlin.Unit;
import rs.v;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15754d = 1;

    public /* synthetic */ e(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        okio.a aVarB;
        switch (this.f15754d) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                synchronized (okio.a.class) {
                    okio.a aVar = okio.a.j;
                    aVarB = v.b();
                    if (aVarB == okio.a.j) {
                        okio.a.j = null;
                        return;
                    }
                    Unit unit = Unit.f14616a;
                }
                if (aVarB != null) {
                    aVarB.k();
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ e(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
