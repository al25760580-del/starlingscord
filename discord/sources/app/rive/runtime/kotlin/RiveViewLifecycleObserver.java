package app.rive.runtime.kotlin;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import app.rive.runtime.kotlin.core.RefCount;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0017J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0004R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lapp/rive/runtime/kotlin/RiveViewLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "dependencies", "", "Lapp/rive/runtime/kotlin/core/RefCount;", "(Ljava/util/List;)V", "getDependencies", "()Ljava/util/List;", "insert", "", "dependency", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "remove", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRiveAnimationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveViewLifecycleObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1299:1\n1863#2,2:1300\n*S KotlinDebug\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveViewLifecycleObserver\n*L\n1218#1:1300,2\n*E\n"})
public class RiveViewLifecycleObserver implements DefaultLifecycleObserver {
    public static final int $stable = 8;

    @NotNull
    private final List<RefCount> dependencies;

    public RiveViewLifecycleObserver(@NotNull List<RefCount> dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.dependencies = dependencies;
    }

    @NotNull
    public final List<RefCount> getDependencies() {
        return this.dependencies;
    }

    public final void insert(@NotNull RefCount dependency) {
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        this.dependencies.add(dependency);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Iterator<T> it = this.dependencies.iterator();
        while (it.hasNext()) {
            ((RefCount) it.next()).release();
        }
        owner.getLifecycle().c(this);
    }

    public final boolean remove(@NotNull RefCount dependency) {
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return this.dependencies.remove(dependency);
    }
}
