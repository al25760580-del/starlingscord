package je;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f13756b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f13757a;

    public a0(Handler handler) {
        this.f13757a = handler;
    }

    public static z b() {
        z zVar;
        ArrayList arrayList = f13756b;
        synchronized (arrayList) {
            try {
                zVar = arrayList.isEmpty() ? new z() : (z) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zVar;
    }

    public final z a(int i7, Object obj) {
        z zVarB = b();
        zVarB.f13867a = this.f13757a.obtainMessage(i7, obj);
        return zVarB;
    }

    public final boolean c(Runnable runnable) {
        return this.f13757a.post(runnable);
    }

    public final boolean d(int i7) {
        return this.f13757a.sendEmptyMessage(i7);
    }
}
