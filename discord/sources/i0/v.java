package i0;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0.t f11328a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f11332e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11334g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11329b = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f11333f = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public v(b bVar, int i7) {
        this.f11334g = i7;
        this.f11328a = (g0.t) bVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [g0.t, i0.b] */
    public static final void a(v vVar, g0.f fVar, int i7, f0 calculatePositionInParent) {
        HashMap map = vVar.f11333f;
        float f2 = i7;
        long jA = c9.a.a(f2, f2);
        while (true) {
            int i10 = vVar.f11334g;
            Intrinsics.checkNotNullParameter(calculatePositionInParent, "$this$calculatePositionInParent");
            switch (i10) {
                case 0:
                    long j = calculatePositionInParent.M;
                    float fA = b0.a.a(jA);
                    int i11 = m0.d.f15346b;
                    jA = c9.a.a(fA + ((int) (j >> 32)), b0.a.b(jA) + ((int) (j & 4294967295L)));
                    break;
                default:
                    b0 b0VarD = calculatePositionInParent.D();
                    Intrinsics.checkNotNull(b0VarD);
                    long j5 = b0VarD.F;
                    int i12 = m0.d.f15346b;
                    jA = b0.a.c(c9.a.a((int) (j5 >> 32), (int) (4294967295L & j5)), jA);
                    break;
            }
            calculatePositionInParent = calculatePositionInParent.G;
            Intrinsics.checkNotNull(calculatePositionInParent);
            if (Intrinsics.areEqual(calculatePositionInParent, vVar.f11328a.b())) {
                int iB = fVar instanceof g0.f ? ho.c.b(b0.a.b(jA)) : ho.c.b(b0.a.a(jA));
                if (!map.containsKey(fVar)) {
                    map.put(fVar, Integer.valueOf(iB));
                    return;
                }
                ((Number) w0.e(map, fVar)).intValue();
                int i13 = g0.c.f9437a;
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                throw null;
            }
            if (vVar.b(calculatePositionInParent).containsKey(fVar)) {
                float fC = vVar.c(calculatePositionInParent, fVar);
                jA = c9.a.a(fC, fC);
            }
        }
    }

    public final Map b(f0 f0Var) {
        switch (this.f11334g) {
            case 0:
                Intrinsics.checkNotNullParameter(f0Var, "<this>");
                return (Map) ((com.google.firebase.messaging.p) f0Var.x()).f6604c;
            default:
                Intrinsics.checkNotNullParameter(f0Var, "<this>");
                b0 b0VarD = f0Var.D();
                Intrinsics.checkNotNull(b0VarD);
                return (Map) ((com.google.firebase.messaging.p) b0VarD.x()).f6604c;
        }
    }

    public final int c(f0 f0Var, g0.f alignmentLine) {
        switch (this.f11334g) {
            case 0:
                Intrinsics.checkNotNullParameter(f0Var, "<this>");
                Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
                return f0Var.t(alignmentLine);
            default:
                Intrinsics.checkNotNullParameter(f0Var, "<this>");
                Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
                b0 b0VarD = f0Var.D();
                Intrinsics.checkNotNull(b0VarD);
                return b0VarD.t(alignmentLine);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [g0.t, i0.b] */
    public final void d() {
        this.f11329b = true;
        this.f11328a.c();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [g0.t, i0.b] */
    public final void e() {
        HashMap map = this.f11333f;
        map.clear();
        a aVar = new a(this);
        ?? r5 = this.f11328a;
        r5.m(aVar);
        map.putAll(b(r5.b()));
        this.f11329b = false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [g0.t, i0.b] */
    public final void f() {
        boolean z5 = this.f11330c || this.f11331d;
        ?? r5 = this.f11328a;
        if (z5) {
            this.f11332e = r5;
        } else {
            r5.c();
        }
    }
}
