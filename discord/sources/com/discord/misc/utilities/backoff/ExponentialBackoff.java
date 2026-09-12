package com.discord.misc.utilities.backoff;

import ar.b0;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import xn.c;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0010J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002JV\u0010\u0019\u001a\u0002H\u001a\"\u0004\b\u0000\u0010\u001a2\u001c\u0010\u001b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\"\u0010\u001c\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH\u0086@¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/discord/misc/utilities/backoff/ExponentialBackoff;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "initialDelay", "", "maxDelay", "maxAttempts", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;JJI)V", "currentDelay", "currentAttempt", "job", "Lkotlinx/coroutines/Job;", "fail", "", "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;)V", "succeed", "cancel", "reset", "cancelCurrentJob", "performBackoff", "T", "networkRequest", "shouldRetry", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "misc_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExponentialBackoff {
    private int currentAttempt;
    private long currentDelay;
    private final long initialDelay;
    private Job job;
    private final int maxAttempts;
    private final long maxDelay;

    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: com.discord.misc.utilities.backoff.ExponentialBackoff$fail$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.misc.utilities.backoff.ExponentialBackoff$fail$1", f = "ExponentialBackoff.kt", l = {40, 41}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function1<Continuation, Object> $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
            super(2, continuation);
            this.$action = function1;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return ExponentialBackoff.this.new AnonymousClass1(this.$action, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r7.invoke(r6) == r0) goto L15;
         */
        @Override // xn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                wn.a r0 = wn.a.f22354d
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                ib.a.L(r7)
                goto L39
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                ib.a.L(r7)
                goto L2e
            L1c:
                ib.a.L(r7)
                com.discord.misc.utilities.backoff.ExponentialBackoff r7 = com.discord.misc.utilities.backoff.ExponentialBackoff.this
                long r4 = com.discord.misc.utilities.backoff.ExponentialBackoff.access$getCurrentDelay$p(r7)
                r6.label = r3
                java.lang.Object r7 = ar.b0.j(r4, r6)
                if (r7 != r0) goto L2e
                goto L38
            L2e:
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation, java.lang.Object> r7 = r6.$action
                r6.label = r2
                java.lang.Object r7 = r7.invoke(r6)
                if (r7 != r0) goto L39
            L38:
                return r0
            L39:
                kotlin.Unit r7 = kotlin.Unit.f14616a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.backoff.ExponentialBackoff.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.misc.utilities.backoff.ExponentialBackoff$performBackoff$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.misc.utilities.backoff.ExponentialBackoff", f = "ExponentialBackoff.kt", l = {65, 67, 78, 79}, m = "performBackoff")
    public static final class C02011<T> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C02011(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExponentialBackoff.this.performBackoff(null, null, this);
        }
    }

    public ExponentialBackoff(@NotNull CoroutineScope scope, long j, long j5, int i7) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.initialDelay = j;
        this.maxDelay = j5;
        this.maxAttempts = i7;
        this.currentAttempt = 1;
    }

    private final void cancelCurrentJob() {
        Job job = this.job;
        if (job != null) {
            job.f(null);
        }
    }

    private final void reset() {
        cancelCurrentJob();
        this.currentDelay = 0L;
        this.currentAttempt = 1;
    }

    public final void cancel() {
        reset();
    }

    public final void fail(@NotNull Function1<? super Continuation, ? extends Object> action) {
        long j;
        Intrinsics.checkNotNullParameter(action, "action");
        cancelCurrentJob();
        int i7 = this.currentAttempt;
        if (i7 > this.maxAttempts) {
            throw new MaxAttemptsExceededException(null, 1, null);
        }
        long j5 = this.currentDelay;
        if (j5 == 0) {
            j = this.initialDelay;
            if (j < 1) {
                j = 1;
            }
        } else {
            j = j5 * ((long) 2);
        }
        long j7 = this.maxDelay;
        if (j > j7) {
            j = j7;
        }
        this.currentDelay = j;
        this.currentAttempt = i7 + 1;
        this.job = b0.t(this.scope, null, new AnonymousClass1(action, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b A[PHI: r2 r13 r14 r15
      0x008b: PHI (r2v2 kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation, ? extends java.lang.Object>) = 
      (r2v3 kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation, ? extends java.lang.Object>)
      (r2v6 kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation, ? extends java.lang.Object>)
     binds: [B:26:0x0088, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r13v3 java.lang.Object) = (r13v9 java.lang.Object), (r13v14 java.lang.Object) binds: [B:26:0x0088, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r14v3 kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object>) = 
      (r14v5 kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object>)
      (r14v11 kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object>)
     binds: [B:26:0x0088, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r15v5 java.lang.Object) = (r15v12 java.lang.Object), (r15v1 java.lang.Object) binds: [B:26:0x0088, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r15 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (r15 == r1) goto L45;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00cf -> B:15:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object performBackoff(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.backoff.ExponentialBackoff.performBackoff(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void succeed() {
        reset();
    }

    public /* synthetic */ ExponentialBackoff(CoroutineScope coroutineScope, long j, long j5, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i10 & 2) != 0 ? 1000L : j, (i10 & 4) != 0 ? LogThrottleSingleton.RATE_LIMIT_FIVE_MINUTES : j5, (i10 & 8) != 0 ? 10 : i7);
    }
}
