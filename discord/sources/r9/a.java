package r9;

import a3.f;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.CustomTabsSession;
import e4.e;
import ie.g;
import ie.k;
import ie.m;
import ie.n;
import ie.o;
import ie.r;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import je.e0;
import kotlin.jvm.internal.Intrinsics;
import m9.b;
import okio.Sink;
import op.c;
import pa.s;
import q.h;
import q.i;
import q.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f19216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f19217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f19218e;

    public a(b bitmapFrameCache, ca.a animatedDrawableBackend, boolean z5) {
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animatedDrawableBackend, "animatedDrawableBackend");
        this.f19215b = bitmapFrameCache;
        this.f19216c = animatedDrawableBackend;
        this.f19214a = z5;
        c cVar = new c(5, this);
        this.f19218e = cVar;
        this.f19217d = new f(animatedDrawableBackend, z5, cVar);
    }

    public static int k(k kVar, int i7) {
        int iHashCode = kVar.f11745b.hashCode() + (kVar.f11744a * 31);
        if (i7 < 2) {
            long jA = n.a(kVar.f11748e);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return kVar.f11748e.hashCode() + (iHashCode * 31);
    }

    public static k l(int i7, DataInputStream dataInputStream) throws IOException {
        o oVarB;
        int i10 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i7 < 2) {
            long j = dataInputStream.readLong();
            g gVar = new g();
            gVar.a(Long.valueOf(j), "exo_len");
            oVarB = o.f11754c.b(gVar);
        } else {
            oVarB = af.c.b(dataInputStream);
        }
        return new k(i10, utf, oVarB);
    }

    @Override // ie.m
    public void a(HashMap map) throws Throwable {
        e4.c cVar = (e4.c) this.f19217d;
        DataOutputStream dataOutputStream = null;
        try {
            je.a aVarS = cVar.S();
            r rVar = (r) this.f19218e;
            if (rVar == null) {
                this.f19218e = new r(aVarS);
            } else {
                rVar.c(aVarS);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((r) this.f19218e);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iK = 0;
                for (k kVar : map.values()) {
                    dataOutputStream2.writeInt(kVar.f11744a);
                    dataOutputStream2.writeUTF(kVar.f11745b);
                    af.c.f(kVar.f11748e, dataOutputStream2);
                    iK += k(kVar, 2);
                }
                dataOutputStream2.writeInt(iK);
                dataOutputStream2.close();
                ((File) cVar.f7967i).delete();
                int i7 = e0.f13788a;
                this.f19214a = false;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                e0.g(dataOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // ie.m
    public void b(k kVar, boolean z5) {
        this.f19214a = true;
    }

    @Override // ie.m
    public void c(k kVar) {
        this.f19214a = true;
    }

    @Override // ie.m
    public boolean d() {
        e4.c cVar = (e4.c) this.f19217d;
        return ((File) cVar.f7966e).exists() || ((File) cVar.f7967i).exists();
    }

    @Override // ie.m
    public void e(HashMap map) throws Throwable {
        if (this.f19214a) {
            a(map);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[Catch: all -> 0x007e, IOException -> 0x0081, LOOP:0: B:36:0x0093->B:37:0x0095, LOOP_END, TryCatch #4 {IOException -> 0x0081, all -> 0x007e, blocks: (B:13:0x0045, B:18:0x004f, B:24:0x005f, B:25:0x0069, B:26:0x0072, B:33:0x0086, B:34:0x008b, B:35:0x008c, B:37:0x0095, B:38:0x00ab), top: B:61:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    @Override // ie.m
    public void g(HashMap map, SparseArray sparseArray) throws Throwable {
        int i7;
        int i10;
        int iK;
        int i11;
        je.b.k(!this.f19214a);
        Cipher cipher = (Cipher) this.f19215b;
        e4.c cVar = (e4.c) this.f19217d;
        File file = (File) cVar.f7966e;
        File file2 = (File) cVar.f7966e;
        File file3 = (File) cVar.f7967i;
        if (file.exists() || file3.exists()) {
            DataInputStream dataInputStream = null;
            try {
                if (file3.exists()) {
                    file2.delete();
                    file3.renameTo(file2);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i12 = dataInputStream2.readInt();
                    if (i12 >= 0 && i12 <= 2) {
                        if ((dataInputStream2.readInt() & 1) == 0) {
                            i7 = dataInputStream2.readInt();
                            iK = 0;
                            for (i10 = 0; i10 < i7; i10++) {
                                k kVarL = l(i12, dataInputStream2);
                                String str = kVarL.f11745b;
                                map.put(str, kVarL);
                                sparseArray.put(kVarL.f11744a, str);
                                iK += k(kVarL, i12);
                            }
                            i11 = dataInputStream2.readInt();
                            boolean z5 = dataInputStream2.read() == -1;
                            if (i11 == iK && z5) {
                                e0.g(dataInputStream2);
                                return;
                            }
                        } else if (cipher != null) {
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                SecretKeySpec secretKeySpec = (SecretKeySpec) this.f19216c;
                                int i13 = e0.f13788a;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                i7 = dataInputStream2.readInt();
                                iK = 0;
                                while (i10 < i7) {
                                    k kVarL2 = l(i12, dataInputStream2);
                                    String str2 = kVarL2.f11745b;
                                    map.put(str2, kVarL2);
                                    sparseArray.put(kVarL2.f11744a, str2);
                                    iK += k(kVarL2, i12);
                                }
                                i11 = dataInputStream2.readInt();
                                if (dataInputStream2.read() == -1) {
                                }
                                if (i11 == iK) {
                                    e0.g(dataInputStream2);
                                    return;
                                }
                            } catch (InvalidAlgorithmParameterException e10) {
                                e = e10;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e11) {
                                e = e11;
                                throw new IllegalStateException(e);
                            }
                        }
                    }
                    e0.g(dataInputStream2);
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        e0.g(dataInputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        e0.g(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
            map.clear();
            sparseArray.clear();
            file2.delete();
            file3.delete();
        }
    }

    @Override // ie.m
    public void h() {
        e4.c cVar = (e4.c) this.f19217d;
        ((File) cVar.f7966e).delete();
        ((File) cVar.f7967i).delete();
    }

    public void i() {
        synchronized (((cs.g) this.f19218e)) {
            if (this.f19214a) {
                return;
            }
            this.f19214a = true;
            ds.b.c((Sink) this.f19216c);
            try {
                ((f) this.f19215b).a();
            } catch (IOException unused) {
            }
        }
    }

    public e j() {
        Intent intent = (Intent) this.f19215b;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f19214a);
        ((s) this.f19216c).getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.f19218e;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i7 = Build.VERSION.SDK_INT;
        String strA = i.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i7 >= 34) {
            if (((ActivityOptions) this.f19217d) == null) {
                this.f19217d = h.a();
            }
            j.a((ActivityOptions) this.f19217d, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f19217d;
        return new e(18, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public boolean m(int i7, Bitmap targetBitmap) {
        Intrinsics.checkNotNullParameter(targetBitmap, "targetBitmap");
        try {
            ((f) this.f19217d).u(i7, targetBitmap);
            return true;
        } catch (IllegalStateException e10) {
            if (!o8.a.f17171a.isLoggable(6)) {
                return false;
            }
            o8.a.f17171a.e(a.class.getSimpleName(), "Rendering of frame unsuccessful. Frame number: " + i7, e10);
            return false;
        }
    }

    public a(cs.g this$0, f editor) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(editor, "editor");
        this.f19218e = this$0;
        this.f19215b = editor;
        Sink sinkP = editor.p(1);
        this.f19216c = sinkP;
        this.f19217d = new cs.f(this$0, this, sinkP);
    }

    public a(File file) {
        this.f19215b = null;
        this.f19216c = null;
        this.f19217d = new e4.c(file);
    }

    public a() {
        this.f19215b = new Intent("android.intent.action.VIEW");
        this.f19216c = new s();
        this.f19214a = true;
    }

    public a(CustomTabsSession customTabsSession) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f19215b = intent;
        this.f19216c = new s();
        this.f19214a = true;
        if (customTabsSession != null) {
            intent.setPackage(customTabsSession.f1200c.getPackageName());
            q.g gVar = customTabsSession.f1199b;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", gVar);
            intent.putExtras(bundle);
        }
    }

    @Override // ie.m
    public void f(long j) {
    }
}
