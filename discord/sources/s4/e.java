package s4;

import java.util.ArrayList;
import l4.v;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4.a f19733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r4.a f19734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r4.a f19735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r4.a f19736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r4.b f19737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19739i;
    public final float j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r4.b f19740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f19741m;

    public e(String str, int i7, r4.a aVar, r4.a aVar2, r4.a aVar3, r4.a aVar4, r4.b bVar, int i10, int i11, float f2, ArrayList arrayList, r4.b bVar2, boolean z5) {
        this.f19731a = str;
        this.f19732b = i7;
        this.f19733c = aVar;
        this.f19734d = aVar2;
        this.f19735e = aVar3;
        this.f19736f = aVar4;
        this.f19737g = bVar;
        this.f19738h = i10;
        this.f19739i = i11;
        this.j = f2;
        this.k = arrayList;
        this.f19740l = bVar2;
        this.f19741m = z5;
    }

    @Override // s4.b
    public final n4.c a(v vVar, l4.i iVar, t4.b bVar) {
        return new n4.i(vVar, bVar, this);
    }
}
