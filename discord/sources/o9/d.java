package o9;

import a5.b0;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import bd.j;
import bd.k;
import bd.l;
import bh.t;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import com.facebook.common.references.CloseableReference;
import com.facebook.soloader.z;
import gc.h1;
import gn.h;
import he.a0;
import he.j0;
import he.m;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import je.e0;
import je.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import v4.d0;
import x4.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements a, k, kb.b, mf.c, io.d, d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17185e;

    public /* synthetic */ d(int i7) {
        this.f17184d = i7;
    }

    public static ad.f j(t tVar, b0 b0Var) {
        IOException iOException = (IOException) b0Var.f174i;
        if (!(iOException instanceof he.d0)) {
            return null;
        }
        int i7 = ((he.d0) iOException).f10597v;
        if (i7 != 403 && i7 != 404 && i7 != 410 && i7 != 416 && i7 != 500 && i7 != 503) {
            return null;
        }
        if (tVar.a(1)) {
            return new ad.f(1, LogThrottleSingleton.RATE_LIMIT_FIVE_MINUTES);
        }
        if (tVar.a(2)) {
            return new ad.f(2, LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE);
        }
        return null;
    }

    public static long n(b0 b0Var) {
        Throwable cause = (IOException) b0Var.f174i;
        if ((cause instanceof h1) || (cause instanceof FileNotFoundException) || (cause instanceof a0) || (cause instanceof j0)) {
            return -9223372036854775807L;
        }
        int i7 = m.f10627e;
        while (cause != null) {
            if ((cause instanceof m) && ((m) cause).f10628d == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((b0Var.f173e - 1) * 1000, 5000);
    }

    @Override // o9.a
    public void a(c bitmapFramePreparer, m9.b bitmapFrameCache, m9.a animationBackend, int i7) {
        c cVar;
        m9.b bVar;
        m9.a aVar;
        Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        int i10 = this.f17185e;
        int i11 = 1;
        if (1 > i10) {
            return;
        }
        while (true) {
            int iH = (i7 + i11) % animationBackend.f15472c.h();
            if (o8.a.f17171a.isLoggable(2)) {
                o8.a.o(d.class, "Preparing frame %d, last drawn: %d", Integer.valueOf(iH), Integer.valueOf(i7));
            }
            bitmapFramePreparer.getClass();
            Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
            Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
            int iHashCode = (animationBackend.hashCode() * 31) + iH;
            synchronized (((SparseArray) bitmapFramePreparer.f17183w)) {
                if (((SparseArray) bitmapFramePreparer.f17183w).get(iHashCode) != null) {
                    o8.a.q("Already scheduled decode job for frame %d", Integer.valueOf(iH), c.class);
                } else if (bitmapFrameCache.contains(iH)) {
                    o8.a.q("Frame %d is cached already.", Integer.valueOf(iH), c.class);
                } else {
                    cVar = bitmapFramePreparer;
                    bVar = bitmapFrameCache;
                    aVar = animationBackend;
                    b bVar2 = new b(cVar, aVar, bVar, iH, iHashCode);
                    ((SparseArray) cVar.f17183w).put(iHashCode, bVar2);
                    ((ExecutorService) cVar.f17182v).execute(bVar2);
                    Unit unit = Unit.f14616a;
                }
                cVar = bitmapFramePreparer;
                bVar = bitmapFrameCache;
                aVar = animationBackend;
            }
            if (i11 == i10) {
                return;
            }
            i11++;
            bitmapFramePreparer = cVar;
            animationBackend = aVar;
            bitmapFrameCache = bVar;
        }
    }

    @Override // o9.a
    public CloseableReference b(int i7, int i10, int i11) {
        return null;
    }

    @Override // mf.c
    public int e(Context context, boolean z5) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    @Override // v4.d0
    public Object f(w4.a aVar, float f2) {
        int i7;
        int iArgb;
        float f7;
        int iArgb2;
        float f10;
        float fE;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 0;
        boolean z5 = aVar.B() == 1;
        if (z5) {
            aVar.c();
        }
        while (aVar.n()) {
            arrayList.add(Float.valueOf((float) aVar.u()));
        }
        int i12 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f17185e = 2;
        }
        if (z5) {
            aVar.g();
        }
        if (this.f17185e == -1) {
            this.f17185e = arrayList.size() / 4;
        }
        int i13 = this.f17185e;
        float[] fArr = new float[i13];
        int[] iArr = new int[i13];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i7 = this.f17185e * 4;
            if (i14 >= i7) {
                break;
            }
            int i17 = i14 / 4;
            double dFloatValue = ((Float) arrayList.get(i14)).floatValue();
            int i18 = i11;
            int i19 = i14 % 4;
            if (i19 != 0) {
                if (i19 == i10) {
                    i15 = (int) (dFloatValue * 255.0d);
                } else if (i19 == 2) {
                    i16 = (int) (dFloatValue * 255.0d);
                } else if (i19 == 3) {
                    iArr[i17] = Color.argb(255, i15, i16, (int) (dFloatValue * 255.0d));
                }
            } else if (i17 > 0) {
                float f11 = (float) dFloatValue;
                if (fArr[i17 - 1] >= f11) {
                    fArr[i17] = f11 + 0.01f;
                } else {
                    fArr[i17] = (float) dFloatValue;
                }
            } else {
                fArr[i17] = (float) dFloatValue;
            }
            i14++;
            i11 = i18;
            i10 = 1;
        }
        int i20 = i11;
        s4.c cVar = new s4.c(fArr, iArr);
        if (arrayList.size() <= i7) {
            return cVar;
        }
        int size = (arrayList.size() - i7) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i21 = i20;
        while (i7 < arrayList.size()) {
            if (i7 % 2 == 0) {
                fArr2[i21] = ((Float) arrayList.get(i7)).floatValue();
            } else {
                fArr3[i21] = ((Float) arrayList.get(i7)).floatValue();
                i21++;
            }
            i7++;
        }
        float[] fArrCopyOf = cVar.f19721a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i22 = i20;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            while (i22 < length) {
                float f12 = i24 < fArrCopyOf.length ? fArrCopyOf[i24] : Float.NaN;
                float f13 = i25 < size ? fArr2[i25] : Float.NaN;
                if (Float.isNaN(f13) || f12 < f13) {
                    fArr4[i22] = f12;
                    i24++;
                } else if (Float.isNaN(f12) || f13 < f12) {
                    fArr4[i22] = f13;
                    i25++;
                } else {
                    fArr4[i22] = f12;
                    i24++;
                    i25++;
                    i23++;
                }
                i22++;
            }
            fArrCopyOf = i23 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i23);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i26 = i20;
        while (i26 < length2) {
            float f14 = fArrCopyOf[i26];
            int iBinarySearch = Arrays.binarySearch(fArr, f14);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f14);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f15 = fArr3[iBinarySearch2];
                if (i13 < 2 || f14 == fArr[i20]) {
                    iArgb = iArr[i20];
                } else {
                    int i27 = 1;
                    while (true) {
                        if (i27 >= i13) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f7 = fArr[i27];
                        if (f7 >= f14 || i27 == i13 - 1) {
                            break;
                        }
                        i27++;
                    }
                    if (i27 != i13 - 1 || f14 < f7) {
                        int i28 = i27 - 1;
                        float f16 = fArr[i28];
                        int iV = h.v(iArr[i28], iArr[i27], (f14 - f16) / (f7 - f16));
                        iArgb = Color.argb((int) (f15 * 255.0f), Color.red(iV), Color.green(iV), Color.blue(iV));
                    } else {
                        iArgb = Color.argb((int) (f15 * 255.0f), Color.red(iArr[i27]), Color.green(iArr[i27]), Color.blue(iArr[i27]));
                    }
                }
                iArr2[i26] = iArgb;
            } else {
                int i29 = iArr[iBinarySearch];
                if (size < i12 || f14 <= fArr2[i20]) {
                    iArgb2 = Color.argb((int) (fArr3[i20] * 255.0f), Color.red(i29), Color.green(i29), Color.blue(i29));
                } else {
                    int i30 = 1;
                    while (true) {
                        if (i30 >= size) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f10 = fArr2[i30];
                        if (f10 >= f14 || i30 == size - 1) {
                            break;
                        }
                        i30++;
                    }
                    if (f10 <= f14) {
                        fE = fArr3[i30];
                    } else {
                        int i31 = i30 - 1;
                        float f17 = fArr2[i31];
                        fE = g.e(fArr3[i31], fArr3[i30], (f14 - f17) / (f10 - f17));
                    }
                    iArgb2 = Color.argb((int) (fE * 255.0f), Color.red(i29), Color.green(i29), Color.blue(i29));
                }
                iArr2[i26] = iArgb2;
            }
            i26++;
            i12 = 2;
        }
        return new s4.c(fArrCopyOf, iArr2);
    }

    @Override // io.d
    public Object getValue(Object obj, KProperty property) {
        sq.d thisRef = (sq.d) obj;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return thisRef.f20499d.get(this.f17185e);
    }

    @Override // bd.k
    public l h(j jVar) {
        int i7;
        int i10 = e0.f13788a;
        if (i10 < 23 || ((i7 = this.f17185e) != 1 && (i7 != 0 || i10 < 31))) {
            return new io.sentry.hints.j(3).h(jVar);
        }
        int iH = o.h(jVar.f3168c.I);
        je.b.y("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + e0.B(iH));
        return new e4.e(iH).h(jVar);
    }

    @Override // kb.b
    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, com.facebook.soloader.b0[] b0VarArr) {
        if (unsatisfiedLinkError instanceof com.facebook.soloader.a0) {
            com.facebook.soloader.a0 a0Var = (com.facebook.soloader.a0) unsatisfiedLinkError;
            String str = a0Var.f5378d;
            String message = a0Var.getMessage();
            if (str == null) {
                Log.e("SoLoader", "No so name provided in ULE, cannot recover");
                return false;
            }
            if (!(a0Var instanceof z)) {
                if (message != null && (message.contains("/app/") || message.contains("/mnt/"))) {
                    Log.e("SoLoader", "Reunpacking BackupSoSources due to " + a0Var + ", retrying for specific library " + str);
                    int length = b0VarArr.length;
                    for (int i7 = 0; i7 < length; i7++) {
                        com.facebook.soloader.b0 b0Var = b0VarArr[i7];
                        if (b0Var instanceof com.facebook.soloader.b) {
                            com.facebook.soloader.b bVar = (com.facebook.soloader.b) b0Var;
                            try {
                                Log.e("SoLoader", "Preparing BackupSoSource for the first time BackupSoSource");
                                bVar.d(0);
                                for (com.facebook.soloader.b0 b0Var2 : b0VarArr) {
                                    if ((b0Var2 instanceof com.facebook.soloader.e) && !(b0Var2 instanceof com.facebook.soloader.b)) {
                                        ((com.facebook.soloader.e) b0Var2).f5387b |= 1;
                                    }
                                }
                                return true;
                            } catch (Exception e10) {
                                Log.e("SoLoader", "Encountered an exception while reunpacking BackupSoSource BackupSoSource for library " + str + ": ", e10);
                                break;
                            }
                        }
                    }
                }
            } else if ((this.f17185e & 1) != 0) {
                Log.e("SoLoader", "Reunpacking BackupSoSources due to " + a0Var + ", retrying for specific library " + str);
                try {
                    for (com.facebook.soloader.b0 b0Var3 : b0VarArr) {
                        if ((b0Var3 instanceof com.facebook.soloader.b) && ((com.facebook.soloader.b) b0Var3).j(str)) {
                            return true;
                        }
                    }
                } catch (IOException e11) {
                    Log.e("SoLoader", "Failed to run recovery for backup so source due to: " + e11);
                    return false;
                }
            }
        }
        return false;
    }

    public int k(int i7) {
        int i10 = this.f17185e;
        if (i10 == -1) {
            return i7 == 7 ? 6 : 3;
        }
        return i10;
    }

    @Override // mf.c
    public int l(Context context) {
        return this.f17185e;
    }

    public int m(int i7) {
        int i10 = this.f17185e;
        int i11 = i7 % i10;
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11 + i10;
    }

    public String toString() {
        switch (this.f17184d) {
            case 9:
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return a3.e.q(new Object[]{Integer.valueOf(this.f17185e)}, 1, null, "Status: %d", "format(...)");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i7, int i10) {
        this.f17184d = i10;
        this.f17185e = i7;
    }

    @Override // o9.a
    public void c() {
    }

    @Override // o9.a
    public void d() {
    }

    @Override // o9.a
    public void g(int i7, int i10) {
    }
}
