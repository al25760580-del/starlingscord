package l4;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends FutureTask {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14822d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14823e;

    public /* synthetic */ b0(Callable callable) {
        super(callable);
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        switch (this.f14822d) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((c0) this.f14823e).d((a0) get());
                        } catch (InterruptedException | ExecutionException e10) {
                            ((c0) this.f14823e).d(new a0(e10));
                        }
                        break;
                    }
                    return;
                } finally {
                    this.f14823e = null;
                }
            case 1:
            default:
                super.done();
                return;
            case 2:
                w2.a aVar = (w2.a) this.f14823e;
                AtomicBoolean atomicBoolean = aVar.f22002v;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    aVar.a(obj);
                    return;
                } catch (InterruptedException e11) {
                    Log.w("AsyncTask", e11);
                    return;
                } catch (CancellationException unused) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    aVar.a(null);
                    return;
                } catch (ExecutionException e12) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e12.getCause());
                } catch (Throwable th2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th2);
                }
        }
    }

    @Override // java.util.concurrent.FutureTask
    public void setException(Throwable th2) {
        switch (this.f14822d) {
            case 1:
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = ((pe.f) this.f14823e).f18019d.f18025d;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
                } else if (Log.isLoggable("GAv4", 6)) {
                    String strValueOf = String.valueOf(th2);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 37);
                    sb2.append("MeasurementExecutor: job failed with ");
                    sb2.append(strValueOf);
                    Log.e("GAv4", sb2.toString());
                }
                super.setException(th2);
                break;
            default:
                super.setException(th2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(pe.f fVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f14823e = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(w2.a aVar, a5.v vVar) {
        super(vVar);
        this.f14823e = aVar;
    }
}
