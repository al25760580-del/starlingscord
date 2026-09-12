package app.rive.runtime.kotlin.core;

import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0096 J\u0011\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0086 R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lapp/rive/runtime/kotlin/core/BindableArtboard;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "viewModelInstance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "(JLapp/rive/runtime/kotlin/core/ViewModelInstance;)V", StackTraceHelper.NAME_KEY, "", "getName", "()Ljava/lang/String;", "getViewModelInstance", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "cppDelete", "", "pointer", "cppName", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBindableArtboard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindableArtboard.kt\napp/rive/runtime/kotlin/core/BindableArtboard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class BindableArtboard extends NativeObject {
    public static final int $stable = 8;
    private final ViewModelInstance viewModelInstance;

    public /* synthetic */ BindableArtboard(long j, ViewModelInstance viewModelInstance, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i7 & 2) != 0 ? null : viewModelInstance);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    @NotNull
    public final native String cppName(long pointer);

    @NotNull
    public final String getName() {
        return cppName(getCppPointer());
    }

    public final ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public BindableArtboard(long j, ViewModelInstance viewModelInstance) {
        super(j);
        this.viewModelInstance = viewModelInstance;
        acquire();
        if (viewModelInstance != null) {
            if (!viewModelInstance.getHasCppObject()) {
                throw new IllegalArgumentException("Cannot bind a disposed ViewModelInstance to a BindableArtboard.");
            }
            viewModelInstance.acquire();
            getDependencies().add(viewModelInstance);
        }
    }
}
