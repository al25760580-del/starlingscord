package a5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingResult;
import com.discord.billing.BillingManager;
import com.google.android.gms.internal.play_billing.e1;
import com.google.android.gms.internal.play_billing.i1;
import com.google.android.gms.internal.play_billing.z3;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class x extends bg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BillingManager.C01061.C00181.C00191 f274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g0 f275i;
    public final int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(BillingManager.C01061.C00181.C00191 c00191, e4.r rVar, int i7, int i10) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 3);
        this.f273g = i10;
        switch (i10) {
            case 1:
                super("com.android.vending.billing.IInAppBillingDelegateToBackendCallback", 3);
                this.f274h = c00191;
                this.f275i = rVar;
                this.j = i7;
                break;
            default:
                this.f274h = c00191;
                this.f275i = rVar;
                this.j = i7;
                break;
        }
    }

    @Override // bg.a
    public final boolean t(int i7, Parcel parcel, Parcel parcel2) {
        BillingResult billingResultE;
        switch (this.f273g) {
            case 0:
                if (i7 != 1) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) com.google.android.gms.internal.play_billing.e.a(parcel);
                bg.a.v(parcel);
                int i10 = this.j;
                z3 z3Var = z3.BROADCAST_ACTION_UNSPECIFIED;
                g0 g0Var = this.f275i;
                BillingManager.C01061.C00181.C00191 c00191 = this.f274h;
                if (bundle != null) {
                    int iA = com.google.android.gms.internal.play_billing.r.a("BillingClient", bundle);
                    String strF = com.google.android.gms.internal.play_billing.r.f("BillingClient", bundle);
                    g gVarA = BillingResult.a();
                    gVarA.f184d = iA;
                    gVarA.f186i = strF;
                    if (iA != 0) {
                        com.google.android.gms.internal.play_billing.r.h("BillingClient", l0.U(iA, "getBillingConfig() failed. Response code: "));
                        BillingResult billingResultE2 = gVarA.e();
                        ((e4.r) g0Var).R(f0.b(23, 13, billingResultE2, null, z3Var), i10);
                        c00191.onBillingConfigResponse(billingResultE2, null);
                    } else if (bundle.containsKey("BILLING_CONFIG")) {
                        try {
                            c00191.onBillingConfigResponse(gVarA.e(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
                        } catch (JSONException e10) {
                            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e10);
                            BillingResult billingResult = h0.f195f;
                            ((e4.r) g0Var).R(f0.b(65, 13, billingResult, null, z3Var), i10);
                            c00191.onBillingConfigResponse(billingResult, null);
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.r.h("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                        gVarA.f184d = 6;
                        BillingResult billingResultE3 = gVarA.e();
                        ((e4.r) g0Var).R(f0.b(64, 13, billingResultE3, null, z3Var), i10);
                        c00191.onBillingConfigResponse(billingResultE3, null);
                    }
                    break;
                } else {
                    BillingResult billingResult2 = h0.f195f;
                    ((e4.r) g0Var).R(f0.b(63, 13, billingResult2, null, z3Var), i10);
                    c00191.onBillingConfigResponse(billingResult2, null);
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i7 != 1) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.play_billing.e.a(parcel);
                bg.a.v(parcel);
                int i11 = this.j;
                g0 g0Var2 = this.f275i;
                if (bundle2 == null) {
                    BillingResult billingResult3 = h0.f195f;
                    android.support.v4.media.session.b.y(98, billingResult3, g0Var2, i11);
                    z(billingResult3);
                } else {
                    boolean zContainsKey = bundle2.containsKey("BILLING_RESULT");
                    z3 z3Var2 = z3.BROADCAST_ACTION_UNSPECIFIED;
                    if (zContainsKey) {
                        try {
                            byte[] byteArray = bundle2.getByteArray("BILLING_RESULT");
                            if (byteArray == null) {
                                throw new Exception("Billing result is null");
                            }
                            i1 i1VarS = i1.s(byteArray);
                            g gVarA2 = BillingResult.a();
                            gVarA2.f184d = i1VarS.r();
                            gVarA2.f186i = i1VarS.t();
                            billingResultE = gVarA2.e();
                            if (billingResultE.f3788a != 0) {
                                android.support.v4.media.session.b.y(23, billingResultE, g0Var2, i11);
                            } else if (!bundle2.containsKey("RESPONSE_DATA")) {
                                com.google.android.gms.internal.play_billing.r.h("GetBillingConfigDelegateToBackendCallback", "delegateToBackendAsync returned a bundle with neither an error nor response data");
                                billingResultE = h0.f195f;
                                android.support.v4.media.session.b.y(101, billingResultE, g0Var2, i11);
                            }
                        } catch (Exception e11) {
                            com.google.android.gms.internal.play_billing.r.i("GetBillingConfigDelegateToBackendCallback", "Failed parsing BillingResult.", e11);
                            BillingResult billingResult4 = h0.f195f;
                            ((e4.r) g0Var2).R(f0.b(100, 29, billingResult4, f0.a(e11), z3Var2), i11);
                            billingResultE = billingResult4;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.r.h("GetBillingConfigDelegateToBackendCallback", "delegateToBackendAsync does not contain a billing result in the response");
                        billingResultE = h0.f195f;
                        android.support.v4.media.session.b.y(99, billingResultE, g0Var2, i11);
                    }
                    if (billingResultE.f3788a == 0) {
                        try {
                            byte[] byteArray2 = bundle2.getByteArray("RESPONSE_DATA");
                            if (byteArray2 == null) {
                                throw new IllegalArgumentException("Response data is null");
                            }
                            onBillingConfigResponse(billingResultE, new BillingConfig(e1.r(byteArray2).s(), 0));
                        } catch (Exception e12) {
                            com.google.android.gms.internal.play_billing.r.i("GetBillingConfigDelegateToBackendCallback", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e12);
                            BillingResult billingResult5 = h0.f195f;
                            ((e4.r) g0Var2).R(f0.b(97, 29, billingResult5, f0.a(e12), z3Var2), i11);
                            z(billingResult5);
                        }
                    } else {
                        z(billingResultE);
                    }
                }
                return true;
        }
    }

    public void z(BillingResult billingResult) {
        BillingManager.C01061.C00181.C00191 c00191 = this.f274h;
        if (c00191 != null) {
            c00191.onBillingConfigResponse(billingResult, null);
        } else {
            android.support.v4.media.session.b.y(96, billingResult, this.f275i, this.j);
        }
    }
}
