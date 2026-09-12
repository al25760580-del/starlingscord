package com.discord.simpleast.code;

import com.discord.simpleast.core.node.StyleNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [RC] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"RC", "p1", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Iterable;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
public final /* synthetic */ class Xml$TagNode$render$typeStylesProvider$1<RC> extends FunctionReferenceImpl implements Function1<RC, Iterable<?>> {
    public Xml$TagNode$render$typeStylesProvider$1(StyleNode.SpanProvider spanProvider) {
        super(1, spanProvider, StyleNode.SpanProvider.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Iterable;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Iterable<?> invoke(RC rc2) {
        return ((StyleNode.SpanProvider) this.receiver).get(rc2);
    }
}
