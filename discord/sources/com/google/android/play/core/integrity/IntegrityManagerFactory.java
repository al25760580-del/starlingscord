package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.annotation.NonNull;
import ci.o;

/* JADX INFO: loaded from: classes3.dex */
public class IntegrityManagerFactory {
    @NonNull
    public static IntegrityManager create(Context context) {
        op.c cVar;
        synchronized (wh.c.class) {
            try {
                if (wh.c.f22266a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    wh.c.f22266a = new op.c(context);
                }
                cVar = wh.c.f22266a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (IntegrityManager) ((o) cVar.f17490e).a();
    }
}
