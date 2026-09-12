package io.sentry.android.core;

import com.discord.jank_stats.JankRecordStore;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f12340e;

    public /* synthetic */ k(c0 c0Var, int i7) {
        this.f12339d = i7;
        this.f12340e = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12339d) {
            case 0:
                ((l) this.f12340e).b(JankRecordStore.FIRST_FLUSH_DELAY_MS);
                break;
            default:
                ((n) this.f12340e).b(JankRecordStore.FIRST_FLUSH_DELAY_MS);
                break;
        }
    }
}
