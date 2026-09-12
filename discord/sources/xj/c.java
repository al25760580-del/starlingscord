package xj;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22955d;

    public c(mj.a aVar, String str, String str2) {
        super(aVar);
        this.f22954c = str2;
        this.f22955d = str;
    }

    @Override // fh.s
    public final String k() throws ij.h {
        if (((mj.a) this.f9256a).f15838e != 84) {
            throw ij.h.f11808i;
        }
        StringBuilder sb2 = new StringBuilder();
        q(sb2, 8);
        u(48, 20, sb2);
        int iQ = n8.f.Q(68, 16, (mj.a) ((n8.f) this.f9257b).f16510e);
        if (iQ != 38400) {
            sb2.append('(');
            sb2.append(this.f22954c);
            sb2.append(')');
            int i7 = iQ % 32;
            int i10 = iQ / 32;
            int i11 = (i10 % 12) + 1;
            int i12 = i10 / 12;
            if (i12 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i12);
            if (i11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i11);
            if (i7 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i7);
        }
        return sb2.toString();
    }

    @Override // xj.e
    public final void s(StringBuilder sb2, int i7) {
        sb2.append('(');
        sb2.append(this.f22955d);
        sb2.append(i7 / 100000);
        sb2.append(')');
    }

    @Override // xj.e
    public final int t(int i7) {
        return i7 % 100000;
    }
}
