package ei;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends h0 {
    public static final Object[] F;
    public static final x0 G;
    public final transient int E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object[] f8386v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient int f8387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient Object[] f8388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient int f8389y;

    static {
        Object[] objArr = new Object[0];
        F = objArr;
        G = new x0(0, 0, 0, objArr, objArr);
    }

    public x0(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f8386v = objArr;
        this.f8387w = i7;
        this.f8388x = objArr2;
        this.f8389y = i10;
        this.E = i11;
    }

    @Override // ei.z
    public final int b(int i7, Object[] objArr) {
        Object[] objArr2 = this.f8386v;
        int i10 = this.E;
        System.arraycopy(objArr2, 0, objArr, i7, i10);
        return i7 + i10;
    }

    @Override // ei.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f8388x;
            if (objArr.length != 0) {
                int iQ = p.q(obj);
                while (true) {
                    int i7 = iQ & this.f8389y;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iQ = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // ei.z
    public final Object[] d() {
        return this.f8386v;
    }

    @Override // ei.z
    public final int e() {
        return this.E;
    }

    @Override // ei.z
    public final int h() {
        return 0;
    }

    @Override // ei.h0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8387w;
    }

    @Override // ei.z
    public final boolean i() {
        return false;
    }

    @Override // ei.h0
    public final e0 o() {
        return e0.j(this.E, this.f8386v);
    }

    @Override // ei.h0
    /* JADX INFO: renamed from: p */
    public final e1 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.E;
    }
}
