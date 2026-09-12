package q;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f18554e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f18555i;

    public /* synthetic */ d(g gVar, Bundle bundle, int i7) {
        this.f18553d = i7;
        this.f18555i = gVar;
        this.f18554e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18553d) {
            case 0:
                this.f18555i.f18569g.onMessageChannelReady(this.f18554e);
                break;
            default:
                this.f18555i.f18569g.onMinimized(this.f18554e);
                break;
        }
    }
}
