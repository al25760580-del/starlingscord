package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements Serializable {
    public static final v1 G;
    private static final long serialVersionUID = 7794495882610436763L;
    public final transient s1 E;
    public final transient u1 F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient p1 f16772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16773e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient p1 f16774i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient p1 f16775v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient s1 f16776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient s1 f16777x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient s1 f16778y;

    static {
        new ConcurrentHashMap();
        G = new v1(p1.f16687d, 4, p1.f16692x, p1.f16693y);
        Iterator it = vr.c.f21955b.d(yr.s0.class).iterator();
        if (it.hasNext()) {
        }
    }

    public v1(p1 p1Var, int i7, p1 p1Var2, p1 p1Var3) {
        if (p1Var == null) {
            throw new NullPointerException("Missing first day of week.");
        }
        if (i7 < 1 || i7 > 7) {
            throw new IllegalArgumentException(kk.b.h(i7, "Minimal days in first week out of range: "));
        }
        if (p1Var2 == null) {
            throw new NullPointerException("Missing start of weekend.");
        }
        if (p1Var3 == null) {
            throw new NullPointerException("Missing end of weekend.");
        }
        this.f16772d = p1Var;
        this.f16773e = i7;
        this.f16774i = p1Var2;
        this.f16775v = p1Var3;
        s1 s1Var = new s1(this, "WEEK_OF_YEAR", 0);
        this.f16776w = s1Var;
        s1 s1Var2 = new s1(this, "WEEK_OF_MONTH", 1);
        this.f16777x = s1Var2;
        s1 s1Var3 = new s1(this, "BOUNDED_WEEK_OF_YEAR", 2);
        this.f16778y = s1Var3;
        s1 s1Var4 = new s1(this, "BOUNDED_WEEK_OF_MONTH", 3);
        this.E = s1Var4;
        u1 u1Var = new u1(this);
        this.F = u1Var;
        HashSet hashSet = new HashSet();
        hashSet.add(s1Var);
        hashSet.add(s1Var2);
        hashSet.add(u1Var);
        hashSet.add(s1Var3);
        hashSet.add(s1Var4);
        Collections.unmodifiableSet(hashSet);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(3, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            if (this.f16772d == v1Var.f16772d && this.f16773e == v1Var.f16773e && this.f16774i == v1Var.f16774i && this.f16775v == v1Var.f16775v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16773e * 37) + (this.f16772d.name().hashCode() * 17);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        a3.e.w(v1.class, sb2, "[firstDayOfWeek=");
        sb2.append(this.f16772d);
        sb2.append(",minimalDaysInFirstWeek=");
        sb2.append(this.f16773e);
        sb2.append(",startOfWeekend=");
        sb2.append(this.f16774i);
        sb2.append(",endOfWeekend=");
        sb2.append(this.f16775v);
        sb2.append(']');
        return sb2.toString();
    }
}
