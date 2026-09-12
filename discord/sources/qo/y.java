package qo;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends z {
    @Override // qo.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        zs.a.l(this, args);
        Object obj = args[0];
        Object[] args2 = args.length <= 1 ? new Object[0] : kotlin.collections.w.j(args, 1, args.length);
        Intrinsics.checkNotNullParameter(args2, "args");
        return this.f18975a.invoke(obj, Arrays.copyOf(args2, args2.length));
    }
}
