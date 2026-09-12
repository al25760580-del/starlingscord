package rd;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends od.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f19264v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f19265w;

    public g(long j, List list) {
        super(0L, list.size() - 1);
        this.f19265w = j;
        this.f19264v = list;
    }

    @Override // od.m
    public final long d() {
        a();
        return this.f19265w + ((sd.g) this.f19264v.get((int) this.f17207i)).f19864w;
    }

    @Override // od.m
    public final long f() {
        a();
        sd.g gVar = (sd.g) this.f19264v.get((int) this.f17207i);
        return this.f19265w + gVar.f19864w + gVar.f19862i;
    }
}
