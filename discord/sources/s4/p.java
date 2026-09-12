package s4;

import l4.v;
import n4.t;

/* JADX INFO: loaded from: classes.dex */
public final class p implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r4.b f19790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4.b f19791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r4.b f19792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19793e;

    public p(String str, int i7, r4.b bVar, r4.b bVar2, r4.b bVar3, boolean z5) {
        this.f19789a = i7;
        this.f19790b = bVar;
        this.f19791c = bVar2;
        this.f19792d = bVar3;
        this.f19793e = z5;
    }

    @Override // s4.b
    public final n4.c a(v vVar, l4.i iVar, t4.b bVar) {
        return new t(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f19790b + ", end: " + this.f19791c + ", offset: " + this.f19792d + "}";
    }
}
