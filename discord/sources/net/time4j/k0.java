package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Comparable, Serializable {
    private static final long serialVersionUID = -4150291820807606229L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k0 f16650v = new k0(0, 0, as.e.f3000d);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k0 f16651w = new k0(0, 0, as.e.f3001e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient long f16652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16653e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient as.e f16654i;

    public k0(long j, int i7, as.e eVar) {
        while (i7 < 0) {
            i7 += 1000000000;
            j = yk.a.E(j, 1L);
        }
        while (i7 >= 1000000000) {
            i7 -= 1000000000;
            j = yk.a.A(j, 1L);
        }
        if (j < 0 && i7 > 0) {
            j++;
            i7 -= 1000000000;
        }
        this.f16652d = j;
        this.f16653e = i7;
        this.f16654i = eVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(5, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k0 k0Var = (k0) obj;
        if (this.f16654i != k0Var.f16654i) {
            throw new ClassCastException("Different time scales.");
        }
        long j = this.f16652d;
        long j5 = k0Var.f16652d;
        if (j < j5) {
            return -1;
        }
        if (j > j5) {
            return 1;
        }
        return this.f16653e - k0Var.f16653e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (this.f16652d == k0Var.f16652d && this.f16653e == k0Var.f16653e && this.f16654i == k0Var.f16654i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16652d;
        return this.f16654i.hashCode() + ((((161 + ((int) (j ^ (j >>> 32)))) * 23) + this.f16653e) * 23);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        long j = this.f16652d;
        int i7 = this.f16653e;
        if (j < 0 || i7 < 0) {
            sb2.append('-');
            sb2.append(Math.abs(j));
        } else {
            sb2.append(j);
        }
        if (i7 != 0) {
            sb2.append('.');
            String strValueOf = String.valueOf(Math.abs(i7));
            for (int length = 9 - strValueOf.length(); length > 0; length--) {
                sb2.append('0');
            }
            sb2.append(strValueOf);
        }
        sb2.append("s [");
        sb2.append(this.f16654i.name());
        sb2.append(']');
        return sb2.toString();
    }
}
