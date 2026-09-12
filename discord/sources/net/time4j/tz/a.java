package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i {
    private static final long serialVersionUID = -2894726563499525332L;
    private final i fallback;
    private final f tzid;

    public a(f fVar, i iVar) {
        if (fVar == null || iVar == null) {
            throw null;
        }
        this.tzid = fVar;
        this.fallback = iVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(12, this);
    }

    @Override // net.time4j.tz.i
    public final f a() {
        return this.tzid;
    }

    public final i d() {
        return this.fallback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.tzid.a().equals(aVar.tzid.a()) && this.fallback.equals(aVar.fallback)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.tzid.a().hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(a.class.getName());
        sb2.append(':');
        sb2.append(this.tzid.a());
        sb2.append(",fallback=");
        sb2.append(this.fallback);
        sb2.append(']');
        return sb2.toString();
    }
}
