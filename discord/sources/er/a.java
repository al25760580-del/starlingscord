package er;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient com.margelo.nitro.rive.c f8661d;

    public a(com.margelo.nitro.rive.c cVar) {
        super("Flow was aborted, no more elements needed");
        this.f8661d = cVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
