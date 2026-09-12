package com.discord.misc.utilities.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import rn.h;
import wn.a;
import xn.c;
import xn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"collectWithLeadingDebounce", "", "T", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "timeoutMillis", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/MutableSharedFlow;JLkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CollectWithLeadingDebounceKt {

    /* JADX INFO: renamed from: com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt$collectWithLeadingDebounce$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt", f = "CollectWithLeadingDebounce.kt", l = {27}, m = "collectWithLeadingDebounce")
    public static final class AnonymousClass1<T> extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CollectWithLeadingDebounceKt.collectWithLeadingDebounce(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt$collectWithLeadingDebounce$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $collector;
        final /* synthetic */ MutableSharedFlow $this_collectWithLeadingDebounce;
        final /* synthetic */ Ref.LongRef $timeLastEmitted;
        final /* synthetic */ long $timeoutMillis;

        public AnonymousClass2(Ref.LongRef longRef, long j, FlowCollector flowCollector, MutableSharedFlow mutableSharedFlow) {
            this.$timeLastEmitted = longRef;
            this.$timeoutMillis = j;
            this.$collector = flowCollector;
            this.$this_collectWithLeadingDebounce = mutableSharedFlow;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r13.emit(r12, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        
            if (ar.b0.j(r9 - r7, r0) == r1) goto L25;
         */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r12, kotlin.coroutines.Continuation r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt$collectWithLeadingDebounce$2$emit$1
                if (r0 == 0) goto L13
                r0 = r13
                com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt$collectWithLeadingDebounce$2$emit$1 r0 = (com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt$collectWithLeadingDebounce$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt$collectWithLeadingDebounce$2$emit$1 r0 = new com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt$collectWithLeadingDebounce$2$emit$1
                r0.<init>(r11, r13)
            L18:
                java.lang.Object r13 = r0.result
                wn.a r1 = wn.a.f22354d
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                java.lang.Object r12 = r0.L$0
                ib.a.L(r13)
                goto L67
            L2c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L34:
                ib.a.L(r13)
                goto L58
            L38:
                ib.a.L(r13)
                long r5 = java.lang.System.currentTimeMillis()
                kotlin.jvm.internal.Ref$LongRef r13 = r11.$timeLastEmitted
                long r7 = r13.element
                long r7 = r5 - r7
                long r9 = r11.$timeoutMillis
                int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r2 <= 0) goto L5b
                r13.element = r5
                kotlinx.coroutines.flow.FlowCollector r13 = r11.$collector
                r0.label = r4
                java.lang.Object r12 = r13.emit(r12, r0)
                if (r12 != r1) goto L58
                goto L66
            L58:
                kotlin.Unit r12 = kotlin.Unit.f14616a
                return r12
            L5b:
                long r9 = r9 - r7
                r0.L$0 = r12
                r0.label = r3
                java.lang.Object r13 = ar.b0.j(r9, r0)
                if (r13 != r1) goto L67
            L66:
                return r1
            L67:
                kotlinx.coroutines.flow.MutableSharedFlow r13 = r11.$this_collectWithLeadingDebounce
                r13.d(r12)
                kotlin.Unit r12 = kotlin.Unit.f14616a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object collectWithLeadingDebounce(@NotNull MutableSharedFlow mutableSharedFlow, long j, @NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
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
        Object obj = anonymousClass1.result;
        Object obj2 = a.f22354d;
        int i10 = anonymousClass1.label;
        if (i10 == 0) {
            ib.a.L(obj);
            FlowCollector anonymousClass2 = new AnonymousClass2(new Ref.LongRef(), j, flowCollector, mutableSharedFlow);
            anonymousClass1.label = 1;
            if (mutableSharedFlow.collect(anonymousClass2, anonymousClass1) == obj2) {
                return obj2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        throw new h();
    }
}
