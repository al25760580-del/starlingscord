package com.discord.misc.utilities.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import xn.c;
import xn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@d(c = "com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt$collectWithLeadingDebounce$2", f = "CollectWithLeadingDebounce.kt", l = {33, 35}, m = "emit")
public final class CollectWithLeadingDebounceKt$collectWithLeadingDebounce$2$emit$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CollectWithLeadingDebounceKt.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CollectWithLeadingDebounceKt$collectWithLeadingDebounce$2$emit$1(CollectWithLeadingDebounceKt.AnonymousClass2<? super T> anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
