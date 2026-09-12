package s4;

import java.util.Arrays;
import java.util.List;
import l4.v;

/* JADX INFO: loaded from: classes.dex */
public final class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19775c;

    public m(String str, List list, boolean z5) {
        this.f19773a = str;
        this.f19774b = list;
        this.f19775c = z5;
    }

    @Override // s4.b
    public final n4.c a(v vVar, l4.i iVar, t4.b bVar) {
        return new n4.d(vVar, bVar, this, iVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f19773a + "' Shapes: " + Arrays.toString(this.f19774b.toArray()) + '}';
    }
}
