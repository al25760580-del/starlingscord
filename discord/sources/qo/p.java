package qo;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18962g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Field field, boolean z5, boolean z6, int i7) {
        super(field, z5, z6);
        this.f18962g = i7;
    }

    @Override // qo.q, qo.w
    public void d(Object[] args) {
        switch (this.f18962g) {
            case 1:
                Intrinsics.checkNotNullParameter(args, "args");
                super.d(args);
                e(kotlin.collections.y.t(args));
                break;
            default:
                super.d(args);
                break;
        }
    }
}
