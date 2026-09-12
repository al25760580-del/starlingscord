package androidx.loader.app;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import ue.d;
import v2.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class LoaderManager {
    public static c a(LifecycleOwner lifecycleOwner) {
        return new c(lifecycleOwner, ((c1) lifecycleOwner).getViewModelStore());
    }

    public abstract d b(po.d dVar);
}
