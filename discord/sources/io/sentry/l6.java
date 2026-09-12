package io.sentry;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class l6 implements y1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l6 f12801e = new l6("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.sentry.util.e f12802d;

    public l6(String str) {
        Objects.requireNonNull(str, "value is required");
        this.f12802d = new io.sentry.util.e(new app.rive.runtime.kotlin.b(str, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l6.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f12802d.a()).equals(((l6) obj).f12802d.a());
    }

    public final int hashCode() {
        return ((String) this.f12802d.a()).hashCode();
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.f((String) this.f12802d.a());
    }

    public final String toString() {
        return (String) this.f12802d.a();
    }

    public l6() {
        this.f12802d = new io.sentry.util.e(new hm.a(14));
    }
}
