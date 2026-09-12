package xr;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends q {
    public int m(c cVar) {
        long jO = o();
        long jO2 = cVar.o();
        if (jO < jO2) {
            return -1;
        }
        return jO == jO2 ? 0 : 1;
    }

    @Override // xr.q
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final int i(c cVar) {
        if (j().f23066d == cVar.j().f23066d) {
            return m(cVar);
        }
        throw new ClassCastException("Cannot compare different types of dates, use instance of EpochDays as comparator instead.");
    }

    public long o() {
        return j().c().x(this);
    }

    public final boolean p(c cVar) {
        return m(cVar) > 0;
    }
}
