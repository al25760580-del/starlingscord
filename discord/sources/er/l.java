package er;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
