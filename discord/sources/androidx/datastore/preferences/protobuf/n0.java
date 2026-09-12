package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f1906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f1907c;

    public n0(f1 f1Var, l lVar, a aVar) {
        this.f1906b = f1Var;
        lVar.getClass();
        this.f1907c = lVar;
        this.f1905a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void a(Object obj) {
        this.f1906b.getClass();
        ((s) obj).unknownFields.f1846e = false;
        this.f1907c.getClass();
        a3.e.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final boolean b(Object obj) {
        this.f1907c.getClass();
        a3.e.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final Object c() {
        return ((q) ((s) this.f1905a).d(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void d(Object obj, e0 e0Var) {
        this.f1907c.getClass();
        a3.e.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int e(a aVar) {
        this.f1906b.getClass();
        e1 e1Var = ((s) aVar).unknownFields;
        int i7 = e1Var.f1845d;
        if (i7 != -1) {
            return i7;
        }
        int iR = 0;
        for (int i10 = 0; i10 < e1Var.f1842a; i10++) {
            int i11 = e1Var.f1843b[i10] >>> 3;
            iR += i.r(3, (e) e1Var.f1844c[i10]) + i.z(i11) + i.y(2) + (i.y(1) * 2);
        }
        e1Var.f1845d = iR;
        return iR;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void f(s sVar, s sVar2) {
        w0.w(this.f1906b, sVar, sVar2);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int g(s sVar) {
        this.f1906b.getClass();
        return sVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final boolean h(s sVar, s sVar2) {
        this.f1906b.getClass();
        return sVar.unknownFields.equals(sVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void i(Object obj, g gVar, k kVar) {
        this.f1906b.getClass();
        s sVar = (s) obj;
        if (sVar.unknownFields == e1.f1841f) {
            sVar.unknownFields = e1.b();
        }
        this.f1907c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
