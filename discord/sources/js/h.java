package js;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {
    @Override // js.i
    public final void b(w stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(b.REFUSED_STREAM, null);
    }
}
