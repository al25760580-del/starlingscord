package rn;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class l {
    public static Lazy a(m mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            return new u(initializer, null, 2, null);
        }
        if (iOrdinal == 1) {
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            t tVar = new t();
            tVar.f19492d = initializer;
            tVar.f19493e = g0.f19473a;
            return tVar;
        }
        if (iOrdinal != 2) {
            throw new n();
        }
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        l0 l0Var = new l0();
        l0Var.f19483d = initializer;
        l0Var.f19484e = g0.f19473a;
        return l0Var;
    }

    public static u b(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new u(initializer, null, 2, null);
    }
}
