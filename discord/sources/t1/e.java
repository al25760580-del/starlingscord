package t1;

import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.h;
import n1.w;
import o1.l;
import rf.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20577d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Executor f20578e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f20579i;

    public /* synthetic */ e(Executor executor, h hVar) {
        this.f20578e = executor;
        this.f20579i = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20577d) {
            case 0:
                l e10 = (l) obj;
                Intrinsics.checkNotNullParameter(e10, "e");
                this.f20578e.execute(new g(this.f20579i, e10, 0));
                break;
            default:
                s response = (s) obj;
                Executor executor = this.f20578e;
                h hVar = this.f20579i;
                if (response != null) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    executor.execute(new xm.b(2, hVar, new w()));
                } else {
                    executor.execute(new s1.c(hVar, 12));
                }
                break;
        }
        return Unit.f14616a;
    }

    public /* synthetic */ e(Executor executor, z1.a aVar, h hVar) {
        this.f20578e = executor;
        this.f20579i = hVar;
    }
}
