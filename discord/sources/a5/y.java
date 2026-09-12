package a5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingResult;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.internal.play_billing.z1;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y extends bg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f278i;
    public final /* synthetic */ b j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b bVar, w wVar, Boolean bool, int i7) {
        super("com.android.vending.billing.IInAppBillingInitializeCallback", 3);
        Objects.requireNonNull(bVar);
        this.j = bVar;
        this.f276g = wVar;
        this.f277h = bool;
        this.f278i = i7;
    }

    @Override // bg.a
    public final boolean t(int i7, Parcel parcel, Parcel parcel2) {
        com.google.android.gms.internal.play_billing.u d0Var;
        if (i7 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) com.google.android.gms.internal.play_billing.e.a(parcel);
        bg.a.v(parcel);
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.r.h("BillingClient", "Response bundle is null.");
            z(this.f276g, h0.f195f, 122, this.f277h.booleanValue(), null, this.f278i);
            return true;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.r.h("BillingClient", "Response bundle doesn't contain a response code");
            z(this.f276g, h0.f195f, 129, this.f277h.booleanValue(), null, this.f278i);
            return true;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            z(this.f276g, h0.a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), 130, this.f277h.booleanValue(), kk.b.h(bundle.getInt("RESPONSE_CODE"), "Response code from Phonesky: "), this.f278i);
            return true;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            com.google.android.gms.internal.play_billing.r.h("BillingClient", "Billing API version not found in response bundle.");
            z(this.f276g, h0.f195f, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, this.f277h.booleanValue(), null, this.f278i);
            return true;
        }
        int i10 = bundle.getInt("BILLING_API_VERSION_KEY");
        b bVar = this.j;
        b.q(bVar, i10);
        bVar.k = i10 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                com.facebook.imagepipeline.nativecode.b.f4923b = bundle2.getBoolean("DELEGATION_API_ENABLED_KEY");
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th3) {
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
            }
            try {
                com.facebook.imagepipeline.nativecode.b.f4924c = bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th4) {
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th4);
            }
            try {
                com.facebook.imagepipeline.nativecode.b.f4925d = bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
            } catch (Throwable th5) {
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th5);
            }
            try {
                com.facebook.imagepipeline.nativecode.b.f4926e = bundle2.getBoolean("ENABLE_DEDUPLICATE_SERVICE_DISCONNECTED_CALLBACK");
            } catch (Throwable th6) {
                com.google.android.gms.internal.play_billing.r.i("BillingClient", "Error reading EnableDeduplicateServiceDisconnectedCallback experiment flag: ".concat(bundle2.toString()), th6);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            Object[] objArrCopyOf = new Object[4];
            int i11 = 0;
            for (m0 m0Var : m0.values()) {
                if (bundle3.getBoolean(m0Var.name(), false)) {
                    int length = objArrCopyOf.length;
                    int i12 = i11 + 1;
                    int iB = z1.b(length, i12);
                    if (iB > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                    }
                    objArrCopyOf[i11] = m0Var;
                    i11 = i12;
                }
            }
            b bVar2 = this.j;
            if (i11 == 0) {
                d0Var = com.google.android.gms.internal.play_billing.c0.G;
            } else if (i11 != 1) {
                d0Var = com.google.android.gms.internal.play_billing.u.m(i11, objArrCopyOf);
                d0Var.size();
            } else {
                Object obj = objArrCopyOf[0];
                Objects.requireNonNull(obj);
                d0Var = new com.google.android.gms.internal.play_billing.d0(obj);
            }
            bVar2.A = d0Var;
            if (bVar2.f153f != null) {
                bVar2.f153f.f243g = bVar2.A;
            }
        }
        b bVar3 = this.j;
        if (bVar3.f157l < 3) {
            com.google.android.gms.internal.play_billing.r.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
            z(this.f276g, h0.f190a, 36, this.f277h.booleanValue(), null, this.f278i);
        } else {
            w wVar = this.f276g;
            Boolean bool = this.f277h;
            int i13 = this.f278i;
            boolean zBooleanValue = bool.booleanValue();
            b.r(bVar3, 0);
            synchronized (bVar3.f148a) {
                try {
                    if (bVar3.f149b != 3) {
                        wVar.c(i13, zBooleanValue);
                        wVar.d(h0.f196g);
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            }
        }
        return true;
    }

    public final void z(w wVar, BillingResult billingResult, int i7, boolean z5, String str, int i10) {
        this.j.E(0);
        wVar.b(billingResult, i7, str, z5, i10);
        wVar.d(billingResult);
    }
}
