package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import bf.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.d;
import org.jetbrains.annotations.NotNull;
import rf.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lbf/a;", "Lcom/google/android/gms/common/internal/ReflectedParcelable;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "toBundle", "()Landroid/os/Bundle;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetCredentialRequest extends a implements ReflectedParcelable {

    @NotNull
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new b(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f5961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f5962e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5963i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ResultReceiver f5964v;

    public GetCredentialRequest(ArrayList credentialOptions, Bundle data, String str, ResultReceiver resultReceiver) {
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        this.f5961d = credentialOptions;
        this.f5962e = data;
        this.f5963i = str;
        this.f5964v = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = d.T(20293, dest);
        d.R(dest, 1, this.f5961d);
        d.K(dest, 2, this.f5962e);
        d.O(this.f5963i, dest, 3);
        d.N(dest, 4, this.f5964v, i7);
        d.U(iT, dest);
    }
}
