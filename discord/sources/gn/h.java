package gn;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.UIManagerHelper;
import im.q;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.collections.y;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import v4.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f10142a;

    public h() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:138:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0144  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public static z9.c A(InputStream is2) throws IOException {
        int i7;
        boolean zV;
        boolean z5;
        z9.c cVar;
        z9.c cVar2;
        Intrinsics.checkNotNullParameter(is2, "is");
        z9.d dVar = (z9.d) z9.d.f23634d.getValue();
        dVar.getClass();
        Intrinsics.checkNotNullParameter(is2, "is");
        int i10 = dVar.f23635a;
        byte[] headerBytes = new byte[i10];
        if (is2.markSupported()) {
            try {
                is2.mark(i10);
                i7 = n8.i.i(is2, headerBytes, i10);
                is2.reset();
            } catch (Throwable th2) {
                is2.reset();
                throw th2;
            }
        } else {
            i7 = n8.i.i(is2, headerBytes, i10);
        }
        dVar.f23636b.getClass();
        Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
        boolean z6 = true;
        if (i7 >= 20) {
            byte[] bArr = w8.a.f22071b;
            if (w8.a.b(0, headerBytes, bArr)) {
                byte[] bArr2 = w8.a.f22072c;
                if (w8.a.b(8, headerBytes, bArr2)) {
                    if (i7 < 20 || !w8.a.b(0, headerBytes, bArr) || !w8.a.b(8, headerBytes, bArr2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (w8.a.b(12, headerBytes, w8.a.f22073d)) {
                        cVar = z9.b.f23623f;
                    } else if (w8.a.b(12, headerBytes, w8.a.f22074e)) {
                        cVar = z9.b.f23624g;
                    } else if (i7 >= 21) {
                        byte[] bArr3 = w8.a.f22075f;
                        if (w8.a.b(12, headerBytes, bArr3)) {
                            boolean zB = w8.a.b(12, headerBytes, bArr3);
                            boolean z7 = (headerBytes[20] & 2) == 2;
                            if (zB && z7) {
                                cVar = z9.b.j;
                            } else {
                                cVar = (w8.a.b(12, headerBytes, bArr3) && ((headerBytes[20] & 16) == 16)) ? z9.b.f23626i : z9.b.f23625h;
                            }
                        } else {
                            cVar = z9.c.f23631c;
                        }
                    } else {
                        cVar = z9.c.f23631c;
                    }
                }
            }
            if (Intrinsics.areEqual(cVar, z9.b.f23628m) && !dVar.f23637c) {
                cVar = z9.c.f23631c;
            }
            cVar2 = z9.c.f23631c;
            if (cVar != cVar2) {
                return cVar;
            }
            return cVar2;
        }
        boolean z10 = w8.a.f22070a;
        byte[] bArr4 = z9.a.f23601b;
        if (i7 < 3 || !ib.a.K(headerBytes, bArr4)) {
            byte[] bArr5 = z9.a.f23603d;
            if (i7 >= 8 && ib.a.K(headerBytes, bArr5)) {
                cVar = z9.b.f23619b;
            } else if (i7 >= 6 && (ib.a.K(headerBytes, z9.a.f23605f) || ib.a.K(headerBytes, z9.a.f23606g))) {
                cVar = z9.b.f23620c;
            } else {
                byte[] bArr6 = z9.a.f23607h;
                if (i7 < bArr6.length ? false : ib.a.K(headerBytes, bArr6)) {
                    cVar = z9.b.f23621d;
                } else {
                    byte[] bArr7 = z9.a.j;
                    if (i7 < bArr7.length ? false : ib.a.K(headerBytes, bArr7)) {
                        cVar = z9.b.f23622e;
                    } else {
                        if (i7 >= 12) {
                            if ((headerBytes.length < 4 ? -1 : ((headerBytes[1] & 255) << 16) | ((headerBytes[0] & 255) << 24) | ((headerBytes[2] & 255) << 8) | (headerBytes[3] & 255)) >= 8 && ib.a.v(4, headerBytes, z9.a.f23615r)) {
                                zV = ib.a.v(8, headerBytes, z9.a.f23616s);
                            } else {
                                zV = false;
                            }
                        } else {
                            zV = false;
                        }
                        if (zV) {
                            cVar = z9.b.f23629n;
                        } else {
                            if (i7 < 12 || headerBytes[3] < 8 || !ib.a.v(4, headerBytes, z9.a.f23609l)) {
                                z5 = false;
                                break;
                            }
                            byte[][] bArr8 = z9.a.f23610m;
                            int length = bArr8.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length) {
                                    z5 = false;
                                    break;
                                }
                                if (ib.a.v(8, headerBytes, bArr8[i11])) {
                                    z5 = true;
                                    break;
                                }
                                i11++;
                            }
                            if (z5) {
                                cVar = z9.b.k;
                            } else {
                                if (i7 >= 4 && ib.a.K(headerBytes, z9.a.f23614q)) {
                                    cVar = z9.b.f23628m;
                                } else {
                                    if (i7 < z9.a.f23613p || (!ib.a.K(headerBytes, z9.a.f23611n) && !ib.a.K(headerBytes, z9.a.f23612o))) {
                                        z6 = false;
                                    }
                                    cVar = z6 ? z9.b.f23627l : z9.c.f23631c;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            cVar = z9.b.f23618a;
        }
        if (Intrinsics.areEqual(cVar, z9.b.f23628m)) {
            cVar = z9.c.f23631c;
        }
        cVar2 = z9.c.f23631c;
        if (cVar != cVar2) {
            return cVar;
        }
        return cVar2;
    }

    public static final Class B(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class<?> jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        Intrinsics.checkNotNull(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class C(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class<?> jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (!jClass.isPrimitive()) {
            Intrinsics.checkNotNull(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    jClass = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    jClass = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    jClass = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    jClass = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    jClass = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    jClass = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    jClass = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    jClass = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    jClass = Short.class;
                }
                break;
        }
        Intrinsics.checkNotNull(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class D(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class<?> jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (jClass.isPrimitive()) {
            Intrinsics.checkNotNull(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final KClass E(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Reflection.getOrCreateKotlinClass(cls);
    }

    public static boolean F(vo.d callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        if (!ep.f.f8540d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (CollectionsKt.E(ep.f.f8539c, bq.e.c(callableMemberDescriptor)) && callableMemberDescriptor.L().isEmpty()) {
            return true;
        }
        if (!so.i.A(callableMemberDescriptor)) {
            return false;
        }
        Collection collectionH = callableMemberDescriptor.h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getOverriddenDescriptors(...)");
        Collection<vo.d> collection = collectionH;
        if (collection.isEmpty()) {
            return false;
        }
        for (vo.d dVar : collection) {
            Intrinsics.checkNotNull(dVar);
            if (F(dVar)) {
                return true;
            }
        }
        return false;
    }

    public static final Pair G(qm.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new Pair(event.getEventName(), w0.f(new Pair("registrationName", event.g())));
    }

    public static c5.o H(Context context) {
        c5.o oVar = new c5.o(new d5.c(new io.sentry.internal.debugmeta.c(context.getApplicationContext())), new e4.l(new ga.k()));
        c5.c cVar = oVar.f3513i;
        if (cVar != null) {
            cVar.f3482w = true;
            cVar.interrupt();
        }
        for (c5.h hVar : oVar.f3512h) {
            if (hVar != null) {
                hVar.f3495w = true;
                hVar.interrupt();
            }
        }
        c5.c cVar2 = new c5.c(oVar.f3507c, oVar.f3508d, oVar.f3509e, oVar.f3511g);
        oVar.f3513i = cVar2;
        cVar2.start();
        for (int i7 = 0; i7 < oVar.f3512h.length; i7++) {
            c5.h hVar2 = new c5.h(oVar.f3508d, oVar.f3510f, oVar.f3509e, oVar.f3511g);
            oVar.f3512h[i7] = hVar2;
            hVar2.start();
        }
        return oVar;
    }

    public static km.d I(im.f handler, int i7, int i10, int i11, lm.b dataBuilder, km.a eventHandlerType) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
        Intrinsics.checkNotNullParameter(eventHandlerType, "eventHandlerType");
        km.d dVar = (km.d) km.d.E.acquire();
        if (dVar == null) {
            dVar = new km.d();
            dVar.f14596v = 2;
        }
        View viewR = handler.r();
        dVar.init(UIManagerHelper.getSurfaceId(viewR), viewR.getId());
        dVar.f14593d = dataBuilder;
        dVar.f14594e = i7;
        dVar.f14595i = i10;
        dVar.f14596v = i11;
        dVar.f14597w = eventHandlerType;
        return dVar;
    }

    public static void J(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static r4.a K(w4.b bVar, l4.i iVar) {
        return new r4.a(0, p.a(bVar, iVar, 1.0f, v4.f.f21455e, false));
    }

    public static r4.b L(w4.a aVar, l4.i iVar, boolean z5) {
        return new r4.b(6, p.a(aVar, iVar, z5 ? x4.h.c() : 1.0f, v4.f.f21456i, false));
    }

    public static r4.a M(w4.b bVar, l4.i iVar, int i7) {
        o9.d dVar = new o9.d(10);
        dVar.f17185e = i7;
        ArrayList arrayListA = p.a(bVar, iVar, 1.0f, dVar, false);
        for (int i10 = 0; i10 < arrayListA.size(); i10++) {
            y4.a aVar = (y4.a) arrayListA.get(i10);
            s4.c cVar = (s4.c) aVar.f23194b;
            s4.c cVar2 = (s4.c) aVar.f23195c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f19721a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f19721a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f2 = Float.NaN;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length2; i12++) {
                        float f7 = fArr3[i12];
                        if (f7 != f2) {
                            fArr3[i11] = f7;
                            i11++;
                            f2 = fArr3[i12];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i11);
                    aVar = new y4.a(cVar.b(fArrCopyOfRange), cVar2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i10, aVar);
        }
        return new r4.a(1, arrayListA);
    }

    public static r4.a N(w4.a aVar, l4.i iVar) {
        return new r4.a(2, p.a(aVar, iVar, 1.0f, v4.f.f21457v, false));
    }

    public static r4.a O(w4.b bVar, l4.i iVar) {
        return new r4.a(3, p.a(bVar, iVar, x4.h.c(), v4.f.f21459x, true));
    }

    public static Boolean R(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (view != null) {
            return Boolean.valueOf(view.onTouchEvent(event));
        }
        return null;
    }

    public static void S(List recorded, q handler) {
        Intrinsics.checkNotNullParameter(recorded, "recorded");
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 7 || i7 == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 7 || i7 == 10) ? 2 : 3];
        switch (i7) {
            case 1:
            case 3:
            case 18:
            case 20:
                objArr[0] = "supertype";
                break;
            case 2:
            case 17:
            case 19:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 23:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 15:
                objArr[0] = "typeParameterVariance";
                break;
            case 16:
                objArr[0] = "typeArgumentVariance";
                break;
            case 21:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 22:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i7 == 7) {
            objArr[1] = "getOutType";
        } else if (i7 != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i7) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 17:
            case 18:
                objArr[2] = "isSubtypeOf";
                break;
            case 19:
            case 20:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 21:
            case 22:
            case 23:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 7 && i7 != 10) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static Object b(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void c(Parcel parcel, Bundle bundle) {
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
        }
    }

    public static float d(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final long e(int i7, int i10) {
        long j = (((long) i10) & 4294967295L) | (((long) i7) << 32);
        int i11 = m0.d.f15346b;
        return j;
    }

    public static float f(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static void g(int i7, int i10) {
        String strC;
        if (i7 < 0 || i7 >= i10) {
            if (i7 < 0) {
                strC = ib.a.c("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(kk.b.h(i10, "negative size: "));
                }
                strC = ib.a.c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static final String h(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        sb2.append(y.A(parameterTypes, "", "(", ")", po.b.J, 24));
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb2.append(bp.c.b(returnType));
        return sb2.toString();
    }

    public static void i(int i7, int i10, int i11) {
        String strT;
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            if (i7 < 0 || i7 > i11) {
                strT = t(i7, i11, "start index");
            } else {
                strT = (i10 < 0 || i10 > i11) ? t(i10, i11, "end index") : ib.a.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strT);
        }
    }

    public static boolean j(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return view.isPressed();
    }

    public static WritableMap n(lm.b dataBuilder, int i7, int i10) {
        Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
        WritableMap writableMapCreateMap = Arguments.createMap();
        dataBuilder.a(writableMapCreateMap);
        writableMapCreateMap.putInt("handlerTag", dataBuilder.f15105a);
        writableMapCreateMap.putInt("state", i7);
        writableMapCreateMap.putInt("oldState", i10);
        return writableMapCreateMap;
    }

    public static String t(int i7, int i10, String str) {
        if (i7 < 0) {
            return ib.a.c("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return ib.a.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(kk.b.h(i10, "negative size: "));
    }

    public static io.sentry.c u(io.sentry.c cVar, Boolean bool, Double d6, Double d7) {
        if (cVar == null) {
            cVar = new io.sentry.c();
        }
        if (cVar.f12505d == null) {
            Double d8 = cVar.f12504c;
            if (d8 != null) {
                d6 = d8;
            }
            Double dP = e4.f.p(d7, d6, bool);
            if (cVar.f12506e) {
                cVar.f12505d = dP;
            }
        }
        return cVar;
    }

    public static int v(int i7, int i10, float f2) {
        if (i7 == i10 || f2 <= 0.0f) {
            return i7;
        }
        if (f2 >= 1.0f) {
            return i10;
        }
        float f7 = ((i7 >> 24) & 255) / 255.0f;
        float f10 = ((i10 >> 24) & 255) / 255.0f;
        float fD = d(((i7 >> 16) & 255) / 255.0f);
        float fD2 = d(((i7 >> 8) & 255) / 255.0f);
        float fD3 = d((i7 & 255) / 255.0f);
        float fD4 = d(((i10 >> 16) & 255) / 255.0f);
        float fD5 = d(((i10 >> 8) & 255) / 255.0f);
        float fD6 = d((i10 & 255) / 255.0f);
        float fC = kk.b.c(f10, f7, f2, f7);
        float fC2 = kk.b.c(fD4, fD, f2, fD);
        float fC3 = kk.b.c(fD5, fD2, f2, fD2);
        float fC4 = kk.b.c(fD6, fD3, f2, fD3);
        float f11 = f(fC2) * 255.0f;
        float f12 = f(fC3) * 255.0f;
        return Math.round(f(fC4) * 255.0f) | (Math.round(f11) << 16) | (Math.round(fC * 255.0f) << 24) | (Math.round(f12) << 8);
    }

    public static final KClass z(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Intrinsics.checkNotNullExpressionValue(clsAnnotationType, "annotationType(...)");
        KClass kClassE = E(clsAnnotationType);
        Intrinsics.checkNotNull(kClassE, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return kClassE;
    }

    public abstract void P(hi.l lVar, hi.l lVar2);

    public abstract void Q(hi.l lVar, Thread thread);

    public abstract boolean k(hi.m mVar, hi.c cVar, hi.c cVar2);

    public abstract boolean l(hi.m mVar, Object obj, Object obj2);

    public abstract boolean m(hi.m mVar, hi.l lVar, hi.l lVar2);

    public abstract Typeface o(Context context, a1.f fVar, Resources resources, int i7);

    public abstract Typeface p(Context context, i1.h[] hVarArr, int i7);

    public Typeface q(Context context, List list, int i7) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface r(Context context, InputStream inputStream) {
        File fileU = ib.a.u(context);
        if (fileU == null) {
            return null;
        }
        try {
            if (ib.a.l(inputStream, fileU)) {
                return Typeface.createFromFile(fileU.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileU.delete();
        }
    }

    public Typeface s(Context context, Resources resources, int i7, String str, int i10) {
        File fileU = ib.a.u(context);
        if (fileU == null) {
            return null;
        }
        try {
            if (ib.a.k(fileU, resources, i7)) {
                return Typeface.createFromFile(fileU.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileU.delete();
        }
    }

    public i1.h w(i1.h[] hVarArr, int i7) {
        new i8.b(3);
        int i10 = (i7 & 1) == 0 ? ReactFontManager.TypefaceStyle.NORMAL : ReactFontManager.TypefaceStyle.BOLD;
        boolean z5 = (i7 & 2) != 0;
        i1.h hVar = null;
        int i11 = Integer.MAX_VALUE;
        for (i1.h hVar2 : hVarArr) {
            int iAbs = (Math.abs(hVar2.f11376c - i10) * 2) + (hVar2.f11377d == z5 ? 0 : 1);
            if (hVar == null || i11 > iAbs) {
                hVar = hVar2;
                i11 = iAbs;
            }
        }
        return hVar;
    }

    public abstract hi.c x(hi.m mVar);

    public abstract hi.l y(hi.m mVar);
}
