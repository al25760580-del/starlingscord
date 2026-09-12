package bq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vo.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f3378e = new b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3379d;

    public /* synthetic */ b(int i7) {
        this.f3379d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3379d) {
            case 0:
                l it = (l) obj;
                int i7 = e.f3383a;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.g();
            default:
                vo.d dVar = (vo.d) obj;
                Intrinsics.checkNotNull(dVar);
                return e.l(dVar);
        }
    }
}
