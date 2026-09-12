package ph;

import android.graphics.Rect;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.agesignals.AgeSignalsManager;
import com.google.firebase.messaging.r;
import ep.p;
import ig.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lq.z;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import qr.q;
import sh.a0;
import uo.o;
import vo.l0;
import vo.n;
import vo.u;
import vo.y;
import wp.k;
import yo.f0;
import yo.h0;
import yo.i0;
import yo.j0;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements AgeSignalsManager, r3.f, ze.i, th.g, ca.b, vq.b, OnCompleteListener, n, xb.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18031d;

    public /* synthetic */ c(Object obj) {
        this.f18031d = obj;
    }

    @Override // th.g
    public Object a() {
        return new a0(new th.f(new pf.b(8, (po.d) this.f18031d)));
    }

    @Override // ze.i
    public void accept(Object obj, Object obj2) {
        rf.g gVar = (rf.g) this.f18031d;
        sf.f fVar = new sf.f((ig.g) obj2, 0);
        sf.d dVar = (sf.d) ((sf.e) obj).o();
        ye.f fVarA = bg.c.a();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i7 = bg.b.f3229a;
        parcelObtain.writeStrongBinder(fVar);
        bg.b.b(parcelObtain, gVar);
        bg.b.b(parcelObtain, fVarA);
        ((sf.b) dVar).j(6, parcelObtain);
    }

    @Override // vq.b
    public Iterable b(Object obj) {
        o oVar = (o) this.f18031d;
        Collection collectionH = ((vo.f) obj).n().h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionH.iterator();
        while (it.hasNext()) {
            vo.i iVarG = ((z) it.next()).r0().g();
            vo.f fVarF = null;
            vo.i iVarA = iVarG != null ? iVarG.a() : null;
            vo.f fVar = iVarA instanceof vo.f ? (vo.f) iVarA : null;
            if (fVar != null && (fVarF = oVar.f(fVar)) == null) {
                fVarF = fVar;
            }
            if (fVarF != null) {
                arrayList.add(fVarF);
            }
        }
        return arrayList;
    }

    @Override // vo.n
    public Object c(i0 descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        p(descriptor, builder, "getter");
        return Unit.f14616a;
    }

    @Override // vo.n
    public /* bridge */ /* synthetic */ Object d(u uVar, Object obj) {
        o(uVar, (StringBuilder) obj);
        return Unit.f14616a;
    }

    @Override // ca.b
    public ca.a e(r rVar, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.f18031d;
        if (animatedFactoryV2Impl.f4738g == null) {
            animatedFactoryV2Impl.f4738g = new i8.b(5);
        }
        return new ca.a(animatedFactoryV2Impl.f4738g, rVar, rect, animatedFactoryV2Impl.f4735d);
    }

    @Override // vo.n
    public Object f(h0 descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        wp.h.n((wp.h) this.f18031d, descriptor, builder);
        return Unit.f14616a;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    public l g(h hVar) {
        g gVar = (g) this.f18031d;
        cg.h hVar2 = gVar.f18043c;
        if (hVar2 == null) {
            return g.a(-2);
        }
        if (!gVar.b()) {
            return g.a(-6);
        }
        ig.g gVar2 = new ig.g();
        hVar2.a().post(new cg.e(hVar2, gVar2, gVar2, new cg.e(gVar, gVar2, gVar2, hVar, 2), 0));
        return gVar2.f11763a;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f18031d;
    }

    @Override // r3.f
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) zs.a.j(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f18031d).getWebkitToCompatConverter());
    }

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    public l h(kh.f fVar) {
        g gVar = (g) this.f18031d;
        cg.h hVar = gVar.f18043c;
        if (hVar == null) {
            return g.a(-2);
        }
        if (!gVar.b()) {
            return g.a(-6);
        }
        ig.g gVar2 = new ig.g();
        hVar.a().post(new cg.e(hVar, gVar2, gVar2, new cg.e(gVar, gVar2, gVar2, fVar, 1), 0));
        return gVar2.f11763a;
    }

    @Override // r3.f
    public String[] i() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f18031d).getSupportedFeatures();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0054  */
    @Override // vo.n
    public Object j(yo.h constructorDescriptor, Object obj) {
        boolean z5;
        yo.h hVarE;
        boolean z6 = constructorDescriptor.f23444b0;
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.checkNotNullParameter(constructorDescriptor, "constructorDescriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        wp.h hVar = (wp.h) this.f18031d;
        hVar.getClass();
        hVar.x(builder, constructorDescriptor, null);
        k kVar = hVar.f22428d;
        tm.e eVar = kVar.f22449o;
        KProperty[] kPropertyArr = k.Y;
        if (((Boolean) eVar.getValue(kVar, kPropertyArr[13])).booleanValue() || constructorDescriptor.r().e() != y.f21853i) {
            p visibility = constructorDescriptor.getVisibility();
            Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
            if (hVar.g0(visibility, builder)) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        hVar.J(builder, constructorDescriptor);
        boolean z7 = ((Boolean) kVar.P.getValue(kVar, kPropertyArr[40])).booleanValue() || !z6 || z5;
        if (z7) {
            builder.append(hVar.I("constructor"));
        }
        vo.f fVarG = constructorDescriptor.g();
        Intrinsics.checkNotNullExpressionValue(fVarG, "getContainingDeclaration(...)");
        if (((Boolean) kVar.A.getValue(kVar, kPropertyArr[25])).booleanValue()) {
            if (z7) {
                builder.append(" ");
            }
            hVar.P(fVarG, builder, true);
            List typeParameters = constructorDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            hVar.c0(builder, typeParameters, false);
        }
        List listL = constructorDescriptor.L();
        Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
        hVar.f0(builder, listL, constructorDescriptor.v());
        if (((Boolean) kVar.f22451q.getValue(kVar, kPropertyArr[15])).booleanValue() && !z6 && fVarG != null && (hVarE = fVarG.E()) != null) {
            List listL2 = hVarE.L();
            Intrinsics.checkNotNullExpressionValue(listL2, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listL2) {
                q0 q0Var = (q0) obj2;
                if (!q0Var.C0() && q0Var.H == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                builder.append(" : ");
                builder.append(hVar.I("this"));
                builder.append(CollectionsKt.O(arrayList, ", ", "(", ")", wp.d.K, 24));
            }
        }
        if (((Boolean) kVar.A.getValue(kVar, k.Y[25])).booleanValue()) {
            List typeParameters2 = constructorDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
            hVar.h0(builder, typeParameters2);
        }
        return Unit.f14616a;
    }

    @Override // vo.n
    public Object k(j0 descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        p(descriptor, builder, "setter");
        return Unit.f14616a;
    }

    public void l(byte[] bArr, int i7, int i10, int i11, int i12) throws ij.b {
        int i13 = i10 + i11;
        int i14 = i12 == 0 ? 1 : 2;
        int[] iArr = new int[i13 / i14];
        for (int i15 = 0; i15 < i13; i15++) {
            if (i12 == 0 || i15 % 2 == i12 - 1) {
                iArr[i15 / i14] = bArr[i15 + i7] & 255;
            }
        }
        try {
            ((ue.i) this.f18031d).h(i11 / i14, iArr);
            for (int i16 = 0; i16 < i10; i16++) {
                if (i12 == 0 || i16 % 2 == i12 - 1) {
                    bArr[i16 + i7] = (byte) iArr[i16 / i14];
                }
            }
        } catch (oj.b unused) {
            throw ij.b.a();
        }
    }

    public Object m(SerialDescriptor descriptor, q key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) ((ConcurrentHashMap) this.f18031d).get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0233  */
    public Object n(yo.y classifier, StringBuilder builder) {
        StringBuilder sb2;
        yo.h hVarE;
        String str;
        Intrinsics.checkNotNullParameter(classifier, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        wp.h hVar = (wp.h) this.f18031d;
        k kVar = hVar.f22428d;
        boolean z5 = classifier.c() == vo.g.f21811v;
        if (!hVar.q()) {
            List listP0 = classifier.p0();
            Intrinsics.checkNotNullExpressionValue(listP0, "getContextReceivers(...)");
            hVar.B(builder, listP0);
            hVar.x(builder, classifier, null);
            if (!z5) {
                p visibility = classifier.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                hVar.g0(visibility, builder);
            }
            if ((classifier.c() != vo.g.f21809e || classifier.e() != y.f21855w) && (!classifier.c().a() || classifier.e() != y.f21852e)) {
                y yVarE = classifier.e();
                Intrinsics.checkNotNullExpressionValue(yVarE, "getModality(...)");
                hVar.L(yVarE, builder, wp.h.u(classifier));
            }
            hVar.K(classifier, builder);
            hVar.N(builder, hVar.p().contains(wp.i.INNER) && classifier.z(), "inner");
            hVar.N(builder, hVar.p().contains(wp.i.DATA) && classifier.s0(), "data");
            hVar.N(builder, hVar.p().contains(wp.i.INLINE) && classifier.isInline(), "inline");
            hVar.N(builder, hVar.p().contains(wp.i.VALUE) && classifier.isValue(), "value");
            hVar.N(builder, hVar.p().contains(wp.i.FUN) && classifier.s(), "fun");
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            if (classifier instanceof vo.q0) {
                str = "typealias";
            } else if (classifier.o()) {
                str = "companion object";
            } else {
                int iOrdinal = classifier.c().ordinal();
                if (iOrdinal == 0) {
                    str = "class";
                } else if (iOrdinal == 1) {
                    str = "interface";
                } else if (iOrdinal == 2) {
                    str = "enum class";
                } else if (iOrdinal == 3) {
                    str = "enum entry";
                } else if (iOrdinal == 4) {
                    str = "annotation class";
                } else {
                    if (iOrdinal != 5) {
                        throw new rn.n();
                    }
                    str = "object";
                }
            }
            builder.append(hVar.I(str));
        }
        if (xp.e.l(classifier)) {
            if (((Boolean) kVar.G.getValue(kVar, k.Y[31])).booleanValue()) {
                if (hVar.q()) {
                    builder.append("companion object");
                }
                wp.h.W(builder);
                vo.l lVarG = classifier.g();
                if (lVarG != null) {
                    builder.append("of ");
                    up.e name = lVarG.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    builder.append(hVar.O(name, false));
                }
            }
            if (hVar.t() || !Intrinsics.areEqual(classifier.getName(), up.g.f21274b)) {
                if (!hVar.q()) {
                    wp.h.W(builder);
                }
                up.e name2 = classifier.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                builder.append(hVar.O(name2, true));
            }
        } else {
            if (!hVar.q()) {
                wp.h.W(builder);
            }
            hVar.P(classifier, builder, true);
        }
        if (!z5) {
            List listL = classifier.l();
            Intrinsics.checkNotNullExpressionValue(listL, "getDeclaredTypeParameters(...)");
            hVar.c0(builder, listL, false);
            hVar.z(classifier, builder);
            if (!classifier.c().a() && ((Boolean) kVar.f22445i.getValue(kVar, k.Y[7])).booleanValue() && (hVarE = classifier.E()) != null) {
                builder.append(" ");
                hVar.x(builder, hVarE, null);
                yo.h hVar2 = hVarE;
                p visibility2 = hVar2.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility2, "getVisibility(...)");
                hVar.g0(visibility2, builder);
                builder.append(hVar.I("constructor"));
                List listL2 = hVar2.L();
                Intrinsics.checkNotNullExpressionValue(listL2, "getValueParameters(...)");
                hVar.f0(builder, listL2, hVarE.v());
            }
            if (((Boolean) kVar.f22458x.getValue(kVar, k.Y[22])).booleanValue() || so.i.F(classifier.j())) {
                sb2 = builder;
            } else {
                Collection collectionH = classifier.n().h();
                Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
                if (collectionH.isEmpty() || (collectionH.size() == 1 && so.i.y((z) collectionH.iterator().next()))) {
                    sb2 = builder;
                } else {
                    wp.h.W(builder);
                    builder.append(": ");
                    sb2 = builder;
                    CollectionsKt.N(collectionH, sb2, ", ", null, null, new wp.g(hVar, 1), 60);
                }
            }
            hVar.h0(sb2, listL);
        }
        return Unit.f14616a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bd  */
    public void o(u descriptor, StringBuilder builder) {
        String strX;
        boolean z5;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        wp.h hVar = (wp.h) this.f18031d;
        k kVar = hVar.f22428d;
        k kVar2 = hVar.f22428d;
        if (!hVar.q()) {
            tm.e eVar = kVar2.f22443g;
            KProperty[] kPropertyArr = k.Y;
            if (!((Boolean) eVar.getValue(kVar2, kPropertyArr[5])).booleanValue()) {
                List listZ = descriptor.Z();
                Intrinsics.checkNotNullExpressionValue(listZ, "getContextReceiverParameters(...)");
                hVar.B(builder, listZ);
                hVar.x(builder, descriptor, null);
                p visibility = descriptor.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                hVar.g0(visibility, builder);
                hVar.M(builder, descriptor);
                if (((Boolean) kVar2.T.getValue(kVar2, kPropertyArr[44])).booleanValue()) {
                    hVar.K(descriptor, builder);
                }
                hVar.S(builder, descriptor);
                if (((Boolean) kVar2.T.getValue(kVar2, kPropertyArr[44])).booleanValue()) {
                    boolean z6 = false;
                    if (descriptor.isOperator()) {
                        Collection collectionH = descriptor.h();
                        Intrinsics.checkNotNullExpressionValue(collectionH, "getOverriddenDescriptors(...)");
                        Collection collection = collectionH;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((u) it.next()).isOperator()) {
                                        if (!((Boolean) kVar2.O.getValue(kVar2, k.Y[39])).booleanValue()) {
                                            z5 = false;
                                        }
                                    }
                                }
                            }
                        }
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (descriptor.isInfix()) {
                        Collection collectionH2 = descriptor.h();
                        Intrinsics.checkNotNullExpressionValue(collectionH2, "getOverriddenDescriptors(...)");
                        Collection collection2 = collectionH2;
                        if (!collection2.isEmpty()) {
                            Iterator it2 = collection2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((u) it2.next()).isInfix()) {
                                        if (!((Boolean) kVar2.O.getValue(kVar2, k.Y[39])).booleanValue()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z6 = true;
                                break;
                            }
                        }
                        z6 = true;
                        break;
                    }
                    hVar.N(builder, descriptor.C(), "tailrec");
                    hVar.N(builder, descriptor.isSuspend(), "suspend");
                    hVar.N(builder, descriptor.isInline(), "inline");
                    hVar.N(builder, z6, "infix");
                    hVar.N(builder, z5, "operator");
                } else {
                    hVar.N(builder, descriptor.isSuspend(), "suspend");
                }
                hVar.J(builder, descriptor);
                if (hVar.t()) {
                    if (descriptor.f0()) {
                        builder.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (descriptor.k0()) {
                        builder.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            builder.append(hVar.I("fun"));
            builder.append(" ");
            List typeParameters = descriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            hVar.c0(builder, typeParameters, true);
            hVar.U(builder, descriptor);
        }
        hVar.P(descriptor, builder, true);
        List listL = descriptor.L();
        Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
        hVar.f0(builder, listL, descriptor.v());
        hVar.V(builder, descriptor);
        z returnType = descriptor.getReturnType();
        tm.e eVar2 = kVar.f22446l;
        KProperty[] kPropertyArr2 = k.Y;
        if (!((Boolean) eVar2.getValue(kVar, kPropertyArr2[10])).booleanValue()) {
            if (((Boolean) kVar.k.getValue(kVar, kPropertyArr2[9])).booleanValue() || returnType == null) {
                builder.append(": ");
                if (returnType == null) {
                    strX = "[NULL]";
                } else {
                    strX = hVar.X(returnType);
                }
                builder.append(strX);
            } else {
                up.e eVar3 = so.i.f20342e;
                if (!so.i.E(returnType, so.o.f20368d)) {
                    builder.append(": ");
                    if (returnType == null) {
                        strX = "[NULL]";
                    } else {
                        strX = hVar.X(returnType);
                    }
                    builder.append(strX);
                }
            }
        }
        List typeParameters2 = descriptor.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        hVar.h0(builder, typeParameters2);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((CountDownLatch) this.f18031d).countDown();
    }

    public void p(f0 f0Var, StringBuilder sb2, String str) {
        wp.h hVar = (wp.h) this.f18031d;
        k kVar = hVar.f22428d;
        int iOrdinal = ((wp.p) kVar.H.getValue(kVar, k.Y[32])).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                o(f0Var, sb2);
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new rn.n();
                }
                return;
            }
        }
        hVar.K(f0Var, sb2);
        sb2.append(str.concat(" for "));
        l0 l0VarB0 = f0Var.B0();
        Intrinsics.checkNotNullExpressionValue(l0VarB0, "getCorrespondingProperty(...)");
        wp.h.n(hVar, l0VarB0, sb2);
    }

    public c(int i7) {
        switch (i7) {
            case 3:
                this.f18031d = new rd.e(5, 1.0f, false);
                break;
            case 7:
                this.f18031d = new ue.i(oj.a.f17266o);
                break;
            case 9:
                this.f18031d = a.a.c(Looper.getMainLooper());
                break;
            default:
                this.f18031d = new ConcurrentHashMap(16);
                break;
        }
    }
}
