package kotlin.reflect;

import kotlin.Function;

/* JADX INFO: loaded from: classes3.dex */
public interface KFunction extends KCallable, Function {
    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // kotlin.reflect.KCallable
    boolean isSuspend();
}
