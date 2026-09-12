package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoteMessage extends bf.a {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new af.m(23);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f6540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s.e f6541e;

    public RemoteMessage(Bundle bundle) {
        this.f6540d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.K(parcel, 2, this.f6540d);
        ls.d.U(iT, parcel);
    }
}
