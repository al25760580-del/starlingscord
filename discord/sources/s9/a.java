package s9;

import android.util.Log;
import androidx.work.Worker;
import ig.g;
import java.io.IOException;
import po.d;
import ye.c;
import ze.m;
import ze.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19805e;

    public /* synthetic */ a(int i7, Object obj) {
        this.f19804d = i7;
        this.f19805e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19804d) {
            case 0:
                b bVar = (b) this.f19805e;
                bVar.unscheduleSelf(this);
                bVar.invalidateSelf();
                break;
            case 1:
                Worker worker = (Worker) this.f19805e;
                try {
                    worker.f2812w.j(worker.f());
                } catch (Throwable th2) {
                    worker.f2812w.k(th2);
                    return;
                }
                break;
            case 2:
                if (((g) this.f19805e).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
                break;
            case 3:
                ((m) this.f19805e).e();
                break;
            case 4:
                c cVar = ((m) ((d) this.f19805e).f18079e).f23946g;
                cVar.b(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                break;
            default:
                ((v) this.f19805e).f23978m.A(new xe.b(4, null, null));
                break;
        }
    }
}
