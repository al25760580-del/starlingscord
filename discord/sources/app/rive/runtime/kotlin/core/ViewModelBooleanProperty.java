package app.rive.runtime.kotlin.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\r\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0014¨\u0006\u000e"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelBooleanProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "", "unsafeCppPointer", "", "(J)V", "cppGetValue", "cppPointer", "cppSetValue", "", "value", "nativeGetValue", "()Ljava/lang/Boolean;", "nativeSetValue", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelBooleanProperty extends ViewModelProperty<Boolean> {
    public static final int $stable = 0;

    public ViewModelBooleanProperty(long j) {
        super(j);
    }

    private final native boolean cppGetValue(long cppPointer);

    private final native void cppSetValue(long cppPointer, boolean value);

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Boolean bool) {
        nativeSetValue(bool.booleanValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    @NotNull
    public Boolean nativeGetValue() {
        return Boolean.valueOf(cppGetValue(getCppPointer()));
    }

    public void nativeSetValue(boolean value) {
        cppSetValue(getCppPointer(), value);
    }
}
