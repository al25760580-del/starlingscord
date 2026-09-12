package qo;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f18961g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Field field, boolean z5, Object obj) {
        super(field, z5, false);
        Intrinsics.checkNotNullParameter(field, "field");
        this.f18961g = obj;
    }

    @Override // qo.q, qo.g
    public final Object call(Object[] args) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        d(args);
        ((Field) this.f18970a).set(this.f18961g, kotlin.collections.y.s(args));
        return Unit.f14616a;
    }
}
