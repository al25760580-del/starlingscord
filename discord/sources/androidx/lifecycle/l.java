package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static n a(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 2) {
            return n.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return n.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return n.ON_PAUSE;
    }
}
