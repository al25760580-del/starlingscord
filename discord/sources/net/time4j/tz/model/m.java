package net.time4j.tz.model;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import net.time4j.b1;
import net.time4j.e1;
import net.time4j.r0;
import net.time4j.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends o {
    private static final long serialVersionUID = 2456700806862862287L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient net.time4j.tz.n f16758e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient List f16759i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient List f16760v;

    static {
        xr.m.U(xr.k.MODIFIED_JULIAN_DATE.b(o.a(100), xr.k.UNIX));
    }

    public m(net.time4j.tz.n nVar, List list) {
        String str;
        int i7;
        net.time4j.tz.n nVar2;
        int i10;
        long j;
        new ConcurrentHashMap();
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing daylight saving rules.");
        }
        if (list.size() >= 128) {
            throw new IllegalArgumentException("Too many daylight saving rules: " + list);
        }
        Collections.sort(list, n.f16761d);
        net.time4j.tz.n nVar3 = null;
        int i11 = 1;
        if (list.size() > 1) {
            Iterator it = list.iterator();
            str = null;
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (str == null) {
                    dVar.getClass();
                    str = "iso8601";
                } else {
                    dVar.getClass();
                    if (!str.equals("iso8601")) {
                        throw new IllegalArgumentException("Rules with different calendar systems not permitted.");
                    }
                }
            }
        } else {
            str = null;
        }
        "iso8601".equals(str);
        if (nVar.c() != Long.MIN_VALUE) {
            long jMax = Math.max(nVar.c(), nVar.c());
            int iE = nVar.e();
            int size = list.size();
            int iE2 = Integer.MIN_VALUE;
            int i12 = 0;
            while (nVar3 == null) {
                int i13 = i12 % size;
                d dVar2 = (d) list.get(i13);
                d dVar3 = (d) list.get(((i12 - 1) + size) % size);
                int iB = b(dVar2, iE, dVar3.f16752v);
                if (i12 == 0) {
                    i10 = i11;
                    j = jMax;
                    iE2 = e(dVar2, j + ((long) iB));
                } else {
                    i10 = i11;
                    j = jMax;
                    if (i13 == 0) {
                        iE2++;
                    }
                }
                long jC = c(dVar2, iE2, iB);
                if (jC > j) {
                    int i14 = iE + dVar3.f16752v;
                    int i15 = dVar2.f16752v;
                    nVar3 = new net.time4j.tz.n(jC, i14, iE + i15, i15);
                }
                i12++;
                i11 = i10;
                jMax = j;
            }
            i7 = i11;
            if (nVar.f() != nVar3.d()) {
                throw new IllegalArgumentException("Inconsistent model: " + nVar + " / " + list);
            }
            nVar2 = nVar;
        } else {
            if (nVar.b() != 0) {
                throw new IllegalArgumentException("Initial transition must not have any dst-offset: " + nVar);
            }
            i7 = 1;
            nVar2 = new net.time4j.tz.n(((r0) r0.E.f23072y).f16702d, nVar.e(), nVar.e(), 0);
        }
        this.f16758e = nVar2;
        List listUnmodifiableList = Collections.unmodifiableList(list);
        this.f16759i = listUnmodifiableList;
        this.f16760v = d(nVar2, listUnmodifiableList, 0L, o.a(i7));
    }

    public static int b(d dVar, int i7, int i10) {
        l lVar = dVar.f16751i;
        int iOrdinal = lVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return i7;
        }
        if (iOrdinal == 2) {
            return i7 + i10;
        }
        throw new UnsupportedOperationException(lVar.name());
    }

    public static long c(d dVar, int i7, int i10) {
        g gVar = (g) dVar;
        x0 x0Var = (x0) gVar.b(i7).l(gVar.f16749d, net.time4j.m.E);
        b1 b1Var = dVar.f16750e;
        x0Var.getClass();
        e1 e1Var = new e1(x0Var, b1Var);
        net.time4j.tz.m mVarE = net.time4j.tz.m.e(i10, 0);
        x0 x0Var2 = e1Var.f16629d;
        x0Var2.getClass();
        long jC = yk.a.C(x0.V.x(x0Var2) + 730, 86400L);
        b1 b1Var2 = e1Var.f16630e;
        long j = jC + ((long) (b1Var2.f16608d * 3600)) + ((long) (b1Var2.f16609e * 60)) + ((long) b1Var2.f16610i);
        int i11 = b1Var2.f16611v;
        long j5 = j - ((long) mVarE.f16735d);
        int i12 = i11 - mVarE.f16736e;
        if (i12 < 0) {
            i12 += 1000000000;
            j5--;
        } else if (i12 >= 1000000000) {
            i12 -= 1000000000;
            j5++;
        }
        return r0.s(j5, i12, as.e.f3000d).f16702d;
    }

    public static List d(net.time4j.tz.n nVar, List list, long j, long j5) {
        List list2 = list;
        long j7 = j;
        long jC = nVar.c();
        if (j7 > j5) {
            throw new IllegalArgumentException("Start after end.");
        }
        if (j5 <= jC || j7 == j5) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int iE = nVar.e();
        int iE2 = Integer.MIN_VALUE;
        int i7 = 0;
        while (true) {
            int i10 = i7 % size;
            d dVar = (d) list2.get(i10);
            d dVar2 = (d) list2.get(((i7 - 1) + size) % size);
            int iB = b(dVar, iE, dVar2.f16752v);
            if (i7 == 0) {
                iE2 = e(dVar, Math.max(j7, jC) + ((long) iB));
            } else if (i10 == 0) {
                iE2++;
            }
            long jC2 = c(dVar, iE2, iB);
            i7++;
            if (jC2 >= j5) {
                return Collections.unmodifiableList(arrayList);
            }
            if (jC2 >= j && jC2 > jC) {
                int i11 = iE + dVar2.f16752v;
                int i12 = dVar.f16752v;
                arrayList.add(new net.time4j.tz.n(jC2, i11, iE + i12, i12));
            }
            list2 = list;
            j7 = j;
        }
    }

    public static int e(d dVar, long j) {
        return (int) (xr.m.U(xr.k.MODIFIED_JULIAN_DATE.b(yk.a.k(86400, j), xr.k.UNIX)) >> 32);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(125, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f16758e.equals(mVar.f16758e) && this.f16759i.equals(mVar.f16759i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16759i.hashCode() * 37) + (this.f16758e.hashCode() * 17);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        a3.e.w(m.class, sb2, "[initial=");
        sb2.append(this.f16758e);
        sb2.append(",rules=");
        sb2.append(this.f16759i);
        sb2.append(']');
        return sb2.toString();
    }
}
