package io;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ReadWriteProperty {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12003d;

    @Override // io.d
    public final Object getValue(Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj2 = this.f12003d;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object obj, KProperty property, Object value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f12003d = value;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("NotNullProperty(");
        if (this.f12003d != null) {
            str = "value=" + this.f12003d;
        } else {
            str = "value not initialized yet";
        }
        return g.g(sb2, str, ')');
    }
}
