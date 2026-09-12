package xe;

import af.w;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat$Builder;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.GoogleApiActivity;
import x0.y;

/* JADX INFO: loaded from: classes3.dex */
public class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f22921c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f22922d = new e();

    public static AlertDialog e(Activity activity, int i7, af.q qVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(af.n.b(activity, i7));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i7 == 1) {
            string = resources.getString(com.discord.R.string.common_google_play_services_install_button);
        } else if (i7 != 2) {
            string = i7 != 3 ? resources.getString(R.string.ok) : resources.getString(com.discord.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.discord.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            if (qVar == null) {
                qVar = null;
            }
            builder.setPositiveButton(string, qVar);
        }
        String strC = af.n.c(activity, i7);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", kk.b.h(i7, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                k kVar = new k();
                w.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.f22932d = alertDialog;
                if (onCancelListener != null) {
                    kVar.f22933e = onCancelListener;
                }
                kVar.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        w.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f22914d = alertDialog;
        if (onCancelListener != null) {
            cVar.f22915e = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i7, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i7, af.q.b(googleApiActivity, super.a(googleApiActivity, "d", i7), 2), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i7, PendingIntent pendingIntent) {
        int i10;
        Log.w("GoogleApiAvailability", s0.g.d(i7, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i7 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i7 == 6 ? af.n.e(context, "common_google_play_services_resolution_required_title") : af.n.c(context, i7);
        if (strE == null) {
            strE = context.getResources().getString(com.discord.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i7 == 6 || i7 == 19) ? af.n.d(context, "common_google_play_services_resolution_required_text", af.n.a(context)) : af.n.b(context, i7);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        w.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationCompat$Builder notificationCompat$Builder = new NotificationCompat$Builder(context, (String) null);
        notificationCompat$Builder.f1505y = true;
        notificationCompat$Builder.g(16, true);
        notificationCompat$Builder.f1487e = NotificationCompat$Builder.e(strE);
        y yVar = new y(0);
        yVar.f22580f = NotificationCompat$Builder.e(strD);
        notificationCompat$Builder.j(yVar);
        PackageManager packageManager = context.getPackageManager();
        if (ff.c.f9152b == null) {
            ff.c.f9152b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (ff.c.f9152b.booleanValue()) {
            notificationCompat$Builder.N.icon = context.getApplicationInfo().icon;
            notificationCompat$Builder.f1493m = 2;
            if (ff.c.d(context)) {
                notificationCompat$Builder.a(2131230898, pendingIntent, resources.getString(com.discord.R.string.common_open_on_phone));
            } else {
                notificationCompat$Builder.f1490h = pendingIntent;
            }
        } else {
            notificationCompat$Builder.N.icon = R.drawable.stat_sys_warning;
            notificationCompat$Builder.N.tickerText = NotificationCompat$Builder.e(resources.getString(com.discord.R.string.common_google_play_services_notification_ticker));
            notificationCompat$Builder.N.when = System.currentTimeMillis();
            notificationCompat$Builder.f1490h = pendingIntent;
            notificationCompat$Builder.f1488f = NotificationCompat$Builder.e(strD);
        }
        if (ff.c.c()) {
            if (!ff.c.c()) {
                throw new IllegalStateException();
            }
            synchronized (f22921c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.discord.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            notificationCompat$Builder.G = "com.google.android.gms.availability";
        }
        Notification notificationC = notificationCompat$Builder.c();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            i.f22925a.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, notificationC);
    }

    public final void h(Activity activity, ze.f fVar, int i7, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i7, af.q.c(fVar, super.a(activity, "d", i7), 2), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
