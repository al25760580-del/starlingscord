package com.android.billingclient.api;

import a5.f0;
import a5.g;
import a5.k0;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.discord.media.engine.MediaEngine;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.n4;
import com.google.android.gms.internal.play_billing.o4;
import com.google.android.gms.internal.play_billing.z3;
import e4.r;
import f0.e;
import y0.b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {
    public r E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ResultReceiver f3805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3806e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3807i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3808v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f3809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3810x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k0 f3811y;

    public static int a(int i7, Intent intent) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            return i7 == 5 ? 139 : 1;
        }
        if (i7 == -1) {
            return 113;
        }
        if (i7 == 0) {
            return MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION;
        }
        if (i7 != 3) {
            return i7 != 4 ? 117 : 116;
        }
        return 115;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    public final Intent b(int i7, long j, boolean z5) {
        BillingResult billingResult;
        Intent intentC = c();
        z3 z3Var = z3.BROADCAST_ACTION_UNSPECIFIED;
        if (z5) {
            k0 k0Var = this.f3811y;
            if (k0Var != null && (billingResult = (BillingResult) k0Var.f224c) != null) {
                intentC.putExtra("RESPONSE_CODE", billingResult.f3788a);
                intentC.putExtra("DEBUG_MESSAGE", billingResult.f3790c);
            } else if (k0Var == null || k0Var.f223b) {
                intentC.putExtra("RESPONSE_CODE", 6);
                intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                g gVarA = BillingResult.a();
                gVarA.f184d = 6;
                gVarA.f186i = "An internal error occurred.";
                intentC.putExtra("FAILURE_LOGGING_PAYLOAD", f0.b(i7, 2, gVarA.e(), null, z3Var).b());
            } else {
                intentC.putExtra("RESPONSE_CODE", 3);
                intentC.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
                g gVarA2 = BillingResult.a();
                gVarA2.f184d = 3;
                gVarA2.f186i = "Play Store is blocked.";
                intentC.putExtra("FAILURE_LOGGING_PAYLOAD", f0.b(142, 2, gVarA2.e(), null, z3Var).b());
            }
        } else {
            intentC.putExtra("RESPONSE_CODE", 6);
            intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            g gVarA3 = BillingResult.a();
            gVarA3.f184d = 6;
            gVarA3.f186i = "An internal error occurred.";
            intentC.putExtra("FAILURE_LOGGING_PAYLOAD", f0.b(i7, 2, gVarA3.e(), null, z3Var).b());
        }
        intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentC.putExtra("billingClientTransactionId", j);
        intentC.putExtra("wasServiceAutoReconnected", this.f3810x);
        return intentC;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[PHI: r11
      0x0070: PHI (r11v1 int) = (r11v0 int), (r11v16 int) binds: [B:28:0x006b, B:30:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0070, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x008c, please report this as an issue */
    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        boolean z5;
        int i11;
        int i12;
        String string;
        Intent intentC;
        boolean z6;
        int i13;
        ResultReceiver resultReceiver;
        Bundle extras;
        super.onActivityResult(i7, i10, intent);
        if (i7 == 100) {
            if (intent == null) {
                z5 = false;
            } else {
                z5 = true;
            }
            i11 = com.google.android.gms.internal.play_billing.r.e(intent, "ProxyBillingActivity").f3788a;
            i12 = -1;
            if (i10 != -1) {
                com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivity", "Activity finished with resultCode " + i10 + " and billing's responseCode: " + i11);
                i12 = i10;
            } else if (i11 != 0) {
                i10 = -1;
                com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivity", "Activity finished with resultCode " + i10 + " and billing's responseCode: " + i11);
                i12 = i10;
            }
            if (true != z5) {
                com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivity", "Got null data with resultCode " + i12 + "!");
            } else if (intent.getExtras() == null) {
                com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (e.a(a(i12, intent), 1)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent2;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.f3809w);
                intentC.putExtra("wasServiceAutoReconnected", this.f3810x);
            } else {
                int iA = a(i12, intent);
                long j = this.f3809w;
                if (intent == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                intentC = b(iA, j, z6);
            }
            if (i7 == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i7 == 110) {
            if (intent == null) {
                z5 = false;
            } else {
                z5 = true;
            }
            i11 = com.google.android.gms.internal.play_billing.r.e(intent, "ProxyBillingActivity").f3788a;
            i12 = -1;
            if (i10 != -1) {
                com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivity", "Activity finished with resultCode " + i10 + " and billing's responseCode: " + i11);
                i12 = i10;
            } else if (i11 != 0) {
                i10 = -1;
                com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivity", "Activity finished with resultCode " + i10 + " and billing's responseCode: " + i11);
                i12 = i10;
            }
            if (true != z5) {
                com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivity", "Got null data with resultCode " + i12 + "!");
            } else if (intent.getExtras() == null) {
                com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (e.a(a(i12, intent), 1)) {
                int iA2 = a(i12, intent);
                long j5 = this.f3809w;
                if (intent == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                intentC = b(iA2, j5, z6);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent3;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.f3809w);
                intentC.putExtra("wasServiceAutoReconnected", this.f3810x);
            }
            if (i7 == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i7 == 101) {
            int i14 = com.google.android.gms.internal.play_billing.r.f6105a;
            if (intent == null) {
                com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivity", "Got null intent!");
                intent = null;
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i13 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.f3805d;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i13, extras);
                }
            }
            i13 = 0;
            resultReceiver = this.f3805d;
            if (resultReceiver != null) {
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                resultReceiver.send(i13, extras);
            }
        } else {
            com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i7 + "; skipping...");
        }
        this.f3806e = false;
        k0 k0Var = this.f3811y;
        if (k0Var != null) {
            k0Var.f224c = null;
        }
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean zContainsKey;
        int i7;
        PendingIntent pendingIntent;
        ProxyBillingActivity proxyBillingActivity;
        IntentSender.SendIntentException sendIntentException;
        ResultReceiver resultReceiver;
        Intent intentB;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (bundle == null) {
            zContainsKey = getIntent() == null ? false : getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
        } else {
            zContainsKey = bundle.containsKey("in_app_message_result_receiver");
        }
        if (!zContainsKey) {
            try {
                i7 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                com.google.android.gms.internal.play_billing.r.i("ProxyBillingActivity", "Failed to get package info for current package.", e10);
                i7 = -1;
            }
            if (this.E == null) {
                Context applicationContext = getApplicationContext();
                c4 c4VarB = d4.B();
                c4VarB.j(getPackageName());
                c4VarB.k();
                c4VarB.f(i7);
                c4VarB.e(Build.VERSION.SDK_INT);
                c4VarB.h();
                this.E = new r(applicationContext, (d4) c4VarB.a());
            }
            synchronized (this) {
                try {
                    this.f3811y = new k0(this.E);
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                    intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                    b.f(this, this.f3811y, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", 2);
                } catch (NoSuchMethodError | RuntimeException e11) {
                    this.f3811y = null;
                    if (e11 instanceof NoSuchMethodError) {
                        r rVar = this.E;
                        n4 n4VarR = o4.r();
                        n4VarR.c();
                        o4.s((o4) n4VarR.f5994e, 2);
                        rVar.X((o4) n4VarR.a());
                    } else {
                        r rVar2 = this.E;
                        n4 n4VarR2 = o4.r();
                        n4VarR2.c();
                        o4.s((o4) n4VarR2.f5994e, 1);
                        rVar2.X((o4) n4VarR2.a());
                    }
                    com.google.android.gms.internal.play_billing.r.i("ProxyBillingActivity", "Failed to register receiver.", e11);
                }
            }
        }
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.r.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f3806e = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f3805d = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f3807i = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f3808v = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f3809w = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f3810x = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.r.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f3808v = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f3807i = true;
                this.f3808v = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f3805d = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f3808v = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f3809w = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f3810x = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f3806e = true;
            int i10 = Build.VERSION.SDK_INT;
            try {
                try {
                    if (i10 < 36) {
                        if (i10 >= 34) {
                            bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                        } else {
                            bundle2 = null;
                        }
                        proxyBillingActivity = this;
                        proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f3808v, new Intent(), 0, 0, 0, bundle2);
                        return;
                    }
                    bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
                    proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f3808v, new Intent(), 0, 0, 0, bundle2);
                    return;
                } catch (IntentSender.SendIntentException e12) {
                    e = e12;
                    sendIntentException = e;
                    com.google.android.gms.internal.play_billing.r.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", sendIntentException);
                    resultReceiver = proxyBillingActivity.f3805d;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    } else {
                        intentB = b(137, proxyBillingActivity.f3809w, false);
                        if (proxyBillingActivity.f3807i) {
                            intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        sendBroadcast(intentB);
                    }
                    proxyBillingActivity.f3806e = false;
                    finish();
                }
                bundle2 = bundle3;
                proxyBillingActivity = this;
            } catch (IntentSender.SendIntentException e13) {
                sendIntentException = e13;
                proxyBillingActivity = this;
                com.google.android.gms.internal.play_billing.r.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", sendIntentException);
                resultReceiver = proxyBillingActivity.f3805d;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                } else {
                    intentB = b(137, proxyBillingActivity.f3809w, false);
                    if (proxyBillingActivity.f3807i) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(intentB);
                }
                proxyBillingActivity.f3806e = false;
                finish();
            }
        } catch (IntentSender.SendIntentException e14) {
            e = e14;
            proxyBillingActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        BillingResult billingResult;
        super.onDestroy();
        k0 k0Var = this.f3811y;
        if (k0Var != null) {
            billingResult = (BillingResult) k0Var.f224c;
            try {
                unregisterReceiver(k0Var);
            } catch (RuntimeException e10) {
                com.google.android.gms.internal.play_billing.r.i("ProxyBillingActivity", "Failed to unregister receiver.", e10);
            }
        } else {
            billingResult = null;
        }
        if (isFinishing() && this.f3806e) {
            Intent intentC = c();
            if (billingResult != null) {
                intentC.putExtra("RESPONSE_CODE", billingResult.f3788a);
                intentC.putExtra("DEBUG_MESSAGE", billingResult.f3790c);
            } else {
                intentC.putExtra("RESPONSE_CODE", 1);
                intentC.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.f3807i) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i7 = this.f3808v;
            if (i7 == 110 || i7 == 100) {
                intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentC.putExtra("billingClientTransactionId", this.f3809w);
            }
            sendBroadcast(intentC);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f3805d;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f3806e);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f3807i);
        bundle.putInt("activity_code", this.f3808v);
        bundle.putLong("billingClientTransactionId", this.f3809w);
        bundle.putBoolean("wasServiceAutoReconnected", this.f3810x);
    }
}
