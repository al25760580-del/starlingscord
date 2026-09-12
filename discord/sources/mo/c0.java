package mo;

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.e1;
import androidx.core.view.f2;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okio.ByteString;
import po.a2;
import po.n1;
import vo.i0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static com.google.firebase.messaging.r f15938a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ScheduledExecutorService f15939b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f15940c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f15941d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f15942e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f15943f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f15944g = true;

    public static int A(int i7, int i10, int i11, int[] iArr) {
        while (i10 < i11) {
            if (iArr[i10] == i7) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static boolean C() {
        if (Build.VERSION.SDK_INT >= 29) {
            return l3.a.c();
        }
        try {
            if (f15941d == null) {
                f15940c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f15941d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f15941d.invoke(null, Long.valueOf(f15940c))).booleanValue();
        } catch (Exception e10) {
            x("isTagEnabled", e10);
            return false;
        }
    }

    public static String D(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ByteString byteString = ByteString.f17414v;
        return io.sentry.hints.j.z(url.f17327h).b("MD5").d();
    }

    public static int E(rs.p source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            long jI = source.i();
            String strW = source.w(LongCompanionObject.MAX_VALUE);
            if (jI >= 0 && jI <= 2147483647L && strW.length() <= 0) {
                return (int) jI;
            }
            throw new IOException("expected an int but was \"" + jI + strW + '\"');
        } catch (NumberFormatException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public static Insets F(com.swmansion.rnscreens.e eVar, int i7, WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (windowInsets == null) {
            Insets NONE = Insets.f1555e;
            Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
            return NONE;
        }
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(null, windowInsets);
        f2 f2Var = windowInsetsCompatG.f1605a;
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatG, "toWindowInsetsCompat(...)");
        Insets insetsF = f2Var.f(i7);
        Intrinsics.checkNotNull(insetsF);
        return insetsF;
    }

    public static int G(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final String M(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append('@');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        sb2.append(str);
        return sb2.toString();
    }

    public static boolean N(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i7 = 0; i7 < bArr2.length; i7++) {
                if (bArr[i7] == bArr2[i7]) {
                }
            }
            return true;
        }
        return false;
    }

    public static void O(ViewGroup viewGroup, boolean z5) {
        if (Build.VERSION.SDK_INT >= 29) {
            e1.o(viewGroup, z5);
        } else if (f15944g) {
            try {
                e1.o(viewGroup, z5);
            } catch (NoSuchMethodError unused) {
                f15944g = false;
            }
        }
    }

    public static int[] P(Collection collection) {
        if (collection instanceof gi.a) {
            gi.a aVar = (gi.a) collection;
            return Arrays.copyOfRange(aVar.f10044d, aVar.f10045e, aVar.f10046i);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static String Q(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static Set R(Headers headers) {
        int size = headers.size();
        TreeSet treeSet = null;
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            if ("Vary".equalsIgnoreCase(headers.b(i7))) {
                String strH = headers.h(i7);
                if (treeSet == null) {
                    Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "<this>");
                    Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
                    Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
                }
                Iterator it = StringsKt.S(strH, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(StringsKt.b0((String) it.next()).toString());
                }
            }
            i7 = i10;
        }
        return treeSet == null ? p0.f14661d : treeSet;
    }

    public static final Exception a(p1.a aVar, String str, Exception exc) {
        if (exc instanceof q1.a) {
            return new q1.a(aVar, str);
        }
        if (exc instanceof q1.b) {
            return new q1.b(aVar, str);
        }
        throw new r1.a();
    }

    public static final String b(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
        Sequence sequenceC = xq.n.c(b0.f15937d, type);
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.checkNotNullParameter(sequenceC, "<this>");
        Iterator it = sequenceC.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        sb2.append(((Class) next).getName());
        sb2.append(kotlin.text.x.k(xq.r.e(sequenceC), "[]"));
        return sb2.toString();
    }

    public static void d(String str) {
        Trace.beginSection(Q(str));
    }

    public static int e(long j) {
        int i7 = (int) j;
        ls.l.d(((long) i7) == j, "Out of range: %s", j);
        return i7;
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static final Type g(KType kType, boolean z5) {
        c classifier = kType.getClassifier();
        if (classifier instanceof t) {
            return new z((t) classifier);
        }
        if (!(classifier instanceof KClass)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
        }
        KClass kClass = (KClass) classifier;
        Class clsC = z5 ? gn.h.C(kClass) : gn.h.B(kClass);
        List arguments = kType.getArguments();
        if (arguments.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return n(clsC, arguments);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.b0(arguments);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        w wVar = kTypeProjection.f14693a;
        KType kType2 = kTypeProjection.f14694b;
        int i7 = wVar == null ? -1 : a0.f15936a[wVar.ordinal()];
        if (i7 == -1 || i7 == 1) {
            return clsC;
        }
        if (i7 != 2 && i7 != 3) {
            throw new rn.n();
        }
        Intrinsics.checkNotNull(kType2);
        Type typeG = g(kType2, false);
        return typeG instanceof Class ? clsC : new a(typeG);
    }

    public static int i(int i7, int i10) {
        if (i10 <= 1073741823) {
            return Math.min(Math.max(i7, i10), 1073741823);
        }
        throw new IllegalArgumentException(mf.f.A("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i10), 1073741823));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] k(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            jArr[i7] = iArr[i7];
        }
        return jArr;
    }

    public static void l(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i7);
            }
        }
    }

    public static void m(n2.b bVar, n2.c cVar, int i7) throws IOException {
        byte[] bArr = new byte[8192];
        while (i7 > 0) {
            int iMin = Math.min(i7, 8192);
            int i10 = bVar.read(bArr, 0, iMin);
            if (i10 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i7 -= i10;
            cVar.write(bArr, 0, i10);
        }
    }

    public static final y n(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(v((KTypeProjection) it.next()));
            }
            return new y(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(v((KTypeProjection) it2.next()));
            }
            return new y(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        y yVarN = n(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.e0.l(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(v((KTypeProjection) it3.next()));
        }
        return new y(cls, yVarN, arrayList3);
    }

    public static final vo.f o(vo.z zVar, up.b classId) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        vo.i iVarP = p(zVar, classId);
        if (iVarP instanceof vo.f) {
            return (vo.f) iVarP;
        }
        return null;
    }

    public static final vo.i p(vo.z zVar, up.b classId) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        g3.a aVar = xp.m.f23015a;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (zVar.c0(xp.m.f23015a) != null) {
            throw new ClassCastException();
        }
        i0 i0VarO = zVar.O(classId.f21258a);
        up.d dVar = classId.f21259b.f21262a;
        dVar.getClass();
        List listE = up.d.e(dVar);
        vo.i iVarG = ((yo.v) i0VarO).E.g((up.e) CollectionsKt.K(listE), dp.c.f7699y);
        if (iVarG != null) {
            for (up.e eVar : listE.subList(1, listE.size())) {
                if (iVarG instanceof vo.f) {
                    vo.i iVarG2 = ((vo.f) iVarG).h0().g(eVar, dp.c.f7699y);
                    iVarG = iVarG2 instanceof vo.f ? (vo.f) iVarG2 : null;
                    if (iVarG != null) {
                    }
                }
            }
            return iVarG;
        }
        return null;
    }

    public static final vo.f q(vo.z zVar, up.b classId, com.google.firebase.messaging.r notFoundClasses) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        vo.f fVarO = o(zVar, classId);
        return fVarO != null ? fVarO : notFoundClasses.d(classId, xq.r.q(xq.r.n(xq.n.c(vo.s.f21844d, classId), vo.r.f21838e)));
    }

    public static final HashSet r(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setE = ((eq.o) it.next()).e();
            if (setE == null) {
                return null;
            }
            kotlin.collections.i0.o(hashSet, setE);
        }
        return hashSet;
    }

    public static final up.b s(rp.f fVar, int i7) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return yk.a.n(fVar.k(i7), fVar.v(i7));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public static final Field t(KProperty kProperty) {
        Intrinsics.checkNotNullParameter(kProperty, "<this>");
        n1 n1VarC = a2.c(kProperty);
        if (n1VarC != null) {
            return (Field) n1VarC.H.getValue();
        }
        return null;
    }

    public static final Method u(KFunction kFunction) {
        qo.g gVarB;
        Intrinsics.checkNotNullParameter(kFunction, "<this>");
        po.s sVarA = a2.a(kFunction);
        Member memberB = (sVarA == null || (gVarB = sVarA.b()) == null) ? null : gVarB.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Type v(KTypeProjection kTypeProjection) {
        w wVar = kTypeProjection.f14693a;
        if (wVar == null) {
            e0.f15945i.getClass();
            return e0.f15946v;
        }
        KType kType = kTypeProjection.f14694b;
        Intrinsics.checkNotNull(kType);
        int iOrdinal = wVar.ordinal();
        if (iOrdinal == 0) {
            return g(kType, true);
        }
        if (iOrdinal == 1) {
            return new e0(null, g(kType, true));
        }
        if (iOrdinal == 2) {
            return new e0(g(kType, true), null);
        }
        throw new rn.n();
    }

    public static final up.e w(rp.f fVar, int i7) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        up.e eVarD = up.e.d(fVar.getString(i7));
        Intrinsics.checkNotNullExpressionValue(eVarD, "guessByFirstCharacter(...)");
        return eVarD;
    }

    public static void x(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean y(Context context) {
        com.facebook.imagepipeline.nativecode.c.H(context, "The application context is required.");
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    public abstract boolean B();

    public abstract void I(boolean z5);

    public void J(vo.d member, Collection overridden) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(overridden, "overridden");
        member.g0(overridden);
    }

    public abstract void K();

    public abstract void L(int i7);

    public abstract void c(vo.d dVar);

    public abstract void h(vo.d dVar, vo.d dVar2);

    public abstract void j(LinearInterpolator linearInterpolator, CancellationSignal cancellationSignal, tl.a aVar);

    public abstract void z(int i7);

    public void H(boolean z5) {
    }
}
