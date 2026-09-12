package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends m1 {
    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean c(long j, Object obj) {
        return this.f1901a.getBoolean(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final byte d(long j, Object obj) {
        return this.f1901a.getByte(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final double e(long j, Object obj) {
        return this.f1901a.getDouble(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final float f(long j, Object obj) {
        return this.f1901a.getFloat(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void k(Object obj, long j, boolean z5) {
        this.f1901a.putBoolean(obj, j, z5);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void l(Object obj, long j, byte b10) {
        this.f1901a.putByte(obj, j, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void m(Object obj, long j, double d6) {
        this.f1901a.putDouble(obj, j, d6);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void n(Object obj, long j, float f2) {
        this.f1901a.putFloat(obj, j, f2);
    }
}
