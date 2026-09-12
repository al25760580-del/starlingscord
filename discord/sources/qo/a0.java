package qo;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f18928a = new a0();

    @Override // qo.g
    public final List a() {
        return n0.f14659d;
    }

    @Override // qo.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // qo.g
    public final boolean c() {
        return false;
    }

    @Override // qo.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // qo.g
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        return TYPE;
    }
}
