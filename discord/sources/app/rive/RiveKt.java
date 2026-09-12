package app.rive;

import a3.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Trace;
import android.view.TextureView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.j0;
import app.rive.core.CommandQueue;
import app.rive.core.RiveSurface;
import app.rive.core.StateMachineHandle;
import app.rive.core.ViewModelInstanceHandle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.p;
import dr.v;
import g0.i;
import g0.j;
import g0.m;
import g0.n;
import g0.o;
import g0.s;
import g0.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o0;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import n0.b;
import org.jetbrains.annotations.NotNull;
import s0.g;
import u.k;
import u.l;
import u.x;
import xn.c;
import xn.d;
import xn.h;
import z.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008f\u0001\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102 \b\u0002\u0010\u0017\u001a\u001a\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c*\u0016\u0010\u001f\"\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0012\u0004\u0012\u00020\u00140\u0013¨\u0006'²\u0006\u000e\u0010 \u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\"\u001a\u0004\u0018\u00010!8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006$\u0010%\u001a\u001a\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010&\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/rive/RiveFile;", "file", "Lz/f;", "modifier", "", "playing", "Lapp/rive/Artboard;", "artboard", "Lapp/rive/StateMachine;", "stateMachine", "Lapp/rive/ViewModelInstance;", "viewModelInstance", "Lapp/rive/Fit;", "fit", "", ViewProps.BACKGROUND_COLOR, "Lapp/rive/RivePointerInputMode;", "pointerInputMode", "Lkotlin/Function1;", "Lkotlin/Function0;", "Landroid/graphics/Bitmap;", "Lapp/rive/GetBitmapFun;", "", "onBitmapAvailable", "Rive", "(Lapp/rive/RiveFile;Lz/f;ZLapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/ViewModelInstance;Lapp/rive/Fit;ILapp/rive/RivePointerInputMode;Lkotlin/jvm/functions/Function1;Lu/c;II)V", "", "GENERAL_TAG", "Ljava/lang/String;", "STATE_MACHINE_TAG", "DRAW_TAG", "GetBitmapFun", "isSettled", "Lapp/rive/core/RiveSurface;", "surface", "surfaceWidth", "surfaceHeight", "currentOnBitmapAvailable", "bitmapCallbackSent", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rive.kt\napp/rive/RiveKt\n+ 2 RiveLog.kt\napp/rive/RiveLog\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,521:1\n53#2:522\n75#3:523\n1282#4,6:524\n1282#4,6:530\n1282#4,6:536\n1282#4,6:542\n1282#4,6:548\n1282#4,6:554\n1282#4,6:560\n85#5:566\n117#5,2:567\n85#5:569\n117#5,2:570\n85#5:578\n85#5:579\n117#5,2:580\n78#6:572\n111#6,2:573\n78#6:575\n111#6,2:576\n78#7,11:582\n91#7:613\n456#8,8:593\n464#8,6:607\n4144#9,6:601\n*S KotlinDebug\n*F\n+ 1 Rive.kt\napp/rive/RiveKt\n*L\n180#1:522\n181#1:523\n192#1:524,6\n194#1:530,6\n195#1:536,6\n196#1:542,6\n199#1:548,6\n207#1:554,6\n263#1:560,6\n192#1:566\n192#1:567,2\n194#1:569\n194#1:570,2\n206#1:578\n207#1:579\n207#1:580,2\n195#1:572\n195#1:573,2\n196#1:575\n196#1:576,2\n390#1:582,11\n390#1:613\n390#1:593,8\n390#1:607,6\n390#1:601,6\n*E\n"})
public final class RiveKt {

    @NotNull
    private static final String DRAW_TAG = "Rive/UI/Draw";

    @NotNull
    private static final String GENERAL_TAG = "Rive/UI";

    @NotNull
    private static final String STATE_MACHINE_TAG = "Rive/UI/SM";

    /* JADX INFO: renamed from: app.rive.RiveKt$Rive$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends Lambda implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Rive Recomposing";
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$Rive$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.RiveKt$Rive$3", f = "Rive.kt", l = {243}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nRive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$3\n+ 2 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,521:1\n57#2:522\n57#2:523\n*S KotlinDebug\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$3\n*L\n229#1:522\n233#1:523\n*E\n"})
    public static final class AnonymousClass3 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ l $isSettled$delegate;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ long $stateMachineHandle;
        final /* synthetic */ ViewModelInstance $viewModelInstance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ViewModelInstance viewModelInstance, CommandQueue commandQueue, long j, l lVar, Continuation continuation) {
            super(2, continuation);
            this.$viewModelInstance = viewModelInstance;
            this.$riveWorker = commandQueue;
            this.$stateMachineHandle = j;
            this.$isSettled$delegate = lVar;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass3(this.$viewModelInstance, this.$riveWorker, this.$stateMachineHandle, this.$isSettled$delegate, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                final ViewModelInstance viewModelInstance = this.$viewModelInstance;
                if (viewModelInstance == null) {
                    final long j = this.$stateMachineHandle;
                    RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0<String>() { // from class: app.rive.RiveKt.Rive.3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return e.l("No view model instance to bind for ", StateMachineHandle.m224toStringimpl(j));
                        }
                    });
                    return Unit.f14616a;
                }
                RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0<String>() { // from class: app.rive.RiveKt.Rive.3.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return e.l("Binding view model instance ", ViewModelInstanceHandle.m233toStringimpl(viewModelInstance.getInstanceHandle()));
                    }
                });
                this.$riveWorker.m124bindViewModelInstanceeiyHz8(this.$stateMachineHandle, this.$viewModelInstance.getInstanceHandle());
                RiveKt.Rive$lambda$2(this.$isSettled$delegate, false);
                v dirtyFlow$kotlin_release = this.$viewModelInstance.getDirtyFlow();
                final long j5 = this.$stateMachineHandle;
                final l lVar = this.$isSettled$delegate;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.rive.RiveKt.Rive.3.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(@NotNull Unit unit, @NotNull Continuation continuation) {
                        final long j7 = j5;
                        RiveLog.INSTANCE.getLogger().v(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0<String>() { // from class: app.rive.RiveKt.Rive.3.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return e.l("View model instance dirty, unsettling ", StateMachineHandle.m224toStringimpl(j7));
                            }
                        });
                        RiveKt.Rive$lambda$2(lVar, false);
                        return Unit.f14616a;
                    }
                };
                this.label = 1;
                if (dirtyFlow$kotlin_release.collect(flowCollector, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            throw new rn.h();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$Rive$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.RiveKt$Rive$4", f = "Rive.kt", l = {253}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nRive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$4\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,521:1\n17#2:522\n19#2:526\n46#3:523\n51#3:525\n105#4:524\n*S KotlinDebug\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$4\n*L\n252#1:522\n252#1:526\n252#1:523\n252#1:525\n252#1:524\n*E\n"})
    public static final class AnonymousClass4 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ l $isSettled$delegate;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ long $stateMachineHandle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CommandQueue commandQueue, long j, l lVar, Continuation continuation) {
            super(2, continuation);
            this.$riveWorker = commandQueue;
            this.$stateMachineHandle = j;
            this.$isSettled$delegate = lVar;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass4(this.$riveWorker, this.$stateMachineHandle, this.$isSettled$delegate, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                final v settledFlow = this.$riveWorker.getSettledFlow();
                final long j = this.$stateMachineHandle;
                Flow flow = new Flow() { // from class: app.rive.RiveKt$Rive$4$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: app.rive.RiveKt$Rive$4$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Rive.kt\napp/rive/RiveKt$Rive$4\n*L\n1#1,218:1\n18#2:219\n19#2:221\n252#3:220\n*E\n"})
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ long $stateMachineHandle$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* JADX INFO: renamed from: app.rive.RiveKt$Rive$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @d(c = "app.rive.RiveKt$Rive$4$invokeSuspend$$inlined$filter$1$2", f = "Rive.kt", l = {219}, m = "emit")
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                        public static final class AnonymousClass1 extends c {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // xn.a
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, long j) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$stateMachineHandle$inlined = j;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i7 = anonymousClass1.label;
                                if ((i7 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i7 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            wn.a aVar = wn.a.f22354d;
                            int i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                ib.a.L(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((StateMachineHandle) obj).m225unboximpl() == this.$stateMachineHandle$inlined) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ib.a.L(obj2);
                            }
                            return Unit.f14616a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = settledFlow.collect(new AnonymousClass2(flowCollector, j), continuation);
                        return objCollect == wn.a.f22354d ? objCollect : Unit.f14616a;
                    }
                };
                final long j5 = this.$stateMachineHandle;
                final l lVar = this.$isSettled$delegate;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.rive.RiveKt.Rive.4.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return m40emitOFH3VyA(((StateMachineHandle) obj2).m225unboximpl(), continuation);
                    }

                    /* JADX INFO: renamed from: emit-OFH3VyA, reason: not valid java name */
                    public final Object m40emitOFH3VyA(long j7, @NotNull Continuation continuation) {
                        final long j10 = j5;
                        RiveLog.INSTANCE.getLogger().v(RiveKt.STATE_MACHINE_TAG, new Function0<String>() { // from class: app.rive.RiveKt.Rive.4.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return g.e("State machine ", StateMachineHandle.m224toStringimpl(j10), " settled");
                            }
                        });
                        RiveKt.Rive$lambda$2(lVar, true);
                        return Unit.f14616a;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == aVar) {
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
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$Rive$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.RiveKt$Rive$6", f = "Rive.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nRive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$6\n+ 2 Tracing.kt\napp/rive/core/TracingKt\n+ 3 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,521:1\n12#2,3:522\n16#2,2:526\n12#2,3:528\n16#2,2:532\n57#3:525\n57#3:531\n*S KotlinDebug\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$6\n*L\n275#1:522,3\n275#1:526,2\n282#1:528,3\n282#1:532,2\n276#1:525\n283#1:531\n*E\n"})
    public static final class AnonymousClass6 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Artboard $artboardToUse;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ l $surface$delegate;
        final /* synthetic */ k $surfaceHeight$delegate;
        final /* synthetic */ k $surfaceWidth$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Fit fit, l lVar, Artboard artboard, k kVar, k kVar2, Continuation continuation) {
            super(2, continuation);
            this.$fit = fit;
            this.$surface$delegate = lVar;
            this.$artboardToUse = artboard;
            this.$surfaceWidth$delegate = kVar;
            this.$surfaceHeight$delegate = kVar2;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass6(this.$fit, this.$surface$delegate, this.$artboardToUse, this.$surfaceWidth$delegate, this.$surfaceHeight$delegate, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            RiveSurface riveSurfaceRive$lambda$4 = RiveKt.Rive$lambda$4(this.$surface$delegate);
            if (riveSurfaceRive$lambda$4 == null) {
                return Unit.f14616a;
            }
            Fit fit = this.$fit;
            if (fit instanceof Fit.Layout) {
                Artboard artboard = this.$artboardToUse;
                final k kVar = this.$surfaceWidth$delegate;
                final k kVar2 = this.$surfaceHeight$delegate;
                Trace.beginSection("Rive/Layout/ResizeArtboard");
                try {
                    RiveLog.INSTANCE.getLogger().d(RiveKt.GENERAL_TAG, new Function0<String>() { // from class: app.rive.RiveKt$Rive$6$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return e.g(RiveKt.Rive$lambda$7(kVar), RiveKt.Rive$lambda$10(kVar2), "Resizing artboard to ", " x ");
                        }
                    });
                    artboard.resizeArtboard(riveSurfaceRive$lambda$4, fit.getScaleFactor());
                    Unit unit = Unit.f14616a;
                } finally {
                    Trace.endSection();
                }
            } else {
                Artboard artboard2 = this.$artboardToUse;
                Trace.beginSection("Rive/Layout/ResetArtboardSize");
                try {
                    RiveLog.INSTANCE.getLogger().d(RiveKt.GENERAL_TAG, new Function0<String>() { // from class: app.rive.RiveKt$Rive$6$2$1
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Resetting artboard size";
                        }
                    });
                    artboard2.resetArtboardSize();
                    Unit unit2 = Unit.f14616a;
                } finally {
                    Trace.endSection();
                }
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$Rive$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.RiveKt$Rive$7", f = "Rive.kt", l = {333}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nRive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$7\n+ 2 RiveLog.kt\napp/rive/RiveLog\n+ 3 Tracing.kt\napp/rive/core/TracingKt\n*L\n1#1,521:1\n57#2:522\n57#2:523\n57#2:533\n12#3,3:524\n12#3,6:527\n12#3,6:534\n16#3,2:540\n*S KotlinDebug\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$7\n*L\n302#1:522\n306#1:523\n317#1:533\n310#1:524,3\n311#1:527,6\n320#1:534,6\n310#1:540,2\n*E\n"})
    public static final class AnonymousClass7 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ long $artboardHandle;
        final /* synthetic */ int $backgroundColor;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ l $isSettled$delegate;
        final /* synthetic */ LifecycleOwner $lifecycleOwner;
        final /* synthetic */ boolean $playing;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ long $stateMachineHandle;
        final /* synthetic */ StateMachine $stateMachineToUse;
        final /* synthetic */ l $surface$delegate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: app.rive.RiveKt$Rive$7$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @d(c = "app.rive.RiveKt$Rive$7$4", f = "Rive.kt", l = {340}, m = "invokeSuspend")
        @SourceDebugExtension({"SMAP\nRive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$7$4\n+ 2 RiveLog.kt\napp/rive/RiveLog\n+ 3 Tracing.kt\napp/rive/core/TracingKt\n*L\n1#1,521:1\n57#2:522\n57#2:532\n57#2:547\n12#3,3:523\n12#3,6:526\n12#3,6:533\n12#3,6:539\n16#3,2:545\n*S KotlinDebug\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$7$4\n*L\n334#1:522\n354#1:532\n376#1:547\n347#1:523,3\n350#1:526,6\n358#1:533,6\n361#1:539,6\n347#1:545,2\n*E\n"})
        public static final class AnonymousClass4 extends h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ long $artboardHandle;
            final /* synthetic */ int $backgroundColor;
            final /* synthetic */ Fit $fit;
            final /* synthetic */ l $isSettled$delegate;
            final /* synthetic */ CommandQueue $riveWorker;
            final /* synthetic */ long $stateMachineHandle;
            final /* synthetic */ l $surface$delegate;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(long j, long j5, l lVar, l lVar2, CommandQueue commandQueue, Fit fit, int i7, Continuation continuation) {
                super(2, continuation);
                this.$artboardHandle = j;
                this.$stateMachineHandle = j5;
                this.$isSettled$delegate = lVar;
                this.$surface$delegate = lVar2;
                this.$riveWorker = commandQueue;
                this.$fit = fit;
                this.$backgroundColor = i7;
            }

            @Override // xn.a
            @NotNull
            public final Continuation create(Object obj, @NotNull Continuation continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$artboardHandle, this.$stateMachineHandle, this.$isSettled$delegate, this.$surface$delegate, this.$riveWorker, this.$fit, this.$backgroundColor, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0057  */
            /* JADX WARN: Code duplicated, block: B:13:0x006f A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:25:0x00a2 A[Catch: all -> 0x009b, TryCatch #2 {all -> 0x009b, blocks: (B:15:0x0089, B:17:0x008f, B:19:0x0096, B:34:0x00d4, B:23:0x009e, B:24:0x00a1, B:25:0x00a2, B:27:0x00a8, B:28:0x00b7, B:30:0x00c2, B:33:0x00d1, B:41:0x00e6, B:42:0x00e9, B:44:0x00eb, B:45:0x00ee, B:32:0x00ce, B:29:0x00bd, B:18:0x0094), top: B:54:0x0089, inners: #0, #1, #3 }] */
            /* JADX WARN: Code duplicated, block: B:27:0x00a8 A[Catch: all -> 0x009b, TryCatch #2 {all -> 0x009b, blocks: (B:15:0x0089, B:17:0x008f, B:19:0x0096, B:34:0x00d4, B:23:0x009e, B:24:0x00a1, B:25:0x00a2, B:27:0x00a8, B:28:0x00b7, B:30:0x00c2, B:33:0x00d1, B:41:0x00e6, B:42:0x00e9, B:44:0x00eb, B:45:0x00ee, B:32:0x00ce, B:29:0x00bd, B:18:0x0094), top: B:54:0x0089, inners: #0, #1, #3 }] */
            /* JADX WARN: Code duplicated, block: B:28:0x00b7 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #2 {all -> 0x009b, blocks: (B:15:0x0089, B:17:0x008f, B:19:0x0096, B:34:0x00d4, B:23:0x009e, B:24:0x00a1, B:25:0x00a2, B:27:0x00a8, B:28:0x00b7, B:30:0x00c2, B:33:0x00d1, B:41:0x00e6, B:42:0x00e9, B:44:0x00eb, B:45:0x00ee, B:32:0x00ce, B:29:0x00bd, B:18:0x0094), top: B:54:0x0089, inners: #0, #1, #3 }] */
            /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
            /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006d -> B:14:0x0070). Please report as a decompilation issue!!! */
            /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
                java.lang.StackOverflowError
                	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
                	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
                */
            @Override // xn.a
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 264
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: app.rive.RiveKt.AnonymousClass7.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(boolean z5, LifecycleOwner lifecycleOwner, l lVar, StateMachine stateMachine, CommandQueue commandQueue, long j, long j5, Fit fit, int i7, l lVar2, Continuation continuation) {
            super(2, continuation);
            this.$playing = z5;
            this.$lifecycleOwner = lifecycleOwner;
            this.$surface$delegate = lVar;
            this.$stateMachineToUse = stateMachine;
            this.$riveWorker = commandQueue;
            this.$artboardHandle = j;
            this.$stateMachineHandle = j5;
            this.$fit = fit;
            this.$backgroundColor = i7;
            this.$isSettled$delegate = lVar2;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$playing, this.$lifecycleOwner, this.$surface$delegate, this.$stateMachineToUse, this.$riveWorker, this.$artboardHandle, this.$stateMachineHandle, this.$fit, this.$backgroundColor, this.$isSettled$delegate, continuation);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                if (RiveKt.Rive$lambda$4(this.$surface$delegate) == null) {
                    RiveLog.INSTANCE.getLogger().d(RiveKt.DRAW_TAG, new Function0<String>() { // from class: app.rive.RiveKt.Rive.7.1
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Surface is null, skipping drawing";
                        }
                    });
                    return Unit.f14616a;
                }
                if (!this.$playing) {
                    AnonymousClass2 anonymousClass2 = new Function0<String>() { // from class: app.rive.RiveKt.Rive.7.2
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Playing is false. Advancing by 0, drawing once, and skipping advancement loop.";
                        }
                    };
                    RiveLog riveLog = RiveLog.INSTANCE;
                    riveLog.getLogger().d(RiveKt.DRAW_TAG, anonymousClass2);
                    StateMachine stateMachine = this.$stateMachineToUse;
                    l lVar = this.$surface$delegate;
                    CommandQueue commandQueue = this.$riveWorker;
                    long j = this.$artboardHandle;
                    long j5 = this.$stateMachineHandle;
                    Fit fit = this.$fit;
                    int i10 = this.$backgroundColor;
                    Trace.beginSection("Rive/Frame");
                    try {
                        Trace.beginSection("Rive/Frame/Advance");
                        try {
                            yq.a aVar2 = Duration.f14747e;
                            stateMachine.m51advanceLRDsOJo(yq.c.g(0, yq.d.NANOSECONDS));
                            Unit unit = Unit.f14616a;
                            Trace.endSection();
                            RiveSurface riveSurfaceRive$lambda$4 = RiveKt.Rive$lambda$4(lVar);
                            if (riveSurfaceRive$lambda$4 == null) {
                                riveLog.getLogger().d(RiveKt.DRAW_TAG, new Function0<String>() { // from class: app.rive.RiveKt$Rive$7$3$drawSurface$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final String invoke() {
                                        return "Surface was released before draw, skipping frame";
                                    }
                                });
                            } else {
                                Trace.beginSection("Rive/Frame/Draw");
                                try {
                                    commandQueue.m141drawOcc3x_Y(j, j5, riveSurfaceRive$lambda$4, fit, i10);
                                    Trace.endSection();
                                } finally {
                                    Trace.endSection();
                                }
                            }
                            return Unit.f14616a;
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                Lifecycle lifecycle = this.$lifecycleOwner.getLifecycle();
                Lifecycle.State state = Lifecycle.State.f2299w;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$artboardHandle, this.$stateMachineHandle, this.$isSettled$delegate, this.$surface$delegate, this.$riveWorker, this.$fit, this.$backgroundColor, null);
                this.label = 1;
                if (j0.a(lifecycle, state, anonymousClass4, this) == aVar) {
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
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$Rive$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lu/c;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass8 extends Lambda implements Function2<u.c, Integer, Unit> {
        final /* synthetic */ l $bitmapCallbackSent$delegate;
        final /* synthetic */ x $currentOnBitmapAvailable$delegate;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ l $surface$delegate;
        final /* synthetic */ k $surfaceHeight$delegate;
        final /* synthetic */ k $surfaceWidth$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(CommandQueue commandQueue, l lVar, k kVar, k kVar2, l lVar2, x xVar) {
            super(2);
            this.$riveWorker = commandQueue;
            this.$surface$delegate = lVar;
            this.$surfaceWidth$delegate = kVar;
            this.$surfaceHeight$delegate = kVar2;
            this.$bitmapCallbackSent$delegate = lVar2;
            this.$currentOnBitmapAvailable$delegate = xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((u.c) null, ((Number) obj2).intValue());
            return Unit.f14616a;
        }

        public final void invoke(u.c cVar, int i7) {
            if ((i7 & 11) == 2 && cVar.c()) {
                cVar.f();
                return;
            }
            final CommandQueue commandQueue = this.$riveWorker;
            final l lVar = this.$surface$delegate;
            final k kVar = this.$surfaceWidth$delegate;
            final k kVar2 = this.$surfaceHeight$delegate;
            final l lVar2 = this.$bitmapCallbackSent$delegate;
            final x xVar = this.$currentOnBitmapAvailable$delegate;
            Function1<Context, TextureView> factory = new Function1<Context, TextureView>() { // from class: app.rive.RiveKt.Rive.8.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final TextureView invoke(@NotNull Context context) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    TextureView textureView = new TextureView(context);
                    CommandQueue commandQueue2 = commandQueue;
                    l lVar3 = lVar;
                    k kVar3 = kVar;
                    k kVar4 = kVar2;
                    l lVar4 = lVar2;
                    x xVar2 = xVar;
                    textureView.setOpaque(false);
                    textureView.setSurfaceTextureListener(new RiveKt$Rive$8$1$1$1(commandQueue2, lVar3, kVar3, kVar4, lVar4, textureView, xVar2));
                    return textureView;
                }
            };
            int i10 = b.f16213a;
            Intrinsics.checkNotNullParameter(factory, "factory");
            throw null;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$Rive$9, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass9 extends Lambda implements Function2<u.c, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ int $backgroundColor;
        final /* synthetic */ RiveFile $file;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ f $modifier;
        final /* synthetic */ Function1<Function0<Bitmap>, Unit> $onBitmapAvailable;
        final /* synthetic */ boolean $playing;
        final /* synthetic */ RivePointerInputMode $pointerInputMode;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ ViewModelInstance $viewModelInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(RiveFile riveFile, f fVar, boolean z5, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i7, RivePointerInputMode rivePointerInputMode, Function1<? super Function0<Bitmap>, Unit> function1, int i10, int i11) {
            super(2);
            this.$file = riveFile;
            this.$modifier = fVar;
            this.$playing = z5;
            this.$artboard = artboard;
            this.$stateMachine = stateMachine;
            this.$viewModelInstance = viewModelInstance;
            this.$fit = fit;
            this.$backgroundColor = i7;
            this.$pointerInputMode = rivePointerInputMode;
            this.$onBitmapAvailable = function1;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((u.c) null, ((Number) obj2).intValue());
            return Unit.f14616a;
        }

        public final void invoke(u.c cVar, int i7) {
            RiveFile riveFile = this.$file;
            f fVar = this.$modifier;
            boolean z5 = this.$playing;
            Artboard artboard = this.$artboard;
            StateMachine stateMachine = this.$stateMachine;
            ViewModelInstance viewModelInstance = this.$viewModelInstance;
            Fit fit = this.$fit;
            int i10 = this.$backgroundColor;
            RivePointerInputMode rivePointerInputMode = this.$pointerInputMode;
            Function1<Function0<Bitmap>, Unit> function1 = this.$onBitmapAvailable;
            int i11 = this.$$changed | 1;
            int i12 = 306783378 & i11;
            int i13 = 613566756 & i11;
            RiveKt.Rive(riveFile, fVar, z5, artboard, stateMachine, viewModelInstance, fit, i10, rivePointerInputMode, function1, cVar, (i11 & (-920350135)) | (i13 >> 1) | i12 | ((i12 << 1) & i13), this.$$default);
        }
    }

    public static final void Rive(@NotNull RiveFile file, f fVar, boolean z5, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i7, RivePointerInputMode rivePointerInputMode, Function1<? super Function0<Bitmap>, Unit> function1, u.c cVar, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(file, "file");
        cVar.m();
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else {
            if ((i10 & 14) == 0) {
                throw null;
            }
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            throw null;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            throw null;
        }
        if ((i11 & 8) != 0) {
            i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i11 & 16) != 0) {
            i12 |= 8192;
        }
        if ((i11 & 32) != 0) {
            i12 |= 65536;
        }
        if ((3670016 & i10) == 0) {
            if ((i11 & 64) == 0) {
                throw null;
            }
            i12 |= 524288;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            i12 |= 12582912;
        } else if ((29360128 & i10) == 0) {
            throw null;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            i12 |= 100663296;
        } else if ((234881024 & i10) == 0) {
            throw null;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            i12 |= 805306368;
        } else if ((1879048192 & i10) == 0) {
            throw null;
        }
        if ((i11 & 56) == 56 && (i12 & 1533916891) != 306783378) {
            throw null;
        }
        throw null;
    }

    private static final void Rive$SingleChildLayout(f modifier, Function2<? super u.c, ? super Integer, Unit> function2, u.c cVar, int i7, int i10) {
        cVar.d();
        if ((i10 & 1) != 0) {
            modifier = z.c.f23573a;
        }
        RiveKt$Rive$SingleChildLayout$1 riveKt$Rive$SingleChildLayout$1 = new n() { // from class: app.rive.RiveKt$Rive$SingleChildLayout$1
            @Override // g0.n
            public int maxIntrinsicHeight(@NotNull g0.g gVar, @NotNull List measurables, int i11) {
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                ArrayList arrayList = new ArrayList(measurables.size());
                int size = measurables.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList.add(new g0.d((m) measurables.get(i12), g0.h.f9442e, i.f9445e));
                }
                return ((p) mo42measure3p2s80s(new j(gVar, gVar.getLayoutDirection()), arrayList, e4.f.c(i11, 0, 13))).f6603b;
            }

            @Override // g0.n
            public int maxIntrinsicWidth(@NotNull g0.g gVar, @NotNull List measurables, int i11) {
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                ArrayList arrayList = new ArrayList(measurables.size());
                int size = measurables.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList.add(new g0.d((m) measurables.get(i12), g0.h.f9442e, i.f9444d));
                }
                return ((p) mo42measure3p2s80s(new j(gVar, gVar.getLayoutDirection()), arrayList, e4.f.c(0, i11, 7))).f6602a;
            }

            @Override // g0.n
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
            public final o mo42measure3p2s80s(@NotNull g0.p Layout, @NotNull List<? extends m> measurables, long j) {
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                final t tVarH = ((m) CollectionsKt.Z(measurables)).h(j);
                int i11 = tVarH.f9451d;
                int i12 = tVarH.f9452e;
                Function1<s, Unit> placementBlock = new Function1<s, Unit>() { // from class: app.rive.RiveKt$Rive$SingleChildLayout$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((s) obj);
                        return Unit.f14616a;
                    }

                    public final void invoke(@NotNull s layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        t tVar = tVarH;
                        layout.getClass();
                        s.a(tVar, 0, 0);
                    }
                };
                o0 alignmentLines = w0.d();
                Layout.getClass();
                Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
                Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
                p pVar = new p();
                pVar.f6605d = Layout;
                pVar.f6606e = placementBlock;
                pVar.f6602a = i11;
                pVar.f6603b = i12;
                pVar.f6604c = alignmentLines;
                return pVar;
            }

            @Override // g0.n
            public int minIntrinsicHeight(@NotNull g0.g gVar, @NotNull List measurables, int i11) {
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                ArrayList arrayList = new ArrayList(measurables.size());
                int size = measurables.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList.add(new g0.d((m) measurables.get(i12), g0.h.f9441d, i.f9445e));
                }
                return ((p) mo42measure3p2s80s(new j(gVar, gVar.getLayoutDirection()), arrayList, e4.f.c(i11, 0, 13))).f6603b;
            }

            @Override // g0.n
            public int minIntrinsicWidth(@NotNull g0.g gVar, @NotNull List measurables, int i11) {
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                ArrayList arrayList = new ArrayList(measurables.size());
                int size = measurables.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList.add(new g0.d((m) measurables.get(i12), g0.h.f9441d, i.f9444d));
                }
                return ((p) mo42measure3p2s80s(new j(gVar, gVar.getLayoutDirection()), arrayList, e4.f.c(0, i11, 7))).f6602a;
            }
        };
        cVar.i();
        cVar.l();
        cVar.h();
        i0.i.f11309a.getClass();
        i0.h hVar = i0.h.f11307a;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        new g0.l(3);
        cVar.e();
        throw new IllegalStateException("Invalid applier");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Rive$lambda$1(l lVar) {
        return ((Boolean) lVar.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Rive$lambda$10(k kVar) {
        u.t tVar = (u.t) kVar;
        tVar.getClass();
        ((u.s) y.f.f(null, tVar)).getClass();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rive$lambda$11(k kVar, int i7) {
        ((u.t) kVar).i(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Function0<Bitmap>, Unit> Rive$lambda$13(x xVar) {
        return (Function1) xVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Rive$lambda$15(l lVar) {
        return ((Boolean) lVar.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rive$lambda$16(l lVar, boolean z5) {
        lVar.setValue(Boolean.valueOf(z5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rive$lambda$2(l lVar, boolean z5) {
        lVar.setValue(Boolean.valueOf(z5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RiveSurface Rive$lambda$4(l lVar) {
        return (RiveSurface) lVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Rive$lambda$7(k kVar) {
        u.t tVar = (u.t) kVar;
        tVar.getClass();
        ((u.s) y.f.f(null, tVar)).getClass();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rive$lambda$8(k kVar, int i7) {
        ((u.t) kVar).i(i7);
    }
}
