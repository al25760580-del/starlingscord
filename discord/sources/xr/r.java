package xr;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import net.time4j.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Serializable {
    private static final long serialVersionUID = 1564804888291509484L;
    private final long amount;
    private final Object unit;

    public r(long j, i0 i0Var) {
        if (i0Var == null) {
            throw new NullPointerException("Missing chronological unit.");
        }
        if (j < 0) {
            throw new IllegalArgumentException(kk.b.i(j, "Temporal amount must be positive or zero: "));
        }
        this.amount = j;
        this.unit = i0Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.unit == null || this.amount < 0) {
            throw new InvalidObjectException("Inconsistent state.");
        }
    }

    public final long a() {
        return this.amount;
    }

    public final Object b() {
        return this.unit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) r.class.cast(obj);
            if (this.amount == rVar.amount && this.unit.equals(rVar.unit)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.unit.hashCode() * 29;
        long j = this.amount;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "P" + this.amount + '{' + this.unit + '}';
    }
}
