package gp;

import com.facebook.react.devsupport.StackTraceHelper;
import ep.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import lq.y0;
import lq.z;
import sq.q;
import vo.l;
import vo.n0;
import vo.u;
import vo.y;
import wo.h;
import yo.k0;
import yo.r;
import yo.s;
import yo.t;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends k0 implements a {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final aq.b f10168d0 = new aq.b();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final aq.b f10169e0 = new aq.b();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f10170b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final boolean f10171c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, k0 k0Var, h hVar, up.e eVar, vo.c cVar, n0 n0Var, boolean z5) {
        super(lVar, k0Var, hVar, eVar, cVar, n0Var);
        if (lVar == null) {
            v0(0);
            throw null;
        }
        if (hVar == null) {
            v0(1);
            throw null;
        }
        if (eVar == null) {
            v0(2);
            throw null;
        }
        if (cVar == null) {
            v0(3);
            throw null;
        }
        this.f10170b0 = 0;
        this.f10171c0 = z5;
    }

    public static e Q0(l lVar, hp.c cVar, up.e eVar, ap.f fVar, boolean z5) {
        if (lVar == null) {
            v0(5);
            throw null;
        }
        if (eVar != null) {
            return new e(lVar, null, cVar, eVar, vo.c.f21792d, fVar, z5);
        }
        v0(7);
        throw null;
    }

    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 13 || i7 == 18 || i7 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 13 || i7 == 18 || i7 == 21) ? 2 : 3];
        switch (i7) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i7 == 13) {
            objArr[1] = "initialize";
        } else if (i7 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i7 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i7) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 13 && i7 != 18 && i7 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // gp.a
    public final a D(z zVar, ArrayList arrayList, z zVar2, Pair pair) {
        if (zVar2 == null) {
            v0(20);
            throw null;
        }
        ArrayList arrayListG = yk.a.g(arrayList, L(), this);
        t tVarN = zVar == null ? null : mf.f.n(this, zVar, wo.g.f22379a);
        r rVarH0 = H0(y0.f15267b);
        rVarH0.f23475y = arrayListG;
        rVarH0.H = zVar2;
        rVarH0.F = tVarN;
        rVarH0.M = true;
        rVarH0.L = true;
        e eVar = (e) rVarH0.U.E0(rVarH0);
        if (pair != null) {
            eVar.I0((vo.a) pair.f14612d, pair.f14613e);
        }
        if (eVar != null) {
            return eVar;
        }
        v0(21);
        throw null;
    }

    @Override // yo.k0, yo.s
    public final s D0(up.e eVar, vo.c cVar, l lVar, u uVar, n0 n0Var, h hVar) {
        if (lVar == null) {
            v0(14);
            throw null;
        }
        if (cVar == null) {
            v0(15);
            throw null;
        }
        if (hVar == null) {
            v0(16);
            throw null;
        }
        k0 k0Var = (k0) uVar;
        if (eVar == null) {
            eVar = getName();
        }
        e eVar2 = new e(lVar, k0Var, hVar, eVar, cVar, n0Var, this.f10171c0);
        int i7 = this.f10170b0;
        boolean z5 = false;
        if (i7 != 1) {
            if (i7 == 2) {
                z5 = true;
            } else if (i7 != 3) {
                if (i7 != 4) {
                    throw null;
                }
                z5 = true;
            }
        }
        eVar2.R0(z5, com.discord.chat.presentation.list.a.b(i7));
        return eVar2;
    }

    @Override // yo.k0
    public final k0 P0(t tVar, t tVar2, List list, List list2, List list3, z zVar, y yVar, p pVar, Map map) {
        sq.f fVar;
        if (list == null) {
            v0(9);
            throw null;
        }
        if (list2 == null) {
            v0(10);
            throw null;
        }
        if (list3 == null) {
            v0(11);
            throw null;
        }
        if (pVar == null) {
            v0(12);
            throw null;
        }
        super.P0(tVar, tVar2, list, list2, list3, zVar, yVar, pVar, map);
        List list4 = q.j;
        Intrinsics.checkNotNullParameter(this, "functionDescriptor");
        for (sq.h hVar : q.j) {
            Regex regex = hVar.f20510b;
            Intrinsics.checkNotNullParameter(this, "functionDescriptor");
            up.e eVar = hVar.f20509a;
            if (eVar == null || Intrinsics.areEqual(getName(), eVar)) {
                if (regex != null) {
                    String strB = getName().b();
                    Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
                    if (!regex.d(strB)) {
                        continue;
                    }
                }
                Collection collection = hVar.f20511c;
                if (collection == null || collection.contains(getName())) {
                    Intrinsics.checkNotNullParameter(this, "functionDescriptor");
                    for (sq.e eVar2 : hVar.f20513e) {
                        String strB2 = eVar2.b(this);
                        if (strB2 != null) {
                            fVar = new sq.f(strB2);
                            this.K = fVar.f3326a;
                            return this;
                        }
                    }
                    String str = (String) hVar.f20512d.invoke(this);
                    fVar = str != null ? new sq.f(str) : sq.f.f20501c;
                    this.K = fVar.f3326a;
                    return this;
                }
            }
        }
        fVar = sq.f.f20500b;
        this.K = fVar.f3326a;
        return this;
    }

    public final void R0(boolean z5, boolean z6) {
        int i7;
        if (z5) {
            i7 = z6 ? 4 : 2;
        } else {
            i7 = z6 ? 3 : 1;
        }
        this.f10170b0 = i7;
    }

    @Override // yo.s, vo.b
    public final boolean v() {
        return com.discord.chat.presentation.list.a.b(this.f10170b0);
    }
}
