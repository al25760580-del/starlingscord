package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13499a;

    public /* synthetic */ h(int i7) {
        this.f13499a = i7;
    }

    @Override // j$.time.format.f
    public final boolean a(p pVar, StringBuilder sb2) {
        switch (this.f13499a) {
            case 0:
                Long lA = pVar.a(j$.time.temporal.a.INSTANT_SECONDS);
                TemporalAccessor temporalAccessor = pVar.f13526a;
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                Long lValueOf = temporalAccessor.e(aVar) ? Long.valueOf(temporalAccessor.f(aVar)) : null;
                int i7 = 0;
                if (lA == null) {
                    return false;
                }
                long jLongValue = lA.longValue();
                int iA = aVar.f13547b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
                if (jLongValue >= -62167219200L) {
                    long j = jLongValue - 253402300800L;
                    long jFloorDiv = Math.floorDiv(j, 315569520000L) + 1;
                    LocalDateTime localDateTimeH = LocalDateTime.h(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                    if (jFloorDiv > 0) {
                        sb2.append('+');
                        sb2.append(jFloorDiv);
                    }
                    sb2.append(localDateTimeH);
                    if (localDateTimeH.f13461b.f13539c == 0) {
                        sb2.append(":00");
                    }
                } else {
                    long j5 = jLongValue + 62167219200L;
                    long j7 = j5 / 315569520000L;
                    long j10 = j5 % 315569520000L;
                    LocalDateTime localDateTimeH2 = LocalDateTime.h(j10 - 62167219200L, 0, ZoneOffset.UTC);
                    int length = sb2.length();
                    sb2.append(localDateTimeH2);
                    if (localDateTimeH2.f13461b.f13539c == 0) {
                        sb2.append(":00");
                    }
                    if (j7 < 0) {
                        if (localDateTimeH2.f13460a.f13480a == -10000) {
                            sb2.replace(length, length + 2, Long.toString(j7 - 1));
                        } else if (j10 == 0) {
                            sb2.insert(length, j7);
                        } else {
                            sb2.insert(length + 1, Math.abs(j7));
                        }
                    }
                }
                if (iA > 0) {
                    sb2.append('.');
                    int i10 = 100000000;
                    while (true) {
                        if (iA > 0 || i7 % 3 != 0 || i7 < -2) {
                            int i11 = iA / i10;
                            sb2.append((char) (i11 + 48));
                            iA -= i11 * i10;
                            i10 /= 10;
                            i7++;
                        }
                    }
                }
                sb2.append('Z');
                return true;
            default:
                a aVar2 = n.f13516f;
                TemporalAccessor temporalAccessor2 = pVar.f13526a;
                Object objC = temporalAccessor2.c(aVar2);
                if (objC == null && pVar.f13528c == 0) {
                    throw new j$.time.a("Unable to extract value: " + temporalAccessor2.getClass());
                }
                j$.time.k kVar = (j$.time.k) objC;
                if (kVar == null) {
                    return false;
                }
                sb2.append(((ZoneOffset) kVar).f13470b);
                return true;
        }
    }

    public final String toString() {
        switch (this.f13499a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
