package a1;

import android.app.Activity;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.view.TextureView;
import app.rive.RiveKt$Rive$8$1$1$1;
import app.rive.runtime.kotlin.renderers.RenderContextEvent;
import app.rive.runtime.kotlin.renderers.Renderer;
import com.discord.ads.AdsModule;
import com.discord.analytics.touch.TouchEventDetails;
import com.discord.analytics.touch.TouchLogger;
import com.discord.browser_manager.BrowserManagerModule;
import com.discord.bundle_updater.BundleUpdaterManager;
import com.discord.chat.presentation.list.ChatListFrameLayout;
import com.discord.chat.presentation.list.delegate.PortalViewDelegate;
import com.discord.chat.presentation.list.item.PortalViewChatListItem;
import com.discord.chat.presentation.message.view.VoiceChannelListInviteView;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$configureGestures$onTouchListener$1;
import com.discord.crash_reporting.TelemetryRing;
import com.discord.crash_reporting.TelemetryRingTypes;
import com.discord.foreground_service.ForegroundService;
import com.discord.media.engine.video.egl_renderer.EglRenderer;
import com.discord.tti_manager.TTIModule;
import com.facebook.react.animated.NativeAnimatedNodesManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.devsupport.inspector.TracingState;
import com.facebook.react.devsupport.perfmonitor.PerfMonitorOverlayManager;
import com.facebook.react.internal.ChoreographerProvider;
import com.facebook.react.modules.blob.BlobProvider;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.internal.bolts.Task;
import com.facebook.react.runtime.internal.bolts.TaskCompletionSource;
import com.facebook.react.uimanager.UIManagerConstantsCache;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.text.ReactTextView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f36d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f37e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f38i;

    public /* synthetic */ k(int i7, Object obj, Object obj2) {
        this.f36d = i7;
        this.f37e = obj;
        this.f38i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f36d;
        Object obj = this.f38i;
        Object obj2 = this.f37e;
        switch (i7) {
            case 0:
                ((b) obj2).h((Typeface) obj);
                break;
            case 1:
                RiveKt$Rive$8$1$1$1.onSurfaceTextureUpdated$lambda$0((x) obj2, (TextureView) obj);
                break;
            case 2:
                Renderer.onNativeRenderContextEvent$lambda$0((Function1) obj2, (RenderContextEvent) obj);
                break;
            case 3:
                int i10 = JobInfoSchedulerService.f5497d;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                break;
            case 4:
                ((ar.k) obj2).C((br.d) obj, Unit.f14616a);
                break;
            case 5:
                List<b4.c> listenersList = (List) obj2;
                c4.f this$0 = (c4.f) obj;
                Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (b4.c cVar : listenersList) {
                    Object obj3 = this$0.f3457e;
                    b4.e eVar = cVar.f3061a;
                    cVar.f3062b.d().o(eVar.c(obj3) ? new a4.b(eVar.a()) : a4.a.f120a);
                }
                break;
            case 6:
                AdsModule.getAdvertisingIdInfoAsync$lambda$1$lambda$0((SettableFuture) obj2, (AdsModule) obj);
                break;
            case 7:
                TouchLogger.notifyListeners$lambda$7((List) obj2, (TouchEventDetails) obj);
                break;
            case 8:
                BrowserManagerModule.resumeTrackedCustomTab$lambda$6((Promise) obj2, (BrowserManagerModule) obj);
                break;
            case 9:
                BundleUpdaterManager.runOnActivity$lambda$9$lambda$8((Activity) obj2, (Function1) obj);
                break;
            case 10:
                PortalViewDelegate.bindView$lambda$2((PortalViewChatListItem) obj2, (ChatListFrameLayout) obj);
                break;
            case 11:
                VoiceChannelListInviteView.configure$lambda$11$lambda$10((VoiceChannelListInviteView) obj2, (Function0) obj);
                break;
            case 12:
                AudioPlayerView$configureGestures$onTouchListener$1.longPressRunnable$lambda$0((AudioPlayerView$configureGestures$onTouchListener$1) obj2, (AudioPlayerView) obj);
                break;
            case 13:
                TelemetryRing.init$lambda$4((Context) obj2, (TelemetryRingTypes.Budget) obj);
                break;
            case 14:
                ForegroundService.Companion.stop$lambda$0((Context) obj2, (Service) obj);
                break;
            case 15:
                EglRenderer.releaseEglSurface$lambda$31$lambda$30$lambda$29((EglRenderer) obj2, (Function0) obj);
                break;
            case 16:
                EglRenderer.release$lambda$15$lambda$13((EglRenderer) obj2, (CountDownLatch) obj);
                break;
            case 17:
                EglRenderer.release$lambda$15$lambda$14((EglRenderer) obj2, (Looper) obj);
                break;
            case 18:
                TTIModule.getAndroidArtProfileTelemetry$lambda$2((TTIModule) obj2, (Promise) obj);
                break;
            case 19:
                TTIModule.getJavaBaselineProfileCompilationStatus$lambda$1((ListenableFuture) obj2, (Promise) obj);
                break;
            case 20:
                ((NativeAnimatedNodesManager) obj2).handleEvent((Event) obj);
                break;
            case 21:
                PerfMonitorOverlayManager.onRecordingStateChanged$lambda$4((PerfMonitorOverlayManager) obj2, (TracingState) obj);
                break;
            case 22:
                BlobProvider.openFile$lambda$2((ParcelFileDescriptor) obj2, (byte[]) obj);
                break;
            case 23:
                ReactChoreographer._init_$lambda$2((ReactChoreographer) obj2, (ChoreographerProvider) obj);
                break;
            case 24:
                ReactHostImpl.getOrCreateReactInstanceTask$lambda$45$lambda$43$lambda$42((ReactHostImpl) obj2, (Task) obj);
                break;
            case 25:
                Task.Companion.call$lambda$2((Callable) obj2, (TaskCompletionSource) obj);
                break;
            case 26:
                ((UIManagerConstantsCache) obj2).lambda$init$0((String) obj);
                break;
            case 27:
                ((ReactTextView) obj2).lambda$onDraw$0((Canvas) obj);
                break;
            case 28:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                ig.g gVar = (ig.g) obj;
                ue.i iVar = FirebaseMessaging.k;
                try {
                    gVar.b(firebaseMessaging.a());
                } catch (Exception e10) {
                    gVar.a(e10);
                    return;
                }
                break;
            default:
                ig.g gVar2 = (ig.g) obj;
                try {
                    gVar2.b(((com.google.firebase.messaging.o) obj2).c());
                } catch (Exception e11) {
                    gVar2.a(e11);
                }
                break;
        }
    }
}
