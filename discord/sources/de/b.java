package de;

import java.util.Collections;
import java.util.List;
import vd.c;
import vd.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f7624e = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7625d;

    public b(c cVar) {
        this.f7625d = Collections.singletonList(cVar);
    }

    @Override // vd.f
    public final int f(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // vd.f
    public final long h(int i7) {
        je.b.g(i7 == 0);
        return 0L;
    }

    @Override // vd.f
    public final List l(long j) {
        return j >= 0 ? this.f7625d : Collections.EMPTY_LIST;
    }

    @Override // vd.f
    public final int o() {
        return 1;
    }

    public b() {
        this.f7625d = Collections.EMPTY_LIST;
    }
}
