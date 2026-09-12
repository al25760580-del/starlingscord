package qh;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d, IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f18897f;

    public b(IBinder iBinder) {
        this.f18897f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18897f;
    }
}
