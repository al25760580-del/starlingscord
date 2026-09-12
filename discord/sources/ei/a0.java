package ei;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends m implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8282e;

    public a0(Object obj, Object obj2) {
        this.f8281d = obj;
        this.f8282e = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8281d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8282e;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
