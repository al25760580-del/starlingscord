package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface c extends TemporalAccessor, Comparable {
    default long d(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        LocalDateTime localDateTime = (LocalDateTime) this;
        return ((localDateTime.f13460a.o() * 86400) + ((long) localDateTime.f13461b.k())) - ((long) zoneOffset.f13469a);
    }
}
