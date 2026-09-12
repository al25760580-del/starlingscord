package rf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends bf.a {

    @NotNull
    public static final Parcelable.Creator<i> CREATOR = new b(7);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f19403e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f19404i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f19405v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f19406w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f19407x;

    public i(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialRetrievalData, "credentialRetrievalData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(requestMatcher, "requestMatcher");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        this.f19402d = type;
        this.f19403e = credentialRetrievalData;
        this.f19404i = candidateQueryData;
        this.f19405v = requestMatcher;
        this.f19406w = requestType;
        this.f19407x = protocolType;
        boolean z5 = (StringsKt.K(requestType) || StringsKt.K(protocolType)) ? false : true;
        boolean z6 = !StringsKt.K(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (z5 || z6) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(protocolType).length() + String.valueOf(type).length() + 31 + String.valueOf(requestType).length() + 19 + 69);
        a3.e.A(sb2, "Either type: ", type, ", or requestType: ", requestType);
        throw new IllegalArgumentException(a3.e.o(sb2, " and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value."));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iT = ls.d.T(20293, dest);
        ls.d.O(this.f19402d, dest, 1);
        ls.d.K(dest, 2, this.f19403e);
        ls.d.K(dest, 3, this.f19404i);
        ls.d.O(this.f19405v, dest, 4);
        ls.d.O(this.f19406w, dest, 5);
        ls.d.O(this.f19407x, dest, 6);
        ls.d.U(iT, dest);
    }
}
