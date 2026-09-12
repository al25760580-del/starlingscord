package com.discord.bug_reporter;

import android.content.ContentResolver;
import androidx.lifecycle.r0;
import com.discord.bug_reporter.react.events.ScreenshotTakenEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000*\u0001\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/discord/bug_reporter/ScreenshotHelperModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "reactLifecycleEventListener", "com/discord/bug_reporter/ScreenshotHelperModule$reactLifecycleEventListener$1", "Lcom/discord/bug_reporter/ScreenshotHelperModule$reactLifecycleEventListener$1;", "screenshotDetector", "Lcom/discord/bug_reporter/ScreenshotDetector;", "getName", "", "initialize", "", "invalidate", "addListener", "type", "removeListeners", "count", "", "bug_reporter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenshotHelperModule extends ReactContextBaseJavaModule {

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final ReactEvents reactEvents;

    @NotNull
    private final ScreenshotHelperModule$reactLifecycleEventListener$1 reactLifecycleEventListener;
    private ScreenshotDetector screenshotDetector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.discord.bug_reporter.ScreenshotHelperModule$reactLifecycleEventListener$1] */
    public ScreenshotHelperModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.reactEvents = new ReactEvents(new Pair("screenshotTaken", Reflection.getOrCreateKotlinClass(ScreenshotTakenEvent.class)));
        this.reactLifecycleEventListener = new LifecycleEventListener() { // from class: com.discord.bug_reporter.ScreenshotHelperModule$reactLifecycleEventListener$1
            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
                ScreenshotDetector screenshotDetector = this.this$0.screenshotDetector;
                if (screenshotDetector != null) {
                    screenshotDetector.setActive(false);
                }
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                ScreenshotDetector screenshotDetector = this.this$0.screenshotDetector;
                if (screenshotDetector != null) {
                    screenshotDetector.setActive(true);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$0(ScreenshotHelperModule screenshotHelperModule) {
        screenshotHelperModule.reactEvents.emitModuleEvent(screenshotHelperModule.reactContext, new ScreenshotTakenEvent());
        return Unit.f14616a;
    }

    @ReactMethod
    public final void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ScreenshotDetector screenshotDetector = this.screenshotDetector;
        if (screenshotDetector != null) {
            screenshotDetector.setScreenshotListener(new r0(4, this));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "ScreenshotHelper";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        ContentResolver contentResolver = this.reactContext.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        this.screenshotDetector = new ScreenshotDetector(contentResolver);
        this.reactContext.addLifecycleEventListener(this.reactLifecycleEventListener);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.reactContext.removeLifecycleEventListener(this.reactLifecycleEventListener);
        ScreenshotDetector screenshotDetector = this.screenshotDetector;
        if (screenshotDetector != null) {
            screenshotDetector.setActive(false);
        }
        this.screenshotDetector = null;
    }

    @ReactMethod
    public final void removeListeners(int count) {
        ScreenshotDetector screenshotDetector = this.screenshotDetector;
        if (screenshotDetector != null) {
            screenshotDetector.setScreenshotListener(null);
        }
    }
}
