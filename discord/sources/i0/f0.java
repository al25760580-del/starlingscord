package i0;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends a0 implements g0.m, g0.k, Function1 {
    public final u E;
    public f0 F;
    public f0 G;
    public boolean H;
    public m0.b I;
    public m0.e J;
    public g0.o K;
    public LinkedHashMap L;
    public long M;
    public boolean N;

    static {
        int i7 = c0.c.f3409a;
        int i10 = c0.d.f3410a;
        int i11 = b0.b.f3015a;
        float[] values = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        Intrinsics.checkNotNullParameter(values, "values");
    }

    public f0(u layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.E = layoutNode;
        this.I = layoutNode.f11322g;
        this.J = layoutNode.f11323h;
        this.M = m0.d.f15345a;
        new a3.q(10, this);
    }

    @Override // i0.a0
    public final void B() {
        p(this.M);
    }

    public abstract void C();

    public abstract b0 D();

    public final Object E() {
        u uVar = this.E;
        if ((uVar.f11325l.f11290e.f23576c & 64) == 0) {
            return null;
        }
        F();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (z.e eVar = uVar.f11325l.f11289d; eVar != null; eVar = eVar.f23577d) {
            if ((eVar.f23575b & 64) != 0) {
                for (z.e eVar2 = eVar; eVar2 != null; eVar2 = null) {
                    if (eVar2 instanceof c) {
                        Intrinsics.checkNotNullParameter(uVar.f11322g, "<this>");
                        z.d dVar = ((c) eVar2).f11285i;
                        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
                        dVar.getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return objectRef.element;
    }

    public abstract z.e F();

    public final z.e G(boolean z5) {
        z.e eVarF;
        c0 c0Var = this.E.f11325l;
        if (c0Var.f11288c == this) {
            return c0Var.f11290e;
        }
        if (!z5) {
            f0 f0Var = this.G;
            if (f0Var != null) {
                return f0Var.F();
            }
            return null;
        }
        f0 f0Var2 = this.G;
        if (f0Var2 == null || (eVarF = f0Var2.F()) == null) {
            return null;
        }
        return eVarF.f23578e;
    }

    public final void H() {
        f0 f0Var = this.G;
        if (f0Var != null) {
            f0Var.H();
        }
    }

    public final boolean I() {
        if (this.H) {
            return false;
        }
        this.E.getClass();
        return false;
    }

    public final void J() {
        z.e eVarF = F();
        for (z.e eVarG = G(true); eVarG != null && (eVarG.f23576c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0; eVarG = eVarG.f23578e) {
            if ((eVarG.f23575b & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                for (z.e eVar = eVarG; eVar != null; eVar = null) {
                    if (eVar instanceof c) {
                        Intrinsics.checkNotNullParameter(this, "coordinates");
                    }
                }
            }
            if (eVarG == eVarF) {
                return;
            }
        }
    }

    public final void K(long j) {
        m0.b bVar = this.I;
        u uVar = this.E;
        if (Intrinsics.areEqual(bVar, uVar.f11322g)) {
            m0.e eVar = this.J;
            m0.e eVar2 = uVar.f11323h;
        }
        this.I = uVar.f11322g;
        this.J = uVar.f11323h;
        I();
        this.N = false;
        long j5 = this.M;
        int i7 = m0.d.f15346b;
        if (j5 == j) {
            return;
        }
        this.M = j;
        uVar.f11326m.f11348i.t();
        f0 f0Var = this.G;
        if (f0Var != null) {
            f0Var.H();
        }
        a0.A(this);
    }

    @Override // g0.k
    public final long g() {
        return this.f9453i;
    }

    @Override // g0.g
    public final m0.e getLayoutDirection() {
        return this.E.f11323h;
    }

    @Override // g0.k
    public final g0.k i() {
        I();
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNullParameter(null, "canvas");
        u uVar = this.E;
        if (uVar.f11326m.f11348i.G) {
            w.d(uVar);
            throw null;
        }
        this.N = true;
        return Unit.f14616a;
    }

    @Override // g0.k
    public final com.facebook.imagepipeline.nativecode.b k(g0.k sourceCoordinates) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        I();
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
    }

    @Override // i0.a0
    public final a0 u() {
        return this.F;
    }

    @Override // i0.a0
    public final boolean v() {
        return this.K != null;
    }

    @Override // i0.a0
    public final u w() {
        return this.E;
    }

    @Override // i0.a0
    public final g0.o x() {
        g0.o oVar = this.K;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // i0.a0
    public final a0 y() {
        return this.G;
    }

    @Override // i0.a0
    public final long z() {
        return this.M;
    }
}
