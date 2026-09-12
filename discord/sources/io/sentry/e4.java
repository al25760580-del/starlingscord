package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 implements k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4 f12639a;

    public e4() {
        if (io.sentry.util.h.f13226a || !io.sentry.util.h.f13227b) {
            this.f12639a = new u4(1);
        } else {
            this.f12639a = new u4(0);
        }
    }

    @Override // io.sentry.k4
    public final j4 now() {
        return this.f12639a.now();
    }
}
