package q;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f18557e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f18558i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f18559v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f18560w;

    public e(g gVar, int i7, Uri uri, boolean z5, Bundle bundle) {
        this.f18560w = gVar;
        this.f18556d = i7;
        this.f18557e = uri;
        this.f18558i = z5;
        this.f18559v = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18560w.f18569g.onRelationshipValidationResult(this.f18556d, this.f18557e, this.f18558i, this.f18559v);
    }
}
