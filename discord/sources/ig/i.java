package ig;

import com.google.android.gms.internal.play_billing.u0;
import com.google.android.gms.tasks.Task;
import hi.o;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements k, d, c, b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f11767e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f11768i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f11769v;

    public /* synthetic */ i(Executor executor, a aVar, l lVar, int i7) {
        this.f11766d = i7;
        this.f11767e = executor;
        this.f11768i = aVar;
        this.f11769v = lVar;
    }

    @Override // ig.b
    public void J() {
        this.f11769v.r();
    }

    @Override // ig.k
    public final void a(Task task) {
        switch (this.f11766d) {
            case 0:
                this.f11767e.execute(new o(this, task, 11, false));
                break;
            default:
                this.f11767e.execute(new u0(this, task, 12, false));
                break;
        }
    }

    @Override // ig.c
    public void onFailure(Exception exc) {
        this.f11769v.p(exc);
    }

    @Override // ig.d
    public void onSuccess(Object obj) {
        this.f11769v.q(obj);
    }
}
