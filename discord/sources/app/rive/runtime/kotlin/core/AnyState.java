package app.rive.runtime.kotlin.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/core/AnyState;", "Lapp/rive/runtime/kotlin/core/LayerState;", "unsafeCppPointer", "", "(J)V", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnyState extends LayerState {
    public static final int $stable = 0;

    public AnyState(long j) {
        super(j);
    }

    @Override // app.rive.runtime.kotlin.core.LayerState
    @NotNull
    public String toString() {
        return "AnyState";
    }
}
