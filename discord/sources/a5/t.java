package a5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.internal.play_billing.u0;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import sh.v0;
import sh.v1;
import sh.x0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f261e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f262i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f263v;

    public /* synthetic */ t() {
        this.f260d = 8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        OverScroller overScroller;
        int i7;
        ig.l lVarF;
        switch (this.f260d) {
            case 0:
                b bVar = (b) this.f261e;
                com.discord.billing.a aVar = (com.discord.billing.a) this.f262i;
                h hVar = (h) this.f263v;
                BillingResult billingResult = h0.f198i;
                bVar.u(24, 4, billingResult);
                aVar.a(billingResult, hVar.f189b);
                return;
            case 1:
                super/*a5.b*/.f((QueryProductDetailsParams) this.f262i, (k) this.f263v);
                return;
            case 2:
                super/*a5.b*/.a((h) this.f263v, (com.discord.billing.a) this.f262i);
                return;
            case 3:
                c5.r rVar = (c5.r) this.f262i;
                c5.n nVar = (c5.n) this.f261e;
                if (nVar.isCanceled()) {
                    nVar.finish("canceled-at-delivery");
                    return;
                }
                c5.t tVar = rVar.f3516c;
                if (tVar == null) {
                    nVar.deliverResponse(rVar.f3514a);
                } else {
                    nVar.deliverError(tVar);
                }
                if (rVar.f3517d) {
                    nVar.addMarker("intermediate-response");
                } else {
                    nVar.finish("done");
                }
                Runnable runnable = (Runnable) this.f263v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                WebView webView = (WebView) this.f261e;
                com.reactnativecommunity.webview.k kVar = ((com.reactnativecommunity.webview.j) this.f263v).f7050w;
                if (kVar == null) {
                    return;
                }
                WritableMap writableMapA = kVar.a(webView, webView.getUrl());
                writableMapA.putString("data", (String) this.f262i);
                com.reactnativecommunity.webview.j.a(webView, new nl.a(writableMapA, com.reactnativecommunity.webview.c.b(webView), 5));
                return;
            case 5:
                f3.e eVar = (f3.e) this.f263v;
                eVar.f8803v.f8808c.remove((String) this.f261e);
                o0.h hVar2 = (o0.h) this.f262i;
                if (hVar2.f17096d instanceof o0.a) {
                    return;
                }
                try {
                    hVar2.get();
                    return;
                } catch (Exception e10) {
                    eVar.f8802i.k(e10);
                    return;
                }
            case 6:
                f3.f fVar = (f3.f) this.f263v;
                Bitmap bitmap = (Bitmap) this.f261e;
                String str = (String) this.f262i;
                fVar.getClass();
                if (bitmap == null) {
                    throw new IllegalArgumentException("bitmap is null");
                }
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("path is empty");
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                    try {
                        if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                            fileOutputStream.close();
                            return;
                        }
                        Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                        throw new RuntimeException("Unable to compress bitmap for saving " + str);
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException e11) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e11);
                    throw new RuntimeException(a3.e.l("Unable to write bitmap to file ", str), e11);
                }
                Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e11);
                throw new RuntimeException(a3.e.l("Unable to write bitmap to file ", str), e11);
            case 7:
                ((w3.e) this.f261e).g((w3.j) this.f262i, (io.sentry.internal.debugmeta.c) this.f263v);
                return;
            case 8:
                try {
                    objCall = ((i1.d) this.f261e).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f263v).post(new u0(11, (z) this.f262i, objCall));
                return;
            case 9:
                ue.i iVar = (ue.i) this.f261e;
                j4.e eVar2 = (j4.e) iVar.f21117d;
                try {
                    ((j4.c) this.f262i).a((j4.e) this.f263v);
                    if (eVar2.g(null)) {
                        return;
                    } else {
                        throw new IllegalStateException("Cannot set the result of a completed task.");
                    }
                } catch (CancellationException unused2) {
                    if (!eVar2.f()) {
                        throw new IllegalStateException("Cannot cancel a completed task.");
                    }
                    return;
                } catch (Exception e12) {
                    iVar.s(e12);
                    return;
                }
            case 10:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f261e;
                AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = (AppBarLayout$BaseBehavior) this.f263v;
                View view = (View) this.f262i;
                if (view == null || (overScroller = appBarLayout$BaseBehavior.f6227d) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    appBarLayout$BaseBehavior.B(coordinatorLayout, view, appBarLayout$BaseBehavior.f6227d.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                mg.f fVar2 = (mg.f) view;
                appBarLayout$BaseBehavior.C(coordinatorLayout, fVar2);
                if (fVar2.H) {
                    fVar2.e(fVar2.f(AppBarLayout$BaseBehavior.w(coordinatorLayout)));
                    return;
                }
                return;
            case 11:
                sh.p pVar = (sh.p) this.f261e;
                Bundle bundle = (Bundle) this.f262i;
                sh.w wVar = (sh.w) this.f263v;
                v0 v0Var = pVar.f20143g;
                v0Var.getClass();
                if (((Boolean) v0Var.b(new e4.e(21, v0Var, bundle))).booleanValue()) {
                    pVar.f20146l.post(new u0(17, pVar, wVar));
                    ((v1) pVar.f20147m.a()).f();
                    return;
                }
                return;
            case 12:
                sh.i0 i0Var = (sh.i0) this.f261e;
                Bundle bundle2 = (Bundle) this.f262i;
                sh.w wVar2 = (sh.w) this.f263v;
                v0 v0Var2 = i0Var.f20058a;
                v0Var2.getClass();
                if (((Boolean) v0Var2.b(new e4.e(21, v0Var2, bundle2))).booleanValue()) {
                    sh.r rVar2 = i0Var.f20062e;
                    rVar2.getClass();
                    rVar2.f20160b.post(new u0(18, rVar2, wVar2));
                    ((v1) i0Var.f20064g.a()).f();
                    return;
                }
                return;
            case 13:
                x0 x0Var = (x0) this.f261e;
                ArrayList<String> arrayList = (ArrayList) this.f262i;
                ig.g gVar = (ig.g) this.f263v;
                HashMap map = new HashMap();
                long j = 0;
                for (String str2 : arrayList) {
                    try {
                        long length = 0;
                        for (File file : x0Var.j(str2)) {
                            length = file.length() + length;
                        }
                        sh.w wVarA = AssetPackState.a(str2, 1, 0, 0L, length, x0Var.f20233c.a(str2), 1, String.valueOf(x0Var.f20234d.a()), x0Var.f20235e.a(str2));
                        j += wVarA.f20218e;
                        map.put(str2, wVarA);
                    } catch (vh.a e13) {
                        gVar.a(e13);
                        return;
                    }
                }
                for (String str3 : arrayList) {
                    try {
                        int andIncrement = x0.f20230i.getAndIncrement();
                        x0Var.i(andIncrement, 1, str3);
                        x0Var.i(andIncrement, 2, str3);
                        x0Var.i(andIncrement, 3, str3);
                    } catch (vh.a e14) {
                        gVar.a(e14);
                        return;
                    }
                }
                gVar.b(new sh.x(j, map));
                return;
            case 14:
                we.a aVar2 = (we.a) this.f262i;
                Intent intent = aVar2.f22193d;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    lVarF = l0.v(null);
                } else {
                    Bundle bundle3 = new Bundle();
                    Intent intent2 = aVar2.f22193d;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle3.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar2.f22193d;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle3.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.f261e;
                    bundle3.putBoolean("supports_message_handled", true);
                    we.k kVarE = we.k.e(context);
                    synchronized (kVarE) {
                        i7 = kVarE.f22219b;
                        kVarE.f22219b = i7 + 1;
                    }
                    lVarF = kVarE.f(new we.j(i7, 2, bundle3, 0));
                }
                lVarF.b(we.g.f22201e, new ph.c((CountDownLatch) this.f263v));
                return;
            default:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f263v;
                Context context2 = (Context) this.f262i;
                Intent intent4 = (Intent) this.f261e;
                try {
                    boolean booleanExtra = intent4.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent4.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent4.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent4.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    v3.q.d().a(ConstraintProxyUpdateReceiver.f2833a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    f4.j.a(context2, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    f4.j.a(context2, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    f4.j.a(context2, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    f4.j.a(context2, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
        }
    }

    public /* synthetic */ t(e0 e0Var, h hVar, com.discord.billing.a aVar) {
        this.f260d = 2;
        this.f261e = e0Var;
        this.f263v = hVar;
        this.f262i = aVar;
    }

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i7) {
        this.f260d = i7;
        this.f261e = obj;
        this.f262i = obj2;
        this.f263v = obj3;
    }

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i7, boolean z5) {
        this.f260d = i7;
        this.f263v = obj;
        this.f261e = obj2;
        this.f262i = obj3;
    }

    public t(w3.e processor, w3.j startStopToken, io.sentry.internal.debugmeta.c cVar) {
        this.f260d = 7;
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(startStopToken, "startStopToken");
        this.f261e = processor;
        this.f262i = startStopToken;
        this.f263v = cVar;
    }
}
