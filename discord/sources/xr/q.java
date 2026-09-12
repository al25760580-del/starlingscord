package xr;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q extends e implements Comparable, Serializable {
    public abstract int i(q qVar);

    public abstract p j();

    public final s k(Object obj) {
        s sVarC;
        p pVarJ = j();
        Map map = pVarJ.f23070w;
        if (obj == null) {
            throw new NullPointerException("Missing chronological unit.");
        }
        if (map.containsKey(obj)) {
            return (s) map.get(obj);
        }
        if ((obj instanceof b) && (sVarC = ((b) b.class.cast(obj)).c(pVarJ)) != null) {
            return sVarC;
        }
        StringBuilder sb2 = new StringBuilder("Cannot find any rule for chronological unit \"");
        sb2.append(obj instanceof Enum ? ((Enum) Enum.class.cast(obj)).name() : obj.toString());
        sb2.append("\" in: ");
        sb2.append(pVarJ.f23066d.getName());
        throw new l(sb2.toString());
    }

    public final q l(long j, Object obj) {
        if (j == 0) {
            return (q) f();
        }
        try {
            return (q) k(obj).a(f(), j);
        } catch (IllegalArgumentException e10) {
            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
            arithmeticException.initCause(e10);
            throw arithmeticException;
        }
    }
}
