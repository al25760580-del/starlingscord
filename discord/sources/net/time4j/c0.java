package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends w3.q implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f16614i;
    private static final long serialVersionUID = -6321211763598951499L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c0 f16615v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ag.t f16616w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient List f16617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient boolean f16618e;

    static {
        f16614i = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? '.' : ',';
        f16615v = new c0();
        E(true, false);
        E(true, true);
        E(false, false);
        E(false, true);
        new a0(t.class, "hh[:mm[:ss[,fffffffff]]]");
        new a0(t.class, "hh[mm[ss[,fffffffff]]]");
        f16616w = new ag.t(7);
        k kVar = m.E;
        new b0(new m[]{m.f16667v, m.f16669x, kVar});
        new b0(new t[]{t.f16710d, t.f16711e, t.f16712i, t.f16715x});
        new b0(new g0[]{o1.f16685d, m.f16670y, kVar});
    }

    public c0() {
        this.f16617d = Collections.EMPTY_LIST;
        this.f16618e = false;
    }

    public static void E(boolean z5, boolean z6) {
        String str;
        if (z5) {
            str = z6 ? "YYYY-DDD" : "YYYY-MM-DD";
        } else {
            str = z6 ? "YYYYDDD" : "YYYYMMDD";
        }
        new a0(m.class, str);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(6, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) c0.class.cast(obj);
            if (this.f16618e == c0Var.f16618e && this.f16617d.equals(c0Var.f16617d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f16617d.hashCode();
        if (this.f16618e) {
            return 0;
        }
        return iHashCode;
    }

    public final String toString() {
        o1 o1Var;
        List list = this.f16617d;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            long j = 0;
            if (((xr.r) list.get(i7)).a() > 0) {
                StringBuilder sb2 = new StringBuilder();
                if (this.f16618e) {
                    sb2.append('-');
                }
                sb2.append('P');
                int size2 = list.size();
                long j5 = 0;
                long j7 = 0;
                int i10 = 0;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    o1Var = o1.f16685d;
                    if (i10 >= size2) {
                        break;
                    }
                    xr.r rVar = (xr.r) list.get(i10);
                    long j10 = j;
                    i0 i0Var = (i0) rVar.b();
                    if (!z5 && !i0Var.b()) {
                        sb2.append('T');
                        z5 = true;
                    }
                    long j11 = j5;
                    long jA = rVar.a();
                    char cA = i0Var.a();
                    if (i0Var == o1Var) {
                        z6 = true;
                    }
                    if (cA <= '0' || cA > '9') {
                        if (cA == 'S') {
                            j7 = jA;
                        } else {
                            sb2.append(jA);
                            if (cA == 0) {
                                sb2.append('{');
                                sb2.append(i0Var);
                                sb2.append('}');
                            } else {
                                sb2.append(cA);
                            }
                        }
                        j5 = j11;
                    } else {
                        j5 = jA;
                    }
                    i10++;
                    j = j10;
                }
                long j12 = j;
                long j13 = j5;
                if (j13 != j12) {
                    sb2.append(yk.a.A(j7, j13 / 1000000000));
                    sb2.append(f16614i);
                    String strValueOf = String.valueOf(j13 % 1000000000);
                    int length = 9 - strValueOf.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        sb2.append('0');
                    }
                    sb2.append(strValueOf);
                    sb2.append('S');
                } else if (j7 != j12) {
                    sb2.append(j7);
                    sb2.append('S');
                }
                if (z6) {
                    boolean z7 = !z5;
                    if (!z5) {
                        int size3 = list.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            Object objB = ((xr.r) list.get(i12)).b();
                            if (objB != o1Var && objB != m.f16670y && objB != m.E) {
                                z7 = false;
                                break;
                            }
                        }
                    }
                    if (!z7) {
                        int iIndexOf = sb2.indexOf("Y");
                        sb2.replace(iIndexOf, iIndexOf + 1, "{WEEK_BASED_YEARS}");
                    }
                }
                return sb2.toString();
            }
        }
        return "PT0S";
    }

    public c0(ArrayList arrayList, boolean z5) {
        boolean zIsEmpty = arrayList.isEmpty();
        if (zIsEmpty) {
            this.f16617d = Collections.EMPTY_LIST;
        } else {
            Collections.sort(arrayList, f16616w);
            this.f16617d = Collections.unmodifiableList(arrayList);
        }
        this.f16618e = !zIsEmpty && z5;
    }
}
