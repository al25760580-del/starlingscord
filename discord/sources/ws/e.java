package ws;

import hj.e0;
import hj.i;
import hj.j;
import hj.l;
import hj.p0;
import hj.q;
import hj.r;
import hj.s0;
import hj.v;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f22484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile q f22485g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f22486e = e0.f10823e;

    static {
        e eVar = new e();
        f22484f = eVar;
        r.h(e.class, eVar);
    }

    public static e i(FileInputStream fileInputStream) throws v {
        r rVar;
        l lVarA = l.a();
        try {
            int i7 = fileInputStream.read();
            if (i7 == -1) {
                rVar = null;
            } else {
                i iVar = new i(new hj.a(fileInputStream, j.o(i7, fileInputStream), 0));
                r rVarG = r.g(f22484f, iVar, lVarA);
                iVar.a(0);
                rVar = rVarG;
            }
            if (rVar == null || r.d(rVar, true)) {
                return (e) rVar;
            }
            throw new v(new s0().getMessage());
        } catch (v e10) {
            if (e10.f10913d) {
                throw new v(e10.getMessage(), e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new v(e11.getMessage(), e11);
        }
    }

    @Override // hj.r
    public final Object a(int i7) {
        q qVar;
        switch (f0.e.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new p0(f22484f, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", d.f22483a});
            case 3:
                return new e();
            case 4:
                return new c(f22484f);
            case 5:
                return f22484f;
            case 6:
                q qVar2 = f22485g;
                if (qVar2 != null) {
                    return qVar2;
                }
                synchronized (e.class) {
                    try {
                        qVar = f22485g;
                        if (qVar == null) {
                            qVar = new q();
                            f22485g = qVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return qVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
