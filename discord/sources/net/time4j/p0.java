package net.time4j;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements xr.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16686d;

    public /* synthetic */ p0(int i7) {
        this.f16686d = i7;
    }

    public static t a(b1 b1Var) {
        int i7 = b1Var.f16611v;
        if (i7 != 0) {
            if (i7 % 1000000 == 0) {
                return t.f16713v;
            }
            return i7 % 1000 == 0 ? t.f16714w : t.f16715x;
        }
        if (b1Var.f16610i != 0) {
            return t.f16712i;
        }
        return b1Var.f16609e != 0 ? t.f16711e : t.f16710d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    @Override // xr.j
    public final Object b(xr.e eVar, Object obj, boolean z5) {
        r0 r0VarS;
        switch (this.f16686d) {
            case 0:
                r0 r0Var = (r0) eVar;
                TimeUnit timeUnit = (TimeUnit) obj;
                if (timeUnit == null) {
                    throw new IllegalArgumentException("Missing precision.");
                }
                int i7 = m0.f16675c[timeUnit.ordinal()];
                as.e eVar2 = as.e.f3000d;
                switch (i7) {
                    case 1:
                        return r0.s(yk.a.k(86400, r0Var.f16702d) * 86400, 0, eVar2);
                    case 2:
                        return r0.s(yk.a.k(3600, r0Var.f16702d) * 3600, 0, eVar2);
                    case 3:
                        return r0.s(yk.a.k(60, r0Var.f16702d) * 60, 0, eVar2);
                    case 4:
                        r0VarS = r0.s(r0Var.f16702d, 0, eVar2);
                        break;
                    case 5:
                        r0VarS = r0.s(r0Var.f16702d, (r0Var.r() / 1000000) * 1000000, eVar2);
                        break;
                    case 6:
                        r0VarS = r0.s(r0Var.f16702d, (r0Var.r() / 1000) * 1000, eVar2);
                        break;
                    case 7:
                        return r0Var;
                    default:
                        throw new UnsupportedOperationException(timeUnit.name());
                }
                if (((r0Var.f16703e >>> 30) != 0 && as.c.F.e()) && as.c.F.e()) {
                    as.e eVar3 = as.e.f3000d;
                    long j = r0VarS.f16702d;
                    as.e eVar4 = as.e.f3001e;
                    if (j < 63072000) {
                        throw new UnsupportedOperationException("Cannot calculate SI-duration before 1972-01-01.");
                    }
                    if (1 != 0) {
                        try {
                            r0 r0Var2 = as.c.F.e() ? new r0(yk.a.A(r0VarS.q(), 1L), r0VarS.r(), eVar4) : r0.s(yk.a.A(j, 1L), r0VarS.r(), eVar3);
                            if (1 >= 0 || r0Var2.f16702d >= 63072000) {
                                return r0Var2;
                            }
                            throw new UnsupportedOperationException("Cannot calculate SI-duration before 1972-01-01.");
                        } catch (IllegalArgumentException e10) {
                            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
                            arithmeticException.initCause(e10);
                            throw arithmeticException;
                        }
                    }
                }
                return r0VarS;
            case 1:
                x0 x0Var = (x0) obj;
                if (x0Var != null) {
                    return x0Var;
                }
                throw new IllegalArgumentException("Missing date value.");
            case 2:
                b1 b1Var = (b1) eVar;
                l0 l0Var = (l0) obj;
                int i10 = b1Var.f16608d;
                if (i10 == 24) {
                    i10 = 0;
                }
                if (l0Var == null) {
                    throw new IllegalArgumentException("Missing am/pm-value.");
                }
                if (l0Var == l0.f16660d) {
                    if (i10 >= 12) {
                        i10 -= 12;
                    }
                } else if (l0Var == l0.f16661e && i10 < 12) {
                    i10 += 12;
                }
                return b1.y(i10, b1Var.f16609e, b1Var.f16610i, b1Var.f16611v, true);
            case 3:
                b1 b1Var2 = (b1) eVar;
                t tVar = (t) obj;
                if (tVar == null) {
                    throw new IllegalArgumentException("Missing precision value.");
                }
                int iOrdinal = tVar.ordinal();
                t tVarA = a(b1Var2);
                int i11 = b1Var2.f16611v;
                byte b10 = b1Var2.f16610i;
                byte b11 = b1Var2.f16609e;
                byte b12 = b1Var2.f16608d;
                if (iOrdinal >= tVarA.ordinal()) {
                    return b1Var2;
                }
                int iOrdinal2 = tVar.ordinal();
                if (iOrdinal2 == 0) {
                    return b1.x(b12);
                }
                if (iOrdinal2 == 1) {
                    return b11 == 0 ? b1.x(b12) : new b1(b12, b11, 0, 0, true);
                }
                if (iOrdinal2 == 2) {
                    return (b11 | b10) == 0 ? b1.x(b12) : new b1(b12, b11, b10, 0, true);
                }
                if (iOrdinal2 == 3) {
                    return b1.y(b12, b11, b10, (i11 / 1000000) * 1000000, true);
                }
                if (iOrdinal2 == 4) {
                    return b1.y(b12, b11, b10, (i11 / 1000) * 1000, true);
                }
                if (iOrdinal2 == 5) {
                    return b1Var2;
                }
                throw new UnsupportedOperationException(tVar.name());
            case 4:
                b1 b1Var3 = (b1) obj;
                if (b1Var3 != null) {
                    return b1Var3;
                }
                throw new IllegalArgumentException("Missing time value.");
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    throw new IllegalArgumentException("Missing element value.");
                }
                u uVar = x0.J;
                x0 x0Var2 = (x0) eVar.d(uVar);
                int iIntValue = num.intValue();
                int iM = x1.m(iIntValue);
                int iX = x0Var2.x();
                int i12 = x0Var2.f16786d;
                int iM2 = x1.m(i12);
                int iM3 = 1;
                if (iM2 <= iX) {
                    int i13 = ((iX - iM2) / 7) + 1;
                    if (i13 >= 53) {
                        if ((xr.m.A(i12) ? 366 : 365) + x1.m(i12 + 1) > iX) {
                            iM3 = i13;
                        }
                    } else {
                        iM3 = i13;
                    }
                } else {
                    iM3 = 1 + ((((xr.m.A(i12 + (-1)) ? 366 : 365) + iX) - x1.m(i12 - 1)) / 7);
                }
                long jB = xr.k.UNIX.b(xr.m.T(iIntValue, 1, 1), xr.k.MODIFIED_JULIAN_DATE) + ((long) (iM - 1)) + ((long) ((iM3 - 1) * 7)) + ((long) (x0Var2.w().b(v1.G) - 1));
                if (iM3 == 53) {
                    if (((x1.m(iIntValue + 1) + (xr.m.A(iIntValue) ? 366 : 365)) - iM) / 7 < 53) {
                        jB -= 7;
                    }
                }
                return eVar.h(uVar, (x0) x0.V.y(jB - 730));
        }
    }

    @Override // xr.j
    public final Object c(xr.e eVar) {
        switch (this.f16686d) {
            case 0:
                r0 r0Var = (r0) eVar;
                int iR = r0Var.r();
                if (iR != 0) {
                    if (iR % 1000000 == 0) {
                        return TimeUnit.MILLISECONDS;
                    }
                    return iR % 1000 == 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
                }
                long j = r0Var.f16702d;
                if (yk.a.m(86400, j) == 0) {
                    return TimeUnit.DAYS;
                }
                if (yk.a.m(3600, j) == 0) {
                    return TimeUnit.HOURS;
                }
                return yk.a.m(60, j) == 0 ? TimeUnit.MINUTES : TimeUnit.SECONDS;
            case 1:
                return (x0) eVar;
            case 2:
                byte b10 = ((b1) eVar).f16608d;
                if (b10 < 0 || b10 > 24) {
                    throw new IllegalArgumentException(kk.b.h(b10, "Hour of day out of range: "));
                }
                return (b10 < 12 || b10 == 24) ? l0.f16660d : l0.f16661e;
            case 3:
                return a((b1) eVar);
            case 4:
                return (b1) eVar;
            default:
                x0 x0Var = (x0) eVar.d(x0.J);
                int i7 = x0Var.f16786d;
                int iX = x0Var.x();
                int i10 = x0Var.f16786d;
                int iM = x1.m(i10);
                if (iM > iX) {
                    i7--;
                } else if (((iX - iM) / 7) + 1 >= 53) {
                    if ((xr.m.A(i10) ? 366 : 365) + x1.m(i10 + 1) <= iX) {
                        i7++;
                    }
                }
                return Integer.valueOf(i7);
        }
    }

    @Override // xr.j
    public final Object d(xr.e eVar) {
        switch (this.f16686d) {
            case 0:
                return TimeUnit.NANOSECONDS;
            case 1:
                return x0.f16783w;
            case 2:
                return l0.f16661e;
            case 3:
                return t.f16715x;
            case 4:
                return b1.K;
            default:
                x1.f16790e.getClass();
                return x0.f16785y;
        }
    }
}
