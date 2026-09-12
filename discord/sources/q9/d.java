package q9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import e4.r;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.p0;
import kotlin.collections.s0;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lo.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlatformBitmapFactory f18651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r9.a f18652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p9.b f18653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pf.b f18654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f18656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile int f18657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f18658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o9.d f18659i;
    public int j;
    public Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Set f18660l;

    public d(PlatformBitmapFactory platformBitmapFactory, r9.a bitmapFrameRenderer, p9.b fpsCompressor, pf.b animationInformation, int i7) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(fpsCompressor, "fpsCompressor");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.f18651a = platformBitmapFactory;
        this.f18652b = bitmapFrameRenderer;
        this.f18653c = fpsCompressor;
        this.f18654d = animationInformation;
        int iD = (d(animationInformation) * i7) / 1000;
        iD = iD < 1 ? 1 : iD;
        this.f18655e = iD;
        this.f18656f = new ConcurrentHashMap();
        this.f18659i = new o9.d(animationInformation.h(), 6);
        this.j = -1;
        this.k = w0.d();
        this.f18660l = p0.f14661d;
        a(d(animationInformation));
        this.f18657g = (int) (iD * 0.5f);
    }

    public static int d(pf.b bVar) {
        long millis = TimeUnit.SECONDS.toMillis(1L) / ((long) (((ca.a) bVar.f18027e).f3552f / bVar.h()));
        return (int) (millis >= 1 ? millis : 1L);
    }

    public final void a(int i7) {
        pf.b bVar = this.f18654d;
        int i10 = ((ca.a) bVar.f18027e).f3552f;
        int iL = bVar.l();
        if (iL < 1) {
            iL = 1;
        }
        int i11 = i10 * iL;
        int iH = bVar.h();
        int iD = d(bVar);
        if (i7 > iD) {
            i7 = iD;
        }
        int i12 = i7 >= 1 ? i7 : 1;
        int i13 = this.f18653c.f17792a;
        if (i12 > i13) {
            i12 = i13;
        }
        float f2 = (i11 / 1000.0f) * i12;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float f7 = iH;
        if (f2 > f7) {
            f2 = f7;
        }
        float f10 = f7 / f2;
        int i14 = 0;
        IntRange intRangeI = j.i(0, iH);
        int iA = v0.a(e0.l(intRangeI, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = intRangeI.iterator();
        while (((lo.b) it).f15156i) {
            Object next = it.next();
            int iIntValue = ((Number) next).intValue();
            if (((int) (iIntValue % f10)) == 0) {
                i14 = iIntValue;
            }
            linkedHashMap.put(next, Integer.valueOf(i14));
        }
        this.k = linkedHashMap;
        this.f18660l = CollectionsKt.l0(linkedHashMap.values());
    }

    public final a b(int i7) {
        a aVar;
        o9.d dVar = this.f18659i;
        Iterator it = new IntRange(0, dVar.f17185e, 1).iterator();
        do {
            aVar = null;
            if (!((lo.b) it).f15156i) {
                break;
            }
            int iM = dVar.m(i7 - ((s0) it).nextInt());
            c cVar = (c) this.f18656f.get(Integer.valueOf(iM));
            if (cVar != null) {
                if (cVar.f18650b || !cVar.f18649a.u()) {
                    cVar = null;
                }
                if (cVar != null) {
                    aVar = new a(iM, cVar.f18649a);
                }
            }
        } while (aVar == null);
        return aVar;
    }

    public final r c(int i7) {
        a aVarB = b(i7);
        if (aVarB == null) {
            return new r((CloseableReference) null, f.f18667i);
        }
        CloseableReference closeableReferenceClone = aVarB.f18641e.clone();
        Intrinsics.checkNotNullExpressionValue(closeableReferenceClone, "clone(...)");
        this.j = aVarB.f18640d;
        return new r(closeableReferenceClone, f.f18666e);
    }

    public final void e(int i7, int i10) {
        if (this.f18658h) {
            return;
        }
        this.f18658h = true;
        ExecutorService executorService = p9.a.f17791a;
        com.swmansion.reanimated.keyboard.c task = new com.swmansion.reanimated.keyboard.c(this, i7, i10, 4);
        Intrinsics.checkNotNullParameter(task, "task");
        p9.a.f17791a.execute(task);
    }

    public final void f(int i7, CloseableReference closeableReference) throws IOException {
        CloseableReference closeableReference2;
        CloseableReference closeableReferenceF;
        a aVarB = b(i7);
        r9.a aVar = this.f18652b;
        if (aVarB != null && (closeableReference2 = aVarB.f18641e) != null && (closeableReferenceF = closeableReference2.f()) != null) {
            try {
                int i10 = aVarB.f18640d;
                if (i10 < i7) {
                    Object objQ = closeableReferenceF.q();
                    Intrinsics.checkNotNullExpressionValue(objQ, "get(...)");
                    Bitmap bitmap = (Bitmap) objQ;
                    if (closeableReference.u() && !Intrinsics.areEqual(closeableReference.q(), bitmap)) {
                        Canvas canvas = new Canvas((Bitmap) closeableReference.q());
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    }
                    Iterator it = new IntRange(i10 + 1, i7, 1).iterator();
                    while (((lo.b) it).f15156i) {
                        int iNextInt = ((s0) it).nextInt();
                        Object objQ2 = closeableReference.q();
                        Intrinsics.checkNotNullExpressionValue(objQ2, "get(...)");
                        aVar.m(iNextInt, (Bitmap) objQ2);
                    }
                    closeableReferenceF.close();
                    return;
                }
                Unit unit = Unit.f14616a;
                closeableReferenceF.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ls.d.k(closeableReferenceF, th2);
                    throw th3;
                }
            }
        }
        if (closeableReference.u()) {
            new Canvas((Bitmap) closeableReference.q()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
        Iterator it2 = new IntRange(0, i7, 1).iterator();
        while (((lo.b) it2).f15156i) {
            int iNextInt2 = ((s0) it2).nextInt();
            Object objQ3 = closeableReference.q();
            Intrinsics.checkNotNullExpressionValue(objQ3, "get(...)");
            aVar.m(iNextInt2, (Bitmap) objQ3);
        }
    }
}
