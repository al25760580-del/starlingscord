package y;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23099c;

    public c(long j, e eVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f23097a = eVar;
        this.f23098b = j;
        n8.f fVar = f.f23111a;
        if (j != 0) {
            e eVarB = b();
            long j5 = eVarB.f23109i;
            long[] jArr = eVarB.f23110v;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j7 = eVarB.f23108e;
                if (j7 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j7);
                } else {
                    long j10 = eVarB.f23107d;
                    if (j10 != 0) {
                        j5 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j5;
            }
            synchronized (f.f23112b) {
                iA = f.f23115e.a(j);
            }
        } else {
            iA = -1;
        }
        this.f23099c = iA;
    }

    public abstract void a();

    public e b() {
        return this.f23097a;
    }

    public abstract Function1 c();

    public abstract boolean d();

    public long e() {
        return this.f23098b;
    }

    public int f() {
        return 0;
    }

    public abstract Function1 g();

    public abstract void h(g gVar);

    public void i(int i7) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }
}
