package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class i4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i4 f12740d = new i4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f12742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.sentry.util.a f12743c = new io.sentry.util.a();

    public final void a(boolean z5) {
        r rVarA = this.f12743c.a();
        try {
            if (!this.f12741a) {
                this.f12742b = Boolean.valueOf(z5);
                this.f12741a = true;
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
