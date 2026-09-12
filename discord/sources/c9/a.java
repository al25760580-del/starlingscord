package c9;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.webkit.MimeTypeMap;
import bh.t;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.j1;
import com.google.android.gms.internal.play_billing.k1;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.reactnativecommunity.clipboard.ClipboardModule;
import fe.p;
import io.sentry.v4;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.d0;
import lq.d1;
import lq.e1;
import lq.i0;
import lq.q0;
import lq.s;
import lq.t0;
import lq.z;
import mq.d;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import rn.n;
import sn.e;
import vo.f;
import vo.g;
import vo.j;
import vo.r0;
import wo.h;
import wo.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f3531a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f3532b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor f3533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f3534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f3535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Constructor f3536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f3537g;

    public static final boolean A(z zVar, z superType) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return d.f16016a.b(zVar, superType);
    }

    public static final d1 B(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (zVar == null) {
            b1.a(1);
            throw null;
        }
        d1 d1VarG = b1.g(zVar, true);
        Intrinsics.checkNotNullExpressionValue(d1VarG, "makeNullable(...)");
        return d1VarG;
    }

    public static void C() throws ClassNotFoundException {
        if (f3533c == null || f3534d == null || f3535e == null) {
            Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
            f3533c = cls.getConstructor(null);
            f3534d = cls.getMethod("setRotationDegrees", Float.TYPE);
            f3535e = cls.getMethod("build", null);
        }
        if (f3536f == null || f3537g == null) {
            Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
            f3536f = cls2.getConstructor(null);
            f3537g = cls2.getMethod("build", null);
        }
    }

    public static final List D(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(StackTraceHelper.ID_KEY);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        e eVarB = c0.b();
        while (cursor.moveToNext()) {
            int i7 = cursor.getInt(columnIndex);
            int i10 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            eVarB.add(new c3.c(i7, i10, string, string2));
        }
        return CollectionsKt.d0(c0.a(eVarB));
    }

    public static final c3.d E(h3.c cVar, String str, boolean z5) throws IOException {
        Cursor cursorZ = cVar.z("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorZ.getColumnIndex("seqno");
            int columnIndex2 = cursorZ.getColumnIndex("cid");
            int columnIndex3 = cursorZ.getColumnIndex(StackTraceHelper.NAME_KEY);
            int columnIndex4 = cursorZ.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorZ.moveToNext()) {
                    if (cursorZ.getInt(columnIndex2) >= 0) {
                        int i7 = cursorZ.getInt(columnIndex);
                        String columnName = cursorZ.getString(columnIndex3);
                        String str2 = cursorZ.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i7);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i7), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
                List listI0 = CollectionsKt.i0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
                c3.d dVar = new c3.d(str, z5, listI0, CollectionsKt.i0(collectionValues2));
                cursorZ.close();
                return dVar;
            }
            cursorZ.close();
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(cursorZ, th2);
                throw th3;
            }
        }
    }

    public static final z F(z zVar, h newAnnotations) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return (zVar.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? zVar : zVar.w0().z0(lq.c.r(zVar.q0(), newAnnotations));
    }

    public static final d1 G(z zVar) {
        d0 d0Var;
        d1 d1VarQ;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        d1 d1VarW0 = zVar.w0();
        if (d1VarW0 instanceof s) {
            s sVar = (s) d1VarW0;
            d0 d0VarQ = sVar.f15248e;
            if (!d0VarQ.r0().getParameters().isEmpty() && d0VarQ.r0().g() != null) {
                List parameters = d0VarQ.r0().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                ArrayList arrayList = new ArrayList(e0.l(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new i0((r0) it.next()));
                }
                d0VarQ = lq.c.q(d0VarQ, arrayList, null, 2);
            }
            d0 d0VarQ2 = sVar.f15249i;
            if (!d0VarQ2.r0().getParameters().isEmpty() && d0VarQ2.r0().g() != null) {
                List parameters2 = d0VarQ2.r0().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                ArrayList arrayList2 = new ArrayList(e0.l(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new i0((r0) it2.next()));
                }
                d0VarQ2 = lq.c.q(d0VarQ2, arrayList2, null, 2);
            }
            d1VarQ = lq.c.e(d0VarQ, d0VarQ2);
        } else {
            if (!(d1VarW0 instanceof d0)) {
                throw new n();
            }
            d0Var = (d0) d1VarW0;
            if (!d0Var.r0().getParameters().isEmpty() && d0Var.r0().g() != null) {
                d1VarQ = d0Var;
                d1VarQ = d0Var;
                List parameters3 = d0Var.r0().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
                ArrayList arrayList3 = new ArrayList(e0.l(parameters3, 10));
                Iterator it3 = parameters3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new i0((r0) it3.next()));
                }
                d1VarQ = lq.c.q(d0Var, arrayList3, null, 2);
            }
        }
        d1VarQ = d0Var;
        d1VarQ = d0Var;
        d1VarQ = d0Var;
        return lq.c.h(d1VarQ, d1VarW0);
    }

    public static void H(Uri uri, UUID uuid, Context context, String str) {
        Uri uriInsert;
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            contentValues.put("_display_name", uuid.toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            uriInsert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            contentValues.put("_display_name", uuid.toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
        j(uri, uriInsert, contentResolver);
    }

    public static final String I(f classDescriptor, String jvmDescriptor) {
        String internalName;
        Intrinsics.checkNotNullParameter(np.f.f17000e, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        String str = uo.d.f21197a;
        up.b bVarF = uo.d.f(bq.e.g(classDescriptor).f21262a);
        if (bVarF != null) {
            internalName = cq.b.e(bVarF);
            Intrinsics.checkNotNullExpressionValue(internalName, "internalNameByClassId(...)");
        } else {
            internalName = a.a.b(classDescriptor, np.f.f17001f);
        }
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }

    public static RectF J(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i7 = 1; i7 < fArr.length; i7 += 2) {
            float fRound = Math.round(fArr[i7 - 1] * 10.0f) / 10.0f;
            float fRound2 = Math.round(fArr[i7] * 10.0f) / 10.0f;
            float f2 = rectF.left;
            if (fRound < f2) {
                f2 = fRound;
            }
            rectF.left = f2;
            float f7 = rectF.top;
            if (fRound2 < f7) {
                f7 = fRound2;
            }
            rectF.top = f7;
            float f10 = rectF.right;
            if (fRound <= f10) {
                fRound = f10;
            }
            rectF.right = fRound;
            float f11 = rectF.bottom;
            if (fRound2 <= f11) {
                fRound2 = f11;
            }
            rectF.bottom = fRound2;
        }
        rectF.sort();
        return rectF;
    }

    public static final void K(BottomSheetBehavior bottomSheetBehavior, Integer num, boolean z5, Boolean bool) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.J = true;
        bottomSheetBehavior.D(true);
        if (z5) {
            bottomSheetBehavior.G(3);
        }
        bottomSheetBehavior.f6285l = num.intValue();
        if (bool != null) {
            bottomSheetBehavior.f6287n = bool.booleanValue();
        }
    }

    public static final void L(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, Float f2, Integer num4, Boolean bool) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.J = false;
        bottomSheetBehavior.D(false);
        if (num != null) {
            bottomSheetBehavior.G(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.F(num2.intValue());
        }
        if (f2 != null) {
            bottomSheetBehavior.E(f2.floatValue());
        }
        if (num4 != null) {
            bottomSheetBehavior.C(num4.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.f6285l = num3.intValue();
        }
        if (bool != null) {
            bottomSheetBehavior.f6287n = bool.booleanValue();
        }
    }

    public static /* synthetic */ void M(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Float f2, Integer num3, Boolean bool, int i7) {
        Integer num4 = (i7 & 1) != 0 ? null : 3;
        if ((i7 & 2) != 0) {
            num = null;
        }
        if ((i7 & 4) != 0) {
            num2 = null;
        }
        if ((i7 & 8) != 0) {
            f2 = null;
        }
        if ((i7 & 16) != 0) {
            num3 = null;
        }
        Boolean bool2 = (i7 & 32) != 0 ? null : bool;
        L(bottomSheetBehavior, num4, num, num2, f2, num3, bool2);
    }

    public static final void N(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, Boolean bool) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.J = false;
        bottomSheetBehavior.D(true);
        if (num != null) {
            bottomSheetBehavior.G(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.F(num2.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.f6285l = num3.intValue();
        }
        if (bool != null) {
            bottomSheetBehavior.f6287n = bool.booleanValue();
        }
    }

    public static /* synthetic */ void O(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Boolean bool, int i7) {
        Integer num3 = (i7 & 1) != 0 ? null : 3;
        if ((i7 & 2) != 0) {
            num = null;
        }
        if ((i7 & 4) != 0) {
            num2 = null;
        }
        if ((i7 & 8) != 0) {
            bool = null;
        }
        N(bottomSheetBehavior, num3, num, num2, bool);
    }

    public static Bundle P(k1 k1Var, d3 d3Var) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("REQUEST_METADATA", k1Var.b());
        bundle.putByteArray("REQUEST_PARAMS", d3Var.b());
        return bundle;
    }

    public static String Q(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i7 >= length || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, iIndexOf);
            sb2.append(S(objArr[i7]));
            i10 = iIndexOf + 2;
            i7++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i7 < length) {
            String str2 = " [";
            while (i7 < objArr.length) {
                sb2.append(str2);
                sb2.append(S(objArr[i7]));
                i7++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static k1 R(Context context) {
        String strValueOf;
        j1 j1VarR = k1.r();
        j1VarR.c();
        k1.v((k1) j1VarR.f5994e);
        j1VarR.c();
        k1.w((k1) j1VarR.f5994e);
        String packageName = context.getPackageName();
        j1VarR.c();
        k1.t((k1) j1VarR.f5994e, packageName);
        j1VarR.c();
        k1.u((k1) j1VarR.f5994e);
        try {
            strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            r.h("DelegationApiParamsBuilder", "No version code is found!");
            strValueOf = null;
        }
        if (strValueOf != null) {
            j1VarR.c();
            k1.s((k1) j1VarR.f5994e, strValueOf);
        }
        return (k1) j1VarR.a();
    }

    public static String S(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strO = a3.e.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strO), (Throwable) e10);
            String name2 = e10.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strO.length() + 8 + name2.length() + 1);
            a3.e.A(sb2, "<", strO, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final long a(float f2, float f7) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f7)) & 4294967295L) | (Float.floatToIntBits(f2) << 32);
        int i7 = b0.a.f3014b;
        return jFloatToIntBits;
    }

    public static void b(PackageManager packageManager, ComponentName componentName) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 516);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i7 = 0;
                    loop0: while (true) {
                        if (i7 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i7];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                componentInfo = componentInfoArr2[i10];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                        }
                        i7++;
                    }
                    if (componentInfo != null && componentInfo.isEnabled()) {
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    public static void c(String str) {
        v4.d().a(str);
    }

    public static final i0 e(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return new i0(zVar);
    }

    public static void f(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final h g(h first, h second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new i(new h[]{first, second});
    }

    public static final boolean h(z zVar, q0 q0Var, Set set) {
        boolean zH;
        if (Intrinsics.areEqual(zVar.r0(), q0Var)) {
            return true;
        }
        vo.i iVarG = zVar.r0().g();
        j jVar = iVarG instanceof j ? (j) iVarG : null;
        List listL = jVar != null ? jVar.l() : null;
        Iterable iterableM0 = CollectionsKt.m0(zVar.l0());
        if (!(iterableM0 instanceof Collection) || !((Collection) iterableM0).isEmpty()) {
            Iterator it = iterableM0.iterator();
            do {
                kotlin.collections.r0 r0Var = (kotlin.collections.r0) it;
                if (r0Var.f14666e.hasNext()) {
                    IndexedValue indexedValue = (IndexedValue) r0Var.next();
                    int i7 = indexedValue.f14622a;
                    t0 t0Var = (t0) indexedValue.f14623b;
                    r0 r0Var2 = listL != null ? (r0) CollectionsKt.M(i7, listL) : null;
                    if ((r0Var2 == null || set == null || !set.contains(r0Var2)) && !t0Var.c()) {
                        z zVarB = t0Var.b();
                        Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
                        zH = h(zVarB, q0Var, set);
                    } else {
                        zH = false;
                    }
                }
            } while (!zH);
            return true;
        }
        return false;
    }

    public static Float i(String str) {
        String[] strArrSplit = str.split(",", 3);
        String[] strArrSplit2 = strArrSplit[0].split("/", 2);
        double dDoubleValue = Double.valueOf(strArrSplit2[0]).doubleValue() / Double.valueOf(strArrSplit2[1]).doubleValue();
        String[] strArrSplit3 = strArrSplit[1].split("/", 2);
        double dDoubleValue2 = Double.valueOf(strArrSplit3[0]).doubleValue() / Double.valueOf(strArrSplit3[1]).doubleValue();
        String[] strArrSplit4 = strArrSplit[2].split("/", 2);
        return Float.valueOf((float) (((Double.valueOf(strArrSplit4[0]).doubleValue() / Double.valueOf(strArrSplit4[1]).doubleValue()) / 3600.0d) + (dDoubleValue2 / 60.0d) + dDoubleValue));
    }

    public static void j(Uri uri, Uri uri2, ContentResolver contentResolver) {
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri2);
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            byte[] bArr = new byte[8192];
            while (true) {
                int i7 = inputStreamOpenInputStream.read(bArr);
                if (i7 == -1) {
                    return;
                } else {
                    outputStreamOpenOutputStream.write(bArr, 0, i7);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public static t k(p pVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = pVar.length();
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (pVar.a(i10, jElapsedRealtime)) {
                i7++;
            }
        }
        return new t(1, 0, length, i7);
    }

    public static File l(Context context, UUID uuid, String str) {
        if (uuid == null) {
            try {
                uuid = UUID.randomUUID();
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
        File file = new File(context.getCacheDir(), "rn_image_picker_lib_temp_" + uuid + "." + str);
        file.createNewFile();
        return file;
    }

    public static final i0 m(z type, e1 projectionKind, r0 r0Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(projectionKind, "projectionKind");
        if ((r0Var != null ? r0Var.getVariance() : null) == projectionKind) {
            projectionKind = e1.INVARIANT;
        }
        return new i0(type, projectionKind);
    }

    public static final void n(z zVar, z zVar2, LinkedHashSet linkedHashSet, Set set) {
        vo.i iVarG = zVar.r0().g();
        if (iVarG instanceof r0) {
            if (!Intrinsics.areEqual(zVar.r0(), zVar2.r0())) {
                linkedHashSet.add(iVarG);
                return;
            }
            for (z zVar3 : ((r0) iVarG).getUpperBounds()) {
                Intrinsics.checkNotNull(zVar3);
                n(zVar3, zVar2, linkedHashSet, set);
            }
            return;
        }
        vo.i iVarG2 = zVar.r0().g();
        j jVar = iVarG2 instanceof j ? (j) iVarG2 : null;
        List listL = jVar != null ? jVar.l() : null;
        int i7 = 0;
        for (t0 t0Var : zVar.l0()) {
            int i10 = i7 + 1;
            r0 r0Var = listL != null ? (r0) CollectionsKt.M(i7, listL) : null;
            if ((r0Var == null || set == null || !set.contains(r0Var)) && !t0Var.c() && !CollectionsKt.E(linkedHashSet, t0Var.b().r0().g()) && !Intrinsics.areEqual(t0Var.b().r0(), zVar2.r0())) {
                z zVarB = t0Var.b();
                Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
                n(zVarB, zVar2, linkedHashSet, set);
            }
            i7 = i10;
        }
    }

    public static final so.i o(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        so.i iVarF = zVar.r0().f();
        Intrinsics.checkNotNullExpressionValue(iVarF, "getBuiltIns(...)");
        return iVarF;
    }

    public static byte[] p(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = v1.i.f21367a;
        String str = jSONObject.optString("challenge", "");
        Intrinsics.checkNotNull(str);
        if (str.length() == 0) {
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }
        Intrinsics.checkNotNullParameter(str, "str");
        byte[] bArrDecode = Base64.decode(str, 11);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return bArrDecode;
    }

    public static WritableMap q(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("errorCode", str);
        if (str2 != null) {
            writableMapCreateMap.putString("errorMessage", str2);
        }
        return writableMapCreateMap;
    }

    public static int[] r(Context context, Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return new int[]{0, 0};
        }
    }

    public static ImagePipeline s() {
        com.facebook.imagepipeline.core.c cVar = com.facebook.imagepipeline.core.c.f4894p;
        n8.i.d(cVar, "ImagePipelineFactory was not initialized!");
        return cVar.e();
    }

    public static String t(Context context, Uri uri) {
        return uri.getScheme().equals("file") ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString())) : context.getContentResolver().getType(uri);
    }

    public static final z u(r0 r0Var) {
        Object obj;
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        List upperBounds = r0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = r0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            vo.i iVarG = ((z) next).r0().g();
            f fVar = iVarG instanceof f ? (f) iVarG : null;
            if (fVar != null && fVar.c() != g.f21809e && fVar.c() != g.f21812w) {
                obj = next;
                break;
            }
        }
        z zVar = (z) obj;
        if (zVar != null) {
            return zVar;
        }
        List upperBounds3 = r0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds3, "getUpperBounds(...)");
        Object objK = CollectionsKt.K(upperBounds3);
        Intrinsics.checkNotNullExpressionValue(objK, "first(...)");
        return (z) objK;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0226  */
    /* JADX WARN: Code duplicated, block: B:120:0x0269  */
    /* JADX WARN: Code duplicated, block: B:131:0x027e A[Catch: IOException -> 0x027a, TRY_LEAVE, TryCatch #1 {IOException -> 0x027a, blocks: (B:109:0x0249, B:131:0x027e, B:127:0x0279, B:126:0x0276, B:111:0x0253, B:123:0x0271), top: B:222:0x0249, inners: #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0303 A[Catch: IOException -> 0x030b, TRY_LEAVE, TryCatch #7 {IOException -> 0x030b, blocks: (B:144:0x02fc, B:146:0x0303), top: B:232:0x02fc }] */
    /* JADX WARN: Code duplicated, block: B:157:0x032b  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:234:0x02eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x030f A[EDGE_INSN: B:262:0x030f->B:150:0x030f BREAK  A[LOOP:1: B:232:0x02fc->B:147:0x0308], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x015d  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:96:0x0204 A[Catch: Exception -> 0x0209, TRY_LEAVE, TryCatch #4 {Exception -> 0x0209, blocks: (B:94:0x01f2, B:96:0x0204), top: B:226:0x01f2, outer: #16 }] */
    public static WritableMap v(List list, UUID uuid, com.imagepicker.b bVar, Context context) {
        String str;
        Context context2;
        WritableArray writableArray;
        String str2;
        Bitmap frameAtTime;
        String str3;
        int i7;
        int height;
        double statSize;
        String str4;
        String str5;
        String str6;
        String lastPathSegment;
        String str7;
        int i10;
        int i11;
        WritableMap writableMapCreateMap;
        double statSize2;
        InputStream inputStreamOpenInputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        int i12;
        InputStream inputStreamOpenInputStream2;
        int iC;
        String strB;
        String str8;
        Date date;
        SimpleDateFormat simpleDateFormat;
        int[] iArr;
        String str9;
        String str10;
        com.imagepicker.b bVar2 = bVar;
        Context context3 = context;
        String str11 = "Orientation";
        String str12 = bVar2.f6867l;
        Boolean bool = bVar2.f6860c;
        boolean zEquals = str12.equals("photo");
        String str13 = bVar2.f6867l;
        boolean zEquals2 = str13.equals(MediaStreamTrack.VIDEO_TRACK_KIND);
        boolean zEquals3 = str13.equals("mixed");
        boolean zEquals4 = str13.equals("any");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int i13 = 0;
        while (i13 < list.size()) {
            Uri uriFromFile = (Uri) list.get(i13);
            String strT = t(context3, uriFromFile);
            int i14 = 0;
            Boolean bool2 = bool;
            boolean z5 = zEquals;
            boolean z6 = zEquals2;
            boolean z7 = zEquals3;
            boolean z10 = zEquals4;
            int i15 = i13;
            String strEncodeToString = null;
            WritableArray writableArray2 = writableArrayCreateArray;
            if ((strT != null ? strT.contains("image/") : false) && (z5 || z7)) {
                if (uriFromFile.getScheme().contains("content")) {
                    ContentResolver contentResolver = context3.getContentResolver();
                    String type = contentResolver.getType(uriFromFile);
                    if (type == null) {
                        str10 = "jpg";
                    } else if (type.equals("image/gif")) {
                        str10 = "gif";
                    } else if (type.equals(ClipboardModule.MIMETYPE_PNG)) {
                        str10 = "png";
                    } else {
                        str10 = "jpg";
                    }
                    Uri uriFromFile2 = Uri.fromFile(l(context3, uuid, str10));
                    j(uriFromFile, uriFromFile2, contentResolver);
                    uriFromFile = uriFromFile2;
                }
                try {
                    try {
                        int[] iArrR = r(context3, uriFromFile);
                        int i16 = iArrR[0];
                        int i17 = iArrR[1];
                        str5 = "fileName";
                        try {
                            int i18 = bVar2.f6863f;
                            str4 = "fileSize";
                            try {
                                int i19 = bVar2.f6862e;
                                str6 = "r";
                                try {
                                    int i20 = bVar2.f6864g;
                                    if (((i18 != 0 && i20 != 0) || i19 != 100) && (i18 < i16 || i20 < i17 || i19 != 100)) {
                                        if (i18 == 0 || i20 == 0) {
                                            iArr = new int[]{i16, i17};
                                        } else {
                                            if (i18 < i16) {
                                                i17 = (int) ((i18 / i16) * i17);
                                                i16 = i18;
                                            }
                                            if (i20 < i17) {
                                                i16 = (int) ((i20 / i17) * i16);
                                            } else {
                                                i20 = i17;
                                            }
                                            iArr = new int[]{i16, i20};
                                        }
                                        InputStream inputStreamOpenInputStream3 = context3.getContentResolver().openInputStream(uriFromFile);
                                        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uriFromFile.toString()));
                                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream3), iArr[0], iArr[1], true);
                                        String strB2 = new n2.h(context3.getContentResolver().openInputStream(uriFromFile)).b(str11);
                                        if (mimeTypeFromExtension == null) {
                                            str9 = "jpg";
                                        } else if (mimeTypeFromExtension.equals("image/gif")) {
                                            str9 = "gif";
                                        } else if (mimeTypeFromExtension.equals(ClipboardModule.MIMETYPE_PNG)) {
                                            str9 = "png";
                                        } else {
                                            str9 = "jpg";
                                        }
                                        File fileL = l(context3, uuid, str9);
                                        OutputStream outputStreamOpenOutputStream = context3.getContentResolver().openOutputStream(Uri.fromFile(fileL));
                                        mimeTypeFromExtension.getClass();
                                        Bitmap.CompressFormat compressFormat = (mimeTypeFromExtension.equals(ClipboardModule.MIMETYPE_JPEG) || !mimeTypeFromExtension.equals(ClipboardModule.MIMETYPE_PNG)) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG;
                                        bitmapCreateScaledBitmap.compress(compressFormat, i19, outputStreamOpenOutputStream);
                                        if (!strB2.equals(String.valueOf(1)) && !strB2.equals(String.valueOf(0))) {
                                            n2.h hVar = new n2.h(fileL);
                                            hVar.F(str11, strB2);
                                            hVar.B();
                                        }
                                        uriFromFile = Uri.fromFile(fileL);
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    e.printStackTrace();
                                }
                            } catch (Exception e11) {
                                e = e11;
                                str6 = "r";
                                e.printStackTrace();
                                lastPathSegment = uriFromFile.getLastPathSegment();
                                strB = new n2.h(context3.getContentResolver().openInputStream(uriFromFile)).b("DateTime");
                                if (strB != null) {
                                    try {
                                        Locale locale = Locale.US;
                                        date = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).parse(strB);
                                        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
                                        if (date != null) {
                                            str8 = simpleDateFormat.format(date);
                                        } else {
                                            str8 = null;
                                        }
                                    } catch (Exception e12) {
                                        Log.e("RNIP", "Could not parse image datetime to UTC: " + e12.getMessage());
                                    }
                                    str7 = str8;
                                } else {
                                    str7 = null;
                                }
                                int[] iArrR2 = r(context3, uriFromFile);
                                i10 = iArrR2[0];
                                i11 = iArrR2[1];
                                inputStreamOpenInputStream2 = context3.getContentResolver().openInputStream(uriFromFile);
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        iC = new n2.h(inputStreamOpenInputStream2).c();
                                        if (iC != 6) {
                                            i11 = i10;
                                            i10 = i11;
                                        } else {
                                            i11 = i10;
                                            i10 = i11;
                                        }
                                    } catch (Throwable th2) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                }
                                if (inputStreamOpenInputStream2 != null) {
                                    inputStreamOpenInputStream2.close();
                                }
                                int[] iArr2 = {i10, i11};
                                writableMapCreateMap = Arguments.createMap();
                                writableMapCreateMap.putString("uri", uriFromFile.toString());
                                statSize2 = context3.getContentResolver().openFileDescriptor(uriFromFile, str6).getStatSize();
                                writableMapCreateMap.putDouble(str4, statSize2);
                                writableMapCreateMap.putString(str5, lastPathSegment);
                                writableMapCreateMap.putString("type", MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uriFromFile.toString())));
                                writableMapCreateMap.putInt("width", iArr2[0]);
                                writableMapCreateMap.putInt("height", iArr2[1]);
                                writableMapCreateMap.putString("type", t(context3, uriFromFile));
                                if (bVar.f6859b.booleanValue()) {
                                    try {
                                        inputStreamOpenInputStream = context3.getContentResolver().openInputStream(uriFromFile);
                                        bArr = new byte[8192];
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        while (true) {
                                            try {
                                                i12 = inputStreamOpenInputStream.read(bArr);
                                                if (i12 != -1) {
                                                    break;
                                                }
                                                byteArrayOutputStream.write(bArr, i14, i12);
                                                i14 = 0;
                                            } catch (IOException e13) {
                                                e13.printStackTrace();
                                            }
                                        }
                                        strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                                    } catch (FileNotFoundException e14) {
                                        e14.printStackTrace();
                                    }
                                    writableMapCreateMap.putString("base64", strEncodeToString);
                                }
                                if (bool2.booleanValue()) {
                                    writableMapCreateMap.putString("timestamp", str7);
                                    writableMapCreateMap.putString(StackTraceHelper.ID_KEY, lastPathSegment);
                                }
                                writableArray = writableArray2;
                                writableArray.pushMap(writableMapCreateMap);
                                context2 = context3;
                                str = str11;
                                i13 = i15 + 1;
                                context3 = context2;
                                writableArrayCreateArray = writableArray;
                                bool = bool2;
                                zEquals = z5;
                                zEquals2 = z6;
                                zEquals3 = z7;
                                zEquals4 = z10;
                                str11 = str;
                                bVar2 = bVar;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            str4 = "fileSize";
                        }
                    } catch (Exception e16) {
                        e = e16;
                        str4 = "fileSize";
                        str5 = "fileName";
                    }
                    inputStreamOpenInputStream2 = context3.getContentResolver().openInputStream(uriFromFile);
                    if (inputStreamOpenInputStream2 != null) {
                        iC = new n2.h(inputStreamOpenInputStream2).c();
                        if (iC != 6 || iC == 8 || iC == 5 || iC == 7) {
                            i11 = i10;
                            i10 = i11;
                        }
                    }
                    if (inputStreamOpenInputStream2 != null) {
                        inputStreamOpenInputStream2.close();
                    }
                } catch (IOException e17) {
                    e17.printStackTrace();
                }
                lastPathSegment = uriFromFile.getLastPathSegment();
                try {
                    strB = new n2.h(context3.getContentResolver().openInputStream(uriFromFile)).b("DateTime");
                    if (strB != null) {
                        Locale locale2 = Locale.US;
                        date = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale2).parse(strB);
                        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale2);
                        if (date != null) {
                            str8 = simpleDateFormat.format(date);
                        } else {
                            str8 = null;
                        }
                        str7 = str8;
                    } else {
                        str7 = null;
                    }
                } catch (Exception e18) {
                    Log.e("RNIP", "Could not load image metadata: " + e18.getMessage());
                    str7 = null;
                }
                int[] iArrR3 = r(context3, uriFromFile);
                i10 = iArrR3[0];
                i11 = iArrR3[1];
                int[] iArr3 = {i10, i11};
                writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("uri", uriFromFile.toString());
                try {
                    statSize2 = context3.getContentResolver().openFileDescriptor(uriFromFile, str6).getStatSize();
                } catch (Exception e19) {
                    e19.printStackTrace();
                    statSize2 = 0.0d;
                }
                writableMapCreateMap.putDouble(str4, statSize2);
                writableMapCreateMap.putString(str5, lastPathSegment);
                writableMapCreateMap.putString("type", MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uriFromFile.toString())));
                writableMapCreateMap.putInt("width", iArr3[0]);
                writableMapCreateMap.putInt("height", iArr3[1]);
                writableMapCreateMap.putString("type", t(context3, uriFromFile));
                if (bVar.f6859b.booleanValue()) {
                    inputStreamOpenInputStream = context3.getContentResolver().openInputStream(uriFromFile);
                    bArr = new byte[8192];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        i12 = inputStreamOpenInputStream.read(bArr);
                        if (i12 != -1) {
                            break;
                            break;
                        }
                        byteArrayOutputStream.write(bArr, i14, i12);
                        i14 = 0;
                    }
                    strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    writableMapCreateMap.putString("base64", strEncodeToString);
                }
                if (bool2.booleanValue()) {
                    writableMapCreateMap.putString("timestamp", str7);
                    writableMapCreateMap.putString(StackTraceHelper.ID_KEY, lastPathSegment);
                }
                writableArray = writableArray2;
                writableArray.pushMap(writableMapCreateMap);
                context2 = context3;
                str = str11;
            } else {
                str = str11;
                String strT2 = t(context3, uriFromFile);
                if ((strT2 != null ? strT2.contains("video/") : false) && (z6 || z7)) {
                    String strK = android.support.v4.media.session.b.k(context3.getContentResolver(), uriFromFile);
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(context3, uriFromFile);
                    try {
                        str2 = "height";
                        try {
                            mediaMetadataRetriever.setDataSource(new FileInputStream(context3.getContentResolver().openFileDescriptor(uriFromFile, "r").getFileDescriptor()).getFD());
                            frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                        } catch (IOException e20) {
                            e = e20;
                            Log.e("RNIP", "Could not retrieve width and height from video: " + e.getMessage());
                            frameAtTime = null;
                        } catch (RuntimeException e21) {
                            e = e21;
                            Log.e("RNIP", "Could not retrieve width and height from video: " + e.getMessage());
                            frameAtTime = null;
                        }
                    } catch (IOException | RuntimeException e22) {
                        e = e22;
                        str2 = "height";
                    }
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
                    Bitmap bitmap = frameAtTime;
                    String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(5);
                    int iRound = strExtractMetadata != null ? Math.round(Float.parseFloat(strExtractMetadata)) / 1000 : 0;
                    int i21 = strExtractMetadata2 != 0 ? Integer.parseInt(strExtractMetadata2) : 0;
                    if (strExtractMetadata3 != null) {
                        str3 = "type";
                        String strReplace = strExtractMetadata3.substring(0, strExtractMetadata3.indexOf(".")).replace("T", " ");
                        try {
                            Locale locale3 = Locale.US;
                            Date date2 = new SimpleDateFormat("yyyyMMdd HHmmss", locale3).parse(strReplace);
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale3);
                            if (date2 != null) {
                                strEncodeToString = simpleDateFormat2.format(date2);
                            }
                        } catch (Exception e23) {
                            Log.e("RNIP", "Could not parse image datetime to UTC: " + e23.getMessage());
                        }
                    } else {
                        str3 = "type";
                    }
                    String str14 = strEncodeToString;
                    if (bitmap != null) {
                        int width = bitmap.getWidth();
                        height = bitmap.getHeight();
                        i7 = width;
                    } else {
                        i7 = 0;
                        height = 0;
                    }
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException e24) {
                        Log.e("RNIP", "Could not release metadata retriever: " + e24.getMessage());
                    }
                    writableMapCreateMap2.putString("uri", uriFromFile.toString());
                    try {
                        statSize = context.getContentResolver().openFileDescriptor(uriFromFile, "r").getStatSize();
                    } catch (Exception e25) {
                        e25.printStackTrace();
                        statSize = 0.0d;
                    }
                    writableMapCreateMap2.putDouble("fileSize", statSize);
                    writableMapCreateMap2.putInt("duration", iRound);
                    writableMapCreateMap2.putInt("bitrate", i21);
                    writableMapCreateMap2.putString("fileName", strK);
                    context2 = context;
                    writableMapCreateMap2.putString(str3, t(context2, uriFromFile));
                    writableMapCreateMap2.putInt("width", i7);
                    writableMapCreateMap2.putInt(str2, height);
                    if (bool2.booleanValue()) {
                        writableMapCreateMap2.putString("timestamp", str14);
                        writableMapCreateMap2.putString(StackTraceHelper.ID_KEY, strK);
                    }
                    writableArray = writableArray2;
                    writableArray.pushMap(writableMapCreateMap2);
                } else {
                    context2 = context3;
                    writableArray = r2;
                    if (!z10) {
                        throw new RuntimeException("Unsupported file type");
                    }
                    String strK2 = android.support.v4.media.session.b.k(context2.getContentResolver(), uriFromFile);
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putString("uri", uriFromFile.toString());
                    writableMapCreateMap3.putString("fileName", strK2);
                    writableMapCreateMap3.putString("mimeType", t(context2, uriFromFile));
                    writableArray.pushMap(writableMapCreateMap3);
                }
            }
            i13 = i15 + 1;
            context3 = context2;
            writableArrayCreateArray = writableArray;
            bool = bool2;
            zEquals = z5;
            zEquals2 = z6;
            zEquals3 = z7;
            zEquals4 = z10;
            str11 = str;
            bVar2 = bVar;
        }
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putArray("assets", writableArrayCreateArray);
        return writableMapCreateMap4;
    }

    public static final Bundle w(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalArgumentException(s0.g.e("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final boolean x(r0 typeParameter, q0 q0Var, Set set) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        List<z> upperBounds = typeParameter.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        if (upperBounds != null && upperBounds.isEmpty()) {
            return false;
        }
        for (z zVar : upperBounds) {
            Intrinsics.checkNotNull(zVar);
            if (h(zVar, typeParameter.j().r0(), set) && (q0Var == null || Intrinsics.areEqual(zVar.r0(), q0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean y(r0 r0Var, q0 q0Var, int i7) {
        if ((i7 & 2) != 0) {
            q0Var = null;
        }
        return x(r0Var, q0Var, null);
    }

    public static void z(Context context, ImagePipelineConfig imagePipelineConfig, u4.c cVar) {
        sa.a.w();
        if (f3532b) {
            o8.a.r(a.class, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f3532b = true;
        }
        if (!ib.a.y()) {
            sa.a.w();
            try {
                try {
                    try {
                        Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                    } catch (ClassNotFoundException unused) {
                        ib.a.x(new pa.s());
                    } catch (NoSuchMethodException unused2) {
                        ib.a.x(new pa.s());
                    }
                } catch (IllegalAccessException unused3) {
                    ib.a.x(new pa.s());
                } catch (InvocationTargetException unused4) {
                    ib.a.x(new pa.s());
                }
                sa.a.w();
            } finally {
                sa.a.w();
            }
        }
        Context context2 = context.getApplicationContext();
        if (imagePipelineConfig == null) {
            synchronized (com.facebook.imagepipeline.core.c.class) {
                sa.a.w();
                Intrinsics.checkNotNullParameter(context2, "context");
                com.facebook.imagepipeline.core.c.h(new ImagePipelineConfig(new ImagePipelineConfig.Builder(context2)));
                sa.a.w();
            }
        } else {
            com.facebook.imagepipeline.core.c.h(imagePipelineConfig);
        }
        sa.a.w();
        c cVar2 = new c(context2, cVar);
        f3531a = cVar2;
        SimpleDraweeView.initialize(cVar2);
        sa.a.w();
    }

    public abstract String d();
}
