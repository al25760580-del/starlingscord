package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f11294e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f11295i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f11296v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f11297w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11298d;

    static {
        int i7 = 1;
        f11294e = new d(i7, 0);
        f11295i = new d(i7, 1);
        f11296v = new d(i7, 2);
        f11297w = new d(i7, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, int i10) {
        super(i7);
        this.f11298d = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11298d) {
            case 0:
                c it = (c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!it.f23581h) {
                    return Unit.f14616a;
                }
                it.j.clear();
                k.c(it);
                throw null;
            case 1:
                b it2 = (b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                it2.d().getClass();
                return Unit.f14616a;
            case 2:
                f0 coordinator = (f0) obj;
                Intrinsics.checkNotNullParameter(coordinator, "coordinator");
                coordinator.getClass();
                return Unit.f14616a;
            default:
                f0 coordinator2 = (f0) obj;
                Intrinsics.checkNotNullParameter(coordinator2, "coordinator");
                coordinator2.getClass();
                return Unit.f14616a;
        }
    }
}
