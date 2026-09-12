package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements xr.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f16612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c[] f16613e;

    static {
        c cVar = new c("AM_PM_OF_DAY", 0);
        f16612d = cVar;
        f16613e = new c[]{cVar};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f16613e.clone();
    }

    @Override // xr.d
    public final /* bridge */ /* synthetic */ Object a() {
        return l0.f16661e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((l0) ((xr.e) obj).d(this)).compareTo((Enum) ((xr.e) obj2).d(this));
    }

    @Override // xr.d
    public final Class getType() {
        return l0.class;
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
    public final /* bridge */ /* synthetic */ Object v() {
        return l0.f16660d;
    }

    @Override // xr.d
    public final boolean w() {
        return true;
    }
}
