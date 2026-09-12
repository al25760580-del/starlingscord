package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5968c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f5969a = new z2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5970b;

    static {
        new a2(0);
    }

    public a2() {
    }

    public static void b(v1 v1Var, q3 q3Var, int i7, Object obj) {
        if (q3Var == q3.f6100v) {
            v1Var.N(i7, 3);
            ((o1) obj).a(v1Var);
            v1Var.N(i7, 4);
            return;
        }
        v1Var.N(i7, q3Var.f6104e);
        r3 r3Var = r3.f6111d;
        switch (q3Var.ordinal()) {
            case 0:
                v1Var.J(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                v1Var.H(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                v1Var.R(((Long) obj).longValue());
                break;
            case 3:
                v1Var.R(((Long) obj).longValue());
                break;
            case 4:
                v1Var.L(((Integer) obj).intValue());
                break;
            case 5:
                v1Var.J(((Long) obj).longValue());
                break;
            case 6:
                v1Var.H(((Integer) obj).intValue());
                break;
            case 7:
                v1Var.E(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof t1)) {
                    v1Var.M((String) obj);
                } else {
                    t1 t1Var = (t1) obj;
                    v1Var.P(t1Var.d());
                    t1Var.i(v1Var);
                }
                break;
            case 9:
                ((o1) obj).a(v1Var);
                break;
            case 10:
                o1 o1Var = (o1) obj;
                v1Var.P(o1Var.d());
                o1Var.a(v1Var);
                break;
            case 11:
                if (!(obj instanceof t1)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    v1Var.P(length);
                    v1Var.F(bArr, 0, length);
                } else {
                    t1 t1Var2 = (t1) obj;
                    v1Var.P(t1Var2.d());
                    t1Var2.i(v1Var);
                }
                break;
            case 12:
                v1Var.P(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof z3)) {
                    v1Var.L(((Integer) obj).intValue());
                } else {
                    v1Var.L(((z3) obj).f6210d);
                }
                break;
            case 14:
                v1Var.H(((Integer) obj).intValue());
                break;
            case 15:
                v1Var.J(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                v1Var.P((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                v1Var.R((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f5970b) {
            return;
        }
        z2 z2Var = this.f5969a;
        int i7 = z2Var.f6199e;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = z2Var.c(i10).f5971d;
            if (obj instanceof d2) {
                ((d2) obj).q();
            }
        }
        Iterator it = z2Var.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof d2) {
                ((d2) value).q();
            }
        }
        if (!z2Var.f6201v) {
            if (z2Var.f6199e > 0) {
                z2Var.c(0).getClass();
                throw null;
            }
            Iterator it2 = z2Var.a().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!z2Var.f6201v) {
            z2Var.f6200i = z2Var.f6200i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z2Var.f6200i);
            z2Var.f6203x = z2Var.f6203x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z2Var.f6203x);
            z2Var.f6201v = true;
        }
        this.f5970b = true;
    }

    public final Object clone() {
        a2 a2Var = new a2();
        z2 z2Var = this.f5969a;
        if (z2Var.f6199e > 0) {
            z2Var.c(0).getClass();
            throw null;
        }
        Iterator it = z2Var.a().iterator();
        if (!it.hasNext()) {
            return a2Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        z2 z2Var = ((a2) obj).f5969a;
        z2 z2Var2 = this.f5969a;
        if (z2Var2.size() != z2Var.size() || !z2Var2.keySet().equals(z2Var.keySet())) {
            return false;
        }
        for (Map.Entry entry : (androidx.datastore.preferences.protobuf.c1) z2Var2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = z2Var.get(key);
            if (value == obj2) {
                zEquals = true;
            } else if (value == null || obj2 == null) {
                zEquals = false;
            } else if (value instanceof j2) {
                zEquals = value.equals(obj2);
            } else {
                zEquals = obj2 instanceof j2 ? obj2.equals(value) : value.equals(obj2);
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f5969a.hashCode();
    }

    public a2(int i7) {
        a();
        a();
    }
}
