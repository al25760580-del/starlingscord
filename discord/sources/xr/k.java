package xr;

/* JADX INFO: loaded from: classes3.dex */
public enum k implements d {
    UTC(2441317),
    UNIX(2440587),
    MODIFIED_JULIAN_DATE(2400000),
    /* JADX INFO: Fake field, exist only in values array */
    EXCEL(2415019),
    /* JADX INFO: Fake field, exist only in values array */
    ANSI(2305812),
    /* JADX INFO: Fake field, exist only in values array */
    RATA_DIE(1721424),
    /* JADX INFO: Fake field, exist only in values array */
    JULIAN_DAY_NUMBER(-1),
    /* JADX INFO: Fake field, exist only in values array */
    LILIAN_DAY_NUMBER(2299159);

    private final int offset;

    k(int i7) {
        this.offset = i7 - 2441317;
    }

    @Override // xr.d
    public final Object a() {
        return Long.valueOf(365241779741L - ((long) this.offset));
    }

    public final long b(long j, k kVar) {
        try {
            return yk.a.A(j, kVar.offset - this.offset);
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Long) ((e) obj).d(this)).compareTo((Long) ((e) obj2).d(this));
    }

    @Override // xr.d
    public final Class getType() {
        return Long.class;
    }

    @Override // xr.d
    public final boolean h() {
        return false;
    }

    @Override // xr.d
    public final boolean i() {
        return true;
    }

    @Override // xr.d
    public final Object v() {
        return Long.valueOf((-365243219892L) - ((long) this.offset));
    }

    @Override // xr.d
    public final boolean w() {
        return false;
    }
}
