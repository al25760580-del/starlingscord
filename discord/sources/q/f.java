package q;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18562e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18563i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f18564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f18565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Bundle f18566x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f18567y;

    public f(g gVar, int i7, int i10, int i11, int i12, int i13, Bundle bundle) {
        this.f18567y = gVar;
        this.f18561d = i7;
        this.f18562e = i10;
        this.f18563i = i11;
        this.f18564v = i12;
        this.f18565w = i13;
        this.f18566x = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18567y.f18569g.onActivityLayout(this.f18561d, this.f18562e, this.f18563i, this.f18564v, this.f18565w, this.f18566x);
    }
}
