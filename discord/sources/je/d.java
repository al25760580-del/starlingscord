package je;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Iterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13777d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f13778e = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Set f13779i = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f13780v = Collections.EMPTY_LIST;

    public final int a(mc.n nVar) {
        int iIntValue;
        synchronized (this.f13777d) {
            try {
                iIntValue = this.f13778e.containsKey(nVar) ? ((Integer) this.f13778e.get(nVar)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f13777d) {
            it = this.f13780v.iterator();
        }
        return it;
    }
}
