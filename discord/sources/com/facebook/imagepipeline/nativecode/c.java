package com.facebook.imagepipeline.nativecode;

import a5.l0;
import ad.f;
import ag.a1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import c5.i;
import c5.w;
import ce.g;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import gc.h1;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import lq.b0;
import lq.b1;
import lq.e1;
import lq.i0;
import lq.p0;
import lq.t0;
import lq.v;
import lq.v0;
import lq.w0;
import o1.d;
import o1.h;
import o1.j;
import o1.k;
import o1.n;
import o1.o;
import o1.p;
import o1.q;
import pc.l;
import po.a2;
import po.g0;
import po.i1;
import po.n1;
import po.y1;
import qo.a0;
import qo.r;
import qo.s;
import qo.t;
import sh.o0;
import sh.u;
import up.e;
import vo.r0;
import wp.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f4927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f4928b;

    public static boolean A(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final boolean B(String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        try {
            Base64.decode(s2, 11);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static c5.b C(i iVar) {
        long j;
        boolean z5;
        long j5;
        long j7;
        long j10;
        long j11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = iVar.f3497b;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jD = str != null ? D(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i7 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z5 = false;
            j5 = 0;
            j7 = 0;
            while (i7 < strArrSplit.length) {
                String strTrim = strArrSplit[i7].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j5 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j7 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z5 = true;
                }
                i7++;
            }
            j = 0;
            i7 = 1;
        } else {
            j = 0;
            z5 = false;
            j5 = 0;
            j7 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jD2 = str3 != null ? D(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        long jD3 = str4 != null ? D(str4) : j;
        String str5 = (String) map.get("ETag");
        if (i7 != 0) {
            long j12 = (j5 * 1000) + jCurrentTimeMillis;
            j11 = z5 ? j12 : (j7 * 1000) + j12;
            j10 = j12;
        } else {
            j10 = (jD <= j || jD2 < jD) ? j : (jD2 - jD) + jCurrentTimeMillis;
            j11 = j10;
        }
        c5.b bVar = new c5.b();
        bVar.f3469a = iVar.f3496a;
        bVar.f3470b = str5;
        bVar.f3474f = j10;
        bVar.f3473e = j11;
        bVar.f3471c = jD;
        bVar.f3472d = jD3;
        bVar.f3475g = map;
        bVar.f3476h = iVar.f3498c;
        return bVar;
    }

    public static long D(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || "-1".equals(str)) {
                w.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", w.a("Unable to parse dateStr: %s, falling back to 0", str), e10);
            return 0L;
        }
    }

    public static final String E(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String strB = eVar.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        if (!m.f22462a.contains(strB)) {
            for (int i7 = 0; i7 < strB.length(); i7++) {
                char cCharAt = strB.charAt(i7);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                String strB2 = eVar.b();
                Intrinsics.checkNotNullExpressionValue(strB2, "asString(...)");
                return strB2;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String strB3 = eVar.b();
        Intrinsics.checkNotNullExpressionValue(strB3, "asString(...)");
        sb2.append("`" + strB3);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String F(List pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = pathSegments.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(E(eVar));
        }
        return sb2.toString();
    }

    public static final String G(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        if (!x.o(lowerRendered, lowerPrefix, false) || !x.o(upperRendered, upperPrefix, false)) {
            return null;
        }
        String strSubstring = lowerRendered.substring(lowerPrefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = upperRendered.substring(upperPrefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String strJ = kk.b.j(foldedPrefix, strSubstring);
        if (Intrinsics.areEqual(strSubstring, strSubstring2)) {
            return strJ;
        }
        if (!N(strSubstring, strSubstring2)) {
            return null;
        }
        return strJ + '!';
    }

    public static void H(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static g I(g gVar, String[] strArr, Map map) {
        int i7 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i7 < length) {
                    gVar2.a((g) map.get(strArr[i7]));
                    i7++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i7 < length2) {
                    gVar.a((g) map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return gVar;
    }

    public static void J(View view, kh.i iVar) {
        ah.a aVar = iVar.f14483e.f14465c;
        if (aVar == null || !aVar.f605a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        kh.g gVar = iVar.f14483e;
        if (gVar.f14473m != elevation) {
            gVar.f14473m = elevation;
            iVar.x();
        }
    }

    public static f K(int i7, l lVar, je.w wVar) throws h1 {
        f fVarB = f.b(lVar, wVar);
        while (true) {
            int i10 = fVarB.f347a;
            if (i10 == i7) {
                return fVarB;
            }
            com.discord.chat.presentation.list.a.q(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = fVarB.f348b + 8;
            if (j > 2147483647L) {
                throw h1.c("Chunk is too large (~2GB+) to skip; id: " + i10);
            }
            lVar.u((int) j);
            fVarB = f.b(lVar, wVar);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final d L(CharSequence charSequence, String type) {
        Intrinsics.checkNotNullParameter(type, "errorType");
        switch (type.hashCode()) {
            case -2055374133:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new o1.b(charSequence);
                }
                break;
            case -1166690414:
                if (type.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new o1.i(charSequence);
                }
                break;
            case -580283253:
                if (type.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new o1.g(charSequence);
                }
                break;
            case 1316905704:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new h(charSequence);
                }
                break;
            case 2092588512:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new o1.e(charSequence);
                }
                break;
            case 2131915191:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new o1.f(charSequence, "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS");
                }
                break;
        }
        if (!x.o(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new o1.c(charSequence, type);
        }
        int i7 = q1.a.f18577i;
        String string = charSequence != null ? charSequence.toString() : null;
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            if (!StringsKt.D(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new r1.a();
            }
            int i10 = q1.a.f18577i;
            return mf.f.p(type, string);
        } catch (r1.a unused) {
            return new o1.c(string, type);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final o1.l M(CharSequence charSequence, String type) {
        Intrinsics.checkNotNullParameter(type, "errorType");
        switch (type.hashCode()) {
            case -781118336:
                if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new o(charSequence);
                }
                break;
            case -408155724:
                if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new p(charSequence);
                }
                break;
            case -45448328:
                if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new o1.m(charSequence);
                }
                break;
            case 580557411:
                if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new j(charSequence);
                }
                break;
            case 627896683:
                if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new q(charSequence);
                }
                break;
            case 1594095913:
                if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new n(charSequence);
                }
                break;
        }
        if (!x.o(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new k(charSequence, type);
        }
        int i7 = q1.b.f18581x;
        String string = charSequence != null ? charSequence.toString() : null;
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            if (!x.o(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new r1.a();
            }
            int i10 = q1.b.f18581x;
            return sa.a.g(type, string);
        } catch (r1.a unused) {
            return new k(string, type);
        }
    }

    public static final boolean N(String lower, String upper) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        Intrinsics.checkNotNullParameter(upper, "upper");
        if (Intrinsics.areEqual(lower, x.l(upper, "?", "", false))) {
            return true;
        }
        if (x.h(upper, "?", false)) {
            if (Intrinsics.areEqual(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(lower);
        sb2.append(")?");
        return Intrinsics.areEqual(sb2.toString(), upper);
    }

    public static void P(String str, fk.n nVar, int i7, Dynamic dynamic, Class cls) {
        Method method = null;
        for (Method method2 : cls.getMethods()) {
            if (method2.getName().equals(str)) {
                method = method2;
            }
        }
        String str2 = ((ReactPropGroup) method.getAnnotation(ReactPropGroup.class)).names()[i7];
        jk.c cVar = (jk.c) ((fk.i) nVar.f9285e.f8029m).get(str2);
        cVar.f13919a = cVar.a(dynamic);
        nVar.f9286i.add(str2);
    }

    public static w0 Q(w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        if (!(w0Var instanceof v)) {
            return new v0(w0Var, 1);
        }
        v vVar = (v) w0Var;
        r0[] r0VarArr = vVar.f15254b;
        ArrayList<Pair> arrayListK = y.K(vVar.f15255c, r0VarArr);
        ArrayList arrayList = new ArrayList(e0.l(arrayListK, 10));
        for (Pair pair : arrayListK) {
            arrayList.add(m((t0) pair.f14612d, (r0) pair.f14613e));
        }
        return new v(r0VarArr, (t0[]) arrayList.toArray(new t0[0]), true);
    }

    public static final long a(float f2, float f7) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f7)) & 4294967295L) | (Float.floatToIntBits(f2) << 32);
        int i7 = b0.b.f3015a;
        return jFloatToIntBits;
    }

    public static void b(u uVar, InputStream inputStream, o0 o0Var, long j) throws Throwable {
        o0 o0Var2;
        DataInputStream dataInputStream;
        u uVar2;
        int unsignedShort;
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(inputStream, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT));
        int i7 = dataInputStream2.readInt();
        if (i7 != -771763713) {
            throw new a1("Unexpected magic=".concat(String.format("%x", Integer.valueOf(i7))));
        }
        int i10 = dataInputStream2.read();
        if (i10 != 4) {
            throw new a1(kk.b.h(i10, "Unexpected version="));
        }
        long j5 = 0;
        while (true) {
            long j7 = j - j5;
            try {
                int unsignedShort2 = dataInputStream2.read();
                if (unsignedShort2 == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (unsignedShort2 == 0) {
                    o0Var.flush();
                    return;
                }
                switch (unsignedShort2) {
                    case 247:
                        o0Var2 = o0Var;
                        unsignedShort2 = dataInputStream2.readUnsignedShort();
                        g(bArr, dataInputStream2, o0Var2, unsignedShort2, j7);
                        j5 += (long) unsignedShort2;
                        o0Var = o0Var2;
                        break;
                    case 248:
                        o0Var2 = o0Var;
                        unsignedShort2 = dataInputStream2.readInt();
                        g(bArr, dataInputStream2, o0Var2, unsignedShort2, j7);
                        j5 += (long) unsignedShort2;
                        o0Var = o0Var2;
                        break;
                    case 249:
                        o0Var2 = o0Var;
                        DataInputStream dataInputStream3 = dataInputStream2;
                        u uVar3 = uVar;
                        long unsignedShort3 = dataInputStream3.readUnsignedShort();
                        int i11 = dataInputStream3.read();
                        if (i11 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        d(bArr, uVar3, o0Var2, unsignedShort3, i11, j7);
                        uVar = uVar3;
                        dataInputStream2 = dataInputStream3;
                        unsignedShort2 = i11;
                        j5 += (long) unsignedShort2;
                        o0Var = o0Var2;
                        break;
                        break;
                    case h0.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                        o0Var2 = o0Var;
                        dataInputStream = dataInputStream2;
                        uVar2 = uVar;
                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        d(bArr, uVar2, o0Var2, unsignedShort4, unsignedShort, j7);
                        uVar = uVar2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j5 += (long) unsignedShort2;
                        o0Var = o0Var2;
                        break;
                    case 251:
                        o0Var2 = o0Var;
                        dataInputStream = dataInputStream2;
                        uVar2 = uVar;
                        long unsignedShort5 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readInt();
                        d(bArr, uVar2, o0Var2, unsignedShort5, unsignedShort, j7);
                        uVar = uVar2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j5 += (long) unsignedShort2;
                        o0Var = o0Var2;
                        break;
                    case 252:
                        o0Var2 = o0Var;
                        dataInputStream = dataInputStream2;
                        uVar2 = uVar;
                        long j10 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        d(bArr, uVar2, o0Var2, j10, unsignedShort, j7);
                        uVar = uVar2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j5 += (long) unsignedShort2;
                        o0Var = o0Var2;
                        break;
                        break;
                    case 253:
                        o0Var2 = o0Var;
                        dataInputStream = dataInputStream2;
                        uVar2 = uVar;
                        long j11 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        d(bArr, uVar2, o0Var2, j11, unsignedShort, j7);
                        uVar = uVar2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j5 += (long) unsignedShort2;
                        o0Var = o0Var2;
                        break;
                    case 254:
                        o0Var2 = o0Var;
                        dataInputStream = dataInputStream2;
                        uVar2 = uVar;
                        long j12 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readInt();
                        d(bArr, uVar2, o0Var2, j12, unsignedShort, j7);
                        uVar = uVar2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j5 += (long) unsignedShort2;
                        o0Var = o0Var2;
                        break;
                    case 255:
                        o0Var2 = o0Var;
                        dataInputStream = dataInputStream2;
                        long j13 = dataInputStream.readLong();
                        unsignedShort = dataInputStream.readInt();
                        uVar2 = uVar;
                        d(bArr, uVar2, o0Var2, j13, unsignedShort, j7);
                        uVar = uVar2;
                        unsignedShort2 = unsignedShort;
                        dataInputStream2 = dataInputStream;
                        j5 += (long) unsignedShort2;
                        o0Var = o0Var2;
                        break;
                    default:
                        o0Var2 = o0Var;
                        try {
                            g(bArr, dataInputStream2, o0Var2, unsignedShort2, j7);
                            dataInputStream = dataInputStream2;
                            dataInputStream2 = dataInputStream;
                            j5 += (long) unsignedShort2;
                            o0Var = o0Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            o0Var2.flush();
                            throw th3;
                        }
                        break;
                }
            } catch (Throwable th4) {
                th = th4;
                o0Var2 = o0Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    public static final qo.g c(i1 i1Var, boolean z5) {
        po.k kVar;
        Method method;
        qo.g rVar;
        sp.c cVar;
        qo.g tVar;
        Method unboxMethod;
        if (g0.f18090d.d(i1Var.j().F)) {
            return a0.f18928a;
        }
        up.b bVar = y1.f18196a;
        b bVarB = y1.b(i1Var.j().e());
        if (bVarB instanceof po.n) {
            po.n nVar = (po.n) bVarB;
            rp.f fVar = nVar.f18114i;
            sp.e eVar = nVar.f18113h;
            if (z5) {
                if ((eVar.f20449e & 4) == 4) {
                    cVar = eVar.f20452w;
                } else {
                    cVar = null;
                }
            } else if ((eVar.f20449e & 8) == 8) {
                cVar = eVar.f20453x;
            } else {
                cVar = null;
            }
            Method methodC = cVar != null ? i1Var.j().f18115y.c(fVar.getString(cVar.f20438i), fVar.getString(cVar.f20439v)) : null;
            if (methodC != null) {
                if (!Modifier.isStatic(methodC.getModifiers())) {
                    tVar = i1Var.h() ? new r(methodC, s(i1Var)) : new qo.v(0, methodC);
                } else if (i1Var.j().e().getAnnotations().P(a2.f18058a)) {
                    tVar = i1Var.h() ? new s(methodC) : new qo.v(1, methodC);
                } else {
                    tVar = i1Var.h() ? new t(methodC, false, s(i1Var)) : new qo.v(2, methodC);
                }
                rVar = tVar;
            } else if (xp.g.e(i1Var.j().e()) && Intrinsics.areEqual(i1Var.j().e().getVisibility(), vo.p.f21827d)) {
                Class clsR = l0.R(i1Var.j().e().g());
                if (clsR == null || (unboxMethod = l0.z(clsR, i1Var.j().e())) == null) {
                    throw new ar.a0("Underlying property of inline class " + i1Var.j() + " should have a field");
                }
                if (i1Var.h()) {
                    rVar = new qo.x(unboxMethod, s(i1Var));
                } else {
                    Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
                    rVar = new qo.y(unboxMethod, c0.c(unboxMethod.getDeclaringClass()));
                }
            } else {
                Field field = (Field) i1Var.j().H.getValue();
                if (field == null) {
                    throw new ar.a0("No accessors or field is found for property " + i1Var.j());
                }
                rVar = j(i1Var, z5, field);
            }
        } else if (bVarB instanceof po.l) {
            rVar = j(i1Var, z5, ((po.l) bVarB).f18105f);
        } else {
            if (!(bVarB instanceof po.m)) {
                if (!(bVarB instanceof po.o)) {
                    throw new rn.n();
                }
                if (z5) {
                    kVar = ((po.o) bVarB).f18116f;
                } else {
                    kVar = ((po.o) bVarB).f18117g;
                    if (kVar == null) {
                        throw new ar.a0("No setter found for property " + i1Var.j());
                    }
                }
                g0 g0Var = i1Var.j().f18115y;
                tp.e eVar2 = kVar.f18102h;
                Method methodC2 = g0Var.c(eVar2.k, eVar2.f20875l);
                if (methodC2 != null) {
                    Modifier.isStatic(methodC2.getModifiers());
                    return i1Var.h() ? new r(methodC2, s(i1Var)) : new qo.v(0, methodC2);
                }
                throw new ar.a0("No accessor found for property " + i1Var.j());
            }
            if (z5) {
                method = ((po.m) bVarB).f18108f;
            } else {
                po.m mVar = (po.m) bVarB;
                method = mVar.f18109g;
                if (method == null) {
                    throw new ar.a0("No source found for setter of Java method property: " + mVar.f18108f);
                }
            }
            rVar = i1Var.h() ? new r(method, s(i1Var)) : new qo.v(0, method);
        }
        return l0.o(rVar, i1Var.i(), false);
    }

    public static void d(byte[] bArr, u uVar, o0 o0Var, long j, int i7, long j5) throws IOException {
        InputStream inputStreamC;
        if (i7 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j < 0) {
            throw new IOException("inputOffset negative");
        }
        long j7 = i7;
        if (j7 > j5) {
            throw new IOException("Output length overrun");
        }
        try {
            th.e eVar = new th.e(uVar, j, j7);
            synchronized (eVar) {
                inputStreamC = eVar.c(0L, eVar.f20772i - eVar.f20771e);
            }
            int i10 = i7;
            while (i10 > 0) {
                try {
                    int iMin = Math.min(i10, 16384);
                    int i11 = 0;
                    while (i11 < iMin) {
                        int i12 = inputStreamC.read(bArr, i11, iMin - i11);
                        if (i12 == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i11 += i12;
                        throw new IOException("patch underrun", e);
                    }
                    o0Var.write(bArr, 0, iMin);
                    i10 -= iMin;
                } catch (Throwable th2) {
                    try {
                        inputStreamC.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            inputStreamC.close();
        } catch (EOFException e10) {
            throw new IOException("patch underrun", e10);
        }
    }

    public static int e(int i7) {
        if (i7 < 8191) {
            return 13;
        }
        if (i7 < 32767) {
            return 15;
        }
        if (i7 < 65535) {
            return 16;
        }
        if (i7 < 262143) {
            return 18;
        }
        throw new IllegalArgumentException(s0.g.d(i7, "Can't represent a size of ", " in Constraints"));
    }

    public static final Object f(Object possiblyPrimitiveType, boolean z5) {
        cq.c cVar;
        Intrinsics.checkNotNullParameter(np.f.f16998c, "<this>");
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (z5) {
            possiblyPrimitiveType = (np.k) possiblyPrimitiveType;
            Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
            if ((possiblyPrimitiveType instanceof np.j) && (cVar = ((np.j) possiblyPrimitiveType).f17007i) != null) {
                up.c cVar2 = cVar.f7338v;
                if (cVar2 == null) {
                    cq.c.a(15);
                    throw null;
                }
                String strD = cq.b.b(cVar2).d();
                Intrinsics.checkNotNullExpressionValue(strD, "getInternalName(...)");
                return np.f.d(strD);
            }
        }
        return possiblyPrimitiveType;
    }

    public static void g(byte[] bArr, DataInputStream dataInputStream, o0 o0Var, int i7, long j) throws IOException {
        if (i7 < 0) {
            throw new IOException("copyLength negative");
        }
        if (i7 > j) {
            throw new IOException("Output length overrun");
        }
        while (i7 > 0) {
            try {
                int iMin = Math.min(i7, 16384);
                dataInputStream.readFully(bArr, 0, iMin);
                o0Var.write(bArr, 0, iMin);
                i7 -= iMin;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }

    public static boolean h(l lVar) {
        je.w wVar = new je.w(8);
        int i7 = f.b(lVar, wVar).f347a;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        lVar.C(wVar.f13860a, 0, 4);
        wVar.F(0);
        int iG = wVar.g();
        if (iG == 1463899717) {
            return true;
        }
        je.b.r("WavHeaderReader", "Unsupported form type: " + iG);
        return false;
    }

    public static final void i(AutoCloseable autoCloseable, Throwable th2) {
        boolean zIsTerminated;
        if (th2 != null) {
            try {
                s0.g.k(autoCloseable);
                return;
            } catch (Throwable th3) {
                rn.f.a(th2, th3);
                return;
            }
        }
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z5 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z5) {
                    executorService.shutdownNow();
                    z5 = true;
                }
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    public static final qo.w j(i1 i1Var, boolean z5, Field field) {
        boolean z6;
        vo.l0 l0VarK = i1Var.j().e();
        vo.l lVarG = l0VarK.g();
        Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
        boolean z7 = true;
        if (xp.e.l(lVarG)) {
            vo.l lVarG2 = lVarG.g();
            if ((xp.e.n(lVarG2, vo.g.f21809e) || xp.e.n(lVarG2, vo.g.f21812w)) && (!(l0VarK instanceof jq.t) || !tp.g.d(((jq.t) l0VarK).Y))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    z6 = false;
                    if (i1Var.j().e().getAnnotations().P(a2.f18058a)) {
                        if (z5) {
                            Intrinsics.checkNotNullParameter(field, "field");
                            return new qo.l(field, z6, 2);
                        }
                        boolean zK = k(i1Var);
                        Intrinsics.checkNotNullParameter(field, "field");
                        return new qo.p(field, zK, z6, 2);
                    }
                    if (z5) {
                        if (i1Var.h()) {
                            Intrinsics.checkNotNullParameter(field, "field");
                            return new qo.k(field, false);
                        }
                        Intrinsics.checkNotNullParameter(field, "field");
                        return new qo.l(field, z7, 1);
                    }
                    if (i1Var.h()) {
                        boolean zK2 = k(i1Var);
                        Intrinsics.checkNotNullParameter(field, "field");
                        return new qo.o(field, zK2, false);
                    }
                    boolean zK3 = k(i1Var);
                    Intrinsics.checkNotNullParameter(field, "field");
                    return new qo.p(field, zK3, z7, 1);
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            z6 = false;
            if (i1Var.j().e().getAnnotations().P(a2.f18058a)) {
                if (z5) {
                    Intrinsics.checkNotNullParameter(field, "field");
                    return new qo.l(field, z6, 2);
                }
                boolean zK4 = k(i1Var);
                Intrinsics.checkNotNullParameter(field, "field");
                return new qo.p(field, zK4, z6, 2);
            }
            if (z5) {
                if (i1Var.h()) {
                    Intrinsics.checkNotNullParameter(field, "field");
                    return new qo.k(field, false);
                }
                Intrinsics.checkNotNullParameter(field, "field");
                return new qo.l(field, z7, 1);
            }
            if (i1Var.h()) {
                boolean zK5 = k(i1Var);
                Intrinsics.checkNotNullParameter(field, "field");
                return new qo.o(field, zK5, false);
            }
            boolean zK6 = k(i1Var);
            Intrinsics.checkNotNullParameter(field, "field");
            return new qo.p(field, zK6, z7, 1);
        }
        if (z5) {
            if (i1Var.h()) {
                return new qo.j(field, s(i1Var));
            }
            Intrinsics.checkNotNullParameter(field, "field");
            return new qo.l(field, z7, 0);
        }
        if (i1Var.h()) {
            return new qo.n(field, k(i1Var), s(i1Var));
        }
        boolean zK7 = k(i1Var);
        Intrinsics.checkNotNullParameter(field, "field");
        return new qo.p(field, zK7, z7, 0);
    }

    public static final boolean k(i1 i1Var) {
        return !b1.e(i1Var.j().e().getType());
    }

    public static final t0 m(t0 typeProjection, r0 r0Var) {
        if (r0Var == null || typeProjection.a() == e1.INVARIANT) {
            return typeProjection;
        }
        if (r0Var.getVariance() != typeProjection.a()) {
            Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
            yp.c cVar = new yp.c(typeProjection);
            lq.l0.f15225e.getClass();
            return new i0(new yp.a(typeProjection, cVar, false, lq.l0.f15226i));
        }
        if (!typeProjection.c()) {
            return new i0(typeProjection.b());
        }
        kq.b NO_LOCKS = kq.l.f14788e;
        Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        return new i0(new b0(NO_LOCKS, new yp.d(0, typeProjection)));
    }

    public static p0 n(boolean z5, mq.m mVar, int i7) {
        if ((i7 & 4) != 0) {
            mVar = mq.m.f16035d;
        }
        mq.m typeSystemContext = mVar;
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        mq.e kotlinTypePreparator = mq.e.f16017a;
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        mq.f kotlinTypeRefiner = mq.f.f16018a;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new p0(z5, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static b o(int i7) {
        if (i7 != 0) {
            return i7 != 1 ? new kh.k() : new kh.e();
        }
        return new kh.k();
    }

    public static synchronized void q() {
        if (!f4927a) {
            ib.a.z("static-webp");
            f4927a = true;
        }
    }

    public static boolean r(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final Object s(i1 i1Var) {
        Intrinsics.checkNotNullParameter(i1Var, "<this>");
        n1 n1VarJ = i1Var.j();
        return l0.m(n1VarJ.G, n1VarJ.e());
    }

    public static ColorStateList t(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateListC = y0.b.c(context, resourceId)) == null) ? typedArray.getColorStateList(i7) : colorStateListC;
    }

    public static ColorStateList u(Context context, e4.m mVar, int i7) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) mVar.f7994i;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateListC = y0.b.c(context, resourceId)) == null) ? mVar.w(i7) : colorStateListC;
    }

    public static int v(Context context, TypedArray typedArray, int i7, int i10) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i7, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i7, i10);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i10);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable w(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        Drawable drawableU;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (drawableU = mf.f.u(context, resourceId)) == null) ? typedArray.getDrawable(i7) : drawableU;
    }

    public static int z(Context context, int i7) {
        if (i7 == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, kg.a.A);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(4, typedValue);
        if (!value) {
            value = typedArrayObtainStyledAttributes.getValue(2, typedValue);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (value) {
            return typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public void O(im.f handler, ReadableMap config) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.hasKey("shouldCancelWhenOutside")) {
            handler.E = config.getBoolean("shouldCancelWhenOutside");
        }
        if (config.hasKey(ViewProps.ENABLED)) {
            boolean z5 = config.getBoolean(ViewProps.ENABLED);
            if (handler.f11894f != null && handler.f11898l != z5) {
                UiThreadUtil.runOnUiThread(new im.c(0, handler));
            }
            handler.f11898l = z5;
        }
        if (config.hasKey("hitSlop")) {
            if (config.getType("hitSlop") == ReadableType.Number) {
                float pixelFromDIP = PixelUtil.toPixelFromDIP(config.getDouble("hitSlop"));
                handler.F(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, Float.NaN, Float.NaN);
            } else {
                ReadableMap map = config.getMap("hitSlop");
                Intrinsics.checkNotNull(map);
                float pixelFromDIP2 = map.hasKey("horizontal") ? PixelUtil.toPixelFromDIP(map.getDouble("horizontal")) : Float.NaN;
                float pixelFromDIP3 = pixelFromDIP2;
                float pixelFromDIP4 = map.hasKey("vertical") ? PixelUtil.toPixelFromDIP(map.getDouble("vertical")) : Float.NaN;
                float pixelFromDIP5 = pixelFromDIP4;
                if (map.hasKey(ViewProps.LEFT)) {
                    pixelFromDIP2 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.LEFT));
                }
                if (map.hasKey(ViewProps.TOP)) {
                    pixelFromDIP4 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.TOP));
                }
                if (map.hasKey(ViewProps.RIGHT)) {
                    pixelFromDIP3 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.RIGHT));
                }
                if (map.hasKey(ViewProps.BOTTOM)) {
                    pixelFromDIP5 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.BOTTOM));
                }
                float pixelFromDIP6 = map.hasKey("width") ? PixelUtil.toPixelFromDIP(map.getDouble("width")) : Float.NaN;
                handler.F(pixelFromDIP2, pixelFromDIP4, pixelFromDIP3, pixelFromDIP5, pixelFromDIP6, map.hasKey("height") ? PixelUtil.toPixelFromDIP(map.getDouble("height")) : Float.NaN);
            }
        }
        if (config.hasKey("needsPointerData")) {
            handler.f11905s = config.getBoolean("needsPointerData");
        }
        if (config.hasKey("dispatchesAnimatedEvents")) {
            handler.f11906t = config.getBoolean("dispatchesAnimatedEvents");
        }
        if (config.hasKey("dispatchesReanimatedEvents")) {
            handler.f11907u = config.getBoolean("dispatchesReanimatedEvents");
        }
        if (config.hasKey("manualActivation")) {
            handler.A = config.getBoolean("manualActivation");
        }
        if (config.hasKey("mouseButton")) {
            handler.J = config.getInt("mouseButton");
        }
        if (config.hasKey(ViewProps.TEST_ID)) {
            handler.f11893e = config.getString(ViewProps.TEST_ID);
        }
        if (config.hasKey("cancelsJSResponder")) {
            handler.f11908v = config.getBoolean("cancelsJSResponder");
        }
    }

    public abstract im.f l(ReactApplicationContext reactApplicationContext);

    public abstract lm.b p(im.f fVar);

    public abstract String x();

    public abstract Class y();
}
