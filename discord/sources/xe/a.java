package xe;

import af.w;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22906d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f22907e = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        w.f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f22906d) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f22906d = true;
        IBinder iBinder = (IBinder) this.f22907e.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f22907e.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
