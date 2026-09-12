package qo;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18969g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i7, Method method) {
        super(method, false, 6);
        this.f18969g = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(method, "method");
                super(method, true, 4);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(method, "method");
                super(method, false, 6);
                break;
            default:
                Intrinsics.checkNotNullParameter(method, "method");
                break;
        }
    }

    @Override // qo.q, qo.g
    public final Object call(Object[] args) {
        switch (this.f18969g) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                zs.a.l(this, args);
                return f(args[0], args.length <= 1 ? new Object[0] : kotlin.collections.w.j(args, 1, args.length));
            case 1:
                Intrinsics.checkNotNullParameter(args, "args");
                zs.a.l(this, args);
                e(kotlin.collections.y.t(args));
                return f(null, args.length <= 1 ? new Object[0] : kotlin.collections.w.j(args, 1, args.length));
            default:
                Intrinsics.checkNotNullParameter(args, "args");
                zs.a.l(this, args);
                return f(null, args);
        }
    }
}
