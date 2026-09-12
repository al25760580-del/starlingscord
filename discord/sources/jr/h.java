package jr;

import fr.u;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends u {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f14087w;

    public h(long j, h hVar, int i7) {
        super(j, hVar, i7);
        this.f14087w = new AtomicReferenceArray(g.f14086f);
    }

    @Override // fr.u
    public final int g() {
        return g.f14086f;
    }

    @Override // fr.u
    public final void h(int i7, CoroutineContext coroutineContext) {
        this.f14087w.set(i7, g.f14085e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f9398i + ", hashCode=" + hashCode() + ']';
    }
}
