package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements ViewModelProvider$Factory {
    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final y0 c(KClass modelClass, t2.c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new t0();
    }
}
