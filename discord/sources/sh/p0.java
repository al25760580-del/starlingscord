package sh;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20150a = new HashMap();

    public final synchronized double a(String str) {
        Double d6 = (Double) this.f20150a.get(str);
        if (d6 == null) {
            return 0.0d;
        }
        return d6.doubleValue();
    }

    public final synchronized void b(String str) {
        this.f20150a.put(str, Double.valueOf(0.0d));
    }
}
