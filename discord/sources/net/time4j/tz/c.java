package net.time4j.tz;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f, Serializable {
    private static final long serialVersionUID = -4889632013137688471L;
    private final String tzid;

    public c(String str) {
        this.tzid = str;
    }

    @Override // net.time4j.tz.f
    public final String a() {
        return this.tzid;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.tzid.equals(((c) obj).tzid);
        }
        return false;
    }

    public final int hashCode() {
        return this.tzid.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a3.e.w(c.class, sb2, "@");
        sb2.append(this.tzid);
        return sb2.toString();
    }
}
