package i0;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o extends f0 {
    public c O;
    public n P;

    static {
        d0.g fVar;
        Paint setNativeStyle = new Paint(7);
        Intrinsics.checkNotNullParameter(setNativeStyle, "internalPaint");
        long jA = c0.a.f3405c;
        Intrinsics.checkNotNullParameter(setNativeStyle, "$this$setNativeColor");
        d0.p destination = d0.d.f7528c;
        Intrinsics.checkNotNullParameter(destination, "colorSpace");
        long j = 63 & jA;
        rn.d0 d0Var = rn.e0.f19470e;
        d0.c source = d0.d.f7531f[(int) j];
        if (!Intrinsics.areEqual(destination, source)) {
            Intrinsics.checkNotNullParameter(source, "$this$connect");
            Intrinsics.checkNotNullParameter(destination, "destination");
            if (source == destination) {
                fVar = d0.g.f7535e;
            } else if (source == d0.d.f7530e) {
                fVar = d0.g.f7536f;
            } else if (source == destination) {
                d0.e eVar = d0.g.f7535e;
                Intrinsics.checkNotNullParameter(source, "source");
                fVar = new d0.e(source, source, 1);
            } else {
                long j5 = source.f7524b;
                long j7 = d0.b.f7518a;
                fVar = (d0.b.a(j5, j7) && d0.b.a(destination.f7524b, j7)) ? new d0.f((d0.p) source, destination) : new d0.g(source, destination, 0);
            }
            jA = fVar.a(j == 0 ? ((float) io.sentry.config.a.a0((jA >>> 48) & 255)) / 255.0f : c0.b.b((short) ((jA >>> 48) & 65535)), j == 0 ? ((float) io.sentry.config.a.a0((jA >>> 40) & 255)) / 255.0f : c0.b.b((short) ((jA >>> 32) & 65535)), j == 0 ? ((float) io.sentry.config.a.a0((jA >>> 32) & 255)) / 255.0f : c0.b.b((short) (65535 & (jA >>> 16))), j == 0 ? ((float) io.sentry.config.a.a0((jA >>> 56) & 255)) / 255.0f : ((float) io.sentry.config.a.a0((jA >>> 6) & 1023)) / 1023.0f);
        }
        setNativeStyle.setColor((int) (jA >>> 32));
        Intrinsics.checkNotNullParameter(setNativeStyle, "<this>");
        setNativeStyle.setStrokeWidth(1.0f);
        Intrinsics.checkNotNullParameter(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(Paint.Style.STROKE);
    }

    @Override // i0.f0
    public final void C() {
        if (this.P == null) {
            this.P = new n(this);
        }
    }

    @Override // i0.f0
    public final b0 D() {
        return this.P;
    }

    @Override // i0.f0
    public final z.e F() {
        return this.O.f23574a;
    }

    @Override // g0.m
    public final int a(int i7) {
        c cVar = this.O;
        f0 measurable = this.F;
        Intrinsics.checkNotNull(measurable);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        z.d dVar = cVar.f11285i;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        dVar.getClass();
        throw new ClassCastException();
    }

    @Override // g0.m
    public final int e(int i7) {
        c cVar = this.O;
        f0 measurable = this.F;
        Intrinsics.checkNotNull(measurable);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        z.d dVar = cVar.f11285i;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        dVar.getClass();
        throw new ClassCastException();
    }

    @Override // g0.m
    public final int f(int i7) {
        c cVar = this.O;
        f0 measurable = this.F;
        Intrinsics.checkNotNull(measurable);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        z.d dVar = cVar.f11285i;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        dVar.getClass();
        throw new ClassCastException();
    }

    @Override // g0.m
    public final g0.t h(long j) {
        r(j);
        c cVar = this.O;
        f0 measurable = this.F;
        Intrinsics.checkNotNull(measurable);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(this, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        z.d dVar = cVar.f11285i;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        dVar.getClass();
        throw new ClassCastException();
    }

    @Override // g0.m
    public final int n(int i7) {
        c cVar = this.O;
        f0 measurable = this.F;
        Intrinsics.checkNotNull(measurable);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        z.d dVar = cVar.f11285i;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        dVar.getClass();
        throw new ClassCastException();
    }

    @Override // g0.t
    public final void p(long j) {
        K(j);
        if (this.f11283x) {
            return;
        }
        J();
        m0.e eVar = this.E.f11323h;
        boolean zB = g0.r.b(this);
        ((com.google.firebase.messaging.p) x()).f();
        this.f11284y = zB;
    }

    @Override // i0.a0
    public final int s(g0.f alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        n nVar = this.P;
        if (nVar == null) {
            return w.a(this, alignmentLine);
        }
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        Integer num = (Integer) nVar.I.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
