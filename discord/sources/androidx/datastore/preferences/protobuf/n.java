package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1902c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f1903a = new x0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1904b;

    static {
        new n(0);
    }

    public n() {
    }

    public static void b(i iVar, v1 v1Var, int i7, Object obj) throws h {
        if (v1Var == v1.f1943v) {
            iVar.R(i7, 3);
            ((a) obj).c(iVar);
            iVar.R(i7, 4);
        }
        iVar.R(i7, v1Var.f1947e);
        switch (v1Var.ordinal()) {
            case 0:
                iVar.L(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                iVar.J(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                iVar.V(((Long) obj).longValue());
                break;
            case 3:
                iVar.V(((Long) obj).longValue());
                break;
            case 4:
                iVar.N(((Integer) obj).intValue());
                break;
            case 5:
                iVar.L(((Long) obj).longValue());
                break;
            case 6:
                iVar.J(((Integer) obj).intValue());
                break;
            case 7:
                iVar.D(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof e)) {
                    iVar.Q((String) obj);
                } else {
                    iVar.H((e) obj);
                }
                break;
            case 9:
                ((a) obj).c(iVar);
                break;
            case 10:
                a aVar = (a) obj;
                iVar.getClass();
                iVar.T(aVar.a());
                aVar.c(iVar);
                break;
            case 11:
                if (!(obj instanceof e)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    iVar.T(length);
                    iVar.E(bArr, 0, length);
                } else {
                    iVar.H((e) obj);
                }
                break;
            case 12:
                iVar.T(((Integer) obj).intValue());
                break;
            case 13:
                iVar.N(((Integer) obj).intValue());
                break;
            case 14:
                iVar.J(((Integer) obj).intValue());
                break;
            case 15:
                iVar.L(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iVar.T((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iVar.V((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f1904b) {
            return;
        }
        x0 x0Var = this.f1903a;
        if (!x0Var.f1970v) {
            if (x0Var.f1968e.size() > 0) {
                x0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = x0Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!x0Var.f1970v) {
            x0Var.f1969i = x0Var.f1969i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x0Var.f1969i);
            x0Var.f1972x = x0Var.f1972x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x0Var.f1972x);
            x0Var.f1970v = true;
        }
        this.f1904b = true;
    }

    public final Object clone() {
        n nVar = new n();
        x0 x0Var = this.f1903a;
        if (x0Var.f1968e.size() > 0) {
            Map.Entry entryC = x0Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = x0Var.d().iterator();
        if (!it.hasNext()) {
            return nVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f1903a.equals(((n) obj).f1903a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1903a.hashCode();
    }

    public n(int i7) {
        a();
        a();
    }
}
