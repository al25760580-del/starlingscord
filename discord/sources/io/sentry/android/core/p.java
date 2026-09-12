package io.sentry.android.core;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.Surface;
import androidx.collection.SimpleArrayMap;
import androidx.customview.widget.ViewDragHelper;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.qr.scanner.QRScanner;
import com.discord.react.utilities.ReactSelfMeasurer;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import io.sentry.SentryLevel;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.RootViewsSpy;
import io.sentry.android.replay.screenshot.PixelCopyStrategy;
import io.sentry.react.RNSentryModuleImpl;
import io.sentry.react.RNSentryOnDrawReporterManager;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12357e;

    public /* synthetic */ p(int i7, Object obj) {
        this.f12356d = i7;
        this.f12357e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0211  */
    /* JADX WARN: Code duplicated, block: B:144:0x0219  */
    /* JADX WARN: Code duplicated, block: B:146:0x0228  */
    /* JADX WARN: Code duplicated, block: B:148:0x022e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0239  */
    /* JADX WARN: Code duplicated, block: B:153:0x023f  */
    /* JADX WARN: Code duplicated, block: B:154:0x024b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0260  */
    /* JADX WARN: Code duplicated, block: B:159:0x026a  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:169:0x0314  */
    /* JADX WARN: Code duplicated, block: B:241:0x0318 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        long j;
        long j5;
        float f2;
        long j7;
        long j10;
        float f7;
        j2.i iVar;
        int i7;
        float f10;
        boolean z5 = false;
        int i10 = 1;
        switch (this.f12356d) {
            case 0:
                ((t) this.f12357e).a(null, true);
                return;
            case 1:
                e0 e0Var = (e0) this.f12357e;
                if (e0Var != null) {
                    ProcessLifecycleOwner.F.f2323x.c(e0Var);
                    return;
                }
                return;
            case 2:
                ((SystemEventsBreadcrumbsIntegration) this.f12357e).i();
                return;
            case 3:
                ((io.sentry.internal.modules.f) this.f12357e).a();
                return;
            case 4:
                ReplayIntegration.finalizePreviousReplay$lambda$10((ReplayIntegration) this.f12357e);
                return;
            case 5:
                RootViewsSpy.Companion.install$lambda$1$lambda$0((RootViewsSpy) this.f12357e);
                return;
            case 6:
                PixelCopyStrategy.close$lambda$4((PixelCopyStrategy) this.f12357e);
                return;
            case 7:
                io.sentry.cache.g gVar = (io.sentry.cache.g) this.f12357e;
                try {
                    ((io.sentry.cache.tape.e) gVar.f12543b.a()).clear();
                    return;
                } catch (IOException e10) {
                    gVar.f12542a.getLogger().g(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e10);
                    return;
                }
            case 8:
                io.sentry.logger.c cVar = (io.sentry.logger.c) this.f12357e;
                cVar.f12807w.b(cVar.f12804e.getShutdownTimeoutMillis());
                return;
            case 9:
                io.sentry.logger.c cVar2 = (io.sentry.logger.c) this.f12357e;
                cVar2.f12807w.b(cVar2.f12804e.getShutdownTimeoutMillis());
                return;
            case 10:
                ((RNSentryModuleImpl) this.f12357e).lambda$createEmitNewFrameEvent$0();
                return;
            case 11:
                ((RNSentryOnDrawReporterManager.RNSentryOnDrawReporterView) this.f12357e).lambda$processPropsChanged$0();
                return;
            case 12:
                j2.c cVar3 = (j2.c) ((j2.c) this.f12357e).f13618c.f20946d;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = cVar3.f13617b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    SpringAnimation springAnimation = (SpringAnimation) arrayList.get(i11);
                    if (springAnimation == null) {
                        i11 = i11;
                        i10 = i10;
                        jUptimeMillis = jUptimeMillis;
                    } else {
                        SimpleArrayMap simpleArrayMap = cVar3.f13616a;
                        Long l6 = (Long) simpleArrayMap.get(springAnimation);
                        if (l6 == null) {
                            j = springAnimation.f2007i;
                            if (j == 0) {
                                springAnimation.f2007i = jUptimeMillis;
                                springAnimation.e(springAnimation.f2000b);
                                i11 = i11;
                                i10 = i10;
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j5 = jUptimeMillis - j;
                                springAnimation.f2007i = jUptimeMillis;
                                f2 = SpringAnimation.d().f13622g;
                                if (f2 == 0.0f) {
                                    j7 = 2147483647L;
                                } else {
                                    j7 = (long) (j5 / f2);
                                }
                                j10 = j7;
                                if (springAnimation.f2011o) {
                                    f10 = springAnimation.f2010n;
                                    if (f10 != Float.MAX_VALUE) {
                                        springAnimation.f2009m.f13639i = f10;
                                        springAnimation.f2010n = Float.MAX_VALUE;
                                    }
                                    springAnimation.f2000b = (float) springAnimation.f2009m.f13639i;
                                    springAnimation.f1999a = 0.0f;
                                    springAnimation.f2011o = z5;
                                    i11 = i11;
                                } else {
                                    i10 = i10;
                                    jUptimeMillis = jUptimeMillis;
                                    if (springAnimation.f2010n != Float.MAX_VALUE) {
                                        long j11 = j10 / 2;
                                        j2.f fVarC = springAnimation.f2009m.c(springAnimation.f2000b, springAnimation.f1999a, j11);
                                        j2.i iVar2 = springAnimation.f2009m;
                                        iVar2.f13639i = springAnimation.f2010n;
                                        springAnimation.f2010n = Float.MAX_VALUE;
                                        j2.f fVarC2 = iVar2.c(fVarC.f13626a, fVarC.f13627b, j11);
                                        springAnimation.f2000b = fVarC2.f13626a;
                                        springAnimation.f1999a = fVarC2.f13627b;
                                    } else {
                                        j2.f fVarC3 = springAnimation.f2009m.c(springAnimation.f2000b, springAnimation.f1999a, j10);
                                        springAnimation.f2000b = fVarC3.f13626a;
                                        springAnimation.f1999a = fVarC3.f13627b;
                                    }
                                    float fMax = Math.max(springAnimation.f2000b, springAnimation.f2006h);
                                    springAnimation.f2000b = fMax;
                                    float fMin = Math.min(fMax, springAnimation.f2005g);
                                    springAnimation.f2000b = fMin;
                                    f7 = springAnimation.f1999a;
                                    iVar = springAnimation.f2009m;
                                    iVar.getClass();
                                    if (Math.abs(f7) < iVar.f13635e) {
                                    }
                                    i7 = 0;
                                    float fMin2 = Math.min(springAnimation.f2000b, springAnimation.f2005g);
                                    springAnimation.f2000b = fMin2;
                                    float fMax2 = Math.max(fMin2, springAnimation.f2006h);
                                    springAnimation.f2000b = fMax2;
                                    springAnimation.e(fMax2);
                                    if (i7 != 0) {
                                        springAnimation.c(false);
                                    }
                                }
                                i7 = i10;
                                float fMin3 = Math.min(springAnimation.f2000b, springAnimation.f2005g);
                                springAnimation.f2000b = fMin3;
                                float fMax3 = Math.max(fMin3, springAnimation.f2006h);
                                springAnimation.f2000b = fMax3;
                                springAnimation.e(fMax3);
                                if (i7 != 0) {
                                    springAnimation.c(false);
                                }
                            }
                        } else if (l6.longValue() < jUptimeMillis2) {
                            simpleArrayMap.remove(springAnimation);
                            j = springAnimation.f2007i;
                            if (j == 0) {
                                springAnimation.f2007i = jUptimeMillis;
                                springAnimation.e(springAnimation.f2000b);
                                i11 = i11;
                                i10 = i10;
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j5 = jUptimeMillis - j;
                                springAnimation.f2007i = jUptimeMillis;
                                f2 = SpringAnimation.d().f13622g;
                                if (f2 == 0.0f) {
                                    j7 = 2147483647L;
                                } else {
                                    j7 = (long) (j5 / f2);
                                }
                                j10 = j7;
                                if (springAnimation.f2011o) {
                                    f10 = springAnimation.f2010n;
                                    if (f10 != Float.MAX_VALUE) {
                                        springAnimation.f2009m.f13639i = f10;
                                        springAnimation.f2010n = Float.MAX_VALUE;
                                    }
                                    springAnimation.f2000b = (float) springAnimation.f2009m.f13639i;
                                    springAnimation.f1999a = 0.0f;
                                    springAnimation.f2011o = z5;
                                    i11 = i11;
                                } else {
                                    i10 = i10;
                                    jUptimeMillis = jUptimeMillis;
                                    if (springAnimation.f2010n != Float.MAX_VALUE) {
                                        long j12 = j10 / 2;
                                        j2.f fVarC4 = springAnimation.f2009m.c(springAnimation.f2000b, springAnimation.f1999a, j12);
                                        j2.i iVar3 = springAnimation.f2009m;
                                        iVar3.f13639i = springAnimation.f2010n;
                                        springAnimation.f2010n = Float.MAX_VALUE;
                                        j2.f fVarC5 = iVar3.c(fVarC4.f13626a, fVarC4.f13627b, j12);
                                        springAnimation.f2000b = fVarC5.f13626a;
                                        springAnimation.f1999a = fVarC5.f13627b;
                                    } else {
                                        j2.f fVarC6 = springAnimation.f2009m.c(springAnimation.f2000b, springAnimation.f1999a, j10);
                                        springAnimation.f2000b = fVarC6.f13626a;
                                        springAnimation.f1999a = fVarC6.f13627b;
                                    }
                                    float fMax4 = Math.max(springAnimation.f2000b, springAnimation.f2006h);
                                    springAnimation.f2000b = fMax4;
                                    float fMin4 = Math.min(fMax4, springAnimation.f2005g);
                                    springAnimation.f2000b = fMin4;
                                    f7 = springAnimation.f1999a;
                                    iVar = springAnimation.f2009m;
                                    iVar.getClass();
                                    if (Math.abs(f7) < iVar.f13635e || Math.abs(fMin4 - ((float) iVar.f13639i)) >= iVar.f13634d) {
                                        i7 = 0;
                                    } else {
                                        springAnimation.f2000b = (float) springAnimation.f2009m.f13639i;
                                        springAnimation.f1999a = 0.0f;
                                    }
                                    float fMin5 = Math.min(springAnimation.f2000b, springAnimation.f2005g);
                                    springAnimation.f2000b = fMin5;
                                    float fMax5 = Math.max(fMin5, springAnimation.f2006h);
                                    springAnimation.f2000b = fMax5;
                                    springAnimation.e(fMax5);
                                    if (i7 != 0) {
                                        springAnimation.c(false);
                                    }
                                }
                                i7 = i10;
                                float fMin6 = Math.min(springAnimation.f2000b, springAnimation.f2005g);
                                springAnimation.f2000b = fMin6;
                                float fMax6 = Math.max(fMin6, springAnimation.f2006h);
                                springAnimation.f2000b = fMax6;
                                springAnimation.e(fMax6);
                                if (i7 != 0) {
                                    springAnimation.c(false);
                                }
                            }
                        } else {
                            i11 = i11;
                            i10 = i10;
                            jUptimeMillis = jUptimeMillis;
                        }
                    }
                    i11++;
                    i10 = i10;
                    jUptimeMillis = jUptimeMillis;
                    z5 = false;
                }
                int i12 = i10;
                if (cVar3.f13621f) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        cVar3.f13623h.a();
                    }
                    cVar3.f13621f = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) cVar3.f13620e.f12759e).postFrameCallback(new com.facebook.react.modules.core.b(i12, cVar3.f13619d));
                    return;
                }
                return;
            case 13:
                ((c6.a) this.f12357e).invoke();
                return;
            case 14:
                k2.p pVar = (k2.p) this.f12357e;
                synchronized (pVar.f14254v) {
                    try {
                        if (pVar.E == null) {
                            return;
                        }
                        try {
                            i1.h hVarB = pVar.b();
                            int i13 = hVarB.f11379f;
                            if (i13 == 2) {
                                synchronized (pVar.f14254v) {
                                }
                            }
                            if (i13 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i13 + ")");
                            }
                            try {
                                Method method = f1.e.f8791b;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                kh.f fVar = pVar.f14253i;
                                Context context = pVar.f14251d;
                                fVar.getClass();
                                i1.h[] hVarArr = {hVarB};
                                gn.h hVar = b1.f.f3028a;
                                Trace.beginSection(mo.c0.Q("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface typefaceP = b1.f.f3028a.p(context, hVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferA = ib.a.A(pVar.f14251d, hVarB.f11374a);
                                    if (mappedByteBufferA == null || typefaceP == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(typefaceP, android.support.v4.media.session.b.r(mappedByteBufferA));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (pVar.f14254v) {
                                            try {
                                                a.a aVar = pVar.E;
                                                if (aVar != null) {
                                                    aVar.t(rVar);
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                            break;
                                        }
                                        pVar.a();
                                        return;
                                    } catch (Throwable th3) {
                                        Method method2 = f1.e.f8791b;
                                        Trace.endSection();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            } catch (Throwable th5) {
                                Method method3 = f1.e.f8791b;
                                Trace.endSection();
                                throw th5;
                            }
                            break;
                        } catch (Throwable th6) {
                            synchronized (pVar.f14254v) {
                                try {
                                    a.a aVar2 = pVar.E;
                                    if (aVar2 != null) {
                                        aVar2.s(th6);
                                    }
                                    pVar.a();
                                    return;
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        }
                    } catch (Throwable th8) {
                        throw th8;
                    }
                }
            case 15:
                kl.c cVar4 = (kl.c) this.f12357e;
                cVar4.getClass();
                try {
                    cVar4.f14581l = cVar4.f14572a.getNetworkCapabilities(cVar4.k);
                    cVar4.e();
                    return;
                } catch (SecurityException unused) {
                    return;
                }
            case 16:
                x4.h.b((InputStream) this.f12357e);
                return;
            case 17:
                x4.h.b((ZipInputStream) this.f12357e);
                return;
            case 18:
                ((l4.c0) this.f12357e).c();
                return;
            case 19:
                le.k kVar = (le.k) this.f12357e;
                Surface surface = kVar.E;
                if (surface != null) {
                    Iterator it = kVar.f15057d.iterator();
                    while (it.hasNext()) {
                        ((gc.w) it.next()).f9916d.r0(null);
                    }
                }
                SurfaceTexture surfaceTexture = kVar.f15063y;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar.f15063y = null;
                kVar.E = null;
                return;
            case 20:
                lh.d dVar = (lh.d) this.f12357e;
                dVar.f15090c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) dVar.f15092e;
                ViewDragHelper viewDragHelper = sideSheetBehavior.f6424i;
                if (viewDragHelper != null && viewDragHelper.g()) {
                    dVar.g(dVar.f15089b);
                    return;
                } else {
                    if (sideSheetBehavior.f6423h == 2) {
                        sideSheetBehavior.s(dVar.f15089b);
                        return;
                    }
                    return;
                }
            case 21:
                ViewMeasureExtensionsKt.measureAndLayout((QRScanner) this.f12357e);
                return;
            case 22:
                mc.e eVar = (mc.e) this.f12357e;
                if (eVar.f15523i) {
                    return;
                }
                mc.k kVar2 = eVar.f15522e;
                if (kVar2 != null) {
                    kVar2.d(eVar.f15521d);
                }
                eVar.f15524v.f15539n.remove(eVar);
                eVar.f15523i = true;
                return;
            case 23:
                ((mc.c) this.f12357e).d(null);
                return;
            case 24:
                ReactSelfMeasurer.measureAndLayoutRunnable$lambda$0((ReactSelfMeasurer) this.f12357e);
                return;
            case 25:
                ((nh.c) this.f12357e).s(true);
                return;
            case 26:
                nh.k kVar3 = (nh.k) this.f12357e;
                boolean zIsPopupShowing = kVar3.f16851h.isPopupShowing();
                kVar3.s(zIsPopupShowing);
                kVar3.f16854m = zIsPopupShowing;
                return;
            case 27:
                ((TextInputLayout) this.f12357e).f6467w.requestLayout();
                return;
            case 28:
                ((pc.r) this.f12357e).i();
                return;
            default:
                MaterialButton.a((MaterialButton) this.f12357e);
                return;
        }
    }

    public /* synthetic */ p(f0 f0Var, e0 e0Var) {
        this.f12356d = 1;
        this.f12357e = e0Var;
    }
}
