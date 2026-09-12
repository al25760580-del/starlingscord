package mq;

import kotlin.jvm.internal.Intrinsics;
import lq.d1;
import lq.o0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f16038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f16039e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f16040i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p f16041v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ s[] f16042w;

    static {
        q qVar = new q();
        f16038d = qVar;
        o oVar = new o();
        f16039e = oVar;
        r rVar = new r();
        f16040i = rVar;
        p pVar = new p();
        f16041v = pVar;
        s[] sVarArr = {qVar, oVar, rVar, pVar};
        f16042w = sVarArr;
        com.facebook.imagepipeline.nativecode.b.l(sVarArr);
    }

    public static s b(d1 type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (type.t0()) {
            return f16039e;
        }
        if (type instanceof lq.o) {
        }
        Intrinsics.checkNotNullParameter(type, "type");
        return lq.c.g(m.f16035d.r0(), lq.c.l(type), o0.f15232b) ? f16041v : f16040i;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f16042w.clone();
    }

    public abstract s a(d1 d1Var);
}
