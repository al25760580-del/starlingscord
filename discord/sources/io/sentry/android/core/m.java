package io.sentry.android.core;

import android.os.Debug;
import io.sentry.a3;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements io.sentry.u0 {
    @Override // io.sentry.u0
    public final void a(a3 a3Var) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        a3Var.f12043b = Long.valueOf(jFreeMemory);
        a3Var.f12044c = Long.valueOf(nativeHeapSize);
    }

    @Override // io.sentry.u0
    public final void c() {
    }
}
