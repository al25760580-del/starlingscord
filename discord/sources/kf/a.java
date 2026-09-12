package kf;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c, IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f14425f;

    public a(IBinder iBinder) {
        this.f14425f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14425f;
    }
}
