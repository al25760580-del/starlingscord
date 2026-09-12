package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(18)
@f
class Api18TraceUtils {
    public static void a(String str, String str2, String str3) {
        String strK = kk.b.k(str, str2, str3);
        if (strK.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder sbN = kk.b.n(str);
            sbN.append(str2.substring(0, length));
            sbN.append(str3);
            strK = sbN.toString();
        }
        Trace.beginSection(strK);
    }
}
