package bg;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.e;
import kotlin.jvm.internal.Intrinsics;
import ls.l;
import rf.m;
import rf.s;
import sf.f;
import zh.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends Binder implements IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3228f;

    public /* synthetic */ a(int i7) {
        this.f3228f = i7;
    }

    public static void u(Parcel parcel) {
        int i7 = b.f3229a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(iDataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    public static void v(Parcel parcel) {
        int i7 = e.f5997a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(kk.b.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i7 = this.f3228f;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        boolean zOnTransact;
        boolean zOnTransact2 = false;
        Object[] objArr = 0;
        switch (this.f3228f) {
            case 0:
                if (i7 > 16777215) {
                    zOnTransact = super.onTransact(i7, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (!zOnTransact) {
                    f fVar = (f) this;
                    switch (i7) {
                        case 1:
                            Status status = (Status) b.a(parcel, Status.CREATOR);
                            m mVar = (m) b.a(parcel, m.CREATOR);
                            u(parcel);
                            fVar.h(status, mVar);
                            break;
                        case 2:
                            Status status2 = (Status) b.a(parcel, Status.CREATOR);
                            u(parcel);
                            Intrinsics.checkNotNullParameter(status2, "status");
                            throw new UnsupportedOperationException();
                        case 3:
                            Status status3 = (Status) b.a(parcel, Status.CREATOR);
                            u(parcel);
                            Intrinsics.checkNotNullParameter(status3, "status");
                            throw new UnsupportedOperationException();
                        case 4:
                            Status status4 = (Status) b.a(parcel, Status.CREATOR);
                            u(parcel);
                            Intrinsics.checkNotNullParameter(status4, "status");
                            throw new UnsupportedOperationException();
                        case 5:
                            Status status5 = (Status) b.a(parcel, Status.CREATOR);
                            u(parcel);
                            Intrinsics.checkNotNullParameter(status5, "status");
                            throw new UnsupportedOperationException();
                        case 6:
                            Status status6 = (Status) b.a(parcel, Status.CREATOR);
                            u(parcel);
                            Intrinsics.checkNotNullParameter(status6, "status");
                            throw new UnsupportedOperationException();
                        case 7:
                            Status status7 = (Status) b.a(parcel, Status.CREATOR);
                            rf.f fVar2 = (rf.f) b.a(parcel, rf.f.CREATOR);
                            u(parcel);
                            fVar.q(status7, fVar2);
                            break;
                        case 8:
                            Status status8 = (Status) b.a(parcel, Status.CREATOR);
                            u(parcel);
                            Intrinsics.checkNotNullParameter(status8, "status");
                            throw new UnsupportedOperationException();
                        case 9:
                            Status status9 = (Status) b.a(parcel, Status.CREATOR);
                            rf.c cVar = (rf.c) b.a(parcel, rf.c.CREATOR);
                            u(parcel);
                            fVar.e(status9, cVar);
                            break;
                        case 10:
                            Status status10 = (Status) b.a(parcel, Status.CREATOR);
                            s sVar = (s) b.a(parcel, s.CREATOR);
                            u(parcel);
                            fVar.n(status10, sVar);
                            break;
                        case 11:
                            Status status11 = (Status) b.a(parcel, Status.CREATOR);
                            u(parcel);
                            Intrinsics.checkNotNullParameter(status11, "status");
                            throw new UnsupportedOperationException();
                        case 12:
                            Status status12 = (Status) b.a(parcel, Status.CREATOR);
                            u(parcel);
                            Intrinsics.checkNotNullParameter(status12, "status");
                            throw new UnsupportedOperationException();
                        case 13:
                            Status status13 = (Status) b.a(parcel, Status.CREATOR);
                            u(parcel);
                            Intrinsics.checkNotNullParameter(status13, "status");
                            throw new UnsupportedOperationException();
                        case 14:
                            Status status14 = (Status) b.a(parcel, Status.CREATOR);
                            u(parcel);
                            Intrinsics.checkNotNullParameter(status14, "status");
                            throw new UnsupportedOperationException();
                        case 15:
                            Status status15 = (Status) b.a(parcel, Status.CREATOR);
                            u(parcel);
                            Intrinsics.checkNotNullParameter(status15, "status");
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
            case 1:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return s(i7, parcel);
            case 2:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return r(i7, parcel);
            case 3:
                if (i7 > 16777215) {
                    zOnTransact2 = super.onTransact(i7, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact2) {
                    return true;
                }
                return t(i7, parcel, parcel2);
            case 4:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return r(i7, parcel);
            case 5:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return x(i7, parcel, parcel2);
            case 6:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return w(i7, parcel, parcel2);
            case 7:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i10)) {
                    return true;
                }
                return y(i7, parcel, parcel2);
            case 8:
                if (i7 > 16777215) {
                    if (!super.onTransact(i7, parcel, parcel2, i10)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                kf.f fVar3 = (kf.f) this;
                if (i7 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i11 = zf.a.f23985a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                jf.a aVarCreateFromParcel = parcel.readInt() == 0 ? null : jf.a.CREATOR.createFromParcel(parcel);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(kk.b.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                l.z(statusCreateFromParcel, aVarCreateFromParcel != null ? Integer.valueOf(aVarCreateFromParcel.f13868d) : null, fVar3.f14428g);
                return true;
            default:
                if (i7 > 16777215) {
                    if (!super.onTransact(i7, parcel, parcel2, i10)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                yh.e eVar = (yh.e) this;
                if (i7 != 2) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                int i12 = zh.a.f23988a;
                Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(kk.b.h(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                g gVar = eVar.f23346i.f23348a;
                if (gVar != null) {
                    ig.g gVar2 = eVar.f23345h;
                    synchronized (gVar.f24000f) {
                        gVar.f23999e.remove(gVar2);
                        break;
                    }
                    synchronized (gVar.f24000f) {
                        try {
                            if (gVar.k.get() <= 0 || gVar.k.decrementAndGet() <= 0) {
                                gVar.a().post(new zh.f(objArr == true ? 1 : 0, gVar));
                            } else {
                                gVar.f23996b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    break;
                }
                eVar.f23344g.a("onGetLaunchReviewFlowInfo", new Object[0]);
                eVar.f23345h.d(new yh.c((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
                return true;
        }
    }

    public abstract boolean r(int i7, Parcel parcel);

    public abstract boolean s(int i7, Parcel parcel);

    public abstract boolean t(int i7, Parcel parcel, Parcel parcel2);

    public abstract boolean w(int i7, Parcel parcel, Parcel parcel2);

    public abstract boolean x(int i7, Parcel parcel, Parcel parcel2);

    public boolean y(int i7, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public a(String str, int i7) {
        this.f3228f = i7;
        switch (i7) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            case 6:
                attachInterface(this, str);
                break;
            case 7:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
