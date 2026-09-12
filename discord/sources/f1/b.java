package f1;

import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ac.b f8786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8787c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f8785a) {
                    return;
                }
                this.f8785a = true;
                this.f8787c = true;
                ac.b bVar = this.f8786b;
                if (bVar != null) {
                    try {
                        Runnable runnable = (Runnable) bVar.f308v;
                        Transition transition = (Transition) bVar.f307i;
                        Runnable runnable2 = (Runnable) bVar.f306e;
                        if (runnable == null) {
                            transition.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f8787c = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    this.f8787c = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
