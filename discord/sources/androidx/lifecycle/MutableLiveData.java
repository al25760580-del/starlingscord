package androidx.lifecycle;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class MutableLiveData extends LiveData {
    public final void i(Object obj) {
        boolean z5;
        synchronized (this.f2309a) {
            z5 = this.f2314f == LiveData.k;
            this.f2314f = obj;
        }
        if (z5) {
            o.a aVarT = o.a.T();
            a3.h hVar = this.j;
            o.c cVar = aVarT.f17070b;
            if (cVar.f17074d == null) {
                synchronized (cVar.f17072b) {
                    try {
                        if (cVar.f17074d == null) {
                            cVar.f17074d = o.c.T(Looper.getMainLooper());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            cVar.f17074d.post(hVar);
        }
    }
}
