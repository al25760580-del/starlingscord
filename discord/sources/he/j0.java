package he;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends IOException {
    public j0(Throwable th2) {
        super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
    }
}
