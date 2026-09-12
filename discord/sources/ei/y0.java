package ei;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends q0 implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q0 f8393d;

    public y0(q0 q0Var) {
        this.f8393d = q0Var;
    }

    @Override // ei.q0
    public final q0 b() {
        return this.f8393d;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f8393d.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            return this.f8393d.equals(((y0) obj).f8393d);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f8393d.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8393d);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 10);
        sb2.append(strValueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
