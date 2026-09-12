package ie;

import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeSet f11757a = new TreeSet(new p());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11758b;

    public final void a(b bVar, long j) {
        while (this.f11758b + j > 104857600 && !this.f11757a.isEmpty()) {
            i iVar = (i) this.f11757a.first();
            SimpleCache simpleCache = (SimpleCache) bVar;
            synchronized (simpleCache) {
                simpleCache.k(iVar);
            }
        }
    }

    public final void b(SimpleCache simpleCache, t tVar) {
        this.f11757a.add(tVar);
        this.f11758b += tVar.f11738i;
        a(simpleCache, 0L);
    }
}
