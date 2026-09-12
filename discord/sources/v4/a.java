package v4;

import ag.a1;
import io.sentry.w1;
import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21442a = io.sentry.internal.debugmeta.c.D0("k", "x", "y");

    public static w1 a(w4.b bVar, l4.i iVar) throws EOFException, a1 {
        ArrayList arrayList = new ArrayList();
        if (bVar.B() == 1) {
            bVar.c();
            while (bVar.n()) {
                w4.b bVar2 = bVar;
                l4.i iVar2 = iVar;
                arrayList.add(new o4.l(iVar2, o.b(bVar2, iVar2, x4.h.c(), f.f21458w, bVar.B() == 3, false)));
                bVar = bVar2;
                iVar = iVar2;
            }
            bVar.g();
            p.b(arrayList);
        } else {
            arrayList.add(new y4.a(n.b(bVar, x4.h.c())));
        }
        return new w1(arrayList);
    }

    public static r4.e b(w4.b bVar, l4.i iVar) {
        bVar.f();
        w1 w1VarA = null;
        r4.b bVarL = null;
        boolean z5 = false;
        r4.b bVarL2 = null;
        while (bVar.B() != 4) {
            int iP = bVar.P(f21442a);
            if (iP == 0) {
                w1VarA = a(bVar, iVar);
            } else if (iP != 1) {
                if (iP != 2) {
                    bVar.Q();
                    bVar.T();
                } else if (bVar.B() == 6) {
                    bVar.T();
                    z5 = true;
                } else {
                    bVarL = gn.h.L(bVar, iVar, true);
                }
            } else if (bVar.B() == 6) {
                bVar.T();
                z5 = true;
            } else {
                bVarL2 = gn.h.L(bVar, iVar, true);
            }
        }
        bVar.i();
        if (z5) {
            iVar.a("Lottie doesn't support expressions.");
        }
        return w1VarA != null ? w1VarA : new r4.c(bVarL2, bVarL);
    }
}
