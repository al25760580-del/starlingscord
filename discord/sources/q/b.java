package q;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f18547e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f18548i;

    public /* synthetic */ b(g gVar, Bundle bundle, int i7) {
        this.f18546d = i7;
        this.f18548i = gVar;
        this.f18547e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18546d) {
            case 0:
                this.f18548i.f18569g.onUnminimized(this.f18547e);
                break;
            default:
                this.f18548i.f18569g.onWarmupCompleted(this.f18547e);
                break;
        }
    }
}
