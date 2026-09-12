package com.discord.misc.utilities.time;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"intervalFlow", "Lkotlinx/coroutines/flow/Flow;", "", "period", "Lkotlin/time/Duration;", "initialDelay", "intervalFlow-QTBD994", "(JJ)Lkotlinx/coroutines/flow/Flow;", "periodMs", "", "initialDelayMs", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IntervalFlowKt {

    /* JADX INFO: renamed from: com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$1", f = "IntervalFlow.kt", l = {14, 16, 17}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ long $initialDelay;
        final /* synthetic */ long $period;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j5, Continuation continuation) {
            super(2, continuation);
            this.$initialDelay = j;
            this.$period = j5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$initialDelay, this.$period, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x003d A[PHI: r1
          0x003d: PHI (r1v3 kotlinx.coroutines.flow.FlowCollector) = 
          (r1v2 kotlinx.coroutines.flow.FlowCollector)
          (r1v4 kotlinx.coroutines.flow.FlowCollector)
          (r1v6 kotlinx.coroutines.flow.FlowCollector)
         binds: [B:13:0x003a, B:19:0x0054, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x004a A[PHI: r1
          0x004a: PHI (r1v4 kotlinx.coroutines.flow.FlowCollector) = (r1v3 kotlinx.coroutines.flow.FlowCollector), (r1v8 kotlinx.coroutines.flow.FlowCollector) binds: [B:16:0x0047, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:15:0x003d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // xn.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                wn.a r0 = wn.a.f22354d
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                goto L20
            L10:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L18:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                ib.a.L(r8)
                goto L4a
            L20:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                ib.a.L(r8)
                goto L3d
            L28:
                ib.a.L(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                long r5 = r7.$initialDelay
                r7.L$0 = r1
                r7.label = r4
                java.lang.Object r8 = ar.b0.k(r5, r7)
                if (r8 != r0) goto L3d
                goto L56
            L3d:
                kotlin.Unit r8 = kotlin.Unit.f14616a
                r7.L$0 = r1
                r7.label = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L4a
                goto L56
            L4a:
                long r4 = r7.$period
                r7.L$0 = r1
                r7.label = r2
                java.lang.Object r8 = ar.b0.k(r4, r7)
                if (r8 != r0) goto L3d
            L56:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.time.IntervalFlowKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$2", f = "IntervalFlow.kt", l = {26, 28, 29}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends h implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ long $initialDelayMs;
        final /* synthetic */ long $periodMs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, long j5, Continuation continuation) {
            super(2, continuation);
            this.$initialDelayMs = j;
            this.$periodMs = j5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$initialDelayMs, this.$periodMs, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x003d A[PHI: r1
          0x003d: PHI (r1v3 kotlinx.coroutines.flow.FlowCollector) = 
          (r1v2 kotlinx.coroutines.flow.FlowCollector)
          (r1v4 kotlinx.coroutines.flow.FlowCollector)
          (r1v6 kotlinx.coroutines.flow.FlowCollector)
         binds: [B:13:0x003a, B:19:0x0054, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x004a A[PHI: r1
          0x004a: PHI (r1v4 kotlinx.coroutines.flow.FlowCollector) = (r1v3 kotlinx.coroutines.flow.FlowCollector), (r1v8 kotlinx.coroutines.flow.FlowCollector) binds: [B:16:0x0047, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:15:0x003d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // xn.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                wn.a r0 = wn.a.f22354d
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                goto L20
            L10:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L18:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                ib.a.L(r8)
                goto L4a
            L20:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                ib.a.L(r8)
                goto L3d
            L28:
                ib.a.L(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                long r5 = r7.$initialDelayMs
                r7.L$0 = r1
                r7.label = r4
                java.lang.Object r8 = ar.b0.j(r5, r7)
                if (r8 != r0) goto L3d
                goto L56
            L3d:
                kotlin.Unit r8 = kotlin.Unit.f14616a
                r7.L$0 = r1
                r7.label = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L4a
                goto L56
            L4a:
                long r4 = r7.$periodMs
                r7.L$0 = r1
                r7.label = r2
                java.lang.Object r8 = ar.b0.j(r4, r7)
                if (r8 != r0) goto L3d
            L56:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.time.IntervalFlowKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    @NotNull
    public static final Flow intervalFlow(long j, long j5) {
        return new a4.h(new AnonymousClass2(j5, j, null));
    }

    public static /* synthetic */ Flow intervalFlow$default(long j, long j5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j5 = j;
        }
        return intervalFlow(j, j5);
    }

    @NotNull
    /* JADX INFO: renamed from: intervalFlow-QTBD994, reason: not valid java name */
    public static final Flow m1024intervalFlowQTBD994(long j, long j5) {
        return new a4.h(new AnonymousClass1(j5, j, null));
    }

    /* JADX INFO: renamed from: intervalFlow-QTBD994$default, reason: not valid java name */
    public static /* synthetic */ Flow m1025intervalFlowQTBD994$default(long j, long j5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j5 = j;
        }
        return m1024intervalFlowQTBD994(j, j5);
    }
}
