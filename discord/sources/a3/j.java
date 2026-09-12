package a3;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Binder implements IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f84f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f85g;

    public j(ig.g gVar) {
        this.f85g = gVar;
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i7 = this.f84f;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        d callback = null;
        int i11 = 0;
        switch (this.f84f) {
            case 0:
                if (i7 >= 1 && i7 <= 16777215) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                }
                if (i7 == 1598968902) {
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                if (i7 == 1) {
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                            callback = new d();
                            callback.f66f = strongBinder;
                        } else {
                            callback = (d) iInterfaceQueryLocalInterface;
                        }
                    }
                    String string = parcel.readString();
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    if (string != null) {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f85g;
                        synchronized (multiInstanceInvalidationService.f2733i) {
                            try {
                                int i12 = multiInstanceInvalidationService.f2731d + 1;
                                multiInstanceInvalidationService.f2731d = i12;
                                if (multiInstanceInvalidationService.f2733i.register(callback, Integer.valueOf(i12))) {
                                    multiInstanceInvalidationService.f2732e.put(Integer.valueOf(i12), string);
                                    i11 = i12;
                                } else {
                                    multiInstanceInvalidationService.f2731d--;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i11);
                    return true;
                }
                if (i7 == 2) {
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                            callback = new d();
                            callback.f66f = strongBinder2;
                        } else {
                            callback = (d) iInterfaceQueryLocalInterface2;
                        }
                    }
                    int i13 = parcel.readInt();
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = (MultiInstanceInvalidationService) this.f85g;
                    synchronized (multiInstanceInvalidationService2.f2733i) {
                        multiInstanceInvalidationService2.f2733i.unregister(callback);
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i7 != 3) {
                    return super.onTransact(i7, parcel, parcel2, i10);
                }
                int i14 = parcel.readInt();
                String[] tables = parcel.createStringArray();
                Intrinsics.checkNotNullParameter(tables, "tables");
                MultiInstanceInvalidationService multiInstanceInvalidationService3 = (MultiInstanceInvalidationService) this.f85g;
                synchronized (multiInstanceInvalidationService3.f2733i) {
                    try {
                        String str = (String) multiInstanceInvalidationService3.f2732e.get(Integer.valueOf(i14));
                        if (str == null) {
                            Log.w("ROOM", "Remote invalidation client ID not registered");
                            return true;
                        }
                        int iBeginBroadcast = multiInstanceInvalidationService3.f2733i.beginBroadcast();
                        while (i11 < iBeginBroadcast) {
                            try {
                                Object broadcastCookie = multiInstanceInvalidationService3.f2733i.getBroadcastCookie(i11);
                                Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                                Integer num = (Integer) broadcastCookie;
                                int iIntValue = num.intValue();
                                String str2 = (String) multiInstanceInvalidationService3.f2732e.get(num);
                                if (i14 != iIntValue && Intrinsics.areEqual(str, str2)) {
                                    try {
                                        ((d) multiInstanceInvalidationService3.f2733i.getBroadcastItem(i11)).j(tables);
                                    } catch (RemoteException e10) {
                                        Log.w("ROOM", "Error invoking a remote callback", e10);
                                    }
                                }
                                i11++;
                            } catch (Throwable th3) {
                                multiInstanceInvalidationService3.f2733i.finishBroadcast();
                                throw th3;
                            }
                        }
                        multiInstanceInvalidationService3.f2733i.finishBroadcast();
                        Unit unit = Unit.f14616a;
                        return true;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            default:
                if (i7 > 16777215) {
                    if (!super.onTransact(i7, parcel, parcel2, i10)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i7 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i15 = vf.c.f21664a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(kk.b.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                ls.l.z(statusCreateFromParcel, null, (ig.g) this.f85g);
                return true;
        }
    }

    public j(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f85g = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
