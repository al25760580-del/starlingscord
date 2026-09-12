package a3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.opengl.Matrix;
import android.os.Bundle;
import com.facebook.common.references.CloseableReference;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.internal.play_billing.v1;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.q3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Sink;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f67a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f68b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f69c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f70d;

    public f(int i7, boolean z5) {
        switch (i7) {
            case 8:
                this.f68b = new float[16];
                this.f69c = new float[16];
                this.f70d = new v1();
                break;
            default:
                this.f68b = null;
                this.f69c = q3.AUTO;
                this.f67a = false;
                this.f70d = "manual";
                break;
        }
    }

    public static float b(int i7, int[] iArr) {
        return ((i7 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static void c(int[] iArr) {
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr[i7] = 0;
        }
    }

    public static void e(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f2 = fArr2[10];
        float f7 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f7 * f7) + (f2 * f2));
        float f10 = fArr2[10] / fSqrt;
        fArr[0] = f10;
        float f11 = fArr2[8];
        fArr[2] = f11 / fSqrt;
        fArr[8] = (-f11) / fSqrt;
        fArr[10] = f10;
    }

    public static boolean i(int[] iArr) {
        int i7 = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            int i11 = iArr[i10];
            if (i11 == 0) {
                return false;
            }
            i7 += i11;
        }
        if (i7 < 7) {
            return false;
        }
        float f2 = i7 / 7.0f;
        float f7 = f2 / 2.0f;
        return Math.abs(f2 - ((float) iArr[0])) < f7 && Math.abs(f2 - ((float) iArr[1])) < f7 && Math.abs((f2 * 3.0f) - ((float) iArr[2])) < 3.0f * f7 && Math.abs(f2 - ((float) iArr[3])) < f7 && Math.abs(f2 - ((float) iArr[4])) < f7;
    }

    public void a() {
        es.h hVar = (es.h) this.f70d;
        synchronized (hVar) {
            try {
                if (this.f67a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.areEqual(((es.e) this.f68b).f8741g, this)) {
                    hVar.f(this, false);
                }
                this.f67a = true;
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        es.h hVar = (es.h) this.f70d;
        synchronized (hVar) {
            try {
                if (this.f67a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.areEqual(((es.e) this.f68b).f8741g, this)) {
                    hVar.f(this, true);
                }
                this.f67a = true;
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int f(int i7, int i10, int i11) {
        mj.b bVar = (mj.b) this.f68b;
        return this.f67a ? bVar.b(i10, i7) : bVar.b(i7, i10) ? (i11 << 1) | 1 : i11 << 1;
    }

    public void g() {
        es.e eVar = (es.e) this.f68b;
        if (Intrinsics.areEqual(eVar.f8741g, this)) {
            es.h hVar = (es.h) this.f70d;
            if (hVar.H) {
                hVar.f(this, false);
            } else {
                eVar.f8740f = true;
            }
        }
    }

    public void h(Canvas canvas, aa.a aVar) {
        int i7 = aVar.f288a;
        int i10 = aVar.f289b;
        canvas.drawRect(i7, i10, i7 + aVar.f290c, i10 + aVar.f291d, (Paint) this.f70d);
    }

    public int[] j() {
        synchronized (this) {
            try {
                if (!this.f67a) {
                    return null;
                }
                long[] jArr = (long[]) this.f68b;
                int length = jArr.length;
                int i7 = 0;
                int i10 = 0;
                while (i7 < length) {
                    int i11 = i10 + 1;
                    int i12 = 1;
                    boolean z5 = jArr[i7] > 0;
                    boolean[] zArr = (boolean[]) this.f69c;
                    if (z5 != zArr[i10]) {
                        int[] iArr = (int[]) this.f70d;
                        if (!z5) {
                            i12 = 2;
                        }
                        iArr[i10] = i12;
                    } else {
                        ((int[]) this.f70d)[i10] = 0;
                    }
                    zArr[i10] = z5;
                    i7++;
                    i10 = i11;
                }
                this.f67a = false;
                return (int[]) ((int[]) this.f70d).clone();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0112 A[LOOP:10: B:73:0x0112->B:78:0x0120, LOOP_START, PHI: r5 r14
      0x0112: PHI (r5v2 char) = (r5v1 char), (r5v24 char) binds: [B:70:0x010a, B:78:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r14v21 int) = (r14v20 int), (r14v27 int) binds: [B:70:0x010a, B:78:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [int] */
    /* JADX WARN: Type inference failed for: r11v12, types: [int] */
    /* JADX WARN: Type inference failed for: r11v13, types: [int] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r14v31, types: [int] */
    /* JADX WARN: Type inference failed for: r14v32, types: [int] */
    /* JADX WARN: Type inference failed for: r14v33, types: [int] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [int] */
    /* JADX WARN: Type inference failed for: r6v21, types: [int] */
    /* JADX WARN: Type inference failed for: r6v25, types: [int] */
    /* JADX WARN: Type inference failed for: r6v29, types: [int] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0112
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public boolean k(int r21, int r22, int[] r23) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.f.k(int, int, int[]):boolean");
    }

    public boolean l() {
        ArrayList<ek.c> arrayList = (ArrayList) this.f69c;
        int size = arrayList.size();
        float fAbs = 0.0f;
        int i7 = 0;
        float f2 = 0.0f;
        for (ek.c cVar : arrayList) {
            if (cVar.f8449d >= 2) {
                i7++;
                f2 += cVar.f8448c;
            }
        }
        if (i7 >= 3) {
            float f7 = f2 / size;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fAbs += Math.abs(((ek.c) it.next()).f8448c - f7);
            }
            if (fAbs <= f2 * 0.05f) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean m() {
        boolean z5;
        boolean zBooleanValue;
        try {
            synchronized (this) {
                try {
                    if (!this.f67a) {
                        Boolean boolQ = q();
                        this.f69c = boolQ;
                        if (boolQ == null) {
                            ((mi.k) ((ui.b) this.f68b)).a(new com.facebook.react.a(29));
                        }
                        this.f67a = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zBooleanValue;
        } catch (Throwable th3) {
            throw th3;
        }
        Boolean bool = (Boolean) this.f69c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            ji.f fVar = ((FirebaseMessaging) this.f70d).f6531a;
            fVar.a();
            cj.a aVar = (cj.a) fVar.f13896g.get();
            synchronized (aVar) {
                z5 = aVar.f3727a;
            }
            zBooleanValue = z5;
        }
        return zBooleanValue;
    }

    public boolean n(aa.a aVar) {
        ca.a aVar2 = (ca.a) this.f68b;
        return aVar.f288a == 0 && aVar.f289b == 0 && aVar.f290c == aVar2.f3550d.width() && aVar.f291d == aVar2.f3550d.height();
    }

    public boolean o(int i7) {
        if (i7 != 0) {
            aa.a[] aVarArr = ((ca.a) this.f68b).f3553g;
            aa.a aVar = aVarArr[i7];
            aa.a aVar2 = aVarArr[i7 - 1];
            if ((aVar.f292e != 2 || !n(aVar)) && (aVar2.f293f != 2 || !n(aVar2))) {
                return false;
            }
        }
        return true;
    }

    public Sink p(int i7) {
        rs.a aVarK;
        es.h hVar = (es.h) this.f70d;
        synchronized (hVar) {
            try {
                if (this.f67a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.areEqual(((es.e) this.f68b).f8741g, this)) {
                    return new rs.c();
                }
                if (!((es.e) this.f68b).f8739e) {
                    boolean[] zArr = (boolean[]) this.f69c;
                    Intrinsics.checkNotNull(zArr);
                    zArr[i7] = true;
                }
                File file = (File) ((es.e) this.f68b).f8738d.get(i7);
                try {
                    Intrinsics.checkNotNullParameter(file, "file");
                    try {
                        aVarK = v.k(file);
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        aVarK = v.k(file);
                    }
                    return new es.i(aVarK, new es.c(0, hVar, this));
                } catch (FileNotFoundException unused2) {
                    return new rs.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Boolean q() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ji.f fVar = ((FirebaseMessaging) this.f70d).f6531a;
        fVar.a();
        Context context = fVar.f13890a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public dk.d r() {
        dk.d dVar = (dk.d) this.f70d;
        if (dVar != null) {
            return dVar;
        }
        int iF = 0;
        int iF2 = 0;
        for (int i7 = 0; i7 < 6; i7++) {
            iF2 = f(i7, 8, iF2);
        }
        int iF3 = f(8, 7, f(8, 8, f(7, 8, iF2)));
        for (int i10 = 5; i10 >= 0; i10--) {
            iF3 = f(8, i10, iF3);
        }
        int i11 = ((mj.b) this.f68b).f15840e;
        int i12 = i11 - 7;
        for (int i13 = i11 - 1; i13 >= i12; i13--) {
            iF = f(8, i13, iF);
        }
        for (int i14 = i11 - 8; i14 < i11; i14++) {
            iF = f(i14, 8, iF);
        }
        dk.d dVarA = dk.d.a(iF3, iF);
        if (dVarA == null) {
            dVarA = dk.d.a(iF3 ^ 21522, iF ^ 21522);
        }
        this.f70d = dVarA;
        if (dVarA != null) {
            return dVarA;
        }
        throw ij.d.a();
    }

    public dk.g s() {
        dk.g gVar = (dk.g) this.f69c;
        if (gVar != null) {
            return gVar;
        }
        int i7 = ((mj.b) this.f68b).f15840e;
        int i10 = (i7 - 17) / 4;
        if (i10 <= 6) {
            return dk.g.c(i10);
        }
        int i11 = i7 - 11;
        int iF = 0;
        int iF2 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = i7 - 9; i13 >= i11; i13--) {
                iF2 = f(i13, i12, iF2);
            }
        }
        dk.g gVarB = dk.g.b(iF2);
        if (gVarB != null && (gVarB.f7666a * 4) + 17 == i7) {
            this.f69c = gVarB;
            return gVarB;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i7 - 9; i15 >= i11; i15--) {
                iF = f(i14, i15, iF);
            }
        }
        dk.g gVarB2 = dk.g.b(iF);
        if (gVarB2 == null || (gVarB2.f7666a * 4) + 17 != i7) {
            throw ij.d.a();
        }
        this.f69c = gVarB2;
        return gVarB2;
    }

    public void t() {
        if (((dk.d) this.f70d) == null) {
            return;
        }
        int i7 = f0.e.c(8)[((dk.d) this.f70d).f7656b];
        mj.b bVar = (mj.b) this.f68b;
        int i10 = bVar.f15840e;
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (dk.c.a(i7, i11, i12)) {
                    bVar.a(i12, i11);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    public void u(int i7, Bitmap bitmap) {
        int i10;
        op.c cVar = (op.c) this.f69c;
        ca.a aVar = (ca.a) this.f68b;
        boolean z5 = this.f67a;
        if (z5) {
            Canvas canvas = new Canvas(bitmap);
            aa.b bVar = aVar.f3549c;
            aa.c cVarM = bVar.m(i7);
            aa.a aVarO = bVar.o(i7);
            aa.a aVarO2 = i7 != 0 ? bVar.o(i7 - 1) : null;
            try {
                if (cVarM.getWidth() > 0 && cVarM.getHeight() > 0) {
                    if (bVar.n()) {
                        aVar.h(canvas, cVarM, aVarO, aVarO2);
                    } else {
                        aVar.g(canvas, cVarM, aVarO, aVarO2);
                    }
                    return;
                }
                return;
            } finally {
                cVarM.dispose();
            }
        }
        Canvas canvas2 = new Canvas(bitmap);
        int i11 = 0;
        canvas2.drawColor(0, PorterDuff.Mode.SRC);
        if (o(i7)) {
            i11 = i7;
        } else {
            for (int i12 = i7 - 1; i12 >= 0; i12--) {
                aa.a aVar2 = aVar.f3553g[i12];
                int i13 = aVar2.f293f;
                if (i13 == 1) {
                    i10 = 1;
                } else if (i13 != 2) {
                    i10 = i13 == 3 ? 3 : 4;
                } else if (n(aVar2)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                int iB = f0.e.b(i10);
                if (iB == 0) {
                    aa.a aVar3 = aVar.f3553g[i12];
                    CloseableReference closeableReferenceF = ((m9.b) ((r9.a) cVar.f17490e).f19215b).f(i12);
                    if (closeableReferenceF != null) {
                        try {
                            canvas2.drawBitmap((Bitmap) closeableReferenceF.q(), 0.0f, 0.0f, (Paint) null);
                            if (aVar3.f293f == 2) {
                                h(canvas2, aVar3);
                            }
                            i11 = i12 + 1;
                            if (!z5) {
                                closeableReferenceF.close();
                                break;
                            }
                            break;
                        } catch (Throwable th2) {
                            if (!z5) {
                                closeableReferenceF.close();
                            }
                            throw th2;
                        }
                    }
                    if (o(i12)) {
                        i11 = i12;
                        break;
                    }
                } else if (iB == 1) {
                    i11 = i12 + 1;
                    break;
                } else {
                    if (iB == 3) {
                        i11 = i12;
                        break;
                    }
                }
            }
        }
        while (i11 < i7) {
            aa.a aVar4 = aVar.f3553g[i11];
            int i14 = aVar4.f293f;
            if (i14 != 3) {
                if (aVar4.f292e == 2) {
                    h(canvas2, aVar4);
                }
                aVar.d(canvas2, i11);
                cVar.getClass();
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                if (i14 == 2) {
                    h(canvas2, aVar4);
                }
            }
            i11++;
        }
        aa.a aVar5 = aVar.f3553g[i7];
        if (aVar5.f292e == 2) {
            h(canvas2, aVar5);
        }
        aVar.d(canvas2, i7);
    }

    public f(mj.b bVar, int i7) throws ij.d {
        switch (i7) {
            case 4:
                this.f68b = bVar;
                this.f69c = new ArrayList();
                this.f70d = new int[5];
                return;
            default:
                int i10 = bVar.f15840e;
                if (i10 >= 21 && (i10 & 3) == 1) {
                    this.f68b = bVar;
                    return;
                }
                throw ij.d.a();
        }
    }

    public f(ca.a aVar, boolean z5, op.c cVar) {
        this.f68b = aVar;
        this.f69c = cVar;
        this.f67a = z5;
        Paint paint = new Paint();
        this.f70d = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public f(es.h this$0, es.e entry) {
        boolean[] zArr;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f70d = this$0;
        this.f68b = entry;
        if (entry.f8739e) {
            zArr = null;
        } else {
            this$0.getClass();
            zArr = new boolean[2];
        }
        this.f69c = zArr;
    }
}
