package cs;

import okio.Sink;

/* JADX INFO: loaded from: classes.dex */
public final class f extends rs.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f7423e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r9.a f7424i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, r9.a aVar, Sink sink) {
        super(sink);
        this.f7423e = gVar;
        this.f7424i = aVar;
    }

    @Override // rs.f, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g gVar = this.f7423e;
        r9.a aVar = this.f7424i;
        synchronized (gVar) {
            if (aVar.f19214a) {
                return;
            }
            aVar.f19214a = true;
            super.close();
            ((a3.f) this.f7424i.f19215b).d();
        }
    }
}
