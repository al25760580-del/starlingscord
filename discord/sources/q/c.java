package q;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f18550e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bundle f18551i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f18552v;

    public /* synthetic */ c(g gVar, String str, Bundle bundle, int i7) {
        this.f18549d = i7;
        this.f18552v = gVar;
        this.f18550e = str;
        this.f18551i = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18549d) {
            case 0:
                this.f18552v.f18569g.extraCallback(this.f18550e, this.f18551i);
                break;
            default:
                this.f18552v.f18569g.onPostMessage(this.f18550e, this.f18551i);
                break;
        }
    }
}
