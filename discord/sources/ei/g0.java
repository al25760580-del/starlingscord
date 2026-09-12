package ei;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends y {
    @Override // ei.y
    public final y b(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final h0 f() {
        int i7 = this.f8391b;
        if (i7 == 0) {
            int i10 = h0.f8309i;
            return x0.G;
        }
        if (i7 != 1) {
            h0 h0VarK = h0.k(i7, this.f8390a);
            this.f8391b = h0VarK.size();
            this.f8392c = true;
            return h0VarK;
        }
        Object obj = this.f8390a[0];
        Objects.requireNonNull(obj);
        int i11 = h0.f8309i;
        return new d1(obj);
    }
}
