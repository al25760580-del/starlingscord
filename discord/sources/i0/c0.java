package i0;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f11286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f11287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0 f11288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f11289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z.e f11290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v.d f11291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v.d f11292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hp.e f11293h;

    public c0(u layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f11286a = layoutNode;
        m mVar = new m(layoutNode);
        this.f11287b = mVar;
        this.f11288c = mVar;
        h0 h0Var = mVar.O;
        this.f11289d = h0Var;
        this.f11290e = h0Var;
    }

    public static z.e a(z.d element, z.e eVar) {
        z.e eVar2;
        if (element instanceof AppendedSemanticsElement) {
            Function1 properties = ((AppendedSemanticsElement) element).f1228b;
            Intrinsics.checkNotNullParameter(properties, "properties");
            k0.b node = new k0.b();
            node.f14209i = properties;
            Intrinsics.checkNotNullParameter(node, "node");
            Intrinsics.checkNotNullParameter(node, "node");
            int i7 = node.f23575b;
            if (i7 == 0) {
                i7 = node instanceof g0 ? 1 | 8 : 1;
            }
            node.f23575b = i7;
            eVar2 = node;
        } else {
            Intrinsics.checkNotNullParameter(element, "element");
            c cVar = new c();
            Intrinsics.checkNotNullParameter(element, "element");
            int i10 = element instanceof AppendedSemanticsElement ? 9 : 1;
            if (element instanceof f0.d) {
                i10 |= 16;
            }
            cVar.f23575b = i10;
            cVar.f11285i = element;
            cVar.j = new HashSet();
            eVar2 = cVar;
        }
        if (eVar2.f23581h) {
            throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        z.e eVar3 = eVar.f23578e;
        if (eVar3 != null) {
            eVar3.f23577d = eVar2;
            eVar2.f23578e = eVar3;
        }
        eVar.f23578e = eVar2;
        eVar2.f23577d = eVar;
        return eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static z.e b(z.e node) {
        if (node.f23581h) {
            Intrinsics.checkNotNullParameter(node, "node");
            if (!node.f23581h) {
                throw new IllegalStateException("Check failed.");
            }
            Intrinsics.checkNotNullParameter(node, "node");
            int i7 = node.f23575b;
            if ((i7 & 2) != 0 && (node instanceof c)) {
                c cVar = (c) node;
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                k.b(cVar).f();
                k.a(node, 2).H = true;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 && (node instanceof c)) {
                k.b(node).f();
            }
            if ((i7 & 4) != 0 && (node instanceof c)) {
                w.c((c) node);
            }
            if ((i7 & 8) != 0 && (node instanceof g0)) {
                g0 g0Var = (g0) node;
                Intrinsics.checkNotNullParameter(g0Var, "<this>");
                u uVarB = k.b(g0Var);
                uVarB.getClass();
                w.d(uVarB);
                throw null;
            }
            if ((i7 & 64) != 0 && (node instanceof c)) {
                c cVar2 = (c) node;
                Intrinsics.checkNotNullParameter(cVar2, "<this>");
                z zVar = k.b(cVar2).f11326m;
                zVar.f11348i.E = true;
                x xVar = zVar.j;
                if (xVar != null) {
                    xVar.I = true;
                }
            }
            if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 && (node instanceof c)) {
                f focusProperties = f.f11301a;
                Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
                throw new IllegalStateException("Check failed.");
            }
            if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 && (node instanceof c)) {
                c cVar3 = (c) node;
                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                k.c(cVar3);
                throw null;
            }
            if (!node.f23581h) {
                throw new IllegalStateException("node detached multiple times");
            }
            if (node.f23579f == null) {
                throw new IllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!node.f23580g) {
                throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            node.f23580g = false;
            node.a();
            if (!node.f23581h) {
                throw new IllegalStateException("Cannot detach a node that is not attached");
            }
            if (node.f23580g) {
                throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            node.f23581h = false;
        }
        z.e eVar = node.f23578e;
        z.e eVar2 = node.f23577d;
        if (eVar != null) {
            eVar.f23577d = eVar2;
            node.f23578e = null;
        }
        if (eVar2 != null) {
            eVar2.f23578e = eVar;
            node.f23577d = null;
        }
        Intrinsics.checkNotNull(eVar2);
        return eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(z.d dVar, z.d element, z.e node) {
        boolean z5 = dVar instanceof AppendedSemanticsElement;
        f focusProperties = f.f11301a;
        if (z5 && (element instanceof AppendedSemanticsElement)) {
            AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) element;
            d0 d0Var = e0.f11300a;
            Intrinsics.checkNotNull(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            appendedSemanticsElement.getClass();
            k0.b node2 = (k0.b) node;
            Intrinsics.checkNotNullParameter(node2, "node");
            node2.getClass();
            Function1 function1 = appendedSemanticsElement.f1228b;
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            node2.f14209i = function1;
            if (node.f23581h) {
                Intrinsics.checkNotNullParameter(node, "node");
                if (!node.f23581h) {
                    throw new IllegalStateException("Check failed.");
                }
                Intrinsics.checkNotNullParameter(node, "node");
                int i7 = node.f23575b;
                if ((i7 & 2) != 0 && (node instanceof c)) {
                    c cVar = (c) node;
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    k.b(cVar).f();
                }
                if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 && (node instanceof c)) {
                    k.b(node).f();
                }
                if ((i7 & 4) != 0 && (node instanceof c)) {
                    w.c((c) node);
                }
                if ((i7 & 8) != 0 && (node instanceof g0)) {
                    g0 g0Var = (g0) node;
                    Intrinsics.checkNotNullParameter(g0Var, "<this>");
                    u uVarB = k.b(g0Var);
                    uVarB.getClass();
                    w.d(uVarB);
                    throw null;
                }
                if ((i7 & 64) != 0 && (node instanceof c)) {
                    c cVar2 = (c) node;
                    Intrinsics.checkNotNullParameter(cVar2, "<this>");
                    z zVar = k.b(cVar2).f11326m;
                    zVar.f11348i.E = true;
                    x xVar = zVar.j;
                    if (xVar != null) {
                        xVar.I = true;
                    }
                }
                if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 && (node instanceof c)) {
                    Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
                    throw new IllegalStateException("Check failed.");
                }
                if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 || !(node instanceof c)) {
                    return;
                }
                c cVar3 = (c) node;
                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                k.c(cVar3);
                throw null;
            }
            return;
        }
        if (!(node instanceof c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        c cVar4 = (c) node;
        Intrinsics.checkNotNullParameter(element, "value");
        boolean z6 = cVar4.f23581h;
        if (z6) {
            if (!z6) {
                throw new IllegalStateException("Check failed.");
            }
            if ((cVar4.f23575b & 8) != 0) {
                k.c(cVar4);
                throw null;
            }
        }
        cVar4.f11285i = element;
        Intrinsics.checkNotNullParameter(element, "element");
        int i10 = element instanceof AppendedSemanticsElement ? 9 : 1;
        if (element instanceof f0.d) {
            i10 |= 16;
        }
        cVar4.f23575b = i10;
        if (cVar4.f23581h) {
            if (!cVar4.f23581h) {
                throw new IllegalStateException("Check failed.");
            }
            z.d dVar2 = cVar4.f11285i;
            if ((cVar4.f23575b & 4) != 0) {
                Intrinsics.checkNotNullParameter(cVar4, "<this>");
                k.a(cVar4, 2).H();
            }
            if ((cVar4.f23575b & 2) != 0) {
                int i11 = e.f11299a;
                h0 h0Var = k.b(cVar4).f11325l.f11289d;
                Intrinsics.checkNotNull(h0Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
                if (h0Var.f11308i) {
                    f0 f0Var = cVar4.f23579f;
                    Intrinsics.checkNotNull(f0Var);
                    o oVar = (o) f0Var;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(cVar4, "<set-?>");
                    oVar.O = cVar4;
                    f0Var.getClass();
                }
                Intrinsics.checkNotNullParameter(cVar4, "<this>");
                k.a(cVar4, 2).H();
                k.b(cVar4).f();
            }
            if ((cVar4.f23575b & 16) != 0 && (dVar2 instanceof f0.d)) {
                ((f0.d) dVar2).getPointerInputFilter().setLayoutCoordinates$ui_release(cVar4.f23579f);
            }
            if ((cVar4.f23575b & 8) != 0) {
                k.c(cVar4);
                throw null;
            }
        }
        if (node.f23581h) {
            Intrinsics.checkNotNullParameter(node, "node");
            if (!node.f23581h) {
                throw new IllegalStateException("Check failed.");
            }
            Intrinsics.checkNotNullParameter(node, "node");
            int i12 = node.f23575b;
            if ((i12 & 2) != 0) {
                c cVar5 = (c) node;
                Intrinsics.checkNotNullParameter(cVar5, "<this>");
                k.b(cVar5).f();
            }
            if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                k.b(node).f();
            }
            if ((i12 & 4) != 0) {
                w.c((c) node);
            }
            if ((i12 & 8) != 0) {
                g0 g0Var2 = (g0) node;
                Intrinsics.checkNotNullParameter(g0Var2, "<this>");
                u uVarB2 = k.b(g0Var2);
                uVarB2.getClass();
                w.d(uVarB2);
                throw null;
            }
            if ((i12 & 64) != 0) {
                c cVar6 = (c) node;
                Intrinsics.checkNotNullParameter(cVar6, "<this>");
                z zVar2 = k.b(cVar6).f11326m;
                zVar2.f11348i.E = true;
                x xVar2 = zVar2.j;
                if (xVar2 != null) {
                    xVar2.I = true;
                }
            }
            if ((i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
                throw new IllegalStateException("Check failed.");
            }
            if ((i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
                return;
            }
            c cVar7 = (c) node;
            Intrinsics.checkNotNullParameter(cVar7, "<this>");
            k.c(cVar7);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0151 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x012a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0134  */
    /* JADX WARN: Code duplicated, block: B:52:0x014f  */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:76:0x01a5
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void c(int r33, v.d r34, v.d r35, z.e r36) {
        /*
            Method dump skipped, instruction units count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.c0.c(int, v.d, v.d, z.e):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        z.e eVar = this.f11290e;
        h0 h0Var = this.f11289d;
        if (eVar == h0Var) {
            sb2.append("]");
        } else {
            while (eVar != null && eVar != h0Var) {
                sb2.append(String.valueOf(eVar));
                if (eVar.f23578e == h0Var) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                eVar = eVar.f23578e;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
