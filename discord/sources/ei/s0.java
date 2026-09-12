package ei;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t0 f8358i;

    public s0(t0 t0Var) {
        this.f8358i = t0Var;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        t0 t0Var = this.f8358i;
        ls.l.e(i7, t0Var.f8368x);
        Object[] objArr = t0Var.f8367w;
        int i10 = i7 * 2;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // ei.z
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8358i.f8368x;
    }
}
