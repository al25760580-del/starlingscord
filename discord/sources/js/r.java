package js;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static int a(int i7, int i10, int i11) throws IOException {
        if ((i10 & 8) != 0) {
            i7--;
        }
        if (i11 <= i7) {
            return i7 - i11;
        }
        throw new IOException(a3.e.g(i11, i7, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
