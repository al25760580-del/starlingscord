package sf;

import com.google.android.gms.common.api.Status;
import kotlin.jvm.internal.Intrinsics;
import ls.l;
import rf.m;
import rf.s;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends bg.a implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ig.g f19943h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ig.g gVar, int i7) {
        super(0);
        this.f19942g = i7;
        this.f19943h = gVar;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override // sf.a
    public void e(Status status, rf.c cVar) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // sf.a
    public void h(Status status, m mVar) {
        switch (this.f19942g) {
            case 1:
                Intrinsics.checkNotNullParameter(status, "status");
                l.z(status, mVar, this.f19943h);
                return;
            default:
                Intrinsics.checkNotNullParameter(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // sf.a
    public void n(Status status, s sVar) {
        switch (this.f19942g) {
            case 2:
                Intrinsics.checkNotNullParameter(status, "status");
                l.z(status, sVar, this.f19943h);
                return;
            default:
                Intrinsics.checkNotNullParameter(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // sf.a
    public void q(Status status, rf.f fVar) {
        switch (this.f19942g) {
            case 0:
                Intrinsics.checkNotNullParameter(status, "status");
                l.z(status, fVar, this.f19943h);
                return;
            default:
                Intrinsics.checkNotNullParameter(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
