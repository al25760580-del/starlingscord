package com.google.android.play.agesignals;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public class AgeSharingConsentWrapperActivity extends Activity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ResultReceiver f6501d;

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 0 && this.f6501d != null) {
            if (i10 == -1 && intent != null && intent.getExtras().getBoolean("AGE_SHARING_USER_ACTION")) {
                this.f6501d.send(1, new Bundle());
            } else {
                this.f6501d.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        AgeSharingConsentWrapperActivity ageSharingConsentWrapperActivity;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            Intent intent2 = new Intent();
            intent2.putExtra("window_flags", intExtra);
            intent = intent2;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6501d = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f6501d = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        PendingIntent pendingIntent = extras != null ? (PendingIntent) extras.get("confirmation_intent") : null;
        if (extras == null || pendingIntent == null) {
            ResultReceiver resultReceiver = this.f6501d;
            if (resultReceiver != null) {
                resultReceiver.send(3, new Bundle());
            }
            finish();
            return;
        }
        try {
            ageSharingConsentWrapperActivity = this;
            try {
                ageSharingConsentWrapperActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver2 = ageSharingConsentWrapperActivity.f6501d;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(3, new Bundle());
                }
                finish();
            }
        } catch (IntentSender.SendIntentException unused2) {
            ageSharingConsentWrapperActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f6501d);
    }
}
