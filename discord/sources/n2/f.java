package n2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16258b;

    public f(long j, long j5) {
        if (j5 == 0) {
            this.f16257a = 0L;
            this.f16258b = 1L;
        } else {
            this.f16257a = j;
            this.f16258b = j5;
        }
    }

    public final String toString() {
        return this.f16257a + "/" + this.f16258b;
    }
}
