package androidx.appcompat.widget;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((j3) obj).mThumbPosition);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((j3) obj).setThumbPosition(((Float) obj2).floatValue());
    }
}
