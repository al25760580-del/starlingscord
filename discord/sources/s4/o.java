package s4;

import java.util.ArrayList;
import l4.v;
import n4.s;

/* JADX INFO: loaded from: classes.dex */
public final class o implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r4.b f19781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r4.a f19783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r4.a f19784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r4.b f19785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f19788i;
    public final boolean j;

    public o(String str, r4.b bVar, ArrayList arrayList, r4.a aVar, r4.a aVar2, r4.b bVar2, int i7, int i10, float f2, boolean z5) {
        this.f19780a = str;
        this.f19781b = bVar;
        this.f19782c = arrayList;
        this.f19783d = aVar;
        this.f19784e = aVar2;
        this.f19785f = bVar2;
        this.f19786g = i7;
        this.f19787h = i10;
        this.f19788i = f2;
        this.j = z5;
    }

    @Override // s4.b
    public final n4.c a(v vVar, l4.i iVar, t4.b bVar) {
        return new s(vVar, bVar, this);
    }
}
