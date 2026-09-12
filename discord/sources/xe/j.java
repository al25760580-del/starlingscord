package xe;

import a5.l0;
import af.w;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static j f22930b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22931a;

    public j(Context context) {
        this.f22931a = context.getApplicationContext();
    }

    public static j a(Context context) {
        w.g(context);
        synchronized (j.class) {
            if (f22930b == null) {
                m mVar = q.f22944a;
                synchronized (q.class) {
                    if (q.f22946c == null) {
                        q.f22946c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f22930b = new j(context);
            }
        }
        return f22930b;
    }

    public static final boolean b(PackageInfo packageInfo, boolean z5) {
        yf.f fVar;
        int i7;
        if (packageInfo != null) {
            if (z5 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z5 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                yf.f fVar2 = z5 ? p.f22943c : p.f22942b;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        yf.b bVar = yf.e.f23323e;
                        Object[] objArr = {byteArray};
                        l0.V(1, objArr);
                        fVar = new yf.f(1, objArr);
                    } else {
                        yf.b bVar2 = yf.e.f23323e;
                        fVar = yf.f.f23324w;
                    }
                } else {
                    if (i10 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        yf.b bVar3 = yf.e.f23323e;
                        fVar = yf.f.f23324w;
                    } else {
                        yf.b bVar4 = yf.e.f23323e;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i11].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i13 = i12 + 1;
                            if (i13 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i13 <= length2) {
                                i7 = length2;
                            } else {
                                i7 = (length2 >> 1) + length2 + 1;
                                if (i7 < i13) {
                                    int iHighestOneBit = Integer.highestOneBit(i12);
                                    i7 = iHighestOneBit + iHighestOneBit;
                                }
                                if (i7 < 0) {
                                    i7 = Integer.MAX_VALUE;
                                }
                            }
                            if (i7 > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i7);
                            }
                            objArrCopyOf[i12] = byteArray2;
                            i11++;
                            i12 = i13;
                        }
                        fVar = i12 == 0 ? yf.f.f23324w : new yf.f(i12, objArrCopyOf);
                    }
                }
                if (fVar.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                yf.e eVarH = fVar.h();
                int size = eVarH.size();
                int i14 = 0;
                while (i14 < size) {
                    byte[] bArr = (byte[]) eVarH.get(i14);
                    yf.b bVarJ = fVar2.listIterator(0);
                    do {
                        int i15 = i14 + 1;
                        if (!bVarJ.hasNext()) {
                            i14 = i15;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) bVarJ.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z5 ? c(packageInfo, p.f22941a) : c(packageInfo, p.f22941a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static n c(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < nVarArr.length; i7++) {
                if (nVarArr[i7].equals(oVar)) {
                    return nVarArr[i7];
                }
            }
        }
        return null;
    }
}
