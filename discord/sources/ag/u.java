package ag;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f582i;

    public u(v vVar) {
        this.f582i = vVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        v vVar = this.f582i;
        return new AbstractMap.SimpleImmutableEntry(vVar.f584v.f587i.f521x.get(i7), vVar.f584v.f588v.get(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f582i.f584v.f588v.size();
    }
}
