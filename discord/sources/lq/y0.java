package lq;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0 f15267b = e(w0.f15261a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f15268a;

    public y0(w0 w0Var) {
        if (w0Var != null) {
            this.f15268a = w0Var;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        if (i7 != 1 && i7 != 2 && i7 != 8 && i7 != 34 && i7 != 37) {
            switch (i7) {
                default:
                    switch (i7) {
                        default:
                            switch (i7) {
                                default:
                                    switch (i7) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 1 && i7 != 2 && i7 != 8 && i7 != 34 && i7 != 37) {
            switch (i7) {
                case 11:
                case 12:
                case 13:
                    i10 = 2;
                    break;
                default:
                    switch (i7) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i10 = 2;
                            break;
                        default:
                            switch (i7) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i10 = 2;
                                    break;
                                default:
                                    switch (i7) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i10 = 2;
                                            break;
                                        default:
                                            i10 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                objArr[0] = "typeParameterVariance";
                break;
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                objArr[0] = "projectionKind";
                break;
        }
        if (i7 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i7 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i7 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i7 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i7 != 37) {
            switch (i7) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i7) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i7) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i7) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i7) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2 && i7 != 8 && i7 != 34 && i7 != 37) {
            switch (i7) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i7) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i7) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i7) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static e1 b(e1 e1Var, e1 e1Var2) {
        if (e1Var == null) {
            a(38);
            throw null;
        }
        if (e1Var2 == null) {
            a(39);
            throw null;
        }
        e1 e1Var3 = e1.INVARIANT;
        if (e1Var == e1Var3) {
            if (e1Var2 != null) {
                return e1Var2;
            }
            a(40);
            throw null;
        }
        if (e1Var2 == e1Var3) {
            if (e1Var != null) {
                return e1Var;
            }
            a(41);
            throw null;
        }
        if (e1Var == e1Var2) {
            if (e1Var2 != null) {
                return e1Var2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + e1Var + "' and projection kind '" + e1Var2 + "' cannot be combined");
    }

    public static int c(e1 e1Var, e1 e1Var2) {
        e1 e1Var3 = e1.IN_VARIANCE;
        if (e1Var == e1Var3 && e1Var2 == e1.OUT_VARIANCE) {
            return 3;
        }
        return (e1Var == e1.OUT_VARIANCE && e1Var2 == e1Var3) ? 2 : 1;
    }

    public static y0 d(z zVar) {
        if (zVar == null) {
            a(6);
            throw null;
        }
        return e(r0.f15247b.f(zVar.r0(), zVar.l0()));
    }

    public static y0 e(w0 w0Var) {
        if (w0Var != null) {
            return new y0(w0Var);
        }
        a(0);
        throw null;
    }

    public static y0 f(w0 first, w0 second) {
        if (first == null) {
            a(3);
            throw null;
        }
        if (second == null) {
            a(4);
            throw null;
        }
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first.f()) {
            first = second;
        } else if (!second.f()) {
            first = new r(first, second);
        }
        return e(first);
    }

    public static String i(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (vq.m.j(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    public final w0 g() {
        w0 w0Var = this.f15268a;
        if (w0Var != null) {
            return w0Var;
        }
        a(8);
        throw null;
    }

    public final z h(z zVar, e1 e1Var) {
        if (zVar == null) {
            a(9);
            throw null;
        }
        if (this.f15268a.f()) {
            return zVar;
        }
        try {
            z zVarB = k(new i0(zVar, e1Var), null, 0).b();
            if (zVarB != null) {
                return zVarB;
            }
            a(12);
            throw null;
        } catch (x0 e10) {
            return nq.l.c(nq.k.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
        }
    }

    public final z j(z zVar, e1 e1Var) {
        if (zVar == null) {
            a(14);
            throw null;
        }
        if (e1Var == null) {
            a(15);
            throw null;
        }
        t0 i0Var = new i0(g().g(zVar, e1Var), e1Var);
        w0 w0Var = this.f15268a;
        if (!w0Var.f()) {
            try {
                i0Var = k(i0Var, null, 0);
            } catch (x0 unused) {
                i0Var = null;
            }
        }
        if (w0Var.a() || w0Var.b()) {
            boolean zB = w0Var.b();
            if (i0Var == null) {
                i0Var = null;
            } else if (!i0Var.c()) {
                z zVarB = i0Var.b();
                Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
                if (b1.c(zVarB, rq.b.f19543d, null)) {
                    e1 e1VarA = i0Var.a();
                    Intrinsics.checkNotNullExpressionValue(e1VarA, "getProjectionKind(...)");
                    if (e1VarA == e1.OUT_VARIANCE) {
                        i0Var = new i0((z) mf.f.b(zVarB).f19542b, e1VarA);
                    } else if (zB) {
                        i0Var = new i0((z) mf.f.b(zVarB).f19541a, e1VarA);
                    } else {
                        y0 y0VarE = e(new rq.c());
                        Intrinsics.checkNotNullExpressionValue(y0VarE, "create(...)");
                        if (!y0VarE.f15268a.f()) {
                            try {
                                i0Var = y0VarE.k(i0Var, null, 0);
                            } catch (x0 unused2) {
                                i0Var = null;
                            }
                        }
                    }
                }
            }
        }
        if (i0Var == null) {
            return null;
        }
        return i0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x020f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0225  */
    /* JADX WARN: Code duplicated, block: B:107:0x0233  */
    /* JADX WARN: Code duplicated, block: B:108:0x0236  */
    /* JADX WARN: Code duplicated, block: B:110:0x0239  */
    /* JADX WARN: Code duplicated, block: B:111:0x023c  */
    /* JADX WARN: Code duplicated, block: B:113:0x023f  */
    /* JADX WARN: Code duplicated, block: B:119:0x025c  */
    /* JADX WARN: Code duplicated, block: B:124:0x027f  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:62:0x014e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0161  */
    /* JADX WARN: Code duplicated, block: B:66:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x016a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0172  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191  */
    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:80:0x019e  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01da  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:99:0x0201  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final t0 k(t0 t0Var, vo.r0 r0Var, int i7) throws x0 {
        int i10;
        z zVarB;
        e1 e1VarA;
        d1 d1VarW0;
        a aVar;
        d0 d0Var;
        List parameters;
        List newArguments;
        ArrayList arrayList;
        boolean z5;
        z zVarP;
        vo.r0 r0Var2;
        t0 t0Var2;
        t0 t0VarK;
        int iB;
        char c8;
        e1 variance;
        e1 e1Var;
        y0 y0Var;
        int iC;
        pq.d dVarW0;
        m mVar;
        z zVarH;
        wo.h hVarD;
        int iB2;
        y0 y0Var2 = this;
        z zVarJ = null;
        if (t0Var == null) {
            a(18);
            throw null;
        }
        w0 w0Var = y0Var2.f15268a;
        if (i7 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + i(t0Var) + "; substitution: " + i(w0Var));
        }
        if (!t0Var.c()) {
            z zVarB2 = t0Var.b();
            if (zVarB2 instanceof c1) {
                c1 c1Var = (c1) zVarB2;
                d1 d1VarE0 = c1Var.e0();
                z zVarI = c1Var.i();
                t0 t0VarK2 = y0Var2.k(new i0(d1VarE0, t0Var.a()), r0Var, i7 + 1);
                return t0VarK2.c() ? t0VarK2 : new i0(c.G(t0VarK2.b().w0(), y0Var2.j(zVarI, t0Var.a())), t0VarK2.a());
            }
            Intrinsics.checkNotNullParameter(zVarB2, "<this>");
            zVarB2.w0();
            if (!(zVarB2.w0() instanceof jp.i)) {
                t0 t0VarE = w0Var.e(zVarB2);
                if (t0VarE == null) {
                    t0VarE = null;
                } else if (zVarB2.getAnnotations().P(so.o.f20391y)) {
                    q0 q0VarR0 = t0VarE.b().r0();
                    if (q0VarR0 instanceof mq.i) {
                        t0 t0Var3 = ((mq.i) q0VarR0).f16026a;
                        e1 e1VarA2 = t0Var3.a();
                        if (c(t0Var.a(), e1VarA2) == 3) {
                            t0VarE = new i0(t0Var3.b());
                        } else if (r0Var != null && c(r0Var.getVariance(), e1VarA2) == 3) {
                            t0VarE = new i0(t0Var3.b());
                        }
                    }
                }
                e1 e1VarA3 = t0Var.a();
                int i11 = 0;
                if (t0VarE == null && c.k(zVarB2)) {
                    Intrinsics.checkNotNullParameter(zVarB2, "<this>");
                    pq.d dVarW1 = zVarB2.w0();
                    m mVar2 = dVarW1 instanceof m ? (m) dVarW1 : null;
                    if (!(mVar2 != null ? mVar2.K() : false)) {
                        Intrinsics.checkNotNullParameter(zVarB2, "<this>");
                        d1 d1VarW1 = zVarB2.w0();
                        Intrinsics.checkNotNull(d1VarW1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
                        s sVar = (s) d1VarW1;
                        d0 d0Var2 = sVar.f15248e;
                        d0 d0Var3 = sVar.f15249i;
                        int i12 = i7 + 1;
                        t0 t0VarK3 = y0Var2.k(new i0(d0Var2, e1VarA3), r0Var, i12);
                        t0 t0VarK4 = y0Var2.k(new i0(d0Var3, e1VarA3), r0Var, i12);
                        e1 e1VarA4 = t0VarK3.a();
                        if (t0VarK3.b() != sVar.f15248e || t0VarK4.b() != d0Var3) {
                            return new i0(c.e(c.b(t0VarK3.b()), c.b(t0VarK4.b())), e1VarA4);
                        }
                    } else if (!so.i.F(zVarB2)) {
                        i10 = 2;
                        if (t0VarE != null) {
                            iC = c(e1VarA3, t0VarE.a());
                            Intrinsics.checkNotNullParameter(zVarB2, "<this>");
                            if (!(zVarB2.r0() instanceof yp.b)) {
                                iB2 = f0.e.b(iC);
                                if (iB2 != 1) {
                                    return new i0(zVarB2.r0().f().p(), e1.OUT_VARIANCE);
                                }
                                if (iB2 == 2) {
                                    throw new x0("Out-projection in in-position");
                                }
                            }
                            Intrinsics.checkNotNullParameter(zVarB2, "<this>");
                            dVarW0 = zVarB2.w0();
                            if (dVarW0 instanceof m) {
                                mVar = (m) dVarW0;
                            } else {
                                mVar = null;
                            }
                            if (mVar != null) {
                                mVar = null;
                            } else {
                                mVar = null;
                            }
                            if (t0VarE.c()) {
                                return t0VarE;
                            }
                            if (mVar != null) {
                                zVarH = mVar.B(t0VarE.b());
                            } else {
                                zVarH = b1.h(t0VarE.b(), zVarB2.t0());
                            }
                            if (!zVarB2.getAnnotations().isEmpty()) {
                                hVarD = w0Var.d(zVarB2.getAnnotations());
                                if (hVarD != null) {
                                    a(33);
                                    throw null;
                                }
                                if (hVarD.P(so.o.f20391y)) {
                                    hVarD = new wo.l(hVarD, new w(i10));
                                }
                                zVarH = c9.a.F(zVarH, new wo.i(new wo.h[]{zVarH.getAnnotations(), hVarD}));
                            }
                            if (iC == 1) {
                                e1VarA3 = b(e1VarA3, t0VarE.a());
                            }
                            return new i0(zVarH, e1VarA3);
                        }
                        zVarB = t0Var.b();
                        e1VarA = t0Var.a();
                        if (!(zVarB.r0().g() instanceof vo.r0)) {
                            Intrinsics.checkNotNullParameter(zVarB, "<this>");
                            Intrinsics.checkNotNullParameter(zVarB, "<this>");
                            d1VarW0 = zVarB.w0();
                            if (d1VarW0 instanceof a) {
                                aVar = (a) d1VarW0;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                d0Var = aVar.f15170i;
                            } else {
                                d0Var = null;
                            }
                            if (d0Var != null) {
                                if (w0Var instanceof v) {
                                    y0Var = y0Var2;
                                } else {
                                    y0Var = y0Var2;
                                }
                                zVarJ = y0Var.j(d0Var, e1.INVARIANT);
                            }
                            parameters = zVarB.r0().getParameters();
                            newArguments = zVarB.l0();
                            arrayList = new ArrayList(parameters.size());
                            z5 = false;
                            while (i11 < parameters.size()) {
                                r0Var2 = (vo.r0) parameters.get(i11);
                                t0Var2 = (t0) newArguments.get(i11);
                                t0VarK = y0Var2.k(t0Var2, r0Var2, i7 + 1);
                                iB = f0.e.b(c(r0Var2.getVariance(), t0VarK.a()));
                                if (iB != 0) {
                                    if (iB != 1) {
                                        c8 = 2;
                                        if (iB == 2) {
                                        }
                                    } else {
                                        c8 = 2;
                                    }
                                    t0VarK = b1.j(r0Var2);
                                } else {
                                    c8 = 2;
                                    variance = r0Var2.getVariance();
                                    e1Var = e1.INVARIANT;
                                    if (variance != e1Var) {
                                        t0VarK = new i0(t0VarK.b(), e1Var);
                                    }
                                }
                                if (t0VarK != t0Var2) {
                                    z5 = true;
                                }
                                arrayList.add(t0VarK);
                                i11++;
                                y0Var2 = this;
                            }
                            if (z5) {
                                newArguments = arrayList;
                            }
                            wo.h newAnnotations = w0Var.d(zVarB.getAnnotations());
                            Intrinsics.checkNotNullParameter(zVarB, "<this>");
                            Intrinsics.checkNotNullParameter(newArguments, "newArguments");
                            Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
                            zVarP = c.p(zVarB, newArguments, newAnnotations, 4);
                            if (zVarP instanceof d0) {
                                zVarP = c.F((d0) zVarP, (d0) zVarJ);
                            }
                            return new i0(zVarP, e1VarA);
                        }
                    }
                } else if (!so.i.F(zVarB2) && !c.j(zVarB2)) {
                    i10 = 2;
                    if (t0VarE != null) {
                        iC = c(e1VarA3, t0VarE.a());
                        Intrinsics.checkNotNullParameter(zVarB2, "<this>");
                        if (!(zVarB2.r0() instanceof yp.b)) {
                            iB2 = f0.e.b(iC);
                            if (iB2 != 1) {
                                return new i0(zVarB2.r0().f().p(), e1.OUT_VARIANCE);
                            }
                            if (iB2 == 2) {
                                throw new x0("Out-projection in in-position");
                            }
                        }
                        Intrinsics.checkNotNullParameter(zVarB2, "<this>");
                        dVarW0 = zVarB2.w0();
                        if (dVarW0 instanceof m) {
                            mVar = (m) dVarW0;
                        } else {
                            mVar = null;
                        }
                        if (mVar != null || !mVar.K()) {
                            mVar = null;
                        }
                        if (t0VarE.c()) {
                            return t0VarE;
                        }
                        if (mVar != null) {
                            zVarH = mVar.B(t0VarE.b());
                        } else {
                            zVarH = b1.h(t0VarE.b(), zVarB2.t0());
                        }
                        if (!zVarB2.getAnnotations().isEmpty()) {
                            hVarD = w0Var.d(zVarB2.getAnnotations());
                            if (hVarD != null) {
                                a(33);
                                throw null;
                            }
                            if (hVarD.P(so.o.f20391y)) {
                                hVarD = new wo.l(hVarD, new w(i10));
                            }
                            zVarH = c9.a.F(zVarH, new wo.i(new wo.h[]{zVarH.getAnnotations(), hVarD}));
                        }
                        if (iC == 1) {
                            e1VarA3 = b(e1VarA3, t0VarE.a());
                        }
                        return new i0(zVarH, e1VarA3);
                    }
                    zVarB = t0Var.b();
                    e1VarA = t0Var.a();
                    if (!(zVarB.r0().g() instanceof vo.r0)) {
                        Intrinsics.checkNotNullParameter(zVarB, "<this>");
                        Intrinsics.checkNotNullParameter(zVarB, "<this>");
                        d1VarW0 = zVarB.w0();
                        if (d1VarW0 instanceof a) {
                            aVar = (a) d1VarW0;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            d0Var = aVar.f15170i;
                        } else {
                            d0Var = null;
                        }
                        if (d0Var != null) {
                            if ((w0Var instanceof v) || !w0Var.b()) {
                                y0Var = y0Var2;
                            } else {
                                v vVar = (v) w0Var;
                                y0Var = new y0(new v(vVar.f15254b, vVar.f15255c, false));
                            }
                            zVarJ = y0Var.j(d0Var, e1.INVARIANT);
                        }
                        parameters = zVarB.r0().getParameters();
                        newArguments = zVarB.l0();
                        arrayList = new ArrayList(parameters.size());
                        z5 = false;
                        while (i11 < parameters.size()) {
                            r0Var2 = (vo.r0) parameters.get(i11);
                            t0Var2 = (t0) newArguments.get(i11);
                            t0VarK = y0Var2.k(t0Var2, r0Var2, i7 + 1);
                            iB = f0.e.b(c(r0Var2.getVariance(), t0VarK.a()));
                            if (iB != 0) {
                                if (iB != 1) {
                                    c8 = 2;
                                    if (iB == 2) {
                                    }
                                } else {
                                    c8 = 2;
                                }
                                t0VarK = b1.j(r0Var2);
                            } else {
                                c8 = 2;
                                variance = r0Var2.getVariance();
                                e1Var = e1.INVARIANT;
                                if (variance != e1Var && !t0VarK.c()) {
                                    t0VarK = new i0(t0VarK.b(), e1Var);
                                }
                            }
                            if (t0VarK != t0Var2) {
                                z5 = true;
                            }
                            arrayList.add(t0VarK);
                            i11++;
                            y0Var2 = this;
                        }
                        if (z5) {
                            newArguments = arrayList;
                        }
                        wo.h newAnnotations2 = w0Var.d(zVarB.getAnnotations());
                        Intrinsics.checkNotNullParameter(zVarB, "<this>");
                        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
                        Intrinsics.checkNotNullParameter(newAnnotations2, "newAnnotations");
                        zVarP = c.p(zVarB, newArguments, newAnnotations2, 4);
                        if ((zVarP instanceof d0) && (zVarJ instanceof d0)) {
                            zVarP = c.F((d0) zVarP, (d0) zVarJ);
                        }
                        return new i0(zVarP, e1VarA);
                    }
                }
            }
        }
        return t0Var;
    }
}
