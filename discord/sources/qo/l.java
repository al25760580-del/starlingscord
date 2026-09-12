package qo;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Field field, boolean z5, int i7) {
        super(field, z5);
        this.f18960e = i7;
    }

    @Override // qo.w
    public void d(Object[] args) {
        switch (this.f18960e) {
            case 1:
                Intrinsics.checkNotNullParameter(args, "args");
                zs.a.l(this, args);
                e(kotlin.collections.y.t(args));
                break;
            default:
                super.d(args);
                break;
        }
    }
}
