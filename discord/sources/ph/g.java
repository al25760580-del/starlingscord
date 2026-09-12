package ph;

import a5.l0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import ig.l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cg.b f18040d = new cg.b("AgeSignalsService", 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f18041a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cg.h f18043c;

    public g(Context context) {
        String strEncodeToString;
        this.f18042b = context;
        cg.b bVar = cg.j.f3673a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        bVar.d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            byte[] byteArray = signature.toByteArray();
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                messageDigest.update(byteArray);
                                strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                            } catch (NoSuchAlgorithmException unused) {
                                strEncodeToString = "";
                            }
                            arrayList.add(strEncodeToString);
                            if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                                String str = Build.TAGS;
                                if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                                }
                            }
                            this.f18043c = new cg.h(context, f18040d, b.f18030a);
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb2.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                } else {
                                    sb2.append((CharSequence) ", ");
                                }
                            }
                        }
                        bVar.d(s0.g.e("Play Store package certs are not valid. Found these sha256 certs: [", sb2.toString(), "]."), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    bVar.d("Play Store package is not found.", new Object[0]);
                }
            } else {
                bVar.d("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            bVar.d("Play Store package is not found.", new Object[0]);
        }
        this.f18043c = null;
    }

    public static l a(int i7) {
        f18040d.a(Integer.valueOf(i7));
        return l0.u(new a(i7, 0));
    }

    public final boolean b() {
        try {
            return ((long) this.f18042b.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode) >= 85222500;
        } catch (PackageManager.NameNotFoundException e10) {
            f18040d.b(e10, "Phonesky not found.", new Object[0]);
            return false;
        }
    }
}
