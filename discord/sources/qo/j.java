package qo;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends m implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f18959e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Field field, Object obj) {
        super(field, false);
        Intrinsics.checkNotNullParameter(field, "field");
        this.f18959e = obj;
    }

    @Override // qo.m, qo.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        zs.a.l(this, args);
        return ((Field) this.f18970a).get(this.f18959e);
    }
}
