package com.discord.jank_stats;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JankRecordStore f4408e;

    public /* synthetic */ c(JankRecordStore jankRecordStore, int i7) {
        this.f4407d = i7;
        this.f4408e = jankRecordStore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4407d) {
            case 0:
                this.f4408e.flush();
                break;
            default:
                this.f4408e.flush();
                break;
        }
    }
}
