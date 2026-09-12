package am;

import android.content.Intent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.n;
import app.rive.core.CommandQueue;
import com.discord.chat.input.views.DCDChatInput;
import com.discord.chat.presentation.list.ChannelChatListAdapter;
import com.discord.chat.presentation.list.ChatListChildView;
import com.discord.crash_reporting.TelemetryRing;
import com.discord.crash_reporting.TelemetryRingSqliteStore;
import com.discord.deep_link.DeepLinks;
import com.discord.jank_stats.JankSessionRecorder;
import com.discord.tti_measurement_view.TTIMeasurementView;
import com.discord.zoom_layout.ZoomLayoutFixed;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactDelegate;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.runtime.ReactSurfaceImpl;
import com.facebook.react.views.scroll.MaintainVisibleScrollPositionHelper;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.firebase.messaging.r;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f642e;

    public /* synthetic */ c(int i7, Object obj) {
        this.f641d = i7;
        this.f642e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f641d) {
            case 0:
                ReactViewGroup reactViewGroup = (ReactViewGroup) this.f642e;
                if (reactViewGroup == null) {
                    return;
                }
                ViewParent parent = reactViewGroup.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup == null) {
                    return;
                }
                viewGroup.removeView(reactViewGroup);
                return;
            case 1:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.f642e;
                LifecycleRegistry lifecycleRegistry = processLifecycleOwner.f2323x;
                if (processLifecycleOwner.f2319e == 0) {
                    processLifecycleOwner.f2320i = true;
                    lifecycleRegistry.f(n.ON_PAUSE);
                }
                if (processLifecycleOwner.f2318d == 0 && processLifecycleOwner.f2320i) {
                    lifecycleRegistry.f(n.ON_STOP);
                    processLifecycleOwner.f2321v = true;
                    return;
                }
                return;
            case 2:
                CommandQueue.dispose$lambda$1((CommandQueue) this.f642e);
                return;
            case 3:
                r rVar = (r) this.f642e;
                ((cc.h) ((dc.c) rVar.f6613v)).n(new app.rive.runtime.kotlin.core.a(4, rVar));
                return;
            case 4:
                bd.g gVar = (bd.g) this.f642e;
                synchronized (gVar.f3152a) {
                    try {
                        if (gVar.f3161l) {
                            return;
                        }
                        long j = gVar.k - 1;
                        gVar.k = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            gVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (gVar.f3152a) {
                            gVar.f3162m = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 5:
                ((DCDChatInput) this.f642e).measureAndLayoutToContentHeight();
                return;
            case 6:
                ChannelChatListAdapter.onBindViewHolder$lambda$11((ChannelChatListAdapter) this.f642e);
                return;
            case 7:
                ChatListChildView.DefaultImpls.onMeasureConsiderFrozen$lambda$0((ChatListChildView) this.f642e);
                return;
            case 8:
                TelemetryRing.append$lambda$5((TelemetryRingSqliteStore.EntryPayload) this.f642e);
                return;
            case 9:
                DeepLinks.init$lambda$1((ScheduledExecutorService) this.f642e);
                return;
            case 10:
                JankSessionRecorder.flushExecutor_delegate$lambda$2$lambda$1$lambda$0((Runnable) this.f642e);
                return;
            case 11:
                JankSessionRecorder.acknowledge$lambda$9((Set) this.f642e);
                return;
            case 12:
                TTIMeasurementView.registerDrawListener$lambda$0((TTIMeasurementView) this.f642e);
                return;
            case 13:
                ZoomLayoutFixed.onMeasure$lambda$1((ZoomLayoutFixed) this.f642e);
                return;
            case 14:
                ((ReactActivityDelegate) this.f642e).lambda$onCreate$0();
                return;
            case 15:
                ReactDelegate.reload$lambda$0((ReactDelegate) this.f642e);
                return;
            case 16:
                ((ReactInstanceManager) this.f642e).lambda$runCreateReactContextOnNewThread$0();
                return;
            case 17:
                SurfaceMountingManager.stopSurface$lambda$5((SurfaceMountingManager) this.f642e);
                return;
            case 18:
                DeviceEventManagerModule.invokeDefaultBackPressRunnable$lambda$0((DefaultHardwareBackBtnHandler) this.f642e);
                return;
            case 19:
                ReactChoreographer.postFrameCallbackOnChoreographer$lambda$6((ReactChoreographer) this.f642e);
                return;
            case 20:
                DevMenuModule.reload$lambda$0((DevMenuModule) this.f642e);
                return;
            case 21:
                DevSettingsModule.reload$lambda$0((DevSettingsModule) this.f642e);
                return;
            case 22:
                ((ReconnectingWebSocket) this.f642e).delayedReconnect();
                return;
            case 23:
                ReactInstance.initializeEagerTurboModules$lambda$4((ReactInstance) this.f642e);
                return;
            case 24:
                ReactSurfaceImpl.clear$lambda$4((ReactSurfaceImpl) this.f642e);
                return;
            case 25:
                ((com.facebook.react.uimanager.a) this.f642e).invoke();
                return;
            case 26:
                ((com.facebook.react.uimanager.a) this.f642e).invoke();
                return;
            case 27:
                ((com.facebook.react.uimanager.b) this.f642e).invoke();
                return;
            case 28:
                ((MaintainVisibleScrollPositionHelper) this.f642e).computeTargetView();
                return;
            default:
                com.google.firebase.messaging.i.a((Intent) this.f642e);
                return;
        }
    }

    public /* synthetic */ c(com.google.firebase.messaging.i iVar, Intent intent) {
        this.f641d = 29;
        this.f642e = intent;
    }
}
