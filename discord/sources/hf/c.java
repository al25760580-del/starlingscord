package hf;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f10727b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f10728a;

    static {
        c cVar = new c();
        cVar.f10728a = null;
        f10727b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f10727b;
        synchronized (cVar) {
            try {
                if (cVar.f10728a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f10728a = new b(context, false);
                }
                bVar = cVar.f10728a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
