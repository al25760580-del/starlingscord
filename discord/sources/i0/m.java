package i0;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m extends f0 {
    public final h0 O;
    public l P;

    static {
        d0.g fVar;
        Paint setNativeStyle = new Paint(7);
        Intrinsics.checkNotNullParameter(setNativeStyle, "internalPaint");
        long jA = c0.a.f3404b;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        h0 h0Var = new h0();
        h0Var.f23576c = 0;
        this.O = h0Var;
        h0Var.f23579f = this;
        this.P = layoutNode.f11318c != null ? new l(this) : null;
    }

    @Override // i0.f0
    public final void C() {
        if (this.P == null) {
            this.P = new l(this);
        }
    }

    @Override // i0.f0
    public final b0 D() {
        return this.P;
    }

    @Override // i0.f0
    public final z.e F() {
        return this.O;
    }

    @Override // g0.m
    public final int a(int i7) {
        e4.c cVar = this.E.f11321f;
        g0.n nVarN = cVar.N();
        u uVar = (u) cVar.f7966e;
        return nVarN.maxIntrinsicHeight(uVar.f11325l.f11288c, uVar.c(), i7);
    }

    @Override // g0.m
    public final int e(int i7) {
        e4.c cVar = this.E.f11321f;
        g0.n nVarN = cVar.N();
        u uVar = (u) cVar.f7966e;
        return nVarN.minIntrinsicWidth(uVar.f11325l.f11288c, uVar.c(), i7);
    }

    @Override // g0.m
    public final int f(int i7) {
        e4.c cVar = this.E.f11321f;
        g0.n nVarN = cVar.N();
        u uVar = (u) cVar.f7966e;
        return nVarN.maxIntrinsicWidth(uVar.f11325l.f11288c, uVar.c(), i7);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:22:0x0073
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // g0.m
    public final g0.t h(long r9) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.m.h(long):g0.t");
    }

    @Override // g0.m
    public final int n(int i7) {
        e4.c cVar = this.E.f11321f;
        g0.n nVarN = cVar.N();
        u uVar = (u) cVar.f7966e;
        return nVarN.minIntrinsicHeight(uVar.f11325l.f11288c, uVar.c(), i7);
    }

    @Override // g0.t
    public final void p(long j) {
        K(j);
        if (this.f11283x) {
            return;
        }
        J();
        y yVar = this.E.f11326m.f11348i;
        z zVar = yVar.L;
        yVar.b().getClass();
        c0 c0Var = zVar.f11340a.f11325l;
        f0 f0Var = c0Var.f11288c;
        m mVar = c0Var.f11287b;
        while (f0Var != mVar) {
            Intrinsics.checkNotNull(f0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            o oVar = (o) f0Var;
            oVar.getClass();
            f0Var = oVar.F;
        }
        if (0.0f != yVar.K) {
            yVar.K = 0.0f;
        }
        if (!yVar.G) {
            yVar.s();
        }
        yVar.f11338x = 0;
        yVar.j();
    }

    @Override // i0.a0
    public final int s(g0.f alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        l lVar = this.P;
        if (lVar != null) {
            return lVar.s(alignmentLine);
        }
        y yVar = this.E.f11326m.f11348i;
        v vVar = yVar.H;
        z zVar = yVar.L;
        if (zVar.f11341b == 1) {
            vVar.f11330c = true;
            if (vVar.f11329b) {
                zVar.f11342c = true;
                zVar.f11343d = true;
            }
        } else {
            vVar.f11331d = true;
        }
        yVar.b().f11284y = true;
        yVar.j();
        yVar.b().f11284y = false;
        Integer num = (Integer) vVar.f11333f.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
