package xj;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(mj.a aVar, int i7) {
        super(aVar);
        this.f22953c = i7;
    }

    @Override // fh.s
    public final String k() throws ij.h {
        switch (this.f22953c) {
            case 0:
                n8.f fVar = (n8.f) this.f9257b;
                if (((mj.a) this.f9256a).f15838e < 48) {
                    throw ij.h.f11808i;
                }
                StringBuilder sb2 = new StringBuilder();
                q(sb2, 8);
                int iQ = n8.f.Q(48, 2, (mj.a) fVar.f16510e);
                sb2.append("(392");
                sb2.append(iQ);
                sb2.append(')');
                sb2.append(fVar.M(50, null).f22957i);
                return sb2.toString();
            case 1:
                n8.f fVar2 = (n8.f) this.f9257b;
                if (((mj.a) this.f9256a).f15838e < 48) {
                    throw ij.h.f11808i;
                }
                StringBuilder sb3 = new StringBuilder();
                q(sb3, 8);
                int iQ2 = n8.f.Q(48, 2, (mj.a) fVar2.f16510e);
                sb3.append("(393");
                sb3.append(iQ2);
                sb3.append(')');
                int iQ3 = n8.f.Q(50, 10, (mj.a) fVar2.f16510e);
                if (iQ3 / 100 == 0) {
                    sb3.append('0');
                }
                if (iQ3 / 10 == 0) {
                    sb3.append('0');
                }
                sb3.append(iQ3);
                sb3.append(fVar2.M(60, null).f22957i);
                return sb3.toString();
            default:
                StringBuilder sbN = kk.b.n("(01)");
                int length = sbN.length();
                n8.f fVar3 = (n8.f) this.f9257b;
                sbN.append(n8.f.Q(4, 4, (mj.a) fVar3.f16510e));
                r(8, length, sbN);
                return fVar3.L(sbN, 48);
        }
    }
}
