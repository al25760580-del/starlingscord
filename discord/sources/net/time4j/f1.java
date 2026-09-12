package net.time4j;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 implements xr.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f1 f16634v = new f1(t.class, t.f16710d, t.f16715x);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f1 f16635w = new f1(TimeUnit.class, TimeUnit.DAYS, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f16636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Comparable f16637e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Comparable f16638i;

    public f1(Class cls, Enum r5, Enum r6) {
        this.f16636d = cls;
        this.f16637e = r5;
        this.f16638i = r6;
    }

    @Override // xr.d
    public final Object a() {
        return this.f16638i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) ((xr.e) obj).d(this);
        Comparable comparable2 = (Comparable) ((xr.e) obj2).d(this);
        return this.f16636d == t.class ? comparable.compareTo(comparable2) : comparable2.compareTo(comparable);
    }

    @Override // xr.d
    public final Class getType() {
        return this.f16636d;
    }

    @Override // xr.d
    public final boolean h() {
        return false;
    }

    @Override // xr.d
    public final boolean i() {
        return false;
    }

    @Override // xr.d
    public final String name() {
        return "PRECISION";
    }

    @Override // xr.d
    public final Object v() {
        return this.f16637e;
    }

    @Override // xr.d
    public final boolean w() {
        return true;
    }
}
