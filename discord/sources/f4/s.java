package f4;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.b f8862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4.a f8863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4.p f8864c;

    static {
        v3.q.f("WMFgUpdater");
    }

    public s(WorkDatabase workDatabase, w3.e eVar, h4.b bVar) {
        this.f8863b = eVar;
        this.f8862a = bVar;
        this.f8864c = workDatabase.t();
    }
}
