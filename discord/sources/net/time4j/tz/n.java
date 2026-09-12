package net.time4j.tz;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Comparable, Serializable {
    private static final long serialVersionUID = 4594838367057225304L;
    private final int dst;
    private final long posix;
    private final int previous;
    private final int total;

    public n(long j, int i7, int i10, int i11) {
        this.posix = j;
        this.previous = i7;
        this.total = i10;
        this.dst = i11;
        a(i7);
        a(i10);
        if (i11 != Integer.MAX_VALUE) {
            a(i11);
        }
    }

    public static void a(int i7) {
        if (i7 < -64800 || i7 > 64800) {
            throw new IllegalArgumentException(kk.b.h(i7, "Offset out of range: "));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        try {
            a(this.previous);
            a(this.total);
            int i7 = this.dst;
            if (i7 != Integer.MAX_VALUE) {
                a(i7);
            }
        } catch (IllegalArgumentException e10) {
            throw new InvalidObjectException(e10.getMessage());
        }
    }

    public final int b() {
        int i7 = this.dst;
        if (i7 == Integer.MAX_VALUE) {
            return 0;
        }
        return i7;
    }

    public final long c() {
        return this.posix;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        long jB = this.posix - nVar.posix;
        if (jB == 0) {
            jB = this.previous - nVar.previous;
            if (jB == 0) {
                jB = this.total - nVar.total;
                if (jB == 0) {
                    jB = b() - nVar.b();
                    if (jB == 0) {
                        return 0;
                    }
                }
            }
        }
        return jB < 0 ? -1 : 1;
    }

    public final int d() {
        return this.previous;
    }

    public final int e() {
        return this.total - b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.posix == nVar.posix && this.previous == nVar.previous && this.total == nVar.total && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.total;
    }

    public final int hashCode() {
        long j = this.posix;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb2.append("[POSIX=");
        sb2.append(this.posix);
        sb2.append(", previous-offset=");
        sb2.append(this.previous);
        sb2.append(", total-offset=");
        sb2.append(this.total);
        sb2.append(", dst-offset=");
        sb2.append(b());
        sb2.append(']');
        return sb2.toString();
    }
}
