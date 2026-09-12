package com.discord.age_assurance;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.discord.browser_manager.BrowserManager;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.presentation.message.MessageViewReplyPreview;
import com.discord.chat.presentation.message.view.MediaView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.discord.chat.reactevents.ChatViewEventHandler;
import com.discord.crash_reporting.CrashPersistence;
import com.discord.crash_reporting.CrashReportingModule;
import com.discord.crash_reporting.system_logs.SystemLogReport;
import com.discord.fastest_list.android.FastestListView;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.MediaSource;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.mobile_voice_overlay.views.OverlayTrashWrap;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.reactevents.ReactEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import com.google.android.play.agesignals.AgeSignalsAccessResult;
import com.google.android.play.agesignals.AgeSignalsManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3932e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3933i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3934v;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i7) {
        this.f3931d = i7;
        this.f3932e = obj;
        this.f3933i = obj2;
        this.f3934v = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3931d) {
            case 0:
                return PlayAgeSignalsModule.getAgeSignals$lambda$0((PlayAgeSignalsModule) this.f3932e, (AgeSignalsManager) this.f3933i, (Promise) this.f3934v, (AgeSignalsAccessResult) obj);
            case 1:
                return BrowserManager.tryOpenUrlWithCustomTabs$lambda$0((Context) this.f3932e, (String) this.f3933i, (Function1) this.f3934v, (Exception) obj);
            case 2:
                return MessageViewReplyPreview.configureReply$lambda$9((StructurableText) this.f3932e, (MessageViewReplyPreview) this.f3933i, (Message) this.f3934v, ((Integer) obj).intValue());
            case 3:
                return MediaView.registerForPortal$lambda$25((MediaView) this.f3932e, (MediaPlayer) this.f3933i, (MediaSource) this.f3934v, (View) obj);
            case 4:
                return SpoilerView.onObscureToggleVisibilityClick$lambda$3((SpoilerView) this.f3932e, (View) this.f3933i, (Function1) this.f3934v, ((Boolean) obj).booleanValue());
            case 5:
                return ChatViewEventHandler.emitReactEvent$lambda$0((ReactEvents) this.f3932e, (Context) this.f3933i, (Function0) this.f3934v, (ReactEvent) obj);
            case 6:
                return CrashReportingModule.getLastCrashReport$lambda$2((CrashReportingModule) this.f3932e, (CrashPersistence.LastCrashInfo) this.f3933i, (Callback) this.f3934v, (SystemLogReport.NativeCrashDiagnostics) obj);
            case 7:
                return FastestListView.onScrollListener$lambda$3((FastestListView) this.f3932e, (Function2) this.f3933i, (Function2) this.f3934v, ((Boolean) obj).booleanValue());
            case 8:
                return MobileVoiceOverlay.voiceBubbleProvider$lambda$9$lambda$6$lambda$5((OverlayVoiceBubble) this.f3932e, (MotionEvent) this.f3933i, (MobileVoiceOverlay) this.f3934v, (OverlayTrashWrap) obj);
            case 9:
                return NativePermissionManagerModule.AnonymousClass1.reject$lambda$10((String) this.f3932e, (String) this.f3933i, (WritableMap) this.f3934v, (Promise) obj);
            case 10:
                return NativePermissionManagerModule.AnonymousClass1.reject$lambda$5((String) this.f3932e, (String) this.f3933i, (Throwable) this.f3934v, (Promise) obj);
            case 11:
                return NativePermissionManagerModule.AnonymousClass1.reject$lambda$9((String) this.f3932e, (Throwable) this.f3933i, (WritableMap) this.f3934v, (Promise) obj);
            default:
                return ReactHostImpl.callFunctionOnModule$lambda$22((String) this.f3932e, (String) this.f3933i, (NativeArray) this.f3934v, (ReactInstance) obj);
        }
    }
}
