package com.facebook.react.modules.core;

import a1.k;
import am.c;
import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.ChoreographerProvider;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fJ\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\b\bR\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/modules/core/ReactChoreographer;", "", "choreographerProvider", "Lcom/facebook/react/internal/ChoreographerProvider;", "<init>", "(Lcom/facebook/react/internal/ChoreographerProvider;)V", "choreographer", "Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;", "choreographer$1", "callbackQueues", "", "Ljava/util/ArrayDeque;", "Landroid/view/Choreographer$FrameCallback;", "[Ljava/util/ArrayDeque;", "totalCallbacks", "", "hasPostedCallback", "", "frameCallback", "postFrameCallback", "", "type", "Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;", "callback", "removeFrameCallback", "postFrameCallbackOnChoreographer", "maybeRemoveFrameCallback", "CallbackType", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactChoreographer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactChoreographer.kt\ncom/facebook/react/modules/core/ReactChoreographer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
public final class ReactChoreographer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static ReactChoreographer choreographer;

    @NotNull
    private final ArrayDeque<Choreographer.FrameCallback>[] callbackQueues;

    /* JADX INFO: renamed from: choreographer$1, reason: from kotlin metadata */
    private ChoreographerProvider.Choreographer choreographer;

    @NotNull
    private final Choreographer.FrameCallback frameCallback;
    private boolean hasPostedCallback;
    private int totalCallbacks;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;", "", "order", "", "<init>", "(Ljava/lang/String;II)V", "getOrder$ReactAndroid_release", "()I", "PERF_MARKERS", "DISPATCH_UI", "NATIVE_ANIMATED_MODULE", "TIMERS_EVENTS", "IDLE_EVENT", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum CallbackType {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());
        private final int order;

        CallbackType(int i7) {
            this.order = i7;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getOrder$ReactAndroid_release, reason: from getter */
        public final int getOrder() {
            return this.order;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\b\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/modules/core/ReactChoreographer$Companion;", "", "<init>", "()V", "choreographer", "Lcom/facebook/react/modules/core/ReactChoreographer;", "initialize", "", "choreographerProvider", "Lcom/facebook/react/internal/ChoreographerProvider;", "getInstance", "overrideInstanceForTest", "instance", "overrideInstanceForTest$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReactChoreographer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactChoreographer.kt\ncom/facebook/react/modules/core/ReactChoreographer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ReactChoreographer getInstance() {
            ReactChoreographer reactChoreographer = ReactChoreographer.choreographer;
            if (reactChoreographer != null) {
                return reactChoreographer;
            }
            throw new IllegalStateException("ReactChoreographer needs to be initialized.");
        }

        public final void initialize(@NotNull ChoreographerProvider choreographerProvider) {
            Intrinsics.checkNotNullParameter(choreographerProvider, "choreographerProvider");
            if (ReactChoreographer.choreographer == null) {
                ReactChoreographer.choreographer = new ReactChoreographer(choreographerProvider, null);
            }
        }

        @VisibleForTesting
        public final ReactChoreographer overrideInstanceForTest$ReactAndroid_release(ReactChoreographer instance) {
            ReactChoreographer reactChoreographer = ReactChoreographer.choreographer;
            ReactChoreographer.choreographer = instance;
            return reactChoreographer;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReactChoreographer(ChoreographerProvider choreographerProvider, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographerProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ReactChoreographer reactChoreographer, ChoreographerProvider choreographerProvider) {
        reactChoreographer.choreographer = choreographerProvider.getChoreographer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void frameCallback$lambda$1(ReactChoreographer reactChoreographer, long j) {
        synchronized (reactChoreographer.callbackQueues) {
            try {
                reactChoreographer.hasPostedCallback = false;
                int length = reactChoreographer.callbackQueues.length;
                for (int i7 = 0; i7 < length; i7++) {
                    ArrayDeque<Choreographer.FrameCallback> arrayDeque = reactChoreographer.callbackQueues[i7];
                    int size = arrayDeque.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Choreographer.FrameCallback frameCallbackPollFirst = arrayDeque.pollFirst();
                        if (frameCallbackPollFirst != null) {
                            frameCallbackPollFirst.doFrame(j);
                            reactChoreographer.totalCallbacks--;
                        } else {
                            o8.a.g(ReactConstants.TAG, "Tried to execute non-existent frame callback");
                        }
                    }
                }
                reactChoreographer.maybeRemoveFrameCallback();
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public static final ReactChoreographer getInstance() {
        return INSTANCE.getInstance();
    }

    public static final void initialize(@NotNull ChoreographerProvider choreographerProvider) {
        INSTANCE.initialize(choreographerProvider);
    }

    private final void maybeRemoveFrameCallback() {
        io.sentry.config.a.d(this.totalCallbacks >= 0);
        if (this.totalCallbacks == 0 && this.hasPostedCallback) {
            ChoreographerProvider.Choreographer choreographer2 = this.choreographer;
            if (choreographer2 != null) {
                choreographer2.removeFrameCallback(this.frameCallback);
            }
            this.hasPostedCallback = false;
        }
    }

    private final void postFrameCallbackOnChoreographer() {
        if (this.hasPostedCallback) {
            return;
        }
        ChoreographerProvider.Choreographer choreographer2 = this.choreographer;
        if (choreographer2 == null) {
            UiThreadUtil.runOnUiThread(new c(19, this));
        } else {
            choreographer2.postFrameCallback(this.frameCallback);
            this.hasPostedCallback = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallbackOnChoreographer$lambda$6(ReactChoreographer reactChoreographer) {
        synchronized (reactChoreographer.callbackQueues) {
            reactChoreographer.postFrameCallbackOnChoreographer();
            Unit unit = Unit.f14616a;
        }
    }

    public final void postFrameCallback(@NotNull CallbackType type, @NotNull Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.callbackQueues) {
            this.callbackQueues[type.getOrder()].addLast(callback);
            boolean z5 = true;
            int i7 = this.totalCallbacks + 1;
            this.totalCallbacks = i7;
            if (i7 <= 0) {
                z5 = false;
            }
            io.sentry.config.a.d(z5);
            postFrameCallbackOnChoreographer();
            Unit unit = Unit.f14616a;
        }
    }

    public final void removeFrameCallback(@NotNull CallbackType type, Choreographer.FrameCallback frameCallback) {
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (this.callbackQueues) {
            try {
                if (this.callbackQueues[type.getOrder()].removeFirstOccurrence(frameCallback)) {
                    this.totalCallbacks--;
                    maybeRemoveFrameCallback();
                } else {
                    o8.a.g(ReactConstants.TAG, "Tried to remove non-existent frame callback");
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private ReactChoreographer(ChoreographerProvider choreographerProvider) {
        int size = CallbackType.getEntries().size();
        ArrayDeque<Choreographer.FrameCallback>[] arrayDequeArr = new ArrayDeque[size];
        for (int i7 = 0; i7 < size; i7++) {
            arrayDequeArr[i7] = new ArrayDeque<>();
        }
        this.callbackQueues = arrayDequeArr;
        this.frameCallback = new b(0, this);
        UiThreadUtil.runOnUiThread(new k(23, this, choreographerProvider));
    }
}
