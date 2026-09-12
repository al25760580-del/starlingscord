package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements xr.d, xr.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o0 f16683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o0[] f16684e;

    static {
        o0 o0Var = new o0("POSIX_TIME", 0);
        f16683d = o0Var;
        f16684e = new o0[]{o0Var};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f16684e.clone();
    }

    @Override // xr.d
    public final Object a() {
        return Long.valueOf(r0.f16698v);
    }

    @Override // xr.j
    public final Object b(xr.e eVar, Object obj, boolean z5) {
        r0 r0Var = (r0) eVar;
        Long l6 = (Long) obj;
        if (l6 != null) {
            return r0.s(l6.longValue(), r0Var.r(), as.e.f3000d);
        }
        throw new IllegalArgumentException("Missing elapsed seconds.");
    }

    @Override // xr.j
    public final Object c(xr.e eVar) {
        return Long.valueOf(((r0) eVar).f16702d);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Long) ((xr.e) obj).d(this)).compareTo((Long) ((xr.e) obj2).d(this));
    }

    @Override // xr.j
    public final Object d(xr.e eVar) {
        return Long.valueOf(r0.f16698v);
    }

    @Override // xr.d
    public final Class getType() {
        return Long.class;
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
    public final Object v() {
        return Long.valueOf(r0.f16697i);
    }

    @Override // xr.d
    public final boolean w() {
        return false;
    }
}
