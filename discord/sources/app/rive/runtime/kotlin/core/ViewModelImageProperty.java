package app.rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0082 J\b\u0010\t\u001a\u00020\u0002H\u0014J\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelImageProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "", "unsafeCppPointer", "", "(J)V", "cppSetValue", "cppPointer", "value", "nativeGetValue", "nativeSetValue", "(Lkotlin/Unit;)V", "set", "image", "Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelImageProperty extends ViewModelProperty<Unit> {
    public static final int $stable = 0;

    public ViewModelImageProperty(long j) {
        super(j);
    }

    private final native void cppSetValue(long cppPointer, long value);

    /* JADX INFO: renamed from: nativeGetValue, reason: avoid collision after fix types in other method */
    public void nativeGetValue2() {
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(@NotNull Unit value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public final void set(RiveRenderImage image) {
        cppSetValue(getCppPointer(), image != null ? image.getCppPointer() : 0L);
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ Unit nativeGetValue() {
        nativeGetValue2();
        return Unit.f14616a;
    }
}
