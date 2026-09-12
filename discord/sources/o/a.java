package o;

import gn.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f17068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.discord.misc.utilities.threading.a f17069d = new com.discord.misc.utilities.threading.a(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f17070b = new c();

    public static a T() {
        if (f17068c != null) {
            return f17068c;
        }
        synchronized (a.class) {
            try {
                if (f17068c == null) {
                    f17068c = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f17068c;
    }
}
