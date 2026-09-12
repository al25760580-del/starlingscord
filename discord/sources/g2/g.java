package g2;

import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.u0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final g DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile q0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        s.h(g.class, gVar);
    }

    public static void i(g gVar, long j) {
        gVar.valueCase_ = 4;
        gVar.value_ = Long.valueOf(j);
    }

    public static void j(g gVar, String str) {
        gVar.getClass();
        gVar.valueCase_ = 5;
        gVar.value_ = str;
    }

    public static void k(g gVar, d dVar) {
        gVar.getClass();
        gVar.value_ = dVar.a();
        gVar.valueCase_ = 6;
    }

    public static void l(g gVar, double d6) {
        gVar.valueCase_ = 7;
        gVar.value_ = Double.valueOf(d6);
    }

    public static void m(g gVar, boolean z5) {
        gVar.valueCase_ = 1;
        gVar.value_ = Boolean.valueOf(z5);
    }

    public static void n(g gVar, float f2) {
        gVar.valueCase_ = 2;
        gVar.value_ = Float.valueOf(f2);
    }

    public static void o(g gVar, int i7) {
        gVar.valueCase_ = 3;
        gVar.value_ = Integer.valueOf(i7);
    }

    public static g q() {
        return DEFAULT_INSTANCE;
    }

    public static f y() {
        return (f) ((q) DEFAULT_INSTANCE.d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.s
    public final Object d(int i7) {
        q0 rVar;
        switch (f0.e.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new u0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", e.class});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q0 q0Var = PARSER;
                if (q0Var != null) {
                    return q0Var;
                }
                synchronized (g.class) {
                    try {
                        rVar = PARSER;
                        if (rVar == null) {
                            rVar = new r();
                            PARSER = rVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return rVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean p() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double r() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float s() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int t() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long u() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String v() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final e w() {
        return this.valueCase_ == 6 ? (e) this.value_ : e.j();
    }

    public final int x() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }
}
