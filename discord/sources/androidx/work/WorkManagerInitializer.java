package androidx.work;

import android.content.Context;
import j3.b;
import java.util.Collections;
import java.util.List;
import v3.q;
import v3.s;
import w3.o;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2811a = q.f("WrkMgrInitializer");

    @Override // j3.b
    public final Object create(Context context) {
        q.d().a(f2811a, "Initializing WorkManager with default configuration.");
        v3.b bVar = new v3.b(new s());
        synchronized (o.f22045m) {
            try {
                o oVar = o.k;
                if (oVar != null && o.f22044l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (oVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (o.f22044l == null) {
                        o.f22044l = w3.q.n(applicationContext, bVar);
                    }
                    o.k = o.f22044l;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o.a(context);
    }

    @Override // j3.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
