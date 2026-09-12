package qo;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends z implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Method unboxMethod, Object obj) {
        super(unboxMethod, n0.f14659d);
        Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
        this.f18974d = obj;
    }

    @Override // qo.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        zs.a.l(this, args);
        Intrinsics.checkNotNullParameter(args, "args");
        return this.f18975a.invoke(this.f18974d, Arrays.copyOf(args, args.length));
    }
}
