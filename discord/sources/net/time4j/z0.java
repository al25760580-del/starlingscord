package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements xr.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f16799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16800e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16801i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f16802v;

    public z0(f0 f0Var, int i7, int i10) {
        this.f16799d = f0Var;
        this.f16800e = f0Var.f16631d;
        this.f16801i = i7;
        this.f16802v = i10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0151  */
    /* JADX WARN: Code duplicated, block: B:102:0x0157  */
    /* JADX WARN: Code duplicated, block: B:104:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x015d A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:106:0x015f  */
    @Override // xr.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b1 b(b1 b1Var, Integer num, boolean z5) {
        boolean zV;
        int i7;
        int i10;
        int iIntValue;
        int i11;
        if (num == null) {
            throw new IllegalArgumentException("Missing element value.");
        }
        f0 f0Var = this.f16799d;
        int i12 = 0;
        if (z5) {
            int iIntValue2 = num.intValue();
            if (f0Var == b1.S || f0Var == b1.R || f0Var == b1.Q) {
                return (b1) b1Var.l(yk.a.D(iIntValue2, ((Integer) b1Var.d(f0Var)).intValue()), t.f16710d);
            }
            if (f0Var == b1.T) {
                return (b1) b1Var.l(yk.a.D(iIntValue2, b1Var.f16609e), t.f16711e);
            }
            if (f0Var == b1.V) {
                return (b1) b1Var.l(yk.a.D(iIntValue2, b1Var.f16610i), t.f16712i);
            }
            f0 f0Var2 = b1.X;
            if (f0Var == f0Var2) {
                return (b1) b1Var.l(yk.a.D(iIntValue2, ((Integer) b1Var.d(f0Var2)).intValue()), t.f16713v);
            }
            f0 f0Var3 = b1.Y;
            if (f0Var == f0Var3) {
                return (b1) b1Var.l(yk.a.D(iIntValue2, ((Integer) b1Var.d(f0Var3)).intValue()), t.f16714w);
            }
            if (f0Var == b1.Z) {
                return (b1) b1Var.l(yk.a.D(iIntValue2, b1Var.f16611v), t.f16715x);
            }
            if (f0Var == b1.a0) {
                int iL = yk.a.l(iIntValue2, 86400000);
                int i13 = b1Var.f16611v % 1000000;
                if (iL == 0 && i13 == 0) {
                    return iIntValue2 > 0 ? b1.K : b1.J;
                }
                return b1.m(iL, i13);
            }
            if (f0Var == b1.U) {
                int iL2 = yk.a.l(iIntValue2, 1440);
                if (iL2 == 0 && b1Var.w()) {
                    return iIntValue2 > 0 ? b1.K : b1.J;
                }
                return b(b1Var, Integer.valueOf(iL2), false);
            }
            if (f0Var != b1.W) {
                throw new UnsupportedOperationException(f0Var.name());
            }
            int iL3 = yk.a.l(iIntValue2, 86400);
            if (iL3 == 0 && b1Var.f16611v == 0) {
                return iIntValue2 > 0 ? b1.K : b1.J;
            }
            return b(b1Var, Integer.valueOf(iL3), false);
        }
        if (num != null && (iIntValue = num.intValue()) >= this.f16801i && iIntValue <= (i11 = this.f16802v)) {
            int i14 = this.f16800e;
            if (iIntValue != i11) {
                if (b1Var.f16608d == 24) {
                    switch (i14) {
                        case 6:
                        case 8:
                        case 10:
                        case 11:
                        case 12:
                            if (iIntValue == 0) {
                                zV = false;
                                break;
                            }
                        case 7:
                        case 9:
                        default:
                            zV = true;
                            break;
                    }
                }
                zV = true;
            } else if (i14 == 5) {
                zV = b1Var.v();
            } else if (i14 == 7) {
                zV = b1Var.w();
            } else if (i14 != 9) {
                if (i14 != 13) {
                    if (b1Var.f16608d == 24) {
                        switch (i14) {
                            case 6:
                            case 8:
                            case 10:
                            case 11:
                            case 12:
                                if (iIntValue == 0) {
                                    zV = false;
                                    break;
                                }
                            case 7:
                            case 9:
                            default:
                                zV = true;
                                break;
                        }
                    }
                    zV = true;
                } else if (b1Var.f16611v % 1000000 == 0) {
                    zV = true;
                } else {
                    zV = false;
                }
            } else if (b1Var.f16611v == 0) {
                zV = true;
            } else {
                zV = false;
            }
        } else {
            zV = false;
        }
        if (!zV) {
            throw new IllegalArgumentException("Value out of range: " + num);
        }
        int i15 = b1Var.f16608d;
        byte b10 = b1Var.f16608d;
        int i16 = b1Var.f16611v;
        int i17 = b1Var.f16609e;
        int i18 = b1Var.f16610i;
        int iIntValue3 = num.intValue();
        switch (this.f16800e) {
            case 1:
                i12 = iIntValue3 != 12 ? iIntValue3 : 0;
                if (b10 >= 12 && b10 != 24) {
                    i12 += 12;
                }
                i15 = i12;
                return b1.y(i15, i17, i18, i16, true);
            case 2:
                if (iIntValue3 != 24) {
                    i12 = iIntValue3;
                }
                i15 = i12;
                return b1.y(i15, i17, i18, i16, true);
            case 3:
                if (b10 >= 12 && b10 != 24) {
                    iIntValue3 += 12;
                    break;
                }
            case 4:
            case 5:
                i15 = iIntValue3;
                return b1.y(i15, i17, i18, i16, true);
            case 6:
                i17 = iIntValue3;
                return b1.y(i15, i17, i18, i16, true);
            case 7:
                i15 = iIntValue3 / 60;
                i17 = iIntValue3 % 60;
                return b1.y(i15, i17, i18, i16, true);
            case 8:
                i18 = iIntValue3;
                return b1.y(i15, i17, i18, i16, true);
            case 9:
                i15 = iIntValue3 / 3600;
                int i19 = iIntValue3 % 3600;
                i17 = i19 / 60;
                i18 = i19 % 60;
                return b1.y(i15, i17, i18, i16, true);
            case 10:
                i7 = iIntValue3 * 1000000;
                i10 = i16 % 1000000;
                i16 = i10 + i7;
                return b1.y(i15, i17, i18, i16, true);
            case 11:
                i7 = iIntValue3 * 1000;
                i10 = i16 % 1000;
                i16 = i10 + i7;
                return b1.y(i15, i17, i18, i16, true);
            case 12:
                i16 = iIntValue3;
                return b1.y(i15, i17, i18, i16, true);
            case 13:
                return b1.m(iIntValue3, i16 % 1000000);
            default:
                throw new UnsupportedOperationException(f0Var.name());
        }
    }

    @Override // xr.j
    public final Object c(xr.e eVar) {
        b1 b1Var = (b1) eVar;
        int iQ = 12;
        switch (this.f16800e) {
            case 1:
                int i7 = b1Var.f16608d % 12;
                if (i7 != 0) {
                    iQ = i7;
                }
                break;
            case 2:
                iQ = b1Var.f16608d % 24;
                if (iQ == 0) {
                    iQ = 24;
                }
                break;
            case 3:
                iQ = b1Var.f16608d % 12;
                break;
            case 4:
                iQ = b1Var.f16608d % 24;
                break;
            case 5:
                iQ = b1Var.f16608d;
                break;
            case 6:
                iQ = b1Var.f16609e;
                break;
            case 7:
                iQ = (b1Var.f16608d * 60) + b1Var.f16609e;
                break;
            case 8:
                iQ = b1Var.f16610i;
                break;
            case 9:
                iQ = (b1Var.f16609e * 60) + (b1Var.f16608d * 3600) + b1Var.f16610i;
                break;
            case 10:
                iQ = b1Var.f16611v / 1000000;
                break;
            case 11:
                iQ = b1Var.f16611v / 1000;
                break;
            case 12:
                iQ = b1Var.f16611v;
                break;
            case 13:
                iQ = (int) (b1.q(b1Var) / 1000000);
                break;
            default:
                throw new UnsupportedOperationException(this.f16799d.name());
        }
        return Integer.valueOf(iQ);
    }

    @Override // xr.j
    public final Object d(xr.e eVar) {
        b1 b1Var = (b1) eVar;
        if (b1Var.f16608d == 24) {
            switch (this.f16800e) {
                case 6:
                case 8:
                case 10:
                case 11:
                case 12:
                    return 0;
            }
        }
        int i7 = b1Var.f16611v;
        f0 f0Var = b1.a0;
        int i10 = this.f16802v;
        f0 f0Var2 = this.f16799d;
        return ((f0Var2 != f0Var || i7 % 1000000 == 0) && (f0Var2 != b1.S || b1Var.v()) && ((f0Var2 != b1.U || b1Var.w()) && ((f0Var2 != b1.W || i7 == 0) && (f0Var2 != b1.f16598b0 || i7 % 1000 == 0)))) ? Integer.valueOf(i10) : Integer.valueOf(i10 - 1);
    }
}
