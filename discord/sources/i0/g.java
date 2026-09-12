package i0;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f11302e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f11303i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f11304v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f11305w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11306d;

    static {
        int i7 = 2;
        f11302e = new g(i7, 0);
        f11303i = new g(i7, 1);
        f11304v = new g(i7, 2);
        f11305w = new g(i7, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i7, int i10) {
        super(i7);
        this.f11306d = i10;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x0336  */
    /* JADX WARN: Code duplicated, block: B:188:0x033b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z5;
        u uVar;
        o oVar;
        char c8;
        switch (this.f11306d) {
            case 0:
                i iVar = (i) obj;
                ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(iVar, "$this$null");
                iVar.getClass();
                return Unit.f14616a;
            case 1:
                i iVar2 = (i) obj;
                g0.n measurePolicy = (g0.n) obj2;
                Intrinsics.checkNotNullParameter(iVar2, "$this$null");
                Intrinsics.checkNotNullParameter(measurePolicy, "it");
                u uVar2 = (u) iVar2;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(measurePolicy, "value");
                if (!Intrinsics.areEqual(uVar2.f11320e, measurePolicy)) {
                    uVar2.f11320e = measurePolicy;
                    e4.c cVar = uVar2.f11321f;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
                    ((u.n) cVar.f7967i).setValue(measurePolicy);
                    uVar2.f();
                }
                return Unit.f14616a;
            case 2:
                i iVar3 = (i) obj;
                z.f m5 = (z.f) obj2;
                Intrinsics.checkNotNullParameter(iVar3, "$this$null");
                Intrinsics.checkNotNullParameter(m5, "it");
                u uVar3 = (u) iVar3;
                z zVar = uVar3.f11326m;
                c0 c0Var = uVar3.f11325l;
                Intrinsics.checkNotNullParameter(m5, "value");
                if (uVar3.f11317b && uVar3.f11327n != z.c.f23573a) {
                    throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
                }
                uVar3.f11327n = m5;
                h0 h0Var = c0Var.f11289d;
                m mVar = c0Var.f11287b;
                u layoutNode = c0Var.f11286a;
                Intrinsics.checkNotNullParameter(m5, "m");
                z.e eVar = c0Var.f11290e;
                z.e eVarA = e0.f11300a;
                if (eVar == eVarA) {
                    throw new IllegalStateException("padChain called on already padded chain");
                }
                eVar.f23577d = eVarA;
                eVarA.f23578e = eVar;
                v.d dVar = c0Var.f11291f;
                int i7 = dVar != null ? dVar.f21324i : 0;
                v.d dVar2 = c0Var.f11292g;
                if (dVar2 == null) {
                    dVar2 = new v.d(new z.d[16]);
                }
                int i10 = dVar2.f21324i;
                if (i10 < 16) {
                    i10 = 16;
                }
                v.d dVar3 = new v.d(new z.f[i10]);
                dVar3.a(m5);
                while (true) {
                    int i11 = dVar3.f21324i;
                    if (i11 == 0) {
                        int i12 = dVar2.f21324i;
                        if (i12 == i7) {
                            z.e eVar2 = eVarA.f23578e;
                            int i13 = 0;
                            while (true) {
                                if (eVar2 == null || i13 >= i7) {
                                    z5 = true;
                                } else {
                                    if (dVar == null) {
                                        throw new IllegalStateException("expected prior modifier list to be non-empty");
                                    }
                                    z.d a10 = (z.d) dVar.f21322d[i13];
                                    z.d b10 = (z.d) dVar2.f21322d[i13];
                                    Intrinsics.checkNotNullParameter(a10, "prev");
                                    Intrinsics.checkNotNullParameter(b10, "next");
                                    if (Intrinsics.areEqual(a10, b10)) {
                                        c8 = 2;
                                    } else {
                                        Intrinsics.checkNotNullParameter(a10, "a");
                                        Intrinsics.checkNotNullParameter(b10, "b");
                                        c8 = a10.getClass() == b10.getClass() ? (char) 1 : (char) 0;
                                    }
                                    if (c8 != 0) {
                                        if (c8 == 1) {
                                            c0.d(a10, b10, eVar2);
                                        }
                                        eVar2 = eVar2.f23578e;
                                        i13++;
                                    } else {
                                        z5 = true;
                                        eVar2 = eVar2.f23577d;
                                    }
                                }
                            }
                            if (i13 >= i7) {
                                z5 = false;
                            } else {
                                if (dVar == null) {
                                    throw new IllegalStateException("expected prior modifier list to be non-empty");
                                }
                                if (eVar2 == null) {
                                    throw new IllegalStateException("structuralUpdate requires a non-null tail");
                                }
                                c0Var.c(i13, dVar, dVar2, eVar2);
                            }
                        } else {
                            z5 = true;
                            if (i7 == 0) {
                                for (int i14 = 0; i14 < dVar2.f21324i; i14++) {
                                    eVarA = c0.a((z.d) dVar2.f21322d[i14], eVarA);
                                }
                                int i15 = 0;
                                for (z.e eVar3 = c0Var.f11289d.f23577d; eVar3 != null && eVar3 != e0.f11300a; eVar3 = eVar3.f23577d) {
                                    i15 |= eVar3.f23575b;
                                    eVar3.f23576c = i15;
                                }
                            } else if (i12 != 0) {
                                if (dVar == null) {
                                    dVar = new v.d(new z.d[16]);
                                }
                                c0Var.c(0, dVar, dVar2, eVarA);
                            } else {
                                if (dVar == null) {
                                    throw new IllegalStateException("expected prior modifier list to be non-empty");
                                }
                                z.e eVar4 = eVarA.f23578e;
                                for (int i16 = 0; eVar4 != null && i16 < dVar.f21324i; i16++) {
                                    eVar4 = c0.b(eVar4).f23578e;
                                }
                                mVar.G = null;
                                c0Var.f11288c = mVar;
                                z5 = false;
                            }
                        }
                        c0Var.f11291f = dVar2;
                        if (dVar != null) {
                            dVar.d();
                        } else {
                            dVar = null;
                        }
                        c0Var.f11292g = dVar;
                        d0 d0Var = e0.f11300a;
                        z.e eVar5 = d0Var.f23578e;
                        if (eVar5 == null) {
                            eVar5 = h0Var;
                        }
                        eVar5.f23577d = null;
                        d0Var.f23578e = null;
                        d0Var.f23576c = -1;
                        d0Var.f23579f = null;
                        if (eVar5 == d0Var) {
                            throw new IllegalStateException("trimChain did not update the head");
                        }
                        c0Var.f11290e = eVar5;
                        if (z5) {
                            f0 f0Var = mVar;
                            for (z.e eVar6 = h0Var.f23577d; eVar6 != null; eVar6 = eVar6.f23577d) {
                                Intrinsics.checkNotNullParameter(eVar6, "<this>");
                                c measureNode = ((eVar6.f23575b & 2) == 0 || !(eVar6 instanceof c)) ? null : (c) eVar6;
                                if (measureNode != null) {
                                    f0 f0Var2 = eVar6.f23579f;
                                    if (f0Var2 != null) {
                                        Intrinsics.checkNotNull(f0Var2, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                                        oVar = (o) f0Var2;
                                        Intrinsics.checkNotNullParameter(measureNode, "<set-?>");
                                        oVar.O = measureNode;
                                    } else {
                                        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                                        Intrinsics.checkNotNullParameter(measureNode, "measureNode");
                                        oVar = new o(layoutNode);
                                        oVar.O = measureNode;
                                        oVar.P = layoutNode.f11318c != null ? new n(oVar) : null;
                                        eVar6.f23579f = oVar;
                                    }
                                    f0Var.G = oVar;
                                    oVar.F = f0Var;
                                    f0Var = oVar;
                                } else {
                                    eVar6.f23579f = f0Var;
                                }
                            }
                            f0Var.G = null;
                            c0Var.f11288c = f0Var;
                        }
                        u uVar4 = zVar.f11340a;
                        y yVar = zVar.f11348i;
                        z zVar2 = yVar.L;
                        if ((yVar.F != null || zVar2.a().E() != null) && yVar.E) {
                            yVar.E = false;
                            yVar.F = zVar2.a().E();
                        }
                        x xVar = zVar.j;
                        if (xVar != null) {
                            z zVar3 = xVar.K;
                            if (xVar.J == null) {
                                b0 b0VarD = zVar3.a().D();
                                Intrinsics.checkNotNull(b0VarD);
                                if (b0VarD.E.E() != null) {
                                    if (xVar.I) {
                                        xVar.I = false;
                                        b0 b0VarD2 = zVar3.a().D();
                                        Intrinsics.checkNotNull(b0VarD2);
                                        xVar.J = b0VarD2.E.E();
                                    }
                                }
                            } else if (xVar.I) {
                                xVar.I = false;
                                b0 b0VarD3 = zVar3.a().D();
                                Intrinsics.checkNotNull(b0VarD3);
                                xVar.J = b0VarD3.E.E();
                            }
                        }
                        if ((c0Var.f11290e.f23576c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 && (uVar = uVar3.f11318c) == null && !Intrinsics.areEqual(uVar3, uVar)) {
                            uVar3.f11318c = uVar3;
                            if (zVar.j == null) {
                                zVar.j = new x(zVar);
                            }
                            f0 f0Var3 = mVar.F;
                            for (f0 f0Var4 = c0Var.f11288c; !Intrinsics.areEqual(f0Var4, f0Var3) && f0Var4 != null; f0Var4 = f0Var4.F) {
                                f0Var4.C();
                            }
                            uVar3.f();
                        }
                        return Unit.f14616a;
                    }
                    z.f fVar = (z.f) dVar3.e(i11 - 1);
                    if (fVar instanceof z.b) {
                        z.b bVar = (z.b) fVar;
                        dVar3.a(bVar.f23572b);
                        dVar3.a(bVar.f23571a);
                    } else if (fVar instanceof z.d) {
                        dVar2.a(fVar);
                    } else {
                        fVar.all(new androidx.fragment.app.r(4, dVar2));
                    }
                }
                break;
            default:
                i iVar4 = (i) obj;
                u.e value = (u.e) obj2;
                Intrinsics.checkNotNullParameter(iVar4, "$this$null");
                Intrinsics.checkNotNullParameter(value, "it");
                u uVar5 = (u) iVar4;
                uVar5.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                x.b bVar2 = (x.b) value;
                m0.b value2 = (m0.b) bVar2.f(j0.g.f13594a);
                uVar5.getClass();
                Intrinsics.checkNotNullParameter(value2, "value");
                if (!Intrinsics.areEqual(uVar5.f11322g, value2)) {
                    uVar5.f11322g = value2;
                    uVar5.g();
                    z.e eVar7 = uVar5.f11325l.f11290e;
                    if ((eVar7.f23576c & 16) != 0) {
                        while (eVar7 != null) {
                            if ((eVar7.f23575b & 16) != 0) {
                                for (z.e eVar8 = eVar7; eVar8 != null; eVar8 = null) {
                                    if (eVar8 instanceof c) {
                                        z.d dVar4 = ((c) eVar8).f11285i;
                                        Intrinsics.checkNotNull(dVar4, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                                        ((f0.d) dVar4).getPointerInputFilter().onCancel();
                                    }
                                }
                            }
                            if ((eVar7.f23576c & 16) != 0) {
                                eVar7 = eVar7.f23578e;
                            }
                        }
                    }
                }
                m0.e value3 = (m0.e) bVar2.f(j0.g.f13595b);
                Intrinsics.checkNotNullParameter(value3, "value");
                if (uVar5.f11323h != value3) {
                    uVar5.f11323h = value3;
                    uVar5.g();
                }
                q value4 = (q) bVar2.f(j0.g.f13596c);
                Intrinsics.checkNotNullParameter(value4, "value");
                if (!Intrinsics.areEqual(uVar5.f11324i, value4)) {
                    uVar5.f11324i = value4;
                    z.e eVar9 = uVar5.f11325l.f11290e;
                    if ((eVar9.f23576c & 16) != 0) {
                        while (eVar9 != null) {
                            if ((eVar9.f23575b & 16) != 0) {
                                for (z.e eVar10 = eVar9; eVar10 != null; eVar10 = null) {
                                    if (eVar10 instanceof c) {
                                        z.d dVar5 = ((c) eVar10).f11285i;
                                        Intrinsics.checkNotNull(dVar5, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                                        ((f0.d) dVar5).getPointerInputFilter().onCancel();
                                    }
                                }
                            }
                            if ((eVar9.f23576c & 16) != 0) {
                                eVar9 = eVar9.f23578e;
                            }
                        }
                    }
                }
                z.e eVar11 = uVar5.f11325l.f11290e;
                if ((eVar11.f23576c & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
                    while (eVar11 != null) {
                        if ((eVar11.f23575b & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
                            for (z.e eVar12 = eVar11; eVar12 != null; eVar12 = null) {
                            }
                        }
                        if ((eVar11.f23576c & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
                            eVar11 = eVar11.f23578e;
                        }
                    }
                }
                return Unit.f14616a;
        }
    }
}
