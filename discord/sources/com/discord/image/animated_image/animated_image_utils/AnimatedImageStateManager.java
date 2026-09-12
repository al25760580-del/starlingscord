package com.discord.image.animated_image.animated_image_utils;

import com.discord.chat.presentation.list.a;
import com.discord.misc.utilities.queue.WorkerQueue;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n6.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\u0018\u0000 **\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001*Bq\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0013J\u0019\u0010!\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b!\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010&¨\u0006+"}, d2 = {"Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;", "T", "", "Lkotlin/Function0;", "", "handlePlay", "handlePause", "handleStop", "Lkotlin/Function1;", "handleRecycle", "", "handleConfigIsValid", "handleFetchAnimatedImage", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "config", "onTryFetch", "(Ljava/lang/Object;)V", "play", "()V", "pause", "reset", "()Z", "animatedImageLoaded", "animate", "onFetchFinished", "(ZZ)Z", "onDetachedFromWindow", "onAttachedToWindow", AppStateModule.APP_STATE_ACTIVE, "updateWorker", "(Z)Z", "reload", "setImageConfig", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "animatedImageConfig", "Ljava/lang/Object;", "Z", "autoplay", "playPending", "pausePending", "Companion", "animated_image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedImageStateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedImageStateManager.kt\ncom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n*L\n1#1,128:1\n17#2,5:129\n17#2,5:134\n17#2,5:139\n17#2,5:144\n17#2,5:149\n*S KotlinDebug\n*F\n+ 1 AnimatedImageStateManager.kt\ncom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager\n*L\n22#1:129,5\n67#1:134,5\n74#1:139,5\n86#1:144,5\n94#1:149,5\n*E\n"})
public final class AnimatedImageStateManager<T> {

    @NotNull
    private static final WorkerQueue<AnimatedImageStateManager<?>> workerQueue;
    private T animatedImageConfig;
    private boolean animatedImageLoaded;
    private boolean autoplay;

    @NotNull
    private final Function1<T, Boolean> handleConfigIsValid;

    @NotNull
    private final Function1<T, Unit> handleFetchAnimatedImage;

    @NotNull
    private final Function0<Unit> handlePause;

    @NotNull
    private final Function0<Unit> handlePlay;

    @NotNull
    private final Function1<T, Unit> handleRecycle;
    private final Function0<Unit> handleStop;
    private boolean pausePending;
    private boolean playPending;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        workerQueue = new WorkerQueue<>(false, 1, defaultConstructorMarker);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedImageStateManager(@NotNull Function0<Unit> handlePlay, @NotNull Function0<Unit> handlePause, Function0<Unit> function0, @NotNull Function1<? super T, Unit> handleRecycle, @NotNull Function1<? super T, Boolean> handleConfigIsValid, @NotNull Function1<? super T, Unit> handleFetchAnimatedImage) {
        Intrinsics.checkNotNullParameter(handlePlay, "handlePlay");
        Intrinsics.checkNotNullParameter(handlePause, "handlePause");
        Intrinsics.checkNotNullParameter(handleRecycle, "handleRecycle");
        Intrinsics.checkNotNullParameter(handleConfigIsValid, "handleConfigIsValid");
        Intrinsics.checkNotNullParameter(handleFetchAnimatedImage, "handleFetchAnimatedImage");
        this.handlePlay = handlePlay;
        this.handlePause = handlePause;
        this.handleStop = function0;
        this.handleRecycle = handleRecycle;
        this.handleConfigIsValid = handleConfigIsValid;
        this.handleFetchAnimatedImage = handleFetchAnimatedImage;
        this.autoplay = true;
    }

    public static /* synthetic */ boolean onFetchFinished$default(AnimatedImageStateManager animatedImageStateManager, boolean z5, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return animatedImageStateManager.onFetchFinished(z5, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reload() {
        T t5 = this.animatedImageConfig;
        if (t5 == null) {
            updateWorker(false);
        } else {
            onTryFetch(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImageConfig(T config) {
        this.animatedImageConfig = config;
        this.animatedImageLoaded = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean updateWorker(boolean active) {
        return workerQueue.updateWorker(this, active, new e(16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateWorker$lambda$5(AnimatedImageStateManager stateManager) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        stateManager.reload();
        return Unit.f14616a;
    }

    public final void onAttachedToWindow() {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        reload();
        if (this.animatedImageLoaded && this.autoplay) {
            this.handlePlay.invoke();
        }
    }

    public final boolean onDetachedFromWindow() {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        Function0 function0 = this.handleStop;
        if (function0 != null) {
            function0.invoke();
        }
        this.playPending = false;
        this.pausePending = false;
        return updateWorker(false);
    }

    public final boolean onFetchFinished(boolean animatedImageLoaded, boolean animate) {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        this.animatedImageLoaded = animatedImageLoaded;
        this.autoplay = animate;
        if (animate || this.playPending) {
            play();
        }
        return updateWorker(false);
    }

    public final void onTryFetch(T config) {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        if (Intrinsics.areEqual(this.animatedImageConfig, config) && this.animatedImageLoaded) {
            updateWorker(false);
            return;
        }
        setImageConfig(config);
        this.handleRecycle.invoke(config);
        if (!((Boolean) this.handleConfigIsValid.invoke(config)).booleanValue()) {
            updateWorker(false);
        } else if (updateWorker(true)) {
            this.handleFetchAnimatedImage.invoke(config);
        }
    }

    public final void pause() {
        this.playPending = false;
        if (!this.animatedImageLoaded) {
            this.pausePending = true;
        } else {
            this.handlePause.invoke();
            this.pausePending = false;
        }
    }

    public final void play() {
        this.pausePending = false;
        if (!this.animatedImageLoaded) {
            this.playPending = true;
        } else {
            this.handlePlay.invoke();
            this.playPending = false;
        }
    }

    public final boolean reset() {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        setImageConfig(null);
        return updateWorker(false);
    }

    public /* synthetic */ AnimatedImageStateManager(Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function1 function4, Function1 function5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function1, (i7 & 4) != 0 ? null : function2, function3, function4, function5);
    }
}
