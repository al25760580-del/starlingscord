package app.rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0014¨\u0006\r"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelEnumProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "", "unsafeCppPointer", "", "(J)V", "cppGetValue", "cppPointer", "cppSetValue", "", "value", "nativeGetValue", "nativeSetValue", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelEnumProperty extends ViewModelProperty<String> {
    public static final int $stable = 0;

    public ViewModelEnumProperty(long j) {
        super(j);
    }

    private final native String cppGetValue(long cppPointer);

    private final native void cppSetValue(long cppPointer, String value);

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    @NotNull
    public String nativeGetValue() {
        return cppGetValue(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        cppSetValue(getCppPointer(), value);
    }
}
