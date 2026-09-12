package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements l, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f16730i = new HashMap();
    private static final long serialVersionUID = 1790434289322009750L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16732e;

    static {
        for (int i7 : f0.e.c(3)) {
            for (int i10 : f0.e.c(2)) {
                f16730i.put(Integer.valueOf(f0.e.b(i10) + (f0.e.b(i7) * 2)), new k(i7, i10));
            }
        }
    }

    public k(int i7, int i10) {
        this.f16731d = i7;
        this.f16732e = i10;
    }

    public static k a(int i7, int i10) {
        return (k) f16730i.get(Integer.valueOf(f0.e.b(i10) + (f0.e.b(i7) * 2)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(13, this);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(32);
        a3.e.w(k.class, sb2, ":[gap=");
        int i7 = this.f16731d;
        if (i7 == 1) {
            str = "PUSH_FORWARD";
        } else if (i7 != 2) {
            str = i7 != 3 ? "null" : "ABORT";
        } else {
            str = "NEXT_VALID_TIME";
        }
        sb2.append(str);
        sb2.append(",overlap=");
        int i10 = this.f16732e;
        if (i10 != 1) {
            str2 = i10 != 2 ? "null" : "LATER_OFFSET";
        } else {
            str2 = "EARLIER_OFFSET";
        }
        sb2.append(str2);
        sb2.append(']');
        return sb2.toString();
    }
}
