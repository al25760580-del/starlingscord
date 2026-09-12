package er;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends dr.y implements dr.b0 {
    public final void v(int i7) {
        synchronized (this) {
            Object[] objArr = this.E;
            Intrinsics.checkNotNull(objArr);
            d(Integer.valueOf(((Number) dr.z.c(objArr, (this.F + ((long) ((int) ((o() + ((long) this.H)) - this.F)))) - 1)).intValue() + i7));
        }
    }
}
