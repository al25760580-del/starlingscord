package yo;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lq.e1;
import lq.w0;
import lq.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vo.l f23435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vo.y f23436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ep.p f23437c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public vo.c f23439e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f23442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final up.e f23443i;
    public final lq.z j;
    public final /* synthetic */ h0 k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vo.l0 f23438d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w0 f23440f = w0.f15261a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23441g = true;

    public g0(h0 h0Var) {
        this.k = h0Var;
        this.f23435a = h0Var.g();
        this.f23436b = h0Var.e();
        this.f23437c = h0Var.getVisibility();
        this.f23439e = h0Var.c();
        this.f23442h = h0Var.R;
        this.f23443i = h0Var.getName();
        this.j = h0Var.getType();
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 5 || i7 == 7 || i7 == 9 || i7 == 11 || i7 == 19 || i7 == 13 || i7 == 14 || i7 == 16 || i7 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2 || i7 == 3 || i7 == 5 || i7 == 7 || i7 == 9 || i7 == 11 || i7 == 19 || i7 == 13 || i7 == 14 || i7 == 16 || i7 == 17) ? 2 : 3];
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i7 == 1) {
            objArr[1] = "setOwner";
        } else if (i7 == 2) {
            objArr[1] = "setOriginal";
        } else if (i7 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i7 == 5) {
            objArr[1] = "setReturnType";
        } else if (i7 == 7) {
            objArr[1] = "setModality";
        } else if (i7 == 9) {
            objArr[1] = "setVisibility";
        } else if (i7 == 11) {
            objArr[1] = "setKind";
        } else if (i7 == 19) {
            objArr[1] = "setName";
        } else if (i7 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i7 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i7 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i7 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 5 && i7 != 7 && i7 != 9 && i7 != 11 && i7 != 19 && i7 != 13 && i7 != 14 && i7 != 16 && i7 != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final h0 b() {
        t tVar;
        t tVar2;
        i0 i0Var;
        j0 j0Var;
        y0 y0Var;
        Function0 function0;
        t tVar3;
        t tVar4;
        vo.l lVar = this.f23435a;
        vo.y yVar = this.f23436b;
        ep.p pVar = this.f23437c;
        vo.l0 l0Var = this.f23438d;
        vo.c cVar = this.f23439e;
        up.e eVar = this.f23443i;
        h0 h0Var = this.k;
        h0 h0VarD0 = h0Var.D0(lVar, yVar, pVar, l0Var, cVar, eVar);
        List typeParameters = h0Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        y0 y0VarA = lq.c.A(typeParameters, this.f23440f, h0VarD0, arrayList);
        e1 e1Var = e1.OUT_VARIANCE;
        lq.z zVar = this.j;
        lq.z zVarJ = y0VarA.j(zVar, e1Var);
        if (zVarJ != null) {
            e1 e1Var2 = e1.IN_VARIANCE;
            lq.z zVarJ2 = y0VarA.j(zVar, e1Var2);
            if (zVarJ2 != null) {
                h0VarD0.H0(zVarJ2);
            }
            t tVar5 = this.f23442h;
            if (tVar5 != null) {
                t tVarB = tVar5.b(y0VarA);
                tVar = tVarB != null ? tVarB : null;
            }
            t tVar6 = h0Var.S;
            if (tVar6 != null) {
                lq.z zVarJ3 = y0VarA.j(tVar6.getType(), e1Var2);
                if (zVarJ3 == null) {
                    tVar4 = null;
                } else {
                    tVar6.B0();
                    tVar4 = new t(h0VarD0, new fq.c(h0VarD0, zVarJ3), tVar6.getAnnotations());
                }
                tVar2 = tVar4;
            } else {
                tVar2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (t tVar7 : h0Var.Q) {
                lq.z zVarJ4 = y0VarA.j(tVar7.getType(), e1.IN_VARIANCE);
                if (zVarJ4 == null) {
                    tVar3 = null;
                } else {
                    up.e eVarZ0 = ((fq.b) tVar7.B0()).z0();
                    tVar7.B0();
                    tVar3 = new t(h0VarD0, new fq.b(h0VarD0, zVarJ4, eVarZ0), tVar7.getAnnotations());
                }
                if (tVar3 != null) {
                    arrayList2.add(tVar3);
                }
            }
            h0VarD0.I0(zVarJ, arrayList, tVar, tVar2, arrayList2);
            i0 i0Var2 = h0Var.U;
            vo.c cVar2 = vo.c.f21793e;
            vo.o0 o0Var = vo.n0.C;
            if (i0Var2 == null) {
                i0Var = null;
            } else {
                wo.h annotations = i0Var2.getAnnotations();
                vo.y yVar2 = this.f23436b;
                ep.p visibility = h0Var.U.getVisibility();
                if (this.f23439e == cVar2) {
                    ep.p pVarF = vo.p.f(visibility.f8580a.u());
                    Intrinsics.checkNotNullExpressionValue(pVarF, "toDescriptorVisibility(...)");
                    if (vo.p.e(pVarF)) {
                        visibility = vo.p.f21831h;
                    }
                }
                ep.p pVar2 = visibility;
                i0 i0Var3 = h0Var.U;
                boolean z5 = i0Var3.f23431x;
                boolean z6 = i0Var3.f23432y;
                boolean z7 = i0Var3.G;
                vo.c cVar3 = this.f23439e;
                vo.l0 l0Var2 = this.f23438d;
                i0Var = new i0(h0VarD0, annotations, yVar2, pVar2, z5, z6, z7, cVar3, l0Var2 == null ? null : l0Var2.getGetter(), o0Var);
            }
            if (i0Var != null) {
                i0 i0Var4 = h0Var.U;
                lq.z zVar2 = i0Var4.K;
                i0Var.J = h0.E0(y0VarA, i0Var4);
                i0Var.E0(zVar2 != null ? y0VarA.j(zVar2, e1.OUT_VARIANCE) : null);
            }
            j0 j0Var2 = h0Var.V;
            if (j0Var2 == null) {
                j0Var = null;
            } else {
                wo.h annotations2 = j0Var2.getAnnotations();
                vo.y yVar3 = this.f23436b;
                ep.p visibility2 = h0Var.V.getVisibility();
                if (this.f23439e == cVar2) {
                    ep.p pVarF2 = vo.p.f(visibility2.f8580a.u());
                    Intrinsics.checkNotNullExpressionValue(pVarF2, "toDescriptorVisibility(...)");
                    if (vo.p.e(pVarF2)) {
                        visibility2 = vo.p.f21831h;
                    }
                }
                ep.p pVar3 = visibility2;
                j0 j0Var3 = h0Var.V;
                boolean z10 = j0Var3.f23431x;
                boolean z11 = j0Var3.f23432y;
                boolean z12 = j0Var3.G;
                vo.c cVar4 = this.f23439e;
                vo.l0 l0Var3 = this.f23438d;
                j0Var = new j0(h0VarD0, annotations2, yVar3, pVar3, z10, z11, z12, cVar4, l0Var3 == null ? null : l0Var3.getSetter(), o0Var);
            }
            if (j0Var != null) {
                y0Var = y0VarA;
                List listF0 = s.F0(j0Var, h0Var.V.L(), y0Var, false, false, null);
                if (listF0 == null) {
                    listF0 = Collections.singletonList(j0.D0(j0Var, bq.e.e(this.f23435a).o(), ((q0) h0Var.V.L().get(0)).getAnnotations()));
                }
                if (listF0.size() != 1) {
                    throw new IllegalStateException();
                }
                j0Var.J = h0.E0(y0Var, h0Var.V);
                q0 q0Var = (q0) listF0.get(0);
                if (q0Var == null) {
                    j0.v0(6);
                    throw null;
                }
                j0Var.K = q0Var;
            } else {
                y0Var = y0VarA;
            }
            q qVar = h0Var.W;
            q qVar2 = qVar == null ? null : new q(qVar.getAnnotations(), h0VarD0);
            q qVar3 = h0Var.X;
            h0VarD0.F0(i0Var, j0Var, qVar2, qVar3 != null ? new q(qVar3.getAnnotations(), h0VarD0) : null);
            if (this.f23441g) {
                int i7 = vq.j.f21949i;
                vq.j jVarF = vq.m.f();
                Iterator it = h0Var.h().iterator();
                while (it.hasNext()) {
                    jVarF.add(((vo.l0) it.next()).b(y0Var));
                }
                h0VarD0.I = jVarF;
            }
            if (h0Var.isConst() && (function0 = h0Var.F) != null) {
                h0VarD0.G0(h0Var.E, function0);
            }
            return h0VarD0;
        }
        return null;
    }
}
