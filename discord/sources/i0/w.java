package i0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0.c f11335a = new m0.c();

    public static final int a(a0 a0Var, g0.f fVar) {
        long j;
        a0 a0VarU = a0Var.u();
        if (a0VarU == null) {
            throw new IllegalStateException(("Child of " + a0Var + " cannot be null when calculating alignment line").toString());
        }
        if (((Map) ((com.google.firebase.messaging.p) a0Var.x()).f6604c).containsKey(fVar)) {
            Integer num = (Integer) ((Map) ((com.google.firebase.messaging.p) a0Var.x()).f6604c).get(fVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iT = a0VarU.t(fVar);
            if (iT != Integer.MIN_VALUE) {
                a0VarU.f11283x = true;
                a0Var.f11284y = true;
                a0Var.B();
                a0VarU.f11283x = false;
                a0Var.f11284y = false;
                if (fVar instanceof g0.f) {
                    long jZ = a0VarU.z();
                    int i7 = m0.d.f15346b;
                    j = jZ & 4294967295L;
                } else {
                    long jZ2 = a0VarU.z();
                    int i10 = m0.d.f15346b;
                    j = jZ2 >> 32;
                }
                return iT + ((int) j);
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final int b(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final void c(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar.f23574a.f23581h) {
            k.a(cVar, 1).H();
        }
    }

    public static final void d(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        uVar.getClass();
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }
}
