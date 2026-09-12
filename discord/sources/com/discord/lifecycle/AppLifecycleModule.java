package com.discord.lifecycle;

import com.discord.codegen.NativeAppLifecycleModuleSpec;
import com.discord.lifecycle.react.events.OnAppWillEnterForegroundEvent;
import com.discord.lifecycle.react.events.OnHostDestroyEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000*\u0002\u000b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/discord/lifecycle/AppLifecycleModule;", "Lcom/discord/codegen/NativeAppLifecycleModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "reactListenerCount", "", "reactLifecycleEventListener", "com/discord/lifecycle/AppLifecycleModule$reactLifecycleEventListener$1", "Lcom/discord/lifecycle/AppLifecycleModule$reactLifecycleEventListener$1;", "appLifecycleListener", "com/discord/lifecycle/AppLifecycleModule$appLifecycleListener$1", "Lcom/discord/lifecycle/AppLifecycleModule$appLifecycleListener$1;", "initialize", "", "invalidate", "addListener", "type", "", "removeListeners", "count", "", "lifecycle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppLifecycleModule extends NativeAppLifecycleModuleSpec {

    @NotNull
    private final AppLifecycleModule$appLifecycleListener$1 appLifecycleListener;

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final ReactEvents reactEvents;

    @NotNull
    private final AppLifecycleModule$reactLifecycleEventListener$1 reactLifecycleEventListener;
    private int reactListenerCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.discord.lifecycle.AppLifecycleModule$reactLifecycleEventListener$1] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.discord.lifecycle.AppLifecycleModule$appLifecycleListener$1] */
    public AppLifecycleModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.reactEvents = new ReactEvents(new Pair("onHostDestroy", Reflection.getOrCreateKotlinClass(OnHostDestroyEvent.class)), new Pair("appWillEnterForeground", Reflection.getOrCreateKotlinClass(OnAppWillEnterForegroundEvent.class)));
        this.reactLifecycleEventListener = new LifecycleEventListener() { // from class: com.discord.lifecycle.AppLifecycleModule$reactLifecycleEventListener$1
            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
                if (this.this$0.reactListenerCount == 0) {
                    return;
                }
                ReactEvents reactEvents = this.this$0.reactEvents;
                ReactApplicationContext reactApplicationContext = this.this$0.getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                reactEvents.emitModuleEvent(reactApplicationContext, new OnHostDestroyEvent());
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
            }
        };
        this.appLifecycleListener = new AppLifecycle.Listener() { // from class: com.discord.lifecycle.AppLifecycleModule$appLifecycleListener$1
            @Override // com.discord.lifecycle.AppLifecycle.Listener
            public void onBackgrounded() {
                AppLifecycle.Listener.DefaultImpls.onBackgrounded(this);
            }

            @Override // com.discord.lifecycle.AppLifecycle.Listener
            public void onForegrounded() {
                if (this.this$0.reactListenerCount == 0) {
                    return;
                }
                ReactEvents reactEvents = this.this$0.reactEvents;
                ReactApplicationContext reactApplicationContext = this.this$0.getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                reactEvents.emitModuleEvent(reactApplicationContext, new OnAppWillEnterForegroundEvent());
            }
        };
    }

    @Override // com.discord.codegen.NativeAppLifecycleModuleSpec
    public void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.reactListenerCount++;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.reactContext.addLifecycleEventListener(this.reactLifecycleEventListener);
        AppLifecycle.INSTANCE.addListener(this.appLifecycleListener);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.reactContext.removeLifecycleEventListener(this.reactLifecycleEventListener);
        AppLifecycle.INSTANCE.removeListener(this.appLifecycleListener);
    }

    @Override // com.discord.codegen.NativeAppLifecycleModuleSpec
    public void removeListeners(double count) {
        this.reactListenerCount -= (int) count;
    }
}
