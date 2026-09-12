package aj;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import yi.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f625d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f626e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f629c;

    public d() {
        if (k8.a.f14311e == null) {
            Pattern pattern = j.f23373c;
            k8.a.f14311e = new k8.a();
        }
        k8.a aVar = k8.a.f14311e;
        if (j.f23374d == null) {
            j.f23374d = new j(aVar);
        }
        this.f627a = j.f23374d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final synchronized boolean a() {
        boolean z5;
        if (this.f629c != 0) {
            this.f627a.f23375a.getClass();
            if (System.currentTimeMillis() > this.f628b) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = true;
        }
        return z5;
    }

    public final synchronized void b(int i7) {
        long jMin;
        if ((i7 >= 200 && i7 < 300) || i7 == 401 || i7 == 404) {
            synchronized (this) {
                this.f629c = 0;
            }
            return;
        }
        this.f629c++;
        synchronized (this) {
            try {
                if (i7 == 429 || (i7 >= 500 && i7 < 600)) {
                    double dPow = Math.pow(2.0d, this.f629c);
                    this.f627a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f626e);
                } else {
                    jMin = f625d;
                }
                this.f627a.f23375a.getClass();
                this.f628b = System.currentTimeMillis() + jMin;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return;
        throw th;
    }
}
