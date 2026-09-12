package i0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f11340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y f11348i;
    public x j;

    public z(u layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f11340a = layoutNode;
        this.f11341b = 5;
        this.f11348i = new y(this);
    }

    public final f0 a() {
        return this.f11340a.f11325l.f11288c;
    }

    public final void b(int i7) {
        int i10 = this.f11347h;
        this.f11347h = i7;
        if ((i10 == 0) != (i7 == 0)) {
            this.f11340a.getClass();
        }
    }
}
