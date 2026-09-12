package rs;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class t extends Timeout {
    @Override // okio.Timeout
    public final Timeout g(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this;
    }

    @Override // okio.Timeout
    public final void f() {
    }

    @Override // okio.Timeout
    public final Timeout d(long j) {
        return this;
    }
}
