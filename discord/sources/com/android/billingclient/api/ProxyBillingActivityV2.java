package com.android.billingclient.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.v0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.r;
import f.h;
import kotlin.jvm.internal.Intrinsics;
import u4.b;
import ue.i;
import x0.c;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends ComponentActivity {
    public ResultReceiver E;
    public ResultReceiver F;
    public ResultReceiver G;
    public ResultReceiver H;
    public ResultReceiver I;
    public ResultReceiver J;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActivityResultLauncher f3812e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ActivityResultLauncher f3813i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActivityResultLauncher f3814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ActivityResultLauncher f3815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ActivityResultLauncher f3816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ActivityResultLauncher f3817y;

    public static final c d() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 36) {
            c cVar = new c(ActivityOptions.makeBasic());
            cVar.h(3);
            return cVar;
        }
        if (i7 < 34) {
            return null;
        }
        c cVar2 = new c(ActivityOptions.makeBasic());
        cVar2.h(1);
        return cVar2;
    }

    @Override // androidx.activity.ComponentActivity, x0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i7 = 0;
        this.f3812e = registerForActivityResult(new v0(4), new ActivityResultCallback(this) { // from class: a5.j0

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ProxyBillingActivityV2 f221e;

            {
                this.f221e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void d(Object obj) {
                f.a aVar = (f.a) obj;
                switch (i7) {
                    case 0:
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f221e;
                        proxyBillingActivityV2.getClass();
                        Intent intent = aVar.f8760e;
                        int i10 = com.google.android.gms.internal.play_billing.r.e(intent, "ProxyBillingActivityV2").f3788a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.E;
                        if (resultReceiver != null) {
                            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                        }
                        int i11 = aVar.f8759d;
                        if (i11 != -1 || i10 != 0) {
                            com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        ProxyBillingActivityV2 proxyBillingActivityV3 = this.f221e;
                        proxyBillingActivityV3.getClass();
                        Intent intent2 = aVar.f8760e;
                        int i12 = com.google.android.gms.internal.play_billing.r.e(intent2, "ProxyBillingActivityV2").f3788a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV3.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i12, intent2 == null ? null : intent2.getExtras());
                        }
                        int i13 = aVar.f8759d;
                        if (i13 != -1 || i12 != 0) {
                            com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i13 + " and billing's responseCode: " + i12);
                        }
                        proxyBillingActivityV3.finish();
                        break;
                }
            }
        });
        this.f3813i = registerForActivityResult(new v0(4), new b(1, this));
        this.f3814v = registerForActivityResult(new v0(4), new u4.c(this));
        this.f3815w = registerForActivityResult(new v0(4), new i(this));
        this.f3816x = registerForActivityResult(new v0(4), new fj.c(2, this));
        final int i10 = 1;
        this.f3817y = registerForActivityResult(new v0(4), new ActivityResultCallback(this) { // from class: a5.j0

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ProxyBillingActivityV2 f221e;

            {
                this.f221e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void d(Object obj) {
                f.a aVar = (f.a) obj;
                switch (i10) {
                    case 0:
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f221e;
                        proxyBillingActivityV2.getClass();
                        Intent intent = aVar.f8760e;
                        int i11 = com.google.android.gms.internal.play_billing.r.e(intent, "ProxyBillingActivityV2").f3788a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.E;
                        if (resultReceiver != null) {
                            resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                        }
                        int i12 = aVar.f8759d;
                        if (i12 != -1 || i11 != 0) {
                            com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        ProxyBillingActivityV2 proxyBillingActivityV3 = this.f221e;
                        proxyBillingActivityV3.getClass();
                        Intent intent2 = aVar.f8760e;
                        int i13 = com.google.android.gms.internal.play_billing.r.e(intent2, "ProxyBillingActivityV2").f3788a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV3.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i13, intent2 == null ? null : intent2.getExtras());
                        }
                        int i14 = aVar.f8759d;
                        if (i14 != -1 || i13 != 0) {
                            com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i14 + " and billing's responseCode: " + i13);
                        }
                        proxyBillingActivityV3.finish();
                        break;
                }
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.E = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.F = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.G = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.H = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.I = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.J = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        r.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.E = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            ActivityResultLauncher activityResultLauncher = this.f3812e;
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            activityResultLauncher.a(new h(intentSender, null, 0, 0), d());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.F = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            ActivityResultLauncher activityResultLauncher2 = this.f3813i;
            Intrinsics.checkNotNullParameter(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender2, "pendingIntent.intentSender");
            Intrinsics.checkNotNullParameter(intentSender2, "intentSender");
            activityResultLauncher2.a(new h(intentSender2, null, 0, 0), d());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.G = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            ActivityResultLauncher activityResultLauncher3 = this.f3814v;
            Intrinsics.checkNotNullParameter(pendingIntent3, "pendingIntent");
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender3, "pendingIntent.intentSender");
            Intrinsics.checkNotNullParameter(intentSender3, "intentSender");
            activityResultLauncher3.a(new h(intentSender3, null, 0, 0), d());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.H = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            ActivityResultLauncher activityResultLauncher4 = this.f3815w;
            Intrinsics.checkNotNullParameter(pendingIntent4, "pendingIntent");
            IntentSender intentSender4 = pendingIntent4.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender4, "pendingIntent.intentSender");
            Intrinsics.checkNotNullParameter(intentSender4, "intentSender");
            activityResultLauncher4.a(new h(intentSender4, null, 0, 0), d());
            return;
        }
        if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.I = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            ActivityResultLauncher activityResultLauncher5 = this.f3816x;
            Intrinsics.checkNotNullParameter(pendingIntent5, "pendingIntent");
            IntentSender intentSender5 = pendingIntent5.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender5, "pendingIntent.intentSender");
            Intrinsics.checkNotNullParameter(intentSender5, "intentSender");
            activityResultLauncher5.a(new h(intentSender5, null, 0, 0), d());
            return;
        }
        if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.J = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            ActivityResultLauncher activityResultLauncher6 = this.f3817y;
            Intrinsics.checkNotNullParameter(pendingIntent6, "pendingIntent");
            IntentSender intentSender6 = pendingIntent6.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender6, "pendingIntent.intentSender");
            Intrinsics.checkNotNullParameter(intentSender6, "intentSender");
            activityResultLauncher6.a(new h(intentSender6, null, 0, 0), d());
        }
    }

    @Override // androidx.activity.ComponentActivity, x0.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.E;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.F;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.G;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.H;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.I;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.J;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
