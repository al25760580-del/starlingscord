package a5;

import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.z3;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f183a = 0;

    static {
        int i7 = g0.f187a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i7 = com.google.android.gms.internal.play_billing.r.f6105a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static t3 b(int i7, int i10, BillingResult billingResult, String str, z3 z3Var) {
        try {
            w3 w3VarS = x3.s();
            int i11 = billingResult.f3788a;
            w3VarS.c();
            x3.r((x3) w3VarS.f5994e, i11);
            String str2 = billingResult.f3790c;
            w3VarS.c();
            x3.u((x3) w3VarS.f5994e, str2);
            int i12 = billingResult.f3789b;
            if (i12 != 0) {
                w3VarS.c();
                x3.w((x3) w3VarS.f5994e, i12);
            }
            if (i7 != 0) {
                w3VarS.c();
                x3.x((x3) w3VarS.f5994e, i7);
            }
            if (str != null) {
                w3VarS.c();
                x3.t((x3) w3VarS.f5994e, str);
            }
            s3 s3VarU = t3.u();
            s3VarU.e(w3VarS);
            s3VarU.c();
            t3.t((t3) s3VarU.f5994e, i10);
            if (!z3Var.equals(z3.BROADCAST_ACTION_UNSPECIFIED)) {
                s3VarU.c();
                t3.x((t3) s3VarU.f5994e, z3Var);
            }
            return (t3) s3VarU.a();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static v3 c(int i7, z3 z3Var) {
        try {
            u3 u3VarS = v3.s();
            u3VarS.c();
            v3.r((v3) u3VarS.f5994e, i7);
            if (!z3Var.equals(z3.BROADCAST_ACTION_UNSPECIFIED)) {
                u3VarS.c();
                v3.u((v3) u3VarS.f5994e, z3Var);
            }
            return (v3) u3VarS.a();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
