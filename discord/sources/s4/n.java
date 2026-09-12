package s4;

import l4.v;
import n4.r;

/* JADX INFO: loaded from: classes.dex */
public final class n implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4.a f19778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19779d;

    public n(String str, int i7, r4.a aVar, boolean z5) {
        this.f19776a = str;
        this.f19777b = i7;
        this.f19778c = aVar;
        this.f19779d = z5;
    }

    @Override // s4.b
    public final n4.c a(v vVar, l4.i iVar, t4.b bVar) {
        return new r(vVar, bVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f19776a);
        sb2.append(", index=");
        return com.discord.chat.presentation.list.a.j(sb2, this.f19777b, '}');
    }
}
