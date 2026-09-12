package s8;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f19795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f19796i = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile File f19798b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile File f19800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19801e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile StatFs f19797a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile StatFs f19799c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19803g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ReentrantLock f19802f = new ReentrantLock();

    public static StatFs b(StatFs statFs, File file) throws Throwable {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return new StatFs(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th2) {
                i.h(th2);
                throw null;
            }
        }
        return null;
    }

    public final void a() {
        if (this.f19803g) {
            return;
        }
        this.f19802f.lock();
        try {
            if (!this.f19803g) {
                this.f19798b = Environment.getDataDirectory();
                this.f19800d = Environment.getExternalStorageDirectory();
                this.f19797a = b(this.f19797a, this.f19798b);
                this.f19799c = b(this.f19799c, this.f19800d);
                this.f19801e = SystemClock.uptimeMillis();
                this.f19803g = true;
            }
        } finally {
            this.f19802f.unlock();
        }
    }
}
