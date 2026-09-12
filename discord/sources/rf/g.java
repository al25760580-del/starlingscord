package rf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends bf.a {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new b(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f19395e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f19396i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f19397v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f19398w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ResultReceiver f19399x;

    public g(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialData, "credentialData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        this.f19394d = type;
        this.f19395e = credentialData;
        this.f19396i = candidateQueryData;
        this.f19397v = str;
        this.f19398w = str2;
        this.f19399x = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = ls.d.T(20293, dest);
        ls.d.O(this.f19394d, dest, 1);
        ls.d.K(dest, 2, this.f19395e);
        ls.d.K(dest, 3, this.f19396i);
        ls.d.O(this.f19397v, dest, 4);
        ls.d.O(this.f19398w, dest, 5);
        ls.d.N(dest, 6, this.f19399x, i7);
        ls.d.U(iT, dest);
    }
}
