package zs;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.z0;
import ar.g0;
import com.discord.R;
import com.facebook.cache.common.CacheKey;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.horcrux.svg.h0;
import com.horcrux.svg.k0;
import e2.s;
import gn.h;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.f6;
import io.sentry.protocol.a0;
import io.sentry.protocol.c0;
import io.sentry.protocol.u;
import io.sentry.util.c;
import io.sentry.w5;
import java.io.File;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.e0;
import je.w;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.v0;
import kotlin.collections.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import np.l;
import np.n;
import okhttp3.Headers;
import pc.p;
import pp.i0;
import s0.g;
import so.k;
import so.o;
import sq.e;
import up.b;
import up.d;
import v3.q;
import w3.m;
import wn.f;
import xq.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static float f24104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f24105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f24106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f24107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Path f24108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ArrayList f24109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static float f24110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static float f24111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static float f24112i;
    public static float j;
    public static float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static float f24113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f24114m;

    public static final ArrayList A(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!(key instanceof i8.a)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(key.b() ? key.c() : S(key));
                return arrayList;
            }
            ArrayList arrayList2 = ((i8.a) key).f11393a;
            Intrinsics.checkNotNullExpressionValue(arrayList2, "getCacheKeys(...)");
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = arrayList2.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                arrayList3.add(S((CacheKey) obj));
            }
            return arrayList3;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String C(e eVar, gp.e functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        if (eVar.a(functionDescriptor)) {
            return null;
        }
        return eVar.getDescription();
    }

    public static boolean F(SentryEvent sentryEvent, w5 w5Var) {
        return c.b(w5Var.getSerializer(), w5Var.getLogger(), sentryEvent) <= w5.MAX_EVENT_SIZE_BYTES;
    }

    public static void H(float f2, float f7) {
        T();
        f24110g = f2;
        f24112i = f2;
        f24111h = f7;
        j = f7;
        Path path = f24108e;
        float f10 = f24104a;
        path.lineTo(f2 * f10, f10 * f7);
        f24109f.add(new h0(4, new k0[]{new k0(f2, f7)}));
    }

    public static final long I(float f2, float f7) {
        return ((long) Float.floatToRawIntBits(f7)) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    public static final void J(Context context) {
        Map mapB;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            q.d().a(m.f22042a, "Migrating WorkDatabase to the no-backup directory");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            Intrinsics.checkNotNullExpressionValue(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            Intrinsics.checkNotNullParameter(context, "context");
            File file = new File(w3.a.f22004a.a(context), "androidx.work.workdb");
            String[] strArr = m.f22043b;
            int iA = v0.a(strArr.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            Pair pair = new Pair(databasePath2, file);
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            Intrinsics.checkNotNullParameter(pair, "pair");
            if (linkedHashMap.isEmpty()) {
                mapB = v0.b(pair);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                mapB = linkedHashMap2;
            }
            for (Map.Entry entry : mapB.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        q.d().g(m.f22042a, "Over-writing contents of " + file3);
                    }
                    q.d().a(m.f22042a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static void K(float f2, float f7) {
        f24110g = f2;
        f24112i = f2;
        k = f2;
        f24111h = f7;
        j = f7;
        f24113l = f7;
        Path path = f24108e;
        float f10 = f24104a;
        path.moveTo(f2 * f10, f10 * f7);
        f24109f.add(new h0(3, new k0[]{new k0(f2, f7)}));
    }

    public static Headers L(String... namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        if (namesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) namesAndValues.clone();
        int length = strArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            String str = strArr[i10];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i10] = StringsKt.b0(str).toString();
            i10 = i11;
        }
        int iA = zn.c.a(0, strArr.length - 1, 2);
        if (iA >= 0) {
            while (true) {
                int i12 = i7 + 2;
                String str2 = strArr[i7];
                String str3 = strArr[i7 + 1];
                m(str2);
                n(str3, str2);
                if (i7 == iA) {
                    break;
                }
                i7 = i12;
            }
        }
        return new Headers(strArr);
    }

    public static boolean M() {
        W();
        char cCharAt = f24107d.charAt(f24105b);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f24105b), f24107d));
        }
        int i7 = f24105b + 1;
        f24105b = i7;
        if (i7 < f24106c && f24107d.charAt(i7) == ',') {
            f24105b++;
        }
        W();
        return cCharAt == '1';
    }

    public static float N() {
        int i7;
        char cCharAt;
        if (f24105b == f24106c) {
            throw new Error(g.e("Unexpected end (s=", f24107d, ")"));
        }
        W();
        int i10 = f24105b;
        if (i10 == f24106c) {
            throw new Error(g.e("Unexpected end (s=", f24107d, ")"));
        }
        char cCharAt2 = f24107d.charAt(i10);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i11 = f24105b + 1;
            f24105b = i11;
            cCharAt2 = f24107d.charAt(i11);
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            V();
            int i12 = f24105b;
            if (i12 < f24106c) {
                cCharAt2 = f24107d.charAt(i12);
            }
        } else if (cCharAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt2), Integer.valueOf(f24105b), f24107d));
        }
        if (cCharAt2 == '.') {
            f24105b++;
            V();
            int i13 = f24105b;
            if (i13 < f24106c) {
                cCharAt2 = f24107d.charAt(i13);
            }
        }
        if ((cCharAt2 == 'e' || cCharAt2 == 'E') && (i7 = f24105b + 1) < f24106c && (cCharAt = f24107d.charAt(i7)) != 'm' && cCharAt != 'x') {
            int i14 = f24105b + 1;
            f24105b = i14;
            char cCharAt3 = f24107d.charAt(i14);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                f24105b++;
                V();
            } else {
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt3), Integer.valueOf(f24105b), f24107d));
                }
                V();
            }
        }
        String strSubstring = f24107d.substring(i10, f24105b);
        float f2 = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", strSubstring, Integer.valueOf(i10), Integer.valueOf(f24105b), f24107d));
        }
        W();
        int i15 = f24105b;
        if (i15 < f24106c && f24107d.charAt(i15) == ',') {
            f24105b++;
        }
        return f2;
    }

    public static void O(n nVar, Annotation annotation) {
        Class clsB = h.B(h.z(annotation));
        l lVarE = nVar.e(bp.c.a(clsB), new ap.a(annotation));
        if (lVarE != null) {
            P(lVarE, annotation, clsB);
        }
    }

    public static void P(l lVar, Annotation annotation, Class cls) {
        Iterator it = ArrayIteratorKt.iterator(cls.getDeclaredMethods());
        while (it.hasNext()) {
            Method method = (Method) it.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                Intrinsics.checkNotNull(objInvoke);
                up.e eVarE = up.e.e(method.getName());
                Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
                Class<?> enclosingClass = objInvoke.getClass();
                if (Intrinsics.areEqual(enclosingClass, Class.class)) {
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
                    lVar.K(eVarE, o((Class) objInvoke));
                } else if (ap.c.f2858a.contains(enclosingClass)) {
                    lVar.M(eVarE, objInvoke);
                } else if (bp.c.e(enclosingClass)) {
                    if (!enclosingClass.isEnum()) {
                        enclosingClass = enclosingClass.getEnclosingClass();
                    }
                    Intrinsics.checkNotNull(enclosingClass);
                    b bVarA = bp.c.a(enclosingClass);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Enum<*>");
                    up.e eVarE2 = up.e.e(((Enum) objInvoke).name());
                    Intrinsics.checkNotNullExpressionValue(eVarE2, "identifier(...)");
                    lVar.G(eVarE, bVarA, eVarE2);
                } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                    Class<?>[] interfaces = enclosingClass.getInterfaces();
                    Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                    Class cls2 = (Class) y.D(interfaces);
                    Intrinsics.checkNotNull(cls2);
                    l lVarF = lVar.F(bp.c.a(cls2), eVarE);
                    if (lVarF != null) {
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Annotation");
                        P(lVarF, (Annotation) objInvoke, cls2);
                    }
                } else {
                    if (!enclosingClass.isArray()) {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                    }
                    np.m mVarM = lVar.m(eVarE);
                    if (mVarM != null) {
                        Class<?> componentType = enclosingClass.getComponentType();
                        int i7 = 0;
                        if (componentType.isEnum()) {
                            Intrinsics.checkNotNull(componentType);
                            b bVarA2 = bp.c.a(componentType);
                            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                            Object[] objArr = (Object[]) objInvoke;
                            int length = objArr.length;
                            while (i7 < length) {
                                Object obj = objArr[i7];
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                up.e eVarE3 = up.e.e(((Enum) obj).name());
                                Intrinsics.checkNotNullExpressionValue(eVarE3, "identifier(...)");
                                mVarM.B(bVarA2, eVarE3);
                                i7++;
                            }
                        } else if (Intrinsics.areEqual(componentType, Class.class)) {
                            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                            Object[] objArr2 = (Object[]) objInvoke;
                            int length2 = objArr2.length;
                            while (i7 < length2) {
                                Object obj2 = objArr2[i7];
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                mVarM.r0(o((Class) obj2));
                                i7++;
                            }
                        } else if (Annotation.class.isAssignableFrom(componentType)) {
                            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                            Object[] objArr3 = (Object[]) objInvoke;
                            int length3 = objArr3.length;
                            while (i7 < length3) {
                                Object obj3 = objArr3[i7];
                                Intrinsics.checkNotNull(componentType);
                                l lVarE0 = mVarM.e0(bp.c.a(componentType));
                                if (lVarE0 != null) {
                                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                    P(lVarE0, (Annotation) obj3, componentType);
                                }
                                i7++;
                            }
                        } else {
                            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                            Object[] objArr4 = (Object[]) objInvoke;
                            int length4 = objArr4.length;
                            while (i7 < length4) {
                                mVarM.K(objArr4[i7]);
                                i7++;
                            }
                        }
                        mVarM.i();
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        lVar.i();
    }

    public static void Q(float f2, float f7, float f10, float f11) {
        f24112i = f2;
        j = f7;
        float f12 = f2 * 2.0f;
        float f13 = f7 * 2.0f;
        q((f24110g + f12) / 3.0f, (f24111h + f13) / 3.0f, (f10 + f12) / 3.0f, (f11 + f13) / 3.0f, f10, f11);
    }

    public static int R(int i7, w wVar) {
        switch (i7) {
            case 1:
                return JfifUtil.MARKER_SOFn;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return wVar.u() + 1;
            case 7:
                return wVar.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER << (i7 - 8);
            default:
                return -1;
        }
    }

    public static String S(CacheKey cacheKey) {
        String strC = cacheKey.c();
        Intrinsics.checkNotNullExpressionValue(strC, "getUriString(...)");
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        byte[] bytes = strC.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "makeSHA1HashBase64(...)");
            return strEncodeToString;
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void T() {
        if (f24114m) {
            return;
        }
        k = f24110g;
        f24113l = f24111h;
        f24114m = true;
    }

    public static void V() {
        while (true) {
            int i7 = f24105b;
            if (i7 >= f24106c || !Character.isDigit(f24107d.charAt(i7))) {
                return;
            } else {
                f24105b++;
            }
        }
    }

    public static void W() {
        while (true) {
            int i7 = f24105b;
            if (i7 >= f24106c || !Character.isWhitespace(f24107d.charAt(i7))) {
                return;
            } else {
                f24105b++;
            }
        }
    }

    public static final void X(Function2 function2, ar.a aVar, ar.a aVar2) {
        try {
            Continuation continuationB = f.b(f.a(aVar, aVar2, function2));
            rn.q qVar = Result.f14614e;
            fr.h.f(Unit.f14616a, continuationB);
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof g0) {
                th = ((g0) th).f2914d;
            }
            rn.q qVar2 = Result.f14614e;
            aVar2.resumeWith(ib.a.o(th));
            throw th;
        }
    }

    public static up.c Y(up.e shortName) {
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        up.e eVar = d.f21264e;
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        String strB = shortName.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        return new up.c(new d(strB, up.c.f21261c.f21262a, shortName));
    }

    public static void Z(SentryEvent sentryEvent, w5 w5Var) {
        ArrayList arrayListD = sentryEvent.d();
        if (arrayListD != null) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                a0 a0Var = ((u) it.next()).f13052w;
                if (a0Var != null) {
                    a0(a0Var, sentryEvent, w5Var, "Truncated exception stack frames of event %s");
                }
            }
        }
        f6 f6Var = sentryEvent.P;
        ArrayList arrayList = f6Var != null ? f6Var.f12677a : null;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a0 a0Var2 = ((c0) it2.next()).F;
                if (a0Var2 != null) {
                    a0(a0Var2, sentryEvent, w5Var, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    public static Headers a(Map headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(headers, "<this>");
        String[] strArr = new String[headers.size() * 2];
        int i7 = 0;
        for (Map.Entry entry : headers.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = StringsKt.b0(str).toString();
            String string2 = StringsKt.b0(str2).toString();
            m(string);
            n(string2, string);
            strArr[i7] = string;
            strArr[i7 + 1] = string2;
            i7 += 2;
        }
        return new Headers(strArr);
    }

    public static void a0(a0 a0Var, SentryEvent sentryEvent, w5 w5Var, String str) {
        List list = a0Var.f12914d;
        if (list == null || list.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(list.subList(0, androidx.recyclerview.widget.h0.DEFAULT_SWIPE_ANIMATION_DURATION));
        arrayList.addAll(list.subList(list.size() - androidx.recyclerview.widget.h0.DEFAULT_SWIPE_ANIMATION_DURATION, list.size()));
        a0Var.f12914d = arrayList;
        w5Var.getLogger().q(SentryLevel.DEBUG, str, sentryEvent.f12670d);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0065->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    public static final Object b(List list, s sVar, xn.c cVar) throws Throwable {
        e2.c cVar2;
        List list2;
        Ref.ObjectRef objectRef;
        Iterator it;
        Throwable th2;
        Function1 function1;
        if (cVar instanceof e2.c) {
            cVar2 = (e2.c) cVar;
            int i7 = cVar2.f7860v;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                cVar2.f7860v = i7 - Integer.MIN_VALUE;
            } else {
                cVar2 = new e2.c(cVar);
            }
        } else {
            cVar2 = new e2.c(cVar);
        }
        Object obj = cVar2.f7859i;
        Object obj2 = wn.a.f22354d;
        int i10 = cVar2.f7860v;
        if (i10 != 0) {
            if (i10 == 1) {
                list2 = (List) cVar2.f7857d;
                ib.a.L(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = cVar2.f7858e;
                objectRef = (Ref.ObjectRef) cVar2.f7857d;
                try {
                    ib.a.L(obj);
                } catch (Throwable th3) {
                    T t5 = objectRef.element;
                    if (t5 == 0) {
                        objectRef.element = th3;
                    } else {
                        Intrinsics.checkNotNull(t5);
                        rn.f.a((Throwable) objectRef.element, th3);
                    }
                }
            }
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                cVar2.f7857d = objectRef;
                cVar2.f7858e = it;
                cVar2.f7860v = 2;
                if (function1.invoke(cVar2) == obj2) {
                    return obj2;
                }
            }
            th2 = (Throwable) objectRef.element;
            if (th2 == null) {
                return Unit.f14616a;
            }
            throw th2;
        }
        ib.a.L(obj);
        ArrayList arrayList = new ArrayList();
        e2.d dVar = new e2.d(list, arrayList, null);
        cVar2.f7857d = arrayList;
        cVar2.f7860v = 1;
        if (sVar.a(dVar, cVar2) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        objectRef = new Ref.ObjectRef();
        it = list2.iterator();
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            cVar2.f7857d = objectRef;
            cVar2.f7858e = it;
            cVar2.f7860v = 2;
            if (function1.invoke(cVar2) == obj2) {
                return obj2;
            }
        }
        th2 = (Throwable) objectRef.element;
        if (th2 == null) {
            return Unit.f14616a;
        }
        throw th2;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01d0 A[LOOP:0: B:56:0x01ce->B:57:0x01d0, LOOP_END] */
    public static void c(float f2, float f7, float f10, boolean z5, boolean z6, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        double d6;
        int iCeil;
        float f16;
        float fTan;
        float fCos;
        float fSin;
        int i7;
        float f17 = f24110g;
        float f18 = f24111h;
        if (f7 == 0.0f) {
            f13 = f2 == 0.0f ? f12 - f18 : f2;
        } else {
            f13 = f7;
        }
        float fAbs = Math.abs(f13);
        float fAbs2 = Math.abs(f2 == 0.0f ? f11 - f17 : f2);
        if (fAbs2 == 0.0f || fAbs == 0.0f || (f11 == f17 && f12 == f18)) {
            H(f11, f12);
            return;
        }
        float radians = (float) Math.toRadians(f10);
        double d7 = radians;
        float fCos2 = (float) Math.cos(d7);
        float fSin2 = (float) Math.sin(d7);
        float f19 = f11 - f17;
        float f20 = f12 - f18;
        float f21 = ((fSin2 * f20) / 2.0f) + ((fCos2 * f19) / 2.0f);
        float f22 = -fSin2;
        float f23 = ((fCos2 * f20) / 2.0f) + ((f22 * f19) / 2.0f);
        float f24 = fAbs2 * fAbs2;
        float f25 = f24 * fAbs * fAbs;
        float f26 = fAbs * fAbs * f21 * f21;
        float f27 = f24 * f23 * f23;
        float f28 = (f25 - f27) - f26;
        if (f28 < 0.0f) {
            float fSqrt = (float) Math.sqrt(1.0f - (f28 / f25));
            fAbs2 *= fSqrt;
            fAbs *= fSqrt;
            f15 = f19 / 2.0f;
            f14 = f20 / 2.0f;
        } else {
            float fSqrt2 = (float) Math.sqrt(f28 / (f27 + f26));
            if (z5 == z6) {
                fSqrt2 = -fSqrt2;
            }
            float f29 = (((-fSqrt2) * f23) * fAbs2) / fAbs;
            float f30 = ((fSqrt2 * f21) * fAbs) / fAbs2;
            float f31 = (fCos2 * f29) - (fSin2 * f30);
            f14 = (f20 / 2.0f) + (f30 * fCos2) + (f29 * fSin2);
            f15 = (f19 / 2.0f) + f31;
        }
        float f32 = fCos2 / fAbs2;
        float f33 = fSin2 / fAbs2;
        float f34 = f22 / fAbs;
        float f35 = fCos2 / fAbs;
        float f36 = -f15;
        float f37 = -f14;
        float f38 = f15;
        float f39 = f14;
        float fAtan2 = (float) Math.atan2((f35 * f37) + (f34 * f36), (f33 * f37) + (f36 * f32));
        float f40 = f19 - f38;
        float f41 = f20 - f39;
        float fAtan3 = (float) Math.atan2((f35 * f41) + (f34 * f40), (f33 * f41) + (f32 * f40));
        float f42 = f38 + f17;
        float f43 = f39 + f18;
        float f44 = f19 + f17;
        float f45 = f20 + f18;
        T();
        f24112i = f44;
        f24110g = f44;
        j = f45;
        f24111h = f45;
        if (fAbs2 == fAbs && radians == 0) {
            float degrees = (float) Math.toDegrees(fAtan2);
            float fAbs3 = Math.abs((degrees - ((float) Math.toDegrees(fAtan3))) % 360.0f);
            if (!z5 ? fAbs3 > 180.0f : fAbs3 < 180.0f) {
                fAbs3 = 360.0f - fAbs3;
            }
            if (!z6) {
                fAbs3 = -fAbs3;
            }
            float f46 = f24104a;
            f24108e.arcTo(new RectF((f42 - fAbs2) * f46, (f43 - fAbs2) * f46, (f42 + fAbs2) * f46, (f43 + fAbs2) * f46), degrees, fAbs3);
            f24109f.add(new h0(1, new k0[]{new k0(f44, f45)}));
            return;
        }
        float fCos3 = (float) Math.cos(d7);
        float fSin3 = (float) Math.sin(d7);
        float f47 = fCos3 * fAbs2;
        float f48 = (-fSin3) * fAbs;
        float f49 = fSin3 * fAbs2;
        float f50 = fCos3 * fAbs;
        float f51 = fAtan3 - fAtan2;
        if (f51 >= r4 || !z6) {
            if (f51 > r4 && !z6) {
                d6 = ((double) f51) - 6.283185307179586d;
            }
            double dPow = Math.pow(10.0d, 4.0d);
            iCeil = (int) Math.ceil(Math.abs(Math.round((((double) f51) / 1.5707963267948966d) * dPow) / dPow));
            f16 = f51 / iCeil;
            fTan = (float) (Math.tan(f16 / 4.0f) * 1.3333333333333333d);
            double d8 = fAtan2;
            fCos = (float) Math.cos(d8);
            fSin = (float) Math.sin(d8);
            i7 = 0;
            while (i7 < iCeil) {
                float f52 = fCos - (fTan * fSin);
                float f53 = (fCos * fTan) + fSin;
                float f54 = fAtan2 + f16;
                double d9 = f54;
                float f55 = f16;
                float fCos4 = (float) Math.cos(d9);
                fSin = (float) Math.sin(d9);
                float f56 = (fTan * fSin) + fCos4;
                float f57 = fSin - (fTan * fCos4);
                float f58 = (f48 * f53) + (f47 * f52) + f42;
                float f59 = (f53 * f50) + (f52 * f49) + f43;
                float f60 = (f48 * f57) + (f47 * f56) + f42;
                float f61 = (f57 * f50) + (f56 * f49) + f43;
                float f62 = (f48 * fSin) + (f47 * fCos4) + f42;
                float f63 = (f50 * fSin) + (f49 * fCos4) + f43;
                Path path = f24108e;
                float f64 = f24104a;
                path.cubicTo(f58 * f64, f59 * f64, f60 * f64, f61 * f64, f62 * f64, f63 * f64);
                f24109f.add(new h0(1, new k0[]{new k0(f58, f59), new k0(f60, f61), new k0(f62, f63)}));
                i7++;
                fAtan2 = f54;
                f50 = f50;
                f42 = f42;
                f43 = f43;
                f47 = f47;
                iCeil = iCeil;
                fTan = fTan;
                fCos = fCos4;
                f49 = f49;
                f16 = f55;
            }
        }
        d6 = ((double) f51) + 6.283185307179586d;
        f51 = (float) d6;
        double dPow2 = Math.pow(10.0d, 4.0d);
        iCeil = (int) Math.ceil(Math.abs(Math.round((((double) f51) / 1.5707963267948966d) * dPow2) / dPow2));
        f16 = f51 / iCeil;
        fTan = (float) (Math.tan(f16 / 4.0f) * 1.3333333333333333d);
        double d10 = fAtan2;
        fCos = (float) Math.cos(d10);
        fSin = (float) Math.sin(d10);
        i7 = 0;
        while (i7 < iCeil) {
            float f510 = fCos - (fTan * fSin);
            float f511 = (fCos * fTan) + fSin;
            float f512 = fAtan2 + f16;
            double d11 = f512;
            float f513 = f16;
            float fCos5 = (float) Math.cos(d11);
            fSin = (float) Math.sin(d11);
            float f514 = (fTan * fSin) + fCos5;
            float f515 = fSin - (fTan * fCos5);
            float f516 = (f48 * f511) + (f47 * f510) + f42;
            float f517 = (f511 * f50) + (f510 * f49) + f43;
            float f65 = (f48 * f515) + (f47 * f514) + f42;
            float f66 = (f515 * f50) + (f514 * f49) + f43;
            float f67 = (f48 * fSin) + (f47 * fCos5) + f42;
            float f68 = (f50 * fSin) + (f49 * fCos5) + f43;
            Path path2 = f24108e;
            float f69 = f24104a;
            path2.cubicTo(f516 * f69, f517 * f69, f65 * f69, f66 * f69, f67 * f69, f68 * f69);
            f24109f.add(new h0(1, new k0[]{new k0(f516, f517), new k0(f65, f66), new k0(f67, f68)}));
            i7++;
            fAtan2 = f512;
            f50 = f50;
            f42 = f42;
            f43 = f43;
            f47 = f47;
            iCeil = iCeil;
            fTan = fTan;
            fCos = fCos5;
            f49 = f49;
            f16 = f513;
        }
    }

    public static final Bundle f(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f14612d;
            Object obj = pair.f14613e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                f1.a.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                f1.a.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final void i(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        z0 block = new z0(view, null);
        Intrinsics.checkNotNullParameter(block, "block");
        j jVarA = xq.l.a(block);
        while (jVarA.hasNext()) {
            View view2 = (View) jVarA.next();
            c2.a aVar = (c2.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new c2.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f3421a;
            int iF = d0.f(arrayList);
            if (-1 < iF) {
                arrayList.get(iF).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static Object j(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean k(w wVar, p pVar, int i7, pc.n nVar) {
        long jV = wVar.v();
        long j5 = jV >>> 16;
        if (j5 != i7) {
            return false;
        }
        boolean z5 = (j5 & 1) == 1;
        int i10 = (int) ((jV >> 12) & 15);
        int i11 = (int) ((jV >> 8) & 15);
        int i12 = (int) ((jV >> 4) & 15);
        int i13 = (int) ((jV >> 1) & 7);
        boolean z6 = (jV & 1) == 1;
        if (i12 <= 7) {
            if (i12 != pVar.f17915g - 1) {
                return false;
            }
        } else if (i12 > 10 || pVar.f17915g != 2) {
            return false;
        }
        if (!(i13 == 0 || i13 == pVar.f17917i) || z6) {
            return false;
        }
        try {
            long jA = wVar.A();
            if (!z5) {
                jA *= (long) pVar.f17910b;
            }
            nVar.f17905a = jA;
            int iR = R(i10, wVar);
            if (iR == -1 || iR > pVar.f17910b) {
                return false;
            }
            int i14 = pVar.f17913e;
            if (i11 != 0) {
                if (i11 <= 11) {
                    if (i11 != pVar.f17914f) {
                        return false;
                    }
                } else if (i11 != 12) {
                    if (i11 > 14) {
                        return false;
                    }
                    int iZ = wVar.z();
                    if (i11 == 14) {
                        iZ *= 10;
                    }
                    if (iZ != i14) {
                        return false;
                    }
                } else if (wVar.u() * 1000 != i14) {
                    return false;
                }
            }
            int iU = wVar.u();
            int i15 = wVar.f13861b;
            byte[] bArr = wVar.f13860a;
            int i16 = i15 - 1;
            int i17 = 0;
            for (int i18 = wVar.f13861b; i18 < i16; i18++) {
                i17 = e0.f13800o[i17 ^ (bArr[i18] & 255)];
            }
            int i19 = e0.f13788a;
            return iU == i17;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void l(qo.g gVar, Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (a.a.j(gVar) == args.length) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Callable expects ");
        sb2.append(a.a.j(gVar));
        sb2.append(" arguments, but ");
        throw new IllegalArgumentException(kk.b.l(sb2, args.length, " were provided."));
    }

    public static void m(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            int i10 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(ds.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i7), str).toString());
            }
            i7 = i10;
        }
    }

    public static void n(String str, String str2) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            int i10 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(ds.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i7), str2), ds.b.p(str2) ? "" : Intrinsics.stringPlus(": ", str)).toString());
            }
            i7 = i10;
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    public static zp.f o(Class cls) {
        int i7 = 0;
        while (cls.isArray()) {
            i7++;
            cls = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(cls, "getComponentType(...)");
        }
        if (!cls.isPrimitive()) {
            b bVarA = bp.c.a(cls);
            String str = uo.d.f21197a;
            up.c fqName = bVarA.a();
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            b bVar = (b) uo.d.f21204h.get(fqName.f21262a);
            if (bVar != null) {
                bVarA = bVar;
            }
            return new zp.f(bVarA, i7);
        }
        if (Intrinsics.areEqual(cls, Void.TYPE)) {
            up.c topLevelFqName = o.f20368d.g();
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            return new zp.f(new b(topLevelFqName.b(), topLevelFqName.f21262a.f()), i7);
        }
        k kVarD = cq.c.b(cls.getName()).d();
        Intrinsics.checkNotNullExpressionValue(kVarD, "getPrimitiveType(...)");
        if (i7 > 0) {
            up.c topLevelFqName2 = (up.c) kVarD.f20355v.getValue();
            Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
            return new zp.f(new b(topLevelFqName2.b(), topLevelFqName2.f21262a.f()), i7 - 1);
        }
        up.c topLevelFqName3 = (up.c) kVarD.f20354i.getValue();
        Intrinsics.checkNotNullParameter(topLevelFqName3, "topLevelFqName");
        return new zp.f(new b(topLevelFqName3.b(), topLevelFqName3.f21262a.f()), i7);
    }

    public static k2.q p(Context context) {
        ProviderInfo providerInfo;
        i1.c cVar;
        ApplicationInfo applicationInfo;
        io.sentry.hints.j bVar = Build.VERSION.SDK_INT >= 28 ? new k2.b(10) : new io.sentry.hints.j(10);
        PackageManager packageManager = context.getPackageManager();
        yk.a.d(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            cVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrD = bVar.D(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrD) {
                    arrayList.add(signature.toByteArray());
                }
                cVar = new i1.c(Collections.singletonList(arrayList), str, str2, "emojicompat-emoji-font", null, null);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                cVar = null;
            }
        }
        if (cVar == null) {
            return null;
        }
        return new k2.q(new k2.p(context, cVar));
    }

    public static void q(float f2, float f7, float f10, float f11, float f12, float f13) {
        T();
        f24110g = f12;
        f24111h = f13;
        Path path = f24108e;
        float f14 = f24104a;
        path.cubicTo(f2 * f14, f7 * f14, f10 * f14, f11 * f14, f12 * f14, f14 * f13);
        f24109f.add(new h0(1, new k0[]{new k0(f2, f7), new k0(f10, f11), new k0(f12, f13)}));
    }

    public static final String s(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!(key instanceof i8.a)) {
                return S(key);
            }
            ArrayList arrayList = ((i8.a) key).f11393a;
            Intrinsics.checkNotNullExpressionValue(arrayList, "getCacheKeys(...)");
            Object obj = arrayList.get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return S((CacheKey) obj);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final np.p y(i0 proto, rp.f nameResolver, pf.b typeTable, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        vp.m propertySignature = sp.k.f20486d;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        sp.e eVar = (sp.e) m3.m.B(proto, propertySignature);
        if (eVar != null) {
            if (z5) {
                vp.g gVar = tp.g.f20880a;
                tp.d dVarB = tp.g.b(proto, nameResolver, typeTable, z7);
                if (dVarB != null) {
                    return android.support.v4.media.session.b.j(dVarB);
                }
            } else if (z6 && (eVar.f20449e & 2) == 2) {
                sp.c signature = eVar.f20451v;
                Intrinsics.checkNotNullExpressionValue(signature, "getSyntheticMethod(...)");
                Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
                Intrinsics.checkNotNullParameter(signature, "signature");
                String name = nameResolver.getString(signature.f20438i);
                String desc = nameResolver.getString(signature.f20439v);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(desc, "desc");
                return new np.p(kk.b.j(name, desc));
            }
        }
        return null;
    }

    public abstract int B();

    public abstract boolean D(float f2);

    public abstract boolean E(View view);

    public abstract boolean G(float f2, float f7);

    public abstract boolean U(View view, float f2);

    public abstract void b0(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i10);

    public ye.c d(Context context, Looper looper, af.c cVar, Object obj, ye.j jVar, ye.k kVar) {
        return e(context, looper, cVar, obj, (ze.m) jVar, (ze.m) kVar);
    }

    public ye.c e(Context context, Looper looper, af.c cVar, Object obj, ze.m mVar, ze.m mVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract int g(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float h(int i7);

    public abstract int r();

    public abstract int t();

    public abstract int u();

    public abstract int v();

    public abstract int w(View view);

    public abstract int x(CoordinatorLayout coordinatorLayout);
}
