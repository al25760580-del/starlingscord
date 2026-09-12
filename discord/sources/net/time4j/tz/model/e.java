package net.time4j.tz.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements net.time4j.tz.j, Serializable {
    private static final long serialVersionUID = 1374714021808040253L;
    private final net.time4j.tz.m offset;

    public e(net.time4j.tz.m mVar) {
        this.offset = mVar;
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
        return "EmptyTransitionModel=" + this.offset.a();
    }
}
