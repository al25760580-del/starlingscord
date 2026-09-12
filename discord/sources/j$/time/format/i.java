package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f13500f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.j f13501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f13504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13505e;

    public i(j$.time.temporal.j jVar, int i7, int i10, u uVar) {
        this.f13501a = jVar;
        this.f13502b = i7;
        this.f13503c = i10;
        this.f13504d = uVar;
        this.f13505e = 0;
    }

    public i(j$.time.temporal.j jVar, int i7, int i10, u uVar, int i11) {
        this.f13501a = jVar;
        this.f13502b = i7;
        this.f13503c = i10;
        this.f13504d = uVar;
        this.f13505e = i11;
    }

    @Override // j$.time.format.f
    public final boolean a(p pVar, StringBuilder sb2) {
        j$.time.temporal.j jVar = this.f13501a;
        Long lA = pVar.a(jVar);
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        s sVar = pVar.f13527b.f13487c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i7 = this.f13503c;
        if (length > i7) {
            throw new j$.time.a("Field " + jVar + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i7);
        }
        sVar.getClass();
        int i10 = this.f13502b;
        u uVar = this.f13504d;
        if (jLongValue >= 0) {
            int i11 = c.f13492a[uVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    sb2.append('+');
                }
            } else if (i10 < 19 && jLongValue >= f13500f[i10]) {
                sb2.append('+');
            }
        } else {
            int i12 = c.f13492a[uVar.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                sb2.append('-');
            } else if (i12 == 4) {
                throw new j$.time.a("Field " + jVar + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i13 = 0; i13 < i10 - string.length(); i13++) {
            sb2.append('0');
        }
        sb2.append(string);
        return true;
    }

    public final String toString() {
        j$.time.temporal.j jVar = this.f13501a;
        u uVar = this.f13504d;
        int i7 = this.f13503c;
        int i10 = this.f13502b;
        if (i10 == 1 && i7 == 19 && uVar == u.NORMAL) {
            return "Value(" + jVar + ")";
        }
        if (i10 == i7 && uVar == u.NOT_NEGATIVE) {
            return "Value(" + jVar + "," + i10 + ")";
        }
        return "Value(" + jVar + "," + i10 + "," + i7 + "," + uVar + ")";
    }
}
