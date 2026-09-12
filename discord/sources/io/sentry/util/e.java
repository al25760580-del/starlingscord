package io.sentry.util;

import io.sentry.r;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f13224b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f13223a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f13225c = new a();

    public e(d dVar) {
        this.f13224b = dVar;
    }

    public final Object a() {
        if (this.f13223a == null) {
            r rVarA = this.f13225c.a();
            try {
                if (this.f13223a == null) {
                    this.f13223a = this.f13224b.b();
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
        return this.f13223a;
    }

    public final void b(Object obj) {
        r rVarA = this.f13225c.a();
        try {
            this.f13223a = obj;
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
