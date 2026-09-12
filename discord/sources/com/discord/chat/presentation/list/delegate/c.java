package com.discord.chat.presentation.list.delegate;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import co.s;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.foreground_service.ForegroundServiceManager;
import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.lifecycle.ForegroundServiceStartGuard;
import com.discord.react_gesture_handler.passthrough_touch.PassthroughTouchViewGroup;
import com.discord.react_gesture_handler.passthrough_touch.PassthroughTouchViewManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.mounting.MountItemDispatcher;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import n1.f;
import n1.h;
import n1.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4094e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4095i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4096v;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i7) {
        this.f4093d = i7;
        this.f4094e = obj;
        this.f4095i = obj2;
        this.f4096v = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4093d) {
            case 0:
                return ((RegularMessageDelegate) this.f4094e).getChainPart((MessageItem) this.f4095i, (BaseChatListItemDelegate.Metadata) this.f4096v);
            case 1:
                return ForegroundServiceManager.handleCreateOrUpdateService$lambda$6((ServiceNotificationConfiguration.Type) this.f4094e, (ForegroundServiceStartGuard.Result) this.f4095i, (ReactApplicationContext) this.f4096v);
            case 2:
                return MountItemDispatcher.dispatchMountItems$lambda$7$lambda$6((List) this.f4094e, (s) this.f4095i, (MountItemDispatcher) this.f4096v);
            case 3:
                return PassthroughTouchViewManager.createViewInstance$lambda$1$lambda$0((PassthroughTouchViewManager) this.f4094e, (ThemedReactContext) this.f4095i, (PassthroughTouchViewGroup) this.f4096v);
            case 4:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0((Executor) this.f4094e, (h) this.f4095i, (Ref.ObjectRef) this.f4096v);
            case 5:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0((Exception) this.f4094e, (Executor) this.f4095i, (h) this.f4096v);
            case 6:
                ((Executor) this.f4094e).execute(new io.sentry.react.d(18, (h) this.f4095i, this.f4096v));
                return Unit.f14616a;
            case 7:
                ((Executor) this.f4094e).execute(new io.sentry.react.d(19, (h) this.f4095i, (p) this.f4096v));
                return Unit.f14616a;
            default:
                ((Executor) this.f4094e).execute(new io.sentry.react.d(26, (h) this.f4095i, (f) this.f4096v));
                return Unit.f14616a;
        }
    }
}
