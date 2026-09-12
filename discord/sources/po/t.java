package po;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f18158e;

    public /* synthetic */ t(b0 b0Var, int i7) {
        this.f18157d = i7;
        this.f18158e = b0Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i7 = this.f18157d;
        b0 b0Var = this.f18158e;
        switch (i7) {
            case 0:
                return new x(b0Var);
            case 1:
                int i10 = b0.f18066v;
                up.b bVarO = b0Var.o();
                Class cls = b0Var.f18067e;
                u1 u1Var = ((x) b0Var.f18068i.getValue()).f18081a;
                KProperty kProperty = d0.f18080b[0];
                Object objInvoke = u1Var.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                ap.e eVar = (ap.e) objInvoke;
                vo.f fVarB = (bVarO.f21260c && cls.isAnnotationPresent(Metadata.class)) ? eVar.f2861a.b(bVarO) : mo.c0.o(eVar.f2861a.f11020b, bVarO);
                if (fVarB != null) {
                    return fVarB;
                }
                if (cls.isSynthetic()) {
                    return b0.n(bVarO, eVar);
                }
                ap.b bVarN = a5.l0.n(cls);
                op.a aVar = bVarN != null ? (op.a) bVarN.f2857b.f10247c : null;
                switch (aVar == null ? -1 : y.f18193a[aVar.ordinal()]) {
                    case -1:
                    case 6:
                        throw new ar.a0("Unresolved class: " + cls + " (kind = " + aVar + ')');
                    case 0:
                    default:
                        throw new rn.n();
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return b0.n(bVarO, eVar);
                    case 5:
                        throw new ar.a0("Unknown class: " + cls + " (kind = " + aVar + ')');
                }
            case 2:
                return b0Var.g(b0Var.getDescriptor().j().J(), e0.f18083d);
            case 3:
                eq.o oVarF = b0Var.getDescriptor().F();
                Intrinsics.checkNotNullExpressionValue(oVarF, "getStaticScope(...)");
                return b0Var.g(oVarF, e0.f18083d);
            case 4:
                return b0Var.g(b0Var.getDescriptor().j().J(), e0.f18084e);
            case 5:
                eq.o oVarF2 = b0Var.getDescriptor().F();
                Intrinsics.checkNotNullExpressionValue(oVarF2, "getStaticScope(...)");
                return b0Var.g(oVarF2, e0.f18084e);
            case 6:
                Class cls2 = b0Var.f18067e;
                if (cls2.isAnonymousClass()) {
                    return null;
                }
                up.b bVarO2 = b0Var.o();
                if (!bVarO2.f21260c) {
                    String strB = bVarO2.f().b();
                    Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
                    return strB;
                }
                String simpleName = cls2.getSimpleName();
                Method enclosingMethod = cls2.getEnclosingMethod();
                if (enclosingMethod != null) {
                    Intrinsics.checkNotNull(simpleName);
                    return StringsKt.V(simpleName, enclosingMethod.getName() + '$');
                }
                Constructor<?> enclosingConstructor = cls2.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    Intrinsics.checkNotNull(simpleName);
                    return StringsKt.U('$', simpleName, simpleName);
                }
                Intrinsics.checkNotNull(simpleName);
                return StringsKt.V(simpleName, enclosingConstructor.getName() + '$');
            case 7:
                if (b0Var.f18067e.isAnonymousClass()) {
                    return null;
                }
                up.b bVarO3 = b0Var.o();
                if (bVarO3.f21260c) {
                    return null;
                }
                return bVarO3.a().f21262a.f21265a;
            default:
                Collection collectionD = b0Var.d();
                ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(collectionD, 10));
                Iterator it = collectionD.iterator();
                while (it.hasNext()) {
                    arrayList.add(new i0(b0Var, (vo.k) it.next()));
                }
                return arrayList;
        }
    }

    public t(b0 b0Var, x xVar) {
        this.f18157d = 6;
        this.f18158e = b0Var;
    }
}
