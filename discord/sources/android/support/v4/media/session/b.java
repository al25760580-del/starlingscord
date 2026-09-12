package android.support.v4.media.session;

import a3.e;
import a3.o;
import a5.f0;
import a5.g0;
import a5.l0;
import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.Camera;
import android.media.ExifInterface;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.android.billingclient.api.BillingResult;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.internal.play_billing.z3;
import cs.x;
import e4.r;
import ei.w0;
import h5.q;
import h5.s;
import he.p;
import io.sentry.SentryLevel;
import io.sentry.w5;
import io.sentry.x2;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import qd.j;
import qd.m;
import rn.n;
import tp.d;
import v3.t;
import vq.g;
import w3.k;
import wo.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void A(int i7, int i10) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(C(i7, i10, "index"));
        }
    }

    public static void B(int i7, int i10, int i11) {
        String strC;
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            if (i7 < 0 || i7 > i11) {
                strC = C(i7, i11, "start index");
            } else {
                strC = (i10 < 0 || i10 > i11) ? C(i10, i11, "end index") : c9.a.Q("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static String C(int i7, int i10, String str) {
        if (i7 < 0) {
            return c9.a.Q("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return c9.a.Q("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static p b(m mVar, String str, j jVar, int i7) {
        Map map = Collections.EMPTY_MAP;
        Uri uriK = je.b.K(str, jVar.f18757c);
        long j = jVar.f18755a;
        long j5 = jVar.f18756b;
        String strA = mVar.a();
        if (strA == null) {
            strA = je.b.K(((qd.b) mVar.f18760e.get(0)).f18711a, jVar.f18757c).toString();
        }
        String str2 = strA;
        je.b.m(uriK, "The uri must be set.");
        return new p(uriK, 0L, 1, null, w0.f8376y, j, j5, str2, i7);
    }

    public static final void c(WorkDatabase workDatabase, v3.b configuration, k continuation) {
        int i7;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        ArrayList arrayListI = d0.i(continuation);
        int i10 = 0;
        while (!arrayListI.isEmpty()) {
            List list = ((k) i0.u(arrayListI)).f22036e;
            Intrinsics.checkNotNullExpressionValue(list, "current.work");
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                i7 = 0;
                while (it.hasNext()) {
                    if (((t) it.next()).f21429b.j.a() && (i7 = i7 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i7 = 0;
            }
            i10 += i7;
        }
        if (i10 == 0) {
            return;
        }
        e4.p pVarT = workDatabase.t();
        pVarT.getClass();
        o oVarG = o.g(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) pVarT.f8019a;
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            int i11 = cursorM.moveToFirst() ? cursorM.getInt(0) : 0;
            cursorM.close();
            oVarG.i();
            int i12 = configuration.f21387i;
            if (i11 + i10 > i12) {
                throw new IllegalArgumentException(kk.b.l(e.r(i12, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i11, ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: "), i10, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
            }
        } catch (Throwable th2) {
            cursorM.close();
            oVarG.i();
            throw th2;
        }
    }

    public static final Collection d(Collection collection, Collection collection2) {
        Intrinsics.checkNotNullParameter(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static void e(Camera.Parameters parameters, s sVar, int i7, int i10, int i11) {
        ArrayList arrayList = new ArrayList(1);
        Matrix matrix = new Matrix();
        float[] fArr = {sVar.f10377a, sVar.f10378b, sVar.f10379c, sVar.f10380d};
        matrix.postRotate(-i11, i7 / 2.0f, i10 / 2.0f);
        matrix.mapPoints(fArr);
        int i12 = (int) fArr[0];
        int i13 = (int) fArr[1];
        int i14 = (int) fArr[2];
        int i15 = (int) fArr[3];
        if (i12 > i14) {
            i14 = i12;
            i12 = i14;
        }
        if (i13 > i15) {
            i15 = i13;
            i13 = i15;
        }
        s sVar2 = new s(i12, i13, i14, i15);
        if (i12 < 0 || i13 < 0 || i14 > i7 || i15 > i10) {
            sVar2 = new s(Math.max(i12, 0), Math.max(i13, 0), Math.min(i14, i7), Math.min(i15, i10));
        }
        arrayList.add(new Camera.Area(new Rect(((sVar2.f10377a * 2000) / i7) - 1000, ((sVar2.f10378b * 2000) / i10) - 1000, ((sVar2.f10379c * 2000) / i7) - 1000, ((sVar2.f10380d * 2000) / i10) - 1000), 1000));
        if (parameters.getMaxNumFocusAreas() > 0) {
            parameters.setFocusAreas(arrayList);
        }
        if (parameters.getMaxNumMeteringAreas() > 0) {
            parameters.setMeteringAreas(arrayList);
        }
    }

    public static boolean f(String current, String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.areEqual(current, str)) {
            return true;
        }
        if (current.length() != 0) {
            int i7 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i7 < current.length()) {
                char cCharAt = current.charAt(i7);
                int i12 = i11 + 1;
                if (i11 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i10++;
                    } else if (cCharAt != ')' || (i10 = i10 - 1) != 0 || i11 == current.length() - 1) {
                    }
                    i7++;
                    i11 = i12;
                }
            }
            if (i10 == 0) {
                String strSubstring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.areEqual(StringsKt.b0(strSubstring).toString(), str);
            }
        }
        return false;
    }

    public static WritableNativeMap g(String str) {
        Float fI;
        Float fI2;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList<String> arrayList = new ArrayList(Arrays.asList("FNumber", "DateTime", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "WhiteBalance"));
        arrayList.addAll(new ArrayList(Arrays.asList("DateTimeDigitized", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal")));
        ExifInterface exifInterface = new ExifInterface(str);
        try {
            String attribute = exifInterface.getAttribute("GPSLatitude");
            String attribute2 = exifInterface.getAttribute("GPSLatitudeRef");
            String attribute3 = exifInterface.getAttribute("GPSLongitude");
            String attribute4 = exifInterface.getAttribute("GPSLongitudeRef");
            if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
                fI = null;
                fI2 = null;
            } else {
                fI = attribute2.equals("N") ? c9.a.i(attribute) : Float.valueOf(0.0f - c9.a.i(attribute).floatValue());
                fI2 = attribute4.equals("E") ? c9.a.i(attribute3) : Float.valueOf(0.0f - c9.a.i(attribute3).floatValue());
            }
            if (fI != null && fI2 != null) {
                writableNativeMap.putDouble("Latitude", fI.floatValue());
                writableNativeMap.putDouble("Longitude", fI2.floatValue());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        for (String str2 : arrayList) {
            writableNativeMap.putString(str2, exifInterface.getAttribute(str2));
        }
        return writableNativeMap;
    }

    public static wo.b h(h hVar, up.c fqName) {
        Object next;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((wo.b) next).a(), fqName)) {
                return (wo.b) next;
            }
        }
        next = null;
        return (wo.b) next;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static x i(String javaName) {
        Intrinsics.checkNotNullParameter(javaName, "javaName");
        int iHashCode = javaName.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return x.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return x.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return x.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return x.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return x.SSL_3_0;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", javaName));
    }

    public static np.p j(io.sentry.config.a signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        if (signature instanceof tp.e) {
            tp.e eVar = (tp.e) signature;
            String name = eVar.k;
            String desc = eVar.f20875l;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new np.p(kk.b.j(name, desc));
        }
        if (!(signature instanceof d)) {
            throw new n();
        }
        d dVar = (d) signature;
        String name2 = dVar.k;
        String desc2 = dVar.f20874l;
        Intrinsics.checkNotNullParameter(name2, "name");
        Intrinsics.checkNotNullParameter(desc2, "desc");
        return new np.p(name2 + '#' + desc2);
    }

    public static final String k(ContentResolver contentResolver, Uri uri) {
        Intrinsics.checkNotNullParameter(contentResolver, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return "";
        }
        int columnIndex = cursorQuery.getColumnIndex("_display_name");
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(columnIndex);
        cursorQuery.close();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public static s l(int i7, int i10, s sVar, q qVar, q qVar2) {
        int i11 = qVar.f10374a;
        int i12 = qVar.f10375b;
        int i13 = (i11 - qVar2.f10374a) / 2;
        int i14 = (i12 - qVar2.f10375b) / 2;
        float f2 = i7 / i11;
        float f7 = i10 / i12;
        return new s(Math.max(Math.round((sVar.f10377a + i13) * f2), 0), Math.max(Math.round((sVar.f10378b + i14) * f7), 0), Math.min(Math.round((sVar.f10379c + i13) * f2), i7), Math.min(Math.round((sVar.f10380d + i14) * f7), i10));
    }

    public static int m() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(3379, iArr3, 0);
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
        return iArr3[0];
    }

    public static void n(w5 w5Var) {
        if (w5Var.getProfilingTracesDirPath() != null) {
            return;
        }
        File file = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
        if (file.mkdirs() || file.exists()) {
            w5Var.setProfilingTracesDirPath(file.getAbsolutePath());
        } else {
            throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file.getAbsolutePath());
        }
    }

    public static boolean o(h hVar, up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return hVar.z(fqName) != null;
    }

    public static final g p(ArrayList scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        g gVar = new g();
        for (Object obj : scopes) {
            eq.o oVar = (eq.o) obj;
            if (oVar != null && oVar != eq.n.f8648b) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    public static String q(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            sb2.append(str.charAt(i7));
            if (str2.length() > i7) {
                sb2.append(str2.charAt(i7));
            }
        }
        return sb2.toString();
    }

    public static l2.b r(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i7 = byteBufferDuplicate.getShort() & 65535;
        if (i7 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i7) {
                j = -1;
                break;
            }
            int i11 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j5 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i12 = 0; i12 < j5; i12++) {
                int i13 = byteBufferDuplicate.getInt();
                long j7 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    byteBufferDuplicate.position((int) (j7 + j));
                    l2.b bVar = new l2.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f1674v = byteBufferDuplicate;
                    bVar.f1671d = iPosition;
                    int i14 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f1672e = i14;
                    bVar.f1673i = ((ByteBuffer) bVar.f1674v).getShort(i14);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static qp.a s(InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        DataInputStream dataInputStream = new DataInputStream(stream);
        IntRange intRange = new IntRange(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(e0.l(intRange, 10));
        Iterator it = intRange.iterator();
        while (((lo.b) it).f15156i) {
            ((s0) it).nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrH0 = CollectionsKt.h0(arrayList);
        return new qp.a(Arrays.copyOf(iArrH0, iArrH0.length));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00de A[SYNTHETIC] */
    public static mj.b t(mj.b bVar, int i7, int i10, mj.e eVar) throws ij.h {
        int i11 = i10;
        if (i7 <= 0 || i11 <= 0) {
            throw ij.h.f11808i;
        }
        mj.b bVar2 = new mj.b(i7, i11);
        int i12 = i7 * 2;
        float[] fArr = new float[i12];
        int i13 = 0;
        while (i13 < i11) {
            float f2 = i13 + 0.5f;
            for (int i14 = 0; i14 < i12; i14 += 2) {
                fArr[i14] = (i14 / 2) + 0.5f;
                fArr[i14 + 1] = f2;
            }
            float f7 = eVar.f15853a;
            float f10 = eVar.f15854b;
            float f11 = eVar.f15855c;
            float f12 = eVar.f15856d;
            float f13 = eVar.f15857e;
            float f14 = eVar.f15858f;
            float f15 = eVar.f15859g;
            float f16 = eVar.f15860h;
            float f17 = eVar.f15861i;
            for (int i15 = 0; i15 < i12; i15 += 2) {
                float f18 = fArr[i15];
                int i16 = i15 + 1;
                float f19 = fArr[i16];
                float f20 = (f14 * f19) + (f11 * f18) + f17;
                fArr[i15] = (((f12 * f19) + (f7 * f18)) + f15) / f20;
                fArr[i16] = (((f19 * f13) + (f18 * f10)) + f16) / f20;
            }
            int i17 = bVar.f15839d;
            int i18 = bVar.f15840e;
            boolean z5 = true;
            for (int i19 = 0; i19 < i12 && z5; i19 += 2) {
                int i20 = (int) fArr[i19];
                int i21 = i19 + 1;
                int i22 = (int) fArr[i21];
                if (i20 < -1 || i20 > i17 || i22 < -1 || i22 > i18) {
                    throw ij.h.f11808i;
                }
                if (i20 == -1) {
                    fArr[i19] = 0.0f;
                } else {
                    if (i20 == i17) {
                        fArr[i19] = i17 - 1;
                    } else {
                        z5 = false;
                    }
                    if (i22 == -1) {
                        fArr[i21] = 0.0f;
                    } else {
                        if (i22 == i18) {
                            fArr[i21] = i18 - 1;
                        }
                    }
                    z5 = true;
                }
                z5 = true;
                if (i22 == -1) {
                    fArr[i21] = 0.0f;
                } else {
                    if (i22 == i18) {
                        fArr[i21] = i18 - 1;
                    }
                }
                z5 = true;
            }
            boolean z6 = true;
            for (int i23 = i12 - 2; i23 >= 0 && z6; i23 -= 2) {
                int i24 = (int) fArr[i23];
                int i25 = i23 + 1;
                int i26 = (int) fArr[i25];
                if (i24 < -1 || i24 > i17 || i26 < -1 || i26 > i18) {
                    throw ij.h.f11808i;
                }
                if (i24 == -1) {
                    fArr[i23] = 0.0f;
                } else {
                    if (i24 == i17) {
                        fArr[i23] = i17 - 1;
                    } else {
                        z6 = false;
                    }
                    if (i26 == -1) {
                        fArr[i25] = 0.0f;
                    } else {
                        if (i26 == i18) {
                            fArr[i25] = i18 - 1;
                        }
                    }
                    z6 = true;
                }
                z6 = true;
                if (i26 == -1) {
                    fArr[i25] = 0.0f;
                } else {
                    if (i26 == i18) {
                        fArr[i25] = i18 - 1;
                    }
                }
                z6 = true;
            }
            for (int i27 = 0; i27 < i12; i27 += 2) {
                try {
                    if (bVar.b((int) fArr[i27], (int) fArr[i27 + 1])) {
                        bVar2.f(i27 / 2, i13);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw ij.h.f11808i;
                }
            }
            i13++;
            i11 = i10;
        }
        return bVar2;
    }

    public static void u(Camera.Parameters parameters, int i7) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null || supportedFocusModes.isEmpty()) {
            return;
        }
        if (i7 == 2) {
            if ("continuous-picture".equals(parameters.getFocusMode())) {
                return;
            }
            if (supportedFocusModes.contains("continuous-picture")) {
                parameters.setFocusMode("continuous-picture");
                return;
            }
        }
        if (!"auto".equals(parameters.getFocusMode()) && supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
        }
    }

    public static void v(Camera.Parameters parameters, String str) {
        List<String> supportedFlashModes;
        if (str.equals(parameters.getFlashMode()) || (supportedFlashModes = parameters.getSupportedFlashModes()) == null || !supportedFlashModes.contains(str)) {
            return;
        }
        parameters.setFlashMode(str);
    }

    public static boolean w(w5 w5Var, w5 w5Var2, boolean z5) {
        boolean z6 = io.sentry.util.h.f13226a;
        if (!z6 && (w5Var2.getVersionDetector() instanceof x2)) {
            w5Var2.setVersionDetector(new fj.c(19, w5Var2));
        }
        if (!w5Var2.getVersionDetector().j()) {
            return !z5 || w5Var == null || w5Var2.isForceInit() || w5Var.getInitPriority().ordinal() <= w5Var2.getInitPriority().ordinal();
        }
        w5Var2.getLogger().q(SentryLevel.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException(s0.g.e("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z6 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
    }

    public static Bundle x(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void y(int i7, BillingResult billingResult, g0 g0Var, int i10) {
        int i11 = f0.f183a;
        ((r) g0Var).R(f0.b(i7, 29, billingResult, null, z3.BROADCAST_ACTION_UNSPECIFIED), i10);
    }

    public static void z(int i7, int i10) {
        String strQ;
        if (i7 < 0 || i7 >= i10) {
            if (i7 < 0) {
                strQ = c9.a.Q("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i10 < 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
                    sb2.append("negative size: ");
                    sb2.append(i10);
                    throw new IllegalArgumentException(sb2.toString());
                }
                strQ = c9.a.Q("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strQ);
        }
    }
}
