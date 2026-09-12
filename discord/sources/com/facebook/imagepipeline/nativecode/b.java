package com.facebook.imagepipeline.nativecode;

import a5.l0;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import com.discord.R;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.google.android.exoplayer2.metadata.Metadata;
import com.margelo.nitro.rive.ResolvedReferencedAsset;
import com.margelo.nitro.rive.p;
import d3.e;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kh.v;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import lq.b1;
import lq.z;
import mi.q;
import np.r;
import okio.Buffer;
import or.h0;
import or.s1;
import rs.d;
import so.i;
import so.o;
import vo.f;
import vo.u;
import wp.h;
import wp.k;
import yo.i0;
import yo.k0;
import yo.l;
import yo.q0;
import yo.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f4922a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f4923b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f4924c = 30000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f4925d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile boolean f4926e = true;

    public static final void A(View view, e eVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, eVar);
    }

    public static void B(d cursor, byte[] key) {
        long j;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i7 = 0;
        do {
            byte[] bArr = cursor.f19563w;
            int i10 = cursor.f19564x;
            int i11 = cursor.f19565y;
            if (bArr != null) {
                while (i10 < i11) {
                    int i12 = i7 % length;
                    bArr[i10] = (byte) (bArr[i10] ^ key[i12]);
                    i10++;
                    i7 = i12 + 1;
                }
            }
            long j5 = cursor.f19562v;
            Buffer buffer = cursor.f19559d;
            Intrinsics.checkNotNull(buffer);
            if (j5 == buffer.f17413e) {
                throw new IllegalStateException("no more bytes");
            }
            j = cursor.f19562v;
        } while (cursor.f(j == -1 ? 0L : j + ((long) (cursor.f19565y - cursor.f19564x))) != -1);
    }

    public static h C(Function1 changeOptions) {
        Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
        k kVar = new k();
        changeOptions.invoke(kVar);
        kVar.f22437a = true;
        return new h(kVar);
    }

    public static File D(Context context, String str, Uri uri) {
        String str2 = context.getCacheDir() + "/react-native-image-crop-picker";
        new File(str2).mkdir();
        File file = new File(new File(str2), str.substring(str.lastIndexOf(47) + 1));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            while (true) {
                int i7 = inputStreamOpenInputStream.read(bArr, 0, 8192);
                if (i7 <= 0) {
                    fileOutputStream.close();
                    inputStreamOpenInputStream.close();
                    return file;
                }
                fileOutputStream.write(bArr, 0, i7);
                fileOutputStream.flush();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return file;
        }
    }

    public static final or.d a(KSerializer elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new or.d(elementSerializer, 0);
    }

    public static final h0 b(KSerializer keySerializer, KSerializer valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new h0(keySerializer, valueSerializer, 1);
    }

    public static String c(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) {
            return "";
        }
        return strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }

    public static final ExecutorService d(boolean z5) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new v3.c(z5));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String f(u descriptor, int i7) {
        String strB;
        boolean z5 = (i7 & 1) != 0;
        boolean z6 = (i7 & 2) != 0;
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z6) {
            if (descriptor instanceof vo.k) {
                strB = "<init>";
            } else {
                strB = ((l) descriptor).getName().b();
                Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
            }
            sb2.append(strB);
        }
        sb2.append("(");
        t tVarV = descriptor.V();
        if (tVarV != null) {
            z type = tVarV.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(s(type));
        }
        Iterator it = descriptor.L().iterator();
        while (it.hasNext()) {
            z type2 = ((q0) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            sb2.append(s(type2));
        }
        sb2.append(")");
        if (z5) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (descriptor instanceof vo.k) {
                sb2.append("V");
            } else {
                z returnType = descriptor.getReturnType();
                Intrinsics.checkNotNull(returnType);
                if (returnType == null) {
                    i.a(142);
                    throw null;
                }
                up.e eVar = i.f20342e;
                if (i.E(returnType, o.f20368d)) {
                    z returnType2 = descriptor.getReturnType();
                    Intrinsics.checkNotNull(returnType2);
                    if (!b1.e(returnType2) && !(descriptor instanceof i0)) {
                        sb2.append("V");
                    }
                }
                z returnType3 = descriptor.getReturnType();
                Intrinsics.checkNotNull(returnType3);
                sb2.append(s(returnType3));
            }
        }
        return sb2.toString();
    }

    public static final String g(vo.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (!xp.e.o(bVar)) {
            vo.l lVarG = bVar.g();
            f fVar = lVarG instanceof f ? (f) lVarG : null;
            if (fVar != null && !fVar.getName().f21270e) {
                vo.b bVarA = bVar.a();
                k0 k0Var = bVarA instanceof k0 ? (k0) bVarA : null;
                if (k0Var != null) {
                    return c9.a.I(fVar, f(k0Var, 3));
                }
            }
        }
        return null;
    }

    public static mi.b h(String str, String str2) {
        fj.a aVar = new fj.a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(fj.a.class));
        return new mi.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new mi.a(0, aVar), hashSet3);
    }

    public static synchronized void k() {
        if (!f4922a) {
            ib.a.z("native-imagetranscoder");
            f4922a = true;
        }
    }

    public static final yn.a l(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new yn.a(entries);
    }

    public static mi.b m(String str, io.sentry.react.b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(fj.a.class));
        for (Class cls : new Class[0]) {
            l0.l(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        mi.i iVarA = mi.i.a(Context.class);
        if (hashSet.contains(iVarA.f15820a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(iVarA);
        return new mi.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new bc.i(13, str, bVar), hashSet3);
    }

    public static CallInvokerHolderImpl o(ReactApplicationContext reactApplicationContext) {
        try {
            try {
                return (CallInvokerHolderImpl) reactApplicationContext.getClass().getMethod("getJSCallInvokerHolder", null).invoke(reactApplicationContext, null);
            } catch (Exception e10) {
                throw new RuntimeException("Failed to get JSCallInvokerHolder", e10);
            }
        } catch (Exception unused) {
            Object objInvoke = reactApplicationContext.getClass().getMethod("getCatalystInstance", null).invoke(reactApplicationContext, null);
            return (CallInvokerHolderImpl) objInvoke.getClass().getMethod("getJSCallInvokerHolder", null).invoke(objInvoke, null);
        }
    }

    public static final KSerializer p(KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer.getDescriptor().e() ? kSerializer : new or.b1(kSerializer);
    }

    public static String q(Activity activity, Uri uri) throws Throwable {
        Throwable th2;
        Cursor cursor = null;
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
            return null;
        }
        if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
            return uri.getLastPathSegment();
        }
        try {
            Cursor cursorQuery = activity.getContentResolver().query(uri, new String[]{"_data", "_display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("_data");
                        if ((columnIndex > -1 ? cursorQuery.getString(columnIndex) : null) != null) {
                            String string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            return string;
                        }
                        String absolutePath = D(activity, cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name")), uri).getAbsolutePath();
                        cursorQuery.close();
                        return absolutePath;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th2;
                    }
                    cursor.close();
                    throw th2;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public static void r(Class cls, Object obj, ILogger iLogger) {
        iLogger.q(SentryLevel.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    public static final np.k s(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return (np.k) a.a.r(zVar, r.k, vq.d.f21939d);
    }

    public static TypedValue t(Context context, int i7) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static p u(ResolvedReferencedAsset asset) {
        Object objO;
        Intrinsics.checkNotNullParameter(asset, "asset");
        String sourceUrl = asset.getSourceUrl();
        if (sourceUrl != null) {
            return w(sourceUrl);
        }
        String sourceAssetId = asset.getSourceAssetId();
        if (sourceAssetId == null) {
            String nameWithExtension = asset.getSourceAsset();
            if (nameWithExtension == null) {
                return null;
            }
            Intrinsics.checkNotNullParameter(nameWithExtension, "nameWithExtension");
            return new com.margelo.nitro.rive.o(StringsKt.Z(nameWithExtension, nameWithExtension));
        }
        try {
            rn.q qVar = Result.f14614e;
            objO = Uri.parse(sourceAssetId).getScheme();
        } catch (Throwable th2) {
            rn.q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        return ((String) (objO instanceof rn.r ? null : objO)) != null ? w(sourceAssetId) : new com.margelo.nitro.rive.o(sourceAssetId);
    }

    public static boolean v(Context context, int i7, boolean z5) {
        TypedValue typedValueT = t(context, i7);
        if (typedValueT == null || typedValueT.type != 18) {
            return z5;
        }
        return typedValueT.data != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return new com.margelo.nitro.rive.n(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.margelo.nitro.rive.p w(java.lang.String r4) throws com.margelo.nitro.rive.h {
        /*
            rn.q r0 = kotlin.Result.f14614e     // Catch: java.lang.Throwable -> L8
            java.net.URI r0 = new java.net.URI     // Catch: java.lang.Throwable -> L8
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L8
            goto Lf
        L8:
            r0 = move-exception
            rn.q r1 = kotlin.Result.f14614e
            rn.r r0 = ib.a.o(r0)
        Lf:
            java.lang.Throwable r1 = kotlin.Result.a(r0)
            if (r1 != 0) goto L68
            java.net.URI r0 = (java.net.URI) r0
            java.lang.String r1 = r0.getScheme()
            if (r1 == 0) goto L62
            int r2 = r1.hashCode()
            r3 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r2 == r3) goto L47
            r0 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r0) goto L39
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 != r0) goto L62
            java.lang.String r0 = "https"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L62
            goto L41
        L39:
            java.lang.String r0 = "http"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L62
        L41:
            com.margelo.nitro.rive.n r0 = new com.margelo.nitro.rive.n
            r0.<init>(r4)
            goto L5b
        L47:
            java.lang.String r2 = "file"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L62
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L5c
            com.margelo.nitro.rive.m r4 = new com.margelo.nitro.rive.m
            r4.<init>(r0)
            r0 = r4
        L5b:
            return r0
        L5c:
            com.margelo.nitro.rive.h r0 = new com.margelo.nitro.rive.h
            r0.<init>(r4)
            throw r0
        L62:
            com.margelo.nitro.rive.h r0 = new com.margelo.nitro.rive.h
            r0.<init>(r4)
            throw r0
        L68:
            com.margelo.nitro.rive.h r0 = new com.margelo.nitro.rive.h
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.nativecode.b.w(java.lang.String):com.margelo.nitro.rive.p");
    }

    public static TypedValue x(Context context, String str, int i7) {
        TypedValue typedValueT = t(context, i7);
        if (typedValueT != null) {
            return typedValueT;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i7)));
    }

    public static final Object y(Set set, Enum r5, Enum r6, Enum r7, boolean z5) {
        Set setL0;
        Enum r10;
        if (!z5) {
            if (r7 != null && (setL0 = CollectionsKt.l0(f1.e(set, r7))) != null) {
                set = setL0;
            }
            return CollectionsKt.a0(set);
        }
        if (set.contains(r5)) {
            r10 = r5;
        } else {
            r10 = set.contains(r6) ? r6 : null;
        }
        if (Intrinsics.areEqual(r10, r5) && Intrinsics.areEqual(r7, r6)) {
            return null;
        }
        return r7 == null ? r10 : r7;
    }

    public static final void z(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        s1 s1Var = s1.f17602a;
    }

    public abstract String e();

    public Metadata i(cd.d dVar) {
        ByteBuffer byteBuffer = dVar.f15010v;
        byteBuffer.getClass();
        je.b.g(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.c(Integer.MIN_VALUE)) {
            return null;
        }
        return j(dVar, byteBuffer);
    }

    public abstract Metadata j(cd.d dVar, ByteBuffer byteBuffer);

    public abstract void n(v vVar, float f2, float f7);
}
