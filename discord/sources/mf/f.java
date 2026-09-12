package mf;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.n2;
import app.rive.Result;
import ar.a0;
import ar.k;
import ar.w;
import com.discord.R;
import com.facebook.drawee.drawable.TransformCallback;
import com.facebook.drawee.drawable.p;
import cr.s;
import eq.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Charsets;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.SerializersModule;
import lq.b1;
import lq.d0;
import lq.e1;
import lq.i0;
import lq.q0;
import lq.t0;
import lq.y0;
import lq.z;
import m3.b0;
import m3.c0;
import n1.m;
import or.o1;
import org.json.JSONObject;
import po.q1;
import rn.q;
import rn.r;
import u.n;
import vo.l;
import vo.l0;
import vo.n0;
import vo.r0;
import vo.u;
import vo.y;
import yo.h0;
import yo.j0;
import yo.k0;
import yo.t;
import yo.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f15755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f15756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static io.sentry.internal.debugmeta.c f15757c;

    public static String A(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i7 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String string2 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(name2.length() + String.valueOf(string2).length() + 9);
                    sb3.append("<");
                    sb3.append(string2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    string = sb3.toString();
                }
            }
            objArr[i10] = string;
        }
        StringBuilder sb4 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i7 < objArr.length && (iIndexOf = str.indexOf("%s", i11)) != -1) {
            sb4.append((CharSequence) str, i11, iIndexOf);
            sb4.append(objArr[i7]);
            i11 = iIndexOf + 2;
            i7++;
        }
        sb4.append((CharSequence) str, i11, str.length());
        if (i7 < objArr.length) {
            sb4.append(" [");
            sb4.append(objArr[i7]);
            for (int i12 = i7 + 1; i12 < objArr.length; i12++) {
                sb4.append(", ");
                sb4.append(objArr[i12]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static final int B(int i7, int i10) {
        if (i10 == 255) {
            return i7;
        }
        if (i10 == 0) {
            return i7 & 16777215;
        }
        return (i7 & 16777215) | ((((i7 >>> 24) * (i10 + (i10 >> 7))) >> 8) << 24);
    }

    public static n C(Result.Loading loading) {
        u.i iVar = u.i.f20890w;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return new n(loading, iVar);
    }

    public static void D(vd.b bVar) {
        bVar.k = -3.4028235E38f;
        bVar.j = Integer.MIN_VALUE;
        CharSequence charSequence = bVar.f21618a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                bVar.f21618a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = bVar.f21618a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    public static final z E(z zVar, ArrayList arrayList) {
        i0 i0Var;
        zVar.l0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rq.d dVar = (rq.d) it.next();
            dVar.getClass();
            z zVar2 = dVar.f19546c;
            z zVar3 = dVar.f19545b;
            r0 r0Var = dVar.f19544a;
            mq.d.f16016a.b(zVar3, zVar2);
            if (Intrinsics.areEqual(zVar3, zVar2)) {
                i0Var = new i0(zVar3);
            } else {
                e1 variance = r0Var.getVariance();
                e1 e1Var = e1.IN_VARIANCE;
                if (variance == e1Var) {
                    i0Var = new i0(zVar3);
                } else if (so.i.F(zVar3) && r0Var.getVariance() != e1Var) {
                    e1 e1Var2 = e1.OUT_VARIANCE;
                    if (e1Var2 == r0Var.getVariance()) {
                        e1Var2 = e1.INVARIANT;
                    }
                    i0Var = new i0(zVar2, e1Var2);
                } else {
                    if (zVar2 == null) {
                        so.i.a(140);
                        throw null;
                    }
                    if (so.i.y(zVar2) && zVar2.t0()) {
                        if (e1Var == r0Var.getVariance()) {
                            e1Var = e1.INVARIANT;
                        }
                        i0Var = new i0(zVar3, e1Var);
                    } else {
                        e1 e1Var3 = e1.OUT_VARIANCE;
                        if (e1Var3 == r0Var.getVariance()) {
                            e1Var3 = e1.INVARIANT;
                        }
                        i0Var = new i0(zVar2, e1Var3);
                    }
                }
            }
            arrayList2.add(i0Var);
        }
        return lq.c.p(zVar, arrayList2, null, 6);
    }

    public static final hp.c F(e4.i iVar, lp.b annotationsOwner) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(annotationsOwner, "annotationsOwner");
        return new hp.c(iVar, annotationsOwner, false);
    }

    public static final vo.f G(vo.z zVar, up.c fqName) {
        o oVarH0;
        dp.c lookupLocation = dp.c.f7693d;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(lookupLocation, "lookupLocation");
        up.d dVar = fqName.f21262a;
        if (!dVar.c()) {
            vo.i iVarG = ((v) zVar.O(fqName.b())).E.g(dVar.f(), lookupLocation);
            vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
            if (fVar != null) {
                return fVar;
            }
            vo.f fVarG = G(zVar, fqName.b());
            vo.i iVarG2 = (fVarG == null || (oVarH0 = fVarG.h0()) == null) ? null : oVarH0.g(dVar.f(), lookupLocation);
            if (iVarG2 instanceof vo.f) {
                return (vo.f) iVarG2;
            }
        }
        return null;
    }

    public static float H(int i7, int i10, int i11, float f2) {
        float f7;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i7 == 0) {
            f7 = i11;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    return -3.4028235E38f;
                }
                return f2;
            }
            f7 = i10;
        }
        return f2 * f7;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    public static final KSerializer I(SerializersModule serializersModule, KType kType, boolean z5) {
        KSerializer kSerializerD;
        KSerializer kSerializerG;
        kr.d dVar;
        KClass clazz = or.e1.i(kType);
        boolean zIsMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        ArrayList types = new ArrayList(e0.l(arguments, 10));
        for (KTypeProjection kTypeProjection : arguments) {
            Intrinsics.checkNotNullParameter(kTypeProjection, "<this>");
            KType kType2 = kTypeProjection.f14694b;
            if (kType2 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.f14694b).toString());
            }
            types.add(kType2);
        }
        if (types.isEmpty()) {
            if (or.e1.h(clazz)) {
                SerializersModule.c(serializersModule, clazz);
            }
            o1 o1Var = kr.i.f14805a;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            if (zIsMarkedNullable) {
                kSerializerD = kr.i.f14806b.d(clazz);
            } else {
                kSerializerD = kr.i.f14805a.d(clazz);
                if (kSerializerD == null) {
                    kSerializerD = null;
                }
            }
        } else if (serializersModule.d()) {
            kSerializerD = null;
        } else {
            o1 o1Var2 = kr.i.f14805a;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(types, "types");
            Object objI = !zIsMarkedNullable ? kr.i.f14807c.i(clazz, types) : kr.i.f14808d.i(clazz, types);
            q qVar = kotlin.Result.f14614e;
            if (objI instanceof r) {
                objI = null;
            }
            kSerializerD = (KSerializer) objI;
        }
        if (kSerializerD != null) {
            return kSerializerD;
        }
        if (types.isEmpty()) {
            kSerializerG = ls.d.G(clazz);
            if (kSerializerG == null) {
                SerializersModule.c(serializersModule, clazz);
                if (or.e1.h(clazz)) {
                    dVar = new kr.d(clazz);
                    kSerializerG = dVar;
                } else {
                    kSerializerG = null;
                }
            }
            if (kSerializerG != null) {
                if (zIsMarkedNullable) {
                    return com.facebook.imagepipeline.nativecode.b.p(kSerializerG);
                }
                Intrinsics.checkNotNull(kSerializerG, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
                return kSerializerG;
            }
        } else {
            ArrayList arrayListH = ls.d.H(serializersModule, types, z5);
            if (arrayListH != null) {
                KSerializer kSerializerU = ls.d.u(clazz, arrayListH, new com.facebook.react.uimanager.a(2, types));
                if (kSerializerU == null) {
                    serializersModule.b(clazz, arrayListH);
                    if (or.e1.h(clazz)) {
                        dVar = new kr.d(clazz);
                        kSerializerG = dVar;
                    } else {
                        kSerializerG = null;
                    }
                } else {
                    kSerializerG = kSerializerU;
                }
                if (kSerializerG != null) {
                    if (zIsMarkedNullable) {
                        return com.facebook.imagepipeline.nativecode.b.p(kSerializerG);
                    }
                    Intrinsics.checkNotNull(kSerializerG, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
                    return kSerializerG;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(Drawable drawable, Drawable.Callback callback, TransformCallback transformCallback) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        p pVar = drawable instanceof p ? (p) drawable : null;
        if (pVar != null) {
            pVar.setTransformCallback(transformCallback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
      0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader K() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        if (f15755a == null) {
            Thread thread2 = f15756b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f15756b.getContextClassLoader();
                    } catch (SecurityException e11) {
                        String message = e11.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message);
                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                f15755a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i7 = 0;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i10];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i7 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i7];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i7++;
                                }
                                if (thread == null) {
                                    try {
                                        e eVar = new e(threadGroup, "GmsDynamite");
                                        try {
                                            eVar.setContextClassLoader(null);
                                            eVar.start();
                                            thread = eVar;
                                        } catch (SecurityException e12) {
                                            e10 = e12;
                                            thread = eVar;
                                            String message2 = e10.getMessage();
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb3.append("Failed to enumerate thread/threadgroup ");
                                            sb3.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb3.toString());
                                        }
                                    } catch (SecurityException e13) {
                                        e10 = e13;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (SecurityException e14) {
                            e10 = e14;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                f15756b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f15756b.getContextClassLoader();
                    }
                }
                f15755a = contextClassLoader;
            }
        }
        return f15755a;
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 12 || i7 == 23 || i7 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 12 || i7 == 23 || i7 == 25) ? 2 : 3];
        switch (i7) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i7 == 12) {
            objArr[1] = "createSetter";
        } else if (i7 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i7 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i7) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 12 && i7 != 23 && i7 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final rq.a b(z type) {
        rq.d dVar;
        Object objE;
        rq.d dVar2;
        Intrinsics.checkNotNullParameter(type, "type");
        if (lq.c.k(type)) {
            rq.a aVarB = b(lq.c.l(type));
            rq.a aVarB2 = b(lq.c.E(type));
            return new rq.a(lq.c.h(lq.c.e(lq.c.l((z) aVarB.f19541a), lq.c.E((z) aVarB2.f19541a)), type), lq.c.h(lq.c.e(lq.c.l((z) aVarB.f19542b), lq.c.E((z) aVarB2.f19542b)), type));
        }
        q0 q0VarR0 = type.r0();
        Intrinsics.checkNotNullParameter(type, "<this>");
        boolean z5 = true;
        if (type.r0() instanceof yp.b) {
            Intrinsics.checkNotNull(q0VarR0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            t0 t0VarA = ((yp.b) q0VarR0).a();
            z zVarB = t0VarA.b();
            Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
            z zVarH = b1.h(zVarB, type.t0());
            Intrinsics.checkNotNullExpressionValue(zVarH, "makeNullableIfNeeded(...)");
            int iOrdinal = t0VarA.a().ordinal();
            if (iOrdinal == 1) {
                return new rq.a(zVarH, c9.a.o(type).p());
            }
            if (iOrdinal != 2) {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + t0VarA);
            }
            d0 d0VarO = c9.a.o(type).o();
            Intrinsics.checkNotNullExpressionValue(d0VarO, "getNothingType(...)");
            z zVarH2 = b1.h(d0VarO, type.t0());
            Intrinsics.checkNotNullExpressionValue(zVarH2, "makeNullableIfNeeded(...)");
            return new rq.a(zVarH2, zVarH);
        }
        if (type.l0().isEmpty() || type.l0().size() != q0VarR0.getParameters().size()) {
            return new rq.a(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listL0 = type.l0();
        List parameters = q0VarR0.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        for (Pair pair : CollectionsKt.n0(listL0, parameters)) {
            t0 t0Var = (t0) pair.f14612d;
            r0 r0Var = (r0) pair.f14613e;
            Intrinsics.checkNotNull(r0Var);
            e1 variance = r0Var.getVariance();
            if (variance == null) {
                y0.a(35);
                throw null;
            }
            if (t0Var == null) {
                y0.a(36);
                throw null;
            }
            y0 y0Var = y0.f15267b;
            int iOrdinal2 = (t0Var.c() ? e1.OUT_VARIANCE : y0.b(variance, t0Var.a())).ordinal();
            if (iOrdinal2 == 0) {
                z zVarB2 = t0Var.b();
                Intrinsics.checkNotNullExpressionValue(zVarB2, "getType(...)");
                z zVarB3 = t0Var.b();
                Intrinsics.checkNotNullExpressionValue(zVarB3, "getType(...)");
                dVar2 = new rq.d(r0Var, zVarB2, zVarB3);
            } else if (iOrdinal2 == 1) {
                z zVarB4 = t0Var.b();
                Intrinsics.checkNotNullExpressionValue(zVarB4, "getType(...)");
                d0 d0VarP = bq.e.e(r0Var).p();
                Intrinsics.checkNotNullExpressionValue(d0VarP, "getNullableAnyType(...)");
                dVar2 = new rq.d(r0Var, zVarB4, d0VarP);
            } else {
                if (iOrdinal2 != 2) {
                    throw new rn.n();
                }
                d0 d0VarO2 = bq.e.e(r0Var).o();
                Intrinsics.checkNotNullExpressionValue(d0VarO2, "getNothingType(...)");
                z zVarB5 = t0Var.b();
                Intrinsics.checkNotNullExpressionValue(zVarB5, "getType(...)");
                dVar2 = new rq.d(r0Var, d0VarO2, zVarB5);
            }
            if (t0Var.c()) {
                arrayList.add(dVar2);
                arrayList2.add(dVar2);
            } else {
                rq.a aVarB3 = b(dVar2.f19545b);
                z zVar = (z) aVarB3.f19541a;
                z zVar2 = (z) aVarB3.f19542b;
                rq.a aVarB4 = b(dVar2.f19546c);
                z zVar3 = (z) aVarB4.f19541a;
                z zVar4 = (z) aVarB4.f19542b;
                r0 r0Var2 = dVar2.f19544a;
                rq.d dVar3 = new rq.d(r0Var2, zVar2, zVar3);
                rq.d dVar4 = new rq.d(r0Var2, zVar, zVar4);
                arrayList.add(dVar3);
                arrayList2.add(dVar4);
            }
        }
        if (arrayList.isEmpty()) {
            z5 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z5 = false;
                break;
            }
            dVar = (rq.d) it.next();
            dVar.getClass();
        } while (mq.d.f16016a.b(dVar.f19545b, dVar.f19546c));
        if (z5) {
            objE = c9.a.o(type).o();
            Intrinsics.checkNotNullExpressionValue(objE, "getNothingType(...)");
        } else {
            objE = E(type, arrayList);
        }
        return new rq.a(objE, E(type, arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(ProducerScope producerScope, Function0 function0, xn.c cVar) {
        s frame;
        if (cVar instanceof s) {
            frame = (s) cVar;
            int i7 = frame.f7393v;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f7393v = i7 - Integer.MIN_VALUE;
            } else {
                frame = new s(cVar);
            }
        } else {
            frame = new s(cVar);
        }
        Object obj = frame.f7392i;
        wn.a aVar = wn.a.f22354d;
        int i10 = frame.f7393v;
        try {
            if (i10 == 0) {
                ib.a.L(obj);
                if (frame.getContext().l(w.f2975e) != producerScope) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                frame.f7390d = producerScope;
                frame.f7391e = function0;
                frame.f7393v = 1;
                k kVar = new k(1, wn.f.b(frame));
                kVar.t();
                producerScope.a(new com.margelo.nitro.playagerangedeclaration.c(kVar, 1));
                Object objR = kVar.r();
                if (objR == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = frame.f7391e;
                ib.a.L(obj);
            }
            function0.invoke();
            return Unit.f14616a;
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
    }

    public static final void d(int i7, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.charAt(i7) == '-') {
            return;
        }
        StringBuilder sbS = a3.e.s(i7, "Expected '-' (hyphen) at index ", ", but was '");
        sbS.append(str.charAt(i7));
        sbS.append('\'');
        throw new IllegalArgumentException(sbS.toString().toString());
    }

    public static final void e(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static o f(String debugName, List scopes) {
        eq.n nVar;
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        vq.g scopes2 = new vq.g();
        Iterator it = scopes.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            nVar = eq.n.f8648b;
            if (!zHasNext) {
                break;
            }
            o oVar = (o) it.next();
            if (oVar != nVar) {
                if (oVar instanceof eq.a) {
                    kotlin.collections.i0.q(scopes2, ((eq.a) oVar).f8609c);
                } else {
                    scopes2.add(oVar);
                }
            }
        }
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(scopes2, "scopes");
        int i7 = scopes2.f21944d;
        if (i7 != 0) {
            return i7 != 1 ? new eq.a(debugName, (o[]) scopes2.toArray(new o[0])) : (o) scopes2.get(0);
        }
        return nVar;
    }

    public static ObjectAnimator g(View view, b0 b0Var, int i7, int i10, float f2, float f7, float f10, float f11, TimeInterpolator timeInterpolator, androidx.transition.b bVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) b0Var.f15373b.getTag(R.id.transition_position);
        if (iArr != null) {
            f2 = (iArr[0] - i7) + translationX;
            f7 = (iArr[1] - i10) + translationY;
        }
        view.setTranslationX(f2);
        view.setTranslationY(f7);
        if (f2 == f10 && f7 == f11) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f2, f10), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f7, f11));
        c0 c0Var = new c0(view, b0Var.f15373b, translationX, translationY);
        bVar.a(c0Var);
        objectAnimatorOfPropertyValuesHolder.addListener(c0Var);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static t h(vo.b bVar, z zVar, up.e eVar, wo.h hVar, int i7) {
        if (hVar == null) {
            a(33);
            throw null;
        }
        if (zVar == null) {
            return null;
        }
        return new t(bVar, new fq.b(bVar, zVar, eVar), hVar, up.f.a(i7));
    }

    public static yo.i0 i(l0 l0Var, wo.h hVar) {
        if (l0Var != null) {
            return q(l0Var, hVar, true, l0Var.d());
        }
        a(13);
        throw null;
    }

    public static j0 j(l0 l0Var, wo.h hVar) {
        if (l0Var == null) {
            a(0);
            throw null;
        }
        n0 n0VarD = l0Var.d();
        if (n0VarD != null) {
            return r(l0Var, hVar, wo.g.f22379a, true, l0Var.getVisibility(), n0VarD);
        }
        a(6);
        throw null;
    }

    public static h0 k(yo.b bVar) {
        if (bVar == null) {
            a(26);
            throw null;
        }
        vo.z moduleDescriptor = xp.e.d(bVar);
        g3.a aVar = xp.o.f23016a;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        vo.f fVarO = mo.c0.o(moduleDescriptor, up.h.f21300w);
        if (fVarO == null) {
            return null;
        }
        y yVar = y.f21852e;
        ep.p pVar = vo.p.f21828e;
        up.e eVar = so.p.f20394b;
        n0 n0VarD = bVar.d();
        vo.c cVar = vo.c.f21795v;
        h0 h0VarC0 = h0.C0(bVar, yVar, pVar, false, eVar, cVar, n0VarD);
        yo.i0 i0Var = new yo.i0(h0VarC0, wo.g.f22379a, yVar, pVar, false, false, false, cVar, null, bVar.d());
        h0VarC0.F0(i0Var, null, null, null);
        lq.l0.f15225e.getClass();
        lq.l0 attributes = lq.l0.f15226i;
        q0 constructor = fVarO.n();
        List arguments = Collections.singletonList(new i0(bVar.j()));
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        d0 d0VarT = lq.c.t(arguments, attributes, constructor, false);
        List list = Collections.EMPTY_LIST;
        h0VarC0.I0(d0VarT, list, null, null, list);
        i0Var.E0(h0VarC0.getReturnType());
        return h0VarC0;
    }

    public static k0 l(yo.b bVar) {
        if (bVar == null) {
            a(24);
            throw null;
        }
        k0 k0VarM0 = k0.M0(bVar, so.p.f20395c, vo.c.f21795v, bVar.d());
        yo.q0 q0Var = new yo.q0(k0VarM0, null, 0, wo.g.f22379a, up.e.e("value"), bq.e.e(bVar).v(), false, false, false, null, bVar.d());
        List list = Collections.EMPTY_LIST;
        return k0VarM0.G0(null, null, list, list, Collections.singletonList(q0Var), bVar.j(), y.f21852e, vo.p.f21828e);
    }

    public static k0 m(yo.b bVar) {
        if (bVar == null) {
            a(22);
            throw null;
        }
        k0 k0VarM0 = k0.M0(bVar, so.p.f20393a, vo.c.f21795v, bVar.d());
        List list = Collections.EMPTY_LIST;
        so.i iVarE = bq.e.e(bVar);
        e1 e1Var = e1.INVARIANT;
        return k0VarM0.G0(null, null, list, list, list, iVarE.h(bVar.j()), y.f21852e, vo.p.f21828e);
    }

    public static t n(vo.b bVar, z zVar, wo.h hVar) {
        if (zVar == null) {
            return null;
        }
        return new t(bVar, new fq.c(bVar, zVar), hVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static fq.a o(String type, Bundle data) throws o1.q {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            switch (type.hashCode()) {
                case -1678407252:
                    if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        try {
                            Object obj = data.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            Intrinsics.checkNotNull(obj);
                            return obj instanceof byte[] ? new n1.n(new String((byte[]) obj, Charsets.UTF_8), data) : new n1.n((String) obj, data);
                        } catch (Exception unused) {
                            throw new r1.a();
                        }
                    }
                    throw new r1.a();
                case -1072734346:
                    if (type.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        String jsonString = data.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (jsonString == null) {
                            throw new o1.q("The device does not contain a restore credential.");
                        }
                        m mVar = new m("androidx.credentials.TYPE_RESTORE_CREDENTIAL", data);
                        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
                        if (jsonString.length() != 0) {
                            try {
                                new JSONObject(jsonString);
                                return mVar;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new r1.a();
                case -543568185:
                    if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        try {
                            String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            Intrinsics.checkNotNull(string);
                            Intrinsics.checkNotNull(string2);
                            return new m(1, string2, data);
                        } catch (Exception unused3) {
                            throw new r1.a();
                        }
                    }
                    throw new r1.a();
                case -95037569:
                    if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        try {
                            String string3 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            Intrinsics.checkNotNull(string3);
                            return new n1.t(string3, data);
                        } catch (Exception unused4) {
                            throw new r1.a();
                        }
                    }
                    throw new r1.a();
                default:
                    throw new r1.a();
            }
        } catch (r1.a unused5) {
            return new m(0, type, data);
        }
    }

    public static o1.d p(String type, String str) {
        Exception excA;
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            q1.a aVar = new q1.a(new p1.a(26), null);
            if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excA = mo.c0.a(new p1.a(0), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excA = mo.c0.a(new p1.a(1), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excA = mo.c0.a(new p1.a(2), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excA = mo.c0.a(new p1.a(3), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excA = mo.c0.a(new p1.a(4), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excA = mo.c0.a(new p1.a(5), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excA = mo.c0.a(new p1.a(6), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excA = mo.c0.a(new p1.a(7), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excA = mo.c0.a(new p1.a(8), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excA = mo.c0.a(new p1.a(9), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excA = mo.c0.a(new p1.a(10), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excA = mo.c0.a(new p1.a(11), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excA = mo.c0.a(new p1.a(12), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excA = mo.c0.a(new p1.a(13), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excA = mo.c0.a(new p1.a(14), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excA = mo.c0.a(new p1.a(15), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excA = mo.c0.a(new p1.a(16), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excA = mo.c0.a(new p1.a(17), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excA = mo.c0.a(new p1.a(18), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excA = mo.c0.a(new p1.a(19), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excA = mo.c0.a(new p1.a(20), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excA = mo.c0.a(new p1.a(21), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excA = mo.c0.a(new p1.a(22), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excA = mo.c0.a(new p1.a(23), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excA = mo.c0.a(new p1.a(24), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excA = mo.c0.a(new p1.a(25), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excA = mo.c0.a(new p1.a(26), str, aVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excA = mo.c0.a(new p1.a(27), str, aVar);
            } else {
                if (!Intrinsics.areEqual(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new r1.a();
                }
                excA = mo.c0.a(new p1.a(28), str, aVar);
            }
            return (o1.d) excA;
        } catch (r1.a unused) {
            return new o1.c(str, type);
        }
    }

    public static yo.i0 q(l0 l0Var, wo.h hVar, boolean z5, n0 n0Var) {
        if (l0Var == null) {
            a(17);
            throw null;
        }
        if (hVar == null) {
            a(18);
            throw null;
        }
        if (n0Var != null) {
            return new yo.i0(l0Var, hVar, l0Var.e(), l0Var.getVisibility(), z5, false, false, vo.c.f21792d, null, n0Var);
        }
        a(19);
        throw null;
    }

    public static j0 r(l0 l0Var, wo.h hVar, wo.h hVar2, boolean z5, ep.p pVar, n0 n0Var) {
        if (l0Var == null) {
            a(7);
            throw null;
        }
        if (hVar == null) {
            a(8);
            throw null;
        }
        if (hVar2 == null) {
            a(9);
            throw null;
        }
        if (pVar == null) {
            a(10);
            throw null;
        }
        if (n0Var == null) {
            a(11);
            throw null;
        }
        j0 j0Var = new j0(l0Var, hVar, l0Var.e(), pVar, z5, false, false, vo.c.f21792d, null, n0Var);
        j0Var.K = j0.D0(j0Var, l0Var.getType(), hVar2);
        return j0Var;
    }

    public static final void s(long j, byte[] dst, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i12 = 7 - i10;
        int i13 = 8 - i11;
        if (i13 > i12) {
            return;
        }
        while (true) {
            int i14 = kotlin.text.d.f14716a[(int) ((j >> (i12 << 3)) & 255)];
            int i15 = i7 + 1;
            dst[i7] = (byte) (i14 >> 8);
            i7 += 2;
            dst[i15] = (byte) i14;
            if (i12 == i13) {
                return;
            } else {
                i12--;
            }
        }
    }

    public static String t(KeyEvent.Callback callback) {
        if (callback == null) {
            return null;
        }
        String canonicalName = callback.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
    }

    public static Drawable u(Context context, int i7) {
        return n2.b().c(context, i7);
    }

    public static final KClass v(KType kType) {
        KClass kClassW;
        Intrinsics.checkNotNullParameter(kType, "<this>");
        mo.c classifier = kType.getClassifier();
        if (classifier != null && (kClassW = w(classifier)) != null) {
            return kClassW;
        }
        throw new a0("Cannot calculate JVM erasure for type: " + kType);
    }

    public static final KClass w(mo.c cVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof KClass) {
            return (KClass) cVar;
        }
        if (!(cVar instanceof mo.t)) {
            throw new a0("Cannot calculate JVM erasure for type: " + cVar);
        }
        List upperBounds = ((mo.t) cVar).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            KType kType = (KType) next;
            Intrinsics.checkNotNull(kType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            vo.i iVarG = ((q1) kType).f18132d.r0().g();
            vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
            if (fVar != null && fVar.c() != vo.g.f21809e && fVar.c() != vo.g.f21812w) {
                obj = next;
                break;
            }
        }
        KType kType2 = (KType) obj;
        if (kType2 == null) {
            kType2 = (KType) CollectionsKt.firstOrNull(upperBounds);
        }
        return kType2 != null ? v(kType2) : Reflection.getOrCreateKotlinClass(Object.class);
    }

    public static final vo.i x(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        l lVarG = lVar.g();
        if (lVarG == null || (lVar instanceof vo.e0)) {
            return null;
        }
        Intrinsics.checkNotNullParameter(lVarG, "<this>");
        if (!(lVarG.g() instanceof vo.e0)) {
            return x(lVarG);
        }
        if (lVarG instanceof vo.i) {
            return (vo.i) lVarG;
        }
        return null;
    }

    public static int y(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 4) {
            return 2;
        }
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 32) {
            return 5;
        }
        if (i7 == 64) {
            return 6;
        }
        if (i7 == 128) {
            return 7;
        }
        if (i7 == 256) {
            return 8;
        }
        if (i7 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(kk.b.h(i7, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean z(u uVar) {
        if (uVar.c() != vo.c.f21795v) {
            return false;
        }
        l lVarG = uVar.g();
        int i7 = xp.e.f22999a;
        return xp.e.n(lVarG, vo.g.f21810i);
    }
}
