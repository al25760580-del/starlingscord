package hi;

import af.j0;
import af.t;
import af.w;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import androidx.work.Worker;
import ar.u0;
import com.android.billingclient.api.BillingResult;
import com.discord.R;
import com.discord.ads.AdsModule;
import com.discord.billing.BillingManager;
import com.facebook.datasource.DataSubscriber;
import com.facebook.react.bridge.Promise;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import he.q;
import he.s;
import io.sentry.h4;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import md.b0;
import sh.c1;
import sh.d1;
import sh.p;
import sh.s0;
import sh.v0;
import ze.v;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10797e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f10798i;

    public /* synthetic */ o(int i7, Object obj, Object obj2) {
        this.f10796d = i7;
        this.f10797e = obj;
        this.f10798i = obj2;
    }

    private final void a() {
        synchronized (((ig.j) this.f10798i).f11772i) {
            ((ig.d) ((ig.j) this.f10798i).f11773v).onSuccess(((Task) this.f10797e).i());
        }
    }

    private final void b() {
        try {
            d();
        } catch (Error e10) {
            synchronized (((ni.h) this.f10798i).f16947e) {
                ((ni.h) this.f10798i).f16948i = 1;
                throw e10;
            }
        }
    }

    private final void c() {
        we.i iVar = (we.i) this.f10797e;
        IBinder iBinder = (IBinder) this.f10798i;
        synchronized (iVar) {
            if (iBinder == null) {
                iVar.a("Null service connection");
                return;
            }
            try {
                iVar.f22208i = new e4.l(iBinder);
                iVar.f22206d = 2;
                ((ScheduledExecutorService) iVar.f22211x.f22221d).execute(new we.h(iVar, 0));
            } catch (RemoteException e10) {
                iVar.a(e10.getMessage());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f10797e).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        ni.h.f16945x.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f10797e), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f10797e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f10798i     // Catch: java.lang.Throwable -> L58
            ni.h r2 = (ni.h) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f16947e     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f10798i     // Catch: java.lang.Throwable -> L20
            ni.h r0 = (ni.h) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f16948i     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f16949v     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f16949v = r6     // Catch: java.lang.Throwable -> L20
            r0.f16948i = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f10798i     // Catch: java.lang.Throwable -> L20
            ni.h r4 = (ni.h) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f16947e     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f10797e = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f10798i     // Catch: java.lang.Throwable -> L20
            ni.h r0 = (ni.h) r0     // Catch: java.lang.Throwable -> L20
            r0.f16948i = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f10797e     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f10797e = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = ni.h.f16945x     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f10797e     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f10797e = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.o.d():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        af.g j0Var;
        int i7 = 19;
        int i10 = 0;
        int i11 = 1;
        Throwable th2 = null;
        th2 = null;
        switch (this.f10796d) {
            case 0:
                AdsModule.AnonymousClass1 anonymousClass1 = (AdsModule.AnonymousClass1) this.f10798i;
                Future future = (Future) this.f10797e;
                if (future instanceof ii.a) {
                    m mVar = (m) ((ii.a) future);
                    if (mVar instanceof f) {
                        Object obj = mVar.f10793d;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f10770a;
                        }
                    } else {
                        mVar.getClass();
                    }
                    if (th2 != null) {
                        anonymousClass1.onFailure(th2);
                        return;
                    }
                }
                try {
                    anonymousClass1.onSuccess(ib.a.t(future));
                    return;
                } catch (Error e10) {
                    e = e10;
                    anonymousClass1.onFailure(e);
                    return;
                } catch (RuntimeException e11) {
                    e = e11;
                    anonymousClass1.onFailure(e);
                    return;
                } catch (ExecutionException e12) {
                    anonymousClass1.onFailure(e12.getCause());
                    return;
                }
            case 1:
                a5.b bVar = (a5.b) this.f10797e;
                BillingResult billingResult = (BillingResult) this.f10798i;
                if (bVar.f153f.f238b != null) {
                    BillingManager.handlePurchases$default((BillingManager) bVar.f153f.f238b.f3973b, billingResult, null, false, 4, null);
                    return;
                } else {
                    r.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 2:
                Future future2 = (Future) this.f10797e;
                if (future2.isDone() || future2.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f10798i;
                future2.cancel(true);
                r.h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ((ar.k) this.f10798i).C((u0) this.f10797e, Unit.f14616a);
                return;
            case 4:
                com.reactnativecommunity.webview.l.f7060b.put(Integer.valueOf(((com.reactnativecommunity.webview.j) this.f10797e).getId()), Integer.valueOf(((com.reactnativecommunity.webview.c) this.f10798i).getId()));
                return;
            case 5:
                e5.i iVar = (e5.i) this.f10797e;
                e5.i iVar2 = (e5.i) this.f10798i;
                s sVar = iVar2.f8063i;
                if (iVar2.F == null) {
                    DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(com.google.android.exoplayer2.trackselection.a.f5747n0, new k8.a(), null);
                    iVar2.G = defaultTrackSelector;
                    com.google.android.exoplayer2.trackselection.a aVarC = defaultTrackSelector.c();
                    aVarC.getClass();
                    fe.g gVar = new fe.g(aVarC);
                    int i12 = iVar2.T;
                    if (i12 == 0) {
                        i12 = Integer.MAX_VALUE;
                    }
                    gVar.f9124d = i12;
                    defaultTrackSelector.i(new com.google.android.exoplayer2.trackselection.a(gVar));
                    q qVar = new q();
                    int i13 = iVar2.U;
                    int i14 = iVar2.V;
                    int i15 = iVar2.W;
                    int i16 = iVar2.a0;
                    gc.j.a(i15, 0, "bufferForPlaybackMs", "0");
                    gc.j.a(i16, 0, "bufferForPlaybackAfterRebufferMs", "0");
                    gc.j.a(i13, i15, "minBufferMs", "bufferForPlaybackMs");
                    gc.j.a(i13, i16, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                    gc.j.a(i14, i13, "maxBufferMs", "minBufferMs");
                    gc.j jVar = new gc.j(qVar, i13, i14, i15, i16, true);
                    gc.m mVar2 = new gc.m(iVar2.getContext(), new gc.b(iVar2.getContext()));
                    DefaultTrackSelector defaultTrackSelector2 = iVar2.G;
                    je.b.k(!mVar2.f9772s);
                    defaultTrackSelector2.getClass();
                    mVar2.f9760e = new app.rive.runtime.kotlin.core.a(27, defaultTrackSelector2);
                    je.b.k(!mVar2.f9772s);
                    sVar.getClass();
                    mVar2.f9762g = new app.rive.runtime.kotlin.core.a(29, sVar);
                    je.b.k(!mVar2.f9772s);
                    mVar2.f9761f = new app.rive.runtime.kotlin.core.a(26, jVar);
                    je.b.k(!mVar2.f9772s);
                    mVar2.f9772s = true;
                    SimpleExoPlayer simpleExoPlayer = new SimpleExoPlayer(mVar2);
                    iVar2.F = simpleExoPlayer;
                    simpleExoPlayer.u(iVar);
                    iVar2.f8083y.setPlayer(iVar2.F);
                    g5.a aVar = iVar2.f8082x0;
                    aVar.f9496b = iVar;
                    y0.b.f(aVar.f9495a, aVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), null, 4);
                    Handler handler = new Handler();
                    sVar.getClass();
                    ue.i iVar3 = sVar.f10688b;
                    iVar3.getClass();
                    CopyOnWriteArrayList<he.e> copyOnWriteArrayList = (CopyOnWriteArrayList) iVar3.f21117d;
                    for (he.e eVar : copyOnWriteArrayList) {
                        if (eVar.f10600b == iVar) {
                            eVar.f10601c = true;
                            copyOnWriteArrayList.remove(eVar);
                        }
                    }
                    copyOnWriteArrayList.add(new he.e(handler, iVar));
                    iVar2.s(!iVar2.M);
                    iVar2.H = true;
                    iVar2.F.e0(new PlaybackParameters(iVar2.Q, 1.0f));
                }
                if (iVar2.H && iVar2.f8056c0 != null) {
                    iVar2.f8083y.f8045v.f8036d = 0.0f;
                    ArrayList arrayListF = iVar2.f();
                    md.a aVarD = iVar2.d(iVar2.f8056c0, iVar2.f8058d0);
                    if (arrayListF.size() != 0) {
                        arrayListF.add(0, aVarD);
                        aVarD = new b0((md.a[]) arrayListF.toArray(new md.a[arrayListF.size()]));
                    }
                    int i17 = iVar2.I;
                    boolean z5 = i17 != -1;
                    if (z5) {
                        iVar2.F.e(i17, iVar2.J);
                    }
                    SimpleExoPlayer simpleExoPlayer2 = iVar2.F;
                    simpleExoPlayer2.c0();
                    com.google.android.exoplayer2.c cVar = simpleExoPlayer2.f5586b;
                    cVar.x0();
                    cVar.x0();
                    cVar.p0(Collections.singletonList(aVarD), !z5);
                    cVar.a();
                    iVar2.H = false;
                    iVar2.j(iVar2.f8083y);
                    iVar2.f8057d.c("onVideoLoadStart", null);
                    iVar2.K = true;
                }
                if (iVar2.f8077v == null) {
                    iVar2.f8077v = new PlayerControlView(iVar2.getContext(), null);
                }
                iVar2.f8077v.setPlayer(iVar2.F);
                iVar2.f8077v.e();
                iVar2.f8079w = iVar2.f8077v.findViewById(R.id.exo_play_pause_container);
                iVar2.f8083y.setOnClickListener(new e5.f(iVar2, i10));
                ((ImageButton) iVar2.f8077v.findViewById(R.id.exo_play)).setOnClickListener(new e5.f(iVar2, i11));
                ((ImageButton) iVar2.f8077v.findViewById(R.id.exo_pause)).setOnClickListener(new e5.f(iVar2, 2));
                e5.g gVar2 = new e5.g(iVar2);
                iVar2.f8081x = gVar2;
                iVar2.F.u(gVar2);
                iVar2.m(iVar2.f8076u0);
                boolean z6 = iVar2.f8060e0;
                SimpleExoPlayer simpleExoPlayer3 = iVar2.F;
                if (simpleExoPlayer3 != null) {
                    if (z6) {
                        simpleExoPlayer3.F(1);
                    } else {
                        simpleExoPlayer3.F(0);
                    }
                }
                iVar2.f8060e0 = z6;
                iVar2.o(iVar2.O);
                return;
            case 6:
                o0.h hVar = (o0.h) this.f10798i;
                try {
                    ((o0.h) this.f10797e).get();
                    hVar.j(null);
                    return;
                } catch (Exception e13) {
                    hVar.k(e13);
                    return;
                }
            case 7:
                f3.f fVar = (f3.f) this.f10798i;
                fVar.f8807b.clear();
                s.e eVar2 = fVar.f8808c;
                Iterator it = ((s.d) eVar2.values()).iterator();
                while (it.hasNext()) {
                    ((ListenableFuture) it.next()).cancel(false);
                }
                eVar2.clear();
                fVar.h((o0.h) this.f10797e);
                return;
            case 8:
                try {
                    ((Runnable) this.f10798i).run();
                    synchronized (((f4.l) this.f10797e).f8838e) {
                        ((f4.l) this.f10797e).a();
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    synchronized (((f4.l) this.f10797e).f8838e) {
                        ((f4.l) this.f10797e).a();
                        throw th3;
                    }
                }
            case 9:
                break;
            case 10:
                fj.c cVar2 = (fj.c) this.f10797e;
                Typeface typeface = (Typeface) this.f10798i;
                a1.b bVar2 = (a1.b) cVar2.f9267e;
                if (bVar2 != null) {
                    bVar2.h(typeface);
                    return;
                }
                return;
            case 11:
                ig.i iVar4 = (ig.i) this.f10798i;
                ig.l lVar = iVar4.f11769v;
                Task task = (Task) this.f10797e;
                if (task.k()) {
                    lVar.r();
                    return;
                }
                try {
                    lVar.q(iVar4.f11768i.f(task));
                    return;
                } catch (ig.e e14) {
                    if (e14.getCause() instanceof Exception) {
                        lVar.p((Exception) e14.getCause());
                        return;
                    } else {
                        lVar.p(e14);
                        return;
                    }
                } catch (Exception e15) {
                    lVar.p(e15);
                    return;
                }
            case 12:
                synchronized (((ig.j) this.f10798i).f11772i) {
                    try {
                        OnCompleteListener onCompleteListener = (OnCompleteListener) ((ig.j) this.f10798i).f11773v;
                        if (onCompleteListener != null) {
                            onCompleteListener.onComplete((Task) this.f10797e);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
            case 13:
                a();
                return;
            case 14:
                ig.l lVar2 = (ig.l) this.f10797e;
                try {
                    lVar2.q(((Callable) this.f10798i).call());
                    return;
                } catch (Exception e16) {
                    lVar2.p(e16);
                    return;
                } catch (Throwable th5) {
                    lVar2.p(new RuntimeException(th5));
                    return;
                }
            case 15:
                b();
                return;
            case 16:
                on.e eVar3 = (on.e) this.f10798i;
                int i18 = eVar3.f17474i;
                Promise promise = eVar3.F;
                int i19 = eVar3.f17472d;
                String str = eVar3.E;
                try {
                    View viewFindViewById = i19 == -1 ? eVar3.I.getWindow().getDecorView().findViewById(android.R.id.content) : ((NativeViewHierarchyManager) this.f10797e).resolveView(i19);
                    if (viewFindViewById == null) {
                        byte[] bArr = on.e.K;
                        Log.e("e", "No view found with reactTag: " + i19, new AssertionError());
                        promise.reject("E_UNABLE_TO_SNAPSHOT", "No view found with reactTag: " + i19);
                        return;
                    }
                    on.d dVar = new on.d(on.e.K);
                    dVar.g(Math.min(viewFindViewById.getHeight() * viewFindViewById.getWidth() * 4, 32));
                    on.e.K = dVar.f();
                    if ("tmpfile".equals(str) && -1 == i18) {
                        on.e.c(eVar3, viewFindViewById);
                        return;
                    }
                    if (!"tmpfile".equals(str) || -1 == i18) {
                        if (!"base64".equals(str) && !"zip-base64".equals(str)) {
                            if ("data-uri".equals(str)) {
                                on.e.b(eVar3, viewFindViewById);
                                return;
                            }
                            return;
                        }
                        on.e.a(eVar3, viewFindViewById);
                        return;
                    }
                    File file = eVar3.f17478y;
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        eVar3.e(viewFindViewById, fileOutputStream);
                        fileOutputStream.close();
                        promise.resolve(Uri.fromFile(file).toString());
                        return;
                    } catch (Throwable th6) {
                        fileOutputStream.close();
                        throw th6;
                    }
                } catch (Throwable th7) {
                    byte[] bArr2 = on.e.K;
                    Log.e("e", "Failed to capture view snapshot", th7);
                    promise.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
                    return;
                }
            case 17:
                p pVar = (p) this.f10797e;
                Bundle bundle = (Bundle) this.f10798i;
                v0 v0Var = pVar.f20143g;
                v0Var.getClass();
                if (((Boolean) v0Var.b(new e4.c(i7, v0Var, bundle))).booleanValue()) {
                    pVar.f20144h.a();
                    return;
                }
                return;
            case 18:
                v0 v0Var2 = (v0) this.f10797e;
                int i20 = ((s0) this.f10798i).f20174a;
                v0Var2.getClass();
                v0Var2.b(new a5.b0(i20, i7, v0Var2));
                return;
            case 19:
                d1 d1Var = (d1) this.f10797e;
                c1 c1Var = (c1) this.f10798i;
                d1Var.f20012a.a(c1Var.f19995c, c1Var.f19996d, (String) c1Var.f10850b);
                return;
            case 20:
                g4.j jVar2 = (g4.j) this.f10797e;
                try {
                    jVar2.j(((Worker) this.f10798i).g());
                    return;
                } catch (Throwable th8) {
                    jVar2.k(th8);
                    return;
                }
            case 21:
                if (((w3.r) this.f10798i).M.f9490d instanceof g4.a) {
                    return;
                }
                try {
                    ((ListenableFuture) this.f10797e).get();
                    v3.q.d().a(w3.r.O, "Starting work for " + ((w3.r) this.f10798i).f22058i.f8000c);
                    w3.r rVar = (w3.r) this.f10798i;
                    rVar.M.l(rVar.f22059v.d());
                    return;
                } catch (Throwable th9) {
                    ((w3.r) this.f10798i).M.k(th9);
                    return;
                }
            case 22:
                c();
                return;
            case 23:
                ((x0.d) this.f10797e).f22514d = this.f10798i;
                return;
            case 24:
                Object obj2 = this.f10798i;
                Object obj3 = this.f10797e;
                try {
                    Method method = x0.e.f22523d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        x0.e.f22524e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e17) {
                    if (e17.getClass() == RuntimeException.class && e17.getMessage() != null && e17.getMessage().startsWith("Unable to stop")) {
                        throw e17;
                    }
                    return;
                } catch (Throwable th10) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th10);
                    return;
                }
            case 25:
                ((DataSubscriber) this.f10797e).onProgressUpdate((x8.a) this.f10798i);
                return;
            case 26:
                v vVar = (v) this.f10798i;
                gg.f fVar2 = (gg.f) this.f10797e;
                xe.b bVar3 = fVar2.f10039e;
                if (bVar3.f22910e == 0) {
                    t tVar = fVar2.f10040i;
                    w.g(tVar);
                    xe.b bVar4 = tVar.f482i;
                    if (bVar4.f22910e != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        vVar.f23978m.A(bVar4);
                        vVar.f23977l.disconnect();
                        return;
                    }
                    h4 h4Var = vVar.f23978m;
                    IBinder iBinder = tVar.f481e;
                    if (iBinder == null) {
                        j0Var = null;
                    } else {
                        int i21 = af.a.f388g;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        j0Var = iInterfaceQueryLocalInterface instanceof af.g ? (af.g) iInterfaceQueryLocalInterface : new j0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 5);
                    }
                    Set set = vVar.j;
                    h4Var.getClass();
                    if (j0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        h4Var.A(new xe.b(4, null, null));
                    } else {
                        h4Var.f12713d = j0Var;
                        h4Var.f12714e = set;
                        if (h4Var.f12710a) {
                            ((ye.c) h4Var.f12711b).f(j0Var, set);
                        }
                    }
                } else {
                    vVar.f23978m.A(bVar3);
                }
                vVar.f23977l.disconnect();
                return;
            default:
                ze.k kVar = (ze.k) this.f10797e;
                a1.d dVar2 = (a1.d) this.f10798i;
                if (dVar2.f17e > 0) {
                    Bundle bundle2 = (Bundle) dVar2.f19v;
                    kVar.b(bundle2 != null ? bundle2.getBundle("ConnectionlessLifecycleHelper") : null);
                }
                if (dVar2.f17e >= 2) {
                    kVar.f23938e = true;
                    kVar.d();
                }
                if (dVar2.f17e >= 3) {
                    kVar.d();
                }
                if (dVar2.f17e >= 4) {
                    kVar.c();
                    return;
                }
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f10797e).run();
            } catch (Throwable th11) {
                ar.b0.q(th11, kotlin.coroutines.g.f14681d);
            }
            try {
                Runnable runnableP0 = ((fr.i) this.f10798i).p0();
                if (runnableP0 == null) {
                    return;
                }
                this.f10797e = runnableP0;
                i10++;
                if (i10 >= 16) {
                    fr.i iVar5 = (fr.i) this.f10798i;
                    if (fr.h.h(iVar5.f9377v, iVar5)) {
                        fr.i iVar6 = (fr.i) this.f10798i;
                        fr.h.g(iVar6.f9377v, iVar6, this);
                        return;
                    }
                }
            } catch (Throwable th12) {
                fr.i iVar7 = (fr.i) this.f10798i;
                synchronized (iVar7.f9380y) {
                    fr.i.E.decrementAndGet(iVar7);
                    throw th12;
                }
            }
        }
    }

    public String toString() {
        String str;
        switch (this.f10796d) {
            case 0:
                e4.m mVar = new e4.m(o.class.getSimpleName(), 17);
                AdsModule.AnonymousClass1 anonymousClass1 = (AdsModule.AnonymousClass1) this.f10798i;
                e4.c cVar = new e4.c(6, false);
                ((e4.c) mVar.f7995v).f7967i = cVar;
                mVar.f7995v = cVar;
                cVar.f7966e = anonymousClass1;
                return mVar.toString();
            case 15:
                Runnable runnable = (Runnable) this.f10797e;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i7 = ((ni.h) this.f10798i).f16948i;
                if (i7 == 1) {
                    str = "IDLE";
                } else if (i7 == 2) {
                    str = "QUEUING";
                } else if (i7 != 3) {
                    str = i7 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o(Object obj, Object obj2, int i7, boolean z5) {
        this.f10796d = i7;
        this.f10798i = obj;
        this.f10797e = obj2;
    }

    public o(ni.h hVar) {
        this.f10796d = 15;
        this.f10798i = hVar;
    }
}
