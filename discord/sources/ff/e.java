package ff;

import af.w;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import androidx.datastore.preferences.protobuf.d1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f9156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f9157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f9158c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f9156a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f9156a = Application.getProcessName();
            } else {
                int iMyPid = f9157b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f9157b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        try {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                            sb2.append("/proc/");
                            sb2.append(iMyPid);
                            sb2.append("/cmdline");
                            String string = sb2.toString();
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(string));
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                try {
                                    String line = bufferedReader.readLine();
                                    w.g(line);
                                    strTrim = line.trim();
                                } catch (IOException unused) {
                                    if (bufferedReader != null) {
                                    }
                                    f9156a = strTrim;
                                    return f9156a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th3;
                            }
                        } catch (IOException unused3) {
                            bufferedReader = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                f9156a = strTrim;
            }
        }
        return f9156a;
    }

    public static boolean b() {
        Boolean boolValueOf = f9158c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new d1(c9.a.Q("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f9158c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
