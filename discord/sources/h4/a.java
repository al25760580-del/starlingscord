package h4;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10326e;

    public /* synthetic */ a(int i7, Object obj) {
        this.f10325d = i7;
        this.f10326e = obj;
    }

    public void a() {
        ThreadLocal threadLocal = (ThreadLocal) this.f10326e;
        Integer num = (Integer) threadLocal.get();
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue() - 1;
        if (iIntValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(iIntValue));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f10325d) {
            case 0:
                ((b) this.f10326e).f10329c.post(runnable);
                return;
            case 1:
                ((eg.a) this.f10326e).post(runnable);
                return;
            case 2:
                ThreadLocal threadLocal = (ThreadLocal) this.f10326e;
                Integer num = (Integer) threadLocal.get();
                if (num == null) {
                    num = 0;
                }
                int iIntValue = num.intValue() + 1;
                threadLocal.set(Integer.valueOf(iIntValue));
                try {
                    if (iIntValue <= 15) {
                        runnable.run();
                    } else {
                        j4.b.f13649c.f13650a.execute(runnable);
                    }
                    a();
                    return;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            default:
                ((Executor) this.f10326e).execute(new gf.a(2, runnable));
                return;
        }
    }

    public a(int i7) {
        this.f10325d = i7;
        switch (i7) {
            case 2:
                break;
            default:
                eg.a aVar = new eg.a(Looper.getMainLooper());
                Looper.getMainLooper();
                this.f10326e = aVar;
                break;
        }
    }
}
