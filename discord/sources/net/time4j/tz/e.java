package net.time4j.tz;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements j {
    public static final e M = new e(m.f16734w);
    private static final long serialVersionUID = 7807230388259573234L;
    private final m offset;

    public e(m mVar) {
        int i7 = mVar.f16736e;
        if (i7 == 0) {
            this.offset = mVar;
        } else {
            int i10 = mVar.f16735d;
            this.offset = m.e(i7 < 0 ? i10 - 1 : i10, 0);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.offset.f16736e != 0) {
            throw new InvalidObjectException("Fractional offset is invalid.");
        }
    }

    @Override // net.time4j.tz.i
    public final f a() {
        return this.offset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.offset.equals(((e) obj).offset);
        }
        return false;
    }

    public final int hashCode() {
        return this.offset.hashCode();
    }

    @Override // net.time4j.tz.j
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(e.class.getName());
        sb2.append(':');
        sb2.append(this.offset);
        sb2.append(']');
        return sb2.toString();
    }
}
