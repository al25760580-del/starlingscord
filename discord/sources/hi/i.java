package hi;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ boolean a(Unsafe unsafe, m mVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(mVar, j, obj, obj2)) {
            if (unsafe.getObject(mVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
