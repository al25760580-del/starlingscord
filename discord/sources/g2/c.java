package g2;

import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c extends s {
    private static final c DEFAULT_INSTANCE;
    private static volatile q0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private h0 preferences_ = h0.f1866e;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        s.h(c.class, cVar);
    }

    public static h0 i(c cVar) {
        h0 h0Var = cVar.preferences_;
        if (!h0Var.f1867d) {
            cVar.preferences_ = h0Var.b();
        }
        return cVar.preferences_;
    }

    public static a k() {
        return (a) ((q) DEFAULT_INSTANCE.d(5));
    }

    public static c l(FileInputStream fileInputStream) {
        c cVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.f fVar = new androidx.datastore.preferences.protobuf.f(fileInputStream);
        k kVarA = k.a();
        s sVar = (s) cVar.d(4);
        try {
            s0 s0Var = s0.f1930c;
            s0Var.getClass();
            v0 v0VarA = s0Var.a(sVar.getClass());
            androidx.datastore.preferences.protobuf.g gVar = fVar.f1848b;
            if (gVar == null) {
                gVar = new androidx.datastore.preferences.protobuf.g(fVar);
            }
            v0VarA.i(sVar, gVar, kVarA);
            v0VarA.a(sVar);
            if (sVar.g()) {
                return (c) sVar;
            }
            throw new w(new d1().getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof w) {
                throw ((w) e10.getCause());
            }
            throw new w(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof w) {
                throw ((w) e11.getCause());
            }
            throw e11;
        }
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
                return new u0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f9458a});
            case 3:
                return new c();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q0 q0Var = PARSER;
                if (q0Var != null) {
                    return q0Var;
                }
                synchronized (c.class) {
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

    public final Map j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
