package ag;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j1 implements Comparable {
    public static int d(byte b10) {
        return (b10 >> 5) & 7;
    }

    public static j1 e(byte... bArr) {
        bArr.getClass();
        l1 l1Var = new l1(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return c.k(l1Var);
        } finally {
            try {
                l1Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final j1 c(Class cls) throws i1 {
        if (cls.isInstance(this)) {
            return (j1) cls.cast(this);
        }
        throw new i1(a3.e.m("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
