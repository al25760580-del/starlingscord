package yk;

import a3.r;
import a5.l0;
import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.play_billing.v1;
import cs.p;
import cs.q;
import ep.x;
import eq.o;
import gc.h1;
import hq.v;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Inflater;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import je.w;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;
import lq.z;
import pp.j;
import qo.d;
import rn.l;
import s0.g;
import so.i;
import up.c;
import up.e;
import vo.f;
import vo.n0;
import vo.u;
import wo.h;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f23380a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f23381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f23382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f23383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f23384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f23385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f23386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Field f23387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f23388i;

    public static long A(long j, long j5) {
        if (j5 == 0) {
            return j;
        }
        if (j5 <= 0 ? j >= Long.MIN_VALUE - j5 : j <= LongCompanionObject.MAX_VALUE - j5) {
            return j + j5;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j);
        sb2.append(',');
        sb2.append(j5);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    public static int B(long j) {
        if (j < -2147483648L || j > 2147483647L) {
            throw new ArithmeticException(kk.b.i(j, "Out of range: "));
        }
        return (int) j;
    }

    public static long C(long j, long j5) {
        if (j5 == 1) {
            return j;
        }
        if (j5 <= 0 ? j5 >= -1 ? !(j5 == -1 && j == Long.MIN_VALUE) : j <= Long.MIN_VALUE / j5 && j >= LongCompanionObject.MAX_VALUE / j5 : j <= LongCompanionObject.MAX_VALUE / j5 && j >= Long.MIN_VALUE / j5) {
            return j * j5;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j);
        sb2.append(',');
        sb2.append(j5);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    public static int D(int i7, int i10) {
        if (i10 == 0) {
            return i7;
        }
        long j = ((long) i7) - ((long) i10);
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Integer overflow: (");
        sb2.append(i7);
        sb2.append(',');
        sb2.append(i10);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    public static long E(long j, long j5) {
        if (j5 == 0) {
            return j;
        }
        if (j5 <= 0 ? j <= LongCompanionObject.MAX_VALUE + j5 : j >= Long.MIN_VALUE + j5) {
            return j - j5;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j);
        sb2.append(',');
        sb2.append(j5);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    public static int F(Context context, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i7});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static up.b G(c topLevelFqName) {
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        return new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f());
    }

    public static CopyOnWriteArrayList H(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw g.a(it);
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }

    public static void a(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(String str, boolean z5) throws h1 {
        if (!z5) {
            throw h1.a(str, null);
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static float e(float f2, float f7, float f10) {
        if (f2 < f7) {
            return f7;
        }
        return f2 > f10 ? f10 : f2;
    }

    public static int f(int i7, int i10, int i11) {
        if (i7 < i10) {
            return i10;
        }
        return i7 > i11 ? i11 : i7;
    }

    public static final ArrayList g(ArrayList newValueParameterTypes, List oldValueParameters, u newOwner) {
        Intrinsics.checkNotNullParameter(newValueParameterTypes, "newValueParameterTypes");
        Intrinsics.checkNotNullParameter(oldValueParameters, "oldValueParameters");
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        ArrayList<Pair> arrayListN0 = CollectionsKt.n0(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(e0.l(arrayListN0, 10));
        for (Pair pair : arrayListN0) {
            z zVar = (z) pair.f14612d;
            q0 q0Var = (q0) pair.f14613e;
            int i7 = q0Var.f23468y;
            h annotations = q0Var.getAnnotations();
            e name = q0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            boolean zC0 = q0Var.C0();
            boolean z5 = q0Var.F;
            boolean z6 = q0Var.G;
            z zVarF = q0Var.H != null ? bq.e.j(newOwner).f().f(zVar) : null;
            n0 n0VarD = q0Var.d();
            Intrinsics.checkNotNullExpressionValue(n0VarD, "getSource(...)");
            arrayList.add(new q0(newOwner, null, i7, annotations, name, zVar, zC0, z5, z6, zVarF, n0VarD));
        }
        return arrayList;
    }

    public static final Object h(Class annotationClass, Map values, List methods) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(methods, "methods");
        rn.u uVarB = l.b(new x(20, values));
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new d(annotationClass, values, l.b(new fp.b(13, annotationClass, values)), uVarB, methods));
        Intrinsics.checkNotNull(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static IconCompat i(Icon icon) {
        icon.getClass();
        int iV = v(icon);
        if (iV == 2) {
            return IconCompat.d(null, t(icon), s(icon));
        }
        if (iV == 4) {
            Uri uriW = w(icon);
            PorterDuff.Mode mode = IconCompat.k;
            uriW.getClass();
            String string = uriW.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f1561b = string;
            return iconCompat;
        }
        if (iV != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f1561b = icon;
            return iconCompat2;
        }
        Uri uriW2 = w(icon);
        PorterDuff.Mode mode2 = IconCompat.k;
        uriW2.getClass();
        String string2 = uriW2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f1561b = string2;
        return iconCompat3;
    }

    public static int j(int i7, int i10) {
        return i7 >= 0 ? i7 / i10 : ((i7 + 1) / i10) - 1;
    }

    public static long k(int i7, long j) {
        return j >= 0 ? j / ((long) i7) : ((j + 1) / ((long) i7)) - 1;
    }

    public static int l(int i7, int i10) {
        return i7 - (j(i7, i10) * i10);
    }

    public static int m(int i7, long j) {
        return (int) (j - (k(i7, j) * ((long) i7)));
    }

    public static up.b n(String string, boolean z5) {
        String strL;
        Intrinsics.checkNotNullParameter(string, "string");
        int I = StringsKt.I(string, '`', 0, 6);
        if (I == -1) {
            I = string.length();
        }
        int iM = StringsKt.M(I, 4, string, "/");
        String str = "";
        if (iM == -1) {
            strL = kotlin.text.x.l(string, "`", "", false);
        } else {
            String strSubstring = string.substring(0, iM);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strM = kotlin.text.x.m(strSubstring, '/', '.');
            String strSubstring2 = string.substring(iM + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            strL = kotlin.text.x.l(strSubstring2, "`", "", false);
            str = strM;
        }
        return new up.b(new c(str), new c(strL), z5);
    }

    public static q o(SSLSession sSLSession) throws IOException {
        List listK;
        Intrinsics.checkNotNullParameter(sSLSession, "<this>");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException(Intrinsics.stringPlus("cipherSuite == ", cipherSuite));
        }
        cs.l lVarC = cs.l.f7433b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (Intrinsics.areEqual("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        cs.x xVarI = android.support.v4.media.session.b.i(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listK = peerCertificates != null ? ds.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : kotlin.collections.n0.f14659d;
        } catch (SSLPeerUnverifiedException unused) {
            listK = kotlin.collections.n0.f14659d;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(xVarI, lVarC, localCertificates != null ? ds.b.k(Arrays.copyOf(localCertificates, localCertificates.length)) : kotlin.collections.n0.f14659d, new p(1, listK));
    }

    public static Object p(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return e.e.c(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final ip.e0 q(f fVar) {
        f fVar2;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i7 = bq.e.f3383a;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Iterator it = fVar.j().r0().h().iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar2 = null;
                break;
            }
            z zVar = (z) it.next();
            if (!i.y(zVar)) {
                vo.i iVarG = zVar.r0().g();
                int i10 = xp.e.f22999a;
                if (xp.e.n(iVarG, vo.g.f21808d) || xp.e.n(iVarG, vo.g.f21810i)) {
                    Intrinsics.checkNotNull(iVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    fVar2 = (f) iVarG;
                    break;
                }
            }
        }
        if (fVar2 == null) {
            return null;
        }
        o oVarF = fVar2.F();
        ip.e0 e0Var = oVarF instanceof ip.e0 ? (ip.e0) oVarF : null;
        return e0Var == null ? q(fVar2) : e0Var;
    }

    public static SharedPreferences r(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static int s(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.h.g(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public static String t(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.h.h(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon package", e12);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7 A[RETURN] */
    public static ap.b u(r container, boolean z5, boolean z6, Boolean bool, boolean z7, ue.i kotlinClassFinder, rp.e metadataVersion) {
        n0 n0Var;
        np.g gVar;
        ap.b bVar;
        hq.u uVar;
        j jVar;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        j jVar2 = j.INTERFACE;
        if (z5) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
            if (container instanceof hq.u) {
                hq.u uVar2 = (hq.u) container;
                if (uVar2.f11073h == jVar2) {
                    up.b bVar2 = uVar2.f11072g;
                    e eVarE = e.e("DefaultImpls");
                    Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
                    return l0.t(kotlinClassFinder, bVar2.d(eVarE), metadataVersion);
                }
            }
            if (bool.booleanValue() && (container instanceof v)) {
                n0 n0Var2 = (n0) container.f119d;
                np.g gVar2 = n0Var2 instanceof np.g ? (np.g) n0Var2 : null;
                cq.b bVar3 = gVar2 != null ? gVar2.f17003e : null;
                if (bVar3 != null) {
                    String strD = bVar3.d();
                    Intrinsics.checkNotNullExpressionValue(strD, "getInternalName(...)");
                    c topLevelFqName = new c(kotlin.text.x.m(strD, '/', '.'));
                    Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                    return l0.t(kotlinClassFinder, new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f()), metadataVersion);
                }
            }
        }
        if (z6 && (container instanceof hq.u)) {
            hq.u uVar3 = (hq.u) container;
            if (uVar3.f11073h == j.COMPANION_OBJECT && (uVar = uVar3.f11071f) != null && ((jVar = uVar.f11073h) == j.CLASS || jVar == j.ENUM_CLASS || (z7 && (jVar == jVar2 || jVar == j.ANNOTATION_CLASS)))) {
                n0 n0Var3 = (n0) uVar.f119d;
                np.o oVar = n0Var3 instanceof np.o ? (np.o) n0Var3 : null;
                if (oVar != null) {
                    return oVar.f17016d;
                }
            } else if (container instanceof v) {
                n0Var = (n0) container.f119d;
                if (n0Var instanceof np.g) {
                    Intrinsics.checkNotNull(n0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
                    gVar = (np.g) n0Var;
                    bVar = gVar.f17004i;
                    if (bVar == null) {
                        return l0.t(kotlinClassFinder, gVar.b(), metadataVersion);
                    }
                    return bVar;
                }
            }
        } else if (container instanceof v) {
            n0Var = (n0) container.f119d;
            if (n0Var instanceof np.g) {
                Intrinsics.checkNotNull(n0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
                gVar = (np.g) n0Var;
                bVar = gVar.f17004i;
                if (bVar == null) {
                    return l0.t(kotlinClassFinder, gVar.b(), metadataVersion);
                }
                return bVar;
            }
        }
        return null;
    }

    public static int v(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.h.o(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e12);
            return -1;
        }
    }

    public static Uri w(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.h.p(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public static final boolean x(float f2) {
        return Float.compare(f2, Float.NaN) == 0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    public static ArrayList y(w wVar) {
        char c8;
        ArrayList arrayList;
        boolean z5;
        int i7;
        Object eVar;
        w wVar2 = wVar;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (wVar2.u() == 0) {
            char c10 = 7;
            wVar2.G(7);
            int iG = wVar2.g();
            boolean z6 = true;
            if (iG == 1684433976) {
                w wVar3 = new w();
                Inflater inflater = new Inflater(true);
                try {
                    if (!je.e0.E(wVar2, wVar3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    wVar2 = wVar3;
                } catch (Throwable th2) {
                    inflater.end();
                    throw th2;
                }
            } else if (iG == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i10 = wVar2.f13861b;
            int i11 = wVar2.f13862c;
            while (i10 < i11) {
                int iG2 = wVar2.g() + i10;
                if (iG2 > i10 && iG2 <= i11) {
                    if (wVar2.g() == 1835365224) {
                        int iG3 = wVar2.g();
                        if (iG3 > 10000) {
                            c8 = c10;
                            ArrayList arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z5 = z6;
                            i7 = i11;
                            eVar = arrayList4;
                        } else {
                            float[] fArr = new float[iG3];
                            for (int i12 = 0; i12 < iG3; i12++) {
                                fArr[i12] = Float.intBitsToFloat(wVar2.g());
                            }
                            int iG4 = wVar2.g();
                            if (iG4 > 32000) {
                                c8 = c10;
                                ArrayList arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                z5 = z6;
                                i7 = i11;
                                eVar = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                c8 = c10;
                                ArrayList arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iG3) * 2.0d) / dLog);
                                z5 = z6;
                                byte[] bArr = wVar2.f13860a;
                                je.v vVar = new je.v(bArr, bArr.length);
                                vVar.p(wVar2.f13861b * 8);
                                float[] fArr2 = new float[iG4 * 5];
                                int i13 = 5;
                                int[] iArr = new int[5];
                                ArrayList arrayList7 = arrayList6;
                                int i14 = 0;
                                int i15 = 0;
                                while (true) {
                                    if (i14 < iG4) {
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 < i13) {
                                                int i17 = iArr[i16];
                                                int i18 = vVar.i(iCeil);
                                                int i19 = ((i18 >> 1) ^ (-(i18 & 1))) + i17;
                                                if (i19 < iG3 && i19 >= 0) {
                                                    fArr2[i15] = fArr[i19];
                                                    iArr[i16] = i19;
                                                    i16++;
                                                    i15++;
                                                    i13 = 5;
                                                }
                                            } else {
                                                i14++;
                                                i13 = 5;
                                            }
                                        }
                                    } else {
                                        vVar.p((vVar.g() + 7) & (-8));
                                        int i20 = 32;
                                        int i21 = vVar.i(32);
                                        v1[] v1VarArr = new v1[i21];
                                        int i22 = 0;
                                        while (true) {
                                            if (i22 < i21) {
                                                int i23 = vVar.i(8);
                                                int i24 = vVar.i(8);
                                                int i25 = vVar.i(i20);
                                                if (i25 <= 128000) {
                                                    int i26 = i21;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iG4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[i25 * 3];
                                                    float[] fArr5 = new float[i25 * 2];
                                                    i7 = i11;
                                                    int i27 = 0;
                                                    int i28 = 0;
                                                    while (true) {
                                                        if (i27 < i25) {
                                                            int i29 = vVar.i(iCeil2);
                                                            je.v vVar2 = vVar;
                                                            int i30 = ((i29 >> 1) ^ (-(i29 & 1))) + i28;
                                                            if (i30 >= 0 && i30 < iG4) {
                                                                int i31 = i27 * 3;
                                                                int i32 = i30 * 5;
                                                                fArr4[i31] = fArr3[i32];
                                                                fArr4[i31 + 1] = fArr3[i32 + 1];
                                                                fArr4[i31 + 2] = fArr3[i32 + 2];
                                                                int i33 = i27 * 2;
                                                                fArr5[i33] = fArr3[i32 + 3];
                                                                fArr5[i33 + 1] = fArr3[i32 + 4];
                                                                i27++;
                                                                i28 = i30;
                                                                vVar = vVar2;
                                                            }
                                                        } else {
                                                            v1VarArr[i22] = new v1(fArr4, fArr5, i23, i24);
                                                            i22++;
                                                            i21 = i26;
                                                            fArr2 = fArr3;
                                                            i11 = i7;
                                                            vVar = vVar;
                                                            i20 = 32;
                                                        }
                                                    }
                                                }
                                                eVar = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i7 = i11;
                                                eVar = new le.e(v1VarArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i7 = i11;
                                    eVar = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (eVar == null) {
                            return arrayList;
                        }
                        arrayList3.add(eVar);
                    } else {
                        c8 = c10;
                        arrayList = arrayList2;
                        z5 = z6;
                        i7 = i11;
                    }
                    wVar2.F(iG2);
                    i10 = iG2;
                    c10 = c8;
                    z6 = z5;
                    arrayList2 = arrayList;
                    i11 = i7;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }

    public static int z(int i7, int i10) {
        if (i10 == 0) {
            return i7;
        }
        long j = ((long) i7) + ((long) i10);
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Integer overflow: (");
        sb2.append(i7);
        sb2.append(',');
        sb2.append(i10);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }
}
