package kotlinx.coroutines;

import ar.u;
import ar.v;
import java.io.Closeable;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends CoroutineDispatcher implements Closeable, AutoCloseable {
    static {
        u safeCast = new u(1);
        v baseKey = CoroutineDispatcher.f14751e;
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        if (baseKey != null) {
            f fVar = baseKey.f14678e;
        }
    }
}
