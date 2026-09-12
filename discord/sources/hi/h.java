package hi;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ boolean a(Unsafe unsafe, m mVar, long j, c cVar, c cVar2) {
        while (!unsafe.compareAndSwapObject(mVar, j, cVar, cVar2)) {
            if (unsafe.getObject(mVar, j) != cVar) {
                return false;
            }
        }
        return true;
    }
}
