package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import j3.a;
import j3.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k2.i;
import k2.j;
import k2.q;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // j3.b
    public final Object create(Context context) {
        Object objB;
        q qVar = new q(new u4.b(context));
        qVar.f14230a = 1;
        if (i.k == null) {
            synchronized (i.j) {
                try {
                    if (i.k == null) {
                        i.k = new i(qVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f13641e) {
            try {
                objB = aVarC.f13642a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Lifecycle lifecycle = ((LifecycleOwner) objB).getLifecycle();
        lifecycle.a(new j(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // j3.b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
