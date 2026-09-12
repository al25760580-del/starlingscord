package c5;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f3521c = w.f3524a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3522a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3523b = false;

    public final synchronized void a(long j, String str) {
        if (this.f3523b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f3522a.add(new u(j, SystemClock.elapsedRealtime(), str));
    }

    public final synchronized void b(String str) {
        long j;
        this.f3523b = true;
        ArrayList arrayList = this.f3522a;
        if (arrayList.size() == 0) {
            j = 0;
        } else {
            j = ((u) arrayList.get(arrayList.size() - 1)).f3520c - ((u) arrayList.get(0)).f3520c;
        }
        if (j <= 0) {
            return;
        }
        long j5 = ((u) this.f3522a.get(0)).f3520c;
        w.b("(%-4d ms) %s", Long.valueOf(j), str);
        for (u uVar : this.f3522a) {
            long j7 = uVar.f3520c;
            w.b("(+%-4d) [%2d] %s", Long.valueOf(j7 - j5), Long.valueOf(uVar.f3519b), uVar.f3518a);
            j5 = j7;
        }
    }

    public final void finalize() {
        if (this.f3523b) {
            return;
        }
        b("Request on the loose");
        w.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
