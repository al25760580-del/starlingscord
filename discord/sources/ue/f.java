package ue;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends bg.a implements j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f21113h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i7) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 5);
        this.f21112g = i7;
        this.f21113h = gVar;
    }

    @Override // ue.j
    public void f(Status status) {
        switch (this.f21112g) {
            case 1:
                this.f21113h.setResult(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ue.j
    public void g(Status status) {
        switch (this.f21112g) {
            case 0:
                this.f21113h.setResult(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // bg.a
    public final boolean x(int i7, Parcel parcel, Parcel parcel2) {
        switch (i7) {
            case 101:
                uf.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) uf.f.a(parcel, Status.CREATOR);
                uf.f.b(parcel);
                g(status);
                break;
            case 103:
                Status status2 = (Status) uf.f.a(parcel, Status.CREATOR);
                uf.f.b(parcel);
                f(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
