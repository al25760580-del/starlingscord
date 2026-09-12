package com.google.android.gms.fido.fido2.api.common;

import a3.e;
import af.w;
import ag.n1;
import ag.o1;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.discord.chat.presentation.list.a;
import ff.c;
import java.util.Arrays;
import java.util.List;
import jf.b;
import ls.d;
import qf.h0;
import qf.j0;
import qf.k;
import qf.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class PublicKeyCredentialRequestOptions extends k {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new b(25);
    public final AuthenticationExtensions E;
    public final Long F;
    public final ResultReceiver G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f5949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f5950e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5951i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f5952v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f5953w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h0 f5954x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j0 f5955y;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f5956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Double f5957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f5958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f5959d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AuthenticationExtensions f5960e;
    }

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d6, String str, List list, Integer num, h0 h0Var, String str2, AuthenticationExtensions authenticationExtensions, Long l6, String str3, ResultReceiver resultReceiver) {
        this.G = resultReceiver;
        if (str3 != null) {
            o1 o1Var = n1.f550b.f551a.f529d;
            o1.f561a.m();
            throw null;
        }
        w.g(bArr);
        this.f5949d = bArr;
        this.f5950e = d6;
        w.g(str);
        this.f5951i = str;
        this.f5952v = list;
        this.f5953w = num;
        this.f5954x = h0Var;
        this.F = l6;
        if (str2 != null) {
            try {
                this.f5955y = j0.a(str2);
            } catch (t0 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f5955y = null;
        }
        this.E = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        List list2 = publicKeyCredentialRequestOptions.f5952v;
        return Arrays.equals(this.f5949d, publicKeyCredentialRequestOptions.f5949d) && w.j(this.f5950e, publicKeyCredentialRequestOptions.f5950e) && w.j(this.f5951i, publicKeyCredentialRequestOptions.f5951i) && (((list = this.f5952v) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && w.j(this.f5953w, publicKeyCredentialRequestOptions.f5953w) && w.j(this.f5954x, publicKeyCredentialRequestOptions.f5954x) && w.j(this.f5955y, publicKeyCredentialRequestOptions.f5955y) && w.j(this.E, publicKeyCredentialRequestOptions.E) && w.j(this.F, publicKeyCredentialRequestOptions.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f5949d)), this.f5950e, this.f5951i, this.f5952v, this.f5953w, this.f5954x, this.f5955y, this.E, this.F});
    }

    public final String toString() {
        String strB = c.b(this.f5949d);
        String strValueOf = String.valueOf(this.f5952v);
        String strValueOf2 = String.valueOf(this.f5954x);
        String strValueOf3 = String.valueOf(this.f5955y);
        String strValueOf4 = String.valueOf(this.E);
        StringBuilder sbN = a.n("PublicKeyCredentialRequestOptions{\n challenge=", strB, ", \n timeoutSeconds=");
        sbN.append(this.f5950e);
        sbN.append(", \n rpId='");
        e.A(sbN, this.f5951i, "', \n allowList=", strValueOf, ", \n requestId=");
        kk.b.r(this.f5953w, ", \n tokenBinding=", strValueOf2, ", \n userVerification=", sbN);
        e.A(sbN, strValueOf3, ", \n authenticationExtensions=", strValueOf4, ", \n longRequestId=");
        sbN.append(this.F);
        sbN.append("}");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = d.T(20293, parcel);
        d.L(parcel, 2, this.f5949d);
        Double d6 = this.f5950e;
        if (d6 != null) {
            d.S(parcel, 3, 8);
            parcel.writeDouble(d6.doubleValue());
        }
        d.O(this.f5951i, parcel, 4);
        d.R(parcel, 5, this.f5952v);
        d.M(parcel, 6, this.f5953w);
        d.N(parcel, 7, this.f5954x, i7);
        j0 j0Var = this.f5955y;
        d.O(j0Var == null ? null : j0Var.f18830d, parcel, 8);
        d.N(parcel, 9, this.E, i7);
        Long l6 = this.F;
        if (l6 != null) {
            d.S(parcel, 10, 8);
            parcel.writeLong(l6.longValue());
        }
        d.N(parcel, 12, this.G, i7);
        d.U(iT, parcel);
    }
}
