package app.rive;

import a3.e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.j0;
import app.rive.core.AudioEngine;
import app.rive.core.CommandQueue;
import app.rive.core.FrameTicker;
import app.rive.core.FrameTickerKt;
import ar.b0;
import com.discord.media.engine.MediaEngine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import rn.q;
import rn.r;
import u.b;
import u.c;
import u.f;
import u.g;
import u.l;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\n\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "autoPoll", "tracingEnabled", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "rememberRiveWorker", "(ZZLu/c;II)Lapp/rive/core/CommandQueue;", "Lu/l;", "", "errorState", "rememberRiveWorkerOrNull", "(Lu/l;ZZLu/c;II)Lapp/rive/core/CommandQueue;", "", "RIVE_WORKER_TAG", "Ljava/lang/String;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nrememberRiveWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 rememberRiveWorker.kt\napp/rive/RememberRiveWorkerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,137:1\n1282#2,6:138\n1282#2,3:145\n1285#2,3:151\n75#3:144\n1#4:148\n69#5,2:149\n*S KotlinDebug\n*F\n+ 1 rememberRiveWorker.kt\napp/rive/RememberRiveWorkerKt\n*L\n50#1:138,6\n79#1:145,3\n79#1:151,3\n78#1:144\n85#1:149,2\n*E\n"})
public final class RememberRiveWorkerKt {

    @NotNull
    public static final String RIVE_WORKER_TAG = "Rive/Worker";

    /* JADX INFO: renamed from: app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$1", f = "rememberRiveWorker.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $tracingEnabled;
        final /* synthetic */ CommandQueue $worker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommandQueue commandQueue, boolean z5, Continuation continuation) {
            super(2, continuation);
            this.$worker = commandQueue;
            this.$tracingEnabled = z5;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$worker, this.$tracingEnabled, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            CommandQueue commandQueue = this.$worker;
            if (commandQueue == null) {
                return Unit.f14616a;
            }
            commandQueue.setTracingEnabled(this.$tracingEnabled);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$2", f = "rememberRiveWorker.kt", l = {104}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $autoPoll;
        final /* synthetic */ LifecycleOwner $lifecycleOwner;
        final /* synthetic */ CommandQueue $worker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandQueue commandQueue, boolean z5, LifecycleOwner lifecycleOwner, Continuation continuation) {
            super(2, continuation);
            this.$worker = commandQueue;
            this.$autoPoll = z5;
            this.$lifecycleOwner = lifecycleOwner;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass2(this.$worker, this.$autoPoll, this.$lifecycleOwner, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                CommandQueue commandQueue = this.$worker;
                if (commandQueue == null || !this.$autoPoll) {
                    return Unit.f14616a;
                }
                Lifecycle lifecycle = this.$lifecycleOwner.getLifecycle();
                FrameTicker composeFrameTicker = FrameTickerKt.getComposeFrameTicker();
                this.label = 1;
                if (commandQueue.beginPolling(lifecycle, composeFrameTicker, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$3", f = "rememberRiveWorker.kt", l = {MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ LifecycleOwner $lifecycleOwner;
        final /* synthetic */ CommandQueue $worker;
        int label;

        /* JADX INFO: renamed from: app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @d(c = "app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$3$1", f = "rememberRiveWorker.kt", l = {118}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
            int label;

            public AnonymousClass1(Continuation continuation) {
                super(2, continuation);
            }

            @Override // xn.a
            @NotNull
            public final Continuation create(Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(@NotNull Object obj) {
                wn.a aVar = wn.a.f22354d;
                int i7 = this.label;
                try {
                    if (i7 != 0) {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.a.L(obj);
                        throw new rn.h();
                    }
                    ib.a.L(obj);
                    AudioEngine.INSTANCE.acquire();
                    this.label = 1;
                    b0.e(this);
                    return aVar;
                } catch (Throwable th2) {
                    AudioEngine.INSTANCE.release();
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CommandQueue commandQueue, LifecycleOwner lifecycleOwner, Continuation continuation) {
            super(2, continuation);
            this.$worker = commandQueue;
            this.$lifecycleOwner = lifecycleOwner;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass3(this.$worker, this.$lifecycleOwner, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                if (this.$worker == null) {
                    return Unit.f14616a;
                }
                Lifecycle lifecycle = this.$lifecycleOwner.getLifecycle();
                Lifecycle.State state = Lifecycle.State.f2299w;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (j0.a(lifecycle, state, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu/g;", "Lu/f;", "invoke", "(Lu/g;)Lu/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nrememberRiveWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 rememberRiveWorker.kt\napp/rive/RememberRiveWorkerKt$rememberRiveWorkerOrNull$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,137:1\n66#2,5:138\n66#2,5:143\n*S KotlinDebug\n*F\n+ 1 rememberRiveWorker.kt\napp/rive/RememberRiveWorkerKt$rememberRiveWorkerOrNull$4\n*L\n128#1:138,5\n130#1:143,5\n*E\n"})
    public static final class AnonymousClass4 extends Lambda implements Function1<g, f> {
        final /* synthetic */ CommandQueue $worker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CommandQueue commandQueue) {
            super(1);
            this.$worker = commandQueue;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final f invoke(@NotNull g DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final CommandQueue commandQueue = this.$worker;
            return commandQueue == null ? new f() { // from class: app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$4$invoke$$inlined$onDispose$1
                public void dispose() {
                }
            } : new f() { // from class: app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$4$invoke$$inlined$onDispose$2
                public void dispose() {
                    commandQueue.release(RememberRiveWorkerKt.RIVE_WORKER_TAG, "Compose dispose");
                }
            };
        }
    }

    @NotNull
    public static final CommandQueue rememberRiveWorker(boolean z5, boolean z6, c cVar, int i7, int i10) throws RiveInitializationException {
        cVar.d();
        if ((i10 & 1) != 0) {
            z5 = true;
        }
        boolean z7 = z5;
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        boolean z10 = z6;
        cVar.d();
        Object objA = cVar.a();
        if (objA == b.f20883a) {
            objA = mf.f.C(null);
            cVar.g();
        }
        l lVar = (l) objA;
        cVar.k();
        int i11 = i7 << 3;
        CommandQueue commandQueueRememberRiveWorkerOrNull = rememberRiveWorkerOrNull(lVar, z7, z10, cVar, (i11 & 112) | 6 | (i11 & 896), 0);
        if (commandQueueRememberRiveWorkerOrNull == null) {
            throw new RiveInitializationException("Failed to create Rive worker", (Throwable) lVar.getValue());
        }
        cVar.k();
        return commandQueueRememberRiveWorkerOrNull;
    }

    public static final CommandQueue rememberRiveWorkerOrNull(l lVar, boolean z5, boolean z6, c cVar, int i7, int i10) {
        Object objO;
        cVar.d();
        if ((i10 & 1) != 0) {
            lVar = mf.f.C(null);
        }
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        boolean z7 = z6;
        int i11 = r2.a.f19187a;
        cVar.d();
        Object objA = cVar.a();
        if (objA == b.f20883a) {
            try {
                q qVar = kotlin.Result.f14614e;
                objO = new CommandQueue(null, null, z7, 3, null);
            } catch (Throwable th2) {
                q qVar2 = kotlin.Result.f14614e;
                objO = ib.a.o(th2);
            }
            final Throwable thA = kotlin.Result.a(objO);
            if (thA != null) {
                if (lVar.getValue() == null) {
                    lVar.setValue(thA);
                }
                RiveLog.INSTANCE.getLogger().e(RIVE_WORKER_TAG, null, new Function0<String>() { // from class: app.rive.RememberRiveWorkerKt$rememberRiveWorkerOrNull$worker$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return e.l("Failed to create Rive worker: ", thA.getMessage());
                    }
                });
            }
            if (objO instanceof r) {
                objO = null;
            }
            objA = (CommandQueue) objO;
            cVar.g();
        }
        cVar.k();
        new AnonymousClass1((CommandQueue) objA, z7, null);
        throw null;
    }
}
