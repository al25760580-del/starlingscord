package xj;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(mj.a aVar, int i7) {
        super(aVar);
        this.f22952c = i7;
    }

    @Override // fh.s
    public final String k() throws ij.h {
        if (((mj.a) this.f9256a).f15838e != 60) {
            throw ij.h.f11808i;
        }
        StringBuilder sb2 = new StringBuilder();
        q(sb2, 5);
        u(45, 15, sb2);
        return sb2.toString();
    }

    @Override // xj.e
    public final void s(StringBuilder sb2, int i7) {
        switch (this.f22952c) {
            case 0:
                sb2.append("(3103)");
                break;
            default:
                if (i7 >= 10000) {
                    sb2.append("(3203)");
                } else {
                    sb2.append("(3202)");
                }
                break;
        }
    }

    @Override // xj.e
    public final int t(int i7) {
        switch (this.f22952c) {
            case 0:
                return i7;
            default:
                return i7 < 10000 ? i7 : i7 - 10000;
        }
    }
}
