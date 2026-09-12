package o9;

import com.facebook.common.references.CloseableReference;
import e4.r;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q9.g;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements a {
    public q9.d E;
    public final int F;
    public int G;
    public final e H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pf.b f17188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r9.a f17189e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q9.e f17190i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f17191v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f17192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f17193x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f17194y;

    public f(String str, pf.b animationInformation, r9.a bitmapFrameRenderer, q9.e frameLoaderFactory, boolean z5) {
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(frameLoaderFactory, "frameLoaderFactory");
        this.f17188d = animationInformation;
        this.f17189e = bitmapFrameRenderer;
        this.f17190i = frameLoaderFactory;
        this.f17191v = z5;
        this.f17192w = str == null ? String.valueOf(hashCode()) : str;
        this.f17193x = ((ca.a) animationInformation.f18027e).f3549c.getWidth();
        this.f17194y = ((ca.a) animationInformation.f18027e).f3549c.getHeight();
        long millis = TimeUnit.SECONDS.toMillis(1L) / ((long) (((ca.a) animationInformation.f18027e).f3552f / animationInformation.h()));
        int i7 = (int) (millis >= 1 ? millis : 1L);
        this.F = i7;
        this.G = i7;
        this.H = new e(this);
    }

    @Override // o9.a
    public final void a(c bitmapFramePreparer, m9.b bitmapFrameCache, m9.a animationBackend, int i7) {
        Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // o9.a
    public final CloseableReference b(int i7, int i10, int i11) {
        r frameResult;
        c5.e eVarE = e(i10, i11);
        q9.d dVarF = f();
        if (dVarF != null) {
            int i12 = eVarE.f3485b;
            int i13 = eVarE.f3486c;
            Integer num = (Integer) dVarF.k.get(Integer.valueOf(i7));
            if (num != null) {
                int iIntValue = num.intValue();
                dVarF.j = iIntValue;
                q9.c cVar = (q9.c) dVarF.f18656f.get(num);
                if (cVar == null || cVar.f18650b || !cVar.f18649a.u()) {
                    cVar = null;
                }
                if (cVar != null) {
                    d dVar = dVarF.f18659i;
                    int i14 = dVarF.f18657g;
                    int iM = dVar.m(dVarF.f18655e + i14);
                    if (i14 >= iM ? !((i14 > iIntValue || iIntValue > dVar.f17185e) && (iIntValue < 0 || iIntValue > iM)) : !(i14 > iIntValue || iIntValue > iM)) {
                        dVarF.e(i12, i13);
                    }
                    frameResult = new r(cVar.f18649a.clone(), q9.f.f18665d);
                } else {
                    dVarF.e(i12, i13);
                    frameResult = dVarF.c(iIntValue);
                }
            } else {
                frameResult = dVarF.c(i7);
            }
        } else {
            frameResult = null;
        }
        if (frameResult != null) {
            AtomicInteger atomicInteger = q9.b.f18642a;
            e animation = this.H;
            Intrinsics.checkNotNullParameter(animation, "animation");
            Intrinsics.checkNotNullParameter(frameResult, "frameResult");
            ConcurrentHashMap concurrentHashMap = q9.b.f18645d;
            if (!concurrentHashMap.contains(animation)) {
                concurrentHashMap.put(animation, Integer.valueOf((int) (animation.f17186a * 0.2f)));
            }
            int iOrdinal = ((q9.f) frameResult.f8035i).ordinal();
            if (iOrdinal == 0) {
                q9.b.f18642a.incrementAndGet();
            } else if (iOrdinal == 1) {
                q9.b.f18643b.incrementAndGet();
            } else {
                if (iOrdinal != 2) {
                    throw new n();
                }
                q9.b.f18644c.incrementAndGet();
            }
        }
        if (frameResult != null) {
            return (CloseableReference) frameResult.f8034e;
        }
        return null;
    }

    @Override // o9.a
    public final void c() {
        q9.d frameLoader = f();
        if (frameLoader != null) {
            ConcurrentHashMap concurrentHashMap = q9.e.f18661d;
            String cacheKey = this.f17192w;
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            Intrinsics.checkNotNullParameter(frameLoader, "frameLoader");
            q9.e.f18661d.put(cacheKey, new g(frameLoader, new Date()));
        }
        this.E = null;
    }

    @Override // o9.a
    public final void d() {
        f();
        c();
    }

    public final c5.e e(int i7, int i10) {
        boolean z5 = this.f17191v;
        int i11 = this.f17194y;
        int i12 = this.f17193x;
        if (!z5) {
            return new c5.e(i12, i11, 6);
        }
        if (i7 < i12 || i10 < i11) {
            double d6 = ((double) i12) / ((double) i11);
            if (i10 > i7) {
                if (i10 > i11) {
                    i10 = i11;
                }
                i12 = (int) (((double) i10) * d6);
                i11 = i10;
            } else {
                if (i7 > i12) {
                    i7 = i12;
                }
                i11 = (int) (((double) i7) / d6);
                i12 = i7;
            }
        }
        return new c5.e(i12, i11, 6);
    }

    public final q9.d f() {
        q9.d dVar;
        if (this.E == null) {
            q9.e eVar = this.f17190i;
            String cacheKey = this.f17192w;
            r9.a bitmapFrameRenderer = this.f17189e;
            pf.b animationInformation = this.f17188d;
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
            Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
            ConcurrentHashMap concurrentHashMap = q9.e.f18661d;
            synchronized (concurrentHashMap) {
                g gVar = (g) concurrentHashMap.get(cacheKey);
                if (gVar != null) {
                    concurrentHashMap.remove(cacheKey);
                    dVar = gVar.f18669a;
                } else {
                    Unit unit = Unit.f14616a;
                    dVar = new q9.d(eVar.f18662a, bitmapFrameRenderer, new p9.b(eVar.f18663b), animationInformation, eVar.f18664c);
                }
            }
            this.E = dVar;
        }
        return this.E;
    }

    @Override // o9.a
    public final void g(int i7, int i10) {
        if (i7 <= 0 || i10 <= 0 || this.f17193x <= 0 || this.f17194y <= 0) {
            return;
        }
        c5.e eVarE = e(i7, i10);
        q9.d dVarF = f();
        if (dVarF != null) {
            int i11 = eVarE.f3485b;
            o5.a onAnimationLoaded = new o5.a(2);
            Intrinsics.checkNotNullParameter(onAnimationLoaded, "onAnimationLoaded");
            dVarF.e(i11, i11);
            Unit unit = Unit.f14616a;
        }
    }
}
