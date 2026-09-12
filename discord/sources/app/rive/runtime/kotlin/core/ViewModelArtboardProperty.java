package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0082 J!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0082 J\b\u0010\r\u001a\u00020\u0002H\u0014J\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002H\u0010¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0013\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¨\u0006\u0018"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelArtboardProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "", "unsafeCppPointer", "", "(J)V", "cppSetArtboard", "cppPointer", "fileCppPointer", "artboardCppPointer", "cppSetBindableArtboard", "bindableArtboardCppPointer", "boundInstancePointer", "nativeGetValue", "nativeSetValue", "value", "(Lkotlin/Unit;)V", "pollChanges", "pollChanges$kotlin_release", "set", "artboard", "Lapp/rive/runtime/kotlin/core/Artboard;", "bindableArtboard", "Lapp/rive/runtime/kotlin/core/BindableArtboard;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewModelInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelInstance.kt\napp/rive/runtime/kotlin/core/ViewModelArtboardProperty\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,766:1\n808#2,11:767\n1863#2,2:778\n808#2,11:780\n1863#2,2:791\n*S KotlinDebug\n*F\n+ 1 ViewModelInstance.kt\napp/rive/runtime/kotlin/core/ViewModelArtboardProperty\n*L\n740#1:767,11\n740#1:778,2\n755#1:780,11\n755#1:791,2\n*E\n"})
public final class ViewModelArtboardProperty extends ViewModelProperty<Unit> {
    public static final int $stable = 0;

    public ViewModelArtboardProperty(long j) {
        super(j);
    }

    private final native void cppSetArtboard(long cppPointer, long fileCppPointer, long artboardCppPointer);

    private final native void cppSetBindableArtboard(long cppPointer, long bindableArtboardCppPointer, long boundInstancePointer);

    /* JADX INFO: renamed from: nativeGetValue, reason: avoid collision after fix types in other method */
    public void nativeGetValue2() {
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(@NotNull Unit value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void pollChanges$kotlin_release() {
        super.pollChanges$kotlin_release();
        List<RefCount> dependencies = getDependencies();
        ArrayList arrayList = new ArrayList();
        for (Object obj : dependencies) {
            if (obj instanceof BindableArtboard) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ViewModelInstance viewModelInstance = ((BindableArtboard) it.next()).getViewModelInstance();
            if (viewModelInstance != null) {
                viewModelInstance.pollChanges$kotlin_release();
            }
        }
    }

    @d
    public final void set(@NotNull Artboard artboard) throws RiveException {
        Intrinsics.checkNotNullParameter(artboard, "artboard");
        if (!artboard.getHasCppObject()) {
            throw new RiveException("Cannot set a disposed Artboard to a ViewModelArtboardProperty.");
        }
        if (artboard.getFile() == null) {
            throw new RiveException("Cannot set an Artboard with no File reference to a ViewModelArtboardProperty.");
        }
        File file = artboard.getFile();
        Intrinsics.checkNotNull(file);
        if (!file.getHasCppObject()) {
            throw new RiveException("Cannot set an Artboard whose File has been disposed to a ViewModelArtboardProperty.");
        }
        long cppPointer = getCppPointer();
        File file2 = artboard.getFile();
        Intrinsics.checkNotNull(file2);
        cppSetArtboard(cppPointer, file2.getCppPointer(), artboard.getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ Unit nativeGetValue() {
        nativeGetValue2();
        return Unit.f14616a;
    }

    public final void set(BindableArtboard bindableArtboard) throws RiveException {
        ViewModelInstance viewModelInstance;
        long cppPointer = getCppPointer();
        long cppPointer2 = 0;
        long cppPointer3 = bindableArtboard != null ? bindableArtboard.getCppPointer() : 0L;
        if (bindableArtboard != null && (viewModelInstance = bindableArtboard.getViewModelInstance()) != null) {
            cppPointer2 = viewModelInstance.getCppPointer();
        }
        cppSetBindableArtboard(cppPointer, cppPointer3, cppPointer2);
        List<RefCount> dependencies = getDependencies();
        ArrayList<BindableArtboard> arrayList = new ArrayList();
        for (Object obj : dependencies) {
            if (obj instanceof BindableArtboard) {
                arrayList.add(obj);
            }
        }
        for (BindableArtboard bindableArtboard2 : arrayList) {
            bindableArtboard2.release();
            getDependencies().remove(bindableArtboard2);
        }
        if (bindableArtboard != null) {
            bindableArtboard.acquire();
            getDependencies().add(bindableArtboard);
        }
    }
}
