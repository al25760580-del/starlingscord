package kotlin.jvm.internal;

import mo.d;
import mo.k;
import mo.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MutablePropertyReference extends PropertyReference implements k {
    public MutablePropertyReference() {
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.KProperty
    @NotNull
    public abstract /* synthetic */ n getGetter();

    @Override // mo.k
    @NotNull
    public abstract /* synthetic */ d getSetter();

    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }
}
