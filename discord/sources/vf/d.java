package vf;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f21665f;

    public d(IBinder iBinder) {
        this.f21665f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21665f;
    }
}
