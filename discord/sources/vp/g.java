package vp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21884b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f21885a;

    static {
        new g(0);
    }

    public g() {
        this.f21885a = new HashMap();
    }

    public final void a(m mVar) {
        this.f21885a.put(new f(mVar.f21913d.f21907d, mVar.f21910a), mVar);
    }

    public g(int i7) {
        this.f21885a = Collections.EMPTY_MAP;
    }
}
