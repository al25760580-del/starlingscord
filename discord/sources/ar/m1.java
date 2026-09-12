package ar;

import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements m0, n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m1 f2944d = new m1();

    @Override // ar.n
    public final boolean a(Throwable th2) {
        return false;
    }

    @Override // ar.n
    public final Job getParent() {
        return null;
    }

    public final String toString() {
        return "NonDisposableHandle";
    }

    @Override // ar.m0
    public final void dispose() {
    }
}
