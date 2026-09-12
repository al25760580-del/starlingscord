package ac;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f;
import androidx.fragment.app.m1;
import androidx.fragment.app.p;
import androidx.fragment.app.t1;
import androidx.fragment.app.x1;
import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFi1bSDK;
import com.appsflyer.internal.AFj1rSDK;
import com.discord.chat.presentation.root.ChatView;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.PausedInDebuggerOverlayDialogManager;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.views.text.PreparedLayoutTextView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.firebase.messaging.EnhancedIntentService;
import com.reactnativecommunity.webview.RNCWebViewModule;
import e4.m;
import e4.r;
import ei.b0;
import ei.e0;
import ei.r0;
import ga.l;
import gc.g1;
import gc.u1;
import gc.w;
import gc.x0;
import hc.u;
import ig.g;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.screenshot.PixelCopyStrategy;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.PersistableLinkedList;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import io.sentry.j6;
import io.sentry.l3;
import io.sentry.l6;
import io.sentry.p3;
import io.sentry.protocol.v;
import io.sentry.react.RNSentryModuleImpl;
import io.sentry.w5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import je.j;
import k2.k;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mc.n;
import mc.q;
import md.s;
import vb.h;
import vb.i;
import wb.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f302e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f303i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f304v;

    public /* synthetic */ a(c cVar, i iVar, q qVar, h hVar) {
        this.f301d = 0;
        this.f302e = cVar;
        this.f303i = iVar;
        this.f304v = hVar;
    }

    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, mc.o] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, md.w] */
    @Override // java.lang.Runnable
    public final void run() {
        final int i7 = 0;
        final int i10 = 1;
        switch (this.f301d) {
            case 0:
                c cVar = (c) this.f302e;
                i iVar = (i) this.f303i;
                String str = iVar.f21529a;
                h hVar = (h) this.f304v;
                cVar.getClass();
                Logger logger = c.f309f;
                try {
                    e eVarA = cVar.f312c.a(str);
                    if (eVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((cc.h) cVar.f314e).n(new b(cVar, iVar, ((tb.b) eVarA).a(hVar), i7));
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    return;
                }
            case 1:
                ViewGroup container = (ViewGroup) this.f302e;
                View view = (View) this.f303i;
                f this$0 = (f) this.f304v;
                Intrinsics.checkNotNullParameter(container, "$container");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                container.endViewTransition(view);
                this$0.f2133c.f2178a.c(this$0);
                return;
            case 2:
                x1 x1Var = (x1) this.f302e;
                x1 x1Var2 = (x1) this.f303i;
                p this$1 = (p) this.f304v;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                m1.a(x1Var.f2274c, x1Var2.f2274c, this$1.f2224o, this$1.f2223n);
                return;
            case 3:
                t1 impl = (t1) this.f302e;
                View view2 = (View) this.f303i;
                Rect lastInEpicenterRect = (Rect) this.f304v;
                Intrinsics.checkNotNullParameter(impl, "$impl");
                Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                t1.j(view2, lastInEpicenterRect);
                return;
            case 4:
                ((AFa1uSDK) this.f302e).e_((Context) this.f303i, (Intent) this.f304v);
                return;
            case 5:
                AFd1ySDK.getMediationNetwork((AFd1ySDK) this.f302e, (Throwable) this.f303i, (String) this.f304v);
                return;
            case 6:
                ((AFj1rSDK) this.f302e).getMediationNetwork((AFi1bSDK) this.f303i, (Runnable) this.f304v);
                return;
            case 7:
                ChatView.attachPortalViewToChatList$lambda$5$lambda$4((View) this.f302e, (ChatView) this.f303i, (Pair) this.f304v);
                return;
            case 8:
                HeadlessJsTaskService.invokeStartTask$lambda$0((HeadlessJsTaskContext) this.f302e, (HeadlessJsTaskConfig) this.f303i, (HeadlessJsTaskService) this.f304v);
                return;
            case 9:
                ((ReactInstanceManager) this.f302e).lambda$setupReactContext$3((ReactInstanceEventListener[]) this.f303i, (ReactApplicationContext) this.f304v);
                return;
            case 10:
                ReactPackageTurboModuleManagerDelegate.initialize$lambda$0((ReactPackageTurboModuleManagerDelegate) this.f302e, (ReactApplicationContext) this.f303i, (List) this.f304v);
                return;
            case 11:
                PausedInDebuggerOverlayDialogManager.showPausedInDebuggerOverlay$lambda$3((PausedInDebuggerOverlayDialogManager) this.f302e, (String) this.f303i, (DevSupportManager.PausedInDebuggerOverlayCommandListener) this.f304v);
                return;
            case 12:
                PreparedLayoutTextView.onDraw$lambda$1((Layout) this.f302e, (Canvas) this.f303i, (PreparedLayoutTextView) this.f304v);
                return;
            case 13:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.f302e;
                Intent intent = (Intent) this.f303i;
                g gVar = (g) this.f304v;
                int i11 = EnhancedIntentService.f6528d;
                enhancedIntentService.getClass();
                try {
                    enhancedIntentService.handleIntent(intent);
                    return;
                } finally {
                    gVar.b(null);
                }
            case 14:
                RNCWebViewModule.lambda$injectJavaScriptWithWebViewKey$1((String) this.f302e, (String) this.f303i, (Promise) this.f304v);
                return;
            case 15:
                ga.b this$2 = (ga.b) this.f302e;
                CacheKey key = (CacheKey) this.f303i;
                EncodedImage encodedImage = (EncodedImage) this.f304v;
                l lVar = this$2.f9530g;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullParameter(key, "$key");
                try {
                    this$2.e(key, encodedImage);
                    Intrinsics.checkNotNull(encodedImage);
                    lVar.s(key, encodedImage);
                    EncodedImage.closeSafely(encodedImage);
                    return;
                } catch (Throwable th2) {
                    try {
                        Intrinsics.checkNotNullParameter(th2, "th");
                        throw th2;
                    } catch (Throwable th3) {
                        Intrinsics.checkNotNull(encodedImage);
                        lVar.s(key, encodedImage);
                        EncodedImage.closeSafely(encodedImage);
                        throw th3;
                    }
                }
            case 16:
                x0 x0Var = (x0) this.f302e;
                b0 b0Var = (b0) this.f303i;
                s sVar = (s) this.f304v;
                hc.a aVar = x0Var.f9939c;
                r0 r0VarF = b0Var.f();
                u uVar = (u) aVar;
                af.c cVar2 = uVar.f10474v;
                Player player = uVar.f10477y;
                player.getClass();
                cVar2.getClass();
                cVar2.f394e = e0.k(r0VarF);
                if (!r0VarF.isEmpty()) {
                    cVar2.f397w = (s) r0VarF.get(0);
                    sVar.getClass();
                    cVar2.f398x = sVar;
                }
                if (((s) cVar2.f396v) == null) {
                    cVar2.f396v = af.c.x(player, (e0) cVar2.f394e, (s) cVar2.f397w, (u1) cVar2.f393d);
                }
                cVar2.P(player.J());
                return;
            case 17:
                e4.c cVar3 = (e4.c) this.f302e;
                android.util.Pair pair = (android.util.Pair) this.f303i;
                ((u) ((hc.a) ((g1) cVar3.f7967i).f9667i)).p(((Integer) pair.first).intValue(), (s) pair.second, (Exception) this.f304v);
                return;
            case 18:
                e4.l lVar2 = (e4.l) this.f302e;
                final Format format = (Format) this.f303i;
                final DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) this.f304v;
                w wVar = (w) lVar2.f7990i;
                int i12 = je.e0.f13788a;
                u uVar2 = (u) wVar.f9916d.f5659q;
                final AnalyticsListener$EventTime analyticsListener$EventTimeH = uVar2.h();
                uVar2.i(analyticsListener$EventTimeH, 1009, new j() { // from class: hc.e
                    @Override // je.j
                    public final void invoke(Object obj) {
                        b bVar = (b) obj;
                        switch (i7) {
                            case 0:
                                AnalyticsListener$EventTime analyticsListener$EventTime = analyticsListener$EventTimeH;
                                Format format2 = format;
                                bVar.onAudioInputFormatChanged(analyticsListener$EventTime, format2);
                                bVar.onAudioInputFormatChanged(analyticsListener$EventTime, format2, decoderReuseEvaluation);
                                break;
                            default:
                                AnalyticsListener$EventTime analyticsListener$EventTime2 = analyticsListener$EventTimeH;
                                Format format3 = format;
                                bVar.onVideoInputFormatChanged(analyticsListener$EventTime2, format3);
                                bVar.onVideoInputFormatChanged(analyticsListener$EventTime2, format3, decoderReuseEvaluation);
                                break;
                        }
                    }
                });
                return;
            case 19:
                il.e eVar = (il.e) this.f302e;
                String str3 = (String) this.f303i;
                String str4 = (String) this.f304v;
                q8.c cVar4 = eVar.f11851d0;
                PromiseImpl promiseImpl = new PromiseImpl(new com.discord.permissions.b(i10, eVar, str4), new com.discord.permissions.c(i10, eVar));
                synchronized (cVar4) {
                    promiseImpl.resolve(str3);
                }
                return;
            case 20:
                PixelCopyStrategy.capture$lambda$2$lambda$1((PixelCopyStrategy) this.f302e, (ViewHierarchyNode) this.f303i, (View) this.f304v);
                return;
            case 21:
                PixelCopyStrategy.capture$lambda$2$lambda$1$lambda$0((PixelCopyStrategy) this.f302e, (View) this.f303i, (ArrayList) this.f304v);
                return;
            case 22:
                ExecutorsKt.submitSafely$lambda$0((Runnable) this.f302e, (w5) this.f303i, (String) this.f304v);
                return;
            case 23:
                PersistableLinkedList.persistRecording$lambda$1((PersistableLinkedList) this.f302e, (l3) this.f303i, (ReplayCache) this.f304v);
                return;
            case 24:
                io.sentry.cache.g gVar2 = (io.sentry.cache.g) this.f302e;
                j6 j6Var = (j6) this.f303i;
                p3 p3Var = (p3) this.f304v;
                if (j6Var != null) {
                    gVar2.r(j6Var, "trace.json");
                    return;
                }
                m mVar = p3Var.f12881r;
                j6 j6Var2 = new j6((v) mVar.f7993e, (l6) mVar.f7994i, "default", null);
                j6Var2.F = "auto";
                gVar2.r(j6Var2, "trace.json");
                return;
            case 25:
                RNSentryModuleImpl.lambda$takeScreenshotOnUiThread$4((byte[][]) this.f302e, (Activity) this.f303i, (CountDownLatch) this.f304v);
                return;
            case 26:
                u4.b bVar = (u4.b) this.f302e;
                a.a aVar2 = (a.a) this.f303i;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f304v;
                try {
                    k2.q qVarP = zs.a.p((Context) bVar.f20945e);
                    if (qVarP == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    k2.p pVar = (k2.p) ((k2.h) qVarP.f14231b);
                    synchronized (pVar.f14254v) {
                        pVar.f14256x = threadPoolExecutor;
                        break;
                    }
                    ((k2.h) qVarP.f14231b).O(new k(aVar2, threadPoolExecutor));
                    return;
                } catch (Throwable th4) {
                    aVar2.s(th4);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 27:
                r rVar = (r) this.f302e;
                final Format format2 = (Format) this.f303i;
                final DecoderReuseEvaluation decoderReuseEvaluation2 = (DecoderReuseEvaluation) this.f304v;
                w wVar2 = (w) rVar.f8035i;
                int i13 = je.e0.f13788a;
                com.google.android.exoplayer2.c cVar5 = wVar2.f9916d;
                cVar5.N = format2;
                u uVar3 = (u) cVar5.f5659q;
                final AnalyticsListener$EventTime analyticsListener$EventTimeH2 = uVar3.h();
                uVar3.i(analyticsListener$EventTimeH2, 1017, new j() { // from class: hc.e
                    @Override // je.j
                    public final void invoke(Object obj) {
                        b bVar2 = (b) obj;
                        switch (i10) {
                            case 0:
                                AnalyticsListener$EventTime analyticsListener$EventTime = analyticsListener$EventTimeH2;
                                Format format3 = format2;
                                bVar2.onAudioInputFormatChanged(analyticsListener$EventTime, format3);
                                bVar2.onAudioInputFormatChanged(analyticsListener$EventTime, format3, decoderReuseEvaluation2);
                                break;
                            default:
                                AnalyticsListener$EventTime analyticsListener$EventTime2 = analyticsListener$EventTimeH2;
                                Format format4 = format2;
                                bVar2.onVideoInputFormatChanged(analyticsListener$EventTime2, format4);
                                bVar2.onVideoInputFormatChanged(analyticsListener$EventTime2, format4, decoderReuseEvaluation2);
                                break;
                        }
                    }
                });
                return;
            case 28:
                n nVar = (n) this.f302e;
                this.f303i.p(nVar.f15568a, nVar.f15569b, (Exception) this.f304v);
                return;
            default:
                a1.d dVar = (a1.d) this.f302e;
                this.f303i.j(dVar.f17e, (s) dVar.f18i, (MediaLoadData) this.f304v);
                return;
        }
    }

    public /* synthetic */ a(il.e eVar, Activity activity, String str, String str2, String str3) {
        this.f301d = 19;
        this.f302e = eVar;
        this.f303i = str;
        this.f304v = str3;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i7) {
        this.f301d = i7;
        this.f302e = obj;
        this.f303i = obj2;
        this.f304v = obj3;
    }
}
