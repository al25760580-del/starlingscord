package ji;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ze.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f13887a = new AtomicReference();

    @Override // ze.b
    public final void a(boolean z5) {
        synchronized (f.j) {
            try {
                for (f fVar : new ArrayList(f.k.values())) {
                    if (fVar.f13894e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = fVar.f13898i.iterator();
                        while (it.hasNext()) {
                            f fVar2 = ((c) it.next()).f13886a;
                            if (!z5) {
                                ((vi.c) fVar2.f13897h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
