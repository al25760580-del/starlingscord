package mi;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements xi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f15829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f15830b;

    @Override // xi.a
    public final Object get() {
        if (this.f15830b == null) {
            synchronized (this) {
                try {
                    if (this.f15830b == null) {
                        this.f15830b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f15829a.iterator();
                                while (it.hasNext()) {
                                    this.f15830b.add(((xi.a) it.next()).get());
                                }
                                this.f15829a = null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return Collections.unmodifiableSet(this.f15830b);
    }
}
