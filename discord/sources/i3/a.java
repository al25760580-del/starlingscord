package i3;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kk.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f11383e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f11385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f11386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f11387d;

    public a(String name, File lockDir, boolean z5) {
        Lock lock;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lockDir, "lockDir");
        this.f11384a = z5;
        File file = new File(lockDir, b.j(name, ".lck"));
        this.f11385b = file;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "lockFile.absolutePath");
        HashMap map = f11383e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(absolutePath);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(absolutePath, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11386c = lock;
    }

    public final void a(boolean z5) {
        File file = this.f11385b;
        this.f11386c.lock();
        if (z5) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f11387d = channel;
            } catch (IOException e10) {
                this.f11387d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f11387d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f11386c.unlock();
    }
}
