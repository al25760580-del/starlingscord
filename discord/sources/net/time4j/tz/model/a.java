package net.time4j.tz.model;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends o {
    private static final long serialVersionUID = -5264909488983076587L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient net.time4j.tz.n[] f16740e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient List f16741i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient int f16742v = 0;

    public a(List list) {
        List listUnmodifiableList;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing timezone transitions.");
        }
        net.time4j.tz.n[] nVarArr = (net.time4j.tz.n[]) list.toArray(new net.time4j.tz.n[list.size()]);
        boolean z5 = false;
        for (net.time4j.tz.n nVar : nVarArr) {
            z5 = z5 || nVar.b() < 0;
        }
        this.f16740e = nVarArr;
        long jA = o.a(1);
        if (0 > jA) {
            throw new IllegalArgumentException("Start after end.");
        }
        int iB = b(0L, nVarArr);
        int iB2 = b(jA, nVarArr);
        if (iB2 == 0) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            if (iB > 0 && nVarArr[iB - 1].c() == 0) {
                iB--;
            }
            int i7 = iB2 - 1;
            i7 = nVarArr[i7].c() == jA ? iB2 - 2 : i7;
            if (iB > i7) {
                listUnmodifiableList = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList((i7 - iB) + 1);
                while (iB <= i7) {
                    arrayList.add(nVarArr[iB]);
                    iB++;
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            }
        }
        this.f16741i = listUnmodifiableList;
    }

    public static int b(long j, net.time4j.tz.n[] nVarArr) {
        int length = nVarArr.length - 1;
        int i7 = 0;
        while (i7 <= length) {
            int i10 = (i7 + length) / 2;
            if (nVarArr[i10].c() <= j) {
                i7 = i10 + 1;
            } else {
                length = i10 - 1;
            }
        }
        return i7;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(126, this);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    public final void c(int i7, ObjectOutput objectOutput) {
        byte b10;
        int i10;
        net.time4j.tz.n[] nVarArr = this.f16740e;
        int iMin = Math.min(i7, nVarArr.length);
        objectOutput.writeInt(iMin);
        if (iMin > 0) {
            byte b11 = 0;
            int iD = nVarArr[0].d();
            SPX.m(objectOutput, iD);
            int i11 = 0;
            while (i11 < iMin) {
                net.time4j.tz.n nVar = nVarArr[i11];
                int iE = nVar.e();
                byte b12 = iE != iD ? (byte) 1 : b11;
                byte b13 = b12 != 0 ? (byte) IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : b11;
                int iB = nVar.b();
                if (iB == 0) {
                    b10 = 1;
                } else if (iB != 3600) {
                    b10 = iB != 7200 ? b11 : (byte) 3;
                } else {
                    b10 = 2;
                }
                byte b14 = (byte) (b13 | (b10 << 5));
                long jC = nVar.c() + ((long) iD);
                long j = jC + 7200;
                if (j < -4575744000L || j >= 18067104000L) {
                    i10 = 0;
                } else {
                    int iM = yk.a.m(86400, j);
                    if (iM == 0) {
                        i10 = 1;
                    } else if (iM == 60) {
                        i10 = 2;
                    } else if (iM == 3600) {
                        i10 = 3;
                    } else if (iM == 7200) {
                        i10 = 4;
                    } else if (iM == 10800) {
                        i10 = 5;
                    } else if (iM == 14400) {
                        i10 = 6;
                    } else if (iM != 18000) {
                        i10 = 0;
                    } else {
                        i10 = 7;
                    }
                }
                byte b15 = (byte) ((i10 << 2) | b14);
                if (i10 == 0) {
                    objectOutput.writeByte(b15);
                    objectOutput.writeLong(nVar.c());
                } else {
                    int i12 = (int) ((jC + 4575751200L) / 86400);
                    objectOutput.writeByte((byte) (b15 | ((byte) ((i12 >>> 16) & 3))));
                    objectOutput.writeByte((i12 >>> 8) & 255);
                    objectOutput.writeByte(i12 & 255);
                }
                if (b10 == 0) {
                    SPX.m(objectOutput, iB);
                }
                if (b12 != 0) {
                    SPX.m(objectOutput, iE);
                }
                i11++;
                iD = iE;
                b11 = 0;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Arrays.equals(this.f16740e, ((a) obj).f16740e);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f16742v;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = Arrays.hashCode(this.f16740e);
        this.f16742v = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        a3.e.w(a.class, sb2, "[transition-count=");
        sb2.append(this.f16740e.length);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(']');
        return sb2.toString();
    }
}
