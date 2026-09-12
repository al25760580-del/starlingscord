package app.rive.runtime.kotlin;

import android.content.Context;
import app.rive.runtime.kotlin.core.Rive;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/rive/runtime/kotlin/RiveInitializer;", "Lj3/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveInitializer implements j3.b {
    public static final int $stable = 0;

    @Override // j3.b
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m235create(context);
        return Unit.f14616a;
    }

    @Override // j3.b
    @NotNull
    public List<Class<? extends j3.b>> dependencies() {
        return n0.f14659d;
    }

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public void m235create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Rive.init$default(Rive.INSTANCE, context, null, 2, null);
    }
}
