package pe;

import af.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.gtm.zzfs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends BroadcastReceiver {
    static Boolean zza;

    public static boolean zzb(@NonNull Context context) {
        w.g(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zZzi = zzfs.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zza = Boolean.valueOf(zZzi);
        return zZzi;
    }
}
