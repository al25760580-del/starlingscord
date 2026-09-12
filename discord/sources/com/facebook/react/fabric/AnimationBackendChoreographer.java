package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.GuardedFrameCallback;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/fabric/AnimationBackendChoreographer;", "", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "frameCallback", "Lcom/facebook/react/fabric/AnimationFrameCallback;", "getFrameCallback", "()Lcom/facebook/react/fabric/AnimationFrameCallback;", "setFrameCallback", "(Lcom/facebook/react/fabric/AnimationFrameCallback;)V", "lastFrameTimeMs", "", "reactChoreographer", "Lcom/facebook/react/modules/core/ReactChoreographer;", "choreographerCallback", "Lcom/facebook/react/uimanager/GuardedFrameCallback;", "callbackPosted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "paused", "resume", "", "pause", "scheduleCallback", "executeFrameCallback", "frameTimeNanos", "", "calculateTimestamp", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimationBackendChoreographer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationBackendChoreographer.kt\ncom/facebook/react/fabric/AnimationBackendChoreographer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class AnimationBackendChoreographer {

    @NotNull
    private final AtomicBoolean callbackPosted;

    @NotNull
    private final GuardedFrameCallback choreographerCallback;
    private AnimationFrameCallback frameCallback;
    private double lastFrameTimeMs;

    @NotNull
    private final AtomicBoolean paused;

    @NotNull
    private final ReactChoreographer reactChoreographer;

    public AnimationBackendChoreographer(@NotNull final ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        this.reactChoreographer = ReactChoreographer.INSTANCE.getInstance();
        this.choreographerCallback = new GuardedFrameCallback(reactApplicationContext) { // from class: com.facebook.react.fabric.AnimationBackendChoreographer$choreographerCallback$1
            @Override // com.facebook.react.uimanager.GuardedFrameCallback
            public void doFrameGuarded(long frameTimeNanos) {
                this.executeFrameCallback(frameTimeNanos);
            }
        };
        this.callbackPosted = new AtomicBoolean();
        this.paused = new AtomicBoolean(true);
    }

    private final double calculateTimestamp(long frameTimeNanos) {
        return frameTimeNanos / 1000000.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeFrameCallback(long frameTimeNanos) {
        AnimationFrameCallback animationFrameCallback;
        this.callbackPosted.set(false);
        double dCalculateTimestamp = calculateTimestamp(frameTimeNanos);
        if (dCalculateTimestamp > this.lastFrameTimeMs && (animationFrameCallback = this.frameCallback) != null) {
            animationFrameCallback.onAnimationFrame(dCalculateTimestamp);
        }
        this.lastFrameTimeMs = dCalculateTimestamp;
        scheduleCallback();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    private final void scheduleCallback() {
        boolean z5;
        synchronized (this.paused) {
            try {
                if (this.paused.get()) {
                    z5 = false;
                } else {
                    z5 = true;
                    if (this.callbackPosted.getAndSet(true)) {
                        z5 = false;
                    }
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.choreographerCallback);
        }
    }

    public final AnimationFrameCallback getFrameCallback() {
        return this.frameCallback;
    }

    public final void pause() {
        boolean z5;
        synchronized (this.paused) {
            try {
                z5 = true;
                if (this.paused.getAndSet(true) || !this.callbackPosted.getAndSet(false)) {
                    z5 = false;
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            this.reactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.choreographerCallback);
        }
    }

    public final void resume() {
        if (this.paused.getAndSet(false)) {
            scheduleCallback();
        }
    }

    public final void setFrameCallback(AnimationFrameCallback animationFrameCallback) {
        this.frameCallback = animationFrameCallback;
    }
}
