package com.google.android.gms.fido.fido2.api.common;

import a3.e;
import af.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import bf.a;
import java.util.Arrays;
import ls.d;
import qf.i0;
import qf.m0;
import qf.n0;
import qf.o0;
import qf.p0;
import qf.q0;
import qf.r;
import qf.r0;
import qf.s;
import qf.s0;
import qf.t;
import qf.x0;
import qf.y0;
import qf.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationExtensions extends a {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new s0(9);
    public final o0 E;
    public final s F;
    public final q0 G;
    public final r0 H;
    public final p0 I;
    public final t J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f5942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f5943e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0 f5944i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z0 f5945v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m0 f5946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n0 f5947x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0 f5948y;

    public AuthenticationExtensions(r rVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, s sVar, q0 q0Var, r0 r0Var, p0 p0Var, t tVar) {
        this.f5942d = rVar;
        this.f5944i = i0Var;
        this.f5943e = x0Var;
        this.f5945v = z0Var;
        this.f5946w = m0Var;
        this.f5947x = n0Var;
        this.f5948y = y0Var;
        this.E = o0Var;
        this.F = sVar;
        this.G = q0Var;
        this.H = r0Var;
        this.I = p0Var;
        this.J = tVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return w.j(this.f5942d, authenticationExtensions.f5942d) && w.j(this.f5943e, authenticationExtensions.f5943e) && w.j(this.f5944i, authenticationExtensions.f5944i) && w.j(this.f5945v, authenticationExtensions.f5945v) && w.j(this.f5946w, authenticationExtensions.f5946w) && w.j(this.f5947x, authenticationExtensions.f5947x) && w.j(this.f5948y, authenticationExtensions.f5948y) && w.j(this.E, authenticationExtensions.E) && w.j(this.F, authenticationExtensions.F) && w.j(this.G, authenticationExtensions.G) && w.j(this.H, authenticationExtensions.H) && w.j(this.I, authenticationExtensions.I) && w.j(this.J, authenticationExtensions.J);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5942d, this.f5943e, this.f5944i, this.f5945v, this.f5946w, this.f5947x, this.f5948y, this.E, this.F, this.G, this.H, this.I, this.J});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f5942d);
        String strValueOf2 = String.valueOf(this.f5943e);
        String strValueOf3 = String.valueOf(this.f5944i);
        String strValueOf4 = String.valueOf(this.f5945v);
        String strValueOf5 = String.valueOf(this.f5946w);
        String strValueOf6 = String.valueOf(this.f5947x);
        String strValueOf7 = String.valueOf(this.f5948y);
        String strValueOf8 = String.valueOf(this.E);
        String strValueOf9 = String.valueOf(this.F);
        String strValueOf10 = String.valueOf(this.G);
        String strValueOf11 = String.valueOf(this.H);
        String strValueOf12 = String.valueOf(this.J);
        StringBuilder sbU = e.u("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        e.A(sbU, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        e.A(sbU, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        e.A(sbU, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        e.A(sbU, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return com.discord.chat.presentation.list.a.l(sbU, strValueOf11, ", \n paymentExtension=", strValueOf12, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = d.T(20293, parcel);
        d.N(parcel, 2, this.f5942d, i7);
        d.N(parcel, 3, this.f5943e, i7);
        d.N(parcel, 4, this.f5944i, i7);
        d.N(parcel, 5, this.f5945v, i7);
        d.N(parcel, 6, this.f5946w, i7);
        d.N(parcel, 7, this.f5947x, i7);
        d.N(parcel, 8, this.f5948y, i7);
        d.N(parcel, 9, this.E, i7);
        d.N(parcel, 10, this.F, i7);
        d.N(parcel, 11, this.G, i7);
        d.N(parcel, 12, this.H, i7);
        d.N(parcel, 13, this.I, i7);
        d.N(parcel, 14, this.J, i7);
        d.U(iT, parcel);
    }
}
