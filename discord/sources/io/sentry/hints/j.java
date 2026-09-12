package io.sentry.hints;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.FocusStrategy$CollectionAdapter;
import ci.b0;
import ci.p;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Supplier;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.soloader.SoLoader;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.otaliastudios.zoom.OverZoomRangeProvider;
import com.otaliastudios.zoom.ZoomEngine;
import io.sentry.p4;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;
import pc.m;
import pc.x;
import rs.u;
import rs.v;
import sh.p0;

/* JADX INFO: loaded from: classes3.dex */
public class j implements FocusStrategy$CollectionAdapter, bd.k, ib.b, OverZoomRangeProvider, r8.c, io.sentry.clientreport.f, mf.c, o4.b, m, th.g, ze.i, p, qm.a, JavaScriptExecutorFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static j f12726e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12727d;

    public /* synthetic */ j(int i7) {
        this.f12727d = i7;
    }

    public static io.sentry.android.core.internal.tombstone.a A(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new io.sentry.android.core.internal.tombstone.a(httpURLConnection);
    }

    public static j C() {
        if (f12726e == null) {
            f12726e = new j(6);
        }
        return f12726e;
    }

    public static ByteString E(byte[] bArr) {
        ByteString byteString = ByteString.f17414v;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        v.f(bArr.length, 0, length);
        return new ByteString(w.i(bArr, length));
    }

    public static MediaCodec v(bd.j jVar) throws IOException {
        jVar.f3166a.getClass();
        String str = jVar.f3166a.f3172a;
        je.b.c("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        je.b.t();
        return mediaCodecCreateByCodecName;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0 A[RETURN] */
    public static ByteString w(String str) {
        int i7;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = u.f19608a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i10 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i11 >= length) {
                int i15 = i12 % 4;
                if (i15 != 1) {
                    if (i15 == 2) {
                        bArrCopyOf[i14] = (byte) ((i13 << 12) >> 16);
                        i14++;
                    } else if (i15 == 3) {
                        int i16 = i13 << 6;
                        int i17 = i14 + 1;
                        bArrCopyOf[i14] = (byte) (i16 >> 16);
                        i14 += 2;
                        bArrCopyOf[i17] = (byte) (i16 >> 8);
                    }
                    if (i14 != i10) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                    }
                }
                if (bArrCopyOf != null) {
                    return new ByteString(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i11);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i7 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i7 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i7 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i7 = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i7 = 63;
                }
                i11++;
            }
            i13 = (i13 << 6) | i7;
            i12++;
            if (i12 % 4 == 0) {
                bArrCopyOf[i14] = (byte) (i13 >> 16);
                int i18 = i14 + 2;
                bArrCopyOf[i14 + 1] = (byte) (i13 >> 8);
                i14 += 3;
                bArrCopyOf[i18] = (byte) i13;
            }
            i11++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new ByteString(bArrCopyOf);
        }
        return null;
    }

    public static ByteString y(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = i7 * 2;
            bArr[i7] = (byte) (ss.b.a(str.charAt(i10 + 1)) + (ss.b.a(str.charAt(i10)) << 4));
        }
        return new ByteString(bArr);
    }

    public static ByteString z(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString byteString = new ByteString(bytes);
        byteString.f17417i = str;
        return byteString;
    }

    public j8.g B(DiskCacheConfig diskCacheConfig) {
        int i7 = diskCacheConfig.f4613a;
        Supplier supplier = diskCacheConfig.f4615c;
        String str = diskCacheConfig.f4614b;
        i8.b bVar = diskCacheConfig.f4620h;
        j8.h hVar = new j8.h(i7, supplier, str, bVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new j8.g(hVar, diskCacheConfig.f4619g, new j8.f(diskCacheConfig.f4618f, diskCacheConfig.f4617e, diskCacheConfig.f4616d), diskCacheConfig.f4621i, bVar, executorServiceNewSingleThreadExecutor);
    }

    public Signature[] D(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // th.g
    public /* synthetic */ Object a() {
        switch (this.f12727d) {
            case 16:
                return new p0();
            default:
                return new b0("StandardIntegrity");
        }
    }

    @Override // ze.i
    public void accept(Object obj, Object obj2) {
        vf.d dVar = (vf.d) ((vf.e) obj).o();
        a3.j jVar = new a3.j((ig.g) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i7 = vf.c.f21664a;
        parcelObtain.writeStrongBinder(jVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            dVar.f21665f.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // pc.m
    public void c(pc.u uVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        Intrinsics.checkNotNullParameter("", "debuggerName");
        return new HermesExecutor(HermesExecutor.f4790a.initHybridDefaultConfig(true, ""));
    }

    @Override // o4.b
    public boolean d(float f2) {
        throw new IllegalStateException("not implemented");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b9 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:10:0x0031, B:12:0x003d, B:52:0x00c2, B:17:0x0046, B:19:0x004d, B:21:0x0053, B:26:0x0059, B:28:0x005d, B:31:0x0066, B:33:0x006e, B:36:0x0075, B:43:0x00a1, B:44:0x00a9, B:39:0x007c, B:41:0x0082, B:42:0x0093, B:47:0x00ac, B:50:0x00af, B:51:0x00b9, B:18:0x0049), top: B:137:0x0031, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0192  */
    @Override // mf.c
    public int e(Context context, boolean z5) {
        int i7;
        Cursor cursor;
        try {
            synchronized (mf.d.class) {
                Boolean bool = mf.d.f15745c;
                boolean z6 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        mf.d.e(classLoader);
                                    } catch (mf.b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!mf.d.c(context)) {
                                        return 0;
                                    }
                                    if (mf.d.f15747e) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iD = mf.d.d(context, z5, true);
                                                String str = mf.d.f15746d;
                                                if (str != null && !str.isEmpty()) {
                                                    ClassLoader classLoaderK = mf.f.K();
                                                    if (classLoaderK == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            mf.a.b();
                                                            String str2 = mf.d.f15746d;
                                                            af.w.g(str2);
                                                            classLoaderK = mf.a.a(ClassLoader.getSystemClassLoader(), str2);
                                                        } else {
                                                            String str3 = mf.d.f15746d;
                                                            af.w.g(str3);
                                                            classLoaderK = new mf.g(str3, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    mf.d.e(classLoaderK);
                                                    declaredField.set(null, classLoaderK);
                                                    mf.d.f15745c = bool2;
                                                    return iD;
                                                }
                                                return iD;
                                            } catch (mf.b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                mf.d.f15745c = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        String string = e10.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(string);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return mf.d.d(context, z5, false);
                    } catch (mf.b e11) {
                        String message = e11.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                mf.i iVarF = mf.d.f(context);
                try {
                    if (iVarF == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelT = iVarF.t(6, iVarF.u());
                        int i10 = parcelT.readInt();
                        parcelT.recycle();
                        if (i10 < 3) {
                            if (i10 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                lf.b bVar = new lf.b(context);
                                Parcel parcelU = iVarF.u();
                                yf.g.b(parcelU, bVar);
                                parcelU.writeString("com.google.android.gms.cronet_dynamite");
                                parcelU.writeInt(z5 ? 1 : 0);
                                Parcel parcelT2 = iVarF.t(5, parcelU);
                                i7 = parcelT2.readInt();
                                parcelT2.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                lf.b bVar2 = new lf.b(context);
                                Parcel parcelU2 = iVarF.u();
                                yf.g.b(parcelU2, bVar2);
                                parcelU2.writeString("com.google.android.gms.cronet_dynamite");
                                parcelU2.writeInt(z5 ? 1 : 0);
                                Parcel parcelT3 = iVarF.t(3, parcelU2);
                                i7 = parcelT3.readInt();
                                parcelT3.recycle();
                            }
                            return i7;
                        }
                        ThreadLocal threadLocal = mf.d.f15750h;
                        mf.h hVar = (mf.h) threadLocal.get();
                        if (hVar != null && (cursor = hVar.f15758a) != null) {
                            return cursor.getInt(0);
                        }
                        Cursor cursor3 = (Cursor) lf.b.A(iVarF.A(new lf.b(context), z5, ((Long) mf.d.f15751i.get()).longValue()));
                        if (cursor3 != null) {
                            try {
                                if (cursor3.moveToFirst()) {
                                    int i11 = cursor3.getInt(0);
                                    if (i11 > 0) {
                                        mf.h hVar2 = (mf.h) threadLocal.get();
                                        if (hVar2 == null || hVar2.f15758a != null) {
                                            z6 = false;
                                        } else {
                                            hVar2.f15758a = cursor3;
                                        }
                                        cursor2 = z6 ? null : cursor3;
                                    }
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    return i11;
                                }
                            } catch (RemoteException e12) {
                                e = e12;
                                cursor2 = cursor3;
                                String message2 = e.getMessage();
                                StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                sb4.append("Failed to retrieve remote module version: ");
                                sb4.append(message2);
                                Log.w("DynamiteModule", sb4.toString());
                                if (cursor2 == null) {
                                    return 0;
                                }
                                cursor2.close();
                                return 0;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor2 = cursor3;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        }
                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                        if (cursor3 == null) {
                            return 0;
                        }
                        cursor3.close();
                        return 0;
                    } catch (RemoteException e13) {
                        e = e13;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                af.w.g(context);
                throw th5;
            } catch (Exception e14) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e14);
                throw th5;
            }
        }
    }

    @Override // o4.b
    public y4.a f() {
        throw new IllegalStateException("not implemented");
    }

    @Override // qm.a
    public String g() {
        return "onDidDisappear";
    }

    @Override // qm.a
    public String getEventName() {
        return "topDidDisappear";
    }

    @Override // bd.k
    public bd.l h(bd.j jVar) {
        MediaCodec mediaCodecV = null;
        try {
            mediaCodecV = v(jVar);
            je.b.c("configureCodec");
            mediaCodecV.configure(jVar.f3167b, jVar.f3169d, jVar.f3170e, 0);
            je.b.t();
            je.b.c("startCodec");
            mediaCodecV.start();
            je.b.t();
            return new e4.m(mediaCodecV);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodecV != null) {
                mediaCodecV.release();
            }
            throw e10;
        }
    }

    @Override // ib.b
    public boolean i(String str) {
        return SoLoader.n(0, str);
    }

    @Override // o4.b
    public boolean isEmpty() {
        return true;
    }

    @Override // o4.b
    public boolean j(float f2) {
        return false;
    }

    @Override // mf.c
    public int l(Context context) {
        return mf.d.a(context, "com.google.android.gms.cronet_dynamite");
    }

    @Override // o4.b
    public float n() {
        return 1.0f;
    }

    @Override // com.otaliastudios.zoom.OverZoomRangeProvider
    public float o(ZoomEngine engine) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        hl.c cVar = engine.f7026h;
        return (cVar.f10946y - cVar.f10944w) * 0.1f;
    }

    @Override // o4.b
    public float p() {
        return 0.0f;
    }

    @Override // pc.m
    public void q() {
        throw new UnsupportedOperationException();
    }

    @Override // r8.c
    public void release(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // androidx.customview.widget.FocusStrategy$CollectionAdapter
    public AccessibilityNodeInfoCompat s(SparseArrayCompat sparseArrayCompat, int i7) {
        return (AccessibilityNodeInfoCompat) sparseArrayCompat.h(i7);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        HermesSamplingProfiler.dumpSampledTraceToFile(filename);
        HermesSamplingProfiler.disable();
    }

    @Override // androidx.customview.widget.FocusStrategy$CollectionAdapter
    public int t(SparseArrayCompat sparseArrayCompat) {
        return sparseArrayCompat.g();
    }

    public String toString() {
        switch (this.f12727d) {
            case 21:
                return "JSIExecutor+HermesRuntime";
            default:
                return super.toString();
        }
    }

    @Override // pc.m
    public x x(int i7, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // io.sentry.clientreport.f
    public e4.c u(e4.c cVar) {
        return cVar;
    }

    @Override // io.sentry.clientreport.f
    public void b(io.sentry.clientreport.d dVar, io.sentry.l lVar) {
    }

    @Override // io.sentry.clientreport.f
    public void k(io.sentry.clientreport.d dVar, e4.c cVar) {
    }

    @Override // io.sentry.clientreport.f
    public void r(io.sentry.clientreport.d dVar, p4 p4Var) {
    }

    @Override // io.sentry.clientreport.f
    public void m(io.sentry.clientreport.d dVar, io.sentry.l lVar, long j) {
    }
}
