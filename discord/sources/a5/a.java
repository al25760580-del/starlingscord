package a5;

import android.content.Context;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f145c;

    public /* synthetic */ a(Object obj) {
        this.f143a = obj;
    }

    public boolean a() {
        try {
            Context context = (Context) this.f143a;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.r.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
            return false;
        }
    }
}
