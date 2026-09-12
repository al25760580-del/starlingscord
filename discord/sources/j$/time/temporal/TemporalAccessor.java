package j$.time.temporal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface TemporalAccessor {
    boolean e(j jVar);

    long f(j jVar);

    default n b(j jVar) {
        if (jVar instanceof a) {
            if (!e(jVar)) {
                throw new m("Unsupported field: " + jVar);
            }
            return ((a) jVar).f13547b;
        }
        Objects.requireNonNull(jVar, "field");
        return jVar.b(this);
    }

    default int a(j jVar) {
        n nVarB = b(jVar);
        if (nVarB.f13564a < -2147483648L || nVarB.f13567d > 2147483647L) {
            throw new m("Invalid field " + jVar + " for get() method, use getLong() instead");
        }
        long jF = f(jVar);
        if (nVarB.c(jF)) {
            return (int) jF;
        }
        throw new j$.time.a("Invalid value for " + jVar + " (valid values " + nVarB + "): " + jF);
    }

    default Object c(j$.time.format.a aVar) {
        if (aVar == k.f13557a || aVar == k.f13558b || aVar == k.f13559c) {
            return null;
        }
        return aVar.a(this);
    }
}
