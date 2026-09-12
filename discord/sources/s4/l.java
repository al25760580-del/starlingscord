package s4;

import android.graphics.Path;
import l4.v;

/* JADX INFO: loaded from: classes.dex */
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f19768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r4.a f19770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r4.a f19771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19772f;

    public l(String str, boolean z5, Path.FillType fillType, r4.a aVar, r4.a aVar2, boolean z6) {
        this.f19769c = str;
        this.f19767a = z5;
        this.f19768b = fillType;
        this.f19770d = aVar;
        this.f19771e = aVar2;
        this.f19772f = z6;
    }

    @Override // s4.b
    public final n4.c a(v vVar, l4.i iVar, t4.b bVar) {
        return new n4.g(vVar, bVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f19767a + '}';
    }
}
