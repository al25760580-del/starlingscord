package j$.time.format;

import j$.time.temporal.TemporalAccessor;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemporalAccessor f13526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f13527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13528c;

    public p(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.d dVar = dateTimeFormatter.f13488d;
        if (dVar != null) {
            j$.time.chrono.d dVar2 = (j$.time.chrono.d) temporalAccessor.c(j$.time.temporal.k.f13558b);
            j$.time.k kVar = (j$.time.k) temporalAccessor.c(j$.time.temporal.k.f13557a);
            j$.time.e eVarH = null;
            dVar = Objects.equals(dVar, dVar2) ? null : dVar;
            if (dVar != null) {
                j$.time.chrono.d dVar3 = dVar != null ? dVar : dVar2;
                if (dVar != null) {
                    if (temporalAccessor.e(j$.time.temporal.a.EPOCH_DAY)) {
                        ((j$.time.chrono.e) dVar3).getClass();
                        eVarH = j$.time.e.h(temporalAccessor);
                    } else if (dVar != j$.time.chrono.e.f13475a || dVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && temporalAccessor.e(aVar)) {
                                throw new j$.time.a("Unable to apply override chronology '" + dVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new o(eVarH, temporalAccessor, dVar3, kVar);
            }
        }
        this.f13526a = temporalAccessor;
        this.f13527b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.j jVar) {
        try {
            return Long.valueOf(this.f13526a.f(jVar));
        } catch (j$.time.a e10) {
            if (this.f13528c > 0) {
                return null;
            }
            throw e10;
        }
    }

    public final String toString() {
        return this.f13526a.toString();
    }
}
