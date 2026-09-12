package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i {
    private static final long serialVersionUID = 1738909257417361021L;
    public final transient f M;
    public final transient j N;
    public final transient l O;

    public b(f fVar, j jVar, l lVar) {
        if (fVar == null) {
            throw new NullPointerException("Missing timezone id.");
        }
        if ((fVar instanceof m) && !jVar.isEmpty()) {
            throw new IllegalArgumentException("Fixed zonal offset can't be combined with offset transitions: " + fVar.a());
        }
        if (jVar == null) {
            throw new NullPointerException("Missing timezone history.");
        }
        if (lVar == null) {
            throw new NullPointerException("Missing transition strategy.");
        }
        this.M = fVar;
        this.N = jVar;
        this.O = lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(14, this);
    }

    @Override // net.time4j.tz.i
    public final f a() {
        return this.M;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.M.a().equals(bVar.M.a()) && this.N.equals(bVar.N) && this.O.equals(bVar.O)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.M.a().hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(b.class.getName());
        sb2.append(':');
        sb2.append(this.M.a());
        sb2.append(",history={");
        sb2.append(this.N);
        sb2.append("},strategy=");
        sb2.append(this.O);
        sb2.append(']');
        return sb2.toString();
    }
}
