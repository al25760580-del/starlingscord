package ag;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends IOException {
    public e1(Exception exc) {
        super("Error in decoding CborValue from bytes", exc);
    }
}
