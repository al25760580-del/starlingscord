package a5;

import com.android.billingclient.api.BillingResult;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    void onBillingServiceDisconnected();

    void onBillingSetupFinished(BillingResult billingResult);
}
