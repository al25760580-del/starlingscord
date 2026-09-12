package xe;

import af.w;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.discord.R;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f22923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f22924b;

    static {
        AtomicBoolean atomicBoolean = i.f22925a;
        f22923a = 12451000;
        f22924b = new f();
    }

    public static void c(Context context) throws g, h {
        AtomicBoolean atomicBoolean = i.f22925a;
        f fVar = f22924b;
        int iB = fVar.b(context, 11925000);
        if (iB != 0) {
            Intent intentA = fVar.a(context, "e", iB);
            StringBuilder sb2 = new StringBuilder(String.valueOf(iB).length() + 46);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(iB);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (intentA != null) {
                throw new h("Google Play Services not available");
            }
            throw new g();
        }
    }

    public Intent a(Context context, String str, int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && ff.c.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f22923a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                hf.b bVarA = hf.c.a(context);
                sb2.append(bVarA.f10726a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(StackTraceHelper.ID_KEY, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0207  */
    /* JADX WARN: Code duplicated, block: B:102:0x0209  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x016d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0190  */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197  */
    /* JADX WARN: Code duplicated, block: B:89:0x019c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x0190, please report this as an issue */
    public int b(Context context, int i7) {
        boolean z5;
        PackageInfo packageInfo;
        int i10;
        int i11;
        ApplicationInfo applicationInfo;
        AtomicBoolean atomicBoolean = i.f22925a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean zA = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !i.f22928d.get()) {
            synchronized (w.f492a) {
                try {
                    if (!w.f493b) {
                        w.f493b = true;
                        try {
                            Bundle bundle = hf.c.a(context).f10726a.getPackageManager().getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                w.f494c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i12 = w.f494c;
            if (i12 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i12 != 12451000) {
                int i13 = f22923a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 104 + String.valueOf(i12).length() + 194);
                sb2.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb2.append(i13);
                sb2.append(" but found ");
                sb2.append(i12);
                sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb2.toString());
            }
        }
        if (ff.c.d(context)) {
            z5 = false;
        } else {
            if (ff.c.f9154d == null) {
                ff.c.f9154d = Boolean.valueOf(ff.c.c() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (ff.c.f9154d.booleanValue()) {
                z5 = false;
            } else {
                z5 = true;
            }
        }
        w.b(i7 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i14 = 9;
        if (z5) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            j.a(context);
            if (!j.b(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z5) {
                w.g(packageInfo);
                if (!j.b(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (z5 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i10 = packageInfo2.versionCode;
                    if (i10 == -1) {
                        i11 = -1;
                    } else {
                        i11 = i10 / 1000;
                    }
                    if (i11 < (i7 != -1 ? i7 / 1000 : -1)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i7).length() + 11 + String.valueOf(i10).length());
                        sb3.append("Google Play services out of date for ");
                        sb3.append(packageName);
                        sb3.append(".  Requires ");
                        sb3.append(i7);
                        sb3.append(" but found ");
                        sb3.append(i10);
                        Log.w("GooglePlayServicesUtil", sb3.toString());
                        i14 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e11) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                                i14 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i14 = 0;
                        } else {
                            i14 = 3;
                        }
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            } else if (z5) {
                i10 = packageInfo2.versionCode;
                if (i10 == -1) {
                    i11 = -1;
                } else {
                    i11 = i10 / 1000;
                }
                if (i11 < (i7 != -1 ? i7 / 1000 : -1)) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i7).length() + 11 + String.valueOf(i10).length());
                    sb4.append("Google Play services out of date for ");
                    sb4.append(packageName);
                    sb4.append(".  Requires ");
                    sb4.append(i7);
                    sb4.append(" but found ");
                    sb4.append(i10);
                    Log.w("GooglePlayServicesUtil", sb4.toString());
                    i14 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i14 = 3;
                    } else {
                        i14 = 0;
                    }
                }
            } else {
                i10 = packageInfo2.versionCode;
                if (i10 == -1) {
                    i11 = -1;
                } else {
                    i11 = i10 / 1000;
                }
                if (i11 < (i7 != -1 ? i7 / 1000 : -1)) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i7).length() + 11 + String.valueOf(i10).length());
                    sb5.append("Google Play services out of date for ");
                    sb5.append(packageName);
                    sb5.append(".  Requires ");
                    sb5.append(i7);
                    sb5.append(" but found ");
                    sb5.append(i10);
                    Log.w("GooglePlayServicesUtil", sb5.toString());
                    i14 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i14 = 3;
                    } else {
                        i14 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i14 != 18) {
            zA = i14 == 1 ? i.a(context) : false;
        }
        if (zA) {
            return 18;
        }
        return i14;
    }
}
