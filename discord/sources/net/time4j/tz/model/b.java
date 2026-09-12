package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends o {
    private static final long serialVersionUID = 1749643877954103721L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16743e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient a f16744i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient m f16745v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient int f16746w = 0;

    public b(int i7, List list, List list2) {
        this.f16743e = i7;
        a aVar = new a(list);
        this.f16744i = aVar;
        net.time4j.tz.n[] nVarArr = aVar.f16740e;
        this.f16745v = new m(nVarArr[nVarArr.length - 1], list2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(127, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            a aVar = bVar.f16744i;
            int i7 = bVar.f16743e;
            net.time4j.tz.n[] nVarArr = this.f16744i.f16740e;
            int iMin = Math.min(this.f16743e, nVarArr.length);
            if (iMin == Math.min(i7, aVar.f16740e.length)) {
                for (int i10 = 0; i10 < iMin; i10++) {
                    if (nVarArr[i10].equals(aVar.f16740e[i10])) {
                    }
                }
                if (this.f16745v.f16759i.equals(bVar.f16745v.f16759i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f16746w;
        if (i7 != 0) {
            return i7;
        }
        net.time4j.tz.n[] nVarArr = this.f16744i.f16740e;
        int iMin = Math.min(this.f16743e, nVarArr.length);
        net.time4j.tz.n[] nVarArr2 = new net.time4j.tz.n[iMin];
        System.arraycopy(nVarArr, 0, nVarArr2, 0, iMin);
        int iHashCode = (this.f16745v.f16759i.hashCode() * 37) + Arrays.hashCode(nVarArr2);
        this.f16746w = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        a3.e.w(b.class, sb2, "[transition-count=");
        sb2.append(this.f16743e);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(",last-rules=");
        sb2.append(this.f16745v.f16759i);
        sb2.append(']');
        return sb2.toString();
    }
}
