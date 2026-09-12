package s4;

import android.graphics.Path;
import l4.v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f19724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4.a f19725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r4.a f19726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r4.a f19727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r4.a f19728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19730h;

    public d(String str, int i7, Path.FillType fillType, r4.a aVar, r4.a aVar2, r4.a aVar3, r4.a aVar4, boolean z5) {
        this.f19723a = i7;
        this.f19724b = fillType;
        this.f19725c = aVar;
        this.f19726d = aVar2;
        this.f19727e = aVar3;
        this.f19728f = aVar4;
        this.f19729g = str;
        this.f19730h = z5;
    }

    @Override // s4.b
    public final n4.c a(v vVar, l4.i iVar, t4.b bVar) {
        return new n4.h(vVar, iVar, bVar, this);
    }
}
