package dr;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends er.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ar.k f7705b;

    @Override // er.d
    public final boolean a(er.b bVar) {
        y yVar = (y) bVar;
        if (this.f7704a >= 0) {
            return false;
        }
        long j = yVar.F;
        if (j < yVar.G) {
            yVar.G = j;
        }
        this.f7704a = j;
        return true;
    }

    @Override // er.d
    public final Continuation[] b(er.b bVar) {
        long j = this.f7704a;
        this.f7704a = -1L;
        this.f7705b = null;
        return ((y) bVar).u(j);
    }
}
