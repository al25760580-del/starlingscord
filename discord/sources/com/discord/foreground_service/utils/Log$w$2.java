package com.discord.foreground_service.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class Log$w$2 extends FunctionReferenceImpl implements Function3 {
    public Log$w$2(Object obj) {
        super(3, obj, com.discord.logging.Log.class, "w", "w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((String) obj, (String) obj2, (Throwable) obj3);
        return Unit.f14616a;
    }

    public final void invoke(String p3, String p5, Throwable th2) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p5, "p1");
        ((com.discord.logging.Log) this.receiver).w(p3, p5, th2);
    }
}
