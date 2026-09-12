package t2;

import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends CreationExtras {
    public c(CreationExtras initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f2403a;
        Intrinsics.checkNotNullParameter(initialExtras2, "initialExtras");
        this.f2403a.putAll(initialExtras2);
    }

    public final Object a(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f2403a.get(key);
    }

    public final void b(b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f2403a.put(key, obj);
    }

    public /* synthetic */ c(int i7) {
        this(a.f20587b);
    }
}
