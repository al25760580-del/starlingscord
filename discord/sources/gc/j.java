package gc;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he.q f9699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9707i;
    public boolean j;

    public j(he.q qVar, int i7, int i10, int i11, int i12, boolean z5) {
        a(i11, 0, "bufferForPlaybackMs", "0");
        a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i7, i11, "minBufferMs", "bufferForPlaybackMs");
        a(i7, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i10, i7, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f9699a = qVar;
        this.f9700b = je.e0.I(i7);
        this.f9701c = je.e0.I(i10);
        this.f9702d = je.e0.I(i11);
        this.f9703e = je.e0.I(i12);
        this.f9704f = -1;
        this.f9707i = 13107200;
        this.f9705g = z5;
        this.f9706h = je.e0.I(0);
    }

    public static void a(int i7, int i10, String str, String str2) {
        je.b.f(str + " cannot be less than " + str2, i7 >= i10);
    }

    public final void b(boolean z5) {
        int i7 = this.f9704f;
        if (i7 == -1) {
            i7 = 13107200;
        }
        this.f9707i = i7;
        this.j = false;
        if (z5) {
            he.q qVar = this.f9699a;
            synchronized (qVar) {
                if (qVar.f10661a) {
                    qVar.a(0);
                }
            }
        }
    }

    public final boolean c(long j, float f2) {
        int i7;
        long j5 = this.f9701c;
        he.q qVar = this.f9699a;
        synchronized (qVar) {
            i7 = qVar.f10664d * qVar.f10662b;
        }
        boolean z5 = true;
        boolean z6 = i7 >= this.f9707i;
        long jMin = this.f9700b;
        if (f2 > 1.0f) {
            jMin = Math.min(je.e0.u(jMin, f2), j5);
        }
        if (j < Math.max(jMin, 500000L)) {
            if (!this.f9705g && z6) {
                z5 = false;
            }
            this.j = z5;
            if (!z5 && j < 500000) {
                je.b.N("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j5 || z6) {
            this.j = false;
        }
        return this.j;
    }
}
