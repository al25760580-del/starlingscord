package yp;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lq.t0;
import lq.z;
import yo.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f23505e;

    public /* synthetic */ d(int i7, Object obj) {
        this.f23504d = i7;
        this.f23505e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23504d) {
            case 0:
                z zVarB = ((t0) this.f23505e).b();
                Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
                return zVarB;
            default:
                return (List) ((p0) this.f23505e).J.getValue();
        }
    }
}
