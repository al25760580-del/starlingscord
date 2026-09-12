package e2;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Lambda implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f7880d = new l(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        j msg = (j) obj;
        Throwable cancellationException = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg instanceof i) {
            ar.p pVar = ((i) msg).f7875b;
            if (cancellationException == null) {
                cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            pVar.T(cancellationException);
        }
        return Unit.f14616a;
    }
}
