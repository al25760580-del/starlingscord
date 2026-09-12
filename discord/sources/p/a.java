package p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashMap f17709w = new HashMap();

    @Override // p.f
    public final c a(Object obj) {
        return (c) this.f17709w.get(obj);
    }

    @Override // p.f
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.f17709w.remove(obj);
        return objB;
    }
}
