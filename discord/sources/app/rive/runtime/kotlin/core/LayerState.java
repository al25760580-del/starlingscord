package app.rive.runtime.kotlin.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007¨\u0006\u0018"}, d2 = {"Lapp/rive/runtime/kotlin/core/LayerState;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "(J)V", "isAnimationState", "", "()Z", "isAnyState", "isBlendState", "isBlendState1D", "isBlendStateDirect", "isEntryState", "isExitState", "cppIsAnimationState", "cppPointer", "cppIsAnyState", "cppIsBlendState", "cppIsBlendState1D", "cppIsBlendStateDirect", "cppIsEntryState", "cppIsExitState", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LayerState extends NativeObject {
    public static final int $stable = 0;

    public LayerState(long j) {
        super(j);
    }

    private final native boolean cppIsAnimationState(long cppPointer);

    private final native boolean cppIsAnyState(long cppPointer);

    private final native boolean cppIsBlendState(long cppPointer);

    private final native boolean cppIsBlendState1D(long cppPointer);

    private final native boolean cppIsBlendStateDirect(long cppPointer);

    private final native boolean cppIsEntryState(long cppPointer);

    private final native boolean cppIsExitState(long cppPointer);

    public final boolean isAnimationState() {
        return cppIsAnimationState(getCppPointer());
    }

    public final boolean isAnyState() {
        return cppIsAnyState(getCppPointer());
    }

    public final boolean isBlendState() {
        return cppIsBlendState(getCppPointer());
    }

    public final boolean isBlendState1D() {
        return cppIsBlendState1D(getCppPointer());
    }

    public final boolean isBlendStateDirect() {
        return cppIsBlendStateDirect(getCppPointer());
    }

    public final boolean isEntryState() {
        return cppIsEntryState(getCppPointer());
    }

    public final boolean isExitState() {
        return cppIsExitState(getCppPointer());
    }

    @NotNull
    public String toString() {
        return "LayerState";
    }
}
