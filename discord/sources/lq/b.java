package lq;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kq.o oVar) {
        super(oVar);
        if (oVar != null) {
        } else {
            n(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void n(int i7) {
        String str = (i7 == 1 || i7 == 3 || i7 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 3 || i7 == 4) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i7 == 2) {
            objArr[0] = "classifier";
        } else if (i7 == 3 || i7 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i7 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i7 == 3 || i7 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i7 != 1) {
            if (i7 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i7 != 3 && i7 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 3 && i7 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // lq.i
    public final z c() {
        vo.f fVarG = g();
        if (fVarG == null) {
            so.i.a(107);
            throw null;
        }
        up.e eVar = so.i.f20342e;
        if (so.i.b(fVarG, so.o.f20363a) || so.i.b(fVarG, so.o.f20364b)) {
            return null;
        }
        return f().e();
    }

    @Override // lq.i
    public final Collection d(boolean z5) {
        vo.l lVarG = g().g();
        if (!(lVarG instanceof vo.f)) {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            n(3);
            throw null;
        }
        vq.g gVar = new vq.g();
        vo.f fVar = (vo.f) lVarG;
        gVar.add(fVar.j());
        vo.f fVarH = fVar.H();
        if (z5 && fVarH != null) {
            gVar.add(fVarH.j());
        }
        return gVar;
    }

    @Override // lq.q0
    public final so.i f() {
        so.i iVarE = bq.e.e(g());
        if (iVarE != null) {
            return iVarE;
        }
        n(1);
        throw null;
    }

    @Override // lq.i
    public final boolean k(vo.i second) {
        boolean z5;
        if (second instanceof vo.f) {
            vo.f first = g();
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (!Intrinsics.areEqual(first.getName(), second.getName())) {
                z5 = false;
                break;
            }
            vo.l lVarG = first.g();
            vo.l lVarG2 = second.g();
            while (true) {
                if (lVarG != null && lVarG2 != null) {
                    if (!(lVarG instanceof vo.z)) {
                        if (!(lVarG2 instanceof vo.z)) {
                            if (lVarG instanceof vo.e0) {
                                if (!(lVarG2 instanceof vo.e0) || !Intrinsics.areEqual(((yo.b0) ((vo.e0) lVarG)).f23420x, ((yo.b0) ((vo.e0) lVarG2)).f23420x)) {
                                    break;
                                }
                            } else if (!(lVarG2 instanceof vo.e0) && Intrinsics.areEqual(lVarG.getName(), lVarG2.getName())) {
                                lVarG = lVarG.g();
                                lVarG2 = lVarG2.g();
                            }
                        }
                        z5 = false;
                        break;
                    }
                    z5 = lVarG2 instanceof vo.z;
                    break;
                }
                z5 = true;
                break;
            }
            if (z5) {
                return true;
            }
        }
        return false;
    }

    @Override // lq.q0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract vo.f g();
}
