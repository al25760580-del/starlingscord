package io.sentry;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class c6 extends TimerTask {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e6 f12528e;

    public /* synthetic */ c6(e6 e6Var, int i7) {
        this.f12527d = i7;
        this.f12528e = e6Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f12527d) {
            case 0:
                e6 e6Var = this.f12528e;
                m6 m6VarA = e6Var.a();
                if (m6VarA == null) {
                    m6VarA = m6.OK;
                }
                e6Var.q(m6VarA, null);
                e6Var.f12651l.set(false);
                break;
            default:
                e6 e6Var2 = this.f12528e;
                m6 m6VarA2 = e6Var2.a();
                if (m6VarA2 == null) {
                    m6VarA2 = m6.DEADLINE_EXCEEDED;
                }
                e6Var2.d(m6VarA2, e6Var2.f12657r.f13093g != null, null);
                e6Var2.f12652m.set(false);
                break;
        }
    }
}
