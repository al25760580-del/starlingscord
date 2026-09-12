package io.sentry.react;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.Surface;
import androidx.core.view.p1;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.discord.device.DeviceAccessibilityModule;
import com.discord.device.DeviceSettingsModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.util.concurrent.ListenableFuture;
import e4.j;
import gc.o;
import gc.w;
import hc.p;
import he.r;
import io.sentry.k4;
import ir.e;
import ir.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import je.e0;
import je.u;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import le.k;
import mc.q;
import md.g0;
import mi.n;
import n1.h;
import ni.g;
import p2.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13103e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13104i;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f13102d = i7;
        this.f13103e = obj;
        this.f13104i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        int i7 = 1;
        h hVar = null;
        boolean z5 = false;
        switch (this.f13102d) {
            case 0:
                RNSentryTimeToDisplay.lambda$getTimeToDisplay$1((k4) this.f13103e, (Promise) this.f13104i);
                return;
            case 1:
                ((e) ((f) this.f13103e)).g((ir.b) this.f13104i, Unit.f14616a);
                return;
            case 2:
                ((r) this.f13104i).a(((u) this.f13103e).d());
                return;
            case 3:
                e4.r rVar = (e4.r) this.f13103e;
                VideoSize videoSize = (VideoSize) this.f13104i;
                w wVar = (w) rVar.f8035i;
                int i10 = e0.f13788a;
                com.google.android.exoplayer2.c cVar = wVar.f9916d;
                cVar.f5646e0 = videoSize;
                cVar.f5654l.e(25, new o(5, videoSize));
                return;
            case 4:
                e4.r rVar2 = (e4.r) this.f13103e;
                String str = (String) this.f13104i;
                w wVar2 = (w) rVar2.f8035i;
                int i11 = e0.f13788a;
                hc.u uVar = (hc.u) wVar2.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeH = uVar.h();
                uVar.i(analyticsListener$EventTimeH, 1019, new p(analyticsListener$EventTimeH, str, i7));
                return;
            case 5:
                e4.r rVar3 = (e4.r) this.f13103e;
                Exception exc = (Exception) this.f13104i;
                w wVar3 = (w) rVar3.f8035i;
                int i12 = e0.f13788a;
                hc.u uVar2 = (hc.u) wVar3.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeH2 = uVar2.h();
                uVar2.i(analyticsListener$EventTimeH2, 1030, new hc.r(analyticsListener$EventTimeH2, exc, 2));
                return;
            case 6:
                k kVar = (k) this.f13103e;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f13104i;
                SurfaceTexture surfaceTexture2 = kVar.f15063y;
                Surface surface = kVar.E;
                Surface surface2 = new Surface(surfaceTexture);
                kVar.f15063y = surfaceTexture;
                kVar.E = surface2;
                Iterator it = kVar.f15057d.iterator();
                while (it.hasNext()) {
                    ((w) it.next()).f9916d.r0(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 7:
                mc.e eVar = (mc.e) this.f13103e;
                Format format = (Format) this.f13104i;
                mc.f fVar = eVar.f15524v;
                if (fVar.f15541p == 0 || eVar.f15523i) {
                    return;
                }
                Looper looper = fVar.f15545t;
                looper.getClass();
                eVar.f15522e = fVar.f(looper, eVar.f15521d, format, false);
                fVar.f15539n.add(eVar);
                return;
            case 8:
                g0 g0Var = (g0) this.f13103e;
                pc.u uVar3 = (pc.u) this.f13104i;
                g0Var.V = g0Var.O == null ? uVar3 : new pc.o(-9223372036854775807L);
                g0Var.W = uVar3.i();
                if (!g0Var.f15622c0 && uVar3.i() == -9223372036854775807L) {
                    z5 = true;
                }
                g0Var.X = z5;
                g0Var.Y = z5 ? 7 : 1;
                g0Var.f15634y.w(g0Var.W, uVar3.c(), g0Var.X);
                if (g0Var.S) {
                    return;
                }
                g0Var.j();
                return;
            case 9:
                mi.o oVar = (mi.o) this.f13103e;
                xi.a aVar = (xi.a) this.f13104i;
                if (oVar.f15834b != mi.o.f15832d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (oVar) {
                    qVar = oVar.f15833a;
                    oVar.f15833a = null;
                    oVar.f15834b = aVar;
                    break;
                }
                qVar.getClass();
                return;
            case 10:
                n nVar = (n) this.f13103e;
                xi.a aVar2 = (xi.a) this.f13104i;
                synchronized (nVar) {
                    try {
                        if (nVar.f15830b == null) {
                            nVar.f15829a.add(aVar2);
                        } else {
                            nVar.f15830b.add(aVar2.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 11:
                ni.a aVar3 = (ni.a) this.f13103e;
                Runnable runnable = (Runnable) this.f13104i;
                Process.setThreadPriority(aVar3.f16928c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.f16929d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 12:
                Callable callable = (Callable) this.f13103e;
                g gVar = (g) ((u4.b) this.f13104i).f20945e;
                try {
                    Object objCall = callable.call();
                    if (objCall == null) {
                        objCall = o0.g.f17095y;
                    }
                    if (o0.g.f17094x.g(gVar, null, objCall)) {
                        o0.g.e(gVar);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    if (o0.g.f17094x.g(gVar, null, new o0.b(e10))) {
                        o0.g.e(gVar);
                        return;
                    }
                    return;
                }
            case 13:
                String str2 = (String) this.f13103e;
                m violation = (m) this.f13104i;
                Intrinsics.checkNotNullParameter(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str2, violation);
                throw violation;
            case 14:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0((h) this.f13103e, (Exception) this.f13104i);
                return;
            case 15:
                DeviceAccessibilityModule.enableFocusLock$lambda$2((ReadableArray) this.f13103e, (DeviceAccessibilityModule) this.f13104i);
                return;
            case 16:
                DeviceSettingsModule.setSystemGestureExclusionRects$lambda$2((DeviceSettingsModule) this.f13103e, (ReadableArray) this.f13104i);
                return;
            case 17:
                sd.b bVar = (sd.b) this.f13103e;
                Uri uri = (Uri) this.f13104i;
                bVar.F = false;
                bVar.b(uri);
                return;
            case 18:
                ((h) this.f13103e).h(this.f13104i);
                return;
            case 19:
                ((h) this.f13103e).onResult((n1.p) this.f13104i);
                return;
            case 20:
                ((u1.d) this.f13103e).f().h(((Ref.ObjectRef) this.f13104i).element);
                return;
            case 21:
                ((u1.d) this.f13103e).f().h((o1.o) this.f13104i);
                return;
            case 22:
                ((u1.d) this.f13103e).f().onResult((n1.p) this.f13104i);
                return;
            case 23:
                v1.h hVar2 = (v1.h) this.f13103e;
                n1.f fVar2 = (n1.f) this.f13104i;
                h hVar3 = hVar2.f21363f;
                if (hVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                } else {
                    hVar = hVar3;
                }
                hVar.onResult(fVar2);
                return;
            case 24:
                vl.e eVar2 = (vl.e) this.f13103e;
                p1 p1Var = (p1) this.f13104i;
                double dC = eVar2.c();
                am.e eVar3 = eVar2.f21734d;
                ThemedReactContext themedReactContext = eVar2.f21736i;
                eVar2.E = eVar2.e();
                eVar2.f21740y = dC;
                HashSet hashSet = eVar2.K;
                if (hashSet.contains(p1Var)) {
                    eVar2.H = 0;
                    eVar2.J = null;
                    hashSet.remove(p1Var);
                    return;
                }
                eVar2.b();
                sl.b.b(themedReactContext, "KeyboardController::".concat(!eVar2.E ? "keyboardDidHide" : "keyboardDidShow"), eVar2.d(dC));
                sl.b.a(themedReactContext, eVar3.getId(), new rl.c(eVar2.f21738w, eVar3.getId(), rl.c.G, dC, !eVar2.E ? 0.0d : 1.0d, eVar2.H, eVar2.I));
                eVar2.H = 0;
                int[] iArr = {eVar3.getId()};
                WritableArray writableArrayCreateArray = Arguments.createArray();
                writableArrayCreateArray.pushInt(iArr[0]);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putArray("tags", writableArrayCreateArray);
                sl.b.b(themedReactContext, "onUserDrivenAnimationEnded", writableMapCreateMap);
                return;
            case 25:
                w1.e eVar4 = (w1.e) this.f13103e;
                n1.c cVar2 = (n1.c) this.f13104i;
                h hVar4 = eVar4.f21994f;
                if (hVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                } else {
                    hVar = hVar4;
                }
                hVar.onResult(cVar2);
                return;
            case 26:
                ((h) this.f13103e).onResult((n1.f) this.f13104i);
                return;
            case 27:
                w3.e eVar5 = (w3.e) this.f13103e;
                j jVar = (j) this.f13104i;
                synchronized (eVar5.k) {
                    try {
                        Iterator it2 = eVar5.j.iterator();
                        while (it2.hasNext()) {
                            ((w3.c) it2.next()).e(jVar, false);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case 28:
                w3.r rVar4 = (w3.r) this.f13103e;
                ListenableFuture listenableFuture = (ListenableFuture) this.f13104i;
                if (rVar4.M.f9490d instanceof g4.a) {
                    listenableFuture.cancel(true);
                    return;
                }
                return;
            default:
                j8.d this$0 = (j8.d) this.f13103e;
                w3.j token = (w3.j) this.f13104i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(token, "$token");
                ((e4.r) this$0.f13681c).O(token, 3);
                return;
        }
    }
}
