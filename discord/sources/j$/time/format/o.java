package j$.time.format;

import j$.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements TemporalAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.b f13522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TemporalAccessor f13523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.d f13524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j$.time.k f13525d;

    public o(j$.time.e eVar, TemporalAccessor temporalAccessor, j$.time.chrono.d dVar, j$.time.k kVar) {
        this.f13522a = eVar;
        this.f13523b = temporalAccessor;
        this.f13524c = dVar;
        this.f13525d = kVar;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.j jVar) {
        j$.time.chrono.b bVar = this.f13522a;
        if (bVar != null && jVar.isDateBased()) {
            return ((j$.time.e) bVar).e(jVar);
        }
        return this.f13523b.e(jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.n b(j$.time.temporal.j jVar) {
        j$.time.chrono.b bVar = this.f13522a;
        if (bVar != null && jVar.isDateBased()) {
            return ((j$.time.e) bVar).b(jVar);
        }
        return this.f13523b.b(jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.j jVar) {
        j$.time.chrono.b bVar = this.f13522a;
        if (bVar != null && jVar.isDateBased()) {
            return ((j$.time.e) bVar).f(jVar);
        }
        return this.f13523b.f(jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object c(a aVar) {
        if (aVar == j$.time.temporal.k.f13558b) {
            return this.f13524c;
        }
        if (aVar == j$.time.temporal.k.f13557a) {
            return this.f13525d;
        }
        if (aVar == j$.time.temporal.k.f13559c) {
            return this.f13523b.c(aVar);
        }
        return aVar.a(this);
    }
}
