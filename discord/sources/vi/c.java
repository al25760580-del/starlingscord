package vi;

import a5.l0;
import android.content.Context;
import ig.l;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji.b f21675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f21676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi.a f21677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f21678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f21679e;

    public c(Context context, String str, Set set, xi.a aVar, Executor executor) {
        this.f21675a = new ji.b(context, str);
        this.f21678d = set;
        this.f21679e = executor;
        this.f21677c = aVar;
        this.f21676b = context;
    }

    public final l a() {
        return !l0.K(this.f21676b) ? l0.v("") : l0.k(new b(this, 0), this.f21679e);
    }

    public final void b() {
        if (this.f21678d.size() <= 0) {
            l0.v(null);
        } else if (l0.K(this.f21676b)) {
            l0.k(new b(this, 1), this.f21679e);
        } else {
            l0.v(null);
        }
    }
}
