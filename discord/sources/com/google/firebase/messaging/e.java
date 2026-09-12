package com.google.firebase.messaging;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat$Builder;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f6575a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Code duplicated, block: B:132:0x031f  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:222:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v144 */
    public static h a(FirebaseMessagingService firebaseMessagingService, u4.c cVar) {
        Bundle bundle;
        int identifier;
        String string;
        int identifier2;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        int i7;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        Bundle bundle2 = bundle;
        String strU = cVar.u("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT < 26) {
            strU = null;
        } else {
            try {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion < 26) {
                    strU = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strU)) {
                        strU = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strU)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strU) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strU = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    } else if (notificationManager.getNotificationChannel(strU) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strU + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strU = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strU)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strU) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strU = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String packageName = firebaseMessagingService.getPackageName();
        Resources resources = firebaseMessagingService.getResources();
        PackageManager packageManager = firebaseMessagingService.getPackageManager();
        NotificationCompat$Builder notificationCompat$Builder = new NotificationCompat$Builder(firebaseMessagingService, strU);
        String strR = cVar.r(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strR)) {
            notificationCompat$Builder.f1487e = NotificationCompat$Builder.e(strR);
        }
        String strR2 = cVar.r(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strR2)) {
            notificationCompat$Builder.f1488f = NotificationCompat$Builder.e(strR2);
            x0.y yVar = new x0.y(0);
            yVar.f22580f = NotificationCompat$Builder.e(strR2);
            notificationCompat$Builder.j(yVar);
        }
        String strU2 = cVar.u("gcm.n.icon");
        if (TextUtils.isEmpty(strU2)) {
            identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier2 != 0 || !b(resources, identifier2)) {
                try {
                } catch (PackageManager.NameNotFoundException e11) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e11);
                }
            }
            if (identifier2 != 0 || !b(resources, identifier2)) {
                identifier2 = 17301651;
            }
        } else {
            identifier2 = resources.getIdentifier(strU2, "drawable", packageName);
            if ((identifier2 == 0 || !b(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strU2, "mipmap", packageName)) == 0 || !b(resources, identifier2))) {
                Log.w("FirebaseMessaging", "Icon resource " + strU2 + " not found. Notification will use default icon.");
                identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier2 = identifier2 != 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier2 != 0) {
                    identifier2 = 17301651;
                } else {
                    identifier2 = 17301651;
                }
            }
        }
        notificationCompat$Builder.N.icon = identifier2;
        String strU3 = cVar.u("gcm.n.sound2");
        if (TextUtils.isEmpty(strU3)) {
            strU3 = cVar.u("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strU3)) {
            defaultUri = null;
        } else if ("default".equals(strU3) || resources.getIdentifier(strU3, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strU3);
        }
        if (defaultUri != null) {
            Notification notification = notificationCompat$Builder.N;
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = x0.c0.a(x0.c0.e(x0.c0.c(x0.c0.b(), 4), 5));
        }
        String strU4 = cVar.u("gcm.n.click_action");
        if (TextUtils.isEmpty(strU4)) {
            String strU5 = cVar.u("gcm.n.link_android");
            if (TextUtils.isEmpty(strU5)) {
                strU5 = cVar.u("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strU5) ? Uri.parse(strU5) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strU4);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger = f6575a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) cVar.f20946d;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle4);
            if (cVar.k("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", cVar.x());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        notificationCompat$Builder.f1490h = activity;
        PendingIntent broadcast = !cVar.k("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.x())), 1140850688);
        if (broadcast != null) {
            notificationCompat$Builder.N.deleteIntent = broadcast;
        }
        String strU6 = cVar.u("gcm.n.color");
        if (TextUtils.isEmpty(strU6)) {
            i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i7 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i7));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strU6));
            } catch (IllegalArgumentException unused2) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strU6 + ". Notification will use default color.");
                i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i7 != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i7));
                    } catch (Resources.NotFoundException unused3) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            notificationCompat$Builder.D = numValueOf.intValue();
        }
        notificationCompat$Builder.g(16, !cVar.k("gcm.n.sticky"));
        notificationCompat$Builder.f1505y = cVar.k("gcm.n.local_only");
        String strU7 = cVar.u("gcm.n.ticker");
        if (strU7 != null) {
            notificationCompat$Builder.N.tickerText = NotificationCompat$Builder.e(strU7);
        }
        Integer numL = cVar.l("gcm.n.notification_priority");
        if (numL == null) {
            numL = null;
        } else if (numL.intValue() < -2 || numL.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numL + ". Skipping setting notificationPriority.");
            numL = null;
        }
        if (numL != null) {
            notificationCompat$Builder.f1493m = numL.intValue();
        }
        Integer numL2 = cVar.l("gcm.n.visibility");
        if (numL2 == null) {
            numL2 = null;
        } else if (numL2.intValue() < -1 || numL2.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numL2 + ". Skipping setting visibility.");
            numL2 = null;
        }
        if (numL2 != null) {
            notificationCompat$Builder.E = numL2.intValue();
        }
        Integer numL3 = cVar.l("gcm.n.notification_count");
        if (numL3 == null) {
            numL3 = null;
        } else if (numL3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numL3 + ". Skipping setting notificationCount.");
            numL3 = null;
        }
        if (numL3 != null) {
            notificationCompat$Builder.f1492l = numL3.intValue();
        }
        String strU8 = cVar.u("gcm.n.event_time");
        if (TextUtils.isEmpty(strU8)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strU8));
            } catch (NumberFormatException unused4) {
                Log.w("NotificationParams", "Couldn't parse value of " + u4.c.C("gcm.n.event_time") + "(" + strU8 + ") into a long");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            notificationCompat$Builder.f1494n = true;
            notificationCompat$Builder.N.when = lValueOf.longValue();
        }
        JSONArray jSONArrayM = cVar.m("gcm.n.vibrate_timings");
        if (jSONArrayM == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayM.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayM.length();
                jArr = new long[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = jSONArrayM.optLong(i10);
                }
            } catch (NumberFormatException | JSONException unused5) {
                Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayM + ". Skipping setting vibrateTimings.");
                jArr = null;
            }
        }
        if (jArr != null) {
            notificationCompat$Builder.N.vibrate = jArr;
        }
        JSONArray jSONArrayM2 = cVar.m("gcm.n.light_settings");
        if (jSONArrayM2 == null) {
            iArr = null;
        } else {
            int[] iArr2 = new int[3];
            try {
                if (jSONArrayM2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArrayM2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr2[0] = color;
                iArr2[1] = jSONArrayM2.optInt(1);
                iArr2[2] = jSONArrayM2.optInt(2);
                iArr = iArr2;
            } catch (IllegalArgumentException e12) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM2 + ". " + e12.getMessage() + ". Skipping setting LightSettings");
                iArr = null;
            } catch (JSONException unused6) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM2 + ". Skipping setting LightSettings");
                iArr = null;
            }
        }
        if (iArr != null) {
            notificationCompat$Builder.i(iArr[0], iArr[1], iArr[2]);
        }
        boolean zK = cVar.k("gcm.n.default_sound");
        ?? r5 = zK;
        if (cVar.k("gcm.n.default_vibrate_timings")) {
            r5 = (zK ? 1 : 0) | 2;
        }
        int i11 = r5;
        if (cVar.k("gcm.n.default_light_settings")) {
            i11 = (r5 == true ? 1 : 0) | 4;
        }
        notificationCompat$Builder.f(i11);
        String strU9 = cVar.u("gcm.n.tag");
        if (TextUtils.isEmpty(strU9)) {
            strU9 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return new h(notificationCompat$Builder, strU9);
    }

    public static boolean b(Resources resources, int i7) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i7, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i7);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i7 + ", treating it as an invalid icon");
            return false;
        }
    }
}
