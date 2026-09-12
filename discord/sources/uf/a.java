package uf;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import ls.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends bg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ig.g f21120g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ig.g gVar) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 6);
        this.f21120g = gVar;
    }

    @Override // bg.a
    public final boolean w(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) wf.a.a(parcel, Status.CREATOR);
        wf.a.b(parcel);
        l.z(status, null, this.f21120g);
        return true;
    }
}
