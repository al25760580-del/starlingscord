package xj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends d {
    public abstract void s(StringBuilder sb2, int i7);

    public abstract int t(int i7);

    public final void u(int i7, int i10, StringBuilder sb2) {
        int iQ = n8.f.Q(i7, i10, (mj.a) ((n8.f) this.f9257b).f16510e);
        s(sb2, iQ);
        int iT = t(iQ);
        int i11 = 100000;
        for (int i12 = 0; i12 < 5; i12++) {
            if (iT / i11 == 0) {
                sb2.append('0');
            }
            i11 /= 10;
        }
        sb2.append(iT);
    }
}
