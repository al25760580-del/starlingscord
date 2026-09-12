package rd;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends fe.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19266g;

    @Override // fe.p
    public final void b(long j, long j5, long j7, List list, od.m[] mVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.f19266g, jElapsedRealtime)) {
            for (int i7 = this.f9080b - 1; i7 >= 0; i7--) {
                if (!a(i7, jElapsedRealtime)) {
                    this.f19266g = i7;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // fe.p
    public final int d() {
        return this.f19266g;
    }

    @Override // fe.p
    public final int m() {
        return 0;
    }

    @Override // fe.p
    public final Object p() {
        return null;
    }
}
