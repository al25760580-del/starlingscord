package af;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f490f;

    public u(f fVar, int i7, Bundle bundle) {
        this.f490f = fVar;
        Boolean bool = Boolean.TRUE;
        this.f487c = fVar;
        this.f485a = bool;
        this.f486b = false;
        this.f488d = i7;
        this.f489e = bundle;
    }

    public abstract boolean a();

    public abstract void b(xe.b bVar);
}
