package app.rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0082 J\b\u0010\t\u001a\u00020\u0002H\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u0006\u0010\f\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty$TriggerUnit;", "unsafeCppPointer", "", "(J)V", "cppTrigger", "", "cppPointer", "nativeGetValue", "nativeSetValue", "value", "trigger", "TriggerUnit", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelTriggerProperty extends ViewModelProperty<TriggerUnit> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty$TriggerUnit;", "", "()V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TriggerUnit {
        public static final int $stable = 0;
    }

    public ViewModelTriggerProperty(long j) {
        super(j);
    }

    private final native void cppTrigger(long cppPointer);

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(@NotNull TriggerUnit value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public final void trigger() {
        cppTrigger(getCppPointer());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    @NotNull
    public TriggerUnit nativeGetValue() {
        return new TriggerUnit();
    }
}
