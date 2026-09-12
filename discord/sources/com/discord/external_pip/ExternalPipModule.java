package com.discord.external_pip;

import android.app.Activity;
import android.content.Intent;
import co.s;
import com.discord.external_pip.react_events.OnPipModeChangedEvent;
import com.discord.external_pip.react_events.OnPipModeWillChangeEvent;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.react_activities.ReactActivity;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.r;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = ExternalPipModule.NAME)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\"\u0010\u0012J\u001f\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0007¢\u0006\u0004\b(\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/discord/external_pip/ExternalPipModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "force", "Lkotlin/Function1;", "Lkotlin/Result;", "", "onResult", "enterPipMode", "(ZLkotlin/jvm/functions/Function1;)V", "leavePipMode", "()V", "isInPipMode", "onPipModeChanged", "(Z)V", "onActivityStop", "resumeFabricDispatchIfInPictureInPicture", "onPipModeWillChange", "", "getName", "()Ljava/lang/String;", "", "getConstants", "()Ljava/util/Map;", AppStateModule.APP_STATE_ACTIVE, "Lcom/facebook/react/bridge/Promise;", "onResultPromise", "setActive", "(ZLcom/facebook/react/bridge/Promise;)V", ViewProps.ENABLED, "setEnabled", "", "numerator", "denominator", "setPipAspectRatio", "(II)V", "refreshPipUi", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/discord/external_pip/ExternalPipManager;", "manager", "Lcom/discord/external_pip/ExternalPipManager;", "Lcom/discord/reactevents/ReactEvents;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "Companion", "external_pip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExternalPipModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalPipModule.kt\ncom/discord/external_pip/ExternalPipModule\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n*L\n1#1,169:1\n25#2,8:170\n25#2,8:178\n*S KotlinDebug\n*F\n+ 1 ExternalPipModule.kt\ncom/discord/external_pip/ExternalPipModule\n*L\n40#1:170,8\n72#1:178,8\n*E\n"})
public final class ExternalPipModule extends ReactContextBaseJavaModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NAME = "ExternalPip";

    @NotNull
    private final ExternalPipManager manager;

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final ReactEvents reactEvents;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J!\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\tH\u0002J\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/external_pip/ExternalPipModule$Companion;", "", "<init>", "()V", "NAME", "", "onUserLeaveHint", "", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "onPipModeChanged", "isInPipMode", "", "(Lcom/facebook/react/bridge/ReactContext;Z)Lkotlin/Unit;", "onActivityStop", "getModule", "Lcom/discord/external_pip/ExternalPipModule;", "getUiManager", "Lcom/facebook/react/fabric/FabricUIManager;", "external_pip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ExternalPipModule getModule(ReactContext reactContext) {
            return (ExternalPipModule) reactContext.getNativeModule(ExternalPipModule.class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final FabricUIManager getUiManager(ReactContext reactContext) {
            UIManager uIManager = UIManagerHelper.getUIManager(reactContext, 2);
            if (uIManager instanceof FabricUIManager) {
                return (FabricUIManager) uIManager;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onUserLeaveHint$lambda$0(ReactContext reactContext, Result result) {
            ExternalPipModule module;
            if ((result.f14615d instanceof r) && (module = ExternalPipModule.INSTANCE.getModule(reactContext)) != null) {
                module.onPipModeChanged(false);
            }
            return Unit.f14616a;
        }

        public final void onActivityStop(ReactContext reactContext) {
            ExternalPipModule module;
            if (reactContext == null || (module = getModule(reactContext)) == null) {
                return;
            }
            module.onActivityStop();
        }

        public final Unit onPipModeChanged(ReactContext reactContext, boolean isInPipMode) {
            ExternalPipModule module;
            if (reactContext == null || (module = getModule(reactContext)) == null) {
                return null;
            }
            module.onPipModeChanged(isInPipMode);
            return Unit.f14616a;
        }

        public final void onUserLeaveHint(ReactContext reactContext) {
            ExternalPipModule module;
            ExternalPipModule module2;
            if (reactContext != null && (module2 = getModule(reactContext)) != null) {
                module2.onPipModeWillChange();
            }
            if (reactContext == null || (module = getModule(reactContext)) == null) {
                return;
            }
            module.enterPipMode(false, new s(11, reactContext));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalPipModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.manager = new ExternalPipManager();
        this.reactEvents = new ReactEvents(new Pair("onPipModeChanged", Reflection.getOrCreateKotlinClass(OnPipModeChangedEvent.class)), new Pair("onPipModeWillChange", Reflection.getOrCreateKotlinClass(OnPipModeWillChangeEvent.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enterPipMode(boolean force, Function1<? super Result, Unit> onResult) {
        if (this.manager.getEnabled(force)) {
            ExternalPipTransitionView.INSTANCE.tryShow(this.reactContext.getCurrentActivity());
        }
        this.manager.enterPipMode(getReactApplicationContext().getCurrentActivity(), force, onResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void leavePipMode() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.startActivity(new Intent(this.reactContext.getCurrentActivity(), ReactActivity.INSTANCE.getMainActivity()).addFlags(131072));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityStop() {
        FabricUIManager uiManager;
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null || !currentActivity.isInPictureInPictureMode() || (uiManager = INSTANCE.getUiManager(this.reactContext)) == null) {
            return;
        }
        uiManager.onHostPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPipModeChanged(boolean isInPipMode) {
        ReactEvents reactEvents = this.reactEvents;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        reactEvents.emitModuleEvent(reactApplicationContext, new OnPipModeChangedEvent(isInPipMode));
        ExternalPipTransitionView.INSTANCE.tryHide(this.reactContext.getCurrentActivity(), isInPipMode);
        if (isInPipMode) {
            resumeFabricDispatchIfInPictureInPicture();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPipModeWillChange() {
        if (ExternalPipManager.getEnabled$default(this.manager, false, 1, null)) {
            ReactEvents reactEvents = this.reactEvents;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            reactEvents.emitModuleEvent(reactApplicationContext, new OnPipModeWillChangeEvent());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeFabricDispatchIfInPictureInPicture() {
        FabricUIManager uiManager;
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null || !currentActivity.isInPictureInPictureMode() || (uiManager = INSTANCE.getUiManager(this.reactContext)) == null) {
            return;
        }
        uiManager.onHostResume();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @NotNull
    public Map<String, Boolean> getConstants() {
        return w0.h(new Pair("isSupported", Boolean.valueOf(ExternalPipManager.INSTANCE.isSupported())));
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @ReactMethod
    public final void refreshPipUi() {
        if (!ThreadUtilsKt.isOnMainThread()) {
            ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.external_pip.ExternalPipModule$refreshPipUi$$inlined$postOrRunOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.manager.refreshPipUi(this.this$0.getReactApplicationContext().getCurrentActivity());
                    this.this$0.resumeFabricDispatchIfInPictureInPicture();
                }
            });
        } else {
            this.manager.refreshPipUi(getReactApplicationContext().getCurrentActivity());
            resumeFabricDispatchIfInPictureInPicture();
        }
    }

    @ReactMethod
    public final void setActive(final boolean active, @NotNull final Promise onResultPromise) {
        Intrinsics.checkNotNullParameter(onResultPromise, "onResultPromise");
        if (!ThreadUtilsKt.isOnMainThread()) {
            ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.external_pip.ExternalPipModule$setActive$$inlined$postOrRunOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!active) {
                        this.leavePipMode();
                    } else {
                        ExternalPipModule externalPipModule = this;
                        externalPipModule.enterPipMode(true, new ExternalPipModule$setActive$1$1(externalPipModule, onResultPromise));
                    }
                }
            });
        } else if (active) {
            enterPipMode(true, new ExternalPipModule$setActive$1$1(this, onResultPromise));
        } else {
            leavePipMode();
        }
    }

    @ReactMethod
    public final void setEnabled(boolean enabled) {
        this.manager.setEnabled(enabled);
    }

    @ReactMethod
    public final void setPipAspectRatio(int numerator, int denominator) {
        this.manager.setPipAspectRatio(getReactApplicationContext().getCurrentActivity(), numerator, denominator);
    }
}
