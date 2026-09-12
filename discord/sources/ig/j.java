package ig;

import com.google.android.gms.internal.play_billing.u0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import hi.o;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements k, d, c, b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f11771e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f11772i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f11773v;

    public j(Executor executor, OnCompleteListener onCompleteListener) {
        this.f11770d = 1;
        this.f11772i = new Object();
        this.f11771e = executor;
        this.f11773v = onCompleteListener;
    }

    @Override // ig.b
    public void J() {
        ((l) this.f11773v).r();
    }

    @Override // ig.k
    public final void a(Task task) {
        switch (this.f11770d) {
            case 0:
                if (task.k()) {
                    synchronized (this.f11772i) {
                        break;
                    }
                    this.f11771e.execute(new a3.h(21, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.f11772i) {
                    try {
                        if (((OnCompleteListener) this.f11773v) == null) {
                            return;
                        }
                        this.f11771e.execute(new o(this, task, 12, false));
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 2:
                if (task.m() || task.k()) {
                    return;
                }
                synchronized (this.f11772i) {
                    break;
                }
                this.f11771e.execute(new u0(this, task, 13, false));
                return;
            case 3:
                if (task.m()) {
                    synchronized (this.f11772i) {
                        break;
                    }
                    this.f11771e.execute(new o(this, task, 13, false));
                    return;
                }
                return;
            default:
                this.f11771e.execute(new u0(this, task, 14, false));
                return;
        }
    }

    @Override // ig.c
    public void onFailure(Exception exc) {
        ((l) this.f11773v).p(exc);
    }

    @Override // ig.d
    public void onSuccess(Object obj) {
        ((l) this.f11773v).q(obj);
    }

    public j(Executor executor, b bVar) {
        this.f11770d = 0;
        this.f11772i = new Object();
        this.f11771e = executor;
        this.f11773v = bVar;
    }

    public j(Executor executor, c cVar) {
        this.f11770d = 2;
        this.f11772i = new Object();
        this.f11771e = executor;
        this.f11773v = cVar;
    }

    public j(Executor executor, d dVar) {
        this.f11770d = 3;
        this.f11772i = new Object();
        this.f11771e = executor;
        this.f11773v = dVar;
    }

    public j(Executor executor, f fVar, l lVar) {
        this.f11770d = 4;
        this.f11771e = executor;
        this.f11772i = fVar;
        this.f11773v = lVar;
    }
}
