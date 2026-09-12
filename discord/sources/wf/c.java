package wf;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import ze.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends y0.b {
    public static void g(Context context, q qVar, IntentFilter intentFilter) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            context.registerReceiver(qVar, intentFilter, i7 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(qVar, intentFilter);
        }
    }
}
