package af;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements ye.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f473a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.a f474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f475c;

    public r(a.a aVar, ig.g gVar, kh.f fVar) {
        this.f474b = aVar;
        this.f475c = gVar;
    }

    @Override // ye.m
    public final void a(Status status) {
        switch (this.f473a) {
            case 0:
                ig.g gVar = (ig.g) this.f475c;
                if (status.f5936d > 0) {
                    gVar.a(status.f5938i != null ? new ph.a(status) : new ye.e(status));
                } else {
                    this.f474b.await(0L, TimeUnit.MILLISECONDS);
                    gVar.b(null);
                }
                break;
            default:
                ((Map) ((e4.c) this.f475c).f7966e).remove((BasePendingResult) this.f474b);
                break;
        }
    }

    public r(e4.c cVar, BasePendingResult basePendingResult) {
        this.f475c = cVar;
        this.f474b = basePendingResult;
    }
}
