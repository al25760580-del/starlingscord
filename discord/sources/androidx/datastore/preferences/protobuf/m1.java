package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f1901a;

    public m1(Unsafe unsafe) {
        this.f1901a = unsafe;
    }

    public final int a(Class cls) {
        return this.f1901a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f1901a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract byte d(long j, Object obj);

    public abstract double e(long j, Object obj);

    public abstract float f(long j, Object obj);

    public final int g(long j, Object obj) {
        return this.f1901a.getInt(obj, j);
    }

    public final long h(long j, Object obj) {
        return this.f1901a.getLong(obj, j);
    }

    public final Object i(long j, Object obj) {
        return this.f1901a.getObject(obj, j);
    }

    public final long j(Field field) {
        return this.f1901a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j, boolean z5);

    public abstract void l(Object obj, long j, byte b10);

    public abstract void m(Object obj, long j, double d6);

    public abstract void n(Object obj, long j, float f2);

    public final void o(int i7, long j, Object obj) {
        this.f1901a.putInt(obj, j, i7);
    }

    public final void p(Object obj, long j, long j5) {
        this.f1901a.putLong(obj, j, j5);
    }

    public final void q(long j, Object obj, Object obj2) {
        this.f1901a.putObject(obj, j, obj2);
    }
}
