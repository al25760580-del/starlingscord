package a5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.discord.billing.BillingManager;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.g4;
import com.google.android.gms.internal.play_billing.i4;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.z3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f235c;

    public n0(o0 o0Var, boolean z5) {
        this.f235c = o0Var;
        this.f234b = z5;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f233a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f234b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f233a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        n0 n0Var;
        try {
            try {
                if (this.f233a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    n0Var = this;
                    context.registerReceiver(n0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f234b ? 4 : 2);
                } else {
                    n0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                n0Var.f233a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.f233a) {
            com.google.android.gms.internal.play_billing.r.h("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f233a = false;
        }
    }

    public final void d(Bundle bundle, BillingResult billingResult, int i7, z3 z3Var, long j, boolean z5) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            o0 o0Var = this.f235c;
            if (byteArray != null) {
                ((e4.r) o0Var.f239c).T(t3.v(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z5);
            } else {
                ((e4.r) o0Var.f239c).T(f0.b(23, i7, billingResult, null, z3Var), j, z5);
            }
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.r.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        z3 z3Var;
        BillingResult billingResultE;
        long j;
        BillingResult billingResult;
        d4 d4Var;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        z3 z3Var2 = z3.LOCAL_PURCHASES_UPDATED_ACTION;
        z3 z3Var3 = z3.PURCHASES_UPDATED_ACTION;
        z3 z3Var4 = z3.ALTERNATIVE_BILLING_ACTION;
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    z3Var = z3Var4;
                } else {
                    z3Var = z3.BROADCAST_ACTION_UNSPECIFIED;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                z3Var = z3Var2;
            } else {
                z3Var = z3.BROADCAST_ACTION_UNSPECIFIED;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            z3Var = z3Var3;
        } else {
            z3Var = z3.BROADCAST_ACTION_UNSPECIFIED;
        }
        int i7 = (z3Var.equals(z3Var2) || z3Var.equals(z3Var4)) ? 2 : z3Var.equals(z3Var3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        o0 o0Var = this.f235c;
        if (extras == null) {
            com.google.android.gms.internal.play_billing.r.h("BillingBroadcastManager", "Bundle is null.");
            g0 g0Var = o0Var.f239c;
            BillingResult billingResult2 = h0.f195f;
            ((e4.r) g0Var).Q(f0.b(11, i7, billingResult2, null, z3Var));
            com.discord.billing.b bVar = o0Var.f238b;
            if (bVar != null) {
                BillingManager.handlePurchases$default((BillingManager) bVar.f3973b, billingResult2, null, false, 4, null);
                return;
            }
            return;
        }
        if (i7 == 2) {
            int i10 = com.google.android.gms.internal.play_billing.r.f6105a;
            g gVarA = BillingResult.a();
            gVarA.f184d = com.google.android.gms.internal.play_billing.r.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                com.google.android.gms.internal.play_billing.r.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    com.google.android.gms.internal.play_billing.r.g("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                } else {
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        com.google.android.gms.internal.play_billing.r.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                    }
                    gVarA.f185e = iIntValue;
                    gVarA.f186i = com.google.android.gms.internal.play_billing.r.f("BillingBroadcastManager", intent.getExtras());
                    billingResultE = gVarA.e();
                }
            }
            iIntValue = 0;
            gVarA.f185e = iIntValue;
            gVarA.f186i = com.google.android.gms.internal.play_billing.r.f("BillingBroadcastManager", intent.getExtras());
            billingResultE = gVarA.e();
        } else {
            billingResultE = com.google.android.gms.internal.play_billing.r.e(intent, "BillingBroadcastManager");
        }
        long j5 = extras.getLong("billingClientTransactionId", 0L);
        boolean z5 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!z3Var.equals(z3Var3) && !z3Var.equals(z3Var2)) {
            if (z3Var.equals(z3Var4)) {
                if (billingResultE.f3788a != 0) {
                    d(extras, billingResultE, i7, z3Var, j5, z5);
                    com.discord.billing.b bVar2 = o0Var.f238b;
                    com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.s.f6118e;
                    BillingManager.handlePurchases$default((BillingManager) bVar2.f3973b, billingResultE, com.google.android.gms.internal.play_billing.w.f6169w, false, 4, null);
                    return;
                }
                o0Var.getClass();
                com.google.android.gms.internal.play_billing.r.h("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                g0 g0Var2 = o0Var.f239c;
                BillingResult billingResult3 = h0.f195f;
                ((e4.r) g0Var2).T(f0.b(141, i7, billingResult3, null, z3Var), j5, z5);
                com.discord.billing.b bVar3 = o0Var.f238b;
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.s.f6118e;
                BillingManager.handlePurchases$default((BillingManager) bVar3.f3973b, billingResult3, com.google.android.gms.internal.play_billing.w.f6169w, false, 4, null);
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.u uVar = o0Var.f243g;
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j = 0;
            Purchase purchaseJ = com.google.android.gms.internal.play_billing.r.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"), uVar);
            if (purchaseJ == null) {
                com.google.android.gms.internal.play_billing.r.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
            } else {
                arrayList.add(purchaseJ);
            }
        } else {
            j = 0;
            com.google.android.gms.internal.play_billing.r.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i11 = 0; i11 < stringArrayList.size() && i11 < stringArrayList2.size(); i11++) {
                Purchase purchaseJ2 = com.google.android.gms.internal.play_billing.r.j(stringArrayList.get(i11), stringArrayList2.get(i11), uVar);
                if (purchaseJ2 != null) {
                    arrayList.add(purchaseJ2);
                }
            }
        }
        if (billingResultE.f3788a == 0) {
            g0 g0Var3 = o0Var.f239c;
            v3 v3VarC = f0.c(i7, z3Var);
            e4.r rVar = (e4.r) g0Var3;
            rVar.getClass();
            try {
                u3 u3Var = (u3) v3VarC.l();
                g4 g4Var = (g4) v3VarC.t().l();
                g4Var.c();
                i4.s((i4) g4Var.f5994e, z5);
                u3Var.c();
                v3.v((v3) u3Var.f5994e, (i4) g4Var.a());
                v3 v3Var = (v3) u3Var.a();
                if (j5 == j) {
                    d4Var = (d4) rVar.f8034e;
                } else {
                    c4 c4Var = (c4) ((d4) rVar.f8034e).l();
                    c4Var.g(j5);
                    d4Var = (d4) c4Var.a();
                }
                rVar.b0(v3Var, d4Var);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
            }
            billingResult = billingResultE;
        } else {
            billingResult = billingResultE;
            d(extras, billingResult, i7, z3Var, j5, z5);
        }
        BillingManager.handlePurchases$default((BillingManager) o0Var.f238b.f3973b, billingResult, arrayList, false, 4, null);
    }
}
