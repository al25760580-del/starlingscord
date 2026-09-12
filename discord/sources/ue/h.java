package ue;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1.d f21115a = new a1.d("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        i.t(context).u();
        Set set = ye.l.f23310a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((ye.l) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        ze.e.a();
    }
}
