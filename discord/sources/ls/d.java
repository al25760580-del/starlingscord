package ls;

import android.content.Context;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.v;
import androidx.core.view.d1;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ep.j0;
import io.sentry.ILogger;
import io.sentry.f4;
import io.sentry.y2;
import java.io.Closeable;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlin.text.x;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.modules.SerializersModule;
import lq.b1;
import lq.d0;
import lq.q0;
import lq.t0;
import lq.z;
import m3.o;
import or.e1;
import or.h0;
import or.l1;
import or.m1;
import or.u0;
import pp.a0;
import pp.a1;
import pp.i0;
import pp.s0;
import so.p;
import u.y;
import vo.l0;
import vo.r0;
import vo.u;
import yo.k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements d1, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15280a;

    public /* synthetic */ d(int i7) {
        this.f15280a = i7;
    }

    public static final boolean A(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        vo.i iVarG = zVar.r0().g();
        if (iVarG != null) {
            if (xp.g.b(iVarG)) {
                Intrinsics.checkNotNullParameter(iVarG, "<this>");
                if (xp.g.f(iVarG) && !Intrinsics.areEqual(bq.e.g((vo.f) iVarG), p.f20400h)) {
                    return true;
                }
            }
            if (xp.g.h(zVar)) {
                return true;
            }
        }
        vo.i iVarG2 = zVar.r0().g();
        r0 r0Var = iVarG2 instanceof r0 ? (r0) iVarG2 : null;
        return r0Var != null && A(c9.a.u(r0Var));
    }

    public static final s0 B(a0 a0Var, pf.b typeTable) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i7 = a0Var.f18200i;
        if ((i7 & 8) == 8) {
            s0 s0Var = a0Var.f18204y;
            Intrinsics.checkNotNullExpressionValue(s0Var, "getReturnType(...)");
            return s0Var;
        }
        if ((i7 & 16) == 16) {
            return typeTable.f(a0Var.E);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final s0 C(i0 i0Var, pf.b typeTable) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i7 = i0Var.f18317i;
        if ((i7 & 8) == 8) {
            s0 s0Var = i0Var.f18321y;
            Intrinsics.checkNotNullExpressionValue(s0Var, "getReturnType(...)");
            return s0Var;
        }
        if ((i7 & 16) == 16) {
            return typeTable.f(i0Var.E);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static void D(f4 f4Var, y2 y2Var, ILogger iLogger) {
        if (f4Var.f12670d != null) {
            y2Var.v("event_id").r(iLogger, f4Var.f12670d);
        }
        y2Var.v("contexts").r(iLogger, f4Var.f12671e);
        if (f4Var.f12672i != null) {
            y2Var.v("sdk").r(iLogger, f4Var.f12672i);
        }
        if (f4Var.f12673v != null) {
            y2Var.v("request").r(iLogger, f4Var.f12673v);
        }
        AbstractMap abstractMap = f4Var.f12674w;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            y2Var.v("tags").r(iLogger, f4Var.f12674w);
        }
        if (f4Var.f12675x != null) {
            y2Var.v("release").f(f4Var.f12675x);
        }
        if (f4Var.f12676y != null) {
            y2Var.v("environment").f(f4Var.f12676y);
        }
        if (f4Var.E != null) {
            y2Var.v("platform").f(f4Var.E);
        }
        if (f4Var.F != null) {
            y2Var.v("user").r(iLogger, f4Var.F);
        }
        if (f4Var.H != null) {
            y2Var.v("server_name").f(f4Var.H);
        }
        if (f4Var.I != null) {
            y2Var.v("dist").f(f4Var.I);
        }
        List list = f4Var.J;
        if (list != null && !list.isEmpty()) {
            y2Var.v("breadcrumbs").r(iLogger, f4Var.J);
        }
        if (f4Var.K != null) {
            y2Var.v("debug_meta").r(iLogger, f4Var.K);
        }
        AbstractMap abstractMap2 = f4Var.L;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        y2Var.v("extra").r(iLogger, f4Var.L);
    }

    public static final KSerializer E(SerializersModule serializersModule, Type type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer kSerializerY = l.y(serializersModule, type, true);
        if (kSerializerY != null) {
            return kSerializerY;
        }
        Class clsV = l.v(type);
        Intrinsics.checkNotNullParameter(clsV, "<this>");
        throw new kr.g(e1.j(gn.h.E(clsV)));
    }

    public static final KSerializer F(SerializersModule serializersModule, KType type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer kSerializerI = mf.f.I(serializersModule, type, true);
        if (kSerializerI != null) {
            return kSerializerI;
        }
        KClass kClassI = e1.i(type);
        Intrinsics.checkNotNullParameter(kClassI, "<this>");
        Intrinsics.checkNotNullParameter(kClassI, "<this>");
        throw new kr.g(e1.j(kClassI));
    }

    public static final KSerializer G(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KSerializer[] args = new KSerializer[0];
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        KSerializer kSerializerD = e1.d(gn.h.B(kClass), (KSerializer[]) Arrays.copyOf(args, 0));
        if (kSerializerD != null) {
            return kSerializerD;
        }
        sn.i iVar = l1.f17571a;
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (KSerializer) l1.f17571a.get(kClass);
    }

    public static final ArrayList H(SerializersModule serializersModule, List typeArguments, boolean z5) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z5) {
            ArrayList arrayList = new ArrayList(e0.l(typeArguments, 10));
            Iterator it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(F(serializersModule, (KType) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(e0.l(typeArguments, 10));
        Iterator it2 = typeArguments.iterator();
        while (it2.hasNext()) {
            KType type = (KType) it2.next();
            Intrinsics.checkNotNullParameter(serializersModule, "<this>");
            Intrinsics.checkNotNullParameter(type, "type");
            KSerializer kSerializerI = mf.f.I(serializersModule, type, false);
            if (kSerializerI == null) {
                return null;
            }
            arrayList2.add(kSerializerI);
        }
        return arrayList2;
    }

    public static final y I(Function0 function0) {
        return new y(function0);
    }

    public static final s0 J(a1 a1Var, pf.b typeTable) {
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i7 = a1Var.f18206i;
        if ((i7 & 4) == 4) {
            s0 s0Var = a1Var.f18209x;
            Intrinsics.checkNotNullExpressionValue(s0Var, "getType(...)");
            return s0Var;
        }
        if ((i7 & 8) == 8) {
            return typeTable.f(a1Var.f18210y);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static void K(Parcel parcel, int i7, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iT = T(i7, parcel);
        parcel.writeBundle(bundle);
        U(iT, parcel);
    }

    public static void L(Parcel parcel, int i7, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iT = T(i7, parcel);
        parcel.writeByteArray(bArr);
        U(iT, parcel);
    }

    public static void M(Parcel parcel, int i7, Integer num) {
        if (num == null) {
            return;
        }
        S(parcel, i7, 4);
        parcel.writeInt(num.intValue());
    }

    public static void N(Parcel parcel, int i7, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int iT = T(i7, parcel);
        parcelable.writeToParcel(parcel, i10);
        U(iT, parcel);
    }

    public static void O(String str, Parcel parcel, int i7) {
        if (str == null) {
            return;
        }
        int iT = T(i7, parcel);
        parcel.writeString(str);
        U(iT, parcel);
    }

    public static void P(Parcel parcel, int i7, List list) {
        if (list == null) {
            return;
        }
        int iT = T(i7, parcel);
        parcel.writeStringList(list);
        U(iT, parcel);
    }

    public static void Q(Parcel parcel, int i7, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int iT = T(i7, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        U(iT, parcel);
    }

    public static void R(Parcel parcel, int i7, List list) {
        if (list == null) {
            return;
        }
        int iT = T(i7, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        U(iT, parcel);
    }

    public static void S(Parcel parcel, int i7, int i10) {
        parcel.writeInt(i7 | (i10 << 16));
    }

    public static int T(int i7, Parcel parcel) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void U(int i7, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(iDataPosition - i7);
        parcel.setDataPosition(iDataPosition);
    }

    public static pr.k e(Function1 builderAction) {
        pr.b json = Json.f14760d;
        Intrinsics.checkNotNullParameter(json, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Intrinsics.checkNotNullParameter(json, "json");
        JsonBuilder jsonBuilder = new JsonBuilder();
        v vVar = json.f14761a;
        jsonBuilder.f14764a = vVar.f1138e;
        jsonBuilder.f14765b = vVar.f1137d;
        String str = (String) vVar.f1140g;
        String str2 = (String) vVar.f1135b;
        pr.a aVar = (pr.a) vVar.f1136c;
        boolean z5 = vVar.f1139f;
        SerializersModule module = json.f14762b;
        builderAction.invoke(jsonBuilder);
        if (!Intrinsics.areEqual(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        v configuration = new v(jsonBuilder.f14765b, jsonBuilder.f14764a, str, str2, z5, aVar);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        pr.k kVar = new pr.k(configuration, module);
        if (Intrinsics.areEqual(module, rr.b.f19552a)) {
            return kVar;
        }
        module.a(new cg.b(str2, 3));
        return kVar;
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, Object obj, int i7, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i7, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i7 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i7, i10, 33);
    }

    public static void j(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        Log.e("d", str + ": glError " + iGlGetError);
        throw new RuntimeException(str + ": glError " + iGlGetError);
    }

    public static final void k(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                rn.f.a(th2, th3);
            }
        }
    }

    public static Uri l(Context context, String name) {
        xm.a aVar = xm.a.f22977a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Locale locale = Locale.ROOT;
        x.l(a3.e.p(locale, "ROOT", name, locale, "toLowerCase(...)"), "-", "_", false);
        int iA = aVar.a(context, name, "drawable");
        if (iA != 0) {
            return Uri.parse("res:/" + iA);
        }
        int iA2 = aVar.a(context, name, "raw");
        if (iA2 != 0) {
            return Uri.parse("res:/" + iA2);
        }
        if (!x.o(name, "asset:/", false)) {
            return Uri.parse("file:///android_asset/".concat(name));
        }
        return Uri.parse("file:///android_asset/" + StringsKt.N(name, "asset:/"));
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    public static final String o(u callableMemberDescriptor) {
        vo.d dVarK;
        up.e eVar;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        vo.d dVarP = so.i.A(callableMemberDescriptor) ? p(callableMemberDescriptor) : null;
        if (dVarP != null && (dVarK = bq.e.k(dVarP)) != null) {
            if (dVarK instanceof l0) {
                Intrinsics.checkNotNullParameter(dVarK, "<this>");
                so.i.A(dVarK);
                vo.d dVarB = bq.e.b(bq.e.k(dVarK), ep.d.f8525v);
                if (dVarB != null && (eVar = (up.e) ep.f.f8537a.get(bq.e.g(dVarB))) != null) {
                    return eVar.b();
                }
            } else if (dVarK instanceof k0) {
                int i7 = ep.c.f8520l;
                k0 functionDescriptor = (k0) dVarK;
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                LinkedHashMap linkedHashMap = j0.f8567i;
                String strG = com.facebook.imagepipeline.nativecode.b.g(functionDescriptor);
                up.e eVar2 = strG == null ? null : (up.e) linkedHashMap.get(strG);
                if (eVar2 != null) {
                    return eVar2.b();
                }
            }
        }
        return null;
    }

    public static final vo.d p(vo.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (!j0.j.contains(dVar.getName()) && !ep.f.f8540d.contains(bq.e.k(dVar).getName())) {
            return null;
        }
        if ((dVar instanceof l0) || (dVar instanceof vo.k0)) {
            return bq.e.b(dVar, ep.d.f8527x);
        }
        if (dVar instanceof k0) {
            return bq.e.b(dVar, ep.d.f8528y);
        }
        return null;
    }

    public static final vo.d q(vo.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        vo.d dVarP = p(dVar);
        if (dVarP != null) {
            return dVarP;
        }
        int i7 = ep.e.f8531l;
        up.e name = dVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (ep.e.b(name)) {
            return bq.e.b(dVar, ep.d.E);
        }
        return null;
    }

    public static final boolean r(vo.f fVar, vo.d specialCallableDescriptor) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(specialCallableDescriptor, "specialCallableDescriptor");
        vo.l lVarG = specialCallableDescriptor.g();
        Intrinsics.checkNotNull(lVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        d0 supertype = ((vo.f) lVarG).j();
        Intrinsics.checkNotNullExpressionValue(supertype, "getDefaultType(...)");
        for (vo.f fVarJ = xp.e.j(fVar); fVarJ != null; fVarJ = xp.e.j(fVarJ)) {
            if (!(fVarJ instanceof gp.c)) {
                d0 subtype = fVarJ.j();
                lq.d1 d1VarG = null;
                if (subtype == null) {
                    gn.h.a(0);
                    throw null;
                }
                if (supertype == null) {
                    gn.h.a(1);
                    throw null;
                }
                mq.m typeCheckingProcedureCallbacks = new mq.m();
                Intrinsics.checkNotNullParameter(subtype, "subtype");
                Intrinsics.checkNotNullParameter(supertype, "supertype");
                Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.add(new mq.n(subtype, null));
                q0 q0VarR0 = supertype.r0();
                while (!arrayDeque.isEmpty()) {
                    mq.n nVar = (mq.n) arrayDeque.poll();
                    z zVarH = nVar.f16036a;
                    q0 q0VarR1 = zVarH.r0();
                    if (q0VarR1 == null) {
                        mq.m.a(3);
                        throw null;
                    }
                    if (q0VarR0 == null) {
                        mq.m.a(4);
                        throw null;
                    }
                    if (q0VarR1.equals(q0VarR0)) {
                        boolean zT0 = zVarH.t0();
                        for (mq.n nVar2 = nVar.f16037b; nVar2 != null; nVar2 = nVar2.f16037b) {
                            z kotlinType = nVar2.f16036a;
                            List listL0 = kotlinType.l0();
                            lq.f fVar2 = lq.r0.f15247b;
                            if (listL0 != null && listL0.isEmpty()) {
                                Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
                                zVarH = fVar2.f(kotlinType.r0(), kotlinType.l0()).c().h(zVarH, lq.e1.INVARIANT);
                                Intrinsics.checkNotNull(zVarH);
                                break;
                            }
                            Iterator it = listL0.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
                                    zVarH = fVar2.f(kotlinType.r0(), kotlinType.l0()).c().h(zVarH, lq.e1.INVARIANT);
                                    Intrinsics.checkNotNull(zVarH);
                                    break;
                                }
                                lq.e1 e1VarA = ((t0) it.next()).a();
                                lq.e1 e1Var = lq.e1.INVARIANT;
                                if (e1VarA != e1Var) {
                                    Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
                                    z zVarH2 = com.facebook.imagepipeline.nativecode.c.Q(fVar2.f(kotlinType.r0(), kotlinType.l0())).c().h(zVarH, e1Var);
                                    Intrinsics.checkNotNullExpressionValue(zVarH2, "safeSubstitute(...)");
                                    zVarH = (z) mf.f.b(zVarH2).f19542b;
                                    break;
                                }
                            }
                            zT0 = zT0 || kotlinType.t0();
                        }
                        q0 q0VarR2 = zVarH.r0();
                        if (q0VarR2 == null) {
                            mq.m.a(3);
                            throw null;
                        }
                        if (q0VarR2.equals(q0VarR0)) {
                            d1VarG = b1.g(zVarH, zT0);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + ib.a.p(q0VarR2) + ", \n\nsupertype: " + ib.a.p(q0VarR0) + " \n" + q0VarR2.equals(q0VarR0));
                    }
                    for (z zVar : q0VarR1.h()) {
                        Intrinsics.checkNotNull(zVar);
                        arrayDeque.add(new mq.n(zVar, nVar));
                    }
                }
                if (d1VarG != null) {
                    return !so.i.A(fVarJ);
                }
            }
        }
        return false;
    }

    public static int s(int i7, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i7);
        j("glCreateShader type=" + i7);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("d", "Could not compile shader " + i7 + ":");
        StringBuilder sb2 = new StringBuilder(" ");
        sb2.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        Log.e("d", sb2.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static final s0 t(s0 s0Var, pf.b typeTable) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i7 = s0Var.f18433i;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            return s0Var.J;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            return typeTable.f(s0Var.K);
        }
        return null;
    }

    public static final KSerializer u(KClass rootClass, ArrayList serializers, Function0 elementClassifierIfArray) {
        KSerializer dVar;
        KSerializer m1Var;
        Intrinsics.checkNotNullParameter(rootClass, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Collection.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            dVar = new or.d((KSerializer) serializers.get(0), 0);
        } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            dVar = new or.d((KSerializer) serializers.get(0), 1);
        } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            dVar = new or.d((KSerializer) serializers.get(0), 2);
        } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            dVar = new h0((KSerializer) serializers.get(0), (KSerializer) serializers.get(1), 0);
        } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            dVar = new h0((KSerializer) serializers.get(0), (KSerializer) serializers.get(1), 1);
        } else {
            if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
                KSerializer keySerializer = (KSerializer) serializers.get(0);
                KSerializer valueSerializer = (KSerializer) serializers.get(1);
                Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
                Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
                m1Var = new u0(keySerializer, valueSerializer, 0);
            } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
                KSerializer keySerializer2 = (KSerializer) serializers.get(0);
                KSerializer valueSerializer2 = (KSerializer) serializers.get(1);
                Intrinsics.checkNotNullParameter(keySerializer2, "keySerializer");
                Intrinsics.checkNotNullParameter(valueSerializer2, "valueSerializer");
                m1Var = new u0(keySerializer2, valueSerializer2, 1);
            } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(rn.v.class))) {
                KSerializer aSerializer = (KSerializer) serializers.get(0);
                KSerializer bSerializer = (KSerializer) serializers.get(1);
                KSerializer cSerializer = (KSerializer) serializers.get(2);
                Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
                Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
                Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
                dVar = new kr.a(aSerializer, bSerializer, cSerializer);
            } else {
                Intrinsics.checkNotNullParameter(rootClass, "rootClass");
                if (gn.h.B(rootClass).isArray()) {
                    Object objInvoke = elementClassifierIfArray.invoke();
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    KClass kClass = (KClass) objInvoke;
                    KSerializer elementSerializer = (KSerializer) serializers.get(0);
                    Intrinsics.checkNotNullParameter(kClass, "kClass");
                    Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
                    m1Var = new m1(kClass, elementSerializer);
                } else {
                    dVar = null;
                }
            }
            dVar = m1Var;
        }
        if (dVar != null) {
            return dVar;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) serializers.toArray(new KSerializer[0]);
        KSerializer[] args = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        Intrinsics.checkNotNullParameter(rootClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return e1.d(gn.h.B(rootClass), (KSerializer[]) Arrays.copyOf(args, args.length));
    }

    public static final s0 y(a0 a0Var, pf.b typeTable) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i7 = a0Var.f18200i;
        if ((i7 & 32) == 32) {
            return a0Var.G;
        }
        if ((i7 & 64) == 64) {
            return typeTable.f(a0Var.H);
        }
        return null;
    }

    public static final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.endViewTransition(view);
            viewGroup.removeView(view);
        }
        view.setVisibility(0);
        view.setTranslationY(0.0f);
    }

    @Override // m3.o
    public float b(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    public abstract boolean g(g4.h hVar, g4.c cVar, g4.c cVar2);

    public abstract boolean h(g4.h hVar, Object obj, Object obj2);

    public int hashCode() {
        switch (this.f15280a) {
            case 13:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract boolean i(g4.h hVar, g4.g gVar, g4.g gVar2);

    public abstract String m(byte[] bArr, int i7, int i10);

    public String toString() {
        switch (this.f15280a) {
            case 13:
                String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
                Intrinsics.checkNotNull(simpleName);
                return simpleName;
            default:
                return super.toString();
        }
    }

    public abstract int v(byte[] bArr, int i7, int i10);

    public abstract void w(g4.g gVar, g4.g gVar2);

    public abstract void x(g4.g gVar, Thread thread);

    @Override // androidx.core.view.d1
    public void a() {
    }

    @Override // androidx.core.view.d1
    public void d() {
    }
}
