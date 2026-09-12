package a5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.k4;
import com.google.android.gms.internal.play_billing.z3;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f223b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f225d;

    public k0(e4.r rVar) {
        this.f225d = rVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d4 d4Var;
        boolean z5;
        switch (this.f222a) {
            case 0:
                g0 g0Var = (g0) this.f225d;
                if (intent != null) {
                    com.google.android.gms.internal.play_billing.r.g("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
                    if (!Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION")) {
                        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
                            com.google.android.gms.internal.play_billing.r.h("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
                        } else {
                            this.f223b = true;
                            if (g0Var != null) {
                                long longExtra = intent.getLongExtra("billingClientTransactionId", 0L);
                                e4.r rVar = (e4.r) g0Var;
                                try {
                                    a4 a4VarR = b4.r();
                                    a4VarR.c();
                                    b4.w((b4) a4VarR.f5994e, 4);
                                    z3 z3Var = z3.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                                    a4VarR.c();
                                    b4.s((b4) a4VarR.f5994e, z3Var);
                                    b4 b4Var = (b4) a4VarR.a();
                                    j4 j4VarT = k4.t();
                                    if (longExtra == 0) {
                                        d4Var = (d4) rVar.f8034e;
                                    } else {
                                        c4 c4Var = (c4) ((d4) rVar.f8034e).l();
                                        c4Var.g(longExtra);
                                        d4Var = (d4) c4Var.a();
                                    }
                                    j4VarT.e(d4Var);
                                    j4VarT.c();
                                    k4.x((k4) j4VarT.f5994e, b4Var);
                                    ((i0) rVar.f8035i).z((k4) j4VarT.a());
                                } catch (Throwable th2) {
                                    com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
                                    return;
                                }
                            }
                        }
                    } else if (!intent.hasExtra("RESPONSE_CODE")) {
                        com.google.android.gms.internal.play_billing.r.h("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
                        if (g0Var != null) {
                            ((e4.r) g0Var).W(null, intent.getLongExtra("billingClientTransactionId", 0L));
                        }
                    } else {
                        g gVarA = BillingResult.a();
                        gVarA.f184d = intent.getIntExtra("RESPONSE_CODE", 0);
                        String stringExtra = intent.getStringExtra("DEBUG_MESSAGE");
                        if (stringExtra == null) {
                            stringExtra = "";
                        }
                        gVarA.f186i = stringExtra;
                        BillingResult billingResultE = gVarA.e();
                        this.f224c = billingResultE;
                        if (g0Var != null) {
                            ((e4.r) g0Var).W(billingResultE, intent.getLongExtra("billingClientTransactionId", 0L));
                        }
                    }
                } else {
                    com.google.android.gms.internal.play_billing.r.h("ProxyBillingReceiver", "Null intent!");
                }
                break;
            default:
                String action = intent == null ? null : intent.getAction();
                if (!"com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                    z5 = "com.amazon.tv.networkmonitor.INTERNET_UP".equals(action);
                }
                Boolean bool = (Boolean) this.f224c;
                if (bool == null || bool.booleanValue() != z5) {
                    this.f224c = Boolean.valueOf(z5);
                    ((kl.a) this.f225d).f14568c.onAmazonFireDeviceConnectivityChanged(z5);
                }
                break;
        }
    }

    public k0(kl.a aVar) {
        this.f225d = aVar;
    }
}
